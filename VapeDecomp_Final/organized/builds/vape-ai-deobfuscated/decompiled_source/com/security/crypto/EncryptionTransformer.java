/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.HK;
import a.Z3;
import a._c;
import com.app.classloading.resolution.ClasspathResourceResolver;
import com.app.context.GenericContextResolver;
import com.app.core.persistence.PersistenceStrategy;
import com.app.core.registry.ClassRegistryManager;
import com.app.events.EventNotificationBroker2314;
import com.app.system.SystemResourceAllocator1703;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.core.exception.CustomRuntimeException;
import com.error.handling.ContextualExceptionHandler;
import com.messaging.routing.MessageRoutingEngine;
import com.network.communication.CommunicationChannelManager;
import com.network.protocol.TransmissionProtocolInterface;
import com.reflection.loading.DynamicClassLoader;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.metadata.ClassMetadataResolver731;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.security.crypto.CryptographicTransformer406;
import com.security.protocols.CryptoProtocolSpecification;
import com.security.reflection.ReflectionUtility744;
import com.system.compilation.CompilationDiagnosticException;
import com.temporal.metadata.TemporalMetadataResolver;
import com.vape.network.VapeDataExchangeProtocol;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class EncryptionTransformer
implements CryptoProtocolSpecification {
    private MetaclassDefinitionRegistry K;
    private static final long b;
    private static final Map f;
    private static final Object[] m;
    static List<Class> v;
    private static final long[] c;
    private boolean W;
    protected byte[] I;
    static int Q;
    private static final String[] n;
    static ClassPoolRegistry z;
    protected Class w;
    private static int Z;
    private static final Integer[] d;
    private boolean h;
    protected byte[] J;

    public static int a() {
        int n = EncryptionTransformer.r();
        try {
            if (n == 0) {
                return 84;
            }
        }
        catch (RuntimeException runtimeException) {
            throw EncryptionTransformer.b(runtimeException);
        }
        return 0;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = EncryptionTransformer.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = EncryptionTransformer.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = EncryptionTransformer.a(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                EncryptionTransformer.m[n] = clazz = Class.forName(EncryptionTransformer.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public <T> T t(TransmissionProtocolInterface<T> transmissionProtocolInterface) {
        return this.u(transmissionProtocolInterface, false);
    }

    public static void c(VapeDataExchangeProtocol vapeDataExchangeProtocol, Class clazz) {
        v.add(clazz);
        z.K(vapeDataExchangeProtocol);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = EncryptionTransformer.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = EncryptionTransformer.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private <T> T o(TransmissionProtocolInterface<T> transmissionProtocolInterface, Throwable throwable) {
        long l = b ^ 0x19DDA1FE5A1L;
        String string = throwable.getMessage();
        try {
            if (string.endsWith((String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)3588, (long)(0x9AAF635FE5BB2A4L ^ l)), (long)-530740133650125694L, (long)l)))) {
                return this.o(transmissionProtocolInterface, this.F(throwable));
            }
        }
        catch (RuntimeException runtimeException) {
            throw EncryptionTransformer.b(runtimeException);
        }
        String[] stringArray = string.split((String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)5797, (long)(0x49F060463CD0AA3FL ^ l)), (long)-530740133650125694L, (long)l)));
        String string2 = stringArray[stringArray.length - 1];
        return this.V(transmissionProtocolInterface, string2);
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    public void v(HK hK, HK hK2, String string, boolean bl, ClassRegistryManager[] classRegistryManagerArray) {
        long l = b ^ 0x6D8A71588740L;
        try {
            String string2;
            _c _c2 = this.w(hK);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)29337, (long)(0x7F7393FBC358ACD0L ^ l)), (long)-7331012750224994717L, (long)l)));
            for (ClassRegistryManager classRegistryManager : classRegistryManagerArray) {
                String string3 = (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)18744, (long)(0x14D45A3E8C1C974BL ^ l)), (long)-7331012750224994717L, (long)l)) + classRegistryManager.v;
                stringBuilder.append(string3 + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)4525, (long)(0x79CB7D16A7C3CFE2L ^ l)), (long)-7331012750224994717L, (long)l)));
            }
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
            stringBuilder.append((String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)23671, (long)(0x5C881ED0D01C8237L ^ l)), (long)-7331012750224994717L, (long)l)));
            stringBuilder.append((String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)19033, (long)(0x3D486E31C566942CL ^ l)), (long)-7331012750224994717L, (long)l)));
            String string4 = stringBuilder.toString();
            try {
                string2 = bl ? (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)26665, (long)(0x3CDCA8FB6FD43648L ^ l)), (long)-7331012750224994717L, (long)l)) + string4 + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)5631, (long)(0x2411288D5D1CCB9AL ^ l)), (long)-7331012750224994717L, (long)l)) : (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)11313, (long)(0x3E8E3F9EC5C87243L ^ l)), (long)-7331012750224994717L, (long)l)) + string4 + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)1232, (long)(0x86E5848E56A5ABFL ^ l)), (long)-7331012750224994717L, (long)l));
            }
            catch (Exception exception) {
                throw EncryptionTransformer.b(exception);
            }
            String string5 = string2;
            _c2.x(new MessageRoutingEngine(this, hK2, string5));
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/XW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Loose catch block
     */
    public void n(String string) {
        long l = b ^ 0x720FAEA2AE69L;
        String[] stringArray = ClassMetadataResolver731.D();
        try {
            File file;
            block6: {
                file = new File(string);
                boolean bl = file.getParentFile().exists();
                if (stringArray == null) break block6;
                try {
                    block7: {
                        if (bl) break block6;
                        break block7;
                        catch (Exception exception) {
                            throw EncryptionTransformer.b(exception);
                        }
                    }
                    bl = file.getParentFile().mkdirs();
                }
                catch (Exception exception) {
                    throw EncryptionTransformer.b(exception);
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(this.J);
            fileOutputStream.close();
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    private <T> T u(TransmissionProtocolInterface<T> transmissionProtocolInterface, boolean bl) {
        try {
            return transmissionProtocolInterface.s();
        }
        catch (ContextualExceptionHandler contextualExceptionHandler) {
            block13: {
                try {
                    if (bl) {
                        this.h = true;
                        throw new RuntimeException(contextualExceptionHandler);
                    }
                }
                catch (ContextualExceptionHandler contextualExceptionHandler2) {
                    throw EncryptionTransformer.b(contextualExceptionHandler2);
                }
                Throwable throwable = this.F(contextualExceptionHandler);
                try {
                    try {
                        if (!(throwable instanceof CompilationDiagnosticException) && !(throwable instanceof CustomRuntimeException)) break block13;
                    }
                    catch (ContextualExceptionHandler contextualExceptionHandler3) {
                        throw EncryptionTransformer.b(contextualExceptionHandler3);
                    }
                    return this.o(transmissionProtocolInterface, contextualExceptionHandler);
                }
                catch (ContextualExceptionHandler contextualExceptionHandler4) {
                    throw EncryptionTransformer.b(contextualExceptionHandler4);
                }
            }
            this.h = true;
        }
        catch (CustomRuntimeException customRuntimeException) {
            try {
                if (bl) {
                    return null;
                }
            }
            catch (ContextualExceptionHandler contextualExceptionHandler) {
                throw EncryptionTransformer.b(contextualExceptionHandler);
            }
            return this.o(transmissionProtocolInterface, customRuntimeException);
        }
        return null;
    }

    private Object lambda$insertFromEventFactory$1(CryptographicTransformer406 cryptographicTransformer406) throws ContextualExceptionHandler, CustomRuntimeException {
        block3: {
            _c _c2;
            block2: {
                EncryptionTransformer.H(cryptographicTransformer406.F());
                EncryptionTransformer.s(cryptographicTransformer406.F());
                _c2 = this.w(cryptographicTransformer406.G());
                try {
                    _c2.E().Z();
                    if (!cryptographicTransformer406.t()) break block2;
                    _c2.V(cryptographicTransformer406.g());
                    break block3;
                }
                catch (ContextualExceptionHandler contextualExceptionHandler) {
                    throw EncryptionTransformer.b(contextualExceptionHandler);
                }
            }
            _c2.j(cryptographicTransformer406.g());
        }
        this.K.Z();
        return null;
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'F' || c == '\u00c7' || c == '\u00d0' || c == 'Q') {
                field = EncryptionTransformer.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'F' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c7' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = EncryptionTransformer.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'G' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public String z(_c _c2, Class clazz, String string, String string2, String string3) {
        return this.k(_c2, clazz, string, true, string2, string3);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public String w(HK hK, Class clazz, String string) {
        return this.X(this.w(hK), clazz, string, "", "");
    }

    @Override
    public Class l() {
        return this.w;
    }

    @Override
    public void v() {
        try {
            this.J = this.K.x();
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    public String L(HK hK, Class clazz, String string, String string2) {
        return this.X(this.w(hK), clazz, string, string2, "");
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = EncryptionTransformer.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static int r() {
        return Z;
    }

    public void H(HK hK, ClassRegistryManager ... classRegistryManagerArray) {
        long l = b ^ 0x29363C6C33FL;
        try {
            _c _c2 = this.w(hK);
            for (ClassRegistryManager classRegistryManager : classRegistryManagerArray) {
                String string = (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)14258, (long)(0x2B49D75701852DBBL ^ l)), (long)-2432949131834783204L, (long)l)) + classRegistryManager.v;
                _c2.o(string, this.Q(classRegistryManager.r));
                _c2.V((String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)23364, (long)(0x5AD5119032E1C17FL ^ l)), (long)-2432949131834783204L, (long)l)) + string + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)18587, (long)(0x3FC47D9E0E6CD29CL ^ l)), (long)-2432949131834783204L, (long)l)) + classRegistryManager.v + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)6293, (long)(0x5B99204140238293L ^ l)), (long)-2432949131834783204L, (long)l)));
            }
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (EncryptionTransformer.n[n4] != null) {
            return n4;
        }
        Object object = m[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 38;
                break;
            }
            case 1: {
                n3 = 41;
                break;
            }
            case 2: {
                n3 = 37;
                break;
            }
            case 3: {
                n3 = 59;
                break;
            }
            case 4: {
                n3 = 14;
                break;
            }
            case 5: {
                n3 = 42;
                break;
            }
            case 6: {
                n3 = 32;
                break;
            }
            case 7: {
                n3 = 39;
                break;
            }
            case 8: {
                n3 = 11;
                break;
            }
            case 9: {
                n3 = 33;
                break;
            }
            case 10: {
                n3 = 47;
                break;
            }
            case 11: {
                n3 = 43;
                break;
            }
            case 12: {
                n3 = 50;
                break;
            }
            case 13: {
                n3 = 18;
                break;
            }
            case 14: {
                n3 = 46;
                break;
            }
            case 15: {
                n3 = 7;
                break;
            }
            case 16: {
                n3 = 36;
                break;
            }
            case 17: {
                n3 = 56;
                break;
            }
            case 18: {
                n3 = 58;
                break;
            }
            case 19: {
                n3 = 26;
                break;
            }
            case 20: {
                n3 = 6;
                break;
            }
            case 21: {
                n3 = 10;
                break;
            }
            case 22: {
                n3 = 8;
                break;
            }
            case 23: {
                n3 = 25;
                break;
            }
            case 24: {
                n3 = 60;
                break;
            }
            case 25: {
                n3 = 51;
                break;
            }
            case 26: {
                n3 = 12;
                break;
            }
            case 27: {
                n3 = 57;
                break;
            }
            case 28: {
                n3 = 48;
                break;
            }
            case 29: {
                n3 = 55;
                break;
            }
            case 30: {
                n3 = 3;
                break;
            }
            case 31: {
                n3 = 61;
                break;
            }
            case 32: {
                n3 = 0;
                break;
            }
            case 33: {
                n3 = 23;
                break;
            }
            case 34: {
                n3 = 49;
                break;
            }
            case 35: {
                n3 = 40;
                break;
            }
            case 36: {
                n3 = 29;
                break;
            }
            case 37: {
                n3 = 9;
                break;
            }
            case 38: {
                n3 = 15;
                break;
            }
            case 39: {
                n3 = 24;
                break;
            }
            case 40: {
                n3 = 62;
                break;
            }
            case 41: {
                n3 = 35;
                break;
            }
            case 42: {
                n3 = 52;
                break;
            }
            case 43: {
                n3 = 27;
                break;
            }
            case 44: {
                n3 = 4;
                break;
            }
            case 45: {
                n3 = 28;
                break;
            }
            case 46: {
                n3 = 45;
                break;
            }
            case 47: {
                n3 = 44;
                break;
            }
            case 48: {
                n3 = 2;
                break;
            }
            case 49: {
                n3 = 54;
                break;
            }
            case 50: {
                n3 = 21;
                break;
            }
            case 51: {
                n3 = 22;
                break;
            }
            case 52: {
                n3 = 16;
                break;
            }
            case 53: {
                n3 = 34;
                break;
            }
            case 54: {
                n3 = 20;
                break;
            }
            case 55: {
                n3 = 31;
                break;
            }
            case 56: {
                n3 = 19;
                break;
            }
            case 57: {
                n3 = 5;
                break;
            }
            case 58: {
                n3 = 17;
                break;
            }
            case 59: {
                n3 = 1;
                break;
            }
            case 60: {
                n3 = 63;
                break;
            }
            case 61: {
                n3 = 53;
                break;
            }
            case 62: {
                n3 = 30;
                break;
            }
            default: {
                n3 = 13;
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
        EncryptionTransformer.n[n4] = new String(cArray);
        return n4;
    }

    private String lambda$makeAndInsertEvent$0(Class clazz, String string, _c _c2, String string2, String string3, boolean bl) throws ContextualExceptionHandler, CustomRuntimeException {
        String string4;
        block3: {
            CallSite callSite;
            block2: {
                long l = b ^ 0x645EB6D678F0L;
                EncryptionTransformer.H(clazz);
                EncryptionTransformer.s(clazz);
                string4 = "";
                String string5 = string;
                string4 = (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)1459, (long)(0x5F5203C5CC622461L ^ l)), (long)7346227969170616787L, (long)l)) + ++Q;
                string5 = string5.replace((CharSequence)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)29853, (long)(0x1016051E9798556BL ^ l)), (long)7346227969170616787L, (long)l)), string4);
                _c2.E().Z();
                _c2.o(string4, this.Q(clazz));
                callSite = EncryptionTransformer.c("G", (Object)this, (Object)clazz, (Object)string4, (Object)string2, (Object)string3, (Object)string5, (long)7346298115148014479L, (long)l);
                try {
                    if (!bl) break block2;
                    _c2.V((String)((Object)callSite));
                    break block3;
                }
                catch (ContextualExceptionHandler contextualExceptionHandler) {
                    throw EncryptionTransformer.b(contextualExceptionHandler);
                }
            }
            _c2.j((String)((Object)callSite));
        }
        this.K.Z();
        return string4;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                EncryptionTransformer.b = MultiContainerRegistry.a(-6156807936773026225L, 8569551238603557397L, MethodHandles.lookup().lookupClass()).a(195804291386208L);
                EncryptionTransformer.m = new Object[11];
                EncryptionTransformer.n = new String[11];
                EncryptionTransformer.b();
                EncryptionTransformer.f = new HashMap<K, V>(13);
                EncryptionTransformer.k(60);
                var0 = EncryptionTransformer.b ^ 98536298893459L;
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
                var8_3 = new long[46];
                var5_4 = 0;
                var6_5 = ":y\u0091\u00e5\u0018\u00a4\n\u0085\u0080u\u00de\u00a2\u00a6\u0007\u00cfZZ\u008a@\u008a\u00c7^\u00af\u00dd\u0092\u000b\u00a1\u00c9\u00b8\u00f0_\u00ac\u00b6\u00be\u00c6Th\u009b\u00fa\u00b7\u00c1\u009a\u00ea\u000eT\u00ba\u00b9O\u00e79\u00e6iC\u00b1q.\u00b1\u00a5=?w\rm\u00a1he\u00e1\u001dJ3\u009f\u008f\u00d9\u00cbF\u00d5\u00c4s\u00aa\u00e5S\u00b6\u0080\u009b\u00db\u00c8\\\u0012\u00fak\u0014\u00ech0q\u009e\u009a\u00f5I\u00a1\u00df\u00cf5[\u0011W\u00d8\u00cf\u009d\u0097gc\u00e3\n\u00ad\u0001NB\u0091g1l\f\u000b5\u0007\u00d7\u00cf\u00fdR\u0013\u00b5\u00b4\u00af\u00a0\u0016p\u00c8\u009b\u00c5E\u00e3T7\u0093U\u00e2\u0089\u00b2\u0010VO\u0094\u0005h\u00c2\u00b6\u00e7\u001fw\u00af\u00f8\u00f4\u0011\u00a4P7\u00f1\u0098?\u0005y\n\u008e \u0087Q\u00bf\u00ad\u00ecb,4a:\u00b5I\u00a6\f\u00803T\u00fe\u0015\r{\u00f3\u00b7\u0098Y\u00ec)h_\u00ed5\u00d3\u00abB\u00884D@\u00d9\u00c6lm\u008c\u00da\u00cfF\rv8\u000e!\u0012/\u0014 \u00e4\u00e7[\u0081\u00a8\u0094\u00aa\u00ac\u00d0\u0085B\u00ed\u009d\u00c98\u00c0\u00fd*\u00e6\u00bdd\u00af\u0091\u00e6\u001f#q<bW\u00e0\u0098\\;E\b\u0014\u0012\u001d\u00edag\u00bc\u0094's\u0097\u0088\u009ePg\u00fc\u00a3i\u00e7\u00da\u000b\u0007\u009a\u001c`\u00f7\u00e7\t\u007f\u00d4\u001f\u0080_qn\u00bf\u008eC-\u00ff\u0087f2\u00fa\u00071>MV\u00bcn\u0092\u0012\u0003\u00ed\u00c0h\u00e7W\u00f8&\u00d2E\u0088\u00ae\u00f9\u00d7\u00fbH\u00b7Q\u00ad\u0095\u00bf\u008c\u00c0\u00d9\u0099U\u00ed\u00865\u0016\u00ea_q";
                var7_6 = ":y\u0091\u00e5\u0018\u00a4\n\u0085\u0080u\u00de\u00a2\u00a6\u0007\u00cfZZ\u008a@\u008a\u00c7^\u00af\u00dd\u0092\u000b\u00a1\u00c9\u00b8\u00f0_\u00ac\u00b6\u00be\u00c6Th\u009b\u00fa\u00b7\u00c1\u009a\u00ea\u000eT\u00ba\u00b9O\u00e79\u00e6iC\u00b1q.\u00b1\u00a5=?w\rm\u00a1he\u00e1\u001dJ3\u009f\u008f\u00d9\u00cbF\u00d5\u00c4s\u00aa\u00e5S\u00b6\u0080\u009b\u00db\u00c8\\\u0012\u00fak\u0014\u00ech0q\u009e\u009a\u00f5I\u00a1\u00df\u00cf5[\u0011W\u00d8\u00cf\u009d\u0097gc\u00e3\n\u00ad\u0001NB\u0091g1l\f\u000b5\u0007\u00d7\u00cf\u00fdR\u0013\u00b5\u00b4\u00af\u00a0\u0016p\u00c8\u009b\u00c5E\u00e3T7\u0093U\u00e2\u0089\u00b2\u0010VO\u0094\u0005h\u00c2\u00b6\u00e7\u001fw\u00af\u00f8\u00f4\u0011\u00a4P7\u00f1\u0098?\u0005y\n\u008e \u0087Q\u00bf\u00ad\u00ecb,4a:\u00b5I\u00a6\f\u00803T\u00fe\u0015\r{\u00f3\u00b7\u0098Y\u00ec)h_\u00ed5\u00d3\u00abB\u00884D@\u00d9\u00c6lm\u008c\u00da\u00cfF\rv8\u000e!\u0012/\u0014 \u00e4\u00e7[\u0081\u00a8\u0094\u00aa\u00ac\u00d0\u0085B\u00ed\u009d\u00c98\u00c0\u00fd*\u00e6\u00bdd\u00af\u0091\u00e6\u001f#q<bW\u00e0\u0098\\;E\b\u0014\u0012\u001d\u00edag\u00bc\u0094's\u0097\u0088\u009ePg\u00fc\u00a3i\u00e7\u00da\u000b\u0007\u009a\u001c`\u00f7\u00e7\t\u007f\u00d4\u001f\u0080_qn\u00bf\u008eC-\u00ff\u0087f2\u00fa\u00071>MV\u00bcn\u0092\u0012\u0003\u00ed\u00c0h\u00e7W\u00f8&\u00d2E\u0088\u00ae\u00f9\u00d7\u00fbH\u00b7Q\u00ad\u0095\u00bf\u008c\u00c0\u00d9\u0099U\u00ed\u00865\u0016\u00ea_q".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00aa\u00b0\u00c1G \u00ad\u0098K\u00c6u\u00c4u6CY\u009e";
                    var7_6 = "\u00aa\u00b0\u00c1G \u00ad\u0098K\u00c6u\u00c4u6CY\u009e".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        EncryptionTransformer.c = var8_3;
        EncryptionTransformer.d = new Integer[46];
        EncryptionTransformer.z = ClassPoolRegistry.q();
        EncryptionTransformer.v = new ArrayList<Class>();
        EncryptionTransformer.Q = 0;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/XW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private Throwable F(Throwable throwable) {
        Throwable throwable2 = throwable.getCause();
        try {
            if (throwable2 == null) {
                return throwable;
            }
        }
        catch (RuntimeException runtimeException) {
            throw EncryptionTransformer.b(runtimeException);
        }
        return this.F(throwable2);
    }

    @Override
    public abstract void y();

    public String N(HK hK, Class clazz, String string, String string2, String string3) {
        return this.X(this.w(hK), clazz, string, string2, string3);
    }

    public EncryptionTransformer(Class clazz) {
        this.w = clazz;
    }

    public void O(HK hK, HK hK2, String string, boolean bl, boolean bl2, ClassRegistryManager ... classRegistryManagerArray) {
        long l = b ^ 0x67770CED312CL;
        try {
            String string2;
            String string3;
            StringBuilder stringBuilder;
            _c _c2;
            block14: {
                block13: {
                    _c2 = this.w(hK);
                    stringBuilder = new StringBuilder();
                    try {
                        if (bl2) {
                            stringBuilder.append((String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)21000, (long)(0x5C282D7B631A3A19L ^ l)), (long)3183772548773935119L, (long)l)));
                        }
                    }
                    catch (Exception exception) {
                        throw EncryptionTransformer.b(exception);
                    }
                    stringBuilder.append(string + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)16664, (long)(0xB34969A5A5AA919L ^ l)), (long)3183772548773935119L, (long)l)));
                    for (int i = 0; i < classRegistryManagerArray.length; ++i) {
                        string3 = (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)31865, (long)(0x3474BB1EB5C41465L ^ l)), (long)3183772548773935119L, (long)l)) + classRegistryManagerArray[i].v;
                        try {
                            if (i < classRegistryManagerArray.length - 1) {
                                stringBuilder.append(string3 + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)29520, (long)(0x24165A8CD3761B7EL ^ l)), (long)3183772548773935119L, (long)l)));
                                continue;
                            }
                        }
                        catch (Exception exception) {
                            throw EncryptionTransformer.b(exception);
                        }
                        stringBuilder.append(string3);
                    }
                    try {
                        if (!bl2) break block13;
                        stringBuilder.append((String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)28282, (long)(0x76626B471A490658L ^ l)), (long)3183772548773935119L, (long)l)));
                        break block14;
                    }
                    catch (Exception exception) {
                        throw EncryptionTransformer.b(exception);
                    }
                }
                stringBuilder.append((String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)31700, (long)(0x4062D82D508593F2L ^ l)), (long)3183772548773935119L, (long)l)));
            }
            String string4 = stringBuilder.toString();
            try {
                string2 = bl ? (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)23900, (long)(0xEE6FECDE4B5355EL ^ l)), (long)3183772548773935119L, (long)l)) + string4 + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)6597, (long)(0x6F24E76AEA65F1CEL ^ l)), (long)3183772548773935119L, (long)l)) : (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)2316, (long)(0x3E43296C5813E11AL ^ l)), (long)3183772548773935119L, (long)l)) + string4 + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)14006, (long)(0x252A989B5FDC5E9DL ^ l)), (long)3183772548773935119L, (long)l));
            }
            catch (Exception exception) {
                throw EncryptionTransformer.b(exception);
            }
            string3 = string2;
            _c2.x(new GenericContextResolver(this, hK2, string3));
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    public static void i(Class<?> clazz) {
        block10: {
            try {
                if (clazz == null) {
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw EncryptionTransformer.b(runtimeException);
            }
            try {
                if (v.contains(clazz)) {
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw EncryptionTransformer.b(runtimeException);
            }
            try {
                try {
                    EncryptionTransformer.c(new ClasspathResourceResolver(clazz.getName(), ReflectionUtility744.Q(clazz, true)), clazz);
                    if (clazz.getSuperclass() == null || clazz.getSuperclass() == Object.class) break block10;
                }
                catch (RuntimeException runtimeException) {
                    throw EncryptionTransformer.b(runtimeException);
                }
                EncryptionTransformer.i(clazz.getSuperclass());
            }
            catch (RuntimeException runtimeException) {
                throw EncryptionTransformer.b(runtimeException);
            }
        }
    }

    @Override
    public void d() {
        long l = b ^ 0x36A2AC9F65DBL;
        CallSite callSite = EncryptionTransformer.c("\u00c5", (Object)this.w, (Object)this.I, (long)8707863279889475095L, (long)l);
        String[] stringArray = ClassMetadataResolver731.D();
        try {
            if (AbstractComputationKernel.J() != null) {
                ClassMetadataResolver731.V(new String[5]);
            }
        }
        catch (RuntimeException runtimeException) {
            throw EncryptionTransformer.b(runtimeException);
        }
    }

    public String k(_c _c2, Class clazz, String string, boolean bl, String string2, String string3) {
        try {
            if (_c2 == null) {
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw EncryptionTransformer.b(runtimeException);
        }
        return this.t(() -> this.lambda$makeAndInsertEvent$0(clazz, string3, _c2, string, string2, bl));
    }

    public static void H(Class<?> clazz) {
        block10: {
            try {
                if (clazz == null) {
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw EncryptionTransformer.b(runtimeException);
            }
            try {
                if (v.contains(clazz)) {
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw EncryptionTransformer.b(runtimeException);
            }
            try {
                try {
                    EncryptionTransformer.c(new ClasspathResourceResolver(clazz.getName(), ReflectionUtility744.Q(clazz, true)), clazz);
                    if (clazz.getSuperclass() == null || clazz.getSuperclass() == Object.class) break block10;
                }
                catch (RuntimeException runtimeException) {
                    throw EncryptionTransformer.b(runtimeException);
                }
                EncryptionTransformer.H(clazz.getSuperclass());
            }
            catch (RuntimeException runtimeException) {
                throw EncryptionTransformer.b(runtimeException);
            }
        }
    }

    public String X(_c _c2, Class clazz, String string, String string2, String string3) {
        return this.k(_c2, clazz, string, false, string2, string3);
    }

    public String O(HK hK, Class clazz, String string) {
        return this.z(this.w(hK), clazz, string, "", "");
    }

    public String o(HK hK, Class clazz, String string, String string2, String string3) {
        return this.z(this.w(hK), clazz, string, string2, string3);
    }

    public void x() {
    }

    public static void s(Class clazz) {
        block5: {
            if (!TemporalMetadataResolver.h.r()) {
                ReflectionUtility744.Q(clazz, true);
                String string = clazz.getName();
                Set set = CommunicationChannelManager.J().i();
                try {
                    try {
                        set.remove(string);
                        CommunicationChannelManager.J().B().put(string, clazz);
                        if (clazz.getSuperclass() == null || clazz.getSuperclass() == Object.class) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw EncryptionTransformer.b(runtimeException);
                    }
                    EncryptionTransformer.s(clazz.getSuperclass());
                }
                catch (RuntimeException runtimeException) {
                    throw EncryptionTransformer.b(runtimeException);
                }
            }
        }
    }

    public static void k(int n) {
        Z = n;
    }

    private static Field c(long l, long l2) {
        int n = EncryptionTransformer.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = EncryptionTransformer.n[n];
            int n2 = string.indexOf(8);
            Class clazz = EncryptionTransformer.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = EncryptionTransformer.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = EncryptionTransformer.a(clazz3, string2, clazz2)) != null) {
                    EncryptionTransformer.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = EncryptionTransformer.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        EncryptionTransformer.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = EncryptionTransformer.b(560944236129375L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = EncryptionTransformer.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = EncryptionTransformer.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = EncryptionTransformer.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = EncryptionTransformer.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = EncryptionTransformer.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        EncryptionTransformer.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = EncryptionTransformer.b(560944236129375L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = EncryptionTransformer.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        EncryptionTransformer.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = EncryptionTransformer.b(560944236129375L, 0L);
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
    public void i() {
        try {
            this.I = ReflectionUtility744.Q(this.w, true);
            if (!TemporalMetadataResolver.h.r()) {
                CommunicationChannelManager.J().B().put(this.w.getName(), this.w);
            }
        }
        catch (RuntimeException runtimeException) {
            throw EncryptionTransformer.b(runtimeException);
        }
        this.J();
        this.K.Z();
        EncryptionTransformer.c(new DynamicClassLoader(this.w.getClassLoader()), this.w);
    }

    private <T> T V(TransmissionProtocolInterface<T> transmissionProtocolInterface, String string) {
        try {
            Class<?> clazz = Class.forName(string);
            if (v.contains(clazz)) {
                EncryptionTransformer.H(clazz);
                EncryptionTransformer.s(clazz);
                return this.u(transmissionProtocolInterface, true);
            }
            EncryptionTransformer.i(clazz);
            EncryptionTransformer.s(clazz);
            return this.t(transmissionProtocolInterface);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    private static void b() {
        Object[] objectArray = m;
        m[0] = "\u0014}&";
        objectArray[1] = Integer.TYPE;
        EncryptionTransformer.n[1] = "java/lang/Integer";
        objectArray[2] = "o:Tg\u001b$d5E(f<w2La";
        objectArray[3] = "\u001e\u0013j}";
        objectArray[4] = "\u0012da\u0010\u0015y\u0019kp_xy\u0019vd";
        objectArray[5] = "\u007f!-I";
        objectArray[6] = "Hv";
        objectArray[7] = "R\"tOe>Y-e\u0000\u00040R&aZ";
        objectArray[8] = "\u0019W%\u0011<=XDrGR\u0007#\u0007p\u001a2#\u001d[)R-D\u001a\\-_*'\u001dS9LR}CZ4X1zLN' k$EC3Cl+QPK\u00192\"\\D(\u001e=6O<r@4;[_uO (#";
        objectArray[9] = "LN^\u0003\f\u0006LLQa\u001b\u0001.I\u0000\u0011\u001b\u0011KI\u0000\n\u001fz\u0017\u0010\\\u001e\b\u0019\u0010\u001fH\rp";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "by]>K7%y\u001c|wX^\u007fYz\u0017``#\u00002\b\u0007b8\u001e%\u0016u#tY!w>d4\t+\u0012>d/\r@";
    }

    @Override
    public boolean P() {
        return this.W;
    }

    public _c w(HK hK) {
        long l = b ^ 0x761AAD7879BFL;
        try {
            if (hK.B().equals(EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)8555, (long)(0x49048F987EE201FFL ^ l)), (long)7258704386499162268L, (long)l))) {
                return this.K.w(hK.G());
            }
        }
        catch (RuntimeException runtimeException) {
            throw EncryptionTransformer.b(runtimeException);
        }
        try {
            return this.K.H(hK.B(), hK.G());
        }
        catch (CustomRuntimeException customRuntimeException) {
            TemporalMetadataResolver.W(customRuntimeException);
            return null;
        }
    }

    public MetaclassDefinitionRegistry Q(Class clazz) throws CustomRuntimeException {
        return z.g(clazz.getName());
    }

    public void f(HK hK, HK hK2, String string, int n) {
        try {
            _c _c2 = this.w(hK);
            AtomicInteger atomicInteger = new AtomicInteger();
            _c2.x(new SystemResourceAllocator1703(this, hK2, atomicInteger));
            _c2.p(atomicInteger.get() + n, string);
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    public String G(HK hK, Class clazz, String string, String string2) {
        return this.z(this.w(hK), clazz, string, string2, "");
    }

    @Override
    public int s() {
        CallSite callSite;
        block17: {
            CallSite callSite2;
            block18: {
                EncryptionTransformer encryptionTransformer;
                String[] stringArray;
                long l;
                block15: {
                    block16: {
                        block13: {
                            block14: {
                                l = b ^ 0x2223C0738293L;
                                stringArray = ClassMetadataResolver731.D();
                                try {
                                    try {
                                        encryptionTransformer = this;
                                        if (stringArray == null) break block13;
                                        if (!encryptionTransformer.h) break block14;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw EncryptionTransformer.b(runtimeException);
                                    }
                                    return -2;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw EncryptionTransformer.b(runtimeException);
                                }
                            }
                            encryptionTransformer = this;
                        }
                        try {
                            try {
                                if (stringArray == null) break block15;
                                if (encryptionTransformer.J != null) break block16;
                            }
                            catch (RuntimeException runtimeException) {
                                throw EncryptionTransformer.b(runtimeException);
                            }
                            return 0;
                        }
                        catch (RuntimeException runtimeException) {
                            throw EncryptionTransformer.b(runtimeException);
                        }
                    }
                    encryptionTransformer = this;
                }
                if ((callSite2 = EncryptionTransformer.c("\u00c5", (Object)encryptionTransformer.w, (Object)this.J, (long)-6948879380628766369L, (long)l)) != false) {
                    // empty if block
                }
                try {
                    try {
                        callSite = callSite2;
                        if (stringArray == null) break block17;
                        if (callSite != false) break block18;
                    }
                    catch (RuntimeException runtimeException) {
                        throw EncryptionTransformer.b(runtimeException);
                    }
                    this.W = true;
                }
                catch (RuntimeException runtimeException) {
                    throw EncryptionTransformer.b(runtimeException);
                }
            }
            callSite = callSite2;
        }
        return (int)callSite;
    }

    public MetaclassDefinitionRegistry J() {
        try {
            this.K = z.s(new ByteArrayInputStream(this.I), false);
            return this.K;
        }
        catch (IOException iOException) {
            TemporalMetadataResolver.W(iOException);
            return null;
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = EncryptionTransformer.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public String K(Class<?> clazz, String string, String string2, String string3, String string4) {
        String string5;
        String[] stringArray;
        String string6;
        block14: {
            long l;
            block15: {
                boolean bl;
                block13: {
                    block12: {
                        block11: {
                            l = b ^ 0x2F8A671687E5L;
                            string6 = "";
                            string6 = string6 + clazz.getName() + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)4976, (long)(0x122425B27701CDAAL ^ l)), (long)-7285064159539704122L, (long)l)) + string + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)20652, (long)(0x5BCAFE60E9640E69L ^ l)), (long)-7285064159539704122L, (long)l)) + clazz.getName() + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)6611, (long)(0x1ACBDC069ECE471EL ^ l)), (long)-7285064159539704122L, (long)l)) + string2 + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)2288, (long)(0x6F6E1718E354D616L ^ l)), (long)-7285064159539704122L, (long)l));
                            stringArray = ClassMetadataResolver731.D();
                            string6 = string6 + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)20471, (long)(0x437483B7DF869126L ^ l)), (long)-7285064159539704122L, (long)l)) + string + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)30868, (long)(0x63DFE87A29212640L ^ l)), (long)-7285064159539704122L, (long)l)) + Z3.P(clazz).getName() + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)24663, (long)(0x727B89C17314BE96L ^ l)), (long)-7285064159539704122L, (long)l)) + string3 + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)28911, (long)(0x61BD2A12A5E62E02L ^ l)), (long)-7285064159539704122L, (long)l)) + string4;
                            try {
                                try {
                                    bl = EventNotificationBroker2314.class.isAssignableFrom(clazz);
                                    if (stringArray == null) break block11;
                                    if (!bl) break block12;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw EncryptionTransformer.b(runtimeException);
                                }
                                bl = PersistenceStrategy.class.isAssignableFrom(clazz);
                            }
                            catch (RuntimeException runtimeException) {
                                throw EncryptionTransformer.b(runtimeException);
                            }
                        }
                        try {
                            if (stringArray == null) break block13;
                            if (!bl) break block12;
                        }
                        catch (RuntimeException runtimeException) {
                            throw EncryptionTransformer.b(runtimeException);
                        }
                        bl = true;
                        break block13;
                    }
                    bl = false;
                }
                boolean bl2 = bl;
                try {
                    if (stringArray == null) break block14;
                    if (!bl2) break block15;
                }
                catch (RuntimeException runtimeException) {
                    throw EncryptionTransformer.b(runtimeException);
                }
                Method method = Z3.X(clazz);
                string6 = (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)20328, (long)(0x5603F075212A91BAL ^ l)), (long)-7285064159539704122L, (long)l)) + clazz.getName() + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)29897, (long)(0x785476731D40AA29L ^ l)), (long)-7285064159539704122L, (long)l)) + method.getName() + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)11070, (long)(0x56621034050275F1L ^ l)), (long)-7285064159539704122L, (long)l)) + Z3.x().getName() + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)31300, (long)(0x2AA80B728C212487L ^ l)), (long)-7285064159539704122L, (long)l)) + string6 + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)14655, (long)(0x3A0C23E05046E7D1L ^ l)), (long)-7285064159539704122L, (long)l));
            }
            string6 = (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)11910, (long)(0x3F160A96556A705DL ^ l)), (long)-7285064159539704122L, (long)l)) + string6 + (String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)16611, (long)(0x4019B6BB86541E2AL ^ l)), (long)-7285064159539704122L, (long)l));
        }
        try {
            string5 = string6;
            if (stringArray == null) {
                AbstractComputationKernel.I(new String[4]);
            }
        }
        catch (RuntimeException runtimeException) {
            throw EncryptionTransformer.b(runtimeException);
        }
        return string5;
    }

    public void b(HK hK) {
        long l = b ^ 0x4BDB176DC4F9L;
        try {
            MetaclassDefinitionRegistry metaclassDefinitionRegistry = ClassPoolRegistry.q().g((String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)17777, (long)(0x4EEA39D8C1AD8ABL ^ l)), (long)-2739836810681152038L, (long)l)));
            this.w(hK).P((String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)7564, (long)(0x6CFEC3209EE3805CL ^ l)), (long)-2739836810681152038L, (long)l)), metaclassDefinitionRegistry);
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    public void S(CryptographicTransformer406 cryptographicTransformer406) {
        this.t(() -> this.lambda$insertFromEventFactory$1(cryptographicTransformer406));
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4422;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/XW", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EncryptionTransformer.d[n2] = n3;
        }
        return d[n2];
    }

    public void a(HK hK) {
        long l = b ^ 0x55874822DE73L;
        _c _c2 = this.w(hK);
        try {
            _c2.V((String)((Object)EncryptionTransformer.c("\u00c5", (int)EncryptionTransformer.a("h", (int)28853, (long)(0x2F809A6A94AC77FAL ^ l)), (long)-4363923496242210992L, (long)l)));
        }
        catch (ContextualExceptionHandler contextualExceptionHandler) {
            TemporalMetadataResolver.W(contextualExceptionHandler);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(EncryptionTransformer.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(EncryptionTransformer.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

