/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package com.integration.adaptation;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.google.common.collect.ImmutableMap;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
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
public class InterfaceAdaptationManager
extends CryptoProtocolEngine {
    private ReflectionUtilityService O;
    private ReflectionUtilityService p;
    private HK b;
    private static final Map e;
    private static final long a;
    private ReflectionUtilityService q;
    private HK n;
    private static final String[] g;
    private static final long[] c;
    private ReflectionUtilityService k;
    private static final Object[] f;
    public final HK r;
    private HK F;
    private HK s;
    private static final Integer[] d;
    private static int[] Y;

    public boolean l(Object object) {
        return this.F.V(object, new Object[0]);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = InterfaceAdaptationManager.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                InterfaceAdaptationManager.f[n] = clazz = Class.forName(g[n]);
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
            throw new RuntimeException("a/vB" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Field g(long l, long l2) {
        int n = InterfaceAdaptationManager.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = InterfaceAdaptationManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = InterfaceAdaptationManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = InterfaceAdaptationManager.c(clazz3, string2, clazz2)) != null) {
                    InterfaceAdaptationManager.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = InterfaceAdaptationManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        InterfaceAdaptationManager.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = InterfaceAdaptationManager.f(730276161277947L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    static Object x(InterfaceAdaptationManager interfaceAdaptationManager, Object object) {
        return interfaceAdaptationManager.X(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = InterfaceAdaptationManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public InterfaceAdaptationManager() {
        block12: {
            int n;
            int n2;
            int[] nArray;
            long l;
            block10: {
                block11: {
                    l = a ^ 0x24D0693C6096L;
                    int[] nArray2 = InterfaceAdaptationManager.w();
                    super(ReflectionMetadataResolver.VJ);
                    this.r = InterfaceAdaptationManager.c("\u00dc", (Object)this, (Object)InterfaceAdaptationManager.c("u", (int)InterfaceAdaptationManager.b("r", (int)4634, (long)(0x251CCC5F8249391FL ^ l)), (long)6729367674645632081L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.l, (Object)new Class[0], (long)6729209212714731427L, (long)l);
                    nArray = nArray2;
                    try {
                        try {
                            try {
                                n2 = GeometryCalculator.C();
                                n = GeometryCalculator.x;
                                if (nArray != null) break block10;
                                if (n2 < n) break block11;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw InterfaceAdaptationManager.a(customSystemException);
                            }
                            this.b = InterfaceAdaptationManager.c("\u00dc", (Object)this, (Object)ReflectionMetadataResolver.rx, (Object)InterfaceAdaptationManager.c("u", (int)InterfaceAdaptationManager.b("r", (int)172, (long)(0x553C80CC7142ABA5L ^ l)), (long)6729367674645632081L, (long)l), (boolean)true, Comparable.class, (Object)new Class[]{ReflectionMetadataResolver.Vh}, (long)6729258322956247897L, (long)l);
                            this.F = InterfaceAdaptationManager.c("\u00dc", (Object)this, (Object)InterfaceAdaptationManager.c("u", (int)InterfaceAdaptationManager.b("r", (int)25474, (long)(0x42C34BCA06B24882L ^ l)), (long)6729367674645632081L, (long)l), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6729209212714731427L, (long)l);
                            this.O = InterfaceAdaptationManager.c("\u00dc", (Object)this, (Object)InterfaceAdaptationManager.c("u", (int)InterfaceAdaptationManager.b("r", (int)8430, (long)(0x6744A2BFA2790BEDL ^ l)), (long)6729367674645632081L, (long)l), (boolean)true, Boolean.TYPE, (long)6729320699644171539L, (long)l);
                            this.q = InterfaceAdaptationManager.c("\u00dc", (Object)this, (Object)InterfaceAdaptationManager.c("u", (int)InterfaceAdaptationManager.b("r", (int)15300, (long)(0x77CAAAF603810C3L ^ l)), (long)6729367674645632081L, (long)l), (boolean)true, Boolean.TYPE, (long)6729320699644171539L, (long)l);
                            this.k = InterfaceAdaptationManager.c("\u00dc", (Object)this, (Object)InterfaceAdaptationManager.c("u", (int)InterfaceAdaptationManager.b("r", (int)7171, (long)(0x2B738459FC4DB702L ^ l)), (long)6729367674645632081L, (long)l), (boolean)true, Boolean.TYPE, (long)6729320699644171539L, (long)l);
                            if (nArray == null) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw InterfaceAdaptationManager.a(customSystemException);
                        }
                        AbstractComputationKernel.I(new String[4]);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw InterfaceAdaptationManager.a(customSystemException);
                    }
                }
                n2 = GeometryCalculator.C();
                n = 35;
            }
            try {
                block13: {
                    try {
                        if (n2 < n) break block13;
                        this.p = InterfaceAdaptationManager.c("\u00dc", (Object)this, (Object)ReflectionMetadataResolver.rx, (Object)InterfaceAdaptationManager.c("u", (int)InterfaceAdaptationManager.b("r", (int)24600, (long)(0x6CC53ED6FAAE4B1AL ^ l)), (long)6729367674645632081L, (long)l), (boolean)true, ImmutableMap.class, (long)6729456065731152599L, (long)l);
                        this.n = InterfaceAdaptationManager.c("\u00dc", (Object)this, (Object)ReflectionMetadataResolver.Q, (Object)InterfaceAdaptationManager.c("u", (int)InterfaceAdaptationManager.b("r", (int)718, (long)(0x1CD7D4010F729C8L ^ l)), (long)6729367674645632081L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Ff, (Object)new Class[0], (long)6729258322956247897L, (long)l);
                        if (nArray == null) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw InterfaceAdaptationManager.a(customSystemException);
                    }
                }
                this.s = InterfaceAdaptationManager.c("\u00dc", (Object)this, (Object)InterfaceAdaptationManager.c("u", (int)InterfaceAdaptationManager.b("r", (int)23730, (long)(0x1B70CFF1A77777B6L ^ l)), (long)6729367674645632081L, (long)l), (boolean)true, ImmutableMap.class, (Object)new Class[0], (long)6729209212714731427L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw InterfaceAdaptationManager.a(customSystemException);
            }
        }
    }

    public boolean w(Object object) {
        return this.k.R(object);
    }

    private static Method h(long l, long l2) {
        int n = InterfaceAdaptationManager.e(l, l2);
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
                clazz3 = InterfaceAdaptationManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = InterfaceAdaptationManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = InterfaceAdaptationManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        InterfaceAdaptationManager.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = InterfaceAdaptationManager.f(730276161277947L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = InterfaceAdaptationManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        InterfaceAdaptationManager.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = InterfaceAdaptationManager.f(730276161277947L, 0L);
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

    public boolean C(Object object) {
        return this.q.R(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = InterfaceAdaptationManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = InterfaceAdaptationManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = InterfaceAdaptationManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
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

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7661;
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
                throw new RuntimeException("a/vB", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            InterfaceAdaptationManager.d[n2] = n3;
        }
        return d[n2];
    }

    public static void K(int[] nArray) {
        Y = nArray;
    }

    public boolean I(Object object) {
        return this.O.R(object);
    }

    private Object X(Object object) {
        return this.n.T(object, new Object[0]);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = InterfaceAdaptationManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = InterfaceAdaptationManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public Object l(Object object) {
        return this.r.T(object, new Object[0]);
    }

    public static int[] w() {
        return Y;
    }

    public ImmutableMap e(Object object) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return (ImmutableMap)this.p.Z(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw InterfaceAdaptationManager.a(customSystemException);
        }
        return (ImmutableMap)this.s.T(object, new Object[0]);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "\u0018(;I";
        objectArray[1] = "e!P{\u000e\u0016n.A4s\u000e})H}";
        objectArray[2] = Boolean.TYPE;
        InterfaceAdaptationManager.g[2] = "java/lang/Boolean";
        objectArray[3] = "\u0016zr3u?\u001duc|\u0018?\u001dhw";
        objectArray[4] = "}k\u001c5]I\bK\u0017:L\u0006eK\u0017'X\u0013";
        objectArray[5] = "\u000f\u001fL&";
        objectArray[6] = "c?Lq!;\u0016\u001fG~0t{\u001fGc$a";
        objectArray[7] = "tJ\u0014";
        objectArray[8] = Integer.TYPE;
        InterfaceAdaptationManager.g[8] = "java/lang/Integer";
        objectArray[9] = "q\u007fO\u0015";
        objectArray[10] = "6 FqX>=/W>906$Sd";
        objectArray[11] = "4\u000bb%\u001a^bP!Oe0zVe&_^>_&O\u001bB|A`5\u001c^<X\u001du\u0013K9\u0007r#K@h:!/CP4V`$\u0012^\u0004\u0001o)SRg\u0006'(_0";
        objectArray[12] = "\\TyNfu\n\u000f:$\u0013\u001bVT}\u0019ct\u0000\fvH^e\u0000\u001doY0!\t^\u0006\u001d,c\u0017\u0018|\u001a0#\u000ee<\u0015%&Q\njM.wlYfE>+\u0000\u0018m\u00140\u001bW\u0017`U<xP_aY^";
        objectArray[13] = "\"b:u7\ft9y\u001fTbl?=vr\f(6~\u001f6\u0010j(8e1\f*1E%>\u0019/n*sf\u0012~S{{0\u0019#l9g?\\\u0012";
        objectArray[14] = "jk0}$\u001fhq<wT\u0018-\u001ad3$\u001a9w#ed\u0012Vd6t=\u000e8 ?7T";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "[_F@;u\r\u0004\u0005*R\u001bQ_B\u0017>t\u0007\u0007IF\u0003e\u0007\u0016PWm!\u000eU9\u0013qc\u0010\u0013C\u0014m#\tn\u0003\u001bx&V\u0001UCswkP]\u0015x*T\u0012A\u001a=\u001b";
    }

    private static int e(long l, long l2) {
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
                n3 = 26;
                break;
            }
            case 1: {
                n3 = 35;
                break;
            }
            case 2: {
                n3 = 48;
                break;
            }
            case 3: {
                n3 = 28;
                break;
            }
            case 4: {
                n3 = 43;
                break;
            }
            case 5: {
                n3 = 46;
                break;
            }
            case 6: {
                n3 = 32;
                break;
            }
            case 7: {
                n3 = 16;
                break;
            }
            case 8: {
                n3 = 52;
                break;
            }
            case 9: {
                n3 = 49;
                break;
            }
            case 10: {
                n3 = 40;
                break;
            }
            case 11: {
                n3 = 5;
                break;
            }
            case 12: {
                n3 = 57;
                break;
            }
            case 13: {
                n3 = 38;
                break;
            }
            case 14: {
                n3 = 20;
                break;
            }
            case 15: {
                n3 = 39;
                break;
            }
            case 16: {
                n3 = 14;
                break;
            }
            case 17: {
                n3 = 24;
                break;
            }
            case 18: {
                n3 = 56;
                break;
            }
            case 19: {
                n3 = 9;
                break;
            }
            case 20: {
                n3 = 1;
                break;
            }
            case 21: {
                n3 = 12;
                break;
            }
            case 22: {
                n3 = 60;
                break;
            }
            case 23: {
                n3 = 50;
                break;
            }
            case 24: {
                n3 = 4;
                break;
            }
            case 25: {
                n3 = 44;
                break;
            }
            case 26: {
                n3 = 51;
                break;
            }
            case 27: {
                n3 = 18;
                break;
            }
            case 28: {
                n3 = 37;
                break;
            }
            case 29: {
                n3 = 61;
                break;
            }
            case 30: {
                n3 = 27;
                break;
            }
            case 31: {
                n3 = 10;
                break;
            }
            case 32: {
                n3 = 55;
                break;
            }
            case 33: {
                n3 = 59;
                break;
            }
            case 34: {
                n3 = 42;
                break;
            }
            case 35: {
                n3 = 30;
                break;
            }
            case 36: {
                n3 = 54;
                break;
            }
            case 37: {
                n3 = 63;
                break;
            }
            case 38: {
                n3 = 41;
                break;
            }
            case 39: {
                n3 = 21;
                break;
            }
            case 40: {
                n3 = 45;
                break;
            }
            case 41: {
                n3 = 22;
                break;
            }
            case 42: {
                n3 = 13;
                break;
            }
            case 43: {
                n3 = 8;
                break;
            }
            case 44: {
                n3 = 23;
                break;
            }
            case 45: {
                n3 = 0;
                break;
            }
            case 46: {
                n3 = 3;
                break;
            }
            case 47: {
                n3 = 34;
                break;
            }
            case 48: {
                n3 = 36;
                break;
            }
            case 49: {
                n3 = 33;
                break;
            }
            case 50: {
                n3 = 29;
                break;
            }
            case 51: {
                n3 = 15;
                break;
            }
            case 52: {
                n3 = 62;
                break;
            }
            case 53: {
                n3 = 7;
                break;
            }
            case 54: {
                n3 = 58;
                break;
            }
            case 55: {
                n3 = 6;
                break;
            }
            case 56: {
                n3 = 11;
                break;
            }
            case 57: {
                n3 = 31;
                break;
            }
            case 58: {
                n3 = 25;
                break;
            }
            case 59: {
                n3 = 19;
                break;
            }
            case 60: {
                n3 = 47;
                break;
            }
            case 61: {
                n3 = 53;
                break;
            }
            case 62: {
                n3 = 2;
                break;
            }
            default: {
                n3 = 17;
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
        InterfaceAdaptationManager.g[n4] = new String(cArray);
        return n4;
    }

    public Object a(Object object, Object object2) {
        return this.b.T(object, object2);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                InterfaceAdaptationManager.a = MultiContainerRegistry.a(5906928902687591263L, 8823489252453994517L, MethodHandles.lookup().lookupClass()).a(29573944483676L);
                InterfaceAdaptationManager.f = new Object[16];
                InterfaceAdaptationManager.g = new String[16];
                InterfaceAdaptationManager.a();
                InterfaceAdaptationManager.e = new HashMap<K, V>(13);
                var0 = InterfaceAdaptationManager.a ^ 67060383512243L;
                InterfaceAdaptationManager.K(null);
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u008b\u008c\u00d1mmQ[f\u00c5\u00b1\u00be\u00c9S\u001fY\u00bf\u00e5\u00bc=\u00c6<\u0088\u0006\u00ad\u00e4\u0080\u00f4w\u0007\u00f4\u0006B<h\u00bf\u00f1\u0010;\u00be\u00e0\u00bbyx\u00c1\u0081)\u00be\u0080\u0082 \u0086[CE\u00a0\u00df";
                var7_6 = "\u008b\u008c\u00d1mmQ[f\u00c5\u00b1\u00be\u00c9S\u001fY\u00bf\u00e5\u00bc=\u00c6<\u0088\u0006\u00ad\u00e4\u0080\u00f4w\u0007\u00f4\u0006B<h\u00bf\u00f1\u0010;\u00be\u00e0\u00bbyx\u00c1\u0081)\u00be\u0080\u0082 \u0086[CE\u00a0\u00df".length();
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
                    var6_5 = "T\u0082\u00c2f0f\u0098\u00d4u\u00828-\u0087^\u00a7\u00c8";
                    var7_6 = "T\u0082\u00c2f0f\u0098\u00d4u\u00828-\u0087^\u00a7\u00c8".length();
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
        InterfaceAdaptationManager.c = var8_3;
        InterfaceAdaptationManager.d = new Integer[9];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00da' || c == 'O' || c == '\u00f2' || c == '\u00ee') {
                field = InterfaceAdaptationManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00da' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = InterfaceAdaptationManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'u' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(InterfaceAdaptationManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(InterfaceAdaptationManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

