/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.system.config;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class ComputationalParameterConfigurator {
    private static boolean G;
    private static int m;
    private static int o;
    private static int Z;
    private static boolean j;
    private static final Integer[] c;
    private static int I;
    private static final long[] b;
    private static final long a;
    private static int g;
    private static int w;
    private static int L;
    private static int K;
    private static boolean T;
    private static int Y;
    private static boolean W;
    private static int t;
    private static int e;
    private static final Map d;
    private static int f;

    public static void i() {
    }

    public static void P() {
        long l = a ^ 0x3F2E288FF790L;
        T = GL11.glGetBoolean((int)3328);
        j = GL11.glGetBoolean((int)3329);
        f = GL11.glGetInteger((int)3330);
        e = GL11.glGetInteger((int)ComputationalParameterConfigurator.a("m", (int)28874, (long)(0x192EA026157C907DL ^ l)));
        g = GL11.glGetInteger((int)3331);
        m = GL11.glGetInteger((int)3332);
        K = GL11.glGetInteger((int)ComputationalParameterConfigurator.a("m", (int)1001, (long)(0x4BAF1AC0AFB0E353L ^ l)));
        Z = GL11.glGetInteger((int)3333);
        G = GL11.glGetBoolean((int)3312);
        W = GL11.glGetBoolean((int)3313);
        w = GL11.glGetInteger((int)3314);
        t = GL11.glGetInteger((int)ComputationalParameterConfigurator.a("m", (int)2671, (long)(0x3F6409F7201EADBL ^ l)));
        L = GL11.glGetInteger((int)3315);
        o = GL11.glGetInteger((int)3316);
        I = GL11.glGetInteger((int)ComputationalParameterConfigurator.a("m", (int)20266, (long)(0x59C265543690AF99L ^ l)));
        Y = GL11.glGetInteger((int)3317);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Yf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void m() {
        long l = a ^ 0x5D1131DFEF05L;
        GL11.glPixelStorei((int)3328, (int)0);
        GL11.glPixelStorei((int)3329, (int)0);
        GL11.glPixelStorei((int)3330, (int)0);
        GL11.glPixelStorei((int)ComputationalParameterConfigurator.a("m", (int)28874, (long)(0x192EC2190C2C88E8L ^ l)), (int)0);
        GL11.glPixelStorei((int)3331, (int)0);
        GL11.glPixelStorei((int)3332, (int)0);
        GL11.glPixelStorei((int)ComputationalParameterConfigurator.a("m", (int)1001, (long)(0x4BAF78FFB6E0FBC6L ^ l)), (int)0);
        GL11.glPixelStorei((int)3333, (int)4);
        GL11.glPixelStorei((int)3312, (int)0);
        GL11.glPixelStorei((int)3313, (int)0);
        GL11.glPixelStorei((int)3314, (int)0);
        GL11.glPixelStorei((int)ComputationalParameterConfigurator.a("m", (int)2671, (long)(0x3F622A06B51F24EL ^ l)), (int)0);
        GL11.glPixelStorei((int)3315, (int)0);
        GL11.glPixelStorei((int)3316, (int)0);
        GL11.glPixelStorei((int)ComputationalParameterConfigurator.a("m", (int)20266, (long)(0x59C2076B2FC0B70CL ^ l)), (int)0);
        GL11.glPixelStorei((int)3317, (int)4);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ComputationalParameterConfigurator.a = MultiContainerRegistry.a(-2856257928485890392L, -7615539849790795213L, MethodHandles.lookup().lookupClass()).a(276554288300862L);
                var11 = ComputationalParameterConfigurator.a ^ 93953328665161L;
                ComputationalParameterConfigurator.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[10];
                var3_4 = 0;
                var4_5 = "q\u00bb\u00ba\u0098ZA\u00fc^\b\u00b9\u00d3/\u00f4\u0012y\u0012U\u00e4\u0084%\u0099\u00dcW\u00a5\u00184\u00d5b\u00e9\u0005\u0093\u00f6\u0014\u00c3\u00a6i_\u0097s\u0096\u00bb\u0007J6\u0080\u00cd\u00ad\u0087*lR\u00ba\u0092\u00fa$\u00f1\u00c2\u00e2\u00e4q\u00bf\u00e6\u0017\u00bf";
                var5_6 = "q\u00bb\u00ba\u0098ZA\u00fc^\b\u00b9\u00d3/\u00f4\u0012y\u0012U\u00e4\u0084%\u0099\u00dcW\u00a5\u00184\u00d5b\u00e9\u0005\u0093\u00f6\u0014\u00c3\u00a6i_\u0097s\u0096\u00bb\u0007J6\u0080\u00cd\u00ad\u0087*lR\u00ba\u0092\u00fa$\u00f1\u00c2\u00e2\u00e4q\u00bf\u00e6\u0017\u00bf".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "\u008f0G\u00ed;\"\u009fY\u00ab\u00bb\u001d\u0019\u001b\u0089\u0001|";
                    var5_6 = "\u008f0G\u00ed;\"\u009fY\u00ab\u00bb\u001d\u0019\u001b\u0089\u0001|".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        ComputationalParameterConfigurator.b = var6_3;
        ComputationalParameterConfigurator.c = new Integer[10];
        ComputationalParameterConfigurator.T = false;
        ComputationalParameterConfigurator.j = false;
        ComputationalParameterConfigurator.f = 0;
        ComputationalParameterConfigurator.e = 0;
        ComputationalParameterConfigurator.g = 0;
        ComputationalParameterConfigurator.m = 0;
        ComputationalParameterConfigurator.K = 0;
        ComputationalParameterConfigurator.Z = (int)ComputationalParameterConfigurator.a("m", (int)25570, (long)(3570428643315754638L ^ var11));
        ComputationalParameterConfigurator.G = false;
        ComputationalParameterConfigurator.W = false;
        ComputationalParameterConfigurator.w = 0;
        ComputationalParameterConfigurator.t = 0;
        ComputationalParameterConfigurator.L = 0;
        ComputationalParameterConfigurator.o = 0;
        ComputationalParameterConfigurator.I = 0;
        ComputationalParameterConfigurator.Y = (int)ComputationalParameterConfigurator.a("m", (int)7162, (long)(5427150006131416722L ^ var11));
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1C0F;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Yf", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ComputationalParameterConfigurator.c[n2] = n3;
        }
        return c[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void V() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        long l = a ^ 0x2EDA1ABB9424L;
        try {
            n8 = 3328;
            n7 = T ? 1 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalParameterConfigurator.a(customSystemException);
        }
        try {
            GL11.glPixelStorei((int)n8, (int)n7);
            n6 = 3329;
            n5 = j ? 1 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalParameterConfigurator.a(customSystemException);
        }
        try {
            GL11.glPixelStorei((int)n6, (int)n5);
            GL11.glPixelStorei((int)3330, (int)f);
            GL11.glPixelStorei((int)ComputationalParameterConfigurator.a("m", (int)6301, (long)(0x4D948C84C27F1B9FL ^ l)), (int)e);
            GL11.glPixelStorei((int)3331, (int)g);
            GL11.glPixelStorei((int)3332, (int)m);
            GL11.glPixelStorei((int)ComputationalParameterConfigurator.a("m", (int)19342, (long)(0x6C1BFED05EFB4888L ^ l)), (int)K);
            GL11.glPixelStorei((int)3333, (int)Z);
            n4 = 3312;
            n3 = G ? 1 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalParameterConfigurator.a(customSystemException);
        }
        try {
            GL11.glPixelStorei((int)n4, (int)n3);
            n2 = 3313;
            n = W ? 1 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw ComputationalParameterConfigurator.a(customSystemException);
        }
        GL11.glPixelStorei((int)n2, (int)n);
        GL11.glPixelStorei((int)3314, (int)w);
        GL11.glPixelStorei((int)ComputationalParameterConfigurator.a("m", (int)5819, (long)(0x469967B2D39F95BFL ^ l)), (int)t);
        GL11.glPixelStorei((int)3315, (int)L);
        GL11.glPixelStorei((int)3316, (int)o);
        GL11.glPixelStorei((int)ComputationalParameterConfigurator.a("m", (int)28997, (long)(0x795EFDF9693FF24AL ^ l)), (int)I);
        GL11.glPixelStorei((int)3317, (int)Y);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ComputationalParameterConfigurator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ComputationalParameterConfigurator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

