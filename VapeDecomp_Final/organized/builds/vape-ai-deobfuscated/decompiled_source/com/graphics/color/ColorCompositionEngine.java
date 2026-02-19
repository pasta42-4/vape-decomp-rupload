/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.color;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import java.awt.Color;
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

public class ColorCompositionEngine
extends Color {
    private int N;
    private int U;
    private static final Map e;
    private Color w;
    private int d;
    private static final Integer[] c;
    private static final long a;
    private static final long[] b;
    private int Q;

    private void v() {
        try {
            this.w = this.N > 255 ? new Color(this.U, this.d, this.Q) : new Color(this.U, this.d, this.Q, this.N);
        }
        catch (CustomSystemException customSystemException) {
            throw ColorCompositionEngine.a(customSystemException);
        }
    }

    @Override
    public int getRed() {
        return this.U;
    }

    @Override
    public int getRGB() {
        return this.w.getRGB();
    }

    public void o(int n) {
        this.d = n;
        this.v();
    }

    public void l(Color color, float f) {
        long l = a ^ 0x7CAA4E07F34DL;
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = 1.0f - f;
        int n = this.getRGB();
        int n2 = color.getRGB();
        int n3 = n >> 24 & 0xFF;
        int n4 = (n & ColorCompositionEngine.a("a", (int)15143, (long)(0x4404FBB29121BEBEL ^ l))) >> 16;
        int n5 = (n & ColorCompositionEngine.a("a", (int)25319, (long)(0x6299D3D78A8EE77FL ^ l))) >> 8;
        int n6 = n & 0xFF;
        int n7 = n2 >> 24 & 0xFF;
        int n8 = (n2 & ColorCompositionEngine.a("a", (int)21848, (long)(0x748895770AF2D0C3L ^ l))) >> 16;
        int n9 = (n2 & ColorCompositionEngine.a("a", (int)11872, (long)(0x68D434672A3DABFAL ^ l))) >> 8;
        int n10 = n2 & 0xFF;
        int n11 = (int)((float)n3 * f2 + (float)n7 * f);
        int n12 = (int)((float)n4 * f2 + (float)n8 * f);
        int n13 = (int)((float)n5 * f2 + (float)n9 * f);
        int n14 = (int)((float)n6 * f2 + (float)n10 * f);
        this.G(n12);
        this.o(n13);
        this.D(n14);
        this.I(n11);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ColorCompositionEngine.a = MultiContainerRegistry.a(-3521774088540680145L, -1659333688021495384L, MethodHandles.lookup().lookupClass()).a(220126915392873L);
                ColorCompositionEngine.e = new HashMap<K, V>(13);
                var0 = ColorCompositionEngine.a ^ 72430030194035L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u00aa\u00b98@\"\u00b3\u0000\u00d9(\u00a2\u0093\u00a9y\"\u00c7&\u000f\u0001E\u007f\u00d0\u00e5\u00b8\u00da";
                var7_6 = "\u00aa\u00b98@\"\u00b3\u0000\u00d9(\u00a2\u0093\u00a9y\"\u00c7&\u000f\u0001E\u007f\u00d0\u00e5\u00b8\u00da".length();
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
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00f4\u00fd%\u00e1}\u0080\\\u00a1\u0085\u00ef\u00e0\u0088\u0016\u00f9]\u00fa";
                    var7_6 = "\u00f4\u00fd%\u00e1}\u0080\\\u00a1\u0085\u00ef\u00e0\u0088\u0016\u00f9]\u00fa".length();
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
lbl39:
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
lbl52:
                // 1 sources

                ** continue;
            }
        }
        ColorCompositionEngine.b = var8_3;
        ColorCompositionEngine.c = new Integer[5];
    }

    @Override
    public int getAlpha() {
        return this.N;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/k2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public ColorCompositionEngine(Color color) {
        super(color.getRGB(), true);
        this.w = new Color(color.getRGB(), true);
        this.U = super.getRed();
        this.d = super.getGreen();
        this.Q = super.getBlue();
        this.N = super.getAlpha();
        if (this.N == 0) {
            this.N = 1;
        }
    }

    public ColorCompositionEngine L(float f) {
        int n;
        int n2;
        int n3;
        int n4;
        block15: {
            int n5;
            block14: {
                block13: {
                    block12: {
                        n4 = this.getRed();
                        n3 = this.getGreen();
                        n2 = this.getBlue();
                        n = this.getAlpha();
                        n5 = (int)(1.0 / (1.0 - (double)f));
                        try {
                            try {
                                try {
                                    if (n4 != 0 || n3 != 0) break block12;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ColorCompositionEngine.a(customSystemException);
                                }
                                if (n2 != 0) break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ColorCompositionEngine.a(customSystemException);
                            }
                            this.U = n5;
                            this.d = n5;
                            this.Q = n5;
                            this.N = n;
                            return this;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ColorCompositionEngine.a(customSystemException);
                        }
                    }
                    try {
                        if (n4 <= 0 || n4 >= n5) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ColorCompositionEngine.a(customSystemException);
                    }
                    n4 = n5;
                }
                try {
                    if (n3 <= 0 || n3 >= n5) break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw ColorCompositionEngine.a(customSystemException);
                }
                n3 = n5;
            }
            try {
                if (n2 <= 0 || n2 >= n5) break block15;
            }
            catch (CustomSystemException customSystemException) {
                throw ColorCompositionEngine.a(customSystemException);
            }
            n2 = n5;
        }
        this.U = Math.min((int)((float)n4 / f), 255);
        this.d = Math.min((int)((float)n3 / f), 255);
        this.Q = Math.min((int)((float)n2 / f), 255);
        this.N = n;
        return this;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1599;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/k2", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ColorCompositionEngine.c[n2] = n3;
        }
        return c[n2];
    }

    public void G(int n) {
        this.U = n;
        this.v();
    }

    public ColorCompositionEngine(int n, int n2) {
        super(n);
        this.w = new Color(n);
        this.U = super.getRed();
        this.d = super.getGreen();
        this.Q = super.getBlue();
        this.N = n2;
        if (this.N == 0) {
            this.N = 1;
        }
    }

    @Override
    public int getBlue() {
        return this.Q;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ColorCompositionEngine.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public ColorCompositionEngine I(int n) {
        if (n == 0) {
            n = 1;
        }
        this.N = n;
        this.v();
        return this;
    }

    public ColorCompositionEngine(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
        this.w = new Color(super.getRGB(), true);
        this.U = super.getRed();
        this.d = super.getGreen();
        this.Q = super.getBlue();
        this.N = super.getAlpha();
        if (this.N == 0) {
            this.N = 1;
        }
    }

    public int Y() {
        return (this.N & 0xFF) << 24 | (this.U & 0xFF) << 16 | (this.d & 0xFF) << 8 | (this.Q & 0xFF) << 0;
    }

    public ColorCompositionEngine(int n) {
        long l = a ^ 0x6D66D9C9D2E9L;
        super(n);
        this.w = new Color(n);
        this.U = super.getRed();
        this.d = super.getGreen();
        this.Q = super.getBlue();
        this.N = (int)ColorCompositionEngine.a("a", (int)23874, (long)(0x46A7745675AC7978L ^ l));
    }

    public void S(Color color) {
        this.U = color.getRed();
        this.d = color.getGreen();
        this.Q = color.getBlue();
        this.N = color.getAlpha();
        this.v();
    }

    public void D(int n) {
        this.Q = n;
        this.v();
    }

    public ColorCompositionEngine g(float f) {
        this.U = Math.max((int)((float)this.getRed() * f), 0);
        this.d = Math.max((int)((float)this.getGreen() * f), 0);
        this.Q = Math.max((int)((float)this.getBlue() * f), 0);
        return this;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public int getGreen() {
        return this.d;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ColorCompositionEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

