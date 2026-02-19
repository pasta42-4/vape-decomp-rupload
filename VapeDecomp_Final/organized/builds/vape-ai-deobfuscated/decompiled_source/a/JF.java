/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.UnmodifiableView
 */
package a;

import a.wD;
import com.app.crypto.processing.CipherTextProcessor;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.exception.system.CustomSystemException;
import com.identifier.management.UniqueIdentifierManager1303;
import com.reflection.core.ReflectiveIntrospectionEngine;
import com.reflection.utils.ReflectionUtilityManager680;
import com.security.registry.CryptoAlgorithmRegistry893;
import com.security.trust.CertificateTrustManager;
import com.temporal.metadata.TemporalMetadataResolver;
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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

public class JF {
    private static final Integer[] d;
    private static final String[] h;
    private final AuthenticationStateTracker G;
    private UserIdentityManager H;
    private final List<UserIdentityManager> L;
    private static final long[] c;
    private Map<CryptoAlgorithmRegistry893, ConfigurationProfileResolver<?, ?>> V;
    private final List<ReflectiveIntrospectionEngine> f;
    private static final long a;
    private wD b;
    private static final Map e;
    private static final Object[] g;
    private final List<UserIdentityManager> k;

    public @UnmodifiableView List<UserIdentityManager> H() {
        return this.L;
    }

