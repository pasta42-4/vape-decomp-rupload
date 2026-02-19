/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package com.graphics.buffer;

import com.collections.management.MultiContainerRegistry;
import com.data.compression.CompressionAlgorithmManager1716;
import com.exception.system.CustomSystemException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.FloatBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class GraphicsBufferManager {
    private static final Map d;
    private int Z;
    private FloatBuffer v;
    private float[] y;
    private FloatBuffer H;
    private int K;
    private static final Integer[] c;
    private int V;
    private float[] r;
    private static final long[] b;
    private static final long a;
    private int J;
    private int u;

    public void P() {
        try {
            this.H.put(this.r);
            this.H.flip();
            if (this.y != null) {
                this.v.put(this.y);
                this.v.flip();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicsBufferManager.a(customSystemException);
        }
        this.Y();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void G(float f, float f2) {
        this.y[this.u++] = f;
        this.y[this.u++] = f2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                GraphicsBufferManager.a = MultiContainerRegistry.a(-5590848866191810693L, 2465019955550621316L, MethodHandles.lookup().lookupClass()).a(178489929266710L);
                GraphicsBufferManager.d = new HashMap<K, V>(13);
                var0 = GraphicsBufferManager.a ^ 52180452949004L;
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
                var6_5 = "\u00c8\u0002goL\u00cd%\u0081\u00ff\u00e2c\u0006\u00cd\u0002z!o\u0081L\u0096\u00da\u00c6\u00d0s\u00f4%\u0082\u0019\u0085>\u00c8\u00f6";
                var7_6 = "\u00c8\u0002goL\u00cd%\u0081\u00ff\u00e2c\u0006\u00cd\u0002z!o\u0081L\u0096\u00da\u00c6\u00d0s\u00f4%\u0082\u0019\u0085>\u00c8\u00f6".length();
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
                    var6_5 = "La{[\u00d7\u00ff=\u00ee\u00a2\u00a9/\u00a6\u0007\u00ebb\u009f";
                    var7_6 = "La{[\u00d7\u00ff=\u00ee\u00a2\u00a9/\u00a6\u0007\u00ebb\u009f".length();
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
        GraphicsBufferManager.b = var8_3;
        GraphicsBufferManager.c = new Integer[6];
    }

    public void u(double d2, double d3, double d4) {
        this.r[this.V++] = (float)d2;
        this.r[this.V++] = (float)d3;
        this.r[this.V++] = (float)d4;
    }

    public GraphicsBufferManager() {
        long l = a ^ 0x7B648F23C84L;
        this.Z = (int)GraphicsBufferManager.a("v", (int)10302, (long)(0x7A92847736F5B7D7L ^ l));
        this.K = (int)GraphicsBufferManager.a("v", (int)6670, (long)(0x40098D93AAB985E0L ^ l));
        this.V = -1;
        this.u = -1;
    }

    public void N(float f, float f2) {
        this.r[this.V++] = f;
        this.r[this.V++] = f2;
    }

    public void z() {
        this.y = new float[this.J * 2];
        this.v = BufferUtils.createFloatBuffer((int)(this.J * 2));
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x709E;
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
                throw new RuntimeException("a/_f", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GraphicsBufferManager.c[n2] = n3;
        }
        return c[n2];
    }

    public void v(int n, int n2, int n3) {
        this.J = n;
        this.K = n2;
        this.Z = n3;
        this.r = new float[n * this.Z];
        this.H = BufferUtils.createFloatBuffer((int)(n * this.Z));
    }

    public void o(int n, int n2) {
        this.v(n, n2, 3);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/_f" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void Y() {
        long l = a ^ 0x60019DE3CEFL;
        try {
            GL11.glEnableClientState((int)GraphicsBufferManager.a("v", (int)8294, (long)(0x30AA969EF0CABFE0L ^ l)));
            if (this.y != null) {
                GL11.glEnableClientState((int)GraphicsBufferManager.a("v", (int)29117, (long)(0x1DCC28FCA776E39L ^ l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicsBufferManager.a(customSystemException);
        }
        try {
            CompressionAlgorithmManager1716.T(this.Z, 0, this.H);
            if (this.y != null) {
                GL11.glTexCoordPointer((int)2, (int)0, (FloatBuffer)this.v);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicsBufferManager.a(customSystemException);
        }
        try {
            GL11.glDrawArrays((int)this.K, (int)0, (int)this.J);
            if (this.y != null) {
                GL11.glDisableClientState((int)GraphicsBufferManager.a("v", (int)9427, (long)(0x4DF9644803BD3B50L ^ l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicsBufferManager.a(customSystemException);
        }
        GL11.glDisableClientState((int)GraphicsBufferManager.a("v", (int)20583, (long)(0x518A1BD53DF54FE0L ^ l)));
        this.V = 0;
        this.u = 0;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = GraphicsBufferManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void f() {
        this.V = 0;
        this.u = 0;
        this.H.clear();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(GraphicsBufferManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

