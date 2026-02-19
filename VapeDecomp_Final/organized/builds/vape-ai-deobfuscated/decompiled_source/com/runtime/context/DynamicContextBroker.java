/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.internal.ConcurrentSet
 *  org.jetbrains.annotations.Nullable
 */
package com.runtime.context;

import a.Qv;
import a._Y;
import com.adapter.management.GenericAdapterManager;
import com.app.network.NetworkConnectionHandler1792;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.auth.tracking.AuthenticationStateTracker;
import com.batch.processing.BatchWorker;
import com.collections.management.MultiContainerRegistry;
import com.configuration.management.ConfigurationParameterResolver;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.core.lifecycle.ObjectLifecycleManager;
import com.crypto.streaming.CipherStreamProcessor;
import com.dynamic.proxy.DynamicProxyResolver;
import com.event.management.EventDispatchCoordinator1090;
import com.event.management.EventDispatchCoordinator1933;
import com.exception.system.CustomSystemException;
import com.graphics.color.ColorCompositionEngine;
import com.inventory.management.AssetDiscoveryStrategy;
import com.math.geometry.GeometryCalculator;
import com.network.protocol.MultiProtocolContextManager;
import com.network.security.ProtocolValidator;
import com.reflection.dynamic.DynamicInvocationResolver1041;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.AuthenticationGateway1860;
import com.security.cipher.CipherParameterGenerator;
import com.security.cipher.CryptographicTransformer1102;
import com.security.transform.CryptographicTransformer;
import com.spatial.mapping.SpatialCoordinateMapper;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.diagnostics.SystemDiagnosticAnalyzer;
import com.system.monitoring.RuntimeResourceTracker;
import com.system.pipeline.ObjectPipelineManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import io.netty.util.internal.ConcurrentSet;
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
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DynamicContextBroker {
    private static final long[] d;
    public AuthenticationStateTracker x;
    public static boolean K;
    public static String u;
    private static final Map h;
    public final AuthenticationStateTracker O;
    public static final AuthenticationGateway1860 v;
    public CipherStreamProcessor W;
    public GenericAdapterManager l;
    static double[] a;
    public static final AuthenticationGateway1860 B;
    public AdaptiveRenderingEngine q;
    public final AuthenticationStateTracker R;
    public AuthenticationStateTracker Y;
    public final AuthenticationStateTracker X;
    public final AuthenticationStateTracker F;
    public final GenericAdapterManager n;
    @Nullable
    public DynamicProxyResolver g;
    public AuthenticationStateTracker T;
    public AuthenticationStateTracker w;
    private static final String[] j;
    private static final long b;
    public AuthenticationStateTracker A;
    public static boolean e;
    private static final Integer[] f;
    private static final Random Q;
    private static Set<Integer> P;
    public AuthenticationStateTracker s;
    private static int p;
    private static final Object[] i;
    public static final AuthenticationGateway1860 c;

    public boolean P(CryptographicTransformer cryptographicTransformer) {
        try {
            if (GeometryCalculator.C() == 13) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicContextBroker.a(customSystemException);
        }
        try {
            if (this.g != null) {
                return this.g.l(cryptographicTransformer);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicContextBroker.a(customSystemException);
        }
        return false;
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "0R\b";
        objectArray[1] = Integer.TYPE;
        DynamicContextBroker.j[1] = "java/lang/Integer";
        objectArray[2] = "\u001e\u000f\u001cG\"\u001a\u0015\u0000\r\b_\u0002\u0006\u0007\u0004A";
        objectArray[3] = "\u001anz\u000e@-\u0011akA!#\u001ajo\u001b";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u00163_Q_\"A)!Q[\u0012\u0015d@\u0005J{B;YD +M'GEPyM<H:";
    }

    public static boolean H() {
        int n;
        int n2 = ApplicationLifecycleManager.N().D().t();
        try {
            n = GeometryCalculator.C() >= 35 ? n2 : 100 + n2;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicContextBroker.a(customSystemException);
        }
        int n3 = n;
        try {
            if (n3 == 0) {
                return CryptographicTransformer1102.F();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicContextBroker.a(customSystemException);
        }
        return CryptographicTransformer1102.A();
    }

    private static Field c(long l, long l2) {
        int n = DynamicContextBroker.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = DynamicContextBroker.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DynamicContextBroker.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DynamicContextBroker.a(clazz3, string2, clazz2)) != null) {
                    DynamicContextBroker.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DynamicContextBroker.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DynamicContextBroker.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DynamicContextBroker.b(224551164281560L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void y(int n) {
        P.remove(n);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'K' || c == 'N' || c == '\u00d3' || c == 'r') {
                field = DynamicContextBroker.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'K' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DynamicContextBroker.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicContextBroker.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static double S(LightweightExecutionContext lightweightExecutionContext) {
        double d2 = RuntimeResourceTracker.N(lightweightExecutionContext);
        d2 += (double)EventDispatchCoordinator1090.b(lightweightExecutionContext, ProtocolValidator.f());
        return d2 += (double)((float)EventDispatchCoordinator1090.c(Qv.f().e(), lightweightExecutionContext) * 0.01f);
    }

    public static int E(ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192) {
        int n;
        block3: {
            block4: {
                n = connectionPoolOrchestrator1192.t();
                try {
                    if (n <= 0) break block3;
                    if (GeometryCalculator.C() >= 35) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicContextBroker.a(customSystemException);
                }
                n = ConfigurationParameterResolver.S(n);
                break block3;
            }
            int n2 = SpatialCoordinateMapper.X(n);
            if (n2 != 0) {
                n = n2;
            }
        }
        return n;
    }

    public boolean i(CryptographicTransformer cryptographicTransformer) {
        return this.H(null, cryptographicTransformer);
    }

    public static double y(LightweightExecutionContext lightweightExecutionContext) {
        return RuntimeResourceTracker.W(lightweightExecutionContext);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
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

    public boolean p() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.A.s().booleanValue() || ApplicationLifecycleManager.U().M().O()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicContextBroker.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicContextBroker.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DynamicContextBroker.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DynamicContextBroker.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static int e() {
        return p;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DynamicContextBroker.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static boolean s(ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192) {
        boolean bl;
        int n = DynamicContextBroker.E(connectionPoolOrchestrator1192);
        try {
            bl = n > 0 ? DynamicInvocationResolver1041.F(n) : SystemDiagnosticAnalyzer.A(100 + n);
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicContextBroker.a(customSystemException);
        }
        return bl;
    }

    public ColorCompositionEngine X(MultiProtocolContextManager multiProtocolContextManager) {
        block9: {
            String string;
            block8: {
                string = multiProtocolContextManager.g();
                try {
                    try {
                        if (!TemporalMetadataResolver.h.j().Q(string) || !TemporalMetadataResolver.h.j().b.s().booleanValue()) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicContextBroker.a(customSystemException);
                    }
                    return TemporalMetadataResolver.h.j().u.L();
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicContextBroker.a(customSystemException);
                }
            }
            try {
                try {
                    if (!TemporalMetadataResolver.h.g().Q(string) || !TemporalMetadataResolver.h.g().a.s().booleanValue()) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicContextBroker.a(customSystemException);
                }
                return TemporalMetadataResolver.h.g().F.L();
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicContextBroker.a(customSystemException);
            }
        }
        return this.o(multiProtocolContextManager);
    }

    public static double q(LightweightExecutionContext lightweightExecutionContext) {
        block4: {
            int n;
            EventDispatchCoordinator1933 eventDispatchCoordinator1933;
            double d2;
            block6: {
                block5: {
                    d2 = 0.0;
                    eventDispatchCoordinator1933 = lightweightExecutionContext.P();
                    try {
                        try {
                            if (eventDispatchCoordinator1933.j() <= 0) break block4;
                            if (GeometryCalculator.C() != 23) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicContextBroker.a(customSystemException);
                        }
                        n = 1;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicContextBroker.a(customSystemException);
                    }
                }
                n = 0;
            }
            int n2 = n;
            NetworkConnectionHandler1792 networkConnectionHandler1792 = new NetworkConnectionHandler1792(eventDispatchCoordinator1933.F().toArray()[n2]);
            d2 = networkConnectionHandler1792.y();
        }
        return d2 += (double)EventDispatchCoordinator1090.b(lightweightExecutionContext, ProtocolValidator.f());
    }

    public DynamicContextBroker() {
        long l = b ^ 0x20F61338B399L;
        this.q = AdaptiveRenderingEngine.C(this, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)10795, (long)(0x2BC5D85C5F6FBB02L ^ l)), (long)6349867509004403385L, (long)l)), new Color(5, 134, 105));
        this.W = CipherStreamProcessor.B(this, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)18248, (long)(0x192F8C3F3D32D663L ^ l)), (long)6349867509004403385L, (long)l)));
        this.w = AuthenticationStateTracker.R(this, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)9243, (long)(0x5A21E170A7E93527L ^ l)), (long)6349867509004403385L, (long)l)), false, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)28043, (long)(0x3F11AD5DDA187CB2L ^ l)), (long)6349867509004403385L, (long)l)));
        this.A = AuthenticationStateTracker.R(this, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)22909, (long)(0x1DB059CB85DAC858L ^ l)), (long)6349867509004403385L, (long)l)), false, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)10408, (long)(0x3D3191BFADE53999L ^ l)), (long)6349867509004403385L, (long)l)));
        this.x = AuthenticationStateTracker.R(this, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)3262, (long)(0x59B091D58E651D9CL ^ l)), (long)6349867509004403385L, (long)l)), false, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)7530, (long)(0x72A31EA67A48C4CL ^ l)), (long)6349867509004403385L, (long)l)));
        this.s = AuthenticationStateTracker.R(this, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)13245, (long)(0x708DD727E61A286L ^ l)), (long)6349867509004403385L, (long)l)), false, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)12408, (long)(0x1D6E49C190F4214BL ^ l)), (long)6349867509004403385L, (long)l)));
        this.Y = AuthenticationStateTracker.R(this, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)623, (long)(0x77ECAA402A3134CL ^ l)), (long)6349867509004403385L, (long)l)), true, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)12063, (long)(0x7FD04DAB46A4BE31L ^ l)), (long)6349867509004403385L, (long)l)));
        this.T = AuthenticationStateTracker.R(this, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)18891, (long)(0x2BAAA6DA9C81D8FBL ^ l)), (long)6349867509004403385L, (long)l)), true, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)10077, (long)(0x4DAD28F22AA6B67DL ^ l)), (long)6349867509004403385L, (long)l)));
        this.n = GenericAdapterManager.I(this, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)13842, (long)(0x53A0B5E97B242720L ^ l)), (long)6349867509004403385L, (long)l)), (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)21993, (long)(0x6AE0E6124B6444C6L ^ l)), (long)6349867509004403385L, (long)l)), B, c, v, B);
        this.F = AuthenticationStateTracker.R(this, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)7883, (long)(0x31191E9D94400FF5L ^ l)), (long)6349867509004403385L, (long)l)), false, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)5883, (long)(0x36D8A74D20FB87DAL ^ l)), (long)6349867509004403385L, (long)l)));
        this.R = AuthenticationStateTracker.R(this, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)25972, (long)(0x8A2638ACB38745EL ^ l)), (long)6349867509004403385L, (long)l)), false, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)30454, (long)(0x1C84950BDCFA67DEL ^ l)), (long)6349867509004403385L, (long)l)));
        this.O = AuthenticationStateTracker.R(this, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)23364, (long)(0x57833D6DD1064A7EL ^ l)), (long)6349867509004403385L, (long)l)), false, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)15424, (long)(0x9C80F76EEE8AD74L ^ l)), (long)6349867509004403385L, (long)l)));
        this.X = AuthenticationStateTracker.R(this, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)24879, (long)(0x159ABEF095A6703CL ^ l)), (long)6349867509004403385L, (long)l)), false, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)12183, (long)(0x3BAB235FBFD8BEA1L ^ l)), (long)6349867509004403385L, (long)l)));
        AuthenticationGateway1860 authenticationGateway1860 = new AuthenticationGateway1860((String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)15616, (long)(0x564B05CAE5972C27L ^ l)), (long)6349867509004403385L, (long)l)));
        this.l = GenericAdapterManager.I(this, (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)3129, (long)(0x6EC90BBE29429D1DL ^ l)), (long)6349867509004403385L, (long)l)), (String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)9805, (long)(0x4C2371EF60F6B770L ^ l)), (long)6349867509004403385L, (long)l)), authenticationGateway1860, new AuthenticationGateway1860((String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)14702, (long)(0x704EBF1F5E22A85BL ^ l)), (long)6349867509004403385L, (long)l))), new AuthenticationGateway1860((String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)28491, (long)(0x32AE9A365FE5AL ^ l)), (long)6349867509004403385L, (long)l))), authenticationGateway1860, new AuthenticationGateway1860((String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)10229, (long)(0x44D1F83D476836D9L ^ l)), (long)6349867509004403385L, (long)l))), new AuthenticationGateway1860((String)((Object)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)7742, (long)(0x593C381F296A0F01L ^ l)), (long)6349867509004403385L, (long)l))));
        this.q.z(true);
        this.s.l(this.Y, this.T);
        ((BatchWorker)this.W.J()).C(new AssetDiscoveryStrategy(this));
    }

    public static boolean U(CryptographicTransformer cryptographicTransformer) {
        return DynamicContextBroker.s(cryptographicTransformer.X());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                DynamicContextBroker.b = MultiContainerRegistry.a(6049406919009174909L, 5983422350178520702L, MethodHandles.lookup().lookupClass()).a(11288836022726L);
                var11 = DynamicContextBroker.b ^ 64254367024341L;
                DynamicContextBroker.i = new Object[5];
                DynamicContextBroker.j = new String[5];
                DynamicContextBroker.a();
                DynamicContextBroker.h = new HashMap<K, V>(13);
                DynamicContextBroker.N(0);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[35];
                var3_4 = 0;
                var4_5 = "\u00dd\u00103\u00b7\u00be\u00d5#L\u0099\u008b\u00e3m\u0002H\u0081\u00d1\u0004\u00cc\u0096\u0099e\r\u0098b\u0003\u00b2\u00a9\u0011*a\u0015#)Q\u00f0J9\u00d3\u00ca\u00f1\u00b8\u0082\u001e\u0006\u0006\u00fa\u00d3>JL\u0085\u00f4\u00d3\u00cd\u00de~\u0018\u00a7\u00c2g\u00fe#b\u00dd4\u00daPh\u009c\u00be\u0089\u00c3\u00b9\u0080\u0013\f\u00df3\u00fb\u00f8b\u00f6\u00b3y\u00cd\u0092\u00d4\u008f\u00a4\u00da:\u008fP\u00ed\u00eev\u00d8\u000ey)\u00a9\u00aa\u0011C;\u008a\u0088\f\u00ceO\u0013\u00cf\u00dc\u00c4\u00d2\u00ae\u0082-O.\u00c6\u001b\u0088\u00ab\u0097\u00ff\u00f3\f\u009a\u0082\u00e4eW9\u00ac\u00f8Ur\u00b6\u0094b5\u0086\u0005\u00d5t\u00fc&\u00835\u00fb\u0019\u0006>:+\u00a8\u00ab\u00b2\u00bf\u00c2\u00fb\u00a2Eqs\\\u0090\u00c0\u00cc\u00d6\u001d\u00e2\u00ac\u0003\u0082\u00ad\u0093w\u001f\u00ee\u00be2\u0098\u00bbi1\u00feXKFI\t\u00c4\u0093\u00f60\u00b7\u00efLa\u00e9\u0000G\u0000\u00b0j\u00e7\"`\u00d5\u00b7\u00f5\u00d1\u00b6^\u00c8\u00aa\u00fc\u00a3W `E/Bu+\u0088 \u00d1\u000e\u00b4\u00ae\u00be\u00b9\u00d3\u00b7\u0095\u00ebEL\u00a0q\u009b\u00ca\u00d4Y[s\u0005R\u0087\u00b7\u00d6\u00ec\u00b9u+\u0080\u00bd\u00a8\u00dc\u00be";
                var5_6 = "\u00dd\u00103\u00b7\u00be\u00d5#L\u0099\u008b\u00e3m\u0002H\u0081\u00d1\u0004\u00cc\u0096\u0099e\r\u0098b\u0003\u00b2\u00a9\u0011*a\u0015#)Q\u00f0J9\u00d3\u00ca\u00f1\u00b8\u0082\u001e\u0006\u0006\u00fa\u00d3>JL\u0085\u00f4\u00d3\u00cd\u00de~\u0018\u00a7\u00c2g\u00fe#b\u00dd4\u00daPh\u009c\u00be\u0089\u00c3\u00b9\u0080\u0013\f\u00df3\u00fb\u00f8b\u00f6\u00b3y\u00cd\u0092\u00d4\u008f\u00a4\u00da:\u008fP\u00ed\u00eev\u00d8\u000ey)\u00a9\u00aa\u0011C;\u008a\u0088\f\u00ceO\u0013\u00cf\u00dc\u00c4\u00d2\u00ae\u0082-O.\u00c6\u001b\u0088\u00ab\u0097\u00ff\u00f3\f\u009a\u0082\u00e4eW9\u00ac\u00f8Ur\u00b6\u0094b5\u0086\u0005\u00d5t\u00fc&\u00835\u00fb\u0019\u0006>:+\u00a8\u00ab\u00b2\u00bf\u00c2\u00fb\u00a2Eqs\\\u0090\u00c0\u00cc\u00d6\u001d\u00e2\u00ac\u0003\u0082\u00ad\u0093w\u001f\u00ee\u00be2\u0098\u00bbi1\u00feXKFI\t\u00c4\u0093\u00f60\u00b7\u00efLa\u00e9\u0000G\u0000\u00b0j\u00e7\"`\u00d5\u00b7\u00f5\u00d1\u00b6^\u00c8\u00aa\u00fc\u00a3W `E/Bu+\u0088 \u00d1\u000e\u00b4\u00ae\u00be\u00b9\u00d3\u00b7\u0095\u00ebEL\u00a0q\u009b\u00ca\u00d4Y[s\u0005R\u0087\u00b7\u00d6\u00ec\u00b9u+\u0080\u00bd\u00a8\u00dc\u00be".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block10;
                    break;
                }
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "\u00c5\u00909\u00d0m\u00d3\u00d1y\u00a6\u009f/\u00cc,5\u000f$";
                    var5_6 = "\u00c5\u00909\u00d0m\u00d3\u00d1y\u00a6\u009f/\u00cc,5\u000f$".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl43:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    break block11;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
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
        DynamicContextBroker.d = var6_3;
        DynamicContextBroker.f = new Integer[35];
        try {
            v8 = GeometryCalculator.C() > 13;
        }
        catch (CustomSystemException v9) {
            throw DynamicContextBroker.a(v9);
        }
        DynamicContextBroker.e = v8;
        DynamicContextBroker.K = false;
        DynamicContextBroker.u = new String(new char[]{'\u00a7'});
        DynamicContextBroker.c = new AuthenticationGateway1860((String)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)25582, (long)(4373957231768798607L ^ var11)), (long)3410166500588320245L, (long)var11));
        DynamicContextBroker.v = new AuthenticationGateway1860((String)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)18387, (long)(305167329565024680L ^ var11)), (long)3410166500588320245L, (long)var11));
        DynamicContextBroker.B = new AuthenticationGateway1860((String)DynamicContextBroker.b("\u00d0", (int)DynamicContextBroker.a("u", (int)8419, (long)(5412621195771496125L ^ var11)), (long)3410166500588320245L, (long)var11));
        DynamicContextBroker.P = new ConcurrentSet();
        DynamicContextBroker.Q = new Random();
        DynamicContextBroker.a = new double[]{0.75, 0.9, 1.0, 1.1, 1.25};
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/rT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (j[n4] != null) {
            return n4;
        }
        Object object = i[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 52;
                break;
            }
            case 1: {
                n3 = 43;
                break;
            }
            case 2: {
                n3 = 19;
                break;
            }
            case 3: {
                n3 = 55;
                break;
            }
            case 4: {
                n3 = 38;
                break;
            }
            case 5: {
                n3 = 10;
                break;
            }
            case 6: {
                n3 = 48;
                break;
            }
            case 7: {
                n3 = 61;
                break;
            }
            case 8: {
                n3 = 18;
                break;
            }
            case 9: {
                n3 = 11;
                break;
            }
            case 10: {
                n3 = 62;
                break;
            }
            case 11: {
                n3 = 9;
                break;
            }
            case 12: {
                n3 = 13;
                break;
            }
            case 13: {
                n3 = 53;
                break;
            }
            case 14: {
                n3 = 56;
                break;
            }
            case 15: {
                n3 = 8;
                break;
            }
            case 16: {
                n3 = 26;
                break;
            }
            case 17: {
                n3 = 28;
                break;
            }
            case 18: {
                n3 = 20;
                break;
            }
            case 19: {
                n3 = 54;
                break;
            }
            case 20: {
                n3 = 25;
                break;
            }
            case 21: {
                n3 = 12;
                break;
            }
            case 22: {
                n3 = 34;
                break;
            }
            case 23: {
                n3 = 30;
                break;
            }
            case 24: {
                n3 = 16;
                break;
            }
            case 25: {
                n3 = 5;
                break;
            }
            case 26: {
                n3 = 36;
                break;
            }
            case 27: {
                n3 = 39;
                break;
            }
            case 28: {
                n3 = 17;
                break;
            }
            case 29: {
                n3 = 35;
                break;
            }
            case 30: {
                n3 = 44;
                break;
            }
            case 31: {
                n3 = 33;
                break;
            }
            case 32: {
                n3 = 57;
                break;
            }
            case 33: {
                n3 = 37;
                break;
            }
            case 34: {
                n3 = 49;
                break;
            }
            case 35: {
                n3 = 40;
                break;
            }
            case 36: {
                n3 = 14;
                break;
            }
            case 37: {
                n3 = 6;
                break;
            }
            case 38: {
                n3 = 31;
                break;
            }
            case 39: {
                n3 = 0;
                break;
            }
            case 40: {
                n3 = 2;
                break;
            }
            case 41: {
                n3 = 3;
                break;
            }
            case 42: {
                n3 = 47;
                break;
            }
            case 43: {
                n3 = 24;
                break;
            }
            case 44: {
                n3 = 15;
                break;
            }
            case 45: {
                n3 = 46;
                break;
            }
            case 46: {
                n3 = 58;
                break;
            }
            case 47: {
                n3 = 1;
                break;
            }
            case 48: {
                n3 = 27;
                break;
            }
            case 49: {
                n3 = 4;
                break;
            }
            case 50: {
                n3 = 59;
                break;
            }
            case 51: {
                n3 = 23;
                break;
            }
            case 52: {
                n3 = 51;
                break;
            }
            case 53: {
                n3 = 29;
                break;
            }
            case 54: {
                n3 = 7;
                break;
            }
            case 55: {
                n3 = 50;
                break;
            }
            case 56: {
                n3 = 22;
                break;
            }
            case 57: {
                n3 = 60;
                break;
            }
            case 58: {
                n3 = 42;
                break;
            }
            case 59: {
                n3 = 32;
                break;
            }
            case 60: {
                n3 = 45;
                break;
            }
            case 61: {
                n3 = 41;
                break;
            }
            case 62: {
                n3 = 21;
                break;
            }
            default: {
                n3 = 63;
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
        DynamicContextBroker.j[n4] = new String(cArray);
        return n4;
    }

    public void I(ContextualExecutionFramework contextualExecutionFramework) {
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x492D;
        if (f[n2] == null) {
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
                throw new RuntimeException("a/rT", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicContextBroker.f[n2] = n3;
        }
        return f[n2];
    }

    public boolean G(CryptographicTransformer cryptographicTransformer, boolean bl) {
        boolean bl2;
        TransactionOrchestrator1017 transactionOrchestrator1017;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block32: {
            block31: {
                systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    if (cryptographicTransformer.Y()) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicContextBroker.a(customSystemException);
                }
                try {
                    if (cryptographicTransformer.B(ReflectionMetadataResolver.YD)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicContextBroker.a(customSystemException);
                }
                try {
                    if (cryptographicTransformer.equals(systemConfigurationOrchestrator)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicContextBroker.a(customSystemException);
                }
                try {
                    if (!cryptographicTransformer.B(ReflectionMetadataResolver.Ut)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicContextBroker.a(customSystemException);
                }
                try {
                    try {
                        if (GeometryCalculator.C() <= 13 || !cryptographicTransformer.B(ReflectionMetadataResolver.PR)) break block31;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicContextBroker.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicContextBroker.a(customSystemException);
                }
            }
            transactionOrchestrator1017 = new TransactionOrchestrator1017(cryptographicTransformer.M());
            try {
                if (transactionOrchestrator1017.e() <= 0.0f) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicContextBroker.a(customSystemException);
            }
            try {
                try {
                    if (!bl || !_Y.X(transactionOrchestrator1017)) break block32;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicContextBroker.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicContextBroker.a(customSystemException);
            }
        }
        try {
            if (TemporalMetadataResolver.h.j().h(transactionOrchestrator1017)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicContextBroker.a(customSystemException);
        }
        try {
            if (this.H(systemConfigurationOrchestrator, cryptographicTransformer)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicContextBroker.a(customSystemException);
        }
        try {
            bl2 = !this.P(cryptographicTransformer);
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicContextBroker.a(customSystemException);
        }
        return bl2;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DynamicContextBroker.a(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                DynamicContextBroker.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static void N(int n) {
        p = n;
    }

    private static Method d(long l, long l2) {
        int n = DynamicContextBroker.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = DynamicContextBroker.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DynamicContextBroker.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DynamicContextBroker.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        DynamicContextBroker.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DynamicContextBroker.b(224551164281560L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DynamicContextBroker.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DynamicContextBroker.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DynamicContextBroker.b(224551164281560L, 0L);
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

    public static boolean e() {
        int n;
        int n2 = ApplicationLifecycleManager.N().G().t();
        try {
            n = GeometryCalculator.C() >= 35 ? n2 : 100 + n2;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicContextBroker.a(customSystemException);
        }
        int n3 = n;
        try {
            if (n3 == 0) {
                return CryptographicTransformer1102.F();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicContextBroker.a(customSystemException);
        }
        return CryptographicTransformer1102.A();
    }

    public boolean H(@Nullable SystemConfigurationOrchestrator systemConfigurationOrchestrator, CryptographicTransformer cryptographicTransformer) {
        block4: {
            try {
                try {
                    if (this.g != null && this.g.Z()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicContextBroker.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicContextBroker.a(customSystemException);
            }
        }
        return this.g.O(systemConfigurationOrchestrator, cryptographicTransformer);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public ColorCompositionEngine o(MultiProtocolContextManager multiProtocolContextManager) {
        try {
            if (this.g == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicContextBroker.a(customSystemException);
        }
        return this.g.b(multiProtocolContextManager);
    }

    public double b() {
        return a[this.l.V()];
    }

    public static void M(TransactionOrchestrator1017 transactionOrchestrator1017) {
        float f;
        int[] nArray;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block67: {
            float f2;
            float f3;
            block68: {
                float f4;
                block66: {
                    block61: {
                        block65: {
                            block64: {
                                block63: {
                                    block62: {
                                        block60: {
                                            block58: {
                                                float f5;
                                                block59: {
                                                    SystemConfigurationOrchestrator systemConfigurationOrchestrator2;
                                                    block56: {
                                                        boolean bl;
                                                        int n;
                                                        block52: {
                                                            block53: {
                                                                int n2;
                                                                block54: {
                                                                    block55: {
                                                                        long l = b ^ 0x74BD0440135BL;
                                                                        systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                                                        n = 0;
                                                                        nArray = ObjectLifecycleManager.x();
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        bl = systemConfigurationOrchestrator.e(ObjectPipelineManager.y);
                                                                                        if (nArray != null) break block52;
                                                                                        if (bl) break block53;
                                                                                    }
                                                                                    catch (CustomSystemException customSystemException) {
                                                                                        throw DynamicContextBroker.a(customSystemException);
                                                                                    }
                                                                                    n2 = systemConfigurationOrchestrator.e(ObjectPipelineManager.v);
                                                                                    if (nArray != null) break block54;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw DynamicContextBroker.a(customSystemException);
                                                                                }
                                                                                if (n2 == 0) break block55;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw DynamicContextBroker.a(customSystemException);
                                                                            }
                                                                            n2 = 6 + (1 + systemConfigurationOrchestrator.W(ObjectPipelineManager.v).y()) * 2;
                                                                            break block54;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw DynamicContextBroker.a(customSystemException);
                                                                        }
                                                                    }
                                                                    n2 = 6;
                                                                }
                                                                n = n2;
                                                            }
                                                            try {
                                                                systemConfigurationOrchestrator2 = systemConfigurationOrchestrator;
                                                                if (nArray != null) break block56;
                                                                bl = systemConfigurationOrchestrator2.K();
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw DynamicContextBroker.a(customSystemException);
                                                            }
                                                        }
                                                        try {
                                                            block57: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (!bl) break block57;
                                                                                systemConfigurationOrchestrator2 = systemConfigurationOrchestrator;
                                                                                if (nArray != null) break block56;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw DynamicContextBroker.a(customSystemException);
                                                                            }
                                                                            if (systemConfigurationOrchestrator2.g() >= n / 2) break block57;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw DynamicContextBroker.a(customSystemException);
                                                                        }
                                                                        f4 = systemConfigurationOrchestrator.g();
                                                                        if (nArray != null) break block58;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw DynamicContextBroker.a(customSystemException);
                                                                    }
                                                                    if (f4 >= 0) break block59;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw DynamicContextBroker.a(customSystemException);
                                                                }
                                                            }
                                                            systemConfigurationOrchestrator.Z(-1);
                                                            systemConfigurationOrchestrator2 = systemConfigurationOrchestrator;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw DynamicContextBroker.a(customSystemException);
                                                        }
                                                    }
                                                    systemConfigurationOrchestrator2.A(true);
                                                }
                                                f4 = (f5 = systemConfigurationOrchestrator.W() - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
                                            }
                                            try {
                                                try {
                                                    if (nArray != null) break block60;
                                                    if (f4 <= 0) break block61;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DynamicContextBroker.a(customSystemException);
                                                }
                                                f4 = (float)systemConfigurationOrchestrator.j();
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DynamicContextBroker.a(customSystemException);
                                            }
                                        }
                                        try {
                                            try {
                                                if (nArray != null) break block62;
                                                if (f4 != false) break block61;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DynamicContextBroker.a(customSystemException);
                                            }
                                            f4 = (float)systemConfigurationOrchestrator.T();
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DynamicContextBroker.a(customSystemException);
                                        }
                                    }
                                    try {
                                        try {
                                            if (nArray != null) break block63;
                                            if (f4 != false) break block61;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DynamicContextBroker.a(customSystemException);
                                        }
                                        f4 = (float)systemConfigurationOrchestrator.F();
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DynamicContextBroker.a(customSystemException);
                                    }
                                }
                                try {
                                    try {
                                        if (nArray != null) break block64;
                                        if (f4 != false) break block61;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DynamicContextBroker.a(customSystemException);
                                    }
                                    f4 = (float)systemConfigurationOrchestrator.e(ObjectPipelineManager.h);
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicContextBroker.a(customSystemException);
                                }
                            }
                            try {
                                try {
                                    if (nArray != null) break block65;
                                    if (f4 != false) break block61;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicContextBroker.a(customSystemException);
                                }
                                f4 = (float)systemConfigurationOrchestrator.o().Y();
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicContextBroker.a(customSystemException);
                            }
                        }
                        try {
                            if (nArray != null) break block66;
                            if (f4 == false) break block61;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicContextBroker.a(customSystemException);
                        }
                        f4 = 1.0f;
                        break block66;
                    }
                    f4 = 0.0f;
                }
                float f6 = f4;
                f3 = EventDispatchCoordinator1090.b(systemConfigurationOrchestrator.a(), transactionOrchestrator1017.d());
                try {
                    try {
                        f = f6;
                        if (nArray != null) break block67;
                        if (f == false) break block68;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicContextBroker.a(customSystemException);
                    }
                    systemConfigurationOrchestrator.n(transactionOrchestrator1017);
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicContextBroker.a(customSystemException);
                }
            }
            f = (f2 = f3 - 0.0f) == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
        }
        try {
            if (f > 0) {
                systemConfigurationOrchestrator.K(transactionOrchestrator1017);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicContextBroker.a(customSystemException);
        }
        try {
            if (nArray != null) {
                AbstractComputationKernel.I(new String[4]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicContextBroker.a(customSystemException);
        }
    }

    public static void g(ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192, boolean bl) {
        block4: {
            int n;
            block5: {
                n = DynamicContextBroker.E(connectionPoolOrchestrator1192);
                try {
                    try {
                        if (n <= 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicContextBroker.a(customSystemException);
                    }
                    CipherParameterGenerator.C(n);
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicContextBroker.a(customSystemException);
                }
            }
            CipherParameterGenerator.b(n);
        }
    }

    public static boolean s(int n) {
        return P.contains(n);
    }

    public static int M() {
        int n;
        long l = b ^ 0x518B9D661601L;
        while (P.contains(n = -Q.ints(1, (int)DynamicContextBroker.a("u", (int)16559, (long)(0x6DB5F61539F3740FL ^ l))).findFirst().getAsInt()) && ApplicationLifecycleManager.c().I(n).Y()) {
        }
        P.add(n);
        return n;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = DynamicContextBroker.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DynamicContextBroker.b(classArray[i], string, clazz2);
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
            throw new RuntimeException("a/rT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static int H() {
        int n = DynamicContextBroker.e();
        try {
            if (n == 0) {
                return 3;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicContextBroker.a(customSystemException);
        }
        return 0;
    }

    public static boolean L(int n) {
        try {
            if (n < 0) {
                return SystemDiagnosticAnalyzer.A(100 + n);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicContextBroker.a(customSystemException);
        }
        return DynamicInvocationResolver1041.F(n);
    }

    public ColorCompositionEngine L(String string, String string2, boolean bl) {
        try {
            if (this.g == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicContextBroker.a(customSystemException);
        }
        return this.g.R(string, string2, bl);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicContextBroker.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DynamicContextBroker.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

