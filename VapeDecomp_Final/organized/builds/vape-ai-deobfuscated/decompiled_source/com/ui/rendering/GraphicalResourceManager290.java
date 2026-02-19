/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.ui.rendering;

import a.Ne;
import a.Qh;
import a.a;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.encoding.protocol.EncodingProtocolEnum;
import com.event.dispatch.EventDispatchRegistry2111;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.graph.structure.RecursiveNodeGraph;
import com.math.computation.NumericComputationEngine1131;
import com.math.computation.NumericComputationFramework;
import com.network.protocol.NetworkProtocolNegotiator;
import com.random.generation.RandomGenerationEngine;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.resource.allocation.ResourceAllocationManager2527;
import com.runtime.context.ContextualExecutionFramework;
import com.security.auth.AuthenticationTokenGenerator2563;
import com.security.crypto.CipherContextManager784;
import com.security.crypto.CryptographicSecurityProvider;
import com.security.negotiation.CryptoContextNegotiator684;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.ExecutionStateTracker;
import com.temporal.metadata.TemporalMetadataResolver;
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
import org.lwjgl.opengl.GL11;

public class GraphicalResourceManager290
extends ContextualExecutionFramework {
    private static final long b;
    private static final String[] m;
    private static final Map h;
    private Qh O;
    private NumericComputationFramework l;
    private static final Object[] j;
    private final Color F;
    private static final long[] d;
    private final Color T;
    private CipherContextManager784 R;
    private static final Integer[] e;
    private NumericComputationFramework P;

    public RandomGenerationEngine c(Qh qh) {
        RandomGenerationEngine randomGenerationEngine = ConfigurationCalibrator.b.N();
        try {
            if (randomGenerationEngine == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalResourceManager290.a(customSystemException);
        }
        if (randomGenerationEngine instanceof CryptographicSecurityProvider) {
            CryptographicSecurityProvider cryptographicSecurityProvider = (CryptographicSecurityProvider)randomGenerationEngine;
            CryptographicSecurityProvider cryptographicSecurityProvider2 = new CryptographicSecurityProvider(qh);
            cryptographicSecurityProvider2.j(cryptographicSecurityProvider);
            return cryptographicSecurityProvider2;
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void C(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        block4: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = eventDispatchRegistry2111.getThePlayer();
            try {
                try {
                    if (!systemConfigurationOrchestrator.Y() && this.R != null) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalResourceManager290.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalResourceManager290.a(customSystemException);
            }
        }
        this.v(eventDispatchRegistry2111);
    }

    private void v(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        double d2;
        double d3;
        double d4;
        double d5 = this.O.F();
        double d6 = this.O.V();
        double d7 = this.O.B();
        double d8 = this.O.f();
        double d9 = this.O.l();
        double d10 = this.O.n();
        float f = ApplicationLifecycleManager.K().h();
        float f2 = this.O.A() + (this.O.q() - this.O.A()) * f;
        double d11 = d8 + (d5 - d8) * (double)f;
        double d12 = d9 + (d6 - d9) * (double)f;
        double d13 = d10 + (d7 - d10) * (double)f;
        CryptoContextNegotiator684.Y();
        ApplicationLifecycleManager.U().H(1.0);
        GraphicsBufferAllocator.V();
        Ne.h.y(3042);
        GL11.glBlendFunc((int)770, (int)771);
        Ne.h.h(1.5f);
        Ne.h.z(3553);
        Ne.h.y(2848);
        Ne.h.z(2929);
        GL11.glDepthMask((boolean)false);
        if (GameVersionEnumerator.MC_1_20_6.H()) {
            d4 = NumericComputationEngine1131.b();
            d3 = NumericComputationEngine1131.S();
            d2 = NumericComputationEngine1131.n();
        } else {
            NumericComputationEngine1131 numericComputationEngine1131 = ApplicationLifecycleManager.r();
            d4 = numericComputationEngine1131.L();
            d3 = numericComputationEngine1131.D();
            d2 = numericComputationEngine1131.s();
        }
        double d14 = this.O.S().f() - this.O.S().F() + (double)this.O.g();
        double d15 = d14 / 2.0;
        CryptoContextNegotiator684.x(d11 - d15, d12, d13 - d15, d14, this.O.L(), d14, 1.5, this.F, this.T, d4, d3, d2);
        GL11.glDepthMask((boolean)true);
        Ne.h.y(2929);
        Ne.h.y(3553);
        Ne.h.z(2848);
        Ne.h.z(3042);
        GraphicsBufferAllocator.E();
        ApplicationLifecycleManager.U().F(1.0);
        CryptoContextNegotiator684.J();
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGHEST)
    public void e(ResourceAllocationManager2527 resourceAllocationManager2527) {
        NetworkProtocolNegotiator networkProtocolNegotiator;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        ExecutionStateTracker executionStateTracker;
        block8: {
            executionStateTracker = resourceAllocationManager2527.getGameSettings();
            systemConfigurationOrchestrator = resourceAllocationManager2527.getThePlayer();
            networkProtocolNegotiator = systemConfigurationOrchestrator.N();
            try {
                try {
                    if (!systemConfigurationOrchestrator.Y() && !networkProtocolNegotiator.Y()) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalResourceManager290.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalResourceManager290.a(customSystemException);
            }
        }
        this.l = new NumericComputationFramework(systemConfigurationOrchestrator);
        if (this.R == null) {
            this.R = new CipherContextManager784(systemConfigurationOrchestrator, systemConfigurationOrchestrator, networkProtocolNegotiator, this.l);
            this.R.w(this.l);
            this.O = this.R.a();
            RandomGenerationEngine randomGenerationEngine = this.c(systemConfigurationOrchestrator);
            try {
                if (randomGenerationEngine != null) {
                    this.R.w(randomGenerationEngine);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalResourceManager290.a(customSystemException);
            }
        }
        this.O.a(systemConfigurationOrchestrator.q());
        this.O.G(systemConfigurationOrchestrator.Q());
        this.O.f(systemConfigurationOrchestrator.S());
        this.O.z(systemConfigurationOrchestrator.A());
        this.O.C(systemConfigurationOrchestrator.J());
        this.O.F(systemConfigurationOrchestrator.C());
        boolean bl = executionStateTracker.s().b();
        boolean bl2 = executionStateTracker.w().b();
        boolean bl3 = executionStateTracker.y().b();
        boolean bl4 = executionStateTracker.h().b();
        boolean bl5 = executionStateTracker.r().b();
        boolean bl6 = executionStateTracker.f().b();
        boolean bl7 = executionStateTracker.N().b();
        this.R.L(bl, bl2, bl3, bl4, bl5, bl6);
        this.R.z(bl7);
        this.P = new NumericComputationFramework(this.R);
        this.R.u(false);
    }

    private static Field c(long l, long l2) {
        int n = GraphicalResourceManager290.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = GraphicalResourceManager290.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = GraphicalResourceManager290.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = GraphicalResourceManager290.a(clazz3, string2, clazz2)) != null) {
                    GraphicalResourceManager290.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = GraphicalResourceManager290.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        GraphicalResourceManager290.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = GraphicalResourceManager290.b(216624326517214L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = GraphicalResourceManager290.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                GraphicalResourceManager290.b = MultiContainerRegistry.a(725472614158283918L, 3356796579438592728L, MethodHandles.lookup().lookupClass()).a(24444959335692L);
                GraphicalResourceManager290.j = new Object[5];
                GraphicalResourceManager290.m = new String[5];
                GraphicalResourceManager290.a();
                GraphicalResourceManager290.h = new HashMap<K, V>(13);
                var0 = GraphicalResourceManager290.b ^ 82031762738594L;
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
                var6_5 = "\u00d3\u00ae\u0082\u00b6\u00c2M\u00fbv\u0007\u0081\u00eca\u00e3\u00c1R,\u00c6S\u00be\u000b\u00b7\u00eet\u00fc\u00ba\u0002\u00e0\u00a3jY6\u0012";
                var7_6 = "\u00d3\u00ae\u0082\u00b6\u00c2M\u00fbv\u0007\u0081\u00eca\u00e3\u00c1R,\u00c6S\u00be\u000b\u00b7\u00eet\u00fc\u00ba\u0002\u00e0\u00a3jY6\u0012".length();
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
                    var6_5 = "$U\u00ebx>\u00cchD\u00fe\u00c3 }\u0006\u0014\u00f13";
                    var7_6 = "$U\u00ebx>\u00cchD\u00fe\u00c3 }\u0006\u0014\u00f13".length();
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
        GraphicalResourceManager290.d = var8_3;
        GraphicalResourceManager290.e = new Integer[6];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'y' || c == '\u00f4' || c == 'T' || c == '\u00e7') {
                field = GraphicalResourceManager290.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'T' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = GraphicalResourceManager290.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'F' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'K' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void h() {
        long l = b ^ 0x4CC0C6545DA4L;
        TemporalMetadataResolver.x((String)((Object)GraphicalResourceManager290.c("K", (int)GraphicalResourceManager290.a("s", (int)18740, (long)(0x65D510507B0AC5E8L ^ l)), (long)-4114302956013409776L, (long)l)));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = GraphicalResourceManager290.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = GraphicalResourceManager290.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Aw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = GraphicalResourceManager290.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGHEST)
    public void g(AuthenticationTokenGenerator2563 authenticationTokenGenerator2563) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        long l;
        block6: {
            l = b ^ 0x6AC1C1D04224L;
            systemConfigurationOrchestrator = authenticationTokenGenerator2563.getThePlayer();
            try {
                try {
                    if (!systemConfigurationOrchestrator.Y() && this.R != null) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalResourceManager290.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalResourceManager290.a(customSystemException);
            }
        }
        NumericComputationFramework numericComputationFramework = new NumericComputationFramework(systemConfigurationOrchestrator);
        NumericComputationFramework numericComputationFramework2 = new NumericComputationFramework(this.R);
        this.R.k();
        boolean bl = false;
        if (!this.l.t(this.P)) {
            bl = true;
            TemporalMetadataResolver.x((String)((Object)GraphicalResourceManager290.c("K", (int)GraphicalResourceManager290.a("s", (int)30519, (long)(0x5D0B37E5D3FEE46EL ^ l)), (long)-2781208874588359280L, (long)l)));
        }
        if (!numericComputationFramework.t(numericComputationFramework2)) {
            bl = true;
            TemporalMetadataResolver.x((String)((Object)GraphicalResourceManager290.c("K", (int)GraphicalResourceManager290.a("s", (int)22246, (long)(0x1CB6D7D88234C5BCL ^ l)), (long)-2781208874588359280L, (long)l)));
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = GraphicalResourceManager290.a(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                GraphicalResourceManager290.j[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4A3E;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Aw", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GraphicalResourceManager290.e[n2] = n3;
        }
        return e[n2];
    }

    private static Method d(long l, long l2) {
        int n = GraphicalResourceManager290.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = GraphicalResourceManager290.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = GraphicalResourceManager290.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = GraphicalResourceManager290.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        GraphicalResourceManager290.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = GraphicalResourceManager290.b(216624326517214L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = GraphicalResourceManager290.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        GraphicalResourceManager290.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = GraphicalResourceManager290.b(216624326517214L, 0L);
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

    public GraphicalResourceManager290() {
        long l = b ^ 0x778BBEA213AFL;
        super(a.cs((int)GraphicalResourceManager290.a("s", (int)5430, (long)(0x789FB855AA53D7E5L ^ l))), (int)GraphicalResourceManager290.a("s", (int)19769, (long)(0x4683A92C45090FE9L ^ l)), RecursiveNodeGraph.K);
        this.F = new Color(0, 0, 0, 150);
        this.T = new Color(255, 255, 255, 150);
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "\"RS";
        objectArray[1] = Integer.TYPE;
        GraphicalResourceManager290.m[1] = "java/lang/Integer";
        objectArray[2] = "\b*o\u00078W\u0003%~HEO\u0010\"w\u0001";
        objectArray[3] = "\u0018\u007fd\u0013;\\\u0013pu\\ZR\u0018{q\u0006";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "9\u001f\u0004qL\r1\u0016D\u001eCN^F\u0011q\u0018[ \r@qQ5g\u001a\tpPX2\u0005\u0017~(";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = j[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 59;
                break;
            }
            case 1: {
                n3 = 23;
                break;
            }
            case 2: {
                n3 = 8;
                break;
            }
            case 3: {
                n3 = 21;
                break;
            }
            case 4: {
                n3 = 18;
                break;
            }
            case 5: {
                n3 = 0;
                break;
            }
            case 6: {
                n3 = 57;
                break;
            }
            case 7: {
                n3 = 22;
                break;
            }
            case 8: {
                n3 = 49;
                break;
            }
            case 9: {
                n3 = 61;
                break;
            }
            case 10: {
                n3 = 11;
                break;
            }
            case 11: {
                n3 = 16;
                break;
            }
            case 12: {
                n3 = 25;
                break;
            }
            case 13: {
                n3 = 52;
                break;
            }
            case 14: {
                n3 = 40;
                break;
            }
            case 15: {
                n3 = 24;
                break;
            }
            case 16: {
                n3 = 13;
                break;
            }
            case 17: {
                n3 = 56;
                break;
            }
            case 18: {
                n3 = 35;
                break;
            }
            case 19: {
                n3 = 26;
                break;
            }
            case 20: {
                n3 = 19;
                break;
            }
            case 21: {
                n3 = 33;
                break;
            }
            case 22: {
                n3 = 32;
                break;
            }
            case 23: {
                n3 = 31;
                break;
            }
            case 24: {
                n3 = 39;
                break;
            }
            case 25: {
                n3 = 2;
                break;
            }
            case 26: {
                n3 = 30;
                break;
            }
            case 27: {
                n3 = 36;
                break;
            }
            case 28: {
                n3 = 3;
                break;
            }
            case 29: {
                n3 = 9;
                break;
            }
            case 30: {
                n3 = 53;
                break;
            }
            case 31: {
                n3 = 37;
                break;
            }
            case 32: {
                n3 = 29;
                break;
            }
            case 33: {
                n3 = 54;
                break;
            }
            case 34: {
                n3 = 62;
                break;
            }
            case 35: {
                n3 = 1;
                break;
            }
            case 36: {
                n3 = 50;
                break;
            }
            case 37: {
                n3 = 6;
                break;
            }
            case 38: {
                n3 = 34;
                break;
            }
            case 39: {
                n3 = 42;
                break;
            }
            case 40: {
                n3 = 7;
                break;
            }
            case 41: {
                n3 = 43;
                break;
            }
            case 42: {
                n3 = 58;
                break;
            }
            case 43: {
                n3 = 47;
                break;
            }
            case 44: {
                n3 = 48;
                break;
            }
            case 45: {
                n3 = 15;
                break;
            }
            case 46: {
                n3 = 17;
                break;
            }
            case 47: {
                n3 = 10;
                break;
            }
            case 48: {
                n3 = 38;
                break;
            }
            case 49: {
                n3 = 46;
                break;
            }
            case 50: {
                n3 = 63;
                break;
            }
            case 51: {
                n3 = 14;
                break;
            }
            case 52: {
                n3 = 20;
                break;
            }
            case 53: {
                n3 = 55;
                break;
            }
            case 54: {
                n3 = 51;
                break;
            }
            case 55: {
                n3 = 45;
                break;
            }
            case 56: {
                n3 = 4;
                break;
            }
            case 57: {
                n3 = 60;
                break;
            }
            case 58: {
                n3 = 28;
                break;
            }
            case 59: {
                n3 = 44;
                break;
            }
            case 60: {
                n3 = 27;
                break;
            }
            case 61: {
                n3 = 12;
                break;
            }
            case 62: {
                n3 = 41;
                break;
            }
            default: {
                n3 = 5;
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
        GraphicalResourceManager290.m[n4] = new String(cArray);
        return n4;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Aw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = GraphicalResourceManager290.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = GraphicalResourceManager290.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void v() {
        long l = b ^ 0x1B7BC085D7CL;
        try {
            if (this.R != null) {
                this.R = null;
                this.O = null;
                TemporalMetadataResolver.x((String)((Object)GraphicalResourceManager290.c("K", (int)GraphicalResourceManager290.a("s", (int)15088, (long)(0x77BA0A882406B6F5L ^ l)), (long)-4161534731337913656L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalResourceManager290.a(customSystemException);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(GraphicalResourceManager290.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(GraphicalResourceManager290.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

