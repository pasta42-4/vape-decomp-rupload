/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.dynamic.proxy;

import a.KB;
import a.Qh;
import a._Y;
import a.a;
import a.oD;
import com.adapter.management.GenericAdapterManager;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.network.transmission.TransmissionHandler;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.event.management.EventDispatchCoordinator1011;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.color.ColorCompositionEngine;
import com.graphics.rendering.FontRenderManager;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.connection.ConnectionEstablisher;
import com.network.core.NetworkConnectionOrchestrator;
import com.network.protocol.MultiProtocolContextManager;
import com.network.protocol.NetworkProtocolEncoder458;
import com.network.transmission.DataTransmissionManager2384;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.auth.AuthorizationManager;
import com.security.authentication.AuthenticationGateway1860;
import com.security.authentication.CryptographicTokenGenerator1926;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.security.cryptography.CryptographicKeyManager2476;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.text.processing.PatternMatchingOrchestrator;
import com.transaction.management.TransactionOrchestrator1017;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DynamicProxyResolver
extends ContextualExecutionFramework {
    private static final Integer[] gb;
    private final AuthenticationStateTracker _c;
    private final List<Object> h;
    private Object r;
    private final AuthenticationGateway1860 z;
    private static final Object[] kb;
    private static final Map hb;
    private static final char O;
    private final AuthenticationGateway1860 w;
    private final Map<Integer, Integer> K;
    private int t;
    private final AuthenticationGateway1860 __;
    private final Map<Integer, Integer> b;
    private final AuthenticationStateTracker n;
    private final Map<Character, Color> d;
    private final HashMap<AuthenticationGateway1860, Character> Y;
    private final AuthenticationGateway1860 P;
    private List<Object> Z;
    private static final String[] lb;
    private final AuthenticationGateway1860 V;
    private final AuthenticationGateway1860 N;
    private final AuthenticationGateway1860 m;
    private final AuthenticationGateway1860 B;
    private final AuthenticationStateTracker j;
    private final AuthenticationGateway1860 _0;
    private final AuthenticationGateway1860 e;
    private final AuthenticationGateway1860 o;
    private static final long[] fb;
    private final AuthenticationStateTracker v;
    private final AuthenticationGateway1860 G;
    private List<UUID> F;
    private static final long bb;
    private final AuthenticationGateway1860 T;
    private final AuthenticationGateway1860 l;
    private final AuthenticationGateway1860 R;
    private int L;
    private final AuthenticationGateway1860 X;
    private final AuthenticationStateTracker x;
    private final GenericAdapterManager A;

    public boolean l(CryptographicTransformer cryptographicTransformer) {
        block36: {
            long l = bb ^ 0x69E68A6574A3L;
            try {
                if (!this.q()) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
            try {
                if (!DynamicContextBroker.e) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
            try {
                if (cryptographicTransformer.B(ReflectionMetadataResolver.rl)) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
            if (cryptographicTransformer.B(ReflectionMetadataResolver.UQ)) {
                boolean bl;
                Qh qh;
                block32: {
                    qh = new Qh(cryptographicTransformer);
                    if (this.S(ApplicationLifecycleManager.U()) == 1) {
                        boolean bl2;
                        block34: {
                            block33: {
                                int n = this.S(qh);
                                try {
                                    try {
                                        if (n == -1) break block32;
                                        if (n != 1) break block33;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DynamicProxyResolver.a(customSystemException);
                                    }
                                    bl2 = true;
                                    break block34;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicProxyResolver.a(customSystemException);
                                }
                            }
                            bl2 = false;
                        }
                        boolean bl3 = bl2;
                        try {
                            if (!bl3) {
                                return true;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicProxyResolver.a(customSystemException);
                        }
                        return false;
                    }
                }
                String string = qh.G().i();
                try {
                    if (this.K.getOrDefault(qh.X(), 0) < 15) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
                try {
                    if (qh.M()) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
                try {
                    bl = !this.F.contains(qh.q());
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
                boolean bl4 = bl;
                try {
                    block35: {
                        try {
                            try {
                                if (string.equals("\u00a7r" + qh.e() + "\u00a7r") || string.equals(qh.e() + "\u00a7r")) break block35;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicProxyResolver.a(customSystemException);
                            }
                            if (!string.contains((CharSequence)((Object)DynamicProxyResolver.c("\u00c5", (int)DynamicProxyResolver.a("v", (int)12247, (long)(0x27BFF2FEA1E6D1F0L ^ l)), (long)-4090094346971899930L, (long)l)))) break block36;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicProxyResolver.a(customSystemException);
                        }
                    }
                    return bl4;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
            }
        }
        return false;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Aj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean v() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.Z() || !this.j.s().booleanValue()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProxyResolver.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private Color b(char c) {
        Color color = this.d.get(Character.valueOf(c));
        try {
            if (color != null) {
                return color;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProxyResolver.a(customSystemException);
        }
        float[] fArray = new float[4];
        FontRenderManager.t(c, fArray);
        Color color2 = new Color((int)(fArray[0] * 255.0f), (int)(fArray[1] * 255.0f), (int)(fArray[2] * 255.0f));
        this.d.put(Character.valueOf(c), color2);
        return color2;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (lb[n4] != null) {
            return n4;
        }
        Object object = kb[n4];
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
                n3 = 63;
                break;
            }
            case 2: {
                n3 = 16;
                break;
            }
            case 3: {
                n3 = 5;
                break;
            }
            case 4: {
                n3 = 1;
                break;
            }
            case 5: {
                n3 = 46;
                break;
            }
            case 6: {
                n3 = 38;
                break;
            }
            case 7: {
                n3 = 30;
                break;
            }
            case 8: {
                n3 = 58;
                break;
            }
            case 9: {
                n3 = 40;
                break;
            }
            case 10: {
                n3 = 18;
                break;
            }
            case 11: {
                n3 = 48;
                break;
            }
            case 12: {
                n3 = 6;
                break;
            }
            case 13: {
                n3 = 7;
                break;
            }
            case 14: {
                n3 = 53;
                break;
            }
            case 15: {
                n3 = 37;
                break;
            }
            case 16: {
                n3 = 41;
                break;
            }
            case 17: {
                n3 = 60;
                break;
            }
            case 18: {
                n3 = 36;
                break;
            }
            case 19: {
                n3 = 22;
                break;
            }
            case 20: {
                n3 = 49;
                break;
            }
            case 21: {
                n3 = 50;
                break;
            }
            case 22: {
                n3 = 14;
                break;
            }
            case 23: {
                n3 = 28;
                break;
            }
            case 24: {
                n3 = 13;
                break;
            }
            case 25: {
                n3 = 11;
                break;
            }
            case 26: {
                n3 = 52;
                break;
            }
            case 27: {
                n3 = 23;
                break;
            }
            case 28: {
                n3 = 26;
                break;
            }
            case 29: {
                n3 = 15;
                break;
            }
            case 30: {
                n3 = 33;
                break;
            }
            case 31: {
                n3 = 24;
                break;
            }
            case 32: {
                n3 = 21;
                break;
            }
            case 33: {
                n3 = 57;
                break;
            }
            case 34: {
                n3 = 62;
                break;
            }
            case 35: {
                n3 = 55;
                break;
            }
            case 36: {
                n3 = 45;
                break;
            }
            case 37: {
                n3 = 31;
                break;
            }
            case 38: {
                n3 = 29;
                break;
            }
            case 39: {
                n3 = 10;
                break;
            }
            case 40: {
                n3 = 8;
                break;
            }
            case 41: {
                n3 = 20;
                break;
            }
            case 42: {
                n3 = 17;
                break;
            }
            case 43: {
                n3 = 0;
                break;
            }
            case 44: {
                n3 = 43;
                break;
            }
            case 45: {
                n3 = 59;
                break;
            }
            case 46: {
                n3 = 44;
                break;
            }
            case 47: {
                n3 = 25;
                break;
            }
            case 48: {
                n3 = 34;
                break;
            }
            case 49: {
                n3 = 56;
                break;
            }
            case 50: {
                n3 = 51;
                break;
            }
            case 51: {
                n3 = 12;
                break;
            }
            case 52: {
                n3 = 4;
                break;
            }
            case 53: {
                n3 = 35;
                break;
            }
            case 54: {
                n3 = 19;
                break;
            }
            case 55: {
                n3 = 3;
                break;
            }
            case 56: {
                n3 = 42;
                break;
            }
            case 57: {
                n3 = 32;
                break;
            }
            case 58: {
                n3 = 39;
                break;
            }
            case 59: {
                n3 = 2;
                break;
            }
            case 60: {
                n3 = 54;
                break;
            }
            case 61: {
                n3 = 47;
                break;
            }
            case 62: {
                n3 = 61;
                break;
            }
            default: {
                n3 = 27;
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
        DynamicProxyResolver.lb[n4] = new String(cArray);
        return n4;
    }

    public char Q(Qh qh) {
        String string = qh.G().i();
        String string2 = qh.e();
        return this.n(string2, string);
    }

    public boolean K() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.Z() || !this.n.s().booleanValue()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProxyResolver.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public DynamicProxyResolver() {
        long l = bb ^ 0x2CC3BEC3E94BL;
        super(a.cs((int)DynamicProxyResolver.a("v", (int)3313, (long)(0x7CFDA741DAEAEF3CL ^ l))), -28416, RecursiveNodeGraph.K, "");
        this.Y = new HashMap();
        this.d = new HashMap<Character, Color>();
        this.j = AuthenticationStateTracker.R(this, (String)((Object)DynamicProxyResolver.c("\u00c5", (int)DynamicProxyResolver.a("v", (int)24366, (long)(0x583164B116683CE5L ^ l)), (long)6545232164111157774L, (long)l)), false, "Ignore players on your team designated by the server\n\u00a7cThis is not guaranteed to be accurate, as server teams are assigned by the server");
        this.n = AuthenticationStateTracker.R(this, (String)((Object)DynamicProxyResolver.c("\u00c5", (int)DynamicProxyResolver.a("v", (int)12034, (long)(0x5E67743B7E41CCC4L ^ l)), (long)6545232164111157774L, (long)l)), false, (String)((Object)DynamicProxyResolver.c("\u00c5", (int)DynamicProxyResolver.a("v", (int)24199, (long)(0x151FE5714FF43D46L ^ l)), (long)6545232164111157774L, (long)l)));
        this.x = AuthenticationStateTracker.R(this, (String)((Object)DynamicProxyResolver.c("\u00c5", (int)DynamicProxyResolver.a("v", (int)8102, (long)(0x35FC5C7D7F1EFC64L ^ l)), (long)6545232164111157774L, (long)l)), false, (String)((Object)DynamicProxyResolver.c("\u00c5", (int)DynamicProxyResolver.a("v", (int)16896, (long)(0x5737DDD2D1FA21C0L ^ l)), (long)6545232164111157774L, (long)l)));
        this.v = AuthenticationStateTracker.R(this, (String)((Object)DynamicProxyResolver.c("\u00c5", (int)DynamicProxyResolver.a("v", (int)28013, (long)(0x3F9158427AB08EA4L ^ l)), (long)6545232164111157774L, (long)l)), true, "Automatically detects your team color\n\u00a7cThis is not guaranteed to be accurate, this relies on the server giving you the same name color as your teammates");
        this._c = AuthenticationStateTracker.R(this, (String)((Object)DynamicProxyResolver.c("\u00c5", (int)DynamicProxyResolver.a("v", (int)31017, (long)(0x7726DE9E4191AEDL ^ l)), (long)6545232164111157774L, (long)l)), false, (String)((Object)DynamicProxyResolver.c("\u00c5", (int)DynamicProxyResolver.a("v", (int)1764, (long)(0x4E17CFE1A23B652AL ^ l)), (long)6545232164111157774L, (long)l)));
        this.h = new ArrayList<Object>();
        this.K = new HashMap<Integer, Integer>();
        this.b = new HashMap<Integer, Integer>();
        this.t = 0;
        this.L = 0;
        this.Z = new ArrayList<Object>();
        this.F = new ArrayList<UUID>();
        this.R = new AuthenticationGateway1860("\u00a7aGreen", 0.8);
        this.Y.put(this.R, Character.valueOf('a'));
        this.X = new AuthenticationGateway1860("\u00a72Dark Green", 0.8);
        this.Y.put(this.X, Character.valueOf('2'));
        this._0 = new AuthenticationGateway1860("\u00a7cRed", 0.8);
        this.Y.put(this._0, Character.valueOf('c'));
        this.T = new AuthenticationGateway1860("\u00a74Dark Red", 0.8);
        this.Y.put(this.T, Character.valueOf('4'));
        this.G = new AuthenticationGateway1860("\u00a7eYellow", 0.8);
        this.Y.put(this.G, Character.valueOf('e'));
        this.m = new AuthenticationGateway1860("\u00a76Gold", 0.8);
        this.Y.put(this.m, Character.valueOf('6'));
        this.__ = new AuthenticationGateway1860("\u00a79Blue", 0.8);
        this.Y.put(this.__, Character.valueOf('9'));
        this.B = new AuthenticationGateway1860("\u00a71Dark Blue", 0.8);
        this.Y.put(this.B, Character.valueOf('1'));
        this.z = new AuthenticationGateway1860("\u00a7bAqua", 0.8);
        this.Y.put(this.z, Character.valueOf('b'));
        this.V = new AuthenticationGateway1860("\u00a73Dark Aqua", 0.8);
        this.Y.put(this.V, Character.valueOf('3'));
        this.l = new AuthenticationGateway1860("\u00a7dPurple", 0.8);
        this.Y.put(this.l, Character.valueOf('d'));
        this.o = new AuthenticationGateway1860("\u00a75Dark Purple", 0.8);
        this.Y.put(this.o, Character.valueOf('5'));
        this.P = new AuthenticationGateway1860("\u00a77Gray", 0.8);
        this.Y.put(this.P, Character.valueOf('7'));
        this.w = new AuthenticationGateway1860("\u00a78Dark Gray", 0.8);
        this.Y.put(this.w, Character.valueOf('8'));
        this.e = new AuthenticationGateway1860("\u00a7fWhite", 0.8);
        this.Y.put(this.e, Character.valueOf('f'));
        this.N = new AuthenticationGateway1860("\u00a70Black", 0.8);
        this.Y.put(this.N, Character.valueOf('0'));
        this.A = CryptographicKeyManager2476.Q(this, (String)((Object)DynamicProxyResolver.c("\u00c5", (int)DynamicProxyResolver.a("v", (int)13180, (long)(0x6F83982A8469D0B0L ^ l)), (long)6545232164111157774L, (long)l)), (String)((Object)DynamicProxyResolver.c("\u00c5", (int)DynamicProxyResolver.a("v", (int)30353, (long)(0x7417C8A45FE29556L ^ l)), (long)6545232164111157774L, (long)l)), this.R, 2, this.T, this._0, this.m, this.G, this.X, this.R, this.z, this.V, this.B, this.__, this.l, this.o, this.e, this.P, this.w, this.N);
        this.n.l(this.x, this.v, this.A);
        this.N(this.j, this.n, this.x, this.v, this.A, this._c);
    }

    public boolean O() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.K() || !this.x.s().booleanValue()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProxyResolver.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Aj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DynamicProxyResolver.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DynamicProxyResolver.a(l, l2);
            object = kb[n];
            try {
                if (!(object instanceof String)) break block2;
                DynamicProxyResolver.kb[n] = clazz = Class.forName(lb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public boolean O(@Nullable SystemConfigurationOrchestrator systemConfigurationOrchestrator, CryptographicTransformer cryptographicTransformer) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator2;
        block28: {
            try {
                if (!this.Z()) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
            try {
                try {
                    if (this.K() || this.v()) break block28;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
        }
        try {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator3 = systemConfigurationOrchestrator2 = systemConfigurationOrchestrator != null ? systemConfigurationOrchestrator : ApplicationLifecycleManager.U();
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProxyResolver.a(customSystemException);
        }
        if (cryptographicTransformer.B(ReflectionMetadataResolver.Pr)) {
            DataTransmissionManager2384 dataTransmissionManager2384 = new DataTransmissionManager2384(cryptographicTransformer);
            if (this.K()) {
                char c = this.Y.get(this.A.J()).charValue();
                char c2 = this.Q(dataTransmissionManager2384);
                try {
                    if (c == c2) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
            }
            if (this.v()) {
                TransmissionHandler transmissionHandler;
                TransmissionHandler transmissionHandler2;
                block31: {
                    block30: {
                        block29: {
                            transmissionHandler2 = this.U(systemConfigurationOrchestrator2);
                            try {
                                try {
                                    if (transmissionHandler2 != null && !transmissionHandler2.Y()) break block29;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicProxyResolver.a(customSystemException);
                                }
                                return false;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicProxyResolver.a(customSystemException);
                            }
                        }
                        transmissionHandler = this.U(dataTransmissionManager2384);
                        try {
                            try {
                                if (transmissionHandler != null && !transmissionHandler.Y()) break block30;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicProxyResolver.a(customSystemException);
                            }
                            return false;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicProxyResolver.a(customSystemException);
                        }
                    }
                    try {
                        if (!transmissionHandler2.B(ReflectionMetadataResolver.EP) || !transmissionHandler.B(ReflectionMetadataResolver.EP)) break block31;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProxyResolver.a(customSystemException);
                    }
                    oD oD2 = new oD(transmissionHandler2);
                    oD oD3 = new oD(transmissionHandler);
                    String string = oD2.W();
                    String string2 = oD3.W();
                    try {
                        if (string.equals(string2)) {
                            return true;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProxyResolver.a(customSystemException);
                    }
                }
                return transmissionHandler2.t(transmissionHandler);
            }
        }
        return false;
    }

    @Override
    public void v() {
        this.b.clear();
        this.K.clear();
        this.h.clear();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = DynamicProxyResolver.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DynamicProxyResolver.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void s(KB kB) {
        block15: {
            try {
                block14: {
                    try {
                        try {
                            if (!this.Z() || !this.n.s().booleanValue()) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicProxyResolver.a(customSystemException);
                        }
                        if (this.v.s().booleanValue()) break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProxyResolver.a(customSystemException);
                    }
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
        }
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = kB.getThePlayer();
        try {
            if (systemConfigurationOrchestrator.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProxyResolver.a(customSystemException);
        }
        char c = this.Q(systemConfigurationOrchestrator);
        if (c == '\u00ff') {
            c = this.c(systemConfigurationOrchestrator);
        }
        if (c != '\u00ff') {
            for (AuthenticationGateway1860 authenticationGateway1860 : this.Y.keySet()) {
                try {
                    if (this.Y.get(authenticationGateway1860).charValue() != c) continue;
                    this.A.F(true);
                    this.A.V(authenticationGateway1860);
                    this.A.F(false);
                    break;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
            }
        }
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

    @DataExchangeProtocol2090
    public void g(EventDispatchCoordinator1011 eventDispatchCoordinator1011) {
        try {
            if (!this.q()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProxyResolver.a(customSystemException);
        }
        try {
            if (ReflectionMetadataResolver.UQ.isAssignableFrom(eventDispatchCoordinator1011.getEntity().M().getClass())) {
                ++this.L;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProxyResolver.a(customSystemException);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicProxyResolver.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    @DataExchangeProtocol2090
    public void l(CryptoKeyManagementSystem var1_1) {
        block104: {
            var2_2 = DynamicProxyResolver.bb ^ 88993221674028L;
            try {
                if (!this.q()) {
                    return;
                }
            }
            catch (Exception v0) {
                throw DynamicProxyResolver.a(v0);
            }
            this.f();
            if (this.r == null) ** GOTO lbl16
            try {
                block123: {
                    if (var1_1.getWorld().M().equals(this.r)) break block104;
                    break block123;
                    catch (Exception v1) {
                        throw DynamicProxyResolver.a(v1);
                    }
                }
                this.b.clear();
                this.K.clear();
                this.h.clear();
                this.r = var1_1.getWorld().M();
            }
            catch (Exception v2) {
                throw DynamicProxyResolver.a(v2);
            }
        }
        var4_3 = var1_1.getWorld();
        if (this.t == 1) {
            try {
                var5_4 = this.K.entrySet().iterator();
                while (var5_4.hasNext()) {
                    var6_6 = (Map.Entry)var5_4.next();
                    var7_8 = (Integer)var6_6.getKey();
                    var8_9 = var4_3.I(var7_8.intValue());
                    try {
                        if (!var8_9.Y()) continue;
                        var5_4.remove();
                    }
                    catch (Exception v3) {
                        throw DynamicProxyResolver.a(v3);
                    }
                }
                var5_4 = var4_3.L();
                var6_6 = this.h.iterator();
                while (true) {
                    block105: {
                        try {
                            while (var6_6.hasNext()) {
                                if (var5_4.contains(var6_6.next())) continue;
                                break block105;
                            }
                            break;
                        }
                        catch (Exception v4) {
                            throw DynamicProxyResolver.a(v4);
                        }
                    }
                    var6_6.remove();
                }
            }
            catch (Exception var5_5) {
                TemporalMetadataResolver.W(var5_5);
            }
        }
        var5_4 = ApplicationLifecycleManager.U();
        try {
            v5 = this.S((Qh)var5_4) == 1;
        }
        catch (Exception v6) {
            throw DynamicProxyResolver.a(v6);
        }
        var6_7 = v5;
        var7_8 = new ArrayList<E>();
        for (E var9_10 : var4_3.M()) {
            block122: {
                block121: {
                    block115: {
                        block118: {
                            block116: {
                                block117: {
                                    block114: {
                                        block113: {
                                            block112: {
                                                block109: {
                                                    block111: {
                                                        block108: {
                                                            try {
                                                                if (ReflectionMetadataResolver.rl.isAssignableFrom(var9_10.getClass())) {
                                                                    continue;
                                                                }
                                                            }
                                                            catch (Exception v7) {
                                                                throw DynamicProxyResolver.a(v7);
                                                            }
                                                            var10_11 = new Qh(var9_10);
                                                            try {
                                                                try {
                                                                    if (this.K.getOrDefault(var10_11.X(), 0) >= 3000 && var10_11.m()) {
                                                                        continue;
                                                                    }
                                                                }
                                                                catch (Exception v8) {
                                                                    throw DynamicProxyResolver.a(v8);
                                                                }
                                                            }
                                                            catch (Exception v9) {
                                                                throw DynamicProxyResolver.a(v9);
                                                            }
                                                            try {
                                                                try {
                                                                    if (var5_4.r() <= 250 || var10_11.r() > 2) break block108;
                                                                }
                                                                catch (Exception v10) {
                                                                    throw DynamicProxyResolver.a(v10);
                                                                }
                                                                if (this.h.contains(var10_11.M())) break block108;
                                                            }
                                                            catch (Exception v11) {
                                                                throw DynamicProxyResolver.a(v11);
                                                            }
                                                            var11_12 = var5_4.F() - var10_11.F();
                                                            var13_15 = var5_4.V() - var10_11.B();
                                                            var15_18 = var5_4.B() - var10_11.B();
                                                            var17_21 = AdaptiveComputationEngine.C(var11_12 * var11_12 + var13_15 * var13_15 + var15_18 * var15_18);
                                                            var19_23 = var10_11.G().i();
                                                            var20_25 = var19_23.endsWith("\u00a7c" + var10_11.e() + "\u00a7r");
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (!(Math.abs(var17_21) > 3.0) || var5_4.r() <= 260) break block108;
                                                                        }
                                                                        catch (Exception v12) {
                                                                            throw DynamicProxyResolver.a(v12);
                                                                        }
                                                                        if (this.L > 12) break block108;
                                                                    }
                                                                    catch (Exception v13) {
                                                                        throw DynamicProxyResolver.a(v13);
                                                                    }
                                                                    if (!var20_25) break block108;
                                                                }
                                                                catch (Exception v14) {
                                                                    throw DynamicProxyResolver.a(v14);
                                                                }
                                                                this.h.add(var10_11.M());
                                                                this.K.put(var10_11.X(), -20);
                                                            }
                                                            catch (Exception v15) {
                                                                throw DynamicProxyResolver.a(v15);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                if (var10_11.r() > 150 || !(var5_4.y(var10_11) < 50.0f)) break block109;
                                                            }
                                                            catch (Exception v16) {
                                                                throw DynamicProxyResolver.a(v16);
                                                            }
                                                            if (var5_4.r() <= 150) break block109;
                                                        }
                                                        catch (Exception v17) {
                                                            throw DynamicProxyResolver.a(v17);
                                                        }
                                                        var11_12 = var10_11.b() - var10_11.F();
                                                        var13_15 = var10_11.q() - var10_11.V();
                                                        var15_18 = var10_11.I() - var10_11.B();
                                                        var17_21 = var11_12 * var11_12 + var13_15 * var13_15 + var15_18 * var15_18;
                                                        try {
                                                            block110: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (!(var17_21 > 2.0) || !(var17_21 < 400.0)) break block109;
                                                                            }
                                                                            catch (Exception v18) {
                                                                                throw DynamicProxyResolver.a(v18);
                                                                            }
                                                                            if (!this.h.contains(var10_11.M())) break block109;
                                                                        }
                                                                        catch (Exception v19) {
                                                                            throw DynamicProxyResolver.a(v19);
                                                                        }
                                                                        if (!var5_4.R()) break block110;
                                                                    }
                                                                    catch (Exception v20) {
                                                                        throw DynamicProxyResolver.a(v20);
                                                                    }
                                                                    if (!var5_4.M().w()) break block109;
                                                                }
                                                                catch (Exception v21) {
                                                                    throw DynamicProxyResolver.a(v21);
                                                                }
                                                            }
                                                            if (var10_11.d()) break block109;
                                                        }
                                                        catch (Exception v22) {
                                                            throw DynamicProxyResolver.a(v22);
                                                        }
                                                        var19_24 = this.K.getOrDefault(var10_11.X(), 0);
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (var19_24 <= DynamicProxyResolver.a("v", (int)18977, (long)(1544423350418261123L ^ var2_2)) || var10_11.R()) break block111;
                                                                    }
                                                                    catch (Exception v23) {
                                                                        throw DynamicProxyResolver.a(v23);
                                                                    }
                                                                    if (!var10_11.G().i().contains("\u00a7c" + var10_11.e() + "\u00a7r")) break block111;
                                                                }
                                                                catch (Exception v24) {
                                                                    throw DynamicProxyResolver.a(v24);
                                                                }
                                                                if (!((double)var5_4.y(var10_11) < 7.5)) break block111;
                                                            }
                                                            catch (Exception v25) {
                                                                throw DynamicProxyResolver.a(v25);
                                                            }
                                                            TemporalMetadataResolver.h.c().t("\u00a7cInvalid Player Spawn", var10_11.G().i() + " \u00a7fmay be a fake player!", CryptoConfigurationRegistry383.WARNING, 5000L);
                                                            this.K.put(var10_11.X(), (int)DynamicProxyResolver.a("v", (int)27860, (long)(7066514783613969019L ^ var2_2)));
                                                        }
                                                        catch (Exception v26) {
                                                            throw DynamicProxyResolver.a(v26);
                                                        }
                                                    }
                                                    this.K.put(var10_11.X(), Math.max(var19_24 - 50, -50));
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (!var6_7 || !this.F.contains(var10_11.q())) break block112;
                                                                }
                                                                catch (Exception v27) {
                                                                    throw DynamicProxyResolver.a(v27);
                                                                }
                                                                if (this.S(var10_11) != 1) break block112;
                                                            }
                                                            catch (Exception v28) {
                                                                throw DynamicProxyResolver.a(v28);
                                                            }
                                                            if (!var10_11.m()) break block112;
                                                        }
                                                        catch (Exception v29) {
                                                            throw DynamicProxyResolver.a(v29);
                                                        }
                                                        if (this.K.getOrDefault(var10_11.X(), 0) > 1500) {
                                                            continue;
                                                        }
                                                    }
                                                    catch (Exception v30) {
                                                        throw DynamicProxyResolver.a(v30);
                                                    }
                                                }
                                                catch (Exception v31) {
                                                    throw DynamicProxyResolver.a(v31);
                                                }
                                            }
                                            var11_13 = (int)Math.floor(var10_11.F());
                                            var12_14 = (int)Math.floor(var10_11.V() + (double)var10_11.E());
                                            var13_16 = (int)Math.floor(var10_11.B());
                                            var14_17 = null;
                                            if (GeometryCalculator.C() >= 23) {
                                                var14_17 = var4_3.T(ReflectionUtilityBroker.t(var11_13, var12_14, var13_16));
                                            }
                                            try {
                                                v32 = var4_3.N(var11_13, var12_14, var13_16).N(var14_17) == false;
                                            }
                                            catch (Exception v33) {
                                                throw DynamicProxyResolver.a(v33);
                                            }
                                            var15_19 = v32;
                                            var16_20 = var10_11.q() - var10_11.V();
                                            var18_22 = Math.abs(var10_11.q() - var10_11.V());
                                            try {
                                                v34 = this;
                                                v35 = var4_3;
                                                v36 = var11_13;
                                                v37 = var10_11.V();
                                                v38 = var16_20 < 0.05 ? 0.45 : 0.9;
                                            }
                                            catch (Exception v39) {
                                                throw DynamicProxyResolver.a(v39);
                                            }
                                            var20_25 = v34.Q(v35, v36, (int)(v37 - v38), var13_16);
                                            try {
                                                try {
                                                    if (!var15_19 || !var20_25) break block113;
                                                }
                                                catch (Exception v40) {
                                                    throw DynamicProxyResolver.a(v40);
                                                }
                                                v41 = true;
                                                break block114;
                                            }
                                            catch (Exception v42) {
                                                throw DynamicProxyResolver.a(v42);
                                            }
                                        }
                                        v41 = false;
                                    }
                                    var21_26 = v41;
                                    try {
                                        try {
                                            try {
                                                if (!var21_26) break block115;
                                                v43 = this.K;
                                                v44 = var10_11.X();
                                                v45 = this.K.getOrDefault(var10_11.X(), 0);
                                                if (!(var18_22 < 0.05)) break block116;
                                            }
                                            catch (Exception v46) {
                                                throw DynamicProxyResolver.a(v46);
                                            }
                                            if (!var10_11.R()) break block117;
                                        }
                                        catch (Exception v47) {
                                            throw DynamicProxyResolver.a(v47);
                                        }
                                        v48 = 1;
                                        break block118;
                                    }
                                    catch (Exception v49) {
                                        throw DynamicProxyResolver.a(v49);
                                    }
                                }
                                v48 = 3;
                                break block118;
                            }
                            v48 = 1;
                        }
                        v43.put(v44, v45 + v48);
                        continue;
                    }
                    try {
                        try {
                            block120: {
                                try {
                                    try {
                                        try {
                                            block119: {
                                                try {
                                                    try {
                                                        try {
                                                            if (var10_11.b() > 0 || var10_11.H()) break block119;
                                                        }
                                                        catch (Exception v50) {
                                                            throw DynamicProxyResolver.a(v50);
                                                        }
                                                        if (var10_11.d()) break block119;
                                                    }
                                                    catch (Exception v51) {
                                                        throw DynamicProxyResolver.a(v51);
                                                    }
                                                    if (var18_22 > 0.1) break block120;
                                                }
                                                catch (Exception v52) {
                                                    throw DynamicProxyResolver.a(v52);
                                                }
                                            }
                                            if (!var10_11.R()) continue;
                                        }
                                        catch (Exception v53) {
                                            throw DynamicProxyResolver.a(v53);
                                        }
                                        if (var18_22 == 0.0) break block120;
                                    }
                                    catch (Exception v54) {
                                        throw DynamicProxyResolver.a(v54);
                                    }
                                    if (!(var18_22 > 0.5)) continue;
                                }
                                catch (Exception v55) {
                                    throw DynamicProxyResolver.a(v55);
                                }
                            }
                            v56 = this.K;
                            v57 = var10_11.X();
                            v58 = this.K.getOrDefault(var10_11.X(), 0);
                            if (!var10_11.R()) break block121;
                        }
                        catch (Exception v59) {
                            throw DynamicProxyResolver.a(v59);
                        }
                        v60 = 4;
                        break block122;
                    }
                    catch (Exception v61) {
                        throw DynamicProxyResolver.a(v61);
                    }
                }
                v60 = 1;
            }
            v56.put(v57, v58 - v60);
        }
        this.L = 0;
    }

    @Nullable
    public ColorCompositionEngine R(String string, String string2, boolean bl) {
        block11: {
            try {
                if (!this.Z()) {
                    return null;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
            try {
                try {
                    if (bl || this.O()) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
                return null;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
        }
        if (string2.startsWith(DynamicContextBroker.u)) {
            char c = this.n(string, string2);
            try {
                if (c != '\u00ff') {
                    return new ColorCompositionEngine(this.b(c));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
        }
        return null;
    }

    public boolean G(CryptographicTransformer cryptographicTransformer) {
        return this.O(null, cryptographicTransformer);
    }

    @Nullable
    public TransmissionHandler U(CryptographicTransformer cryptographicTransformer) {
        if (!cryptographicTransformer.B(ReflectionMetadataResolver.UQ)) {
            return null;
        }
        Qh qh = new Qh(cryptographicTransformer);
        TransmissionHandler transmissionHandler = qh.D();
        try {
            if (transmissionHandler.r()) {
                return transmissionHandler;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProxyResolver.a(customSystemException);
        }
        CryptographicTokenGenerator1926 cryptographicTokenGenerator1926 = qh.B();
        UUID uUID = cryptographicTokenGenerator1926.o();
        for (Object e : ApplicationLifecycleManager.y().l()) {
            ConnectionEstablisher connectionEstablisher = new ConnectionEstablisher(e);
            CryptographicTokenGenerator1926 cryptographicTokenGenerator19262 = connectionEstablisher.B();
            if (!cryptographicTokenGenerator19262.o().equals(uUID)) continue;
            oD oD2 = connectionEstablisher.a();
            try {
                if (!oD2.r()) continue;
                return oD2;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c8' || c == 'k' || c == 'H' || c == 'c') {
                field = DynamicProxyResolver.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'H' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DynamicProxyResolver.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Method method = DynamicProxyResolver.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DynamicProxyResolver.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public GenericAdapterManager x() {
        return this.A;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3911;
        if (gb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = fb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])hb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    hb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Aj", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicProxyResolver.gb[n2] = n3;
        }
        return gb[n2];
    }

    public boolean Q(ConnectionConfigurationResolver connectionConfigurationResolver, int n, int n2, int n3) {
        block10: {
            ReflectionUtilityBroker reflectionUtilityBroker = ReflectionUtilityBroker.t(n, n2, n3);
            NetworkConnectionOrchestrator networkConnectionOrchestrator = connectionConfigurationResolver.T(reflectionUtilityBroker);
            try {
                if (networkConnectionOrchestrator.Y()) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
            TransactionCorrelationEngine transactionCorrelationEngine = networkConnectionOrchestrator.I();
            try {
                if (transactionCorrelationEngine.Y()) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
            try {
                try {
                    if (transactionCorrelationEngine.N(networkConnectionOrchestrator) || !PatternMatchingOrchestrator.e(transactionCorrelationEngine)) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
        }
        return true;
    }

    public boolean Q(ConnectionConfigurationResolver connectionConfigurationResolver, double d2, double d3, double d4) {
        int n;
        int n2;
        int n3;
        ConnectionConfigurationResolver connectionConfigurationResolver2;
        DynamicProxyResolver dynamicProxyResolver;
        boolean bl;
        boolean bl2;
        block22: {
            block23: {
                TransactionCorrelationEngine transactionCorrelationEngine;
                NetworkConnectionOrchestrator networkConnectionOrchestrator;
                block21: {
                    double d5;
                    double d6;
                    double d7;
                    ConnectionConfigurationResolver connectionConfigurationResolver3;
                    boolean bl3;
                    try {
                        bl3 = AdaptiveComputationEngine.W(d3 - (double)((int)d3), 1) == 0.5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProxyResolver.a(customSystemException);
                    }
                    bl2 = bl3;
                    try {
                        connectionConfigurationResolver3 = connectionConfigurationResolver;
                        d7 = d2;
                        d6 = d3;
                        d5 = bl2 ? 0.0 : 0.1;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProxyResolver.a(customSystemException);
                    }
                    networkConnectionOrchestrator = connectionConfigurationResolver3.T(ReflectionUtilityBroker.L(d7, d6 - d5, d4));
                    try {
                        if (networkConnectionOrchestrator.Y()) {
                            return false;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProxyResolver.a(customSystemException);
                    }
                    transactionCorrelationEngine = networkConnectionOrchestrator.I();
                    try {
                        if (transactionCorrelationEngine.Y()) {
                            return false;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProxyResolver.a(customSystemException);
                    }
                    try {
                        if (!bl2) break block21;
                        bl = PatternMatchingOrchestrator.e(transactionCorrelationEngine);
                        break block22;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProxyResolver.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (transactionCorrelationEngine.N(networkConnectionOrchestrator) && !PatternMatchingOrchestrator.e(transactionCorrelationEngine)) break block23;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProxyResolver.a(customSystemException);
                    }
                    bl = true;
                    break block22;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
            }
            bl = false;
        }
        boolean bl4 = bl;
        try {
            if (bl4) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProxyResolver.a(customSystemException);
        }
        try {
            dynamicProxyResolver = this;
            connectionConfigurationResolver2 = connectionConfigurationResolver;
            n3 = (int)d2;
            n2 = (int)d3;
            n = bl2 ? 0 : 1;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProxyResolver.a(customSystemException);
        }
        return dynamicProxyResolver.Q(connectionConfigurationResolver2, n3, n2 - n, (int)d4);
    }

    public char c(Qh qh) {
        try {
            if (GeometryCalculator.C() != 15) {
                return '\u00ff';
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProxyResolver.a(customSystemException);
        }
        CryptographicTokenGenerator1926 cryptographicTokenGenerator1926 = qh.B();
        UUID uUID = cryptographicTokenGenerator1926.o();
        for (Object e : ApplicationLifecycleManager.y().l()) {
            String string;
            oD oD2;
            ConnectionEstablisher connectionEstablisher = new ConnectionEstablisher(e);
            CryptographicTokenGenerator1926 cryptographicTokenGenerator19262 = connectionEstablisher.B();
            if (!cryptographicTokenGenerator19262.o().equals(uUID) || !(oD2 = connectionEstablisher.a()).r() || !(string = oD2.W()).contains(DynamicContextBroker.u)) continue;
            for (int i = string.length(); i > 0; --i) {
                String string2 = String.valueOf(string.charAt(i - 1));
                if (!string2.equals(DynamicContextBroker.u)) continue;
                char c = string.charAt(i);
                try {
                    if (c > 'f') {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
                return c;
            }
        }
        return '\u00ff';
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DynamicProxyResolver.bb = MultiContainerRegistry.a(5262218215253308072L, 1779093098512620645L, MethodHandles.lookup().lookupClass()).a(137761134301846L);
                DynamicProxyResolver.kb = new Object[5];
                DynamicProxyResolver.lb = new String[5];
                DynamicProxyResolver.a();
                DynamicProxyResolver.hb = new HashMap<K, V>(13);
                var0 = DynamicProxyResolver.bb ^ 34661327914426L;
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
                var8_3 = new long[15];
                var5_4 = 0;
                var6_5 = "\u0094\u0081\u00b3.\u001d\u00d9e\u0089\u00d0\u00ee\u00f7\u008f\u00f3n\u00e3\r{\u00fe\u0083'z\u00d6\u00f3\u00dd\u00bd+\u00f1\u0002\u0017\u00c0!\u00a1\u00ec\u00d1L\u00dd\u00a4\u00b4\u00e7\u00e8L\u00d1$bk\u00ec/W~?\u00dc\u00fb[O\u00d6\u00eb\u0013\u008b\u009e\u0083\u00a2/m\u00e1/E+/\u008e)\u001f)\u00fb\\\u00fa5=f<\u0002<\u0016\u008e\u00e1t\u00caC\u0092\u00f3A\u00bdji\u00b3\u00a9H\u00c1\u00dci9^\b-\u0088";
                var7_6 = "\u0094\u0081\u00b3.\u001d\u00d9e\u0089\u00d0\u00ee\u00f7\u008f\u00f3n\u00e3\r{\u00fe\u0083'z\u00d6\u00f3\u00dd\u00bd+\u00f1\u0002\u0017\u00c0!\u00a1\u00ec\u00d1L\u00dd\u00a4\u00b4\u00e7\u00e8L\u00d1$bk\u00ec/W~?\u00dc\u00fb[O\u00d6\u00eb\u0013\u008b\u009e\u0083\u00a2/m\u00e1/E+/\u008e)\u001f)\u00fb\\\u00fa5=f<\u0002<\u0016\u008e\u00e1t\u00caC\u0092\u00f3A\u00bdji\u00b3\u00a9H\u00c1\u00dci9^\b-\u0088".length();
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
                    var6_5 = "\ru\u00d7/\u00c0\u00bb\u000e\u00db6\u0097\u00bf\u0087cJ\u001e\u00c3";
                    var7_6 = "\ru\u00d7/\u00c0\u00bb\u000e\u00db6\u0097\u00bf\u0087cJ\u001e\u00c3".length();
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
        DynamicProxyResolver.fb = var8_3;
        DynamicProxyResolver.gb = new Integer[15];
        DynamicProxyResolver.O = (char)DynamicProxyResolver.a("v", (int)24048, (long)(var0 ^ 1521135731694539458L));
    }

    public char n(String string, String string2) {
        int n;
        if (string2.contains(DynamicContextBroker.u) && (n = string2.indexOf(string)) > 0) {
            for (int i = n - 1; i >= 0; --i) {
                String string3 = String.valueOf(string2.charAt(i));
                if (!string3.equals(DynamicContextBroker.u)) continue;
                char c = string2.charAt(i + 1);
                try {
                    if (c > 'f') {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
                return c;
            }
        }
        return '\u00ff';
    }

    private int S(Qh qh) {
        return this.b.getOrDefault(qh.X(), -1);
    }

    @Nullable
    public ColorCompositionEngine b(MultiProtocolContextManager multiProtocolContextManager) {
        return this.R(multiProtocolContextManager.g(), multiProtocolContextManager.B(), false);
    }

    private void f() {
        try {
            if (this.t >= 20) {
                this.t = 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProxyResolver.a(customSystemException);
        }
        if (this.t++ == 0) {
            this.b.clear();
            this.i();
            List list = ApplicationLifecycleManager.c().M();
            for (Object object : this.Z) {
                if (object == null) continue;
                ConnectionEstablisher connectionEstablisher = new ConnectionEstablisher(object);
                for (Object e : list) {
                    Qh qh = new Qh(e);
                    try {
                        if (!qh.B().r() || !qh.B().equals(connectionEstablisher.B())) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProxyResolver.a(customSystemException);
                    }
                    int n = Math.max(connectionEstablisher.v(), 0);
                    this.b.put(qh.X(), n);
                }
            }
        }
    }

    private static Method d(long l, long l2) {
        int n = DynamicProxyResolver.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = lb[n];
                int n3 = string2.indexOf(8);
                clazz3 = DynamicProxyResolver.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DynamicProxyResolver.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DynamicProxyResolver.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        DynamicProxyResolver.kb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DynamicProxyResolver.b(274160361800969L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DynamicProxyResolver.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DynamicProxyResolver.kb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DynamicProxyResolver.b(274160361800969L, 0L);
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

    private static void a() {
        Object[] objectArray = kb;
        kb[0] = "GvW";
        objectArray[1] = Integer.TYPE;
        DynamicProxyResolver.lb[1] = "java/lang/Integer";
        objectArray[2] = "\u0016jz\tV9\u001dekF+!\u000ebb\u000f";
        objectArray[3] = "\u00040LJc \u000f?]\u0005\u0002.\u00044Y_";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "5\u00075n,8hK\"\u001e{\"\u0005\u00059x.#}\u00073s\u0010`t\u0007%p(da\u00005\u001e";
    }

    private void i() {
        AuthorizationManager authorizationManager;
        block9: {
            ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
            authorizationManager = ApplicationLifecycleManager.U().U();
            try {
                try {
                    if (!connectionConfigurationResolver.Y() && !authorizationManager.Y()) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
        }
        try {
            this.Z = GeometryCalculator.C() >= 50 ? Arrays.asList(authorizationManager.l().stream().sorted(NetworkProtocolEncoder458.F()).toArray()) : NetworkProtocolEncoder458.r().y(authorizationManager.l());
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProxyResolver.a(customSystemException);
        }
        ArrayList<UUID> arrayList = new ArrayList<UUID>();
        for (Object object : this.Z) {
            ConnectionEstablisher connectionEstablisher = new ConnectionEstablisher(object);
            try {
                if (!connectionEstablisher.r()) continue;
                arrayList.add(connectionEstablisher.B().o());
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
        }
        this.F = arrayList;
    }

    public boolean H(CryptographicTransformer cryptographicTransformer, boolean bl) {
        boolean bl2;
        TransactionOrchestrator1017 transactionOrchestrator1017;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block32: {
            block31: {
                try {
                    if (cryptographicTransformer.Y()) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
                systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    if (cryptographicTransformer.B(ReflectionMetadataResolver.YD)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
                try {
                    if (cryptographicTransformer.equals(systemConfigurationOrchestrator)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
                try {
                    if (!cryptographicTransformer.B(ReflectionMetadataResolver.Ut)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
                try {
                    try {
                        if (GeometryCalculator.C() <= 13 || !cryptographicTransformer.B(ReflectionMetadataResolver.PR)) break block31;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProxyResolver.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
            }
            transactionOrchestrator1017 = new TransactionOrchestrator1017(cryptographicTransformer.M());
            try {
                if (transactionOrchestrator1017.e() <= 0.0f) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
            try {
                try {
                    if (!bl || !_Y.X(transactionOrchestrator1017)) break block32;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProxyResolver.a(customSystemException);
            }
        }
        try {
            if (TemporalMetadataResolver.h.j().h(transactionOrchestrator1017)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProxyResolver.a(customSystemException);
        }
        try {
            if (this.O(systemConfigurationOrchestrator, cryptographicTransformer)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProxyResolver.a(customSystemException);
        }
        try {
            bl2 = !this.l(cryptographicTransformer);
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProxyResolver.a(customSystemException);
        }
        return bl2;
    }

    public boolean q() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.Z() || !this._c.s().booleanValue()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProxyResolver.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProxyResolver.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Field c(long l, long l2) {
        int n = DynamicProxyResolver.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            String string = lb[n];
            int n2 = string.indexOf(8);
            Class clazz = DynamicProxyResolver.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DynamicProxyResolver.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DynamicProxyResolver.a(clazz3, string2, clazz2)) != null) {
                    DynamicProxyResolver.kb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DynamicProxyResolver.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DynamicProxyResolver.kb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DynamicProxyResolver.b(274160361800969L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicProxyResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DynamicProxyResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

