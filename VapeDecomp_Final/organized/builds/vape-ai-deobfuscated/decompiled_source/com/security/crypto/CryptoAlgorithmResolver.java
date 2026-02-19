/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.RF;
import a.Ry;
import a._b;
import a.bE;
import a.hr;
import a.yP;
import com.app.caching.core.CacheInvalidationManager2335;
import com.app.core.generics.GenericTypeResolver;
import com.app.crypto.processing.CipherTextProcessor;
import com.collections.management.MultiContainerRegistry;
import com.crypto.transformation.CipherTransformationHandler932;
import com.data.processing.DataTransformationEngine263;
import com.data.serialization.JsonPayloadOrchestrator;
import com.event.core.EventDispatchFramework;
import com.exception.system.CustomSystemException;
import com.execution.context.ExecutionContextManager;
import com.execution.strategy.StrategyExecutor;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.transformation.GeometricTransformEngine;
import com.math.computation.IntegerComputationManager;
import com.network.communication.NetworkTransmissionHandler;
import com.network.protocol.CommunicationProtocolManager;
import com.security.authentication.AuthenticationResolver;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.config.CryptoConfigurationEnum;
import com.security.crypto.CipherContextManager1101;
import com.security.crypto.CipherManager;
import com.security.crypto.CryptographicSecurityManager;
import com.security.crypto.CryptographicSecurityManager396;
import com.security.cryptography.CryptographicContextManager153;
import com.security.tokenization.CryptographicTokenGenerator186;
import com.system.resource.ResourceAllocationManager1348;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.model.TransactionDescriptor;
import com.transaction.monitoring.TransactionStatusTracker;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.rendering.VisualRenderContext;
import com.workflow.adaptive.AdaptiveWorkflowController;
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
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptoAlgorithmResolver
extends AdaptiveWorkflowController {
    private static final long[] fb;
    private AdaptiveCipherEngine jz;
    private static final Map rb;
    private static final Integer[] qb;
    private yP j6;
    private JsonPayloadOrchestrator j_;
    private AdaptiveCipherEngine jd;
    private static final Object[] sb;
    private CipherManager jw;
    private TransactionDescriptor j7;
    private CryptographicSecurityManager396 j0;
    private static final long eb;
    static final boolean jY;
    private CipherManager jy;
    private hr jr;
    private AdaptiveCipherEngine jI;
    private static final String[] tb;

    private static Method j(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptoAlgorithmResolver.i(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoAlgorithmResolver.j(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void lambda$setup$1(CryptographicSecurityManager cryptographicSecurityManager) {
        this.e(cryptographicSecurityManager);
    }

    private static void X() {
        Object[] objectArray = sb;
        sb[0] = "*\u0003\u0002";
        objectArray[1] = Integer.TYPE;
        CryptoAlgorithmResolver.tb[1] = "java/lang/Integer";
        objectArray[2] = "e^<%%$nQ-jX<}V$#";
        objectArray[3] = "?\u0000\u001e\u001d4#4\u000f\u000fRU-?\u0004\u000b\b";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "h\u0019tB;m\u007f\u0005-y6p\u000f\u0002)\u0001/`6E;\t]2w\u0018s\u001aekm\u00131y";
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public CryptoAlgorithmResolver(CommunicationProtocolManager communicationProtocolManager, TransactionDescriptor transactionDescriptor) {
        super(communicationProtocolManager);
        this.j7 = transactionDescriptor;
        this.j_ = this.j7.X(true);
        this.J();
    }

    private static TransactionStatusTracker lambda$null$5(Throwable throwable) {
        return null;
    }

    private static Field s(long l, long l2) {
        int n = CryptoAlgorithmResolver.q(l, l2);
        Object object = sb[n];
        if (object instanceof String) {
            String string = tb[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoAlgorithmResolver.r(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoAlgorithmResolver.r(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoAlgorithmResolver.i(clazz3, string2, clazz2)) != null) {
                    CryptoAlgorithmResolver.sb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoAlgorithmResolver.j(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoAlgorithmResolver.sb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoAlgorithmResolver.r(236978048457450L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method i(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field j(Class clazz, String string, Class clazz2) {
        Field field = CryptoAlgorithmResolver.i(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoAlgorithmResolver.j(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method t(long l, long l2) {
        int n = CryptoAlgorithmResolver.q(l, l2);
        Object object = sb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = tb[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptoAlgorithmResolver.r(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoAlgorithmResolver.r(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoAlgorithmResolver.i(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoAlgorithmResolver.sb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoAlgorithmResolver.r(236978048457450L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoAlgorithmResolver.j(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoAlgorithmResolver.sb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoAlgorithmResolver.r(236978048457450L, 0L);
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

    static AdaptiveCipherEngine b(CryptoAlgorithmResolver cryptoAlgorithmResolver) {
        return cryptoAlgorithmResolver.jd;
    }

    private CompletableFuture lambda$footerPublish$6() {
        boolean bl;
        ArrayList<String> arrayList;
        String string;
        CallSite callSite;
        String string2;
        CryptographicTokenGenerator186 cryptographicTokenGenerator186;
        Object object;
        long l = eb ^ 0x7EE4BE463920L;
        String string3 = this.jy.a().trim();
        try {
            if (string3.length() < 3) {
                IntegerComputationManager.q((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)12409, (long)(0x5D4AC850BE81649AL ^ l)), (long)-2787908484825899019L, (long)l)));
                this.jy.g(CryptoAlgorithmResolver.M.O);
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmResolver.a(customSystemException);
        }
        String string4 = this.jw.a().trim();
        boolean bl2 = this.jI.j();
        boolean bl3 = this.jd.j();
        boolean bl4 = this.jz.j();
        ArrayList<String> arrayList2 = new ArrayList<String>(this.j6.C());
        if (arrayList2.size() < 5 && (object = ExecutionContextManager.m(this.j6.o().a().trim())) != null) {
            String string5 = ExecutionContextManager.d((String)object);
            try {
                if (string5 != null) {
                    IntegerComputationManager.q(string5);
                    return null;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmResolver.a(customSystemException);
            }
            arrayList2.add((String)object);
            this.j6.u(new ResourceAllocationManager1348((String)object));
            this.j6.o().y("");
        }
        object = this.j7.m();
        try {
            if (object == null) {
                TemporalMetadataResolver.h.o().C(this.j7);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmResolver.a(customSystemException);
        }
        try {
            cryptographicTokenGenerator186 = _b.S().M();
            string2 = string3;
            callSite = CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)28873, (long)(0x3ECC522CE724A405L ^ l)), (long)-2787908484825899019L, (long)l);
            string = string4;
            arrayList = arrayList2;
            bl = !bl2;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmResolver.a(customSystemException);
        }
        return ((CompletableFuture)cryptographicTokenGenerator186.w(CipherTransformationHandler932.H(string2, (String)((Object)callSite), string, arrayList, bl, bl4, bl3, this.j7.k(), object)).whenCompleteAsync(this::lambda$null$4, (Executor)GraphicalRenderingController.st)).exceptionally(CryptoAlgorithmResolver::lambda$null$5);
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int lambda$viewModuleDetails$7(GenericTypeResolver genericTypeResolver, GenericTypeResolver genericTypeResolver2) {
        return Boolean.compare(genericTypeResolver.H(), genericTypeResolver2.H());
    }

    private static Class r(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoAlgorithmResolver.q(l, l2);
            object = sb[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoAlgorithmResolver.sb[n] = clazz = Class.forName(tb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void lambda$setup$0(TransactionDescriptor transactionDescriptor) {
        long l = eb ^ 0x217087F607C7L;
        JsonPayloadOrchestrator jsonPayloadOrchestrator = transactionDescriptor.X(true);
        try {
            if (jsonPayloadOrchestrator == null) {
                CipherTextProcessor.w(CryptoConfigurationEnum.WARNING, (String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)31278, (long)(0x1BB642FFD2551002L ^ l)), (long)-1754148115334061806L, (long)l)));
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmResolver.a(customSystemException);
        }
        this.j7 = transactionDescriptor;
        this.j_ = jsonPayloadOrchestrator;
        this.J();
    }

    private static int q(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (tb[n4] != null) {
            return n4;
        }
        Object object = sb[n4];
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
                n3 = 50;
                break;
            }
            case 2: {
                n3 = 14;
                break;
            }
            case 3: {
                n3 = 29;
                break;
            }
            case 4: {
                n3 = 58;
                break;
            }
            case 5: {
                n3 = 19;
                break;
            }
            case 6: {
                n3 = 17;
                break;
            }
            case 7: {
                n3 = 30;
                break;
            }
            case 8: {
                n3 = 56;
                break;
            }
            case 9: {
                n3 = 10;
                break;
            }
            case 10: {
                n3 = 31;
                break;
            }
            case 11: {
                n3 = 5;
                break;
            }
            case 12: {
                n3 = 40;
                break;
            }
            case 13: {
                n3 = 28;
                break;
            }
            case 14: {
                n3 = 18;
                break;
            }
            case 15: {
                n3 = 21;
                break;
            }
            case 16: {
                n3 = 39;
                break;
            }
            case 17: {
                n3 = 2;
                break;
            }
            case 18: {
                n3 = 11;
                break;
            }
            case 19: {
                n3 = 55;
                break;
            }
            case 20: {
                n3 = 52;
                break;
            }
            case 21: {
                n3 = 33;
                break;
            }
            case 22: {
                n3 = 20;
                break;
            }
            case 23: {
                n3 = 12;
                break;
            }
            case 24: {
                n3 = 46;
                break;
            }
            case 25: {
                n3 = 59;
                break;
            }
            case 26: {
                n3 = 60;
                break;
            }
            case 27: {
                n3 = 23;
                break;
            }
            case 28: {
                n3 = 57;
                break;
            }
            case 29: {
                n3 = 3;
                break;
            }
            case 30: {
                n3 = 0;
                break;
            }
            case 31: {
                n3 = 62;
                break;
            }
            case 32: {
                n3 = 4;
                break;
            }
            case 33: {
                n3 = 63;
                break;
            }
            case 34: {
                n3 = 48;
                break;
            }
            case 35: {
                n3 = 51;
                break;
            }
            case 36: {
                n3 = 43;
                break;
            }
            case 37: {
                n3 = 26;
                break;
            }
            case 38: {
                n3 = 49;
                break;
            }
            case 39: {
                n3 = 44;
                break;
            }
            case 40: {
                n3 = 22;
                break;
            }
            case 41: {
                n3 = 24;
                break;
            }
            case 42: {
                n3 = 25;
                break;
            }
            case 43: {
                n3 = 45;
                break;
            }
            case 44: {
                n3 = 38;
                break;
            }
            case 45: {
                n3 = 6;
                break;
            }
            case 46: {
                n3 = 9;
                break;
            }
            case 47: {
                n3 = 53;
                break;
            }
            case 48: {
                n3 = 16;
                break;
            }
            case 49: {
                n3 = 15;
                break;
            }
            case 50: {
                n3 = 47;
                break;
            }
            case 51: {
                n3 = 32;
                break;
            }
            case 52: {
                n3 = 61;
                break;
            }
            case 53: {
                n3 = 27;
                break;
            }
            case 54: {
                n3 = 41;
                break;
            }
            case 55: {
                n3 = 34;
                break;
            }
            case 56: {
                n3 = 1;
                break;
            }
            case 57: {
                n3 = 35;
                break;
            }
            case 58: {
                n3 = 36;
                break;
            }
            case 59: {
                n3 = 13;
                break;
            }
            case 60: {
                n3 = 42;
                break;
            }
            case 61: {
                n3 = 54;
                break;
            }
            case 62: {
                n3 = 7;
                break;
            }
            default: {
                n3 = 8;
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
        CryptoAlgorithmResolver.tb[n4] = new String(cArray);
        return n4;
    }

    private void lambda$null$4(TransactionStatusTracker transactionStatusTracker, Throwable throwable) {
        Ry ry;
        block10: {
            long l = eb ^ 0x19D23BEA20C5L;
            try {
                if (throwable != null) {
                    TemporalMetadataResolver.W(throwable);
                    IntegerComputationManager.q((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)28466, (long)(0x4DC39BDB546F2203L ^ l)), (long)-4563770162795543024L, (long)l)));
                    this.Bs.j((CipherContextManager1101)null);
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmResolver.a(customSystemException);
            }
            try {
                if (!transactionStatusTracker.b()) {
                    IntegerComputationManager.q((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)17409, (long)(0x4EE646451A47093FL ^ l)), (long)-4563770162795543024L, (long)l)) + transactionStatusTracker.A());
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmResolver.a(customSystemException);
            }
            this.Bs.j((CipherContextManager1101)null);
            ry = (Ry)transactionStatusTracker.h();
            try {
                try {
                    if (jY || ry != null) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoAlgorithmResolver.a(customSystemException);
                }
                throw new AssertionError();
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmResolver.a(customSystemException);
            }
        }
        TemporalMetadataResolver.h.u().j(ry);
        this.Bs.Y(ry);
    }

    private static MethodHandle e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'z' || c == 'p' || c == '\u00ba' || c == '\u00c5') {
                field = CryptoAlgorithmResolver.s(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'z' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'p' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoAlgorithmResolver.t(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'N' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void lambda$viewDetails$2(char c, int n) {
        this.j0.d(this.jy.a());
        this.D();
    }

    private void x() {
        long l = eb ^ 0x7696126EC64BL;
        this.v();
        this.BM.d().f((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)19658, (long)(0x1DAB30B4190FE778L ^ l)), (long)2748414528379117726L, (long)l)));
        this.BM.n(new bE(0.0, 10.0), CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)6492, (long)(0xC368C5745DC32E4L ^ l)), (long)2748414528379117726L, (long)l));
        this.BM.n(new bE(105.0, 0.0), new Object[0]);
        VisualRenderContext visualRenderContext = new VisualRenderContext((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)16627, (long)(0x6CC4CC301D346B58L ^ l)), (long)2748414528379117726L, (long)l)), 0.7, true);
        visualRenderContext.c(null);
        visualRenderContext.f(true);
        visualRenderContext.T(40.0);
        visualRenderContext.w(15.0);
        visualRenderContext.N(this::lambda$footerPublish$3);
        this.BM.n(visualRenderContext, new Object[0]);
        this.jr = new hr((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)17313, (long)(0x3E15C77D83B46828L ^ l)), (long)2748414528379117726L, (long)l)), 0.7, CryptoAlgorithmResolver.M.Y, CryptoAlgorithmResolver.M.u);
        this.jr.f(true);
        this.jr.T(60.0);
        this.jr.w(15.0);
        this.jr.q(false);
        this.jr.A(Color.WHITE);
        this.D();
        this.jr.f(this::lambda$footerPublish$6);
        this.BM.n(this.jr, new Object[0]);
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoAlgorithmResolver.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void e(CryptographicSecurityManager cryptographicSecurityManager) {
        long l = eb ^ 0x6C56732B41A7L;
        this.m();
        double d2 = this.Ba.w();
        this.getClass();
        double d3 = d2 - 5.0;
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(d3, 12.0);
        graphicalRenderEngine1082.d().f((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)22014, (long)(0x504A19E7413179B0L ^ l)), (long)-6789089904152615054L, (long)l)));
        graphicalRenderEngine1082.i(false);
        this.Ba.n(graphicalRenderEngine1082, new Object[0]);
        CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153(cryptographicSecurityManager.O(), 1.0);
        cryptographicContextManager153.q(true);
        cryptographicContextManager153.B(CryptoAlgorithmResolver.M.c);
        graphicalRenderEngine1082.n(cryptographicContextManager153, new Object[0]);
        List list = cryptographicSecurityManager.o().stream().sorted(CryptoAlgorithmResolver::lambda$viewModuleDetails$7).collect(Collectors.toList());
        for (GenericTypeResolver genericTypeResolver : list) {
            DataTransformationEngine263 dataTransformationEngine263 = new DataTransformationEngine263(this.j_, cryptographicSecurityManager, genericTypeResolver);
            dataTransformationEngine263.T(this.Ba.w() - 5.0);
            dataTransformationEngine263.Q(CryptoAlgorithmResolver.M.g);
            this.Ba.n(dataTransformationEngine263, new Object[0]);
        }
    }

    private static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptoAlgorithmResolver.e(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void lambda$footerPublish$3() {
        this.Bs.j((CipherContextManager1101)null);
    }

    private void D() {
        block3: {
            block2: {
                String string = this.jy.a().trim();
                try {
                    if (string.length() >= 3) break block2;
                    this.jr.Q(CryptoAlgorithmResolver.M.S, CryptoAlgorithmResolver.M.S);
                    this.jr.A(CryptoAlgorithmResolver.M.H);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoAlgorithmResolver.a(customSystemException);
                }
            }
            this.jr.Q(CryptoAlgorithmResolver.M.Y, CryptoAlgorithmResolver.M.u);
            this.jr.A(Color.WHITE);
        }
        this.jy.g(CryptoAlgorithmResolver.M.n);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CryptoAlgorithmResolver.eb = MultiContainerRegistry.a(-3326037812552456022L, 7372991558936943454L, MethodHandles.lookup().lookupClass()).a(170292673402146L);
                CryptoAlgorithmResolver.sb = new Object[5];
                CryptoAlgorithmResolver.tb = new String[5];
                CryptoAlgorithmResolver.X();
                CryptoAlgorithmResolver.rb = new HashMap<K, V>(13);
                var0 = CryptoAlgorithmResolver.eb ^ 11425261663691L;
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
                var8_3 = new long[36];
                var5_4 = 0;
                var6_5 = "'G\r\u00d1\r|\u00e4\u0002\u0088B\u00ff\u00eb\u0093\u0000\u0089\u001612KV\u0099\u00cco\u0000\u008cr\u00d5:\u00c3O\u00c0SJ\u0098\u0092q\u0000\u00bfl_\u00d28\u0011K]\u00ca\u001b3\u00a8R\u0080\u009d\u00e2W\u00f3\u001c\u00b5\u00d7\u00cc%[L\u00f4\u00e6\u009d\u00e3\u00b2X\u008d\u00f9\u00e4\u00cdg,\"#\u0082\u00e6\u00c7\u00e5\u0087\u007f|\u00bd\u0011[i\u009d\u000fRz\u00927\u00d7\u00fd\u0005U\"-\u001d\u00a2\u0002\u00da4A\u0093\u00e6\u0082\u00bf\u000f-%BZ6\u00eacM\u00d9\u00fd\u00f0\u0010`\u009e2\u00b8\u00ca\u00a4\u00a9:<\u00e5eE\u009f\u00dak1z9\u00e3\u00e2\u00cbm\u00d2\u0090\u00ec\u00889\u0015\f\u00f9\u00d48\u00dc\u0082\u00c2\u008a\u00054\u00d8\n\u00d2\u00e5\u00b3\u009d\u00ab\u00c4\u00eem\u0017\n\u00b6+\u0089\u007f\u00b3uZ\u00ad+\u008f]\u00adL\u0085)\u00d4\u00f5g\u00d8\u00b7\u00ba\u00ca?C\u00d5o\u00c4k\u0080\u00cd'\u001d\u0018\u0086\u0082\u00ab2\u00cb\u00fc\u00fd)\u0007\u008bq\u001aL\\\\\u00db\u0013\u00d5\u00a39P\u00f6\u00a8\u0018d]\u00ec\u001e\u00a8C\u00dd\u009a\u00f3\u00d2\u00a0\b\u00c7\u001d\u0096\u0019\u0092\u00a8 \rK\u001b\u00e3\u001f\u0001\u00eeqxn0D\u00c4i\u00d9\n\f\u00eaYZ\u00d9y4\u008c";
                var7_6 = "'G\r\u00d1\r|\u00e4\u0002\u0088B\u00ff\u00eb\u0093\u0000\u0089\u001612KV\u0099\u00cco\u0000\u008cr\u00d5:\u00c3O\u00c0SJ\u0098\u0092q\u0000\u00bfl_\u00d28\u0011K]\u00ca\u001b3\u00a8R\u0080\u009d\u00e2W\u00f3\u001c\u00b5\u00d7\u00cc%[L\u00f4\u00e6\u009d\u00e3\u00b2X\u008d\u00f9\u00e4\u00cdg,\"#\u0082\u00e6\u00c7\u00e5\u0087\u007f|\u00bd\u0011[i\u009d\u000fRz\u00927\u00d7\u00fd\u0005U\"-\u001d\u00a2\u0002\u00da4A\u0093\u00e6\u0082\u00bf\u000f-%BZ6\u00eacM\u00d9\u00fd\u00f0\u0010`\u009e2\u00b8\u00ca\u00a4\u00a9:<\u00e5eE\u009f\u00dak1z9\u00e3\u00e2\u00cbm\u00d2\u0090\u00ec\u00889\u0015\f\u00f9\u00d48\u00dc\u0082\u00c2\u008a\u00054\u00d8\n\u00d2\u00e5\u00b3\u009d\u00ab\u00c4\u00eem\u0017\n\u00b6+\u0089\u007f\u00b3uZ\u00ad+\u008f]\u00adL\u0085)\u00d4\u00f5g\u00d8\u00b7\u00ba\u00ca?C\u00d5o\u00c4k\u0080\u00cd'\u001d\u0018\u0086\u0082\u00ab2\u00cb\u00fc\u00fd)\u0007\u008bq\u001aL\\\\\u00db\u0013\u00d5\u00a39P\u00f6\u00a8\u0018d]\u00ec\u001e\u00a8C\u00dd\u009a\u00f3\u00d2\u00a0\b\u00c7\u001d\u0096\u0019\u0092\u00a8 \rK\u001b\u00e3\u001f\u0001\u00eeqxn0D\u00c4i\u00d9\n\f\u00eaYZ\u00d9y4\u008c".length();
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
                    var6_5 = "\u0099\u00932\u0000o\u0000]4\u0084\u00b3\u00f0\u0093m\u00c0\u00c9i";
                    var7_6 = "\u0099\u00932\u0000o\u0000]4\u0084\u00b3\u00f0\u0093m\u00c0\u00c9i".length();
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
        CryptoAlgorithmResolver.fb = var8_3;
        CryptoAlgorithmResolver.qb = new Integer[36];
        try {
            v8 = CryptoAlgorithmResolver.class.desiredAssertionStatus() == false;
        }
        catch (CustomSystemException v9) {
            throw CryptoAlgorithmResolver.a(v9);
        }
        CryptoAlgorithmResolver.jY = v8;
    }

    private void P() {
        long l = eb ^ 0x6C75B48525C1L;
        this.m();
        double d2 = this.Ba.w() - 3.0;
        CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)23799, (long)(0x2E9FAA6132BB94D7L ^ l)), (long)-4202335021683145964L, (long)l)), 0.7, CryptoAlgorithmResolver.M.H, true);
        try {
            cryptographicContextManager153.S(0.0f);
            this.Ba.n(cryptographicContextManager153, new Object[0]);
            if (this.jy == null) {
                this.jy = new AuthenticationResolver(this, (String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)27910, (long)(0x634E6659B7952528L ^ l)), (long)-4202335021683145964L, (long)l)), d2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmResolver.a(customSystemException);
        }
        this.jy.Z(0.0);
        this.jy.R(0.0f);
        this.jy.x(1.0f);
        this.jy.z(CryptoAlgorithmResolver.M.c);
        this.jy.g(CryptoAlgorithmResolver.M.n);
        this.jy.O().N(false);
        this.jy.i(false);
        this.jy.I(false);
        this.jy.h(this::lambda$viewDetails$2);
        this.Ba.n(this.jy, new Object[0]);
        this.Ba.n(new GeometricTransformEngine(d2, 2.0, 0.5, 0.0, CryptoAlgorithmResolver.M.S), new Object[0]);
        this.Ba.n(new bE(0.0, 5.0), new Object[0]);
        CryptographicContextManager153 cryptographicContextManager1532 = new CryptographicContextManager153((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)1546, (long)(0x6BE98B1576D94E3EL ^ l)), (long)-4202335021683145964L, (long)l)), 0.7, CryptoAlgorithmResolver.M.H, true);
        try {
            cryptographicContextManager1532.S(0.0f);
            this.Ba.n(cryptographicContextManager1532, new Object[0]);
            if (this.jw == null) {
                this.jw = new NetworkTransmissionHandler(this, (String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)14596, (long)(0x3B95D4D9660C7137L ^ l)), (long)-4202335021683145964L, (long)l)), d2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmResolver.a(customSystemException);
        }
        this.jw.Z(0.0);
        this.jw.R(0.0f);
        this.jw.x(1.0f);
        this.jw.z(CryptoAlgorithmResolver.M.c);
        this.jw.g(CryptoAlgorithmResolver.M.n);
        this.jw.O().N(false);
        this.jw.i(false);
        this.jw.I(false);
        this.Ba.n(this.jw, new Object[0]);
        this.Ba.n(new GeometricTransformEngine(d2, 2.0, 0.5, 0.0, CryptoAlgorithmResolver.M.S), new Object[0]);
        this.Ba.n(new bE(0.0, 5.0), new Object[0]);
        CryptographicContextManager153 cryptographicContextManager1533 = new CryptographicContextManager153((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)10811, (long)(0x5CDE16D66CD8E212L ^ l)), (long)-4202335021683145964L, (long)l)), 0.7, CryptoAlgorithmResolver.M.H, true);
        cryptographicContextManager1533.S(0.0f);
        this.Ba.n(cryptographicContextManager1533, CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)88, (long)(0x247FF27C60524865L ^ l)), (long)-4202335021683145964L, (long)l));
        CryptographicContextManager153 cryptographicContextManager1534 = new CryptographicContextManager153((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)19677, (long)(0x5633B43A745004FEL ^ l)), (long)-4202335021683145964L, (long)l)), 0.7, CryptoAlgorithmResolver.M.w, false);
        try {
            double d3 = cryptographicContextManager1534.D();
            this.getClass();
            cryptographicContextManager1534.T(d3 + (double)(5.0f * 2.0f));
            this.Ba.n(cryptographicContextManager1534, CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)1518, (long)(0xCADA38278C7CDCCL ^ l)), (long)-4202335021683145964L, (long)l));
            if (this.j6 == null) {
                this.j6 = new yP((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)16470, (long)(0x6CA3765E93C68866L ^ l)), (long)-4202335021683145964L, (long)l)), d2, 20.0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmResolver.a(customSystemException);
        }
        this.Ba.n(this.j6, CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)19978, (long)(0x54EBA46642EE0633L ^ l)), (long)-4202335021683145964L, (long)l));
        this.Ba.n(new GeometricTransformEngine(d2, 2.0, 0.5, 0.0, CryptoAlgorithmResolver.M.S), new Object[0]);
        this.Ba.n(new bE(0.0, 5.0), new Object[0]);
        CryptographicContextManager153 cryptographicContextManager1535 = new CryptographicContextManager153((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)18657, (long)(0x74D9E94DA16680DDL ^ l)), (long)-4202335021683145964L, (long)l)), 0.7, CryptoAlgorithmResolver.M.H, true);
        try {
            cryptographicContextManager1535.S(0.0f);
            this.Ba.n(cryptographicContextManager1535, new Object[0]);
            if (this.jI == null) {
                this.jI = new AdaptiveCipherEngine((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)25785, (long)(0x2B309CEE4F6B2C82L ^ l)), (long)-4202335021683145964L, (long)l)), 0.8);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmResolver.a(customSystemException);
        }
        try {
            this.jI.Z(0.0);
            this.jI.Y(d2);
            this.jI.i(false);
            this.Ba.n(this.jI, new Object[0]);
            if (this.jd == null) {
                this.jd = new AdaptiveCipherEngine((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)2290, (long)(0x3922BDF9B54CC0D5L ^ l)), (long)-4202335021683145964L, (long)l)), 0.8);
                this.jI.l(new StrategyExecutor(this));
                this.jd.N(false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmResolver.a(customSystemException);
        }
        try {
            this.jd.Z(0.0);
            this.jd.Y(d2);
            this.jd.i(false);
            this.Ba.n(this.jd, new Object[0]);
            if (this.jz == null) {
                this.jz = new AdaptiveCipherEngine((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)10745, (long)(0x22AED8F7751FE1C8L ^ l)), (long)-4202335021683145964L, (long)l)), 0.8);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmResolver.a(customSystemException);
        }
        this.jz.Z(0.0);
        this.jz.Y(d2);
        this.jz.i(false);
        this.Ba.n(this.jz, new Object[0]);
    }

    @Override
    protected void J() {
        long l = eb ^ 0x56A6D649A008L;
        try {
            super.J();
            if (this.j7 == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmResolver.a(customSystemException);
        }
        this.getClass();
        double d2 = 5.0f * 4.0f;
        this.T(this.Bs.w() - d2);
        double d3 = this.Bs.b() - this.Bs.Q().b() - 2.0 - d2;
        this.getClass();
        this.w(d3 - 5.0);
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = this.I();
        this.I().i(false);
        this.I().d().f((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)16852, (long)(0x479CAE41610B0C1CL ^ l)), (long)4640805774013499101L, (long)l)));
        this.n(graphicalRenderEngine1082, new Object[0]);
        double d4 = graphicalRenderEngine1082.w();
        this.getClass();
        GraphicalRenderEngine1082 graphicalRenderEngine10822 = new GraphicalRenderEngine1082(d4 - (double)(5.0f * 2.0f), 25.0);
        graphicalRenderEngine10822.i(false);
        graphicalRenderEngine10822.d().f((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)22182, (long)(0x40C57099F37D9B59L ^ l)), (long)4640805774013499101L, (long)l)));
        GraphicalRenderEngine1082 graphicalRenderEngine10823 = this.I();
        this.getClass();
        graphicalRenderEngine10823.n(new bE(5.0, 0.0), CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)6711, (long)(0x5E9EBBF43000D7D8L ^ l)), (long)4640805774013499101L, (long)l));
        graphicalRenderEngine1082.n(graphicalRenderEngine10822, new Object[0]);
        CallSite callSite = CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)16337, (long)(0x4E98075BB20F227L ^ l)), (long)4640805774013499101L, (long)l);
        CallSite callSite2 = CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)12849, (long)(0x3F8DD558D8777FD3L ^ l)), (long)4640805774013499101L, (long)l);
        double d5 = graphicalRenderEngine10822.w();
        this.getClass();
        this.j0 = new CryptographicSecurityManager396((String)((Object)callSite), (String)((Object)callSite2), d5 - (double)(5.0f * 2.0f), 1.0, CryptoAlgorithmResolver.M.c, true);
        this.j0.w(0.0);
        this.j0.P(0.0);
        GraphicalRenderEngine1082 graphicalRenderEngine10824 = new GraphicalRenderEngine1082(graphicalRenderEngine10822.w(), 8.0);
        graphicalRenderEngine10824.d().f((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)10852, (long)(0x530196CC7A386793L ^ l)), (long)4640805774013499101L, (long)l)));
        graphicalRenderEngine10824.i(false);
        this.getClass();
        graphicalRenderEngine10824.n(new bE(5.0, 0.0), CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)1643, (long)(0x203220490E90CB87L ^ l)), (long)4640805774013499101L, (long)l));
        graphicalRenderEngine10824.n(this.j0, new Object[0]);
        graphicalRenderEngine10822.n(graphicalRenderEngine10824, new Object[0]);
        this.getClass();
        graphicalRenderEngine10822.n(new bE(0.0, 5.0), new Object[0]);
        List<TransactionDescriptor> list = TemporalMetadataResolver.h.u().A();
        ArrayList<TransactionDescriptor> arrayList = new ArrayList<TransactionDescriptor>(TemporalMetadataResolver.h.o().T());
        arrayList.removeIf(list::contains);
        EventDispatchFramework eventDispatchFramework = new EventDispatchFramework((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)24554, (long)(0x34D6CAF166DC120FL ^ l)), (long)4640805774013499101L, (long)l)), this.j7, arrayList.toArray(new TransactionDescriptor[0]));
        eventDispatchFramework.w(6.0);
        eventDispatchFramework.T(graphicalRenderEngine10822.w());
        eventDispatchFramework.K(this::lambda$setup$0);
        eventDispatchFramework.i(false);
        graphicalRenderEngine10822.n(eventDispatchFramework, CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)6865, (long)(0x6DEF634EA6DD718L ^ l)), (long)4640805774013499101L, (long)l));
        GraphicalRenderEngine1082 graphicalRenderEngine10825 = new GraphicalRenderEngine1082(graphicalRenderEngine1082.w(), graphicalRenderEngine1082.b() - graphicalRenderEngine10822.b() - 6.0);
        graphicalRenderEngine1082.n(graphicalRenderEngine10825, new Object[0]);
        graphicalRenderEngine10825.i(false);
        graphicalRenderEngine10825.d().f((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)6128, (long)(0x7706EE8462AC5A16L ^ l)), (long)4640805774013499101L, (long)l)));
        CacheInvalidationManager2335 cacheInvalidationManager2335 = new CacheInvalidationManager2335((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)13219, (long)(0x67B76791FDD37E5DL ^ l)), (long)4640805774013499101L, (long)l)), 0.8, true, this, this::P);
        cacheInvalidationManager2335.J(true);
        cacheInvalidationManager2335.T(graphicalRenderEngine10825.w());
        graphicalRenderEngine10825.n(cacheInvalidationManager2335, new Object[0]);
        graphicalRenderEngine10825.n(new bE(0.0, 6.0), new Object[0]);
        List<CryptographicSecurityManager> list2 = this.j_.x(false);
        RF rF = new RF(list2.size());
        graphicalRenderEngine10825.n(rF, new Object[0]);
        GraphicalRenderEngine1082 graphicalRenderEngine10826 = new GraphicalRenderEngine1082(graphicalRenderEngine10825.w(), graphicalRenderEngine10825.b() - rF.b() - cacheInvalidationManager2335.b());
        graphicalRenderEngine10826.i(false);
        graphicalRenderEngine10826.i(graphicalRenderEngine10826.b());
        graphicalRenderEngine10825.n(graphicalRenderEngine10826, new Object[0]);
        graphicalRenderEngine10826.d().f((String)((Object)CryptoAlgorithmResolver.e("\u00c1", (int)CryptoAlgorithmResolver.d("m", (int)27293, (long)(0x2D23438905262770L ^ l)), (long)4640805774013499101L, (long)l)));
        for (CryptographicSecurityManager cryptographicSecurityManager : list2) {
            CacheInvalidationManager2335 cacheInvalidationManager23352 = new CacheInvalidationManager2335(cryptographicSecurityManager.O(), 0.8, this, () -> this.lambda$setup$1(cryptographicSecurityManager));
            cacheInvalidationManager23352.J(true);
            cacheInvalidationManager23352.T(graphicalRenderEngine10826.w() - 2.0);
            graphicalRenderEngine10826.n(cacheInvalidationManager23352, new Object[0]);
        }
        this.x();
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xD8C;
        if (qb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = fb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])rb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    rb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yB", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoAlgorithmResolver.qb[n2] = n3;
        }
        return qb[n2];
    }

    private static Field i(Class clazz, String string, Class clazz2) {
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
            return MethodHandles.lookup().findStatic(CryptoAlgorithmResolver.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptoAlgorithmResolver.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

