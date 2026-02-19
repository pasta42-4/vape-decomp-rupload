/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.E2;
import a.O_;
import a.d8;
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

public class _f {
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
        catch (O_ o_2) {
            throw _f.a(o_2);
        }
        this.Y();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void G(float f10, float f11) {
        this.y[this.u++] = f10;
        this.y[this.u++] = f11;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _f.a = d8.a(-5590848866191810693L, 2465019955550621316L, MethodHandles.lookup().lookupClass()).a(178489929266710L);
                _f.d = new HashMap<K, V>(13);
                var0 = _f.a ^ 52180452949004L;
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
        _f.b = var8_3;
        _f.c = new Integer[6];
    }

    public void u(double d2, double d3, double d4) {
        this.r[this.V++] = (float)d2;
        this.r[this.V++] = (float)d3;
        this.r[this.V++] = (float)d4;
    }

    public _f() {
        long l10 = a ^ 0x7B648F23C84L;
        this.Z = (int)_f.a("v", (int)10302, (long)(0x7A92847736F5B7D7L ^ l10));
        this.K = (int)_f.a("v", (int)6670, (long)(0x40098D93AAB985E0L ^ l10));
        this.V = -1;
        this.u = -1;
    }

    public void N(float f10, float f11) {
        this.r[this.V++] = f10;
        this.r[this.V++] = f11;
    }

    public void z() {
        this.y = new float[this.J * 2];
        this.v = BufferUtils.createFloatBuffer((int)(this.J * 2));
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x709E;
        if (c[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
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
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _f.c[n3] = n4;
        }
        return c[n3];
    }

    public void v(int n2, int n3, int n4) {
        this.J = n2;
        this.K = n3;
        this.Z = n4;
        this.r = new float[n2 * this.Z];
        this.H = BufferUtils.createFloatBuffer((int)(n2 * this.Z));
    }

    public void o(int n2, int n3) {
        this.v(n2, n3, 3);
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
        long l10 = a ^ 0x60019DE3CEFL;
        try {
            GL11.glEnableClientState((int)_f.a("v", (int)8294, (long)(0x30AA969EF0CABFE0L ^ l10)));
            if (this.y != null) {
                GL11.glEnableClientState((int)_f.a("v", (int)29117, (long)(0x1DCC28FCA776E39L ^ l10)));
            }
        }
        catch (O_ o_2) {
            throw _f.a(o_2);
        }
        try {
            E2.T(this.Z, 0, this.H);
            if (this.y != null) {
                GL11.glTexCoordPointer((int)2, (int)0, (FloatBuffer)this.v);
            }
        }
        catch (O_ o_3) {
            throw _f.a(o_3);
        }
        try {
            GL11.glDrawArrays((int)this.K, (int)0, (int)this.J);
            if (this.y != null) {
                GL11.glDisableClientState((int)_f.a("v", (int)9427, (long)(0x4DF9644803BD3B50L ^ l10)));
            }
        }
        catch (O_ o_4) {
            throw _f.a(o_4);
        }
        GL11.glDisableClientState((int)_f.a("v", (int)20583, (long)(0x518A1BD53DF54FE0L ^ l10)));
        this.V = 0;
        this.u = 0;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = _f.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
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
            return MethodHandles.lookup().findStatic(_f.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

