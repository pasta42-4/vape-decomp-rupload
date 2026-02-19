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
package com.scientific.modeling;

import a.Fn;
import a.Ne;
import a.tl;
import a.z6;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.flow.DataFlowAnalyzer;
import com.data.obfuscation.NumericScrambler;
import com.data.transformation.DataTransformationEngine1209;
import com.dynamic.instrumentation.RuntimeInstrumentationEngine;
import com.encoding.strategy.EncodingStrategyEnum;
import com.exception.system.CustomSystemException;
import com.graphics.color.ColorCompositionEngine;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.crypto.CryptographicSessionController;
import com.simulation.physics.PhysicsSimulator1815;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.FontRenderingEngine;
import com.ui.rendering.GraphicalRenderingController;
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

public class ComputationalModelCalibrator
extends CryptographicParameterGenerator {
    private static final String[] h;
    private static final Map f;
    private Map<Integer, PhysicsSimulator1815> Q;
    private static final long[] d;
    private static final long b;
    private float B;
    private float n;
    private static final Integer[] e;
    private static final Object[] g;
    private NumericScrambler K;
    private final float T = 1.0f;

    @Override
    public void W(String string, double d2, double d3, Color color) {
        char[] cArray = string.toCharArray();
        int n = cArray.length;
        for (int i = 0; i < n; ++i) {
            Character c = Character.valueOf(cArray[i]);
            this.P(c.toString(), d2, d3, color);
            d3 += this.B(c.toString()) * 0.9;
        }
    }

    @Override
    public void t(String string, double d2, double d3, Color color, boolean bl) {
        this.k(string, d2, d3, color, bl, false);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public double l(String string, boolean bl) {
        block16: {
            float f;
            block17: {
                string = TemporalMetadataResolver.h.e().l().D(string);
                double d2 = TemporalMetadataResolver.h.a().b();
                try {
                    if (this.w != d2) {
                        this.X();
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalModelCalibrator.a(customSystemException);
                }
                this.w = d2;
                String string2 = "";
                char[] cArray = string.toCharArray();
                for (int i = 0; i < cArray.length; ++i) {
                    char c = cArray[i];
                    try {
                        if (c == '\u00a7') {
                            ++i;
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComputationalModelCalibrator.a(customSystemException);
                    }
                    string2 = string2 + c;
                }
                string = string2;
                f = 0.6f;
                if (d2 != 1.0) {
                    f *= (float)(1.0 / d2);
                }
                try {
                    try {
                        try {
                            if (!GraphicalRenderingController.P() || bl) break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ComputationalModelCalibrator.a(customSystemException);
                        }
                        if (!this.m.containsKey(string)) break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComputationalModelCalibrator.a(customSystemException);
                    }
                    return (Double)this.m.get(string);
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalModelCalibrator.a(customSystemException);
                }
            }
            double d3 = 0.0;
            for (int i = 0; i < string.length(); ++i) {
                char c = string.charAt(i);
                PhysicsSimulator1815 physicsSimulator1815 = this.Q.get(c);
                if (physicsSimulator1815 == null) {
                    physicsSimulator1815 = this.Q.get(32);
                }
                d3 += (double)(physicsSimulator1815.x * f);
            }
            this.m.put(string, d3);
            return d3;
        }
        return (int)((float)ApplicationLifecycleManager.X().L(string) * ((float)this.o / 16.0f));
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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
        boolean bl;
        block8: {
            block7: {
                long l = b ^ 0x1F53177B8DCBL;
                try {
                    block6: {
                        try {
                            try {
                                if (file.isFile() && file.getName().endsWith((String)((Object)ComputationalModelCalibrator.b("\u00d3", (int)ComputationalModelCalibrator.a("h", (int)11087, (long)(0x7B5EBD4BBEEA43BCL ^ l)), (long)-5701386890464347598L, (long)l)))) break block6;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ComputationalModelCalibrator.a(customSystemException);
                            }
                            if (!file.isDirectory()) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ComputationalModelCalibrator.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalModelCalibrator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ComputationalModelCalibrator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ComputationalModelCalibrator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public double g(String string, boolean bl) {
        block3: {
            try {
                if (!GraphicalRenderingController.P() || bl) break block3;
            }
            catch (CustomSystemException customSystemException) {
                throw ComputationalModelCalibrator.a(customSystemException);
            }
            float f = 0.6f;
            float f2 = (float)TemporalMetadataResolver.h.a().b();
            if ((double)f2 != 1.0) {
                f *= 1.0f / f2;
            }
            return (float)this.o * f;
        }
        return 8.0f * ((float)this.o / 16.0f);
    }

    @Override
    public void D(String string, double d2, double d3, Color color, Color color2, boolean bl) {
        this.I(string, d2, d3, color, color2, bl, false);
    }

    private void lambda$createFont$2(int n, ByteBuffer byteBuffer, String string) {
        long l = b ^ 0x456C372608DEL;
        this.K = NumericScrambler.F(n, n, byteBuffer, 6403, 9729, 10497);
        TemporalMetadataResolver.x((String)((Object)ComputationalModelCalibrator.b("\u00d3", (int)ComputationalModelCalibrator.a("h", (int)28, (long)(0x6263779D8C92EDFBL ^ l)), (long)3888225971849936679L, (long)l)) + string + (String)((Object)ComputationalModelCalibrator.b("\u00d3", (int)ComputationalModelCalibrator.a("h", (int)11803, (long)(0x2E900A2E4121C3F5L ^ l)), (long)3888225971849936679L, (long)l)) + this.o + (String)((Object)ComputationalModelCalibrator.b("\u00d3", (int)ComputationalModelCalibrator.a("h", (int)11203, (long)(0xDF6A54D57A1463AL ^ l)), (long)3888225971849936679L, (long)l)));
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c3' || c == '\u00fe' || c == '\u00fd' || c == 'v') {
                field = ComputationalModelCalibrator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ComputationalModelCalibrator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'P' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (h[n4] != null) {
            return n4;
        }
        Object object = g[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 24;
                break;
            }
            case 1: {
                n3 = 6;
                break;
            }
            case 2: {
                n3 = 25;
                break;
            }
            case 3: {
                n3 = 0;
                break;
            }
            case 4: {
                n3 = 52;
                break;
            }
            case 5: {
                n3 = 38;
                break;
            }
            case 6: {
                n3 = 57;
                break;
            }
            case 7: {
                n3 = 14;
                break;
            }
            case 8: {
                n3 = 63;
                break;
            }
            case 9: {
                n3 = 49;
                break;
            }
            case 10: {
                n3 = 56;
                break;
            }
            case 11: {
                n3 = 18;
                break;
            }
            case 12: {
                n3 = 22;
                break;
            }
            case 13: {
                n3 = 20;
                break;
            }
            case 14: {
                n3 = 3;
                break;
            }
            case 15: {
                n3 = 35;
                break;
            }
            case 16: {
                n3 = 58;
                break;
            }
            case 17: {
                n3 = 11;
                break;
            }
            case 18: {
                n3 = 23;
                break;
            }
            case 19: {
                n3 = 4;
                break;
            }
            case 20: {
                n3 = 17;
                break;
            }
            case 21: {
                n3 = 7;
                break;
            }
            case 22: {
                n3 = 31;
                break;
            }
            case 23: {
                n3 = 16;
                break;
            }
            case 24: {
                n3 = 51;
                break;
            }
            case 25: {
                n3 = 2;
                break;
            }
            case 26: {
                n3 = 15;
                break;
            }
            case 27: {
                n3 = 28;
                break;
            }
            case 28: {
                n3 = 47;
                break;
            }
            case 29: {
                n3 = 43;
                break;
            }
            case 30: {
                n3 = 36;
                break;
            }
            case 31: {
                n3 = 62;
                break;
            }
            case 32: {
                n3 = 19;
                break;
            }
            case 33: {
                n3 = 41;
                break;
            }
            case 34: {
                n3 = 59;
                break;
            }
            case 35: {
                n3 = 48;
                break;
            }
            case 36: {
                n3 = 26;
                break;
            }
            case 37: {
                n3 = 50;
                break;
            }
            case 38: {
                n3 = 13;
                break;
            }
            case 39: {
                n3 = 9;
                break;
            }
            case 40: {
                n3 = 34;
                break;
            }
            case 41: {
                n3 = 1;
                break;
            }
            case 42: {
                n3 = 45;
                break;
            }
            case 43: {
                n3 = 8;
                break;
            }
            case 44: {
                n3 = 27;
                break;
            }
            case 45: {
                n3 = 61;
                break;
            }
            case 46: {
                n3 = 12;
                break;
            }
            case 47: {
                n3 = 55;
                break;
            }
            case 48: {
                n3 = 40;
                break;
            }
            case 49: {
                n3 = 21;
                break;
            }
            case 50: {
                n3 = 33;
                break;
            }
            case 51: {
                n3 = 46;
                break;
            }
            case 52: {
                n3 = 44;
                break;
            }
            case 53: {
                n3 = 54;
                break;
            }
            case 54: {
                n3 = 37;
                break;
            }
            case 55: {
                n3 = 42;
                break;
            }
            case 56: {
                n3 = 39;
                break;
            }
            case 57: {
                n3 = 29;
                break;
            }
            case 58: {
                n3 = 5;
                break;
            }
            case 59: {
                n3 = 60;
                break;
            }
            case 60: {
                n3 = 32;
                break;
            }
            case 61: {
                n3 = 30;
                break;
            }
            case 62: {
                n3 = 10;
                break;
            }
            default: {
                n3 = 53;
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
        ComputationalModelCalibrator.h[n4] = new String(cArray);
        return n4;
    }

    public ComputationalModelCalibrator(byte[] byArray, int n, String string) {
        this.Q = new HashMap<Integer, PhysicsSimulator1815>();
        this.T = 1.0f;
        this.w(byArray, n, string);
    }

    public void W(String string, double d2, double d3, int n, boolean bl, boolean bl2) {
        block29: {
            block24: {
                long l;
                block26: {
                    l = b ^ 0x5579218449B3L;
                    if (this.N) {
                        string = TemporalMetadataResolver.h.e().l().D(string);
                    }
                    try {
                        block25: {
                            try {
                                try {
                                    try {
                                        if (!GraphicalRenderingController.P() || bl) break block24;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ComputationalModelCalibrator.a(customSystemException);
                                    }
                                    if (string == null) break block25;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ComputationalModelCalibrator.a(customSystemException);
                                }
                                if (string.length() != 0) break block26;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ComputationalModelCalibrator.a(customSystemException);
                            }
                        }
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComputationalModelCalibrator.a(customSystemException);
                    }
                }
                int n2 = (n & ComputationalModelCalibrator.a("h", (int)7053, (long)(0x438F491F9DAEB71AL ^ l))) >> 16;
                int n3 = (n & ComputationalModelCalibrator.a("h", (int)5110, (long)(0x7A968D7847FF3F70L ^ l))) >> 8;
                int n4 = n & 0xFF;
                int n5 = (n & ComputationalModelCalibrator.a("h", (int)24264, (long)(0x39200037FE8A724CL ^ l))) >> 24;
                try {
                    if (n5 < 0) {
                        n5 += 256;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalModelCalibrator.a(customSystemException);
                }
                if (n5 == 0) {
                    n5 = 255;
                }
                Color color = new Color(n2, n3, n4, n5);
                char[] cArray = new char[string.length()];
                Arrays.fill(cArray, '\u0000');
                int n6 = 0;
                String string2 = "";
                char[] cArray2 = string.toCharArray();
                for (int i = 0; i < cArray2.length; ++i) {
                    char c = cArray2[i];
                    try {
                        if (c == '\u00a7') {
                            cArray[n6] = cArray2[++i];
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComputationalModelCalibrator.a(customSystemException);
                    }
                    string2 = string2 + c;
                    ++n6;
                }
                string = string2;
                float f = 0.6f;
                float f2 = (float)TemporalMetadataResolver.h.a().b();
                if ((double)f2 != 1.0) {
                    f *= 1.0f / f2;
                }
                d3 += (double)(this.n * this.B * f);
                Color color2 = color;
                for (int i = 0; i < string.length(); ++i) {
                    PhysicsSimulator1815 physicsSimulator1815;
                    block28: {
                        block27: {
                            char c;
                            char c2 = string.charAt(i);
                            physicsSimulator1815 = this.Q.get(c2);
                            if (physicsSimulator1815 == null) {
                                physicsSimulator1815 = this.Q.get(32);
                            }
                            if ((c = cArray[i]) != '\u0000') {
                                float[] fArray = new float[3];
                                this.Y(c, fArray);
                                color2 = new Color(fArray[0], fArray[1], fArray[2]);
                                if (c == 'r') {
                                    color2 = color;
                                }
                            }
                            try {
                                if (!bl2) break block27;
                                DataFlowAnalyzer.r((float)d2, (float)d3, physicsSimulator1815, this.K, color2, f);
                                break block28;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ComputationalModelCalibrator.a(customSystemException);
                            }
                        }
                        z6.g((float)d2, (float)d3, physicsSimulator1815, this.K, color2, f);
                    }
                    d2 += (double)(physicsSimulator1815.x * f);
                }
                break block29;
            }
            this.w(d2, d3, string, n, false, 1.0f, bl2);
        }
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "\u001a\u001fs";
        objectArray[1] = Integer.TYPE;
        ComputationalModelCalibrator.h[1] = "java/lang/Integer";
        objectArray[2] = "uc{=Hw~ljr5omkc;";
        objectArray[3] = "BT\r\u0002";
        objectArray[4] = "Fw";
        objectArray[5] = "@yV\u0011!\u0003KvG^@\r@}C\u0004";
        objectArray[6] = "\t?q\bARY\"+E3e3` \u001fK\u0003\u000ee{\u0016B;\bd`\u0017R\\J+jJ3";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "q0f^EK!swc\u0017AOu1\nAQw\"9\u001b\u0019:uvc\u001bD\u0007p-j\u0012|";
    }

    public ComputationalModelCalibrator(String string, int n) {
        Object[] objectArray;
        long l = b ^ 0x14C6EBB5671DL;
        this.Q = new HashMap<Integer, PhysicsSimulator1815>();
        this.T = 1.0f;
        if (FontRenderingEngine.h.size() == 0) {
            File[] fileArray;
            objectArray = new File(System.getProperty((String)((Object)ComputationalModelCalibrator.b("\u00d3", (int)ComputationalModelCalibrator.a("h", (int)14346, (long)(0x2EBC251B1FC3BA29L ^ l)), (long)6500542822360502500L, (long)l))) + (String)((Object)ComputationalModelCalibrator.b("\u00d3", (int)ComputationalModelCalibrator.a("h", (int)3661, (long)(0xDC3AEDCB6940C64L ^ l)), (long)6500542822360502500L, (long)l))).listFiles(ComputationalModelCalibrator::lambda$new$0);
            if (objectArray != null) {
                fileArray = (File[])objectArray;
                int n2 = fileArray.length;
                for (int i = 0; i < n2; ++i) {
                    Object object = fileArray[i];
                    try {
                        if (!((File)object).exists()) continue;
                        FontRenderingEngine.h.add(((File)object).getAbsolutePath());
                        continue;
                    }
                    catch (Exception exception) {
                        throw ComputationalModelCalibrator.a(exception);
                    }
                }
            }
            if ((fileArray = new File(System.getenv((String)((Object)ComputationalModelCalibrator.b("\u00d3", (int)ComputationalModelCalibrator.a("h", (int)3711, (long)(0x71BC865F39E40C58L ^ l)), (long)6500542822360502500L, (long)l))) + (String)((Object)ComputationalModelCalibrator.b("\u00d3", (int)ComputationalModelCalibrator.a("h", (int)25616, (long)(0x531A20162DEDE632L ^ l)), (long)6500542822360502500L, (long)l))).listFiles(ComputationalModelCalibrator::lambda$new$1)) != null) {
                for (File file : fileArray) {
                    try {
                        if (!file.exists()) continue;
                        FontRenderingEngine.h.add(file.getAbsolutePath());
                    }
                    catch (Exception exception) {
                        throw ComputationalModelCalibrator.a(exception);
                    }
                }
            }
        }
        objectArray = new byte[]{};
        for (String string2 : FontRenderingEngine.h) {
            try {
                if (!string2.contains(string)) {
                    continue;
                }
            }
            catch (Exception exception) {
                throw ComputationalModelCalibrator.a(exception);
            }
            try {
                TemporalMetadataResolver.x((String)((Object)ComputationalModelCalibrator.b("\u00d3", (int)ComputationalModelCalibrator.a("h", (int)4444, (long)(0x7DBE6B02D27C137DL ^ l)), (long)6500542822360502500L, (long)l)) + string);
                File file = new File(string2);
                FileInputStream fileInputStream = new FileInputStream(file);
                objectArray = new byte[(int)file.length()];
                fileInputStream.read((byte[])objectArray);
                fileInputStream.close();
                break;
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
                break;
            }
        }
        this.w((byte[])objectArray, n, string);
    }

    public void p(String string, double d2, double d3, int n, boolean bl, boolean bl2) {
        block5: {
            block4: {
                long l = b ^ 0x6A9B09CB3F16L;
                try {
                    try {
                        if (!GraphicalRenderingController.P() || bl) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComputationalModelCalibrator.a(customSystemException);
                    }
                    this.Y(string, d2 + 0.5, d3 + 0.5, (int)ComputationalModelCalibrator.a("h", (int)7634, (long)(0x74126BE63D5047E2L ^ l)));
                    this.P(string, d2, d3, n);
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalModelCalibrator.a(customSystemException);
                }
            }
            this.w(d2, d3, string, n, true, 1.0f, bl2);
        }
    }

    private static Void lambda$renderMinecraftFont$3(String string, double d2, double d3, int n, boolean bl, DataTransformationEngine1209 dataTransformationEngine1209) {
        boolean bl2 = Ne.h.k(3042);
        boolean bl3 = Ne.h.k(3553);
        boolean bl4 = Ne.h.k(2896);
        boolean bl5 = Ne.h.k(3008);
        try {
            if (!bl2) {
                tl.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalModelCalibrator.a(customSystemException);
        }
        try {
            if (!bl3) {
                tl.B();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalModelCalibrator.a(customSystemException);
        }
        try {
            if (bl4) {
                tl.P();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalModelCalibrator.a(customSystemException);
        }
        try {
            if (!bl5) {
                tl.s();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalModelCalibrator.a(customSystemException);
        }
        try {
            Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
            ApplicationLifecycleManager.X().N(string, (float)d2, (float)d3, n, bl, dataTransformationEngine1209);
            Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
            if (!bl5) {
                tl.Z();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalModelCalibrator.a(customSystemException);
        }
        try {
            if (bl4) {
                tl.T();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalModelCalibrator.a(customSystemException);
        }
        try {
            if (!bl2) {
                tl.j();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalModelCalibrator.a(customSystemException);
        }
        try {
            if (!bl3) {
                tl.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalModelCalibrator.a(customSystemException);
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ComputationalModelCalibrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public void c(String string, double d2, double d3, int n, boolean bl) {
        this.W(string, d2, d3, n, bl, false);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ComputationalModelCalibrator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(long l, long l2) {
        int n = ComputationalModelCalibrator.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = ComputationalModelCalibrator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ComputationalModelCalibrator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ComputationalModelCalibrator.a(clazz3, string2, clazz2)) != null) {
                    ComputationalModelCalibrator.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ComputationalModelCalibrator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ComputationalModelCalibrator.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ComputationalModelCalibrator.b(390243855950114L, 0L);
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
                ComputationalModelCalibrator.b = MultiContainerRegistry.a(-3394363570645361173L, -2636035791125784770L, MethodHandles.lookup().lookupClass()).a(167407756130572L);
                ComputationalModelCalibrator.g = new Object[8];
                ComputationalModelCalibrator.h = new String[8];
                ComputationalModelCalibrator.a();
                ComputationalModelCalibrator.f = new HashMap<K, V>(13);
                var0 = ComputationalModelCalibrator.b ^ 94957798617898L;
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
        ComputationalModelCalibrator.d = var8_3;
        ComputationalModelCalibrator.e = new Integer[20];
    }

    /*
     * Loose catch block
     */
    private void w(byte[] byArray, int n, String string) {
        Object object;
        int n2;
        block64: {
            float f;
            IntBuffer intBuffer;
            IntBuffer intBuffer2;
            IntBuffer intBuffer3;
            Object object2;
            IntBuffer intBuffer4;
            Throwable throwable;
            STBTTFontinfo sTBTTFontinfo;
            Object object3;
            Object object4;
            long l;
            block60: {
                block61: {
                    HashSet<Integer> hashSet;
                    block56: {
                        l = b ^ 0xD0DC4B71F36L;
                        try {
                            TemporalMetadataResolver.x((String)((Object)ComputationalModelCalibrator.b("\u00d3", (int)ComputationalModelCalibrator.a("h", (int)30786, (long)(0x4D05ABA21CA0249L ^ l)), (long)2458271098991618255L, (long)l)) + string + (String)((Object)ComputationalModelCalibrator.b("\u00d3", (int)ComputationalModelCalibrator.a("h", (int)9782, (long)(0x5116F6BFB77C5C32L ^ l)), (long)2458271098991618255L, (long)l)) + n);
                            if (string.contains((CharSequence)((Object)ComputationalModelCalibrator.b("\u00d3", (int)ComputationalModelCalibrator.a("h", (int)32379, (long)(0x157DD27405018468L ^ l)), (long)2458271098991618255L, (long)l)))) {
                                --n;
                            }
                        }
                        catch (Throwable throwable2) {
                            throw ComputationalModelCalibrator.a(throwable2);
                        }
                        hashSet = new HashSet<Integer>();
                        try {
                            for (int i = 32; i <= 126; ++i) {
                                hashSet.add(i);
                            }
                        }
                        catch (Throwable throwable3) {
                            throw ComputationalModelCalibrator.a(throwable3);
                        }
                        hashSet.add(0);
                        CallSite callSite = ComputationalModelCalibrator.b("\u00d3", (Object)ComputationalModelCalibrator.b("\u00d3", (int)ComputationalModelCalibrator.a("h", (int)15283, (long)(0x41E44BA7634541BEL ^ l)), (long)2458271098991618255L, (long)l), (long)2458368513459735753L, (long)l);
                        if (callSite == null) break block56;
                        try {
                            Throwable throwable4;
                            block57: {
                                object4 = new ByteArrayInputStream((byte[])callSite);
                                object3 = new BufferedReader(new InputStreamReader((InputStream)object4, StandardCharsets.UTF_8));
                                throwable4 = null;
                                while (true) {
                                    int n3 = ((BufferedReader)object3).read();
                                    try {
                                        if (n3 == -1) break;
                                        if (n3 < 32) continue;
                                    }
                                    catch (Throwable throwable5) {
                                        throw ComputationalModelCalibrator.a(throwable5);
                                    }
                                    hashSet.add(n3);
                                }
                                try {
                                    if (object3 == null) break block56;
                                    if (throwable4 == null) break block57;
                                }
                                catch (Throwable throwable6) {
                                    throw ComputationalModelCalibrator.a(throwable6);
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
                                                throw ComputationalModelCalibrator.a(throwable10);
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
                            TemporalMetadataResolver.W(exception);
                        }
                    }
                    object4 = hashSet.stream().mapToInt(Integer::intValue).toArray();
                    Arrays.sort((int[])object4);
                    this.o = n;
                    object3 = BufferUtils.createByteBuffer((int)byArray.length).put(byArray);
                    ((ByteBuffer)object3).flip();
                    n2 = 4096;
                    sTBTTFontinfo = STBTTFontinfo.create();
                    try {
                        if (!STBTruetype.stbtt_InitFont((STBTTFontinfo)sTBTTFontinfo, (ByteBuffer)object3)) {
                            TemporalMetadataResolver.x((String)((Object)ComputationalModelCalibrator.b("\u00d3", (int)ComputationalModelCalibrator.a("h", (int)27163, (long)(0x201DC1FB0923101CL ^ l)), (long)2458271098991618255L, (long)l)));
                            return;
                        }
                    }
                    catch (Throwable throwable12) {
                        throw ComputationalModelCalibrator.a(throwable12);
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
                    float f2 = intBuffer.get(0) - intBuffer3.get(0);
                    float f3 = intBuffer5.get(0) - intBuffer6.get(0);
                    float f4 = f2 / f3;
                    float f5 = 0.6f;
                    f = (float)this.o * (f5 / f4);
                    try {
                        if (object == null) break block60;
                        if (throwable == null) break block61;
                    }
                    catch (Throwable throwable13) {
                        throw ComputationalModelCalibrator.a(throwable13);
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
                                    throw ComputationalModelCalibrator.a(throwable17);
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
            object = BufferUtils.createByteBuffer((int)(n2 * n2));
            throwable = STBTTPackContext.create();
            try {
                if (!STBTruetype.stbtt_PackBegin((STBTTPackContext)throwable, (ByteBuffer)object, (int)n2, (int)n2, (int)0, (int)1)) {
                    TemporalMetadataResolver.x((String)((Object)ComputationalModelCalibrator.b("\u00d3", (int)ComputationalModelCalibrator.a("h", (int)29660, (long)(0x5580D3DDE1A689D9L ^ l)), (long)2458271098991618255L, (long)l)));
                    return;
                }
            }
            catch (Throwable throwable19) {
                throw ComputationalModelCalibrator.a(throwable19);
            }
            byte by = 2;
            byte by2 = 2;
            STBTruetype.stbtt_PackSetOversampling((STBTTPackContext)throwable, (int)by2, (int)by);
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
                    sTBTTPackRange.font_size(f);
                    sTBTTPackRange.first_unicode_codepoint_in_range(0);
                    sTBTTPackRange.array_of_unicode_codepoints(intBuffer3);
                    sTBTTPackRange.num_chars(((Object)object4).length);
                    sTBTTPackRange.chardata_for_range((STBTTPackedchar.Buffer)intBuffer2);
                    sTBTTPackRange.h_oversample(by2);
                    sTBTTPackRange.v_oversample(by);
                    STBTruetype.stbtt_PackFontRanges((STBTTPackContext)throwable, (ByteBuffer)object3, (int)0, (STBTTPackRange.Buffer)intBuffer);
                    STBTruetype.stbtt_PackEnd((STBTTPackContext)throwable);
                    ((ByteBuffer)object).flip();
                    this.B = STBTruetype.stbtt_ScaleForPixelHeight((STBTTFontinfo)sTBTTFontinfo, (float)f);
                    for (int i = 0; i < ((Object)object4).length; ++i) {
                        Object object5 = object4[i];
                        STBTTPackedchar sTBTTPackedchar = (STBTTPackedchar)intBuffer2.get(i);
                        float f6 = 1.0f / (float)n2;
                        float f7 = 1.0f / (float)n2;
                        this.Q.put((int)object5, new PhysicsSimulator1815(sTBTTPackedchar.xoff(), sTBTTPackedchar.yoff(), sTBTTPackedchar.xoff2(), sTBTTPackedchar.yoff2(), (float)sTBTTPackedchar.x0() * f6, (float)sTBTTPackedchar.y0() * f7, (float)sTBTTPackedchar.x1() * f6, (float)sTBTTPackedchar.y1() * f7, sTBTTPackedchar.xadvance()));
                    }
                    try {
                        if (intBuffer4 == null) break block64;
                        if (object2 == null) break block65;
                    }
                    catch (Throwable throwable20) {
                        throw ComputationalModelCalibrator.a(throwable20);
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
                                    throw ComputationalModelCalibrator.a(throwable24);
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
                TemporalMetadataResolver.W(exception);
            }
        }
        Fn.S(() -> this.lambda$createFont$2(n2, (ByteBuffer)object, string));
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ComputationalModelCalibrator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ComputationalModelCalibrator.b(classArray2[i], string, clazz2, n, classArray);
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

    private static Method d(long l, long l2) {
        int n = ComputationalModelCalibrator.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = ComputationalModelCalibrator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ComputationalModelCalibrator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ComputationalModelCalibrator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ComputationalModelCalibrator.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ComputationalModelCalibrator.b(390243855950114L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ComputationalModelCalibrator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ComputationalModelCalibrator.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ComputationalModelCalibrator.b(390243855950114L, 0L);
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

    private static boolean lambda$new$1(File file) {
        boolean bl;
        block8: {
            block7: {
                long l = b ^ 0xBF9CAF06A5EL;
                try {
                    block6: {
                        try {
                            try {
                                if (file.isFile() && file.getName().endsWith((String)((Object)ComputationalModelCalibrator.b("\u00d3", (int)ComputationalModelCalibrator.a("h", (int)1376, (long)(0x700ACBB0BB9D8A08L ^ l)), (long)6302099926721912231L, (long)l)))) break block6;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ComputationalModelCalibrator.a(customSystemException);
                            }
                            if (!file.isDirectory()) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ComputationalModelCalibrator.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalModelCalibrator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void S(String string, double d2, double d3, int n) {
        this.p(string, d2, d3, n, false, false);
    }

    public void I(String string, double d2, double d3, Color color, Color color2, boolean bl, boolean bl2) {
        block6: {
            int n;
            block5: {
                n = color.getRGB();
                if (color instanceof ColorCompositionEngine) {
                    n = ((ColorCompositionEngine)color).Y();
                }
                try {
                    try {
                        if (!GraphicalRenderingController.P() || bl) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComputationalModelCalibrator.a(customSystemException);
                    }
                    this.Y(string, d2 + 0.5, d3 + 0.5, color2.getRGB());
                    this.R(string, d2, d3, color);
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalModelCalibrator.a(customSystemException);
                }
            }
            this.w(d2, d3, string, n, true, 1.0f, bl2);
        }
    }

    public void D(String string, double d2, double d3, int n, boolean bl, boolean bl2) {
        this.W(string, d2 - this.D(string) / 2.0, d3, n, bl, bl2);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x581C;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
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
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ComputationalModelCalibrator.e[n2] = n3;
        }
        return e[n2];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ComputationalModelCalibrator.a(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                ComputationalModelCalibrator.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void w(double d2, double d3, String string, int n, boolean bl, float f, boolean bl2) {
        block3: {
            RuntimeInstrumentationEngine runtimeInstrumentationEngine;
            block2: {
                float f2 = (float)ApplicationLifecycleManager.l().k(ApplicationLifecycleManager.N().p(), false) / 2.0f;
                f = (float)this.o / 16.0f;
                float f3 = 1.0f / f2;
                d2 = Math.ceil(d2);
                d3 = Math.ceil(d3);
                d2 /= (double)f;
                d3 /= (double)f;
                DataTransformationEngine1209 dataTransformationEngine1209 = DataTransformationEngine1209.i();
                dataTransformationEngine1209.g();
                dataTransformationEngine1209.s(f3, f3, f3);
                dataTransformationEngine1209.s(f, f, f);
                dataTransformationEngine1209.C(z6.D.i().B());
                double d4 = d2;
                double d5 = d3;
                int n2 = n;
                Supplier<Void> supplier = () -> ComputationalModelCalibrator.lambda$renderMinecraftFont$3(string, d4, d5, n2, bl, dataTransformationEngine1209);
                runtimeInstrumentationEngine = new RuntimeInstrumentationEngine(EncodingStrategyEnum.MINECRAFT, bl2).W(supplier);
                try {
                    if (!bl2) break block2;
                    CryptographicSessionController.x().O(runtimeInstrumentationEngine);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalModelCalibrator.a(customSystemException);
                }
            }
            CryptographicSessionController.x().p(runtimeInstrumentationEngine);
        }
    }

    public void k(String string, double d2, double d3, Color color, boolean bl, boolean bl2) {
        int n = color.getRGB();
        if (color instanceof ColorCompositionEngine) {
            n = ((ColorCompositionEngine)color).Y();
        }
        this.p(string, d2, d3, n, bl, bl2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ComputationalModelCalibrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ComputationalModelCalibrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

