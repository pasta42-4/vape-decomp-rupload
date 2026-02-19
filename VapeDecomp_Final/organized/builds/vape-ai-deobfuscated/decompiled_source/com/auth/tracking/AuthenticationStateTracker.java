/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.auth.tracking;

import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.event.processing.EventOrchestrationEngine1341;
import com.exception.system.CustomSystemException;
import com.network.connection.NetworkConnectionDescriptor;
import com.security.tokenization.SecureTokenGenerator1301;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class AuthenticationStateTracker
extends SecureTokenGenerator1301<Boolean, AuthenticationStateTracker> {
    private static int A;
    @Nullable
    private NetworkConnectionDescriptor Z = null;
    private static final Object[] e;
    private static final String[] g;
    private final String L;
    private boolean y;
    private static final long d;

    @Override
    public void i(String string) {
        try {
            if (string.isEmpty()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationStateTracker.e(customSystemException);
        }
        this.H(Boolean.parseBoolean(string));
    }

    public static AuthenticationStateTracker v(Object object, String string, String string2, boolean bl) {
        return AuthenticationStateTracker.O(object, string, string2, bl, null);
    }

    public void E(NetworkConnectionDescriptor networkConnectionDescriptor) {
        this.Z = networkConnectionDescriptor;
    }

    public void j() {
        boolean bl;
        AuthenticationStateTracker authenticationStateTracker;
        try {
            authenticationStateTracker = this;
            bl = this.s() == false;
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationStateTracker.e(customSystemException);
        }
        authenticationStateTracker.H(bl);
    }

    @Override
    public Boolean S() {
        block4: {
            block5: {
                long l = d ^ 0x114B2A84C03L;
                try {
                    try {
                        if (!this.y) break block4;
                        if (AuthenticationStateTracker.b("w", (long)1383693299653780143L, (long)l) == false) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AuthenticationStateTracker.e(customSystemException);
                    }
                    return this.s();
                }
                catch (CustomSystemException customSystemException) {
                    throw AuthenticationStateTracker.e(customSystemException);
                }
            }
            return false;
        }
        return this.s();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean I() {
        return this.s();
    }

    public EventOrchestrationEngine1341 T() {
        return new EventOrchestrationEngine1341().F(this);
    }

    private static Method h(long l, long l2) {
        int n = AuthenticationStateTracker.e(l, l2);
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
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = AuthenticationStateTracker.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AuthenticationStateTracker.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AuthenticationStateTracker.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        AuthenticationStateTracker.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AuthenticationStateTracker.f(196910906021178L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AuthenticationStateTracker.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AuthenticationStateTracker.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AuthenticationStateTracker.f(196910906021178L, 0L);
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

    public NetworkConnectionDescriptor C() {
        return this.Z;
    }

    public AuthenticationStateTracker j() {
        return AuthenticationStateTracker.O(null, this.x(), this.w(), this.s(), this.d());
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

    static {
        d = MultiContainerRegistry.a(2625994011549537630L, 3895163327282978507L, MethodHandles.lookup().lookupClass()).a(61883403171797L);
        e = new Object[4];
        g = new String[4];
        AuthenticationStateTracker.a();
        if (AuthenticationStateTracker.I() == 0) {
            AuthenticationStateTracker.b(73);
        }
    }

    @Override
    public boolean y() {
        return this.s();
    }

    public static int I() {
        int n = AuthenticationStateTracker.c();
        try {
            if (n == 0) {
                return 91;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationStateTracker.e(customSystemException);
        }
        return 0;
    }

    @Override
    public boolean j(ConfigurationProfileResolver configurationProfileResolver) {
        return this.I();
    }

    public AuthenticationStateTracker(Object object, String string, String string2, boolean bl) {
        super(object, string, bl);
        this.L = string2;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = AuthenticationStateTracker.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AuthenticationStateTracker.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public String w() {
        return this.L;
    }

    public AuthenticationStateTracker(Object object, String string, boolean bl) {
        this(object, string, string, bl);
    }

    private static Field g(long l, long l2) {
        int n = AuthenticationStateTracker.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = AuthenticationStateTracker.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AuthenticationStateTracker.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AuthenticationStateTracker.c(clazz3, string2, clazz2)) != null) {
                    AuthenticationStateTracker.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AuthenticationStateTracker.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AuthenticationStateTracker.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AuthenticationStateTracker.f(196910906021178L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public boolean l() {
        boolean bl;
        block5: {
            block4: {
                long l = d ^ 0x4F006FD5BF8DL;
                try {
                    try {
                        if (!this.y || AuthenticationStateTracker.b("w", (long)-2252481866058804959L, (long)l) != false) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AuthenticationStateTracker.e(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuthenticationStateTracker.e(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public EventOrchestrationEngine1341 o() {
        return new EventOrchestrationEngine1341().l(this);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AuthenticationStateTracker.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AuthenticationStateTracker.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AuthenticationStateTracker.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'n' || c == 'X' || c == 'h' || c == '\u00c8') {
                field = AuthenticationStateTracker.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'n' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'h' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AuthenticationStateTracker.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'e' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'w' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static AuthenticationStateTracker w(Object object, String string, boolean bl) {
        return AuthenticationStateTracker.R(object, string, bl, null);
    }

    public static AuthenticationStateTracker R(Object object, String string, boolean bl, String string2) {
        return AuthenticationStateTracker.O(object, string, string, bl, string2);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 10;
                break;
            }
            case 1: {
                n3 = 0;
                break;
            }
            case 2: {
                n3 = 47;
                break;
            }
            case 3: {
                n3 = 20;
                break;
            }
            case 4: {
                n3 = 48;
                break;
            }
            case 5: {
                n3 = 18;
                break;
            }
            case 6: {
                n3 = 29;
                break;
            }
            case 7: {
                n3 = 53;
                break;
            }
            case 8: {
                n3 = 23;
                break;
            }
            case 9: {
                n3 = 5;
                break;
            }
            case 10: {
                n3 = 9;
                break;
            }
            case 11: {
                n3 = 35;
                break;
            }
            case 12: {
                n3 = 28;
                break;
            }
            case 13: {
                n3 = 13;
                break;
            }
            case 14: {
                n3 = 31;
                break;
            }
            case 15: {
                n3 = 11;
                break;
            }
            case 16: {
                n3 = 62;
                break;
            }
            case 17: {
                n3 = 37;
                break;
            }
            case 18: {
                n3 = 6;
                break;
            }
            case 19: {
                n3 = 42;
                break;
            }
            case 20: {
                n3 = 38;
                break;
            }
            case 21: {
                n3 = 1;
                break;
            }
            case 22: {
                n3 = 26;
                break;
            }
            case 23: {
                n3 = 50;
                break;
            }
            case 24: {
                n3 = 54;
                break;
            }
            case 25: {
                n3 = 32;
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
                n3 = 7;
                break;
            }
            case 29: {
                n3 = 63;
                break;
            }
            case 30: {
                n3 = 30;
                break;
            }
            case 31: {
                n3 = 4;
                break;
            }
            case 32: {
                n3 = 21;
                break;
            }
            case 33: {
                n3 = 40;
                break;
            }
            case 34: {
                n3 = 43;
                break;
            }
            case 35: {
                n3 = 57;
                break;
            }
            case 36: {
                n3 = 17;
                break;
            }
            case 37: {
                n3 = 46;
                break;
            }
            case 38: {
                n3 = 33;
                break;
            }
            case 39: {
                n3 = 49;
                break;
            }
            case 40: {
                n3 = 25;
                break;
            }
            case 41: {
                n3 = 15;
                break;
            }
            case 42: {
                n3 = 55;
                break;
            }
            case 43: {
                n3 = 12;
                break;
            }
            case 44: {
                n3 = 44;
                break;
            }
            case 45: {
                n3 = 8;
                break;
            }
            case 46: {
                n3 = 41;
                break;
            }
            case 47: {
                n3 = 56;
                break;
            }
            case 48: {
                n3 = 52;
                break;
            }
            case 49: {
                n3 = 2;
                break;
            }
            case 50: {
                n3 = 45;
                break;
            }
            case 51: {
                n3 = 36;
                break;
            }
            case 52: {
                n3 = 3;
                break;
            }
            case 53: {
                n3 = 60;
                break;
            }
            case 54: {
                n3 = 24;
                break;
            }
            case 55: {
                n3 = 22;
                break;
            }
            case 56: {
                n3 = 59;
                break;
            }
            case 57: {
                n3 = 14;
                break;
            }
            case 58: {
                n3 = 58;
                break;
            }
            case 59: {
                n3 = 16;
                break;
            }
            case 60: {
                n3 = 61;
                break;
            }
            case 61: {
                n3 = 27;
                break;
            }
            case 62: {
                n3 = 34;
                break;
            }
            default: {
                n3 = 51;
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
        AuthenticationStateTracker.g[n4] = new String(cArray);
        return n4;
    }

    public AuthenticationStateTracker D(boolean bl) {
        this.y = bl;
        return this;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AuthenticationStateTracker.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                AuthenticationStateTracker.e[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u001dJb";
        objectArray[1] = Boolean.TYPE;
        AuthenticationStateTracker.g[1] = "java/lang/Boolean";
        objectArray[2] = "\\#\u000e!PbW,\u001fn1l\\'\u001b4";
        Object[] objectArray2 = objectArray;
        objectArray[3] = "7P\ra,ot\u0001\n[!c\f\u0016\u0011*?82\u0000N0@";
    }

    public static AuthenticationStateTracker O(Object object, String string, String string2, boolean bl, String string3) {
        AuthenticationStateTracker authenticationStateTracker = new AuthenticationStateTracker(object, string, string2, bl);
        authenticationStateTracker.R(string3);
        return authenticationStateTracker;
    }

    public static void b(int n) {
        A = n;
    }

    public boolean Z() {
        boolean bl;
        try {
            bl = this.s() == false;
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationStateTracker.e(customSystemException);
        }
        boolean bl2 = bl;
        try {
            if (this.x(bl2)) {
                this.H(bl2);
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationStateTracker.e(customSystemException);
        }
        return false;
    }

    private static CustomSystemException e(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static int c() {
        return A;
    }

    @Override
    public Boolean s() {
        try {
            if (this.w()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationStateTracker.e(customSystemException);
        }
        return (Boolean)super.J();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AuthenticationStateTracker.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

