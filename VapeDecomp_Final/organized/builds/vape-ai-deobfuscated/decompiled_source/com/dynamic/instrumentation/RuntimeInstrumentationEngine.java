/*
 * Decompiled with CFR 0.152.
 */
package com.dynamic.instrumentation;

import a.FR;
import a.z1;
import a.z6;
import com.app.security.validation.DecompilationValidator;
import com.collections.management.MultiContainerRegistry;
import com.data.obfuscation.NumericScrambler;
import com.encoding.strategy.EncodingStrategyEnum;
import com.geospatial.transformation.GeospatialCoordinateTransformer;
import com.math.computation.GeometricComputationEngine920;
import com.security.crypto.CryptographicSessionController;
import com.security.exchange.SecureDataExchanger793;
import com.simulation.physics.PhysicsSimulator1815;
import com.system.resources.ResourceAllocationTracker882;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class RuntimeInstrumentationEngine {
    private float M = 1.0f;
    private ResourceAllocationTracker882 j = null;
    private boolean y;
    private static final Map e;
    private int[] Q;
    private Supplier<Void> d = null;
    private int h;
    private DecompilationValidator F;
    public SecureDataExchanger793 N;
    public int z = 0;
    private static final String[] g;
    private final GeometricComputationEngine920 U;
    private static final long a;
    private final FR X;
    private Supplier<Void> T = null;
    private static final Integer[] c;
    private z1 m = null;
    private float[] P;
    private static final long[] b;
    private static final Object[] f;
    private NumericScrambler E;
    private final GeospatialCoordinateTransformer O = new GeospatialCoordinateTransformer(0.0f, 0.0f);
    public int q = 0;
    private EncodingStrategyEnum l;

    public Supplier<Void> e() {
        return this.d;
    }

    public RuntimeInstrumentationEngine f(float f, float f2, float f3, float f4, float f5, float f6, float f7, Color color) {
        long l = a ^ 0x113ED495C026L;
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.LINES);
        this.p(f7);
        this.q(9.0f, f, f2, f3, geometricComputationEngine920);
        this.q(9.0f, f4, f5, f6, geometricComputationEngine920);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)32042, (long)(0x5412D39D8B2FCE35L ^ l)), (long)8925019985030460449L, (long)l)));
        return this;
    }

    public RuntimeInstrumentationEngine S(float f, float f2, PhysicsSimulator1815 physicsSimulator1815, Color color, float f3) {
        long l = a ^ 0x4A33EA0417A5L;
        float f4 = f + physicsSimulator1815.P * f3;
        float f5 = f + physicsSimulator1815.R * f3;
        float f6 = f2 + physicsSimulator1815.j * f3;
        float f7 = f2 + physicsSimulator1815.I * f3;
        this.D(z6.p);
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.B(11.0f, f4, f6, 0.0f, physicsSimulator1815.h, physicsSimulator1815.q, geometricComputationEngine920);
        this.B(11.0f, f4, f7, 0.0f, physicsSimulator1815.h, physicsSimulator1815.m, geometricComputationEngine920);
        this.B(11.0f, f5, f6, 0.0f, physicsSimulator1815.w, physicsSimulator1815.q, geometricComputationEngine920);
        this.B(11.0f, f5, f7, 0.0f, physicsSimulator1815.w, physicsSimulator1815.m, geometricComputationEngine920);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)29541, (long)(0x41106362C66517E3L ^ l)), (long)-6026008241302838366L, (long)l)));
        return this;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = f[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 39;
                break;
            }
            case 1: {
                n3 = 33;
                break;
            }
            case 2: {
                n3 = 14;
                break;
            }
            case 3: {
                n3 = 12;
                break;
            }
            case 4: {
                n3 = 25;
                break;
            }
            case 5: {
                n3 = 34;
                break;
            }
            case 6: {
                n3 = 4;
                break;
            }
            case 7: {
                n3 = 26;
                break;
            }
            case 8: {
                n3 = 30;
                break;
            }
            case 9: {
                n3 = 43;
                break;
            }
            case 10: {
                n3 = 7;
                break;
            }
            case 11: {
                n3 = 6;
                break;
            }
            case 12: {
                n3 = 3;
                break;
            }
            case 13: {
                n3 = 24;
                break;
            }
            case 14: {
                n3 = 57;
                break;
            }
            case 15: {
                n3 = 37;
                break;
            }
            case 16: {
                n3 = 52;
                break;
            }
            case 17: {
                n3 = 41;
                break;
            }
            case 18: {
                n3 = 58;
                break;
            }
            case 19: {
                n3 = 55;
                break;
            }
            case 20: {
                n3 = 5;
                break;
            }
            case 21: {
                n3 = 59;
                break;
            }
            case 22: {
                n3 = 42;
                break;
            }
            case 23: {
                n3 = 48;
                break;
            }
            case 24: {
                n3 = 2;
                break;
            }
            case 25: {
                n3 = 18;
                break;
            }
            case 26: {
                n3 = 27;
                break;
            }
            case 27: {
                n3 = 17;
                break;
            }
            case 28: {
                n3 = 44;
                break;
            }
            case 29: {
                n3 = 47;
                break;
            }
            case 30: {
                n3 = 50;
                break;
            }
            case 31: {
                n3 = 15;
                break;
            }
            case 32: {
                n3 = 16;
                break;
            }
            case 33: {
                n3 = 36;
                break;
            }
            case 34: {
                n3 = 38;
                break;
            }
            case 35: {
                n3 = 0;
                break;
            }
            case 36: {
                n3 = 8;
                break;
            }
            case 37: {
                n3 = 54;
                break;
            }
            case 38: {
                n3 = 62;
                break;
            }
            case 39: {
                n3 = 1;
                break;
            }
            case 40: {
                n3 = 60;
                break;
            }
            case 41: {
                n3 = 29;
                break;
            }
            case 42: {
                n3 = 31;
                break;
            }
            case 43: {
                n3 = 51;
                break;
            }
            case 44: {
                n3 = 19;
                break;
            }
            case 45: {
                n3 = 49;
                break;
            }
            case 46: {
                n3 = 63;
                break;
            }
            case 47: {
                n3 = 13;
                break;
            }
            case 48: {
                n3 = 53;
                break;
            }
            case 49: {
                n3 = 22;
                break;
            }
            case 50: {
                n3 = 10;
                break;
            }
            case 51: {
                n3 = 56;
                break;
            }
            case 52: {
                n3 = 21;
                break;
            }
            case 53: {
                n3 = 23;
                break;
            }
            case 54: {
                n3 = 40;
                break;
            }
            case 55: {
                n3 = 28;
                break;
            }
            case 56: {
                n3 = 61;
                break;
            }
            case 57: {
                n3 = 11;
                break;
            }
            case 58: {
                n3 = 45;
                break;
            }
            case 59: {
                n3 = 46;
                break;
            }
            case 60: {
                n3 = 20;
                break;
            }
            case 61: {
                n3 = 32;
                break;
            }
            case 62: {
                n3 = 9;
                break;
            }
            default: {
                n3 = 35;
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
        RuntimeInstrumentationEngine.g[n4] = new String(cArray);
        return n4;
    }

    public RuntimeInstrumentationEngine v(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, Color color) {
        float f11;
        long l = a ^ 0x7D1F8F06E538L;
        if (f3 == f4) {
            f11 = f5 / f6;
            f3 *= f11;
        }
        f11 = f + f3;
        float f12 = f2 + f4;
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.B(14.0f, f, f2, 0.0f, f7, f8, geometricComputationEngine920);
        this.B(14.0f, f, f12, 0.0f, f7, f10, geometricComputationEngine920);
        this.B(14.0f, f11, f2, 0.0f, f9, f8, geometricComputationEngine920);
        this.B(14.0f, f11, f12, 0.0f, f9, f10, geometricComputationEngine920);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)5417, (long)(0x289B77893E49832EL ^ l)), (long)6828132422569398591L, (long)l)));
        return this;
    }

    private void O(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, GeometricComputationEngine920 geometricComputationEngine920, GeospatialCoordinateTransformer geospatialCoordinateTransformer) {
        FR fR = new FR(f2, f3, f4);
        GeospatialCoordinateTransformer geospatialCoordinateTransformer2 = new GeospatialCoordinateTransformer(f5, f6);
        this.a(f, fR, geospatialCoordinateTransformer2, this.U, 0.0f, f7, this.O, 0.0f, 0.0f, geospatialCoordinateTransformer, this.O, geometricComputationEngine920, new FR(f9, f8, 0.0f), f10, this.U);
    }

    public RuntimeInstrumentationEngine(int n, EncodingStrategyEnum encodingStrategyEnum, boolean bl) {
        this.X = new FR(0.0f, 0.0f, 0.0f);
        this.U = new GeometricComputationEngine920(0.0f, 0.0f, 0.0f, 0.0f);
        this.l = encodingStrategyEnum;
        this.N = z6.D.i().f();
        if (z6.i != null) {
            this.j = new ResourceAllocationTracker882(z6.i.e, z6.i.j, z6.i.u, z6.i.D);
        }
        this.y = bl;
        this.h = n;
        this.F = z6.N.E();
    }

    public RuntimeInstrumentationEngine K(float f, float f2, float f3, float f4, float f5, float f6, Color color) {
        long l = a ^ 0x7EACF746C269L;
        float f7 = f - f5;
        float f8 = f + f3 + f5;
        float f9 = f2 - f5;
        float f10 = f2 + f4 + f5;
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(f, f2, f3, f4);
        GeometricComputationEngine920 geometricComputationEngine9202 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.e(8.0f, f7, f9, 0.0f, geometricComputationEngine920, f5, f6, geometricComputationEngine9202);
        this.e(8.0f, f7, f10, 0.0f, geometricComputationEngine920, f5, f6, geometricComputationEngine9202);
        this.e(8.0f, f8, f9, 0.0f, geometricComputationEngine920, f5, f6, geometricComputationEngine9202);
        this.e(8.0f, f8, f10, 0.0f, geometricComputationEngine920, f5, f6, geometricComputationEngine9202);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)212, (long)(0x5449B14B7038B19BL ^ l)), (long)8760457788591945326L, (long)l)));
        return this;
    }

    private void V(float f, float f2, float f3, float f4, float f5, float f6, GeospatialCoordinateTransformer geospatialCoordinateTransformer, GeometricComputationEngine920 geometricComputationEngine920) {
        this.G(f, f2, f3, f4, 0.0f, 0.0f, f5, f6, geospatialCoordinateTransformer, geometricComputationEngine920);
    }

    public RuntimeInstrumentationEngine k(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, Color color, Color color2) {
        long l = a ^ 0x6E65A4D7D23AL;
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        GeometricComputationEngine920 geometricComputationEngine9202 = new GeometricComputationEngine920(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
        this.H(z1.QUADS);
        this.q(9.0f, f4, f5, f6, geometricComputationEngine920);
        this.q(9.0f, f, f2, f3, geometricComputationEngine920);
        this.q(9.0f, f7, f8, f9, geometricComputationEngine9202);
        this.q(9.0f, f10, f11, f12, geometricComputationEngine9202);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)20378, (long)(0x3976708425976E84L ^ l)), (long)7620219456333194813L, (long)l)));
        return this;
    }

    private void A(float f, float f2, float f3, float f4, float f5, GeometricComputationEngine920 geometricComputationEngine920, float f6, GeometricComputationEngine920 geometricComputationEngine9202, GeometricComputationEngine920 geometricComputationEngine9203) {
        FR fR = new FR(f2, f3, f4);
        this.a(f, fR, this.O, geometricComputationEngine9202, 0.0f, 0.0f, this.O, 0.0f, 0.0f, this.O, this.O, geometricComputationEngine920, new FR(f5, 0.0f, 0.0f), f6, geometricComputationEngine9203);
    }

    public NumericScrambler I() {
        return this.E;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                RuntimeInstrumentationEngine.a = MultiContainerRegistry.a(5126230801543126905L, -4197702595782077656L, MethodHandles.lookup().lookupClass()).a(51516835068296L);
                RuntimeInstrumentationEngine.f = new Object[5];
                RuntimeInstrumentationEngine.g = new String[5];
                RuntimeInstrumentationEngine.b();
                RuntimeInstrumentationEngine.e = new HashMap<K, V>(13);
                var0 = RuntimeInstrumentationEngine.a ^ 42103074447533L;
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
                var8_3 = new long[21];
                var5_4 = 0;
                var6_5 = "\u0097\u009b\u0086\u00f4\rN\u000b\u0018s>\u0018\u00c7\u00bf\u00b3O\u001e/\u00abf\u00cf\u00c20\u00d0\u00c0\u00ca\u00d8<4($\u00b4\u0091\u00f1p\u00dd\u0018\u00f3\u00cc3\u00d1\u0097P\u00c5\u007f6{\u007f\u00e4\u0099\u00d0@\u00b7\u00afl\u00019\u00b2\u0014\u00cf\u0012\u00b3\u0084F\u001d\u00ff\u0002\u00e6\u00c1\u0096\u00f9\u00bco\u0001\u00e5\u00abF\u00a1\u0007\u00bc\u0088\u0017C\u00be\u00fbBv\u00e5\u007f\u00e3P=nKdN\b\u001c\u00ef[\u00a0p\u00b0I&\n_N\u0083\u00ff\u0012\u0090tT\u0098\u00ec?\u008c\u00c4'\u009f\u008d\u00c7\u00a31\u00e8\u00d6\u00f8\u00bf\u00e5\u00ee@\u0090\u00a0<\u00a2\u00eb\u00be15\u0088G\u00c8vw\u0000\u008a\u0010{\u001bU\u0006\u00d8";
                var7_6 = "\u0097\u009b\u0086\u00f4\rN\u000b\u0018s>\u0018\u00c7\u00bf\u00b3O\u001e/\u00abf\u00cf\u00c20\u00d0\u00c0\u00ca\u00d8<4($\u00b4\u0091\u00f1p\u00dd\u0018\u00f3\u00cc3\u00d1\u0097P\u00c5\u007f6{\u007f\u00e4\u0099\u00d0@\u00b7\u00afl\u00019\u00b2\u0014\u00cf\u0012\u00b3\u0084F\u001d\u00ff\u0002\u00e6\u00c1\u0096\u00f9\u00bco\u0001\u00e5\u00abF\u00a1\u0007\u00bc\u0088\u0017C\u00be\u00fbBv\u00e5\u007f\u00e3P=nKdN\b\u001c\u00ef[\u00a0p\u00b0I&\n_N\u0083\u00ff\u0012\u0090tT\u0098\u00ec?\u008c\u00c4'\u009f\u008d\u00c7\u00a31\u00e8\u00d6\u00f8\u00bf\u00e5\u00ee@\u0090\u00a0<\u00a2\u00eb\u00be15\u0088G\u00c8vw\u0000\u008a\u0010{\u001bU\u0006\u00d8".length();
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
                    var6_5 = "%\u00e1\u0083/E\u00edW!:\u0006\u0014\u00ed\u0019\u008d\u00bex";
                    var7_6 = "%\u00e1\u0083/E\u00edW!:\u0006\u0014\u00ed\u0019\u008d\u00bex".length();
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
        RuntimeInstrumentationEngine.b = var8_3;
        RuntimeInstrumentationEngine.c = new Integer[21];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = RuntimeInstrumentationEngine.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                RuntimeInstrumentationEngine.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void G(float f, float f2, float f3, float f4, FR fR, GeometricComputationEngine920 geometricComputationEngine920, GeometricComputationEngine920 geometricComputationEngine9202) {
        FR fR2 = new FR(f2, f3, f4);
        this.a(f, fR2, this.O, geometricComputationEngine9202, 0.0f, 0.0f, this.O, 0.0f, 0.0f, this.O, this.O, geometricComputationEngine920, fR, 0.0f, this.U);
    }

    private void A(float f, float f2, float f3, float f4, float f5, float f6, float f7, GeometricComputationEngine920 geometricComputationEngine920, float f8, GeometricComputationEngine920 geometricComputationEngine9202) {
        FR fR = new FR(f2, f3, f4);
        GeospatialCoordinateTransformer geospatialCoordinateTransformer = new GeospatialCoordinateTransformer(f5, f6);
        this.a(f, fR, geospatialCoordinateTransformer, geometricComputationEngine9202, 0.0f, 0.0f, this.O, 0.0f, 0.0f, this.O, this.O, geometricComputationEngine920, new FR(f7, 0.0f, 0.0f), f8, this.U);
    }

    private void a(float f, FR fR, GeospatialCoordinateTransformer geospatialCoordinateTransformer, GeometricComputationEngine920 geometricComputationEngine920, float f2, float f3, GeospatialCoordinateTransformer geospatialCoordinateTransformer2, float f4, float f5, GeospatialCoordinateTransformer geospatialCoordinateTransformer3, GeospatialCoordinateTransformer geospatialCoordinateTransformer4, GeometricComputationEngine920 geometricComputationEngine9202, FR fR2, float f6, GeometricComputationEngine920 geometricComputationEngine9203) {
        float f7 = 0.003921569f;
        float[] fArray = new float[]{f, fR.S, fR.p, fR.D, geospatialCoordinateTransformer.p, geospatialCoordinateTransformer.j, geometricComputationEngine920.F * f7, geometricComputationEngine920.s * f7, geometricComputationEngine920.X * f7, geometricComputationEngine920.n * f7, f2, f3, geospatialCoordinateTransformer2.p, geospatialCoordinateTransformer2.j, f4, f5, geospatialCoordinateTransformer3.p, geospatialCoordinateTransformer3.j, geospatialCoordinateTransformer4.p, geospatialCoordinateTransformer4.j, geometricComputationEngine9202.F, geometricComputationEngine9202.s, geometricComputationEngine9202.X, geometricComputationEngine9202.n, fR2.S, fR2.p, fR2.D, f6, geometricComputationEngine9203.F, geometricComputationEngine9203.s, geometricComputationEngine9203.X, geometricComputationEngine9203.n};
        int n = this.q * CryptographicSessionController.x().t().O();
        System.arraycopy(fArray, 0, this.P, n, fArray.length);
        ++this.q;
    }

    public RuntimeInstrumentationEngine Q(Supplier<Void> supplier) {
        this.T = supplier;
        return this;
    }

    private void e(float f, float f2, float f3, float f4, GeometricComputationEngine920 geometricComputationEngine920, float f5, float f6, GeometricComputationEngine920 geometricComputationEngine9202) {
        FR fR = new FR(f2, f3, f4);
        FR fR2 = new FR(f6, 0.0f, 0.0f);
        this.a(f, fR, this.O, geometricComputationEngine9202, 0.0f, 0.0f, this.O, 0.0f, 0.0f, this.O, this.O, geometricComputationEngine920, fR2, f5, this.U);
    }

    private void B(float f, float f2, float f3, float f4, float f5, float f6, GeometricComputationEngine920 geometricComputationEngine920) {
        this.A(f, f2, f3, f4, f5, f6, 0.0f, this.U, 0.0f, geometricComputationEngine920);
    }

    private void y(float f, float f2, float f3, float f4, GeometricComputationEngine920 geometricComputationEngine920, float f5, GeometricComputationEngine920 geometricComputationEngine9202) {
        this.e(f, f2, f3, f4, geometricComputationEngine920, f5, 0.0f, geometricComputationEngine9202);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public RuntimeInstrumentationEngine f(float f, float f2, float f3, float f4, float f5, float f6, int n, Color color) {
        float f7;
        GeometricComputationEngine920 geometricComputationEngine920;
        GeometricComputationEngine920 geometricComputationEngine9202;
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        float f8 = 0.5f;
        if (f5 <= 0.0f) {
            f8 = 0.0f;
        }
        float f9 = f6;
        float f10 = Math.max(0.0f, (f5 += f8 * 2.0f) - f9);
        if (f5 > 0.0f) {
            f = (float)((double)f - ((double)f9 - 0.5));
            f2 -= f9;
            f4 = (float)((double)f4 + (double)f9 * 1.5);
            f3 += f9 * 1.0f;
        }
        float f11 = f + f8;
        float f12 = f + f3 - f8;
        float f13 = f2 + f8;
        float f14 = f2 + f4 - f8;
        try {
            bl4 = (n & 1) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw RuntimeInstrumentationEngine.a(illegalArgumentException);
        }
        boolean bl5 = bl4;
        try {
            bl3 = (n & 2) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw RuntimeInstrumentationEngine.a(illegalArgumentException);
        }
        boolean bl6 = bl3;
        try {
            bl2 = (n & 4) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw RuntimeInstrumentationEngine.a(illegalArgumentException);
        }
        boolean bl7 = bl2;
        try {
            bl = (n & 8) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw RuntimeInstrumentationEngine.a(illegalArgumentException);
        }
        boolean bl8 = bl;
        try {
            GeometricComputationEngine920 geometricComputationEngine9203;
            geometricComputationEngine9202 = geometricComputationEngine9203;
            geometricComputationEngine920 = geometricComputationEngine9203;
            f7 = bl5 ? 1.0f : 0.0f;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw RuntimeInstrumentationEngine.a(illegalArgumentException);
        }
        geometricComputationEngine9202(f7, bl6 ? 1.0f : 0.0f, bl7 ? 1.0f : 0.0f, bl8 ? 1.0f : 0.0f);
        GeometricComputationEngine920 geometricComputationEngine9204 = geometricComputationEngine920;
        GeometricComputationEngine920 geometricComputationEngine9205 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        GeometricComputationEngine920 geometricComputationEngine9206 = new GeometricComputationEngine920(f + f5, f2 + f5, f + f3 - f5, f2 + f4 - f5);
        this.L(12.0f, f11, f13, 0.0f, geometricComputationEngine9206, f10, f9, geometricComputationEngine9204, geometricComputationEngine9205);
        this.L(12.0f, f11, f14, 0.0f, geometricComputationEngine9206, f10, f9, geometricComputationEngine9204, geometricComputationEngine9205);
        this.L(12.0f, f12, f13, 0.0f, geometricComputationEngine9206, f10, f9, geometricComputationEngine9204, geometricComputationEngine9205);
        this.L(12.0f, f12, f14, 0.0f, geometricComputationEngine9206, f10, f9, geometricComputationEngine9204, geometricComputationEngine9205);
        return this;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x48D6;
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
                throw new RuntimeException("a/e", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            RuntimeInstrumentationEngine.c[n2] = n3;
        }
        return c[n2];
    }

    private void m(String string) {
        this.y(string, CryptographicSessionController.x().E(this.y));
    }

    public RuntimeInstrumentationEngine z(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, Color color, Color color2) {
        long l = a ^ 0x2E99C62FDE3EL;
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        GeometricComputationEngine920 geometricComputationEngine9202 = new GeometricComputationEngine920(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
        this.H(z1.QUADS);
        this.q(9.0f, f4, f5, f6, geometricComputationEngine920);
        this.q(9.0f, f, f2, f3, geometricComputationEngine920);
        this.q(9.0f, f7, f8, f9, geometricComputationEngine9202);
        this.q(9.0f, f10, f11, f12, geometricComputationEngine9202);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)22258, (long)(0x7EBB35CF9516FBE1L ^ l)), (long)7333045212144118329L, (long)l)));
        return this;
    }

    public Supplier<Void> V() {
        return this.T;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a2' || c == '\u00ec' || c == 'U' || c == 'L') {
                field = RuntimeInstrumentationEngine.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'U' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = RuntimeInstrumentationEngine.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'v' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = RuntimeInstrumentationEngine.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = RuntimeInstrumentationEngine.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public RuntimeInstrumentationEngine r(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, Color color) {
        long l = a ^ 0xE26D16E7EBCL;
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.TRIANGLES);
        this.q(9.0f, f4, f5, f6, geometricComputationEngine920);
        this.q(9.0f, f, f2, f3, geometricComputationEngine920);
        this.q(9.0f, f7, f8, f9, geometricComputationEngine920);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)20195, (long)(0x53639A85D7D1C363L ^ l)), (long)-4231671178739381573L, (long)l)));
        return this;
    }

    public RuntimeInstrumentationEngine W(float f, float f2, float f3, float f4, Color color, float f5, float f6, float f7) {
        long l = a ^ 0x390D711E94CDL;
        float f8 = 0.5f;
        f = (float)((double)f - ((double)f7 - 0.5));
        f4 = (float)((double)f4 + (double)f7 * 1.5);
        float f9 = f + f8;
        float f10 = f + (f3 += f7 * 1.0f) - f8;
        float f11 = (f2 -= f7) + f8;
        float f12 = f2 + f4 - f8;
        FR fR = new FR(f5, f7, f6);
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(f + f5 + f6, f2 + f5 + f6, f + f3 - (f5 + f6), f2 + f4 - (f5 + f6));
        GeometricComputationEngine920 geometricComputationEngine9202 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.G(6.0f, f9, f11, 0.0f, fR, geometricComputationEngine920, geometricComputationEngine9202);
        this.G(6.0f, f9, f12, 0.0f, fR, geometricComputationEngine920, geometricComputationEngine9202);
        this.G(6.0f, f10, f11, 0.0f, fR, geometricComputationEngine920, geometricComputationEngine9202);
        this.G(6.0f, f10, f12, 0.0f, fR, geometricComputationEngine920, geometricComputationEngine9202);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)32060, (long)(0x7205A02942D9ADBL ^ l)), (long)3402225770906247370L, (long)l)));
        return this;
    }

    public RuntimeInstrumentationEngine S(float f, float f2, float f3, float f4, Color color) {
        long l = a ^ 0x5A7512D87D6FL;
        f -= f4 / 2.0f;
        f2 -= f4 / 2.0f;
        float f5 = f3 += f4;
        float f6 = f3;
        if (color == null) {
            color = Color.WHITE;
        }
        float f7 = f + f5;
        float f8 = f2 + f6;
        float f9 = f3 / 2.0f;
        GeospatialCoordinateTransformer geospatialCoordinateTransformer = new GeospatialCoordinateTransformer(f + f5 / 2.0f, f2 + f6 / 2.0f);
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 1.0f;
        float f13 = 1.0f;
        this.G(4.0f, f, f2, 0.0f, f10, f11, f9, f4, geospatialCoordinateTransformer, geometricComputationEngine920);
        this.G(4.0f, f, f8, 0.0f, f10, f13, f9, f4, geospatialCoordinateTransformer, geometricComputationEngine920);
        this.G(4.0f, f7, f2, 0.0f, f12, f11, f9, f4, geospatialCoordinateTransformer, geometricComputationEngine920);
        this.G(4.0f, f7, f8, 0.0f, f12, f13, f9, f4, geospatialCoordinateTransformer, geometricComputationEngine920);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)28619, (long)(0x7845182FD9BAE18CL ^ l)), (long)-4137329040546789016L, (long)l)));
        return this;
    }

    public RuntimeInstrumentationEngine D(NumericScrambler numericScrambler) {
        this.E = numericScrambler;
        return this;
    }

    private void q(float f, float f2, float f3, float f4, GeometricComputationEngine920 geometricComputationEngine920) {
        this.y(f, f2, f3, f4, this.U, 0.0f, geometricComputationEngine920);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/e" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public RuntimeInstrumentationEngine j(float f, float f2, float f3, float f4, Color color) {
        long l = a ^ 0x497553661CC2L;
        float f5 = f + f3;
        float f6 = f2 + f4;
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.q(9.0f, f, f2, 0.0f, geometricComputationEngine920);
        this.q(9.0f, f, f6, 0.0f, geometricComputationEngine920);
        this.q(9.0f, f5, f2, 0.0f, geometricComputationEngine920);
        this.q(9.0f, f5, f6, 0.0f, geometricComputationEngine920);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)3123, (long)(0x7D48FC0F87BE3DAL ^ l)), (long)-6397272937938589499L, (long)l)));
        return this;
    }

    public RuntimeInstrumentationEngine j(float f, float f2, float f3, float f4, float f5, float f6, Color color) {
        long l;
        block6: {
            l = a ^ 0x5855E026AA5CL;
            try {
                try {
                    if (f3 != 0.0f && f4 != 0.0f) break block6;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw RuntimeInstrumentationEngine.a(illegalArgumentException);
                }
                return null;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw RuntimeInstrumentationEngine.a(illegalArgumentException);
            }
        }
        float f7 = 0.5f;
        if (f5 == 0.0f) {
            f7 = 0.0f;
        }
        float f8 = Math.max(0.0f, (f5 += f7 * 2.0f) - f6);
        if (f5 != 0.0f) {
            f = (float)((double)f - ((double)f6 - 0.5));
            f2 -= f6;
            f4 = (float)((double)f4 + (double)f6 * 1.5);
            f3 += f6 * 1.0f;
        }
        float f9 = f + f3;
        float f10 = f2 + f4;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 1.0f;
        float f14 = 1.0f;
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(f + f5, f2 + f5, f + f3 - f5, f2 + f4 - f5);
        GeometricComputationEngine920 geometricComputationEngine9202 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.A(7.0f, f, f2, 0.0f, f11, f12, f8, geometricComputationEngine920, f6, geometricComputationEngine9202);
        this.A(7.0f, f, f10, 0.0f, f11, f14, f8, geometricComputationEngine920, f6, geometricComputationEngine9202);
        this.A(7.0f, f9, f2, 0.0f, f13, f12, f8, geometricComputationEngine920, f6, geometricComputationEngine9202);
        this.A(7.0f, f9, f10, 0.0f, f13, f14, f8, geometricComputationEngine920, f6, geometricComputationEngine9202);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)18393, (long)(0x25BDB8832D621EA7L ^ l)), (long)1271777648727809627L, (long)l)));
        return this;
    }

    private void L(float f, float f2, float f3, float f4, GeometricComputationEngine920 geometricComputationEngine920, float f5, float f6, GeometricComputationEngine920 geometricComputationEngine9202, GeometricComputationEngine920 geometricComputationEngine9203) {
        FR fR = new FR(f2, f3, f4);
        FR fR2 = new FR(f5, 0.0f, 0.0f);
        this.a(f, fR, this.O, geometricComputationEngine9203, 0.0f, f6, this.O, 0.0f, 0.0f, this.O, this.O, geometricComputationEngine920, fR2, 0.0f, geometricComputationEngine9202);
    }

    private void b(float f, float f2, float f3, float f4, float f5, float f6, float f7, GeospatialCoordinateTransformer geospatialCoordinateTransformer, float f8, float f9, GeometricComputationEngine920 geometricComputationEngine920) {
        FR fR = new FR(f2, f3, f4);
        this.a(f, fR, this.O, geometricComputationEngine920, f5, f7, geospatialCoordinateTransformer, f8, f9, this.O, this.O, this.U, new FR(f6, 0.0f, 0.0f), 0.0f, this.U);
    }

    public float[] D() {
        return this.P;
    }

    public RuntimeInstrumentationEngine H(float f, float f2, float f3, float f4, Color color, float f5, float f6, int n) {
        float f7;
        GeometricComputationEngine920 geometricComputationEngine920;
        GeometricComputationEngine920 geometricComputationEngine9202;
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        long l = a ^ 0x8F24CF75B18L;
        float f8 = 0.5f;
        if (f5 <= 0.0f) {
            f8 = 0.0f;
        }
        float f9 = Math.max(0.0f, (f5 += f8 * 2.0f) - f6);
        if (f5 > 0.0f) {
            f -= f6 - 0.5f;
            f2 -= f6;
            f4 += f6 * 1.0f;
            f3 += f6 * 1.0f;
        }
        float f10 = f + f8;
        float f11 = f + f3 - f8;
        float f12 = f2 + f8;
        float f13 = f2 + f4 - f8;
        try {
            bl4 = (n & 1) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw RuntimeInstrumentationEngine.a(illegalArgumentException);
        }
        boolean bl5 = bl4;
        try {
            bl3 = (n & 2) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw RuntimeInstrumentationEngine.a(illegalArgumentException);
        }
        boolean bl6 = bl3;
        try {
            bl2 = (n & 4) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw RuntimeInstrumentationEngine.a(illegalArgumentException);
        }
        boolean bl7 = bl2;
        try {
            bl = (n & 8) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw RuntimeInstrumentationEngine.a(illegalArgumentException);
        }
        boolean bl8 = bl;
        try {
            GeometricComputationEngine920 geometricComputationEngine9203;
            geometricComputationEngine9202 = geometricComputationEngine9203;
            geometricComputationEngine920 = geometricComputationEngine9203;
            f7 = bl5 ? 1.0f : 0.0f;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw RuntimeInstrumentationEngine.a(illegalArgumentException);
        }
        geometricComputationEngine9202(f7, bl6 ? 1.0f : 0.0f, bl7 ? 1.0f : 0.0f, bl8 ? 1.0f : 0.0f);
        GeometricComputationEngine920 geometricComputationEngine9204 = geometricComputationEngine920;
        GeometricComputationEngine920 geometricComputationEngine9205 = new GeometricComputationEngine920(f + f5, f2 + f5, f + f3 - f5, f2 + f4 - f5);
        GeometricComputationEngine920 geometricComputationEngine9206 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.A(5.0f, f10, f12, 0.0f, f9, geometricComputationEngine9205, f6, geometricComputationEngine9206, geometricComputationEngine9204);
        this.A(5.0f, f10, f13, 0.0f, f9, geometricComputationEngine9205, f6, geometricComputationEngine9206, geometricComputationEngine9204);
        this.A(5.0f, f11, f12, 0.0f, f9, geometricComputationEngine9205, f6, geometricComputationEngine9206, geometricComputationEngine9204);
        this.A(5.0f, f11, f13, 0.0f, f9, geometricComputationEngine9205, f6, geometricComputationEngine9206, geometricComputationEngine9204);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)21202, (long)(0x662C2DA32737AEBL ^ l)), (long)-2242208021509689569L, (long)l)));
        return this;
    }

    public RuntimeInstrumentationEngine Q(float f, float f2, float f3, float f4, Color color) {
        return this.H(f, f2, f3, f4, color, 1.5f, 1.0f, 0);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/e" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = RuntimeInstrumentationEngine.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = RuntimeInstrumentationEngine.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = RuntimeInstrumentationEngine.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = RuntimeInstrumentationEngine.a(clazz3, string2, clazz2)) != null) {
                    RuntimeInstrumentationEngine.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = RuntimeInstrumentationEngine.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        RuntimeInstrumentationEngine.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = RuntimeInstrumentationEngine.b(222230160601734L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = RuntimeInstrumentationEngine.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = RuntimeInstrumentationEngine.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public RuntimeInstrumentationEngine H(z1 z12) {
        return this.P(z12, CryptographicSessionController.x().t().O());
    }

    public RuntimeInstrumentationEngine E(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, Color color) {
        float f11;
        long l = a ^ 0x3A79D11E3DB3L;
        if (f3 == f4) {
            f11 = f5 / f6;
            f3 *= f11;
        }
        f11 = f + f3;
        float f12 = f2 + f4;
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.B(10.0f, f, f2, 0.0f, f7, f8, geometricComputationEngine920);
        this.B(10.0f, f, f12, 0.0f, f7, f10, geometricComputationEngine920);
        this.B(10.0f, f11, f2, 0.0f, f9, f8, geometricComputationEngine920);
        this.B(10.0f, f11, f12, 0.0f, f9, f10, geometricComputationEngine920);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)201, (long)(0x155B4EC17D284E44L ^ l)), (long)-8770442357728654924L, (long)l)));
        return this;
    }

    public RuntimeInstrumentationEngine o(float f, float f2, float f3, float f4, float f5, Color color) {
        long l = a ^ 0x29609386FEE3L;
        float f6 = f3 += f5;
        float f7 = f3;
        float f8 = (f -= f5 / 2.0f) + f6;
        float f9 = (f2 -= f5 / 2.0f) + f7;
        float f10 = f3 / 2.0f;
        float f11 = f10 - f4;
        GeospatialCoordinateTransformer geospatialCoordinateTransformer = new GeospatialCoordinateTransformer(f + f6 / 2.0f, f2 + f7 / 2.0f);
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.N(3.0f, f, f2, 0.0f, f11, f10, f5, geospatialCoordinateTransformer, geometricComputationEngine920);
        this.N(3.0f, f, f9, 0.0f, f11, f10, f5, geospatialCoordinateTransformer, geometricComputationEngine920);
        this.N(3.0f, f8, f2, 0.0f, f11, f10, f5, geospatialCoordinateTransformer, geometricComputationEngine920);
        this.N(3.0f, f8, f9, 0.0f, f11, f10, f5, geospatialCoordinateTransformer, geometricComputationEngine920);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)191, (long)(0x2A21316CAAF50D73L ^ l)), (long)4979066104804772580L, (long)l)));
        return this;
    }

    private static void b() {
        Object[] objectArray = f;
        f[0] = "|\"\u0011";
        objectArray[1] = Integer.TYPE;
        RuntimeInstrumentationEngine.g[1] = "java/lang/Integer";
        objectArray[2] = "8J\u000fR\u0013x3E\u001e\u001dn` B\u0017T";
        objectArray[3] = "S4\u0012tu\u0010X;\u0003;\u0014\u001eS0\u0007a";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "2\u0004\u0011w\u00068`\u0004\u0014H\u0017\"_BV7\u0000)oE^&\u0005Yf\u0007^9\u00006b\u0006\u00020|";
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public RuntimeInstrumentationEngine O(float f, float f2, float f3, float f4, Color color, float f5) {
        return this.H(f, f2, f3, f4, color, f5, 1.0f, 0);
    }

    public int[] q() {
        return this.Q;
    }

    public RuntimeInstrumentationEngine B(float f, float f2, float f3, float f4, float f5, float f6, float f7, Color color) {
        long l = a ^ 0x48336B8EDB33L;
        float f8 = (f3 += f5 * 4.0f) / 2.0f;
        GeospatialCoordinateTransformer geospatialCoordinateTransformer = new GeospatialCoordinateTransformer((f -= f5 * 2.0f) + f8, (f2 -= f5 * 2.0f) + f8);
        f8 = f8 - (f4 /= 2.0f) - 1.0f;
        float f9 = f8 - f4;
        float f10 = f + f3;
        float f11 = f2 + f3;
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        if (f7 != -360.0f) {
            f7 %= 360.0f;
        }
        float f12 = f6 % 360.0f + f7 * 0.5f;
        this.H(z1.QUADS);
        this.b(0.0f, f, f2, 0.0f, f9, f8, f5, geospatialCoordinateTransformer, f12, f7, geometricComputationEngine920);
        this.b(0.0f, f, f11, 0.0f, f9, f8, f5, geospatialCoordinateTransformer, f12, f7, geometricComputationEngine920);
        this.b(0.0f, f10, f2, 0.0f, f9, f8, f5, geospatialCoordinateTransformer, f12, f7, geometricComputationEngine920);
        this.b(0.0f, f10, f11, 0.0f, f9, f8, f5, geospatialCoordinateTransformer, f12, f7, geometricComputationEngine920);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)26444, (long)(0x443F613265044F58L ^ l)), (long)6974197229906800436L, (long)l)));
        return this;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = RuntimeInstrumentationEngine.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public DecompilationValidator n() {
        return this.F;
    }

    public z1 B() {
        return this.m;
    }

    public RuntimeInstrumentationEngine E(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        long l = a ^ 0x5EA82AF1D3E0L;
        float f9 = 0.0f;
        float f10 = 1.0f;
        float f11 = 1.0f;
        float f12 = 0.0f;
        float f13 = f + f3;
        float f14 = f2 + f4;
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(f + f6, f2 + f6, f + f3 - f6, f2 + f4 - f6);
        GeospatialCoordinateTransformer geospatialCoordinateTransformer = new GeospatialCoordinateTransformer(f3, f4);
        this.H(z1.QUADS);
        this.O(1.0f, f, f2, 0.0f, f9, f10, f7, f5, f6, f8, geometricComputationEngine920, geospatialCoordinateTransformer);
        this.O(1.0f, f, f14, 0.0f, f9, f12, f7, f5, f6, f8, geometricComputationEngine920, geospatialCoordinateTransformer);
        this.O(1.0f, f13, f2, 0.0f, f11, f10, f7, f5, f6, f8, geometricComputationEngine920, geospatialCoordinateTransformer);
        this.O(1.0f, f13, f14, 0.0f, f11, f12, f7, f5, f6, f8, geometricComputationEngine920, geospatialCoordinateTransformer);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)22151, (long)(0x4FB0E1D2C99E7642L ^ l)), (long)7501385049038956519L, (long)l)));
        return this;
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

    private void N(float f, float f2, float f3, float f4, float f5, float f6, float f7, GeospatialCoordinateTransformer geospatialCoordinateTransformer, GeometricComputationEngine920 geometricComputationEngine920) {
        FR fR = new FR(f2, f3, f4);
        this.a(f, fR, this.O, geometricComputationEngine920, f5, f7, geospatialCoordinateTransformer, 0.0f, 0.0f, this.O, this.O, this.U, new FR(f6, 0.0f, 0.0f), 0.0f, this.U);
    }

    public RuntimeInstrumentationEngine p(float f) {
        this.M = f;
        return this;
    }

    public RuntimeInstrumentationEngine b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, Color color) {
        return this.z(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, color, color);
    }

    public RuntimeInstrumentationEngine W(float f, float f2, float f3, float f4, Color color) {
        long l = a ^ 0x58DB8BBF0CBAL;
        float f5 = f3 += f4;
        float f6 = f3;
        float f7 = (f -= f4 / 2.0f) + f5;
        float f8 = (f2 -= f4 / 2.0f) + f6;
        float f9 = f3 / 2.0f;
        GeospatialCoordinateTransformer geospatialCoordinateTransformer = new GeospatialCoordinateTransformer(f + f5 / 2.0f, f2 + f6 / 2.0f);
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.V(2.0f, f, f2, 0.0f, f9, f4, geospatialCoordinateTransformer, geometricComputationEngine920);
        this.V(2.0f, f, f8, 0.0f, f9, f4, geospatialCoordinateTransformer, geometricComputationEngine920);
        this.V(2.0f, f7, f2, 0.0f, f9, f4, geospatialCoordinateTransformer, geometricComputationEngine920);
        this.V(2.0f, f7, f8, 0.0f, f9, f4, geospatialCoordinateTransformer, geometricComputationEngine920);
        this.m((String)((Object)RuntimeInstrumentationEngine.b("v", (int)RuntimeInstrumentationEngine.a("o", (int)10869, (long)(0x1B65874473D6D5E3L ^ l)), (long)-5242115719660144451L, (long)l)));
        return this;
    }

    public RuntimeInstrumentationEngine P(z1 z12, int n) {
        try {
            if (this.m != null) {
                return this;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw RuntimeInstrumentationEngine.a(illegalArgumentException);
        }
        this.m = z12;
        this.P = new float[n * this.h];
        this.Q = new int[z12.indicesCount];
        return this;
    }

    public RuntimeInstrumentationEngine() {
        this(4);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = RuntimeInstrumentationEngine.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method d(long l, long l2) {
        int n = RuntimeInstrumentationEngine.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = RuntimeInstrumentationEngine.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = RuntimeInstrumentationEngine.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = RuntimeInstrumentationEngine.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        RuntimeInstrumentationEngine.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = RuntimeInstrumentationEngine.b(222230160601734L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = RuntimeInstrumentationEngine.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        RuntimeInstrumentationEngine.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = RuntimeInstrumentationEngine.b(222230160601734L, 0L);
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

    public void p(int n, float f) {
        this.P[n] = f;
    }

    /*
     * Exception decompiling
     */
    public void y(String var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public RuntimeInstrumentationEngine W(Supplier<Void> supplier) {
        this.d = supplier;
        this.H(z1.QUADS);
        return this;
    }

    public float a() {
        return this.M;
    }

    public RuntimeInstrumentationEngine(EncodingStrategyEnum encodingStrategyEnum, boolean bl) {
        this(4, encodingStrategyEnum, bl);
    }

    public ResourceAllocationTracker882 A() {
        return this.j;
    }

    public EncodingStrategyEnum V() {
        return this.l;
    }

    private void G(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, GeospatialCoordinateTransformer geospatialCoordinateTransformer, GeometricComputationEngine920 geometricComputationEngine920) {
        FR fR = new FR(f2, f3, f4);
        GeospatialCoordinateTransformer geospatialCoordinateTransformer2 = new GeospatialCoordinateTransformer(f5, f6);
        this.a(f, fR, geospatialCoordinateTransformer2, geometricComputationEngine920, 0.0f, f8, geospatialCoordinateTransformer, 0.0f, 0.0f, this.O, this.O, this.U, new FR(f7, 0.0f, 0.0f), 0.0f, this.U);
    }

    public RuntimeInstrumentationEngine(int n) {
        this(n, EncodingStrategyEnum.DEFAULT, false);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(RuntimeInstrumentationEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(RuntimeInstrumentationEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

