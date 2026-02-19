/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.KB;
import a.a;
import a.cA;
import com.app.event.broker.EventBrokerRegistry;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.core.EventDispatcherRegistry;
import com.event.management.EventDispatchCoordinator1373;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.game.world.BlockInteractionEvent;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.block.BlockRenderEventProcessor;
import com.graphics.rendering.RenderContextController;
import com.graphics.rendering.RenderingController;
import com.numeric.precision.NumericPrecisionTransformer;
import com.rendering.core.RenderBlockOrchestrator;
import com.runtime.context.ContextualExecutionFramework;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.tree.structure.RecursiveNodeManager;
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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class jD
extends ContextualExecutionFramework {
    private final AuthenticationStateTracker V;
    private float O;
    private final List<Integer> z;
    private static final long[] d;
    private final cA K;
    private final NumericPrecisionTransformer j;
    private static final Integer[] e;
    private static final Object[] l;
    private double L;
    private static final Map h;
    private static final long b;
    private static final String[] m;

    @DataExchangeProtocol2090
    public void W(KB kB) {
        long l = b ^ 0x3B3B4455166L;
        this.z.clear();
        for (String string : this.K.I()) {
            TransactionCorrelationEngine transactionCorrelationEngine = TransactionCorrelationEngine.Z(string.replace((CharSequence)((Object)jD.c("\u00de", (int)jD.a("c", (int)945, (long)(0x1DD6717C232C5693L ^ l)), (long)-6023520787326079854L, (long)l)), (CharSequence)((Object)jD.c("\u00de", (int)jD.a("c", (int)24243, (long)(0x25445E983B9E0B92L ^ l)), (long)-6023520787326079854L, (long)l))).toLowerCase());
            try {
                try {
                    if (transactionCorrelationEngine == null || this.z.contains(TransactionCorrelationEngine.h(transactionCorrelationEngine))) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw jD.a(customSystemException);
                }
                this.z.add(TransactionCorrelationEngine.h(transactionCorrelationEngine));
            }
            catch (CustomSystemException customSystemException) {
                throw jD.a(customSystemException);
            }
        }
    }

    public void S(EventBrokerRegistry eventBrokerRegistry) {
        try {
            if (!this.Z()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw jD.a(customSystemException);
        }
        eventBrokerRegistry.setCanceled(true);
    }

    public jD() {
        long l = b ^ 0x684463F26C65L;
        super(a.cs((int)jD.a("c", (int)21936, (long)(0x5F84BFCDE1DABD88L ^ l))), (int)jD.a("c", (int)31804, (long)(0x3CB7276CB5371406L ^ l)), RecursiveNodeGraph.k, a.cs((int)jD.a("c", (int)6080, (long)(0x58503EC7996C7FF2L ^ l))));
        this.K = cA.f(this, (String)((Object)jD.c("\u00de", (int)jD.a("c", (int)27327, (long)(0x50D775EC9570029FL ^ l)), (long)-7968191321669611119L, (long)l)), (String)((Object)jD.c("\u00de", (int)jD.a("c", (int)21011, (long)(0x5B05DA544BBB3A22L ^ l)), (long)-7968191321669611119L, (long)l)), cA.m, new String[]{jD.c("\u00de", (int)jD.a("c", (int)25556, (long)(0x1561BD3BF9AB0BEBL ^ l)), (long)-7968191321669611119L, (long)l), jD.c("\u00de", (int)jD.a("c", (int)7407, (long)(0x383BEA40C94074CCL ^ l)), (long)-7968191321669611119L, (long)l), jD.c("\u00de", (int)jD.a("c", (int)2933, (long)(0x55C5FEC59B4FE348L ^ l)), (long)-7968191321669611119L, (long)l), jD.c("\u00de", (int)jD.a("c", (int)3677, (long)(0x5937A96C8ED66669L ^ l)), (long)-7968191321669611119L, (long)l), jD.c("\u00de", (int)jD.a("c", (int)16887, (long)(0x6B1068B8B60F29C0L ^ l)), (long)-7968191321669611119L, (long)l), jD.c("\u00de", (int)jD.a("c", (int)23319, (long)(0x4388128C9B4C3322L ^ l)), (long)-7968191321669611119L, (long)l), jD.c("\u00de", (int)jD.a("c", (int)7730, (long)(0x67AE43D0243E760EL ^ l)), (long)-7968191321669611119L, (long)l), jD.c("\u00de", (int)jD.a("c", (int)19781, (long)(0x581870D8C157A573L ^ l)), (long)-7968191321669611119L, (long)l), jD.c("\u00de", (int)jD.a("c", (int)18814, (long)(0x66C3ADE05C86214EL ^ l)), (long)-7968191321669611119L, (long)l)});
        this.j = NumericPrecisionTransformer.N(this, (String)((Object)jD.c("\u00de", (int)jD.a("c", (int)29939, (long)(0x59A992180F4B1CC8L ^ l)), (long)-7968191321669611119L, (long)l)), (String)((Object)jD.c("\u00de", (int)jD.a("c", (int)28078, (long)(0x754EAE10D33D8597L ^ l)), (long)-7968191321669611119L, (long)l)), "", 0.0, 60.0, 255.0, 1.0);
        this.V = AuthenticationStateTracker.R(this, (String)((Object)jD.c("\u00de", (int)jD.a("c", (int)10091, (long)(0x617AE89E83BC4F55L ^ l)), (long)-7968191321669611119L, (long)l)), false, (String)((Object)jD.c("\u00de", (int)jD.a("c", (int)15678, (long)(0x7E406D77A8FD550DL ^ l)), (long)-7968191321669611119L, (long)l)));
        this.O = 1.0f;
        this.L = 0.0;
        this.z = new ArrayList<Integer>();
        this.N(this.j, this.V, this.K);
        this.j.P(this::lambda$new$0);
    }

    @Override
    public void h() {
        try {
            if (ApplicationLifecycleManager.U().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw jD.a(customSystemException);
        }
        try {
            if (!TemporalMetadataResolver.h.a().a()) {
                TemporalMetadataResolver.h.a().H();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw jD.a(customSystemException);
        }
        ApplicationLifecycleManager.O().J();
        this.O = ApplicationLifecycleManager.N().D();
        ApplicationLifecycleManager.N().L(10.0f);
        this.D();
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a5' || c == '\u00ed' || c == 'g' || c == '\u00aa') {
                field = jD.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'g' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = jD.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ee' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00de' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void X(RenderingController renderingController) {
        renderingController.setOpacity(((Double)this.j.J()).intValue());
    }

    public void p(BlockInteractionEvent blockInteractionEvent) {
        block7: {
            boolean bl;
            BlockInteractionEvent blockInteractionEvent2;
            block9: {
                block8: {
                    try {
                        if (!this.Z()) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw jD.a(customSystemException);
                    }
                    try {
                        try {
                            if (!this.t(blockInteractionEvent.getBlock())) break block7;
                            blockInteractionEvent2 = blockInteractionEvent;
                            if (this.V.s().booleanValue()) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw jD.a(customSystemException);
                        }
                        bl = true;
                        break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw jD.a(customSystemException);
                    }
                }
                bl = false;
            }
            blockInteractionEvent2.setCanceled(bl);
        }
    }

    private void D() {
        block4: {
            try {
                try {
                    if (!ApplicationLifecycleManager.U().Y() && (Double)this.j.J() != this.L) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw jD.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw jD.a(customSystemException);
            }
        }
        int n = 4000;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        int n2 = (int)systemConfigurationOrchestrator.F();
        int n3 = (int)systemConfigurationOrchestrator.B();
        ApplicationLifecycleManager.c().P(n2 - n, 0, n3 - n, n2 + n, 300, n3 + n);
        this.L = (Double)this.j.J();
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = jD.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void U(RenderBlockOrchestrator renderBlockOrchestrator) {
        try {
            if (!this.Z()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw jD.a(customSystemException);
        }
        renderBlockOrchestrator.getRenderBlocks().K(this.t(renderBlockOrchestrator.getBlock()));
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = jD.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = jD.l[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 54;
                break;
            }
            case 1: {
                n3 = 11;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 3: {
                n3 = 31;
                break;
            }
            case 4: {
                n3 = 26;
                break;
            }
            case 5: {
                n3 = 27;
                break;
            }
            case 6: {
                n3 = 25;
                break;
            }
            case 7: {
                n3 = 4;
                break;
            }
            case 8: {
                n3 = 30;
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
                n3 = 0;
                break;
            }
            case 12: {
                n3 = 45;
                break;
            }
            case 13: {
                n3 = 44;
                break;
            }
            case 14: {
                n3 = 29;
                break;
            }
            case 15: {
                n3 = 2;
                break;
            }
            case 16: {
                n3 = 3;
                break;
            }
            case 17: {
                n3 = 16;
                break;
            }
            case 18: {
                n3 = 21;
                break;
            }
            case 19: {
                n3 = 33;
                break;
            }
            case 20: {
                n3 = 39;
                break;
            }
            case 21: {
                n3 = 28;
                break;
            }
            case 22: {
                n3 = 52;
                break;
            }
            case 23: {
                n3 = 24;
                break;
            }
            case 24: {
                n3 = 35;
                break;
            }
            case 25: {
                n3 = 19;
                break;
            }
            case 26: {
                n3 = 37;
                break;
            }
            case 27: {
                n3 = 38;
                break;
            }
            case 28: {
                n3 = 6;
                break;
            }
            case 29: {
                n3 = 36;
                break;
            }
            case 30: {
                n3 = 5;
                break;
            }
            case 31: {
                n3 = 20;
                break;
            }
            case 32: {
                n3 = 41;
                break;
            }
            case 33: {
                n3 = 62;
                break;
            }
            case 34: {
                n3 = 32;
                break;
            }
            case 35: {
                n3 = 34;
                break;
            }
            case 36: {
                n3 = 8;
                break;
            }
            case 37: {
                n3 = 22;
                break;
            }
            case 38: {
                n3 = 51;
                break;
            }
            case 39: {
                n3 = 48;
                break;
            }
            case 40: {
                n3 = 9;
                break;
            }
            case 41: {
                n3 = 49;
                break;
            }
            case 42: {
                n3 = 46;
                break;
            }
            case 43: {
                n3 = 7;
                break;
            }
            case 44: {
                n3 = 13;
                break;
            }
            case 45: {
                n3 = 55;
                break;
            }
            case 46: {
                n3 = 18;
                break;
            }
            case 47: {
                n3 = 42;
                break;
            }
            case 48: {
                n3 = 57;
                break;
            }
            case 49: {
                n3 = 47;
                break;
            }
            case 50: {
                n3 = 40;
                break;
            }
            case 51: {
                n3 = 53;
                break;
            }
            case 52: {
                n3 = 56;
                break;
            }
            case 53: {
                n3 = 14;
                break;
            }
            case 54: {
                n3 = 43;
                break;
            }
            case 55: {
                n3 = 17;
                break;
            }
            case 56: {
                n3 = 10;
                break;
            }
            case 57: {
                n3 = 15;
                break;
            }
            case 58: {
                n3 = 63;
                break;
            }
            case 59: {
                n3 = 60;
                break;
            }
            case 60: {
                n3 = 61;
                break;
            }
            case 61: {
                n3 = 12;
                break;
            }
            case 62: {
                n3 = 50;
                break;
            }
            default: {
                n3 = 23;
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
        jD.m[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void v() {
        ApplicationLifecycleManager.O().J();
        ApplicationLifecycleManager.N().L(this.O);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = jD.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = jD.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void a(BlockRenderEventProcessor blockRenderEventProcessor) {
        try {
            if (!this.Z()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw jD.a(customSystemException);
        }
        try {
            blockRenderEventProcessor.setCanceled(true);
            if (this.t(blockRenderEventProcessor.getBlock())) {
                blockRenderEventProcessor.setShouldRender(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw jD.a(customSystemException);
        }
    }

    @Override
    public boolean j() {
        return true;
    }

    private static Field c(long l, long l2) {
        int n = jD.a(l, l2);
        Object object = jD.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = jD.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = jD.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = jD.a(clazz3, string2, clazz2)) != null) {
                    jD.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = jD.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        jD.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = jD.b(272771500468820L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void lambda$new$0(NumericPrecisionTransformer numericPrecisionTransformer) {
        try {
            if (this.Z()) {
                this.D();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw jD.a(customSystemException);
        }
    }

    public int i() {
        return ((Double)this.j.J()).intValue();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = jD.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = jD.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = jD.a(l, l2);
            object = jD.l[n];
            try {
                if (!(object instanceof String)) break block2;
                jD.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void A(EventDispatchCoordinator1373 eventDispatchCoordinator1373) {
        try {
            if (!this.Z()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw jD.a(customSystemException);
        }
        eventDispatchCoordinator1373.setCanceled(true);
    }

    public boolean t(TransactionCorrelationEngine transactionCorrelationEngine) {
        return this.z.contains(TransactionCorrelationEngine.h(transactionCorrelationEngine));
    }

    private static Method d(long l, long l2) {
        int n = jD.a(l, l2);
        Object object = jD.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = jD.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = jD.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = jD.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        jD.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = jD.b(272771500468820L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = jD.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        jD.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = jD.b(272771500468820L, 0L);
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7958;
        if (e[n2] == null) {
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
                throw new RuntimeException("a/jD", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            jD.e[n2] = n3;
        }
        return e[n2];
    }

    public void B(EventDispatcherRegistry eventDispatcherRegistry) {
        try {
            if (!this.Z()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw jD.a(customSystemException);
        }
        eventDispatcherRegistry.setCanceled(true);
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "\u0015Z\u001a";
        objectArray[1] = Integer.TYPE;
        jD.m[1] = "java/lang/Integer";
        objectArray[2] = "\u0002\u0017\u0003`@:\t\u0018\u0012/=\"\u001a\u001f\u001bf";
        objectArray[3] = ":F'<\fN1I6sm@:B2)";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "48Ef2.w-F\t(6\nl\u001ed1(o>K`rM3$@`#phk\\iC";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void V(RenderContextController renderContextController) {
        block4: {
            block5: {
                try {
                    try {
                        if (!this.t(renderContextController.getBlock())) break block4;
                        renderContextController.setCanceled(true);
                        if (!renderContextController.getEnumWorldBlockLayer().equals(RecursiveNodeManager.Z())) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw jD.a(customSystemException);
                    }
                    renderContextController.setShouldRender(true);
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw jD.a(customSystemException);
                }
            }
            renderContextController.setShouldRender(false);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                jD.b = MultiContainerRegistry.a(-529109784316358279L, 1736358212264925047L, MethodHandles.lookup().lookupClass()).a(273650006999040L);
                jD.l = new Object[5];
                jD.m = new String[5];
                jD.a();
                jD.h = new HashMap<K, V>(13);
                var0 = jD.b ^ 17265801118653L;
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
                var6_5 = "ip$\u0080N\u00daV\u00fa\u0011H\u00b8\u00dd\u00c1\u0086\u0016\u00ca\u00e7d=\u0015\u00d9j\u00bc\u00dc\u00f2(E\u008a\u00ca\u001b\u0080\u00c0\u001d\u0096c\u00b7\u0010\u00a8\n\u00f8w\u0005\u00e3\u00eb\u00deM\u0006\u00ee\u00f7\u00b1\u0082\u00ad\u00fc4R\u00f5N\t\u00betZU\u008e;\u00dd:\u00d5*\u001fl\u00e8\u00ffB\u00a3\u00d3\u00a0@\u00c5\u00cb\u00e5\u009b-\u00dd\u00c0sx\u00b8\u00acT\u00d0g\u00ca\u00bb\u00e7\u00ca\u00ed`y_\u009a{\u00abDDXx!\u0014\u009a\u0085\u00bf\u00ac'\u00f7\u0087L\u00ac$\u0098\u00ba\u000e\u00bb\u00b8.Z((\u0088\u00f9 \u00d2\u00b6\u0085\u00bf\u00cdQ\u00f4\u0094\u0086&w\u008d[\u00a9";
                var7_6 = "ip$\u0080N\u00daV\u00fa\u0011H\u00b8\u00dd\u00c1\u0086\u0016\u00ca\u00e7d=\u0015\u00d9j\u00bc\u00dc\u00f2(E\u008a\u00ca\u001b\u0080\u00c0\u001d\u0096c\u00b7\u0010\u00a8\n\u00f8w\u0005\u00e3\u00eb\u00deM\u0006\u00ee\u00f7\u00b1\u0082\u00ad\u00fc4R\u00f5N\t\u00betZU\u008e;\u00dd:\u00d5*\u001fl\u00e8\u00ffB\u00a3\u00d3\u00a0@\u00c5\u00cb\u00e5\u009b-\u00dd\u00c0sx\u00b8\u00acT\u00d0g\u00ca\u00bb\u00e7\u00ca\u00ed`y_\u009a{\u00abDDXx!\u0014\u009a\u0085\u00bf\u00ac'\u00f7\u0087L\u00ac$\u0098\u00ba\u000e\u00bb\u00b8.Z((\u0088\u00f9 \u00d2\u00b6\u0085\u00bf\u00cdQ\u00f4\u0094\u0086&w\u008d[\u00a9".length();
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
                    var6_5 = "\u00b4\u00e7\u00c9\u00c8A\u0082\f\u00ab[G:\u00e7T\u001b\u008e\u00a5";
                    var7_6 = "\u00b4\u00e7\u00c9\u00c8A\u0082\f\u00ab[G:\u00e7T\u001b\u008e\u00a5".length();
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
        jD.d = var8_3;
        jD.e = new Integer[20];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(jD.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(jD.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

