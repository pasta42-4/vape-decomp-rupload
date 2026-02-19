/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.utils;

import a.Wz;
import a.a;
import a.bE;
import a.yy;
import com.app.crypto.processing.CipherTextProcessor;
import com.app.rendering.graphics.VisualizationRenderer;
import com.app.stream.processing.StreamProcessingController2332;
import com.cache.distribution.DistributedCacheManager;
import com.collections.management.MultiContainerRegistry;
import com.computation.multidimensional.MultiDimensionalComputationManager;
import com.core.computation.AbstractComputationKernel;
import com.data.protocol.DataProcessingProtocol;
import com.data.serialization.DataSerializationManager;
import com.data.streaming.StreamProtocolMapper;
import com.event.processing.TimestampedEventProcessor;
import com.event.routing.EventRouter;
import com.exception.system.CustomSystemException;
import com.execution.validation.ExecutionStateValidator;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.rendering.RenderingContextManager757;
import com.graphics.theme.GraphicalThemeRenderer;
import com.graphics.transformation.GeometricTransformEngine;
import com.math.analysis.ComputationalAnalyzer;
import com.network.state.NetworkStateManager;
import com.payment.processing.PaymentStrategyImplementation;
import com.reflection.metadata.ClassMetadataExtractor1328;
import com.runtime.monitoring.ExecutionStateTracker1057;
import com.scientific.measurement.PrecisionMeasurementCalibrator;
import com.security.async.AsynchronousCipherManager;
import com.security.authentication.AuthenticationGateway1860;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.crypto.CipherContextManager1101;
import com.security.crypto.CryptographicModeEnum;
import com.security.cryptography.CryptographicContextManager153;
import com.service.orchestration.ServiceOrchestrationManager;
import com.system.configuration.ConfigurationProfileManager1223;
import com.system.lifecycle.SystemLifecycleController;
import com.system.monitoring.SystemStateTracker;
import com.system.security.SecureResourceAllocator992;
import com.system.security.SystemIntegrityValidator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.core.TransactionOrchestrator690;
import com.ui.rendering.GraphicalRenderingController;
import com.workflow.management.WorkflowPipelineController;
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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ReflectionProxyHandler
extends DataSerializationManager {
    private static int[] gP;
    private final GraphicalRenderEngine1082 g1;
    private final GraphicalRenderEngine1082 gw;
    private AdaptiveCipherEngine gG;
    private final WorkflowPipelineController gL;
    private GraphicalThemeRenderer gJ;
    private ServiceOrchestrationManager gj;
    private ExecutionStateTracker1057 gv;
    private CipherContextManager1101 ge;
    private DataProcessingProtocol g3;
    private NetworkStateManager gY;
    private AdaptiveCipherEngine gV;
    private AdaptiveCipherEngine gR;
    private final TransactionOrchestrator690 gn;
    private VisualizationRenderer gS;
    private CipherContextManager1101 gX;
    private final MultiDimensionalComputationManager gF;
    private CipherContextManager1101 g4;
    private GraphicalRenderEngine1082 gI;
    private static final String[] xb;
    private CryptographicContextManager153 gM;
    private static final Object[] wb;
    private AdaptiveCipherEngine gi;
    private AdaptiveCipherEngine gC;
    private static final long eb;
    private yy gf;
    private AdaptiveCipherEngine g8;
    private ExecutionStateValidator<AuthenticationGateway1860> gt;
    private AdaptiveCipherEngine gk;
    private AdaptiveCipherEngine gl;
    private CipherContextManager1101 go;
    private static final Integer[] sb;
    private final SecureResourceAllocator992 gs;
    private static final long[] rb;
    private AdaptiveCipherEngine gU;
    private AdaptiveCipherEngine g6;
    private AdaptiveCipherEngine gD;
    private final GraphicalRenderEngine1082 g9;
    private static final Map tb;
    private AdaptiveCipherEngine gE;
    private AdaptiveCipherEngine gZ;
    private SystemIntegrityValidator ga;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void d() {
        block27: {
            block32: {
                block33: {
                    block28: {
                        block31: {
                            block30: {
                                block26: {
                                    long l;
                                    block25: {
                                        l = eb ^ 0x77DAF8F5BCB8L;
                                        try {
                                            super.d();
                                            if (TemporalMetadataResolver.h.O() == null) {
                                                return;
                                            }
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ReflectionProxyHandler.a(customSystemException);
                                        }
                                        int n = TemporalMetadataResolver.h.O().u().C().size();
                                        try {
                                            if (n <= 0) break block25;
                                            this.gJ.u((String)((Object)ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)5636, (long)(0x112472C3248DD066L ^ l)), (long)-6911847159274086666L, (long)l)));
                                            break block26;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ReflectionProxyHandler.a(customSystemException);
                                        }
                                    }
                                    this.gJ.u((String)((Object)ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)18080, (long)(0x125B1F83617580C1L ^ l)), (long)-6911847159274086666L, (long)l)));
                                }
                                try {
                                    block29: {
                                        try {
                                            try {
                                                try {
                                                    this.gJ.N(false);
                                                    if (!this.gf.P().booleanValue()) break block27;
                                                    if (!SystemLifecycleController.C.U().equals((Object)CryptographicModeEnum.ONLINE)) break block28;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ReflectionProxyHandler.a(customSystemException);
                                                }
                                                if (TemporalMetadataResolver.h.M().q().size() > 0) break block29;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ReflectionProxyHandler.a(customSystemException);
                                            }
                                            if (TemporalMetadataResolver.h.O().p().Q() == null) break block30;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ReflectionProxyHandler.a(customSystemException);
                                        }
                                    }
                                    this.P(this.gF);
                                    break block31;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ReflectionProxyHandler.a(customSystemException);
                                }
                            }
                            this.P(this.gn);
                        }
                        this.gJ.N(true);
                        break block33;
                    }
                    this.P(this.gL);
                }
                try {
                    if (this.go == null) break block32;
                    this.gI.N(false);
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectionProxyHandler.a(customSystemException);
                }
            }
            try {
                if (this.gI == null) return;
                this.gI.N(true);
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectionProxyHandler.a(customSystemException);
            }
        }
        try {
            if (this.gI != null) {
                this.gI.N(false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionProxyHandler.a(customSystemException);
        }
        try {
            if (!this.L().f()) {
                this.L().N(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionProxyHandler.a(customSystemException);
        }
        try {
            if (!SystemLifecycleController.C.U().equals((Object)CryptographicModeEnum.ONLINE)) return;
            this.gJ.N(true);
            return;
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionProxyHandler.a(customSystemException);
        }
    }

    private static int e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6678;
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
                throw new RuntimeException("a/f0", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ReflectionProxyHandler.sb[n2] = n3;
        }
        return sb[n2];
    }

    private static Method i(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public void I() {
        GraphicalRenderingController.X(this);
        this.go = null;
        this.ge = null;
        this.g4 = null;
        this.gX = null;
        this.N().x();
    }

    private void O() {
        block3: {
            block2: {
                long l = eb ^ 0x153048738C3EL;
                try {
                    if (this.g4 != null) break block2;
                    this.g4 = this.C(this.g1, this.gj, PrecisionMeasurementCalibrator.class);
                    this.N().b((String)((Object)ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)31501, (long)(0x7643F4590F378DE8L ^ l)), (long)-8029270198426341776L, (long)l)), false);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectionProxyHandler.a(customSystemException);
                }
            }
            GraphicalRenderingController.z(this.g4);
            this.g4 = null;
            this.N().x();
        }
    }

    private void U4() {
        long l = eb ^ 0x711E78D9DA2L;
        this.gY = new NetworkStateManager(TemporalMetadataResolver.h.j().u);
        this.gE = new AdaptiveCipherEngine(TemporalMetadataResolver.h.j().b);
        this.gZ = new AdaptiveCipherEngine(TemporalMetadataResolver.h.j().A);
        this.gi = new AdaptiveCipherEngine(TemporalMetadataResolver.h.j().Z);
        this.gl = new AdaptiveCipherEngine(TemporalMetadataResolver.h.j().r);
        Wz wz2 = SystemLifecycleController.C.q().f();
        this.gM = new CryptographicContextManager153((String)((Object)ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)28096, (long)(0x7EDAE376E1A28AA6L ^ l)), (long)-9147268884022886420L, (long)l)), 0.75, ReflectionProxyHandler.M.n);
        this.gR = new AdaptiveCipherEngine(wz2.P);
        this.gC = new AdaptiveCipherEngine(wz2.h);
        this.gD = new AdaptiveCipherEngine(wz2.l);
        this.g6 = new AdaptiveCipherEngine(wz2.p);
        this.gG = new AdaptiveCipherEngine(wz2.Y);
        this.gV = new AdaptiveCipherEngine(wz2.A);
        DistributedCacheManager distributedCacheManager = SystemLifecycleController.C.q();
        this.gt = new ExecutionStateValidator(distributedCacheManager.q());
        this.g8 = new AdaptiveCipherEngine(distributedCacheManager.M());
        this.gU = new AdaptiveCipherEngine(distributedCacheManager.P());
        this.gk = new AdaptiveCipherEngine(distributedCacheManager.C());
        ClassMetadataExtractor1328 classMetadataExtractor1328 = new ClassMetadataExtractor1328((String)((Object)ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)32323, (long)(0xE59F257704993CL ^ l)), (long)-9147268884022886420L, (long)l)), (String)((Object)ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)31652, (long)(0x4C52AC5C86031CC3L ^ l)), (long)-9147268884022886420L, (long)l)), 0.9, 7);
        classMetadataExtractor1328.E(AsynchronousCipherManager.class);
        this.V(this.j((String)((Object)ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)20966, (long)(0x770B1F28A99DB69BL ^ l)), (long)-9147268884022886420L, (long)l)), this.gE, this.gY, this.gZ, this.gi, this.gl, new ConfigurationProfileManager1223(TemporalMetadataResolver.h.a().W), new GeometricTransformEngine(90.0, 2.0, 0.5, 4.0, ReflectionProxyHandler.M.S), new bE(1.0, 2.0), this.gM, this.gt, this.g8, this.gU, this.gk));
        this.V(this.j((String)((Object)ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)21131, (long)(0x6D66F63C2B65B5F5L ^ l)), (long)-9147268884022886420L, (long)l)), this.gR, this.gC, this.gD, this.g6, this.gG, this.gV));
        ConfigurationProfileManager1223 configurationProfileManager1223 = new ConfigurationProfileManager1223((String)((Object)ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)3804, (long)(0x7CE48EB62F25E9B9L ^ l)), (long)-9147268884022886420L, (long)l)), SystemLifecycleController.C.q().X(), ReflectionProxyHandler.M.n);
        configurationProfileManager1223.I().n(20);
        this.V(configurationProfileManager1223);
    }

    private static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ReflectionProxyHandler.e(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void Z() {
        try {
            if (this.go != null) {
                this.T();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionProxyHandler.a(customSystemException);
        }
    }

    private static MethodHandle e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cf' || c == '\u00d3' || c == 't' || c == 'R') {
                field = ReflectionProxyHandler.s(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cf' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 't' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ReflectionProxyHandler.t(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ff' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static int[] L() {
        return gP;
    }

    private static Method t(long l, long l2) {
        int n = ReflectionProxyHandler.q(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = xb[n];
                int n3 = string2.indexOf(8);
                clazz3 = ReflectionProxyHandler.r(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ReflectionProxyHandler.r(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ReflectionProxyHandler.i(clazz, string, clazz2, n2, classArray2)) != null) {
                        ReflectionProxyHandler.wb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ReflectionProxyHandler.r(217517559621645L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ReflectionProxyHandler.j(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ReflectionProxyHandler.wb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ReflectionProxyHandler.r(217517559621645L, 0L);
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

    public static void w(int[] nArray) {
        gP = nArray;
    }

    private static Method j(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ReflectionProxyHandler.i(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ReflectionProxyHandler.j(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public TimestampedEventProcessor f() {
        return this.gF.o();
    }

    public void P() {
        try {
            this.I();
            CipherTextProcessor.I();
            if (!this.gf.P().booleanValue()) {
                this.gf.S((Boolean)false);
            }
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    private static Field s(long l, long l2) {
        int n = ReflectionProxyHandler.q(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            String string = xb[n];
            int n2 = string.indexOf(8);
            Class clazz = ReflectionProxyHandler.r(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ReflectionProxyHandler.r(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ReflectionProxyHandler.i(clazz3, string2, clazz2)) != null) {
                    ReflectionProxyHandler.wb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ReflectionProxyHandler.j(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ReflectionProxyHandler.wb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ReflectionProxyHandler.r(217517559621645L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field i(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ReflectionProxyHandler.eb = MultiContainerRegistry.a(-556070031357519937L, 8486799990360379315L, MethodHandles.lookup().lookupClass()).a(212143587155112L);
                ReflectionProxyHandler.wb = new Object[5];
                ReflectionProxyHandler.xb = new String[5];
                ReflectionProxyHandler.eb();
                ReflectionProxyHandler.tb = new HashMap<K, V>(13);
                ReflectionProxyHandler.w(new int[2]);
                var0 = ReflectionProxyHandler.eb ^ 83637521039977L;
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
                var8_3 = new long[19];
                var5_4 = 0;
                var6_5 = "\u001eZ\u00f4v7a:\u008c :\u00c7\u008a\u0014\u00dd\u009d\u00a2o\u00a74\u00c1\u00cb\u00c9(\u00d1)=\u00cc\u00da6:\u0011\u00a3r\u00c8\u00faFg\u000fK\u00f0{p\u000b\u00ce\u00ac\u00107\u008cz\u00eb\u00ff\u0085\u00aeE\u00f0a|\u0017J{DWr\u00e0\u0014AU\u00dfh\u0091\u0015,\u00ed(\u00c6w\u0012:\u00f1[2\u00ee\u00da\u00c5\u00adtf\u000e\u0096\u00cc\b\u00bd\u001f\u0007(\u0093\u0004s\u007f\u00e3\\k\u00f2\u00adt?\u00c5\u00fe\u00c0jA\u0088?7\u00f1\u00df\u0013\u00da/\u001d\u008b;[\u00cc\u008by\u00fa\u0013\u00c6\u007fvo\u00bf\u00fc\u00c0M";
                var7_6 = "\u001eZ\u00f4v7a:\u008c :\u00c7\u008a\u0014\u00dd\u009d\u00a2o\u00a74\u00c1\u00cb\u00c9(\u00d1)=\u00cc\u00da6:\u0011\u00a3r\u00c8\u00faFg\u000fK\u00f0{p\u000b\u00ce\u00ac\u00107\u008cz\u00eb\u00ff\u0085\u00aeE\u00f0a|\u0017J{DWr\u00e0\u0014AU\u00dfh\u0091\u0015,\u00ed(\u00c6w\u0012:\u00f1[2\u00ee\u00da\u00c5\u00adtf\u000e\u0096\u00cc\b\u00bd\u001f\u0007(\u0093\u0004s\u007f\u00e3\\k\u00f2\u00adt?\u00c5\u00fe\u00c0jA\u0088?7\u00f1\u00df\u0013\u00da/\u001d\u008b;[\u00cc\u008by\u00fa\u0013\u00c6\u007fvo\u00bf\u00fc\u00c0M".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "ze\t#\u0019\u00f5(\u009e\u00c7K\u00f7\u00c9b\u00b2Ua";
                    var7_6 = "ze\t#\u0019\u00f5(\u009e\u00c7K\u00f7\u00c9b\u00b2Ua".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        ReflectionProxyHandler.rb = var8_3;
        ReflectionProxyHandler.sb = new Integer[19];
    }

    public GraphicalRenderEngine1082 S() {
        return this.gw;
    }

    public ServiceOrchestrationManager O() {
        return this.gj;
    }

    private static Class r(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ReflectionProxyHandler.q(l, l2);
            object = wb[n];
            try {
                if (!(object instanceof String)) break block2;
                ReflectionProxyHandler.wb[n] = clazz = Class.forName(xb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void v() {
        this.N().A(this.gJ);
        this.gJ.N(new StreamProcessingController2332(this));
        this.N().g().N(new PaymentStrategyImplementation(this));
    }

    public ExecutionStateTracker1057 u() {
        return this.gv;
    }

    public ReflectionProxyHandler() {
        long l = eb ^ 0x44902BF356FFL;
        super(a.cs((int)ReflectionProxyHandler.e("t", (int)7143, (long)(0x4C1195D9D028B7C6L ^ l))), a.cs((int)ReflectionProxyHandler.e("t", (int)30607, (long)(0x4062A3D70CFB5BA6L ^ l))));
        this.g1 = new GraphicalRenderEngine1082(104.0, 150.0);
        this.gw = new GraphicalRenderEngine1082(104.0, 150.0);
        this.g9 = new GraphicalRenderEngine1082(104.0, 130.0);
        this.gf = new StreamProtocolMapper(this, (String)((Object)ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)22962, (long)(0x7F955F31387BF59DL ^ l)), (long)5355656180782478513L, (long)l)), (String)((Object)ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)731, (long)(0x3428CCDDC9112EF6L ^ l)), (long)5355656180782478513L, (long)l)), true);
        this.gs = new SecureResourceAllocator992();
        this.gj = new ServiceOrchestrationManager();
        this.gJ = new GraphicalThemeRenderer((String)((Object)ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)17849, (long)(0x722A33BD21EAE995L ^ l)), (long)5355656180782478513L, (long)l)), 1.0, new Color(180, 180, 180), Color.WHITE, 13.0, 13.0);
        this.gS = new VisualizationRenderer(ReflectionProxyHandler.M.S);
        this.gF = new MultiDimensionalComputationManager();
        this.gn = new TransactionOrchestrator690();
        this.gL = new WorkflowPipelineController();
        this.g3 = new EventRouter(this);
        this.N(false);
        this.T(103.0);
        this.Y(false);
        this.B(true);
        this.v();
        this.U4();
        this.UH();
        this.P(this.gn);
        this.gJ.g((String)((Object)ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)26616, (long)(0x409F64D316EC4BDFL ^ l)), (long)5355656180782478513L, (long)l)));
        this.gf.P("", "");
        this.gv = new ExecutionStateTracker1057(this);
        this.l(this.g3);
        this.N().n(0.8f);
    }

    private static CallSite j(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/f0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/f0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void Z(boolean bl) {
        block8: {
            block7: {
                try {
                    try {
                        this.I();
                        if (bl) break block7;
                        if (this.ge != null) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectionProxyHandler.a(customSystemException);
                    }
                    this.ge = this.C(this.g9, this.gs, PrecisionMeasurementCalibrator.class);
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectionProxyHandler.a(customSystemException);
                }
            }
            try {
                if (this.ge != null) {
                    GraphicalRenderingController.z(this.ge);
                    this.ge = null;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectionProxyHandler.a(customSystemException);
            }
        }
    }

    public TransactionOrchestrator690 A() {
        return this.gn;
    }

    private void J() {
        try {
            if (this.gX == null) {
                this.gX = this.C(this, this.gv, CipherContextManager1101.class);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionProxyHandler.a(customSystemException);
        }
        this.y(this.gX);
        this.gX.b(this.G());
        this.gX.M(this.W());
    }

    public MultiDimensionalComputationManager l() {
        return this.gF;
    }

    public CipherContextManager1101 C(AbstractComputationKernel abstractComputationKernel, AbstractComputationKernel abstractComputationKernel2, Class<? extends CipherContextManager1101> clazz) {
        CipherContextManager1101 cipherContextManager1101 = GraphicalRenderingController.v(abstractComputationKernel, abstractComputationKernel2, clazz);
        cipherContextManager1101.l(this.g3);
        return cipherContextManager1101;
    }

    private void UH() {
        long l = eb ^ 0x2675C79508F8L;
        this.gw.i(150.0);
        this.gw.Y(false);
        this.gw.d().f((String)((Object)ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)6441, (long)(0x3685887F26226B00L ^ l)), (long)1464934378182044342L, (long)l)));
        this.gw.n(new bE(0.0, 2.0), new Object[0]);
        this.gw.n(this.gf, new Object[0]);
        this.gw.n(new bE(1.0, 4.0), new Object[0]);
        this.gw.n(this.g9, new Object[0]);
        this.g1.i(150.0);
        this.g1.Y(false);
        this.g1.d().f((String)((Object)ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)15926, (long)(0x67844BEC1F184C19L ^ l)), (long)1464934378182044342L, (long)l)));
        this.g1.n(this.gw, new Object[0]);
        this.n(this.g1, new Object[0]);
    }

    private void P(GraphicalRenderEngine1082 graphicalRenderEngine1082) {
        try {
            if (this.gI != graphicalRenderEngine1082) {
                this.g9.f();
                this.g9.n(graphicalRenderEngine1082, new Object[0]);
                this.gI = graphicalRenderEngine1082;
                this.T();
                this.I();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionProxyHandler.a(customSystemException);
        }
    }

    static void e(ReflectionProxyHandler reflectionProxyHandler) {
        reflectionProxyHandler.O();
    }

    static CipherContextManager1101 h(ReflectionProxyHandler reflectionProxyHandler) {
        return reflectionProxyHandler.g4;
    }

    public void p() {
        try {
            if (this.go != null) {
                this.T();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionProxyHandler.a(customSystemException);
        }
        try {
            if (this.ga == null) {
                this.ga = new SystemIntegrityValidator();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionProxyHandler.a(customSystemException);
        }
        this.go = this.C(this.g1, this.ga, PrecisionMeasurementCalibrator.class);
        this.L().N(false);
        this.gJ.N(false);
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ReflectionProxyHandler.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int q(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (xb[n4] != null) {
            return n4;
        }
        Object object = wb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 23;
                break;
            }
            case 1: {
                n3 = 20;
                break;
            }
            case 2: {
                n3 = 54;
                break;
            }
            case 3: {
                n3 = 13;
                break;
            }
            case 4: {
                n3 = 1;
                break;
            }
            case 5: {
                n3 = 55;
                break;
            }
            case 6: {
                n3 = 15;
                break;
            }
            case 7: {
                n3 = 19;
                break;
            }
            case 8: {
                n3 = 16;
                break;
            }
            case 9: {
                n3 = 38;
                break;
            }
            case 10: {
                n3 = 45;
                break;
            }
            case 11: {
                n3 = 27;
                break;
            }
            case 12: {
                n3 = 44;
                break;
            }
            case 13: {
                n3 = 56;
                break;
            }
            case 14: {
                n3 = 41;
                break;
            }
            case 15: {
                n3 = 51;
                break;
            }
            case 16: {
                n3 = 58;
                break;
            }
            case 17: {
                n3 = 30;
                break;
            }
            case 18: {
                n3 = 9;
                break;
            }
            case 19: {
                n3 = 57;
                break;
            }
            case 20: {
                n3 = 43;
                break;
            }
            case 21: {
                n3 = 49;
                break;
            }
            case 22: {
                n3 = 26;
                break;
            }
            case 23: {
                n3 = 10;
                break;
            }
            case 24: {
                n3 = 59;
                break;
            }
            case 25: {
                n3 = 35;
                break;
            }
            case 26: {
                n3 = 53;
                break;
            }
            case 27: {
                n3 = 3;
                break;
            }
            case 28: {
                n3 = 5;
                break;
            }
            case 29: {
                n3 = 37;
                break;
            }
            case 30: {
                n3 = 47;
                break;
            }
            case 31: {
                n3 = 14;
                break;
            }
            case 32: {
                n3 = 33;
                break;
            }
            case 33: {
                n3 = 22;
                break;
            }
            case 34: {
                n3 = 36;
                break;
            }
            case 35: {
                n3 = 39;
                break;
            }
            case 36: {
                n3 = 17;
                break;
            }
            case 37: {
                n3 = 24;
                break;
            }
            case 38: {
                n3 = 2;
                break;
            }
            case 39: {
                n3 = 12;
                break;
            }
            case 40: {
                n3 = 62;
                break;
            }
            case 41: {
                n3 = 52;
                break;
            }
            case 42: {
                n3 = 63;
                break;
            }
            case 43: {
                n3 = 34;
                break;
            }
            case 44: {
                n3 = 60;
                break;
            }
            case 45: {
                n3 = 29;
                break;
            }
            case 46: {
                n3 = 18;
                break;
            }
            case 47: {
                n3 = 21;
                break;
            }
            case 48: {
                n3 = 61;
                break;
            }
            case 49: {
                n3 = 0;
                break;
            }
            case 50: {
                n3 = 7;
                break;
            }
            case 51: {
                n3 = 31;
                break;
            }
            case 52: {
                n3 = 50;
                break;
            }
            case 53: {
                n3 = 32;
                break;
            }
            case 54: {
                n3 = 6;
                break;
            }
            case 55: {
                n3 = 25;
                break;
            }
            case 56: {
                n3 = 4;
                break;
            }
            case 57: {
                n3 = 40;
                break;
            }
            case 58: {
                n3 = 11;
                break;
            }
            case 59: {
                n3 = 28;
                break;
            }
            case 60: {
                n3 = 46;
                break;
            }
            case 61: {
                n3 = 48;
                break;
            }
            case 62: {
                n3 = 8;
                break;
            }
            default: {
                n3 = 42;
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
        ReflectionProxyHandler.xb[n4] = new String(cArray);
        return n4;
    }

    private static Field j(Class clazz, String string, Class clazz2) {
        Field field = ReflectionProxyHandler.i(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ReflectionProxyHandler.j(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public yy J() {
        return this.gf;
    }

    public void l() {
        GraphicalRenderingController.D(ReflectionProxyHandler.class).J().S((Boolean)false);
        this.L().N(true);
    }

    @Override
    public void Y() {
        long l = eb ^ 0x2F0B630B5859L;
        if (this.G() == null) {
            boolean bl = SystemLifecycleController.C.U().equals((Object)CryptographicModeEnum.ONLINE);
            List<AbstractComputationKernel> list = this.o();
            for (AbstractComputationKernel abstractComputationKernel : list) {
                if (abstractComputationKernel instanceof RenderingContextManager757) {
                    RenderingContextManager757 renderingContextManager757 = (RenderingContextManager757)abstractComputationKernel;
                    try {
                        if (renderingContextManager757.S().equals(ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)19863, (long)(0x59EDC7547DAA6F1AL ^ l)), (long)4969009089113897495L, (long)l))) {
                            renderingContextManager757.N(bl);
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectionProxyHandler.a(customSystemException);
                    }
                    try {
                        if (!renderingContextManager757.S().equals(ReflectionProxyHandler.j("\u00ff", (int)ReflectionProxyHandler.e("t", (int)10752, (long)(0x11FD338639F8088CL ^ l)), (long)4969009089113897495L, (long)l))) continue;
                        renderingContextManager757.N(bl);
                        continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectionProxyHandler.a(customSystemException);
                    }
                }
                try {
                    if (!(abstractComputationKernel instanceof ConfigurationProfileManager1223)) continue;
                    abstractComputationKernel.N(bl);
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectionProxyHandler.a(customSystemException);
                }
            }
            this.gM.N(bl);
            this.gt.N(bl);
            this.g8.N(bl);
            this.gU.N(bl);
            this.gk.N(bl);
        }
        super.Y();
    }

    public ComputationalAnalyzer v() {
        return this.gs.g();
    }

    @Override
    public void E() {
        this.J();
        this.A();
        super.E();
    }

    private static void eb() {
        Object[] objectArray = wb;
        wb[0] = "I=\u001a";
        objectArray[1] = Integer.TYPE;
        ReflectionProxyHandler.xb[1] = "java/lang/Integer";
        objectArray[2] = "T\u0007q\n7%_\b`EJ=L\u000fi\f";
        objectArray[3] = "P-p\u001f~a[\"aP\u001foP)e\n";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "e\u0018Wl\u001ada\u0006\u001c]\u000e \u0001\u000eW$\u0019=l\u0016\u001c'ebeMF6\\ax\u000b\u001c]";
    }

    static ExecutionStateTracker1057 G(ReflectionProxyHandler reflectionProxyHandler) {
        return reflectionProxyHandler.gv;
    }

    @Override
    public void V() {
        super.V();
        this.Z(this.gf.P());
    }

    public SystemStateTracker O() {
        return this.gF.r();
    }

    public void T() {
        try {
            if (this.go == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionProxyHandler.a(customSystemException);
        }
        this.N().x();
        GraphicalRenderingController.z(this.go);
        this.go = null;
        this.L().N(true);
        this.gJ.N(true);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ReflectionProxyHandler.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ReflectionProxyHandler.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