    private static Field c(long l, long l2) {
        int n = JF.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = JF.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = JF.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = JF.a(clazz3, string2, clazz2)) != null) {
                    JF.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = JF.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        JF.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = JF.b(231809762013292L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void W(UserIdentityManager userIdentityManager) {
        List<UserIdentityManager> list = this.L;
        synchronized (list) {
            this.L.remove(userIdentityManager);
            if (this.b != null) {
                this.b.l();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c(UserIdentityManager userIdentityManager) {
        List<UserIdentityManager> list = this.k;
        synchronized (list) {
            this.k.add(userIdentityManager);
            if (this.b != null) {
                this.b.l();
            }
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/JF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6ED9;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/JF", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            JF.d[n2] = n3;
        }
        return d[n2];
    }

    public AuthenticationStateTracker N() {
        return this.G;
    }

    private static int a(long l, long l2) {
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
                n3 = 19;
                break;
            }
            case 1: {
                n3 = 32;
                break;
            }
            case 2: {
                n3 = 12;
                break;
            }
            case 3: {
                n3 = 1;
                break;
            }
            case 4: {
                n3 = 36;
                break;
            }
            case 5: {
                n3 = 47;
                break;
            }
            case 6: {
                n3 = 8;
                break;
            }
            case 7: {
                n3 = 58;
                break;
            }
            case 8: {
                n3 = 63;
                break;
            }
            case 9: {
                n3 = 53;
                break;
            }
            case 10: {
                n3 = 51;
                break;
            }
            case 11: {
                n3 = 61;
                break;
            }
            case 12: {
                n3 = 24;
                break;
            }
            case 13: {
                n3 = 54;
                break;
            }
            case 14: {
                n3 = 50;
                break;
            }
            case 15: {
                n3 = 26;
                break;
            }
            case 16: {
                n3 = 5;
                break;
            }
            case 17: {
                n3 = 9;
                break;
            }
            case 18: {
                n3 = 39;
                break;
            }
            case 19: {
                n3 = 34;
                break;
            }
            case 20: {
                n3 = 46;
                break;
            }
            case 21: {
                n3 = 21;
                break;
            }
            case 22: {
                n3 = 28;
                break;
            }
            case 23: {
                n3 = 41;
                break;
            }
            case 24: {
                n3 = 14;
                break;
            }
            case 25: {
                n3 = 52;
                break;
            }
            case 26: {
                n3 = 45;
                break;
            }
            case 27: {
                n3 = 13;
                break;
            }
            case 28: {
                n3 = 48;
                break;
            }
            case 29: {
                n3 = 23;
                break;
            }
            case 30: {
                n3 = 3;
                break;
            }
            case 31: {
                n3 = 40;
                break;
            }
            case 32: {
                n3 = 60;
                break;
            }
            case 33: {
                n3 = 17;
                break;
            }
            case 34: {
                n3 = 62;
                break;
            }
            case 35: {
                n3 = 4;
                break;
            }
            case 36: {
                n3 = 37;
                break;
            }
            case 37: {
                n3 = 16;
                break;
            }
            case 38: {
                n3 = 10;
                break;
            }
            case 39: {
                n3 = 7;
                break;
            }
            case 40: {
                n3 = 31;
                break;
            }
            case 41: {
                n3 = 35;
                break;
            }
            case 42: {
                n3 = 38;
                break;
            }
            case 43: {
                n3 = 49;
                break;
            }
            case 44: {
                n3 = 59;
                break;
            }
            case 45: {
                n3 = 44;
                break;
            }
            case 46: {
                n3 = 42;
                break;
            }
            case 47: {
                n3 = 2;
                break;
            }
            case 48: {
                n3 = 56;
                break;
            }
            case 49: {
                n3 = 25;
                break;
            }
            case 50: {
                n3 = 18;
                break;
            }
            case 51: {
                n3 = 57;
                break;
            }
            case 52: {
                n3 = 6;
                break;
            }
            case 53: {
                n3 = 20;
                break;
            }
            case 54: {
                n3 = 15;
                break;
            }
            case 55: {
                n3 = 30;
                break;
            }
            case 56: {
                n3 = 11;
                break;
            }
            case 57: {
                n3 = 43;
                break;
            }
            case 58: {
                n3 = 55;
                break;
            }
            case 59: {
                n3 = 27;
                break;
            }
            case 60: {
                n3 = 29;
                break;
            }
            case 61: {
                n3 = 22;
                break;
            }
            case 62: {
                n3 = 33;
                break;
            }
            default: {
                n3 = 0;
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
        JF.h[n4] = new String(cArray);
        return n4;
    }

    private static UserIdentityManager lambda$handle$0(UniqueIdentifierManager1303 uniqueIdentifierManager1303) {
        return new UserIdentityManager(uniqueIdentifierManager1303);
    }

    public JF(UserIdentityManager userIdentityManager) {
        long l = a ^ 0x7A675AE959C3L;
        this.k = new ArrayList<UserIdentityManager>();
        this.L = new ArrayList<UserIdentityManager>();
        this.f = new ArrayList<ReflectiveIntrospectionEngine>();
        this.G = AuthenticationStateTracker.w(null, (String)((Object)JF.b("\u00f5", (int)JF.a("f", (int)26916, (long)(0x1DCD7D0619EF2B2EL ^ l)), (long)3229975067096090371L, (long)l)), false);
        this.H = userIdentityManager;
        this.H.c(0);
        this.k.add(userIdentityManager);
    }

    public void c(wD wD2) {
        this.b = wD2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/JF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Nullable
    public UserIdentityManager j(long l) {
        for (UserIdentityManager userIdentityManager : this.k) {
            try {
                if (userIdentityManager.s().r() != l) continue;
                return userIdentityManager;
            }
            catch (CustomSystemException customSystemException) {
                throw JF.a(customSystemException);
            }
        }
        return null;
    }

    public void u(UserIdentityManager userIdentityManager) {
        this.H = userIdentityManager;
        this.k.remove(userIdentityManager);
        UserIdentityManager userIdentityManager2 = this.k.set(0, userIdentityManager);
        try {
            if (userIdentityManager2 != null) {
                this.k.add(userIdentityManager2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw JF.a(customSystemException);
        }
        try {
            if (this.b != null) {
                this.b.l();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw JF.a(customSystemException);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(-7161244791234527061L, 6305041575437829305L, MethodHandles.lookup().lookupClass()).a(199380836394652L);
        g = new Object[5];
        h = new String[5];
        JF.a();
        e = new HashMap(13);
        long l = a ^ 0x722CA838F74FL;
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
        String string = "\u0099\u0096\u00aa{\u00a1\u000f\u00cb\u00b7\u00ab3\u001b\u009f#\u0001'O";
        int n2 = "\u0099\u0096\u00aa{\u00a1\u000f\u00cb\u00b7\u00ab3\u001b\u009f#\u0001'O".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        d = new Integer[2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = JF.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Nullable
    public UserIdentityManager q(ReflectionUtilityManager680 reflectionUtilityManager680) {
        return this.j(reflectionUtilityManager680.r());
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = JF.a(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                JF.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = JF.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private UserIdentityManager T(UniqueIdentifierManager1303 uniqueIdentifierManager1303) {
        UserIdentityManager userIdentityManager = TemporalMetadataResolver.h.O().t().O(uniqueIdentifierManager1303.I(), () -> JF.lambda$handle$0(uniqueIdentifierManager1303));
        userIdentityManager.c(uniqueIdentifierManager1303.e());
        return userIdentityManager;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void e(UserIdentityManager userIdentityManager) {
        List<UserIdentityManager> list = this.L;
        synchronized (list) {
            this.L.remove(userIdentityManager);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void F(UserIdentityManager userIdentityManager) {
        List<UserIdentityManager> list = this.k;
        synchronized (list) {
            this.k.remove(userIdentityManager);
            if (this.b != null) {
                this.b.l();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void A(ReflectiveIntrospectionEngine reflectiveIntrospectionEngine) {
        List<ReflectiveIntrospectionEngine> list = this.f;
        synchronized (list) {
            this.f.add(reflectiveIntrospectionEngine);
        }
        CipherTextProcessor.y(reflectiveIntrospectionEngine);
    }

    public boolean X() {
        try {
            if (this.G.s().booleanValue()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw JF.a(customSystemException);
        }
        return this.R().equals(TemporalMetadataResolver.h.O().n());
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = JF.a(l, l2);
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
                clazz3 = JF.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = JF.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = JF.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        JF.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = JF.b(231809762013292L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = JF.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        JF.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = JF.b(231809762013292L, 0L);
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

    private static void a() {
        Object[] objectArray = g;
        g[0] = "*\tG";
        objectArray[1] = Integer.TYPE;
        JF.h[1] = "java/lang/Integer";
        objectArray[2] = "q8axZcz7p7'{i0y~";
        objectArray[3] = ">!8ot\n5.) \u0015\u0004>%-z";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "p\u0007D\u0013GBw\u0007NbTBI\u0003\u0019\u0019X\u00020H\u0012\u0019V9s\u0003L\u001eQXrGI\u000e?";
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void z(UserIdentityManager userIdentityManager) {
        List<UserIdentityManager> list = this.L;
        synchronized (list) {
            this.L.add(userIdentityManager);
            if (this.b != null) {
                this.b.l();
            }
        }
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c3' || c == 'X' || c == '\u00e7' || c == '\u00e1') {
                field = JF.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e7' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = JF.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00aa' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public Map<CryptoAlgorithmRegistry893, ConfigurationProfileResolver<?, ?>> b() {
        if (this.V == null) {
            this.V = new LinkedHashMap();
            this.V.put(CryptoAlgorithmRegistry893.OPEN_INVITES, this.G);
            for (Map.Entry<CryptoAlgorithmRegistry893, ConfigurationProfileResolver<?, ?>> entry : this.V.entrySet()) {
                entry.getValue().H(entry.getKey().k());
            }
        }
        return this.V;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = JF.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = JF.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public JF(CertificateTrustManager certificateTrustManager) {
        long l = a ^ 0x2906D349CD8EL;
        this.k = new ArrayList<UserIdentityManager>();
        this.L = new ArrayList<UserIdentityManager>();
        this.f = new ArrayList<ReflectiveIntrospectionEngine>();
        this.G = AuthenticationStateTracker.w(null, (String)((Object)JF.b("\u00f5", (int)JF.a("f", (int)30058, (long)(0x185D26C31A09A32CL ^ l)), (long)-5143534823792372914L, (long)l)), false);
        this.H = this.T(certificateTrustManager.g());
        for (UniqueIdentifierManager1303 uniqueIdentifierManager1303 : certificateTrustManager.P()) {
            this.k.add(this.T(uniqueIdentifierManager1303));
        }
        for (UniqueIdentifierManager1303 uniqueIdentifierManager1303 : certificateTrustManager.K()) {
            this.L.add(this.T(uniqueIdentifierManager1303));
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = JF.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = JF.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public UserIdentityManager R() {
        return this.H;
    }

    public @UnmodifiableView List<UserIdentityManager> u() {
        return this.k;
    }

    public @UnmodifiableView List<ReflectiveIntrospectionEngine> U() {
        return this.f;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(JF.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(JF.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

