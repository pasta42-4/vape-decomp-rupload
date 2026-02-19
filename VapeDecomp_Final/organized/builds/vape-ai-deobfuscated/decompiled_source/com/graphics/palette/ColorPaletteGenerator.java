/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.graphics.palette;

import a.bE;
import a.hQ;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.math.precision.PrecisionMathOrchestrator;
import com.network.protocol.CommunicationProtocolHandler1761;
import com.security.crypto.CipherContextManager1101;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;
import com.ui.rendering.GraphicalRenderingController;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ColorPaletteGenerator
extends hQ {
    private final String V;
    private static final long[] bb;
    private float L;
    private final Color em;
    private boolean ee;
    private boolean ei;
    private static final long ab;
    private boolean ea;
    @Nullable
    private Color ef;
    private final ColorPaletteRenderer eo;
    private final Color ez;
    private boolean e2;
    private static final Map eb;
    private final GraphicalRenderEngine1082 ed;
    private ColorPaletteRenderer Y;
    private static final Object[] fb;
    private static final Integer[] db;
    private final List<AbstractComputationKernel> eg;
    private float ey;
    private boolean b;
    private Color e6;
    private boolean e_;
    private final float eR = 2.0f;
    private final ColorPaletteRenderer el;
    @Nullable
    private Color D;
    private static final String[] jb;
    @Nullable
    private CipherContextManager1101 ev;
    private static final float e4 = 12.5f;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ColorPaletteGenerator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        block19: {
            CipherContextManager1101 cipherContextManager1101;
            block18: {
                block17: {
                    try {
                        try {
                            try {
                                if (this.ef == null || !((double)userInteractionEventDispatcher.getX() < this.G() + this.w() - 12.5)) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ColorPaletteGenerator.a(customSystemException);
                            }
                            if (!((double)userInteractionEventDispatcher.getY() > this.W())) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ColorPaletteGenerator.a(customSystemException);
                        }
                        super.Z(userInteractionEventDispatcher);
                        GraphicalRenderingController.d = null;
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ColorPaletteGenerator.a(customSystemException);
                    }
                }
                try {
                    if (this.ee) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ColorPaletteGenerator.a(customSystemException);
                }
                cipherContextManager1101 = this.ev;
                try {
                    try {
                        if (cipherContextManager1101 == null || !cipherContextManager1101.G()) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ColorPaletteGenerator.a(customSystemException);
                    }
                    cipherContextManager1101.S(userInteractionEventDispatcher);
                    this.b();
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw ColorPaletteGenerator.a(customSystemException);
                }
            }
            try {
                try {
                    if (cipherContextManager1101 != null && cipherContextManager1101.G()) break block19;
                }
                catch (CustomSystemException customSystemException) {
                    throw ColorPaletteGenerator.a(customSystemException);
                }
                this.b();
            }
            catch (CustomSystemException customSystemException) {
                throw ColorPaletteGenerator.a(customSystemException);
            }
        }
    }

    public void Q(Color color) {
        this.e6 = color;
        this.getClass();
        this.Y = new ColorPaletteRenderer(0.15, new Color(0, 0, 0, 0), this.Y.Q());
    }

    @Nullable
    public Color A() {
        return this.D;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ColorPaletteGenerator.ab = MultiContainerRegistry.a(-6458996984380748545L, 5879811499615310674L, MethodHandles.lookup().lookupClass()).a(205325404331722L);
                ColorPaletteGenerator.fb = new Object[5];
                ColorPaletteGenerator.jb = new String[5];
                ColorPaletteGenerator.n();
                ColorPaletteGenerator.eb = new HashMap<K, V>(13);
                var0 = ColorPaletteGenerator.ab ^ 91886583542573L;
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
                var6_5 = "\u00eaJV\f8\u0098<\u000b\u0090]{\u00bc\u0085\u00b4\u00e5\u00da";
                var7_6 = "\u00eaJV\f8\u0098<\u000b\u0090]{\u00bc\u0085\u00b4\u00e5\u00da".length();
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
                    var6_5 = "~\u00d7\u00f5\u0081I\u00fa\u00f9o\u0086\u00e3!\u00a3\u00e3|\u00b0^";
                    var7_6 = "~\u00d7\u00f5\u0081I\u00fa\u00f9o\u0086\u00e3!\u00a3\u00e3|\u00b0^".length();
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
        ColorPaletteGenerator.bb = var8_3;
        ColorPaletteGenerator.db = new Integer[4];
    }

    public boolean Y() {
        return this.b;
    }

    public void r(boolean bl) {
        this.ei = bl;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public boolean d() {
        return this.ee;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void a(boolean bl) {
        this.e_ = bl;
    }

    public void B(@Nullable Color color) {
        this.ef = color;
    }

    @Override
    public double e() {
        return 0.0;
    }

    @Override
    public void U() {
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void E() {
        super.E();
        CipherContextManager1101 cipherContextManager1101 = this.ev;
        try {
            if (cipherContextManager1101 != null) {
                this.F();
                this.ed.Q(this.Y.k());
                this.ed.h(true);
                this.ed.E();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ColorPaletteGenerator.a(customSystemException);
        }
    }

    public boolean Q() {
        return this.ei;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'T' || c == '$' || c == '\u00c2' || c == 'V') {
                field = ColorPaletteGenerator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'T' ? lookup.findGetter(clazz, string2, clazz2) : (c == '$' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ColorPaletteGenerator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'P' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x744A;
        if (db[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/y_", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ColorPaletteGenerator.db[n2] = n3;
        }
        return db[n2];
    }

    private static Method h(long l, long l2) {
        int n = ColorPaletteGenerator.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n];
                int n3 = string2.indexOf(8);
                clazz3 = ColorPaletteGenerator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ColorPaletteGenerator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ColorPaletteGenerator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ColorPaletteGenerator.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ColorPaletteGenerator.f(235524917251912L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ColorPaletteGenerator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ColorPaletteGenerator.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ColorPaletteGenerator.f(235524917251912L, 0L);
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

    public boolean i() {
        return this.e_;
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

    public String a() {
        return this.V;
    }

    static CipherContextManager1101 q(ColorPaletteGenerator colorPaletteGenerator) {
        return colorPaletteGenerator.ev;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (jb[n4] != null) {
            return n4;
        }
        Object object = fb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 10;
                break;
            }
            case 1: {
                n3 = 26;
                break;
            }
            case 2: {
                n3 = 27;
                break;
            }
            case 3: {
                n3 = 22;
                break;
            }
            case 4: {
                n3 = 63;
                break;
            }
            case 5: {
                n3 = 20;
                break;
            }
            case 6: {
                n3 = 41;
                break;
            }
            case 7: {
                n3 = 47;
                break;
            }
            case 8: {
                n3 = 23;
                break;
            }
            case 9: {
                n3 = 29;
                break;
            }
            case 10: {
                n3 = 46;
                break;
            }
            case 11: {
                n3 = 0;
                break;
            }
            case 12: {
                n3 = 59;
                break;
            }
            case 13: {
                n3 = 19;
                break;
            }
            case 14: {
                n3 = 30;
                break;
            }
            case 15: {
                n3 = 45;
                break;
            }
            case 16: {
                n3 = 14;
                break;
            }
            case 17: {
                n3 = 6;
                break;
            }
            case 18: {
                n3 = 13;
                break;
            }
            case 19: {
                n3 = 42;
                break;
            }
            case 20: {
                n3 = 5;
                break;
            }
            case 21: {
                n3 = 55;
                break;
            }
            case 22: {
                n3 = 53;
                break;
            }
            case 23: {
                n3 = 40;
                break;
            }
            case 24: {
                n3 = 28;
                break;
            }
            case 25: {
                n3 = 35;
                break;
            }
            case 26: {
                n3 = 58;
                break;
            }
            case 27: {
                n3 = 37;
                break;
            }
            case 28: {
                n3 = 32;
                break;
            }
            case 29: {
                n3 = 12;
                break;
            }
            case 30: {
                n3 = 61;
                break;
            }
            case 31: {
                n3 = 2;
                break;
            }
            case 32: {
                n3 = 34;
                break;
            }
            case 33: {
                n3 = 39;
                break;
            }
            case 34: {
                n3 = 62;
                break;
            }
            case 35: {
                n3 = 24;
                break;
            }
            case 36: {
                n3 = 44;
                break;
            }
            case 37: {
                n3 = 11;
                break;
            }
            case 38: {
                n3 = 56;
                break;
            }
            case 39: {
                n3 = 17;
                break;
            }
            case 40: {
                n3 = 7;
                break;
            }
            case 41: {
                n3 = 51;
                break;
            }
            case 42: {
                n3 = 36;
                break;
            }
            case 43: {
                n3 = 49;
                break;
            }
            case 44: {
                n3 = 4;
                break;
            }
            case 45: {
                n3 = 3;
                break;
            }
            case 46: {
                n3 = 15;
                break;
            }
            case 47: {
                n3 = 18;
                break;
            }
            case 48: {
                n3 = 1;
                break;
            }
            case 49: {
                n3 = 43;
                break;
            }
            case 50: {
                n3 = 33;
                break;
            }
            case 51: {
                n3 = 54;
                break;
            }
            case 52: {
                n3 = 31;
                break;
            }
            case 53: {
                n3 = 52;
                break;
            }
            case 54: {
                n3 = 50;
                break;
            }
            case 55: {
                n3 = 48;
                break;
            }
            case 56: {
                n3 = 8;
                break;
            }
            case 57: {
                n3 = 9;
                break;
            }
            case 58: {
                n3 = 60;
                break;
            }
            case 59: {
                n3 = 38;
                break;
            }
            case 60: {
                n3 = 16;
                break;
            }
            case 61: {
                n3 = 57;
                break;
            }
            case 62: {
                n3 = 21;
                break;
            }
            default: {
                n3 = 25;
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
        ColorPaletteGenerator.jb[n4] = new String(cArray);
        return n4;
    }

    public ColorPaletteGenerator(String string, List<AbstractComputationKernel> list, Color color, Color color2, Color color3, float f, float f2) {
        block8: {
            long l = ab ^ 0x6558C67C4B88L;
            this.getClass();
            this.eo = new ColorPaletteRenderer(0.15, ColorPaletteGenerator.M.S, ColorPaletteGenerator.M.k);
            this.eR = 2.0f;
            this.em = ColorPaletteGenerator.M.n;
            this.ez = ColorPaletteGenerator.M.n;
            this.e6 = null;
            this.ey = 2.0f;
            this.L = 1.0f;
            this.ef = new Color(255, 255, 255, 30);
            this.D = new Color(255, 255, 255, 30);
            this.e_ = true;
            this.e2 = true;
            this.ei = true;
            this.V = string;
            this.eg = new ArrayList<AbstractComputationKernel>(list);
            for (AbstractComputationKernel abstractComputationKernel : list) {
                abstractComputationKernel.S(true);
                abstractComputationKernel.J(true);
            }
            try {
                if (color != null) {
                    this.Q(color);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ColorPaletteGenerator.a(customSystemException);
            }
            try {
                try {
                    this.ed = new GraphicalRenderEngine1082(110.0, 20.0);
                    this.ed.d().f((String)((Object)ColorPaletteGenerator.c("P", (int)ColorPaletteGenerator.b("v", (int)23453, (long)(0x6FF576EAD9C04453L ^ l)), (long)-1475759275577575273L, (long)l)));
                    this.ed.i(120.0);
                    this.ed.i(false);
                    this.ed.C(true);
                    this.getClass();
                    this.Y = new ColorPaletteRenderer(0.15, this.l(), color2);
                    this.getClass();
                    this.el = new ColorPaletteRenderer(0.15, this.em, this.ez);
                    if (color3 == null || color == null) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw ColorPaletteGenerator.a(customSystemException);
                }
                this.m(color3, color);
            }
            catch (CustomSystemException customSystemException) {
                throw ColorPaletteGenerator.a(customSystemException);
            }
        }
        this.ey = f;
        this.L = f2;
    }

    private static Field g(long l, long l2) {
        int n = ColorPaletteGenerator.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = ColorPaletteGenerator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ColorPaletteGenerator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ColorPaletteGenerator.c(clazz3, string2, clazz2)) != null) {
                    ColorPaletteGenerator.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ColorPaletteGenerator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ColorPaletteGenerator.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ColorPaletteGenerator.f(235524917251912L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void A(boolean bl) {
        this.b = bl;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ColorPaletteGenerator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static void R(ColorPaletteGenerator colorPaletteGenerator) {
        colorPaletteGenerator.b();
    }

    public boolean M() {
        boolean bl;
        try {
            bl = this.ev != null;
        }
        catch (CustomSystemException customSystemException) {
            throw ColorPaletteGenerator.a(customSystemException);
        }
        return bl;
    }

    public void m(Color color, Color color2) {
        this.e6 = color;
        this.getClass();
        this.Y = new ColorPaletteRenderer(0.15, color2, this.Y.Q());
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ColorPaletteGenerator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ColorPaletteGenerator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public double z() {
        return 0.0;
    }

    private static void n() {
        Object[] objectArray = fb;
        fb[0] = "\u001bYv";
        objectArray[1] = Integer.TYPE;
        ColorPaletteGenerator.jb[1] = "java/lang/Integer";
        objectArray[2] = "\u0001Mk1y\u0005\nBz~\u0004\u001d\u0019Es7";
        objectArray[3] = "xCR\bDxsLCG%vxGG\u001d";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u001d-\u0018Im\u0003ImDvk\u0006#'\u0012\u0013l\u0016Sl\u0000\u0007\u0000DM:O\fx\u001dB-\u0014v";
    }

    public void g(boolean bl) {
        this.ee = bl;
    }

    @Override
    public void g() {
        try {
            if (!this.ea) {
                this.eo.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ColorPaletteGenerator.a(customSystemException);
        }
        this.ea = true;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ColorPaletteGenerator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ColorPaletteGenerator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean P() {
        return this.e2;
    }

    @Nullable
    public Color e() {
        return this.ef;
    }

    private void b() {
        block6: {
            long l;
            block8: {
                block7: {
                    block5: {
                        l = ab ^ 0x4EA92E28340L;
                        CipherContextManager1101 cipherContextManager1101 = this.ev;
                        try {
                            if (cipherContextManager1101 == null) break block5;
                            this.ev = null;
                            GraphicalRenderingController.d = null;
                            GraphicalRenderingController.z(cipherContextManager1101);
                            break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ColorPaletteGenerator.a(customSystemException);
                        }
                    }
                    try {
                        this.ed.k();
                        if (!this.e_) break block7;
                        this.ed.Y(this.w() - this.J());
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ColorPaletteGenerator.a(customSystemException);
                    }
                }
                this.ed.Y(this.w());
            }
            this.ed.k(3.0f);
            this.ed.n(new bE(0.0, 2.0), new Object[0]);
            for (AbstractComputationKernel abstractComputationKernel : this.eg) {
                abstractComputationKernel.Y(this.ed.w() - 3.0);
                abstractComputationKernel.P(12.0);
                this.ed.n(new PrecisionMathOrchestrator(0.0, 0.5, 0.0, 0.0, abstractComputationKernel), ColorPaletteGenerator.c("P", (int)ColorPaletteGenerator.b("v", (int)16752, (long)(0x37D9CB3BDBB09675L ^ l)), (long)2543809708069433439L, (long)l));
            }
            this.ed.P(Math.min(this.ed.Q(), this.ed.d().R()));
            this.ed.h(true);
            this.ev = GraphicalRenderingController.v(this, this.ed, CipherContextManager1101.class);
            this.ev.P(new CommunicationProtocolHandler1761(this));
            GraphicalRenderingController.d = this;
            this.F();
        }
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ColorPaletteGenerator.e(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                ColorPaletteGenerator.fb[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void V(boolean bl) {
        this.e2 = bl;
    }

    @Override
    public void G() {
        CallSite callSite;
        float f;
        float f2;
        Color color;
        double d2;
        double d3;
        long l;
        block30: {
            block26: {
                boolean bl;
                ColorPaletteRenderer colorPaletteRenderer;
                block28: {
                    block27: {
                        block29: {
                            block24: {
                                CipherContextManager1101 cipherContextManager1101;
                                block25: {
                                    l = ab ^ 0x538C10CDC06L;
                                    cipherContextManager1101 = this.ev;
                                    try {
                                        if (cipherContextManager1101 == null) break block24;
                                        if (!this.b) break block25;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ColorPaletteGenerator.a(customSystemException);
                                    }
                                    d3 = this.W() - cipherContextManager1101.b();
                                    d2 = this.b() + cipherContextManager1101.b();
                                    break block29;
                                }
                                d3 = this.W();
                                d2 = this.b() + cipherContextManager1101.b();
                                break block29;
                            }
                            d3 = this.W();
                            d2 = this.b();
                        }
                        try {
                            try {
                                try {
                                    if (!this.M()) break block26;
                                    colorPaletteRenderer = this.Y;
                                    if (!this.s()) break block27;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ColorPaletteGenerator.a(customSystemException);
                                }
                                if (this.M()) break block27;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ColorPaletteGenerator.a(customSystemException);
                            }
                            bl = true;
                            break block28;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ColorPaletteGenerator.a(customSystemException);
                        }
                    }
                    bl = false;
                }
                colorPaletteRenderer.C(bl);
                ConfigurationManager.S(this.G(), d3, this.w(), d2, this.Y.k());
                break block30;
            }
            try {
                if (this.H()) {
                    ConfigurationManager.S(this.G(), d3, this.w(), d2, this.Y.k());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ColorPaletteGenerator.a(customSystemException);
            }
            try {
                if (this.s()) {
                    ConfigurationManager.S(this.G(), d3, this.w(), d2, new Color(100, 100, 100, 10));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ColorPaletteGenerator.a(customSystemException);
            }
        }
        try {
            if (this.e6 != null) {
                ConfigurationManager.U(this.G(), d3, this.w(), d2, this.e6, this.ey, this.L, 1.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ColorPaletteGenerator.a(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator = this.t(0.7);
        double d4 = cryptographicParameterGenerator.B(this.V);
        double d5 = this.G();
        double d6 = this.W() + this.b() / 2.0 - d4 / 2.0;
        double d7 = this.W() + this.b() / 2.0;
        this.getClass();
        double d8 = d7 - 2.0 / 2.0;
        if (this.e2) {
            cryptographicParameterGenerator.Q(this.V, d5 += (this.w() - 12.5) / 2.0, d6, ColorPaletteGenerator.M.c);
        } else {
            this.getClass();
            cryptographicParameterGenerator.R(this.V, d5 += 5.0, d6, ColorPaletteGenerator.M.c);
        }
        try {
            if (this.ef != null) {
                ConfigurationManager.A(this.G() + this.w() - 12.5, this.W() + 2.0, 1.0, this.b() - 4.5, this.ef);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ColorPaletteGenerator.a(customSystemException);
        }
        try {
            color = Color.WHITE;
            f2 = (float)(this.G() + this.w()) - 8.0f;
            f = (float)d8;
            callSite = this.M() ? ColorPaletteGenerator.c("P", (int)ColorPaletteGenerator.b("v", (int)23881, (long)(0x5A3AF2FD20DD5508L ^ l)), (long)8938357328391270169L, (long)l) : ColorPaletteGenerator.c("P", (int)ColorPaletteGenerator.b("v", (int)23703, (long)(0x794A34072C5154D5L ^ l)), (long)8938357328391270169L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw ColorPaletteGenerator.a(customSystemException);
        }
        StateTrackingCoordinator.B(color, f2, f, (String)((Object)callSite), this.eR, this.eR, false);
    }

    public void q(@Nullable Color color) {
        this.D = color;
    }

    @Override
    public void d() {
        block6: {
            try {
                try {
                    try {
                        if (!this.ea || this.s()) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ColorPaletteGenerator.a(customSystemException);
                    }
                    if (this.M()) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw ColorPaletteGenerator.a(customSystemException);
                }
                this.eo.c();
                this.ea = false;
            }
            catch (CustomSystemException customSystemException) {
                throw ColorPaletteGenerator.a(customSystemException);
            }
        }
    }

    private void F() {
        block6: {
            CipherContextManager1101 cipherContextManager1101;
            block9: {
                block8: {
                    block7: {
                        cipherContextManager1101 = this.ev;
                        try {
                            try {
                                if (cipherContextManager1101 == null) break block6;
                                if (!this.e_) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ColorPaletteGenerator.a(customSystemException);
                            }
                            cipherContextManager1101.b(this.G() + this.J());
                            break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ColorPaletteGenerator.a(customSystemException);
                        }
                    }
                    cipherContextManager1101.b(this.G());
                }
                try {
                    if (!this.b) break block9;
                    cipherContextManager1101.M(this.W() - cipherContextManager1101.b());
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw ColorPaletteGenerator.a(customSystemException);
                }
            }
            cipherContextManager1101.M(this.W() + this.b());
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ColorPaletteGenerator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ColorPaletteGenerator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

