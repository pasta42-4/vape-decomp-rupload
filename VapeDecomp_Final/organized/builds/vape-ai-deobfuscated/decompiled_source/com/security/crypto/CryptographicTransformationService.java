/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.R5;
import a.Z3;
import a.ZB;
import a._Y;
import a.bE;
import a.bw;
import com.app.core.ActionDispatcher;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.concurrency.management.ThreadPoolConfigurer;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.crypto.cipher.SymmetricCipherManager;
import com.crypto.execution.AdvancedCipherExecutionManager;
import com.data.compression.DataCompressionFilter;
import com.entity.event.EntityEventMediator;
import com.event.management.EventDispatchCoordinator1011;
import com.exception.system.CustomSystemException;
import com.financial.payment.PaymentProcessingHandler;
import com.game.inventory.InventoryEventManager;
import com.game.state.GameStateModulator;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.math.precision.PrecisionMathOrchestrator;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.configuration.NetworkConfigManager;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.NetworkProtocolEncoder631;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.LightweightExecutionContext;
import com.security.crypto.CryptographicSecurityManager396;
import com.security.network.SecureChannelNegotiator;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationManager;
import com.system.monitoring.RuntimeResourceTracker;
import com.system.resource.ResourceAllocationTracker1227;
import com.transaction.management.TransactionOrchestrator1017;
import com.transaction.sequence.TransactionSequenceOrchestrator;
import com.ui.rendering.GraphicalRenderingController;
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
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptographicTransformationService
extends PrecisionMathOrchestrator
implements NetworkConfigurationResolver2717 {
    private final R5 K6;
    private final NetworkProtocolEncoder631 Ki;
    private final bE Kv;
    private static final long[] fb;
    private final SymmetricCipherManager K0;
    private static final long bb;
    private static final String[] rb;
    private final SecureChannelNegotiator Kq;
    private static final Map mb;
    private final bw KH;
    private static final Object[] qb;
    private final AdvancedCipherExecutionManager Kr;
    private final NetworkConfigManager KQ;
    private int K5;
    private final SymmetricCipherManager KE;
    private TransactionOrchestrator1017 KV;
    private final SymmetricCipherManager K1;
    private final SymmetricCipherManager Ks;
    private int K2;
    private final GameStateModulator KW;
    private static String Km;
    private final TransactionSequenceOrchestrator KC;
    private final GraphicalRenderEngine1082 KO;
    private final GraphicalRenderEngine1082 KL;
    private final ResourceAllocationTracker1227 KN;
    private static final int KB;
    private static final Integer[] lb;

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = "It\u0016";
        objectArray[1] = Integer.TYPE;
        CryptographicTransformationService.rb[1] = "java/lang/Integer";
        objectArray[2] = "v`<-5M}o-bHUnh$+";
        objectArray[3] = "bd]\u001f\u0017XikLPvVb`H\n";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ":v\u0016\u007f\f=f(P\u000f\u001ey\u0000+Rh\u001cd?v\u0005q\f\u00029l\rf\bzi\"V4u";
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = CryptographicTransformationService.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicTransformationService.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicTransformationService.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicTransformationService.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        bb = MultiContainerRegistry.a(2104800466920139098L, 4709424070447783384L, MethodHandles.lookup().lookupClass()).a(277664297856562L);
        qb = new Object[5];
        rb = new String[5];
        CryptographicTransformationService.T();
        mb = new HashMap(13);
        CryptographicTransformationService.s(null);
        long l = bb ^ 0x6B74DC8219B2L;
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
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u00c5\u0018\u00c8\u0088\u0088\u00c7\u00a8\u00fa\u0085\u0091\u0090\u0002\u00a8\u009b\u0096)Z\u00d3\r\u0012\u0016N\u009c6";
        int n2 = "\u00c5\u0018\u00c8\u0088\u0088\u00c7\u00a8\u00fa\u0085\u0091\u0090\u0002\u00a8\u009b\u0096)Z\u00d3\r\u0012\u0016N\u009c6".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        fb = lArray;
        lb = new Integer[3];
        KB = (int)CryptographicTransformationService.c("r", (int)8292, (long)(l ^ 0x5488518F3F867F6BL));
    }

    @DataExchangeProtocol2090
    public void P(ActionDispatcher actionDispatcher) {
        block7: {
            try {
                if (!this.K()) {
                    this.d(null);
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTransformationService.a(customSystemException);
            }
            CryptographicTransformer cryptographicTransformer = actionDispatcher.getTarget();
            try {
                try {
                    if (!cryptographicTransformer.B(ReflectionMetadataResolver.Ut) || cryptographicTransformer.B(ReflectionMetadataResolver.PR)) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformationService.a(customSystemException);
                }
                this.d(new TransactionOrchestrator1017(cryptographicTransformer));
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTransformationService.a(customSystemException);
            }
        }
    }

    private void X() {
        try {
            if (this.s() == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformationService.a(customSystemException);
        }
        this.Ki.Z((int)_Y.a(ApplicationLifecycleManager.U(), this.s()));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void U() {
        this.E();
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public TransactionOrchestrator1017 s() {
        TransactionOrchestrator1017 transactionOrchestrator1017;
        try {
            transactionOrchestrator1017 = this.E() ? ApplicationLifecycleManager.U() : this.KV;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformationService.a(customSystemException);
        }
        return transactionOrchestrator1017;
    }

    @DataExchangeProtocol2090
    public void i(EntityEventMediator entityEventMediator) {
        block19: {
            try {
                if (!this.K()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTransformationService.a(customSystemException);
            }
            try {
                block18: {
                    try {
                        try {
                            if (this.s() == null || this.s().Y()) break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTransformationService.a(customSystemException);
                        }
                        if (!ApplicationLifecycleManager.U().Y()) break block19;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTransformationService.a(customSystemException);
                    }
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTransformationService.a(customSystemException);
            }
        }
        try {
            if (ApplicationLifecycleManager.U().y(this.s()) > 6.0f) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformationService.a(customSystemException);
        }
        try {
            if (entityEventMediator.getEntity().M().equals(ApplicationLifecycleManager.U().M())) {
                this.K6.J();
                this.Kr.u();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformationService.a(customSystemException);
        }
        try {
            if (entityEventMediator.getEntity().M().equals(this.s().M())) {
                this.K6.u();
                this.Kr.Y();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformationService.a(customSystemException);
        }
    }

    private double L() {
        return this.W() + 2.0;
    }

    private boolean K() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.Kq.F() || !ApplicationLifecycleManager.c().r()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTransformationService.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformationService.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
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

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicTransformationService.m(l, l2);
            object = qb[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicTransformationService.qb[n] = clazz = Class.forName(rb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'f' || c == '\u00f8' || c == 'B' || c == 'M') {
                field = CryptographicTransformationService.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'f' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f8' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicTransformationService.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'W' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void s(String string) {
        Km = string;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void m() {
        this.K6.N(this.Kq.v().N.s());
        this.KC.N(this.Kq.v().H.s());
        this.Kr.N(this.Kq.v().d.s());
        this.Ki.N(this.Kq.v().q.s());
        boolean bl = false;
        for (AbstractComputationKernel abstractComputationKernel : this.Ks.A()) {
            if (!abstractComputationKernel.f()) continue;
            bl = true;
            break;
        }
        this.KL.N(bl);
    }

    @DataExchangeProtocol2090
    public void p(InventoryEventManager inventoryEventManager) {
        block14: {
            block13: {
                try {
                    if (!this.K()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformationService.a(customSystemException);
                }
                try {
                    try {
                        if (this.s() != null && !this.s().Y()) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTransformationService.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformationService.a(customSystemException);
                }
            }
            LightweightExecutionContext lightweightExecutionContext = inventoryEventManager.getItemStack();
            try {
                try {
                    try {
                        if (!lightweightExecutionContext.r() || !ReflectionMetadataResolver.Fl.isInstance(lightweightExecutionContext.C().M())) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTransformationService.a(customSystemException);
                    }
                    if (!RuntimeResourceTracker.d(lightweightExecutionContext)) break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformationService.a(customSystemException);
                }
                ++this.K2;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTransformationService.a(customSystemException);
            }
        }
    }

    @Override
    public void G() {
        this.y();
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
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 46;
                break;
            }
            case 2: {
                n3 = 53;
                break;
            }
            case 3: {
                n3 = 6;
                break;
            }
            case 4: {
                n3 = 43;
                break;
            }
            case 5: {
                n3 = 9;
                break;
            }
            case 6: {
                n3 = 47;
                break;
            }
            case 7: {
                n3 = 56;
                break;
            }
            case 8: {
                n3 = 4;
                break;
            }
            case 9: {
                n3 = 63;
                break;
            }
            case 10: {
                n3 = 40;
                break;
            }
            case 11: {
                n3 = 52;
                break;
            }
            case 12: {
                n3 = 19;
                break;
            }
            case 13: {
                n3 = 13;
                break;
            }
            case 14: {
                n3 = 27;
                break;
            }
            case 15: {
                n3 = 24;
                break;
            }
            case 16: {
                n3 = 17;
                break;
            }
            case 17: {
                n3 = 8;
                break;
            }
            case 18: {
                n3 = 37;
                break;
            }
            case 19: {
                n3 = 62;
                break;
            }
            case 20: {
                n3 = 7;
                break;
            }
            case 21: {
                n3 = 39;
                break;
            }
            case 22: {
                n3 = 48;
                break;
            }
            case 23: {
                n3 = 35;
                break;
            }
            case 24: {
                n3 = 23;
                break;
            }
            case 25: {
                n3 = 26;
                break;
            }
            case 26: {
                n3 = 5;
                break;
            }
            case 27: {
                n3 = 49;
                break;
            }
            case 28: {
                n3 = 29;
                break;
            }
            case 29: {
                n3 = 59;
                break;
            }
            case 30: {
                n3 = 54;
                break;
            }
            case 31: {
                n3 = 14;
                break;
            }
            case 32: {
                n3 = 41;
                break;
            }
            case 33: {
                n3 = 3;
                break;
            }
            case 34: {
                n3 = 50;
                break;
            }
            case 35: {
                n3 = 33;
                break;
            }
            case 36: {
                n3 = 58;
                break;
            }
            case 37: {
                n3 = 38;
                break;
            }
            case 38: {
                n3 = 10;
                break;
            }
            case 39: {
                n3 = 36;
                break;
            }
            case 40: {
                n3 = 15;
                break;
            }
            case 41: {
                n3 = 25;
                break;
            }
            case 42: {
                n3 = 44;
                break;
            }
            case 43: {
                n3 = 22;
                break;
            }
            case 44: {
                n3 = 11;
                break;
            }
            case 45: {
                n3 = 45;
                break;
            }
            case 46: {
                n3 = 31;
                break;
            }
            case 47: {
                n3 = 51;
                break;
            }
            case 48: {
                n3 = 30;
                break;
            }
            case 49: {
                n3 = 16;
                break;
            }
            case 50: {
                n3 = 32;
                break;
            }
            case 51: {
                n3 = 57;
                break;
            }
            case 52: {
                n3 = 12;
                break;
            }
            case 53: {
                n3 = 60;
                break;
            }
            case 54: {
                n3 = 42;
                break;
            }
            case 55: {
                n3 = 0;
                break;
            }
            case 56: {
                n3 = 18;
                break;
            }
            case 57: {
                n3 = 55;
                break;
            }
            case 58: {
                n3 = 2;
                break;
            }
            case 59: {
                n3 = 34;
                break;
            }
            case 60: {
                n3 = 28;
                break;
            }
            case 61: {
                n3 = 61;
                break;
            }
            case 62: {
                n3 = 21;
                break;
            }
            default: {
                n3 = 20;
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
        CryptographicTransformationService.rb[n4] = new String(cArray);
        return n4;
    }

    private void d(TransactionOrchestrator1017 transactionOrchestrator1017) {
        block10: {
            try {
                if (transactionOrchestrator1017 == null) {
                    this.l((TransactionOrchestrator1017)null);
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTransformationService.a(customSystemException);
            }
            try {
                try {
                    this.KE.N(true);
                    this.KQ.m();
                    if (this.s() == null || !this.s().equals(transactionOrchestrator1017)) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformationService.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTransformationService.a(customSystemException);
            }
        }
        int n = transactionOrchestrator1017.X();
        try {
            this.l(transactionOrchestrator1017);
            this.KW.J(transactionOrchestrator1017);
            if (n != this.K5) {
                this.K6.g(0);
                this.KC.Y(0);
                this.Kr.x(0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformationService.a(customSystemException);
        }
        this.K5 = n;
        this.h(true);
    }

    public CryptographicTransformationService(SecureChannelNegotiator secureChannelNegotiator) {
        long l = bb ^ 0x2B3221974A10L;
        super(10.0, new SymmetricCipherManager(100.0));
        this.KQ = new NetworkConfigManager();
        this.KO = new GraphicalRenderEngine1082(100.0, 10.0);
        this.K1 = new SymmetricCipherManager(100.0);
        this.K0 = new SymmetricCipherManager(90.0);
        this.Kv = new bE(12.0, 12.0);
        this.KH = new DataCompressionFilter(this, 12.0, 12.0);
        this.KW = new ThreadPoolConfigurer(this, 100, 4);
        this.KN = new ResourceAllocationTracker1227(0, 0);
        this.KL = new GraphicalRenderEngine1082(100.0, 14.0);
        this.Ks = new SymmetricCipherManager(100.0);
        this.Ki = new NetworkProtocolEncoder631();
        this.K6 = new R5();
        this.KC = new TransactionSequenceOrchestrator();
        this.Kr = new AdvancedCipherExecutionManager();
        this.K5 = -1;
        this.Kq = secureChannelNegotiator;
        this.KE = (SymmetricCipherManager)super.s();
        this.KE.n(new bE(1.0, 2.0), new Object[0]);
        this.KL.n(this.Ks, CryptographicTransformationService.e("W", (int)CryptographicTransformationService.c("r", (int)9313, (long)(0x24194453F1CFA8CFL ^ l)), (long)-7636964867763433670L, (long)l));
        this.KE.n(this.KL, new Object[0]);
        this.K0.n(this.Kv, new Object[0]);
        this.KO.n(this.KH, new Object[0]);
        this.KO.n(this.K0, new Object[0]);
        this.KE.o(this.KO);
        this.KE.n(new bE(100.0, 8.0), new Object[0]);
        this.K1.n(this.KW, new Object[0]);
        this.KE.o(this.K1);
        this.KE.i(false);
        this.KO.i(false);
        this.K0.i(false);
        this.K1.i(false);
        this.KL.i(false);
        this.K0.d().J(true);
        this.KO.d().J(true);
        this.Ks.i(false);
        this.Ks.n(this.K6, new Object[0]);
        this.Ks.n(this.KC, new Object[0]);
        this.Ks.n(this.Kr, new Object[0]);
        this.Ks.n(this.Ki, new Object[0]);
        Z3.s().A(this, new Predicate[0]);
    }

    static boolean b(CryptographicTransformationService cryptographicTransformationService) {
        return cryptographicTransformationService.E();
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1AAA;
        if (lb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = fb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])mb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    mb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/w9", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicTransformationService.lb[n2] = n3;
        }
        return lb[n2];
    }

    public void l(TransactionOrchestrator1017 transactionOrchestrator1017) {
        this.KV = transactionOrchestrator1017;
    }

    private static Method p(long l, long l2) {
        int n = CryptographicTransformationService.m(l, l2);
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
                clazz3 = CryptographicTransformationService.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicTransformationService.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicTransformationService.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicTransformationService.qb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicTransformationService.n(212421451394002L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicTransformationService.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicTransformationService.qb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicTransformationService.n(212421451394002L, 0L);
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

    public static String x() {
        return Km;
    }

    private static Field o(long l, long l2) {
        int n = CryptographicTransformationService.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            String string = rb[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicTransformationService.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicTransformationService.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicTransformationService.g(clazz3, string2, clazz2)) != null) {
                    CryptographicTransformationService.qb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicTransformationService.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicTransformationService.qb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicTransformationService.n(212421451394002L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private boolean E() {
        boolean bl;
        try {
            bl = !GraphicalRenderingController.K.P;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformationService.a(customSystemException);
        }
        return bl;
    }

    @Override
    public void d() {
        block22: {
            NetworkPacketInterceptor1107 networkPacketInterceptor1107;
            block21: {
                try {
                    if (!this.K()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformationService.a(customSystemException);
                }
                try {
                    try {
                        try {
                            try {
                                this.X();
                                this.m();
                                if (!this.KQ.m(1000L) || this.s() == null) break block21;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTransformationService.a(customSystemException);
                            }
                            if (this.s().Y()) break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTransformationService.a(customSystemException);
                        }
                        if (!(this.s().e() <= 0.0f)) break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTransformationService.a(customSystemException);
                    }
                    this.d(null);
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformationService.a(customSystemException);
                }
            }
            try {
                if (this.KQ.m(3000L)) {
                    this.d(null);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTransformationService.a(customSystemException);
            }
            if (this.Kq.v().C.s().booleanValue() && (networkPacketInterceptor1107 = ApplicationLifecycleManager.u()).r()) {
                CryptographicTransformer cryptographicTransformer = networkPacketInterceptor1107.l();
                try {
                    try {
                        try {
                            if (!cryptographicTransformer.r() || !cryptographicTransformer.B(ReflectionMetadataResolver.Ut)) break block22;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTransformationService.a(customSystemException);
                        }
                        if (cryptographicTransformer.B(ReflectionMetadataResolver.PR)) break block22;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTransformationService.a(customSystemException);
                    }
                    this.d(new TransactionOrchestrator1017(cryptographicTransformer));
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformationService.a(customSystemException);
                }
            }
        }
    }

    private void y() {
        int n;
        double d2;
        CryptographicSecurityManager396 cryptographicSecurityManager396;
        double d3;
        long l;
        block17: {
            block16: {
                boolean bl;
                SymmetricCipherManager symmetricCipherManager;
                block15: {
                    block14: {
                        l = bb ^ 0x66ECC0EFF57L;
                        try {
                            try {
                                symmetricCipherManager = this.KE;
                                if (this.s() == null && !this.E()) break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTransformationService.a(customSystemException);
                            }
                            bl = true;
                            break block15;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTransformationService.a(customSystemException);
                        }
                    }
                    bl = false;
                }
                try {
                    symmetricCipherManager.N(bl);
                    if (!this.KE.f()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformationService.a(customSystemException);
                }
                try {
                    this.KH.N(this.s().B(ReflectionMetadataResolver.UQ));
                    if (!this.KL.f()) break block16;
                    this.U(5.0);
                    break block17;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformationService.a(customSystemException);
                }
            }
            this.U(10.0);
        }
        this.h(true);
        this.KN.Z((int)this.w() * 2, (int)this.b() * 2);
        this.KN.q((int)this.G(), (int)this.L(), 20.0f, 3.0f);
        ConfigurationManager.o(this.G(), this.L(), this.w(), this.b(), new Color(18, 18, 18, 173), true, 3.0f, 1.0f);
        ConfigurationManager.U(this.G(), this.L(), this.w(), this.b(), new Color(48, 48, 48, 255), 3.0f, 1.0f, 1.0f);
        String string = this.W();
        String string2 = ZB.U(string);
        if (string2.isEmpty()) {
            string = "\u00a77(Empty Name)";
        }
        CryptographicSecurityManager396 cryptographicSecurityManager3962 = new CryptographicSecurityManager396(string, (String)((Object)CryptographicTransformationService.e("W", (int)CryptographicTransformationService.c("r", (int)32151, (long)(0x339917AE795D447FL ^ l)), (long)2540911683208690301L, (long)l)), 80.0, 1.3, Color.WHITE, false);
        try {
            d3 = this.KH.f() ? this.KH.W() + this.KH.b() / 2.0 - cryptographicSecurityManager3962.K() / 2.0 : this.KO.W() + this.KO.b() / 2.0 - cryptographicSecurityManager3962.K() / 2.0;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformationService.a(customSystemException);
        }
        double d4 = d3;
        try {
            cryptographicSecurityManager396 = cryptographicSecurityManager3962;
            d2 = this.Kv.G();
            n = this.KH.f() ? 5 : 2;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformationService.a(customSystemException);
        }
        cryptographicSecurityManager396.y(d2 + (double)n, d4);
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicTransformationService.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicTransformationService.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public String W() {
        try {
            if (this.s() == null) {
                return "";
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformationService.a(customSystemException);
        }
        return this.s().e();
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void y(EventDispatchCoordinator1011 eventDispatchCoordinator1011) {
        block22: {
            block21: {
                block20: {
                    block19: {
                        try {
                            if (!this.K()) {
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTransformationService.a(customSystemException);
                        }
                        try {
                            block18: {
                                try {
                                    try {
                                        if (this.s() == null || this.s().Y()) break block18;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicTransformationService.a(customSystemException);
                                    }
                                    if (!ApplicationLifecycleManager.U().Y()) break block19;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicTransformationService.a(customSystemException);
                                }
                            }
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTransformationService.a(customSystemException);
                        }
                    }
                    try {
                        if (!eventDispatchCoordinator1011.getEntity().B(ReflectionMetadataResolver.F6)) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTransformationService.a(customSystemException);
                    }
                    PaymentProcessingHandler paymentProcessingHandler = new PaymentProcessingHandler(eventDispatchCoordinator1011.getEntity());
                    try {
                        try {
                            if (!paymentProcessingHandler.a().Y() && RuntimeResourceTracker.d(paymentProcessingHandler.a())) break block20;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTransformationService.a(customSystemException);
                        }
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTransformationService.a(customSystemException);
                    }
                }
                try {
                    if (this.K2 <= 0) break block21;
                    this.KC.D();
                    --this.K2;
                    break block22;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformationService.a(customSystemException);
                }
            }
            this.KC.x();
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicTransformationService.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptographicTransformationService.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

