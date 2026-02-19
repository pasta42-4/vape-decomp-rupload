/*
 * Decompiled with CFR 0.152.
 */
package com.crypto.stream;

import a.a;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.propagation.EventPropagationDispatcher;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.reflection.dynamic.DynamicInvocationResolver1041;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.resource.allocation.ResourceAllocationManager2527;
import com.runtime.context.ContextualExecutionFramework;
import com.security.crypto.CryptographicUtility;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.ExecutionStateTracker;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class StreamCipherSessionManager
extends ContextualExecutionFramework {
    private static final long[] e;
    private final AuthenticationStateTracker A;
    private static final Object[] l;
    private final AuthenticationStateTracker K;
    private boolean N;
    private static final Map j;
    private static final long b;
    private final AuthenticationStateTracker d;
    private static final String[] m;
    private static final Integer[] h;

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void y() {
        ExecutionStateTracker executionStateTracker = ApplicationLifecycleManager.N();
        CryptographicUtility.r(executionStateTracker.s());
        CryptographicUtility.r(executionStateTracker.w());
        CryptographicUtility.r(executionStateTracker.y());
        CryptographicUtility.r(executionStateTracker.h());
        CryptographicUtility.r(executionStateTracker.r());
        CryptographicUtility.r(executionStateTracker.f());
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = StreamCipherSessionManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public boolean s() {
        block15: {
            try {
                if (ApplicationLifecycleManager.X().Y()) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw StreamCipherSessionManager.a(customSystemException);
            }
            try {
                if (GraphicalRenderingController.d != null) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw StreamCipherSessionManager.a(customSystemException);
            }
            try {
                try {
                    try {
                        if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.bN) && ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.FJ)) break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StreamCipherSessionManager.a(customSystemException);
                    }
                    if (!this.A.s().booleanValue()) break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamCipherSessionManager.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw StreamCipherSessionManager.a(customSystemException);
            }
        }
        try {
            if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.Ew)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamCipherSessionManager.a(customSystemException);
        }
        return true;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = StreamCipherSessionManager.a(lookup, mutableCallSite, string, methodType, l, l2);
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

    @DataExchangeProtocol2090
    public void Y(EventPropagationDispatcher eventPropagationDispatcher) {
        block17: {
            if (this.K.s().booleanValue()) {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                block19: {
                    block18: {
                        systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                        try {
                            try {
                                try {
                                    if (!this.s()) break block17;
                                    if (!DynamicInvocationResolver1041.F(38)) break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw StreamCipherSessionManager.a(customSystemException);
                                }
                                if (!(systemConfigurationOrchestrator.S() - 3.0f > -90.0f)) break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StreamCipherSessionManager.a(customSystemException);
                            }
                            systemConfigurationOrchestrator.f(AdaptiveComputationEngine.g(systemConfigurationOrchestrator.S() - 3.0f, -89.5f, 89.5f));
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StreamCipherSessionManager.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (!DynamicInvocationResolver1041.F(40) || !(systemConfigurationOrchestrator.S() + 3.0f < 90.0f)) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StreamCipherSessionManager.a(customSystemException);
                        }
                        systemConfigurationOrchestrator.f(AdaptiveComputationEngine.g(systemConfigurationOrchestrator.S() + 3.0f, -89.5f, 89.5f));
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StreamCipherSessionManager.a(customSystemException);
                    }
                }
                try {
                    if (DynamicInvocationResolver1041.F(37)) {
                        systemConfigurationOrchestrator.a(systemConfigurationOrchestrator.q() - 5.0f);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamCipherSessionManager.a(customSystemException);
                }
                try {
                    if (DynamicInvocationResolver1041.F(39)) {
                        systemConfigurationOrchestrator.a(systemConfigurationOrchestrator.q() + 5.0f);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamCipherSessionManager.a(customSystemException);
                }
            }
        }
    }

    private static Field c(long l, long l2) {
        int n = StreamCipherSessionManager.a(l, l2);
        Object object = StreamCipherSessionManager.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = StreamCipherSessionManager.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = StreamCipherSessionManager.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = StreamCipherSessionManager.a(clazz3, string2, clazz2)) != null) {
                    StreamCipherSessionManager.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = StreamCipherSessionManager.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        StreamCipherSessionManager.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = StreamCipherSessionManager.b(227776920899615L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "'zp";
        objectArray[1] = Integer.TYPE;
        StreamCipherSessionManager.m[1] = "java/lang/Integer";
        objectArray[2] = "\u0016\nu{\b?\u001d\u0005d4u'\u000e\u0002m}";
        objectArray[3] = "+\u0012\u0019PR\u0017 \u001d\b\u001f3\u0019+\u0016\fE";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "`o\u0010\u0014!\u0001$w\b*{\u0011^?KK\u007f\u0014.9AG~jgw\u0003\u001b.\u00145aEC\u0010";
    }

    @Override
    public void v() {
        if (ApplicationLifecycleManager.X().r()) {
            ExecutionStateTracker executionStateTracker = ApplicationLifecycleManager.N();
            CryptographicUtility.e(executionStateTracker.s(), false);
            CryptographicUtility.e(executionStateTracker.w(), false);
            CryptographicUtility.e(executionStateTracker.y(), false);
            CryptographicUtility.e(executionStateTracker.h(), false);
            CryptographicUtility.e(executionStateTracker.r(), false);
            CryptographicUtility.e(executionStateTracker.f(), false);
        } else {
            this.y();
        }
    }

    private static Method d(long l, long l2) {
        int n = StreamCipherSessionManager.a(l, l2);
        Object object = StreamCipherSessionManager.l[n];
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
                clazz3 = StreamCipherSessionManager.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = StreamCipherSessionManager.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = StreamCipherSessionManager.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        StreamCipherSessionManager.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = StreamCipherSessionManager.b(227776920899615L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = StreamCipherSessionManager.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        StreamCipherSessionManager.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = StreamCipherSessionManager.b(227776920899615L, 0L);
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
                StreamCipherSessionManager.b = MultiContainerRegistry.a(-5942545829072587678L, -4738933261975351723L, MethodHandles.lookup().lookupClass()).a(44886336106414L);
                StreamCipherSessionManager.l = new Object[5];
                StreamCipherSessionManager.m = new String[5];
                StreamCipherSessionManager.a();
                StreamCipherSessionManager.j = new HashMap<K, V>(13);
                var0 = StreamCipherSessionManager.b ^ 14074947623458L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "Q\u0085r\u00d6F\u00c9\u0081\u0092[\u0094\u00df\u00b3D\u00efN\u0097\u0005\u0098x\u0013\u00f7\u0087\u00e4~tvh\u00fe\u00ef\u008c\u00ed\u00d8XR\u00e0tce\u00f3;.\u001bR@\u00b0Kl\u00e5";
                var7_6 = "Q\u0085r\u00d6F\u00c9\u0081\u0092[\u0094\u00df\u00b3D\u00efN\u0097\u0005\u0098x\u0013\u00f7\u0087\u00e4~tvh\u00fe\u00ef\u008c\u00ed\u00d8XR\u00e0tce\u00f3;.\u001bR@\u00b0Kl\u00e5".length();
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
                    var6_5 = "\u00d4,\u00f8\u00cd\u00a7\u0099\u00c2\u009e\u00c7X\u00c5PJ\u00a4<\u009d";
                    var7_6 = "\u00d4,\u00f8\u00cd\u00a7\u0099\u00c2\u009e\u00c7X\u00c5PJ\u00a4<\u009d".length();
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
        StreamCipherSessionManager.e = var8_3;
        StreamCipherSessionManager.h = new Integer[8];
    }

    @Override
    public boolean j() {
        return false;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = StreamCipherSessionManager.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = StreamCipherSessionManager.b(classArray2[i], string, clazz2, n, classArray);
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
            if (c == '\u00e6' || c == '\u00cb' || c == '\u00c6' || c == '\u00d9') {
                field = StreamCipherSessionManager.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e6' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = StreamCipherSessionManager.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00eb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = StreamCipherSessionManager.a(l, l2);
            object = StreamCipherSessionManager.l[n];
            try {
                if (!(object instanceof String)) break block2;
                StreamCipherSessionManager.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = StreamCipherSessionManager.l[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 6;
                break;
            }
            case 1: {
                n3 = 40;
                break;
            }
            case 2: {
                n3 = 50;
                break;
            }
            case 3: {
                n3 = 5;
                break;
            }
            case 4: {
                n3 = 62;
                break;
            }
            case 5: {
                n3 = 9;
                break;
            }
            case 6: {
                n3 = 38;
                break;
            }
            case 7: {
                n3 = 49;
                break;
            }
            case 8: {
                n3 = 47;
                break;
            }
            case 9: {
                n3 = 27;
                break;
            }
            case 10: {
                n3 = 45;
                break;
            }
            case 11: {
                n3 = 22;
                break;
            }
            case 12: {
                n3 = 20;
                break;
            }
            case 13: {
                n3 = 35;
                break;
            }
            case 14: {
                n3 = 30;
                break;
            }
            case 15: {
                n3 = 4;
                break;
            }
            case 16: {
                n3 = 21;
                break;
            }
            case 17: {
                n3 = 63;
                break;
            }
            case 18: {
                n3 = 29;
                break;
            }
            case 19: {
                n3 = 14;
                break;
            }
            case 20: {
                n3 = 56;
                break;
            }
            case 21: {
                n3 = 61;
                break;
            }
            case 22: {
                n3 = 1;
                break;
            }
            case 23: {
                n3 = 15;
                break;
            }
            case 24: {
                n3 = 8;
                break;
            }
            case 25: {
                n3 = 24;
                break;
            }
            case 26: {
                n3 = 12;
                break;
            }
            case 27: {
                n3 = 0;
                break;
            }
            case 28: {
                n3 = 57;
                break;
            }
            case 29: {
                n3 = 52;
                break;
            }
            case 30: {
                n3 = 11;
                break;
            }
            case 31: {
                n3 = 3;
                break;
            }
            case 32: {
                n3 = 60;
                break;
            }
            case 33: {
                n3 = 46;
                break;
            }
            case 34: {
                n3 = 32;
                break;
            }
            case 35: {
                n3 = 13;
                break;
            }
            case 36: {
                n3 = 34;
                break;
            }
            case 37: {
                n3 = 44;
                break;
            }
            case 38: {
                n3 = 28;
                break;
            }
            case 39: {
                n3 = 17;
                break;
            }
            case 40: {
                n3 = 18;
                break;
            }
            case 41: {
                n3 = 19;
                break;
            }
            case 42: {
                n3 = 58;
                break;
            }
            case 43: {
                n3 = 2;
                break;
            }
            case 44: {
                n3 = 39;
                break;
            }
            case 45: {
                n3 = 51;
                break;
            }
            case 46: {
                n3 = 48;
                break;
            }
            case 47: {
                n3 = 7;
                break;
            }
            case 48: {
                n3 = 55;
                break;
            }
            case 49: {
                n3 = 10;
                break;
            }
            case 50: {
                n3 = 23;
                break;
            }
            case 51: {
                n3 = 36;
                break;
            }
            case 52: {
                n3 = 16;
                break;
            }
            case 53: {
                n3 = 33;
                break;
            }
            case 54: {
                n3 = 59;
                break;
            }
            case 55: {
                n3 = 42;
                break;
            }
            case 56: {
                n3 = 53;
                break;
            }
            case 57: {
                n3 = 37;
                break;
            }
            case 58: {
                n3 = 41;
                break;
            }
            case 59: {
                n3 = 43;
                break;
            }
            case 60: {
                n3 = 31;
                break;
            }
            case 61: {
                n3 = 54;
                break;
            }
            case 62: {
                n3 = 26;
                break;
            }
            default: {
                n3 = 25;
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
        StreamCipherSessionManager.m[n4] = new String(cArray);
        return n4;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = StreamCipherSessionManager.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = StreamCipherSessionManager.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @DataExchangeProtocol2090
    public void Z(ResourceAllocationManager2527 resourceAllocationManager2527) {
        block7: {
            try {
                if (!resourceAllocationManager2527.getEntity().B(ReflectionMetadataResolver.rl)) return;
                if (!this.s()) break block7;
            }
            catch (CustomSystemException customSystemException) {
                throw StreamCipherSessionManager.a(customSystemException);
            }
            this.N = true;
            ExecutionStateTracker executionStateTracker = ApplicationLifecycleManager.N();
            try {
                CryptographicUtility.r(executionStateTracker.s());
                CryptographicUtility.r(executionStateTracker.w());
                CryptographicUtility.r(executionStateTracker.y());
                CryptographicUtility.r(executionStateTracker.h());
                CryptographicUtility.r(executionStateTracker.r());
                if (!this.d.s().booleanValue()) return;
                CryptographicUtility.r(executionStateTracker.f());
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw StreamCipherSessionManager.a(customSystemException);
            }
        }
        try {
            if (this.N) {
                this.y();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamCipherSessionManager.a(customSystemException);
        }
        this.N = false;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5579;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xV", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            StreamCipherSessionManager.h[n2] = n3;
        }
        return h[n2];
    }

    public StreamCipherSessionManager() {
        long l = b ^ 0x537A3B249C39L;
        super(a.cs((int)StreamCipherSessionManager.a("j", (int)26754, (long)(0x1BA3843D622179C5L ^ l))), new Color(193, 113, 0).getRGB(), RecursiveNodeGraph.G, a.cs((int)StreamCipherSessionManager.a("j", (int)13015, (long)(0x5A2D3B2ED46A2391L ^ l))));
        this.A = AuthenticationStateTracker.R(this, (String)((Object)StreamCipherSessionManager.c("\u00d6", (int)StreamCipherSessionManager.a("j", (int)21508, (long)(0x331E83E20261C541L ^ l)), (long)4917709157421065905L, (long)l)), false, (String)((Object)StreamCipherSessionManager.c("\u00d6", (int)StreamCipherSessionManager.a("j", (int)30761, (long)(0x2C8AEB6F0BEE96DL ^ l)), (long)4917709157421065905L, (long)l)));
        this.d = AuthenticationStateTracker.R(this, (String)((Object)StreamCipherSessionManager.c("\u00d6", (int)StreamCipherSessionManager.a("j", (int)2302, (long)(0x58615946CB8819BDL ^ l)), (long)4917709157421065905L, (long)l)), false, (String)((Object)StreamCipherSessionManager.c("\u00d6", (int)StreamCipherSessionManager.a("j", (int)27074, (long)(0x7CE0EE8B57567880L ^ l)), (long)4917709157421065905L, (long)l)));
        this.K = AuthenticationStateTracker.R(this, (String)((Object)StreamCipherSessionManager.c("\u00d6", (int)StreamCipherSessionManager.a("j", (int)13041, (long)(0x50D24E68E3CAA3B1L ^ l)), (long)4917709157421065905L, (long)l)), false, (String)((Object)StreamCipherSessionManager.c("\u00d6", (int)StreamCipherSessionManager.a("j", (int)18137, (long)(0x7721461ABB3E5798L ^ l)), (long)4917709157421065905L, (long)l)));
        this.q(false);
        this.K.D(true);
        this.N(this.A);
        this.N(this.d);
        this.N(this.K);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(StreamCipherSessionManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(StreamCipherSessionManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

