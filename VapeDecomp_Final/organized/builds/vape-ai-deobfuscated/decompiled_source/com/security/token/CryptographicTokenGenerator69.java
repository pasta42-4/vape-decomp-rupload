/*
 * Decompiled with CFR 0.152.
 */
package com.security.token;

import a.Qh;
import a.V3;
import a.a;
import com.adapter.management.GenericAdapterManager;
import com.app.data.processing.StreamTransformationProcessor;
import com.app.entity.movement.EntityMovementController;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.propagation.EventPropagationDispatcher;
import com.event.propagation.EventPropagationHandler;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.palette.ColorPaletteManager;
import com.math.geometry.GeometryCalculator;
import com.metrics.analysis.DimensionalMetricsTracker;
import com.network.configuration.NetworkConfigManager;
import com.network.protocol.ProtocolInteractionController;
import com.network.resources.NetworkResourceAllocator2451;
import com.network.streaming.DataStreamProcessor1233;
import com.numeric.precision.NumericPrecisionTransformer;
import com.output.processing.OutputEncoder;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.AuthenticationGateway1860;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.security.tokens.SecurityTokenGenerator2623;
import com.security.transform.CryptographicTransformer;
import com.structure.tree.RecursiveNodeTreeBuilder;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.pipeline.ObjectPipelineManager;
import com.temporal.metadata.TemporalMetadataResolver;
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
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptographicTokenGenerator69
extends ContextualExecutionFramework {
    private final NetworkConfigManager o;
    private static final Object[] kb;
    private int e;
    private int h;
    private static final long bb;
    private final GenericAdapterManager O;
    private final NumericPrecisionTransformer b;
    private static final Integer[] gb;
    private final AuthenticationStateTracker r;
    private int kQ;
    private final NumericFormattingUtility l;
    private final AuthenticationGateway1860 Y;
    private final NumericPrecisionTransformer d;
    private int P;
    private final AuthenticationGateway1860 ky;
    private final ColorPaletteManager x;
    private final AuthenticationStateTracker z;
    private boolean v;
    private static final String[] lb;
    private final AuthenticationGateway1860 N;
    private final NumericPrecisionTransformer m;
    private final AuthenticationStateTracker Z;
    private final GenericAdapterManager j;
    private int kj;
    private int X;
    private final AuthenticationStateTracker F;
    private final AuthenticationStateTracker w;
    private boolean T;
    private final AuthenticationGateway1860 V;
    private final AuthenticationStateTracker R;
    private int A;
    private final Queue<DimensionalMetricsTracker> K;
    private final AuthenticationStateTracker G;
    private int kA;
    private static final long[] fb;
    private static final Map hb;
    private boolean B;
    private final AuthenticationStateTracker n;
    private boolean t;
    private final AuthenticationGateway1860 L;

    @DataExchangeProtocol2090
    public void E(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        block42: {
            boolean bl;
            Object object;
            boolean bl2;
            block37: {
                boolean bl3;
                block36: {
                    block35: {
                        block32: {
                            block33: {
                                block34: {
                                    block31: {
                                        try {
                                            block30: {
                                                try {
                                                    try {
                                                        if (!cryptoKeyManagementSystem.getPlayer().B(ReflectionMetadataResolver.rl) || TemporalMetadataResolver.h.a().p()) break block30;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptographicTokenGenerator69.a(customSystemException);
                                                    }
                                                    if (!ApplicationLifecycleManager.X().r()) break block31;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicTokenGenerator69.a(customSystemException);
                                                }
                                            }
                                            return;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicTokenGenerator69.a(customSystemException);
                                        }
                                    }
                                    bl2 = false;
                                    try {
                                        try {
                                            try {
                                                if (this.O.J() != this.L) break block32;
                                                if (!this.B) break block33;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicTokenGenerator69.a(customSystemException);
                                            }
                                            if (ApplicationLifecycleManager.X().Y()) break block34;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicTokenGenerator69.a(customSystemException);
                                        }
                                        ApplicationLifecycleManager.U().E();
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicTokenGenerator69.a(customSystemException);
                                    }
                                }
                                this.B = false;
                                break block32;
                            }
                            while (!this.K.isEmpty()) {
                                object = this.K.poll();
                                ((DimensionalMetricsTracker)object).H();
                                bl2 = true;
                            }
                        }
                        try {
                            try {
                                if (!this.t && !this.v) break block35;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator69.a(customSystemException);
                            }
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator69.a(customSystemException);
                        }
                    }
                    object = ApplicationLifecycleManager.U();
                    int n = ((Double)this.m.J()).intValue();
                    try {
                        try {
                            if (!(((TransactionOrchestrator1017)object).e() / Math.max(((TransactionOrchestrator1017)object).K(), 1.0f) <= (float)n / 20.0f) || !this.o.m(((Double)this.d.J()).intValue())) break block36;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator69.a(customSystemException);
                        }
                        bl3 = true;
                        break block37;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator69.a(customSystemException);
                    }
                }
                bl3 = bl = false;
            }
            if (!bl) break block42;
            int n = 36;
            while (true) {
                block38: {
                    block43: {
                        block39: {
                            long l;
                            CryptographicTokenGenerator69 cryptographicTokenGenerator69;
                            block41: {
                                block40: {
                                    try {
                                        if (n >= 45) break;
                                        if (!((Qh)object).t().T(n).H()) break block38;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicTokenGenerator69.a(customSystemException);
                                    }
                                    LightweightExecutionContext lightweightExecutionContext = ((Qh)object).t().T(n).y();
                                    try {
                                        try {
                                            try {
                                                if (!this.D(lightweightExecutionContext)) break block38;
                                                if (this.O.J() != this.L) break block39;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicTokenGenerator69.a(customSystemException);
                                            }
                                            this.t = true;
                                            this.kQ = n - 36;
                                            this.A = ((Qh)object).l().v();
                                            cryptographicTokenGenerator69 = this;
                                            if (!bl2) break block40;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicTokenGenerator69.a(customSystemException);
                                        }
                                        l = 51L;
                                        break block41;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicTokenGenerator69.a(customSystemException);
                                    }
                                }
                                l = 0L;
                            }
                            cryptographicTokenGenerator69.K(l, false);
                            break block43;
                        }
                        this.kQ = -1;
                        this.A = -1;
                        ((SystemConfigurationOrchestrator)object).U().O(NetworkResourceAllocator2451.a(n - 36));
                        ApplicationLifecycleManager.n().e((Qh)object, ((CryptographicTransformer)object).N(), ((Qh)object).t().T(n).y());
                        ((SystemConfigurationOrchestrator)object).U().O(NetworkResourceAllocator2451.a(((Qh)object).l().v()));
                    }
                    this.o.m();
                    return;
                }
                ++n;
            }
        }
        this.kQ = -1;
    }

    private static Method d(long l, long l2) {
        int n = CryptographicTokenGenerator69.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = lb[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptographicTokenGenerator69.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicTokenGenerator69.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicTokenGenerator69.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicTokenGenerator69.kb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicTokenGenerator69.b(220812986681703L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicTokenGenerator69.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicTokenGenerator69.kb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicTokenGenerator69.b(220812986681703L, 0L);
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

    @DataExchangeProtocol2090
    public void Q(EventPropagationHandler eventPropagationHandler) {
        block8: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                if (!this.r.S().booleanValue()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTokenGenerator69.a(customSystemException);
            }
            try {
                try {
                    if (!this.T || this.kj == -1) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator69.a(customSystemException);
                }
                if (!this.o.m(((Double)this.d.J()).intValue())) break block8;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTokenGenerator69.a(customSystemException);
            }
            LightweightExecutionContext lightweightExecutionContext = systemConfigurationOrchestrator.t().T(36 + this.kj).y();
            if (lightweightExecutionContext.r()) {
                int n = systemConfigurationOrchestrator.l().v();
                systemConfigurationOrchestrator.l().A(this.kj);
                systemConfigurationOrchestrator.U().O(NetworkResourceAllocator2451.a(this.kj));
                ApplicationLifecycleManager.n().e(systemConfigurationOrchestrator, systemConfigurationOrchestrator.N(), lightweightExecutionContext);
                systemConfigurationOrchestrator.l().A(n);
                systemConfigurationOrchestrator.U().O(NetworkResourceAllocator2451.a(n));
            }
            this.o.m();
            this.T = false;
            this.kj = -1;
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public String H() {
        return this.O.p();
    }

    @DataExchangeProtocol2090
    public void C(SecurityTokenGenerator2623 securityTokenGenerator2623) {
        block4: {
            try {
                try {
                    if (securityTokenGenerator2623.getPlayer().B(ReflectionMetadataResolver.rl) && !TemporalMetadataResolver.h.a().p()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator69.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTokenGenerator69.a(customSystemException);
            }
        }
        this.a(securityTokenGenerator2623.getThePlayer());
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

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicTokenGenerator69.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicTokenGenerator69.b(classArray2[i], string, clazz2, n, classArray);
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
            if (c == '\u00cf' || c == '\u00a5' || c == '\u00e4' || c == 'H') {
                field = CryptographicTokenGenerator69.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cf' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicTokenGenerator69.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public CryptographicTokenGenerator69() {
        long l = bb ^ 0x32A3C866F732L;
        super(a.cs((int)CryptographicTokenGenerator69.a("r", (int)310, (long)(0x26F943029F1E5984L ^ l))), 0, (int)CryptographicTokenGenerator69.a("r", (int)9456, (long)(0x16AF0DB58E0E7C4DL ^ l)), RecursiveNodeGraph.P, a.cs((int)CryptographicTokenGenerator69.a("r", (int)4459, (long)(0x60E6A7F7640349C2L ^ l))));
        this.z = AuthenticationStateTracker.R(this, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)26258, (long)(0x753B5BD20C293E00L ^ l)), (long)7191746363764055572L, (long)l)), false, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)5408, (long)(0x6AA0026AFC97CDB3L ^ l)), (long)7191746363764055572L, (long)l)));
        this.w = AuthenticationStateTracker.R(this, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)2979, (long)(0x5D52EAA2BA51D33FL ^ l)), (long)7191746363764055572L, (long)l)), false, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)17502, (long)(0x3B1CB49178229CC5L ^ l)), (long)7191746363764055572L, (long)l)));
        this.n = AuthenticationStateTracker.R(this, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)21684, (long)(0x71C771E6E4808C17L ^ l)), (long)7191746363764055572L, (long)l)), false, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)28840, (long)(0x58BC301FCF17A837L ^ l)), (long)7191746363764055572L, (long)l)));
        this.r = AuthenticationStateTracker.R(this, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)23956, (long)(0x7E14C024D2E50527L ^ l)), (long)7191746363764055572L, (long)l)), false, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)3473, (long)(0x2612F2EFA62553EL ^ l)), (long)7191746363764055572L, (long)l))).D(true);
        this.R = AuthenticationStateTracker.R(this, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)2413, (long)(0x1F0942926A6FD1C7L ^ l)), (long)7191746363764055572L, (long)l)), true, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)2632, (long)(0x23BB8FC33CC2D2DFL ^ l)), (long)7191746363764055572L, (long)l)));
        this.F = AuthenticationStateTracker.R(this, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)30761, (long)(0x465E904BDF8F2087L ^ l)), (long)7191746363764055572L, (long)l)), false, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)7120, (long)(0x4F1D850DB4FCC344L ^ l)), (long)7191746363764055572L, (long)l)));
        this.G = AuthenticationStateTracker.R(this, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)25816, (long)(0x624076863DC8BC61L ^ l)), (long)7191746363764055572L, (long)l)), false, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)6871, (long)(0x68507BC3685A4263L ^ l)), (long)7191746363764055572L, (long)l)));
        this.Z = AuthenticationStateTracker.R(this, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)28728, (long)(0x525624EE6A1FA8A8L ^ l)), (long)7191746363764055572L, (long)l)), false, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)15900, (long)(0x7DA5201A48F0E6BDL ^ l)), (long)7191746363764055572L, (long)l)));
        this.x = ColorPaletteManager.r(this, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)11972, (long)(0x164CFCCD584BF678L ^ l)), (long)7191746363764055572L, (long)l)), (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)3466, (long)(0x6320408B46B3D51FL ^ l)), (long)7191746363764055572L, (long)l)), ColorPaletteManager.U, new RecursiveNodeTreeBuilder((String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)10609, (long)(0x10FAD4CDC331F1DDL ^ l)), (long)7191746363764055572L, (long)l))));
        this.ky = new AuthenticationGateway1860((String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)14492, (long)(0x35704820BEECE02BL ^ l)), (long)7191746363764055572L, (long)l)));
        this.N = new AuthenticationGateway1860((String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)6581, (long)(0x57284A669A84C117L ^ l)), (long)7191746363764055572L, (long)l)));
        this.Y = new AuthenticationGateway1860((String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)1536, (long)(0x576319435E205E9DL ^ l)), (long)7191746363764055572L, (long)l)));
        this.j = GenericAdapterManager.D(this, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)12958, (long)(0x505C693252806A36L ^ l)), (long)7191746363764055572L, (long)l)), this.N, this.N, this.ky, this.Y);
        this.V = new AuthenticationGateway1860((String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)8244, (long)(0x6168837E6171F892L ^ l)), (long)7191746363764055572L, (long)l)));
        this.L = new AuthenticationGateway1860((String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)10620, (long)(0x13A73F7946AF1EAL ^ l)), (long)7191746363764055572L, (long)l)));
        this.O = GenericAdapterManager.D(this, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)30288, (long)(0x615E4E443F4DAEC1L ^ l)), (long)7191746363764055572L, (long)l)), this.L, this.V, this.L);
        this.l = NumericFormattingUtility.K(this, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)31230, (long)(0x3F29A329E20F215EL ^ l)), (long)7191746363764055572L, (long)l)), (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)24904, (long)(0x3CFF01C859C7B9EDL ^ l)), (long)7191746363764055572L, (long)l)), (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)26563, (long)(0x61EE5EA602B33F75L ^ l)), (long)7191746363764055572L, (long)l)), 0.0, 75.0, 125.0, 200.0, 5.0, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)21969, (long)(0x3F8F53A773D90D4BL ^ l)), (long)7191746363764055572L, (long)l)));
        this.d = NumericPrecisionTransformer.D(this, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)20582, (long)(0x7D0093FFCA2888CBL ^ l)), (long)7191746363764055572L, (long)l)), (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)24527, (long)(0x1CB44E8482A90764L ^ l)), (long)7191746363764055572L, (long)l)), (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)5885, (long)(0x431C2BD5DA8F4E7CL ^ l)), (long)7191746363764055572L, (long)l)), 50.0, 500.0, 1000.0, 50.0, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)9726, (long)(0x44967E3B2C3CFD40L ^ l)), (long)7191746363764055572L, (long)l)));
        this.m = NumericPrecisionTransformer.N(this, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)5378, (long)(0x1FEFB9950C97CDB8L ^ l)), (long)7191746363764055572L, (long)l)), (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)28667, (long)(0x183AADF3F11EB779L ^ l)), (long)7191746363764055572L, (long)l)), (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)18587, (long)(0x86FA58B15409005L ^ l)), (long)7191746363764055572L, (long)l)), 1.0, 17.0, 20.0, 1.0);
        this.b = NumericPrecisionTransformer.D(this, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)16522, (long)(0x6B983850D526983FL ^ l)), (long)7191746363764055572L, (long)l)), (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)10782, (long)(0x272E58FE742472AEL ^ l)), (long)7191746363764055572L, (long)l)), "", 1.0, 6.0, 9.0, 1.0, (String)((Object)CryptographicTokenGenerator69.c("\u00c7", (int)CryptographicTokenGenerator69.a("r", (int)18386, (long)(0x4A905AF69A611F75L ^ l)), (long)7191746363764055572L, (long)l)));
        this.o = new NetworkConfigManager();
        this.kj = -1;
        this.K = new ConcurrentLinkedQueue<DimensionalMetricsTracker>();
        this.V.F(true, this.L);
        this.O.s(this.V, this.r, this.j);
        this.O.s(this.L, this.l);
        this.Z.l(this.x);
        this.z.l(this.j);
        this.r.D(true);
        this.r.l(this.R, this.F, this.G, this.b);
        this.N(this.O, this.z, this.j, this.r, this.R, this.F, this.G, this.b, this.Z, this.x, this.w, this.m, this.d, this.l);
        if (GeometryCalculator.C() >= 37) {
            this.kA = (int)CryptographicTokenGenerator69.a("r", (int)8138, (long)(0x647C09FCE98A4749L ^ l));
            this.e = (int)CryptographicTokenGenerator69.a("r", (int)11451, (long)(0x78CE7B6E9FD8F403L ^ l));
            this.X = (int)CryptographicTokenGenerator69.a("r", (int)16847, (long)(0x30551A60194D1956L ^ l));
            this.P = (int)CryptographicTokenGenerator69.a("r", (int)23859, (long)(0x7E719270025C05B5L ^ l));
            this.h = (int)CryptographicTokenGenerator69.a("r", (int)5044, (long)(0x2CE9668BC6C34B05L ^ l));
        } else {
            this.kA = (int)CryptographicTokenGenerator69.a("r", (int)23143, (long)(0x2F6C52A34C8682D8L ^ l));
            this.e = (int)CryptographicTokenGenerator69.a("r", (int)24253, (long)(0x61D3709448138625L ^ l));
            this.X = (int)CryptographicTokenGenerator69.a("r", (int)11539, (long)(0x1CC2715368AF5B7L ^ l));
            this.P = (int)CryptographicTokenGenerator69.a("r", (int)18797, (long)(0x529CF885000011D6L ^ l));
            this.h = (int)CryptographicTokenGenerator69.a("r", (int)4271, (long)(0x6E7780C12CC3482FL ^ l));
        }
    }

    private boolean D(LightweightExecutionContext lightweightExecutionContext) {
        boolean bl;
        block15: {
            block14: {
                block13: {
                    block12: {
                        try {
                            try {
                                if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator69.a(customSystemException);
                            }
                            return false;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator69.a(customSystemException);
                        }
                    }
                    ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
                    try {
                        try {
                            if (!this.z.s().booleanValue() || protocolInteractionController.O() != this.e) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator69.a(customSystemException);
                        }
                        return true;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator69.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (!this.Z.s().booleanValue() || !this.x.H(lightweightExecutionContext)) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator69.a(customSystemException);
                    }
                    bl = true;
                    break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator69.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void l(int n, int n2, int n3, int n4) {
        this.K.add(new DimensionalMetricsTracker(n, n2, n3, n4));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptographicTokenGenerator69.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicTokenGenerator69.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (lb[n4] != null) {
            return n4;
        }
        Object object = kb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 38;
                break;
            }
            case 1: {
                n3 = 50;
                break;
            }
            case 2: {
                n3 = 63;
                break;
            }
            case 3: {
                n3 = 22;
                break;
            }
            case 4: {
                n3 = 28;
                break;
            }
            case 5: {
                n3 = 31;
                break;
            }
            case 6: {
                n3 = 20;
                break;
            }
            case 7: {
                n3 = 37;
                break;
            }
            case 8: {
                n3 = 34;
                break;
            }
            case 9: {
                n3 = 58;
                break;
            }
            case 10: {
                n3 = 59;
                break;
            }
            case 11: {
                n3 = 42;
                break;
            }
            case 12: {
                n3 = 23;
                break;
            }
            case 13: {
                n3 = 56;
                break;
            }
            case 14: {
                n3 = 44;
                break;
            }
            case 15: {
                n3 = 32;
                break;
            }
            case 16: {
                n3 = 18;
                break;
            }
            case 17: {
                n3 = 7;
                break;
            }
            case 18: {
                n3 = 27;
                break;
            }
            case 19: {
                n3 = 61;
                break;
            }
            case 20: {
                n3 = 5;
                break;
            }
            case 21: {
                n3 = 49;
                break;
            }
            case 22: {
                n3 = 6;
                break;
            }
            case 23: {
                n3 = 12;
                break;
            }
            case 24: {
                n3 = 51;
                break;
            }
            case 25: {
                n3 = 1;
                break;
            }
            case 26: {
                n3 = 36;
                break;
            }
            case 27: {
                n3 = 13;
                break;
            }
            case 28: {
                n3 = 3;
                break;
            }
            case 29: {
                n3 = 10;
                break;
            }
            case 30: {
                n3 = 17;
                break;
            }
            case 31: {
                n3 = 40;
                break;
            }
            case 32: {
                n3 = 0;
                break;
            }
            case 33: {
                n3 = 9;
                break;
            }
            case 34: {
                n3 = 60;
                break;
            }
            case 35: {
                n3 = 55;
                break;
            }
            case 36: {
                n3 = 52;
                break;
            }
            case 37: {
                n3 = 33;
                break;
            }
            case 38: {
                n3 = 21;
                break;
            }
            case 39: {
                n3 = 16;
                break;
            }
            case 40: {
                n3 = 26;
                break;
            }
            case 41: {
                n3 = 14;
                break;
            }
            case 42: {
                n3 = 53;
                break;
            }
            case 43: {
                n3 = 25;
                break;
            }
            case 44: {
                n3 = 45;
                break;
            }
            case 45: {
                n3 = 15;
                break;
            }
            case 46: {
                n3 = 30;
                break;
            }
            case 47: {
                n3 = 54;
                break;
            }
            case 48: {
                n3 = 48;
                break;
            }
            case 49: {
                n3 = 19;
                break;
            }
            case 50: {
                n3 = 11;
                break;
            }
            case 51: {
                n3 = 43;
                break;
            }
            case 52: {
                n3 = 39;
                break;
            }
            case 53: {
                n3 = 57;
                break;
            }
            case 54: {
                n3 = 46;
                break;
            }
            case 55: {
                n3 = 4;
                break;
            }
            case 56: {
                n3 = 2;
                break;
            }
            case 57: {
                n3 = 62;
                break;
            }
            case 58: {
                n3 = 35;
                break;
            }
            case 59: {
                n3 = 24;
                break;
            }
            case 60: {
                n3 = 29;
                break;
            }
            case 61: {
                n3 = 47;
                break;
            }
            case 62: {
                n3 = 41;
                break;
            }
            default: {
                n3 = 8;
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
        CryptographicTokenGenerator69.lb[n4] = new String(cArray);
        return n4;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicTokenGenerator69.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicTokenGenerator69.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private int Y() {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        int n = -1;
        int n2 = 0;
        while (true) {
            block5: {
                block6: {
                    try {
                        if (n2 >= 45) break;
                        if (!systemConfigurationOrchestrator.t().T(n2).H()) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator69.a(customSystemException);
                    }
                    LightweightExecutionContext lightweightExecutionContext = systemConfigurationOrchestrator.t().T(n2).y();
                    try {
                        if (!this.Z(lightweightExecutionContext)) break block5;
                        if (n2 >= 8) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator69.a(customSystemException);
                    }
                    n = n2;
                    break;
                }
                if (!this.w.s().booleanValue()) break;
                this.H(n2, 36 + ((Double)this.b.J()).intValue() - 1);
                n = ((Double)this.b.J()).intValue() - 1;
                break;
            }
            ++n2;
        }
        return n;
    }

    private static void a() {
        Object[] objectArray = kb;
        kb[0] = "|!Q";
        objectArray[1] = Integer.TYPE;
        CryptographicTokenGenerator69.lb[1] = "java/lang/Integer";
        objectArray[2] = "2\"4j8:9-%%E\"**,l";
        objectArray[3] = "eTD\u001c)0n[USH>ePQ\t";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u00163\u0013]:\u0002\n1-K%>\u0010lG\u0019$Y\f0S g]\u0003kPX>\u000e[n-";
    }

    private static Field c(long l, long l2) {
        int n = CryptographicTokenGenerator69.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            String string = lb[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicTokenGenerator69.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicTokenGenerator69.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicTokenGenerator69.a(clazz3, string2, clazz2)) != null) {
                    CryptographicTokenGenerator69.kb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicTokenGenerator69.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicTokenGenerator69.kb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicTokenGenerator69.b(220812986681703L, 0L);
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
            throw new RuntimeException("a/AK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean Z(LightweightExecutionContext lightweightExecutionContext) {
        block27: {
            try {
                if (lightweightExecutionContext.Y()) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTokenGenerator69.a(customSystemException);
            }
            try {
                if (!lightweightExecutionContext.C().B(ReflectionMetadataResolver.Fl) || !DataStreamProcessor1233.d(lightweightExecutionContext)) break block27;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTokenGenerator69.a(customSystemException);
            }
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            DataStreamProcessor1233 dataStreamProcessor1233 = new DataStreamProcessor1233(lightweightExecutionContext.C().M());
            if (dataStreamProcessor1233.Q(lightweightExecutionContext) != null) {
                for (Object e : dataStreamProcessor1233.Q(lightweightExecutionContext)) {
                    boolean bl;
                    V3 v3;
                    block29: {
                        block28: {
                            boolean bl2;
                            v3 = new V3(e);
                            try {
                                bl2 = (double)systemConfigurationOrchestrator.e() <= (Double)this.m.J();
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator69.a(customSystemException);
                            }
                            bl = bl2;
                            try {
                                try {
                                    if (v3.n() != ObjectPipelineManager.P.N() || !bl) break block28;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicTokenGenerator69.a(customSystemException);
                                }
                                return true;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator69.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (v3.n() != ObjectPipelineManager.X.N() || !this.F.s().booleanValue()) break block29;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicTokenGenerator69.a(customSystemException);
                                }
                                if (systemConfigurationOrchestrator.e(ObjectPipelineManager.X)) break block29;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator69.a(customSystemException);
                            }
                            return true;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator69.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (v3.n() != ObjectPipelineManager.F.N() || !this.R.s().booleanValue()) continue;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicTokenGenerator69.a(customSystemException);
                                }
                                if (!bl) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator69.a(customSystemException);
                            }
                            if (systemConfigurationOrchestrator.e(ObjectPipelineManager.F)) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator69.a(customSystemException);
                        }
                        return true;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator69.a(customSystemException);
                    }
                }
            }
        }
        return false;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicTokenGenerator69.a(l, l2);
            object = kb[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicTokenGenerator69.kb[n] = clazz = Class.forName(lb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Loose catch block
     */
    @Override
    public void W() {
        try {
            if (!this.t) {
                return;
            }
        }
        catch (Exception exception) {
            throw CryptographicTokenGenerator69.a(exception);
        }
        try {
            int n;
            long l;
            boolean bl;
            int n2;
            ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192;
            block18: {
                block17: {
                    connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().D();
                    n2 = connectionPoolOrchestrator1192.t();
                    ApplicationLifecycleManager.U().l().A(this.kQ);
                    if (!ApplicationLifecycleManager.U().G()) break block17;
                    try {
                        block20: {
                            if (!DynamicContextBroker.L(n2)) break block17;
                            break block20;
                            catch (Exception exception) {
                                throw CryptographicTokenGenerator69.a(exception);
                            }
                        }
                        bl = true;
                        break block18;
                    }
                    catch (Exception exception) {
                        throw CryptographicTokenGenerator69.a(exception);
                    }
                }
                bl = false;
            }
            boolean bl2 = bl;
            try {
                if (bl2) {
                    OutputEncoder.f(connectionPoolOrchestrator1192, false);
                    Thread.sleep(51L);
                }
            }
            catch (Exception exception) {
                throw CryptographicTokenGenerator69.a(exception);
            }
            try {
                OutputEncoder.f(connectionPoolOrchestrator1192, true);
                Thread.sleep(51L);
                OutputEncoder.r(connectionPoolOrchestrator1192, false, false);
                l = (long)this.l.l();
                n = bl2 ? -35 : 0;
            }
            catch (Exception exception) {
                throw CryptographicTokenGenerator69.a(exception);
            }
            long l2 = Math.max(l + (long)n, 0L);
            try {
                Thread.sleep(l2);
                ApplicationLifecycleManager.U().l().A(this.A);
                if (DynamicContextBroker.L(n2)) {
                    OutputEncoder.f(connectionPoolOrchestrator1192, true);
                }
            }
            catch (Exception exception) {
                throw CryptographicTokenGenerator69.a(exception);
            }
        }
        catch (Exception exception) {
            this.t = false;
            this.kQ = -1;
            this.A = -1;
        }
        this.kQ = -1;
        this.A = -1;
        this.t = false;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3B7D;
        if (gb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = fb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])hb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    hb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/AK", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicTokenGenerator69.gb[n2] = n3;
        }
        return gb[n2];
    }

    private void H(int n, int n2) {
        block3: {
            block2: {
                try {
                    n2 -= 36;
                    if (this.O.J() != this.L) break block2;
                    this.l(ApplicationLifecycleManager.U().t().D(), n, n2, 2);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator69.a(customSystemException);
                }
            }
            ApplicationLifecycleManager.n().e(ApplicationLifecycleManager.U().t().D(), n, n2, 2, ApplicationLifecycleManager.U());
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicTokenGenerator69.bb = MultiContainerRegistry.a(-9128757907328401280L, 2474278004391235453L, MethodHandles.lookup().lookupClass()).a(85199979997989L);
                CryptographicTokenGenerator69.kb = new Object[5];
                CryptographicTokenGenerator69.lb = new String[5];
                CryptographicTokenGenerator69.a();
                CryptographicTokenGenerator69.hb = new HashMap<K, V>(13);
                var0 = CryptographicTokenGenerator69.bb ^ 18044049540131L;
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
                var8_3 = new long[53];
                var5_4 = 0;
                var6_5 = "\u00ae]\u00b3\u00b1\u00c6\u00a6\u00a8\u00c7MP\u00af\u00e9\t\u00d6zui!\u00f32\u0002A\u00d6\u0084\u00ebe\u00e1\rE8V\u00d5\u00fb\u008c\u00d9\u00eah\u008f\u00ca3\u001b\u00ec\u00b5\u00edcM\u0007\u0016\u008d\u00ffI\u00a3;\u00f9v\u00e1 \u00c4\u00a4\u0097\u00f4\u00cci%\u0007\u00a4\u0002n_\u0014t\u00e2?7\u0003\u008eO\u0083\u00b7+\u00bc]\u00c1\u00c3B\u0082w\u00f2\u00f1h\u0099g\u00cdy\u00e5(\u008cZ[,\u009f\u000f\u00b1]\u0005\u00d3)\u00ea\u001b\u00d1\u00c0\u00cd9M\u0013}w\u00c1\u00cb\u0085r\u00a2\u000f\u00f7\u00d1\u00d5\u0002\u00ae\u00bc\u00a9j\u00fb\u00a4$\u00b7IC\u00e0\u00147\b\u00f1\u00a5\u00c7hk\u00f5\u0084\u000eS\u009dM\u00a1\u0010\u0098\u00e6\u00da\u00a2\u00da'\u001a\u00d7)m\u008d\tv\u009d\u00bf\u008f\u00e6(\u00dc\u00f2k\u000bLJ\u00b9J\u0006O\u001d\u0099^\u0019\u00c9\u001e\u00b2\u0092\u00d0\u00f0\u0007Q\u00e6r\tZe\u0002=\u00ca\rGh\u009e\u00d3b\u00afc\u001c#\u00b6\u0091g\u00be\u0098\u00beygg\u0092\u00b8\u0092\u0004\u00aa\u00db\u00d1\u000e\u00be3\u00c6\u00edR]\u00ad\u0014\u001a\u007f\u00f5+\u0087uo8|\u00d5\u0090G7\u008d\u0016\u009c\u00d1<\u00e0\u00d3\u00bd\u0093\u00a9j\u00c2#\u0086J\u00c2Z\u0085\u00d9\u00c8/7b\u0091\u00c8\u00fd\u00e4\u0019m\u00d3\u00ce\u0000)a\u00c0L\u00100\u0010\u00c4\u00e1J\u00d6U\u00e1\u00cf\u0010\u00e3\u00c8\u008eT\u00e5\u0012\u00dc\u000f\u00ce\u00f4\u00c07g\u0012I!l\u00c9we\u00ce\u00a6(\u00ddG\u009e\\\u009f\u00db\u00df\u0096\u0001\u00e5\u0080\niNGq\u0003\u00e9Mve\b\u00ff\u0018N\u00dd\u0003\u00e5O\u008eL\f2\u0004c\u00c4\u008c{\u0093\u00a5\u00fc\u00d9\f|M\u00d8\u00f2\u00d1\u0094\u009e\u00fd\u00fa\u0084\u00e7C\u00bc\u00d1\u00b0\u00caos\u0081Oh \u00cc \u00d7q\u0092\u00f9I6\u00dc\u00d9A~8\u009f\u00d5c/|\u0000aM&\"";
                var7_6 = "\u00ae]\u00b3\u00b1\u00c6\u00a6\u00a8\u00c7MP\u00af\u00e9\t\u00d6zui!\u00f32\u0002A\u00d6\u0084\u00ebe\u00e1\rE8V\u00d5\u00fb\u008c\u00d9\u00eah\u008f\u00ca3\u001b\u00ec\u00b5\u00edcM\u0007\u0016\u008d\u00ffI\u00a3;\u00f9v\u00e1 \u00c4\u00a4\u0097\u00f4\u00cci%\u0007\u00a4\u0002n_\u0014t\u00e2?7\u0003\u008eO\u0083\u00b7+\u00bc]\u00c1\u00c3B\u0082w\u00f2\u00f1h\u0099g\u00cdy\u00e5(\u008cZ[,\u009f\u000f\u00b1]\u0005\u00d3)\u00ea\u001b\u00d1\u00c0\u00cd9M\u0013}w\u00c1\u00cb\u0085r\u00a2\u000f\u00f7\u00d1\u00d5\u0002\u00ae\u00bc\u00a9j\u00fb\u00a4$\u00b7IC\u00e0\u00147\b\u00f1\u00a5\u00c7hk\u00f5\u0084\u000eS\u009dM\u00a1\u0010\u0098\u00e6\u00da\u00a2\u00da'\u001a\u00d7)m\u008d\tv\u009d\u00bf\u008f\u00e6(\u00dc\u00f2k\u000bLJ\u00b9J\u0006O\u001d\u0099^\u0019\u00c9\u001e\u00b2\u0092\u00d0\u00f0\u0007Q\u00e6r\tZe\u0002=\u00ca\rGh\u009e\u00d3b\u00afc\u001c#\u00b6\u0091g\u00be\u0098\u00beygg\u0092\u00b8\u0092\u0004\u00aa\u00db\u00d1\u000e\u00be3\u00c6\u00edR]\u00ad\u0014\u001a\u007f\u00f5+\u0087uo8|\u00d5\u0090G7\u008d\u0016\u009c\u00d1<\u00e0\u00d3\u00bd\u0093\u00a9j\u00c2#\u0086J\u00c2Z\u0085\u00d9\u00c8/7b\u0091\u00c8\u00fd\u00e4\u0019m\u00d3\u00ce\u0000)a\u00c0L\u00100\u0010\u00c4\u00e1J\u00d6U\u00e1\u00cf\u0010\u00e3\u00c8\u008eT\u00e5\u0012\u00dc\u000f\u00ce\u00f4\u00c07g\u0012I!l\u00c9we\u00ce\u00a6(\u00ddG\u009e\\\u009f\u00db\u00df\u0096\u0001\u00e5\u0080\niNGq\u0003\u00e9Mve\b\u00ff\u0018N\u00dd\u0003\u00e5O\u008eL\f2\u0004c\u00c4\u008c{\u0093\u00a5\u00fc\u00d9\f|M\u00d8\u00f2\u00d1\u0094\u009e\u00fd\u00fa\u0084\u00e7C\u00bc\u00d1\u00b0\u00caos\u0081Oh \u00cc \u00d7q\u0092\u00f9I6\u00dc\u00d9A~8\u009f\u00d5c/|\u0000aM&\"".length();
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
                    var6_5 = "\u00e3JH\u0000\u00a0\u00f8\u00d5u\u00991\n\u00ca\u00da\u001b%5";
                    var7_6 = "\u00e3JH\u0000\u00a0\u00f8\u00d5u\u00991\n\u00ca\u00da\u001b%5".length();
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
        CryptographicTokenGenerator69.fb = var8_3;
        CryptographicTokenGenerator69.gb = new Integer[53];
    }

    @DataExchangeProtocol2090
    public void t(EventPropagationDispatcher eventPropagationDispatcher) {
        block35: {
            block34: {
                boolean bl;
                block33: {
                    block32: {
                        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                        try {
                            if (!this.r.S().booleanValue()) {
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator69.a(customSystemException);
                        }
                        int n = ((Double)this.m.J()).intValue();
                        try {
                            try {
                                try {
                                    block30: {
                                        try {
                                            try {
                                                block31: {
                                                    try {
                                                        try {
                                                            block29: {
                                                                try {
                                                                    try {
                                                                        if (!(systemConfigurationOrchestrator.e() <= (float)n)) break block29;
                                                                        if (!this.R.s().booleanValue()) break block30;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw CryptographicTokenGenerator69.a(customSystemException);
                                                                    }
                                                                    if (!systemConfigurationOrchestrator.e(ObjectPipelineManager.F)) break block30;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw CryptographicTokenGenerator69.a(customSystemException);
                                                                }
                                                            }
                                                            if (!this.F.s().booleanValue()) break block31;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptographicTokenGenerator69.a(customSystemException);
                                                        }
                                                        if (!systemConfigurationOrchestrator.e(ObjectPipelineManager.X)) break block30;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptographicTokenGenerator69.a(customSystemException);
                                                    }
                                                }
                                                if (!this.G.s().booleanValue()) break block32;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicTokenGenerator69.a(customSystemException);
                                            }
                                            if (systemConfigurationOrchestrator.e(ObjectPipelineManager.N)) break block32;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicTokenGenerator69.a(customSystemException);
                                        }
                                    }
                                    if (!systemConfigurationOrchestrator.j()) break block32;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicTokenGenerator69.a(customSystemException);
                                }
                                if (!systemConfigurationOrchestrator.D()) break block32;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator69.a(customSystemException);
                            }
                            bl = true;
                            break block33;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator69.a(customSystemException);
                        }
                    }
                    bl = false;
                }
                boolean bl2 = bl;
                int n = this.Y();
                try {
                    try {
                        try {
                            try {
                                if (n == -1 || !bl2) break block34;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator69.a(customSystemException);
                            }
                            if (!this.o.m(((Double)this.d.J()).intValue())) break block34;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTokenGenerator69.a(customSystemException);
                        }
                        if (this.kj != -1) break block35;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator69.a(customSystemException);
                    }
                    this.T = true;
                    this.kj = n;
                    EntityMovementController.setRotationPitch(88.99f);
                    break block35;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator69.a(customSystemException);
                }
            }
            this.T = false;
        }
    }

    private void a(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        ObjectLifecycleTracker objectLifecycleTracker;
        ObjectLifecycleTracker objectLifecycleTracker2;
        int n;
        block53: {
            block52: {
                try {
                    try {
                        if (!this.n.s().booleanValue() || ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.FJ)) break block52;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator69.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator69.a(customSystemException);
                }
            }
            try {
                if (this.t) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTokenGenerator69.a(customSystemException);
            }
            try {
                try {
                    if (this.v || !this.z.S().booleanValue()) break block53;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTokenGenerator69.a(customSystemException);
                }
                if (this.j.J() == this.Y) break block53;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTokenGenerator69.a(customSystemException);
            }
            n = 9;
            while (true) {
                block56: {
                    block61: {
                        block62: {
                            boolean bl;
                            block59: {
                                block60: {
                                    boolean bl2;
                                    block58: {
                                        block57: {
                                            block55: {
                                                boolean bl3;
                                                block54: {
                                                    try {
                                                        try {
                                                            if (n >= 45) break;
                                                            if (n < 36) break block54;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptographicTokenGenerator69.a(customSystemException);
                                                        }
                                                        bl3 = true;
                                                        break block55;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptographicTokenGenerator69.a(customSystemException);
                                                    }
                                                }
                                                bl3 = bl = false;
                                            }
                                            if (!systemConfigurationOrchestrator.t().T(n).H()) break block56;
                                            LightweightExecutionContext lightweightExecutionContext = systemConfigurationOrchestrator.t().T(n).y();
                                            objectLifecycleTracker2 = lightweightExecutionContext.C();
                                            try {
                                                if (!objectLifecycleTracker2.r() || ((ProtocolInteractionController)objectLifecycleTracker2).O() != this.kA) break block56;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicTokenGenerator69.a(customSystemException);
                                            }
                                            objectLifecycleTracker = ApplicationLifecycleManager.n();
                                            try {
                                                if (this.j.J() == this.ky) {
                                                    ((StreamTransformationProcessor)objectLifecycleTracker).e(0, n, 1, 4, systemConfigurationOrchestrator);
                                                    return;
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicTokenGenerator69.a(customSystemException);
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (this.j.J() != this.N || n == 17) break block56;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptographicTokenGenerator69.a(customSystemException);
                                                    }
                                                    if (systemConfigurationOrchestrator.t().T(17).H()) break block57;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicTokenGenerator69.a(customSystemException);
                                                }
                                                bl2 = true;
                                                break block58;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicTokenGenerator69.a(customSystemException);
                                            }
                                        }
                                        bl2 = false;
                                    }
                                    boolean bl4 = bl2;
                                    try {
                                        try {
                                            try {
                                                if (!bl4 && systemConfigurationOrchestrator.t().T(17).y().C().O() == this.kA) break block59;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicTokenGenerator69.a(customSystemException);
                                            }
                                            if (!bl) break block60;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicTokenGenerator69.a(customSystemException);
                                        }
                                        this.H(17, n);
                                        break block61;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicTokenGenerator69.a(customSystemException);
                                    }
                                }
                                ((StreamTransformationProcessor)objectLifecycleTracker).e(0, n, 0, 0, systemConfigurationOrchestrator);
                                ((StreamTransformationProcessor)objectLifecycleTracker).e(0, 17, 0, 0, systemConfigurationOrchestrator);
                                ((StreamTransformationProcessor)objectLifecycleTracker).e(0, n, 0, 0, systemConfigurationOrchestrator);
                                break block61;
                            }
                            try {
                                try {
                                    if (systemConfigurationOrchestrator.t().T(17).y().C().O() != this.kA) break block61;
                                    if (!bl) break block62;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicTokenGenerator69.a(customSystemException);
                                }
                                ((StreamTransformationProcessor)objectLifecycleTracker).e(0, n, 0, 1, systemConfigurationOrchestrator);
                                break block61;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTokenGenerator69.a(customSystemException);
                            }
                        }
                        ((StreamTransformationProcessor)objectLifecycleTracker).e(0, n, 0, 0, systemConfigurationOrchestrator);
                        ((StreamTransformationProcessor)objectLifecycleTracker).e(0, 17, 0, 0, systemConfigurationOrchestrator);
                    }
                    return;
                }
                ++n;
            }
        }
        if (this.w.s().booleanValue()) {
            n = 9;
            while (true) {
                block63: {
                    try {
                        if (n >= 36) break;
                        if (!systemConfigurationOrchestrator.t().T(n).H()) break block63;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTokenGenerator69.a(customSystemException);
                    }
                    LightweightExecutionContext lightweightExecutionContext = systemConfigurationOrchestrator.t().T(n).y();
                    if (this.D(lightweightExecutionContext)) {
                        for (int i = 36; i < 45; ++i) {
                            block64: {
                                block66: {
                                    block65: {
                                        objectLifecycleTracker2 = systemConfigurationOrchestrator.t().T(i).y();
                                        try {
                                            try {
                                                if (!((LightweightExecutionContext)objectLifecycleTracker2).Y() && !((LightweightExecutionContext)objectLifecycleTracker2).C().Y()) continue;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicTokenGenerator69.a(customSystemException);
                                            }
                                            if (this.v) break block64;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicTokenGenerator69.a(customSystemException);
                                        }
                                        objectLifecycleTracker = ApplicationLifecycleManager.N().R();
                                        try {
                                            if (GeometryCalculator.C() < 35) break block65;
                                            OutputEncoder.p((ConnectionPoolOrchestrator1192)objectLifecycleTracker);
                                            break block66;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicTokenGenerator69.a(customSystemException);
                                        }
                                    }
                                    OutputEncoder.f((ConnectionPoolOrchestrator1192)objectLifecycleTracker, true);
                                    OutputEncoder.r((ConnectionPoolOrchestrator1192)objectLifecycleTracker, false, false);
                                }
                                this.v = true;
                                return;
                            }
                            this.B = false;
                            this.H(n, i);
                            return;
                        }
                    }
                }
                ++n;
            }
            try {
                if (this.v) {
                    this.v = false;
                    this.B = true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTokenGenerator69.a(customSystemException);
            }
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicTokenGenerator69.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptographicTokenGenerator69.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

