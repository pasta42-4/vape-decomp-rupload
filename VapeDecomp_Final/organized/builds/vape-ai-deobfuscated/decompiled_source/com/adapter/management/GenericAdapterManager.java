/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.adapter.management;

import com.app.context.transformation.ContextTransformationEngine;
import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.deobfuscation.mapping.GenericComponentMapper;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonObject;
import com.network.connection.NetworkConnectionEstablisher;
import com.runtime.context.ContextualExecutionFramework;
import com.security.authentication.AuthenticationGateway1860;
import com.security.tokenization.SecureTokenGenerator1301;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class GenericAdapterManager
extends SecureTokenGenerator1301<NetworkConnectionEstablisher, GenericAdapterManager> {
    private static final String[] h;
    private static final long d;
    private static int[] n;
    private static final Object[] g;
    private final String K;
    private final NetworkConnectionEstablisher[] A;
    private NetworkConnectionEstablisher a = null;
    private static final long e;
    private final Map<ConfigurationProfileResolver<?, ?>, ArrayList<NetworkConnectionEstablisher>> L = new HashMap();

    public static GenericAdapterManager I(Object object, String string, String string2, NetworkConnectionEstablisher networkConnectionEstablisher, NetworkConnectionEstablisher ... networkConnectionEstablisherArray) {
        return GenericAdapterManager.c(object, string, string, string2, networkConnectionEstablisher, 1, networkConnectionEstablisherArray);
    }

    public static GenericAdapterManager c(Object object, String string, String string2, String string3, NetworkConnectionEstablisher networkConnectionEstablisher, int n, NetworkConnectionEstablisher[] networkConnectionEstablisherArray) {
        GenericAdapterManager genericAdapterManager = new GenericAdapterManager(object, string, string2, networkConnectionEstablisher, networkConnectionEstablisherArray);
        genericAdapterManager.R(string3);
        for (NetworkConnectionEstablisher networkConnectionEstablisher2 : networkConnectionEstablisherArray) {
            networkConnectionEstablisher2.i(genericAdapterManager);
        }
        return genericAdapterManager;
    }

    public static GenericAdapterManager E(Object object, String string, String string2, String string3, NetworkConnectionEstablisher networkConnectionEstablisher, NetworkConnectionEstablisher ... networkConnectionEstablisherArray) {
        return GenericAdapterManager.c(object, string, string2, string3, networkConnectionEstablisher, 1, networkConnectionEstablisherArray);
    }

    public void U(AuthenticationGateway1860 authenticationGateway1860) {
        this.a = authenticationGateway1860;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    @Override
    public String O() {
        return this.K;
    }

    @Override
    public boolean j(ConfigurationProfileResolver configurationProfileResolver) {
        if (this.L.containsKey(configurationProfileResolver)) {
            ArrayList<NetworkConnectionEstablisher> arrayList = this.L.get(configurationProfileResolver);
            return arrayList.contains(this.J());
        }
        return false;
    }

    public static void D(int[] nArray) {
        n = nArray;
    }

    public void s(AuthenticationGateway1860 authenticationGateway1860, ConfigurationProfileResolver ... configurationProfileResolverArray) {
        this.l(configurationProfileResolverArray);
        for (ConfigurationProfileResolver configurationProfileResolver : configurationProfileResolverArray) {
            this.l(configurationProfileResolver, authenticationGateway1860);
        }
    }

    @Override
    public void i(String string) {
        GenericAdapterManager genericAdapterManager = ((NetworkConnectionEstablisher)this.J()).r();
        try {
            if (genericAdapterManager == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericAdapterManager.b(customSystemException);
        }
        NetworkConnectionEstablisher networkConnectionEstablisher = NetworkConnectionEstablisher.K(genericAdapterManager, string);
        try {
            if (networkConnectionEstablisher == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericAdapterManager.b(customSystemException);
        }
        this.V(networkConnectionEstablisher);
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void r(GenericComponentMapper genericComponentMapper, GenericComponentMapper genericComponentMapper2) {
        try {
            if (this.f()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericAdapterManager.b(customSystemException);
        }
        Object t = ((ContextTransformationEngine)genericComponentMapper.c()).n();
        ((ContextualExecutionFramework)t).A(genericComponentMapper, genericComponentMapper2);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = GenericAdapterManager.e(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                GenericAdapterManager.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void V(NetworkConnectionEstablisher networkConnectionEstablisher) {
        block9: {
            try {
                if (((NetworkConnectionEstablisher)this.J()).equals(networkConnectionEstablisher)) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GenericAdapterManager.b(customSystemException);
            }
            try {
                try {
                    try {
                        if (this.U() == null || !(networkConnectionEstablisher instanceof GenericComponentMapper)) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GenericAdapterManager.b(customSystemException);
                    }
                    if (!(this.J() instanceof GenericComponentMapper)) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw GenericAdapterManager.b(customSystemException);
                }
                this.r((GenericComponentMapper)this.J(), (GenericComponentMapper)networkConnectionEstablisher);
            }
            catch (CustomSystemException customSystemException) {
                throw GenericAdapterManager.b(customSystemException);
            }
        }
        super.H(networkConnectionEstablisher);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = GenericAdapterManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = GenericAdapterManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public GenericAdapterManager S() {
        return new GenericAdapterManager(null, this.x(), this.O(), (NetworkConnectionEstablisher)this.J(), this.Z());
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "Z1\u0005";
        objectArray[1] = Integer.TYPE;
        GenericAdapterManager.h[1] = "java/lang/Integer";
        objectArray[2] = "\u000eZ*\u0017?]\u0005U;XBE\u0016R2\u0011";
        objectArray[3] = "\u001dd%\u000eDE\u0016k4A%K\u001d`0\u001b";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ";\\&T\u0011\\9M/iGJR\u0019{\u0012^]*\u001e,\u0006\u00171kD8\fO\u0000(\u0019,X,";
    }

    public NetworkConnectionEstablisher k() {
        try {
            if (this.a != null) {
                return this.a;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericAdapterManager.b(customSystemException);
        }
        for (NetworkConnectionEstablisher networkConnectionEstablisher : this.A) {
            try {
                if (networkConnectionEstablisher.p()) continue;
                return networkConnectionEstablisher;
            }
            catch (CustomSystemException customSystemException) {
                throw GenericAdapterManager.b(customSystemException);
            }
        }
        return null;
    }

    public static GenericAdapterManager D(Object object, String string, NetworkConnectionEstablisher networkConnectionEstablisher, NetworkConnectionEstablisher ... networkConnectionEstablisherArray) {
        return GenericAdapterManager.I(object, string, string, networkConnectionEstablisher, networkConnectionEstablisherArray);
    }

    public static GenericAdapterManager v(Object object, String string, String string2, NetworkConnectionEstablisher networkConnectionEstablisher, int n, NetworkConnectionEstablisher ... networkConnectionEstablisherArray) {
        return GenericAdapterManager.c(object, string, string, string2, networkConnectionEstablisher, n, networkConnectionEstablisherArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public GenericAdapterManager(Object object, String string, String string2, NetworkConnectionEstablisher networkConnectionEstablisher, NetworkConnectionEstablisher[] networkConnectionEstablisherArray) {
        super(object, string, networkConnectionEstablisher);
        this.K = string2;
        this.A = networkConnectionEstablisherArray;
        if (object instanceof ContextualExecutionFramework) {
            ContextualExecutionFramework contextualExecutionFramework = (ContextualExecutionFramework)object;
            for (NetworkConnectionEstablisher networkConnectionEstablisher2 : networkConnectionEstablisherArray) {
                if (!(networkConnectionEstablisher2 instanceof GenericComponentMapper)) continue;
                GenericComponentMapper genericComponentMapper = (GenericComponentMapper)networkConnectionEstablisher2;
                for (ConfigurationProfileResolver<?, ?> configurationProfileResolver : ((ContextualExecutionFramework)genericComponentMapper.c()).F()) {
                    contextualExecutionFramework.N(configurationProfileResolver);
                    this.l(configurationProfileResolver, genericComponentMapper);
                }
            }
        }
    }

    @Override
    public JsonObject k(boolean bl) {
        long l = d ^ 0x9AA57CBDDD2L;
        JsonObject jsonObject = this.y();
        try {
            if (this.J() != null) {
                jsonObject.addProperty((String)((Object)GenericAdapterManager.b("\u00dd", (int)((int)e), (long)3066978305591393839L, (long)l)), ((NetworkConnectionEstablisher)this.J()).F());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericAdapterManager.b(customSystemException);
        }
        return jsonObject;
    }

    @Override
    public boolean y() {
        return true;
    }

    private static Method h(long l, long l2) {
        int n = GenericAdapterManager.e(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = GenericAdapterManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = GenericAdapterManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = GenericAdapterManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        GenericAdapterManager.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = GenericAdapterManager.f(277496444567486L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = GenericAdapterManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        GenericAdapterManager.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = GenericAdapterManager.f(277496444567486L, 0L);
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

    public void S(int n) {
        this.V(this.Z()[n]);
    }

    public void l(ConfigurationProfileResolver configurationProfileResolver, AuthenticationGateway1860 authenticationGateway1860) {
        try {
            this.l(configurationProfileResolver);
            if (!this.L.containsKey(configurationProfileResolver)) {
                this.L.put(configurationProfileResolver, new ArrayList());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericAdapterManager.b(customSystemException);
        }
        ArrayList<NetworkConnectionEstablisher> arrayList = this.L.get(configurationProfileResolver);
        arrayList.add(authenticationGateway1860);
    }

    public static int[] V() {
        return n;
    }

    public int V() {
        int n = 0;
        while (true) {
            block5: {
                try {
                    try {
                        if (n >= this.Z().length) break;
                        if (!((NetworkConnectionEstablisher)this.J()).equals(this.Z()[n])) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GenericAdapterManager.b(customSystemException);
                    }
                    return n;
                }
                catch (CustomSystemException customSystemException) {
                    throw GenericAdapterManager.b(customSystemException);
                }
            }
            ++n;
        }
        return 0;
    }

    @Override
    public String p() {
        return ((NetworkConnectionEstablisher)this.J()).toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = MultiContainerRegistry.a(807841395358616133L, 5723819430918052155L, MethodHandles.lookup().lookupClass()).a(242352177905985L);
        g = new Object[5];
        h = new String[5];
        GenericAdapterManager.a();
        long l = d ^ 0x7E9214EECB52L;
        GenericAdapterManager.D(null);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 8809627940333266392L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                e = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ca' || c == 'a' || c == '\u00fe' || c == '\u00df') {
                field = GenericAdapterManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ca' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = GenericAdapterManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00dd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public NetworkConnectionEstablisher[] Z() {
        return this.A;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = GenericAdapterManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field g(long l, long l2) {
        int n = GenericAdapterManager.e(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = GenericAdapterManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = GenericAdapterManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = GenericAdapterManager.c(clazz3, string2, clazz2)) != null) {
                    GenericAdapterManager.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = GenericAdapterManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        GenericAdapterManager.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = GenericAdapterManager.f(277496444567486L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (h[n4] != null) {
            return n4;
        }
        Object object = g[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 11;
                break;
            }
            case 1: {
                n3 = 7;
                break;
            }
            case 2: {
                n3 = 33;
                break;
            }
            case 3: {
                n3 = 14;
                break;
            }
            case 4: {
                n3 = 58;
                break;
            }
            case 5: {
                n3 = 5;
                break;
            }
            case 6: {
                n3 = 61;
                break;
            }
            case 7: {
                n3 = 16;
                break;
            }
            case 8: {
                n3 = 0;
                break;
            }
            case 9: {
                n3 = 35;
                break;
            }
            case 10: {
                n3 = 38;
                break;
            }
            case 11: {
                n3 = 17;
                break;
            }
            case 12: {
                n3 = 2;
                break;
            }
            case 13: {
                n3 = 8;
                break;
            }
            case 14: {
                n3 = 46;
                break;
            }
            case 15: {
                n3 = 59;
                break;
            }
            case 16: {
                n3 = 23;
                break;
            }
            case 17: {
                n3 = 34;
                break;
            }
            case 18: {
                n3 = 55;
                break;
            }
            case 19: {
                n3 = 52;
                break;
            }
            case 20: {
                n3 = 20;
                break;
            }
            case 21: {
                n3 = 56;
                break;
            }
            case 22: {
                n3 = 53;
                break;
            }
            case 23: {
                n3 = 27;
                break;
            }
            case 24: {
                n3 = 60;
                break;
            }
            case 25: {
                n3 = 28;
                break;
            }
            case 26: {
                n3 = 39;
                break;
            }
            case 27: {
                n3 = 19;
                break;
            }
            case 28: {
                n3 = 50;
                break;
            }
            case 29: {
                n3 = 57;
                break;
            }
            case 30: {
                n3 = 63;
                break;
            }
            case 31: {
                n3 = 40;
                break;
            }
            case 32: {
                n3 = 48;
                break;
            }
            case 33: {
                n3 = 62;
                break;
            }
            case 34: {
                n3 = 4;
                break;
            }
            case 35: {
                n3 = 37;
                break;
            }
            case 36: {
                n3 = 42;
                break;
            }
            case 37: {
                n3 = 32;
                break;
            }
            case 38: {
                n3 = 9;
                break;
            }
            case 39: {
                n3 = 29;
                break;
            }
            case 40: {
                n3 = 24;
                break;
            }
            case 41: {
                n3 = 3;
                break;
            }
            case 42: {
                n3 = 18;
                break;
            }
            case 43: {
                n3 = 22;
                break;
            }
            case 44: {
                n3 = 10;
                break;
            }
            case 45: {
                n3 = 25;
                break;
            }
            case 46: {
                n3 = 41;
                break;
            }
            case 47: {
                n3 = 13;
                break;
            }
            case 48: {
                n3 = 36;
                break;
            }
            case 49: {
                n3 = 49;
                break;
            }
            case 50: {
                n3 = 1;
                break;
            }
            case 51: {
                n3 = 51;
                break;
            }
            case 52: {
                n3 = 45;
                break;
            }
            case 53: {
                n3 = 54;
                break;
            }
            case 54: {
                n3 = 31;
                break;
            }
            case 55: {
                n3 = 30;
                break;
            }
            case 56: {
                n3 = 15;
                break;
            }
            case 57: {
                n3 = 26;
                break;
            }
            case 58: {
                n3 = 47;
                break;
            }
            case 59: {
                n3 = 44;
                break;
            }
            case 60: {
                n3 = 6;
                break;
            }
            case 61: {
                n3 = 12;
                break;
            }
            case 62: {
                n3 = 43;
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
        GenericAdapterManager.h[n4] = new String(cArray);
        return n4;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = GenericAdapterManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = GenericAdapterManager.d(classArray2[i], string, clazz2, n, classArray);
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
            return MethodHandles.lookup().findStatic(GenericAdapterManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

