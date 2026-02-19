/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import a.a;
import a.oQ;
import a.oZ;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.math.geometry.GeometryCalculator;
import com.output.processing.OutputEncoder;
import com.runtime.context.ContextualExecutionFramework;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.simulation.calibration.SimulationParameterCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class AdaptiveConnectionManager
extends ContextualExecutionFramework {
    private static final Map h;
    private boolean T;
    private static final long[] d;
    private boolean R;
    private static final long b;
    private static final Integer[] e;

    public AdaptiveConnectionManager() {
        long l = b ^ 0x61BFA88C9DEL;
        super(a.cs((int)AdaptiveConnectionManager.a("c", (int)15064, (long)(0x6DA1D920EB9CE66CL ^ l))), (int)AdaptiveConnectionManager.a("c", (int)7630, (long)(0x49452177A185C17BL ^ l)), RecursiveNodeGraph.k, a.cs((int)AdaptiveConnectionManager.a("c", (int)20976, (long)(0x3386C3E6245A8D47L ^ l))));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ji" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @DataExchangeProtocol2090
    public void C(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        block22: {
            Object object;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192;
            block24: {
                block23: {
                    boolean bl;
                    block20: {
                        block21: {
                            try {
                                if (TemporalMetadataResolver.h.U().W(SimulationParameterCalibrator.class)) {
                                    return;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveConnectionManager.a(customSystemException);
                            }
                            connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().r();
                            systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                            try {
                                try {
                                    if (!this.R) break block20;
                                    if (this.T) break block21;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveConnectionManager.a(customSystemException);
                                }
                                OutputEncoder.r(connectionPoolOrchestrator1192, false, false);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveConnectionManager.a(customSystemException);
                            }
                        }
                        this.R = false;
                        this.T = false;
                        return;
                    }
                    try {
                        if (connectionPoolOrchestrator1192.X()) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveConnectionManager.a(customSystemException);
                    }
                    oZ oZ2 = systemConfigurationOrchestrator.W();
                    try {
                        bl = oZ2.t() > 0.0f;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveConnectionManager.a(customSystemException);
                    }
                    boolean bl2 = bl;
                    try {
                        try {
                            if (!bl2 || !systemConfigurationOrchestrator.j()) break block22;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveConnectionManager.a(customSystemException);
                        }
                        if (GeometryCalculator.C() < 15) break block23;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveConnectionManager.a(customSystemException);
                    }
                    object = systemConfigurationOrchestrator.L();
                    break block24;
                }
                Object object2 = systemConfigurationOrchestrator.L();
                object = ((oQ)object2).h();
            }
            double d2 = 0.0;
            double d3 = systemConfigurationOrchestrator.q();
            double d4 = 90.0;
            double d5 = Math.cos(Math.toRadians(d3 + d4)) * d2;
            double d6 = Math.sin(Math.toRadians(d3 + d4)) * d2;
            double d7 = -0.1;
            oQ oQ2 = ((oQ)object).s(d5, d7, d6);
            List list = ApplicationLifecycleManager.c().v(systemConfigurationOrchestrator, oQ2);
            d2 = 1.0;
            d5 = Math.cos(Math.toRadians(d3 + d4)) * d2;
            d6 = Math.sin(Math.toRadians(d3 + d4)) * d2;
            d7 = -2.0;
            oQ2 = ((oQ)object).s(d5, d7, d6);
            List list2 = ApplicationLifecycleManager.c().v(systemConfigurationOrchestrator, oQ2);
            int n = list.size();
            int n2 = list2.size();
            try {
                try {
                    if (n != 0 || n2 != 0) break block22;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveConnectionManager.a(customSystemException);
                }
                this.T = connectionPoolOrchestrator1192.b();
                OutputEncoder.f(connectionPoolOrchestrator1192, true);
                this.R = true;
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveConnectionManager.a(customSystemException);
            }
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6598;
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
                throw new RuntimeException("a/ji", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AdaptiveConnectionManager.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AdaptiveConnectionManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = MultiContainerRegistry.a(-9000353985555696914L, 8359097622453982844L, MethodHandles.lookup().lookupClass()).a(178318158605745L);
        h = new HashMap(13);
        long l = b ^ 0x1915275368DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u00c9\u0010aJ\u00a3\u0087\u00db\u008eaU\u00fe\u00e8G\u009dG\u00f1n\u00da\u0090\u00c9\u00fdS\u001a,";
        int n2 = "\u00c9\u0010aJ\u00a3\u0087\u00db\u008eaU\u00fe\u00e8G\u009dG\u00f1n\u00da\u0090\u00c9\u00fdS\u001a,".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        d = lArray;
        e = new Integer[3];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AdaptiveConnectionManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

