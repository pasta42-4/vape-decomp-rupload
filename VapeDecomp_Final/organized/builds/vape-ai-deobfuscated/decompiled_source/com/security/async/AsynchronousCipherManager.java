/*
 * Decompiled with CFR 0.152.
 */
package com.security.async;

import a.a;
import a.bE;
import a.yX;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.processing.CollectionFilterProcessor;
import com.event.dispatch.EventDispatchController;
import com.event.management.EventDistributionHub;
import com.exception.system.CustomSystemException;
import com.execution.validation.ExecutionStateValidator;
import com.network.protocol.NetworkProtocolHandler1767;
import com.network.protocols.ProtocolNegotiationHandler;
import com.security.authentication.AuthenticationGateway1860;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.cipher.CipherParameterGenerator;
import com.security.crypto.CipherManager;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.ConfigurationProfileManager1223;
import com.system.lifecycle.SystemLifecycleController;
import com.ui.rendering.GraphicalRenderingController;
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

public class AsynchronousCipherManager
extends EventDispatchController {
    private boolean ac;
    private boolean aK;
    private final yX a9;
    private static final Map vb;
    private final ExecutionStateValidator<AuthenticationGateway1860> ap;
    private static final long[] lb;
    private static final long fb;
    private static final Integer[] ub;
    private final ProtocolNegotiationHandler aZ;
    private static AbstractComputationKernel[] aP;
    private static final Object[] wb;
    private static final String[] Hb;

    @Override
    public void i() {
        boolean bl;
        Color color;
        double d2;
        double d3;
        double d4;
        double d5;
        try {
            d5 = this.G();
            d4 = this.W();
            d3 = this.Q().w();
            d2 = this.W() ? 18.0 : 109.0;
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousCipherManager.c(customSystemException);
        }
        try {
            color = this.l();
            bl = this.Q() != null;
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousCipherManager.c(customSystemException);
        }
        ConfigurationManager.o(d5, d4, d3, d2, color, bl, 2.0f, 1.0f);
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AsynchronousCipherManager.f(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a4' || c == '\u00a2' || c == 'E' || c == '\u00d4') {
                field = AsynchronousCipherManager.w(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a2' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AsynchronousCipherManager.x(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ba' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public yX q() {
        return this.a9;
    }

    public AsynchronousCipherManager() {
        long l = fb ^ 0x131BDA181CD4L;
        super(a.cs((int)AsynchronousCipherManager.e("a", (int)32129, (long)(0x1D853184E0BD7469L ^ l))), a.cs((int)AsynchronousCipherManager.e("a", (int)23407, (long)(0x545DC291DC27D283L ^ l))));
        this.ap = new ExecutionStateValidator(SystemLifecycleController.C.q().t());
        this.ac = false;
        this.aK = false;
        EventDistributionHub eventDistributionHub = this.d();
        eventDistributionHub.o(false);
        eventDistributionHub.y(false);
        eventDistributionHub.m(false);
        eventDistributionHub.i(false);
        eventDistributionHub.v(false);
        eventDistributionHub.f((String)((Object)AsynchronousCipherManager.k("\u00c8", (int)AsynchronousCipherManager.e("a", (int)31440, (long)(0x1F7D682A5D41F339L ^ l)), (long)-7077659571047301563L, (long)l)));
        this.i(false);
        ConfigurationProfileManager1223 configurationProfileManager1223 = new ConfigurationProfileManager1223((String)((Object)AsynchronousCipherManager.k("\u00c8", (int)AsynchronousCipherManager.e("a", (int)4715, (long)(0x1A6ACC9A5F1B86L ^ l)), (long)-7077659571047301563L, (long)l)), SystemLifecycleController.C.q().m(), AsynchronousCipherManager.M.n);
        configurationProfileManager1223.g((String)((Object)AsynchronousCipherManager.k("\u00c8", (int)AsynchronousCipherManager.e("a", (int)14521, (long)(0x3E153DBEBEAAB156L ^ l)), (long)-7077659571047301563L, (long)l)));
        configurationProfileManager1223.I().n(20);
        this.aZ = ProtocolNegotiationHandler.e;
        AdaptiveCipherEngine adaptiveCipherEngine = new AdaptiveCipherEngine(this.aZ.d());
        AdaptiveCipherEngine adaptiveCipherEngine2 = new AdaptiveCipherEngine(SystemLifecycleController.C.q().c());
        adaptiveCipherEngine2.l(new NetworkProtocolHandler1767(this));
        AdaptiveCipherEngine adaptiveCipherEngine3 = new AdaptiveCipherEngine(this.aZ.V());
        adaptiveCipherEngine2.T(110.0);
        adaptiveCipherEngine.T(110.0);
        adaptiveCipherEngine3.T(110.0);
        this.ap.T(110.0);
        configurationProfileManager1223.T(110.0);
        this.Q().T(110.0);
        this.J(configurationProfileManager1223, this.ap, adaptiveCipherEngine2, adaptiveCipherEngine, adaptiveCipherEngine3);
        this.n(new bE(1.0, 4.0), new Object[0]);
        this.a9 = new yX();
        this.o(this.a9);
    }

    private static Method l(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AsynchronousCipherManager.k(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AsynchronousCipherManager.l(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static AbstractComputationKernel[] I() {
        return aP;
    }

    private static void X() {
        Object[] objectArray = wb;
        wb[0] = "\u0001yv";
        objectArray[1] = Integer.TYPE;
        AsynchronousCipherManager.Hb[1] = "java/lang/Integer";
        objectArray[2] = "*':>6C!(+qK[2/\"8";
        objectArray[3] = "7YK15g<VZ~Ti7]^$";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u000b 2.@\u0014Tq4\u0014E\u0011m6\"v@S\nr%f.S\u0014w1u\u0012\u0016U,d\u0014";
    }

    @Override
    public void d() {
        boolean bl;
        block29: {
            block30: {
                boolean bl2;
                block32: {
                    block31: {
                        block28: {
                            boolean bl3;
                            block27: {
                                block26: {
                                    boolean bl4;
                                    block25: {
                                        block24: {
                                            boolean bl5;
                                            CollectionFilterProcessor collectionFilterProcessor;
                                            block23: {
                                                block22: {
                                                    collectionFilterProcessor = SystemLifecycleController.C.q().m();
                                                    try {
                                                        try {
                                                            if (!ApplicationLifecycleManager.X().r() || !GraphicalRenderingController.K.k()) break block22;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw AsynchronousCipherManager.c(customSystemException);
                                                        }
                                                        bl5 = true;
                                                        break block23;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw AsynchronousCipherManager.c(customSystemException);
                                                    }
                                                }
                                                bl5 = false;
                                            }
                                            boolean bl6 = bl5;
                                            try {
                                                try {
                                                    try {
                                                        if (bl6 || GraphicalRenderingController.d instanceof CipherManager) break block24;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw AsynchronousCipherManager.c(customSystemException);
                                                    }
                                                    if (!this.i(collectionFilterProcessor)) break block24;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AsynchronousCipherManager.c(customSystemException);
                                                }
                                                bl4 = true;
                                                break block25;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AsynchronousCipherManager.c(customSystemException);
                                            }
                                        }
                                        bl4 = false;
                                    }
                                    bl = bl4;
                                    try {
                                        try {
                                            if (this.ap.y() != null && !this.ap.y().equals(SystemLifecycleController.C.q().b())) break block26;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AsynchronousCipherManager.c(customSystemException);
                                        }
                                        bl3 = true;
                                        break block27;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AsynchronousCipherManager.c(customSystemException);
                                    }
                                }
                                bl3 = false;
                            }
                            boolean bl7 = bl3;
                            try {
                                if (!bl7) break block28;
                                this.q().W(bl);
                                break block29;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousCipherManager.c(customSystemException);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (!bl || this.aK) break block30;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AsynchronousCipherManager.c(customSystemException);
                                }
                                AsynchronousCipherManager asynchronousCipherManager = this;
                                if (this.ac) break block31;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousCipherManager.c(customSystemException);
                            }
                            bl2 = true;
                            break block32;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousCipherManager.c(customSystemException);
                        }
                    }
                    bl2 = false;
                }
                asynchronousCipherManager.ac = bl2;
            }
            this.q().W(this.ac);
        }
        this.aK = bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                AsynchronousCipherManager.fb = MultiContainerRegistry.a(7475564612037412917L, 2367582645594801190L, MethodHandles.lookup().lookupClass()).a(45500358861840L);
                AsynchronousCipherManager.wb = new Object[5];
                AsynchronousCipherManager.Hb = new String[5];
                AsynchronousCipherManager.X();
                AsynchronousCipherManager.vb = new HashMap<K, V>(13);
                var0 = AsynchronousCipherManager.fb ^ 64174027611355L;
                AsynchronousCipherManager.P(new AbstractComputationKernel[3]);
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
                var6_5 = "\u007f\u0094\u00fd\u0013=\u00a6\u00a1\u00d9\b0\t0s}E/\u001e\u00d0\u00b0\u0095F\u00dc}P{\u00d2\u0005#B5\u00e2n";
                var7_6 = "\u007f\u0094\u00fd\u0013=\u00a6\u00a1\u00d9\b0\t0s}E/\u001e\u00d0\u00b0\u0095F\u00dc}P{\u00d2\u0005#B5\u00e2n".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u0080\u009d\u008a&\u00fb\u00dd\u00ac|:\u00dc#g\u00d4\u00ffE\u00c7";
                    var7_6 = "\u0080\u009d\u008a&\u00fb\u00dd\u00ac|:\u00dc#g\u00d4\u00ffE\u00c7".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        AsynchronousCipherManager.lb = var8_3;
        AsynchronousCipherManager.ub = new Integer[6];
    }

    static yX o(AsynchronousCipherManager asynchronousCipherManager) {
        return asynchronousCipherManager.a9;
    }

    public static void P(AbstractComputationKernel[] abstractComputationKernelArray) {
        aP = abstractComputationKernelArray;
    }

    private static int u(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (Hb[n4] != null) {
            return n4;
        }
        Object object = wb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 9;
                break;
            }
            case 1: {
                n3 = 1;
                break;
            }
            case 2: {
                n3 = 37;
                break;
            }
            case 3: {
                n3 = 47;
                break;
            }
            case 4: {
                n3 = 57;
                break;
            }
            case 5: {
                n3 = 22;
                break;
            }
            case 6: {
                n3 = 24;
                break;
            }
            case 7: {
                n3 = 33;
                break;
            }
            case 8: {
                n3 = 49;
                break;
            }
            case 9: {
                n3 = 10;
                break;
            }
            case 10: {
                n3 = 63;
                break;
            }
            case 11: {
                n3 = 60;
                break;
            }
            case 12: {
                n3 = 25;
                break;
            }
            case 13: {
                n3 = 43;
                break;
            }
            case 14: {
                n3 = 23;
                break;
            }
            case 15: {
                n3 = 8;
                break;
            }
            case 16: {
                n3 = 13;
                break;
            }
            case 17: {
                n3 = 18;
                break;
            }
            case 18: {
                n3 = 56;
                break;
            }
            case 19: {
                n3 = 2;
                break;
            }
            case 20: {
                n3 = 26;
                break;
            }
            case 21: {
                n3 = 34;
                break;
            }
            case 22: {
                n3 = 62;
                break;
            }
            case 23: {
                n3 = 54;
                break;
            }
            case 24: {
                n3 = 51;
                break;
            }
            case 25: {
                n3 = 35;
                break;
            }
            case 26: {
                n3 = 38;
                break;
            }
            case 27: {
                n3 = 41;
                break;
            }
            case 28: {
                n3 = 7;
                break;
            }
            case 29: {
                n3 = 46;
                break;
            }
            case 30: {
                n3 = 40;
                break;
            }
            case 31: {
                n3 = 16;
                break;
            }
            case 32: {
                n3 = 55;
                break;
            }
            case 33: {
                n3 = 15;
                break;
            }
            case 34: {
                n3 = 28;
                break;
            }
            case 35: {
                n3 = 32;
                break;
            }
            case 36: {
                n3 = 44;
                break;
            }
            case 37: {
                n3 = 29;
                break;
            }
            case 38: {
                n3 = 50;
                break;
            }
            case 39: {
                n3 = 48;
                break;
            }
            case 40: {
                n3 = 27;
                break;
            }
            case 41: {
                n3 = 5;
                break;
            }
            case 42: {
                n3 = 4;
                break;
            }
            case 43: {
                n3 = 59;
                break;
            }
            case 44: {
                n3 = 20;
                break;
            }
            case 45: {
                n3 = 12;
                break;
            }
            case 46: {
                n3 = 45;
                break;
            }
            case 47: {
                n3 = 21;
                break;
            }
            case 48: {
                n3 = 17;
                break;
            }
            case 49: {
                n3 = 19;
                break;
            }
            case 50: {
                n3 = 3;
                break;
            }
            case 51: {
                n3 = 14;
                break;
            }
            case 52: {
                n3 = 58;
                break;
            }
            case 53: {
                n3 = 36;
                break;
            }
            case 54: {
                n3 = 53;
                break;
            }
            case 55: {
                n3 = 0;
                break;
            }
            case 56: {
                n3 = 11;
                break;
            }
            case 57: {
                n3 = 52;
                break;
            }
            case 58: {
                n3 = 30;
                break;
            }
            case 59: {
                n3 = 61;
                break;
            }
            case 60: {
                n3 = 42;
                break;
            }
            case 61: {
                n3 = 39;
                break;
            }
            case 62: {
                n3 = 6;
                break;
            }
            default: {
                n3 = 31;
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
        AsynchronousCipherManager.Hb[n4] = new String(cArray);
        return n4;
    }

    @Override
    public String A() {
        long l = fb ^ 0x21636A87C283L;
        return AsynchronousCipherManager.k("\u00c8", (int)AsynchronousCipherManager.e("a", (int)8061, (long)(0x7A1EE15411C148C4L ^ l)), (long)4868435616578871314L, (long)l);
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wa" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method k(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field w(long l, long l2) {
        int n = AsynchronousCipherManager.u(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            String string = Hb[n];
            int n2 = string.indexOf(8);
            Class clazz = AsynchronousCipherManager.v(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AsynchronousCipherManager.v(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AsynchronousCipherManager.k(clazz3, string2, clazz2)) != null) {
                    AsynchronousCipherManager.wb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AsynchronousCipherManager.l(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AsynchronousCipherManager.wb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AsynchronousCipherManager.v(259336223562921L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x142A;
        if (ub[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = lb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])vb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    vb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/wa", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AsynchronousCipherManager.ub[n2] = n3;
        }
        return ub[n2];
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AsynchronousCipherManager.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite k(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wa" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method x(long l, long l2) {
        int n = AsynchronousCipherManager.u(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = Hb[n];
                int n3 = string2.indexOf(8);
                clazz3 = AsynchronousCipherManager.v(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AsynchronousCipherManager.v(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AsynchronousCipherManager.k(clazz, string, clazz2, n2, classArray2)) != null) {
                        AsynchronousCipherManager.wb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AsynchronousCipherManager.v(259336223562921L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AsynchronousCipherManager.l(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AsynchronousCipherManager.wb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AsynchronousCipherManager.v(259336223562921L, 0L);
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

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = AsynchronousCipherManager.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AsynchronousCipherManager.l(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class v(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AsynchronousCipherManager.u(l, l2);
            object = wb[n];
            try {
                if (!(object instanceof String)) break block2;
                AsynchronousCipherManager.wb[n] = clazz = Class.forName(Hb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private boolean i(CollectionFilterProcessor collectionFilterProcessor) {
        boolean bl;
        try {
            if (collectionFilterProcessor.Z().isEmpty()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousCipherManager.c(customSystemException);
        }
        int n = 0;
        for (int n2 : collectionFilterProcessor.Z()) {
            try {
                if (!CipherParameterGenerator.X(n2)) continue;
                ++n;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousCipherManager.c(customSystemException);
            }
        }
        try {
            bl = n == collectionFilterProcessor.Z().size();
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousCipherManager.c(customSystemException);
        }
        return bl;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AsynchronousCipherManager.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(AsynchronousCipherManager.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

