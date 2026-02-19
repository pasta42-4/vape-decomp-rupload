/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.execution;

import a.bE;
import a.wB;
import com.collections.management.MultiContainerRegistry;
import com.data.transformation.DataTransformationProtocol1874;
import com.event.core.EventSubscriptionHandler;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.math.precision.PrecisionMathOrchestrator;
import com.network.protocol.AbstractProtocolAdapter;
import com.network.protocol.CommunicationProtocolManager;
import com.security.cipher.CipherModeRegistry;
import com.security.crypto.CipherKeyGenerator1678;
import com.security.crypto.CipherManager;
import com.security.cryptography.CipherKeyGenerator2379;
import com.security.cryptography.SecurePayloadManager;
import com.system.configuration.ConfigurationManager;
import com.system.resource.ResourceAllocationManager1348;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
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
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class HybridExecutionCoordinator
extends GraphicalRenderEngine1082 {
    private boolean dQ;
    private final Runnable dN;
    private static final long[] bb;
    private GraphicalRenderEngine1082 dy;
    private final GraphicalRenderEngine1082 di;
    private final SecurePayloadManager dY;
    public static final double dG = 324.0;
    private static final Object[] lb;
    public static final double dh = 240.0;
    private static final Map fb;
    private static final long ab;
    private final GraphicalRenderEngine1082 d_;
    private static final String[] mb;
    private static final Integer[] eb;

    private void lambda$new$0() {
        this.m();
        this.dN.run();
    }

    private void lambda$new$1() {
        this.e(false);
        this.dY.v();
    }

    static GraphicalRenderEngine1082 c(HybridExecutionCoordinator hybridExecutionCoordinator) {
        return hybridExecutionCoordinator.d_;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = HybridExecutionCoordinator.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void m() {
        ArrayList<String> arrayList;
        boolean bl;
        long l = ab ^ 0x6A00B97CD167L;
        String string = this.dY.o().a().trim();
        try {
            boolean bl2 = bl = !string.isEmpty();
        }
        catch (CustomSystemException customSystemException) {
            throw HybridExecutionCoordinator.a(customSystemException);
        }
        if (!bl) {
            arrayList = new ArrayList<String>(TemporalMetadataResolver.h.u().f());
        } else {
            ArrayList arrayList2;
            DataTransformationProtocol1874 dataTransformationProtocol1874 = this.dY.o().V();
            try {
                arrayList2 = dataTransformationProtocol1874 != null ? dataTransformationProtocol1874.U() : new ArrayList();
            }
            catch (CustomSystemException customSystemException) {
                throw HybridExecutionCoordinator.a(customSystemException);
            }
            arrayList = arrayList2;
        }
        this.d_.k();
        double d2 = 0.0;
        for (String string2 : arrayList) {
            try {
                if (this.dY.t(string2)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw HybridExecutionCoordinator.a(customSystemException);
            }
            ResourceAllocationManager1348 resourceAllocationManager1348 = new ResourceAllocationManager1348(string2);
            PrecisionMathOrchestrator precisionMathOrchestrator = new PrecisionMathOrchestrator(0.0, 0.0, 1.0, 1.0, resourceAllocationManager1348);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            resourceAllocationManager1348.l(new EventSubscriptionHandler(this, atomicBoolean, precisionMathOrchestrator, resourceAllocationManager1348));
            double d3 = precisionMathOrchestrator.w();
            try {
                if (d2 + d3 >= this.d_.w()) {
                    break;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw HybridExecutionCoordinator.a(customSystemException);
            }
            d2 += d3;
            this.d_.n(precisionMathOrchestrator, HybridExecutionCoordinator.d("\u00fa", (int)HybridExecutionCoordinator.c("h", (int)11680, (long)(0x186D55A130DE8D27L ^ l)), (long)6682335563310332207L, (long)l));
        }
    }

    private void e(boolean bl) {
        boolean bl2;
        block8: {
            block7: {
                boolean bl3;
                try {
                    bl3 = this.dQ != bl;
                }
                catch (CustomSystemException customSystemException) {
                    throw HybridExecutionCoordinator.a(customSystemException);
                }
                bl2 = bl3;
                try {
                    this.dQ = bl;
                    if (!this.dQ) break block7;
                    this.dy.N(false);
                    this.dY.C().N(true);
                    this.di.w(44.0);
                    this.di.P(44.0);
                    this.d_.N(true);
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw HybridExecutionCoordinator.a(customSystemException);
                }
            }
            this.dy.N(true);
            this.dY.C().N(false);
            this.di.w(26.0);
            this.di.P(26.0);
            this.d_.N(false);
        }
        try {
            this.dY.h(true);
            this.di.h(true);
            if (bl2) {
                this.m();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw HybridExecutionCoordinator.a(customSystemException);
        }
    }

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "C\u0016l";
        objectArray[1] = Integer.TYPE;
        HybridExecutionCoordinator.mb[1] = "java/lang/Integer";
        objectArray[2] = "L(L\u0014\r$G'][p<T T\u0012";
        objectArray[3] = "}}/>\u001e\u0004vr>q\u007f\n}y:+";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "f4M\u0015$+3wUdp)_3FXk)4{I\rvRfrUZ}j\"nG\n\u001b";
    }

    public SecurePayloadManager h() {
        return this.dY;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = HybridExecutionCoordinator.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ec' || c == 'C' || c == 'Q' || c == 'R') {
                field = HybridExecutionCoordinator.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ec' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = HybridExecutionCoordinator.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ee' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void lambda$null$2(AtomicBoolean atomicBoolean, String string) {
        while (atomicBoolean.get()) {
            block7: {
                try {
                    Thread.sleep(200L);
                }
                catch (InterruptedException interruptedException) {
                    TemporalMetadataResolver.W(interruptedException);
                }
                String string2 = this.dY.o().a().trim();
                try {
                    if (!string2.equalsIgnoreCase(string)) break block7;
                    if (!string2.isEmpty()) continue;
                }
                catch (InterruptedException interruptedException) {
                    throw HybridExecutionCoordinator.a(interruptedException);
                }
                atomicBoolean.set(false);
                return;
            }
            try {
                this.dN.run();
            }
            catch (Throwable throwable) {
                TemporalMetadataResolver.W(throwable);
            }
            atomicBoolean.set(false);
            return;
        }
    }

    private void I() {
        block3: {
            block2: {
                try {
                    if (!this.dQ) break block2;
                    ConfigurationManager.C(this.di.G(), this.di.W(), this.di.w(), this.di.b(), HybridExecutionCoordinator.M.S, 2.0f);
                    ConfigurationManager.g(this.di.G() + 5.0, this.di.W() + this.dY.b(), this.di.G() + this.di.w() - 5.0, this.di.W() + this.dY.b(), 0.75f, HybridExecutionCoordinator.M.k);
                    ConfigurationManager.U(this.di.G(), this.di.W(), this.di.w(), this.di.b(), HybridExecutionCoordinator.M.k, 2.0f, 0.75f, 1.0f);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw HybridExecutionCoordinator.a(customSystemException);
                }
            }
            ConfigurationManager.U(this.dY.G(), this.dY.W(), this.dY.w(), this.dY.b(), HybridExecutionCoordinator.M.k, 2.0f, 0.75f, 1.0f);
        }
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = HybridExecutionCoordinator.i(l, l2);
            object = lb[n];
            try {
                if (!(object instanceof String)) break block2;
                HybridExecutionCoordinator.lb[n] = clazz = Class.forName(mb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static void E(HybridExecutionCoordinator hybridExecutionCoordinator) {
        hybridExecutionCoordinator.I();
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void L() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.dY.o().g().add(0, (arg_0, arg_1) -> this.lambda$addInputListener$3(atomicBoolean, arg_0, arg_1));
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = HybridExecutionCoordinator.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = HybridExecutionCoordinator.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = HybridExecutionCoordinator.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = HybridExecutionCoordinator.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void lambda$addCategoryContainers$4(CipherModeRegistry cipherModeRegistry) {
        CommunicationProtocolManager communicationProtocolManager = GraphicalRenderingController.D(CommunicationProtocolManager.class);
        try {
            if (communicationProtocolManager.v() != cipherModeRegistry) {
                communicationProtocolManager.z(cipherModeRegistry);
                communicationProtocolManager.D().I();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw HybridExecutionCoordinator.a(customSystemException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                HybridExecutionCoordinator.ab = MultiContainerRegistry.a(-3308027248531286145L, -5422661896137536316L, MethodHandles.lookup().lookupClass()).a(176919955119242L);
                HybridExecutionCoordinator.lb = new Object[5];
                HybridExecutionCoordinator.mb = new String[5];
                HybridExecutionCoordinator.x();
                HybridExecutionCoordinator.fb = new HashMap<K, V>(13);
                var0 = HybridExecutionCoordinator.ab ^ 18773052549033L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u000b\u0011\u00c3\u00f0\u00a0\u00f3\u00ad\u00f4Uo\u00be0d\u00cf\u00b1\u009a~\u00f7\u007f\u00f5\u0098{\u00c0\u0015";
                var7_6 = "\u000b\u0011\u00c3\u00f0\u00a0\u00f3\u00ad\u00f4Uo\u00be0d\u00cf\u00b1\u009a~\u00f7\u007f\u00f5\u0098{\u00c0\u0015".length();
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
                    var6_5 = "ok\u00cd\u009fB\u00fe\u00d5\u00ac\u00d727\u00f8P\u0019J\b";
                    var7_6 = "ok\u00cd\u009fB\u00fe\u00d5\u00ac\u00d727\u00f8P\u0019J\b".length();
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
        HybridExecutionCoordinator.bb = var8_3;
        HybridExecutionCoordinator.eb = new Integer[5];
    }

    private static Method l(long l, long l2) {
        int n = HybridExecutionCoordinator.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = mb[n];
                int n3 = string2.indexOf(8);
                clazz3 = HybridExecutionCoordinator.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = HybridExecutionCoordinator.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = HybridExecutionCoordinator.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        HybridExecutionCoordinator.lb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = HybridExecutionCoordinator.j(225652435050616L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = HybridExecutionCoordinator.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        HybridExecutionCoordinator.lb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = HybridExecutionCoordinator.j(225652435050616L, 0L);
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

    static SecurePayloadManager f(HybridExecutionCoordinator hybridExecutionCoordinator) {
        return hybridExecutionCoordinator.dY;
    }

    private static Field k(long l, long l2) {
        int n = HybridExecutionCoordinator.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            String string = mb[n];
            int n2 = string.indexOf(8);
            Class clazz = HybridExecutionCoordinator.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = HybridExecutionCoordinator.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = HybridExecutionCoordinator.e(clazz3, string2, clazz2)) != null) {
                    HybridExecutionCoordinator.lb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = HybridExecutionCoordinator.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        HybridExecutionCoordinator.lb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = HybridExecutionCoordinator.j(225652435050616L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7C3B;
        if (eb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/wb", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HybridExecutionCoordinator.eb[n2] = n3;
        }
        return eb[n2];
    }

    public HybridExecutionCoordinator(double d2, Runnable runnable) {
        long l = ab ^ 0x593B98E3668FL;
        super(d2, 42.0);
        this.dQ = false;
        this.d().f((String)((Object)HybridExecutionCoordinator.d("\u00fa", (int)HybridExecutionCoordinator.c("h", (int)13200, (long)(0x66A208C37C6FA4FEL ^ l)), (long)-1489460086172692793L, (long)l)));
        this.dN = runnable;
        this.R();
        Runnable runnable2 = this::lambda$new$0;
        this.dY = new CipherKeyGenerator2379(this, (String)((Object)HybridExecutionCoordinator.d("\u00fa", (int)HybridExecutionCoordinator.c("h", (int)17485, (long)(0x529678ED0235D321L ^ l)), (long)-1489460086172692793L, (long)l)), runnable2, d2, 20.0, false, false);
        this.dY.o().M(new AbstractProtocolAdapter());
        this.dY.C().C(this::lambda$new$1);
        this.d_ = new GraphicalRenderEngine1082(d2 - 8.0, 16.0);
        this.d_.i(false);
        this.di = new wB(this, d2, 26.0);
        this.di.i(false);
        this.di.d().f((String)((Object)HybridExecutionCoordinator.d("\u00fa", (int)HybridExecutionCoordinator.c("h", (int)27401, (long)(0x5E3BF913BD63FC63L ^ l)), (long)-1489460086172692793L, (long)l)));
        this.di.n(this.dY, new Object[0]);
        this.di.n(new bE(1.0, 4.0), new Object[0]);
        this.di.n(new PrecisionMathOrchestrator(3.0, 0.0, 4.0, 4.0, this.d_), new Object[0]);
        this.n(this.di, new Object[0]);
        this.n(this.dy, new Object[0]);
        this.L();
        this.e(false);
    }

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (mb[n4] != null) {
            return n4;
        }
        Object object = lb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 62;
                break;
            }
            case 1: {
                n3 = 30;
                break;
            }
            case 2: {
                n3 = 2;
                break;
            }
            case 3: {
                n3 = 51;
                break;
            }
            case 4: {
                n3 = 56;
                break;
            }
            case 5: {
                n3 = 4;
                break;
            }
            case 6: {
                n3 = 46;
                break;
            }
            case 7: {
                n3 = 41;
                break;
            }
            case 8: {
                n3 = 7;
                break;
            }
            case 9: {
                n3 = 49;
                break;
            }
            case 10: {
                n3 = 11;
                break;
            }
            case 11: {
                n3 = 52;
                break;
            }
            case 12: {
                n3 = 13;
                break;
            }
            case 13: {
                n3 = 21;
                break;
            }
            case 14: {
                n3 = 3;
                break;
            }
            case 15: {
                n3 = 37;
                break;
            }
            case 16: {
                n3 = 33;
                break;
            }
            case 17: {
                n3 = 19;
                break;
            }
            case 18: {
                n3 = 24;
                break;
            }
            case 19: {
                n3 = 50;
                break;
            }
            case 20: {
                n3 = 53;
                break;
            }
            case 21: {
                n3 = 0;
                break;
            }
            case 22: {
                n3 = 28;
                break;
            }
            case 23: {
                n3 = 8;
                break;
            }
            case 24: {
                n3 = 6;
                break;
            }
            case 25: {
                n3 = 12;
                break;
            }
            case 26: {
                n3 = 9;
                break;
            }
            case 27: {
                n3 = 55;
                break;
            }
            case 28: {
                n3 = 34;
                break;
            }
            case 29: {
                n3 = 25;
                break;
            }
            case 30: {
                n3 = 40;
                break;
            }
            case 31: {
                n3 = 20;
                break;
            }
            case 32: {
                n3 = 36;
                break;
            }
            case 33: {
                n3 = 29;
                break;
            }
            case 34: {
                n3 = 54;
                break;
            }
            case 35: {
                n3 = 44;
                break;
            }
            case 36: {
                n3 = 61;
                break;
            }
            case 37: {
                n3 = 5;
                break;
            }
            case 38: {
                n3 = 58;
                break;
            }
            case 39: {
                n3 = 35;
                break;
            }
            case 40: {
                n3 = 23;
                break;
            }
            case 41: {
                n3 = 26;
                break;
            }
            case 42: {
                n3 = 63;
                break;
            }
            case 43: {
                n3 = 32;
                break;
            }
            case 44: {
                n3 = 14;
                break;
            }
            case 45: {
                n3 = 38;
                break;
            }
            case 46: {
                n3 = 27;
                break;
            }
            case 47: {
                n3 = 57;
                break;
            }
            case 48: {
                n3 = 15;
                break;
            }
            case 49: {
                n3 = 42;
                break;
            }
            case 50: {
                n3 = 1;
                break;
            }
            case 51: {
                n3 = 16;
                break;
            }
            case 52: {
                n3 = 43;
                break;
            }
            case 53: {
                n3 = 48;
                break;
            }
            case 54: {
                n3 = 47;
                break;
            }
            case 55: {
                n3 = 59;
                break;
            }
            case 56: {
                n3 = 45;
                break;
            }
            case 57: {
                n3 = 60;
                break;
            }
            case 58: {
                n3 = 31;
                break;
            }
            case 59: {
                n3 = 10;
                break;
            }
            case 60: {
                n3 = 39;
                break;
            }
            case 61: {
                n3 = 17;
                break;
            }
            case 62: {
                n3 = 22;
                break;
            }
            default: {
                n3 = 18;
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
        HybridExecutionCoordinator.mb[n4] = new String(cArray);
        return n4;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void R() {
        long l = ab ^ 0x16D04FE368B2L;
        this.dy = new GraphicalRenderEngine1082(this.w(), 20.0);
        this.dy.i(false);
        this.dy.d().f((String)((Object)HybridExecutionCoordinator.d("\u00fa", (int)HybridExecutionCoordinator.c("h", (int)10589, (long)(0x4214825445B6300DL ^ l)), (long)-1915982459803156230L, (long)l)));
        for (CipherModeRegistry cipherModeRegistry : CipherModeRegistry.VALUES) {
            CipherKeyGenerator1678 cipherKeyGenerator1678 = new CipherKeyGenerator1678(this, cipherModeRegistry.E().toUpperCase(), 0.7, HybridExecutionCoordinator.M.Y, HybridExecutionCoordinator.M.u, cipherModeRegistry);
            cipherKeyGenerator1678.u(7.0f);
            cipherKeyGenerator1678.f(true);
            cipherKeyGenerator1678.q(false);
            double d2 = cipherKeyGenerator1678.d();
            this.getClass();
            cipherKeyGenerator1678.T(d2 + (double)(5.0f * 3.0f));
            cipherKeyGenerator1678.w(14.0);
            cipherKeyGenerator1678.C(() -> HybridExecutionCoordinator.lambda$addCategoryContainers$4(cipherModeRegistry));
            this.dy.n(cipherKeyGenerator1678, new Object[0]);
        }
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void lambda$addInputListener$3(AtomicBoolean atomicBoolean, char c, int n) {
        GraphicalRenderingController.st.execute(this::m);
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            String string = this.dY.o().a().trim();
            CompletableFuture.runAsync(() -> this.lambda$null$2(atomicBoolean, string));
        }
    }

    public CipherManager X() {
        return this.dY.o();
    }

    static void X(HybridExecutionCoordinator hybridExecutionCoordinator, boolean bl) {
        hybridExecutionCoordinator.e(bl);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(HybridExecutionCoordinator.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(HybridExecutionCoordinator.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

