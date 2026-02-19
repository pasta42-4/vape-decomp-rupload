/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.scheduler;

import a.Ry;
import a._b;
import a.h6;
import a.yC;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.cipher.SymmetricCipherManager;
import com.crypto.operations.CipherOperationsManager;
import com.data.conversion.TemporalDataTransformer;
import com.exception.system.CustomSystemException;
import com.financial.transaction.TransactionValidator1909;
import com.graphics.rendering.GraphicalRenderController;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.math.computation.IntegerComputationManager;
import com.math.precision.PrecisionMathOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.monitoring.TransactionStatusTracker;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class AsynchronousTaskScheduler253
extends AbstractComputationKernel {
    private static final String[] fb;
    private final GraphicalRenderEngine1082 D;
    private static final long[] ab;
    private final CipherOperationsManager E;
    private static final long L;
    private static final Integer[] bb;
    static final boolean n;
    private final Runnable B;
    private static final Map db;
    private final Ry Y;
    private SymmetricCipherManager R;
    private final yC F;
    private static final Object[] eb;
    private final Runnable v;
    private final boolean V;
    private final TransactionValidator1909 b;

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x32A3;
        if (bb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = ab[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])db.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    db.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Rm", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AsynchronousTaskScheduler253.bb[n2] = n3;
        }
        return bb[n2];
    }

    private static TransactionStatusTracker lambda$submit$5(Throwable throwable) {
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

    private void lambda$submit$4(boolean bl, boolean bl2, TransactionStatusTracker transactionStatusTracker, Throwable throwable) {
        block22: {
            block23: {
                block21: {
                    long l;
                    block20: {
                        block19: {
                            l = L ^ 0x69552801295FL;
                            try {
                                if (throwable != null) {
                                    IntegerComputationManager.q((String)((Object)AsynchronousTaskScheduler253.c("A", (int)AsynchronousTaskScheduler253.b("i", (int)6827, (long)(0xD6BE8D888DABE53L ^ l)), (long)1611866242062114841L, (long)l)));
                                    TemporalMetadataResolver.W(throwable);
                                    return;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousTaskScheduler253.a(customSystemException);
                            }
                            try {
                                if (!transactionStatusTracker.b()) {
                                    IntegerComputationManager.q((String)((Object)AsynchronousTaskScheduler253.c("A", (int)AsynchronousTaskScheduler253.b("i", (int)21255, (long)(0x6D223BEBA94A77FDL ^ l)), (long)1611866242062114841L, (long)l)) + transactionStatusTracker.A());
                                    return;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousTaskScheduler253.a(customSystemException);
                            }
                            try {
                                try {
                                    if (n || transactionStatusTracker.h() != null) break block19;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AsynchronousTaskScheduler253.a(customSystemException);
                                }
                                throw new AssertionError();
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousTaskScheduler253.a(customSystemException);
                            }
                        }
                        try {
                            if (!this.V) break block20;
                            IntegerComputationManager.G((String)((Object)AsynchronousTaskScheduler253.c("A", (int)AsynchronousTaskScheduler253.b("i", (int)7058, (long)(0x5CE6136D0A803F69L ^ l)), (long)1611866242062114841L, (long)l)));
                            break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousTaskScheduler253.a(customSystemException);
                        }
                    }
                    IntegerComputationManager.G((String)((Object)AsynchronousTaskScheduler253.c("A", (int)AsynchronousTaskScheduler253.b("i", (int)26048, (long)(0x5A548FD960D413FL ^ l)), (long)1611866242062114841L, (long)l)));
                }
                try {
                    try {
                        if (this.Y.d() != null) break block22;
                        if (!bl) break block23;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousTaskScheduler253.a(customSystemException);
                    }
                    this.Y.E(this.Y.B() + 1L);
                    break block22;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskScheduler253.a(customSystemException);
                }
            }
            this.Y.U(this.Y.l() + 1L);
        }
        try {
            this.Y.N((TemporalDataTransformer)transactionStatusTracker.h());
            this.B.run();
            if (bl2) {
                this.v.run();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskScheduler253.a(customSystemException);
        }
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AsynchronousTaskScheduler253.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private CompletableFuture lambda$new$3(Runnable runnable, boolean bl) {
        String string;
        block4: {
            long l = L ^ 0x5601796C1CF2L;
            runnable.run();
            string = this.b.a().trim();
            try {
                try {
                    if (!string.isEmpty() || bl) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskScheduler253.a(customSystemException);
                }
                IntegerComputationManager.q((String)((Object)AsynchronousTaskScheduler253.c("A", (int)AsynchronousTaskScheduler253.b("i", (int)28124, (long)(0x6C4ABC6054B87C8FL ^ l)), (long)2590485244308313524L, (long)l)));
                return null;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskScheduler253.a(customSystemException);
            }
        }
        return this.e(bl, string, true);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e1' || c == '\u00e6' || c == 'I' || c == 'e') {
                field = AsynchronousTaskScheduler253.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'I' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AsynchronousTaskScheduler253.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'A' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public double z() {
        return this.D.b();
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (fb[n4] != null) {
            return n4;
        }
        Object object = eb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 47;
                break;
            }
            case 1: {
                n3 = 28;
                break;
            }
            case 2: {
                n3 = 42;
                break;
            }
            case 3: {
                n3 = 6;
                break;
            }
            case 4: {
                n3 = 55;
                break;
            }
            case 5: {
                n3 = 54;
                break;
            }
            case 6: {
                n3 = 11;
                break;
            }
            case 7: {
                n3 = 63;
                break;
            }
            case 8: {
                n3 = 53;
                break;
            }
            case 9: {
                n3 = 41;
                break;
            }
            case 10: {
                n3 = 7;
                break;
            }
            case 11: {
                n3 = 46;
                break;
            }
            case 12: {
                n3 = 37;
                break;
            }
            case 13: {
                n3 = 57;
                break;
            }
            case 14: {
                n3 = 51;
                break;
            }
            case 15: {
                n3 = 5;
                break;
            }
            case 16: {
                n3 = 39;
                break;
            }
            case 17: {
                n3 = 1;
                break;
            }
            case 18: {
                n3 = 31;
                break;
            }
            case 19: {
                n3 = 38;
                break;
            }
            case 20: {
                n3 = 48;
                break;
            }
            case 21: {
                n3 = 12;
                break;
            }
            case 22: {
                n3 = 2;
                break;
            }
            case 23: {
                n3 = 34;
                break;
            }
            case 24: {
                n3 = 50;
                break;
            }
            case 25: {
                n3 = 17;
                break;
            }
            case 26: {
                n3 = 27;
                break;
            }
            case 27: {
                n3 = 3;
                break;
            }
            case 28: {
                n3 = 56;
                break;
            }
            case 29: {
                n3 = 61;
                break;
            }
            case 30: {
                n3 = 9;
                break;
            }
            case 31: {
                n3 = 58;
                break;
            }
            case 32: {
                n3 = 8;
                break;
            }
            case 33: {
                n3 = 18;
                break;
            }
            case 34: {
                n3 = 49;
                break;
            }
            case 35: {
                n3 = 14;
                break;
            }
            case 36: {
                n3 = 52;
                break;
            }
            case 37: {
                n3 = 25;
                break;
            }
            case 38: {
                n3 = 24;
                break;
            }
            case 39: {
                n3 = 21;
                break;
            }
            case 40: {
                n3 = 40;
                break;
            }
            case 41: {
                n3 = 62;
                break;
            }
            case 42: {
                n3 = 16;
                break;
            }
            case 43: {
                n3 = 32;
                break;
            }
            case 44: {
                n3 = 0;
                break;
            }
            case 45: {
                n3 = 30;
                break;
            }
            case 46: {
                n3 = 19;
                break;
            }
            case 47: {
                n3 = 15;
                break;
            }
            case 48: {
                n3 = 20;
                break;
            }
            case 49: {
                n3 = 22;
                break;
            }
            case 50: {
                n3 = 23;
                break;
            }
            case 51: {
                n3 = 59;
                break;
            }
            case 52: {
                n3 = 26;
                break;
            }
            case 53: {
                n3 = 13;
                break;
            }
            case 54: {
                n3 = 43;
                break;
            }
            case 55: {
                n3 = 29;
                break;
            }
            case 56: {
                n3 = 4;
                break;
            }
            case 57: {
                n3 = 44;
                break;
            }
            case 58: {
                n3 = 33;
                break;
            }
            case 59: {
                n3 = 60;
                break;
            }
            case 60: {
                n3 = 35;
                break;
            }
            case 61: {
                n3 = 36;
                break;
            }
            case 62: {
                n3 = 45;
                break;
            }
            default: {
                n3 = 10;
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
        AsynchronousTaskScheduler253.fb[n4] = new String(cArray);
        return n4;
    }

    private static Method h(long l, long l2) {
        int n = AsynchronousTaskScheduler253.e(l, l2);
        Object object = eb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = fb[n];
                int n3 = string2.indexOf(8);
                clazz3 = AsynchronousTaskScheduler253.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AsynchronousTaskScheduler253.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AsynchronousTaskScheduler253.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        AsynchronousTaskScheduler253.eb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AsynchronousTaskScheduler253.f(214508842984911L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AsynchronousTaskScheduler253.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AsynchronousTaskScheduler253.eb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AsynchronousTaskScheduler253.f(214508842984911L, 0L);
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

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = AsynchronousTaskScheduler253.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AsynchronousTaskScheduler253.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l, long l2) {
        int n = AsynchronousTaskScheduler253.e(l, l2);
        Object object = eb[n];
        if (object instanceof String) {
            String string = fb[n];
            int n2 = string.indexOf(8);
            Class clazz = AsynchronousTaskScheduler253.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AsynchronousTaskScheduler253.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AsynchronousTaskScheduler253.c(clazz3, string2, clazz2)) != null) {
                    AsynchronousTaskScheduler253.eb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AsynchronousTaskScheduler253.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AsynchronousTaskScheduler253.eb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AsynchronousTaskScheduler253.f(214508842984911L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AsynchronousTaskScheduler253.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AsynchronousTaskScheduler253.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AsynchronousTaskScheduler253.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AsynchronousTaskScheduler253.e(l, l2);
            object = eb[n];
            try {
                if (!(object instanceof String)) break block2;
                AsynchronousTaskScheduler253.eb[n] = clazz = Class.forName(fb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Rm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public double e() {
        return this.D.w();
    }

    private void lambda$new$2(boolean bl) {
        block3: {
            long l;
            block2: {
                l = L ^ 0x531B33B3EAF7L;
                try {
                    if (!bl) break block2;
                    this.b.u((String)((Object)AsynchronousTaskScheduler253.c("A", (int)AsynchronousTaskScheduler253.b("i", (int)4746, (long)(0x76F48B3E9AB375DEL ^ l)), (long)-3029157281083382863L, (long)l)));
                    this.b.g(AsynchronousTaskScheduler253.M.Y);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskScheduler253.a(customSystemException);
                }
            }
            this.b.u((String)((Object)AsynchronousTaskScheduler253.c("A", (int)AsynchronousTaskScheduler253.b("i", (int)31623, (long)(0x109C5748C4B59CDAL ^ l)), (long)-3029157281083382863L, (long)l)));
            this.b.g(AsynchronousTaskScheduler253.M.o);
        }
    }

    private static void a() {
        Object[] objectArray = eb;
        eb[0] = "D\u001d~";
        objectArray[1] = Integer.TYPE;
        AsynchronousTaskScheduler253.fb[1] = "java/lang/Integer";
        objectArray[2] = "\n\u0002{FL\u0007\u0001\rj\t1\u001f\u0012\nc@";
        objectArray[3] = "%\u000e1\u0019\u0019W.\u0001 VxY%\n$\f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\f0\u0003(\u000fb\u0013`\u0007\u0012Z`c5\u0016vA#\u0006o\u0010kV\u001bZu\u0015r\u000b\u007f\u001bh\u0013h1";
    }

    public AsynchronousTaskScheduler253(Ry ry, boolean bl, boolean bl2, Runnable runnable, Runnable runnable2) {
        block14: {
            String string;
            boolean bl3;
            AsynchronousTaskScheduler253 asynchronousTaskScheduler253;
            block16: {
                block15: {
                    CallSite callSite;
                    h6 h62;
                    h6 h63;
                    Color color;
                    block17: {
                        long l;
                        block13: {
                            Color color2;
                            l = L ^ 0x3200AD99AB87L;
                            this.R = new SymmetricCipherManager(100.0);
                            this.Y = ry;
                            this.V = bl2;
                            this.v = runnable;
                            this.B = runnable2;
                            this.D = new GraphicalRenderEngine1082(20.0, 20.0);
                            this.D.d().f((String)((Object)AsynchronousTaskScheduler253.c("A", (int)AsynchronousTaskScheduler253.b("i", (int)19277, (long)(0x102A6ADD287E6D61L ^ l)), (long)-7744462260640750911L, (long)l)));
                            this.D.i(false);
                            this.E = new CipherOperationsManager(TemporalMetadataResolver.h.r().D(), 15.0, 15.0);
                            this.E.r(2.0f);
                            color = bl ? AsynchronousTaskScheduler253.M.Y : AsynchronousTaskScheduler253.M.O;
                            try {
                                color2 = bl ? AsynchronousTaskScheduler253.M.u : AsynchronousTaskScheduler253.M.b;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousTaskScheduler253.a(customSystemException);
                            }
                            Color color3 = color2;
                            try {
                                h6 h64;
                                this.F = new yC((String)((Object)AsynchronousTaskScheduler253.c("A", (int)AsynchronousTaskScheduler253.b("i", (int)1899, (long)(0x24865FFEA1EFA14AL ^ l)), (long)-7744462260640750911L, (long)l)), 6.0, 6.0, 6.0, 12.0, color, color3, null);
                                this.F.H(AsynchronousTaskScheduler253.M.Z);
                                this.F.b(true);
                                this.F.u(true);
                                h63 = h64;
                                h62 = h64;
                                if (!bl || bl2) break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousTaskScheduler253.a(customSystemException);
                            }
                            callSite = AsynchronousTaskScheduler253.c("A", (int)AsynchronousTaskScheduler253.b("i", (int)5860, (long)(0x784FE81E679630CAL ^ l)), (long)-7744462260640750911L, (long)l);
                            break block17;
                        }
                        callSite = AsynchronousTaskScheduler253.c("A", (int)AsynchronousTaskScheduler253.b("i", (int)32484, (long)(0x6BE559B2C7BB58C1L ^ l)), (long)-7744462260640750911L, (long)l);
                    }
                    h63((String)((Object)callSite), AsynchronousTaskScheduler253.M.S);
                    h6 h65 = h62;
                    h65.T(35.0);
                    h65.w(12.0);
                    h65.d(0.75);
                    h65.C(this::lambda$new$0);
                    this.b = new TransactionValidator1909("");
                    TemporalDataTransformer temporalDataTransformer = ry.d();
                    try {
                        if (temporalDataTransformer != null) {
                            this.b.y(temporalDataTransformer.q());
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousTaskScheduler253.a(customSystemException);
                    }
                    this.b.h((arg_0, arg_1) -> this.lambda$new$1(color, arg_0, arg_1));
                    Runnable runnable3 = () -> this.lambda$new$2(bl);
                    try {
                        try {
                            try {
                                runnable3.run();
                                this.F.f(() -> this.lambda$new$3(runnable3, bl));
                                this.R.n(this.F, new Object[0]);
                                this.R.n(new GraphicalRenderController(12.0, 12.0, 1.0, 6.0, AsynchronousTaskScheduler253.M.S), new Object[0]);
                                this.R.n(h65, new Object[0]);
                                this.R.i(false);
                                this.D.o(this.E, this.b, new PrecisionMathOrchestrator(2.0, 0.0, 0.0, 0.0, this.R));
                                this.o(this.D);
                                if (!bl || bl2) break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousTaskScheduler253.a(customSystemException);
                            }
                            asynchronousTaskScheduler253 = this;
                            bl3 = true;
                            if (temporalDataTransformer == null) break block15;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousTaskScheduler253.a(customSystemException);
                        }
                        string = temporalDataTransformer.q();
                        break block16;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousTaskScheduler253.a(customSystemException);
                    }
                }
                string = "";
            }
            asynchronousTaskScheduler253.e(bl3, string, false);
        }
    }

    private void lambda$new$1(Color color, char c, int n) {
        block3: {
            block2: {
                try {
                    if (!this.b.a().isEmpty()) break block2;
                    this.F.H(AsynchronousTaskScheduler253.M.Z);
                    this.F.b(true);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskScheduler253.a(customSystemException);
                }
            }
            this.F.H(color);
            this.F.b(false);
        }
    }

    public CipherOperationsManager m() {
        return this.E;
    }

    private void lambda$new$0() {
        CompletableFuture.runAsync(this.v, GraphicalRenderingController.st);
    }

    public TransactionValidator1909 h() {
        return this.b;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Rm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private CompletableFuture<TransactionStatusTracker<TemporalDataTransformer>> e(boolean bl, String string, boolean bl2) {
        return ((CompletableFuture)_b.S().M().A(this.Y, bl, string).whenCompleteAsync((arg_0, arg_1) -> this.lambda$submit$4(bl, bl2, arg_0, arg_1), (Executor)GraphicalRenderingController.st)).exceptionally(AsynchronousTaskScheduler253::lambda$submit$5);
    }

    @Override
    public void G() {
        this.D.b(this.G());
        this.D.M(this.W());
        this.D.T(this.w());
        this.D.w(this.b());
        this.b.T(this.w() - (this.R.w() + 8.0) - this.E.w());
        this.D.A();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                AsynchronousTaskScheduler253.L = MultiContainerRegistry.a(8663706723723195532L, 1883834587623363891L, MethodHandles.lookup().lookupClass()).a(204558005591865L);
                AsynchronousTaskScheduler253.eb = new Object[5];
                AsynchronousTaskScheduler253.fb = new String[5];
                AsynchronousTaskScheduler253.a();
                AsynchronousTaskScheduler253.db = new HashMap<K, V>(13);
                var0 = AsynchronousTaskScheduler253.L ^ 126329491782868L;
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
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "jZ\u00ab/\u00a5[v\u00f5\u007f\u0086\u00ea\u00ee\u00d0\n\u00b8\u0084\u00c1PG\u009f\u0018\u0087\u00dd\u00c2;A_z\u00b1\f\u00f0d\u00db\u00bd\u00b5\u00c5\u00a2\u0091lyz\u00eb\tx\b\u0093\tO\u0093\u0014x{\u00b4\u00df\fk\u00c0\u0092<a\u00fe\u00d7\u00df\u00b9\u00af6\u00ad\u00fbD\u001c\u00ac\u000e";
                var7_6 = "jZ\u00ab/\u00a5[v\u00f5\u007f\u0086\u00ea\u00ee\u00d0\n\u00b8\u0084\u00c1PG\u009f\u0018\u0087\u00dd\u00c2;A_z\u00b1\f\u00f0d\u00db\u00bd\u00b5\u00c5\u00a2\u0091lyz\u00eb\tx\b\u0093\tO\u0093\u0014x{\u00b4\u00df\fk\u00c0\u0092<a\u00fe\u00d7\u00df\u00b9\u00af6\u00ad\u00fbD\u001c\u00ac\u000e".length();
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
                    var6_5 = "\u00e1\u00b1\u00c2\u00fa\u00ce\u00b1\u00f5\u00e6\u00b6\u0007\u00ee\u00df\u00dfn\u00cc\u0096";
                    var7_6 = "\u00e1\u00b1\u00c2\u00fa\u00ce\u00b1\u00f5\u00e6\u00b6\u0007\u00ee\u00df\u00dfn\u00cc\u0096".length();
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
        AsynchronousTaskScheduler253.ab = var8_3;
        AsynchronousTaskScheduler253.bb = new Integer[11];
        try {
            v8 = AsynchronousTaskScheduler253.class.desiredAssertionStatus() == false;
        }
        catch (CustomSystemException v9) {
            throw AsynchronousTaskScheduler253.a(v9);
        }
        AsynchronousTaskScheduler253.n = v8;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AsynchronousTaskScheduler253.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(AsynchronousTaskScheduler253.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

