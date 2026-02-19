/*
 * Decompiled with CFR 0.152.
 */
package com.runtime.reflection;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.management.ThreadPoolCoordinator;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.data.collection.MultiListDataAggregator;
import com.exception.system.CustomSystemException;
import com.processing.transformation.DataTransformationEngine817;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.reflection.util.ContextualReflectionUtility;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionCoordinator2667;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ReflectionUtilityService {
    private final CryptoProtocolEngine r;
    private final String H;
    private static final String[] g;
    private Field j;
    private final Class<?> G;
    private static final Map e;
    private final String B;
    private static final long a;
    private static final Object[] f;
    private final String b;
    private final Class<?> I;
    private static String v;
    private boolean S;
    private final Class<?> n;
    private static int X;
    private boolean i;
    private final boolean F;
    private final String m;
    private static final Integer[] d;
    private final String U;
    private final int N;
    private static final long[] c;
    private final boolean u;

    public boolean T() {
        return this.S;
    }

    private static Method d(long l, long l2) {
        int n = ReflectionUtilityService.a(l, l2);
        Object object = f[n];
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
                clazz3 = ReflectionUtilityService.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ReflectionUtilityService.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ReflectionUtilityService.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ReflectionUtilityService.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ReflectionUtilityService.b(345995796111943L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ReflectionUtilityService.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ReflectionUtilityService.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ReflectionUtilityService.b(345995796111943L, 0L);
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

    public Object Z(Object object) {
        if (this.j != null) {
            try {
                return this.j.get(object);
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
        return TransactionCoordinator2667.cc(this.N, object);
    }

    public ReflectionUtilityService G() {
        block4: {
            try {
                try {
                    if (!TemporalMetadataResolver.h.J() || this.S) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectionUtilityService.a(customSystemException);
                }
                this.j = this.v();
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectionUtilityService.a(customSystemException);
            }
        }
        return this;
    }

    public static ReflectionUtilityService p(ThreadPoolCoordinator threadPoolCoordinator) {
        long l = a ^ 0x167EC27FE5F4L;
        ReflectionUtilityService reflectionUtilityService = new ReflectionUtilityService(threadPoolCoordinator.I(), threadPoolCoordinator.E(), threadPoolCoordinator.n(), threadPoolCoordinator.j(), threadPoolCoordinator.u(), threadPoolCoordinator.k(), threadPoolCoordinator.K(), threadPoolCoordinator.x());
        return ReflectionUtilityService.b("r", (Object)reflectionUtilityService, (long)3751392615923182715L, (long)l);
    }

    public void V(Object object, float[] fArray) {
        TransactionCoordinator2667.yy(this.N, object, fArray);
    }

    public byte[] z(Object object) {
        return TransactionCoordinator2667.hhh(this.N, object);
    }

    public Class<?> p() {
        return this.n;
    }

    public int[] P(Object object) {
        return TransactionCoordinator2667.gg(this.N, object);
    }

    public static void Y(String string) {
        v = string;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ReflectionUtilityService.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ReflectionUtilityService.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void H(Object object, Object[] objectArray) {
        TransactionCoordinator2667.aaa(this.N, object, objectArray);
    }

    public long[] b(Object object) {
        return TransactionCoordinator2667.hh(this.N, object);
    }

    public void C(Object object, short[] sArray) {
        TransactionCoordinator2667.vv(this.N, object, sArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'e' || c == 'c' || c == '\u00ee' || c == '\u00c5') {
                field = ReflectionUtilityService.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'e' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ee' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ReflectionUtilityService.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'r' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00da' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ReflectionUtilityService.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "PxqP";
        objectArray[1] = "G=\n";
        objectArray[2] = Integer.TYPE;
        ReflectionUtilityService.g[2] = "java/lang/Integer";
        objectArray[3] = ">\u0014y!0K5\u001bhnMS&\u001ca'";
        objectArray[4] = "E!H\u000e0MN.YAQCE%]\u001b";
        objectArray[5] = "\u0004\u000bB\u0016jJ\u0000\fHO\u0011QF3\u001a\u0015u\u0001AK_\u0019v\u0001=\t\u001c\u000b)JRKRHt:";
        Object[] objectArray2 = objectArray;
        objectArray[6] = "}\u007f|ek3{cv\u0004XV}\u007f|ek3{cv\u0004";
    }

    public void M(Object object, long l) {
        if (this.j != null) {
            try {
                this.j.setLong(object, l);
                return;
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
        TransactionCoordinator2667.pp(this.N, object, l);
    }

    /*
     * Unable to fully structure code
     */
    public ReflectionUtilityService(CryptoProtocolEngine var1_1, Class var2_2, String var3_3, boolean var4_4, boolean var5_5, boolean var6_6, Class var7_7, int var8_8) {
        block17: {
            block14: {
                block15: {
                    block16: {
                        var9_9 = ReflectionUtilityService.a ^ 92675850953421L;
                        v0 = HK.Y();
                        super();
                        this.r = var1_1;
                        this.H = var3_3;
                        var11_10 = v0;
                        this.n = var7_7;
                        var12_11 = DataTransformationEngine817.b(var2_2, var3_3);
                        try {
                            try {
                                try {
                                    try {
                                        if (var11_10 == null) break block14;
                                        if (var12_11 != null) {
                                        }
                                        ** GOTO lbl40
                                    }
                                    catch (CustomSystemException v1) {
                                        throw ReflectionUtilityService.a(v1);
                                    }
                                    this.b = var12_11.z;
                                    v2 = this;
                                    v3 = var12_11.s;
                                    if (var11_10 == null) break block15;
                                }
                                catch (CustomSystemException v4) {
                                    throw ReflectionUtilityService.a(v4);
                                }
                                if (v3 == null) break block16;
                            }
                            catch (CustomSystemException v5) {
                                throw ReflectionUtilityService.a(v5);
                            }
                            v3 = var12_11.s;
                            break block15;
                        }
                        catch (CustomSystemException v6) {
                            throw ReflectionUtilityService.a(v6);
                        }
                    }
                    v3 = var7_7;
                }
                try {
                    v2.G = v3;
                    if (var11_10 != null) break block17;
lbl40:
                    // 2 sources

                    this.b = var3_3;
                }
                catch (CustomSystemException v7) {
                    throw ReflectionUtilityService.a(v7);
                }
            }
            this.G = var7_7;
        }
        try {
            this.U = ReflectionUtilityService.L(this.G, false, var8_8);
            this.B = ReflectionUtilityService.L(this.G, true, var8_8);
            this.F = var4_4;
            this.I = var2_2;
            this.m = ReflectionMetadataResolver.Y(var2_2).replace((CharSequence)ReflectionUtilityService.b("\u00da", (int)ReflectionUtilityService.a("d", (int)1237, (long)(7324405137815731745L ^ var9_9)), (long)3690143332625324894L, (long)var9_9), (CharSequence)ReflectionUtilityService.b("\u00da", (int)ReflectionUtilityService.a("d", (int)11585, (long)(1173102672993179574L ^ var9_9)), (long)3690143332625324894L, (long)var9_9));
            this.u = var5_5;
            this.N = ++ReflectionUtilityService.X;
            this.i = var6_6;
            if (AbstractComputationKernel.J() != null) {
                HK.A(new int[5]);
            }
        }
        catch (CustomSystemException v8) {
            throw ReflectionUtilityService.a(v8);
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = f[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 51;
                break;
            }
            case 1: {
                n3 = 50;
                break;
            }
            case 2: {
                n3 = 5;
                break;
            }
            case 3: {
                n3 = 39;
                break;
            }
            case 4: {
                n3 = 63;
                break;
            }
            case 5: {
                n3 = 53;
                break;
            }
            case 6: {
                n3 = 24;
                break;
            }
            case 7: {
                n3 = 40;
                break;
            }
            case 8: {
                n3 = 29;
                break;
            }
            case 9: {
                n3 = 7;
                break;
            }
            case 10: {
                n3 = 2;
                break;
            }
            case 11: {
                n3 = 44;
                break;
            }
            case 12: {
                n3 = 60;
                break;
            }
            case 13: {
                n3 = 14;
                break;
            }
            case 14: {
                n3 = 38;
                break;
            }
            case 15: {
                n3 = 35;
                break;
            }
            case 16: {
                n3 = 12;
                break;
            }
            case 17: {
                n3 = 52;
                break;
            }
            case 18: {
                n3 = 13;
                break;
            }
            case 19: {
                n3 = 1;
                break;
            }
            case 20: {
                n3 = 43;
                break;
            }
            case 21: {
                n3 = 19;
                break;
            }
            case 22: {
                n3 = 58;
                break;
            }
            case 23: {
                n3 = 16;
                break;
            }
            case 24: {
                n3 = 48;
                break;
            }
            case 25: {
                n3 = 55;
                break;
            }
            case 26: {
                n3 = 56;
                break;
            }
            case 27: {
                n3 = 17;
                break;
            }
            case 28: {
                n3 = 45;
                break;
            }
            case 29: {
                n3 = 33;
                break;
            }
            case 30: {
                n3 = 28;
                break;
            }
            case 31: {
                n3 = 22;
                break;
            }
            case 32: {
                n3 = 36;
                break;
            }
            case 33: {
                n3 = 49;
                break;
            }
            case 34: {
                n3 = 10;
                break;
            }
            case 35: {
                n3 = 6;
                break;
            }
            case 36: {
                n3 = 62;
                break;
            }
            case 37: {
                n3 = 27;
                break;
            }
            case 38: {
                n3 = 61;
                break;
            }
            case 39: {
                n3 = 11;
                break;
            }
            case 40: {
                n3 = 9;
                break;
            }
            case 41: {
                n3 = 15;
                break;
            }
            case 42: {
                n3 = 21;
                break;
            }
            case 43: {
                n3 = 3;
                break;
            }
            case 44: {
                n3 = 25;
                break;
            }
            case 45: {
                n3 = 47;
                break;
            }
            case 46: {
                n3 = 0;
                break;
            }
            case 47: {
                n3 = 23;
                break;
            }
            case 48: {
                n3 = 4;
                break;
            }
            case 49: {
                n3 = 42;
                break;
            }
            case 50: {
                n3 = 31;
                break;
            }
            case 51: {
                n3 = 59;
                break;
            }
            case 52: {
                n3 = 46;
                break;
            }
            case 53: {
                n3 = 34;
                break;
            }
            case 54: {
                n3 = 32;
                break;
            }
            case 55: {
                n3 = 57;
                break;
            }
            case 56: {
                n3 = 26;
                break;
            }
            case 57: {
                n3 = 8;
                break;
            }
            case 58: {
                n3 = 18;
                break;
            }
            case 59: {
                n3 = 54;
                break;
            }
            case 60: {
                n3 = 37;
                break;
            }
            case 61: {
                n3 = 20;
                break;
            }
            case 62: {
                n3 = 30;
                break;
            }
            default: {
                n3 = 41;
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
        ReflectionUtilityService.g[n4] = new String(cArray);
        return n4;
    }

    public void t(Object object, int n) {
        if (this.j != null) {
            try {
                this.j.setInt(object, n);
                return;
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
        TransactionCoordinator2667.oo(this.N, object, n);
    }

    public void B(Object object, boolean[] blArray) {
        TransactionCoordinator2667.tt(this.N, object, blArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ib" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String L(Class<?> clazz, boolean bl, int n) {
        long l = a ^ 0x33E7F5515A30L;
        String string = ContextualReflectionUtility.B(clazz, bl);
        if (n > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            try {
                for (int i = 0; i < n; ++i) {
                    stringBuilder.append((String)((Object)ReflectionUtilityService.b("\u00da", (int)ReflectionUtilityService.a("d", (int)16159, (long)(0x1C9004436469FD14L ^ l)), (long)-8373490911315418205L, (long)l)));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectionUtilityService.a(customSystemException);
            }
            string = stringBuilder + string;
        }
        return string;
    }

    public short x(Object object) {
        return TransactionCoordinator2667.x(this.N, object);
    }

    public long j(Object object) {
        return TransactionCoordinator2667.z(this.N, object);
    }

    public short[] T(Object object) {
        return TransactionCoordinator2667.ff(this.N, object);
    }

    public String i() {
        return this.H;
    }

    public float x(Object object) {
        if (this.j != null) {
            try {
                return this.j.getFloat(object);
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
        return TransactionCoordinator2667.aa(this.N, object);
    }

    public void n(Object object, long[] lArray) {
        TransactionCoordinator2667.xx(this.N, object, lArray);
    }

    public Object[] t(Object object) {
        if (this.j != null) {
            try {
                return (Object[])this.j.get(object);
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
        return TransactionCoordinator2667.kk(this.N, object);
    }

    public int R(Object object) {
        if (this.j != null) {
            try {
                return this.j.getInt(object);
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
        return TransactionCoordinator2667.y(this.N, object);
    }

    public String X() {
        return TransactionCoordinator2667.gfn(this.N);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ReflectionUtilityService.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ReflectionUtilityService.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ReflectionUtilityService.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = ReflectionUtilityService.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = ReflectionUtilityService.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ReflectionUtilityService.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ReflectionUtilityService.a(clazz3, string2, clazz2)) != null) {
                    ReflectionUtilityService.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ReflectionUtilityService.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ReflectionUtilityService.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ReflectionUtilityService.b(345995796111943L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void T(Object object, char[] cArray) {
        TransactionCoordinator2667.uu(this.N, object, cArray);
    }

    public boolean[] n(Object object) {
        return TransactionCoordinator2667.dd(this.N, object);
    }

    public String K() {
        return this.U;
    }

    public double[] l(Object object) {
        return TransactionCoordinator2667.jj(this.N, object);
    }

    public boolean d() {
        return this.u;
    }

    public void R(Object object, int[] nArray) {
        TransactionCoordinator2667.ww(this.N, object, nArray);
    }

    public char j(Object object) {
        return TransactionCoordinator2667.w(this.N, object);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ReflectionUtilityService.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                ReflectionUtilityService.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public CryptoProtocolEngine R() {
        return this.r;
    }

    public Class J() {
        return this.I;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(-3653681817955252182L, 8278523750818290131L, MethodHandles.lookup().lookupClass()).a(100574181910756L);
        f = new Object[7];
        g = new String[7];
        ReflectionUtilityService.a();
        e = new HashMap(13);
        ReflectionUtilityService.Y(null);
        long l = a ^ 0x3E47677AC4BAL;
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
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u00c0\u0007/53\u0080\u00cf\u00aeM\u0092<\u00ae#>4u^\u00f7\u00f4\u00eaI\u00a0\u00e4V";
        int n2 = "\u00c0\u0007/53\u0080\u00cf\u00aeM\u0092<\u00ae#>4u^\u00f7\u00f4\u00eaI\u00a0\u00e4V".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        d = new Integer[3];
        X = 0;
    }

    public float[] k(Object object) {
        return TransactionCoordinator2667.ii(this.N, object);
    }

    public void O(Object object, char c) {
        TransactionCoordinator2667.mm(this.N, object, c);
    }

    public Class<?> h() {
        return this.G;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x49C1;
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
                throw new RuntimeException("a/Ib", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ReflectionUtilityService.d[n2] = n3;
        }
        return d[n2];
    }

    public char[] j(Object object) {
        if (this.j != null) {
            try {
                return (char[])this.j.get(object);
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
        return TransactionCoordinator2667.ee(this.N, object);
    }

    public String v() {
        return this.b;
    }

    public static String L() {
        return v;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ib" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void B(Object object, boolean bl) {
        if (this.j != null) {
            try {
                this.j.setBoolean(object, bl);
                return;
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
        TransactionCoordinator2667.ll(this.N, object, bl);
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

    public void B(Object object, double[] dArray) {
        TransactionCoordinator2667.zz(this.N, object, dArray);
    }

    public void L(Object object, Object object2) {
        if (this.j != null) {
            try {
                this.j.set(object, object2);
                return;
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
        TransactionCoordinator2667.ss(this.N, object, object2);
    }

    public void H(Object object, float f) {
        if (this.j != null) {
            try {
                this.j.setFloat(object, f);
                return;
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
        TransactionCoordinator2667.qq(this.N, object, f);
    }

    public Field v() {
        try {
            Field field = this.I.getDeclaredField(this.X());
            field.setAccessible(true);
            return field;
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
            return null;
        }
    }

    public double C(Object object) {
        if (this.j != null) {
            try {
                return this.j.getDouble(object);
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
        return TransactionCoordinator2667.bb(this.N, object);
    }

    /*
     * Unable to fully structure code
     */
    public ReflectionUtilityService A() {
        var1_1 = ReflectionUtilityService.a ^ 102602142929548L;
        var3_2 = HK.Y();
        try {
            block15: {
                block14: {
                    block19: {
                        v0 = this.F;
                        if (var3_2 == null) break block14;
                        if (v0 == 0) ** GOTO lbl19
                        break block19;
                        catch (Throwable v1) {
                            throw ReflectionUtilityService.a(v1);
                        }
                    }
                    try {
                        block20: {
                            TransactionCoordinator2667.t(this.N, this.I, this.m, this.b, this.U, this.B, this.u);
                            if (var3_2 != null) break block15;
                            break block20;
                            catch (Throwable v2) {
                                throw ReflectionUtilityService.a(v2);
                            }
                        }
                        v0 = this.N;
                    }
                    catch (Throwable v3) {
                        throw ReflectionUtilityService.a(v3);
                    }
                }
                TransactionCoordinator2667.u(v0, this.I, this.b, this.U, this.u);
            }
            this.G();
        }
        catch (Throwable var4_3) {
            block18: {
                block16: {
                    try {
                        block17: {
                            try {
                                try {
                                    v4 = this;
                                    if (var3_2 == null) break block16;
                                    if (!v4.i) break block17;
                                }
                                catch (Throwable v5) {
                                    throw ReflectionUtilityService.a(v5);
                                }
                                MultiListDataAggregator.p();
                                if (var3_2 != null) break block18;
                            }
                            catch (Throwable v6) {
                                throw ReflectionUtilityService.a(v6);
                            }
                        }
                        v4 = this;
                    }
                    catch (Throwable v7) {
                        throw ReflectionUtilityService.a(v7);
                    }
                }
                MultiListDataAggregator.w(v4);
            }
            this.S = true;
        }
        return this;
    }

    public boolean R(Object object) {
        if (this.j != null) {
            try {
                return this.j.getBoolean(object);
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
        return TransactionCoordinator2667.v(this.N, object);
    }

    public void A(Object object, double d2) {
        if (this.j != null) {
            try {
                this.j.setDouble(object, d2);
                return;
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
        TransactionCoordinator2667.rr(this.N, object, d2);
    }

    public boolean z() {
        return this.F;
    }

    public void o(Object object, short s2) {
        TransactionCoordinator2667.nn(this.N, object, s2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ReflectionUtilityService.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ReflectionUtilityService.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

