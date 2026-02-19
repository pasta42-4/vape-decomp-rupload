/*
 * Decompiled with CFR 0.152.
 */
package com.threading.async;

import com.collections.management.MultiContainerRegistry;
import com.database.query.QueryExecutionHandler;
import com.security.authentication.AuthenticationTokenManager505;
import com.security.selection.CryptoAlgorithmSelector943;
import com.system.resource.ResourceOrchestrationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

public class AsynchronousExecutionThread
implements Runnable {
    private final Object r;
    private final AtomicBoolean K = new AtomicBoolean(false);
    private final AuthenticationTokenManager505 e;
    private static final String[] c;
    private static final Object[] b;
    private boolean D;
    private static final long a;

    private static void a() {
        Object[] objectArray = b;
        b[0] = "16|S";
        objectArray[1] = Void.TYPE;
        AsynchronousExecutionThread.c[1] = "java/lang/Void";
        objectArray[2] = "\u0013\u000b\u000e0]\u000b\u0018\u0004\u001f\u007f<\u0005\u0013\u000f\u001b%";
        Object[] objectArray2 = objectArray;
        objectArray[3] = "]L7n\u001d+HXlRH\u0015\u0000O~jNgH]u>'";
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void G() {
        long l = a ^ 0xB0DE141187EL;
        ResourceOrchestrationManager resourceOrchestrationManager = this.e.A;
        try {
            block10: {
                Object object = this.r;
                synchronized (object) {
                    if (!this.K.get()) {
                        try {
                            this.r.wait();
                        }
                        catch (InterruptedException interruptedException) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                try {
                    if (resourceOrchestrationManager.R() != CryptoAlgorithmSelector943.LEFT || !this.e.L()) break block10;
                }
                catch (InterruptedException interruptedException) {
                    throw AsynchronousExecutionThread.a(interruptedException);
                }
                return;
            }
            AsynchronousExecutionThread.a("U", (Object)this.e, (long)5641524205163936413L, (long)l);
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    private static Method d(long l, long l2) {
        int n = AsynchronousExecutionThread.a(l, l2);
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
                clazz3 = AsynchronousExecutionThread.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AsynchronousExecutionThread.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AsynchronousExecutionThread.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        AsynchronousExecutionThread.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AsynchronousExecutionThread.b(186272287118235L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AsynchronousExecutionThread.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AsynchronousExecutionThread.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AsynchronousExecutionThread.b(186272287118235L, 0L);
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

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = AsynchronousExecutionThread.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AsynchronousExecutionThread.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void run() {
        while (true) {
            QueryExecutionHandler.q(5L);
            this.G();
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AsynchronousExecutionThread.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AsynchronousExecutionThread.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static {
        a = MultiContainerRegistry.a(-17199014324316607L, -8341273837812153494L, MethodHandles.lookup().lookupClass()).a(100099770129838L);
        b = new Object[4];
        c = new String[4];
        AsynchronousExecutionThread.a();
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '$' || c == 'K' || c == '\u00cc' || c == 'j') {
                field = AsynchronousExecutionThread.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '$' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AsynchronousExecutionThread.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'U' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
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

    public void N() {
        if (!this.D) {
            this.D = true;
            Thread thread = new Thread(this);
            thread.start();
        }
        this.W();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void W() {
        Object object = this.r;
        synchronized (object) {
            this.K.set(true);
            this.r.notify();
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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
                n3 = 30;
                break;
            }
            case 1: {
                n3 = 47;
                break;
            }
            case 2: {
                n3 = 45;
                break;
            }
            case 3: {
                n3 = 8;
                break;
            }
            case 4: {
                n3 = 9;
                break;
            }
            case 5: {
                n3 = 7;
                break;
            }
            case 6: {
                n3 = 18;
                break;
            }
            case 7: {
                n3 = 51;
                break;
            }
            case 8: {
                n3 = 21;
                break;
            }
            case 9: {
                n3 = 63;
                break;
            }
            case 10: {
                n3 = 1;
                break;
            }
            case 11: {
                n3 = 24;
                break;
            }
            case 12: {
                n3 = 37;
                break;
            }
            case 13: {
                n3 = 3;
                break;
            }
            case 14: {
                n3 = 22;
                break;
            }
            case 15: {
                n3 = 50;
                break;
            }
            case 16: {
                n3 = 41;
                break;
            }
            case 17: {
                n3 = 0;
                break;
            }
            case 18: {
                n3 = 28;
                break;
            }
            case 19: {
                n3 = 13;
                break;
            }
            case 20: {
                n3 = 17;
                break;
            }
            case 21: {
                n3 = 39;
                break;
            }
            case 22: {
                n3 = 27;
                break;
            }
            case 23: {
                n3 = 10;
                break;
            }
            case 24: {
                n3 = 53;
                break;
            }
            case 25: {
                n3 = 12;
                break;
            }
            case 26: {
                n3 = 25;
                break;
            }
            case 27: {
                n3 = 15;
                break;
            }
            case 28: {
                n3 = 42;
                break;
            }
            case 29: {
                n3 = 54;
                break;
            }
            case 30: {
                n3 = 62;
                break;
            }
            case 31: {
                n3 = 31;
                break;
            }
            case 32: {
                n3 = 33;
                break;
            }
            case 33: {
                n3 = 60;
                break;
            }
            case 34: {
                n3 = 29;
                break;
            }
            case 35: {
                n3 = 36;
                break;
            }
            case 36: {
                n3 = 32;
                break;
            }
            case 37: {
                n3 = 55;
                break;
            }
            case 38: {
                n3 = 16;
                break;
            }
            case 39: {
                n3 = 11;
                break;
            }
            case 40: {
                n3 = 43;
                break;
            }
            case 41: {
                n3 = 61;
                break;
            }
            case 42: {
                n3 = 52;
                break;
            }
            case 43: {
                n3 = 14;
                break;
            }
            case 44: {
                n3 = 56;
                break;
            }
            case 45: {
                n3 = 48;
                break;
            }
            case 46: {
                n3 = 34;
                break;
            }
            case 47: {
                n3 = 5;
                break;
            }
            case 48: {
                n3 = 19;
                break;
            }
            case 49: {
                n3 = 40;
                break;
            }
            case 50: {
                n3 = 44;
                break;
            }
            case 51: {
                n3 = 46;
                break;
            }
            case 52: {
                n3 = 4;
                break;
            }
            case 53: {
                n3 = 59;
                break;
            }
            case 54: {
                n3 = 57;
                break;
            }
            case 55: {
                n3 = 38;
                break;
            }
            case 56: {
                n3 = 49;
                break;
            }
            case 57: {
                n3 = 20;
                break;
            }
            case 58: {
                n3 = 2;
                break;
            }
            case 59: {
                n3 = 23;
                break;
            }
            case 60: {
                n3 = 58;
                break;
            }
            case 61: {
                n3 = 26;
                break;
            }
            case 62: {
                n3 = 6;
                break;
            }
            default: {
                n3 = 35;
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
        AsynchronousExecutionThread.c[n4] = new String(cArray);
        return n4;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AsynchronousExecutionThread.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void l() {
        Object object = this.r;
        synchronized (object) {
            this.K.set(false);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/_Q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public AsynchronousExecutionThread(AuthenticationTokenManager505 authenticationTokenManager505) {
        this.r = new Object();
        this.e = authenticationTokenManager505;
    }

    private static Field c(long l, long l2) {
        int n = AsynchronousExecutionThread.a(l, l2);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = AsynchronousExecutionThread.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AsynchronousExecutionThread.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AsynchronousExecutionThread.a(clazz3, string2, clazz2)) != null) {
                    AsynchronousExecutionThread.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AsynchronousExecutionThread.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AsynchronousExecutionThread.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AsynchronousExecutionThread.b(186272287118235L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AsynchronousExecutionThread.a(l, l2);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                AsynchronousExecutionThread.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AsynchronousExecutionThread.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

