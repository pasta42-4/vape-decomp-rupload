/*
 * Decompiled with CFR 0.152.
 */
package com.distributed.cache;

import a.a;
import com.auth.core.AuthenticationContextResolver;
import com.collections.management.MultiContainerRegistry;
import com.crypto.cipher.SymmetricCipherManager;
import com.crypto.protocol.CipherProtocolHandler448;
import com.data.serialization.DataSerializationManager;
import com.data.streaming.StreamProcessingHandler;
import com.data.transformation.DataEncodingTransformer519;
import com.event.core.EventDispatcher1808;
import com.event.management.EventDistributionHub;
import com.exception.system.CustomSystemException;
import com.graphics.geometry.GeometryTransformer;
import com.multimedia.streaming.MultimediaStreamHandler;
import com.network.config.NetworkConfigurationEnum;
import com.network.protocol.NetworkProtocolEncoder497;
import com.network.protocol.NetworkProtocolHandler;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.crypto.CryptographicModeEnum;
import com.system.lifecycle.SystemLifecycleController;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
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

public class DistributedCacheOrchestrator
extends DataSerializationManager {
    private boolean kc;
    private static final long eb = MultiContainerRegistry.a(-8909306785834330525L, -3810003688301180473L, MethodHandles.lookup().lookupClass()).a(156020693864517L);
    private static StreamProcessingHandler kd;
    private static final Map tb;
    private final MultimediaStreamHandler kH;
    private final AuthenticationContextResolver km;
    private static final Integer[] sb;
    private final CipherProtocolHandler448 kJ;
    public static DistributedCacheOrchestrator kW;
    private SymmetricCipherManager k9;
    private final NetworkProtocolEncoder497 kq;
    private static final long[] rb;
    private CryptographicModeEnum k5;
    private final DataEncodingTransformer519 kx;
    private final NetworkProtocolHandler kR;
    private boolean k8;

    public void l(NetworkConfigurationEnum networkConfigurationEnum, CryptographicModeEnum cryptographicModeEnum) {
        try {
            if (cryptographicModeEnum == CryptographicModeEnum.OFFLINE) {
                this.i(cryptographicModeEnum);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedCacheOrchestrator.a(customSystemException);
        }
    }

    public void J() {
        try {
            this.k8 = false;
            if (this.G() != null) {
                this.Y();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedCacheOrchestrator.a(customSystemException);
        }
        GraphicalRenderingController.K.S().d(kd);
        GraphicalRenderingController.K.S().d(this);
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DistributedCacheOrchestrator.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void D(boolean bl) {
        this.kc = bl;
        this.k8 = true;
        GraphicalRenderingController.K.S().B(kd);
        GraphicalRenderingController.K.S().B(this);
        GraphicalRenderingController.K.S().x(kd);
        GraphicalRenderingController.K.S().x(this);
    }

    private static int e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2D36;
        if (sb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = rb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])tb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    tb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DistributedCacheOrchestrator.sb[n2] = n3;
        }
        return sb[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void i(CryptographicModeEnum cryptographicModeEnum) {
        GeometryTransformer geometryTransformer;
        block16: {
            block17: {
                block13: {
                    block14: {
                        block15: {
                            geometryTransformer = null;
                            if (cryptographicModeEnum == CryptographicModeEnum.ONLINE) {
                                geometryTransformer = this.kH;
                                try {
                                    if (this.kc) {
                                        this.J();
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DistributedCacheOrchestrator.a(customSystemException);
                                }
                            }
                            try {
                                try {
                                    if (cryptographicModeEnum != CryptographicModeEnum.OFFLINE) break block13;
                                    if (SystemLifecycleController.C.V() != -1L) break block14;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DistributedCacheOrchestrator.a(customSystemException);
                                }
                                if (SystemLifecycleController.C.P() != NetworkConfigurationEnum.REGISTERED) break block15;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DistributedCacheOrchestrator.a(customSystemException);
                            }
                            geometryTransformer = this.kJ;
                            break block13;
                        }
                        geometryTransformer = SystemLifecycleController.C.P() == NetworkConfigurationEnum.UNREGISTERED ? this.km : this.kq;
                        break block13;
                    }
                    geometryTransformer = this.kx;
                }
                try {
                    if (cryptographicModeEnum != CryptographicModeEnum.CONNECTING) break block16;
                    if (SystemLifecycleController.C.V() != -1L) break block17;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedCacheOrchestrator.a(customSystemException);
                }
                geometryTransformer = this.kR;
                break block16;
            }
            geometryTransformer = this.kx;
        }
        try {
            if (geometryTransformer != null) {
                geometryTransformer.O();
                this.k9.k();
                this.k9.n(geometryTransformer, new Object[0]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedCacheOrchestrator.a(customSystemException);
        }
    }

    @Override
    public void G() {
        try {
            super.G();
            GraphicalRenderingController.K.S().x(kd);
            GraphicalRenderingController.K.S().x(this);
            if (this.G() != null) {
                GraphicalRenderingController.K.S().G(this, this.G());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedCacheOrchestrator.a(customSystemException);
        }
        this.h(true);
        this.N().z();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        tb = new HashMap(13);
        long l = eb ^ 0x3E9D7D520F4L;
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
        String string = "[\u0092(\u00b6P\u00ac\u00f3|\u00b5\u001a\u00d74\u00c7\u00ca\u0019\u00a8";
        int n2 = "[\u0092(\u00b6P\u00ac\u00f3|\u00b5\u001a\u00d74\u00c7\u00ca\u0019\u00a8".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        rb = lArray;
        sb = new Integer[2];
        kW = new DistributedCacheOrchestrator();
        kd = new StreamProcessingHandler();
    }

    public DistributedCacheOrchestrator() {
        long l = eb ^ 0x2C607716D421L;
        super(a.cs((int)DistributedCacheOrchestrator.e("p", (int)22836, (long)(0x24E6CCBB4EF3C640L ^ l))), a.cs((int)DistributedCacheOrchestrator.e("p", (int)4257, (long)(0x9EEC3084A8C8FD4L ^ l))), false, false);
        this.k8 = false;
        this.kc = false;
        this.k9 = new SymmetricCipherManager(104.0);
        this.kH = new MultimediaStreamHandler();
        this.kJ = new CipherProtocolHandler448();
        this.kR = new NetworkProtocolHandler();
        this.kx = new DataEncodingTransformer519();
        this.km = new AuthenticationContextResolver();
        this.kq = new NetworkProtocolEncoder497();
        this.k5 = null;
        try {
            this.T(104.0);
            this.w(160.0);
            this.k9.i(false);
            EventDistributionHub eventDistributionHub = this.d();
            eventDistributionHub.o(false);
            eventDistributionHub.m(false);
            eventDistributionHub.y(false);
            eventDistributionHub.i(false);
            eventDistributionHub.v(false);
            this.L(true);
            this.N().U(true);
            this.N().x(104.0);
            this.N().n(0.75f);
            this.N().M().N(this::J);
            this.V(new AdaptiveCipherEngine(SystemLifecycleController.C.q().f()), new AdaptiveCipherEngine(SystemLifecycleController.C.q().v()), new AdaptiveCipherEngine(SystemLifecycleController.C.q().T()), new AdaptiveCipherEngine(SystemLifecycleController.C.q().B()));
            this.N().J(true);
            this.N().T(104.0);
            this.P(new EventDispatcher1808(this));
            this.n(this.k9, new Object[0]);
            this.i(CryptographicModeEnum.OFFLINE);
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    @Override
    protected void u(double d2, double d3) {
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DistributedCacheOrchestrator.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

