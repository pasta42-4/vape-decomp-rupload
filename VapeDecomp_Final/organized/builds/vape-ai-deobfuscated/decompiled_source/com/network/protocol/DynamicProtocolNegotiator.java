/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a.a;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.network.event.NetworkEventDispatcher;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.system.configuration.SystemConfigurationOrchestrator;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class DynamicProtocolNegotiator
extends ContextualExecutionFramework {
    private static final long b = MultiContainerRegistry.a(8296532781118342841L, 6480170591682612191L, MethodHandles.lookup().lookupClass()).a(8306466081456L);
    private static final Map h = new HashMap(13);
    private boolean z;
    private static final long[] d;
    private static final Integer[] e;

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public int N() {
        int n;
        try {
            n = this.z ? -256 : EventDispatchCoordinator1159.c(160);
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProtocolNegotiator.a(customSystemException);
        }
        return n;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7830;
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
                throw new RuntimeException("a/AC", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicProtocolNegotiator.e[n2] = n3;
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @DataExchangeProtocol2090
    public void f(NetworkEventDispatcher networkEventDispatcher) {
        block14: {
            block12: {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    try {
                        block13: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (!systemConfigurationOrchestrator.r() || systemConfigurationOrchestrator.A().isEmpty()) break block12;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DynamicProtocolNegotiator.a(customSystemException);
                                        }
                                        if (this.A(systemConfigurationOrchestrator)) break block12;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DynamicProtocolNegotiator.a(customSystemException);
                                    }
                                    if (systemConfigurationOrchestrator.j()) break block13;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicProtocolNegotiator.a(customSystemException);
                                }
                                if (!systemConfigurationOrchestrator.D()) break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicProtocolNegotiator.a(customSystemException);
                            }
                        }
                        if (!networkEventDispatcher.getPacket().B(ReflectionMetadataResolver.L)) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProtocolNegotiator.a(customSystemException);
                    }
                    this.z = true;
                    networkEventDispatcher.setCanceled(true);
                    break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProtocolNegotiator.a(customSystemException);
                }
            }
            this.z = false;
        }
    }

    private boolean A(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (systemConfigurationOrchestrator.G() == 0.0 && systemConfigurationOrchestrator.o() == 0.0) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicProtocolNegotiator.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProtocolNegotiator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicProtocolNegotiator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public DynamicProtocolNegotiator() {
        long l = b ^ 0x63D1D8FC46ADL;
        super(a.cs((int)DynamicProtocolNegotiator.a("r", (int)27449, (long)(0x46A759110A01009DL ^ l))), -256, RecursiveNodeGraph.G, a.cs((int)DynamicProtocolNegotiator.a("r", (int)22411, (long)(0x403BD204FBEB3C2EL ^ l))));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x36CFAEDDC89AL;
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
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u009a\u00fc1\u009eM/\u0099\"\u00d2\u00a5VS\u00d7\u00e2uo";
        int n2 = "\u009a\u00fc1\u009eM/\u0099\"\u00d2\u00a5VS\u00d7\u00e2uo".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        d = lArray;
        e = new Integer[2];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicProtocolNegotiator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

