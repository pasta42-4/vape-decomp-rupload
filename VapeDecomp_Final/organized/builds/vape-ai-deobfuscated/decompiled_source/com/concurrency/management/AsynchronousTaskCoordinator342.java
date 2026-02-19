/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.stream.JsonReader
 */
package com.concurrency.management;

import a._b;
import a.a;
import a.ec;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.sync.BackgroundSynchronizationWorker;
import com.data.serialization.SerializationOrchestrator;
import com.encryption.core.CryptoExceptionHandler;
import com.exception.system.CustomSystemException;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.identity.management.UniqueIdentifierManager;
import com.json.processing.JsonTransformationCoordinator;
import com.reflection.dynamic.RuntimeReflectionResolver;
import com.security.constants.CipherMode;
import com.system.configuration.ConfigurationProfileManager288;
import com.system.lifecycle.SystemLifecycleController;
import com.temporal.metadata.TemporalMetadataResolver;
import com.threading.executor.BackgroundTaskExecutor1258;
import com.transaction.model.TransactionDescriptor;
import com.transaction.monitoring.TransactionStatusTracker;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class AsynchronousTaskCoordinator342 {
    private boolean J = false;
    private static final Map d;
    private static final Object[] f;
    private BackgroundSynchronizationWorker e;
    private static final String[] g;
    private final AtomicBoolean r = new AtomicBoolean();
    private static final long a;
    private final BackgroundTaskExecutor1258 y = new BackgroundTaskExecutor1258();
    private static final long[] b;
    private final TemporalMetadataResolver T;
    static final boolean t;
    private static final Integer[] c;

    /*
     * Loose catch block
     */
    private void Z() {
        if (!SystemLifecycleController.C.q().n()) {
            try {
                _b.S().p().i(CipherMode.ONLINE, SystemLifecycleController.C.q().U());
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        try {
            block9: {
                boolean[] blArray = a.a.gls();
                boolean bl = blArray[0];
                boolean bl2 = blArray[1];
                if (this.J) break block9;
                try {
                    block11: {
                        if (!bl) break block9;
                        break block11;
                        catch (Exception exception) {
                            throw AsynchronousTaskCoordinator342.a(exception);
                        }
                    }
                    SystemLifecycleController.C.c().N().F(true);
                    SystemLifecycleController.C.c().N().H(bl2);
                    SystemLifecycleController.C.c().N().F(false);
                    this.J = true;
                }
                catch (Exception exception) {
                    throw AsynchronousTaskCoordinator342.a(exception);
                }
            }
            SystemLifecycleController.C.c().l();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/k6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AsynchronousTaskCoordinator342.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(long l, long l2) {
        int n = AsynchronousTaskCoordinator342.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = AsynchronousTaskCoordinator342.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AsynchronousTaskCoordinator342.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AsynchronousTaskCoordinator342.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        AsynchronousTaskCoordinator342.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AsynchronousTaskCoordinator342.b(250334785246834L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AsynchronousTaskCoordinator342.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AsynchronousTaskCoordinator342.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AsynchronousTaskCoordinator342.b(250334785246834L, 0L);
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = f[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 33;
                break;
            }
            case 1: {
                n3 = 49;
                break;
            }
            case 2: {
                n3 = 16;
                break;
            }
            case 3: {
                n3 = 38;
                break;
            }
            case 4: {
                n3 = 37;
                break;
            }
            case 5: {
                n3 = 39;
                break;
            }
            case 6: {
                n3 = 53;
                break;
            }
            case 7: {
                n3 = 26;
                break;
            }
            case 8: {
                n3 = 31;
                break;
            }
            case 9: {
                n3 = 4;
                break;
            }
            case 10: {
                n3 = 46;
                break;
            }
            case 11: {
                n3 = 22;
                break;
            }
            case 12: {
                n3 = 1;
                break;
            }
            case 13: {
                n3 = 51;
                break;
            }
            case 14: {
                n3 = 21;
                break;
            }
            case 15: {
                n3 = 6;
                break;
            }
            case 16: {
                n3 = 18;
                break;
            }
            case 17: {
                n3 = 5;
                break;
            }
            case 18: {
                n3 = 27;
                break;
            }
            case 19: {
                n3 = 48;
                break;
            }
            case 20: {
                n3 = 35;
                break;
            }
            case 21: {
                n3 = 28;
                break;
            }
            case 22: {
                n3 = 43;
                break;
            }
            case 23: {
                n3 = 60;
                break;
            }
            case 24: {
                n3 = 55;
                break;
            }
            case 25: {
                n3 = 52;
                break;
            }
            case 26: {
                n3 = 61;
                break;
            }
            case 27: {
                n3 = 29;
                break;
            }
            case 28: {
                n3 = 56;
                break;
            }
            case 29: {
                n3 = 50;
                break;
            }
            case 30: {
                n3 = 32;
                break;
            }
            case 31: {
                n3 = 10;
                break;
            }
            case 32: {
                n3 = 19;
                break;
            }
            case 33: {
                n3 = 47;
                break;
            }
            case 34: {
                n3 = 11;
                break;
            }
            case 35: {
                n3 = 54;
                break;
            }
            case 36: {
                n3 = 7;
                break;
            }
            case 37: {
                n3 = 41;
                break;
            }
            case 38: {
                n3 = 17;
                break;
            }
            case 39: {
                n3 = 25;
                break;
            }
            case 40: {
                n3 = 40;
                break;
            }
            case 41: {
                n3 = 34;
                break;
            }
            case 42: {
                n3 = 62;
                break;
            }
            case 43: {
                n3 = 0;
                break;
            }
            case 44: {
                n3 = 8;
                break;
            }
            case 45: {
                n3 = 23;
                break;
            }
            case 46: {
                n3 = 57;
                break;
            }
            case 47: {
                n3 = 30;
                break;
            }
            case 48: {
                n3 = 14;
                break;
            }
            case 49: {
                n3 = 44;
                break;
            }
            case 50: {
                n3 = 20;
                break;
            }
            case 51: {
                n3 = 13;
                break;
            }
            case 52: {
                n3 = 2;
                break;
            }
            case 53: {
                n3 = 3;
                break;
            }
            case 54: {
                n3 = 15;
                break;
            }
            case 55: {
                n3 = 24;
                break;
            }
            case 56: {
                n3 = 59;
                break;
            }
            case 57: {
                n3 = 58;
                break;
            }
            case 58: {
                n3 = 63;
                break;
            }
            case 59: {
                n3 = 42;
                break;
            }
            case 60: {
                n3 = 36;
                break;
            }
            case 61: {
                n3 = 12;
                break;
            }
            case 62: {
                n3 = 45;
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
        AsynchronousTaskCoordinator342.g[n4] = new String(cArray);
        return n4;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public void G() {
        block62: {
            var1_1 = AsynchronousTaskCoordinator342.a ^ 122946913071903L;
            try {
                block60: {
                    block61: {
                        block69: {
                            block68: {
                                block59: {
                                    block56: {
                                        block58: {
                                            block66: {
                                                block57: {
                                                    block54: {
                                                        block52: {
                                                            block55: {
                                                                block64: {
                                                                    block53: {
                                                                        var3_2 = new ConfigurationProfileManager288();
                                                                        try {
                                                                            if (!this.T.F().X.s().booleanValue()) {
                                                                                this.T.c().e(var3_2, true);
                                                                            }
                                                                        }
                                                                        catch (Throwable v0) {
                                                                            throw AsynchronousTaskCoordinator342.a(v0);
                                                                        }
                                                                        this.Z();
                                                                        try {
                                                                            if (TemporalMetadataResolver.h.o().W() != null) {
                                                                                TemporalMetadataResolver.h.o().W().y();
                                                                            }
                                                                        }
                                                                        catch (Throwable var4_4) {
                                                                            TemporalMetadataResolver.W(var4_4);
                                                                        }
                                                                        var4_5 = this.Y(true);
                                                                        var5_6 = this.T.o().Q(true);
                                                                        for (Object var7_8 : this.T.o().T()) {
                                                                            var7_8.m(true);
                                                                        }
                                                                        var6_7 = (TransactionStatusTracker)_b.S().c().s(var4_5).exceptionally((Function<Throwable, TransactionStatusTracker>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$storeSettings$1(com.system.configuration.ConfigurationProfileManager288 java.lang.Throwable ), (Ljava/lang/Throwable;)Lcom/transaction/monitoring/TransactionStatusTracker;)((ConfigurationProfileManager288)var3_2)).join();
                                                                        if (var6_7 == null) break block52;
                                                                        try {
                                                                            block63: {
                                                                                if (!var6_7.b()) break block53;
                                                                                break block63;
                                                                                catch (Throwable v1) {
                                                                                    throw AsynchronousTaskCoordinator342.a(v1);
                                                                                }
                                                                            }
                                                                            var3_2.S(1);
                                                                            break block54;
                                                                        }
                                                                        catch (Throwable v2) {
                                                                            throw AsynchronousTaskCoordinator342.a(v2);
                                                                        }
                                                                    }
                                                                    if (var6_7.A() == null) break block55;
                                                                    if (var6_7.A().contains((CharSequence)AsynchronousTaskCoordinator342.b("n", (int)AsynchronousTaskCoordinator342.a("m", (int)26177, (long)(7435662734210930697L ^ var1_1)), (long)-3894124154080570236L, (long)var1_1))) ** GOTO lbl49
                                                                    break block64;
                                                                    catch (Throwable v3) {
                                                                        throw AsynchronousTaskCoordinator342.a(v3);
                                                                    }
                                                                }
                                                                try {
                                                                    block65: {
                                                                        if (!var6_7.A().contains((CharSequence)AsynchronousTaskCoordinator342.b("n", (int)AsynchronousTaskCoordinator342.a("m", (int)17892, (long)(5624839300296031142L ^ var1_1)), (long)-3894124154080570236L, (long)var1_1))) break block55;
                                                                        break block65;
                                                                        catch (Throwable v4) {
                                                                            throw AsynchronousTaskCoordinator342.a(v4);
                                                                        }
                                                                    }
                                                                    var3_2.S(3);
                                                                    break block54;
                                                                }
                                                                catch (Throwable v5) {
                                                                    throw AsynchronousTaskCoordinator342.a(v5);
                                                                }
                                                            }
                                                            var3_2.S(4);
                                                            break block54;
                                                        }
                                                        try {
                                                            if (var3_2.H() == 1) {
                                                                var3_2.S(5);
                                                            }
                                                        }
                                                        catch (Throwable v6) {
                                                            throw AsynchronousTaskCoordinator342.a(v6);
                                                        }
                                                    }
                                                    var7_8 = (TransactionStatusTracker)_b.S().c().M(var5_6).exceptionally((Function<Throwable, TransactionStatusTracker>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$storeSettings$2(com.system.configuration.ConfigurationProfileManager288 java.lang.Throwable ), (Ljava/lang/Throwable;)Lcom/transaction/monitoring/TransactionStatusTracker;)((ConfigurationProfileManager288)var3_2)).join();
                                                    try {
                                                        if (var7_8 == null) break block56;
                                                        if (!var7_8.b()) break block57;
                                                    }
                                                    catch (Throwable v7) {
                                                        throw AsynchronousTaskCoordinator342.a(v7);
                                                    }
                                                    var3_2.X(1);
                                                    for (Object var9_10 : this.T.o().T()) {
                                                        var9_10.j(false);
                                                    }
                                                    break block59;
                                                }
                                                if (var7_8.A() == null) break block58;
                                                if (var7_8.A().contains((CharSequence)AsynchronousTaskCoordinator342.b("n", (int)AsynchronousTaskCoordinator342.a("m", (int)5303, (long)(5991065300987669243L ^ var1_1)), (long)-3894124154080570236L, (long)var1_1))) ** GOTO lbl91
                                                break block66;
                                                catch (Throwable v8) {
                                                    throw AsynchronousTaskCoordinator342.a(v8);
                                                }
                                            }
                                            try {
                                                block67: {
                                                    if (!var7_8.A().contains((CharSequence)AsynchronousTaskCoordinator342.b("n", (int)AsynchronousTaskCoordinator342.a("m", (int)19761, (long)(4667669868427129720L ^ var1_1)), (long)-3894124154080570236L, (long)var1_1))) break block58;
                                                    break block67;
                                                    catch (Throwable v9) {
                                                        throw AsynchronousTaskCoordinator342.a(v9);
                                                    }
                                                }
                                                var3_2.X(3);
                                                break block59;
                                            }
                                            catch (Throwable v10) {
                                                throw AsynchronousTaskCoordinator342.a(v10);
                                            }
                                        }
                                        var3_2.X(4);
                                        var3_2.G(var7_8.A());
                                        break block59;
                                    }
                                    try {
                                        if (var3_2.Y() != 1) ** GOTO lbl107
                                        var3_2.X(5);
                                    }
                                    catch (Throwable v11) {
                                        throw AsynchronousTaskCoordinator342.a(v11);
                                    }
                                }
                                if (var7_8 == null) break block60;
                                if (!var7_8.b()) break block60;
                                break block68;
                                catch (Throwable v12) {
                                    throw AsynchronousTaskCoordinator342.a(v12);
                                }
                            }
                            if (AsynchronousTaskCoordinator342.t) break block61;
                            break block69;
                            catch (Throwable v13) {
                                throw AsynchronousTaskCoordinator342.a(v13);
                            }
                        }
                        try {
                            block70: {
                                if (var7_8.h() != null) break block61;
                                break block70;
                                catch (Throwable v14) {
                                    throw AsynchronousTaskCoordinator342.a(v14);
                                }
                            }
                            throw new AssertionError();
                        }
                        catch (Throwable v15) {
                            throw AsynchronousTaskCoordinator342.a(v15);
                        }
                    }
                    var8_9 = (RuntimeReflectionResolver)var7_8.h();
                    for (TransactionDescriptor var10_11 : this.T.o().T()) {
                        var11_12 = var8_9.A().values().stream().filter((Predicate<UniqueIdentifierManager>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$storeSettings$3(com.transaction.model.TransactionDescriptor com.identity.management.UniqueIdentifierManager ), (Lcom/identity/management/UniqueIdentifierManager;)Z)((TransactionDescriptor)var10_11)).findFirst().orElse(null);
                        try {
                            if (var11_12 == null) {
                                continue;
                            }
                        }
                        catch (Throwable v16) {
                            throw AsynchronousTaskCoordinator342.a(v16);
                        }
                        try {
                            if (var11_12.T().equals(var10_11.k())) {
                                continue;
                            }
                        }
                        catch (Throwable v17) {
                            throw AsynchronousTaskCoordinator342.a(v17);
                        }
                        var10_11.F(var11_12.T());
                    }
                }
                var3_2.u();
                if (!var3_2.u()) break block62;
                try {
                    block71: {
                        if (!this.T.F().X.s().booleanValue()) break block62;
                        break block71;
                        catch (Throwable v18) {
                            throw AsynchronousTaskCoordinator342.a(v18);
                        }
                    }
                    this.T.c().h(var3_2);
                }
                catch (Throwable v19) {
                    throw AsynchronousTaskCoordinator342.a(v19);
                }
            }
            catch (Exception var3_3) {
                TemporalMetadataResolver.W(var3_3);
            }
        }
        this.r.set(false);
    }

    public boolean h() {
        return this.r.get();
    }

    public void c() {
        this.r.set(false);
    }

    public void M() {
        try {
            this.r.set(false);
            if (this.e == null) {
                this.e = new BackgroundSynchronizationWorker();
                new Thread(this.e).start();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskCoordinator342.a(customSystemException);
        }
        this.e.z();
    }

    private static boolean lambda$storeSettings$3(TransactionDescriptor transactionDescriptor, UniqueIdentifierManager uniqueIdentifierManager) {
        boolean bl;
        block5: {
            block4: {
                long l = a ^ 0x2BFC1079D22AL;
                try {
                    try {
                        if (!uniqueIdentifierManager.S().equals(transactionDescriptor.T()) && !uniqueIdentifierManager.S().equals((String)((Object)AsynchronousTaskCoordinator342.b("n", (int)AsynchronousTaskCoordinator342.a("m", (int)361, (long)(0x81E116D1F8ADE1DL ^ l)), (long)7548049036028147121L, (long)l)) + ec.A(transactionDescriptor.T()))) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousTaskCoordinator342.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskCoordinator342.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public JsonObject Y(boolean bl) {
        CallSite callSite;
        JsonObject jsonObject;
        long l = a ^ 0x5B118CE3C763L;
        JsonObject jsonObject2 = new JsonObject();
        try {
            jsonObject2.add((String)((Object)AsynchronousTaskCoordinator342.b("n", (int)AsynchronousTaskCoordinator342.a("m", (int)32, (long)(0x1BA77007936BCA16L ^ l)), (long)9045900376103313656L, (long)l)), (JsonElement)TemporalMetadataResolver.h.j().P());
            jsonObject = jsonObject2;
            callSite = bl ? AsynchronousTaskCoordinator342.b("n", (int)AsynchronousTaskCoordinator342.a("m", (int)123, (long)(0x6AE71BCAB7634A49L ^ l)), (long)9045900376103313656L, (long)l) : AsynchronousTaskCoordinator342.b("n", (int)AsynchronousTaskCoordinator342.a("m", (int)1712, (long)(0x24BB6420505C4C8CL ^ l)), (long)9045900376103313656L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskCoordinator342.a(customSystemException);
        }
        try {
            jsonObject.add((String)((Object)callSite), (JsonElement)TemporalMetadataResolver.h.V().B());
            if (!bl) {
                jsonObject2.add((String)((Object)AsynchronousTaskCoordinator342.b("n", (int)AsynchronousTaskCoordinator342.a("m", (int)31201, (long)(0xA31D1814AF133D0L ^ l)), (long)9045900376103313656L, (long)l)), (JsonElement)TemporalMetadataResolver.h.o().Q(false));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskCoordinator342.a(customSystemException);
        }
        return jsonObject2;
    }

    private static TransactionStatusTracker lambda$storeSettings$2(ConfigurationProfileManager288 configurationProfileManager288, Throwable throwable) {
        block7: {
            block6: {
                Throwable throwable2;
                Throwable throwable3 = throwable;
                while ((throwable2 = throwable.getCause()) != null) {
                    throwable = throwable2;
                }
                try {
                    if (!(throwable instanceof CryptoExceptionHandler)) break block6;
                    configurationProfileManager288.X(((CryptoExceptionHandler)throwable).e());
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskCoordinator342.a(customSystemException);
                }
            }
            try {
                configurationProfileManager288.X(2);
                if (throwable instanceof IOException) {
                    configurationProfileManager288.j(throwable.getClass().getName());
                    configurationProfileManager288.e(throwable.getMessage());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskCoordinator342.a(customSystemException);
            }
        }
        return null;
    }

    public AsynchronousTaskCoordinator342(TemporalMetadataResolver temporalMetadataResolver) {
        this.T = temporalMetadataResolver;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = AsynchronousTaskCoordinator342.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AsynchronousTaskCoordinator342.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = AsynchronousTaskCoordinator342.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = AsynchronousTaskCoordinator342.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AsynchronousTaskCoordinator342.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AsynchronousTaskCoordinator342.a(clazz3, string2, clazz2)) != null) {
                    AsynchronousTaskCoordinator342.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AsynchronousTaskCoordinator342.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AsynchronousTaskCoordinator342.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AsynchronousTaskCoordinator342.b(250334785246834L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static TransactionStatusTracker lambda$storeSettings$1(ConfigurationProfileManager288 configurationProfileManager288, Throwable throwable) {
        block4: {
            block3: {
                Throwable throwable2;
                Throwable throwable3 = throwable;
                while ((throwable2 = throwable.getCause()) != null) {
                    throwable = throwable2;
                }
                try {
                    if (!(throwable instanceof CryptoExceptionHandler)) break block3;
                    configurationProfileManager288.S(((CryptoExceptionHandler)throwable).e());
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskCoordinator342.a(customSystemException);
                }
            }
            configurationProfileManager288.S(2);
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/k6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x37BF;
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
                throw new RuntimeException("a/k6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AsynchronousTaskCoordinator342.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AsynchronousTaskCoordinator342.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AsynchronousTaskCoordinator342.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                AsynchronousTaskCoordinator342.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fc' || c == '\u00e0' || c == '\u00f6' || c == 'o') {
                field = AsynchronousTaskCoordinator342.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AsynchronousTaskCoordinator342.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ca' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'n' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Loose catch block
     */
    public void F() {
        block23: {
            long l = a ^ 0x26952F322634L;
            try {
                String string;
                block25: {
                    TransactionStatusTracker transactionStatusTracker;
                    block24: {
                        block26: {
                            block22: {
                                boolean bl = this.T.r().Z();
                                if (!bl) {
                                    // empty if block
                                }
                                if (!bl) break block25;
                                transactionStatusTracker = (TransactionStatusTracker)((CompletableFuture)_b.S().c().E().exceptionally(AsynchronousTaskCoordinator342::lambda$fetchSettings$0)).join();
                                try {
                                    if (transactionStatusTracker != null) break block22;
                                    break block23;
                                }
                                catch (Throwable throwable) {
                                    throw AsynchronousTaskCoordinator342.a(throwable);
                                }
                            }
                            if (!transactionStatusTracker.b()) break block23;
                            if (t) break block24;
                            break block26;
                            catch (Throwable throwable) {
                                throw AsynchronousTaskCoordinator342.a(throwable);
                            }
                        }
                        try {
                            block27: {
                                if (transactionStatusTracker.h() != null) break block24;
                                break block27;
                                catch (Throwable throwable) {
                                    throw AsynchronousTaskCoordinator342.a(throwable);
                                }
                            }
                            throw new AssertionError();
                        }
                        catch (Throwable throwable) {
                            throw AsynchronousTaskCoordinator342.a(throwable);
                        }
                    }
                    JsonTransformationCoordinator jsonTransformationCoordinator = (JsonTransformationCoordinator)transactionStatusTracker.h();
                    HashMap<UUID, JsonObject> hashMap = new HashMap<UUID, JsonObject>();
                    for (UniqueIdentifierManager uniqueIdentifierManager : jsonTransformationCoordinator.j().values()) {
                        hashMap.put(uniqueIdentifierManager.T(), uniqueIdentifierManager.N());
                    }
                    this.T.u().w(jsonTransformationCoordinator.t().values());
                    JsonObject jsonObject = new JsonObject();
                    try {
                        if (jsonTransformationCoordinator.S() != null) {
                            jsonObject.add((String)((Object)AsynchronousTaskCoordinator342.b("n", (int)AsynchronousTaskCoordinator342.a("m", (int)11967, (long)(0x6A7E8054177805D7L ^ l)), (long)-7143267619487612497L, (long)l)), (JsonElement)jsonTransformationCoordinator.S());
                        }
                    }
                    catch (Throwable throwable) {
                        throw AsynchronousTaskCoordinator342.a(throwable);
                    }
                    try {
                        jsonObject.add((String)((Object)AsynchronousTaskCoordinator342.b("n", (int)AsynchronousTaskCoordinator342.a("m", (int)29548, (long)(0xC88891AE834D808L ^ l)), (long)-7143267619487612497L, (long)l)), SerializationOrchestrator.q.toJsonTree(hashMap));
                        if (jsonTransformationCoordinator.V() != null) {
                            jsonObject.add((String)((Object)AsynchronousTaskCoordinator342.b("n", (int)AsynchronousTaskCoordinator342.a("m", (int)6174, (long)(0x7EDF2506351C337EL ^ l)), (long)-7143267619487612497L, (long)l)), (JsonElement)jsonTransformationCoordinator.V());
                        }
                    }
                    catch (Throwable throwable) {
                        throw AsynchronousTaskCoordinator342.a(throwable);
                    }
                    TemporalMetadataResolver.h.M(jsonObject, true);
                    break block23;
                }
                CallSite callSite = AsynchronousTaskCoordinator342.b("n", (long)-7143138250368547492L, (long)l);
                try {
                    string = callSite == null ? "" : new String(ec.S((String)((Object)callSite))).trim();
                }
                catch (Throwable throwable) {
                    throw AsynchronousTaskCoordinator342.a(throwable);
                }
                String string2 = string;
                JsonReader jsonReader = new JsonReader((Reader)new StringReader(string2));
                jsonReader.setLenient(true);
                JsonObject jsonObject = (JsonObject)new Gson().fromJson(jsonReader, JsonObject.class);
                if (jsonObject != null) {
                    TemporalMetadataResolver.h.M(jsonObject, false);
                    for (TransactionDescriptor transactionDescriptor : TemporalMetadataResolver.h.o().T()) {
                        transactionDescriptor.j(true);
                    }
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }

    private static TransactionStatusTracker lambda$fetchSettings$0(Throwable throwable) {
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                AsynchronousTaskCoordinator342.a = MultiContainerRegistry.a(-245952097028767205L, -3904362830919393963L, MethodHandles.lookup().lookupClass()).a(121469667752085L);
                AsynchronousTaskCoordinator342.f = new Object[6];
                AsynchronousTaskCoordinator342.g = new String[6];
                AsynchronousTaskCoordinator342.b();
                AsynchronousTaskCoordinator342.d = new HashMap<K, V>(13);
                var0 = AsynchronousTaskCoordinator342.a ^ 65171285183791L;
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
                var8_3 = new long[12];
                var5_4 = 0;
                var6_5 = "\u00e3\u0007gx\u00c5\u00d6\u0017\u00deS\u00b3\u00eaPl\u00a9\u00a8E\u0097\u0003g\u00e5\u00fa\u009b\u0011\"\"\u00c6\u0095x\u0080\u00d5\u00af\u00d2\u000f{r\u00e2]X\u00fb\u009a9Q\u0018\u0013\u00d2\u0088D`A\u00c7\u00b1\u0092\u00af\u008fR$\u0002\u00b1_l/\u00a5\u00ec\u001f\u001a\u00bdH\u00b1\u001d\u00e8\u00f4\u00cd/V\u00bap\ng\u00e4\u00f6";
                var7_6 = "\u00e3\u0007gx\u00c5\u00d6\u0017\u00deS\u00b3\u00eaPl\u00a9\u00a8E\u0097\u0003g\u00e5\u00fa\u009b\u0011\"\"\u00c6\u0095x\u0080\u00d5\u00af\u00d2\u000f{r\u00e2]X\u00fb\u009a9Q\u0018\u0013\u00d2\u0088D`A\u00c7\u00b1\u0092\u00af\u008fR$\u0002\u00b1_l/\u00a5\u00ec\u001f\u001a\u00bdH\u00b1\u001d\u00e8\u00f4\u00cd/V\u00bap\ng\u00e4\u00f6".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block10;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00c5;\u00f7'\u00f7\u00e7f\u00e7\u00e8\u008dG\u00ca1\u00d8\u00eeK";
                    var7_6 = "\u00c5;\u00f7'\u00f7\u00e7f\u00e7\u00e8\u008dG\u00ca1\u00d8\u00eeK".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block11;
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
        AsynchronousTaskCoordinator342.b = var8_3;
        AsynchronousTaskCoordinator342.c = new Integer[12];
        try {
            v8 = AsynchronousTaskCoordinator342.class.desiredAssertionStatus() == false;
        }
        catch (CustomSystemException v9) {
            throw AsynchronousTaskCoordinator342.a(v9);
        }
        AsynchronousTaskCoordinator342.t = v8;
    }

    public BackgroundTaskExecutor1258 c() {
        return this.y;
    }

    private static void b() {
        Object[] objectArray = f;
        f[0] = "G\b\"";
        objectArray[1] = Integer.TYPE;
        AsynchronousTaskCoordinator342.g[1] = "java/lang/Integer";
        objectArray[2] = "B\u001fZrV\"I\u0010K=+:Z\u0017Bt";
        objectArray[3] = "P\u007fRp_[[pC?>UP{Ge";
        objectArray[4] = "\nB*,l\u0006\u0018\ns\u001cz\u001e`\u0003udm\u0005_\nm-ze";
        Object[] objectArray2 = objectArray;
        objectArray[5] = "uNi2o?g\u00060\u0002}'\u001fJ9ejbuO+9\u0016e}N,b)le\u0007;\u0002";
    }

    public void a() {
        this.r.set(true);
        this.y.I();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AsynchronousTaskCoordinator342.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AsynchronousTaskCoordinator342.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AsynchronousTaskCoordinator342.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(AsynchronousTaskCoordinator342.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

