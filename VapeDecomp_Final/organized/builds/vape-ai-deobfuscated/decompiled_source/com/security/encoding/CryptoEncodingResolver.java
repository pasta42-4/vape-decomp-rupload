/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.security.encoding;

import a.YS;
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

public class CryptoEncodingResolver
extends YS {
    private static final Map i;
    private static final long b;
    private static final long[] g;
    private static final Integer[] h;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptoEncodingResolver.b = MultiContainerRegistry.a(6147841907706351934L, -6172893318571015681L, MethodHandles.lookup().lookupClass()).a(118667006628153L);
                CryptoEncodingResolver.i = new HashMap<K, V>(13);
                var0 = CryptoEncodingResolver.b ^ 123767202429196L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "\u00f2*s\u00cf\u00b4\u00dc\u00bf\u007fI\u00ff!r\u00d9\u00b4\u00b4V\u0091#~\u0011\u00d5h\u008en2\u00f7\u0088S\u00d2\u00b8@c";
                var7_6 = "\u00f2*s\u00cf\u00b4\u00dc\u00bf\u007fI\u00ff!r\u00d9\u00b4\u00b4V\u0091#~\u0011\u00d5h\u008en2\u00f7\u0088S\u00d2\u00b8@c".length();
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
                    var6_5 = "\u001d\u0081\u00b2\u0004\u00ee\u00f1\u00fcM@\u00ef\u00c0\u009b\u0095\u00d7\\G";
                    var7_6 = "\u001d\u0081\u00b2\u0004\u00ee\u00f1\u00fcM@\u00ef\u00c0\u009b\u0095\u00d7\\G".length();
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
        CryptoEncodingResolver.g = var8_3;
        CryptoEncodingResolver.h = new Integer[6];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Yq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void j(float f, int n, int n2) {
        block69: {
            float f2;
            float f3;
            float f4;
            float f5;
            int n3;
            float f6;
            int n4;
            float f7;
            float f8;
            float f9;
            boolean bl;
            block68: {
                block70: {
                    long l;
                    block60: {
                        float f10;
                        float f11;
                        int n5;
                        int n6;
                        float f12;
                        float f13;
                        float f14;
                        float f15;
                        int n7;
                        block61: {
                            boolean bl2;
                            l = b ^ 0x4038F3656ACAL;
                            try {
                                bl2 = this.e != CryptoEncodingResolver.b("m", (int)20777, (long)(0x735C2AC588915A8EL ^ l));
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoEncodingResolver.a(customSystemException);
                            }
                            bl = bl2;
                            f9 = this.u == CryptoEncodingResolver.b("m", (int)23467, (long)(0x3AF2D9557F3E5008L ^ l)) ? -1.0f : 1.0f;
                            f8 = (float)Math.PI / (float)n2;
                            f7 = (float)Math.PI * 2 / (float)n;
                            try {
                                if (this.V != CryptoEncodingResolver.b("m", (int)14886, (long)(0x568A0C44B907B180L ^ l))) break block60;
                                if (this.F) break block61;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoEncodingResolver.a(customSystemException);
                            }
                            GL11.glBegin((int)6);
                            GL11.glNormal3f((float)0.0f, (float)0.0f, (float)1.0f);
                            GL11.glVertex3f((float)0.0f, (float)0.0f, (float)(f9 * f));
                            n7 = 0;
                            while (true) {
                                float f16;
                                block63: {
                                    block62: {
                                        try {
                                            try {
                                                if (n7 > n) break;
                                                if (n7 != n) break block62;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptoEncodingResolver.a(customSystemException);
                                            }
                                            f16 = 0.0f;
                                            break block63;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptoEncodingResolver.a(customSystemException);
                                        }
                                    }
                                    f16 = (float)n7 * f7;
                                }
                                f15 = f16;
                                f14 = -this.T(f15) * this.T(f8);
                                f13 = this.P(f15) * this.T(f8);
                                f12 = f9 * this.P(f8);
                                try {
                                    if (bl) {
                                        GL11.glNormal3f((float)(f14 * f9), (float)(f13 * f9), (float)(f12 * f9));
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoEncodingResolver.a(customSystemException);
                                }
                                GL11.glVertex3f((float)(f14 * f), (float)(f13 * f), (float)(f12 * f));
                                ++n7;
                            }
                            GL11.glEnd();
                        }
                        float f17 = 1.0f / (float)n;
                        float f18 = 1.0f / (float)n2;
                        float f19 = 1.0f;
                        if (this.F) {
                            n6 = 0;
                            n5 = n2;
                        } else {
                            n6 = 1;
                            n5 = n2 - 1;
                        }
                        for (int i = n6; i < n5; ++i) {
                            f11 = (float)i * f8;
                            GL11.glBegin((int)8);
                            f10 = 0.0f;
                            n7 = 0;
                            while (true) {
                                float f20;
                                block65: {
                                    block64: {
                                        try {
                                            try {
                                                if (n7 > n) break;
                                                if (n7 != n) break block64;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptoEncodingResolver.a(customSystemException);
                                            }
                                            f20 = 0.0f;
                                            break block65;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptoEncodingResolver.a(customSystemException);
                                        }
                                    }
                                    f20 = (float)n7 * f7;
                                }
                                f15 = f20;
                                f14 = -this.T(f15) * this.T(f11);
                                f13 = this.P(f15) * this.T(f11);
                                f12 = f9 * this.P(f11);
                                try {
                                    if (bl) {
                                        GL11.glNormal3f((float)(f14 * f9), (float)(f13 * f9), (float)(f12 * f9));
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoEncodingResolver.a(customSystemException);
                                }
                                this.L(f10, f19);
                                GL11.glVertex3f((float)(f14 * f), (float)(f13 * f), (float)(f12 * f));
                                f14 = -this.T(f15) * this.T(f11 + f8);
                                f13 = this.P(f15) * this.T(f11 + f8);
                                f12 = f9 * this.P(f11 + f8);
                                try {
                                    if (bl) {
                                        GL11.glNormal3f((float)(f14 * f9), (float)(f13 * f9), (float)(f12 * f9));
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoEncodingResolver.a(customSystemException);
                                }
                                this.L(f10, f19 - f18);
                                f10 += f17;
                                GL11.glVertex3f((float)(f14 * f), (float)(f13 * f), (float)(f12 * f));
                                ++n7;
                            }
                            GL11.glEnd();
                            f19 -= f18;
                        }
                        if (this.F) break block69;
                        GL11.glBegin((int)6);
                        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)-1.0f);
                        GL11.glVertex3f((float)0.0f, (float)0.0f, (float)(-f * f9));
                        f11 = (float)Math.PI - f8;
                        f10 = 1.0f;
                        n7 = n;
                        while (true) {
                            float f21;
                            block67: {
                                block66: {
                                    try {
                                        try {
                                            if (n7 < 0) break;
                                            if (n7 != n) break block66;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptoEncodingResolver.a(customSystemException);
                                        }
                                        f21 = 0.0f;
                                        break block67;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoEncodingResolver.a(customSystemException);
                                    }
                                }
                                f21 = (float)n7 * f7;
                            }
                            f15 = f21;
                            f14 = -this.T(f15) * this.T(f11);
                            f13 = this.P(f15) * this.T(f11);
                            f12 = f9 * this.P(f11);
                            try {
                                if (bl) {
                                    GL11.glNormal3f((float)(f14 * f9), (float)(f13 * f9), (float)(f12 * f9));
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoEncodingResolver.a(customSystemException);
                            }
                            f10 -= f17;
                            GL11.glVertex3f((float)(f14 * f), (float)(f13 * f), (float)(f12 * f));
                            --n7;
                        }
                        GL11.glEnd();
                        break block69;
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (this.V == CryptoEncodingResolver.b("m", (int)17593, (long)(0x285C9449597DCF1CL ^ l)) || this.V == CryptoEncodingResolver.b("m", (int)29693, (long)(0x22FD066403F67859L ^ l))) break block68;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoEncodingResolver.a(customSystemException);
                                }
                                if (this.V != CryptoEncodingResolver.b("m", (int)8061, (long)(0x5B642B88302114DFL ^ l))) break block69;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoEncodingResolver.a(customSystemException);
                            }
                            GL11.glBegin((int)0);
                            if (!bl) break block70;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoEncodingResolver.a(customSystemException);
                        }
                        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)f9);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoEncodingResolver.a(customSystemException);
                    }
                }
                try {
                    GL11.glVertex3f((float)0.0f, (float)0.0f, (float)f);
                    if (bl) {
                        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)(-f9));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoEncodingResolver.a(customSystemException);
                }
                GL11.glVertex3f((float)0.0f, (float)0.0f, (float)(-f));
                for (int i = 1; i < n2 - 1; ++i) {
                    float f22 = (float)i * f8;
                    for (int j = 0; j < n; ++j) {
                        float f23 = (float)j * f7;
                        float f24 = this.P(f23) * this.T(f22);
                        float f25 = this.T(f23) * this.T(f22);
                        float f26 = this.P(f22);
                        try {
                            if (bl) {
                                GL11.glNormal3f((float)(f24 * f9), (float)(f25 * f9), (float)(f26 * f9));
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoEncodingResolver.a(customSystemException);
                        }
                        GL11.glVertex3f((float)(f24 * f), (float)(f25 * f), (float)(f26 * f));
                    }
                }
                GL11.glEnd();
                break block69;
            }
            for (n4 = 1; n4 < n2; ++n4) {
                f6 = (float)n4 * f8;
                GL11.glBegin((int)2);
                for (n3 = 0; n3 < n; ++n3) {
                    f5 = (float)n3 * f7;
                    f4 = this.P(f5) * this.T(f6);
                    f3 = this.T(f5) * this.T(f6);
                    f2 = this.P(f6);
                    try {
                        if (bl) {
                            GL11.glNormal3f((float)(f4 * f9), (float)(f3 * f9), (float)(f2 * f9));
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoEncodingResolver.a(customSystemException);
                    }
                    GL11.glVertex3f((float)(f4 * f), (float)(f3 * f), (float)(f2 * f));
                }
                GL11.glEnd();
            }
            for (n3 = 0; n3 < n; ++n3) {
                f5 = (float)n3 * f7;
                GL11.glBegin((int)3);
                for (n4 = 0; n4 <= n2; ++n4) {
                    f6 = (float)n4 * f8;
                    f4 = this.P(f5) * this.T(f6);
                    f3 = this.T(f5) * this.T(f6);
                    f2 = this.P(f6);
                    try {
                        if (bl) {
                            GL11.glNormal3f((float)(f4 * f9), (float)(f3 * f9), (float)(f2 * f9));
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoEncodingResolver.a(customSystemException);
                    }
                    GL11.glVertex3f((float)(f4 * f), (float)(f3 * f), (float)(f2 * f));
                }
                GL11.glEnd();
            }
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2E84;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Yq", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoEncodingResolver.h[n2] = n3;
        }
        return h[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoEncodingResolver.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoEncodingResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

