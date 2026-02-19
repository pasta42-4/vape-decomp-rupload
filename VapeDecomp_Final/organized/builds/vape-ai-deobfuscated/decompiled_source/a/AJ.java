/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.Ne;
import a.RJ;
import a._Y;
import a.a;
import a.kg;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.compression.core.DataCompressionHandler;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.flow.DataFlowAnalyzer;
import com.event.management.EventDispatchCoordinator2087;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.color.ColorCompositionEngine;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.protocol.MultiProtocolContextManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.execution.ConditionalExecutionManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import com.util.numeric.NumericFormattingUtility;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class AJ
extends ContextualExecutionFramework {
    private double e;
    private static final Map B;
    private static final long[] m;
    private final AdaptiveRenderingEngine v;
    private static final String[] K;
    private final AuthenticationStateTracker X;
    private final AuthenticationStateTracker n;
    private final AuthenticationStateTracker o;
    private final NumericFormattingUtility Z;
    private static final Object[] F;
    private final AuthenticationStateTracker z;
    private final AuthenticationStateTracker G;
    private static final Integer[] x;
    private final AdaptiveRenderingEngine V;
    private final Map<TransactionOrchestrator1017, RJ> j;
    private final AuthenticationStateTracker d;
    private final AuthenticationStateTracker A;
    private final NumericFormattingUtility t;
    private final AuthenticationStateTracker l;
    private static final long h;
    private final AuthenticationStateTracker r;
    private List<TransactionOrchestrator1017> w;
    private final AuthenticationStateTracker b;
    private final AuthenticationStateTracker L;
    private final NumericFormattingUtility N;
    private final AdaptiveRenderingEngine R;

    public AJ() {
        long l = h ^ 0xA42BFA4B035L;
        super(a.cs((int)AJ.a("v", (int)7894, (long)(0x1448382D6C0B1D4DL ^ l))), (int)AJ.a("v", (int)26592, (long)(0x72F8A98D70F8E47CL ^ l)), RecursiveNodeGraph.z);
        this.b = AuthenticationStateTracker.w(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)16926, (long)(0x41F41A77BFF4C18AL ^ l)), (long)1598837132188064454L, (long)l)), false);
        this.X = AuthenticationStateTracker.w(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)1250, (long)(0x10F5380EC2DD0762L ^ l)), (long)1598837132188064454L, (long)l)), false);
        this.l = AuthenticationStateTracker.w(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)10998, (long)(0x9700D7AA39BA96FL ^ l)), (long)1598837132188064454L, (long)l)), true);
        this.r = AuthenticationStateTracker.w(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)5132, (long)(0x25E5618E180D179BL ^ l)), (long)1598837132188064454L, (long)l)), false);
        this.o = AuthenticationStateTracker.w(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)31979, (long)(0xAA70D5A05B47F6CL ^ l)), (long)1598837132188064454L, (long)l)), false);
        this.A = AuthenticationStateTracker.w(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)8361, (long)(0x353BCAB53345A32AL ^ l)), (long)1598837132188064454L, (long)l)), false);
        this.d = AuthenticationStateTracker.w(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)14910, (long)(0x5D55B369174E39A1L ^ l)), (long)1598837132188064454L, (long)l)), false);
        this.G = AuthenticationStateTracker.w(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)22144, (long)(0xD50E173A62A5502L ^ l)), (long)1598837132188064454L, (long)l)), false);
        this.z = AuthenticationStateTracker.w(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)9721, (long)(0x3DCEF85DD0A4267DL ^ l)), (long)1598837132188064454L, (long)l)), false);
        this.L = AuthenticationStateTracker.w(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)4759, (long)(0x787C770FC6F6110DL ^ l)), (long)1598837132188064454L, (long)l)), false);
        this.n = AuthenticationStateTracker.R(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)29397, (long)(0x2E59AC21B43EF145L ^ l)), (long)1598837132188064454L, (long)l)), false, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)11572, (long)(0x2AC21425556FAEA7L ^ l)), (long)1598837132188064454L, (long)l)));
        this.t = NumericFormattingUtility.P(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)471, (long)(0x77C03552DDDC824AL ^ l)), (long)1598837132188064454L, (long)l)), (String)((Object)AJ.c("L", (int)AJ.a("v", (int)17782, (long)(0x34183CDDB2F046F7L ^ l)), (long)1598837132188064454L, (long)l)), "", 0.0, 0.0, 32.0, 256.0);
        this.N = NumericFormattingUtility.P(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)9855, (long)(0x7353B57A75E9A5E9L ^ l)), (long)1598837132188064454L, (long)l)), (String)((Object)AJ.c("L", (int)AJ.a("v", (int)30645, (long)(0x5F1E5EF8DC37430L ^ l)), (long)1598837132188064454L, (long)l)), "", 0.0, 0.0, 32.0, 256.0);
        this.Z = NumericFormattingUtility.P(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)20524, (long)(0x14E4C2D9D93B53B9L ^ l)), (long)1598837132188064454L, (long)l)), (String)((Object)AJ.c("L", (int)AJ.a("v", (int)11853, (long)(0x3939CB1118AA2DDCL ^ l)), (long)1598837132188064454L, (long)l)), "", 0.0, 0.0, 32.0, 256.0);
        this.V = AdaptiveRenderingEngine.C(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)25371, (long)(0x2CE61A337638E085L ^ l)), (long)1598837132188064454L, (long)l)), new Color(0, 150, 255, 255));
        this.R = AdaptiveRenderingEngine.C(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)12119, (long)(0x13A9AEBB69D4ACC5L ^ l)), (long)1598837132188064454L, (long)l)), new Color(255, 154, 0));
        this.v = AdaptiveRenderingEngine.C(this, (String)((Object)AJ.c("L", (int)AJ.a("v", (int)12976, (long)(0x5F1EE0027EF0B128L ^ l)), (long)1598837132188064454L, (long)l)), new Color(255, 255, 255));
        this.j = new HashMap<TransactionOrchestrator1017, RJ>();
        this.l.l(this.b, this.A, this.V);
        this.r.l(this.d, this.R);
        this.o.l(this.G, this.v);
        this.A.l(this.t);
        this.d.l(this.N);
        this.G.l(this.Z);
        this.N(this.z, this.L, this.n, this.l, this.b, this.A, this.t, this.V, this.o, this.G, this.Z, this.v, this.r, this.d, this.N, this.R);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AJ.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d3' || c == '\u00a5' || c == '\u00ea' || c == '\u00e3') {
                field = AJ.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AJ.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'L' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void Q(SystemConfigurationOrchestrator systemConfigurationOrchestrator, CryptographicTransformer cryptographicTransformer, Color color, float f, float f2, double d2, double d3, double d4, double d5, boolean bl) {
        boolean bl2;
        boolean bl3;
        block31: {
            double d6;
            double d7;
            double d8;
            double d9;
            double d10;
            block29: {
                block30: {
                    block28: {
                        d10 = cryptographicTransformer.b() + (cryptographicTransformer.F() - cryptographicTransformer.b()) * (double)f2 - d2;
                        d9 = cryptographicTransformer.q() + (cryptographicTransformer.V() - cryptographicTransformer.q()) * (double)f2 - d3;
                        d8 = cryptographicTransformer.I() + (cryptographicTransformer.B() - cryptographicTransformer.I()) * (double)f2 - d4;
                        bl3 = false;
                        bl2 = false;
                        bl3 = Ne.h.k(3042);
                        bl2 = Ne.h.k(2896);
                        try {
                            GL11.glBlendFunc((int)770, (int)771);
                            if (!bl3) {
                                Ne.h.y(3042);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AJ.a(customSystemException);
                        }
                        try {
                            if (bl2) {
                                Ne.h.z(2896);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AJ.a(customSystemException);
                        }
                        GL11.glBlendFunc((int)770, (int)771);
                        Ne.h.y(2848);
                        Ne.h.z(3553);
                        d7 = 0.0;
                        d6 = 0.0;
                        if (GeometryCalculator.C() >= 23) {
                            double d11;
                            double d12;
                            kg kg2;
                            block27: {
                                block26: {
                                    kg2 = new kg(0.0, 0.0, 1.0);
                                    try {
                                        if (GeometryCalculator.C() < 35) break block26;
                                        kg2.j((float)(-Math.toRadians(ApplicationLifecycleManager.r().r())));
                                        kg2.n((float)(-Math.toRadians(ApplicationLifecycleManager.r().k())));
                                        break block27;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AJ.a(customSystemException);
                                    }
                                }
                                kg2.j((float)(-Math.toRadians(systemConfigurationOrchestrator.S())));
                                kg2.n((float)(-Math.toRadians(systemConfigurationOrchestrator.q())));
                            }
                            d7 = kg2.R();
                            try {
                                d12 = d5;
                                d11 = GeometryCalculator.C() >= 35 ? kg2.L() - (double)systemConfigurationOrchestrator.E() : kg2.L();
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AJ.a(customSystemException);
                            }
                            d5 = d12 + d11;
                            d6 = kg2.U();
                            try {
                                if (GeometryCalculator.C() < 35 || ApplicationLifecycleManager.N().V() == 0) break block28;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AJ.a(customSystemException);
                            }
                            DataCompressionHandler dataCompressionHandler = ApplicationLifecycleManager.U().v();
                            double d13 = NumericComputationEngine1131.b() - dataCompressionHandler.w().X();
                            double d14 = NumericComputationEngine1131.S() - dataCompressionHandler.w().F();
                            double d15 = NumericComputationEngine1131.n() - dataCompressionHandler.w().f();
                            d10 += d13;
                            d9 += d14;
                            d8 += d15;
                        }
                    }
                    d9 += (double)cryptographicTransformer.E();
                    try {
                        try {
                            if (!ConfigurationManager.U()) break block29;
                            if (!bl) break block30;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AJ.a(customSystemException);
                        }
                        DataFlowAnalyzer.N(d7, d5, d6, d10, d9, d8, f + f * 0.5f, Color.black);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AJ.a(customSystemException);
                    }
                }
                DataFlowAnalyzer.N(d7, d5, d6, d10, d9, d8, f, color);
                break block31;
            }
            try {
                if (bl) {
                    GL11.glLineWidth((float)(f + f * 0.5f));
                    GL11.glBegin((int)1);
                    GraphicsBufferAllocator.Y(Color.black);
                    GL11.glVertex3d((double)d7, (double)d5, (double)d6);
                    GL11.glVertex3d((double)d10, (double)d9, (double)d8);
                    GL11.glEnd();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AJ.a(customSystemException);
            }
            GL11.glLineWidth((float)f);
            GL11.glBegin((int)1);
            GraphicsBufferAllocator.Y(color);
            GL11.glVertex3d((double)d7, (double)d5, (double)d6);
            GL11.glVertex3d((double)d10, (double)d9, (double)d8);
            GL11.glEnd();
        }
        try {
            if (bl2) {
                Ne.h.y(2896);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AJ.a(customSystemException);
        }
        try {
            if (!bl3) {
                Ne.h.z(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AJ.a(customSystemException);
        }
        Ne.h.y(3553);
        Ne.h.z(2848);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AJ.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AJ.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void O(SystemConfigurationOrchestrator systemConfigurationOrchestrator, ConnectionConfigurationResolver connectionConfigurationResolver) {
        for (Object e : connectionConfigurationResolver.L()) {
            MultiProtocolContextManager multiProtocolContextManager;
            TransactionOrchestrator1017 transactionOrchestrator1017;
            block83: {
                float f;
                CryptographicTransformer cryptographicTransformer;
                block80: {
                    block81: {
                        boolean bl;
                        block79: {
                            block77: {
                                block78: {
                                    block73: {
                                        block76: {
                                            block75: {
                                                block74: {
                                                    block71: {
                                                        block72: {
                                                            cryptographicTransformer = new CryptographicTransformer(e);
                                                            try {
                                                                if (!cryptographicTransformer.B(ReflectionMetadataResolver.Ut)) {
                                                                    continue;
                                                                }
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw AJ.a(customSystemException);
                                                            }
                                                            try {
                                                                if (cryptographicTransformer.equals(systemConfigurationOrchestrator)) {
                                                                    continue;
                                                                }
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw AJ.a(customSystemException);
                                                            }
                                                            transactionOrchestrator1017 = new TransactionOrchestrator1017(cryptographicTransformer);
                                                            multiProtocolContextManager = ConditionalExecutionManager.a(transactionOrchestrator1017, systemConfigurationOrchestrator);
                                                            try {
                                                                if (multiProtocolContextManager.m()) {
                                                                    continue;
                                                                }
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw AJ.a(customSystemException);
                                                            }
                                                            try {
                                                                try {
                                                                    if (!this.z.s().booleanValue() && multiProtocolContextManager.K()) {
                                                                        continue;
                                                                    }
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw AJ.a(customSystemException);
                                                                }
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw AJ.a(customSystemException);
                                                            }
                                                            try {
                                                                if (multiProtocolContextManager.I()) {
                                                                    continue;
                                                                }
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw AJ.a(customSystemException);
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (!this.b.s().booleanValue()) break block71;
                                                                        if (!this.X.s().booleanValue()) break block72;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw AJ.a(customSystemException);
                                                                    }
                                                                    if (!multiProtocolContextManager.E()) {
                                                                        continue;
                                                                    }
                                                                    break block71;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw AJ.a(customSystemException);
                                                                }
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw AJ.a(customSystemException);
                                                            }
                                                        }
                                                        try {
                                                            if (!TemporalMetadataResolver.h.a().G(cryptographicTransformer, false)) {
                                                                continue;
                                                            }
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw AJ.a(customSystemException);
                                                        }
                                                    }
                                                    f = (float)multiProtocolContextManager.u();
                                                    try {
                                                        try {
                                                            try {
                                                                if (!cryptographicTransformer.B(ReflectionMetadataResolver.Pr)) break block73;
                                                                if (!this.l.s().booleanValue()) continue;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw AJ.a(customSystemException);
                                                            }
                                                            if (!this.A.s().booleanValue()) break block74;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw AJ.a(customSystemException);
                                                        }
                                                        if ((double)f < this.t.G()) continue;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw AJ.a(customSystemException);
                                                    }
                                                    try {
                                                        if ((double)f > this.t.q()) {
                                                            continue;
                                                        }
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw AJ.a(customSystemException);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (!multiProtocolContextManager.Y() || !TemporalMetadataResolver.h.j().b.s().booleanValue()) break block75;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw AJ.a(customSystemException);
                                                    }
                                                    this.j.put(transactionOrchestrator1017, new RJ(multiProtocolContextManager, TemporalMetadataResolver.h.j().u.L(), null));
                                                    continue;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AJ.a(customSystemException);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (!multiProtocolContextManager.E() || !TemporalMetadataResolver.h.g().a.s().booleanValue()) break block76;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AJ.a(customSystemException);
                                                }
                                                this.j.put(transactionOrchestrator1017, new RJ(multiProtocolContextManager, TemporalMetadataResolver.h.g().F.L(), null));
                                                continue;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AJ.a(customSystemException);
                                            }
                                        }
                                        this.j.put(transactionOrchestrator1017, new RJ(multiProtocolContextManager, this.V.L(), null));
                                        continue;
                                    }
                                    bl = false;
                                    try {
                                        try {
                                            if (GeometryCalculator.C() < 37) break block77;
                                            if (cryptographicTransformer.B(ReflectionMetadataResolver.Ef)) break block78;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AJ.a(customSystemException);
                                        }
                                        if (!cryptographicTransformer.B(ReflectionMetadataResolver.o)) break block79;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AJ.a(customSystemException);
                                    }
                                }
                                bl = true;
                                break block79;
                            }
                            try {
                                if (!cryptographicTransformer.B(ReflectionMetadataResolver.tL) && !cryptographicTransformer.B(ReflectionMetadataResolver.o)) break block79;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AJ.a(customSystemException);
                            }
                            bl = true;
                        }
                        try {
                            try {
                                try {
                                    if (!bl) break block80;
                                    if (!this.r.s().booleanValue()) continue;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AJ.a(customSystemException);
                                }
                                if (!this.d.s().booleanValue()) break block81;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AJ.a(customSystemException);
                            }
                            if ((double)f < this.N.G()) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AJ.a(customSystemException);
                        }
                        try {
                            if ((double)f > this.N.q()) {
                                continue;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AJ.a(customSystemException);
                        }
                    }
                    this.j.put(transactionOrchestrator1017, new RJ(multiProtocolContextManager, this.R.L(), null));
                    continue;
                }
                try {
                    try {
                        if (!this.o.s().booleanValue() || cryptographicTransformer.B(ReflectionMetadataResolver.o)) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AJ.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AJ.a(customSystemException);
                }
                try {
                    if (!this.G.s().booleanValue()) break block83;
                    if ((double)f < this.Z.G()) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw AJ.a(customSystemException);
                }
                try {
                    if ((double)f > this.Z.q()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AJ.a(customSystemException);
                }
            }
            this.j.put(transactionOrchestrator1017, new RJ(multiProtocolContextManager, this.v.L(), null));
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                AJ.h = MultiContainerRegistry.a(8791136644761900462L, -263219442765587421L, MethodHandles.lookup().lookupClass()).a(224193018245330L);
                AJ.F = new Object[5];
                AJ.K = new String[5];
                AJ.a();
                AJ.B = new HashMap<K, V>(13);
                var0 = AJ.h ^ 87479281063789L;
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
                var6_5 = "]\u00f8\u0016\u008b\u00b1\u00da\u00d4B\n\u0083\u0090M\u00f0\u00af\u0010\u00ef\u00fa\u009c1\u00b2K&\u00dai\u0089\u0095\u00ab\u00b4\u009e\u00bb@R\u00e6c\u00d9\r\u00a6z%\u00c3@\u00a0\u0098\u00aex\u00ed:\u009c\u009bL\u00ed0\u0014(2\u00dfw\u0098.\u0016\u00de\u008ay+r^\u00c8\u000e\u0093\u00d7\u00bd,'\u0085\u00022\u00ff\u0014E\u00e5\u00ae\u009c\u00b9\u0093\u00f3]$\u00e8\u00d6`\u0082$\u00a6<\u00ca\u0012t\u00df\u001d\u00a4\u00c5Qn\u0082by\u00a0w\u0083\u008e\u00a7?\u00b8]\u0018MPN\u00b2&\u00a3\u0012\u00a9\u00c1YL\u00b0\u009f\u00169l\u00c1w\t\"N\u00e0\u009fV\u0091\u00d0'\u00946\u00e07\u0002\u00c7\u00db3\u0091\u00e9\u0092d\u00bf\u0015\u00dbV8\u00cd\u00b2\u00cb\u00ee\u00d0Q\u00b5e\u00d8";
                var7_6 = "]\u00f8\u0016\u008b\u00b1\u00da\u00d4B\n\u0083\u0090M\u00f0\u00af\u0010\u00ef\u00fa\u009c1\u00b2K&\u00dai\u0089\u0095\u00ab\u00b4\u009e\u00bb@R\u00e6c\u00d9\r\u00a6z%\u00c3@\u00a0\u0098\u00aex\u00ed:\u009c\u009bL\u00ed0\u0014(2\u00dfw\u0098.\u0016\u00de\u008ay+r^\u00c8\u000e\u0093\u00d7\u00bd,'\u0085\u00022\u00ff\u0014E\u00e5\u00ae\u009c\u00b9\u0093\u00f3]$\u00e8\u00d6`\u0082$\u00a6<\u00ca\u0012t\u00df\u001d\u00a4\u00c5Qn\u0082by\u00a0w\u0083\u008e\u00a7?\u00b8]\u0018MPN\u00b2&\u00a3\u0012\u00a9\u00c1YL\u00b0\u009f\u00169l\u00c1w\t\"N\u00e0\u009fV\u0091\u00d0'\u00946\u00e07\u0002\u00c7\u00db3\u0091\u00e9\u0092d\u00bf\u0015\u00dbV8\u00cd\u00b2\u00cb\u00ee\u00d0Q\u00b5e\u00d8".length();
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
                    var6_5 = "\u0006\u00f7)\u0086\u009ei\u00aa\u0092\t\u00bc\u00c0\u00dd\u0093\u00cf\u0012\u00c7";
                    var7_6 = "\u0006\u00f7)\u0086\u009ei\u00aa\u0092\t\u00bc\u00c0\u00dd\u0093\u00cf\u0012\u00c7".length();
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
        AJ.m = var8_3;
        AJ.x = new Integer[23];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @DataExchangeProtocol2090
    public void c(EventDispatchCoordinator2087 eventDispatchCoordinator2087) {
        double d2;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = eventDispatchCoordinator2087.getThePlayer();
        try {
            this.O(systemConfigurationOrchestrator, eventDispatchCoordinator2087.getWorld());
            if (this.j.isEmpty()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AJ.a(customSystemException);
        }
        CryptoContextNegotiator684.Y();
        GraphicsBufferAllocator.V();
        Ne.h.z(2929);
        eventDispatchCoordinator2087.getEntityRenderer().H(0.0);
        double d3 = NumericComputationEngine1131.b();
        double d4 = NumericComputationEngine1131.S();
        double d5 = NumericComputationEngine1131.n();
        try {
            d2 = GeometryCalculator.C() > 13 ? (double)systemConfigurationOrchestrator.E() : 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw AJ.a(customSystemException);
        }
        double d6 = d2;
        this.w = new ArrayList<TransactionOrchestrator1017>(this.j.keySet());
        this.J(systemConfigurationOrchestrator);
        this.k(systemConfigurationOrchestrator);
        this.f(systemConfigurationOrchestrator);
        Collections.reverse(this.w);
        for (TransactionOrchestrator1017 transactionOrchestrator1017 : this.w) {
            ColorCompositionEngine colorCompositionEngine;
            RJ rJ = this.j.get(transactionOrchestrator1017);
            Color color = rJ.M();
            if (transactionOrchestrator1017.B(ReflectionMetadataResolver.UQ) && (colorCompositionEngine = rJ.i().w(false)) != null) {
                color = colorCompositionEngine;
            }
            this.Q(systemConfigurationOrchestrator, transactionOrchestrator1017, color, (float)rJ.P(), eventDispatchCoordinator2087.getTicks(), d3, d4, d5, d6, rJ.V());
        }
        Ne.h.m(1.0, 1.0f, 1.0f);
        eventDispatchCoordinator2087.getEntityRenderer().F(0.0);
        Ne.h.y(2929);
        GraphicsBufferAllocator.E();
        Ne.h.X();
        this.j.clear();
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

    private void k(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        if (this.L.s().booleanValue()) {
            for (TransactionOrchestrator1017 transactionOrchestrator1017 : this.w) {
                double d2 = ConditionalExecutionManager.a(transactionOrchestrator1017, systemConfigurationOrchestrator).u();
                float f = 0.35f;
                double d3 = (double)(Math.round(d2 / 3.0) * 3L) - this.e / 3.0;
                float f2 = (float)((double)f * (d3 / this.e));
                if (d2 > this.e) {
                    f2 = f;
                }
                Color color = new Color(Color.HSBtoRGB(f2, 1.0f, 1.0f));
                int n = 255;
                if (d2 > this.e && (n = (int)(255.0 / (d2 / this.e))) < 150) {
                    n = 150;
                }
                color = new Color(color.getRed(), color.getGreen(), color.getBlue(), n);
                this.j.get(transactionOrchestrator1017).l(color);
            }
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (K[n4] != null) {
            return n4;
        }
        Object object = F[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 37;
                break;
            }
            case 1: {
                n3 = 24;
                break;
            }
            case 2: {
                n3 = 3;
                break;
            }
            case 3: {
                n3 = 48;
                break;
            }
            case 4: {
                n3 = 49;
                break;
            }
            case 5: {
                n3 = 34;
                break;
            }
            case 6: {
                n3 = 58;
                break;
            }
            case 7: {
                n3 = 63;
                break;
            }
            case 8: {
                n3 = 8;
                break;
            }
            case 9: {
                n3 = 45;
                break;
            }
            case 10: {
                n3 = 15;
                break;
            }
            case 11: {
                n3 = 62;
                break;
            }
            case 12: {
                n3 = 25;
                break;
            }
            case 13: {
                n3 = 46;
                break;
            }
            case 14: {
                n3 = 9;
                break;
            }
            case 15: {
                n3 = 1;
                break;
            }
            case 16: {
                n3 = 60;
                break;
            }
            case 17: {
                n3 = 36;
                break;
            }
            case 18: {
                n3 = 10;
                break;
            }
            case 19: {
                n3 = 41;
                break;
            }
            case 20: {
                n3 = 57;
                break;
            }
            case 21: {
                n3 = 43;
                break;
            }
            case 22: {
                n3 = 23;
                break;
            }
            case 23: {
                n3 = 51;
                break;
            }
            case 24: {
                n3 = 53;
                break;
            }
            case 25: {
                n3 = 50;
                break;
            }
            case 26: {
                n3 = 6;
                break;
            }
            case 27: {
                n3 = 59;
                break;
            }
            case 28: {
                n3 = 16;
                break;
            }
            case 29: {
                n3 = 21;
                break;
            }
            case 30: {
                n3 = 35;
                break;
            }
            case 31: {
                n3 = 56;
                break;
            }
            case 32: {
                n3 = 22;
                break;
            }
            case 33: {
                n3 = 27;
                break;
            }
            case 34: {
                n3 = 12;
                break;
            }
            case 35: {
                n3 = 14;
                break;
            }
            case 36: {
                n3 = 30;
                break;
            }
            case 37: {
                n3 = 40;
                break;
            }
            case 38: {
                n3 = 2;
                break;
            }
            case 39: {
                n3 = 20;
                break;
            }
            case 40: {
                n3 = 7;
                break;
            }
            case 41: {
                n3 = 39;
                break;
            }
            case 42: {
                n3 = 11;
                break;
            }
            case 43: {
                n3 = 44;
                break;
            }
            case 44: {
                n3 = 13;
                break;
            }
            case 45: {
                n3 = 32;
                break;
            }
            case 46: {
                n3 = 31;
                break;
            }
            case 47: {
                n3 = 33;
                break;
            }
            case 48: {
                n3 = 19;
                break;
            }
            case 49: {
                n3 = 4;
                break;
            }
            case 50: {
                n3 = 52;
                break;
            }
            case 51: {
                n3 = 42;
                break;
            }
            case 52: {
                n3 = 38;
                break;
            }
            case 53: {
                n3 = 17;
                break;
            }
            case 54: {
                n3 = 5;
                break;
            }
            case 55: {
                n3 = 0;
                break;
            }
            case 56: {
                n3 = 28;
                break;
            }
            case 57: {
                n3 = 47;
                break;
            }
            case 58: {
                n3 = 26;
                break;
            }
            case 59: {
                n3 = 54;
                break;
            }
            case 60: {
                n3 = 61;
                break;
            }
            case 61: {
                n3 = 29;
                break;
            }
            case 62: {
                n3 = 18;
                break;
            }
            default: {
                n3 = 55;
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
        AJ.K[n4] = new String(cArray);
        return n4;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x15A0;
        if (x[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])B.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    B.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/AJ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AJ.x[n2] = n3;
        }
        return x[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AJ.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l, long l2) {
        int n = AJ.a(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = K[n];
                int n3 = string2.indexOf(8);
                clazz3 = AJ.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AJ.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AJ.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        AJ.F[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AJ.b(278403085876153L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AJ.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AJ.F[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AJ.b(278403085876153L, 0L);
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

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AJ.a(l, l2);
            object = F[n];
            try {
                if (!(object instanceof String)) break block2;
                AJ.F[n] = clazz = Class.forName(K[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int lambda$getMedianDistance$0(SystemConfigurationOrchestrator systemConfigurationOrchestrator, TransactionOrchestrator1017 transactionOrchestrator1017, TransactionOrchestrator1017 transactionOrchestrator10172) {
        int n;
        double d2 = ConditionalExecutionManager.a(transactionOrchestrator1017, systemConfigurationOrchestrator).u();
        double d3 = ConditionalExecutionManager.a(transactionOrchestrator10172, systemConfigurationOrchestrator).u();
        try {
            if (d2 == d3) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AJ.a(customSystemException);
        }
        try {
            n = d2 > d3 ? 1 : -1;
        }
        catch (CustomSystemException customSystemException) {
            throw AJ.a(customSystemException);
        }
        return n;
    }

    private static void a() {
        Object[] objectArray = F;
        F[0] = "88M";
        objectArray[1] = Integer.TYPE;
        AJ.K[1] = "java/lang/Integer";
        objectArray[2] = "H/$OQjC 5\u0000,rP'<I";
        objectArray[3] = "\u0005t\u0007\u000enn\u000e{\u0016A\u000f`\u0005p\u0012\u001b";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "hPB\u0004&\u000bxI[os\u001d\u0004\u000fK\b|\u001db\rI\u000b}f>\f\u001c\rc\u001aa\u000fX\t\u0018";
    }

    private void J(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        this.w.sort((arg_0, arg_1) -> AJ.lambda$getMedianDistance$0(systemConfigurationOrchestrator, arg_0, arg_1));
        ArrayList<Double> arrayList = new ArrayList<Double>();
        for (Map.Entry<TransactionOrchestrator1017, RJ> entry : this.j.entrySet()) {
            arrayList.add(entry.getValue().i().u());
        }
        Collections.sort(arrayList);
        this.e = (Double)arrayList.get(arrayList.size() / 2);
    }

    private static Field c(long l, long l2) {
        int n = AJ.a(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            String string = K[n];
            int n2 = string.indexOf(8);
            Class clazz = AJ.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AJ.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AJ.a(clazz3, string2, clazz2)) != null) {
                    AJ.F[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AJ.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AJ.F[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AJ.b(278403085876153L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = AJ.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AJ.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void f(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        if (this.n.s().booleanValue()) {
            ArrayList<TransactionOrchestrator1017> arrayList = new ArrayList<TransactionOrchestrator1017>();
            for (TransactionOrchestrator1017 transactionOrchestrator1017 : this.w) {
                try {
                    if (!(_Y.X(transactionOrchestrator1017, systemConfigurationOrchestrator) < 5.0)) continue;
                    arrayList.add(transactionOrchestrator1017);
                }
                catch (CustomSystemException customSystemException) {
                    throw AJ.a(customSystemException);
                }
            }
            if (!arrayList.isEmpty()) {
                for (TransactionOrchestrator1017 transactionOrchestrator1017 : this.w) {
                    RJ rJ = this.j.get(transactionOrchestrator1017);
                    try {
                        if (!rJ.i().G()) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AJ.a(customSystemException);
                    }
                    try {
                        if (arrayList.contains(transactionOrchestrator1017)) {
                            rJ.R(3.0);
                            rJ.K(true);
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AJ.a(customSystemException);
                    }
                    rJ.R(0.75);
                }
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AJ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(AJ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

