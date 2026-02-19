/*
 * Decompiled with CFR 0.152.
 */
package com.proxy.invocation;

import a.KB;
import a.OU;
import a._Y;
import a.a;
import com.adapter.management.GenericAdapterManager;
import com.app.core.ActionDispatcher;
import com.app.event.EventTrigger;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.event.dispatch.EventDispatchController1028;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.graph.structure.RecursiveNodeGraph;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.transmission.DataTransmissionManager2384;
import com.notification.service.NotificationBroker2532;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.security.authentication.AuthenticationGateway1860;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.core.SystemStateOrchestrator1145;
import com.system.resource.ResourceAllocator1727;
import com.temporal.metadata.TemporalMetadataResolver;
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
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class InvocationProxyManager
extends ContextualExecutionFramework {
    private static final Object[] t;
    private boolean T;
    private final AuthenticationStateTracker X;
    private final NumericFormattingUtility b;
    private static final String[] v;
    private int B;
    private final AuthenticationGateway1860 L;
    private static final Map r;
    private final NumericPrecisionTransformer d;
    private boolean N;
    private final GenericAdapterManager x;
    private final AuthenticationStateTracker o;
    private final AuthenticationStateTracker Z;
    private CryptographicTransformer w;
    private static final Integer[] m;
    private final Random n;
    private final AuthenticationGateway1860 j;
    private static final long[] l;
    private static final long e;
    private final Map<Integer, OU> F;
    private final AuthenticationStateTracker Y;
    private final AuthenticationStateTracker A;
    private long h;

    public AuthenticationStateTracker y() {
        return this.A;
    }

    /*
     * Loose catch block
     */
    private void y() {
        float f;
        try {
            f = this.o.s() != false ? -90.0f : 90.0f;
        }
        catch (Exception exception) {
            throw InvocationProxyManager.a(exception);
        }
        float f2 = f;
        double d2 = this.b.G() - 3.0;
        ResourceAllocator1727 resourceAllocator1727 = ApplicationLifecycleManager.X();
        try {
            if (resourceAllocator1727.Y()) {
                return;
            }
        }
        catch (Exception exception) {
            throw InvocationProxyManager.a(exception);
        }
        try {
            List<NotificationBroker2532>[][] listArray;
            List<NotificationBroker2532>[][] listArray2 = listArray = resourceAllocator1727.I();
            int n = listArray2.length;
            for (int i = 0; i < n; ++i) {
                List<NotificationBroker2532>[] listArray3;
                for (List<NotificationBroker2532> list : listArray3 = listArray2[i]) {
                    for (NotificationBroker2532 notificationBroker2532 : list) {
                        block25: {
                            try {
                                if (notificationBroker2532.Y()) {
                                    continue;
                                }
                            }
                            catch (Exception exception) {
                                throw InvocationProxyManager.a(exception);
                            }
                            if (notificationBroker2532.B(ReflectionMetadataResolver.U7)) break block25;
                            try {
                                if (!notificationBroker2532.B(ReflectionMetadataResolver.Pu)) {
                                    continue;
                                }
                                break block25;
                                catch (Exception exception) {
                                    throw InvocationProxyManager.a(exception);
                                }
                            }
                            catch (Exception exception) {
                                throw InvocationProxyManager.a(exception);
                            }
                        }
                        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                        try {
                            if (systemConfigurationOrchestrator.Y()) {
                                continue;
                            }
                        }
                        catch (Exception exception) {
                            throw InvocationProxyManager.a(exception);
                        }
                        if (!((double)systemConfigurationOrchestrator.y(notificationBroker2532) < this.b.q() + 2.0)) continue;
                        try {
                            block26: {
                                if (!(notificationBroker2532.V() < systemConfigurationOrchestrator.V() + 2.5)) continue;
                                break block26;
                                catch (Exception exception) {
                                    throw InvocationProxyManager.a(exception);
                                }
                            }
                            if (_Y.T(systemConfigurationOrchestrator, notificationBroker2532)) continue;
                        }
                        catch (Exception exception) {
                            throw InvocationProxyManager.a(exception);
                        }
                        float f3 = this.q(systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.B(), notificationBroker2532.F(), notificationBroker2532.B());
                        double d3 = Math.cos(Math.toRadians(f3 + f2)) * d2;
                        double d4 = Math.sin(Math.toRadians(f3 + f2)) * d2;
                        notificationBroker2532.B(notificationBroker2532.F() - d3);
                        notificationBroker2532.A(notificationBroker2532.B() - d4);
                        notificationBroker2532.Z(notificationBroker2532.b() - d3);
                        notificationBroker2532.M(notificationBroker2532.I() - d4);
                    }
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void v() {
        this.F.clear();
    }

    private static Method d(long l, long l2) {
        int n = InvocationProxyManager.a(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = v[n];
                int n3 = string2.indexOf(8);
                clazz3 = InvocationProxyManager.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = InvocationProxyManager.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = InvocationProxyManager.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        InvocationProxyManager.t[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = InvocationProxyManager.b(472387304170085L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = InvocationProxyManager.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        InvocationProxyManager.t[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = InvocationProxyManager.b(472387304170085L, 0L);
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
    public String t() {
        return this.b.p();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = InvocationProxyManager.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = InvocationProxyManager.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void w(KB kB) {
        block4: {
            long l = e ^ 0x74A798C798FDL;
            try {
                try {
                    if (!this.L.o()) break block4;
                    InvocationProxyManager.c("\u00c8", (Object)this, (long)3434091927977466393L, (long)l);
                    if (!this.T) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw InvocationProxyManager.a(customSystemException);
                }
                this.h = System.currentTimeMillis();
                this.T = false;
            }
            catch (CustomSystemException customSystemException) {
                throw InvocationProxyManager.a(customSystemException);
            }
        }
    }

    private void A() {
        float f;
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            if (connectionConfigurationResolver.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw InvocationProxyManager.a(customSystemException);
        }
        try {
            f = this.o.s() != false ? -90.0f : 90.0f;
        }
        catch (CustomSystemException customSystemException) {
            throw InvocationProxyManager.a(customSystemException);
        }
        float f2 = f;
        for (Object e : connectionConfigurationResolver.L()) {
            double d2;
            CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(e);
            if (!cryptographicTransformer.B(ReflectionMetadataResolver.Pr)) continue;
            try {
                if (cryptographicTransformer.B(ReflectionMetadataResolver.rl)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw InvocationProxyManager.a(customSystemException);
            }
            DataTransmissionManager2384 dataTransmissionManager2384 = new DataTransmissionManager2384(e);
            double d3 = this.b.G() - 3.0;
            double d4 = Math.hypot(systemConfigurationOrchestrator.F() - cryptographicTransformer.F(), systemConfigurationOrchestrator.B() - cryptographicTransformer.B());
            float f3 = this.q(systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.B(), cryptographicTransformer.F(), cryptographicTransformer.B());
            double d5 = d4 - d3;
            if (d5 < 0.5 && (d3 += (d2 = d5 - 0.5)) < 0.0) {
                d3 = 0.0;
            }
            d2 = Math.cos(Math.toRadians(f3 + f2)) * d3;
            double d6 = Math.sin(Math.toRadians(f3 + f2)) * d3;
            int n = cryptographicTransformer.X();
            double d7 = cryptographicTransformer.F();
            double d8 = cryptographicTransformer.B();
            OU oU = null;
            boolean bl = false;
            if (this.F.containsKey(n)) {
                oU = this.F.get(n);
                bl = true;
            } else {
                oU = new OU();
                oU.y = n;
            }
            try {
                this.F.put(n, oU);
                oU.D = d7;
                oU.h = d8;
                oU.d = cryptographicTransformer.b();
                oU.O = cryptographicTransformer.I();
                oU.p = dataTransmissionManager2384.A();
                oU.S = dataTransmissionManager2384.h();
                oU.T = dataTransmissionManager2384.u();
                oU.F = dataTransmissionManager2384.T();
                oU.u = oU.D - d2;
                oU.A = oU.h - d6;
                oU.r = oU.d - d2;
                oU.Y = oU.O - d6;
                oU.Q = oU.p - d2;
                oU.x = oU.S - d6;
                if (!bl) continue;
                oU.r = oU.k;
                oU.Y = oU.n;
            }
            catch (CustomSystemException customSystemException) {
                throw InvocationProxyManager.a(customSystemException);
            }
        }
    }

    public double v() {
        block4: {
            long l = e ^ 0x66B7F8AF73E9L;
            try {
                try {
                    if (InvocationProxyManager.c("\u00c8", (Object)this, (long)-4269501074751686069L, (long)l) != false && InvocationProxyManager.c("\u00c8", (Object)this, (long)-4270303168056968599L, (long)l) != false) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw InvocationProxyManager.a(customSystemException);
                }
                return 3.0;
            }
            catch (CustomSystemException customSystemException) {
                throw InvocationProxyManager.a(customSystemException);
            }
        }
        return this.b.l();
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = InvocationProxyManager.a(l, l2);
            object = t[n];
            try {
                if (!(object instanceof String)) break block2;
                InvocationProxyManager.t[n] = clazz = Class.forName(v[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = InvocationProxyManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private boolean f() {
        boolean bl;
        block8: {
            block9: {
                int[] nArray;
                block6: {
                    block7: {
                        long l = e ^ 0x24E5646D3CE7L;
                        nArray = GameVersionEnumerator.q();
                        try {
                            try {
                                bl = this.L.o();
                                if (nArray != null) break block6;
                                if (!bl) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw InvocationProxyManager.a(customSystemException);
                            }
                            return this.N;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw InvocationProxyManager.a(customSystemException);
                        }
                    }
                    double d2 = (Double)this.d.J() - (double)this.n.nextInt(100);
                    bl = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                }
                try {
                    if (nArray != null) break block8;
                    if (bl <= false) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw InvocationProxyManager.a(customSystemException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    private void z(boolean bl) {
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        try {
            if (connectionConfigurationResolver.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw InvocationProxyManager.a(customSystemException);
        }
        for (Map.Entry<Integer, OU> entry : this.F.entrySet()) {
            OU oU = entry.getValue();
            CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(((NetworkProtocolNegotiator)connectionConfigurationResolver).I(oU.y));
            try {
                if (!cryptographicTransformer.r() || !cryptographicTransformer.B(ReflectionMetadataResolver.Pr)) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw InvocationProxyManager.a(customSystemException);
            }
            DataTransmissionManager2384 dataTransmissionManager2384 = new DataTransmissionManager2384(((NetworkProtocolNegotiator)connectionConfigurationResolver).I(oU.y));
            try {
                if (bl) {
                    oU.k = oU.u;
                    oU.n = oU.A;
                    dataTransmissionManager2384.B(oU.D);
                    dataTransmissionManager2384.A(oU.h);
                    dataTransmissionManager2384.Z(oU.d);
                    dataTransmissionManager2384.M(oU.O);
                    dataTransmissionManager2384.N(oU.p);
                    dataTransmissionManager2384.F(oU.S);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw InvocationProxyManager.a(customSystemException);
            }
            dataTransmissionManager2384.R(dataTransmissionManager2384.F(), dataTransmissionManager2384.V(), dataTransmissionManager2384.B());
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @DataExchangeProtocol2090
    public void S(KB kB) {
        try {
            if (!this.A.s().booleanValue()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw InvocationProxyManager.a(customSystemException);
        }
        this.A();
        this.y(false);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = InvocationProxyManager.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'm' || c == '\u00ba' || c == '\u00e8' || c == 'f') {
                field = InvocationProxyManager.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'm' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = InvocationProxyManager.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'p' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void u(ActionDispatcher actionDispatcher) {
        block5: {
            block4: {
                long l = e ^ 0x2DB538116904L;
                int[] nArray = GameVersionEnumerator.q();
                try {
                    InvocationProxyManager invocationProxyManager;
                    try {
                        invocationProxyManager = this;
                        if (nArray != null) break block4;
                        if (!invocationProxyManager.L.o()) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw InvocationProxyManager.a(customSystemException);
                    }
                    invocationProxyManager = this;
                }
                catch (CustomSystemException customSystemException) {
                    throw InvocationProxyManager.a(customSystemException);
                }
            }
            invocationProxyManager.N = false;
        }
    }

    private static void a() {
        Object[] objectArray = t;
        t[0] = "7i\u0001\u001b";
        objectArray[1] = Void.TYPE;
        InvocationProxyManager.v[1] = "java/lang/Void";
        objectArray[2] = Boolean.TYPE;
        InvocationProxyManager.v[2] = "java/lang/Boolean";
        objectArray[3] = "Eq[";
        objectArray[4] = Integer.TYPE;
        InvocationProxyManager.v[4] = "java/lang/Integer";
        objectArray[5] = "<\u0014PA'?7\u001bA\u000eZ'$\u001cHG";
        objectArray[6] = "g\u001d2P3Rl\u0012#\u001fR\\g\u0019'E";
        objectArray[7] = ",\u000beZ\u0005\u000b \u0010e%\u0006bz\fk_D\f1\u00166Az";
        objectArray[8] = "83X\u0005\"|4(Xz6\u0015nu\u0007\u001dms'*\n\u001b]";
        objectArray[9] = "+\u0014}\u0011$B+\u0011v\u001eVSjl=H*]lUm\u001bhY\u0011W\u007fN5Q*\u0013hI18";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "\u000b\u0002gJ\u0014\\\u0007\u0019g5\u00055]\u0005iOU[\u0016\u001f4Qk";
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = InvocationProxyManager.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = InvocationProxyManager.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void c() {
        block55: {
            block56: {
                block57: {
                    block58: {
                        block54: {
                            block52: {
                                block53: {
                                    block51: {
                                        block50: {
                                            block49: {
                                                block48: {
                                                    block45: {
                                                        block47: {
                                                            block46: {
                                                                block44: {
                                                                    var1_1 = InvocationProxyManager.e ^ 32843460319507L;
                                                                    var4_2 = null;
                                                                    var3_3 = GameVersionEnumerator.q();
                                                                    var5_4 = SystemStateOrchestrator1145.j(this.b.q(), 0.0f, true);
                                                                    try {
                                                                        v0 = var5_4;
                                                                        if (var3_3 != null) break block44;
                                                                        if (v0 == null) break block45;
                                                                    }
                                                                    catch (CustomSystemException v1) {
                                                                        throw InvocationProxyManager.a(v1);
                                                                    }
                                                                    v0 = var5_4;
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v2 = v0.r();
                                                                            if (var3_3 != null) break block46;
                                                                            if (!v2) break block45;
                                                                        }
                                                                        catch (CustomSystemException v3) {
                                                                            throw InvocationProxyManager.a(v3);
                                                                        }
                                                                        v4 = var5_4.l();
                                                                        if (var3_3 != null) break block47;
                                                                    }
                                                                    catch (CustomSystemException v5) {
                                                                        throw InvocationProxyManager.a(v5);
                                                                    }
                                                                    v2 = v4.r();
                                                                }
                                                                catch (CustomSystemException v6) {
                                                                    throw InvocationProxyManager.a(v6);
                                                                }
                                                            }
                                                            try {
                                                                if (!v2) break block45;
                                                                v4 = var5_4.l();
                                                            }
                                                            catch (CustomSystemException v7) {
                                                                throw InvocationProxyManager.a(v7);
                                                            }
                                                        }
                                                        var4_2 = v4;
                                                    }
                                                    try {
                                                        try {
                                                            v8 = this;
                                                            if (var3_3 != null) break block48;
                                                            if (v8.B <= 0) break block49;
                                                        }
                                                        catch (CustomSystemException v9) {
                                                            throw InvocationProxyManager.a(v9);
                                                        }
                                                        v8 = this;
                                                    }
                                                    catch (CustomSystemException v10) {
                                                        throw InvocationProxyManager.a(v10);
                                                    }
                                                }
                                                --v8.B;
                                            }
                                            try {
                                                v11 = var4_2;
                                                if (var3_3 != null) break block50;
                                                if (v11 != null) {
                                                }
                                                ** GOTO lbl99
                                            }
                                            catch (CustomSystemException v12) {
                                                throw InvocationProxyManager.a(v12);
                                            }
                                            v11 = var4_2;
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (var3_3 != null) break block51;
                                                    if (!v11.Y()) {
                                                    }
                                                    ** GOTO lbl99
                                                }
                                                catch (CustomSystemException v13) {
                                                    throw InvocationProxyManager.a(v13);
                                                }
                                                v14 = this;
                                                if (var3_3 != null) break block52;
                                            }
                                            catch (CustomSystemException v15) {
                                                throw InvocationProxyManager.a(v15);
                                            }
                                            v11 = v14.w;
                                        }
                                        catch (CustomSystemException v16) {
                                            throw InvocationProxyManager.a(v16);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (v11 == null) break block53;
                                                v17 /* !! */  = var4_2.equals(this.w);
                                                if (var3_3 != null) break block54;
                                            }
                                            catch (CustomSystemException v18) {
                                                throw InvocationProxyManager.a(v18);
                                            }
                                            if (v17 /* !! */ ) break block53;
                                        }
                                        catch (CustomSystemException v19) {
                                            throw InvocationProxyManager.a(v19);
                                        }
lbl99:
                                        // 3 sources

                                        this.w = null;
                                        return;
                                    }
                                    catch (CustomSystemException v20) {
                                        throw InvocationProxyManager.a(v20);
                                    }
                                }
                                v14 = this;
                            }
                            try {
                                if (var3_3 != null) break block55;
                                v17 /* !! */  = InvocationProxyManager.c("\u00c8", (Object)v14, (long)-5889067782714126159L, (long)var1_1);
                            }
                            catch (CustomSystemException v21) {
                                throw InvocationProxyManager.a(v21);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (!v17 /* !! */ ) break block56;
                                        v14 = this;
                                        if (var3_3 != null) break block55;
                                    }
                                    catch (CustomSystemException v22) {
                                        throw InvocationProxyManager.a(v22);
                                    }
                                    if (v14.B != 0) break block56;
                                }
                                catch (CustomSystemException v23) {
                                    throw InvocationProxyManager.a(v23);
                                }
                                v24 = this;
                                cfr_temp_0 = (Double)this.d.J() - (double)this.n.nextInt(100);
                                v25 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                if (var3_3 != null) break block57;
                            }
                            catch (CustomSystemException v26) {
                                throw InvocationProxyManager.a(v26);
                            }
                            if (v25 <= 0) break block58;
                        }
                        catch (CustomSystemException v27) {
                            throw InvocationProxyManager.a(v27);
                        }
                        v25 = (double)true;
                        break block57;
                    }
                    v25 = (double)false;
                }
                try {
                    try {
                        v24.N = v25;
                        v14 = this;
                        if (var3_3 != null) break block55;
                        if (!v14.N) break block56;
                    }
                    catch (CustomSystemException v28) {
                        throw InvocationProxyManager.a(v28);
                    }
                    this.B = (int)InvocationProxyManager.a("i", (int)20416, (long)(2042361154427708289L ^ var1_1));
                }
                catch (CustomSystemException v29) {
                    throw InvocationProxyManager.a(v29);
                }
            }
            v14 = this;
        }
        v14.w = var4_2;
    }

    @DataExchangeProtocol2090
    public void m(EventTriggerEngine eventTriggerEngine) {
        try {
            if (!this.A.s().booleanValue()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw InvocationProxyManager.a(customSystemException);
        }
        this.y(true);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @DataExchangeProtocol2090
    public void J(EventTrigger eventTrigger) {
        try {
            if (!this.A.s().booleanValue()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw InvocationProxyManager.a(customSystemException);
        }
        try {
            this.A();
            this.z(false);
            if (GeometryCalculator.C() <= 15) {
                this.y();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw InvocationProxyManager.a(customSystemException);
        }
    }

    @Override
    public void h() {
        long l = e ^ 0x385A418F71B1L;
        try {
            super.h();
            if (TemporalMetadataResolver.h.s()) {
                TemporalMetadataResolver.h.c().t((String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)1679, (long)(0x37F59E463261C268L ^ l)), (long)-4115033941358251737L, (long)l)), (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)1768, (long)(0x56415843D7914201L ^ l)), (long)-4115033941358251737L, (long)l)), CryptoConfigurationRegistry383.ALERT, 15000L);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw InvocationProxyManager.a(customSystemException);
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x20F;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = InvocationProxyManager.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])r.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    r.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/AR", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            InvocationProxyManager.m[n2] = n3;
        }
        return m[n2];
    }

    private float q(double d2, double d3, double d4, double d5) {
        float f;
        block5: {
            double d6;
            double d7;
            block4: {
                d7 = d4 - d2;
                d6 = d5 - d3;
                f = (float)Math.toDegrees(-Math.atan(d7 / d6));
                try {
                    if (!(d6 < 0.0) || !(d7 < 0.0)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw InvocationProxyManager.a(customSystemException);
                }
                f = (float)(90.0 + Math.toDegrees(Math.atan(d6 / d7)));
                break block5;
            }
            try {
                if (!(d6 < 0.0) || !(d7 > 0.0)) break block5;
            }
            catch (CustomSystemException customSystemException) {
                throw InvocationProxyManager.a(customSystemException);
            }
            f = (float)(-90.0 + Math.toDegrees(Math.atan(d6 / d7)));
        }
        return f;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                InvocationProxyManager.e = MultiContainerRegistry.a(-7854187171089953156L, 5048999489335397703L, MethodHandles.lookup().lookupClass()).a(202786783235779L);
                InvocationProxyManager.t = new Object[11];
                InvocationProxyManager.v = new String[11];
                InvocationProxyManager.a();
                InvocationProxyManager.r = new HashMap<K, V>(13);
                var0 = InvocationProxyManager.e ^ 23646263940157L;
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
                var8_3 = new long[26];
                var5_4 = 0;
                var6_5 = " \u008e\u00f8\u0084\u001f\u008bn\u000b\u008f\u00b3\u001e\u00d7\u00beg\u00e0\u0084hp\u0095\u00cb\u00d0\u00adi\u00a3\u00b9\u00cb\u00a7\u0092\u00d3z\u00dc\u0089`\u00191\u00b0vH\\\u009b\u00d9\u00fa\u00cfi\u00aa\u00e6k\u009b\u00a0i\u0011\u00edw\u00a2\u00cd\u00eaF\u00da\u00ee\u00ca\u00d1\u009f\u00cbT4\u00e0\u00df\u000e$\u009e\u00f2\u009e\u0093+;\u0095\u0092MMx<\u00b7/\u00a8\n^s<\u001es\u00ff'\u00c1>j\u0013;p\u00ed_\u00dd\u0013\u00c2I\u008f,\u00ed\u00e4@\u00c2\u00d1U\u00caR\u00b7\u00bcAZ\\1\u00d8\u00dd\u0001\u00e2\u00b4\u00f7w\u00e3iD\u00d2\u00aa\u001a\u00bb\u001f\u009f\u00f29\u00fe.\u0017\u00d2\u0006\u00c6\u00a7\u00ab\u00eel\u00b8\u00d7y\u00ee\u0092`\u0010Y\u0016\u00e7\u00e9\u00f8&\u00f9\u008c/\u00b6u\u0092\u00cb]\u0093G\u00ec\u00b7\u0083\u00ffU*\u0095Qp\u0019|K\u00fb\u001a%y:\u0002\u0082j\u00b4";
                var7_6 = " \u008e\u00f8\u0084\u001f\u008bn\u000b\u008f\u00b3\u001e\u00d7\u00beg\u00e0\u0084hp\u0095\u00cb\u00d0\u00adi\u00a3\u00b9\u00cb\u00a7\u0092\u00d3z\u00dc\u0089`\u00191\u00b0vH\\\u009b\u00d9\u00fa\u00cfi\u00aa\u00e6k\u009b\u00a0i\u0011\u00edw\u00a2\u00cd\u00eaF\u00da\u00ee\u00ca\u00d1\u009f\u00cbT4\u00e0\u00df\u000e$\u009e\u00f2\u009e\u0093+;\u0095\u0092MMx<\u00b7/\u00a8\n^s<\u001es\u00ff'\u00c1>j\u0013;p\u00ed_\u00dd\u0013\u00c2I\u008f,\u00ed\u00e4@\u00c2\u00d1U\u00caR\u00b7\u00bcAZ\\1\u00d8\u00dd\u0001\u00e2\u00b4\u00f7w\u00e3iD\u00d2\u00aa\u001a\u00bb\u001f\u009f\u00f29\u00fe.\u0017\u00d2\u0006\u00c6\u00a7\u00ab\u00eel\u00b8\u00d7y\u00ee\u0092`\u0010Y\u0016\u00e7\u00e9\u00f8&\u00f9\u008c/\u00b6u\u0092\u00cb]\u0093G\u00ec\u00b7\u0083\u00ffU*\u0095Qp\u0019|K\u00fb\u001a%y:\u0002\u0082j\u00b4".length();
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
                    var6_5 = "p>Gz\u00f7\u00f8\u00c8kC\u0086\u00ddb\u00ff\u00cc3p";
                    var7_6 = "p>Gz\u00f7\u00f8\u00c8kC\u0086\u00ddb\u00ff\u00cc3p".length();
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
        InvocationProxyManager.l = var8_3;
        InvocationProxyManager.m = new Integer[26];
    }

    public InvocationProxyManager() {
        long l = e ^ 0x69FFDFF46DE5L;
        super(a.cs((int)InvocationProxyManager.a("i", (int)11246, (long)(0xE66F99A2450735BL ^ l))), (int)InvocationProxyManager.a("i", (int)16705, (long)(0x1A60ADFC9B19FEL ^ l)), RecursiveNodeGraph.X, a.cs((int)InvocationProxyManager.a("i", (int)24100, (long)(0x7BBB249C72E5068FL ^ l))));
        this.b = NumericFormattingUtility.K(this, (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)749, (long)(0x391CF0EA2DB95A59L ^ l)), (long)-2688605223218221709L, (long)l)), (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)31212, (long)(0x38FC4241A4912150L ^ l)), (long)-2688605223218221709L, (long)l)), "", 3.0, 3.0, 3.1, 4.0, 0.01, (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)12423, (long)(0x1A4AC4290925E836L ^ l)), (long)-2688605223218221709L, (long)l)));
        this.d = NumericPrecisionTransformer.b(this, (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)31112, (long)(0x479FC7A1399A12DL ^ l)), (long)-2688605223218221709L, (long)l)), (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)24578, (long)(0x2548DE240F3038B0L ^ l)), (long)-2688605223218221709L, (long)l)), (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)31681, (long)(0xD2A58DA140A2371L ^ l)), (long)-2688605223218221709L, (long)l)), 0.0, 50.0, 100.0, (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)12600, (long)(0x714457149C9D6980L ^ l)), (long)-2688605223218221709L, (long)l)));
        this.L = new AuthenticationGateway1860((String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)25591, (long)(0x672FDA18DDC93B5BL ^ l)), (long)-2688605223218221709L, (long)l)));
        this.j = new AuthenticationGateway1860((String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)25005, (long)(0x586E173C2F40B914L ^ l)), (long)-2688605223218221709L, (long)l)));
        this.x = GenericAdapterManager.D(this, (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)7988, (long)(0xFD3B572CC66C790L ^ l)), (long)-2688605223218221709L, (long)l)), this.L, this.L, this.j);
        this.A = AuthenticationStateTracker.R(this, (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)3022, (long)(0x3AA642B72DE65375L ^ l)), (long)-2688605223218221709L, (long)l)), false, (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)29027, (long)(0x4A3979493A1829DDL ^ l)), (long)-2688605223218221709L, (long)l)));
        this.o = AuthenticationStateTracker.R(this, (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)29368, (long)(0x5C9160619746AA17L ^ l)), (long)-2688605223218221709L, (long)l)), false, (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)10171, (long)(0xD899D1E5B28FF16L ^ l)), (long)-2688605223218221709L, (long)l)));
        this.Z = AuthenticationStateTracker.R(this, (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)31329, (long)(0x30D8047DB27322DBL ^ l)), (long)-2688605223218221709L, (long)l)), false, (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)16647, (long)(0x6B5C10AAC8BE19AEL ^ l)), (long)-2688605223218221709L, (long)l)));
        this.X = AuthenticationStateTracker.R(this, (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)16816, (long)(0x659532581CDF991EL ^ l)), (long)-2688605223218221709L, (long)l)), false, (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)28228, (long)(0x64C93669D1FB6ECL ^ l)), (long)-2688605223218221709L, (long)l)));
        this.Y = AuthenticationStateTracker.R(this, (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)4151, (long)(0x599F5B064C984881L ^ l)), (long)-2688605223218221709L, (long)l)), false, (String)((Object)InvocationProxyManager.c("p", (int)InvocationProxyManager.a("i", (int)1599, (long)(0x6103AB05EA5F5E95L ^ l)), (long)-2688605223218221709L, (long)l)));
        this.F = new HashMap<Integer, OU>();
        this.n = new Random();
        this.N = false;
        this.B = 0;
        this.A.l(this.o);
        this.b.v(100.0);
        this.N(this.b, this.d, this.x, this.A, this.o, this.Z, this.X, this.Y);
    }

    @DataExchangeProtocol2090
    public void Q(EventDispatchController1028 eventDispatchController1028) {
        try {
            if (!this.A.s().booleanValue()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw InvocationProxyManager.a(customSystemException);
        }
        this.z(true);
    }

    private static Field c(long l, long l2) {
        int n = InvocationProxyManager.a(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            String string = v[n];
            int n2 = string.indexOf(8);
            Class clazz = InvocationProxyManager.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = InvocationProxyManager.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = InvocationProxyManager.a(clazz3, string2, clazz2)) != null) {
                    InvocationProxyManager.t[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = InvocationProxyManager.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        InvocationProxyManager.t[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = InvocationProxyManager.b(472387304170085L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private boolean t() {
        boolean bl;
        block38: {
            block39: {
                int[] nArray;
                block34: {
                    boolean bl2;
                    block35: {
                        boolean bl3;
                        block36: {
                            block37: {
                                boolean bl4;
                                block30: {
                                    block33: {
                                        block31: {
                                            block32: {
                                                long l = e ^ 0x71678CEDD0F9L;
                                                nArray = GameVersionEnumerator.q();
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        bl4 = this.Z();
                                                                        if (nArray != null) break block30;
                                                                        if (!bl4) break block31;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw InvocationProxyManager.a(customSystemException);
                                                                    }
                                                                    bl4 = this.A.S();
                                                                    if (nArray != null) break block30;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw InvocationProxyManager.a(customSystemException);
                                                                }
                                                                if (bl4) break block31;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw InvocationProxyManager.a(customSystemException);
                                                            }
                                                            bl4 = this.Y.s();
                                                            if (nArray != null) break block32;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw InvocationProxyManager.a(customSystemException);
                                                        }
                                                        if (!bl4) break block33;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw InvocationProxyManager.a(customSystemException);
                                                    }
                                                    bl4 = ApplicationLifecycleManager.U().F();
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw InvocationProxyManager.a(customSystemException);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (nArray != null) break block30;
                                                        if (bl4) break block31;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw InvocationProxyManager.a(customSystemException);
                                                    }
                                                    bl4 = ApplicationLifecycleManager.U().x();
                                                    if (nArray != null) break block30;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw InvocationProxyManager.a(customSystemException);
                                                }
                                                if (!bl4) break block33;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw InvocationProxyManager.a(customSystemException);
                                            }
                                        }
                                        bl4 = true;
                                        break block30;
                                    }
                                    bl4 = false;
                                }
                                bl2 = bl4;
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    bl = bl2;
                                                    if (nArray != null) break block34;
                                                    if (bl) break block35;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw InvocationProxyManager.a(customSystemException);
                                                }
                                                bl = this.X.s();
                                                if (nArray != null) break block34;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw InvocationProxyManager.a(customSystemException);
                                            }
                                            if (!bl) break block35;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw InvocationProxyManager.a(customSystemException);
                                        }
                                        bl3 = ApplicationLifecycleManager.U().o();
                                        if (nArray != null) break block36;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw InvocationProxyManager.a(customSystemException);
                                    }
                                    if (bl3) break block37;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw InvocationProxyManager.a(customSystemException);
                                }
                                bl3 = true;
                                break block36;
                            }
                            bl3 = false;
                        }
                        bl2 = bl3;
                    }
                    bl = bl2;
                }
                try {
                    if (nArray != null) break block38;
                    if (bl) break block39;
                }
                catch (CustomSystemException customSystemException) {
                    throw InvocationProxyManager.a(customSystemException);
                }
                bl = true;
                break block38;
            }
            bl = false;
        }
        return bl;
    }

    private void y(boolean bl) {
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        try {
            if (connectionConfigurationResolver.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw InvocationProxyManager.a(customSystemException);
        }
        for (Object e : connectionConfigurationResolver.L()) {
            CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(e);
            if (!cryptographicTransformer.B(ReflectionMetadataResolver.Pr)) continue;
            try {
                if (cryptographicTransformer.B(ReflectionMetadataResolver.rl)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw InvocationProxyManager.a(customSystemException);
            }
            DataTransmissionManager2384 dataTransmissionManager2384 = new DataTransmissionManager2384(e);
            int n = cryptographicTransformer.X();
            double d2 = cryptographicTransformer.F();
            double d3 = cryptographicTransformer.B();
            OU oU = null;
            if (this.F.containsKey(n)) {
                oU = this.F.get(n);
            } else {
                oU = new OU();
                oU.y = n;
            }
            try {
                this.F.put(n, oU);
                oU.D = d2;
                oU.h = d3;
                oU.d = cryptographicTransformer.b();
                oU.O = cryptographicTransformer.I();
                oU.p = dataTransmissionManager2384.A();
                oU.S = dataTransmissionManager2384.h();
                oU.T = dataTransmissionManager2384.u();
                oU.F = dataTransmissionManager2384.T();
                if (bl) {
                    dataTransmissionManager2384.B(oU.u);
                    dataTransmissionManager2384.A(oU.A);
                    dataTransmissionManager2384.Z(oU.r);
                    dataTransmissionManager2384.M(oU.Y);
                    dataTransmissionManager2384.N(oU.Q);
                    dataTransmissionManager2384.F(oU.x);
                    dataTransmissionManager2384.R(cryptographicTransformer.F(), cryptographicTransformer.V(), cryptographicTransformer.B());
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw InvocationProxyManager.a(customSystemException);
            }
            dataTransmissionManager2384.B(oU.u);
            dataTransmissionManager2384.A(oU.A);
            dataTransmissionManager2384.R(cryptographicTransformer.F(), cryptographicTransformer.V(), cryptographicTransformer.B());
            dataTransmissionManager2384.B(oU.D);
            dataTransmissionManager2384.A(oU.h);
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (v[n4] != null) {
            return n4;
        }
        Object object = t[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 22;
                break;
            }
            case 1: {
                n3 = 33;
                break;
            }
            case 2: {
                n3 = 60;
                break;
            }
            case 3: {
                n3 = 58;
                break;
            }
            case 4: {
                n3 = 20;
                break;
            }
            case 5: {
                n3 = 49;
                break;
            }
            case 6: {
                n3 = 43;
                break;
            }
            case 7: {
                n3 = 41;
                break;
            }
            case 8: {
                n3 = 42;
                break;
            }
            case 9: {
                n3 = 45;
                break;
            }
            case 10: {
                n3 = 19;
                break;
            }
            case 11: {
                n3 = 24;
                break;
            }
            case 12: {
                n3 = 8;
                break;
            }
            case 13: {
                n3 = 1;
                break;
            }
            case 14: {
                n3 = 63;
                break;
            }
            case 15: {
                n3 = 4;
                break;
            }
            case 16: {
                n3 = 31;
                break;
            }
            case 17: {
                n3 = 28;
                break;
            }
            case 18: {
                n3 = 7;
                break;
            }
            case 19: {
                n3 = 37;
                break;
            }
            case 20: {
                n3 = 50;
                break;
            }
            case 21: {
                n3 = 9;
                break;
            }
            case 22: {
                n3 = 53;
                break;
            }
            case 23: {
                n3 = 46;
                break;
            }
            case 24: {
                n3 = 17;
                break;
            }
            case 25: {
                n3 = 52;
                break;
            }
            case 26: {
                n3 = 34;
                break;
            }
            case 27: {
                n3 = 12;
                break;
            }
            case 28: {
                n3 = 0;
                break;
            }
            case 29: {
                n3 = 3;
                break;
            }
            case 30: {
                n3 = 13;
                break;
            }
            case 31: {
                n3 = 23;
                break;
            }
            case 32: {
                n3 = 16;
                break;
            }
            case 33: {
                n3 = 36;
                break;
            }
            case 34: {
                n3 = 21;
                break;
            }
            case 35: {
                n3 = 44;
                break;
            }
            case 36: {
                n3 = 38;
                break;
            }
            case 37: {
                n3 = 47;
                break;
            }
            case 38: {
                n3 = 62;
                break;
            }
            case 39: {
                n3 = 26;
                break;
            }
            case 40: {
                n3 = 56;
                break;
            }
            case 41: {
                n3 = 61;
                break;
            }
            case 42: {
                n3 = 40;
                break;
            }
            case 43: {
                n3 = 39;
                break;
            }
            case 44: {
                n3 = 10;
                break;
            }
            case 45: {
                n3 = 48;
                break;
            }
            case 46: {
                n3 = 2;
                break;
            }
            case 47: {
                n3 = 27;
                break;
            }
            case 48: {
                n3 = 18;
                break;
            }
            case 49: {
                n3 = 25;
                break;
            }
            case 50: {
                n3 = 32;
                break;
            }
            case 51: {
                n3 = 30;
                break;
            }
            case 52: {
                n3 = 14;
                break;
            }
            case 53: {
                n3 = 54;
                break;
            }
            case 54: {
                n3 = 35;
                break;
            }
            case 55: {
                n3 = 29;
                break;
            }
            case 56: {
                n3 = 15;
                break;
            }
            case 57: {
                n3 = 11;
                break;
            }
            case 58: {
                n3 = 5;
                break;
            }
            case 59: {
                n3 = 55;
                break;
            }
            case 60: {
                n3 = 6;
                break;
            }
            case 61: {
                n3 = 51;
                break;
            }
            case 62: {
                n3 = 57;
                break;
            }
            default: {
                n3 = 59;
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
        InvocationProxyManager.v[n4] = new String(cArray);
        return n4;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(InvocationProxyManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(InvocationProxyManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

