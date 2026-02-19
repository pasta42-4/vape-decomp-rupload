/*
 * Decompiled with CFR 0.152.
 */
package com.distributed.resources;

import a.XD;
import a.bE;
import a.hQ;
import a.hr;
import a.yC;
import com.analytics.computation.MetricsCalculationEngine;
import com.app.resource.ResourceLifecycleManager1789;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.data.transformation.DataEncodingTransformer;
import com.event.core.EventDispatchCoordinator1159;
import com.events.dispatch.EventDispatchController1581;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.rendering.GraphicalRenderingController249;
import com.hardware.management.HardwareYield;
import com.logging.core.LoggingServiceProvider;
import com.math.transformation.NumericTransformationEngine;
import com.network.protocol.CommunicationProtocolManager;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.scientific.measurement.PrecisionMeasurementCalibrator;
import com.security.constants.CipherConfigurationMode;
import com.security.crypto.CipherContextManager1101;
import com.security.crypto.CipherManager;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.crypto.CryptographicSecurityManager396;
import com.security.cryptography.CryptographicContextManager153;
import com.security.protocol.SecurityProtocolHandler;
import com.security.session.CryptographicSessionManager259;
import com.security.streaming.CryptographicDataStreamer;
import com.spatial.mapping.CoordinateMapper;
import com.system.configuration.ConfigurationManager;
import com.system.diagnostics.SystemDiagnosticAnalyzer;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.model.TransactionDescriptor;
import com.ui.events.UserInteractionEventDispatcher;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.theme.UserInterfaceThemeManager;
import com.web.query.WebQueryProcessor;
import java.awt.Color;
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
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DistributedResourceCoordinator
extends hQ {
    private int Y;
    private final DataEncodingTransformer OD;
    private static final long[] bb;
    private String O7;
    private static final String[] jb;
    private final GraphicalRenderingController249 D;
    private double V;
    private final GraphicalRenderEngine OK;
    private final HardwareYield b;
    private long Ou;
    private final long O9 = 2000L;
    private static final Map eb;
    private static final long ab;
    private MetricsCalculationEngine Oy;
    private boolean OG;
    private final yC Ox;
    private double L;
    private static boolean OH;
    private boolean OI;
    private static final Integer[] db;
    private final TransactionDescriptor OZ;
    private static final Object[] fb;

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DistributedResourceCoordinator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void lambda$new$0() {
        CoordinateMapper coordinateMapper = GraphicsBufferAllocator.b();
        this.V = coordinateMapper.I;
        this.L = this.W();
        this.j(true);
        this.OG = true;
        GraphicalRenderingController.d = this;
    }

    private static void i() {
        Object[] objectArray = fb;
        fb[0] = "!E\u000e";
        objectArray[1] = Integer.TYPE;
        DistributedResourceCoordinator.jb[1] = "java/lang/Integer";
        objectArray[2] = "\u001cZs_w$\u0017Ub\u0010\n<\u0004RkY";
        objectArray[3] = "SP\u001e\u0014avX_\u000f[\u0000xST\u000b\u0001";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\"`\u0003i6;~:\u0004\u0000>x\u001e3\u0010l8a/`\u0017;9\u0003't\u0015g<\u007f`0DeU";
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = DistributedResourceCoordinator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DistributedResourceCoordinator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void g() {
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DistributedResourceCoordinator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DistributedResourceCoordinator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void G() {
        block76: {
            block73: {
                double d2;
                double d3;
                CryptographicSecurityManager396 cryptographicSecurityManager396;
                block75: {
                    block74: {
                        CryptographicParameterGenerator cryptographicParameterGenerator;
                        block70: {
                            block69: {
                                Color color;
                                yC yC2;
                                Color color2;
                                yC yC3;
                                Color color3;
                                boolean bl;
                                Color color4;
                                boolean bl2;
                                double d4;
                                double d5;
                                block66: {
                                    Color color5;
                                    GraphicalRenderEngine graphicalRenderEngine;
                                    block63: {
                                        block62: {
                                            Color color6;
                                            boolean bl3;
                                            block61: {
                                                block60: {
                                                    Color color7;
                                                    block58: {
                                                        double d6;
                                                        double d7;
                                                        GraphicalRenderEngine graphicalRenderEngine2;
                                                        block57: {
                                                            try {
                                                                if (this.OG) {
                                                                    this.n();
                                                                    this.H();
                                                                }
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw DistributedResourceCoordinator.a(customSystemException);
                                                            }
                                                            cryptographicParameterGenerator = this.L(0.9);
                                                            double d8 = this.OK.K();
                                                            d5 = this.W() + 9.0 - d8 / 2.0;
                                                            double d9 = this.G();
                                                            this.getClass();
                                                            d4 = d9 + (double)(5.0f * 2.0f);
                                                            try {
                                                                this.OK.b(d4);
                                                                this.OK.M(d5);
                                                                if (!this.OD.Q()) break block57;
                                                                this.OK.a(66.0);
                                                                break block58;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw DistributedResourceCoordinator.a(customSystemException);
                                                            }
                                                        }
                                                        try {
                                                            graphicalRenderEngine2 = this.OK;
                                                            d7 = 68.0;
                                                            d6 = this.D.f() ? Math.min(this.D.w(), 25.0) : 0.0;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw DistributedResourceCoordinator.a(customSystemException);
                                                        }
                                                        graphicalRenderEngine2.a(d7 - d6);
                                                    }
                                                    bl2 = TemporalMetadataResolver.h.o().W().equals(this.OZ);
                                                    try {
                                                        color7 = bl2 ? M.j() : DistributedResourceCoordinator.M.g;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw DistributedResourceCoordinator.a(customSystemException);
                                                    }
                                                    color4 = color7;
                                                    try {
                                                        block59: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (this.s() && this.OD.o() == null) break block59;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw DistributedResourceCoordinator.a(customSystemException);
                                                                    }
                                                                    if (this.OD.o() == null) break block60;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw DistributedResourceCoordinator.a(customSystemException);
                                                                }
                                                                if (!this.OD.o().equals(this)) break block60;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw DistributedResourceCoordinator.a(customSystemException);
                                                            }
                                                        }
                                                        bl3 = true;
                                                        break block61;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw DistributedResourceCoordinator.a(customSystemException);
                                                    }
                                                }
                                                bl3 = false;
                                            }
                                            bl = bl3;
                                            try {
                                                color6 = bl2 ? M.X() : DistributedResourceCoordinator.M.w;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DistributedResourceCoordinator.a(customSystemException);
                                            }
                                            color3 = color6;
                                            try {
                                                try {
                                                    try {
                                                        graphicalRenderEngine = this.OK;
                                                        if (this.OD.Q() || !bl) break block62;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw DistributedResourceCoordinator.a(customSystemException);
                                                    }
                                                    if (bl2) break block62;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DistributedResourceCoordinator.a(customSystemException);
                                                }
                                                color5 = DistributedResourceCoordinator.M.n;
                                                break block63;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DistributedResourceCoordinator.a(customSystemException);
                                            }
                                        }
                                        color5 = color3;
                                    }
                                    graphicalRenderEngine.S(color5);
                                    this.OK.z(color4);
                                    if (this.OD.Q()) {
                                        block65: {
                                            double d10;
                                            double d11;
                                            double d12;
                                            block64: {
                                                Color color8;
                                                double d13;
                                                double d14;
                                                double d15;
                                                double d16;
                                                this.getClass();
                                                this.getClass();
                                                d12 = (double)(5.0f + 8.0f) * 1.5;
                                                try {
                                                    double d17 = this.G();
                                                    this.getClass();
                                                    this.Oy = new MetricsCalculationEngine(d17 + 5.0, this.W() + 2.0, d12 - 4.0, this.b() - 2.0);
                                                    this.b.N(true);
                                                    double d18 = this.G() + this.b.w();
                                                    this.getClass();
                                                    double d19 = d18 + 5.0;
                                                    this.getClass();
                                                    this.b.b(d19 + 8.0);
                                                    this.b.M(this.W());
                                                    this.b.w(this.b());
                                                    double d20 = this.b.G() + this.b.w();
                                                    this.getClass();
                                                    double d21 = d20 + 5.0;
                                                    this.getClass();
                                                    this.OK.b(d21 + (double)(8.0f / 2.0f));
                                                    this.Ox.N(false);
                                                    this.D.N(false);
                                                    double d22 = this.G();
                                                    this.getClass();
                                                    d16 = d22 + 5.0;
                                                    d15 = this.W() + 1.0;
                                                    double d23 = this.w();
                                                    this.getClass();
                                                    d14 = d23 - (double)(5.0f * 2.0f);
                                                    d13 = this.b() - 2.0;
                                                    color8 = bl2 ? M.j() : DistributedResourceCoordinator.M.g;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DistributedResourceCoordinator.a(customSystemException);
                                                }
                                                ConfigurationManager.S(d16, d15, d14, d13, color8);
                                                double d24 = this.G();
                                                this.getClass();
                                                double d25 = d24 + 5.0 - 0.2;
                                                double d26 = this.W() + 0.6;
                                                this.getClass();
                                                double d27 = 5.0 + this.b.w() * 2.0;
                                                this.getClass();
                                                ConfigurationManager.A(d25, d26, d27 + 8.0, this.b() - 1.6, DistributedResourceCoordinator.M.a);
                                                d11 = 7.0;
                                                d10 = 0.5;
                                                double d28 = d10 + 0.5;
                                                Color color9 = M.j();
                                                if (TemporalMetadataResolver.h.o().W().equals(this.OZ)) {
                                                    color9 = color9.darker().darker();
                                                }
                                                try {
                                                    if (!this.OZ.T()) break block64;
                                                    ConfigurationManager.A(2.0 + this.G() + d11, -1.0 + this.W() + d11, d12 - d11 * 2.0, this.b() - d11 * 1.8, color9);
                                                    ConfigurationManager.A(2.0 + this.G() + d11 + d10, -1.0 + this.W() + d11 + d10, d12 - (d11 + d10) * 2.0, this.b() - (d11 + d10) * 1.8, DistributedResourceCoordinator.M.a);
                                                    ConfigurationManager.A(2.0 + this.G() + d11 + d28, -1.0 + this.W() + d11 + d28, d12 - (d11 + d28) * 2.0, this.b() - (d11 + d28) * 1.8, color9);
                                                    break block65;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DistributedResourceCoordinator.a(customSystemException);
                                                }
                                            }
                                            ConfigurationManager.A(2.0 + this.G() + d11, -1.0 + this.W() + d11, d12 - d11 * 2.0, this.b() - d11 * 1.8, DistributedResourceCoordinator.M.S);
                                            ConfigurationManager.A(2.0 + this.G() + d11 + d10, -1.0 + this.W() + d11 + d10, d12 - (d11 + d10) * 2.0, this.b() - (d11 + d10) * 1.8, DistributedResourceCoordinator.M.a);
                                        }
                                        return;
                                    }
                                    try {
                                        try {
                                            this.b.N(false);
                                            this.Ox.N(true);
                                            if (!bl || this.Ox.s()) break block66;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DistributedResourceCoordinator.a(customSystemException);
                                        }
                                        double d29 = this.G();
                                        this.getClass();
                                        double d30 = d29 + 5.0 - 0.5;
                                        double d31 = this.W() + 0.5;
                                        double d32 = this.w();
                                        this.getClass();
                                        ConfigurationManager.S(d30, d31, d32 - (double)(5.0f * 2.0f) + 1.0, this.b() - 1.0, DistributedResourceCoordinator.M.S);
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DistributedResourceCoordinator.a(customSystemException);
                                    }
                                }
                                double d33 = this.G();
                                this.getClass();
                                double d34 = d33 + 5.0;
                                double d35 = this.W() + 1.0;
                                double d36 = this.w();
                                this.getClass();
                                ConfigurationManager.S(d34, d35, d36 - (double)(5.0f * 2.0f), this.b() - 2.0, color4);
                                if (this.O7 != null) {
                                    Color color10;
                                    double d37;
                                    double d38;
                                    String string;
                                    CryptographicParameterGenerator cryptographicParameterGenerator2;
                                    block68: {
                                        block67: {
                                            cryptographicParameterGenerator = this.L(0.75);
                                            try {
                                                try {
                                                    cryptographicParameterGenerator2 = cryptographicParameterGenerator;
                                                    string = this.O7;
                                                    d38 = d4;
                                                    d37 = d5;
                                                    if (!bl || !bl2) break block67;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DistributedResourceCoordinator.a(customSystemException);
                                                }
                                                color10 = color3;
                                                break block68;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DistributedResourceCoordinator.a(customSystemException);
                                            }
                                        }
                                        color10 = DistributedResourceCoordinator.M.c;
                                    }
                                    cryptographicParameterGenerator2.R(string, d38, d37, color10);
                                    this.OK.N(false);
                                } else {
                                    this.OK.N(true);
                                }
                                double d39 = this.G() + this.w();
                                this.getClass();
                                double d40 = d39 - (double)(5.0f * 3.0f);
                                try {
                                    yC3 = this.Ox;
                                    color2 = bl2 ? color3 : DistributedResourceCoordinator.M.Z;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DistributedResourceCoordinator.a(customSystemException);
                                }
                                try {
                                    yC3.H(color2);
                                    yC2 = this.Ox;
                                    color = bl2 ? color3 : DistributedResourceCoordinator.M.q;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DistributedResourceCoordinator.a(customSystemException);
                                }
                                yC2.R(color);
                                this.Ox.b(d40);
                                this.Ox.M(this.W() + 3.0);
                                int n = EventDispatchCoordinator1159.H(color4);
                                try {
                                    if (n <= 100) break block69;
                                    this.Ox.a(DistributedResourceCoordinator.M.E, new Color(0, 0, 0, 70));
                                    break block70;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DistributedResourceCoordinator.a(customSystemException);
                                }
                            }
                            this.Ox.a(DistributedResourceCoordinator.M.E, new Color(255, 255, 255, 40));
                        }
                        try {
                            try {
                                block71: {
                                    try {
                                        block72: {
                                            try {
                                                try {
                                                    if (this.Q().E()) break block71;
                                                    if (!this.s()) break block72;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DistributedResourceCoordinator.a(customSystemException);
                                                }
                                                if (!this.Ox.s()) break block71;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DistributedResourceCoordinator.a(customSystemException);
                                            }
                                        }
                                        if (!this.D.Q().F()) break block73;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DistributedResourceCoordinator.a(customSystemException);
                                    }
                                }
                                cryptographicSecurityManager396 = this.D.V;
                                double d41 = this.w();
                                this.getClass();
                                d3 = d41 - (double)(5.0f * 6.0f) - this.Ox.w();
                                if (this.O7 == null) break block74;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DistributedResourceCoordinator.a(customSystemException);
                            }
                            d2 = cryptographicParameterGenerator.D(this.O7);
                            break block75;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedResourceCoordinator.a(customSystemException);
                        }
                    }
                    d2 = this.OK.u();
                }
                cryptographicSecurityManager396.a(d3 - d2);
                this.getClass();
                this.D.b(d40 -= 5.0 + this.D.w());
                this.D.M(this.W() + 4.0);
                this.D.N(true);
                break block76;
            }
            this.D.N(false);
        }
    }

    private static int lambda$processMoving$5(DistributedResourceCoordinator distributedResourceCoordinator) {
        return (int)distributedResourceCoordinator.W();
    }

    private static Field g(long l, long l2) {
        int n = DistributedResourceCoordinator.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = DistributedResourceCoordinator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DistributedResourceCoordinator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DistributedResourceCoordinator.c(clazz3, string2, clazz2)) != null) {
                    DistributedResourceCoordinator.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DistributedResourceCoordinator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DistributedResourceCoordinator.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DistributedResourceCoordinator.f(262218486837936L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DistributedResourceCoordinator.e(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                DistributedResourceCoordinator.fb[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DistributedResourceCoordinator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private void c(int n) {
        double d2 = this.OD.N().W() + this.OD.N().b() * 2.0;
        ArrayList<DistributedResourceCoordinator> arrayList = new ArrayList<DistributedResourceCoordinator>();
        for (AbstractComputationKernel abstractComputationKernel : this.OD.w().A()) {
            try {
                if (!(abstractComputationKernel instanceof DistributedResourceCoordinator)) continue;
                arrayList.add((DistributedResourceCoordinator)abstractComputationKernel);
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedResourceCoordinator.a(customSystemException);
            }
        }
        arrayList.remove(this);
        arrayList.add(n, this);
        double d3 = 0.0;
        for (DistributedResourceCoordinator distributedResourceCoordinator : arrayList) {
            try {
                if (distributedResourceCoordinator.W() < d2) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedResourceCoordinator.a(customSystemException);
            }
            if (distributedResourceCoordinator.Q().equals(this.Q())) {
                d3 += distributedResourceCoordinator.b();
                continue;
            }
            distributedResourceCoordinator.M(d2 + d3);
            d3 += distributedResourceCoordinator.b();
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void L(boolean bl) {
        OH = bl;
    }

    public void f() {
        this.OI = true;
        this.Ou = System.currentTimeMillis();
    }

    public TransactionDescriptor Q() {
        return this.OZ;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d3' || c == 'E' || c == 'G' || c == '\u00ee') {
                field = DistributedResourceCoordinator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'G' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DistributedResourceCoordinator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00b5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public double z() {
        return 18.0;
    }

    private void H() {
        block20: {
            block21: {
                TransactionDescriptor transactionDescriptor;
                try {
                    if (SystemDiagnosticAnalyzer.A(CipherConfigurationMode.LEFT_CLICK.ordinal())) break block20;
                    this.OG = false;
                    this.j(false);
                    GraphicalRenderingController.d = null;
                    if (this.Y == -1) break block21;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceCoordinator.a(customSystemException);
                }
                XD xD = TemporalMetadataResolver.h.o();
                List<TransactionDescriptor> list = xD.T();
                try {
                    transactionDescriptor = this.Y < list.size() ? list.get(this.Y) : null;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceCoordinator.a(customSystemException);
                }
                TransactionDescriptor transactionDescriptor2 = transactionDescriptor;
                try {
                    if (transactionDescriptor2 != null) {
                        transactionDescriptor2.j(true);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceCoordinator.a(customSystemException);
                }
                list.remove(this.OZ);
                list.add(this.Y, this.OZ);
                this.OZ.j(true);
            }
            TemporalMetadataResolver.h.o().C();
            DataEncodingTransformer.l();
            this.Y = -1;
            return;
        }
        int n = -1;
        int n2 = -1;
        double d2 = this.b() * this.w();
        ArrayList<DistributedResourceCoordinator> arrayList = new ArrayList<DistributedResourceCoordinator>();
        for (AbstractComputationKernel abstractComputationKernel : this.OD.w().A()) {
            try {
                if (!(abstractComputationKernel instanceof DistributedResourceCoordinator)) continue;
                arrayList.add((DistributedResourceCoordinator)abstractComputationKernel);
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedResourceCoordinator.a(customSystemException);
            }
        }
        arrayList.sort(Comparator.comparingInt(DistributedResourceCoordinator::lambda$processMoving$5));
        for (DistributedResourceCoordinator distributedResourceCoordinator : arrayList) {
            try {
                ++n2;
                if (distributedResourceCoordinator.equals(this)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedResourceCoordinator.a(customSystemException);
            }
            double d3 = distributedResourceCoordinator.C().c(this.C());
            if (!(d3 >= d2 / 2.0)) continue;
            n = n2;
            break;
        }
        try {
            if (n == -1) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceCoordinator.a(customSystemException);
        }
        try {
            if (this.Y != n) {
                this.c(n);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceCoordinator.a(customSystemException);
        }
        this.Y = n;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    static TransactionDescriptor e(DistributedResourceCoordinator distributedResourceCoordinator) {
        return distributedResourceCoordinator.OZ;
    }

    private static void lambda$onTick$4(ContextualExecutionFramework contextualExecutionFramework) {
        contextualExecutionFramework.C().E(Collections.singletonList(161));
    }

    public static boolean K() {
        boolean bl = DistributedResourceCoordinator.y();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceCoordinator.a(customSystemException);
        }
        return false;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void n() {
        block13: {
            CoordinateMapper coordinateMapper;
            block14: {
                NumericTransformationEngine numericTransformationEngine;
                block12: {
                    block10: {
                        block11: {
                            coordinateMapper = GraphicsBufferAllocator.b();
                            double d2 = (double)coordinateMapper.I - this.V;
                            this.M(this.W() + d2);
                            numericTransformationEngine = this.F();
                            try {
                                try {
                                    if (!(this.W() < numericTransformationEngine.W())) break block10;
                                    if (!numericTransformationEngine.O()) break block11;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DistributedResourceCoordinator.a(customSystemException);
                                }
                                numericTransformationEngine.e(numericTransformationEngine.V() + 1.0);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DistributedResourceCoordinator.a(customSystemException);
                            }
                        }
                        this.M(numericTransformationEngine.W());
                        break block13;
                    }
                    try {
                        try {
                            if (!numericTransformationEngine.O() || !(this.W() > numericTransformationEngine.W() + numericTransformationEngine.Q() - this.b())) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedResourceCoordinator.a(customSystemException);
                        }
                        numericTransformationEngine.e(numericTransformationEngine.V() - 1.0);
                        this.M(numericTransformationEngine.W() + numericTransformationEngine.Q() - this.b());
                        break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceCoordinator.a(customSystemException);
                    }
                }
                try {
                    if (!(this.W() > numericTransformationEngine.W() + numericTransformationEngine.b() - this.b())) break block14;
                    this.M(numericTransformationEngine.W() + numericTransformationEngine.b() - this.b());
                    break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceCoordinator.a(customSystemException);
                }
            }
            this.V = coordinateMapper.I;
        }
    }

    public DistributedResourceCoordinator(DataEncodingTransformer dataEncodingTransformer, TransactionDescriptor transactionDescriptor) {
        long l = ab ^ 0x54960E432C03L;
        this.Ox = new yC((String)((Object)DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)28478, (long)(0x371061B79AEF6FE3L ^ l)), (long)-4076881078682239665L, (long)l)), 13.0, 13.0, 13.0, 13.0, null, null, null);
        this.b = new HardwareYield((String)((Object)DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)20274, (long)(0x2CC85766BF54CFE4L ^ l)), (long)-4076881078682239665L, (long)l)), 1.5);
        this.O7 = null;
        this.OI = false;
        this.O9 = 2000L;
        this.Ou = 0L;
        this.Y = -1;
        this.OD = dataEncodingTransformer;
        this.OZ = transactionDescriptor;
        this.D = new GraphicalRenderingController249(transactionDescriptor);
        this.Ox.N(new LoggingServiceProvider(this, transactionDescriptor));
        this.OK = new GraphicalRenderEngine(transactionDescriptor.T(), 64.0, 0.9, DistributedResourceCoordinator.M.n, DistributedResourceCoordinator.M.g, false, false);
        this.OK.l(new EventDispatchController1581(this));
        this.b.N(this::lambda$new$0);
        this.N(() -> this.lambda$new$1(dataEncodingTransformer, transactionDescriptor));
        this.Ox.w(12.0);
        this.Ox.T(8.5);
        this.Ox.x(8.0);
        this.Ox.X(8.0);
        this.Ox.u(true);
        this.Ox.y(3.5);
        this.o(this.OK, this.Ox, this.D, this.b);
        this.b.N(false);
    }

    private void lambda$openSettings$2(CipherManager cipherManager) {
        boolean bl;
        CipherManager cipherManager2;
        try {
            cipherManager2 = cipherManager;
            bl = !cipherManager.f();
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceCoordinator.a(customSystemException);
        }
        cipherManager2.N(bl);
        cipherManager.y(this.OZ.T());
    }

    @Override
    public void d() {
        block48: {
            DistributedResourceCoordinator distributedResourceCoordinator;
            long l;
            block52: {
                boolean bl;
                boolean bl2;
                block51: {
                    block50: {
                        String string;
                        block49: {
                            DistributedResourceCoordinator distributedResourceCoordinator2;
                            block46: {
                                block47: {
                                    int n;
                                    block44: {
                                        block45: {
                                            block40: {
                                                long l2;
                                                block41: {
                                                    DistributedResourceCoordinator distributedResourceCoordinator3;
                                                    block42: {
                                                        block43: {
                                                            l = ab ^ 0x54D430D34B7BL;
                                                            bl2 = DistributedResourceCoordinator.y();
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                n = this.D.I();
                                                                                if (!bl2) break block40;
                                                                                if (n == 0) break block41;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw DistributedResourceCoordinator.a(customSystemException);
                                                                            }
                                                                            distributedResourceCoordinator3 = this;
                                                                            if (!bl2) break block42;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw DistributedResourceCoordinator.a(customSystemException);
                                                                        }
                                                                        if (distributedResourceCoordinator3.O7 == null) break block43;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw DistributedResourceCoordinator.a(customSystemException);
                                                                    }
                                                                    n = this.O7.toLowerCase(Locale.ROOT).startsWith((String)((Object)DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)17790, (long)(0xAC45CE8FE8AA2DFL ^ l)), (long)-6911897327352260041L, (long)l))) ? 1 : 0;
                                                                    if (!bl2) break block40;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw DistributedResourceCoordinator.a(customSystemException);
                                                                }
                                                                if (n != 0) break block41;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw DistributedResourceCoordinator.a(customSystemException);
                                                            }
                                                        }
                                                        distributedResourceCoordinator3 = this;
                                                    }
                                                    distributedResourceCoordinator3.m((String)((Object)DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)1989, (long)(0x430D5A7AF9A16068L ^ l)), (long)-6911897327352260041L, (long)l)));
                                                }
                                                n = (l2 = System.currentTimeMillis() - 1780633218903L) == 0L ? 0 : (l2 < 0L ? -1 : 1);
                                            }
                                            try {
                                                try {
                                                    if (!bl2) break block44;
                                                    if (n <= 0) break block45;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DistributedResourceCoordinator.a(customSystemException);
                                                }
                                                TemporalMetadataResolver.h.U().x().forEach(DistributedResourceCoordinator::lambda$onTick$4);
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DistributedResourceCoordinator.a(customSystemException);
                                            }
                                        }
                                        try {
                                            distributedResourceCoordinator2 = this;
                                            if (!bl2) break block46;
                                            n = distributedResourceCoordinator2.OI ? 1 : 0;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DistributedResourceCoordinator.a(customSystemException);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (n == 0 || System.currentTimeMillis() <= this.Ou + this.O9) break block47;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DistributedResourceCoordinator.a(customSystemException);
                                            }
                                            this.O7 = null;
                                            this.OI = false;
                                            if (bl2) break block48;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DistributedResourceCoordinator.a(customSystemException);
                                        }
                                        AbstractComputationKernel.I(new String[3]);
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DistributedResourceCoordinator.a(customSystemException);
                                    }
                                }
                                distributedResourceCoordinator2 = this;
                            }
                            try {
                                try {
                                    string = distributedResourceCoordinator2.O7;
                                    if (!bl2) break block49;
                                    if (string == null) break block48;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DistributedResourceCoordinator.a(customSystemException);
                                }
                                string = this.O7.toLowerCase(Locale.ROOT);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DistributedResourceCoordinator.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                bl = string.startsWith((String)((Object)DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)24993, (long)(0x20C465C2C8910612L ^ l)), (long)-6911897327352260041L, (long)l)));
                                if (!bl2) break block50;
                                if (!bl) break block48;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DistributedResourceCoordinator.a(customSystemException);
                            }
                            bl = this.D.I();
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedResourceCoordinator.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (!bl2) break block51;
                                if (bl) break block48;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DistributedResourceCoordinator.a(customSystemException);
                            }
                            this.f();
                            distributedResourceCoordinator = this;
                            if (!bl2) break block52;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedResourceCoordinator.a(customSystemException);
                        }
                        bl = distributedResourceCoordinator.OZ.t().isEmpty();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceCoordinator.a(customSystemException);
                    }
                }
                try {
                    block53: {
                        try {
                            if (bl) break block53;
                            this.m((String)((Object)DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)4276, (long)(0x5B81E50AF3257710L ^ l)), (long)-6911897327352260041L, (long)l)));
                            if (bl2) break block48;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedResourceCoordinator.a(customSystemException);
                        }
                    }
                    distributedResourceCoordinator = this;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceCoordinator.a(customSystemException);
                }
            }
            distributedResourceCoordinator.m((String)((Object)DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)20429, (long)(0xCD582BDF6A8A87CL ^ l)), (long)-6911897327352260041L, (long)l)));
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DistributedResourceCoordinator.ab = MultiContainerRegistry.a(7128597303364817159L, -859119359873609422L, MethodHandles.lookup().lookupClass()).a(84588672285609L);
                DistributedResourceCoordinator.fb = new Object[5];
                DistributedResourceCoordinator.jb = new String[5];
                DistributedResourceCoordinator.i();
                DistributedResourceCoordinator.eb = new HashMap<K, V>(13);
                DistributedResourceCoordinator.L(true);
                var0 = DistributedResourceCoordinator.ab ^ 8828863308208L;
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
                var8_3 = new long[20];
                var5_4 = 0;
                var6_5 = "\u0091\u008a?\u000b\u0097\u00e9\u008f\u00ea_,\u001c\f+g^q\u00a4;\u00e6\u00da\u008f\u0098\u00e5\u001eu\u00f2\u00f8c\u00f6\u00a7p\u0002\u00e3'q\u00dc\u0010+\u00ed9U\u00af@\u00ae\u00ce\u00b2Mr\u00d6\u0093\u00ee+\u00a0\u00eaa\u00fag\u0005-\u00c3\u00b4\u0017\u0010\u00cf\u00f1\u00e2q\u0015[\u00ed'y\u00b1R\u00fa\u00a4\u00ee\u0080\u00feV3#u\u00dd\u00859r\u000f\u00d8\u00ba\u001e%*\u00bb\u009bt-S\u001d/\u00c9\u0097=Tl\u00f3\\\u00ce\u00c79\u00c5\u00d9\u00b1\u00dfXO[Y<\u00a1\u00cd\u00e9\u0011\u00e8<\u00bf'\u00e8\u00ca\u00abj.\u00d8\u0014\u00a1_\u00ca}\u00da\u00fb}\u0012\"\u00ec";
                var7_6 = "\u0091\u008a?\u000b\u0097\u00e9\u008f\u00ea_,\u001c\f+g^q\u00a4;\u00e6\u00da\u008f\u0098\u00e5\u001eu\u00f2\u00f8c\u00f6\u00a7p\u0002\u00e3'q\u00dc\u0010+\u00ed9U\u00af@\u00ae\u00ce\u00b2Mr\u00d6\u0093\u00ee+\u00a0\u00eaa\u00fag\u0005-\u00c3\u00b4\u0017\u0010\u00cf\u00f1\u00e2q\u0015[\u00ed'y\u00b1R\u00fa\u00a4\u00ee\u0080\u00feV3#u\u00dd\u00859r\u000f\u00d8\u00ba\u001e%*\u00bb\u009bt-S\u001d/\u00c9\u0097=Tl\u00f3\\\u00ce\u00c79\u00c5\u00d9\u00b1\u00dfXO[Y<\u00a1\u00cd\u00e9\u0011\u00e8<\u00bf'\u00e8\u00ca\u00abj.\u00d8\u0014\u00a1_\u00ca}\u00da\u00fb}\u0012\"\u00ec".length();
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
                    var6_5 = "\u00e1\u0010\u00af\u00af\\*\u00ec-\u00f1\u00d4\u00b1E\u009f@8\u00fb";
                    var7_6 = "\u00e1\u0010\u00af\u00af\\*\u00ec-\u00f1\u00d4\u00b1E\u009f@8\u00fb".length();
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
        DistributedResourceCoordinator.bb = var8_3;
        DistributedResourceCoordinator.db = new Integer[20];
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (jb[n4] != null) {
            return n4;
        }
        Object object = fb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 32;
                break;
            }
            case 1: {
                n3 = 48;
                break;
            }
            case 2: {
                n3 = 35;
                break;
            }
            case 3: {
                n3 = 23;
                break;
            }
            case 4: {
                n3 = 56;
                break;
            }
            case 5: {
                n3 = 62;
                break;
            }
            case 6: {
                n3 = 54;
                break;
            }
            case 7: {
                n3 = 46;
                break;
            }
            case 8: {
                n3 = 0;
                break;
            }
            case 9: {
                n3 = 58;
                break;
            }
            case 10: {
                n3 = 19;
                break;
            }
            case 11: {
                n3 = 26;
                break;
            }
            case 12: {
                n3 = 20;
                break;
            }
            case 13: {
                n3 = 50;
                break;
            }
            case 14: {
                n3 = 33;
                break;
            }
            case 15: {
                n3 = 9;
                break;
            }
            case 16: {
                n3 = 63;
                break;
            }
            case 17: {
                n3 = 52;
                break;
            }
            case 18: {
                n3 = 8;
                break;
            }
            case 19: {
                n3 = 34;
                break;
            }
            case 20: {
                n3 = 4;
                break;
            }
            case 21: {
                n3 = 44;
                break;
            }
            case 22: {
                n3 = 38;
                break;
            }
            case 23: {
                n3 = 24;
                break;
            }
            case 24: {
                n3 = 18;
                break;
            }
            case 25: {
                n3 = 61;
                break;
            }
            case 26: {
                n3 = 1;
                break;
            }
            case 27: {
                n3 = 16;
                break;
            }
            case 28: {
                n3 = 31;
                break;
            }
            case 29: {
                n3 = 12;
                break;
            }
            case 30: {
                n3 = 41;
                break;
            }
            case 31: {
                n3 = 53;
                break;
            }
            case 32: {
                n3 = 59;
                break;
            }
            case 33: {
                n3 = 13;
                break;
            }
            case 34: {
                n3 = 21;
                break;
            }
            case 35: {
                n3 = 60;
                break;
            }
            case 36: {
                n3 = 17;
                break;
            }
            case 37: {
                n3 = 10;
                break;
            }
            case 38: {
                n3 = 47;
                break;
            }
            case 39: {
                n3 = 3;
                break;
            }
            case 40: {
                n3 = 27;
                break;
            }
            case 41: {
                n3 = 2;
                break;
            }
            case 42: {
                n3 = 25;
                break;
            }
            case 43: {
                n3 = 42;
                break;
            }
            case 44: {
                n3 = 57;
                break;
            }
            case 45: {
                n3 = 28;
                break;
            }
            case 46: {
                n3 = 6;
                break;
            }
            case 47: {
                n3 = 15;
                break;
            }
            case 48: {
                n3 = 30;
                break;
            }
            case 49: {
                n3 = 51;
                break;
            }
            case 50: {
                n3 = 49;
                break;
            }
            case 51: {
                n3 = 39;
                break;
            }
            case 52: {
                n3 = 40;
                break;
            }
            case 53: {
                n3 = 29;
                break;
            }
            case 54: {
                n3 = 43;
                break;
            }
            case 55: {
                n3 = 37;
                break;
            }
            case 56: {
                n3 = 45;
                break;
            }
            case 57: {
                n3 = 5;
                break;
            }
            case 58: {
                n3 = 36;
                break;
            }
            case 59: {
                n3 = 22;
                break;
            }
            case 60: {
                n3 = 55;
                break;
            }
            case 61: {
                n3 = 7;
                break;
            }
            case 62: {
                n3 = 11;
                break;
            }
            default: {
                n3 = 14;
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
        DistributedResourceCoordinator.jb[n4] = new String(cArray);
        return n4;
    }

    public static boolean y() {
        return OH;
    }

    public void m(String string) {
        try {
            if (string == null) {
                this.f();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceCoordinator.a(customSystemException);
        }
        this.O7 = string.toUpperCase();
    }

    public void R() {
        NumericTransformationEngine numericTransformationEngine;
        boolean bl;
        yC yC2;
        GraphicalRenderEngine1082 graphicalRenderEngine1082;
        yC yC3;
        ResourceLifecycleManager1789 resourceLifecycleManager1789;
        CryptographicSecurityManager396 cryptographicSecurityManager396;
        long l;
        block9: {
            CallSite callSite;
            yC yC4;
            yC yC5;
            block11: {
                block10: {
                    l = ab ^ 0x14F7D950725EL;
                    String string = this.OZ.T();
                    CallSite callSite2 = DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)29316, (long)(0x7743D0E5F9CEAC0AL ^ l)), (long)-7408067191562476782L, (long)l);
                    double d2 = this.OD.w();
                    this.getClass();
                    cryptographicSecurityManager396 = new CryptographicSecurityManager396(string, (String)((Object)callSite2), d2 - 5.0 - 20.0, 0.9, DistributedResourceCoordinator.M.c, true);
                    resourceLifecycleManager1789 = new ResourceLifecycleManager1789(this, this.OZ.T(), cryptographicSecurityManager396);
                    resourceLifecycleManager1789.o(48);
                    resourceLifecycleManager1789.N(false);
                    resourceLifecycleManager1789.I(false);
                    resourceLifecycleManager1789.O().H((String)((Object)DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)22507, (long)(0x328545C666ED8969L ^ l)), (long)-7408067191562476782L, (long)l)));
                    yC3 = new yC((String)((Object)DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)19108, (long)(0x660CC7CC28CA9423L ^ l)), (long)-7408067191562476782L, (long)l)), 5.0, 5.0, 5.0, 5.0, null, null, null);
                    yC3.N(() -> this.lambda$openSettings$2(resourceLifecycleManager1789));
                    yC3.R(DistributedResourceCoordinator.M.Z);
                    graphicalRenderEngine1082 = new GraphicalRenderEngine1082(this.OD.w(), this.OD.F().b());
                    graphicalRenderEngine1082.d().f((String)((Object)DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)1801, (long)(0x4C82996F4AED598FL ^ l)), (long)-7408067191562476782L, (long)l)));
                    yC2 = null;
                    try {
                        try {
                            yC yC6;
                            if (this.OZ.p() == null) break block9;
                            yC5 = yC6;
                            yC4 = yC6;
                            if (!this.OZ.p().V()) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedResourceCoordinator.a(customSystemException);
                        }
                        callSite = DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)2063, (long)(0x4D06F5482F1D5686L ^ l)), (long)-7408067191562476782L, (long)l);
                        break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceCoordinator.a(customSystemException);
                    }
                }
                callSite = DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)12639, (long)(0x17DB7FB813EFC8L ^ l)), (long)-7408067191562476782L, (long)l);
            }
            yC5((String)((Object)callSite), 5.0, 5.0, 5.0, 5.0, null, null, null);
            yC2 = yC4;
            yC2.H(Color.WHITE);
            yC2.f(this::lambda$openSettings$3);
        }
        yC yC7 = yC2;
        WebQueryProcessor webQueryProcessor = new WebQueryProcessor(this, this.OD.w(), 26.0, cryptographicSecurityManager396, yC3, resourceLifecycleManager1789, yC7);
        webQueryProcessor.d().f((String)((Object)DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)2347, (long)(0x407150D5C8E57BEL ^ l)), (long)-7408067191562476782L, (long)l)));
        SecurityProtocolHandler securityProtocolHandler = new SecurityProtocolHandler();
        try {
            securityProtocolHandler.T(graphicalRenderEngine1082.w());
            securityProtocolHandler.w(18.0);
            webQueryProcessor.n(securityProtocolHandler, new Object[0]);
            webQueryProcessor.n(cryptographicSecurityManager396, new Object[0]);
            if (yC7 != null) {
                webQueryProcessor.n(yC7, new Object[0]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceCoordinator.a(customSystemException);
        }
        webQueryProcessor.n(resourceLifecycleManager1789, new Object[0]);
        webQueryProcessor.n(yC3, new Object[0]);
        CryptographicSessionManager259 cryptographicSessionManager259 = new CryptographicSessionManager259(this.OD, this.OZ);
        cryptographicSessionManager259.S(true);
        cryptographicSessionManager259.w(20.0);
        graphicalRenderEngine1082.n(webQueryProcessor, new Object[0]);
        graphicalRenderEngine1082.n(cryptographicSessionManager259, new Object[0]);
        graphicalRenderEngine1082.n(new bE(0.0, 2.0), new Object[0]);
        graphicalRenderEngine1082.n(new CryptographicDataStreamer(this.OZ, 105.0, 86.0), new Object[0]);
        graphicalRenderEngine1082.A();
        if (this.OZ.W()) {
            // empty if block
        }
        if (bl = false) {
            double d3 = this.OD.w();
            this.getClass();
            numericTransformationEngine = new GraphicalRenderEngine1082(d3 - 5.0, 15.0);
            numericTransformationEngine.d().o(false);
            numericTransformationEngine.d().y(false);
            numericTransformationEngine.d().f((String)((Object)DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)6516, (long)(0x3C2DF6837EC647F9L ^ l)), (long)-7408067191562476782L, (long)l)));
            numericTransformationEngine.i(false);
            graphicalRenderEngine1082.o(numericTransformationEngine);
            UserInterfaceThemeManager userInterfaceThemeManager = new UserInterfaceThemeManager((String)((Object)DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)18476, (long)(0x4E76A96021EE16A3L ^ l)), (long)-7408067191562476782L, (long)l)), 8.0f, 8.0f, DistributedResourceCoordinator.M.Y);
            numericTransformationEngine.o(userInterfaceThemeManager);
            CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)31395, (long)(0xD45DE3AB324A420L ^ l)), (long)-7408067191562476782L, (long)l)));
            cryptographicContextManager153.B(DistributedResourceCoordinator.M.Y);
            cryptographicContextManager153.T(numericTransformationEngine.w());
            numericTransformationEngine.o(cryptographicContextManager153);
            hr hr2 = new hr((String)((Object)DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)2654, (long)(0x689D73B5078854D2L ^ l)), (long)-7408067191562476782L, (long)l)), DistributedResourceCoordinator.M.Y);
            hr2.q(false);
            hr2.A(DistributedResourceCoordinator.M.c);
            hr2.Q(DistributedResourceCoordinator.M.u, DistributedResourceCoordinator.M.Y);
            hr2.Q(DistributedResourceCoordinator.M.Y, DistributedResourceCoordinator.M.u);
            hr2.w(10.0);
            hr2.T(25.0);
            numericTransformationEngine.n(hr2, DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)18682, (long)(0x75BFAC79AF68167FL ^ l)), (long)-7408067191562476782L, (long)l));
        }
        numericTransformationEngine = GraphicalRenderingController.v(this.OD.F(), graphicalRenderEngine1082, PrecisionMeasurementCalibrator.class);
        this.OD.Y((CipherContextManager1101)numericTransformationEngine);
        this.OD.N().b((String)((Object)DistributedResourceCoordinator.c("z", (int)DistributedResourceCoordinator.b("m", (int)12453, (long)(0x4859273B7D07EE2FL ^ l)), (long)-7408067191562476782L, (long)l)), false);
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        block16: {
            block15: {
                block14: {
                    try {
                        if (this.OD.Q()) {
                            super.Z(userInteractionEventDispatcher);
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceCoordinator.a(customSystemException);
                    }
                    try {
                        try {
                            try {
                                if (this.OD.o() == null || !this.OD.o().equals(this)) break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DistributedResourceCoordinator.a(customSystemException);
                            }
                            if (this.C().O(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY())) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedResourceCoordinator.a(customSystemException);
                        }
                        this.Ox.l();
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceCoordinator.a(customSystemException);
                    }
                }
                try {
                    if (!userInteractionEventDispatcher.getAction().equals((Object)CipherConfigurationMode.LEFT_CLICK)) break block15;
                    TemporalMetadataResolver.h.o().A(this.OZ);
                    break block16;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceCoordinator.a(customSystemException);
                }
            }
            try {
                if (userInteractionEventDispatcher.getAction().equals((Object)CipherConfigurationMode.RIGHT_CLICK)) {
                    this.OZ.C();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedResourceCoordinator.a(customSystemException);
            }
        }
    }

    private void lambda$new$1(DataEncodingTransformer dataEncodingTransformer, TransactionDescriptor transactionDescriptor) {
        block9: {
            boolean bl;
            TransactionDescriptor transactionDescriptor2;
            block11: {
                block10: {
                    try {
                        if (!dataEncodingTransformer.Q()) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceCoordinator.a(customSystemException);
                    }
                    try {
                        try {
                            try {
                                if (!this.Oy.T(GraphicsBufferAllocator.b()) || TemporalMetadataResolver.h.o().W().equals(transactionDescriptor)) break block9;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DistributedResourceCoordinator.a(customSystemException);
                            }
                            transactionDescriptor2 = transactionDescriptor;
                            if (transactionDescriptor.T()) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedResourceCoordinator.a(customSystemException);
                        }
                        bl = true;
                        break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceCoordinator.a(customSystemException);
                    }
                }
                bl = false;
            }
            transactionDescriptor2.W(bl);
            transactionDescriptor.j(true);
            GraphicalRenderingController.j();
        }
    }

    public boolean g() {
        return TemporalMetadataResolver.h.o().W().equals(this.OZ);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x47B4;
        if (db[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yM", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DistributedResourceCoordinator.db[n2] = n3;
        }
        return db[n2];
    }

    @Override
    public boolean f() {
        boolean bl;
        block8: {
            block6: {
                try {
                    block7: {
                        try {
                            try {
                                if (!super.f()) break block6;
                                if (this.OD.Q()) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DistributedResourceCoordinator.a(customSystemException);
                            }
                            if (!this.OZ.T()) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedResourceCoordinator.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceCoordinator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private CompletableFuture lambda$openSettings$3() {
        return CommunicationProtocolManager.L(this.OZ.p().i());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method h(long l, long l2) {
        int n = DistributedResourceCoordinator.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n];
                int n3 = string2.indexOf(8);
                clazz3 = DistributedResourceCoordinator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DistributedResourceCoordinator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DistributedResourceCoordinator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        DistributedResourceCoordinator.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DistributedResourceCoordinator.f(262218486837936L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DistributedResourceCoordinator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DistributedResourceCoordinator.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DistributedResourceCoordinator.f(262218486837936L, 0L);
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

    @Override
    public double e() {
        return 110.0;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DistributedResourceCoordinator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DistributedResourceCoordinator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

