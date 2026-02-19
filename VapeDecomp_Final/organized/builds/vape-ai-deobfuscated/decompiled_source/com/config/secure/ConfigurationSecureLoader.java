/*
 * Decompiled with CFR 0.152.
 */
package com.config.secure;

import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.network.secure.SecureConnectionOrchestrator;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
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

public class ConfigurationSecureLoader
extends AbstractComputationKernel {
    private static final String[] E;
    private static final long[] n;
    private String R;
    private static final Integer[] v;
    private String V;
    private static final Map B;
    private SecureConnectionOrchestrator Y;
    private String L;
    private String F;
    private static final long b;
    private static final Object[] D;

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ConfigurationSecureLoader.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ConfigurationSecureLoader.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ConfigurationSecureLoader.b = MultiContainerRegistry.a(-9094315427079927145L, -5403696201198446110L, MethodHandles.lookup().lookupClass()).a(234697956802039L);
                ConfigurationSecureLoader.D = new Object[5];
                ConfigurationSecureLoader.E = new String[5];
                ConfigurationSecureLoader.i();
                ConfigurationSecureLoader.B = new HashMap<K, V>(13);
                var0 = ConfigurationSecureLoader.b ^ 78115499014316L;
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
                var8_3 = new long[13];
                var5_4 = 0;
                var6_5 = "\u00c31\u00ff\u00e2ya\u008aLB\u009eR\u0086\u0001\u00a3\u00fa\u00e6g\u00d2\u0002\u00f9T\u00c7e\u00c3R&^\u00c4js\u00fdZKl\u00ae\u0010{\u0086h\u0000\\\u00d2\u00d6\u009dX\u00193u\u00d6\u00faN`!\u0006n\u0085\u0019\u0001\u00f3d\u00d8\u00c1\u0002\u00db\u00db<\u00b6\u00e6\u00f4kf\u0014\u00e1rK\u00a4\u0081\u00af\u00de\u0082\u0004\u008f\u00b4`\u0003\u0096\u00d0\u00fe";
                var7_6 = "\u00c31\u00ff\u00e2ya\u008aLB\u009eR\u0086\u0001\u00a3\u00fa\u00e6g\u00d2\u0002\u00f9T\u00c7e\u00c3R&^\u00c4js\u00fdZKl\u00ae\u0010{\u0086h\u0000\\\u00d2\u00d6\u009dX\u00193u\u00d6\u00faN`!\u0006n\u0085\u0019\u0001\u00f3d\u00d8\u00c1\u0002\u00db\u00db<\u00b6\u00e6\u00f4kf\u0014\u00e1rK\u00a4\u0081\u00af\u00de\u0082\u0004\u008f\u00b4`\u0003\u0096\u00d0\u00fe".length();
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
                    var6_5 = "~n\u0094Y\u00ac\u00c9r \u00c8M[\u00d2J.J\u00f3";
                    var7_6 = "~n\u0094Y\u00ac\u00c9r \u00c8M[\u00d2J.J\u00f3".length();
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
        ConfigurationSecureLoader.n = var8_3;
        ConfigurationSecureLoader.v = new Integer[13];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/RM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void M(double d2, float f) {
        block17: {
            block18: {
                block15: {
                    block16: {
                        if (f < 0.0f) {
                            f = 360.0f + f;
                        } else if (f > 359.0f) {
                            f = 360.0f - f;
                        }
                        f = Math.abs(f);
                        try {
                            try {
                                if (f % 45.0f != 0.0f) break block15;
                                if (this.Y.R()) break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConfigurationSecureLoader.a(customSystemException);
                            }
                            ConfigurationManager.x(this.F, (float)d2, (double)((float)this.Y.W()) + this.Y.b() / 2.0 - 6.0, 7.0, 10.0, this.Y.s(new Color(0, 0, 0, 100)));
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationSecureLoader.a(customSystemException);
                        }
                    }
                    ConfigurationManager.x(this.F, (float)d2, (double)((float)this.Y.W()) + this.Y.b() / 2.0 - 6.0, 7.0, 10.0, this.Y.s(Color.WHITE));
                    break block17;
                }
                try {
                    try {
                        if (f % 5.0f != 0.0f) break block17;
                        if (this.Y.R()) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationSecureLoader.a(customSystemException);
                    }
                    ConfigurationManager.O(this.R, (float)d2, (float)(this.Y.W() + this.Y.b() / 2.0 - 6.0), 7.0f, 8.0f, this.Y.s(new Color(0, 0, 0, 50)));
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationSecureLoader.a(customSystemException);
                }
            }
            ConfigurationManager.O(this.R, (float)d2, (float)(this.Y.W() + this.Y.b() / 2.0 - 6.0), 7.0f, 8.0f, this.Y.s(Color.WHITE));
        }
        if (f % 45.0f == 0.0f) {
            String string = this.J(f);
            if (string != null) {
                double d3 = this.L(0.7).D(string) / 2.0;
                this.q(string, d2 - d3, this.Y.W() + this.Y.b() / 2.0, this.Y.s(Color.WHITE), true);
            }
        } else if (f % 15.0f == 0.0f) {
            String string = String.valueOf((int)f);
            double d4 = this.L(0.7).D(string) / 2.0;
            this.q(string, d2 - d4, this.Y.W() + this.Y.b() / 2.0, this.Y.s(ConfigurationSecureLoader.M.n), false);
        }
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ConfigurationSecureLoader.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ConfigurationSecureLoader.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ConfigurationSecureLoader.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ConfigurationSecureLoader.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public ConfigurationSecureLoader(SecureConnectionOrchestrator secureConnectionOrchestrator) {
        long l = b ^ 0x237F77AE5848L;
        this.V = ConfigurationSecureLoader.c("\u00e8", (int)ConfigurationSecureLoader.b("y", (int)9487, (long)(0x350E52920E158F8L ^ l)), (long)-1048167064842044910L, (long)l);
        this.R = ConfigurationSecureLoader.c("\u00e8", (int)ConfigurationSecureLoader.b("y", (int)2304, (long)(0x11B0F128C424F4F5L ^ l)), (long)-1048167064842044910L, (long)l);
        this.F = ConfigurationSecureLoader.c("\u00e8", (int)ConfigurationSecureLoader.b("y", (int)17637, (long)(0x513F4A239D35B917L ^ l)), (long)-1048167064842044910L, (long)l);
        this.L = ConfigurationSecureLoader.c("\u00e8", (int)ConfigurationSecureLoader.b("y", (int)10914, (long)(0x3B0032A53EB9D75BL ^ l)), (long)-1048167064842044910L, (long)l);
        this.Y = secureConnectionOrchestrator;
    }

    private float a() {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        float f = systemConfigurationOrchestrator.q() % 360.0f;
        if (f < -180.0f) {
            f += 360.0f;
        }
        if (f > 180.0f) {
            f -= 360.0f;
        }
        return f + 180.0f;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xC85;
        if (v[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = ConfigurationSecureLoader.n[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])B.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    B.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/RM", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ConfigurationSecureLoader.v[n2] = n3;
        }
        return v[n2];
    }

    @Override
    public double z() {
        return 0.0;
    }

    @Override
    public double e() {
        return 0.0;
    }

    @Override
    public void N() {
        long l = b ^ 0x45A3A8F2925CL;
        TemporalMetadataResolver.x((String)((Object)ConfigurationSecureLoader.c("\u00e8", (int)ConfigurationSecureLoader.b("y", (int)31370, (long)(0x40B20E1CDEDF4D65L ^ l)), (long)4278506814469812230L, (long)l)));
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (E[n4] != null) {
            return n4;
        }
        Object object = D[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 43;
                break;
            }
            case 1: {
                n3 = 41;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 3: {
                n3 = 27;
                break;
            }
            case 4: {
                n3 = 38;
                break;
            }
            case 5: {
                n3 = 11;
                break;
            }
            case 6: {
                n3 = 22;
                break;
            }
            case 7: {
                n3 = 16;
                break;
            }
            case 8: {
                n3 = 28;
                break;
            }
            case 9: {
                n3 = 2;
                break;
            }
            case 10: {
                n3 = 4;
                break;
            }
            case 11: {
                n3 = 44;
                break;
            }
            case 12: {
                n3 = 31;
                break;
            }
            case 13: {
                n3 = 20;
                break;
            }
            case 14: {
                n3 = 45;
                break;
            }
            case 15: {
                n3 = 29;
                break;
            }
            case 16: {
                n3 = 49;
                break;
            }
            case 17: {
                n3 = 46;
                break;
            }
            case 18: {
                n3 = 62;
                break;
            }
            case 19: {
                n3 = 0;
                break;
            }
            case 20: {
                n3 = 53;
                break;
            }
            case 21: {
                n3 = 9;
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
                n3 = 47;
                break;
            }
            case 25: {
                n3 = 61;
                break;
            }
            case 26: {
                n3 = 13;
                break;
            }
            case 27: {
                n3 = 54;
                break;
            }
            case 28: {
                n3 = 15;
                break;
            }
            case 29: {
                n3 = 37;
                break;
            }
            case 30: {
                n3 = 36;
                break;
            }
            case 31: {
                n3 = 56;
                break;
            }
            case 32: {
                n3 = 26;
                break;
            }
            case 33: {
                n3 = 23;
                break;
            }
            case 34: {
                n3 = 18;
                break;
            }
            case 35: {
                n3 = 12;
                break;
            }
            case 36: {
                n3 = 6;
                break;
            }
            case 37: {
                n3 = 50;
                break;
            }
            case 38: {
                n3 = 21;
                break;
            }
            case 39: {
                n3 = 40;
                break;
            }
            case 40: {
                n3 = 10;
                break;
            }
            case 41: {
                n3 = 24;
                break;
            }
            case 42: {
                n3 = 14;
                break;
            }
            case 43: {
                n3 = 60;
                break;
            }
            case 44: {
                n3 = 55;
                break;
            }
            case 45: {
                n3 = 3;
                break;
            }
            case 46: {
                n3 = 5;
                break;
            }
            case 47: {
                n3 = 17;
                break;
            }
            case 48: {
                n3 = 19;
                break;
            }
            case 49: {
                n3 = 63;
                break;
            }
            case 50: {
                n3 = 32;
                break;
            }
            case 51: {
                n3 = 35;
                break;
            }
            case 52: {
                n3 = 30;
                break;
            }
            case 53: {
                n3 = 34;
                break;
            }
            case 54: {
                n3 = 8;
                break;
            }
            case 55: {
                n3 = 33;
                break;
            }
            case 56: {
                n3 = 59;
                break;
            }
            case 57: {
                n3 = 7;
                break;
            }
            case 58: {
                n3 = 25;
                break;
            }
            case 59: {
                n3 = 57;
                break;
            }
            case 60: {
                n3 = 51;
                break;
            }
            case 61: {
                n3 = 58;
                break;
            }
            case 62: {
                n3 = 52;
                break;
            }
            default: {
                n3 = 39;
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
        ConfigurationSecureLoader.E[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void d() {
    }

    private void E(String string, double d2, double d3, Color color, double d4) {
        StateTrackingCoordinator.y(color, (float)d2, (float)d3, string, (float)d4);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ConfigurationSecureLoader.e(l, l2);
            object = D[n];
            try {
                if (!(object instanceof String)) break block2;
                ConfigurationSecureLoader.D[n] = clazz = Class.forName(E[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/RM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void g() {
    }

    private String J(float f) {
        long l = b ^ 0x13EC17CC76F5L;
        try {
            if ((double)f == 0.0) {
                return ConfigurationSecureLoader.c("\u00e8", (int)ConfigurationSecureLoader.b("y", (int)15323, (long)(0x6ECC9946CD7D6896L ^ l)), (long)-2321296607515945809L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationSecureLoader.a(customSystemException);
        }
        try {
            if ((double)f == 45.0) {
                return ConfigurationSecureLoader.c("\u00e8", (int)ConfigurationSecureLoader.b("y", (int)12815, (long)(0x6A368C85ABEE143L ^ l)), (long)-2321296607515945809L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationSecureLoader.a(customSystemException);
        }
        try {
            if ((double)f == 90.0) {
                return ConfigurationSecureLoader.c("\u00e8", (int)ConfigurationSecureLoader.b("y", (int)5594, (long)(0x43BC6D284E8C693L ^ l)), (long)-2321296607515945809L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationSecureLoader.a(customSystemException);
        }
        try {
            if ((double)f == 135.0) {
                return ConfigurationSecureLoader.c("\u00e8", (int)ConfigurationSecureLoader.b("y", (int)9439, (long)(0x4585CB3527A6F79EL ^ l)), (long)-2321296607515945809L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationSecureLoader.a(customSystemException);
        }
        try {
            if ((double)f == 180.0) {
                return ConfigurationSecureLoader.c("\u00e8", (int)ConfigurationSecureLoader.b("y", (int)10009, (long)(0x65378D538D6745EL ^ l)), (long)-2321296607515945809L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationSecureLoader.a(customSystemException);
        }
        try {
            if ((double)f == 225.0) {
                return ConfigurationSecureLoader.c("\u00e8", (int)ConfigurationSecureLoader.b("y", (int)3081, (long)(0x65C081D523AC5F4CL ^ l)), (long)-2321296607515945809L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationSecureLoader.a(customSystemException);
        }
        try {
            if ((double)f == 270.0) {
                return ConfigurationSecureLoader.c("\u00e8", (int)ConfigurationSecureLoader.b("y", (int)12257, (long)(0xAA42F5054007CAAL ^ l)), (long)-2321296607515945809L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationSecureLoader.a(customSystemException);
        }
        try {
            if ((double)f == 315.0) {
                return ConfigurationSecureLoader.c("\u00e8", (int)ConfigurationSecureLoader.b("y", (int)15271, (long)(0x1A209AB784CDE8E9L ^ l)), (long)-2321296607515945809L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationSecureLoader.a(customSystemException);
        }
        return null;
    }

    private void q(String string, double d2, double d3, Color color, boolean bl) {
        block4: {
            CryptographicParameterGenerator cryptographicParameterGenerator;
            block3: {
                if (!this.Y.R()) {
                    bl = true;
                }
                cryptographicParameterGenerator = bl ? TemporalMetadataResolver.h.W().u(0.7, false) : TemporalMetadataResolver.h.W().S(0.7);
                try {
                    if (!this.Y.R()) break block3;
                    cryptographicParameterGenerator.K(string, d2, d3, this.Y.s(color), this.Y.s(new Color(0, 0, 0, 30)));
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationSecureLoader.a(customSystemException);
                }
            }
            cryptographicParameterGenerator.K(string, d2, d3, this.Y.s(new Color(230, 230, 230)), this.Y.s(new Color(0, 0, 0, 150)));
        }
    }

    @Override
    public void G() {
        this.I();
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cd' || c == '\u00d6' || c == '\u00e3' || c == 'k') {
                field = ConfigurationSecureLoader.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cd' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ConfigurationSecureLoader.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field g(long l, long l2) {
        int n = ConfigurationSecureLoader.e(l, l2);
        Object object = D[n];
        if (object instanceof String) {
            String string = E[n];
            int n2 = string.indexOf(8);
            Class clazz = ConfigurationSecureLoader.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ConfigurationSecureLoader.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ConfigurationSecureLoader.c(clazz3, string2, clazz2)) != null) {
                    ConfigurationSecureLoader.D[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ConfigurationSecureLoader.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ConfigurationSecureLoader.D[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ConfigurationSecureLoader.f(276521147741123L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void i() {
        Object[] objectArray = D;
        D[0] = "f2x";
        objectArray[1] = Integer.TYPE;
        ConfigurationSecureLoader.E[1] = "java/lang/Integer";
        objectArray[2] = "KSSZ;\u0016@\\B\u0015F\u000eS[K\\";
        objectArray[3] = "QTd\u000f\u001dcZ[u@|mQPq\u001a";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "~\u0010\u007fU\b/l\u000by.\u00198\u001dMr\u0010M }I#\u0012\u0018C$\u000f~G\u000b)cOzWr";
    }

    private void I() {
        GraphicsBufferAllocator.e(this.Y.G(), this.Y.W() - 10.0, this.Y.w(), this.Y.b() + 10.0);
        float f = this.a();
        float f2 = f - 70.0f;
        float f3 = f + 70.0f;
        StateTrackingCoordinator.d();
        double d2 = this.Y.G();
        float f4 = f2;
        while (f4 < f3) {
            float f5 = (float)((int)(f4 * 10.0f)) / 10.0f;
            this.M(d2 += (this.Y.w() + 4.0) / 1400.0, f5);
            float f6 = f5 + 0.1f;
            this.M(d2 += (this.Y.w() + 4.0) / 1400.0, f6);
            f4 = (float)((double)f4 + 0.2);
        }
        StateTrackingCoordinator.y();
        this.E(this.V, this.Y.G() - 5.0 + 2.3 + this.Y.w() / 2.0, this.Y.W() - 2.5, this.Y.A(), 0.5);
        String string = String.valueOf((int)f);
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().u(0.8, false);
        cryptographicParameterGenerator.K(string, this.Y.G() + this.Y.w() / 2.0 + 2.3 - cryptographicParameterGenerator.D(string) / 2.0, this.Y.W() - 8.0, this.Y.s(new Color(230, 230, 230)), this.Y.s(new Color(0, 0, 0, 180)));
        GraphicsBufferAllocator.F();
    }

    @Override
    public void U() {
        this.G();
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

    private static Method h(long l, long l2) {
        int n = ConfigurationSecureLoader.e(l, l2);
        Object object = D[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = E[n];
                int n3 = string2.indexOf(8);
                clazz3 = ConfigurationSecureLoader.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ConfigurationSecureLoader.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ConfigurationSecureLoader.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ConfigurationSecureLoader.D[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ConfigurationSecureLoader.f(276521147741123L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ConfigurationSecureLoader.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ConfigurationSecureLoader.D[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ConfigurationSecureLoader.f(276521147741123L, 0L);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ConfigurationSecureLoader.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ConfigurationSecureLoader.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

