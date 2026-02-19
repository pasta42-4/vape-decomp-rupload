/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL30
 */
package com.security.transmission;

import a.Ne;
import a.V3;
import a.tl;
import com.app.communication.DataChannelMediator;
import com.app.scenarios.ScenarioTemplateManager;
import com.app.security.encryption.CryptographicEncoder2040;
import com.app.streaming.StreamProtocolHandler;
import com.app.transaction.management.TransactionLifecycleContract;
import com.caching.strategy.CacheInvalidationStrategy;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.compression.CompressionAlgorithmManager1716;
import com.data.obfuscation.NumericScrambler;
import com.data.streaming.StreamProcessor1861;
import com.dynamic.instrumentation.RuntimeInstrumentationEngine;
import com.encoding.strategy.EncodingStrategyEnum;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.network.connection.NetworkConnectionManager1945;
import com.network.encoding.NetworkPacketEncoder;
import com.security.crypto.CryptographicSessionController;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.workflow.core.WorkflowCoordinator;
import com.workflow.management.WorkflowOrchestrator1763;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public class CipherTransmissionOrchestrator
implements TransactionLifecycleContract {
    private static final Map d;
    private NetworkPacketEncoder K;
    private static final long a;
    private static final Integer[] c;
    private static final long[] b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(276956126761376461L, 1417251718124013282L, MethodHandles.lookup().lookupClass()).a(74743436840039L);
        d = new HashMap(13);
        long l = a ^ 0x5DF208722030L;
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
        String string = "\u0090\u00a756\u0005\u00f9j\u00ed\u00cf\u00da\u001bv\u00e4\u00be\"\u009b\u00ba\u00e6\u00f4\u00054\u00c21%";
        int n2 = "\u0090\u00a756\u0005\u00f9j\u00ed\u00cf\u00da\u001bv\u00e4\u00be\"\u009b\u00ba\u00e6\u00f4\u00054\u00c21%".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[3];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x47C2;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/kj", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CipherTransmissionOrchestrator.c[n2] = n3;
        }
        return c[n2];
    }

    private static StreamProcessor1861 l(WorkflowCoordinator workflowCoordinator) {
        ObjectLifecycleTracker objectLifecycleTracker;
        NetworkConnectionManager1945 networkConnectionManager1945;
        if (GameVersionEnumerator.MC_1_20_6.H()) {
            networkConnectionManager1945 = workflowCoordinator.I();
        } else {
            objectLifecycleTracker = new WorkflowOrchestrator1763(workflowCoordinator.s());
            networkConnectionManager1945 = ((WorkflowOrchestrator1763)objectLifecycleTracker).C();
        }
        objectLifecycleTracker = ApplicationLifecycleManager.s();
        return ((DataChannelMediator)objectLifecycleTracker).h(networkConnectionManager1945);
    }

    @Override
    public void M(float f, float f2, int n, int n2, float f3, boolean bl) {
        block3: {
            RuntimeInstrumentationEngine runtimeInstrumentationEngine;
            block2: {
                runtimeInstrumentationEngine = new RuntimeInstrumentationEngine(EncodingStrategyEnum.DEFAULT, bl).D(new NumericScrambler(this.K.F)).E(f, f2, n, n2, 18.0f, 18.0f, 0.0f, 1.0f, 1.0f, 0.0f, new Color(1.0f, 1.0f, 1.0f, f3));
                try {
                    if (!bl) break block2;
                    CryptographicSessionController.x().O(runtimeInstrumentationEngine);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherTransmissionOrchestrator.a(customSystemException);
                }
            }
            CryptographicSessionController.x().p(runtimeInstrumentationEngine);
        }
    }

    @Override
    public void z(float f, float f2, int n, int n2, float f3) {
        this.M(f, f2, n, n2, f3, false);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void t(V3 v3) {
        long l = a ^ 0x37946F1639F4L;
        CryptographicSessionController.x().v(0.0f);
        int n = 18;
        int n2 = 18;
        int n3 = GL11.glGetInteger((int)CipherTransmissionOrchestrator.a("o", (int)1442, (long)(0x180D0D8A37198C5EL ^ l)));
        int n4 = GL11.glGetInteger((int)CipherTransmissionOrchestrator.a("o", (int)29774, (long)(0xBE81115A0307DB1L ^ l)));
        boolean bl = GL11.glIsEnabled((int)3089);
        try {
            if (bl) {
                GL11.glDisable((int)3089);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherTransmissionOrchestrator.a(customSystemException);
        }
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        byteBuffer.order(ByteOrder.nativeOrder());
        IntBuffer intBuffer = byteBuffer.asIntBuffer();
        CompressionAlgorithmManager1716.H(2978, intBuffer);
        this.K = new NetworkPacketEncoder(n, n2, true);
        this.K.c(n, n2);
        this.K.h(true);
        tl.k();
        tl.N();
        GL11.glEnable((int)2929);
        tl.N();
        GL11.glClearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glClear((int)16384);
        GL11.glClear((int)256);
        Ne.h.z();
        Ne.h.m(0.0, -2.0, 0.0);
        Ne.h.x((float)ApplicationLifecycleManager.e() / 36.0f, (float)ApplicationLifecycleManager.b() / 36.0f, 0.0);
        WorkflowCoordinator workflowCoordinator = this.G(v3);
        StreamProcessor1861 streamProcessor1861 = CipherTransmissionOrchestrator.l(workflowCoordinator);
        float[] fArray = workflowCoordinator.c();
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().D(new NumericScrambler(streamProcessor1861.Q())).E(0.0f, -1.0f, 18.0f, 18.0f, n, n2, fArray[0], fArray[2], fArray[1], fArray[3], Color.WHITE);
        CryptographicSessionController cryptographicSessionController = CryptographicSessionController.x();
        try {
            cryptographicSessionController.p(runtimeInstrumentationEngine);
            cryptographicSessionController.p(this.K.r);
            cryptographicSessionController.v(0.0f);
            cryptographicSessionController.T();
            this.K.Q();
            this.K.d();
            GL11.glViewport((int)intBuffer.get(0), (int)intBuffer.get(1), (int)intBuffer.get(2), (int)intBuffer.get(3));
            GL30.glBindFramebuffer((int)CipherTransmissionOrchestrator.a("o", (int)11821, (long)(0x7C913EB127B027D3L ^ l)), (int)n3);
            tl.O(n4);
            if (bl) {
                GL11.glEnable((int)3089);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherTransmissionOrchestrator.a(customSystemException);
        }
        Ne.h.X();
    }

    private WorkflowCoordinator G(V3 v3) {
        WorkflowCoordinator workflowCoordinator;
        CacheInvalidationStrategy cacheInvalidationStrategy = v3.U();
        if (GameVersionEnumerator.MC_1_21_10.H()) {
            WorkflowOrchestrator1763 workflowOrchestrator1763 = ApplicationLifecycleManager.J().P(CryptographicEncoder2040.X());
            workflowCoordinator = workflowOrchestrator1763.y(ScenarioTemplateManager.T(cacheInvalidationStrategy));
        } else if (GameVersionEnumerator.MC_1_21_6.H()) {
            workflowCoordinator = ApplicationLifecycleManager.K().Z(ScenarioTemplateManager.T(cacheInvalidationStrategy));
        } else {
            StreamProtocolHandler streamProtocolHandler = StreamProtocolHandler.u();
            workflowCoordinator = streamProtocolHandler.g(cacheInvalidationStrategy);
        }
        return workflowCoordinator;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CipherTransmissionOrchestrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/kj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CipherTransmissionOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

