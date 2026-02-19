/*
 * Decompiled with CFR 0.152.
 */
package com.core.lifecycle;

import a.cr;
import com.action.management.ActionExecutionMediator;
import com.adapter.management.GenericAdapterManager;
import com.app.security.crypto.BinaryKeyGenerator;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.crypto.streaming.CipherStreamProcessor;
import com.exception.system.CustomSystemException;
import com.notification.dispatch.NotificationDispatcher;
import com.numeric.precision.NumericPrecisionTransformer;
import com.resource.management.ResourceAccessMediator;
import com.text.processing.StringTokenContainer;
import com.transaction.model.TransactionDescriptor;
import com.transaction.validation.TransactionValidationHandler;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ObjectLifecycleManager {
    public StringTokenContainer u;
    public AuthenticationStateTracker G;
    private static final long a;
    public NumericPrecisionTransformer M;
    private static final Object[] e;
    private static int[] V;
    public AuthenticationStateTracker j;
    public StringTokenContainer z;
    public StringTokenContainer B;
    public AuthenticationStateTracker t;
    private static final long[] b;
    public AuthenticationStateTracker F;
    private static final Integer[] c;
    public AuthenticationStateTracker r;
    public GenericAdapterManager P;
    public AuthenticationStateTracker X;
    private static final String[] f;
    private static final Map d;
    private TransactionDescriptor N;
    public AuthenticationStateTracker K;
    public CipherStreamProcessor Z;
    public AuthenticationStateTracker h;
    public AuthenticationStateTracker C;

    public static void I(int[] nArray) {
        V = nArray;
    }

    public TransactionDescriptor j() {
        return this.N;
    }

    public static int[] x() {
        return V;
    }

    private static Method d(long l, long l2) {
        int n = ObjectLifecycleManager.a(l, l2);
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
                clazz3 = ObjectLifecycleManager.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ObjectLifecycleManager.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ObjectLifecycleManager.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ObjectLifecycleManager.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ObjectLifecycleManager.b(268805198450609L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ObjectLifecycleManager.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ObjectLifecycleManager.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ObjectLifecycleManager.b(268805198450609L, 0L);
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ObjectLifecycleManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public ObjectLifecycleManager() {
        long l = a ^ 0xB133AD47B86L;
        this.h = AuthenticationStateTracker.R(this, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)32193, (long)(0x1DFCE4AC91EBD61AL ^ l)), (long)-4999248804755481112L, (long)l)), false, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)11673, (long)(0xDF596A1B35B0657L ^ l)), (long)-4999248804755481112L, (long)l)));
        this.h.P(this::lambda$new$0);
        this.z = new ActionExecutionMediator(this, this, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)22475, (long)(0x277BE1B5A18FFC00L ^ l)), (long)-4999248804755481112L, (long)l)), "");
        this.j = AuthenticationStateTracker.R(this, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)15590, (long)(0x29DBE01940179726L ^ l)), (long)-4999248804755481112L, (long)l)), false, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)17709, (long)(0x3C5C11387764EEEAL ^ l)), (long)-4999248804755481112L, (long)l)));
        this.B = new NotificationDispatcher(this, this, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)31726, (long)(0x484CAA91BBA5D02AL ^ l)), (long)-4999248804755481112L, (long)l)), "");
        this.u = (StringTokenContainer)((StringTokenContainer)new ResourceAccessMediator(this, this, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)405, (long)(0x7EEC7502E28DAA4BL ^ l)), (long)-4999248804755481112L, (long)l)), "").Z(true)).c((String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)19957, (long)(0x425FBC851AF3E630L ^ l)), (long)-4999248804755481112L, (long)l)));
        this.X = AuthenticationStateTracker.R(this, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)29664, (long)(0x6E26BF7DFD3F582AL ^ l)), (long)-4999248804755481112L, (long)l)), true, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)21776, (long)(0x5F0AB8B52F38FEC9L ^ l)), (long)-4999248804755481112L, (long)l)));
        this.t = AuthenticationStateTracker.R(this, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)2468, (long)(0x19FB001EE907A27CL ^ l)), (long)-4999248804755481112L, (long)l)), false, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)17408, (long)(0xDA47509EF266FC1L ^ l)), (long)-4999248804755481112L, (long)l)));
        this.P = (GenericAdapterManager)GenericAdapterManager.D(this, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)27415, (long)(0x362E244954DEC0D8L ^ l)), (long)-4999248804755481112L, (long)l)), cr.X, cr.X, cr.T, cr.v, cr.E, cr.m).y(false);
        this.M = NumericPrecisionTransformer.t(this, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)13250, (long)(0x23A00824D4831804L ^ l)), (long)-4999248804755481112L, (long)l)), (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)17551, (long)(0x50DD990DE7A0EF55L ^ l)), (long)-4999248804755481112L, (long)l)), (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)218, (long)(0x4F83918069212B07L ^ l)), (long)-4999248804755481112L, (long)l)), 0.0, 50.0, 100.0);
        this.G = AuthenticationStateTracker.R(this, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)7371, (long)(0x6641AF75CA623709L ^ l)), (long)-4999248804755481112L, (long)l)), false, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)30187, (long)(0x272B701891715E34L ^ l)), (long)-4999248804755481112L, (long)l)));
        this.Z = new TransactionValidationHandler(this, this, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)24355, (long)(0x5200C01C8653F4F6L ^ l)), (long)-4999248804755481112L, (long)l)), new BinaryKeyGenerator(this, 161));
        this.C = AuthenticationStateTracker.R(this, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)15887, (long)(0x2638908582F095C7L ^ l)), (long)-4999248804755481112L, (long)l)), true, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)15249, (long)(0x55D1395EF3AC9058L ^ l)), (long)-4999248804755481112L, (long)l)));
        this.K = AuthenticationStateTracker.R(this, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)20427, (long)(0x5CA8F8F5876A6406L ^ l)), (long)-4999248804755481112L, (long)l)), false, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)32565, (long)(0x350E2E52C76454E1L ^ l)), (long)-4999248804755481112L, (long)l)));
        this.F = AuthenticationStateTracker.R(this, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)29129, (long)(0x29B413FA20835A15L ^ l)), (long)-4999248804755481112L, (long)l)), false, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)17532, (long)(0x4B58607256AEFBFL ^ l)), (long)-4999248804755481112L, (long)l)));
        this.r = AuthenticationStateTracker.R(this, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)2176, (long)(0x29601EEA519E234CL ^ l)), (long)-4999248804755481112L, (long)l)), true, (String)((Object)ObjectLifecycleManager.b("z", (int)ObjectLifecycleManager.a("n", (int)16939, (long)(0x32F33BA701E669FDL ^ l)), (long)-4999248804755481112L, (long)l)));
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ObjectLifecycleManager.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void lambda$new$0(AuthenticationStateTracker authenticationStateTracker) {
        try {
            if (authenticationStateTracker.s().booleanValue()) {
                this.z.H("");
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ObjectLifecycleManager.a(customSystemException);
        }
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "T\u001b\t";
        objectArray[1] = Integer.TYPE;
        ObjectLifecycleManager.f[1] = "java/lang/Integer";
        objectArray[2] = "Gg?\u0012f+Lh.]\u001b3_o'\u0014";
        objectArray[3] = "=\b\f!I\u00156\u0007\u001dn(\u001b=\f\u00194";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "k\u001bMY\u001f0/U\u0014\"H W\u001dO\u001fL gA\u0010K\u001f[n_\u0012Y\u001f69E\u001dY#";
    }

    static TransactionDescriptor e(ObjectLifecycleManager objectLifecycleManager, TransactionDescriptor transactionDescriptor) {
        objectLifecycleManager.N = transactionDescriptor;
        return objectLifecycleManager.N;
    }

    private static Field c(long l, long l2) {
        int n = ObjectLifecycleManager.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = ObjectLifecycleManager.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ObjectLifecycleManager.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ObjectLifecycleManager.a(clazz3, string2, clazz2)) != null) {
                    ObjectLifecycleManager.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ObjectLifecycleManager.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ObjectLifecycleManager.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ObjectLifecycleManager.b(268805198450609L, 0L);
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1152;
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
                throw new RuntimeException("a/Gw", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ObjectLifecycleManager.c[n2] = n3;
        }
        return c[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Gw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ObjectLifecycleManager.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ObjectLifecycleManager.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Gw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
                n3 = 22;
                break;
            }
            case 1: {
                n3 = 17;
                break;
            }
            case 2: {
                n3 = 35;
                break;
            }
            case 3: {
                n3 = 23;
                break;
            }
            case 4: {
                n3 = 47;
                break;
            }
            case 5: {
                n3 = 4;
                break;
            }
            case 6: {
                n3 = 30;
                break;
            }
            case 7: {
                n3 = 63;
                break;
            }
            case 8: {
                n3 = 57;
                break;
            }
            case 9: {
                n3 = 49;
                break;
            }
            case 10: {
                n3 = 44;
                break;
            }
            case 11: {
                n3 = 38;
                break;
            }
            case 12: {
                n3 = 26;
                break;
            }
            case 13: {
                n3 = 32;
                break;
            }
            case 14: {
                n3 = 5;
                break;
            }
            case 15: {
                n3 = 33;
                break;
            }
            case 16: {
                n3 = 6;
                break;
            }
            case 17: {
                n3 = 59;
                break;
            }
            case 18: {
                n3 = 18;
                break;
            }
            case 19: {
                n3 = 8;
                break;
            }
            case 20: {
                n3 = 1;
                break;
            }
            case 21: {
                n3 = 60;
                break;
            }
            case 22: {
                n3 = 34;
                break;
            }
            case 23: {
                n3 = 48;
                break;
            }
            case 24: {
                n3 = 10;
                break;
            }
            case 25: {
                n3 = 45;
                break;
            }
            case 26: {
                n3 = 52;
                break;
            }
            case 27: {
                n3 = 0;
                break;
            }
            case 28: {
                n3 = 53;
                break;
            }
            case 29: {
                n3 = 24;
                break;
            }
            case 30: {
                n3 = 16;
                break;
            }
            case 31: {
                n3 = 21;
                break;
            }
            case 32: {
                n3 = 39;
                break;
            }
            case 33: {
                n3 = 58;
                break;
            }
            case 34: {
                n3 = 27;
                break;
            }
            case 35: {
                n3 = 31;
                break;
            }
            case 36: {
                n3 = 25;
                break;
            }
            case 37: {
                n3 = 61;
                break;
            }
            case 38: {
                n3 = 36;
                break;
            }
            case 39: {
                n3 = 29;
                break;
            }
            case 40: {
                n3 = 14;
                break;
            }
            case 41: {
                n3 = 9;
                break;
            }
            case 42: {
                n3 = 54;
                break;
            }
            case 43: {
                n3 = 55;
                break;
            }
            case 44: {
                n3 = 40;
                break;
            }
            case 45: {
                n3 = 37;
                break;
            }
            case 46: {
                n3 = 11;
                break;
            }
            case 47: {
                n3 = 20;
                break;
            }
            case 48: {
                n3 = 43;
                break;
            }
            case 49: {
                n3 = 41;
                break;
            }
            case 50: {
                n3 = 15;
                break;
            }
            case 51: {
                n3 = 12;
                break;
            }
            case 52: {
                n3 = 7;
                break;
            }
            case 53: {
                n3 = 51;
                break;
            }
            case 54: {
                n3 = 46;
                break;
            }
            case 55: {
                n3 = 28;
                break;
            }
            case 56: {
                n3 = 50;
                break;
            }
            case 57: {
                n3 = 42;
                break;
            }
            case 58: {
                n3 = 62;
                break;
            }
            case 59: {
                n3 = 3;
                break;
            }
            case 60: {
                n3 = 19;
                break;
            }
            case 61: {
                n3 = 56;
                break;
            }
            case 62: {
                n3 = 2;
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
        ObjectLifecycleManager.f[n4] = new String(cArray);
        return n4;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ObjectLifecycleManager.a = MultiContainerRegistry.a(-3144733828691665663L, 765712339055023657L, MethodHandles.lookup().lookupClass()).a(280413784623766L);
                ObjectLifecycleManager.e = new Object[5];
                ObjectLifecycleManager.f = new String[5];
                ObjectLifecycleManager.a();
                ObjectLifecycleManager.d = new HashMap<K, V>(13);
                var0 = ObjectLifecycleManager.a ^ 130294309426451L;
                ObjectLifecycleManager.I(null);
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
                var8_3 = new long[27];
                var5_4 = 0;
                var6_5 = "I\u00f7\u0086\u00d2\u00bfx\u00b1\u00d8\u0015\u00abO\u00ba\u0013\u0005\u00cc\u00e2\r\u00aeB\u00eb&$)\f=\u0010\u00ef\u0011z\u00fc \u0091\u0080e\u001b\u0081\u00a91\u00a9*\u00f3\u009e]\u00e0\u00db\u00deY#^\u0015\u0089\tC=\u00c7\u00f6\u00e2\u0083\u00b6\r\u0015Gi\u0003\u00a5q\\`\u0092\"\u0000\f\u0004\u0010Jw4\u00bc6\f\u00bd\u00fc\u00a0\u00d4_\u00c8\u00a2\rz[\u0004\u00af\u00e7s\u001c<A\u00cfhsE\u000b\u0013=UDCh\u00d4>L\u00b43C\u0004\u0003\u00be\u001fV\u008a)\u0098\u0019C\u00f6\r\n\u0094o\u00b5}4a\u00d6\u00c72\u00c4\u00a0\u00c3\u00004h\u008b\u00d6y\u00dc#\u00ad\u00bf\u00d5\u00e1\u00c7|\u001b\u007f\u000b\u00ca\u00f5;a\u00a7\u00c0,S`\\\u00a85\u00da/\u00ca\u00b42\\S0\u00e2\u00e9\u009f\u0097\u00f4\u00d5\u008b&\u000e\u00c3\u0019yi\u00d68\u00fa\u00fe\u0092K\u008b\u0001{*{";
                var7_6 = "I\u00f7\u0086\u00d2\u00bfx\u00b1\u00d8\u0015\u00abO\u00ba\u0013\u0005\u00cc\u00e2\r\u00aeB\u00eb&$)\f=\u0010\u00ef\u0011z\u00fc \u0091\u0080e\u001b\u0081\u00a91\u00a9*\u00f3\u009e]\u00e0\u00db\u00deY#^\u0015\u0089\tC=\u00c7\u00f6\u00e2\u0083\u00b6\r\u0015Gi\u0003\u00a5q\\`\u0092\"\u0000\f\u0004\u0010Jw4\u00bc6\f\u00bd\u00fc\u00a0\u00d4_\u00c8\u00a2\rz[\u0004\u00af\u00e7s\u001c<A\u00cfhsE\u000b\u0013=UDCh\u00d4>L\u00b43C\u0004\u0003\u00be\u001fV\u008a)\u0098\u0019C\u00f6\r\n\u0094o\u00b5}4a\u00d6\u00c72\u00c4\u00a0\u00c3\u00004h\u008b\u00d6y\u00dc#\u00ad\u00bf\u00d5\u00e1\u00c7|\u001b\u007f\u000b\u00ca\u00f5;a\u00a7\u00c0,S`\\\u00a85\u00da/\u00ca\u00b42\\S0\u00e2\u00e9\u009f\u0097\u00f4\u00d5\u008b&\u000e\u00c3\u0019yi\u00d68\u00fa\u00fe\u0092K\u008b\u0001{*{".length();
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
                    var6_5 = "\u0000>\u001f5H\u0090\u00ff\u0094\u0007Pj;\u00f6\u0013\u00f9\u00db";
                    var7_6 = "\u0000>\u001f5H\u0090\u00ff\u0094\u0007Pj;\u00f6\u0013\u00f9\u00db".length();
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
        ObjectLifecycleManager.b = var8_3;
        ObjectLifecycleManager.c = new Integer[27];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cd' || c == 'l' || c == '\u00ee' || c == '\u00a4') {
                field = ObjectLifecycleManager.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cd' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'l' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ee' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ObjectLifecycleManager.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ea' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ObjectLifecycleManager.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                ObjectLifecycleManager.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ObjectLifecycleManager.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ObjectLifecycleManager.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ObjectLifecycleManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ObjectLifecycleManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

