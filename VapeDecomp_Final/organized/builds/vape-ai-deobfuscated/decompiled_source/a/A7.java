/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.Dv;
import a.KB;
import a.Ne;
import a.a;
import a.oQ;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.dispatch.EventDispatchRegistry2111;
import com.exception.system.CustomSystemException;
import com.finance.transaction.TransactionProcessor1728;
import com.graph.structure.RecursiveNodeGraph;
import com.math.computation.NumericComputationEngine1131;
import com.network.configuration.NetworkConfigManager;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transform.CryptographicTransformer;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class A7
extends ContextualExecutionFramework {
    private final NumericComputationEngine1131 L;
    private static final long[] d;
    private static final Integer[] e;
    private final NetworkConfigManager O;
    private static final Map h;
    private static final long b;
    private final ConcurrentHashMap<Object, Integer> P;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x46EA;
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
                throw new RuntimeException("a/A7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            A7.e[n2] = n3;
        }
        return e[n2];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                A7.b = MultiContainerRegistry.a(4855666590403441765L, -710571483553576565L, MethodHandles.lookup().lookupClass()).a(135936252101828L);
                A7.h = new HashMap<K, V>(13);
                var0 = A7.b ^ 14619668140441L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "C\u0013*f\u0097\u00fc\u00faS\u0083\u00cd\u0000H[\u00d4\u00c4y\u009e\u00ea\u00caDsz\u00ee\u0005i g\u000f\u00fe\u00a1\u00c9\u009b0o\u001d\u00fa\u00abnv)\u00b6\u00eeM\u00f8\u00dd\u00bf\u00f4\u00b3;j\u00b9]l\u00cd0d";
                var7_6 = "C\u0013*f\u0097\u00fc\u00faS\u0083\u00cd\u0000H[\u00d4\u00c4y\u009e\u00ea\u00caDsz\u00ee\u0005i g\u000f\u00fe\u00a1\u00c9\u009b0o\u001d\u00fa\u00abnv)\u00b6\u00eeM\u00f8\u00dd\u00bf\u00f4\u00b3;j\u00b9]l\u00cd0d".length();
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
                    var6_5 = "\u00dc\u00a3Q\u0017[\u00ea\u0001=\u009f\u0081\u00d7k\u0017cQ\u00c4";
                    var7_6 = "\u00dc\u00a3Q\u0017[\u00ea\u0001=\u009f\u0081\u00d7k\u0017cQ\u00c4".length();
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
        A7.d = var8_3;
        A7.e = new Integer[9];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/A7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @DataExchangeProtocol2090
    public void w(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        double d2;
        double d3;
        double d4;
        ObjectLifecycleTracker objectLifecycleTracker;
        long l = b ^ 0x5EEAA164867DL;
        ApplicationLifecycleManager.U().H(1.0);
        CryptoContextNegotiator684.Y();
        boolean bl = Ne.h.k(3042);
        try {
            if (!bl) {
                Ne.h.y(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A7.a(customSystemException);
        }
        Ne.h.y(3042);
        GL11.glBlendFunc((int)770, (int)771);
        Ne.h.h(1.5f);
        Ne.h.z(3553);
        Ne.h.y(2848);
        Ne.h.z(2929);
        Ne.h.E(false);
        double d5 = NumericComputationEngine1131.b();
        double d6 = NumericComputationEngine1131.S();
        double d7 = NumericComputationEngine1131.n();
        for (Object object : ApplicationLifecycleManager.c().L()) {
            objectLifecycleTracker = new CryptographicTransformer(object);
            if (!objectLifecycleTracker.B(ReflectionMetadataResolver.Pm)) continue;
            d4 = ((CryptographicTransformer)objectLifecycleTracker).b() + (((CryptographicTransformer)objectLifecycleTracker).F() - ((CryptographicTransformer)objectLifecycleTracker).b()) * (double)eventDispatchRegistry2111.getTicks();
            d3 = ((CryptographicTransformer)objectLifecycleTracker).q() + (((CryptographicTransformer)objectLifecycleTracker).V() - ((CryptographicTransformer)objectLifecycleTracker).q()) * (double)eventDispatchRegistry2111.getTicks();
            d2 = ((CryptographicTransformer)objectLifecycleTracker).I() + (((CryptographicTransformer)objectLifecycleTracker).B() - ((CryptographicTransformer)objectLifecycleTracker).I()) * (double)eventDispatchRegistry2111.getTicks();
            float f = ((CryptographicTransformer)objectLifecycleTracker).g();
            oQ oQ2 = ((CryptographicTransformer)objectLifecycleTracker).L();
            oQ oQ3 = oQ2.B(f, f, f);
            Color color = new Color((int)A7.a("s", (int)24570, (long)(0x6E9CFB55441C1822L ^ l)), true);
            CryptoContextNegotiator684.x(d4 - (oQ3.F() - oQ3.f()) / 2.0, d3 + (oQ3.c() - ((CryptographicTransformer)objectLifecycleTracker).V()), d2 - (oQ3.v() - oQ3.R()) / 2.0, oQ3.v() - oQ3.R(), oQ3.P() - oQ3.c(), oQ3.F() - oQ3.f(), 0.1, Color.WHITE, color, d5, d6, d7);
        }
        for (Object object : this.P.keySet()) {
            objectLifecycleTracker = new ReflectionUtilityBroker(object);
            d4 = ((Dv)objectLifecycleTracker).o();
            d3 = ((Dv)objectLifecycleTracker).q();
            d2 = ((Dv)objectLifecycleTracker).j();
            Color color = new Color((int)A7.a("s", (int)21940, (long)(0x6A3F03EE88D39269L ^ l)), true);
            CryptoContextNegotiator684.x(d4, d3, d2, 1.0, 1.0, 1.0, 0.1, Color.RED, color, d5, d6, d7);
        }
        try {
            Ne.h.E(true);
            Ne.h.y(2929);
            Ne.h.y(3553);
            Ne.h.z(2848);
            if (!bl) {
                Ne.h.z(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A7.a(customSystemException);
        }
        CryptoContextNegotiator684.J();
        ApplicationLifecycleManager.U().F(1.0);
    }

    public A7() {
        long l = b ^ 0x6FA3BC5D476BL;
        super(a.cs((int)A7.a("s", (int)16401, (long)(0xC109A34974E46D9L ^ l))), 0, (int)A7.a("s", (int)8587, (long)(0x72797358FAF12747L ^ l)), RecursiveNodeGraph.V, a.cs((int)A7.a("s", (int)30086, (long)(0x50364EE717B4734BL ^ l))));
        this.P = new ConcurrentHashMap();
        this.O = new NetworkConfigManager();
        this.L = ApplicationLifecycleManager.r();
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = A7.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @DataExchangeProtocol2090
    public void d(KB kB) {
        for (Object k : this.P.keySet()) {
            Integer n = this.P.get(k);
            try {
                if (n >= 200) {
                    this.P.remove(k);
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw A7.a(customSystemException);
            }
            this.P.put(k, n + 1);
        }
    }

    @DataExchangeProtocol2090
    public void S(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        block17: {
            long l = b ^ 0xFD263143242L;
            ConnectionLifecycleHandler connectionLifecycleHandler = networkPacketOrchestrator1222.getPacket();
            if (connectionLifecycleHandler.B(ReflectionMetadataResolver.Y9)) {
                TransactionProcessor1728 transactionProcessor1728 = new TransactionProcessor1728(connectionLifecycleHandler.M());
                ReflectionUtilityBroker reflectionUtilityBroker = transactionProcessor1728.g();
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (reflectionUtilityBroker.o() < A7.a("s", (int)6444, (long)(0x1F02246103CFEACFL ^ l)) || reflectionUtilityBroker.j() < A7.a("s", (int)10860, (long)(0x430AC35CC7BFD98CL ^ l))) break block17;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw A7.a(customSystemException);
                                            }
                                            if (reflectionUtilityBroker.o() >= A7.a("s", (int)4158, (long)(0x2E61DDA6596763D8L ^ l))) break block17;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw A7.a(customSystemException);
                                        }
                                        if (reflectionUtilityBroker.j() >= A7.a("s", (int)4174, (long)(0xC2663A68203E3A5L ^ l))) break block17;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw A7.a(customSystemException);
                                    }
                                    if (reflectionUtilityBroker.q() < 0) break block17;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw A7.a(customSystemException);
                                }
                                if (reflectionUtilityBroker.q() >= 256) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw A7.a(customSystemException);
                            }
                            if (this.P.containsKey(reflectionUtilityBroker.M())) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw A7.a(customSystemException);
                        }
                        if (this.P.size() >= 1024) break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw A7.a(customSystemException);
                    }
                    this.P.put(reflectionUtilityBroker.M(), 0);
                }
                catch (CustomSystemException customSystemException) {
                    throw A7.a(customSystemException);
                }
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(A7.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

