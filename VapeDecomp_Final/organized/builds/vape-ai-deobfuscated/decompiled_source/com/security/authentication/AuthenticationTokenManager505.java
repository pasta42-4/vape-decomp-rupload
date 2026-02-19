/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import a.KB;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.database.query.QueryExecutionHandler;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.graph.structure.RecursiveNodeGraph;
import com.network.clustering.ClusterNodeRegistry1151;
import com.network.configuration.NetworkConfigManager;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.runtime.context.ContextualExecutionFramework;
import com.security.event.SecureEventOrchestrator;
import com.security.selection.CryptoAlgorithmSelector943;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.resource.ResourceOrchestrationManager;
import com.threading.async.AsynchronousExecutionThread;
import com.validation.core.ObjectValidator;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class AuthenticationTokenManager505
extends ContextualExecutionFramework {
    protected boolean T;
    private static final long j;
    private final AsynchronousExecutionThread o;
    private static final long d;
    public ResourceOrchestrationManager A;
    private boolean Z;
    private static final String[] bb;
    private static final Object[] x;

    private static void a() {
        Object[] objectArray = x;
        x[0] = "M\u001d\u0007\u0011";
        objectArray[1] = "\u0005{/$";
        objectArray[2] = Boolean.TYPE;
        AuthenticationTokenManager505.bb[2] = "java/lang/Boolean";
        objectArray[3] = "{\u0006%)*&p\t4fK({\u00020<";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "FITxTo\u001e[\u0001DPSUC\u0005}LbX]ND\n#V^G6_9\u0017[?";
    }

    private static Method d(long l, long l2) {
        int n = AuthenticationTokenManager505.a(l, l2);
        Object object = x[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = bb[n];
                int n3 = string2.indexOf(8);
                clazz3 = AuthenticationTokenManager505.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AuthenticationTokenManager505.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AuthenticationTokenManager505.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        AuthenticationTokenManager505.x[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AuthenticationTokenManager505.b(243543676932585L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AuthenticationTokenManager505.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AuthenticationTokenManager505.x[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AuthenticationTokenManager505.b(243543676932585L, 0L);
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

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean n(ResourceOrchestrationManager resourceOrchestrationManager, SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        return false;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AuthenticationTokenManager505.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public boolean k(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        int n;
        int[] nArray;
        block52: {
            block53: {
                int n2;
                NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                block48: {
                    block49: {
                        block50: {
                            block51: {
                                int n3;
                                SecureEventOrchestrator secureEventOrchestrator;
                                block47: {
                                    block46: {
                                        block45: {
                                            long l = d ^ 0x6B5867EA90BEL;
                                            networkPacketInterceptor1107 = ConfigurationCalibrator.b.B();
                                            secureEventOrchestrator = ApplicationLifecycleManager.X();
                                            nArray = ResourceOrchestrationManager.R();
                                            try {
                                                try {
                                                    n3 = networkPacketInterceptor1107.r();
                                                    if (nArray == null) break block45;
                                                    if (n3 == 0) break block46;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AuthenticationTokenManager505.b(customSystemException);
                                                }
                                                n3 = networkPacketInterceptor1107.q().equals(ObjectValidator.B());
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AuthenticationTokenManager505.b(customSystemException);
                                            }
                                        }
                                        try {
                                            if (nArray == null) break block47;
                                            if (n3 == 0) break block46;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AuthenticationTokenManager505.b(customSystemException);
                                        }
                                        n3 = 1;
                                        break block47;
                                    }
                                    n3 = 0;
                                }
                                n2 = n3;
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        n = this.f();
                                                        if (nArray == null) break block48;
                                                        if (n == 0) break block49;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw AuthenticationTokenManager505.b(customSystemException);
                                                    }
                                                    n = n2;
                                                    if (nArray == null) break block50;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AuthenticationTokenManager505.b(customSystemException);
                                                }
                                                if (n != 0) break block51;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AuthenticationTokenManager505.b(customSystemException);
                                            }
                                            n = secureEventOrchestrator.Y();
                                            if (nArray == null) break block50;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AuthenticationTokenManager505.b(customSystemException);
                                        }
                                        if (n == 0) break block51;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AuthenticationTokenManager505.b(customSystemException);
                                    }
                                    return true;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AuthenticationTokenManager505.b(customSystemException);
                                }
                            }
                            n = GameVersionEnumerator.MC_1_12_2.H();
                        }
                        try {
                            if (nArray == null) break block48;
                            if (n == 0) break block49;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AuthenticationTokenManager505.b(customSystemException);
                        }
                        float f = ApplicationLifecycleManager.U().X(0.5f);
                        try {
                            try {
                                float f2 = f - 1.0f;
                                n = f2 == 0.0f ? 0 : (f2 < 0.0f ? -1 : 1);
                                if (nArray == null) break block48;
                                if (n >= 0) break block49;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AuthenticationTokenManager505.b(customSystemException);
                            }
                            return true;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AuthenticationTokenManager505.b(customSystemException);
                        }
                    }
                    n = this.d();
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (nArray == null) break block52;
                                            if (n == 0) break block53;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AuthenticationTokenManager505.b(customSystemException);
                                        }
                                        n = n2;
                                        if (nArray == null) break block52;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AuthenticationTokenManager505.b(customSystemException);
                                    }
                                    if (n == 0) break block53;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AuthenticationTokenManager505.b(customSystemException);
                                }
                                n = networkPacketInterceptor1107.l().r();
                                if (nArray == null) break block52;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AuthenticationTokenManager505.b(customSystemException);
                            }
                            if (n == 0) break block53;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AuthenticationTokenManager505.b(customSystemException);
                        }
                        n = systemConfigurationOrchestrator.j() ? 1 : 0;
                        if (nArray == null) break block52;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AuthenticationTokenManager505.b(customSystemException);
                    }
                    if (n == 0) break block53;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuthenticationTokenManager505.b(customSystemException);
                }
                int n4 = networkPacketInterceptor1107.l().y();
                try {
                    try {
                        n = n4;
                        if (nArray == null) break block52;
                        if (n <= 12) break block53;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AuthenticationTokenManager505.b(customSystemException);
                    }
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuthenticationTokenManager505.b(customSystemException);
                }
            }
            n = 0;
        }
        try {
            if (nArray == null) {
                AbstractComputationKernel.I(new String[3]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationTokenManager505.b(customSystemException);
        }
        return n != 0;
    }

    public boolean d() {
        return false;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d2' || c == 'q' || c == 'd' || c == 'P') {
                field = AuthenticationTokenManager505.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'q' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AuthenticationTokenManager505.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '$' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'p' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    public AuthenticationTokenManager505(String string, int n, RecursiveNodeGraph recursiveNodeGraph) {
        super(string, n, recursiveNodeGraph, "");
        this.o = new AsynchronousExecutionThread(this);
    }

    public void g() {
        NetworkConfigManager networkConfigManager;
        long l;
        int n;
        block102: {
            block100: {
                AuthenticationTokenManager505 authenticationTokenManager505;
                int n2;
                int[] nArray;
                block98: {
                    block99: {
                        block96: {
                            int n3;
                            long l2;
                            block97: {
                                int n4;
                                block94: {
                                    SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                                    block95: {
                                        block92: {
                                            block93: {
                                                Object object;
                                                block91: {
                                                    int n5;
                                                    block90: {
                                                        AuthenticationTokenManager505 authenticationTokenManager5052;
                                                        long l3;
                                                        block89: {
                                                            ResourceOrchestrationManager resourceOrchestrationManager;
                                                            block87: {
                                                                block88: {
                                                                    long l4;
                                                                    long l5;
                                                                    long l6;
                                                                    block86: {
                                                                        block85: {
                                                                            int n6;
                                                                            block84: {
                                                                                int n7;
                                                                                block82: {
                                                                                    block83: {
                                                                                        block80: {
                                                                                            block81: {
                                                                                                block78: {
                                                                                                    block79: {
                                                                                                        SecureEventOrchestrator secureEventOrchestrator;
                                                                                                        block74: {
                                                                                                            block75: {
                                                                                                                block77: {
                                                                                                                    double d2;
                                                                                                                    block76: {
                                                                                                                        block72: {
                                                                                                                            block73: {
                                                                                                                                block70: {
                                                                                                                                    block71: {
                                                                                                                                        block68: {
                                                                                                                                            block69: {
                                                                                                                                                l3 = d ^ 0x40C54DD0FEC3L;
                                                                                                                                                systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                                                                                                                                secureEventOrchestrator = ApplicationLifecycleManager.X();
                                                                                                                                                n5 = secureEventOrchestrator.Y();
                                                                                                                                                nArray = ResourceOrchestrationManager.R();
                                                                                                                                                try {
                                                                                                                                                    n7 = n5;
                                                                                                                                                    if (nArray == null) break block68;
                                                                                                                                                    if (n7 != 0) break block69;
                                                                                                                                                }
                                                                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                                                                    throw AuthenticationTokenManager505.b(customSystemException);
                                                                                                                                                }
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            n7 = ClusterNodeRegistry1151.W().S().D();
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            if (nArray == null) break block70;
                                                                                                                                            if (n7 != 0) break block71;
                                                                                                                                        }
                                                                                                                                        catch (CustomSystemException customSystemException) {
                                                                                                                                            throw AuthenticationTokenManager505.b(customSystemException);
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    n7 = this.A.M();
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        if (nArray == null) break block72;
                                                                                                                                        if (n7 != 0) break block73;
                                                                                                                                    }
                                                                                                                                    catch (CustomSystemException customSystemException) {
                                                                                                                                        throw AuthenticationTokenManager505.b(customSystemException);
                                                                                                                                    }
                                                                                                                                    this.Z = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                                                    throw AuthenticationTokenManager505.b(customSystemException);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            n7 = this.Z;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (nArray == null) break block74;
                                                                                                                            if (n7 == 0) break block75;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException customSystemException) {
                                                                                                                            throw AuthenticationTokenManager505.b(customSystemException);
                                                                                                                        }
                                                                                                                        this.Z = false;
                                                                                                                        QueryExecutionHandler.q(50L);
                                                                                                                        double d3 = this.o();
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                d2 = d3;
                                                                                                                                if (nArray == null) break block76;
                                                                                                                                if (!(d2 > 0.0)) break block77;
                                                                                                                            }
                                                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                                                throw AuthenticationTokenManager505.b(customSystemException);
                                                                                                                            }
                                                                                                                            d2 = d3;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException customSystemException) {
                                                                                                                            throw AuthenticationTokenManager505.b(customSystemException);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    QueryExecutionHandler.q((long)d2);
                                                                                                                }
                                                                                                                return;
                                                                                                            }
                                                                                                            n7 = this.A.M(systemConfigurationOrchestrator);
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (nArray == null) break block78;
                                                                                                                    if (n7 != 0) break block79;
                                                                                                                }
                                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                                    throw AuthenticationTokenManager505.b(customSystemException);
                                                                                                                }
                                                                                                                n7 = secureEventOrchestrator.Y();
                                                                                                                if (nArray == null) break block78;
                                                                                                            }
                                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                                throw AuthenticationTokenManager505.b(customSystemException);
                                                                                                            }
                                                                                                            if (n7 == 0) break block79;
                                                                                                        }
                                                                                                        catch (CustomSystemException customSystemException) {
                                                                                                            throw AuthenticationTokenManager505.b(customSystemException);
                                                                                                        }
                                                                                                        return;
                                                                                                    }
                                                                                                    n7 = this.G(systemConfigurationOrchestrator);
                                                                                                }
                                                                                                try {
                                                                                                    if (nArray == null) break block80;
                                                                                                    if (n7 == 0) break block81;
                                                                                                }
                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                    throw AuthenticationTokenManager505.b(customSystemException);
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            n7 = this.A.u().s();
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (nArray == null) break block82;
                                                                                                if (n7 <= 20) break block83;
                                                                                            }
                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                throw AuthenticationTokenManager505.b(customSystemException);
                                                                                            }
                                                                                            n7 = 1;
                                                                                            break block82;
                                                                                        }
                                                                                        catch (CustomSystemException customSystemException) {
                                                                                            throw AuthenticationTokenManager505.b(customSystemException);
                                                                                        }
                                                                                    }
                                                                                    n7 = 0;
                                                                                }
                                                                                n = n7;
                                                                                l6 = this.A.h() - 5L;
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            n6 = n;
                                                                                            if (nArray == null) break block84;
                                                                                            if (n6 != 0) break block85;
                                                                                        }
                                                                                        catch (CustomSystemException customSystemException) {
                                                                                            throw AuthenticationTokenManager505.b(customSystemException);
                                                                                        }
                                                                                        long l4 = l6 - 50L;
                                                                                        l4 = 0L;
                                                                                        if (nArray == null) break block86;
                                                                                    }
                                                                                    catch (CustomSystemException customSystemException) {
                                                                                        throw AuthenticationTokenManager505.b(customSystemException);
                                                                                    }
                                                                                    long l7 = l5 - l4;
                                                                                    n6 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw AuthenticationTokenManager505.b(customSystemException);
                                                                                }
                                                                            }
                                                                            if (n6 <= 0) {
                                                                                l6 = 45L;
                                                                            }
                                                                        }
                                                                        long l4 = 100L - Math.min(l6, 99L);
                                                                        l4 = 45L;
                                                                    }
                                                                    double d4 = (double)(l5 + l4) / 100.0;
                                                                    double d5 = 40.0 * d4;
                                                                    Random random = new Random();
                                                                    double d6 = ((double)(30 + random.nextInt() % 10) + d5) / 100.0;
                                                                    l2 = (long)((double)l6 * (1.0 - d6));
                                                                    l = (long)((double)l6 * d6);
                                                                    try {
                                                                        try {
                                                                            resourceOrchestrationManager = this.A;
                                                                            if (nArray == null) break block87;
                                                                            if (resourceOrchestrationManager.M()) break block88;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw AuthenticationTokenManager505.b(customSystemException);
                                                                        }
                                                                        this.Z = true;
                                                                        return;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw AuthenticationTokenManager505.b(customSystemException);
                                                                    }
                                                                }
                                                                try {
                                                                    authenticationTokenManager5052 = this;
                                                                    if (nArray == null) break block89;
                                                                    resourceOrchestrationManager = authenticationTokenManager5052.A;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw AuthenticationTokenManager505.b(customSystemException);
                                                                }
                                                            }
                                                            try {
                                                                if (resourceOrchestrationManager.R() != CryptoAlgorithmSelector943.LEFT) break block90;
                                                                authenticationTokenManager5052 = this;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw AuthenticationTokenManager505.b(customSystemException);
                                                            }
                                                        }
                                                        try {
                                                            object = AuthenticationTokenManager505.c("$", (Object)authenticationTokenManager5052, (Object)systemConfigurationOrchestrator, (long)-1285168125236573629L, (long)l3);
                                                            if (nArray == null) break block91;
                                                            if (object == 0) break block90;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw AuthenticationTokenManager505.b(customSystemException);
                                                        }
                                                        return;
                                                    }
                                                    object = n5 = (int)(ApplicationLifecycleManager.d() ? 1 : 0);
                                                }
                                                if (object == 0) {
                                                    return;
                                                }
                                                networkConfigManager = new NetworkConfigManager();
                                                try {
                                                    n4 = n;
                                                    if (nArray == null) break block92;
                                                    if (n4 == 0) break block93;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AuthenticationTokenManager505.b(customSystemException);
                                                }
                                                long l8 = networkConfigManager.d();
                                                l2 = Math.max(0L, l2 - l8);
                                            }
                                            n4 = this.T ? 1 : 0;
                                        }
                                        try {
                                            try {
                                                if (nArray == null) break block94;
                                                if (n4 == 0) break block95;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AuthenticationTokenManager505.b(customSystemException);
                                            }
                                            this.T = false;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AuthenticationTokenManager505.b(customSystemException);
                                        }
                                    }
                                    this.A.W();
                                    n4 = this.n(this.A, systemConfigurationOrchestrator) ? 1 : 0;
                                }
                                n3 = n4;
                                try {
                                    try {
                                        n2 = n3;
                                        if (nArray == null) break block96;
                                        if (n2 == 0) break block97;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AuthenticationTokenManager505.b(customSystemException);
                                    }
                                    this.A.k();
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AuthenticationTokenManager505.b(customSystemException);
                                }
                            }
                            QueryExecutionHandler.q(l2);
                            networkConfigManager.m();
                            n2 = n3;
                        }
                        try {
                            try {
                                if (nArray == null) break block98;
                                if (n2 == 0) break block99;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AuthenticationTokenManager505.b(customSystemException);
                            }
                            this.A.q();
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AuthenticationTokenManager505.b(customSystemException);
                        }
                    }
                    try {
                        authenticationTokenManager505 = this;
                        if (nArray == null) break block100;
                        n2 = authenticationTokenManager505.T ? 1 : 0;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AuthenticationTokenManager505.b(customSystemException);
                    }
                }
                try {
                    block101: {
                        try {
                            if (n2 != 0) break block101;
                            this.A.c();
                            if (nArray != null) break block102;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AuthenticationTokenManager505.b(customSystemException);
                        }
                    }
                    authenticationTokenManager505 = this;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuthenticationTokenManager505.b(customSystemException);
                }
            }
            authenticationTokenManager505.T = false;
        }
        if (n != 0) {
            long l9 = networkConfigManager.d();
            l = Math.max(0L, l - l9);
        }
        try {
            QueryExecutionHandler.q(l);
            if (AbstractComputationKernel.J() != null) {
                ResourceOrchestrationManager.v(new int[1]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationTokenManager505.b(customSystemException);
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AuthenticationTokenManager505.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AuthenticationTokenManager505.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = AuthenticationTokenManager505.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AuthenticationTokenManager505.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean f() {
        return false;
    }

    @Override
    public void v() {
        this.o.l();
    }

    private static Field c(long l, long l2) {
        int n = AuthenticationTokenManager505.a(l, l2);
        Object object = x[n];
        if (object instanceof String) {
            String string = bb[n];
            int n2 = string.indexOf(8);
            Class clazz = AuthenticationTokenManager505.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AuthenticationTokenManager505.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AuthenticationTokenManager505.a(clazz3, string2, clazz2)) != null) {
                    AuthenticationTokenManager505.x[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AuthenticationTokenManager505.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AuthenticationTokenManager505.x[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AuthenticationTokenManager505.b(243543676932585L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (bb[n4] != null) {
            return n4;
        }
        Object object = x[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 16;
                break;
            }
            case 1: {
                n3 = 14;
                break;
            }
            case 2: {
                n3 = 58;
                break;
            }
            case 3: {
                n3 = 48;
                break;
            }
            case 4: {
                n3 = 61;
                break;
            }
            case 5: {
                n3 = 46;
                break;
            }
            case 6: {
                n3 = 50;
                break;
            }
            case 7: {
                n3 = 6;
                break;
            }
            case 8: {
                n3 = 32;
                break;
            }
            case 9: {
                n3 = 36;
                break;
            }
            case 10: {
                n3 = 13;
                break;
            }
            case 11: {
                n3 = 60;
                break;
            }
            case 12: {
                n3 = 17;
                break;
            }
            case 13: {
                n3 = 41;
                break;
            }
            case 14: {
                n3 = 56;
                break;
            }
            case 15: {
                n3 = 35;
                break;
            }
            case 16: {
                n3 = 52;
                break;
            }
            case 17: {
                n3 = 45;
                break;
            }
            case 18: {
                n3 = 37;
                break;
            }
            case 19: {
                n3 = 53;
                break;
            }
            case 20: {
                n3 = 30;
                break;
            }
            case 21: {
                n3 = 55;
                break;
            }
            case 22: {
                n3 = 5;
                break;
            }
            case 23: {
                n3 = 12;
                break;
            }
            case 24: {
                n3 = 10;
                break;
            }
            case 25: {
                n3 = 25;
                break;
            }
            case 26: {
                n3 = 47;
                break;
            }
            case 27: {
                n3 = 22;
                break;
            }
            case 28: {
                n3 = 20;
                break;
            }
            case 29: {
                n3 = 18;
                break;
            }
            case 30: {
                n3 = 43;
                break;
            }
            case 31: {
                n3 = 27;
                break;
            }
            case 32: {
                n3 = 29;
                break;
            }
            case 33: {
                n3 = 44;
                break;
            }
            case 34: {
                n3 = 8;
                break;
            }
            case 35: {
                n3 = 54;
                break;
            }
            case 36: {
                n3 = 26;
                break;
            }
            case 37: {
                n3 = 57;
                break;
            }
            case 38: {
                n3 = 3;
                break;
            }
            case 39: {
                n3 = 19;
                break;
            }
            case 40: {
                n3 = 34;
                break;
            }
            case 41: {
                n3 = 4;
                break;
            }
            case 42: {
                n3 = 2;
                break;
            }
            case 43: {
                n3 = 1;
                break;
            }
            case 44: {
                n3 = 62;
                break;
            }
            case 45: {
                n3 = 49;
                break;
            }
            case 46: {
                n3 = 38;
                break;
            }
            case 47: {
                n3 = 9;
                break;
            }
            case 48: {
                n3 = 23;
                break;
            }
            case 49: {
                n3 = 11;
                break;
            }
            case 50: {
                n3 = 51;
                break;
            }
            case 51: {
                n3 = 40;
                break;
            }
            case 52: {
                n3 = 33;
                break;
            }
            case 53: {
                n3 = 42;
                break;
            }
            case 54: {
                n3 = 15;
                break;
            }
            case 55: {
                n3 = 31;
                break;
            }
            case 56: {
                n3 = 28;
                break;
            }
            case 57: {
                n3 = 59;
                break;
            }
            case 58: {
                n3 = 0;
                break;
            }
            case 59: {
                n3 = 7;
                break;
            }
            case 60: {
                n3 = 39;
                break;
            }
            case 61: {
                n3 = 63;
                break;
            }
            case 62: {
                n3 = 24;
                break;
            }
            default: {
                n3 = 21;
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
        AuthenticationTokenManager505.bb[n4] = new String(cArray);
        return n4;
    }

    public void u(ResourceOrchestrationManager resourceOrchestrationManager) {
        this.A = resourceOrchestrationManager;
    }

    public double o() {
        return 0.0;
    }

    @DataExchangeProtocol2090
    public final void K(EventTriggerEngine eventTriggerEngine) {
        this.A.W(eventTriggerEngine);
    }

    public boolean L() {
        return false;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AuthenticationTokenManager505.a(l, l2);
            object = x[n];
            try {
                if (!(object instanceof String)) break block2;
                AuthenticationTokenManager505.x[n] = clazz = Class.forName(bb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public boolean G(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        return false;
    }

    public AuthenticationTokenManager505(String string) {
        long l = d ^ 0x5CF0DA37FFEFL;
        super(string, (int)j, RecursiveNodeGraph.X, "");
        this.o = new AsynchronousExecutionThread(this);
    }

    @Override
    public void h() {
        this.o.N();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = MultiContainerRegistry.a(-2186229073244000017L, 1063442701137069444L, MethodHandles.lookup().lookupClass()).a(55315998894502L);
        x = new Object[5];
        bb = new String[5];
        AuthenticationTokenManager505.a();
        long l = d ^ 0x10B062FB5097L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 8491247314906834997L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                j = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    @DataExchangeProtocol2090
    public final void F(KB kB) {
        this.A.K(kB);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AuthenticationTokenManager505.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

