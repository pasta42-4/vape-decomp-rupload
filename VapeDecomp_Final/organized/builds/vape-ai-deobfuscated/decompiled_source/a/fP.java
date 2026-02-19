/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.C_;
import a.Yw;
import a.bE;
import a.hQ;
import a.hr;
import a.vM;
import a.yC;
import a.ys;
import com.app.network.response.ResponseHandlingStrategy;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.sync.DataSynchronizer;
import com.exception.system.CustomSystemException;
import com.financial.transaction.TransactionValidator1909;
import com.graphics.palette.ColorPaletteGenerator;
import com.graphics.rendering.GraphicalRenderController;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.math.precision.PrecisionMathOrchestrator;
import com.math.transformation.NumericTransformationEngine;
import com.network.protocol.CommunicationProtocolHandler1966;
import com.network.security.SecureTransmissionProtocol;
import com.protocol.registry.ProtocolEnumerationRegistry;
import com.security.context.ReplicableSecurityContext;
import com.security.crypto.CipherContextManager1101;
import com.security.crypto.CipherManager;
import com.security.cryptography.CryptographicContextManager153;
import com.security.session.CipherSessionManager;
import com.security.session.CryptographicSessionManager;
import com.security.session.CryptographicSessionManager376;
import com.security.session.CryptographicSessionManager764;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.rendering.VisualRenderContext;
import com.utils.reflection.ReflectionUtilityResolver;
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fP
extends CipherSessionManager {
    private CommunicationProtocolHandler1966 kS;
    private static final long[] eb;
    private static final Object[] qb;
    private final PrecisionMathOrchestrator kY;
    private int k_ = -1;
    private static final String[] rb;
    private final CryptographicSessionManager764 kI = new CryptographicSessionManager764(400.0, 230.0);
    private CryptographicSessionManager764 kc;
    private static final Integer[] fb;
    private static final Map lb;
    private static final long ab;

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fP.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fP.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method p(long l, long l2) {
        int n = fP.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = rb[n];
                int n3 = string2.indexOf(8);
                clazz3 = fP.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fP.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fP.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fP.qb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fP.n(220078538784237L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fP.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fP.qb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fP.n(220078538784237L, 0L);
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

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c5' || c == '\u00d6' || c == '$' || c == '\u00f5') {
                field = fP.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '$' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fP.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void lambda$setRule$4(CryptographicSessionManager cryptographicSessionManager, Yw yw) {
        long l = ab ^ 0x6F1C40B04FDBL;
        C_.T(this, (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)18144, (long)(0x2177ABBCDE640931L ^ l)), (long)-5368760635349953370L, (long)l)), (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)27823, (long)(0x3F0091844440A365L ^ l)), (long)-5368760635349953370L, (long)l)), (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)8073, (long)(0x6F6AA51AD7F2D065L ^ l)), (long)-5368760635349953370L, (long)l)), () -> this.lambda$null$3(cryptographicSessionManager, yw), 100.0, (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)31617, (long)(0x699FBF9B46113451L ^ l)), (long)-5368760635349953370L, (long)l)), null);
    }

    @Override
    public double w() {
        return this.kY.w();
    }

    private void lambda$setRule$8(Runnable runnable) {
        long l = ab ^ 0x241BF913CAA3L;
        C_.T(this, (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)26251, (long)(0x46612AB84A96AC11L ^ l)), (long)3460488144803992030L, (long)l)), (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)18019, (long)(0x68B48ECFFCF0CC1L ^ l)), (long)3460488144803992030L, (long)l)), (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)4418, (long)(0x4A0FE6012D41DBEDL ^ l)), (long)3460488144803992030L, (long)l)), runnable, 95.0, (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)15958, (long)(0x120017B6395474F8L ^ l)), (long)3460488144803992030L, (long)l)), null);
    }

    public void A(Yw yw, CryptographicSessionManager cryptographicSessionManager, CryptographicSessionManager cryptographicSessionManager2, boolean bl, boolean bl2) {
        CallSite callSite;
        ColorPaletteGenerator colorPaletteGenerator;
        ColorPaletteGenerator colorPaletteGenerator2;
        ArrayList<AbstractComputationKernel> arrayList;
        Runnable runnable;
        Runnable runnable2;
        boolean bl3;
        hQ hQ2;
        AbstractComputationKernel abstractComputationKernel;
        GraphicalRenderEngine1082 graphicalRenderEngine1082;
        Double d2;
        long l;
        block21: {
            block20: {
                boolean bl4;
                Object object2;
                block19: {
                    Double d3;
                    block18: {
                        block17: {
                            l = ab ^ 0x6AED568A4102L;
                            try {
                                try {
                                    this.kS = new CommunicationProtocolHandler1966(yw, cryptographicSessionManager, cryptographicSessionManager2, bl);
                                    if (!bl2 || this.kc == null) break block17;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw fP.a(customSystemException);
                                }
                                d3 = this.kc.V();
                                break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw fP.a(customSystemException);
                            }
                        }
                        d3 = null;
                    }
                    d2 = d3;
                    this.kI.M();
                    this.kI.d().f(null);
                    this.kI.i(true);
                    this.kI.f();
                    GraphicalRenderEngine1082 graphicalRenderEngine10822 = new GraphicalRenderEngine1082(this.kI.w(), 10.0);
                    graphicalRenderEngine10822.i(false);
                    this.kI.n(graphicalRenderEngine10822, fP.e("\u00cc", (int)fP.d("e", (int)12179, (long)(0x68B7E70B75946E8EL ^ l)), (long)-4924878243268945281L, (long)l));
                    NumericTransformationEngine numericTransformationEngine = new GraphicalRenderEngine1082(10.0, 10.0);
                    numericTransformationEngine.i(false);
                    graphicalRenderEngine10822.n(numericTransformationEngine, fP.e("\u00cc", (int)fP.d("e", (int)25748, (long)(0x24271928F575A599L ^ l)), (long)-4924878243268945281L, (long)l));
                    AbstractComputationKernel abstractComputationKernel2 = new yC((String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)28410, (long)(0x171B11DF071BAFEAL ^ l)), (long)-4924878243268945281L, (long)l)), 8.0, 8.0, 8.0, 8.0, fP.M.w, fP.M.c, null);
                    numericTransformationEngine.n(new PrecisionMathOrchestrator(1.0, abstractComputationKernel2), new Object[0]);
                    ((yC)abstractComputationKernel2).a(new Color(0, 0, 0, 0), new Color(255, 255, 255, 25));
                    ((yC)abstractComputationKernel2).Y(5.0f);
                    ((yC)abstractComputationKernel2).u(true);
                    ((yC)abstractComputationKernel2).w(true);
                    ((hQ)abstractComputationKernel2).N(this::l);
                    numericTransformationEngine = new CryptographicSessionManager764(this.kI.w() - 10.0, this.kI.b() - 25.0);
                    abstractComputationKernel2 = new PrecisionMathOrchestrator(5.0, numericTransformationEngine);
                    abstractComputationKernel2.i(false);
                    ((PrecisionMathOrchestrator)abstractComputationKernel2).M();
                    this.kI.n(abstractComputationKernel2, new Object[0]);
                    numericTransformationEngine.d().f((String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)5116, (long)(0x567ED7B3EA5052E9L ^ l)), (long)-4924878243268945281L, (long)l)));
                    numericTransformationEngine.i(false);
                    numericTransformationEngine.M();
                    GraphicalRenderEngine1082 graphicalRenderEngine10823 = new GraphicalRenderEngine1082(numericTransformationEngine.w(), 20.0);
                    numericTransformationEngine.n(graphicalRenderEngine10823, new Object[0]);
                    graphicalRenderEngine10823.d().f((String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)27917, (long)(0x777E71710DCC2C16L ^ l)), (long)-4924878243268945281L, (long)l)));
                    graphicalRenderEngine10823.i(false);
                    AbstractComputationKernel abstractComputationKernel3 = new TransactionValidator1909((String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)10284, (long)(0x3F526DFA61816932L ^ l)), (long)-4924878243268945281L, (long)l)));
                    abstractComputationKernel3.Z(0.0);
                    ((CipherManager)abstractComputationKernel3).R(0.0f);
                    ((CipherManager)abstractComputationKernel3).n(1.0f);
                    ((CipherManager)abstractComputationKernel3).a(true);
                    ((CipherManager)abstractComputationKernel3).g(fP.M.w);
                    ((CipherManager)abstractComputationKernel3).y(cryptographicSessionManager2.O());
                    abstractComputationKernel3.h((arg_0, arg_1) -> fP.lambda$setRule$0(cryptographicSessionManager2, (TransactionValidator1909)abstractComputationKernel3, arg_0, arg_1));
                    graphicalRenderEngine10823.n(abstractComputationKernel3, new Object[0]);
                    numericTransformationEngine.n(new GraphicalRenderController(numericTransformationEngine.w(), 1.0, fP.M.k), new Object[0]);
                    abstractComputationKernel3 = new CryptographicSessionManager764(numericTransformationEngine.w(), 167.0);
                    numericTransformationEngine.n(abstractComputationKernel3, new Object[0]);
                    abstractComputationKernel3.i(false);
                    ((NumericTransformationEngine)abstractComputationKernel3).M();
                    ((NumericTransformationEngine)abstractComputationKernel3).d().f((String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)12078, (long)(0x344832D59A246E17L ^ l)), (long)-4924878243268945281L, (long)l)));
                    graphicalRenderEngine1082 = new GraphicalRenderEngine1082(abstractComputationKernel3.w(), 15.0);
                    ((NumericTransformationEngine)abstractComputationKernel3).n(graphicalRenderEngine1082, new Object[0]);
                    graphicalRenderEngine1082.d().f((String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)1344, (long)(0x44B9027736DEC44AL ^ l)), (long)-4924878243268945281L, (long)l)));
                    graphicalRenderEngine1082.i(false);
                    graphicalRenderEngine1082.n(new bE(0.0, 5.0), new Object[0]);
                    abstractComputationKernel = new CryptographicContextManager153((String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)22784, (long)(0x1301768BB5E59816L ^ l)), (long)-4924878243268945281L, (long)l)), 0.75, fP.M.c);
                    ((CryptographicContextManager153)abstractComputationKernel).h(0);
                    ((CryptographicContextManager153)abstractComputationKernel).q(true);
                    graphicalRenderEngine1082.n(abstractComputationKernel, new Object[0]);
                    abstractComputationKernel = new CryptographicSessionManager764(abstractComputationKernel3.w(), abstractComputationKernel3.b() - graphicalRenderEngine1082.b());
                    ((NumericTransformationEngine)abstractComputationKernel).M();
                    ((NumericTransformationEngine)abstractComputationKernel3).n(abstractComputationKernel, new Object[0]);
                    abstractComputationKernel.i(false);
                    this.kc = new CryptographicSessionManager764(abstractComputationKernel.w(), abstractComputationKernel.b());
                    ((NumericTransformationEngine)abstractComputationKernel).n(this.kc, new Object[0]);
                    this.kc.d().f((String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)1257, (long)(0x1025C4F835E8C5D4L ^ l)), (long)-4924878243268945281L, (long)l)));
                    this.kc.i((double)ApplicationLifecycleManager.b() / 2.0 - 85.0);
                    this.kc.i(false);
                    object2 = null;
                    for (int i = 0; i < cryptographicSessionManager2.E().size(); ++i) {
                        ProtocolEnumerationRegistry[] protocolEnumerationRegistryArray = cryptographicSessionManager2.E().get(i);
                        CryptographicSessionManager376 cryptographicSessionManager376 = new CryptographicSessionManager376(this.kc.w(), yw, cryptographicSessionManager2, (ReplicableSecurityContext)protocolEnumerationRegistryArray, (ReplicableSecurityContext)object2, () -> this.lambda$setRule$1(yw, cryptographicSessionManager, cryptographicSessionManager2, bl));
                        object2 = protocolEnumerationRegistryArray;
                        this.kc.n(cryptographicSessionManager376, new Object[0]);
                    }
                    this.kc.n(new bE(0.0, 5.0), new Object[0]);
                    GraphicalRenderEngine1082 graphicalRenderEngine10824 = new GraphicalRenderEngine1082(this.kc.w(), 11.0);
                    this.kc.n(graphicalRenderEngine10824, new Object[0]);
                    graphicalRenderEngine10824.d().f((String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)10253, (long)(0x523521CA9CE46908L ^ l)), (long)-4924878243268945281L, (long)l)));
                    graphicalRenderEngine10824.i(false);
                    graphicalRenderEngine10824.M();
                    graphicalRenderEngine10824.n(new bE(5.0, 0.0), new Object[0]);
                    for (ProtocolEnumerationRegistry object3 : ProtocolEnumerationRegistry.values()) {
                        hQ2 = new hr(object3.O().toUpperCase(), 0.65, fP.M.Y, fP.M.u, 58.0, 9.0);
                        ((hr)hQ2).q(false);
                        ((hr)hQ2).A(Color.WHITE);
                        ((hr)hQ2).u(1.0f);
                        ((VisualRenderContext)hQ2).f(true);
                        hQ2.Y(((VisualRenderContext)hQ2).d() + 10.0);
                        hQ2.C(() -> this.lambda$setRule$2(object3, cryptographicSessionManager2, yw, cryptographicSessionManager, bl));
                        PrecisionMathOrchestrator precisionMathOrchestrator = new PrecisionMathOrchestrator(1.0, 0.0, 0.0, 3.0, hQ2);
                        precisionMathOrchestrator.M();
                        graphicalRenderEngine10824.n(precisionMathOrchestrator, new Object[0]);
                    }
                    numericTransformationEngine.n(new GraphicalRenderController(numericTransformationEngine.w(), 1.0, fP.M.k), new Object[0]);
                    graphicalRenderEngine1082 = new GraphicalRenderEngine1082(numericTransformationEngine.w(), 28.0);
                    try {
                        numericTransformationEngine.n(graphicalRenderEngine1082, new Object[0]);
                        graphicalRenderEngine1082.d().f((String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)773, (long)(0x57A66A02C11FC23DL ^ l)), (long)-4924878243268945281L, (long)l)));
                        graphicalRenderEngine1082.i(false);
                        graphicalRenderEngine1082.M();
                        graphicalRenderEngine1082.n(new bE(0.0, 6.0), fP.e("\u00cc", (int)fP.d("e", (int)26772, (long)(0x2D66AC19876A98BL ^ l)), (long)-4924878243268945281L, (long)l));
                        if (bl || !(cryptographicSessionManager instanceof ResponseHandlingStrategy)) break block19;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw fP.a(customSystemException);
                    }
                    abstractComputationKernel = new VisualRenderContext((String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)22570, (long)(0x652A86652D14992CL ^ l)), (long)-4924878243268945281L, (long)l)), 0.75, true);
                    ((VisualRenderContext)abstractComputationKernel).c(fP.M.O);
                    ((VisualRenderContext)abstractComputationKernel).f(true);
                    abstractComputationKernel.T(((VisualRenderContext)abstractComputationKernel).d());
                    abstractComputationKernel.w(16.0);
                    ((hQ)abstractComputationKernel).C(() -> this.lambda$setRule$4(cryptographicSessionManager, yw));
                    graphicalRenderEngine1082.n(abstractComputationKernel, new Object[0]);
                }
                abstractComputationKernel = new GraphicalRenderEngine1082(86.0, graphicalRenderEngine1082.b() - 6.0);
                abstractComputationKernel.i(false);
                ((NumericTransformationEngine)abstractComputationKernel).M();
                graphicalRenderEngine1082.n(abstractComputationKernel, fP.e("\u00cc", (int)fP.d("e", (int)1842, (long)(0x5E5C7CFC00D4606L ^ l)), (long)-4924878243268945281L, (long)l));
                object2 = new VisualRenderContext((String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)28186, (long)(0x1348F00917C22F0BL ^ l)), (long)-4924878243268945281L, (long)l)), 0.75, true);
                ((VisualRenderContext)object2).f(true);
                ((AbstractComputationKernel)object2).T(((VisualRenderContext)object2).d());
                ((AbstractComputationKernel)object2).w(16.0);
                ((hQ)object2).C(this::l);
                ((NumericTransformationEngine)abstractComputationKernel).n(new PrecisionMathOrchestrator(0.0, 0.0, 0.0, 5.0, (AbstractComputationKernel)object2), new Object[0]);
                bl3 = cryptographicSessionManager2 instanceof ResponseHandlingStrategy;
                try {
                    bl4 = !bl3;
                }
                catch (CustomSystemException customSystemException) {
                    throw fP.a(customSystemException);
                }
                boolean bl5 = bl4;
                runnable2 = () -> this.lambda$setRule$5(cryptographicSessionManager2, yw);
                runnable = () -> this.lambda$setRule$6(bl5, cryptographicSessionManager2, yw, cryptographicSessionManager);
                arrayList = new ArrayList<AbstractComputationKernel>();
                try {
                    if (!bl3) break block20;
                    arrayList.add(new VisualRenderContext((String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)5719, (long)(0x118FCEB6FE52D756L ^ l)), (long)-4924878243268945281L, (long)l)), 0.75, false).a(true).c(Color.WHITE).f(true).N(() -> this.lambda$setRule$7(runnable2)));
                    break block21;
                }
                catch (CustomSystemException customSystemException) {
                    throw fP.a(customSystemException);
                }
            }
            arrayList.add(new VisualRenderContext((String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)26843, (long)(0x340C49406E9A9CFL ^ l)), (long)-4924878243268945281L, (long)l)), 0.75, false).a(true).c(Color.WHITE).f(true).N(() -> this.lambda$setRule$8(runnable)));
        }
        try {
            ColorPaletteGenerator colorPaletteGenerator3;
            colorPaletteGenerator2 = colorPaletteGenerator3;
            colorPaletteGenerator = colorPaletteGenerator3;
            callSite = bl3 ? fP.e("\u00cc", (int)fP.d("e", (int)24857, (long)(0x76B5B1D711E4A01BL ^ l)), (long)-4924878243268945281L, (long)l) : (bl ? fP.e("\u00cc", (int)fP.d("e", (int)31309, (long)(0x332B8C2B999C3B5FL ^ l)), (long)-4924878243268945281L, (long)l) : fP.e("\u00cc", (int)fP.d("e", (int)16696, (long)(0x7D6D729327FB8006L ^ l)), (long)-4924878243268945281L, (long)l));
        }
        catch (CustomSystemException customSystemException) {
            throw fP.a(customSystemException);
        }
        colorPaletteGenerator2((String)((Object)callSite), arrayList, fP.M.Y, fP.M.u, null, 1.0f, 1.0f);
        hQ2 = colorPaletteGenerator;
        try {
            ((ColorPaletteGenerator)hQ2).A(true);
            hQ2.T(58.0);
            hQ2.w(16.0);
            hQ2.w(graphicalRenderEngine1082.b());
            hQ2.C(() -> this.lambda$setRule$9(bl3, runnable, bl, runnable2));
            ((NumericTransformationEngine)abstractComputationKernel).n(new PrecisionMathOrchestrator(1.0, 0.0, hQ2), new Object[0]);
            if (d2 != null) {
                this.kc.R(d2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw fP.a(customSystemException);
        }
        this.h(true);
    }

    @Override
    public double b() {
        return this.kY.b();
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void E() {
        int n = ApplicationLifecycleManager.b();
        try {
            if (n != this.k_) {
                this.k_ = n;
                this.A(this.kS.y(), this.kS.M(), this.kS.L(), this.kS.T(), true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw fP.a(customSystemException);
        }
        super.E();
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fP.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fP.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                fP.ab = MultiContainerRegistry.a(-5934630514175186434L, 8935632684827546661L, MethodHandles.lookup().lookupClass()).a(264967733144977L);
                fP.qb = new Object[5];
                fP.rb = new String[5];
                fP.T();
                fP.lb = new HashMap<K, V>(13);
                var0 = fP.ab ^ 43205506069730L;
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
                var8_3 = new long[42];
                var5_4 = 0;
                var6_5 = "\u00b0\u00d2\u00865o\u008a\u00bfywCk\u008d\u0018\u00c9\u0088\u008d)\u00b5't\u0011\u008b\u00e6\u0011\u00a2\u0000\u00d2\u00f7\u000e\u00d2\u0011\u00ad\u00cd$\u008d\u00cew3_/\u001da\u00ec\u001f\u00ba\u00ac\u00c9Y\u008cD\u0001\u00de\u001e\u00f0#\u00a6\u001a:\u0013;\u00c0pA\u00daTc>\u00dd\u0080\u00fa\u00f0\u0001\u00cc\u0001q\u00b9\u008f&\u0086\u00fd\u00d1\u0004\u00d3xF\u00f8\u00ed\u00a3\u00d58\u00a4\u00f0($\u0089\u009agg\u00ee\u0010\u00ec\u00d1\u0019\u0083S\u001b\u0005\u0000\u0012\u00b4\u0017\u00f6\u0005\u00ae4\u00act\u00d3\u00ca\u009f\u00a7\u001f\u0012\u0004\u0085\u00efA5)MK\u00dcI\u0005\u0017\u009b\u00ecJM\u0011\u00c8\u00b7X\u008f\u00b9\u0002\u00a4T\u00ed\u00fc\u0090\u008e\u0096\u00a2\r\u00f2Z\u0092\u00b0\u00da\u0011?c\u00a8\u00ba\u00b6^k\u0094\u00d5a\u00b4\u0001y\u0086\u00b2\u00be\u00a6\u00eemk\u00bf\u00b1F%\u00b6\u00a0\u009e\u00b9'\u00e7\u007fP\u00b7{ZG\u00fa(\u0003EU')\u00b7\u00b6\u00c6S\u00bb\u00b0\u00f4\u00cep[n\u00ed\u008c\u00caq\u0014\u0093\u00bdL\u00c0\u00a5}8\u0018 \u00d4@}\u00bek\u007f\u008f8^/\u0003Dv@\u00a5a[7\u00c4)d\u00c0\u00bb|m\u0097?\u00f3<\u008e\u0090I\u00d4\u00bf:s\u00b7\u00b5Q\u0095\u000b\u009c`\u00dc\u00aa\u00d9\u008b\u00ca\u001f\u00bf\u00a1R\u00bc7k\u00ff\u00d5,\u00de\rP\n]\u009ac6)\u00dcn\u00ac::\u00ab\u008e\u001c6\u00823\u009e\u00f2\u00bb\u0091J\u000b:\u00e0.-\u00b1\u0099\u00e5";
                var7_6 = "\u00b0\u00d2\u00865o\u008a\u00bfywCk\u008d\u0018\u00c9\u0088\u008d)\u00b5't\u0011\u008b\u00e6\u0011\u00a2\u0000\u00d2\u00f7\u000e\u00d2\u0011\u00ad\u00cd$\u008d\u00cew3_/\u001da\u00ec\u001f\u00ba\u00ac\u00c9Y\u008cD\u0001\u00de\u001e\u00f0#\u00a6\u001a:\u0013;\u00c0pA\u00daTc>\u00dd\u0080\u00fa\u00f0\u0001\u00cc\u0001q\u00b9\u008f&\u0086\u00fd\u00d1\u0004\u00d3xF\u00f8\u00ed\u00a3\u00d58\u00a4\u00f0($\u0089\u009agg\u00ee\u0010\u00ec\u00d1\u0019\u0083S\u001b\u0005\u0000\u0012\u00b4\u0017\u00f6\u0005\u00ae4\u00act\u00d3\u00ca\u009f\u00a7\u001f\u0012\u0004\u0085\u00efA5)MK\u00dcI\u0005\u0017\u009b\u00ecJM\u0011\u00c8\u00b7X\u008f\u00b9\u0002\u00a4T\u00ed\u00fc\u0090\u008e\u0096\u00a2\r\u00f2Z\u0092\u00b0\u00da\u0011?c\u00a8\u00ba\u00b6^k\u0094\u00d5a\u00b4\u0001y\u0086\u00b2\u00be\u00a6\u00eemk\u00bf\u00b1F%\u00b6\u00a0\u009e\u00b9'\u00e7\u007fP\u00b7{ZG\u00fa(\u0003EU')\u00b7\u00b6\u00c6S\u00bb\u00b0\u00f4\u00cep[n\u00ed\u008c\u00caq\u0014\u0093\u00bdL\u00c0\u00a5}8\u0018 \u00d4@}\u00bek\u007f\u008f8^/\u0003Dv@\u00a5a[7\u00c4)d\u00c0\u00bb|m\u0097?\u00f3<\u008e\u0090I\u00d4\u00bf:s\u00b7\u00b5Q\u0095\u000b\u009c`\u00dc\u00aa\u00d9\u008b\u00ca\u001f\u00bf\u00a1R\u00bc7k\u00ff\u00d5,\u00de\rP\n]\u009ac6)\u00dcn\u00ac::\u00ab\u008e\u001c6\u00823\u009e\u00f2\u00bb\u0091J\u000b:\u00e0.-\u00b1\u0099\u00e5".length();
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
                    var6_5 = "\u00fc\u0082\u0018\u00a4\u009b\u00f9\u00d7\u00be&\u0099\u00f0\"G\u00d0\u000e\u00ec";
                    var7_6 = "\u00fc\u0082\u0018\u00a4\u009b\u00f9\u00d7\u00be&\u0099\u00f0\"G\u00d0\u000e\u00ec".length();
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
        fP.eb = var8_3;
        fP.fb = new Integer[42];
    }

    private void l() {
        SecureTransmissionProtocol.J();
        SecureTransmissionProtocol secureTransmissionProtocol = GraphicalRenderingController.D(SecureTransmissionProtocol.class);
        CipherContextManager1101 cipherContextManager1101 = null;
        ys ys2 = null;
        Object yw = secureTransmissionProtocol.V().iterator();
        while (yw.hasNext()) {
            CipherContextManager1101 object;
            cipherContextManager1101 = object = yw.next();
            ys2 = object.o(ys.class);
            try {
                if (ys2 == null) continue;
                break;
            }
            catch (CustomSystemException customSystemException) {
                throw fP.a(customSystemException);
            }
        }
        if (ys2 != null) {
            block8: {
                yw = ys2.v();
                CryptographicSessionManager cryptographicSessionManager = yw.G();
                try {
                    try {
                        if (cryptographicSessionManager == null || !cryptographicSessionManager.O().trim().isEmpty()) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw fP.a(customSystemException);
                    }
                    cryptographicSessionManager.F(yw instanceof ReflectionUtilityResolver);
                }
                catch (CustomSystemException customSystemException) {
                    throw fP.a(customSystemException);
                }
            }
            GraphicalRenderingController.z(cipherContextManager1101);
            secureTransmissionProtocol.t(cipherContextManager1101.N(), ys2.N(), (Yw)yw, false);
        }
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fP.m(l, l2);
            object = qb[n];
            try {
                if (!(object instanceof String)) break block2;
                fP.qb[n] = clazz = Class.forName(rb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7ABA;
        if (fb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fP", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fP.fb[n2] = n3;
        }
        return fb[n2];
    }

    private void lambda$null$3(CryptographicSessionManager cryptographicSessionManager, Yw yw) {
        block3: {
            block2: {
                try {
                    TemporalMetadataResolver.h.w().f((ResponseHandlingStrategy)cryptographicSessionManager);
                    if (!(yw instanceof vM)) break block2;
                    TemporalMetadataResolver.h.w().m().C((ResponseHandlingStrategy)cryptographicSessionManager);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw fP.a(customSystemException);
                }
            }
            TemporalMetadataResolver.h.w().u().C((ResponseHandlingStrategy)cryptographicSessionManager);
        }
        this.l();
    }

    private void lambda$setRule$7(Runnable runnable) {
        long l = ab ^ 0x7491B844002AL;
        C_.T(this, (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)10822, (long)(0x2F625AFEF2C32A79L ^ l)), (long)-392007607777633449L, (long)l)), (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)13316, (long)(0x591860631EC63420L ^ l)), (long)-392007607777633449L, (long)l)), (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)31857, (long)(0x2FB8B810C207FC63L ^ l)), (long)-392007607777633449L, (long)l)), runnable, 100.0, (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)21617, (long)(0x37E2671CD245D45DL ^ l)), (long)-392007607777633449L, (long)l)), null);
    }

    private void lambda$setRule$5(CryptographicSessionManager cryptographicSessionManager, Yw yw) {
        CryptographicSessionManager cryptographicSessionManager2;
        try {
            cryptographicSessionManager2 = cryptographicSessionManager instanceof ResponseHandlingStrategy ? new CryptographicSessionManager((ResponseHandlingStrategy)cryptographicSessionManager) : cryptographicSessionManager;
        }
        catch (CustomSystemException customSystemException) {
            throw fP.a(customSystemException);
        }
        CryptographicSessionManager cryptographicSessionManager3 = cryptographicSessionManager2;
        yw.e(cryptographicSessionManager3);
        this.l();
    }

    private static Field o(long l, long l2) {
        int n = fP.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            String string = rb[n];
            int n2 = string.indexOf(8);
            Class clazz = fP.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fP.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fP.g(clazz3, string2, clazz2)) != null) {
                    fP.qb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fP.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fP.qb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fP.n(220078538784237L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void lambda$setRule$1(Yw yw, CryptographicSessionManager cryptographicSessionManager, CryptographicSessionManager cryptographicSessionManager2, boolean bl) {
        this.A(yw, cryptographicSessionManager, cryptographicSessionManager2, bl, true);
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fP.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = "\u0010\u001f&";
        objectArray[1] = Integer.TYPE;
        fP.rb[1] = "java/lang/Integer";
        objectArray[2] = "`DFw8BkKW8EZxL^q";
        objectArray[3] = "\u0003\u0015k\u0004q=\b\u001azK\u00103\u0003\u0011~\u0011";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "~\u000f\u0016^C;u\u001fWcU?\u0012H\u0012\u001dD#j\u0000[\u000eAD+\u0000J[R'yOH\f>";
    }

    @Override
    public String A() {
        long l = ab ^ 0x2AD19FF7B935L;
        return fP.e("\u00cc", (int)fP.d("e", (int)29590, (long)(0x638004590F8F4AB9L ^ l)), (long)4868410337618715208L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (rb[n4] != null) {
            return n4;
        }
        Object object = qb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 45;
                break;
            }
            case 1: {
                n3 = 4;
                break;
            }
            case 2: {
                n3 = 32;
                break;
            }
            case 3: {
                n3 = 22;
                break;
            }
            case 4: {
                n3 = 35;
                break;
            }
            case 5: {
                n3 = 25;
                break;
            }
            case 6: {
                n3 = 55;
                break;
            }
            case 7: {
                n3 = 58;
                break;
            }
            case 8: {
                n3 = 1;
                break;
            }
            case 9: {
                n3 = 13;
                break;
            }
            case 10: {
                n3 = 53;
                break;
            }
            case 11: {
                n3 = 57;
                break;
            }
            case 12: {
                n3 = 62;
                break;
            }
            case 13: {
                n3 = 37;
                break;
            }
            case 14: {
                n3 = 8;
                break;
            }
            case 15: {
                n3 = 59;
                break;
            }
            case 16: {
                n3 = 16;
                break;
            }
            case 17: {
                n3 = 51;
                break;
            }
            case 18: {
                n3 = 48;
                break;
            }
            case 19: {
                n3 = 39;
                break;
            }
            case 20: {
                n3 = 60;
                break;
            }
            case 21: {
                n3 = 41;
                break;
            }
            case 22: {
                n3 = 10;
                break;
            }
            case 23: {
                n3 = 44;
                break;
            }
            case 24: {
                n3 = 63;
                break;
            }
            case 25: {
                n3 = 11;
                break;
            }
            case 26: {
                n3 = 47;
                break;
            }
            case 27: {
                n3 = 50;
                break;
            }
            case 28: {
                n3 = 12;
                break;
            }
            case 29: {
                n3 = 31;
                break;
            }
            case 30: {
                n3 = 56;
                break;
            }
            case 31: {
                n3 = 26;
                break;
            }
            case 32: {
                n3 = 46;
                break;
            }
            case 33: {
                n3 = 5;
                break;
            }
            case 34: {
                n3 = 14;
                break;
            }
            case 35: {
                n3 = 19;
                break;
            }
            case 36: {
                n3 = 36;
                break;
            }
            case 37: {
                n3 = 52;
                break;
            }
            case 38: {
                n3 = 29;
                break;
            }
            case 39: {
                n3 = 27;
                break;
            }
            case 40: {
                n3 = 17;
                break;
            }
            case 41: {
                n3 = 34;
                break;
            }
            case 42: {
                n3 = 23;
                break;
            }
            case 43: {
                n3 = 21;
                break;
            }
            case 44: {
                n3 = 61;
                break;
            }
            case 45: {
                n3 = 18;
                break;
            }
            case 46: {
                n3 = 40;
                break;
            }
            case 47: {
                n3 = 49;
                break;
            }
            case 48: {
                n3 = 3;
                break;
            }
            case 49: {
                n3 = 15;
                break;
            }
            case 50: {
                n3 = 28;
                break;
            }
            case 51: {
                n3 = 20;
                break;
            }
            case 52: {
                n3 = 43;
                break;
            }
            case 53: {
                n3 = 38;
                break;
            }
            case 54: {
                n3 = 54;
                break;
            }
            case 55: {
                n3 = 24;
                break;
            }
            case 56: {
                n3 = 0;
                break;
            }
            case 57: {
                n3 = 42;
                break;
            }
            case 58: {
                n3 = 2;
                break;
            }
            case 59: {
                n3 = 33;
                break;
            }
            case 60: {
                n3 = 6;
                break;
            }
            case 61: {
                n3 = 30;
                break;
            }
            case 62: {
                n3 = 7;
                break;
            }
            default: {
                n3 = 9;
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
        fP.rb[n4] = new String(cArray);
        return n4;
    }

    private void lambda$setRule$2(ProtocolEnumerationRegistry protocolEnumerationRegistry, CryptographicSessionManager cryptographicSessionManager, Yw yw, CryptographicSessionManager cryptographicSessionManager2, boolean bl) {
        block6: {
            DataSynchronizer dataSynchronizer;
            block5: {
                dataSynchronizer = new DataSynchronizer();
                try {
                    try {
                        if (protocolEnumerationRegistry != ProtocolEnumerationRegistry.OR && !cryptographicSessionManager.E().isEmpty()) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw fP.a(customSystemException);
                    }
                    cryptographicSessionManager.B(ReplicableSecurityContext.Y().C(dataSynchronizer).X());
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw fP.a(customSystemException);
                }
            }
            if (protocolEnumerationRegistry == ProtocolEnumerationRegistry.AND) {
                ReplicableSecurityContext replicableSecurityContext = cryptographicSessionManager.E().get(cryptographicSessionManager.E().size() - 1);
                replicableSecurityContext.G(dataSynchronizer);
            }
        }
        this.A(yw, cryptographicSessionManager2, cryptographicSessionManager, bl, true);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void lambda$setRule$6(boolean bl, CryptographicSessionManager cryptographicSessionManager, Yw yw, CryptographicSessionManager cryptographicSessionManager2) {
        block7: {
            ResponseHandlingStrategy responseHandlingStrategy;
            ResponseHandlingStrategy responseHandlingStrategy2;
            block6: {
                ResponseHandlingStrategy responseHandlingStrategy3;
                ResponseHandlingStrategy responseHandlingStrategy4;
                try {
                    responseHandlingStrategy4 = bl ? new ResponseHandlingStrategy(cryptographicSessionManager) : (ResponseHandlingStrategy)cryptographicSessionManager;
                }
                catch (CustomSystemException customSystemException) {
                    throw fP.a(customSystemException);
                }
                responseHandlingStrategy2 = responseHandlingStrategy4;
                boolean bl2 = yw instanceof vM;
                try {
                    yw.e(responseHandlingStrategy2);
                    responseHandlingStrategy3 = cryptographicSessionManager2 instanceof ResponseHandlingStrategy ? (ResponseHandlingStrategy)cryptographicSessionManager2 : null;
                }
                catch (CustomSystemException customSystemException) {
                    throw fP.a(customSystemException);
                }
                responseHandlingStrategy = responseHandlingStrategy3;
                try {
                    if (!bl2) break block6;
                    TemporalMetadataResolver.h.w().m().n(responseHandlingStrategy, responseHandlingStrategy2);
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw fP.a(customSystemException);
                }
            }
            TemporalMetadataResolver.h.w().u().n(responseHandlingStrategy, responseHandlingStrategy2);
        }
        this.l();
    }

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fP.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private void lambda$setRule$9(boolean bl, Runnable runnable, boolean bl2, Runnable runnable2) {
        block5: {
            long l;
            block6: {
                block4: {
                    l = ab ^ 0x2785E75898F8L;
                    try {
                        if (!bl) break block4;
                        C_.T(this, (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)20410, (long)(0x3988E744C684D75CL ^ l)), (long)7087852432611689349L, (long)l)), (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)18241, (long)(0x14B8FB8A56085FA2L ^ l)), (long)7087852432611689349L, (long)l)), (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)19609, (long)(0x3D37AEBC7254545FL ^ l)), (long)7087852432611689349L, (long)l)), runnable, 95.0, (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)10136, (long)(0x62503ADA90B03F69L ^ l)), (long)7087852432611689349L, (long)l)), null);
                        break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw fP.a(customSystemException);
                    }
                }
                try {
                    if (!bl2) break block6;
                    runnable2.run();
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw fP.a(customSystemException);
                }
            }
            C_.T(this, (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)22344, (long)(0x497392B145ACCF8DL ^ l)), (long)7087852432611689349L, (long)l)), (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)21840, (long)(0x397009BF1604CDAAL ^ l)), (long)7087852432611689349L, (long)l)), (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)9575, (long)(0x2D4A2D7A6052BD9AL ^ l)), (long)7087852432611689349L, (long)l)), runnable2, 95.0, (String)((Object)fP.e("\u00cc", (int)fP.d("e", (int)22595, (long)(0x25785D004833C0A3L ^ l)), (long)7087852432611689349L, (long)l)), null);
        }
    }

    public fP() {
        this.N(false);
        this.L(true);
        this.i(false);
        this.u(false);
        this.q(true);
        this.M();
        this.kY = new PrecisionMathOrchestrator(1.0, 3.0, 1.0, 1.0, this.kI);
        this.kY.M();
        this.kY.i(true);
        this.kY.u(false);
        this.kY.Q(fP.M.k);
        this.n(this.kY, new Object[0]);
    }

    private static void lambda$setRule$0(CryptographicSessionManager cryptographicSessionManager, TransactionValidator1909 transactionValidator1909, char c, int n) {
        cryptographicSessionManager.x(transactionValidator1909.a().trim());
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fP.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fP.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

