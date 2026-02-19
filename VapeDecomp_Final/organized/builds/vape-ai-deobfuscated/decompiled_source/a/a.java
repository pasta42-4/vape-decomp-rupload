/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.runtime.context.ContextualExecutionFramework;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class a {
    private static boolean Z;
    private static final String[] c;
    private static final Object[] b;
    private static final long a;

    public static boolean ib() {
        return TemporalMetadataResolver.r;
    }

    public static native String[] gcf(Class var0);

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        a = MultiContainerRegistry.a(-6647740149158063288L, -3798536772642005955L, MethodHandles.lookup().lookupClass()).a(165591978782398L);
        b = new Object[7];
        c = new String[7];
        a.a.a();
        if (a.a.f()) {
            a.a.i(true);
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

    public static native int ss_2(String var0);

    public static native long smpm(boolean var0, long var1, int var3, long var4, long var6);

    public static native double[] trn(double var0, double var2, double var4);

    public static native int dsv2(int var0, String var1, double var2, double var4, int var6, float var7);

    public static native Class gcj(String var0);

    public static native int scb(Class var0, byte[] var1);

    public static native boolean gtcf(Object var0, int var1, int var2);

    public static native void scm(String var0, String var1);

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = a.a.a(l, l2);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                a.a.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static native int gts();

    public static native void rs(int var0, double var1, double var3);

    public static native void cpy(String var0);

    public static native String[] gcm(Class var0);

    /*
     * Loose catch block
     */
    public static void reload() {
        long l;
        block12: {
            l = a ^ 0x756BB562CDB0L;
            boolean bl = a.a.n();
            try {
                if (!ApplicationLifecycleManager.U().Y()) {
                    ApplicationLifecycleManager.r(null);
                    ApplicationLifecycleManager.Y();
                }
            }
            catch (InterruptedException interruptedException) {
                throw a.a.a(interruptedException);
            }
            for (ContextualExecutionFramework contextualExecutionFramework : TemporalMetadataResolver.h.U().q()) {
                block13: {
                    ContextualExecutionFramework contextualExecutionFramework2;
                    block14: {
                        block15: {
                            if (!bl) break block12;
                            contextualExecutionFramework2 = contextualExecutionFramework;
                            if (!bl) break block14;
                            break block15;
                            catch (InterruptedException interruptedException) {
                                throw a.a.a(interruptedException);
                            }
                        }
                        try {
                            block16: {
                                if (!contextualExecutionFramework2.Z()) break block13;
                                break block16;
                                catch (InterruptedException interruptedException) {
                                    throw a.a.a(interruptedException);
                                }
                            }
                            contextualExecutionFramework2 = contextualExecutionFramework;
                        }
                        catch (InterruptedException interruptedException) {
                            throw a.a.a(interruptedException);
                        }
                    }
                    contextualExecutionFramework2.T(false);
                }
                if (bl) continue;
                AbstractComputationKernel.I(new String[5]);
                break;
            }
            try {
                Thread.sleep(500L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        TemporalMetadataResolver.h.Q = true;
        a.a.a("\u00cd", (long)1471938314544113681L, (long)l);
    }

    /*
     * Loose catch block
     */
    public static void start() {
        block6: {
            long l = a ^ 0x27D8CEDDCD4CL;
            boolean bl = a.a.n();
            try {
                TemporalMetadataResolver temporalMetadataResolver;
                block7: {
                    Thread.sleep(1000L);
                    TemporalMetadataResolver temporalMetadataResolver2 = new TemporalMetadataResolver();
                    temporalMetadataResolver = temporalMetadataResolver2;
                    if (!bl) break block7;
                    try {
                        block8: {
                            if (!temporalMetadataResolver.H()) break block6;
                            break block8;
                            catch (Throwable throwable) {
                                throw a.a.a(throwable);
                            }
                        }
                        a.a.a("\u00fe", (Object)temporalMetadataResolver2, (long)1482075715275394583L, (long)l);
                        a.a.a("\u00fe", (Object)temporalMetadataResolver2, (long)1482246243401999943L, (long)l);
                        temporalMetadataResolver = temporalMetadataResolver2;
                    }
                    catch (Throwable throwable) {
                        throw a.a.a(throwable);
                    }
                }
                temporalMetadataResolver.B(true);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }

    public static native void updc(String var0, String var1);

    public static native Class gc(String var0);

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c0' || c == '\u00e6' || c == 'U' || c == '\u00d4') {
                field = a.a.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c0' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'U' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = a.a.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fe' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static native void trs(int var0);

    public static native short gks(int var0);

    public static native void fs();

    public static native String cs(int var0);

    public static native byte[] gt(String var0);

    public static native double gshv2(int var0, String var1);

    public static native int ds(int var0, String var1, double var2, double var4, int var6);

    public static native boolean[] gls();

    public static void i(boolean bl) {
        Z = bl;
    }

    public static native byte[] gfb(String var0);

    public static native void sce(String var0);

    public static native int gk();

    public static native Object[] gco(Class var0);

    public static native int mf(int var0, int var1, String var2);

    @Deprecated
    public static native void ss(String var0);

    public static native String gp(String var0);

    public static native Class gvc(String var0);

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = a.a.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = a.a.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = a.a.a(l, l2);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = a.a.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = a.a.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = a.a.a(clazz3, string2, clazz2)) != null) {
                    a.a.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = a.a.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        a.a.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = a.a.b(239994543677849L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (c[n4] != null) {
            return n4;
        }
        Object object = b[n4];
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
                n3 = 38;
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
                n3 = 9;
                break;
            }
            case 5: {
                n3 = 60;
                break;
            }
            case 6: {
                n3 = 61;
                break;
            }
            case 7: {
                n3 = 55;
                break;
            }
            case 8: {
                n3 = 10;
                break;
            }
            case 9: {
                n3 = 49;
                break;
            }
            case 10: {
                n3 = 63;
                break;
            }
            case 11: {
                n3 = 42;
                break;
            }
            case 12: {
                n3 = 17;
                break;
            }
            case 13: {
                n3 = 21;
                break;
            }
            case 14: {
                n3 = 57;
                break;
            }
            case 15: {
                n3 = 5;
                break;
            }
            case 16: {
                n3 = 31;
                break;
            }
            case 17: {
                n3 = 24;
                break;
            }
            case 18: {
                n3 = 47;
                break;
            }
            case 19: {
                n3 = 29;
                break;
            }
            case 20: {
                n3 = 11;
                break;
            }
            case 21: {
                n3 = 2;
                break;
            }
            case 22: {
                n3 = 56;
                break;
            }
            case 23: {
                n3 = 8;
                break;
            }
            case 24: {
                n3 = 1;
                break;
            }
            case 25: {
                n3 = 54;
                break;
            }
            case 26: {
                n3 = 58;
                break;
            }
            case 27: {
                n3 = 39;
                break;
            }
            case 28: {
                n3 = 20;
                break;
            }
            case 29: {
                n3 = 45;
                break;
            }
            case 30: {
                n3 = 32;
                break;
            }
            case 31: {
                n3 = 46;
                break;
            }
            case 32: {
                n3 = 25;
                break;
            }
            case 33: {
                n3 = 6;
                break;
            }
            case 34: {
                n3 = 27;
                break;
            }
            case 35: {
                n3 = 37;
                break;
            }
            case 36: {
                n3 = 44;
                break;
            }
            case 37: {
                n3 = 13;
                break;
            }
            case 38: {
                n3 = 51;
                break;
            }
            case 39: {
                n3 = 52;
                break;
            }
            case 40: {
                n3 = 18;
                break;
            }
            case 41: {
                n3 = 4;
                break;
            }
            case 42: {
                n3 = 59;
                break;
            }
            case 43: {
                n3 = 26;
                break;
            }
            case 44: {
                n3 = 12;
                break;
            }
            case 45: {
                n3 = 30;
                break;
            }
            case 46: {
                n3 = 41;
                break;
            }
            case 47: {
                n3 = 16;
                break;
            }
            case 48: {
                n3 = 0;
                break;
            }
            case 49: {
                n3 = 34;
                break;
            }
            case 50: {
                n3 = 43;
                break;
            }
            case 51: {
                n3 = 62;
                break;
            }
            case 52: {
                n3 = 40;
                break;
            }
            case 53: {
                n3 = 50;
                break;
            }
            case 54: {
                n3 = 28;
                break;
            }
            case 55: {
                n3 = 48;
                break;
            }
            case 56: {
                n3 = 22;
                break;
            }
            case 57: {
                n3 = 53;
                break;
            }
            case 58: {
                n3 = 36;
                break;
            }
            case 59: {
                n3 = 3;
                break;
            }
            case 60: {
                n3 = 35;
                break;
            }
            case 61: {
                n3 = 15;
                break;
            }
            case 62: {
                n3 = 7;
                break;
            }
            default: {
                n3 = 23;
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
        a.a.c[n4] = new String(cArray);
        return n4;
    }

    public static native int sts();

    public static native boolean iv();

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = a.a.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static native double gswv2(int var0, String var1);

    public static native void dc();

    public static void sb() {
        long l = a ^ 0x39CAA64E97F3L;
        try {
            if (!TemporalMetadataResolver.r) {
                TemporalMetadataResolver.h.W();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw a.a.a(customSystemException);
        }
    }

    public static native int mfv2(int var0, int var1, String var2);

    public static native Object grh();

    public static native String gat();

    public static native void mb(int var0);

    public static native double gsw(int var0, String var1);

    public static native byte[] gcb(Class var0);

    public static native double gsh(int var0, String var1);

    public static native void rl();

    public static native int mvk(int var0, int var1);

    public static native void exit(boolean var0);

    public static native void smd(int var0, int var1);

    public static native String gkn(long var0);

    public static native int ss_3(String var0);

    public static native int gmv();

    private static Method d(long l, long l2) {
        int n = a.a.a(l, l2);
        Object object = b[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = c[n];
                int n3 = string2.indexOf(8);
                clazz3 = a.a.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = a.a.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = a.a.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        a.a.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = a.a.b(239994543677849L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = a.a.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        a.a.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = a.a.b(239994543677849L, 0L);
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

    public static native void smdp(int var0, int var1);

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = a.a.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = a.a.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\u0010k\f";
        objectArray[1] = Void.TYPE;
        a.a.c[1] = "java/lang/Void";
        objectArray[2] = "?G\u0004#";
        objectArray[3] = "F$f\u001d\t\u0011M+wRh\u001fF s\b";
        objectArray[4] = "8?!\fN\u0015c$6\\,\u001c\u00019<\u0019\u0012\u001bg}(\\,";
        objectArray[5] = "qsY\u0000'+uc\u0007g0+\u0011o^\u001dt*w+JXJ";
        Object[] objectArray2 = objectArray;
        objectArray[6] = "\u000fR;2@\u007fTI,b\"m6T&'\u001cqP\u00102b\"";
    }

    public static native void rsc();

    public static boolean f() {
        boolean bl = a.a.n();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw a.a.a(customSystemException);
        }
        return false;
    }

    public static native String gcs(Class var0);

    public static native void p(String var0);

    public static void test() {
        System.out.println("test");
    }

    public static String sp(String string, String string2) {
        return null;
    }

    public static native String gs();

    public static boolean n() {
        return Z;
    }

    public static native void su(String var0);

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/a" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

