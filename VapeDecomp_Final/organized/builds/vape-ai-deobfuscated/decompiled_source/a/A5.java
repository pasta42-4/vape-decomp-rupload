/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.KB;
import a.Ya;
import a.a;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.config.management.ConfigurationRegistry;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.core.service.ServiceLifecycleController;
import com.encoding.protocol.EncodingProtocolEnum;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.math.calculation.NumericCalculationEngine;
import com.network.clustering.ClusterNodeRegistry1151;
import com.network.configuration.NetworkConfigManager;
import com.network.connection.ConnectionLifecycleManager;
import com.network.connection.NetworkConnectionManager2105;
import com.numeric.precision.NumericPrecisionTransformer;
import com.physics.simulation.PhysicsSimulator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.security.crypto.CryptographicSecurityProvider;
import com.security.streaming.CryptoStreamProcessor;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class A5
extends ContextualExecutionFramework {
    private static final Integer[] l;
    private Ya x;
    private static final String[] B;
    private boolean N;
    private final NumericPrecisionTransformer L;
    private final NetworkConfigManager t;
    private final NetworkConfigManager F;
    private final NumericPrecisionTransformer Z;
    private long T;
    private static final long b;
    private final Random d;
    private static final Map m;
    private final NumericPrecisionTransformer Y;
    private final AuthenticationStateTracker j;
    private final NetworkConnectionManager2105 v;
    private static final long[] e;
    private long V;
    private final NumericFormattingUtility G;
    private final ConnectionLifecycleManager X;
    private ContextualEventDispatcher A;
    private static final Object[] r;
    private PhysicsSimulator n;
    private final AuthenticationStateTracker w;
    private final NetworkConfigManager z;
    private final NetworkConfigManager h;
    private final AuthenticationStateTracker o;
    private NumericCalculationEngine P;

    private void i(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        double d2;
        double d3;
        block6: {
            d3 = systemConfigurationOrchestrator.F() + this.d.nextDouble() * 2.0 - 1.0;
            d2 = systemConfigurationOrchestrator.B() + this.d.nextDouble() * 2.0 - 1.0;
            try {
                if (!this.o.s().booleanValue() || this.A == null) break block6;
            }
            catch (CustomSystemException customSystemException) {
                throw A5.a(customSystemException);
            }
            double d4 = this.A.X() - systemConfigurationOrchestrator.F();
            double d5 = this.A.f() - systemConfigurationOrchestrator.B();
            double d6 = Math.sqrt(d4 * d4 + d5 * d5);
            if (d6 >= 0.75) {
                d3 = this.A.X();
                d2 = this.A.f();
            }
        }
        try {
            if (this.n == null) {
                this.n = new PhysicsSimulator(d3, d2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A5.a(customSystemException);
        }
        this.n.b(true);
        ServiceLifecycleController.c.N(this.n);
    }

    private void o() {
        try {
            if (this.A == null) {
                this.A = ContextualEventDispatcher.N(ApplicationLifecycleManager.U().F(), ApplicationLifecycleManager.U().V(), ApplicationLifecycleManager.U().B());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A5.a(customSystemException);
        }
        try {
            if (this.P == null) {
                this.P = new NumericCalculationEngine(ConfigurationCalibrator.b.Y(), ConfigurationCalibrator.b.p());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A5.a(customSystemException);
        }
    }

    public void P() {
        block16: {
            try {
                if (this.x != null) {
                    ConfigurationCalibrator.b.v(this.x);
                    this.x.i(true);
                    this.x.h(false);
                    this.x.v(false);
                    this.x.E(true);
                    this.x.L(6.0f);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw A5.a(customSystemException);
            }
            try {
                try {
                    block15: {
                        try {
                            try {
                                try {
                                    try {
                                        if (ConfigurationCalibrator.b.N() == null || ConfigurationCalibrator.b.N() != this.x) break block15;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw A5.a(customSystemException);
                                    }
                                    if (this.x == null) break block16;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw A5.a(customSystemException);
                                }
                                if (this.x.r()) break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw A5.a(customSystemException);
                            }
                            if (!this.x.F()) break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw A5.a(customSystemException);
                        }
                    }
                    this.x = null;
                    this.X.b(this);
                    if (!this.N) break block16;
                }
                catch (CustomSystemException customSystemException) {
                    throw A5.a(customSystemException);
                }
                this.N = false;
                super.T(false);
            }
            catch (CustomSystemException customSystemException) {
                throw A5.a(customSystemException);
            }
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = A5.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private boolean x() {
        boolean bl;
        block5: {
            block4: {
                boolean bl2 = ClusterNodeRegistry1151.W().S().D();
                try {
                    try {
                        if (!bl2 || !CryptoStreamProcessor.B()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw A5.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw A5.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void Q() {
        this.t.m();
        this.V = (long)this.G.l() * 1000L;
        this.T = (long)this.G.l() * 1000L;
        this.A = null;
        this.P = null;
        this.F.m();
        this.z.m();
        this.h.m();
    }

    @Override
    public void v() {
        this.P();
        this.A();
        this.v.m(this);
        this.X.b(this);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = A5.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = A5.b(classArray2[i], string, clazz2, n, classArray);
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
            if (c == 'C' || c == 'Q' || c == 'O' || c == 'e') {
                field = A5.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = A5.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x53F8;
        if (A5.l[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/A5", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            A5.l[n2] = n3;
        }
        return A5.l[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/A5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void A() {
        try {
            if (this.n != null) {
                ServiceLifecycleController.c.I(this.n);
                this.v.m(this);
                this.n = null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A5.a(customSystemException);
        }
    }

    public A5() {
        long l = b ^ 0x50D3AD56C611L;
        super(a.cs((int)A5.a("n", (int)29297, (long)(0x7411CE10C39A1DF5L ^ l))), (int)A5.a("n", (int)22084, (long)(0x76CAE18288039C9L ^ l)), RecursiveNodeGraph.k);
        this.t = new NetworkConfigManager();
        this.F = new NetworkConfigManager();
        this.z = new NetworkConfigManager();
        this.h = new NetworkConfigManager();
        this.d = new Random();
        this.G = NumericFormattingUtility.K(this, (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)32571, (long)(0xF58F208411690B0L ^ l)), (long)4356753845398640554L, (long)l)), (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)11953, (long)(0x3EAEA90317C12DL ^ l)), (long)4356753845398640554L, (long)l)), (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)6268, (long)(0x3DEC63CBF5C9F7F5L ^ l)), (long)4356753845398640554L, (long)l)), 10.0, 30.0, 40.0, 200.0, 1.0, (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)13715, (long)(0x59C4333AFAFDDA0DL ^ l)), (long)4356753845398640554L, (long)l)));
        this.Z = NumericPrecisionTransformer.b(this, (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)70, (long)(0x5217FE66925CEFC8L ^ l)), (long)4356753845398640554L, (long)l)), (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)10639, (long)(0x25E7123F8118460FL ^ l)), (long)4356753845398640554L, (long)l)), "", 0.1, 0.2, 20.0, (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)19891, (long)(0x64537086E513A22AL ^ l)), (long)4356753845398640554L, (long)l)));
        this.w = AuthenticationStateTracker.R(this, (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)14132, (long)(0x268C77ACDC91D8AEL ^ l)), (long)4356753845398640554L, (long)l)), true, (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)1411, (long)(0x323DA2FB305C6A0CL ^ l)), (long)4356753845398640554L, (long)l)));
        this.j = AuthenticationStateTracker.R(this, (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)24637, (long)(0x9090CBEBE700FA0L ^ l)), (long)4356753845398640554L, (long)l)), false, (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)3740, (long)(0x7CCB1163519E116L ^ l)), (long)4356753845398640554L, (long)l)));
        this.o = AuthenticationStateTracker.R(this, (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)24238, (long)(0x1DA149CE8B13B131L ^ l)), (long)4356753845398640554L, (long)l)), false, (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)4316, (long)(0x1B938C80AD8A7F50L ^ l)), (long)4356753845398640554L, (long)l)));
        this.Y = NumericPrecisionTransformer.D(this, (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)309, (long)(0x7705B4E073466EB3L ^ l)), (long)4356753845398640554L, (long)l)), (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)31417, (long)(0xE94D3DEC489953CL ^ l)), (long)4356753845398640554L, (long)l)), (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)18255, (long)(0x3D064B5A505F28CCL ^ l)), (long)4356753845398640554L, (long)l)), 1.0, 10.0, 180.0, 1.0, (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)12740, (long)(0x57DC3B9D4B6E5E5FL ^ l)), (long)4356753845398640554L, (long)l)));
        this.L = NumericPrecisionTransformer.D(this, (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)5021, (long)(0xEF5A36473957C1AL ^ l)), (long)4356753845398640554L, (long)l)), (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)29328, (long)(0x444528974EE09D12L ^ l)), (long)4356753845398640554L, (long)l)), (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)31066, (long)(0x754CBE885A3716DBL ^ l)), (long)4356753845398640554L, (long)l)), 1.0, 5.0, 90.0, 1.0, (String)((Object)A5.c("\u00fc", (int)A5.a("n", (int)6339, (long)(0x202809025C7D774BL ^ l)), (long)4356753845398640554L, (long)l)));
        this.V = -1L;
        this.T = -1L;
        this.X = ConfigurationRegistry.O;
        this.v = ConfigurationRegistry.l;
        this.w.l(this.j, this.Y, this.L);
        this.N(this.G, this.Z, this.o, this.w, this.j, this.Y, this.L);
    }

    @Override
    public void y(boolean bl, boolean bl2) {
        block9: {
            block6: {
                boolean bl3;
                block8: {
                    block7: {
                        try {
                            try {
                                try {
                                    if (bl || !(this.x instanceof CryptographicSecurityProvider)) break block6;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw A5.a(customSystemException);
                                }
                                A5 a5 = this;
                                if (this.N) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw A5.a(customSystemException);
                            }
                            bl3 = true;
                            break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw A5.a(customSystemException);
                        }
                    }
                    bl3 = false;
                }
                a5.N = bl3;
                break block9;
            }
            this.N = false;
            super.y(bl, bl2);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = A5.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = A5.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = A5.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (B[n4] != null) {
            return n4;
        }
        Object object = r[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 19;
                break;
            }
            case 1: {
                n3 = 22;
                break;
            }
            case 2: {
                n3 = 44;
                break;
            }
            case 3: {
                n3 = 34;
                break;
            }
            case 4: {
                n3 = 60;
                break;
            }
            case 5: {
                n3 = 49;
                break;
            }
            case 6: {
                n3 = 14;
                break;
            }
            case 7: {
                n3 = 10;
                break;
            }
            case 8: {
                n3 = 53;
                break;
            }
            case 9: {
                n3 = 16;
                break;
            }
            case 10: {
                n3 = 21;
                break;
            }
            case 11: {
                n3 = 42;
                break;
            }
            case 12: {
                n3 = 28;
                break;
            }
            case 13: {
                n3 = 6;
                break;
            }
            case 14: {
                n3 = 46;
                break;
            }
            case 15: {
                n3 = 45;
                break;
            }
            case 16: {
                n3 = 63;
                break;
            }
            case 17: {
                n3 = 3;
                break;
            }
            case 18: {
                n3 = 25;
                break;
            }
            case 19: {
                n3 = 0;
                break;
            }
            case 20: {
                n3 = 4;
                break;
            }
            case 21: {
                n3 = 47;
                break;
            }
            case 22: {
                n3 = 17;
                break;
            }
            case 23: {
                n3 = 9;
                break;
            }
            case 24: {
                n3 = 11;
                break;
            }
            case 25: {
                n3 = 61;
                break;
            }
            case 26: {
                n3 = 62;
                break;
            }
            case 27: {
                n3 = 56;
                break;
            }
            case 28: {
                n3 = 1;
                break;
            }
            case 29: {
                n3 = 32;
                break;
            }
            case 30: {
                n3 = 35;
                break;
            }
            case 31: {
                n3 = 41;
                break;
            }
            case 32: {
                n3 = 51;
                break;
            }
            case 33: {
                n3 = 58;
                break;
            }
            case 34: {
                n3 = 29;
                break;
            }
            case 35: {
                n3 = 33;
                break;
            }
            case 36: {
                n3 = 7;
                break;
            }
            case 37: {
                n3 = 26;
                break;
            }
            case 38: {
                n3 = 15;
                break;
            }
            case 39: {
                n3 = 2;
                break;
            }
            case 40: {
                n3 = 31;
                break;
            }
            case 41: {
                n3 = 43;
                break;
            }
            case 42: {
                n3 = 13;
                break;
            }
            case 43: {
                n3 = 18;
                break;
            }
            case 44: {
                n3 = 40;
                break;
            }
            case 45: {
                n3 = 8;
                break;
            }
            case 46: {
                n3 = 48;
                break;
            }
            case 47: {
                n3 = 39;
                break;
            }
            case 48: {
                n3 = 27;
                break;
            }
            case 49: {
                n3 = 20;
                break;
            }
            case 50: {
                n3 = 5;
                break;
            }
            case 51: {
                n3 = 30;
                break;
            }
            case 52: {
                n3 = 59;
                break;
            }
            case 53: {
                n3 = 23;
                break;
            }
            case 54: {
                n3 = 57;
                break;
            }
            case 55: {
                n3 = 55;
                break;
            }
            case 56: {
                n3 = 36;
                break;
            }
            case 57: {
                n3 = 37;
                break;
            }
            case 58: {
                n3 = 52;
                break;
            }
            case 59: {
                n3 = 24;
                break;
            }
            case 60: {
                n3 = 12;
                break;
            }
            case 61: {
                n3 = 38;
                break;
            }
            case 62: {
                n3 = 50;
                break;
            }
            default: {
                n3 = 54;
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
        A5.B[n4] = new String(cArray);
        return n4;
    }

    private static Method d(long l, long l2) {
        int n = A5.a(l, l2);
        Object object = r[n];
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
                clazz3 = A5.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = A5.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = A5.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        A5.r[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = A5.b(261654532822337L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = A5.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        A5.r[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = A5.b(261654532822337L, 0L);
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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                A5.b = MultiContainerRegistry.a(-5680336613999556847L, 1061267012152071185L, MethodHandles.lookup().lookupClass()).a(15240446242823L);
                A5.r = new Object[5];
                A5.B = new String[5];
                A5.a();
                A5.m = new HashMap<K, V>(13);
                var0 = A5.b ^ 134690041573464L;
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
                var8_3 = new long[23];
                var5_4 = 0;
                var6_5 = "\u001b\u001bC\u0018-CZ&Y\u00be%|\u009d\u00e5\u00fd\u008at\u00e1\u00e1B\u0006\u0091\u00d5\\g\u00d5s\u008c-\u00f27\u008dU\u00b9\u001b\u00ab\u00d2\u001d\u0017\u009f\\\u00a6\u001d\u00c3\u00d5\u00fct\u0001_\u00b9\u00ec\u00b1\u000fC\\\u00b0\u00c4\u00de\u00a3\u00dc)\u00fc\u001de\u0091z\u00a2n/C\u00d2h\u0014-\u007f\u00cdx\u008dv\u0000\u00f5cl\u00f9\u00a8\u0004\u00e3\u00fe\t\u00e1\u009a*b0S-\u00decE|s\u0090\u001f]eH}\u00f8p\u009e\tr\u00845$\u009c@;.`h\u00f7\u0089n\u00d7)\u00d5\u000f\u00ea\u00b7*l>j\u00eaA\u001a\u00b5\u00d8\u0082n\u00c6\u00de\u00d6\u001f$\u00fb\u001b\u0080\u00d2x\u00e8\u00e2\u008a\u009b-\u00a7O\u00baf\u00ba\b\u0088\u0091\u00e2\u00ad\t\f";
                var7_6 = "\u001b\u001bC\u0018-CZ&Y\u00be%|\u009d\u00e5\u00fd\u008at\u00e1\u00e1B\u0006\u0091\u00d5\\g\u00d5s\u008c-\u00f27\u008dU\u00b9\u001b\u00ab\u00d2\u001d\u0017\u009f\\\u00a6\u001d\u00c3\u00d5\u00fct\u0001_\u00b9\u00ec\u00b1\u000fC\\\u00b0\u00c4\u00de\u00a3\u00dc)\u00fc\u001de\u0091z\u00a2n/C\u00d2h\u0014-\u007f\u00cdx\u008dv\u0000\u00f5cl\u00f9\u00a8\u0004\u00e3\u00fe\t\u00e1\u009a*b0S-\u00decE|s\u0090\u001f]eH}\u00f8p\u009e\tr\u00845$\u009c@;.`h\u00f7\u0089n\u00d7)\u00d5\u000f\u00ea\u00b7*l>j\u00eaA\u001a\u00b5\u00d8\u0082n\u00c6\u00de\u00d6\u001f$\u00fb\u001b\u0080\u00d2x\u00e8\u00e2\u008a\u009b-\u00a7O\u00baf\u00ba\b\u0088\u0091\u00e2\u00ad\t\f".length();
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
                    var6_5 = "\\c\u009a\u00afm\u00bd\u00fa\u00cc\u00a3\u00c3\u0081\u0002\u00b6\u00ab:-";
                    var7_6 = "\\c\u009a\u00afm\u00bd\u00fa\u00cc\u00a3\u00c3\u0081\u0002\u00b6\u00ab:-".length();
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
        A5.e = var8_3;
        A5.l = new Integer[23];
    }

    @Override
    public void h() {
        this.P();
        this.Q();
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/A5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void J() {
        float f;
        float f2;
        block11: {
            Ya ya;
            block13: {
                block12: {
                    float f3;
                    block10: {
                        f3 = 0.0f;
                        try {
                            if (!this.o.s().booleanValue() || this.P == null) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw A5.a(customSystemException);
                        }
                        float f4 = AdaptiveComputationEngine.v(ConfigurationCalibrator.b.Y() - this.P.D());
                        float f5 = AdaptiveComputationEngine.v(ConfigurationCalibrator.b.p() - this.P.g());
                        f3 = AdaptiveComputationEngine.l(f4 * f4 + f5 * f5);
                    }
                    double d2 = Math.sqrt((Double)this.Y.J() * (Double)this.Y.J() + (Double)this.L.J() * (Double)this.L.J());
                    double d3 = this.d.nextDouble() * (Double)this.Y.J();
                    double d4 = this.d.nextDouble() * (Double)this.L.J();
                    if (this.d.nextDouble() > 0.6) {
                        d3 = -d3;
                    }
                    if (this.d.nextDouble() > 0.5) {
                        d4 = -d4;
                    }
                    if ((double)f3 >= d2) {
                        f2 = this.P.D();
                        f = this.P.g();
                    } else {
                        f2 = (float)((double)ConfigurationCalibrator.b.Y() + d3) % 360.0f;
                        f = (float)((double)ConfigurationCalibrator.b.p() + d4) % 90.0f;
                    }
                    try {
                        try {
                            if (this.x != null) break block11;
                            A5 a5 = this;
                            if (!this.j.s().booleanValue()) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw A5.a(customSystemException);
                        }
                        ya = new CryptographicSecurityProvider(f2, f);
                        break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw A5.a(customSystemException);
                    }
                }
                ya = new Ya(f2, f);
            }
            a5.x = ya;
        }
        this.x.v(f2, f);
        this.x.L((int)(this.d.nextDouble() * 10.0));
        ConfigurationCalibrator.b.W(this.x);
    }

    private static void a() {
        Object[] objectArray = r;
        r[0] = "4cr";
        objectArray[1] = Integer.TYPE;
        A5.B[1] = "java/lang/Integer";
        objectArray[2] = "\b\u0002\u000b!w-\u0003\r\u001an\n5\u0010\n\u0013'";
        objectArray[3] = "M\u001a\u00057<EF\u0015\u0014x]KM\u001e\u0010\"";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "+yBt\tvp\u007f\u0017\u0012X2@$EvC(qv\u0015-_IysU|Bqy N-3";
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOW)
    public void d(KB kB) {
        block52: {
            block51: {
                int n;
                SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                block50: {
                    boolean bl;
                    block49: {
                        block48: {
                            boolean bl2;
                            block47: {
                                block46: {
                                    block45: {
                                        block44: {
                                            block42: {
                                                systemConfigurationOrchestrator = kB.getThePlayer();
                                                try {
                                                    try {
                                                        if (!ApplicationLifecycleManager.U().Y() && !ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.FJ)) break block42;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw A5.a(customSystemException);
                                                    }
                                                    return;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw A5.a(customSystemException);
                                                }
                                            }
                                            try {
                                                block43: {
                                                    try {
                                                        try {
                                                            if (this.N || this.x()) break block43;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw A5.a(customSystemException);
                                                        }
                                                        if (!this.X.F(this)) break block44;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw A5.a(customSystemException);
                                                    }
                                                }
                                                this.Q();
                                                this.P();
                                                this.A();
                                                return;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw A5.a(customSystemException);
                                            }
                                        }
                                        try {
                                            if (!this.t.m((long)this.G.l() * 1000L)) {
                                                return;
                                            }
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw A5.a(customSystemException);
                                        }
                                        n = (int)(1000.0f / ((Double)this.Z.J()).floatValue());
                                        try {
                                            try {
                                                try {
                                                    if (this.x == null || this.x.r()) break block45;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw A5.a(customSystemException);
                                                }
                                                if (!this.x.F()) break block45;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw A5.a(customSystemException);
                                            }
                                            this.P();
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw A5.a(customSystemException);
                                        }
                                    }
                                    try {
                                        try {
                                            if (!this.X.z(this) && !this.X.O(this, this.j.s())) break block46;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw A5.a(customSystemException);
                                        }
                                        bl2 = true;
                                        break block47;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw A5.a(customSystemException);
                                    }
                                }
                                bl2 = false;
                            }
                            boolean bl3 = bl2;
                            try {
                                try {
                                    try {
                                        if (!this.w.s().booleanValue() || !bl3) break block48;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw A5.a(customSystemException);
                                    }
                                    if (!ApplicationLifecycleManager.X().Y()) break block48;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw A5.a(customSystemException);
                                }
                                bl = true;
                                break block49;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw A5.a(customSystemException);
                            }
                        }
                        bl = false;
                    }
                    boolean bl4 = bl;
                    try {
                        try {
                            if (!bl4 || !this.z.m(this.T)) break block50;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw A5.a(customSystemException);
                        }
                        this.o();
                        this.T = this.d.nextInt(1000 + n);
                        this.J();
                        this.z.m();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw A5.a(customSystemException);
                    }
                }
                try {
                    try {
                        try {
                            if (this.n != null) break block51;
                            if (this.v.v()) break block52;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw A5.a(customSystemException);
                        }
                        if (!this.F.m(this.V)) break block52;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw A5.a(customSystemException);
                    }
                    this.o();
                    this.V = this.d.nextInt(1000 + n);
                    this.v.E(this);
                    this.i(systemConfigurationOrchestrator);
                    this.F.m();
                    this.h.m();
                    break block52;
                }
                catch (CustomSystemException customSystemException) {
                    throw A5.a(customSystemException);
                }
            }
            try {
                if (this.h.m(100 + this.d.nextInt(100))) {
                    this.A();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw A5.a(customSystemException);
            }
        }
    }

    private static Field c(long l, long l2) {
        int n = A5.a(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            String string = B[n];
            int n2 = string.indexOf(8);
            Class clazz = A5.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = A5.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = A5.a(clazz3, string2, clazz2)) != null) {
                    A5.r[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = A5.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        A5.r[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = A5.b(261654532822337L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = A5.a(l, l2);
            object = r[n];
            try {
                if (!(object instanceof String)) break block2;
                A5.r[n] = clazz = Class.forName(B[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(A5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(A5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

