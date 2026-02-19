/*
 * Decompiled with CFR 0.152.
 */
package com.event.dynamic;

import a.KB;
import com.app.compression.CompressionUtility2656;
import com.app.config.management.ConfigurationRegistry;
import com.app.events.GenericEventDispatcher2175;
import com.app.security.validation.SecurityValidationService;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.encoding.protocol.EncodingProtocolEnum;
import com.event.management.EventBroadcastCoordinator;
import com.exception.system.CustomSystemException;
import com.indexing.metadata.MetadataIndexingService;
import com.math.geometry.GeometryCalculator;
import com.messaging.core.MessageInterceptor;
import com.network.clustering.ClusterNodeRegistry1151;
import com.network.configuration.NetworkConfigManager;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.event.NetworkEventDispatcher;
import com.object.lifecycle.ObjectLifecycleMediator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.resource.management.ResourceAllocationTracker401;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.security.auth.AuthorizationManager;
import com.security.cipher.CryptographicTransformer1102;
import com.security.crypto.CryptographicKeyExchanger1497;
import com.system.monitoring.RuntimeResourceTracker;
import com.transaction.management.TransactionOrchestrator1017;
import com.util.numeric.NumericFormattingUtility;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class DynamicEventOrchestrator
extends GenericEventDispatcher2175 {
    private static final Integer[] j;
    private static final Map n;
    private int A;
    private final NumericFormattingUtility l;
    private final ObjectLifecycleMediator h;
    private boolean O;
    private static final long[] e;
    private static final String[] t;
    private static final Object[] o;
    private CompressionUtility2656 G;
    private boolean m;
    private final NetworkConfigManager x;
    private static final long d;
    private final Queue<NetworkEventDispatcher> v;
    private boolean r;

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

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void lambda$flushPackets$0() {
        for (NetworkEventDispatcher networkEventDispatcher : this.v) {
            boolean bl = this.h.G(networkEventDispatcher);
        }
        this.v.clear();
    }

    private static void a() {
        Object[] objectArray = o;
        o[0] = "\u0018\u0017\t";
        objectArray[1] = Integer.TYPE;
        DynamicEventOrchestrator.t[1] = "java/lang/Integer";
        objectArray[2] = "\bUN\u000br\b\u0003Z_D\u000f\u0010\u0010]V\r";
        objectArray[3] = "\u00027\n\u0016";
        objectArray[4] = Boolean.TYPE;
        DynamicEventOrchestrator.t[4] = "java/lang/Boolean";
        objectArray[5] = Void.TYPE;
        DynamicEventOrchestrator.t[5] = "java/lang/Void";
        objectArray[6] = "!MB6";
        objectArray[7] = ",&>\u00040;')/KQ5,\"+\u0011";
        objectArray[8] = "\u0003@o\u0005\u0005\u0017U\u0001|Tc$9Dm\u0014\u000fU\u0001\u0006yU\u001fj";
        objectArray[9] = "Nrs0CL\u00183`a%Ztwc)FUH'&/F1O\"o<\u001a\t\r6.,%";
        objectArray[10] = "u\u001btK{c#Zg\u001a\u001d[O\u0018'Ral+If\u0015\"\u001euY`Hy\"%\u001cfH\u001d";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "3\u0016Z=7D*\u000e\u001aS=GPH\u0019?'Gh\u0018Wb7<i\u0001UljQ?\b\u001d9V";
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @DataExchangeProtocol2090
    public void S(KB var1_1) {
        block97: {
            block99: {
                block91: {
                    block98: {
                        block94: {
                            block95: {
                                block92: {
                                    block93: {
                                        block89: {
                                            block90: {
                                                block87: {
                                                    block88: {
                                                        block86: {
                                                            block85: {
                                                                block84: {
                                                                    block83: {
                                                                        block81: {
                                                                            block82: {
                                                                                var2_2 = DynamicEventOrchestrator.d ^ 3448477644829L;
                                                                                var4_3 = ConnectionLifecycleHandler.W();
                                                                                try {
                                                                                    v0 = ApplicationLifecycleManager.U().Y();
                                                                                    if (var4_3 == null) break block81;
                                                                                    if (!v0) break block82;
                                                                                }
                                                                                catch (CustomSystemException v1) {
                                                                                    throw DynamicEventOrchestrator.a(v1);
                                                                                }
                                                                                return;
                                                                            }
                                                                            v0 = ClusterNodeRegistry1151.W().S().D();
                                                                        }
                                                                        if (!v0) {
                                                                            return;
                                                                        }
                                                                        var5_4 = this.f();
                                                                        try {
                                                                            try {
                                                                                if (var5_4 == null) break block83;
                                                                                v2 = this.Q();
                                                                                if (var4_3 == null) break block84;
                                                                            }
                                                                            catch (CustomSystemException v3) {
                                                                                throw DynamicEventOrchestrator.a(v3);
                                                                            }
                                                                            if (v2 == 0) break block83;
                                                                        }
                                                                        catch (CustomSystemException v4) {
                                                                            throw DynamicEventOrchestrator.a(v4);
                                                                        }
                                                                        v2 = 1;
                                                                        break block84;
                                                                    }
                                                                    v2 = 0;
                                                                }
                                                                var6_5 = v2;
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (var5_4 != null) break block85;
                                                                                                                    v5 = this.Q();
                                                                                                                    if (var4_3 == null) break block86;
                                                                                                                }
                                                                                                                catch (CustomSystemException v6) {
                                                                                                                    throw DynamicEventOrchestrator.a(v6);
                                                                                                                }
                                                                                                                if (v5 == 0) break block85;
                                                                                                            }
                                                                                                            catch (CustomSystemException v7) {
                                                                                                                throw DynamicEventOrchestrator.a(v7);
                                                                                                            }
                                                                                                            v5 = ((MetadataIndexingService)this.n()).G();
                                                                                                            if (var4_3 == null) break block86;
                                                                                                        }
                                                                                                        catch (CustomSystemException v8) {
                                                                                                            throw DynamicEventOrchestrator.a(v8);
                                                                                                        }
                                                                                                        if (v5 == 0) break block85;
                                                                                                    }
                                                                                                    catch (CustomSystemException v9) {
                                                                                                        throw DynamicEventOrchestrator.a(v9);
                                                                                                    }
                                                                                                    v5 = (int)((MetadataIndexingService)this.n()).G.s().booleanValue();
                                                                                                    if (var4_3 == null) break block86;
                                                                                                }
                                                                                                catch (CustomSystemException v10) {
                                                                                                    throw DynamicEventOrchestrator.a(v10);
                                                                                                }
                                                                                                if (v5 == 0) break block85;
                                                                                            }
                                                                                            catch (CustomSystemException v11) {
                                                                                                throw DynamicEventOrchestrator.a(v11);
                                                                                            }
                                                                                            v5 = (int)this.m;
                                                                                            if (var4_3 == null) break block86;
                                                                                        }
                                                                                        catch (CustomSystemException v12) {
                                                                                            throw DynamicEventOrchestrator.a(v12);
                                                                                        }
                                                                                        if (v5 != 0) break block85;
                                                                                    }
                                                                                    catch (CustomSystemException v13) {
                                                                                        throw DynamicEventOrchestrator.a(v13);
                                                                                    }
                                                                                    v5 = (int)DynamicContextBroker.H();
                                                                                    if (var4_3 == null) break block86;
                                                                                }
                                                                                catch (CustomSystemException v14) {
                                                                                    throw DynamicEventOrchestrator.a(v14);
                                                                                }
                                                                                if (v5 == 0) break block85;
                                                                            }
                                                                            catch (CustomSystemException v15) {
                                                                                throw DynamicEventOrchestrator.a(v15);
                                                                            }
                                                                            v5 = (int)ApplicationLifecycleManager.U().w();
                                                                            if (var4_3 == null) break block86;
                                                                        }
                                                                        catch (CustomSystemException v16) {
                                                                            throw DynamicEventOrchestrator.a(v16);
                                                                        }
                                                                        if (v5 == 0) break block85;
                                                                    }
                                                                    catch (CustomSystemException v17) {
                                                                        throw DynamicEventOrchestrator.a(v17);
                                                                    }
                                                                    CryptographicTransformer1102.C();
                                                                    this.O = false;
                                                                    this.r = false;
                                                                    return;
                                                                }
                                                                catch (CustomSystemException v18) {
                                                                    throw DynamicEventOrchestrator.a(v18);
                                                                }
                                                            }
                                                            v5 = ((MetadataIndexingService)this.n()).G();
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var4_3 == null) break block87;
                                                                    if (v5 == 0) break block88;
                                                                }
                                                                catch (CustomSystemException v19) {
                                                                    throw DynamicEventOrchestrator.a(v19);
                                                                }
                                                                v5 = DynamicContextBroker.H();
                                                                if (var4_3 == null) break block87;
                                                            }
                                                            catch (CustomSystemException v20) {
                                                                throw DynamicEventOrchestrator.a(v20);
                                                            }
                                                            if (v5 != 0) break block88;
                                                        }
                                                        catch (CustomSystemException v21) {
                                                            throw DynamicEventOrchestrator.a(v21);
                                                        }
                                                        var6_5 = 0;
                                                    }
                                                    v5 = var1_1.getThePlayer().b();
                                                }
                                                try {
                                                    try {
                                                        if (var4_3 == null) break block89;
                                                        if (v5 <= ResourceAllocationTracker401.H.C() + 1) break block90;
                                                    }
                                                    catch (CustomSystemException v22) {
                                                        throw DynamicEventOrchestrator.a(v22);
                                                    }
                                                    DynamicEventOrchestrator.c("E", (Object)this, (boolean)false, (long)6639568805409490534L, (long)var2_2);
                                                    this.O = false;
                                                    this.r = false;
                                                    return;
                                                }
                                                catch (CustomSystemException v23) {
                                                    throw DynamicEventOrchestrator.a(v23);
                                                }
                                            }
                                            v5 = var6_5;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (var4_3 == null) break block91;
                                                                if (v5 != 0) {
                                                                }
                                                                ** GOTO lbl247
                                                            }
                                                            catch (CustomSystemException v24) {
                                                                throw DynamicEventOrchestrator.a(v24);
                                                            }
                                                            v25 = this.m;
                                                            if (var4_3 == null) break block92;
                                                        }
                                                        catch (CustomSystemException v26) {
                                                            throw DynamicEventOrchestrator.a(v26);
                                                        }
                                                        if (!v25) break block93;
                                                    }
                                                    catch (CustomSystemException v27) {
                                                        throw DynamicEventOrchestrator.a(v27);
                                                    }
                                                    v25 = this.x.m(this.A - 50);
                                                    if (var4_3 == null) break block92;
                                                }
                                                catch (CustomSystemException v28) {
                                                    throw DynamicEventOrchestrator.a(v28);
                                                }
                                                if (!v25) break block93;
                                            }
                                            catch (CustomSystemException v29) {
                                                throw DynamicEventOrchestrator.a(v29);
                                            }
                                            DynamicEventOrchestrator.c("E", (Object)this, (boolean)true, (long)6639568805409490534L, (long)var2_2);
                                            return;
                                        }
                                        catch (CustomSystemException v30) {
                                            throw DynamicEventOrchestrator.a(v30);
                                        }
                                    }
                                    v25 = this.r;
                                }
                                try {
                                    block96: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var4_3 == null) break block94;
                                                        if (!v25) {
                                                        }
                                                        ** GOTO lbl221
                                                    }
                                                    catch (CustomSystemException v31) {
                                                        throw DynamicEventOrchestrator.a(v31);
                                                    }
                                                    v32 = this;
                                                    if (var4_3 == null) break block95;
                                                }
                                                catch (CustomSystemException v33) {
                                                    throw DynamicEventOrchestrator.a(v33);
                                                }
                                                if (v32.O) break block96;
                                            }
                                            catch (CustomSystemException v34) {
                                                throw DynamicEventOrchestrator.a(v34);
                                            }
                                            DynamicEventOrchestrator.c("E", (Object)this, (boolean)true, (long)6639568805409490534L, (long)var2_2);
                                            if (var4_3 != null) break block97;
                                        }
                                        catch (CustomSystemException v35) {
                                            throw DynamicEventOrchestrator.a(v35);
                                        }
                                    }
                                    DynamicEventOrchestrator.c("E", (Object)this, (boolean)false, (long)6639568805409490534L, (long)var2_2);
                                    v32 = this;
                                }
                                catch (CustomSystemException v36) {
                                    throw DynamicEventOrchestrator.a(v36);
                                }
                            }
                            try {
                                v32.r = true;
                                if (var4_3 != null) break block97;
lbl221:
                                // 2 sources

                                v25 = this.O;
                            }
                            catch (CustomSystemException v37) {
                                throw DynamicEventOrchestrator.a(v37);
                            }
                        }
                        try {
                            try {
                                if (var4_3 == null) break block98;
                                if (v25) break block97;
                            }
                            catch (CustomSystemException v38) {
                                throw DynamicEventOrchestrator.a(v38);
                            }
                            v25 = var1_1.getThePlayer().w();
                        }
                        catch (CustomSystemException v39) {
                            throw DynamicEventOrchestrator.a(v39);
                        }
                    }
                    try {
                        try {
                            try {
                                if (v25) break block97;
                                this.r = false;
                                if (var4_3 != null) break block97;
                            }
                            catch (CustomSystemException v40) {
                                throw DynamicEventOrchestrator.a(v40);
                            }
lbl247:
                            // 2 sources

                            v41 = this;
                            if (var4_3 == null) break block99;
                        }
                        catch (CustomSystemException v42) {
                            throw DynamicEventOrchestrator.a(v42);
                        }
                        v5 = (int)v41.O;
                    }
                    catch (CustomSystemException v43) {
                        throw DynamicEventOrchestrator.a(v43);
                    }
                }
                try {
                    if (v5 == 0) break block97;
                    DynamicEventOrchestrator.c("E", (Object)this, (boolean)false, (long)6639568805409490534L, (long)var2_2);
                    v41 = this;
                }
                catch (CustomSystemException v44) {
                    throw DynamicEventOrchestrator.a(v44);
                }
            }
            v41.r = false;
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x16E8;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])DynamicEventOrchestrator.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    DynamicEventOrchestrator.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xR", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicEventOrchestrator.j[n2] = n3;
        }
        return j[n2];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DynamicEventOrchestrator.d = MultiContainerRegistry.a(-7068305515605336284L, -3182879469808414586L, MethodHandles.lookup().lookupClass()).a(52471605395839L);
                DynamicEventOrchestrator.o = new Object[12];
                DynamicEventOrchestrator.t = new String[12];
                DynamicEventOrchestrator.a();
                DynamicEventOrchestrator.n = new HashMap<K, V>(13);
                var0 = DynamicEventOrchestrator.d ^ 77831145933492L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "\u0005\\\u000f\u0015L)\u0090\u00c4\u0017\u0085\u00e2\u0018\u00ae~[P";
                var7_6 = "\u0005\\\u000f\u0015L)\u0090\u00c4\u0017\u0085\u00e2\u0018\u00ae~[P".length();
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
                    var6_5 = ":5\u0098vL\u0019\u00eca\u0093\u000f\u00fdt\u00b2\u00fb0#";
                    var7_6 = ":5\u0098vL\u0019\u00eca\u0093\u000f\u00fdt\u00b2\u00fb0#".length();
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
        DynamicEventOrchestrator.e = var8_3;
        DynamicEventOrchestrator.j = new Integer[4];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicEventOrchestrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public TransactionOrchestrator1017 f() {
        return ((MetadataIndexingService)this.n()).j((Double)((MetadataIndexingService)this.n()).t.J(), (Double)((MetadataIndexingService)this.n()).m.J());
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DynamicEventOrchestrator.a(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                DynamicEventOrchestrator.o[n] = clazz = Class.forName(t[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = DynamicEventOrchestrator.a(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = t[n];
            int n2 = string.indexOf(8);
            Class clazz = DynamicEventOrchestrator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DynamicEventOrchestrator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DynamicEventOrchestrator.a(clazz3, string2, clazz2)) != null) {
                    DynamicEventOrchestrator.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DynamicEventOrchestrator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DynamicEventOrchestrator.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DynamicEventOrchestrator.b(562465400431746L, 0L);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = DynamicEventOrchestrator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DynamicEventOrchestrator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (t[n4] != null) {
            return n4;
        }
        Object object = o[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 33;
                break;
            }
            case 1: {
                n3 = 39;
                break;
            }
            case 2: {
                n3 = 26;
                break;
            }
            case 3: {
                n3 = 53;
                break;
            }
            case 4: {
                n3 = 16;
                break;
            }
            case 5: {
                n3 = 55;
                break;
            }
            case 6: {
                n3 = 12;
                break;
            }
            case 7: {
                n3 = 27;
                break;
            }
            case 8: {
                n3 = 56;
                break;
            }
            case 9: {
                n3 = 63;
                break;
            }
            case 10: {
                n3 = 5;
                break;
            }
            case 11: {
                n3 = 14;
                break;
            }
            case 12: {
                n3 = 45;
                break;
            }
            case 13: {
                n3 = 41;
                break;
            }
            case 14: {
                n3 = 59;
                break;
            }
            case 15: {
                n3 = 4;
                break;
            }
            case 16: {
                n3 = 54;
                break;
            }
            case 17: {
                n3 = 13;
                break;
            }
            case 18: {
                n3 = 30;
                break;
            }
            case 19: {
                n3 = 51;
                break;
            }
            case 20: {
                n3 = 35;
                break;
            }
            case 21: {
                n3 = 36;
                break;
            }
            case 22: {
                n3 = 6;
                break;
            }
            case 23: {
                n3 = 31;
                break;
            }
            case 24: {
                n3 = 47;
                break;
            }
            case 25: {
                n3 = 25;
                break;
            }
            case 26: {
                n3 = 60;
                break;
            }
            case 27: {
                n3 = 7;
                break;
            }
            case 28: {
                n3 = 18;
                break;
            }
            case 29: {
                n3 = 49;
                break;
            }
            case 30: {
                n3 = 11;
                break;
            }
            case 31: {
                n3 = 61;
                break;
            }
            case 32: {
                n3 = 24;
                break;
            }
            case 33: {
                n3 = 38;
                break;
            }
            case 34: {
                n3 = 46;
                break;
            }
            case 35: {
                n3 = 37;
                break;
            }
            case 36: {
                n3 = 58;
                break;
            }
            case 37: {
                n3 = 29;
                break;
            }
            case 38: {
                n3 = 22;
                break;
            }
            case 39: {
                n3 = 28;
                break;
            }
            case 40: {
                n3 = 34;
                break;
            }
            case 41: {
                n3 = 8;
                break;
            }
            case 42: {
                n3 = 52;
                break;
            }
            case 43: {
                n3 = 40;
                break;
            }
            case 44: {
                n3 = 15;
                break;
            }
            case 45: {
                n3 = 62;
                break;
            }
            case 46: {
                n3 = 48;
                break;
            }
            case 47: {
                n3 = 23;
                break;
            }
            case 48: {
                n3 = 2;
                break;
            }
            case 49: {
                n3 = 57;
                break;
            }
            case 50: {
                n3 = 20;
                break;
            }
            case 51: {
                n3 = 21;
                break;
            }
            case 52: {
                n3 = 19;
                break;
            }
            case 53: {
                n3 = 44;
                break;
            }
            case 54: {
                n3 = 50;
                break;
            }
            case 55: {
                n3 = 32;
                break;
            }
            case 56: {
                n3 = 17;
                break;
            }
            case 57: {
                n3 = 1;
                break;
            }
            case 58: {
                n3 = 3;
                break;
            }
            case 59: {
                n3 = 0;
                break;
            }
            case 60: {
                n3 = 9;
                break;
            }
            case 61: {
                n3 = 42;
                break;
            }
            case 62: {
                n3 = 10;
                break;
            }
            default: {
                n3 = 43;
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
        DynamicEventOrchestrator.t[n4] = new String(cArray);
        return n4;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DynamicEventOrchestrator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DynamicEventOrchestrator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DynamicEventOrchestrator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            if (c == '\u00dc' || c == '\u00e8' || c == '\u00d8' || c == '\u00e2') {
                field = DynamicEventOrchestrator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00dc' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DynamicEventOrchestrator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'E' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ce' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void F() {
        long l = d ^ 0x62B46C253B84L;
        try {
            if (!Thread.currentThread().equals(EventBroadcastCoordinator.W.R())) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicEventOrchestrator.a(customSystemException);
        }
        AuthorizationManager authorizationManager = ApplicationLifecycleManager.U().U();
        MessageInterceptor messageInterceptor = authorizationManager.f();
        ObjectLifecycleMediator.y(messageInterceptor, this::lambda$flushPackets$0);
    }

    private static Method d(long l, long l2) {
        int n = DynamicEventOrchestrator.a(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = t[n];
                int n3 = string2.indexOf(8);
                clazz3 = DynamicEventOrchestrator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DynamicEventOrchestrator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DynamicEventOrchestrator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        DynamicEventOrchestrator.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DynamicEventOrchestrator.b(562465400431746L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DynamicEventOrchestrator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DynamicEventOrchestrator.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DynamicEventOrchestrator.b(562465400431746L, 0L);
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

    private boolean Q() {
        boolean bl;
        block8: {
            block7: {
                try {
                    if (ApplicationLifecycleManager.X().r()) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicEventOrchestrator.a(customSystemException);
                }
                try {
                    try {
                        if (!ApplicationLifecycleManager.U().K().r() || !RuntimeResourceTracker.a(ApplicationLifecycleManager.U().K().C())) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicEventOrchestrator.a(customSystemException);
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicEventOrchestrator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public String t() {
        long l = d ^ 0x2B39830448F9L;
        String string = (String)((Object)DynamicEventOrchestrator.c("\u00ce", (int)DynamicEventOrchestrator.a("d", (int)9881, (long)(0x5BDFB94E205C5CB2L ^ l)), (long)-1386861348366146396L, (long)l)) + this.l.p() + (String)((Object)DynamicEventOrchestrator.c("\u00ce", (int)DynamicEventOrchestrator.a("d", (int)24273, (long)(0x1A57A36EF662A4FBL ^ l)), (long)-1386861348366146396L, (long)l));
        if (this.m) {
            string = "\u00a7c" + string;
        }
        return string;
    }

    public DynamicEventOrchestrator(ContextualExecutionFramework contextualExecutionFramework, String string) {
        long l = d ^ 0x6A86B5FAC432L;
        super(contextualExecutionFramework, string);
        this.h = ObjectLifecycleMediator.P;
        this.v = new LinkedList<NetworkEventDispatcher>();
        this.l = NumericFormattingUtility.P(this, (String)((Object)DynamicEventOrchestrator.c("\u00ce", (int)DynamicEventOrchestrator.a("d", (int)32436, (long)(0x71C3385BACA70856L ^ l)), (long)6920802603111819375L, (long)l)), (String)((Object)DynamicEventOrchestrator.c("\u00ce", (int)DynamicEventOrchestrator.a("d", (int)18626, (long)(0x6D4C594B34753E21L ^ l)), (long)6920802603111819375L, (long)l)), "", 0.0, 50.0, 100.0, 500.0);
        this.x = new NetworkConfigManager();
        this.G = ConfigurationRegistry.h;
        this.N(this.l);
        this.G.y(this, 5);
    }

    /*
     * Unable to fully structure code
     */
    private boolean M(ConnectionLifecycleHandler var1_1) {
        block9: {
            block10: {
                block12: {
                    block13: {
                        block11: {
                            var2_2 = DynamicEventOrchestrator.d ^ 56113469377693L;
                            var4_3 = ConnectionLifecycleHandler.W();
                            try {
                                v0 = var1_1.B(ReflectionMetadataResolver.Uc);
                                if (var4_3 == null) break block9;
                                if (!v0) break block10;
                            }
                            catch (CustomSystemException v1) {
                                throw DynamicEventOrchestrator.a(v1);
                            }
                            var5_4 = new CryptographicKeyExchanger1497(var1_1);
                            try {
                                v2 = GeometryCalculator.C();
                                v3 = 15;
                                if (var4_3 == null) break block11;
                                if (v2 >= v3) {
                                }
                                ** GOTO lbl24
                            }
                            catch (CustomSystemException v4) {
                                throw DynamicEventOrchestrator.a(v4);
                            }
                            var6_5 = var5_4.a().equals(SecurityValidationService.W());
                            try {
                                try {
                                    if (var4_3 != null) break block12;
lbl24:
                                    // 2 sources

                                    v2 = var5_4.r();
                                    if (var4_3 == null) break block13;
                                }
                                catch (CustomSystemException v5) {
                                    throw DynamicEventOrchestrator.a(v5);
                                }
                                v3 = 5;
                            }
                            catch (CustomSystemException v6) {
                                throw DynamicEventOrchestrator.a(v6);
                            }
                        }
                        v2 = v2 == v3 ? 1 : 0;
                    }
                    var6_5 = v2;
                }
                return (boolean)var6_5;
            }
            v0 = false;
        }
        return v0;
    }

    @Override
    public boolean y() {
        return this.O;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void p(NetworkEventDispatcher var1_1) {
        block72: {
            block73: {
                block71: {
                    block69: {
                        block70: {
                            block59: {
                                block60: {
                                    block68: {
                                        block67: {
                                            block65: {
                                                block63: {
                                                    block64: {
                                                        block62: {
                                                            block61: {
                                                                block57: {
                                                                    block58: {
                                                                        block55: {
                                                                            block56: {
                                                                                block54: {
                                                                                    block53: {
                                                                                        block51: {
                                                                                            block52: {
                                                                                                block50: {
                                                                                                    block48: {
                                                                                                        block49: {
                                                                                                            var2_2 = DynamicEventOrchestrator.d ^ 131777024651596L;
                                                                                                            var4_3 = ConnectionLifecycleHandler.W();
                                                                                                            try {
                                                                                                                v0 = var1_1.isCanceled();
                                                                                                                if (var4_3 == null) break block48;
                                                                                                                if (!v0) break block49;
                                                                                                            }
                                                                                                            catch (CustomSystemException v1) {
                                                                                                                throw DynamicEventOrchestrator.a(v1);
                                                                                                            }
                                                                                                            return;
                                                                                                        }
                                                                                                        try {
                                                                                                            v2 = var1_1;
                                                                                                            if (var4_3 == null) break block50;
                                                                                                            v0 = v2.wasModified();
                                                                                                        }
                                                                                                        catch (CustomSystemException v3) {
                                                                                                            throw DynamicEventOrchestrator.a(v3);
                                                                                                        }
                                                                                                    }
                                                                                                    if (v0) {
                                                                                                        return;
                                                                                                    }
                                                                                                    v2 = var1_1;
                                                                                                }
                                                                                                var5_4 = v2.getPacket();
                                                                                                try {
                                                                                                    v4 /* !! */  = this.h.n(var5_4);
                                                                                                    if (var4_3 == null) break block51;
                                                                                                    if (!v4 /* !! */ ) break block52;
                                                                                                }
                                                                                                catch (CustomSystemException v5) {
                                                                                                    throw DynamicEventOrchestrator.a(v5);
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            v4 /* !! */  = ApplicationLifecycleManager.U().Y();
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (var4_3 == null) break block53;
                                                                                                if (v4 /* !! */ ) break block54;
                                                                                            }
                                                                                            catch (CustomSystemException v6) {
                                                                                                throw DynamicEventOrchestrator.a(v6);
                                                                                            }
                                                                                            v4 /* !! */  = var5_4.B(ReflectionMetadataResolver.VX);
                                                                                        }
                                                                                        catch (CustomSystemException v7) {
                                                                                            throw DynamicEventOrchestrator.a(v7);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        if (var4_3 == null) break block55;
                                                                                        if (!v4 /* !! */ ) break block56;
                                                                                    }
                                                                                    catch (CustomSystemException v8) {
                                                                                        throw DynamicEventOrchestrator.a(v8);
                                                                                    }
                                                                                }
                                                                                return;
                                                                            }
                                                                            v4 /* !! */  = Thread.currentThread().equals(EventBroadcastCoordinator.W.R());
                                                                        }
                                                                        try {
                                                                            if (var4_3 == null) break block57;
                                                                            if (v4 /* !! */ ) break block58;
                                                                        }
                                                                        catch (CustomSystemException v9) {
                                                                            throw DynamicEventOrchestrator.a(v9);
                                                                        }
                                                                        return;
                                                                    }
                                                                    v4 /* !! */  = this.m;
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var4_3 == null) break block59;
                                                                                if (!v4 /* !! */ ) break block60;
                                                                            }
                                                                            catch (CustomSystemException v10) {
                                                                                throw DynamicEventOrchestrator.a(v10);
                                                                            }
                                                                            v11 = this;
                                                                            if (var4_3 == null) break block61;
                                                                        }
                                                                        catch (CustomSystemException v12) {
                                                                            throw DynamicEventOrchestrator.a(v12);
                                                                        }
                                                                        if (v11.f() == null) break block62;
                                                                    }
                                                                    catch (CustomSystemException v13) {
                                                                        throw DynamicEventOrchestrator.a(v13);
                                                                    }
                                                                    v11 = this;
                                                                }
                                                                catch (CustomSystemException v14) {
                                                                    throw DynamicEventOrchestrator.a(v14);
                                                                }
                                                            }
                                                            try {
                                                                v15 = v11.Q();
                                                                if (var4_3 == null) break block63;
                                                                if (v15) break block64;
                                                            }
                                                            catch (CustomSystemException v16) {
                                                                throw DynamicEventOrchestrator.a(v16);
                                                            }
                                                        }
                                                        v15 = true;
                                                        break block63;
                                                    }
                                                    v15 = false;
                                                }
                                                var6_5 = v15;
                                                try {
                                                    block66: {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var4_3 == null) break block65;
                                                                    if (var6_5) break block66;
                                                                }
                                                                catch (CustomSystemException v17) {
                                                                    throw DynamicEventOrchestrator.a(v17);
                                                                }
                                                                v18 = this.x.m(this.A);
                                                                if (var4_3 == null) break block67;
                                                            }
                                                            catch (CustomSystemException v19) {
                                                                throw DynamicEventOrchestrator.a(v19);
                                                            }
                                                            if (v18) {
                                                            }
                                                            ** GOTO lbl135
                                                        }
                                                        catch (CustomSystemException v20) {
                                                            throw DynamicEventOrchestrator.a(v20);
                                                        }
                                                    }
                                                    DynamicEventOrchestrator.c("u", (Object)this, (long)-3065405805769675111L, (long)var2_2);
                                                    this.m = false;
                                                    this.r = false;
                                                }
                                                catch (CustomSystemException v21) {
                                                    throw DynamicEventOrchestrator.a(v21);
                                                }
                                            }
                                            try {
                                                if (var4_3 != null) break block68;
lbl135:
                                                // 2 sources

                                                v18 = this.v.add(var1_1);
                                            }
                                            catch (CustomSystemException v22) {
                                                throw DynamicEventOrchestrator.a(v22);
                                            }
                                        }
                                        var1_1.setCanceled(true);
                                    }
                                    return;
                                }
                                v4 /* !! */  = DynamicEventOrchestrator.c("u", (Object)this, (Object)var5_4, (long)-3065325108512780593L, (long)var2_2);
                            }
                            try {
                                try {
                                    if (var4_3 == null) break block69;
                                    if (!v4 /* !! */ ) break block70;
                                }
                                catch (CustomSystemException v23) {
                                    throw DynamicEventOrchestrator.a(v23);
                                }
                                this.G.d();
                                this.v.add(var1_1);
                                var1_1.setCanceled(true);
                                this.m = true;
                                this.A = (int)this.l.l();
                                this.x.m();
                            }
                            catch (CustomSystemException v24) {
                                throw DynamicEventOrchestrator.a(v24);
                            }
                        }
                        v4 /* !! */  = this.m;
                    }
                    try {
                        try {
                            try {
                                if (var4_3 == null) break block71;
                                if (v4 /* !! */ ) break block72;
                            }
                            catch (CustomSystemException v25) {
                                throw DynamicEventOrchestrator.a(v25);
                            }
                            v26 = this;
                            if (var4_3 == null) break block73;
                        }
                        catch (CustomSystemException v27) {
                            throw DynamicEventOrchestrator.a(v27);
                        }
                        v4 /* !! */  = v26.v.isEmpty();
                    }
                    catch (CustomSystemException v28) {
                        throw DynamicEventOrchestrator.a(v28);
                    }
                }
                try {
                    if (!v4 /* !! */ ) break block72;
                    this.G.Z();
                    v26 = this;
                }
                catch (CustomSystemException v29) {
                    throw DynamicEventOrchestrator.a(v29);
                }
            }
            v26.h.q(var5_4);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void c(boolean var1_1) {
        block10: {
            block11: {
                block9: {
                    var2_2 = DynamicEventOrchestrator.d ^ 94573111306229L;
                    var4_3 = ConnectionLifecycleHandler.W();
                    try {
                        try {
                            try {
                                v0 = this.O;
                                if (var4_3 == null) break block9;
                                if (v0 == var1_1) break block10;
                            }
                            catch (CustomSystemException v1) {
                                throw DynamicEventOrchestrator.a(v1);
                            }
                            this.O = var1_1;
                            if (var4_3 == null) break block11;
                        }
                        catch (CustomSystemException v2) {
                            throw DynamicEventOrchestrator.a(v2);
                        }
                        v0 = var1_1;
                    }
                    catch (CustomSystemException v3) {
                        throw DynamicEventOrchestrator.a(v3);
                    }
                }
                if (!v0) ** GOTO lbl27
                CryptographicTransformer1102.g();
            }
            try {
                if (var4_3 != null) break block10;
lbl27:
                // 2 sources

                CryptographicTransformer1102.C();
            }
            catch (CustomSystemException v4) {
                throw DynamicEventOrchestrator.a(v4);
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicEventOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DynamicEventOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

