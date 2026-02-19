/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.lwjgl.opengl.GL11
 */
package com.event.processing;

import a.Ne;
import a.Qh;
import a.tl;
import com.analytics.computation.AnalyticsComputationEngine;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.computation.metrics.MetricComputationEngine;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.encoding.protocol.EncodingProtocolEnum;
import com.event.dispatch.EventDispatchRegistry2111;
import com.exception.system.CustomSystemException;
import com.financial.validation.TransactionValidator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.transmission.NetworkPacketQueue;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.context.SecureContextBroker572;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.core.SystemStateOrchestrator1145;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.audit.TransactionLogger;
import com.transaction.management.TransactionOrchestrator1017;
import com.ui.configuration.DisplayConfigurationManager;
import com.user.identity.UserIdentityManager;
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
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

public class EventStreamProcessor
implements NetworkConfigurationResolver2717 {
    private final List<AnalyticsComputationEngine> w;
    private AnalyticsComputationEngine L;
    private int W;
    private static final long[] b;
    private static final long a;
    private static final Integer[] c;
    public static EventStreamProcessor B;
    private static final String[] f;
    private static final Object[] e;
    private long G;
    private static final Map d;
    private int z;

    @Nullable
    public AnalyticsComputationEngine U(long l) {
        try {
            for (AnalyticsComputationEngine analyticsComputationEngine : this.w) {
                if (analyticsComputationEngine.d().s().r() != l) continue;
                return analyticsComputationEngine;
            }
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'O' || c == '\u00c3' || c == 'm' || c == '\u00e3') {
                field = EventStreamProcessor.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'O' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'm' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = EventStreamProcessor.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'U' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void t() {
        this.w.clear();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = EventStreamProcessor.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = EventStreamProcessor.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Xp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "ox\u0007";
        objectArray[1] = Integer.TYPE;
        EventStreamProcessor.f[1] = "java/lang/Integer";
        objectArray[2] = ":J^~\u0018U1EO1eM\"BFx";
        objectArray[3] = "\u0004\u001ca/Sn\u000f\u0013p`2`\u0004\u0018t:";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "d\u001e]b\t\u0011v\rF\u001a\u0006P\u000f_\u0005|\u0006I}\u001f\u0000{\b+6\u0003If\u001d\u0010l\u001a\u0007$m";
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = EventStreamProcessor.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                EventStreamProcessor.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = EventStreamProcessor.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = EventStreamProcessor.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = EventStreamProcessor.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = EventStreamProcessor.a(clazz3, string2, clazz2)) != null) {
                    EventStreamProcessor.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = EventStreamProcessor.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        EventStreamProcessor.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = EventStreamProcessor.b(267938648392330L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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
        MethodHandle methodHandle = EventStreamProcessor.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = EventStreamProcessor.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = EventStreamProcessor.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void v(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        try {
            if (this.w.isEmpty()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventStreamProcessor.a(customSystemException);
        }
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            if (systemConfigurationOrchestrator.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventStreamProcessor.a(customSystemException);
        }
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        try {
            if (connectionConfigurationResolver.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventStreamProcessor.a(customSystemException);
        }
        for (AnalyticsComputationEngine analyticsComputationEngine : this.y()) {
            try {
                if (!analyticsComputationEngine.P()) {
                    analyticsComputationEngine.A();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventStreamProcessor.a(customSystemException);
            }
            try {
                if (analyticsComputationEngine.f()) {
                    this.w.remove(analyticsComputationEngine);
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventStreamProcessor.a(customSystemException);
            }
            analyticsComputationEngine.i(connectionConfigurationResolver);
            analyticsComputationEngine.n();
            analyticsComputationEngine.G();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(2588926199337033231L, 8179559126810562154L, MethodHandles.lookup().lookupClass()).a(10847614193309L);
        e = new Object[5];
        f = new String[5];
        EventStreamProcessor.a();
        d = new HashMap(13);
        long l = a ^ 0x50DA0D5AF9A4L;
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
        String string = "\u00ca\u00ba@\u00cd\u00ebk\u009a\f\u00d60E\u0000\u00a16\u00ff\u00c3";
        int n2 = "\u00ca\u00ba@\u00cd\u00ebk\u009a\f\u00d60E\u0000\u00a16\u00ff\u00c3".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
        B = new EventStreamProcessor();
    }

    public EventStreamProcessor() {
        long l = a ^ 0x69571CFFD242L;
        this.w = new CopyOnWriteArrayList<AnalyticsComputationEngine>();
        this.z = (int)EventStreamProcessor.a("g", (int)27419, (long)(0x143AB0528628640EL ^ l));
        this.G = -1L;
        this.W = 0;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOW)
    public void O(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        TransactionValidator transactionValidator;
        block22: {
            block23: {
                double[] dArray;
                Object object;
                Object object2;
                block21: {
                    block20: {
                        try {
                            try {
                                if (this.L == null || !this.L.f()) break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EventStreamProcessor.a(customSystemException);
                            }
                            this.L = null;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventStreamProcessor.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (this.G == -1L || System.nanoTime() <= this.G) break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventStreamProcessor.a(customSystemException);
                        }
                        ++this.z;
                        this.G = -1L;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventStreamProcessor.a(customSystemException);
                    }
                }
                try {
                    if (this.W < 1) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventStreamProcessor.a(customSystemException);
                }
                TransactionOrchestrator1017 transactionOrchestrator1017 = SystemStateOrchestrator1145.S(ApplicationLifecycleManager.U(), 1000.0, 1000.0);
                if (transactionOrchestrator1017 != null) {
                    object2 = null;
                    if (transactionOrchestrator1017.B(ReflectionMetadataResolver.UQ)) {
                        Qh qh = new Qh(transactionOrchestrator1017);
                        object = TemporalMetadataResolver.h.O().m().u(qh.e());
                        if (object != null) {
                            object2 = ((MetricComputationEngine)object).z().s().r();
                        }
                    }
                    transactionValidator = new TransactionLogger(TemporalMetadataResolver.h.O().n(), (Long)object2, transactionOrchestrator1017);
                    dArray = transactionValidator.n();
                } else {
                    object2 = ApplicationLifecycleManager.U().K(1000.0, 1.0f);
                    dArray = new double[]{((NetworkPacketInterceptor1107)object2).i().X(), ((NetworkPacketInterceptor1107)object2).i().F(), ((NetworkPacketInterceptor1107)object2).i().f()};
                    transactionValidator = new TransactionValidator(TemporalMetadataResolver.h.O().n(), dArray);
                }
                object2 = this.L;
                try {
                    if (object2 == null) break block22;
                    if (!object2.getClass().equals(transactionValidator.getClass())) break block23;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventStreamProcessor.a(customSystemException);
                }
                boolean bl = ((AnalyticsComputationEngine)object2).S(dArray);
                object = ((AnalyticsComputationEngine)object2).n();
                ((AnalyticsComputationEngine)object2).m(dArray);
                SecureContextBroker572.h().c().m(((AnalyticsComputationEngine)transactionValidator).n(), arg_0 -> this.lambda$pickPing$0(bl, (AnalyticsComputationEngine)object2, transactionValidator, (double[])object, arg_0));
                break block22;
            }
            this.L = null;
            this.o(transactionValidator);
        }
        try {
            if (this.L == null) {
                this.L = transactionValidator;
                this.M(transactionValidator);
                SecureContextBroker572.h().c().m(((AnalyticsComputationEngine)transactionValidator).n(), arg_0 -> this.lambda$pickPing$1(transactionValidator, arg_0));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventStreamProcessor.a(customSystemException);
        }
        --this.W;
    }

    public void v() {
        try {
            if (TemporalMetadataResolver.h.O().h()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventStreamProcessor.a(customSystemException);
        }
        try {
            if (ApplicationLifecycleManager.X().r()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventStreamProcessor.a(customSystemException);
        }
        try {
            if (this.z == 0) {
                this.g();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventStreamProcessor.a(customSystemException);
        }
        ++this.W;
    }

    public void o(AnalyticsComputationEngine analyticsComputationEngine) {
        this.w.remove(analyticsComputationEngine);
    }

    private void lambda$pickPing$1(AnalyticsComputationEngine analyticsComputationEngine, NetworkPacketQueue networkPacketQueue) {
        block3: {
            block2: {
                try {
                    this.z = networkPacketQueue.c();
                    this.G = System.nanoTime() + networkPacketQueue.D();
                    if (!networkPacketQueue.C()) break block2;
                    this.L = analyticsComputationEngine;
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventStreamProcessor.a(customSystemException);
                }
            }
            this.o(analyticsComputationEngine);
            this.L = null;
            this.g();
        }
    }

    private static Method d(long l, long l2) {
        int n = EventStreamProcessor.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = EventStreamProcessor.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = EventStreamProcessor.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = EventStreamProcessor.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        EventStreamProcessor.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = EventStreamProcessor.b(267938648392330L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = EventStreamProcessor.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        EventStreamProcessor.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = EventStreamProcessor.b(267938648392330L, 0L);
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

    private List<AnalyticsComputationEngine> y() {
        ArrayList<AnalyticsComputationEngine> arrayList = new ArrayList<AnalyticsComputationEngine>(this.w);
        Collections.reverse(arrayList);
        return arrayList;
    }

    public void M(AnalyticsComputationEngine analyticsComputationEngine) {
        AnalyticsComputationEngine analyticsComputationEngine2 = this.j(analyticsComputationEngine.d());
        try {
            if (analyticsComputationEngine2 != null) {
                this.w.remove(analyticsComputationEngine2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventStreamProcessor.a(customSystemException);
        }
        this.w.add(analyticsComputationEngine);
    }

    private void lambda$pickPing$0(boolean bl, AnalyticsComputationEngine analyticsComputationEngine, AnalyticsComputationEngine analyticsComputationEngine2, double[] dArray, NetworkPacketQueue networkPacketQueue) {
        block6: {
            block4: {
                block5: {
                    try {
                        try {
                            this.z = networkPacketQueue.c();
                            this.G = System.nanoTime() + networkPacketQueue.D();
                            if (!networkPacketQueue.C()) break block4;
                            if (!bl) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventStreamProcessor.a(customSystemException);
                        }
                        analyticsComputationEngine.a();
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventStreamProcessor.a(customSystemException);
                    }
                }
                this.o(analyticsComputationEngine);
                this.L = analyticsComputationEngine2;
                this.M(analyticsComputationEngine2);
                break block6;
            }
            analyticsComputationEngine.m(dArray);
            this.g();
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2F52;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Xp", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EventStreamProcessor.c[n2] = n3;
        }
        return c[n2];
    }

    private void g() {
        long l = a ^ 0x3D8F42AF65A6L;
        TemporalMetadataResolver.h.c().t((String)((Object)EventStreamProcessor.b("U", (int)EventStreamProcessor.a("g", (int)855, (long)(0x411E3AC01E0E3BA7L ^ l)), (long)1703306100427514506L, (long)l)), "", CryptoConfigurationRegistry383.FRIENDS_GENERAL, 2000L);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Xp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 43;
                break;
            }
            case 1: {
                n3 = 38;
                break;
            }
            case 2: {
                n3 = 41;
                break;
            }
            case 3: {
                n3 = 46;
                break;
            }
            case 4: {
                n3 = 51;
                break;
            }
            case 5: {
                n3 = 12;
                break;
            }
            case 6: {
                n3 = 34;
                break;
            }
            case 7: {
                n3 = 44;
                break;
            }
            case 8: {
                n3 = 5;
                break;
            }
            case 9: {
                n3 = 7;
                break;
            }
            case 10: {
                n3 = 24;
                break;
            }
            case 11: {
                n3 = 55;
                break;
            }
            case 12: {
                n3 = 33;
                break;
            }
            case 13: {
                n3 = 60;
                break;
            }
            case 14: {
                n3 = 52;
                break;
            }
            case 15: {
                n3 = 22;
                break;
            }
            case 16: {
                n3 = 0;
                break;
            }
            case 17: {
                n3 = 2;
                break;
            }
            case 18: {
                n3 = 61;
                break;
            }
            case 19: {
                n3 = 50;
                break;
            }
            case 20: {
                n3 = 30;
                break;
            }
            case 21: {
                n3 = 37;
                break;
            }
            case 22: {
                n3 = 9;
                break;
            }
            case 23: {
                n3 = 28;
                break;
            }
            case 24: {
                n3 = 1;
                break;
            }
            case 25: {
                n3 = 32;
                break;
            }
            case 26: {
                n3 = 62;
                break;
            }
            case 27: {
                n3 = 57;
                break;
            }
            case 28: {
                n3 = 39;
                break;
            }
            case 29: {
                n3 = 15;
                break;
            }
            case 30: {
                n3 = 20;
                break;
            }
            case 31: {
                n3 = 23;
                break;
            }
            case 32: {
                n3 = 27;
                break;
            }
            case 33: {
                n3 = 18;
                break;
            }
            case 34: {
                n3 = 10;
                break;
            }
            case 35: {
                n3 = 47;
                break;
            }
            case 36: {
                n3 = 49;
                break;
            }
            case 37: {
                n3 = 25;
                break;
            }
            case 38: {
                n3 = 40;
                break;
            }
            case 39: {
                n3 = 26;
                break;
            }
            case 40: {
                n3 = 58;
                break;
            }
            case 41: {
                n3 = 16;
                break;
            }
            case 42: {
                n3 = 36;
                break;
            }
            case 43: {
                n3 = 35;
                break;
            }
            case 44: {
                n3 = 48;
                break;
            }
            case 45: {
                n3 = 53;
                break;
            }
            case 46: {
                n3 = 6;
                break;
            }
            case 47: {
                n3 = 19;
                break;
            }
            case 48: {
                n3 = 4;
                break;
            }
            case 49: {
                n3 = 11;
                break;
            }
            case 50: {
                n3 = 63;
                break;
            }
            case 51: {
                n3 = 31;
                break;
            }
            case 52: {
                n3 = 17;
                break;
            }
            case 53: {
                n3 = 59;
                break;
            }
            case 54: {
                n3 = 42;
                break;
            }
            case 55: {
                n3 = 14;
                break;
            }
            case 56: {
                n3 = 45;
                break;
            }
            case 57: {
                n3 = 29;
                break;
            }
            case 58: {
                n3 = 3;
                break;
            }
            case 59: {
                n3 = 13;
                break;
            }
            case 60: {
                n3 = 8;
                break;
            }
            case 61: {
                n3 = 56;
                break;
            }
            case 62: {
                n3 = 21;
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
        EventStreamProcessor.f[n4] = new String(cArray);
        return n4;
    }

    @Nullable
    public AnalyticsComputationEngine j(UserIdentityManager userIdentityManager) {
        try {
            return this.U(userIdentityManager.s().r());
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
            return null;
        }
    }

    @DataExchangeProtocol2090
    public void C(DisplayConfigurationManager displayConfigurationManager) {
        block10: {
            block9: {
                try {
                    if (this.w.isEmpty()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventStreamProcessor.a(customSystemException);
                }
                Ne.h.z();
                tl.s();
                boolean bl = GL11.glIsEnabled((int)3042);
                GraphicsBufferAllocator.V();
                for (AnalyticsComputationEngine analyticsComputationEngine : this.y()) {
                    try {
                        if (analyticsComputationEngine.L() == null) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventStreamProcessor.a(customSystemException);
                    }
                    analyticsComputationEngine.R();
                }
                try {
                    GraphicsBufferAllocator.E();
                    if (!bl) break block9;
                    tl.N();
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventStreamProcessor.a(customSystemException);
                }
            }
            tl.j();
        }
        Ne.h.X();
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
        int n2 = EventStreamProcessor.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(EventStreamProcessor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(EventStreamProcessor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

