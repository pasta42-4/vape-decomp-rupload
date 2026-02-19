/*
 * Decompiled with CFR 0.152.
 */
package com.ui.rendering;

import a.hQ;
import com.adapter.management.GenericAdapterManager;
import com.app.core.generics.GenericTypeResolver;
import com.app.system.configuration.RuntimeConfigurationBuilder;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.computation.AbstractComputationKernel;
import com.crypto.cipher.SymmetricCipherManager;
import com.data.serialization.JsonPayloadOrchestrator;
import com.deobfuscation.mapping.GenericComponentMapper;
import com.exception.system.CustomSystemException;
import com.math.transformation.NumericTransformationEngine;
import com.network.connection.NetworkConnectionDescriptor;
import com.network.connection.NetworkConnectionEstablisher;
import com.runtime.context.ContextualExecutionFramework;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.crypto.CryptographicSecurityManager;
import com.security.tokenization.SecureTokenGenerator1301;
import com.transaction.management.TransactionCoordinator1899;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class UIRenderingController {
    private static final Integer[] c;
    private static final String[] f;
    private final HashMap<ConfigurationProfileResolver<?, ?>, AbstractComputationKernel> Z;
    private final JsonPayloadOrchestrator q;
    private final HashMap<ConfigurationProfileResolver<?, ?>, ConfigurationProfileResolver<?, ?>> n;
    private static final Object[] e;
    private static final long[] b;
    private final HashMap<ConfigurationProfileResolver<?, ?>, ConfigurationProfileResolver<?, ?>> g;
    private static int u;
    private Color M = new Color(54, 53, 54, 128);
    private final HashMap<ConfigurationProfileResolver<?, ?>, GenericTypeResolver<?, ?>> X;
    private final HashMap<CryptographicSecurityManager, List<AbstractComputationKernel>> x;
    private static final Map d;
    private static final long a;

    public void w() {
        for (CryptographicSecurityManager cryptographicSecurityManager : this.q.S()) {
            this.p(cryptographicSecurityManager);
        }
    }

    private static Field c(long l, long l2) {
        int n = UIRenderingController.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = UIRenderingController.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = UIRenderingController.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = UIRenderingController.a(clazz3, string2, clazz2)) != null) {
                    UIRenderingController.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = UIRenderingController.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        UIRenderingController.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = UIRenderingController.b(228962890750491L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'H' || c == 'w' || c == 'l' || c == '\u00dc') {
                field = UIRenderingController.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'H' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'w' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'l' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = UIRenderingController.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Y' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = UIRenderingController.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                UIRenderingController.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = UIRenderingController.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = UIRenderingController.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "y\u0019\u0017";
        objectArray[1] = Integer.TYPE;
        UIRenderingController.f[1] = "java/lang/Integer";
        objectArray[2] = "\u000bl `(I\u0000c1/UQ\u0013d8f";
        objectArray[3] = "h5on\u0001zc:~!`th1z{";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "z\u007f\u0000Z-W'q\\gvA\u0017u\\\\b^hm\t\u0006\u001d\u0003j}^\u0003p\u0001sd\u0001g";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Bx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void B(ConfigurationProfileResolver<?, ?> configurationProfileResolver) {
        try {
            if (configurationProfileResolver instanceof GenericAdapterManager) {
                this.p((GenericAdapterManager)configurationProfileResolver);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UIRenderingController.a(customSystemException);
        }
    }

    private void lambda$createProxyValues$0(GenericTypeResolver genericTypeResolver) {
        this.l((ConfigurationProfileResolver<?, ?>)genericTypeResolver.n());
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
                n3 = 34;
                break;
            }
            case 1: {
                n3 = 46;
                break;
            }
            case 2: {
                n3 = 18;
                break;
            }
            case 3: {
                n3 = 8;
                break;
            }
            case 4: {
                n3 = 62;
                break;
            }
            case 5: {
                n3 = 44;
                break;
            }
            case 6: {
                n3 = 13;
                break;
            }
            case 7: {
                n3 = 57;
                break;
            }
            case 8: {
                n3 = 37;
                break;
            }
            case 9: {
                n3 = 48;
                break;
            }
            case 10: {
                n3 = 59;
                break;
            }
            case 11: {
                n3 = 28;
                break;
            }
            case 12: {
                n3 = 11;
                break;
            }
            case 13: {
                n3 = 51;
                break;
            }
            case 14: {
                n3 = 58;
                break;
            }
            case 15: {
                n3 = 2;
                break;
            }
            case 16: {
                n3 = 56;
                break;
            }
            case 17: {
                n3 = 9;
                break;
            }
            case 18: {
                n3 = 41;
                break;
            }
            case 19: {
                n3 = 0;
                break;
            }
            case 20: {
                n3 = 29;
                break;
            }
            case 21: {
                n3 = 61;
                break;
            }
            case 22: {
                n3 = 21;
                break;
            }
            case 23: {
                n3 = 33;
                break;
            }
            case 24: {
                n3 = 36;
                break;
            }
            case 25: {
                n3 = 22;
                break;
            }
            case 26: {
                n3 = 25;
                break;
            }
            case 27: {
                n3 = 38;
                break;
            }
            case 28: {
                n3 = 7;
                break;
            }
            case 29: {
                n3 = 26;
                break;
            }
            case 30: {
                n3 = 30;
                break;
            }
            case 31: {
                n3 = 17;
                break;
            }
            case 32: {
                n3 = 40;
                break;
            }
            case 33: {
                n3 = 49;
                break;
            }
            case 34: {
                n3 = 60;
                break;
            }
            case 35: {
                n3 = 54;
                break;
            }
            case 36: {
                n3 = 1;
                break;
            }
            case 37: {
                n3 = 23;
                break;
            }
            case 38: {
                n3 = 35;
                break;
            }
            case 39: {
                n3 = 42;
                break;
            }
            case 40: {
                n3 = 24;
                break;
            }
            case 41: {
                n3 = 45;
                break;
            }
            case 42: {
                n3 = 27;
                break;
            }
            case 43: {
                n3 = 32;
                break;
            }
            case 44: {
                n3 = 3;
                break;
            }
            case 45: {
                n3 = 31;
                break;
            }
            case 46: {
                n3 = 50;
                break;
            }
            case 47: {
                n3 = 52;
                break;
            }
            case 48: {
                n3 = 16;
                break;
            }
            case 49: {
                n3 = 12;
                break;
            }
            case 50: {
                n3 = 4;
                break;
            }
            case 51: {
                n3 = 14;
                break;
            }
            case 52: {
                n3 = 5;
                break;
            }
            case 53: {
                n3 = 63;
                break;
            }
            case 54: {
                n3 = 19;
                break;
            }
            case 55: {
                n3 = 55;
                break;
            }
            case 56: {
                n3 = 53;
                break;
            }
            case 57: {
                n3 = 15;
                break;
            }
            case 58: {
                n3 = 39;
                break;
            }
            case 59: {
                n3 = 20;
                break;
            }
            case 60: {
                n3 = 6;
                break;
            }
            case 61: {
                n3 = 43;
                break;
            }
            case 62: {
                n3 = 10;
                break;
            }
            default: {
                n3 = 47;
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
        UIRenderingController.f[n4] = new String(cArray);
        return n4;
    }

    public List<AbstractComputationKernel> U(CryptographicSecurityManager cryptographicSecurityManager) {
        return this.x.get(cryptographicSecurityManager);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = UIRenderingController.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void p(CryptographicSecurityManager cryptographicSecurityManager) {
        for (GenericTypeResolver<?, ?> genericTypeResolver : cryptographicSecurityManager.o()) {
            this.l((ConfigurationProfileResolver<?, ?>)genericTypeResolver.n());
        }
        cryptographicSecurityManager.n();
        cryptographicSecurityManager.o(false);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Bx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1462;
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
                throw new RuntimeException("a/Bx", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            UIRenderingController.c[n2] = n3;
        }
        return c[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public UIRenderingController(JsonPayloadOrchestrator jsonPayloadOrchestrator) {
        this.g = new HashMap();
        this.X = new HashMap();
        this.n = new HashMap();
        this.Z = new HashMap();
        this.x = new HashMap();
        this.q = jsonPayloadOrchestrator;
        this.s();
    }

    public void l(ConfigurationProfileResolver<?, ?> configurationProfileResolver) {
        ConfigurationProfileResolver<?, ?> configurationProfileResolver2 = this.g.get(configurationProfileResolver);
        try {
            if (configurationProfileResolver2 == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UIRenderingController.a(customSystemException);
        }
        GenericTypeResolver<?, ?> genericTypeResolver = this.X.get(configurationProfileResolver2);
        try {
            if (genericTypeResolver == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UIRenderingController.a(customSystemException);
        }
        configurationProfileResolver2.W();
        genericTypeResolver.v(configurationProfileResolver2.J());
        configurationProfileResolver.M();
        configurationProfileResolver2.M();
        if (configurationProfileResolver instanceof SecureTokenGenerator1301) {
            SecureTokenGenerator1301 secureTokenGenerator1301 = (SecureTokenGenerator1301)configurationProfileResolver;
            List<ConfigurationProfileResolver> list = secureTokenGenerator1301.w();
            for (ConfigurationProfileResolver configurationProfileResolver3 : list) {
                ConfigurationProfileResolver<?, ?> configurationProfileResolver4 = this.g.get(configurationProfileResolver3);
                AbstractComputationKernel abstractComputationKernel = this.Z.get(configurationProfileResolver4);
                try {
                    if (abstractComputationKernel != null) continue;
                    this.l(configurationProfileResolver3);
                }
                catch (CustomSystemException customSystemException) {
                    throw UIRenderingController.a(customSystemException);
                }
            }
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = UIRenderingController.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void p(GenericAdapterManager genericAdapterManager) {
        for (NetworkConnectionEstablisher networkConnectionEstablisher : genericAdapterManager.Z()) {
            if (!(networkConnectionEstablisher instanceof GenericComponentMapper)) continue;
            GenericComponentMapper genericComponentMapper = (GenericComponentMapper)networkConnectionEstablisher;
            for (ConfigurationProfileResolver<?, ?> configurationProfileResolver : ((ContextualExecutionFramework)genericComponentMapper.c()).F()) {
                ConfigurationProfileResolver<?, ?> configurationProfileResolver2 = this.g.get(configurationProfileResolver);
                try {
                    if (configurationProfileResolver2 == null) continue;
                    genericAdapterManager.l(configurationProfileResolver2, genericComponentMapper);
                }
                catch (CustomSystemException customSystemException) {
                    throw UIRenderingController.a(customSystemException);
                }
            }
        }
    }

    private void s() {
        long l = a ^ 0x5D8CD9B986A1L;
        for (CryptographicSecurityManager cryptographicSecurityManager : this.q.S()) {
            Object object;
            Object object2;
            ConfigurationProfileResolver<?, ?> configurationProfileResolver;
            ConfigurationProfileResolver<?, ?> configurationProfileResolver2;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            this.x.put(cryptographicSecurityManager, arrayList);
            for (GenericTypeResolver<?, ?> genericTypeResolver : cryptographicSecurityManager.o()) {
                boolean bl;
                Object object3;
                boolean bl2;
                block22: {
                    configurationProfileResolver2 = RuntimeConfigurationBuilder.h(genericTypeResolver);
                    this.B(configurationProfileResolver2);
                    configurationProfileResolver = RuntimeConfigurationBuilder.s(configurationProfileResolver2, true);
                    try {
                        if (configurationProfileResolver == null) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw UIRenderingController.a(customSystemException);
                    }
                    bl2 = true;
                    if (genericTypeResolver.n() instanceof NetworkConnectionDescriptor && ((ConfigurationProfileResolver)(object2 = (NetworkConnectionDescriptor)genericTypeResolver.n())).G() instanceof AuthenticationStateTracker) {
                        object = (AuthenticationStateTracker)((ConfigurationProfileResolver)object2).G();
                        try {
                            if (((AuthenticationStateTracker)object).C() == null || !((AuthenticationStateTracker)object).C().equals(object2)) break block22;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw UIRenderingController.a(customSystemException);
                        }
                        bl2 = false;
                    }
                }
                ((AbstractComputationKernel)((Object)configurationProfileResolver)).J(true);
                ((AbstractComputationKernel)((Object)configurationProfileResolver)).Y(182.0);
                ((AbstractComputationKernel)((Object)configurationProfileResolver)).Z(0.0);
                object2 = new SymmetricCipherManager(u);
                ((NumericTransformationEngine)object2).d().J(true);
                object = new TransactionCoordinator1899(this, (String)((Object)UIRenderingController.b("Y", (int)UIRenderingController.a("c", (int)11818, (long)(0x16B8266F92C1ED3FL ^ l)), (long)-2921117698925705398L, (long)l)), this.M, 0.75, 11.0, 11.0, (AbstractComputationKernel)((Object)configurationProfileResolver), genericTypeResolver);
                try {
                    object3 = object;
                    bl = !configurationProfileResolver2.p();
                }
                catch (CustomSystemException customSystemException) {
                    throw UIRenderingController.a(customSystemException);
                }
                try {
                    ((AbstractComputationKernel)object3).N(bl);
                    ((hQ)object).C(() -> this.lambda$createProxyValues$0(genericTypeResolver));
                    if (bl2) {
                        ((NumericTransformationEngine)object2).n((AbstractComputationKernel)((Object)configurationProfileResolver), new Object[0]);
                        ((NumericTransformationEngine)object2).n((AbstractComputationKernel)object, new Object[0]);
                        arrayList.add(object2);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw UIRenderingController.a(customSystemException);
                }
                try {
                    this.g.put((ConfigurationProfileResolver<?, ?>)genericTypeResolver.n(), configurationProfileResolver2);
                    if (((ConfigurationProfileResolver)genericTypeResolver.n()).G() != null) {
                        this.n.put(configurationProfileResolver2, ((ConfigurationProfileResolver)genericTypeResolver.n()).G());
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw UIRenderingController.a(customSystemException);
                }
                try {
                    this.X.put(configurationProfileResolver2, genericTypeResolver);
                    if (!bl2) continue;
                    this.Z.put(configurationProfileResolver2, (AbstractComputationKernel)((Object)configurationProfileResolver));
                }
                catch (CustomSystemException customSystemException) {
                    throw UIRenderingController.a(customSystemException);
                }
            }
            for (ConfigurationProfileResolver configurationProfileResolver3 : this.n.keySet()) {
                SecureTokenGenerator1301 secureTokenGenerator1301;
                configurationProfileResolver2 = this.n.get(configurationProfileResolver3);
                if (configurationProfileResolver2 == null) continue;
                configurationProfileResolver = this.g.get(configurationProfileResolver2);
                if (configurationProfileResolver instanceof SecureTokenGenerator1301) {
                    secureTokenGenerator1301 = (SecureTokenGenerator1301)configurationProfileResolver;
                    secureTokenGenerator1301.l(configurationProfileResolver3);
                }
                try {
                    if (!(configurationProfileResolver3 instanceof NetworkConnectionDescriptor) || !(configurationProfileResolver instanceof AuthenticationStateTracker)) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw UIRenderingController.a(customSystemException);
                }
                secureTokenGenerator1301 = (AuthenticationStateTracker)configurationProfileResolver;
                object2 = (NetworkConnectionDescriptor)configurationProfileResolver3;
                ((AuthenticationStateTracker)secureTokenGenerator1301).E((NetworkConnectionDescriptor)object2);
                object = this.Z.get(secureTokenGenerator1301);
                if (!(object instanceof AdaptiveCipherEngine)) continue;
                AdaptiveCipherEngine adaptiveCipherEngine = (AdaptiveCipherEngine)object;
                adaptiveCipherEngine.y();
                adaptiveCipherEngine.P().d(true);
            }
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = UIRenderingController.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = UIRenderingController.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = UIRenderingController.a(l, l2);
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
                clazz3 = UIRenderingController.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = UIRenderingController.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = UIRenderingController.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        UIRenderingController.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = UIRenderingController.b(228962890750491L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = UIRenderingController.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        UIRenderingController.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = UIRenderingController.b(228962890750491L, 0L);
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
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(1706548372191465137L, -5086454633167518875L, MethodHandles.lookup().lookupClass()).a(118865144608052L);
        long l = a ^ 0x26ED569E579BL;
        e = new Object[5];
        f = new String[5];
        UIRenderingController.a();
        d = new HashMap(13);
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
        String string = "\u00e4\u0088\u00e1\u0093\u00acA\u00ca\u0011\u00a2\u0099\u00e1\u00a5\u00feJ\u008c\u00ce";
        int n2 = "\u00e4\u0088\u00e1\u0093\u00acA\u00ca\u0011\u00a2\u0099\u00e1\u00a5\u00feJ\u008c\u00ce".length();
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
        u = (int)UIRenderingController.a("c", (int)18407, (long)(0x3185BA3F9834D5C9L ^ l));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(UIRenderingController.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(UIRenderingController.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

