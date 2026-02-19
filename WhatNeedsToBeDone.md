# Remaining Work

## Current Blocker

Vape successfully injects and initializes but the GUI doesn't respond to keyboard input (Right Shift).

### Root Cause
The shellcode that patches Minecraft's JVM to connect events → Vape handlers is **heavily obfuscated** and we haven't reversed it yet.

### Evidence
```
✅ Vape loads: [VapeAgent] ✓ Vape initialized!
❌ GUI toggle: Right Shift does nothing
❌ Event hooks: a.d.keyTyped() never gets called by Minecraft
```

---

## Approach 1: Dynamic Shellcode Analysis

### What to Do
1. Run `Vape.exe` under x64dbg or gdb
2. Set breakpoint at `0x14009d238` (right before injection)
3. Step through until shellcode is written to `0x140428078`
4. Dump the 2KB shellcode from memory
5. Disassemble and analyze

### Tools
```bash
# Linux with Wine
winedbg --gdb Vape.exe
(gdb) break *0x14009d238
(gdb) run
(gdb) x/500xb 0x140428078  # Dump shellcode
(gdb) dump binary memory shellcode.bin 0x140428078 0x140428848
```

### What to Look For
- JNI/JVMTI function calls
- Minecraft class name strings ("GuiScreen", "Keyboard", etc.)
- Method hooking patterns
- How it calls `a.d.keyTyped()` from Minecraft events

---

## Approach 2: Forge Bridge Mod (Easier Alternative)

### Concept
Since we know what methods need calling, bypass the shellcode entirely by creating a Forge mod.

### Implementation
```java
@Mod(modid = "vapehooks", version = "1.0")
public class VapeHooksMod {
    private Method keyTyped, drawScreen, mouseClicked;
    
    @EventHandler
    public void init(FMLInitializationEvent e) throws Exception {
        Class<?> vapeD = Class.forName("a.d");
        keyTyped = vapeD.getMethod("keyTyped", Object.class, char.class, int.class);
        drawScreen = vapeD.getMethod("drawScreen", Object.class, int.class, int.class, float.class);
        mouseClicked = vapeD.getMethod("mouseClicked", Object.class, int.class, int.class, int.class);
        
        MinecraftForge.EVENT_BUS.register(this);
        System.out.println("[VapeBridge] Hooks registered!");
    }
    
    @SubscribeEvent
    public void onKey(InputEvent.KeyInputEvent e) {
        try {
            keyTyped.invoke(null, Minecraft.getMinecraft().currentScreen,
                          Keyboard.getEventCharacter(), 
                          Keyboard.getEventKey());
        } catch (Exception ex) { ex.printStackTrace(); }
    }
    
    @SubscribeEvent  
    public void onRender(RenderGameOverlayEvent.Post e) {
        if (e.type == ElementType.ALL) {
            try {
                drawScreen.invoke(null, null, 0, 0, 0f);
            } catch (Exception ex) { ex.printStackTrace(); }
        }
    }
    
    @SubscribeEvent
    public void onMouse(MouseEvent e) {
        try {
            mouseClicked.invoke(null, null, e.x, e.y, e.button);
        } catch (Exception ex) { ex.printStackTrace(); }
    }
}
```

### Setup
```bash
# 1. Create Forge 1.8.9 MDK project
# 2. Add vape-agent.jar to -javaagent JVM args
# 3. Build and test
```

---

## Approach 3: Patch Minecraft Directly

### Concept
Use bytecode manipulation (ASM/Javassist) to patch Minecraft's `GuiScreen` class at runtime.

**Inject into methods:**
- `GuiScreen.keyTyped()` → call `a.d.keyTyped()`
- `GuiScreen.drawScreen()` → call `a.d.drawScreen()`
- `GuiScreen.mouseClicked()` → call `a.d.mouseClicked()`

### Tools
- ASM library for bytecode manipulation
- Java agent with `Instrumentation.addTransformer()`

---

## Next Steps

1. **Try Approach 2 first** (Forge mod) - fastest path to working client
2. **Approach 1 in parallel** - understand shellcode for completeness
3. **Document findings** - help future researchers

---

## Questions to Answer

- [ ] What JVM functions does the shellcode call?
- [ ] How does it hook Minecraft without Forge/Fabric?
- [ ] Where is the GUI class (`com.ui.event.UserInterfaceEventBroker`)?
- [ ] How is Right Shift → GUI toggle implemented?

---

## Resources

- Vape decompiled hooks: `vape-deobfuscated/decompiled_source/a/d.java`
- Shellcode entry: `0x1409665a5` in Vape.exe
- Injection call: `0x14009d238` in Vape.exe
- Forge 1.8.9 docs: https://mcforge.readthedocs.io/en/1.8.9/
