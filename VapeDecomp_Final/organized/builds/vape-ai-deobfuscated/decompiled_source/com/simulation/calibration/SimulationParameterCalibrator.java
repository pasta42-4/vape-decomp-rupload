/*
 * Decompiled with CFR 0.152.
 */
package com.simulation.calibration;

import a.KB;
import a.Vg;
import a.a;
import a.oQ;
import com.app.config.management.ConfigurationRegistry;
import com.app.core.execution.ExecutionOrchestrator;
import com.app.system.orchestration.SystemStateOrchestrator1202;
import com.async.events.AsynchronousEventDispatcher;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.encoding.protocol.EncodingProtocolEnum;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.math.geometry.GeometryCalculator;
import com.messaging.core.MessageInterceptor;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.connection.ConnectionLifecycleManager;
import com.network.connection.NetworkConnectionManager1286;
import com.network.event.NetworkEventDispatcher;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.network.transmission.DataTransmissionManager2384;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.dynamic.DynamicInvocationResolver1041;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.security.auth.AuthenticationTokenGenerator788;
import com.security.crypto.CryptographicContextManager1918;
import com.security.logging.CryptographicTransactionLogger;
import com.security.stream.CryptographicStreamProcessor;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.transaction.management.TransactionLifecycleCoordinator;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class SimulationParameterCalibrator
extends ContextualExecutionFramework {
    private final NumericPrecisionTransformer t;
    private Object v;
    private final ConnectionLifecycleManager r;
    private float b;
    private final AuthenticationStateTracker O;
    private float x;
    private boolean P;
    private final AuthenticationStateTracker d;
    private static final long[] j;
    private DataTransmissionManager2384 n;
    private int l;
    private static final Object[] A;
    private double T;
    private static final String[] B;
    private int X;
    private final NumericPrecisionTransformer Y;
    private static final Integer[] o;
    private static final Map z;
    private double R;
    private final AuthenticationStateTracker e;
    private boolean V;
    private MessageInterceptor m;
    private double w;
    private static final long h;

    @DataExchangeProtocol2090
    public void q(KB kB) {
        block13: {
            try {
                block12: {
                    try {
                        try {
                            if (ApplicationLifecycleManager.c().Y() || ApplicationLifecycleManager.U().Y()) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SimulationParameterCalibrator.a(customSystemException);
                        }
                        if (!(ApplicationLifecycleManager.U().e() <= 0.0f)) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SimulationParameterCalibrator.a(customSystemException);
                    }
                }
                super.y(false, false);
            }
            catch (CustomSystemException customSystemException) {
                throw SimulationParameterCalibrator.a(customSystemException);
            }
        }
        try {
            if (this.P) {
                this.q();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SimulationParameterCalibrator.a(customSystemException);
        }
        try {
            this.r.d(this);
            if (this.V) {
                this.k();
                this.V = false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SimulationParameterCalibrator.a(customSystemException);
        }
        this.A();
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void t(NetworkEventDispatcher networkEventDispatcher) {
        block16: {
            try {
                if (this.n == null) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SimulationParameterCalibrator.a(customSystemException);
            }
            try {
                try {
                    if (this.v == null || !networkEventDispatcher.getPacketInstance().equals(this.v)) break block16;
                }
                catch (CustomSystemException customSystemException) {
                    throw SimulationParameterCalibrator.a(customSystemException);
                }
                this.v = null;
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw SimulationParameterCalibrator.a(customSystemException);
            }
        }
        try {
            if (ApplicationLifecycleManager.c().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SimulationParameterCalibrator.a(customSystemException);
        }
        try {
            if (this.J(networkEventDispatcher.getPacket())) {
                networkEventDispatcher.setCanceled(true);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SimulationParameterCalibrator.a(customSystemException);
        }
        try {
            if (!networkEventDispatcher.getPacket().B(ReflectionMetadataResolver.L)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SimulationParameterCalibrator.a(customSystemException);
        }
        networkEventDispatcher.setPacket(this.t());
        ApplicationLifecycleManager.U().a(this.X);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SimulationParameterCalibrator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private CryptographicStreamProcessor E() {
        try {
            if (GeometryCalculator.C() == 13) {
                return CryptographicStreamProcessor.h(this.n.G(), -999.0, -999.0, this.n.o(), this.n.q(), this.n.S(), this.n.j());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SimulationParameterCalibrator.a(customSystemException);
        }
        return CryptographicStreamProcessor.g(this.n.G(), -999.0, this.n.o(), this.n.q(), this.n.S(), this.n.j());
    }

    public SimulationParameterCalibrator() {
        long l = h ^ 0x4D1EB3D2CF9FL;
        super(a.cs((int)SimulationParameterCalibrator.a("r", (int)31729, (long)(0x777C75728D3616L ^ l))), (int)SimulationParameterCalibrator.a("r", (int)14419, (long)(0x694C62ACF544F5B7L ^ l)), RecursiveNodeGraph.k, a.cs((int)SimulationParameterCalibrator.a("r", (int)20417, (long)(0x1614C23B988E8224L ^ l))));
        this.r = ConfigurationRegistry.O;
        this.d = AuthenticationStateTracker.R(this, (String)((Object)SimulationParameterCalibrator.c("\u00c9", (int)SimulationParameterCalibrator.a("r", (int)4743, (long)(0x56CB790FF54A5F6FL ^ l)), (long)1653435628218378049L, (long)l)), true, (String)((Object)SimulationParameterCalibrator.c("\u00c9", (int)SimulationParameterCalibrator.a("r", (int)22983, (long)(0x1E39B03E52409428L ^ l)), (long)1653435628218378049L, (long)l)));
        this.Y = NumericPrecisionTransformer.D(this, (String)((Object)SimulationParameterCalibrator.c("\u00c9", (int)SimulationParameterCalibrator.a("r", (int)12259, (long)(0x4F9BB92B8CF5E201L ^ l)), (long)1653435628218378049L, (long)l)), (String)((Object)SimulationParameterCalibrator.c("\u00c9", (int)SimulationParameterCalibrator.a("r", (int)12323, (long)(0x3F90EBFCACC17DC2L ^ l)), (long)1653435628218378049L, (long)l)), "", 1.0, 3.0, 5.0, 0.1, (String)((Object)SimulationParameterCalibrator.c("\u00c9", (int)SimulationParameterCalibrator.a("r", (int)23715, (long)(0x5E6DA869B6289145L ^ l)), (long)1653435628218378049L, (long)l)));
        this.O = AuthenticationStateTracker.R(this, (String)((Object)SimulationParameterCalibrator.c("\u00c9", (int)SimulationParameterCalibrator.a("r", (int)20707, (long)(0x37A062F2EC759D0DL ^ l)), (long)1653435628218378049L, (long)l)), false, (String)((Object)SimulationParameterCalibrator.c("\u00c9", (int)SimulationParameterCalibrator.a("r", (int)15241, (long)(0x762D7E618B6A7664L ^ l)), (long)1653435628218378049L, (long)l)));
        this.e = AuthenticationStateTracker.R(this, (String)((Object)SimulationParameterCalibrator.c("\u00c9", (int)SimulationParameterCalibrator.a("r", (int)14743, (long)(0x4C3E22EBADE67477L ^ l)), (long)1653435628218378049L, (long)l)), true, (String)((Object)SimulationParameterCalibrator.c("\u00c9", (int)SimulationParameterCalibrator.a("r", (int)28589, (long)(0x5662AD3BCABEA241L ^ l)), (long)1653435628218378049L, (long)l)));
        this.t = NumericPrecisionTransformer.D(this, (String)((Object)SimulationParameterCalibrator.c("\u00c9", (int)SimulationParameterCalibrator.a("r", (int)20763, (long)(0x127BBCF4FBD11CF8L ^ l)), (long)1653435628218378049L, (long)l)), (String)((Object)SimulationParameterCalibrator.c("\u00c9", (int)SimulationParameterCalibrator.a("r", (int)2830, (long)(0x5454C5DB335D46E5L ^ l)), (long)1653435628218378049L, (long)l)), "", 1.0, 3.0, 5.0, 0.1, (String)((Object)SimulationParameterCalibrator.c("\u00c9", (int)SimulationParameterCalibrator.a("r", (int)12134, (long)(0x2265589DA7F6E28FL ^ l)), (long)1653435628218378049L, (long)l)));
        this.V = false;
        this.P = false;
        this.e.l(this.O);
        this.N(this.Y, this.t, this.d, this.e, this.O);
        this.r.y(this, 100);
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SimulationParameterCalibrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private CryptographicContextManager1918 g() {
        try {
            if (GeometryCalculator.C() == 13) {
                return CryptographicContextManager1918.e(this.n.F(), ((oQ)this.n.L()).c(), this.n.V(), this.n.B(), this.n.j());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SimulationParameterCalibrator.a(customSystemException);
        }
        return CryptographicContextManager1918.a(this.n.F(), this.n.V(), this.n.B(), this.n.j());
    }

    private void q() {
        this.P = false;
        this.p();
        super.y(false, false);
        this.n = null;
        this.r.b(this);
    }

    private static Field c(long l, long l2) {
        int n = SimulationParameterCalibrator.a(l, l2);
        Object object = A[n];
        if (object instanceof String) {
            String string = B[n];
            int n2 = string.indexOf(8);
            Class clazz = SimulationParameterCalibrator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SimulationParameterCalibrator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SimulationParameterCalibrator.a(clazz3, string2, clazz2)) != null) {
                    SimulationParameterCalibrator.A[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SimulationParameterCalibrator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SimulationParameterCalibrator.A[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SimulationParameterCalibrator.b(251914339823474L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void a() {
        Object[] objectArray = A;
        A[0] = "lW0";
        objectArray[1] = Integer.TYPE;
        SimulationParameterCalibrator.B[1] = "java/lang/Integer";
        objectArray[2] = "\u0015.\\p\u0016[\u001e!M?kC\r&Dv";
        objectArray[3] = "u3w\u0011t\u0002~<f^\u0015\fu7b\u0004";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "N,\u0010F9g\u0014x\u000b:+duq]S#eJx\u001c^\u007f\u001fL5W\u0005>d\u00139V@@";
    }

    @DataExchangeProtocol2090
    public void p(AsynchronousEventDispatcher asynchronousEventDispatcher) {
        block25: {
            float f;
            double d2;
            double d3;
            double d4;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block26: {
                block30: {
                    int n;
                    float f2;
                    block32: {
                        block31: {
                            block27: {
                                int n2;
                                float f3;
                                block29: {
                                    block28: {
                                        block24: {
                                            float f4;
                                            double d5;
                                            block23: {
                                                block22: {
                                                    double d6;
                                                    double d7;
                                                    double d8;
                                                    double d9;
                                                    systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                                    try {
                                                        d9 = (Double)this.Y.J() / 5.0;
                                                        d8 = DynamicContextBroker.s(ApplicationLifecycleManager.N().N()) ? 2.0 : 1.0;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw SimulationParameterCalibrator.a(customSystemException);
                                                    }
                                                    d4 = d9 * d8;
                                                    try {
                                                        d7 = (Double)this.t.J() / 5.0;
                                                        d6 = DynamicContextBroker.s(ApplicationLifecycleManager.N().N()) ? 2.0 : 1.0;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw SimulationParameterCalibrator.a(customSystemException);
                                                    }
                                                    d5 = d7 * d6;
                                                    try {
                                                        systemConfigurationOrchestrator.G(true);
                                                        if (!systemConfigurationOrchestrator.W().Q()) break block22;
                                                        f4 = 1.0f;
                                                        break block23;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw SimulationParameterCalibrator.a(customSystemException);
                                                    }
                                                }
                                                try {
                                                    f4 = systemConfigurationOrchestrator.W().f() ? -1.0f : 0.0f;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SimulationParameterCalibrator.a(customSystemException);
                                                }
                                            }
                                            float f5 = f4;
                                            double d10 = (double)(f5 * 0.42f) * d5;
                                            systemConfigurationOrchestrator.z(d10);
                                            ApplicationLifecycleManager.U().W().O(false);
                                            systemConfigurationOrchestrator.h(false);
                                            d3 = systemConfigurationOrchestrator.W().t();
                                            d2 = systemConfigurationOrchestrator.W().m();
                                            f = systemConfigurationOrchestrator.q();
                                            try {
                                                try {
                                                    if (d3 != 0.0 || d2 != 0.0) break block24;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SimulationParameterCalibrator.a(customSystemException);
                                                }
                                                systemConfigurationOrchestrator.t(0.0);
                                                systemConfigurationOrchestrator.s(0.0);
                                                break block25;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw SimulationParameterCalibrator.a(customSystemException);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (d3 == 0.0) break block26;
                                                    if (!(d2 > 0.0)) break block27;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SimulationParameterCalibrator.a(customSystemException);
                                                }
                                                f3 = f;
                                                if (!(d3 > 0.0)) break block28;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw SimulationParameterCalibrator.a(customSystemException);
                                            }
                                            n2 = -45;
                                            break block29;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw SimulationParameterCalibrator.a(customSystemException);
                                        }
                                    }
                                    n2 = 45;
                                }
                                f = f3 + (float)n2;
                                break block30;
                            }
                            try {
                                try {
                                    if (!(d2 < 0.0)) break block30;
                                    f2 = f;
                                    if (!(d3 > 0.0)) break block31;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SimulationParameterCalibrator.a(customSystemException);
                                }
                                n = 45;
                                break block32;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SimulationParameterCalibrator.a(customSystemException);
                            }
                        }
                        n = -45;
                    }
                    f = f2 + (float)n;
                }
                d2 = 0.0;
                d3 = d3 > 0.0 ? 1.0 : -1.0;
            }
            systemConfigurationOrchestrator.t(d3 * d4 * Math.cos(Math.toRadians(f + 90.0f)) + d2 * d4 * Math.sin(Math.toRadians(f + 90.0f)));
            systemConfigurationOrchestrator.s(d3 * d4 * Math.sin(Math.toRadians(f + 90.0f)) - d2 * d4 * Math.cos(Math.toRadians(f + 90.0f)));
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                SimulationParameterCalibrator.h = MultiContainerRegistry.a(6237093039186168945L, -302918433352739353L, MethodHandles.lookup().lookupClass()).a(152068508467258L);
                SimulationParameterCalibrator.A = new Object[5];
                SimulationParameterCalibrator.B = new String[5];
                SimulationParameterCalibrator.a();
                SimulationParameterCalibrator.z = new HashMap<K, V>(13);
                var0 = SimulationParameterCalibrator.h ^ 41696762989490L;
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
                var6_5 = "\u0085\u00b0&\u009a4\u0088\u00f3e\u00ac\u00d4E\u00e8N\tH\u00ed-\u008f\u009a{\n\u00bb\t\u00c4\u00f0\u0088\u0084]c\u00ad\u0015%K7\u00e5\u000e\u00f1\u00ac\u00f9\u0084\u0093\u0083R\u00c5\u00db0@\u009b$\u0089j\u008e\u00bc\u0099\u008e\u00ec1\u0019\u00b0\u00a8Iv\u0010\u00c0\u00c7\u001ck\u0080\u0015\u00cf\u0095\u0014\u00c1w+I\u00ed\u00c7\u008a\u00a8-F:\u00b6\u00ef6\u00b4d\nZ\u00f7E\u00cc\u00a2\u009e\u00cd|B\u00f6q\u0017\u0093\u0096\u007f";
                var7_6 = "\u0085\u00b0&\u009a4\u0088\u00f3e\u00ac\u00d4E\u00e8N\tH\u00ed-\u008f\u009a{\n\u00bb\t\u00c4\u00f0\u0088\u0084]c\u00ad\u0015%K7\u00e5\u000e\u00f1\u00ac\u00f9\u0084\u0093\u0083R\u00c5\u00db0@\u009b$\u0089j\u008e\u00bc\u0099\u008e\u00ec1\u0019\u00b0\u00a8Iv\u0010\u00c0\u00c7\u001ck\u0080\u0015\u00cf\u0095\u0014\u00c1w+I\u00ed\u00c7\u008a\u00a8-F:\u00b6\u00ef6\u00b4d\nZ\u00f7E\u00cc\u00a2\u009e\u00cd|B\u00f6q\u0017\u0093\u0096\u007f".length();
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
                    var6_5 = "\u000b9h\u00bal\u00e4\u00c1$\u00ee\n\u00ca\u00e5\u00f7FuC";
                    var7_6 = "\u000b9h\u00bal\u00e4\u00c1$\u00ee\n\u00ca\u00e5\u00f7FuC".length();
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
        SimulationParameterCalibrator.j = var8_3;
        SimulationParameterCalibrator.o = new Integer[15];
    }

    public void p() {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            systemConfigurationOrchestrator.B(this.n.F());
            systemConfigurationOrchestrator.Q(this.n.V());
            systemConfigurationOrchestrator.A(this.n.B());
            systemConfigurationOrchestrator.W(this.n.f());
            systemConfigurationOrchestrator.X(this.n.l());
            systemConfigurationOrchestrator.p(this.n.n());
            systemConfigurationOrchestrator.Z(this.n.F());
            systemConfigurationOrchestrator.G(this.n.V());
            systemConfigurationOrchestrator.M(this.n.B());
            systemConfigurationOrchestrator.a(this.n.q());
            systemConfigurationOrchestrator.f(this.n.S());
            systemConfigurationOrchestrator.W(this.n.j());
            systemConfigurationOrchestrator.a(this.n.F());
            systemConfigurationOrchestrator.K(this.n.V());
            systemConfigurationOrchestrator.i(this.n.B());
            systemConfigurationOrchestrator.b(this.n.q());
            systemConfigurationOrchestrator.R(this.n.S());
            systemConfigurationOrchestrator.z(this.n.A());
            systemConfigurationOrchestrator.G(this.n.Q());
            systemConfigurationOrchestrator.R(this.n.F(), this.n.V(), this.n.B());
            systemConfigurationOrchestrator.b(this.n.G(), this.n.x(), this.n.o());
            ApplicationLifecycleManager.U().a(this.X);
            systemConfigurationOrchestrator.G(false);
            if (this.l != 0) {
                ApplicationLifecycleManager.c().d(this.n);
                DynamicContextBroker.y(this.l);
                this.l = 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SimulationParameterCalibrator.a(customSystemException);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void y(boolean bl, boolean bl2) {
        block3: {
            block2: {
                try {
                    if (!bl) break block2;
                    super.y(bl, bl2);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw SimulationParameterCalibrator.a(customSystemException);
                }
            }
            this.P = true;
        }
    }

    @Override
    public void h() {
        this.V = true;
        this.r.d(this);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (B[n4] != null) {
            return n4;
        }
        Object object = A[n4];
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
                n3 = 1;
                break;
            }
            case 2: {
                n3 = 27;
                break;
            }
            case 3: {
                n3 = 45;
                break;
            }
            case 4: {
                n3 = 42;
                break;
            }
            case 5: {
                n3 = 11;
                break;
            }
            case 6: {
                n3 = 9;
                break;
            }
            case 7: {
                n3 = 36;
                break;
            }
            case 8: {
                n3 = 52;
                break;
            }
            case 9: {
                n3 = 2;
                break;
            }
            case 10: {
                n3 = 29;
                break;
            }
            case 11: {
                n3 = 56;
                break;
            }
            case 12: {
                n3 = 47;
                break;
            }
            case 13: {
                n3 = 60;
                break;
            }
            case 14: {
                n3 = 49;
                break;
            }
            case 15: {
                n3 = 19;
                break;
            }
            case 16: {
                n3 = 28;
                break;
            }
            case 17: {
                n3 = 7;
                break;
            }
            case 18: {
                n3 = 13;
                break;
            }
            case 19: {
                n3 = 31;
                break;
            }
            case 20: {
                n3 = 30;
                break;
            }
            case 21: {
                n3 = 22;
                break;
            }
            case 22: {
                n3 = 26;
                break;
            }
            case 23: {
                n3 = 39;
                break;
            }
            case 24: {
                n3 = 0;
                break;
            }
            case 25: {
                n3 = 3;
                break;
            }
            case 26: {
                n3 = 44;
                break;
            }
            case 27: {
                n3 = 41;
                break;
            }
            case 28: {
                n3 = 59;
                break;
            }
            case 29: {
                n3 = 62;
                break;
            }
            case 30: {
                n3 = 58;
                break;
            }
            case 31: {
                n3 = 37;
                break;
            }
            case 32: {
                n3 = 43;
                break;
            }
            case 33: {
                n3 = 54;
                break;
            }
            case 34: {
                n3 = 18;
                break;
            }
            case 35: {
                n3 = 38;
                break;
            }
            case 36: {
                n3 = 32;
                break;
            }
            case 37: {
                n3 = 63;
                break;
            }
            case 38: {
                n3 = 55;
                break;
            }
            case 39: {
                n3 = 8;
                break;
            }
            case 40: {
                n3 = 34;
                break;
            }
            case 41: {
                n3 = 35;
                break;
            }
            case 42: {
                n3 = 48;
                break;
            }
            case 43: {
                n3 = 12;
                break;
            }
            case 44: {
                n3 = 20;
                break;
            }
            case 45: {
                n3 = 5;
                break;
            }
            case 46: {
                n3 = 53;
                break;
            }
            case 47: {
                n3 = 6;
                break;
            }
            case 48: {
                n3 = 25;
                break;
            }
            case 49: {
                n3 = 33;
                break;
            }
            case 50: {
                n3 = 24;
                break;
            }
            case 51: {
                n3 = 21;
                break;
            }
            case 52: {
                n3 = 10;
                break;
            }
            case 53: {
                n3 = 16;
                break;
            }
            case 54: {
                n3 = 50;
                break;
            }
            case 55: {
                n3 = 57;
                break;
            }
            case 56: {
                n3 = 51;
                break;
            }
            case 57: {
                n3 = 4;
                break;
            }
            case 58: {
                n3 = 14;
                break;
            }
            case 59: {
                n3 = 23;
                break;
            }
            case 60: {
                n3 = 15;
                break;
            }
            case 61: {
                n3 = 46;
                break;
            }
            case 62: {
                n3 = 40;
                break;
            }
            default: {
                n3 = 61;
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
        SimulationParameterCalibrator.B[n4] = new String(cArray);
        return n4;
    }

    private static Method d(long l, long l2) {
        int n = SimulationParameterCalibrator.a(l, l2);
        Object object = A[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = B[n];
                int n3 = string2.indexOf(8);
                clazz3 = SimulationParameterCalibrator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SimulationParameterCalibrator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SimulationParameterCalibrator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        SimulationParameterCalibrator.A[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SimulationParameterCalibrator.b(251914339823474L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SimulationParameterCalibrator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SimulationParameterCalibrator.A[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SimulationParameterCalibrator.b(251914339823474L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'e' || c == '\u00e0' || c == '\u00ff' || c == '\u00e3') {
                field = SimulationParameterCalibrator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'e' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SimulationParameterCalibrator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private AuthenticationTokenGenerator788 t() {
        AuthenticationTokenGenerator788 authenticationTokenGenerator788;
        boolean bl;
        block27: {
            double d2;
            block29: {
                block28: {
                    boolean bl2;
                    block30: {
                        block25: {
                            block26: {
                                boolean bl3;
                                block24: {
                                    block23: {
                                        boolean bl4;
                                        double d3;
                                        double d4;
                                        block22: {
                                            block21: {
                                                double d5;
                                                double d6 = this.n.F() - this.T;
                                                try {
                                                    d5 = DynamicContextBroker.e ? this.n.S().c() : ((oQ)this.n.L()).c();
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SimulationParameterCalibrator.a(customSystemException);
                                                }
                                                double d7 = d5 - this.R;
                                                double d8 = this.n.B() - this.w;
                                                d4 = this.n.q() - this.b;
                                                d3 = this.n.S() - this.x;
                                                try {
                                                    try {
                                                        if (!(d6 * d6 + d7 * d7 + d8 * d8 > 9.0E-4) && this.X < 20) break block21;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw SimulationParameterCalibrator.a(customSystemException);
                                                    }
                                                    bl4 = true;
                                                    break block22;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SimulationParameterCalibrator.a(customSystemException);
                                                }
                                            }
                                            bl4 = false;
                                        }
                                        bl2 = bl4;
                                        try {
                                            try {
                                                if (d4 == 0.0 && d3 == 0.0) break block23;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw SimulationParameterCalibrator.a(customSystemException);
                                            }
                                            bl3 = true;
                                            break block24;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw SimulationParameterCalibrator.a(customSystemException);
                                        }
                                    }
                                    bl3 = false;
                                }
                                bl = bl3;
                                authenticationTokenGenerator788 = null;
                                try {
                                    try {
                                        if (!this.n.o().Y()) break block25;
                                        if (!bl2) break block26;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SimulationParameterCalibrator.a(customSystemException);
                                    }
                                    if (!bl) break block26;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SimulationParameterCalibrator.a(customSystemException);
                                }
                                authenticationTokenGenerator788 = this.c();
                                break block30;
                            }
                            authenticationTokenGenerator788 = bl2 ? this.g() : (bl ? Vg.i(this.n.q(), this.n.S(), this.n.j()) : AuthenticationTokenGenerator788.K(this.n.j()));
                            break block30;
                        }
                        authenticationTokenGenerator788 = this.E();
                        bl2 = false;
                    }
                    try {
                        try {
                            ++this.X;
                            if (!bl2) break block27;
                            this.T = this.n.F();
                            SimulationParameterCalibrator simulationParameterCalibrator = this;
                            if (!DynamicContextBroker.e) break block28;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SimulationParameterCalibrator.a(customSystemException);
                        }
                        d2 = this.n.V();
                        break block29;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SimulationParameterCalibrator.a(customSystemException);
                    }
                }
                d2 = ((oQ)this.n.L()).c();
            }
            simulationParameterCalibrator.R = d2;
            this.w = this.n.B();
            this.X = 0;
        }
        try {
            if (bl) {
                this.b = this.n.q();
                this.x = this.n.S();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SimulationParameterCalibrator.a(customSystemException);
        }
        return authenticationTokenGenerator788;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5B16;
        if (o[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])z.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    z.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/jp", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SimulationParameterCalibrator.o[n2] = n3;
        }
        return o[n2];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = SimulationParameterCalibrator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SimulationParameterCalibrator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @DataExchangeProtocol2090
    public void y(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        try {
            if (this.n == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SimulationParameterCalibrator.a(customSystemException);
        }
        ConnectionLifecycleHandler connectionLifecycleHandler = networkPacketOrchestrator1222.getPacket();
        if (connectionLifecycleHandler.B(ReflectionMetadataResolver.UV)) {
            CryptographicTransactionLogger cryptographicTransactionLogger;
            block10: {
                this.m = networkPacketOrchestrator1222.getNetworkManager();
                cryptographicTransactionLogger = new CryptographicTransactionLogger(connectionLifecycleHandler.M());
                try {
                    networkPacketOrchestrator1222.setCanceled(true);
                    if (GeometryCalculator.C() < 15) break block10;
                    ApplicationLifecycleManager.n(() -> this.lambda$onPacketReceived$0(cryptographicTransactionLogger));
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw SimulationParameterCalibrator.a(customSystemException);
                }
            }
            this.d(cryptographicTransactionLogger);
            return;
        }
        if (connectionLifecycleHandler.B(ReflectionMetadataResolver.bh)) {
            NetworkConnectionManager1286 networkConnectionManager1286 = new NetworkConnectionManager1286(connectionLifecycleHandler.M());
            try {
                if (networkConnectionManager1286.h() != ApplicationLifecycleManager.U().X()) return;
                this.n.b((double)networkConnectionManager1286.K() / 8000.0, (double)networkConnectionManager1286.I() / 8000.0, (double)networkConnectionManager1286.o() / 8000.0);
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw SimulationParameterCalibrator.a(customSystemException);
            }
        } else {
            if (!connectionLifecycleHandler.B(ReflectionMetadataResolver.Ub)) return;
            SystemStateOrchestrator1202 systemStateOrchestrator1202 = new SystemStateOrchestrator1202(connectionLifecycleHandler.M());
            this.n.t(this.n.G() + (double)systemStateOrchestrator1202.r());
            this.n.z(this.n.x() + (double)systemStateOrchestrator1202.v());
            this.n.s(this.n.o() + (double)systemStateOrchestrator1202.x());
        }
    }

    private void k() {
        this.n = ExecutionOrchestrator.F();
        this.n.X(0.0f);
        this.n.c(0.0f);
        this.n.h(false);
        ConfigurationCalibrator configurationCalibrator = ConfigurationCalibrator.b;
        try {
            if (configurationCalibrator.P()) {
                this.n.a(configurationCalibrator.Y());
                this.n.z(configurationCalibrator.Y());
                this.n.C(configurationCalibrator.Y());
                this.n.F(configurationCalibrator.Y());
                this.n.f(configurationCalibrator.p());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SimulationParameterCalibrator.a(customSystemException);
        }
        try {
            this.X = ApplicationLifecycleManager.U().m();
            this.T = ApplicationLifecycleManager.U().H();
            this.R = ApplicationLifecycleManager.U().Z();
            this.w = ApplicationLifecycleManager.U().Y();
            this.b = ApplicationLifecycleManager.U().Z();
            this.x = ApplicationLifecycleManager.U().c();
            if (this.e.s().booleanValue()) {
                this.l = DynamicContextBroker.M();
                this.n.f(this.l);
                ApplicationLifecycleManager.c().c(this.l, this.n);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SimulationParameterCalibrator.a(customSystemException);
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SimulationParameterCalibrator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SimulationParameterCalibrator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private CryptographicStreamProcessor c() {
        try {
            if (GeometryCalculator.C() == 13) {
                return CryptographicStreamProcessor.h(this.n.F(), ((oQ)this.n.L()).c(), this.n.V(), this.n.B(), this.n.q(), this.n.S(), this.n.j());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SimulationParameterCalibrator.a(customSystemException);
        }
        return CryptographicStreamProcessor.g(this.n.F(), this.n.V(), this.n.B(), this.n.q(), this.n.S(), this.n.j());
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SimulationParameterCalibrator.a(l, l2);
            object = A[n];
            try {
                if (!(object instanceof String)) break block2;
                SimulationParameterCalibrator.A[n] = clazz = Class.forName(B[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void A() {
        block14: {
            block17: {
                block16: {
                    block15: {
                        try {
                            try {
                                try {
                                    this.n.X(0.0f);
                                    this.n.c(0.0f);
                                    if (!this.O.s().booleanValue() || !ApplicationLifecycleManager.X().Y()) break block14;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SimulationParameterCalibrator.a(customSystemException);
                                }
                                if (!DynamicInvocationResolver1041.F(38)) break block15;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SimulationParameterCalibrator.a(customSystemException);
                            }
                            this.n.X(1.0f);
                            break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SimulationParameterCalibrator.a(customSystemException);
                        }
                    }
                    try {
                        if (DynamicInvocationResolver1041.F(40)) {
                            this.n.X(-1.0f);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SimulationParameterCalibrator.a(customSystemException);
                    }
                }
                try {
                    if (!DynamicInvocationResolver1041.F(37)) break block17;
                    this.n.c(1.0f);
                    break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw SimulationParameterCalibrator.a(customSystemException);
                }
            }
            try {
                if (DynamicInvocationResolver1041.F(39)) {
                    this.n.c(-1.0f);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SimulationParameterCalibrator.a(customSystemException);
            }
        }
        ExecutionOrchestrator.Y(this.n, true);
    }

    private boolean J(ConnectionLifecycleHandler connectionLifecycleHandler) {
        block9: {
            block10: {
                block8: {
                    try {
                        try {
                            if (!connectionLifecycleHandler.B(ReflectionMetadataResolver.rZ) || this.d.s().booleanValue()) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SimulationParameterCalibrator.a(customSystemException);
                        }
                        return true;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SimulationParameterCalibrator.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (this.d.s().booleanValue()) break block9;
                        if (!connectionLifecycleHandler.B(ReflectionMetadataResolver.Uc)) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SimulationParameterCalibrator.a(customSystemException);
                    }
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw SimulationParameterCalibrator.a(customSystemException);
                }
            }
            return connectionLifecycleHandler.B(ReflectionMetadataResolver.U5);
        }
        return false;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void lambda$onPacketReceived$0(CryptographicTransactionLogger cryptographicTransactionLogger) {
        this.d(cryptographicTransactionLogger);
    }

    private void d(CryptographicTransactionLogger cryptographicTransactionLogger) {
        block13: {
            float f;
            float f2;
            double d2;
            double d3;
            double d4;
            DataTransmissionManager2384 dataTransmissionManager2384;
            block15: {
                block14: {
                    block12: {
                        try {
                            try {
                                if (cryptographicTransactionLogger != null && !cryptographicTransactionLogger.Y()) break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SimulationParameterCalibrator.a(customSystemException);
                            }
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SimulationParameterCalibrator.a(customSystemException);
                        }
                    }
                    dataTransmissionManager2384 = this.n;
                    d4 = cryptographicTransactionLogger.V();
                    d3 = cryptographicTransactionLogger.w();
                    d2 = cryptographicTransactionLogger.R();
                    f2 = cryptographicTransactionLogger.Z();
                    f = cryptographicTransactionLogger.F();
                    try {
                        if (GeometryCalculator.C() <= 13) break block13;
                        if (!cryptographicTransactionLogger.y().contains(TransactionLifecycleCoordinator.t().M())) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SimulationParameterCalibrator.a(customSystemException);
                    }
                    d4 += dataTransmissionManager2384.F();
                    break block15;
                }
                dataTransmissionManager2384.t(0.0);
            }
            if (cryptographicTransactionLogger.y().contains(TransactionLifecycleCoordinator.l().M())) {
                d3 += dataTransmissionManager2384.V();
            } else {
                dataTransmissionManager2384.z(0.0);
            }
            if (cryptographicTransactionLogger.y().contains(TransactionLifecycleCoordinator.s().M())) {
                d2 += dataTransmissionManager2384.B();
            } else {
                dataTransmissionManager2384.s(0.0);
            }
            if (cryptographicTransactionLogger.y().contains(TransactionLifecycleCoordinator.i().M())) {
                f += dataTransmissionManager2384.S();
            }
            if (cryptographicTransactionLogger.y().contains(TransactionLifecycleCoordinator.O().M())) {
                f2 += dataTransmissionManager2384.q();
            }
            dataTransmissionManager2384.u(d4, d3, d2, f2, f);
            dataTransmissionManager2384.a(f2);
            CryptographicStreamProcessor cryptographicStreamProcessor = CryptographicStreamProcessor.g(dataTransmissionManager2384.F(), dataTransmissionManager2384.V(), dataTransmissionManager2384.B(), dataTransmissionManager2384.q(), dataTransmissionManager2384.S(), false);
            this.v = cryptographicStreamProcessor.M();
            this.m.c(cryptographicStreamProcessor);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SimulationParameterCalibrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(SimulationParameterCalibrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

