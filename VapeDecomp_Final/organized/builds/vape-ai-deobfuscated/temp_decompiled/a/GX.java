/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.stb.STBTTFontinfo
 *  org.lwjgl.stb.STBTTPackContext
 *  org.lwjgl.stb.STBTTPackRange
 *  org.lwjgl.stb.STBTTPackRange$Buffer
 *  org.lwjgl.stb.STBTTPackedchar
 *  org.lwjgl.stb.STBTTPackedchar$Buffer
 *  org.lwjgl.stb.STBTruetype
 *  org.lwjgl.system.MemoryStack
 */
package a;

import a.Ao;
import a.Dn;
import a.EP;
import a.Fn;
import a.G5;
import a.Iy;
import a.KP;
import a.Ne;
import a.O_;
import a.SE;
import a.WB;
import a.Y7;
import a.d8;
import a.e;
import a.k2;
import a.tl;
import a.z6;
import a.zD;
import a.zZ;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.BufferUtils;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTTPackContext;
import org.lwjgl.stb.STBTTPackRange;
import org.lwjgl.stb.STBTTPackedchar;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryStack;

public class Gx
extends G5 {
    private static final String[] h;
    private static final Map f;
    private Map<Integer, zZ> Q;
    private static final long[] d;
    private static final long b;
    private float B;
    private float n;
    private static final Integer[] e;
    private static final Object[] g;
    private WB K;
    private final float T = 1.0f;

    @Override
    public void W(String string, double d2, double d3, Color color) {
        char[] cArray = string.toCharArray();
        int n2 = cArray.length;
        for (int i10 = 0; i10 < n2; ++i10) {
            Character c10 = Character.valueOf(cArray[i10]);
            this.P(c10.toString(), d2, d3, color);
            d3 += this.B(c10.toString()) * 0.9;
        }
    }

    @Override
    public void t(String string, double d2, double d3, Color color, boolean bl2) {
        this.k(string, d2, d3, color, bl2, false);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public double l(String string, boolean bl2) {
        block16: {
            float f10;
            block17: {
                string = SE.h.e().l().D(string);
                double d2 = SE.h.a().b();
                try {
                    if (this.w != d2) {
                        this.X();
                    }
                }
                catch (O_ o_2) {
                    throw Gx.a(o_2);
                }
                this.w = d2;
                String string2 = "";
                char[] cArray = string.toCharArray();
                for (int i10 = 0; i10 < cArray.length; ++i10) {
                    char c10 = cArray[i10];
                    try {
                        if (c10 == '\u00a7') {
                            ++i10;
                            continue;
                        }
                    }
                    catch (O_ o_3) {
                        throw Gx.a(o_3);
                    }
                    string2 = string2 + c10;
                }
                string = string2;
                f10 = 0.6f;
                if (d2 != 1.0) {
                    f10 *= (float)(1.0 / d2);
                }
                try {
                    try {
                        try {
                            if (!Ao.P() || bl2) break block16;
                        }
                        catch (O_ o_4) {
                            throw Gx.a(o_4);
                        }
                        if (!this.m.containsKey(string)) break block17;
                    }
                    catch (O_ o_5) {
                        throw Gx.a(o_5);
                    }
                    return (Double)this.m.get(string);
                }
                catch (O_ o_6) {
                    throw Gx.a(o_6);
                }
            }
            double d3 = 0.0;
            for (int i11 = 0; i11 < string.length(); ++i11) {
                char c11 = string.charAt(i11);
                zZ zZ2 = this.Q.get(c11);
                if (zZ2 == null) {
                    zZ2 = this.Q.get(32);
                }
                d3 += (double)(zZ2.x * f10);
            }
            this.m.put(string, d3);
            return d3;
        }
        return (int)((float)EP.X().L(string) * ((float)this.o / 16.0f));
    }

    private static Method a(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i10 = 0; i10 < n2; ++i10) {
                if (classArray2[i10] != classArray[i10]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Gx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Gx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static boolean lambda$new$0(File file) {
        boolean bl2;
        block8: {
            block7: {
                long l10 = b ^ 0x1F53177B8DCBL;
                try {
                    block6: {
                        try {
                            try {
                                if (file.isFile() && file.getName().endsWith((String)((Object)Gx.b("\u00d3", (int)Gx.a("h", (int)11087, (long)(0x7B5EBD4BBEEA43BCL ^ l10)), (long)-5701386890464347598L, (long)l10)))) break block6;
                            }
                            catch (O_ o_2) {
                                throw Gx.a(o_2);
                            }
                            if (!file.isDirectory()) break block7;
                        }
                        catch (O_ o_3) {
                            throw Gx.a(o_3);
                        }
                    }
                    bl2 = true;
                    break block8;
                }
                catch (O_ o_4) {
                    throw Gx.a(o_4);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = Gx.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = Gx.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public double g(String string, boolean bl2) {
        block3: {
            try {
                if (!Ao.P() || bl2) break block3;
            }
            catch (O_ o_2) {
                throw Gx.a(o_2);
            }
            float f10 = 0.6f;
            float f11 = (float)SE.h.a().b();
            if ((double)f11 != 1.0) {
                f10 *= 1.0f / f11;
            }
            return (float)this.o * f10;
        }
        return 8.0f * ((float)this.o / 16.0f);
    }

    @Override
    public void D(String string, double d2, double d3, Color color, Color color2, boolean bl2) {
        this.I(string, d2, d3, color, color2, bl2, false);
    }

    private void lambda$createFont$2(int n2, ByteBuffer byteBuffer, String string) {
        long l10 = b ^ 0x456C372608DEL;
        this.K = WB.F(n2, n2, byteBuffer, 6403, 9729, 10497);
        SE.x((String)((Object)Gx.b("\u00d3", (int)Gx.a("h", (int)28, (long)(0x6263779D8C92EDFBL ^ l10)), (long)3888225971849936679L, (long)l10)) + string + (String)((Object)Gx.b("\u00d3", (int)Gx.a("h", (int)11803, (long)(0x2E900A2E4121C3F5L ^ l10)), (long)3888225971849936679L, (long)l10)) + this.o + (String)((Object)Gx.b("\u00d3", (int)Gx.a("h", (int)11203, (long)(0xDF6A54D57A1463AL ^ l10)), (long)3888225971849936679L, (long)l10)));
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00c3' || c10 == '\u00fe' || c10 == '\u00fd' || c10 == 'v') {
                field = Gx.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00c3' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00fe' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00fd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Gx.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'P' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (h[n5] != null) {
            return n5;
        }
        Object object = g[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 24;
                break;
            }
            case 1: {
                n4 = 6;
                break;
            }
            case 2: {
                n4 = 25;
                break;
            }
            case 3: {
                n4 = 0;
                break;
            }
            case 4: {
                n4 = 52;
                break;
            }
            case 5: {
                n4 = 38;
                break;
            }
            case 6: {
                n4 = 57;
                break;
            }
            case 7: {
                n4 = 14;
                break;
            }
            case 8: {
                n4 = 63;
                break;
            }
            case 9: {
                n4 = 49;
                break;
            }
            case 10: {
                n4 = 56;
                break;
            }
            case 11: {
                n4 = 18;
                break;
            }
            case 12: {
                n4 = 22;
                break;
            }
            case 13: {
                n4 = 20;
                break;
            }
            case 14: {
                n4 = 3;
                break;
            }
            case 15: {
                n4 = 35;
                break;
            }
            case 16: {
                n4 = 58;
                break;
            }
            case 17: {
                n4 = 11;
                break;
            }
            case 18: {
                n4 = 23;
                break;
            }
            case 19: {
                n4 = 4;
                break;
            }
            case 20: {
                n4 = 17;
                break;
            }
            case 21: {
                n4 = 7;
                break;
            }
            case 22: {
                n4 = 31;
                break;
            }
            case 23: {
                n4 = 16;
                break;
            }
            case 24: {
                n4 = 51;
                break;
            }
            case 25: {
                n4 = 2;
                break;
            }
            case 26: {
                n4 = 15;
                break;
            }
            case 27: {
                n4 = 28;
                break;
            }
            case 28: {
                n4 = 47;
                break;
            }
            case 29: {
                n4 = 43;
                break;
            }
            case 30: {
                n4 = 36;
                break;
            }
            case 31: {
                n4 = 62;
                break;
            }
            case 32: {
                n4 = 19;
                break;
            }
            case 33: {
                n4 = 41;
                break;
            }
            case 34: {
                n4 = 59;
                break;
            }
            case 35: {
                n4 = 48;
                break;
            }
            case 36: {
                n4 = 26;
                break;
            }
            case 37: {
                n4 = 50;
                break;
            }
            case 38: {
                n4 = 13;
                break;
            }
            case 39: {
                n4 = 9;
                break;
            }
            case 40: {
                n4 = 34;
                break;
            }
            case 41: {
                n4 = 1;
                break;
            }
            case 42: {
                n4 = 45;
                break;
            }
            case 43: {
                n4 = 8;
                break;
            }
            case 44: {
                n4 = 27;
                break;
            }
            case 45: {
                n4 = 61;
                break;
            }
            case 46: {
                n4 = 12;
                break;
            }
            case 47: {
                n4 = 55;
                break;
            }
            case 48: {
                n4 = 40;
                break;
            }
            case 49: {
                n4 = 21;
                break;
            }
            case 50: {
                n4 = 33;
                break;
            }
            case 51: {
                n4 = 46;
                break;
            }
            case 52: {
                n4 = 44;
                break;
            }
            case 53: {
                n4 = 54;
                break;
            }
            case 54: {
                n4 = 37;
                break;
            }
            case 55: {
                n4 = 42;
                break;
            }
            case 56: {
                n4 = 39;
                break;
            }
            case 57: {
                n4 = 29;
                break;
            }
            case 58: {
                n4 = 5;
                break;
            }
            case 59: {
                n4 = 60;
                break;
            }
            case 60: {
                n4 = 32;
                break;
            }
            case 61: {
                n4 = 30;
                break;
            }
            case 62: {
                n4 = 10;
                break;
            }
            default: {
                n4 = 53;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l10 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        Gx.h[n5] = new String(cArray);
        return n5;
    }

    public Gx(byte[] byArray, int n2, String string) {
        this.Q = new HashMap<Integer, zZ>();
        this.T = 1.0f;
        this.w(byArray, n2, string);
    }

    public void W(String string, double d2, double d3, int n2, boolean bl2, boolean bl3) {
        block29: {
            block24: {
                long l10;
                block26: {
                    l10 = b ^ 0x5579218449B3L;
                    if (this.N) {
                        string = SE.h.e().l().D(string);
                    }
                    try {
                        block25: {
                            try {
                                try {
                                    try {
                                        if (!Ao.P() || bl2) break block24;
                                    }
                                    catch (O_ o_2) {
                                        throw Gx.a(o_2);
                                    }
                                    if (string == null) break block25;
                                }
                                catch (O_ o_3) {
                                    throw Gx.a(o_3);
                                }
                                if (string.length() != 0) break block26;
                            }
                            catch (O_ o_4) {
                                throw Gx.a(o_4);
                            }
                        }
                        return;
                    }
                    catch (O_ o_5) {
                        throw Gx.a(o_5);
                    }
                }
                int n3 = (n2 & Gx.a("h", (int)7053, (long)(0x438F491F9DAEB71AL ^ l10))) >> 16;
                int n4 = (n2 & Gx.a("h", (int)5110, (long)(0x7A968D7847FF3F70L ^ l10))) >> 8;
                int n5 = n2 & 0xFF;
                int n6 = (n2 & Gx.a("h", (int)24264, (long)(0x39200037FE8A724CL ^ l10))) >> 24;
                try {
                    if (n6 < 0) {
                        n6 += 256;
                    }
                }
                catch (O_ o_6) {
                    throw Gx.a(o_6);
                }
                if (n6 == 0) {
                    n6 = 255;
                }
                Color color = new Color(n3, n4, n5, n6);
                char[] cArray = new char[string.length()];
                Arrays.fill(cArray, '\u0000');
                int n7 = 0;
                String string2 = "";
                char[] cArray2 = string.toCharArray();
                for (int i10 = 0; i10 < cArray2.length; ++i10) {
                    char c10 = cArray2[i10];
                    try {
                        if (c10 == '\u00a7') {
                            cArray[n7] = cArray2[++i10];
                            continue;
                        }
                    }
                    catch (O_ o_7) {
                        throw Gx.a(o_7);
                    }
                    string2 = string2 + c10;
                    ++n7;
                }
                string = string2;
                float f10 = 0.6f;
                float f11 = (float)SE.h.a().b();
                if ((double)f11 != 1.0) {
                    f10 *= 1.0f / f11;
                }
                d3 += (double)(this.n * this.B * f10);
                Color color2 = color;
                for (int i11 = 0; i11 < string.length(); ++i11) {
                    zZ zZ2;
                    block28: {
                        block27: {
                            char c11;
                            char c12 = string.charAt(i11);
                            zZ2 = this.Q.get(c12);
                            if (zZ2 == null) {
                                zZ2 = this.Q.get(32);
                            }
                            if ((c11 = cArray[i11]) != '\u0000') {
                                float[] fArray = new float[3];
                                this.Y(c11, fArray);
                                color2 = new Color(fArray[0], fArray[1], fArray[2]);
                                if (c11 == 'r') {
                                    color2 = color;
                                }
                            }
                            try {
                                if (!bl3) break block27;
                                zD.r((float)d2, (float)d3, zZ2, this.K, color2, f10);
                                break block28;
                            }
                            catch (O_ o_8) {
                                throw Gx.a(o_8);
                            }
                        }
                        z6.g((float)d2, (float)d3, zZ2, this.K, color2, f10);
                    }
                    d2 += (double)(zZ2.x * f10);
                }
                break block29;
            }
            this.w(d2, d3, string, n2, false, 1.0f, bl3);
        }
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "\u001a\u001fs";
        objectArray[1] = Integer.TYPE;
        Gx.h[1] = "java/lang/Integer";
        objectArray[2] = "uc{=Hw~ljr5omkc;";
        objectArray[3] = "BT\r\u0002";
        objectArray[4] = "Fw";
        objectArray[5] = "@yV\u0011!\u0003KvG^@\r@}C\u0004";
        objectArray[6] = "\t?q\bARY\"+E3e3` \u001fK\u0003\u000ee{\u0016B;\bd`\u0017R\\J+jJ3";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "q0f^EK!swc\u0017AOu1\nAQw\"9\u001b\u0019:uvc\u001bD\u0007p-j\u0012|";
    }

    public Gx(String string, int n2) {
        Object[] objectArray;
        long l10 = b ^ 0x14C6EBB5671DL;
        this.Q = new HashMap<Integer, zZ>();
        this.T = 1.0f;
        if (Y7.h.size() == 0) {
            File[] fileArray;
            objectArray = new File(System.getProperty((String)((Object)Gx.b("\u00d3", (int)Gx.a("h", (int)14346, (long)(0x2EBC251B1FC3BA29L ^ l10)), (long)6500542822360502500L, (long)l10))) + (String)((Object)Gx.b("\u00d3", (int)Gx.a("h", (int)3661, (long)(0xDC3AEDCB6940C64L ^ l10)), (long)6500542822360502500L, (long)l10))).listFiles(Gx::lambda$new$0);
            if (objectArray != null) {
                fileArray = (File[])objectArray;
                int n3 = fileArray.length;
                for (int i10 = 0; i10 < n3; ++i10) {
                    Object object = fileArray[i10];
                    try {
                        if (!((File)object).exists()) continue;
                        Y7.h.add(((File)object).getAbsolutePath());
                        continue;
                    }
                    catch (Exception exception) {
                        throw Gx.a(exception);
                    }
                }
            }
            if ((fileArray = new File(System.getenv((String)((Object)Gx.b("\u00d3", (int)Gx.a("h", (int)3711, (long)(0x71BC865F39E40C58L ^ l10)), (long)6500542822360502500L, (long)l10))) + (String)((Object)Gx.b("\u00d3", (int)Gx.a("h", (int)25616, (long)(0x531A20162DEDE632L ^ l10)), (long)6500542822360502500L, (long)l10))).listFiles(Gx::lambda$new$1)) != null) {
                for (File file : fileArray) {
                    try {
                        if (!file.exists()) continue;
                        Y7.h.add(file.getAbsolutePath());
                    }
                    catch (Exception exception) {
                        throw Gx.a(exception);
                    }
                }
            }
        }
        objectArray = new byte[]{};
        for (String string2 : Y7.h) {
            try {
                if (!string2.contains(string)) {
                    continue;
                }
            }
            catch (Exception exception) {
                throw Gx.a(exception);
            }
            try {
                SE.x((String)((Object)Gx.b("\u00d3", (int)Gx.a("h", (int)4444, (long)(0x7DBE6B02D27C137DL ^ l10)), (long)6500542822360502500L, (long)l10)) + string);
                File file = new File(string2);
                FileInputStream fileInputStream = new FileInputStream(file);
                objectArray = new byte[(int)file.length()];
                fileInputStream.read((byte[])objectArray);
                fileInputStream.close();
                break;
            }
            catch (Exception exception) {
                SE.W(exception);
                break;
            }
        }
        this.w((byte[])objectArray, n2, string);
    }

    public void p(String string, double d2, double d3, int n2, boolean bl2, boolean bl3) {
        block5: {
            block4: {
                long l10 = b ^ 0x6A9B09CB3F16L;
                try {
                    try {
                        if (!Ao.P() || bl2) break block4;
                    }
                    catch (O_ o_2) {
                        throw Gx.a(o_2);
                    }
                    this.Y(string, d2 + 0.5, d3 + 0.5, (int)Gx.a("h", (int)7634, (long)(0x74126BE63D5047E2L ^ l10)));
                    this.P(string, d2, d3, n2);
                    break block5;
                }
                catch (O_ o_3) {
                    throw Gx.a(o_3);
                }
            }
            this.w(d2, d3, string, n2, true, 1.0f, bl3);
        }
    }

    private static Void lambda$renderMinecraftFont$3(String string, double d2, double d3, int n2, boolean bl2, Dn dn) {
        boolean bl3 = Ne.h.k(3042);
        boolean bl4 = Ne.h.k(3553);
        boolean bl5 = Ne.h.k(2896);
        boolean bl6 = Ne.h.k(3008);
        try {
            if (!bl3) {
                tl.N();
            }
        }
        catch (O_ o_2) {
            throw Gx.a(o_2);
        }
        try {
            if (!bl4) {
                tl.B();
            }
        }
        catch (O_ o_3) {
            throw Gx.a(o_3);
        }
        try {
            if (bl5) {
                tl.P();
            }
        }
        catch (O_ o_4) {
            throw Gx.a(o_4);
        }
        try {
            if (!bl6) {
                tl.s();
            }
        }
        catch (O_ o_5) {
            throw Gx.a(o_5);
        }
        try {
            Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
            EP.X().N(string, (float)d2, (float)d3, n2, bl2, dn);
            Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
            if (!bl6) {
                tl.Z();
            }
        }
        catch (O_ o_6) {
            throw Gx.a(o_6);
        }
        try {
            if (bl5) {
                tl.T();
            }
        }
        catch (O_ o_7) {
            throw Gx.a(o_7);
        }
        try {
            if (!bl3) {
                tl.j();
            }
        }
        catch (O_ o_8) {
            throw Gx.a(o_8);
        }
        try {
            if (!bl4) {
                tl.R();
            }
        }
        catch (O_ o_9) {
            throw Gx.a(o_9);
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = Gx.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    @Override
    public void c(String string, double d2, double d3, int n2, boolean bl2) {
        this.W(string, d2, d3, n2, bl2, false);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = Gx.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(long l10, long l11) {
        int n2 = Gx.a(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            String string = h[n2];
            int n3 = string.indexOf(8);
            Class clazz = Gx.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = Gx.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Gx.a(clazz3, string2, clazz2)) != null) {
                    Gx.g[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = Gx.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        Gx.g[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Gx.b(390243855950114L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                Gx.b = d8.a(-3394363570645361173L, -2636035791125784770L, MethodHandles.lookup().lookupClass()).a(167407756130572L);
                Gx.g = new Object[8];
                Gx.h = new String[8];
                Gx.a();
                Gx.f = new HashMap<K, V>(13);
                var0 = Gx.b ^ 94957798617898L;
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
                var8_3 = new long[20];
                var5_4 = 0;
                var6_5 = "PV3-\u00c4\u00fb\u00e9%5\u00cc\u00d8\u00b0\u0080\u00c49\u00cd\u00f8\u00a0\u00c6J\u00fb^\u001f>+E\u00a6l\u00b6\u0002\u0002\u00f5\u0017\u00ecFX\u0086\u0015\u0088~\u0087\u009a\u00d4\u00e6\u00a3\"O\u0012*GO\u00fc\u00b4\u00e44\u0098wt\u00a5K\u00af\u00b8\u0090\u0084\u0086\u00b2\u00b3\u00e4:\u00f8\u00a03\u00b4D\u0018\u00afoS\u00f1-\u0086Y\u001b\u0098\u007f\u0092/y@&C|9\u0094\u00f4n\u00a6\u00c1\u0086\u0014W\u00f2\u00ac\u0015\u00c0\u00dc3\u0005x\u00ea\u008e\u0001\u00be\u00a3\u00d5>\u00a7sBln\u00b16\u00b5H4Z\u00a9\u00b0 &\u0085\u00e6Xq\u00d3?\u00a6g\u00d6\u00e4\u0096\u007f\u0098";
                var7_6 = "PV3-\u00c4\u00fb\u00e9%5\u00cc\u00d8\u00b0\u0080\u00c49\u00cd\u00f8\u00a0\u00c6J\u00fb^\u001f>+E\u00a6l\u00b6\u0002\u0002\u00f5\u0017\u00ecFX\u0086\u0015\u0088~\u0087\u009a\u00d4\u00e6\u00a3\"O\u0012*GO\u00fc\u00b4\u00e44\u0098wt\u00a5K\u00af\u00b8\u0090\u0084\u0086\u00b2\u00b3\u00e4:\u00f8\u00a03\u00b4D\u0018\u00afoS\u00f1-\u0086Y\u001b\u0098\u007f\u0092/y@&C|9\u0094\u00f4n\u00a6\u00c1\u0086\u0014W\u00f2\u00ac\u0015\u00c0\u00dc3\u0005x\u00ea\u008e\u0001\u00be\u00a3\u00d5>\u00a7sBln\u00b16\u00b5H4Z\u00a9\u00b0 &\u0085\u00e6Xq\u00d3?\u00a6g\u00d6\u00e4\u0096\u007f\u0098".length();
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
                    var6_5 = "B\u00e9\u00ca\u00e9;O\u00cc\u0085\u009a\u001a\bG\u00ee1\u00b0\u0089";
                    var7_6 = "B\u00e9\u00ca\u00e9;O\u00cc\u0085\u009a\u001a\bG\u00ee1\u00b0\u0089".length();
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
        Gx.d = var8_3;
        Gx.e = new Integer[20];
    }

    /*
     * Loose catch block
     */
    private void w(byte[] byArray, int n2, String string) {
        Object object;
        int n3;
        block64: {
            float f10;
            IntBuffer intBuffer;
            IntBuffer intBuffer2;
            IntBuffer intBuffer3;
            Object object2;
            IntBuffer intBuffer4;
            Throwable throwable;
            STBTTFontinfo sTBTTFontinfo;
            Object object3;
            Object object4;
            long l10;
            block60: {
                block61: {
                    HashSet<Integer> hashSet;
                    block56: {
                        l10 = b ^ 0xD0DC4B71F36L;
                        try {
                            SE.x((String)((Object)Gx.b("\u00d3", (int)Gx.a("h", (int)30786, (long)(0x4D05ABA21CA0249L ^ l10)), (long)2458271098991618255L, (long)l10)) + string + (String)((Object)Gx.b("\u00d3", (int)Gx.a("h", (int)9782, (long)(0x5116F6BFB77C5C32L ^ l10)), (long)2458271098991618255L, (long)l10)) + n2);
                            if (string.contains((CharSequence)((Object)Gx.b("\u00d3", (int)Gx.a("h", (int)32379, (long)(0x157DD27405018468L ^ l10)), (long)2458271098991618255L, (long)l10)))) {
                                --n2;
                            }
                        }
                        catch (Throwable throwable2) {
                            throw Gx.a(throwable2);
                        }
                        hashSet = new HashSet<Integer>();
                        try {
                            for (int i10 = 32; i10 <= 126; ++i10) {
                                hashSet.add(i10);
                            }
                        }
                        catch (Throwable throwable3) {
                            throw Gx.a(throwable3);
                        }
                        hashSet.add(0);
                        CallSite callSite = Gx.b("\u00d3", (Object)Gx.b("\u00d3", (int)Gx.a("h", (int)15283, (long)(0x41E44BA7634541BEL ^ l10)), (long)2458271098991618255L, (long)l10), (long)2458368513459735753L, (long)l10);
                        if (callSite == null) break block56;
                        try {
                            Throwable throwable4;
                            block57: {
                                object4 = new ByteArrayInputStream((byte[])callSite);
                                object3 = new BufferedReader(new InputStreamReader((InputStream)object4, StandardCharsets.UTF_8));
                                throwable4 = null;
                                while (true) {
                                    int n4 = ((BufferedReader)object3).read();
                                    try {
                                        if (n4 == -1) break;
                                        if (n4 < 32) continue;
                                    }
                                    catch (Throwable throwable5) {
                                        throw Gx.a(throwable5);
                                    }
                                    hashSet.add(n4);
                                }
                                try {
                                    if (object3 == null) break block56;
                                    if (throwable4 == null) break block57;
                                }
                                catch (Throwable throwable6) {
                                    throw Gx.a(throwable6);
                                }
                                try {
                                    ((BufferedReader)object3).close();
                                }
                                catch (Throwable throwable7) {
                                    throwable4.addSuppressed(throwable7);
                                }
                                break block56;
                            }
                            ((BufferedReader)object3).close();
                            break block56;
                            catch (Throwable throwable8) {
                                try {
                                    throwable4 = throwable8;
                                    throw throwable8;
                                }
                                catch (Throwable throwable9) {
                                    block58: {
                                        block59: {
                                            try {
                                                if (object3 == null) break block58;
                                                if (throwable4 == null) break block59;
                                            }
                                            catch (Throwable throwable10) {
                                                throw Gx.a(throwable10);
                                            }
                                            try {
                                                ((BufferedReader)object3).close();
                                            }
                                            catch (Throwable throwable11) {
                                                throwable4.addSuppressed(throwable11);
                                            }
                                            break block58;
                                        }
                                        ((BufferedReader)object3).close();
                                    }
                                    throw throwable9;
                                }
                            }
                        }
                        catch (Exception exception) {
                            SE.W(exception);
                        }
                    }
                    object4 = hashSet.stream().mapToInt(Integer::intValue).toArray();
                    Arrays.sort((int[])object4);
                    this.o = n2;
                    object3 = BufferUtils.createByteBuffer((int)byArray.length).put(byArray);
                    ((ByteBuffer)object3).flip();
                    n3 = 4096;
                    sTBTTFontinfo = STBTTFontinfo.create();
                    try {
                        if (!STBTruetype.stbtt_InitFont((STBTTFontinfo)sTBTTFontinfo, (ByteBuffer)object3)) {
                            SE.x((String)((Object)Gx.b("\u00d3", (int)Gx.a("h", (int)27163, (long)(0x201DC1FB0923101CL ^ l10)), (long)2458271098991618255L, (long)l10)));
                            return;
                        }
                    }
                    catch (Throwable throwable12) {
                        throw Gx.a(throwable12);
                    }
                    object = MemoryStack.stackPush();
                    throwable = null;
                    IntBuffer intBuffer5 = object.mallocInt(1);
                    IntBuffer intBuffer6 = object.mallocInt(1);
                    intBuffer4 = object.mallocInt(1);
                    STBTruetype.stbtt_GetFontVMetrics((STBTTFontinfo)sTBTTFontinfo, (IntBuffer)intBuffer5, (IntBuffer)intBuffer6, (IntBuffer)intBuffer4);
                    this.n = intBuffer5.get(0);
                    object2 = object.mallocInt(1);
                    intBuffer3 = object.mallocInt(1);
                    intBuffer2 = object.mallocInt(1);
                    intBuffer = object.mallocInt(1);
                    STBTruetype.stbtt_GetCodepointBox((STBTTFontinfo)sTBTTFontinfo, (int)72, (IntBuffer)object2, (IntBuffer)intBuffer3, (IntBuffer)intBuffer2, (IntBuffer)intBuffer);
                    float f11 = intBuffer.get(0) - intBuffer3.get(0);
                    float f12 = intBuffer5.get(0) - intBuffer6.get(0);
                    float f13 = f11 / f12;
                    float f14 = 0.6f;
                    f10 = (float)this.o * (f14 / f13);
                    try {
                        if (object == null) break block60;
                        if (throwable == null) break block61;
                    }
                    catch (Throwable throwable13) {
                        throw Gx.a(throwable13);
                    }
                    try {
                        object.close();
                    }
                    catch (Throwable throwable14) {
                        throwable.addSuppressed(throwable14);
                    }
                    break block60;
                }
                object.close();
                break block60;
                catch (Throwable throwable15) {
                    try {
                        throwable = throwable15;
                        throw throwable15;
                    }
                    catch (Throwable throwable16) {
                        block62: {
                            block63: {
                                try {
                                    if (object == null) break block62;
                                    if (throwable == null) break block63;
                                }
                                catch (Throwable throwable17) {
                                    throw Gx.a(throwable17);
                                }
                                try {
                                    object.close();
                                }
                                catch (Throwable throwable18) {
                                    throwable.addSuppressed(throwable18);
                                }
                                break block62;
                            }
                            object.close();
                        }
                        throw throwable16;
                    }
                }
            }
            object = BufferUtils.createByteBuffer((int)(n3 * n3));
            throwable = STBTTPackContext.create();
            try {
                if (!STBTruetype.stbtt_PackBegin((STBTTPackContext)throwable, (ByteBuffer)object, (int)n3, (int)n3, (int)0, (int)1)) {
                    SE.x((String)((Object)Gx.b("\u00d3", (int)Gx.a("h", (int)29660, (long)(0x5580D3DDE1A689D9L ^ l10)), (long)2458271098991618255L, (long)l10)));
                    return;
                }
            }
            catch (Throwable throwable19) {
                throw Gx.a(throwable19);
            }
            byte by2 = 2;
            byte by3 = 2;
            STBTruetype.stbtt_PackSetOversampling((STBTTPackContext)throwable, (int)by3, (int)by2);
            try {
                block65: {
                    intBuffer4 = MemoryStack.stackPush();
                    object2 = null;
                    intBuffer3 = intBuffer4.mallocInt(((Object)object4).length);
                    intBuffer3.put((int[])object4);
                    intBuffer3.flip();
                    intBuffer2 = STBTTPackedchar.malloc((int)((Object)object4).length, (MemoryStack)intBuffer4);
                    intBuffer = STBTTPackRange.malloc((int)1, (MemoryStack)intBuffer4);
                    STBTTPackRange sTBTTPackRange = (STBTTPackRange)intBuffer.get(0);
                    sTBTTPackRange.font_size(f10);
                    sTBTTPackRange.first_unicode_codepoint_in_range(0);
                    sTBTTPackRange.array_of_unicode_codepoints(intBuffer3);
                    sTBTTPackRange.num_chars(((Object)object4).length);
                    sTBTTPackRange.chardata_for_range((STBTTPackedchar.Buffer)intBuffer2);
                    sTBTTPackRange.h_oversample(by3);
                    sTBTTPackRange.v_oversample(by2);
                    STBTruetype.stbtt_PackFontRanges((STBTTPackContext)throwable, (ByteBuffer)object3, (int)0, (STBTTPackRange.Buffer)intBuffer);
                    STBTruetype.stbtt_PackEnd((STBTTPackContext)throwable);
                    ((ByteBuffer)object).flip();
                    this.B = STBTruetype.stbtt_ScaleForPixelHeight((STBTTFontinfo)sTBTTFontinfo, (float)f10);
                    for (int i11 = 0; i11 < ((Object)object4).length; ++i11) {
                        Object object5 = object4[i11];
                        STBTTPackedchar sTBTTPackedchar = (STBTTPackedchar)intBuffer2.get(i11);
                        float f15 = 1.0f / (float)n3;
                        float f16 = 1.0f / (float)n3;
                        this.Q.put((int)object5, new zZ(sTBTTPackedchar.xoff(), sTBTTPackedchar.yoff(), sTBTTPackedchar.xoff2(), sTBTTPackedchar.yoff2(), (float)sTBTTPackedchar.x0() * f15, (float)sTBTTPackedchar.y0() * f16, (float)sTBTTPackedchar.x1() * f15, (float)sTBTTPackedchar.y1() * f16, sTBTTPackedchar.xadvance()));
                    }
                    try {
                        if (intBuffer4 == null) break block64;
                        if (object2 == null) break block65;
                    }
                    catch (Throwable throwable20) {
                        throw Gx.a(throwable20);
                    }
                    try {
                        intBuffer4.close();
                    }
                    catch (Throwable throwable21) {
                        ((Throwable)object2).addSuppressed(throwable21);
                    }
                    break block64;
                }
                intBuffer4.close();
                break block64;
                catch (Throwable throwable22) {
                    try {
                        object2 = throwable22;
                        throw throwable22;
                    }
                    catch (Throwable throwable23) {
                        block66: {
                            block67: {
                                try {
                                    if (intBuffer4 == null) break block66;
                                    if (object2 == null) break block67;
                                }
                                catch (Throwable throwable24) {
                                    throw Gx.a(throwable24);
                                }
                                try {
                                    intBuffer4.close();
                                }
                                catch (Throwable throwable25) {
                                    ((Throwable)object2).addSuppressed(throwable25);
                                }
                                break block66;
                            }
                            intBuffer4.close();
                        }
                        throw throwable23;
                    }
                }
            }
            catch (Exception exception) {
                SE.W(exception);
            }
        }
        Fn.S(() -> this.lambda$createFont$2(n3, (ByteBuffer)object, string));
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = Gx.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = Gx.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method d(long l10, long l11) {
        int n2 = Gx.a(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n2];
                int n4 = string2.indexOf(8);
                clazz3 = Gx.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i10 = 0; i10 < n6; ++i10) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = Gx.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Gx.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        Gx.g[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Gx.b(390243855950114L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = Gx.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        Gx.g[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Gx.b(390243855950114L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static boolean lambda$new$1(File file) {
        boolean bl2;
        block8: {
            block7: {
                long l10 = b ^ 0xBF9CAF06A5EL;
                try {
                    block6: {
                        try {
                            try {
                                if (file.isFile() && file.getName().endsWith((String)((Object)Gx.b("\u00d3", (int)Gx.a("h", (int)1376, (long)(0x700ACBB0BB9D8A08L ^ l10)), (long)6302099926721912231L, (long)l10)))) break block6;
                            }
                            catch (O_ o_2) {
                                throw Gx.a(o_2);
                            }
                            if (!file.isDirectory()) break block7;
                        }
                        catch (O_ o_3) {
                            throw Gx.a(o_3);
                        }
                    }
                    bl2 = true;
                    break block8;
                }
                catch (O_ o_4) {
                    throw Gx.a(o_4);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void S(String string, double d2, double d3, int n2) {
        this.p(string, d2, d3, n2, false, false);
    }

    public void I(String string, double d2, double d3, Color color, Color color2, boolean bl2, boolean bl3) {
        block6: {
            int n2;
            block5: {
                n2 = color.getRGB();
                if (color instanceof k2) {
                    n2 = ((k2)color).Y();
                }
                try {
                    try {
                        if (!Ao.P() || bl2) break block5;
                    }
                    catch (O_ o_2) {
                        throw Gx.a(o_2);
                    }
                    this.Y(string, d2 + 0.5, d3 + 0.5, color2.getRGB());
                    this.R(string, d2, d3, color);
                    break block6;
                }
                catch (O_ o_3) {
                    throw Gx.a(o_3);
                }
            }
            this.w(d2, d3, string, n2, true, 1.0f, bl3);
        }
    }

    public void D(String string, double d2, double d3, int n2, boolean bl2, boolean bl3) {
        this.W(string, d2 - this.D(string) / 2.0, d3, n2, bl2, bl3);
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x581C;
        if (e[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Gx", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Gx.e[n3] = n4;
        }
        return e[n3];
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = Gx.a(l10, l11);
            object = g[n2];
            try {
                if (!(object instanceof String)) break block2;
                Gx.g[n2] = clazz = Class.forName(h[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void w(double d2, double d3, String string, int n2, boolean bl2, float f10, boolean bl3) {
        block3: {
            e e10;
            block2: {
                float f11 = (float)EP.l().k(EP.N().p(), false) / 2.0f;
                f10 = (float)this.o / 16.0f;
                float f12 = 1.0f / f11;
                d2 = Math.ceil(d2);
                d3 = Math.ceil(d3);
                d2 /= (double)f10;
                d3 /= (double)f10;
                Dn dn = Dn.i();
                dn.g();
                dn.s(f12, f12, f12);
                dn.s(f10, f10, f10);
                dn.C(z6.D.i().B());
                double d4 = d2;
                double d5 = d3;
                int n3 = n2;
                Supplier<Void> supplier = () -> Gx.lambda$renderMinecraftFont$3(string, d4, d5, n3, bl2, dn);
                e10 = new e(Iy.MINECRAFT, bl3).W(supplier);
                try {
                    if (!bl3) break block2;
                    KP.x().O(e10);
                    break block3;
                }
                catch (O_ o_2) {
                    throw Gx.a(o_2);
                }
            }
            KP.x().p(e10);
        }
    }

    public void k(String string, double d2, double d3, Color color, boolean bl2, boolean bl3) {
        int n2 = color.getRGB();
        if (color instanceof k2) {
            n2 = ((k2)color).Y();
        }
        this.p(string, d2, d3, n2, bl2, bl3);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Gx.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(Gx.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

