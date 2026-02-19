/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.transaction.management;

import a.KB;
import a.a;
import a.oQ;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.app.resources.ResourceLifecycleManager1543;
import com.app.ui.UserInteractionManager;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.AbstractDataTransformer;
import com.data.transformation.TransformationEngine;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.game.configuration.GameVersionEnumerator;
import com.graph.structure.RecursiveNodeGraph;
import com.metrics.analysis.DimensionalMetricsTracker;
import com.network.config.ConnectionConfigurationResolver;
import com.network.configuration.NetworkConfigManager;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.connection.NetworkConnectionManager1286;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.network.streaming.StreamProtocolHandler2021;
import com.output.processing.OutputEncoder;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.auth.AuthenticationMediator;
import com.security.crypto.CryptoKeyGenerator1867;
import com.security.transform.CryptographicTransformer;
import com.structures.tree.RecursiveNodeTree;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.resource.AssetLoadBalancer;
import com.text.processing.PatternMatchingOrchestrator;
import com.util.numeric.NumericFormattingUtility;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TransactionOrchestrator
extends ContextualExecutionFramework {
    private static final long[] j;
    private boolean P;
    private final NumericFormattingUtility T;
    private static final Map o;
    private final Queue<DimensionalMetricsTracker> X;
    private final NetworkConfigManager z;
    private static final long e;
    private final NetworkConfigManager t;
    private boolean F;
    private static final boolean G = false;
    private final AuthenticationStateTracker K;
    private static final String[] w;
    private static final boolean R = true;
    private boolean B;
    private static final Object[] v;
    private final NetworkConfigManager d;
    private static final boolean V = false;
    private final ArrayDeque<ConnectionPoolOrchestrator1192> O;
    private static final Integer[] n;
    private boolean l;
    private final AuthenticationStateTracker h;
    private final NetworkConfigManager r;
    private final ArrayDeque<ConnectionPoolOrchestrator1192> Y;
    private final AuthenticationStateTracker x;
    private static final boolean b = false;
    private double m;

    @DataExchangeProtocol2090
    public void G(KB kB) {
        block91: {
            double d2;
            block90: {
                block89: {
                    block88: {
                        AuthenticationMediator authenticationMediator;
                        block84: {
                            block85: {
                                ConnectionConfigurationResolver connectionConfigurationResolver;
                                block81: {
                                    block83: {
                                        block82: {
                                            block80: {
                                                block78: {
                                                    block79: {
                                                        SystemConfigurationOrchestrator systemConfigurationOrchestrator = kB.getThePlayer();
                                                        connectionConfigurationResolver = kB.getWorld();
                                                        if (!this.P()) {
                                                            int n;
                                                            block75: {
                                                                block76: {
                                                                    block77: {
                                                                        ResourceLifecycleManager1543 resourceLifecycleManager1543;
                                                                        block74: {
                                                                            block71: {
                                                                                ResourceLifecycleManager1543 resourceLifecycleManager15432;
                                                                                block72: {
                                                                                    block73: {
                                                                                        resourceLifecycleManager15432 = AbstractDataTransformer.K(ReflectionMetadataResolver.rb, CryptoKeyGenerator1867.y);
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (resourceLifecycleManager15432 == null || !resourceLifecycleManager15432.r()) break block71;
                                                                                                    }
                                                                                                    catch (CustomSystemException customSystemException) {
                                                                                                        throw TransactionOrchestrator.a(customSystemException);
                                                                                                    }
                                                                                                    if (!AbstractDataTransformer.y()) break block72;
                                                                                                }
                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                    throw TransactionOrchestrator.a(customSystemException);
                                                                                                }
                                                                                                if (!this.F) break block73;
                                                                                            }
                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                throw TransactionOrchestrator.a(customSystemException);
                                                                                            }
                                                                                            this.S();
                                                                                        }
                                                                                        catch (CustomSystemException customSystemException) {
                                                                                            throw TransactionOrchestrator.a(customSystemException);
                                                                                        }
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                AssetLoadBalancer assetLoadBalancer = systemConfigurationOrchestrator.l();
                                                                                try {
                                                                                    if (assetLoadBalancer.Y()) {
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw TransactionOrchestrator.a(customSystemException);
                                                                                }
                                                                                int n2 = assetLoadBalancer.v();
                                                                                int n3 = resourceLifecycleManager15432.G() - 36;
                                                                                try {
                                                                                    if (n2 == n3) {
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw TransactionOrchestrator.a(customSystemException);
                                                                                }
                                                                                assetLoadBalancer.A(n3);
                                                                                return;
                                                                            }
                                                                            try {
                                                                                if (!this.K.s().booleanValue()) {
                                                                                    this.T(false);
                                                                                    return;
                                                                                }
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw TransactionOrchestrator.a(customSystemException);
                                                                            }
                                                                            resourceLifecycleManager1543 = AbstractDataTransformer.K(ReflectionMetadataResolver.rb, CryptoKeyGenerator1867.p);
                                                                            try {
                                                                                try {
                                                                                    if (resourceLifecycleManager1543 != null && !resourceLifecycleManager1543.Y()) break block74;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw TransactionOrchestrator.a(customSystemException);
                                                                                }
                                                                                this.T(false);
                                                                                return;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw TransactionOrchestrator.a(customSystemException);
                                                                            }
                                                                        }
                                                                        n = resourceLifecycleManager1543.G();
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (AbstractDataTransformer.D()) break block75;
                                                                                    if (!AbstractDataTransformer.y()) break block76;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw TransactionOrchestrator.a(customSystemException);
                                                                                }
                                                                                if (!this.F) break block77;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw TransactionOrchestrator.a(customSystemException);
                                                                            }
                                                                            this.S();
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw TransactionOrchestrator.a(customSystemException);
                                                                        }
                                                                    }
                                                                    return;
                                                                }
                                                                this.X();
                                                                return;
                                                            }
                                                            TransformationEngine transformationEngine = new TransformationEngine(ApplicationLifecycleManager.X().M());
                                                            int n4 = transformationEngine.R().D();
                                                            try {
                                                                if (this.X.isEmpty()) {
                                                                    this.X.add(new DimensionalMetricsTracker(n4, n, 0, 2));
                                                                    return;
                                                                }
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw TransactionOrchestrator.a(customSystemException);
                                                            }
                                                            if (this.r.m((long)this.T.l())) {
                                                                DimensionalMetricsTracker dimensionalMetricsTracker = this.X.poll();
                                                                try {
                                                                    if (dimensionalMetricsTracker != null) {
                                                                        this.F(dimensionalMetricsTracker, n4);
                                                                    }
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw TransactionOrchestrator.a(customSystemException);
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        try {
                                                            try {
                                                                if (!AbstractDataTransformer.y()) break block78;
                                                                if (!this.F) break block79;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw TransactionOrchestrator.a(customSystemException);
                                                            }
                                                            this.S();
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw TransactionOrchestrator.a(customSystemException);
                                                        }
                                                    }
                                                    return;
                                                }
                                                try {
                                                    if (this.a()) {
                                                        return;
                                                    }
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw TransactionOrchestrator.a(customSystemException);
                                                }
                                                authenticationMediator = this.H();
                                                try {
                                                    try {
                                                        if (authenticationMediator != null && !authenticationMediator.Y()) break block80;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw TransactionOrchestrator.a(customSystemException);
                                                    }
                                                    this.H();
                                                    return;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw TransactionOrchestrator.a(customSystemException);
                                                }
                                            }
                                            CryptographicTransformer cryptographicTransformer = authenticationMediator.M();
                                            try {
                                                try {
                                                    try {
                                                        if (cryptographicTransformer == null || !cryptographicTransformer.r()) break block81;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw TransactionOrchestrator.a(customSystemException);
                                                    }
                                                    if (!this.h.s().booleanValue()) break block82;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw TransactionOrchestrator.a(customSystemException);
                                                }
                                                this.H();
                                                break block83;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw TransactionOrchestrator.a(customSystemException);
                                            }
                                        }
                                        this.T(false);
                                    }
                                    return;
                                }
                                try {
                                    try {
                                        try {
                                            if (this.H(authenticationMediator, connectionConfigurationResolver)) break block84;
                                            if (!this.x.s().booleanValue()) break block85;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw TransactionOrchestrator.a(customSystemException);
                                        }
                                        if (!this.z.m(3000L)) break block85;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw TransactionOrchestrator.a(customSystemException);
                                    }
                                    this.H();
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw TransactionOrchestrator.a(customSystemException);
                                }
                            }
                            return;
                        }
                        this.z.m();
                        d2 = authenticationMediator.x();
                        if (!this.l) {
                            block87: {
                                block86: {
                                    double d3 = authenticationMediator.G();
                                    double d4 = authenticationMediator.o();
                                    double d5 = Math.abs(d3) + Math.abs(d2) + Math.abs(d4);
                                    try {
                                        try {
                                            if (!(d5 <= 0.05)) break block86;
                                            if (!this.d.m(1000L)) break block87;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw TransactionOrchestrator.a(customSystemException);
                                        }
                                        this.l = true;
                                        break block87;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw TransactionOrchestrator.a(customSystemException);
                                    }
                                }
                                this.d.m();
                            }
                            return;
                        }
                        try {
                            if (!(d2 <= 0.0)) break block88;
                            this.m += d2;
                            break block89;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TransactionOrchestrator.a(customSystemException);
                        }
                    }
                    this.m = 0.0;
                }
                try {
                    try {
                        if (!(this.m <= -0.05) && !this.B) break block90;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionOrchestrator.a(customSystemException);
                    }
                    if (this.m <= -0.05) {
                        // empty if block
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionOrchestrator.a(customSystemException);
                }
                this.H();
                this.t.m();
                this.d.m();
                this.z.m();
                this.l = false;
                this.B = false;
                break block91;
            }
            if (Math.abs(d2) > 0.001) {
                // empty if block
            }
        }
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'p' || c == '\u00f2' || c == 'a' || c == 'V') {
                field = TransactionOrchestrator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'p' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f2' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = TransactionOrchestrator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'H' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (w[n4] != null) {
            return n4;
        }
        Object object = v[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 17;
                break;
            }
            case 1: {
                n3 = 6;
                break;
            }
            case 2: {
                n3 = 11;
                break;
            }
            case 3: {
                n3 = 26;
                break;
            }
            case 4: {
                n3 = 47;
                break;
            }
            case 5: {
                n3 = 37;
                break;
            }
            case 6: {
                n3 = 15;
                break;
            }
            case 7: {
                n3 = 0;
                break;
            }
            case 8: {
                n3 = 5;
                break;
            }
            case 9: {
                n3 = 7;
                break;
            }
            case 10: {
                n3 = 55;
                break;
            }
            case 11: {
                n3 = 35;
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
                n3 = 31;
                break;
            }
            case 15: {
                n3 = 30;
                break;
            }
            case 16: {
                n3 = 9;
                break;
            }
            case 17: {
                n3 = 4;
                break;
            }
            case 18: {
                n3 = 32;
                break;
            }
            case 19: {
                n3 = 12;
                break;
            }
            case 20: {
                n3 = 39;
                break;
            }
            case 21: {
                n3 = 10;
                break;
            }
            case 22: {
                n3 = 60;
                break;
            }
            case 23: {
                n3 = 51;
                break;
            }
            case 24: {
                n3 = 20;
                break;
            }
            case 25: {
                n3 = 48;
                break;
            }
            case 26: {
                n3 = 43;
                break;
            }
            case 27: {
                n3 = 59;
                break;
            }
            case 28: {
                n3 = 22;
                break;
            }
            case 29: {
                n3 = 29;
                break;
            }
            case 30: {
                n3 = 14;
                break;
            }
            case 31: {
                n3 = 42;
                break;
            }
            case 32: {
                n3 = 36;
                break;
            }
            case 33: {
                n3 = 58;
                break;
            }
            case 34: {
                n3 = 27;
                break;
            }
            case 35: {
                n3 = 53;
                break;
            }
            case 36: {
                n3 = 38;
                break;
            }
            case 37: {
                n3 = 62;
                break;
            }
            case 38: {
                n3 = 57;
                break;
            }
            case 39: {
                n3 = 1;
                break;
            }
            case 40: {
                n3 = 44;
                break;
            }
            case 41: {
                n3 = 50;
                break;
            }
            case 42: {
                n3 = 28;
                break;
            }
            case 43: {
                n3 = 18;
                break;
            }
            case 44: {
                n3 = 19;
                break;
            }
            case 45: {
                n3 = 61;
                break;
            }
            case 46: {
                n3 = 33;
                break;
            }
            case 47: {
                n3 = 13;
                break;
            }
            case 48: {
                n3 = 40;
                break;
            }
            case 49: {
                n3 = 46;
                break;
            }
            case 50: {
                n3 = 34;
                break;
            }
            case 51: {
                n3 = 49;
                break;
            }
            case 52: {
                n3 = 56;
                break;
            }
            case 53: {
                n3 = 3;
                break;
            }
            case 54: {
                n3 = 63;
                break;
            }
            case 55: {
                n3 = 24;
                break;
            }
            case 56: {
                n3 = 16;
                break;
            }
            case 57: {
                n3 = 21;
                break;
            }
            case 58: {
                n3 = 54;
                break;
            }
            case 59: {
                n3 = 2;
                break;
            }
            case 60: {
                n3 = 23;
                break;
            }
            case 61: {
                n3 = 8;
                break;
            }
            case 62: {
                n3 = 41;
                break;
            }
            default: {
                n3 = 45;
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
        TransactionOrchestrator.w[n4] = new String(cArray);
        return n4;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1149;
        if (TransactionOrchestrator.n[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/x6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            TransactionOrchestrator.n[n2] = n3;
        }
        return TransactionOrchestrator.n[n2];
    }

    private void C(String string) {
    }

    public TransactionOrchestrator() {
        long l = e ^ 0x4D51B4F7057BL;
        super(a.cs((int)TransactionOrchestrator.a("g", (int)18766, (long)(0x72B0BAB9122E58FBL ^ l))), (int)TransactionOrchestrator.a("g", (int)11655, (long)(0x5CDDCA4B63D3BC37L ^ l)), RecursiveNodeGraph.k, a.cs((int)TransactionOrchestrator.a("g", (int)16083, (long)(0x25920F33997D2F6EL ^ l))));
        this.T = NumericFormattingUtility.K(this, (String)((Object)TransactionOrchestrator.c("\u00d5", (int)TransactionOrchestrator.a("g", (int)23222, (long)(0x312EAAAD4978CB09L ^ l)), (long)71520324023218278L, (long)l)), (String)((Object)TransactionOrchestrator.c("\u00d5", (int)TransactionOrchestrator.a("g", (int)27369, (long)(0x75A5FA48DDA07B5BL ^ l)), (long)71520324023218278L, (long)l)), (String)((Object)TransactionOrchestrator.c("\u00d5", (int)TransactionOrchestrator.a("g", (int)28777, (long)(0x713C770335DD61DEL ^ l)), (long)71520324023218278L, (long)l)), 50.0, 75.0, 125.0, 200.0, 5.0, (String)((Object)TransactionOrchestrator.c("\u00d5", (int)TransactionOrchestrator.a("g", (int)29597, (long)(0x3A2412C780CF622CL ^ l)), (long)71520324023218278L, (long)l)));
        this.X = new ConcurrentLinkedQueue<DimensionalMetricsTracker>();
        this.Y = new ArrayDeque();
        this.O = new ArrayDeque();
        this.h = AuthenticationStateTracker.R(this, (String)((Object)TransactionOrchestrator.c("\u00d5", (int)TransactionOrchestrator.a("g", (int)20020, (long)(0x6BB8AC00AEAFDF82L ^ l)), (long)71520324023218278L, (long)l)), false, (String)((Object)TransactionOrchestrator.c("\u00d5", (int)TransactionOrchestrator.a("g", (int)1383, (long)(0x317772792D6114DDL ^ l)), (long)71520324023218278L, (long)l)));
        this.x = AuthenticationStateTracker.R(this, (String)((Object)TransactionOrchestrator.c("\u00d5", (int)TransactionOrchestrator.a("g", (int)22521, (long)(0xC723E9DA000464AL ^ l)), (long)71520324023218278L, (long)l)), false, (String)((Object)TransactionOrchestrator.c("\u00d5", (int)TransactionOrchestrator.a("g", (int)1031, (long)(0x774EEEA80A3395B3L ^ l)), (long)71520324023218278L, (long)l)));
        this.r = new NetworkConfigManager();
        this.t = new NetworkConfigManager();
        this.d = new NetworkConfigManager();
        this.z = new NetworkConfigManager();
        this.K = AuthenticationStateTracker.R(this, (String)((Object)TransactionOrchestrator.c("\u00d5", (int)TransactionOrchestrator.a("g", (int)25564, (long)(0x9821FAF75097260L ^ l)), (long)71520324023218278L, (long)l)), true, (String)((Object)TransactionOrchestrator.c("\u00d5", (int)TransactionOrchestrator.a("g", (int)19417, (long)(0x7E946C8906635A67L ^ l)), (long)71520324023218278L, (long)l)));
        this.P = false;
        this.B = false;
        this.l = false;
        this.F = false;
        this.m = 0.0;
        this.K.l(this.T);
        this.N(this.x, this.h, this.K, this.T);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                TransactionOrchestrator.e = MultiContainerRegistry.a(3905138610676041801L, -5691629983042315538L, MethodHandles.lookup().lookupClass()).a(157256973098026L);
                TransactionOrchestrator.v = new Object[5];
                TransactionOrchestrator.w = new String[5];
                TransactionOrchestrator.d();
                TransactionOrchestrator.o = new HashMap<K, V>(13);
                var0 = TransactionOrchestrator.e ^ 75363418225643L;
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
                var6_5 = "w\u0099[\u0093.a\u00ec\u0096u\u0083Y\u00ad\u00a8\u008a\u00b2g7|?\u008a\u00f2\u00e9e\u00be\u0015N\u00d2-\u00e3\u00ef\u00cbIrR\u0094# \u001fu\u0088(\u000b\\\u0082\u00fb\u00ce\u00ef|\u00a4u\u00b4\u0088,\u00f7\u0014\u00aaW\u00c5\u0087\u00bf\u0016\u00c5(\u0094\u00e0\u00cd%.\u00c5\u00a5{\u0086\u00b9\u009bJ\u00b0>\u00cc\u00ca\u00a4\\ M\u00b6\u00f3\u009e:\u00b5";
                var7_6 = "w\u0099[\u0093.a\u00ec\u0096u\u0083Y\u00ad\u00a8\u008a\u00b2g7|?\u008a\u00f2\u00e9e\u00be\u0015N\u00d2-\u00e3\u00ef\u00cbIrR\u0094# \u001fu\u0088(\u000b\\\u0082\u00fb\u00ce\u00ef|\u00a4u\u00b4\u0088,\u00f7\u0014\u00aaW\u00c5\u0087\u00bf\u0016\u00c5(\u0094\u00e0\u00cd%.\u00c5\u00a5{\u0086\u00b9\u009bJ\u00b0>\u00cc\u00ca\u00a4\\ M\u00b6\u00f3\u009e:\u00b5".length();
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
                    var6_5 = "\u00b8\u00f1\u008bX\u0014\u0082\u00bfB*\u00e7\u00c5O\u0004\u0006d\u00f3";
                    var7_6 = "\u00b8\u00f1\u008bX\u0014\u0082\u00bfB*\u00e7\u00c5O\u0004\u0006d\u00f3".length();
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
        TransactionOrchestrator.j = var8_3;
        TransactionOrchestrator.n = new Integer[13];
    }

    private void l() {
        this.r.m();
        this.t.m();
        this.d.m();
        this.z.m();
        this.X.clear();
        this.Y.clear();
        this.O.clear();
        this.P = false;
        this.l = false;
        this.B = false;
        this.F = false;
        this.m = 0.0;
    }

    private boolean H(AuthenticationMediator authenticationMediator, ConnectionConfigurationResolver connectionConfigurationResolver) {
        boolean bl;
        block14: {
            block13: {
                try {
                    if (authenticationMediator.F()) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionOrchestrator.a(customSystemException);
                }
                try {
                    if (GameVersionEnumerator.MC_1_16_5.H()) {
                        return this.A(authenticationMediator, connectionConfigurationResolver);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionOrchestrator.a(customSystemException);
                }
                try {
                    if (GameVersionEnumerator.MC_1_12_2.H()) {
                        return this.k(authenticationMediator, connectionConfigurationResolver);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionOrchestrator.a(customSystemException);
                }
                try {
                    try {
                        if (!this.X(authenticationMediator, connectionConfigurationResolver) && !this.E(authenticationMediator, connectionConfigurationResolver)) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionOrchestrator.a(customSystemException);
                    }
                    bl = true;
                    break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionOrchestrator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @DataExchangeProtocol2090
    public void y(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        ConnectionLifecycleHandler connectionLifecycleHandler;
        block26: {
            AuthenticationMediator authenticationMediator;
            block24: {
                try {
                    if (!this.l) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionOrchestrator.a(customSystemException);
                }
                authenticationMediator = this.H();
                try {
                    try {
                        if (authenticationMediator != null && !authenticationMediator.Y()) break block24;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionOrchestrator.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionOrchestrator.a(customSystemException);
                }
            }
            connectionLifecycleHandler = networkPacketOrchestrator1222.getPacket();
            ConnectionConfigurationResolver connectionConfigurationResolver = networkPacketOrchestrator1222.getWorld();
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = networkPacketOrchestrator1222.getThePlayer();
            if (connectionLifecycleHandler.B(ReflectionMetadataResolver.bh)) {
                block25: {
                    NetworkConnectionManager1286 networkConnectionManager1286 = new NetworkConnectionManager1286(connectionLifecycleHandler);
                    try {
                        if (networkConnectionManager1286.h() != authenticationMediator.X()) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionOrchestrator.a(customSystemException);
                    }
                    int n = networkConnectionManager1286.K();
                    int n2 = networkConnectionManager1286.o();
                    double d2 = (double)networkConnectionManager1286.I() / 8000.0;
                    try {
                        try {
                            try {
                                if (n != 0 || n2 != 0) break block25;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw TransactionOrchestrator.a(customSystemException);
                            }
                            if (!(d2 <= -0.05)) break block25;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TransactionOrchestrator.a(customSystemException);
                        }
                        this.B = true;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionOrchestrator.a(customSystemException);
                    }
                }
                return;
            }
            try {
                try {
                    if (!connectionLifecycleHandler.B(ReflectionMetadataResolver.b) || connectionLifecycleHandler.B(ReflectionMetadataResolver.Pi)) break block26;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionOrchestrator.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw TransactionOrchestrator.a(customSystemException);
            }
        }
        try {
            if (connectionLifecycleHandler.B(ReflectionMetadataResolver.bv)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator.a(customSystemException);
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = TransactionOrchestrator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = TransactionOrchestrator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void v() {
        super.v();
        this.l();
    }

    private boolean X() {
        this.F = true;
        return AbstractDataTransformer.K();
    }

    private static void d() {
        Object[] objectArray = v;
        v[0] = "n'\f";
        objectArray[1] = Integer.TYPE;
        TransactionOrchestrator.w[1] = "java/lang/Integer";
        objectArray[2] = "d0BSjYo?S\u001c\u0017A|8ZU";
        objectArray[3] = "$\u001fU\u0019De/\u0010DV%k$\u001b@\f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "C\u001dlNX\u0012\u0016\u001dr0]\u0005zX0\fZ\u0004\u001a\u0010?^O~C\u001b:K[\u001dC\bg@6";
    }

    private boolean E(AuthenticationMediator authenticationMediator, ConnectionConfigurationResolver connectionConfigurationResolver) {
        double d2 = authenticationMediator.F();
        double d3 = authenticationMediator.V();
        double d4 = authenticationMediator.B();
        double d5 = d3;
        while (true) {
            block12: {
                TransactionCorrelationEngine transactionCorrelationEngine;
                block13: {
                    try {
                        if (!(d5 >= 0.0) || !(d5 >= d3 - 3.0)) break;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionOrchestrator.a(customSystemException);
                    }
                    transactionCorrelationEngine = connectionConfigurationResolver.R(d2, d5, d4);
                    try {
                        try {
                            try {
                                if (transactionCorrelationEngine == null || !transactionCorrelationEngine.r()) break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw TransactionOrchestrator.a(customSystemException);
                            }
                            if (!PatternMatchingOrchestrator.R(transactionCorrelationEngine)) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TransactionOrchestrator.a(customSystemException);
                        }
                        return true;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionOrchestrator.a(customSystemException);
                    }
                }
                try {
                    if (!PatternMatchingOrchestrator.e(transactionCorrelationEngine)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionOrchestrator.a(customSystemException);
                }
            }
            d5 -= 1.0;
        }
        return false;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = TransactionOrchestrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private boolean k(AuthenticationMediator authenticationMediator, ConnectionConfigurationResolver connectionConfigurationResolver) {
        return this.E(authenticationMediator, connectionConfigurationResolver);
    }

    private void H() {
        block13: {
            boolean bl;
            block11: {
                block10: {
                    AuthenticationMediator authenticationMediator = this.H();
                    try {
                        try {
                            if (authenticationMediator == null || !authenticationMediator.r()) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TransactionOrchestrator.a(customSystemException);
                        }
                        bl = true;
                        break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionOrchestrator.a(customSystemException);
                    }
                }
                bl = false;
            }
            boolean bl2 = bl;
            try {
                block12: {
                    try {
                        try {
                            if (bl2 || !this.P) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TransactionOrchestrator.a(customSystemException);
                        }
                        if (!this.t.m(1000L)) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionOrchestrator.a(customSystemException);
                    }
                }
                this.n(ApplicationLifecycleManager.N().D());
                this.t.m();
                this.z.m();
                this.d.m();
                this.P = true;
                this.m = 0.0;
            }
            catch (CustomSystemException customSystemException) {
                throw TransactionOrchestrator.a(customSystemException);
            }
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = TransactionOrchestrator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private boolean S() {
        try {
            if (this.F) {
                this.X.clear();
                this.F = false;
                return AbstractDataTransformer.S();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator.a(customSystemException);
        }
        return false;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = TransactionOrchestrator.a(l, l2);
            object = v[n];
            try {
                if (!(object instanceof String)) break block2;
                TransactionOrchestrator.v[n] = clazz = Class.forName(w[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private boolean a() {
        boolean bl;
        block5: {
            block4: {
                bl = false;
                ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = this.O.poll();
                try {
                    if (connectionPoolOrchestrator1192 == null || !connectionPoolOrchestrator1192.r()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionOrchestrator.a(customSystemException);
                }
                OutputEncoder.r(connectionPoolOrchestrator1192, false, false);
                bl = true;
            }
            ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = this.Y.poll();
            try {
                if (connectionPoolOrchestrator1192 == null || !connectionPoolOrchestrator1192.r()) break block5;
            }
            catch (CustomSystemException customSystemException) {
                throw TransactionOrchestrator.a(customSystemException);
            }
            OutputEncoder.r(connectionPoolOrchestrator1192, true, true);
            bl = true;
            this.O.add(connectionPoolOrchestrator1192);
        }
        return bl;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = TransactionOrchestrator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = TransactionOrchestrator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void n(ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192) {
        OutputEncoder.r(connectionPoolOrchestrator1192, true, true);
        this.O.add(connectionPoolOrchestrator1192);
    }

    private void F(DimensionalMetricsTracker dimensionalMetricsTracker, int n) {
        this.r.m();
        int n2 = dimensionalMetricsTracker.j();
        try {
            if (n == n2) {
                dimensionalMetricsTracker.H();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator.a(customSystemException);
        }
    }

    private static Field c(long l, long l2) {
        int n = TransactionOrchestrator.a(l, l2);
        Object object = v[n];
        if (object instanceof String) {
            String string = w[n];
            int n2 = string.indexOf(8);
            Class clazz = TransactionOrchestrator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = TransactionOrchestrator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = TransactionOrchestrator.a(clazz3, string2, clazz2)) != null) {
                    TransactionOrchestrator.v[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = TransactionOrchestrator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        TransactionOrchestrator.v[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = TransactionOrchestrator.b(267358883266720L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean P() {
        boolean bl;
        block8: {
            block7: {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    if (systemConfigurationOrchestrator.Y()) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionOrchestrator.a(customSystemException);
                }
                LightweightExecutionContext lightweightExecutionContext = systemConfigurationOrchestrator.K();
                try {
                    try {
                        if (lightweightExecutionContext.Y() || !lightweightExecutionContext.C().B(ReflectionMetadataResolver.rb)) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionOrchestrator.a(customSystemException);
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionOrchestrator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Exception decompiling
     */
    @Nullable
    private AuthenticationMediator H() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 5[SWITCH]
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

    private static Method d(long l, long l2) {
        int n = TransactionOrchestrator.a(l, l2);
        Object object = v[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = w[n];
                int n3 = string2.indexOf(8);
                clazz3 = TransactionOrchestrator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = TransactionOrchestrator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = TransactionOrchestrator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        TransactionOrchestrator.v[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = TransactionOrchestrator.b(267358883266720L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = TransactionOrchestrator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        TransactionOrchestrator.v[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = TransactionOrchestrator.b(267358883266720L, 0L);
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

    private boolean A(AuthenticationMediator authenticationMediator, ConnectionConfigurationResolver connectionConfigurationResolver) {
        boolean bl;
        ReflectionUtilityBroker reflectionUtilityBroker = authenticationMediator.C();
        UserInteractionManager userInteractionManager = connectionConfigurationResolver.V(reflectionUtilityBroker);
        float f = 0.0f;
        if (userInteractionManager.b(StreamProtocolHandler2021.G())) {
            f = userInteractionManager.c(connectionConfigurationResolver, reflectionUtilityBroker);
        }
        try {
            bl = f > 0.0f;
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator.a(customSystemException);
        }
        return bl;
    }

    private void p(String string, Object ... objectArray) {
    }

    private boolean X(AuthenticationMediator authenticationMediator, ConnectionConfigurationResolver connectionConfigurationResolver) {
        boolean bl;
        int n = 5;
        double d2 = 0.0;
        for (int i = 0; i < n; ++i) {
            oQ oQ2 = authenticationMediator.S();
            double d3 = oQ2.P() - oQ2.c();
            double d4 = oQ2.c() + d3 * (double)i / (double)n;
            double d5 = oQ2.c() + d3 * (double)(i + 1) / (double)n;
            oQ oQ3 = oQ.E(oQ2.F(), d4, oQ2.v(), oQ2.f(), d5, oQ2.R());
            if (!authenticationMediator.N().O(oQ3, RecursiveNodeTree.K())) continue;
            d2 += 1.0 / (double)n;
        }
        try {
            bl = d2 > 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator.a(customSystemException);
        }
        return bl;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(TransactionOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(TransactionOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

