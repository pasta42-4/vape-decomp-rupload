/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.graphics.palette;

import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.network.connection.NetworkConnectionDescriptor;
import com.runtime.context.LightweightExecutionContext;
import com.security.context.SecurityContextManager2112;
import com.structure.tree.RecursiveNodeTreeBuilder;
import com.system.configuration.SystemConfigurationOrchestrator;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ColorPaletteManager
extends NetworkConnectionDescriptor<RecursiveNodeTreeBuilder, ColorPaletteManager> {
    private static final String[] n;
    private final int e;
    public static final Color g;
    private boolean s = false;
    private static final Object[] m;
    public static final Color U;
    private static final Integer[] h;
    public static final Color H;
    private static final Map k;
    private static final long[] d;
    private static final long a;
    private final Color D;

    public RecursiveNodeTreeBuilder H(RecursiveNodeTreeBuilder recursiveNodeTreeBuilder) {
        try {
            ((List)this.J()).add(recursiveNodeTreeBuilder);
            if (this.e == -1) {
                recursiveNodeTreeBuilder.e(-1);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ColorPaletteManager.a(customSystemException);
        }
        return recursiveNodeTreeBuilder;
    }

    public boolean d(LightweightExecutionContext lightweightExecutionContext) {
        try {
            if (((List)this.J()).isEmpty()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ColorPaletteManager.a(customSystemException);
        }
        for (RecursiveNodeTreeBuilder recursiveNodeTreeBuilder : (List)this.J()) {
            try {
                if (!recursiveNodeTreeBuilder.r(lightweightExecutionContext)) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw ColorPaletteManager.a(customSystemException);
            }
        }
        return false;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x34B2;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/cp", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ColorPaletteManager.h[n2] = n3;
        }
        return h[n2];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ColorPaletteManager.a = MultiContainerRegistry.a(-8631173163933855319L, -7794562878545228562L, MethodHandles.lookup().lookupClass()).a(5640848118251L);
                ColorPaletteManager.m = new Object[5];
                ColorPaletteManager.n = new String[5];
                ColorPaletteManager.a();
                ColorPaletteManager.k = new HashMap<K, V>(13);
                var0 = ColorPaletteManager.a ^ 22732535188450L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "i\u008e\u00be\u00c6<U{.N\u0080~\t\u00b6\u00cc\u00a0P";
                var7_6 = "i\u008e\u00be\u00c6<U{.N\u0080~\t\u00b6\u00cc\u00a0P".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00fc\u00c2h\u00c2Qy\u00b6\u00ebQ\u00ff\u00f4\n\u00b1TDA";
                    var7_6 = "\u00fc\u00c2h\u00c2Qy\u00b6\u00ebQ\u00ff\u00f4\n\u00b1TDA".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl55:
                // 1 sources

                ** continue;
            }
        }
        ColorPaletteManager.d = var8_3;
        ColorPaletteManager.h = new Integer[4];
        ColorPaletteManager.U = new Color(0, 170, 0);
        ColorPaletteManager.H = new Color(170, 170, 170);
        ColorPaletteManager.g = new Color(170, 0, 0);
    }

    @Override
    public RecursiveNodeTreeBuilder J(String string, int n) {
        return this.H(new RecursiveNodeTreeBuilder(string, n));
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ColorPaletteManager.e(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                ColorPaletteManager.m[n] = clazz = Class.forName(ColorPaletteManager.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ColorPaletteManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ColorPaletteManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static ColorPaletteManager r(Object object, String string, String string2, Color color, RecursiveNodeTreeBuilder ... recursiveNodeTreeBuilderArray) {
        return ColorPaletteManager.g(object, string, string2, color, -1, Arrays.asList(recursiveNodeTreeBuilderArray));
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ColorPaletteManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ColorPaletteManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void R(List<RecursiveNodeTreeBuilder> list) {
        super.d(list);
    }

    private static Method h(long l, long l2) {
        int n = ColorPaletteManager.e(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = ColorPaletteManager.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = ColorPaletteManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = ColorPaletteManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ColorPaletteManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ColorPaletteManager.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ColorPaletteManager.f(241817946069306L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ColorPaletteManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ColorPaletteManager.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ColorPaletteManager.f(241817946069306L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    @Override
    public void i(String string) {
    }

    public boolean b(LightweightExecutionContext lightweightExecutionContext, boolean bl) {
        block12: {
            block11: {
                try {
                    try {
                        if (!bl || !((List)this.J()).isEmpty()) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ColorPaletteManager.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw ColorPaletteManager.a(customSystemException);
                }
            }
            try {
                try {
                    if (bl || !((List)this.J()).isEmpty()) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw ColorPaletteManager.a(customSystemException);
                }
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw ColorPaletteManager.a(customSystemException);
            }
        }
        for (RecursiveNodeTreeBuilder recursiveNodeTreeBuilder : (List)this.J()) {
            try {
                if (!recursiveNodeTreeBuilder.r(lightweightExecutionContext)) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw ColorPaletteManager.a(customSystemException);
            }
        }
        return false;
    }

    @Override
    public void W() {
        super.H(new ArrayList((Collection)this.u()));
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (ColorPaletteManager.n[n4] != null) {
            return n4;
        }
        Object object = m[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 41;
                break;
            }
            case 1: {
                n3 = 17;
                break;
            }
            case 2: {
                n3 = 60;
                break;
            }
            case 3: {
                n3 = 39;
                break;
            }
            case 4: {
                n3 = 55;
                break;
            }
            case 5: {
                n3 = 22;
                break;
            }
            case 6: {
                n3 = 18;
                break;
            }
            case 7: {
                n3 = 31;
                break;
            }
            case 8: {
                n3 = 14;
                break;
            }
            case 9: {
                n3 = 0;
                break;
            }
            case 10: {
                n3 = 9;
                break;
            }
            case 11: {
                n3 = 5;
                break;
            }
            case 12: {
                n3 = 48;
                break;
            }
            case 13: {
                n3 = 34;
                break;
            }
            case 14: {
                n3 = 35;
                break;
            }
            case 15: {
                n3 = 36;
                break;
            }
            case 16: {
                n3 = 51;
                break;
            }
            case 17: {
                n3 = 42;
                break;
            }
            case 18: {
                n3 = 47;
                break;
            }
            case 19: {
                n3 = 50;
                break;
            }
            case 20: {
                n3 = 44;
                break;
            }
            case 21: {
                n3 = 43;
                break;
            }
            case 22: {
                n3 = 21;
                break;
            }
            case 23: {
                n3 = 59;
                break;
            }
            case 24: {
                n3 = 3;
                break;
            }
            case 25: {
                n3 = 46;
                break;
            }
            case 26: {
                n3 = 8;
                break;
            }
            case 27: {
                n3 = 11;
                break;
            }
            case 28: {
                n3 = 56;
                break;
            }
            case 29: {
                n3 = 16;
                break;
            }
            case 30: {
                n3 = 13;
                break;
            }
            case 31: {
                n3 = 61;
                break;
            }
            case 32: {
                n3 = 37;
                break;
            }
            case 33: {
                n3 = 38;
                break;
            }
            case 34: {
                n3 = 28;
                break;
            }
            case 35: {
                n3 = 40;
                break;
            }
            case 36: {
                n3 = 12;
                break;
            }
            case 37: {
                n3 = 15;
                break;
            }
            case 38: {
                n3 = 23;
                break;
            }
            case 39: {
                n3 = 33;
                break;
            }
            case 40: {
                n3 = 7;
                break;
            }
            case 41: {
                n3 = 2;
                break;
            }
            case 42: {
                n3 = 52;
                break;
            }
            case 43: {
                n3 = 29;
                break;
            }
            case 44: {
                n3 = 6;
                break;
            }
            case 45: {
                n3 = 27;
                break;
            }
            case 46: {
                n3 = 54;
                break;
            }
            case 47: {
                n3 = 58;
                break;
            }
            case 48: {
                n3 = 24;
                break;
            }
            case 49: {
                n3 = 19;
                break;
            }
            case 50: {
                n3 = 4;
                break;
            }
            case 51: {
                n3 = 25;
                break;
            }
            case 52: {
                n3 = 57;
                break;
            }
            case 53: {
                n3 = 53;
                break;
            }
            case 54: {
                n3 = 10;
                break;
            }
            case 55: {
                n3 = 30;
                break;
            }
            case 56: {
                n3 = 1;
                break;
            }
            case 57: {
                n3 = 32;
                break;
            }
            case 58: {
                n3 = 49;
                break;
            }
            case 59: {
                n3 = 26;
                break;
            }
            case 60: {
                n3 = 63;
                break;
            }
            case 61: {
                n3 = 20;
                break;
            }
            case 62: {
                n3 = 62;
                break;
            }
            default: {
                n3 = 45;
            }
        }
        n5 = n3;
        int[] nArray = new int[6];
        int n6 = 0;
        while (n6 < 6) {
            n2 = 7 * (5 - n6);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n5) < 0) {
                n += 128;
            }
            nArray[n6] = n;
            ++n6;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        ColorPaletteManager.n[n4] = new String(cArray);
        return n4;
    }

    public int b() {
        return this.e;
    }

    public ColorPaletteManager v() {
        return new ColorPaletteManager(null, this.x(), this.O(), this.y(), this.b(), (List)this.u());
    }

    @Override
    public boolean C(JsonObject jsonObject) {
        block6: {
            block7: {
                long l = a ^ 0x56B0CF726CE4L;
                try {
                    if (!jsonObject.get((String)((Object)ColorPaletteManager.d("G", (int)ColorPaletteManager.b("t", (int)12047, (long)(0x5EF8B873327F96FEL ^ l)), (long)-8268314562815310695L, (long)l))).getAsString().equalsIgnoreCase(this.x())) break block6;
                    if (!jsonObject.get((String)((Object)ColorPaletteManager.d("G", (int)ColorPaletteManager.b("t", (int)25881, (long)(0x5CFE531DA1935CE9L ^ l)), (long)-8268314562815310695L, (long)l))).isJsonArray()) break block7;
                }
                catch (Exception exception) {
                    throw ColorPaletteManager.a(exception);
                }
                JsonArray jsonArray = jsonObject.get((String)((Object)ColorPaletteManager.d("G", (int)ColorPaletteManager.b("t", (int)5821, (long)(0xAAB8F939DC92F4FL ^ l)), (long)-8268314562815310695L, (long)l))).getAsJsonArray();
                ArrayList arrayList = new ArrayList((Collection)this.J());
                for (RecursiveNodeTreeBuilder recursiveNodeTreeBuilder : arrayList) {
                    this.A(recursiveNodeTreeBuilder);
                }
                for (RecursiveNodeTreeBuilder recursiveNodeTreeBuilder : jsonArray) {
                    try {
                        RecursiveNodeTreeBuilder recursiveNodeTreeBuilder2 = new RecursiveNodeTreeBuilder("", -1);
                        recursiveNodeTreeBuilder2.t(recursiveNodeTreeBuilder.getAsJsonObject());
                        this.H(recursiveNodeTreeBuilder2);
                    }
                    catch (Exception exception) {}
                }
            }
            return true;
        }
        return super.C(jsonObject);
    }

    public static ColorPaletteManager o(Object object, String string, String string2, Color color, List<RecursiveNodeTreeBuilder> list) {
        return ColorPaletteManager.g(object, string, string2, color, -1, list);
    }

    public boolean z(String string) {
        boolean bl = true;
        for (RecursiveNodeTreeBuilder recursiveNodeTreeBuilder : (List)this.J()) {
            block5: {
                try {
                    try {
                        if (!recursiveNodeTreeBuilder.Q()) continue;
                        if (!recursiveNodeTreeBuilder.q().toLowerCase().equals(string.toLowerCase())) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ColorPaletteManager.a(customSystemException);
                    }
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw ColorPaletteManager.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void F(List<RecursiveNodeTreeBuilder> list) {
        ((List)super.J()).clear();
        ((List)super.J()).addAll(list);
    }

    public RecursiveNodeTreeBuilder P(String string) {
        for (RecursiveNodeTreeBuilder recursiveNodeTreeBuilder : (List)this.J()) {
            try {
                if (!recursiveNodeTreeBuilder.q().toLowerCase().equals(string.toLowerCase())) continue;
                return recursiveNodeTreeBuilder;
            }
            catch (CustomSystemException customSystemException) {
                throw ColorPaletteManager.a(customSystemException);
            }
        }
        return null;
    }

    private ColorPaletteManager(Object object, String string, String string2, Color color, int n, List<RecursiveNodeTreeBuilder> list) {
        super(object, string, string2, list);
        this.D = color;
        this.e = n;
    }

    public boolean H(LightweightExecutionContext lightweightExecutionContext) {
        return this.b(lightweightExecutionContext, false);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a3' || c == '\u00d2' || c == '\u00f1' || c == 'b') {
                field = ColorPaletteManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ColorPaletteManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'G' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/cp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l, long l2) {
        int n = ColorPaletteManager.e(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = ColorPaletteManager.n[n];
            int n2 = string.indexOf(8);
            Class clazz = ColorPaletteManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ColorPaletteManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ColorPaletteManager.c(clazz3, string2, clazz2)) != null) {
                    ColorPaletteManager.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ColorPaletteManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ColorPaletteManager.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ColorPaletteManager.f(241817946069306L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public boolean p() {
        boolean bl;
        block5: {
            block4: {
                List list = (List)this.J();
                List list2 = (List)this.u();
                try {
                    try {
                        if (list.size() != list2.size() || !list.equals(list2)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ColorPaletteManager.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ColorPaletteManager.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean q(LightweightExecutionContext lightweightExecutionContext) {
        for (RecursiveNodeTreeBuilder recursiveNodeTreeBuilder : (List)this.J()) {
            try {
                if (!recursiveNodeTreeBuilder.r(lightweightExecutionContext)) continue;
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw ColorPaletteManager.a(customSystemException);
            }
        }
        return true;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public ColorPaletteManager J(boolean bl) {
        this.s = bl;
        return this;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ColorPaletteManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public boolean j(boolean bl) {
        block11: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                if (systemConfigurationOrchestrator.Y()) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ColorPaletteManager.a(customSystemException);
            }
            LightweightExecutionContext lightweightExecutionContext = ApplicationLifecycleManager.U().K();
            try {
                if (this.H(lightweightExecutionContext)) {
                    return true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ColorPaletteManager.a(customSystemException);
            }
            if (GameVersionEnumerator.MC_1_12_2.H()) {
                LightweightExecutionContext lightweightExecutionContext2 = systemConfigurationOrchestrator.G(SecurityContextManager2112.e());
                try {
                    try {
                        if (!bl || !this.H(lightweightExecutionContext2)) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ColorPaletteManager.a(customSystemException);
                    }
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw ColorPaletteManager.a(customSystemException);
                }
            }
        }
        return false;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    @Override
    public JsonObject k(boolean bl) {
        long l = a ^ 0x56C3689CCB35L;
        JsonObject jsonObject = this.y();
        JsonArray jsonArray = new JsonArray();
        for (RecursiveNodeTreeBuilder recursiveNodeTreeBuilder : (List)this.J()) {
            jsonArray.add((JsonElement)recursiveNodeTreeBuilder.T());
        }
        jsonObject.add((String)((Object)ColorPaletteManager.d("G", (int)ColorPaletteManager.b("t", (int)10613, (long)(0x443C6A9D488BB757L ^ l)), (long)3066964290462999368L, (long)l)), (JsonElement)jsonArray);
        return jsonObject;
    }

    private static void a() {
        Object[] objectArray = m;
        m[0] = "H\f?";
        objectArray[1] = Integer.TYPE;
        ColorPaletteManager.n[1] = "java/lang/Integer";
        objectArray[2] = "obCCQ8dmR\f, wj[E";
        objectArray[3] = "\u0019\u0001\nq\u0006\\\u0012\u000e\u001b>gR\u0019\u0005\u001fd";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "A\u001a\u0012,`\"\u0014Y\u0002^a;.X\u00001iyLWJe\nyV\u0014\u001f7j2DW\u0003^";
    }

    public boolean m() {
        return this.j(this.s);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/cp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public Color y() {
        return this.D;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void A(RecursiveNodeTreeBuilder recursiveNodeTreeBuilder) {
        try {
            ((List)this.J()).remove(recursiveNodeTreeBuilder);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ColorPaletteManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static ColorPaletteManager g(Object object, String string, String string2, Color color, int n, List<RecursiveNodeTreeBuilder> list) {
        ColorPaletteManager colorPaletteManager = new ColorPaletteManager(object, string, string2, color, n, list);
        ((List)colorPaletteManager.J()).addAll(list);
        return colorPaletteManager;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ColorPaletteManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(ColorPaletteManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

