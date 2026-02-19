/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F9;
import com.app.core.interfaces.OperationExecutionInterface;
import com.app.workflow.StateTrackingCoordinator;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.filtering.ConcurrentFilteringCoordinator;
import com.core.computation.AbstractComputationKernel;
import com.data.transformation.DataTransformationService2225;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicsRenderingUtility;
import com.hardware.management.HardwareYield;
import com.network.connection.NetworkConnectionBroker;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bP
extends AbstractComputationKernel {
    private static final Map eb;
    private final HardwareYield n;
    private static final String[] jb;
    private final AdaptiveRenderingEngine B;
    private boolean v;
    private static final Object[] fb;
    private static final long[] bb;
    private final GraphicsRenderingUtility L;
    private final AuthenticationStateTracker D;
    private boolean b;
    private static final Integer[] db;
    private final GraphicsRenderingUtility Y;
    private static final long ab;
    private final GraphicsRenderingUtility Gq;
    private final ConcurrentFilteringCoordinator E;
    private final AuthenticationStateTracker V;
    private final AdaptiveCipherEngine R;
    private final AdaptiveCipherEngine F;

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = bP.e(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                bP.fb[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'N' || c == 'd' || c == '\u00e6' || c == '\u00f5') {
                field = bP.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'N' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'd' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bP.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'r' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00b5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void U() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                bP.ab = MultiContainerRegistry.a(8340236132273340751L, -7630869390471523799L, MethodHandles.lookup().lookupClass()).a(161613892205648L);
                bP.fb = new Object[5];
                bP.jb = new String[5];
                bP.a();
                bP.eb = new HashMap<K, V>(13);
                var0 = bP.ab ^ 74009940556050L;
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
                var6_5 = "\u0011\u00dc\u0006\t\u00b4\u0014x\u00d9:\u00ee \u0092\u00a1\u00d2B\u00c5\u000e\u00a4\u0001p\u00e3\u00ba\u0083\u00c4";
                var7_6 = "\u0011\u00dc\u0006\t\u00b4\u0014x\u00d9:\u00ee \u0092\u00a1\u00d2B\u00c5\u000e\u00a4\u0001p\u00e3\u00ba\u0083\u00c4".length();
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
                    var6_5 = "\u00d6\u00e6\u0095q\r\u00ff\u000bC\u00cb\u00c7\u00a9Df\u00dd\u00f2o";
                    var7_6 = "\u00d6\u00e6\u0095q\r\u00ff\u000bC\u00cb\u00c7\u00a9Df\u00dd\u00f2o".length();
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
        bP.bb = var8_3;
        bP.db = new Integer[5];
    }

    public bP h(OperationExecutionInterface operationExecutionInterface) {
        this.n.N(operationExecutionInterface);
        return this;
    }

    public boolean Q() {
        return this.R.j();
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = bP.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = bP.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = bP.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
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
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 5;
                break;
            }
            case 2: {
                n3 = 14;
                break;
            }
            case 3: {
                n3 = 7;
                break;
            }
            case 4: {
                n3 = 12;
                break;
            }
            case 5: {
                n3 = 54;
                break;
            }
            case 6: {
                n3 = 36;
                break;
            }
            case 7: {
                n3 = 29;
                break;
            }
            case 8: {
                n3 = 43;
                break;
            }
            case 9: {
                n3 = 20;
                break;
            }
            case 10: {
                n3 = 0;
                break;
            }
            case 11: {
                n3 = 27;
                break;
            }
            case 12: {
                n3 = 59;
                break;
            }
            case 13: {
                n3 = 21;
                break;
            }
            case 14: {
                n3 = 32;
                break;
            }
            case 15: {
                n3 = 53;
                break;
            }
            case 16: {
                n3 = 39;
                break;
            }
            case 17: {
                n3 = 10;
                break;
            }
            case 18: {
                n3 = 47;
                break;
            }
            case 19: {
                n3 = 42;
                break;
            }
            case 20: {
                n3 = 57;
                break;
            }
            case 21: {
                n3 = 25;
                break;
            }
            case 22: {
                n3 = 15;
                break;
            }
            case 23: {
                n3 = 9;
                break;
            }
            case 24: {
                n3 = 17;
                break;
            }
            case 25: {
                n3 = 35;
                break;
            }
            case 26: {
                n3 = 26;
                break;
            }
            case 27: {
                n3 = 19;
                break;
            }
            case 28: {
                n3 = 45;
                break;
            }
            case 29: {
                n3 = 34;
                break;
            }
            case 30: {
                n3 = 11;
                break;
            }
            case 31: {
                n3 = 55;
                break;
            }
            case 32: {
                n3 = 33;
                break;
            }
            case 33: {
                n3 = 40;
                break;
            }
            case 34: {
                n3 = 3;
                break;
            }
            case 35: {
                n3 = 51;
                break;
            }
            case 36: {
                n3 = 41;
                break;
            }
            case 37: {
                n3 = 6;
                break;
            }
            case 38: {
                n3 = 38;
                break;
            }
            case 39: {
                n3 = 18;
                break;
            }
            case 40: {
                n3 = 52;
                break;
            }
            case 41: {
                n3 = 16;
                break;
            }
            case 42: {
                n3 = 8;
                break;
            }
            case 43: {
                n3 = 13;
                break;
            }
            case 44: {
                n3 = 44;
                break;
            }
            case 45: {
                n3 = 46;
                break;
            }
            case 46: {
                n3 = 56;
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
                n3 = 63;
                break;
            }
            case 50: {
                n3 = 48;
                break;
            }
            case 51: {
                n3 = 49;
                break;
            }
            case 52: {
                n3 = 4;
                break;
            }
            case 53: {
                n3 = 37;
                break;
            }
            case 54: {
                n3 = 23;
                break;
            }
            case 55: {
                n3 = 22;
                break;
            }
            case 56: {
                n3 = 61;
                break;
            }
            case 57: {
                n3 = 62;
                break;
            }
            case 58: {
                n3 = 50;
                break;
            }
            case 59: {
                n3 = 60;
                break;
            }
            case 60: {
                n3 = 31;
                break;
            }
            case 61: {
                n3 = 2;
                break;
            }
            case 62: {
                n3 = 30;
                break;
            }
            default: {
                n3 = 28;
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
        bP.jb[n4] = new String(cArray);
        return n4;
    }

    public void u(boolean bl) {
        this.R.c(bl);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
    public double e() {
        return 110.0;
    }

    @Override
    public void G() {
        CallSite callSite;
        float f;
        float f2;
        Color color;
        long l = ab ^ 0x7D0756B4B3EAL;
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(0.9);
        String string = this.E.U();
        double d2 = cryptographicParameterGenerator.B(string);
        double d3 = 18.0;
        double d4 = this.b() - 3.0;
        Color color2 = bP.M.n;
        try {
            double d5 = this.G();
            this.getClass();
            double d6 = d5 + 5.0 - 0.5;
            double d7 = this.W() + 1.0 - 0.5;
            double d8 = this.w();
            this.getClass();
            ConfigurationManager.S(d6, d7, d8 - (double)(5.0f * 2.0f) + 1.0, d4 - 2.0 + 1.0, this.E.e());
            double d9 = this.G();
            this.getClass();
            double d10 = d9 + 5.0;
            double d11 = this.W() + 1.0;
            double d12 = this.w();
            this.getClass();
            ConfigurationManager.S(d10, d11, d12 - (double)(5.0f * 2.0f), d4 - 2.0, bP.M.g);
            color = Color.WHITE;
            float f3 = (float)this.G();
            this.getClass();
            f2 = f3 + 5.0f * 2.0f;
            double d13 = this.W();
            this.getClass();
            f = (float)(d13 + (double)(5.0f * 2.0f)) - 2.0f;
            callSite = this.v ? bP.c("\u00b5", (int)bP.b("t", (int)30667, (long)(0x129081324C2AAEDCL ^ l)), (long)8938330671793004981L, (long)l) : bP.c("\u00b5", (int)bP.b("t", (int)27833, (long)(0x74DCBCB02AA835AFL ^ l)), (long)8938330671793004981L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw bP.a(customSystemException);
        }
        StateTrackingCoordinator.B(color, f2, f, (String)((Object)callSite), 2.0f, 2.0f, false);
        double d14 = this.G() + this.w() - 30.0;
        double d15 = this.W() + d3 / 2.0 - d2 / 2.0;
        GraphicsBufferAllocator.e(this.G(), this.W(), d14 - this.G(), d3);
        double d16 = this.G();
        this.getClass();
        double d17 = d16 + (double)(5.0f * 3.0f);
        this.getClass();
        cryptographicParameterGenerator.R(string, d17 + 8.0, d15, color2);
        GraphicsBufferAllocator.F();
        double d18 = cryptographicParameterGenerator.B(string);
        double d19 = d14;
        double d20 = d19 - 10.0;
        double d21 = d15 - 2.0;
        double d22 = d21 + d18 + 2.0;
        GraphicsBufferAllocator.Y(new Color(bP.M.g.getRed(), bP.M.g.getGreen(), bP.M.g.getBlue(), 0), bP.M.g, d19, d22, d19, d21, d20, d21, d20, d22);
        double d23 = this.G() + this.w();
        this.getClass();
        double d24 = d23 - 5.0 * 1.5;
        this.getClass();
        this.n.b(d24 - 8.0);
        this.n.M(this.W());
        this.n.w(d3);
        this.R.i(false);
        this.R.b(d14);
        this.R.M(this.W());
        this.R.T(12.0);
        this.R.w(d3);
        this.R.J(true);
        this.Gq.N(this.v);
        this.Y.N(this.v);
        this.L.N(this.v);
        this.F.N(this.v);
        this.Gq.b(this.G() + 6.0);
        this.Y.b(this.G() + 6.0);
        this.L.b(this.G() + 6.0);
        this.Gq.M(this.W() + 16.0);
        this.Y.M(this.W() + 40.0);
        this.L.M(this.W() + 65.0);
        this.F.i(false);
        this.F.b(this.G() + 8.0);
        this.F.M(90.0 + this.W());
        this.F.T(this.w() - 16.0);
        this.F.J(true);
        this.F.w(12.0);
        this.E.e(this.B.G());
    }

    @Override
    public void g() {
        this.b = true;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x251D;
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
                throw new RuntimeException("a/bP", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bP.db[n2] = n3;
        }
        return db[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = bP.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    static AuthenticationStateTracker h(bP bP2) {
        return bP2.V;
    }

    private static Field g(long l, long l2) {
        int n = bP.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = bP.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = bP.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bP.c(clazz3, string2, clazz2)) != null) {
                    bP.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = bP.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        bP.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bP.f(238091449209777L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void a() {
        Object[] objectArray = fb;
        fb[0] = "\r\u001b ";
        objectArray[1] = Integer.TYPE;
        bP.jb[1] = "java/lang/Integer";
        objectArray[2] = "\u000fO,/f\u0006\u0004@=`\u001b\u001e\u0017G4)";
        objectArray[3] = "\u0010y=\f>v\u001bv,C_x\u0010}(\u0019";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "8k={\u0002\rd7\"KYMX!?9V\u0007#2(92\u000f''{(SP%`,K";
    }

    public bP(ConcurrentFilteringCoordinator concurrentFilteringCoordinator) {
        long l = ab ^ 0x1C86372D52B5L;
        this.V = AuthenticationStateTracker.w(null, "", false);
        this.R = new AdaptiveCipherEngine(this.V);
        this.D = AuthenticationStateTracker.w(null, (String)((Object)bP.c("\u00b5", (int)bP.b("t", (int)8122, (long)(0x5C11156032B3A7F0L ^ l)), (long)-7109998663163019030L, (long)l)), false);
        this.F = new AdaptiveCipherEngine(this.D);
        this.n = new HardwareYield((String)((Object)bP.c("\u00b5", (int)bP.b("t", (int)21555, (long)(0x5C84C4DAD321EC7FL ^ l)), (long)-7109998663163019030L, (long)l)));
        this.E = concurrentFilteringCoordinator;
        this.B = AdaptiveRenderingEngine.C(null, concurrentFilteringCoordinator.U(), concurrentFilteringCoordinator.e());
        this.Gq = new GraphicsRenderingUtility(F9.RAINBOW, this.B, (String)((Object)bP.c("\u00b5", (int)bP.b("t", (int)18675, (long)(0x86E13FC4B3270B8L ^ l)), (long)-7109998663163019030L, (long)l)), 1.0);
        this.Gq.M(this);
        this.Y = new GraphicsRenderingUtility(F9.SATURATION, this.B, "", 1.0);
        this.L = new GraphicsRenderingUtility(F9.VIBRANCE, this.B, "", 1.0);
        this.Gq.J(true);
        this.Gq.T(98.0);
        this.Y.J(true);
        this.Y.T(98.0);
        this.L.J(true);
        this.L.T(98.0);
        this.Gq.Q(bP.M.g);
        this.Y.Q(bP.M.g);
        this.L.Q(bP.M.g);
        this.V.H(concurrentFilteringCoordinator.o());
        this.R.R();
        this.R.l(new DataTransformationService2225(this, concurrentFilteringCoordinator));
        this.D.H(concurrentFilteringCoordinator.f());
        this.F.R();
        this.F.l(new NetworkConnectionBroker(this, concurrentFilteringCoordinator));
        concurrentFilteringCoordinator.e(this.B.L().getRGB());
        this.o(this.R, this.n, this.F, this.Gq, this.Y, this.L);
    }

    @Override
    public void d() {
        block4: {
            try {
                try {
                    if (!this.b || this.s()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw bP.a(customSystemException);
                }
                this.b = false;
            }
            catch (CustomSystemException customSystemException) {
                throw bP.a(customSystemException);
            }
        }
    }

    @Override
    public double z() {
        double d2;
        try {
            d2 = this.v ? 110.0 : 18.0;
        }
        catch (CustomSystemException customSystemException) {
            throw bP.a(customSystemException);
        }
        return d2 + 3.0;
    }

    static AuthenticationStateTracker B(bP bP2) {
        return bP2.D;
    }

    private static Method h(long l, long l2) {
        int n = bP.e(l, l2);
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
                clazz3 = bP.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = bP.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bP.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        bP.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bP.f(238091449209777L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = bP.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        bP.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bP.f(238091449209777L, 0L);
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
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        boolean bl;
        try {
            if ((double)userInteractionEventDispatcher.getY() > this.W() + 20.0 - 2.0) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw bP.a(customSystemException);
        }
        try {
            bP bP2 = this;
            bl = !this.v;
        }
        catch (CustomSystemException customSystemException) {
            throw bP.a(customSystemException);
        }
        bP2.v = bl;
        this.F().A();
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = bP.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = bP.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bP.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(bP.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

