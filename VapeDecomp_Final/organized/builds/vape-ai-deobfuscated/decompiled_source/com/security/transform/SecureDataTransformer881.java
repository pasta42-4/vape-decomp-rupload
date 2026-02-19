/*
 * Decompiled with CFR 0.152.
 */
package com.security.transform;

import a.E8;
import a.qb;
import a.tR;
import a.z6;
import com.app.communication.DataChannelMediator;
import com.app.data.transformation.DataTransformationEngine1165;
import com.app.network.connection.NetworkConnectionHandler;
import com.app.transform.core.TransformationGateway;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationEngine1209;
import com.exception.system.CustomSystemException;
import com.financial.transactions.TransactionValidator1679;
import com.math.geometry.GeometryCalculator;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.routing.TransmissionRouteCalculator;
import com.runtime.context.LightweightExecutionContext;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.workflow.management.WorkflowOrchestrator1763;
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

public class SecureDataTransformer881
extends ObjectLifecycleTracker {
    private static final long[] b;
    private static final long a;
    private static final Integer[] c;
    private static Object I;
    private static final Map d;

    public void L(E8 e8, DataChannelMediator dataChannelMediator, LightweightExecutionContext lightweightExecutionContext, int n, int n2) {
        block5: {
            block4: {
                try {
                    if (GeometryCalculator.C() != 13) break block4;
                    qb.V(SecureDataTransformer881.U.u().kE, this.H, e8.M(), dataChannelMediator.M(), lightweightExecutionContext.M(), n, n2);
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureDataTransformer881.a(customSystemException);
                }
            }
            if (GeometryCalculator.C() >= 50) {
                DataTransformationEngine1209 dataTransformationEngine1209 = DataTransformationEngine1209.i();
                dataTransformationEngine1209.g();
                dataTransformationEngine1209.C(z6.D.i().B());
                this.p(DataTransformationEngine1165.F(dataTransformationEngine1209), lightweightExecutionContext, n, n2);
            } else {
                qb.t(SecureDataTransformer881.U.u().kE, this.H, lightweightExecutionContext.M(), n, n2);
            }
        }
    }

    public void g(float f) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataTransformer881.a(customSystemException);
        }
        qb.D(SecureDataTransformer881.U.u().kE, this.H, f);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SecureDataTransformer881.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void b(LightweightExecutionContext lightweightExecutionContext, int n, int n2, DataTransformationEngine1209 dataTransformationEngine1209) {
        boolean bl;
        long l = a ^ 0x13993B23A7EAL;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        TransformationGateway transformationGateway = this.I(lightweightExecutionContext, null, systemConfigurationOrchestrator.M(), 0);
        this.g(this.O() + 50.0f);
        DataChannelMediator dataChannelMediator = ApplicationLifecycleManager.s();
        dataChannelMediator.h(WorkflowOrchestrator1763.S()).r(false, false);
        NetworkConnectionHandler.B(0, dataChannelMediator.h(WorkflowOrchestrator1763.S()).Q());
        NetworkConnectionHandler.l();
        NetworkConnectionHandler.U(770, 771);
        NetworkConnectionHandler.D(1.0f, 1.0f, 1.0f, 1.0f);
        DataTransformationEngine1209 dataTransformationEngine12092 = NetworkConnectionHandler.u();
        dataTransformationEngine12092.g();
        dataTransformationEngine12092.m(n, n2, 100.0f + this.O());
        dataTransformationEngine12092.s(1.0f, -1.0f, 1.0f);
        dataTransformationEngine12092.s(16.0f, 16.0f, 16.0f);
        NetworkConnectionHandler.x();
        TransactionValidator1679 transactionValidator1679 = ApplicationLifecycleManager.n().e();
        try {
            bl = !transformationGateway.w();
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataTransformer881.a(customSystemException);
        }
        boolean bl2 = bl;
        try {
            if (bl2) {
                tR.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataTransformer881.a(customSystemException);
        }
        try {
            this.V(lightweightExecutionContext, TransmissionRouteCalculator.J(), false, dataTransformationEngine1209, transactionValidator1679, (int)SecureDataTransformer881.a("m", (int)8339, (long)(0x61C8135C4960BAADL ^ l)), (int)SecureDataTransformer881.a("m", (int)8854, (long)(0x3AD138A86BBB38A9L ^ l)), transformationGateway);
            transactionValidator1679.K();
            NetworkConnectionHandler.O();
            if (bl2) {
                tR.l();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataTransformer881.a(customSystemException);
        }
        dataTransformationEngine12092 = NetworkConnectionHandler.u();
        dataTransformationEngine12092.v();
        NetworkConnectionHandler.x();
        this.g(this.O() - 50.0f);
    }

    public float O() {
        try {
            if (GeometryCalculator.C() >= 50) {
                return 100.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataTransformer881.a(customSystemException);
        }
        return qb.I(SecureDataTransformer881.U.u().kE, this.H);
    }

    public void Y(float f) {
        qb.t(SecureDataTransformer881.U.u().kE, this.H, f);
    }

    public void V(LightweightExecutionContext lightweightExecutionContext, TransmissionRouteCalculator transmissionRouteCalculator, boolean bl, DataTransformationEngine1209 dataTransformationEngine1209, TransactionValidator1679 transactionValidator1679, int n, int n2, TransformationGateway transformationGateway) {
        qb.i(SecureDataTransformer881.U.u().kE, this.H, lightweightExecutionContext.M(), transmissionRouteCalculator.M(), bl, dataTransformationEngine1209.M(), transactionValidator1679.M(), n, n2, transformationGateway.M());
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x473B;
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
                throw new RuntimeException("a/tu", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SecureDataTransformer881.c[n2] = n3;
        }
        return c[n2];
    }

    public TransformationGateway I(LightweightExecutionContext lightweightExecutionContext, NetworkProtocolNegotiator networkProtocolNegotiator, Object object, int n) {
        Object object2;
        try {
            object2 = networkProtocolNegotiator == null ? null : networkProtocolNegotiator.M();
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataTransformer881.a(customSystemException);
        }
        Object object3 = object2;
        return new TransformationGateway(qb.P(SecureDataTransformer881.U.u().kE, this.H, lightweightExecutionContext.M(), object3, object, n));
    }

    public static SecureDataTransformer881 f() {
        Object object;
        SecureDataTransformer881 secureDataTransformer881;
        SecureDataTransformer881 secureDataTransformer8812;
        block10: {
            try {
                try {
                    try {
                        try {
                            if (I != null || qb.l(SecureDataTransformer881.U.u().kE) != null) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SecureDataTransformer881.a(customSystemException);
                        }
                        if (GeometryCalculator.C() != 13) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecureDataTransformer881.a(customSystemException);
                    }
                    if (!z) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureDataTransformer881.a(customSystemException);
                }
                I = qb.W(SecureDataTransformer881.U.u().kE).A(new Object[0]);
            }
            catch (CustomSystemException customSystemException) {
                throw SecureDataTransformer881.a(customSystemException);
            }
        }
        try {
            SecureDataTransformer881 secureDataTransformer8813;
            secureDataTransformer8812 = secureDataTransformer8813;
            secureDataTransformer881 = secureDataTransformer8813;
            object = I != null ? I : qb.z(SecureDataTransformer881.U.u().kE);
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataTransformer881.a(customSystemException);
        }
        secureDataTransformer8812(object);
        return secureDataTransformer881;
    }

    public SecureDataTransformer881(Object object) {
        super(object);
    }

    public void p(DataTransformationEngine1165 dataTransformationEngine1165, LightweightExecutionContext lightweightExecutionContext, int n, int n2) {
        qb.t(SecureDataTransformer881.U.u().kE, dataTransformationEngine1165.M(), lightweightExecutionContext.M(), n, n2);
    }

    public float M() {
        return qb.R(SecureDataTransformer881.U.u().kE, this.H);
    }

    public void i(E8 e8, DataChannelMediator dataChannelMediator, LightweightExecutionContext lightweightExecutionContext, int n, int n2) {
        block3: {
            block2: {
                try {
                    if (GeometryCalculator.C() != 13) break block2;
                    qb.w(SecureDataTransformer881.U.u().kE, this.H, e8.M(), dataChannelMediator.M(), lightweightExecutionContext.M(), n, n2);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureDataTransformer881.a(customSystemException);
                }
            }
            qb.G(SecureDataTransformer881.U.u().kE, this.H, e8.M(), lightweightExecutionContext.M(), n, n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(2460742902630603156L, -451871636779020371L, MethodHandles.lookup().lookupClass()).a(229886197198020L);
        d = new HashMap(13);
        long l = a ^ 0x5E7E9093E60EL;
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
        String string = "\u00f3\u0092D\u00ea\u00fc5\u0003\u00ac\u0094\u00fc\u0019\u00b9\u00cc|\u008f\u00c0";
        int n2 = "\u00f3\u0092D\u00ea\u00fc5\u0003\u00ac\u0094\u00fc\u0019\u00b9\u00cc|\u008f\u00c0".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
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
            throw new RuntimeException("a/tu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecureDataTransformer881.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

