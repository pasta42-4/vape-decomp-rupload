/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.core.computation;

import com.analytics.computation.MetricsCalculationEngine;
import com.app.access.ResourceAccessController2684;
import com.app.routing.RequestRoutingController;
import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.math.strategy.MathematicalOperationStrategy;
import com.math.transformation.NumericTransformationEngine;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.auth.AuthenticationStrategy;
import com.security.configuration.SecurityEnumRegistry;
import com.security.constants.CipherConfigurationMode;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.encoding.SecureMessageEncoder;
import com.security.session.CipherSessionManager;
import com.spatial.mapping.CoordinateMapper;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.ConfigurationResolver;
import com.system.diagnostics.SystemDiagnosticAnalyzer;
import com.system.resilience.ResiliencyEventProcessor;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.events.UserInteractionEventDispatcher;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Color;
import java.awt.Point;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class AbstractComputationKernel
implements MathematicalOperationStrategy {
    private double m;
    private boolean o;
    private List<DataProcessingProtocol> X;
    private double O;
    private static final Object[] yb;
    private static String[] Q;
    private SecureMessageEncoder G;
    public final float y = 5.0f;
    private static final String[] zb;
    public final float d = 8.0f;
    private double p;
    private boolean q;
    private String s;
    private long U;
    private final List<ResourceAccessController2684> H;
    private ConfigurationProfileResolver C;
    private boolean l;
    private boolean a;
    private double K;
    private boolean r;
    private ResiliencyEventProcessor S;
    private static final Map ib;
    protected boolean T;
    private List<RequestRoutingController> u;
    private static final long[] gb;
    private List<DataProcessingProtocol> g;
    private boolean Z;
    private double w;
    private static final long cb;
    private double e;
    private final ArrayList<AbstractComputationKernel> k;
    private boolean c;
    private boolean h;
    private long P;
    private static final Integer[] hb;
    private NumericTransformationEngine J;
    private UserInteractionEventDispatcher I;
    private boolean f;
    private double z;
    @Nullable
    private ConfigurationResolver j;
    public final double W = 0.15;
    private long A;
    private Color x;
    private boolean N;

    public List<DataProcessingProtocol> Z() {
        return this.X;
    }

    public void Q() {
        ConfigurationManager.H((float)this.G(), (float)this.W(), 1.0f, (float)this.b(), Color.MAGENTA);
        ConfigurationManager.H((float)this.G(), (float)this.W(), (float)this.w(), 1.0f, Color.MAGENTA);
        ConfigurationManager.H((float)this.G() + (float)this.w(), (float)this.W(), 1.0f, (float)this.b(), Color.MAGENTA);
        ConfigurationManager.H((float)this.G(), (float)this.W() + (float)this.b(), (float)this.w(), 1.0f, Color.MAGENTA);
    }

    @Override
    public double W() {
        return this.e;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'k' || c == '\u00ba' || c == '\u00e6' || c == '\u00cc') {
                field = AbstractComputationKernel.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'k' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AbstractComputationKernel.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'A' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ec' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public boolean G() {
        CoordinateMapper coordinateMapper = GraphicsBufferAllocator.b();
        return this.C().T(coordinateMapper);
    }

    private static void ab() {
        Object[] objectArray = yb;
        yb[0] = "iVm";
        objectArray[1] = Integer.TYPE;
        AbstractComputationKernel.zb[1] = "java/lang/Integer";
        objectArray[2] = "!J-\u007fo&*E<0\u0012>9B5y";
        objectArray[3] = "\u000f07~i1\u0004?&1\b?\u000f4\"k";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "W\u0013=M\u000e\n\u0003\u000fb,\u0015\u001fl\u0019}\u0010\u0011\u000b\f\u000b:W~]\u0011\u0007aO\f\u0005\n\u0006o,";
    }

    public void S() {
        try {
            if (!this.H()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
        ConfigurationManager.A(this.G(), this.W(), this.w(), this.m(), this.l());
    }

    @Override
    public void b(double d2) {
        this.z = d2;
    }

    public void h(RequestRoutingController requestRoutingController) {
        this.u.add(requestRoutingController);
    }

    @Override
    public void T(double d2) {
        try {
            this.p = d2;
            if (this.w == -1.0) {
                this.w = d2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
    }

    public ResiliencyEventProcessor E() {
        return this.S;
    }

    public void t() {
        this.U();
        for (AbstractComputationKernel abstractComputationKernel : this.A()) {
            try {
                if (!abstractComputationKernel.f()) continue;
                abstractComputationKernel.t();
            }
            catch (CustomSystemException customSystemException) {
                throw AbstractComputationKernel.d(customSystemException);
            }
        }
    }

    private static Method d(long l, long l2) {
        int n = AbstractComputationKernel.a(l, l2);
        Object object = yb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = zb[n];
                int n3 = string2.indexOf(8);
                clazz3 = AbstractComputationKernel.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AbstractComputationKernel.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AbstractComputationKernel.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        AbstractComputationKernel.yb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AbstractComputationKernel.b(220416334510086L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AbstractComputationKernel.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AbstractComputationKernel.yb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AbstractComputationKernel.b(220416334510086L, 0L);
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

    private static CallSite g(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ht" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void i(boolean bl) {
        this.q = bl;
    }

    @Override
    public boolean f() {
        boolean bl;
        block11: {
            block10: {
                block9: {
                    try {
                        try {
                            if (this.k() == null || !this.k().w()) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AbstractComputationKernel.d(customSystemException);
                        }
                        return false;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AbstractComputationKernel.d(customSystemException);
                    }
                }
                boolean bl2 = true;
                if (this.C != null) {
                    bl2 = this.C.A();
                }
                try {
                    try {
                        if (!this.l || !bl2) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AbstractComputationKernel.d(customSystemException);
                    }
                    bl = true;
                    break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw AbstractComputationKernel.d(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static String[] J() {
        return Q;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AbstractComputationKernel.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AbstractComputationKernel.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public boolean e() {
        return this.Z;
    }

    public List<AbstractComputationKernel> A() {
        return this.k;
    }

    public boolean H() {
        return this.q;
    }

    public void a(RequestRoutingController requestRoutingController) {
        this.u.remove(requestRoutingController);
    }

    public void N(boolean bl) {
        this.l = bl;
    }

    public void R(boolean bl) {
        this.f = bl;
    }

    public void P(double d2) {
        this.m = d2;
        this.O = d2;
    }

    public void w() {
        this.U = 0L;
        this.P = 0L;
        this.S.N(false);
        GraphicalRenderingController.v = null;
    }

    public double Y() {
        double d2;
        double d3;
        double d4 = this.b();
        if (this instanceof NumericTransformationEngine && (d3 = Math.max(d4, d2 = ((NumericTransformationEngine)this).Q())) > d2) {
            d4 = d2;
        }
        return d4;
    }

    public void W() {
        this.g.clear();
    }

    public void o(SecureMessageEncoder secureMessageEncoder) {
        this.G = secureMessageEncoder;
    }

    public void l(boolean bl) {
        this.T = bl;
    }

    @Override
    public double b() {
        double d2;
        try {
            d2 = this.a ? this.O : Math.max(this.O, this.z());
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
        return d2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ht" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void G(ResourceAccessController2684 resourceAccessController2684) {
        this.H.add(resourceAccessController2684);
    }

    @Nullable
    public ConfigurationResolver R() {
        return this.j;
    }

    @Override
    public double w() {
        double d2;
        try {
            d2 = this.c ? this.p : Math.max(this.p, this.e());
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
        return d2;
    }

    public CryptographicParameterGenerator J() {
        CryptographicParameterGenerator cryptographicParameterGenerator;
        try {
            cryptographicParameterGenerator = this.j != null ? this.j.R(1.0f, false) : TemporalMetadataResolver.h.W().q();
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
        return cryptographicParameterGenerator;
    }

    public AbstractComputationKernel() {
        long l = cb ^ 0x5EC325D26938L;
        this.w = -1.0;
        this.m = -1.0;
        this.l = true;
        this.g = new CopyOnWriteArrayList<DataProcessingProtocol>();
        this.X = new CopyOnWriteArrayList<DataProcessingProtocol>();
        this.u = new ArrayList<RequestRoutingController>();
        this.H = new ArrayList<ResourceAccessController2684>();
        this.k = new ArrayList();
        this.y = 5.0f;
        this.d = 8.0f;
        this.W = 0.15;
        this.q = true;
        this.o = true;
        this.h = false;
        this.Z = true;
        this.K = 5.0;
        this.s = AbstractComputationKernel.g("\u00ec", (int)AbstractComputationKernel.a("o", (int)13179, (long)(0x53EFB20C576AFEAEL ^ l)), (long)-2243016655125762737L, (long)l);
        this.T = false;
    }

    public void F(boolean bl) {
        this.Z = bl;
    }

    public void N() {
        block27: {
            block25: {
                try {
                    if (!GraphicalRenderingController.B(this)) break block25;
                    this.g();
                    if (this.r) break block25;
                }
                catch (CustomSystemException customSystemException) {
                    throw AbstractComputationKernel.d(customSystemException);
                }
                this.r = true;
                for (ResourceAccessController2684 object : this.H) {
                    object.M(true);
                }
            }
            this.l(true);
            boolean bl = GraphicalRenderingController.K.sJ.s();
            for (AbstractComputationKernel abstractComputationKernel : this.A()) {
                block26: {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (!abstractComputationKernel.f() || !abstractComputationKernel.G()) continue;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AbstractComputationKernel.d(customSystemException);
                                            }
                                            if (!GraphicalRenderingController.B(abstractComputationKernel)) continue;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AbstractComputationKernel.d(customSystemException);
                                        }
                                        if (!(this instanceof NumericTransformationEngine)) break block26;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AbstractComputationKernel.d(customSystemException);
                                    }
                                    if (((NumericTransformationEngine)this).Q() == null) break block26;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AbstractComputationKernel.d(customSystemException);
                                }
                                if (!((NumericTransformationEngine)this).Q().G()) break block26;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AbstractComputationKernel.d(customSystemException);
                            }
                            if (!(abstractComputationKernel instanceof SecureMessageEncoder)) {
                                continue;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AbstractComputationKernel.d(customSystemException);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AbstractComputationKernel.d(customSystemException);
                    }
                }
                try {
                    abstractComputationKernel.N();
                    if (abstractComputationKernel.E() == null || !bl) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw AbstractComputationKernel.d(customSystemException);
                }
                bl = false;
            }
            try {
                try {
                    if (!bl || this.S == null) break block27;
                }
                catch (CustomSystemException customSystemException) {
                    throw AbstractComputationKernel.d(customSystemException);
                }
                this.h();
            }
            catch (CustomSystemException customSystemException) {
                throw AbstractComputationKernel.d(customSystemException);
            }
        }
    }

    @Override
    public double G() {
        return this.z;
    }

    public void Z(double d2) {
        this.K = d2;
    }

    public CryptographicParameterGenerator L(double d2) {
        CryptographicParameterGenerator cryptographicParameterGenerator;
        try {
            cryptographicParameterGenerator = this.j != null ? this.j.R((float)d2, false) : TemporalMetadataResolver.h.W().S(d2);
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
        return cryptographicParameterGenerator;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        cb = MultiContainerRegistry.a(5185310535453180014L, 3140994186504313224L, MethodHandles.lookup().lookupClass()).a(121636941396948L);
        yb = new Object[5];
        zb = new String[5];
        AbstractComputationKernel.ab();
        ib = new HashMap(13);
        long l = cb ^ 0x44F26A95AFDBL;
        AbstractComputationKernel.I(null);
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
        String string = "\u0086\u0094\u00ae\u00adP[\b\u00cfv\u00111-\u00a8\u0096\u00b0\u009b";
        int n2 = "\u0086\u0094\u00ae\u00adP[\b\u00cfv\u00111-\u00a8\u0096\u00b0\u009b".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        gb = lArray;
        hb = new Integer[2];
    }

    public static void I(String[] stringArray) {
        Q = stringArray;
    }

    public boolean b() {
        return this.o;
    }

    public MetricsCalculationEngine C() {
        return new MetricsCalculationEngine(this.G(), this.W(), this.w(), this.b());
    }

    public CipherSessionManager V() {
        CipherSessionManager cipherSessionManager;
        NumericTransformationEngine numericTransformationEngine;
        block12: {
            try {
                if (this.G != null) {
                    return this.G.V();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AbstractComputationKernel.d(customSystemException);
            }
            numericTransformationEngine = this.F();
            try {
                if (numericTransformationEngine instanceof CipherSessionManager) {
                    return (CipherSessionManager)numericTransformationEngine;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AbstractComputationKernel.d(customSystemException);
            }
            try {
                try {
                    if (numericTransformationEngine != null || !(this instanceof CipherSessionManager)) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw AbstractComputationKernel.d(customSystemException);
                }
                return (CipherSessionManager)this;
            }
            catch (CustomSystemException customSystemException) {
                throw AbstractComputationKernel.d(customSystemException);
            }
        }
        try {
            cipherSessionManager = numericTransformationEngine != null ? numericTransformationEngine.V() : null;
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
        return cipherSessionManager;
    }

    public void J(boolean bl) {
        this.c = bl;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AbstractComputationKernel.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void S(boolean bl) {
        this.a = bl;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (zb[n4] != null) {
            return n4;
        }
        Object object = yb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 20;
                break;
            }
            case 1: {
                n3 = 9;
                break;
            }
            case 2: {
                n3 = 62;
                break;
            }
            case 3: {
                n3 = 50;
                break;
            }
            case 4: {
                n3 = 16;
                break;
            }
            case 5: {
                n3 = 34;
                break;
            }
            case 6: {
                n3 = 6;
                break;
            }
            case 7: {
                n3 = 55;
                break;
            }
            case 8: {
                n3 = 4;
                break;
            }
            case 9: {
                n3 = 35;
                break;
            }
            case 10: {
                n3 = 53;
                break;
            }
            case 11: {
                n3 = 38;
                break;
            }
            case 12: {
                n3 = 19;
                break;
            }
            case 13: {
                n3 = 43;
                break;
            }
            case 14: {
                n3 = 37;
                break;
            }
            case 15: {
                n3 = 0;
                break;
            }
            case 16: {
                n3 = 54;
                break;
            }
            case 17: {
                n3 = 17;
                break;
            }
            case 18: {
                n3 = 47;
                break;
            }
            case 19: {
                n3 = 22;
                break;
            }
            case 20: {
                n3 = 11;
                break;
            }
            case 21: {
                n3 = 63;
                break;
            }
            case 22: {
                n3 = 51;
                break;
            }
            case 23: {
                n3 = 18;
                break;
            }
            case 24: {
                n3 = 10;
                break;
            }
            case 25: {
                n3 = 24;
                break;
            }
            case 26: {
                n3 = 5;
                break;
            }
            case 27: {
                n3 = 8;
                break;
            }
            case 28: {
                n3 = 56;
                break;
            }
            case 29: {
                n3 = 32;
                break;
            }
            case 30: {
                n3 = 27;
                break;
            }
            case 31: {
                n3 = 2;
                break;
            }
            case 32: {
                n3 = 45;
                break;
            }
            case 33: {
                n3 = 58;
                break;
            }
            case 34: {
                n3 = 1;
                break;
            }
            case 35: {
                n3 = 60;
                break;
            }
            case 36: {
                n3 = 30;
                break;
            }
            case 37: {
                n3 = 13;
                break;
            }
            case 38: {
                n3 = 52;
                break;
            }
            case 39: {
                n3 = 44;
                break;
            }
            case 40: {
                n3 = 59;
                break;
            }
            case 41: {
                n3 = 12;
                break;
            }
            case 42: {
                n3 = 21;
                break;
            }
            case 43: {
                n3 = 39;
                break;
            }
            case 44: {
                n3 = 61;
                break;
            }
            case 45: {
                n3 = 15;
                break;
            }
            case 46: {
                n3 = 25;
                break;
            }
            case 47: {
                n3 = 14;
                break;
            }
            case 48: {
                n3 = 26;
                break;
            }
            case 49: {
                n3 = 7;
                break;
            }
            case 50: {
                n3 = 41;
                break;
            }
            case 51: {
                n3 = 57;
                break;
            }
            case 52: {
                n3 = 48;
                break;
            }
            case 53: {
                n3 = 36;
                break;
            }
            case 54: {
                n3 = 33;
                break;
            }
            case 55: {
                n3 = 28;
                break;
            }
            case 56: {
                n3 = 40;
                break;
            }
            case 57: {
                n3 = 46;
                break;
            }
            case 58: {
                n3 = 23;
                break;
            }
            case 59: {
                n3 = 31;
                break;
            }
            case 60: {
                n3 = 49;
                break;
            }
            case 61: {
                n3 = 3;
                break;
            }
            case 62: {
                n3 = 29;
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
        AbstractComputationKernel.zb[n4] = new String(cArray);
        return n4;
    }

    public boolean v() {
        return this.h;
    }

    public CryptographicParameterGenerator t(double d2) {
        CryptographicParameterGenerator cryptographicParameterGenerator;
        try {
            cryptographicParameterGenerator = this.j != null ? this.j.R((float)d2, true) : TemporalMetadataResolver.h.W().u(d2, false);
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
        return cryptographicParameterGenerator;
    }

    public double m() {
        return this.b();
    }

    public void J(AbstractComputationKernel abstractComputationKernel) {
        this.A().remove(abstractComputationKernel);
    }

    public void m(Color color) {
        long l = cb ^ 0x59975438369BL;
        ConfigurationManager.A(this.G(), this.W(), this.w(), this.b(), color);
        this.L(0.75).R(String.format((String)((Object)AbstractComputationKernel.g("\u00ec", (int)AbstractComputationKernel.a("o", (int)26350, (long)(0x29E3BAF7AA8EF499L ^ l)), (long)-4648784193514638612L, (long)l)), this.G(), this.W(), this.w(), this.b()), this.G(), this.W(), Color.WHITE);
    }

    public void S(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        try {
            if (userInteractionEventDispatcher.equals(this.I)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
        try {
            this.I = userInteractionEventDispatcher;
            if (userInteractionEventDispatcher.isCancelled()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
        for (DataProcessingProtocol iterator2 : this.G()) {
            try {
                if (!iterator2.o(new Point(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY()))) continue;
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw AbstractComputationKernel.d(customSystemException);
            }
        }
        ArrayList<AbstractComputationKernel> arrayList = new ArrayList<AbstractComputationKernel>(this.A());
        Collections.reverse(arrayList);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            AbstractComputationKernel abstractComputationKernel;
            block37: {
                abstractComputationKernel = (AbstractComputationKernel)iterator.next();
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (!abstractComputationKernel.f() || !abstractComputationKernel.s()) continue;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AbstractComputationKernel.d(customSystemException);
                                    }
                                    if (!(this instanceof NumericTransformationEngine)) break block37;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AbstractComputationKernel.d(customSystemException);
                                }
                                if (((NumericTransformationEngine)this).Q() == null) break block37;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AbstractComputationKernel.d(customSystemException);
                            }
                            if (!((NumericTransformationEngine)this).Q().s()) break block37;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AbstractComputationKernel.d(customSystemException);
                        }
                        if (!(abstractComputationKernel instanceof SecureMessageEncoder)) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AbstractComputationKernel.d(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AbstractComputationKernel.d(customSystemException);
                }
            }
            try {
                if (!abstractComputationKernel.e()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AbstractComputationKernel.d(customSystemException);
            }
            try {
                try {
                    abstractComputationKernel.S(userInteractionEventDispatcher);
                    if (abstractComputationKernel instanceof SecureMessageEncoder || this.h) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw AbstractComputationKernel.d(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw AbstractComputationKernel.d(customSystemException);
            }
        }
        this.Z(userInteractionEventDispatcher);
        for (DataProcessingProtocol dataProcessingProtocol : this.G()) {
            SecurityEnumRegistry securityEnumRegistry;
            Point point;
            DataProcessingProtocol dataProcessingProtocol2;
            block39: {
                block40: {
                    block38: {
                        try {
                            dataProcessingProtocol2 = dataProcessingProtocol;
                            point = new Point(SystemDiagnosticAnalyzer.M(), SystemDiagnosticAnalyzer.k());
                            if (userInteractionEventDispatcher.getAction() != CipherConfigurationMode.LEFT_CLICK) break block38;
                            securityEnumRegistry = SecurityEnumRegistry.LEFT_CLICK;
                            break block39;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AbstractComputationKernel.d(customSystemException);
                        }
                    }
                    try {
                        if (userInteractionEventDispatcher.getAction() != CipherConfigurationMode.RIGHT_CLICK) break block40;
                        securityEnumRegistry = SecurityEnumRegistry.RIGHT_CLICK;
                        break block39;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AbstractComputationKernel.d(customSystemException);
                    }
                }
                try {
                    securityEnumRegistry = userInteractionEventDispatcher.getAction() == CipherConfigurationMode.MIDDLE_CLICK ? SecurityEnumRegistry.MIDDLE_CLICK : null;
                }
                catch (CustomSystemException customSystemException) {
                    throw AbstractComputationKernel.d(customSystemException);
                }
            }
            dataProcessingProtocol2.B(point, securityEnumRegistry);
        }
    }

    public String q() {
        return this.s;
    }

    public void j(DataProcessingProtocol dataProcessingProtocol) {
        this.g.remove(dataProcessingProtocol);
    }

    private static CustomSystemException d(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public List<ResourceAccessController2684> L() {
        return this.H;
    }

    public void L(ConfigurationProfileResolver configurationProfileResolver) {
        try {
            this.C = configurationProfileResolver;
            configurationProfileResolver.O(this);
            if (configurationProfileResolver.d() != null) {
                this.g(configurationProfileResolver.d());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
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

    @Override
    public void w(double d2) {
        try {
            this.O = d2;
            if (this.m == -1.0) {
                this.m = d2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
    }

    public void Q(NumericTransformationEngine numericTransformationEngine) {
        this.J = numericTransformationEngine;
    }

    public boolean c() {
        return this.f;
    }

    public void O(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        this.R(userInteractionEventDispatcher);
        for (AbstractComputationKernel abstractComputationKernel : this.A()) {
            try {
                if (!abstractComputationKernel.f()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AbstractComputationKernel.d(customSystemException);
            }
            abstractComputationKernel.O(userInteractionEventDispatcher);
        }
    }

    public boolean o() {
        return this.N;
    }

    public Color l() {
        try {
            if (this.x == null) {
                this.x = AbstractComputationKernel.M.W;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
        return this.x;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AbstractComputationKernel.a(l, l2);
            object = yb[n];
            try {
                if (!(object instanceof String)) break block2;
                AbstractComputationKernel.yb[n] = clazz = Class.forName(zb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public double F() {
        return this.m;
    }

    public void k() {
        CopyOnWriteArrayList<AbstractComputationKernel> copyOnWriteArrayList = new CopyOnWriteArrayList<AbstractComputationKernel>(this.A());
        for (AbstractComputationKernel abstractComputationKernel : copyOnWriteArrayList) {
            try {
                if (!abstractComputationKernel.b()) continue;
                this.J(abstractComputationKernel);
            }
            catch (CustomSystemException customSystemException) {
                throw AbstractComputationKernel.d(customSystemException);
            }
        }
    }

    public void K() {
        this.l(false);
        if (this.r) {
            this.r = false;
            this.j();
            for (ResourceAccessController2684 resourceAccessController2684 : this.H) {
                resourceAccessController2684.M(false);
            }
        }
    }

    public void c() {
        this.d();
        List<AbstractComputationKernel> list = this.A();
        int n = list.size();
        try {
            for (int i = 0; i < n; ++i) {
                list.get(i).c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
    }

    public void r() {
    }

    public boolean A() {
        return this.q;
    }

    public AbstractComputationKernel Q(Color color) {
        this.x = color;
        return this;
    }

    public void o(String string) {
        this.s = string;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2D0B;
        if (hb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = gb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])ib.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    ib.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/ht", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AbstractComputationKernel.hb[n2] = n3;
        }
        return hb[n2];
    }

    public AbstractComputationKernel g(@Nullable String string) {
        try {
            if (string == null) {
                this.S = null;
                return this;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
        try {
            if (string.isEmpty()) {
                return this;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
        this.S = new ResiliencyEventProcessor(this, string);
        return this;
    }

    public double y() {
        return this.w;
    }

    public void j(boolean bl) {
        this.N = bl;
    }

    public void r(CipherSessionManager cipherSessionManager, CipherSessionManager cipherSessionManager2) {
        this.g.add(new AuthenticationStrategy(this, cipherSessionManager, cipherSessionManager2));
    }

    public AbstractComputationKernel i(ResiliencyEventProcessor resiliencyEventProcessor) {
        this.S = resiliencyEventProcessor;
        return this;
    }

    public void E() {
        block19: {
            try {
                block20: {
                    try {
                        try {
                            try {
                                this.e();
                                if (this.U == 0L || this.A != this.U) break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AbstractComputationKernel.d(customSystemException);
                            }
                            if (!this.s()) break block20;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AbstractComputationKernel.d(customSystemException);
                        }
                        if (this.f()) break block19;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AbstractComputationKernel.d(customSystemException);
                    }
                }
                this.w();
            }
            catch (CustomSystemException customSystemException) {
                throw AbstractComputationKernel.d(customSystemException);
            }
        }
        try {
            if (this.S != null) {
                this.S.r(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
        try {
            this.A = this.U;
            this.G();
            if (this instanceof NumericTransformationEngine) {
                ((NumericTransformationEngine)this).B();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
        for (AbstractComputationKernel abstractComputationKernel : this.A()) {
            try {
                try {
                    if (!abstractComputationKernel.f() || this.c()) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw AbstractComputationKernel.d(customSystemException);
                }
                abstractComputationKernel.E();
            }
            catch (CustomSystemException customSystemException) {
                throw AbstractComputationKernel.d(customSystemException);
            }
        }
    }

    public List<DataProcessingProtocol> G() {
        return this.g;
    }

    public ConfigurationProfileResolver k() {
        return this.C;
    }

    public void n(boolean bl) {
        this.h = bl;
    }

    public void h() {
        try {
            if (this.P == 0L) {
                this.P = System.currentTimeMillis();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AbstractComputationKernel.d(customSystemException);
        }
        this.U += System.currentTimeMillis() - this.P;
        if (this.U >= 2000L) {
            CoordinateMapper coordinateMapper = GraphicsBufferAllocator.b();
            this.S.b(coordinateMapper.X);
            this.S.M(coordinateMapper.I);
            this.S.N(true);
            GraphicalRenderingController.v = this.S;
        }
    }

    public void R(ResourceAccessController2684 resourceAccessController2684) {
        this.H.remove(resourceAccessController2684);
    }

    public List<RequestRoutingController> g() {
        return this.u;
    }

    @Override
    public void M(double d2) {
        this.e = d2;
    }

    private static Field c(long l, long l2) {
        int n = AbstractComputationKernel.a(l, l2);
        Object object = yb[n];
        if (object instanceof String) {
            String string = zb[n];
            int n2 = string.indexOf(8);
            Class clazz = AbstractComputationKernel.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AbstractComputationKernel.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AbstractComputationKernel.a(clazz3, string2, clazz2)) != null) {
                    AbstractComputationKernel.yb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AbstractComputationKernel.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AbstractComputationKernel.yb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AbstractComputationKernel.b(220416334510086L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public double J() {
        return this.K;
    }

    public void o(AbstractComputationKernel ... abstractComputationKernelArray) {
        Collections.addAll(this.A(), abstractComputationKernelArray);
    }

    public void k(boolean bl) {
        this.o = bl;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AbstractComputationKernel.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    protected void e() {
        block3: {
            try {
                if (!this.s() || this.G()) break block3;
            }
            catch (CustomSystemException customSystemException) {
                throw AbstractComputationKernel.d(customSystemException);
            }
            this.K();
            for (AbstractComputationKernel abstractComputationKernel : this.A()) {
                abstractComputationKernel.K();
            }
        }
    }

    public boolean s() {
        return this.T;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = AbstractComputationKernel.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AbstractComputationKernel.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void s() {
    }

    public NumericTransformationEngine F() {
        return this.J;
    }

    public void C(@Nullable ConfigurationResolver configurationResolver) {
        this.j = configurationResolver;
    }

    public void P(DataProcessingProtocol dataProcessingProtocol) {
        this.X.add(dataProcessingProtocol);
    }

    public void Y(double d2) {
        this.w = d2;
        this.p = d2;
    }

    public void l(DataProcessingProtocol dataProcessingProtocol) {
        this.g.add(dataProcessingProtocol);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AbstractComputationKernel.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(AbstractComputationKernel.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

