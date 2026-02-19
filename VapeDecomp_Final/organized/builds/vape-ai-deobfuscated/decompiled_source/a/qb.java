/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import com.cache.distributed.DistributedCacheManager135;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.system.lifecycle.ObjectLifecycleTracker;
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

public class qb
extends CryptoProtocolEngine {
    private HK g;
    private static final Integer[] d;
    private ReflectionUtilityService r;
    private ReflectionUtilityService A;
    private static final long[] c;
    private static final Map e;
    private static final long a;
    private HK v;
    private HK h;
    private HK S;
    private HK b;
    private HK s;
    private HK f;
    private HK n;
    private static final Object[] i;
    private HK J;
    private static final String[] j;

    static void w(qb qb2, Object object, Object object2, Object object3, Object object4, int n, int n2) {
        qb2.e(object, object2, object3, object4, n, n2);
    }

    private void g(Object object, Object object2, Object object3, int n, int n2, int[] nArray, Object object4, Object object5, Object object6) {
        this.n.l(null, object, object2, object3, n, n2, nArray, object4, object5, object6);
    }

    private float C(Object object) {
        return this.A.x(object);
    }

    static void t(qb qb2, Object object, float f) {
        qb2.N(object, f);
    }

    private Object x(Object object, Object object2, Object object3, Object object4, int n) {
        return this.S.T(object, object2, object3, object4, n);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void D(qb qb2, Object object, float f) {
        qb2.B(object, f);
    }

    private void h(Object object, Object object2, Object object3, Object object4, int n, int n2) {
        this.J.l(object, object2, object3, object4, n, n2);
    }

    private Object s() {
        return this.f.T(null, new Object[0]);
    }

    static HK W(qb qb2) {
        return qb2.v;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void q(Object object, Object object2, int n, int n2) {
        this.g.l(object, object2, n, n2);
    }

    static void t(qb qb2, Object object, Object object2, int n, int n2) {
        qb2.q(object, object2, n, n2);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = qb.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = qb.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5487;
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
                throw new RuntimeException("a/qb", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            qb.d[n2] = n3;
        }
        return d[n2];
    }

    private void e(Object object, Object object2, Object object3, Object object4, int n, int n2) {
        this.b.l(object, object2, object3, object4, n, n2);
    }

    private void c(Object object, Object object2, Object object3, int n, int n2) {
        this.s.l(object, object2, object3, n, n2);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fd' || c == '\u00c4' || c == 'e' || c == '\u00f6') {
                field = qb.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fd' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = qb.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00da' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void N(Object object, float f) {
        this.r.H(object, f);
    }

    private static Method h(long l, long l2) {
        int n = qb.e(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = qb.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = qb.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = qb.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        qb.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = qb.f(782512926940105L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = qb.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        qb.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = qb.f(782512926940105L, 0L);
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

    static Object P(qb qb2, Object object, Object object2, Object object3, Object object4, int n) {
        return qb2.x(object, object2, object3, object4, n);
    }

    static void G(qb qb2, Object object, Object object2, Object object3, int n, int n2) {
        qb2.c(object, object2, object3, n, n2);
    }

    static HK l(qb qb2) {
        return qb2.f;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (j[n4] != null) {
            return n4;
        }
        Object object = i[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 20;
                break;
            }
            case 1: {
                n3 = 1;
                break;
            }
            case 2: {
                n3 = 18;
                break;
            }
            case 3: {
                n3 = 11;
                break;
            }
            case 4: {
                n3 = 6;
                break;
            }
            case 5: {
                n3 = 41;
                break;
            }
            case 6: {
                n3 = 0;
                break;
            }
            case 7: {
                n3 = 59;
                break;
            }
            case 8: {
                n3 = 39;
                break;
            }
            case 9: {
                n3 = 13;
                break;
            }
            case 10: {
                n3 = 45;
                break;
            }
            case 11: {
                n3 = 2;
                break;
            }
            case 12: {
                n3 = 38;
                break;
            }
            case 13: {
                n3 = 42;
                break;
            }
            case 14: {
                n3 = 56;
                break;
            }
            case 15: {
                n3 = 15;
                break;
            }
            case 16: {
                n3 = 52;
                break;
            }
            case 17: {
                n3 = 53;
                break;
            }
            case 18: {
                n3 = 35;
                break;
            }
            case 19: {
                n3 = 19;
                break;
            }
            case 20: {
                n3 = 34;
                break;
            }
            case 21: {
                n3 = 58;
                break;
            }
            case 22: {
                n3 = 46;
                break;
            }
            case 23: {
                n3 = 50;
                break;
            }
            case 24: {
                n3 = 22;
                break;
            }
            case 25: {
                n3 = 48;
                break;
            }
            case 26: {
                n3 = 21;
                break;
            }
            case 27: {
                n3 = 5;
                break;
            }
            case 28: {
                n3 = 26;
                break;
            }
            case 29: {
                n3 = 49;
                break;
            }
            case 30: {
                n3 = 14;
                break;
            }
            case 31: {
                n3 = 37;
                break;
            }
            case 32: {
                n3 = 43;
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
                n3 = 51;
                break;
            }
            case 36: {
                n3 = 61;
                break;
            }
            case 37: {
                n3 = 55;
                break;
            }
            case 38: {
                n3 = 47;
                break;
            }
            case 39: {
                n3 = 40;
                break;
            }
            case 40: {
                n3 = 17;
                break;
            }
            case 41: {
                n3 = 30;
                break;
            }
            case 42: {
                n3 = 16;
                break;
            }
            case 43: {
                n3 = 57;
                break;
            }
            case 44: {
                n3 = 32;
                break;
            }
            case 45: {
                n3 = 25;
                break;
            }
            case 46: {
                n3 = 33;
                break;
            }
            case 47: {
                n3 = 31;
                break;
            }
            case 48: {
                n3 = 10;
                break;
            }
            case 49: {
                n3 = 27;
                break;
            }
            case 50: {
                n3 = 54;
                break;
            }
            case 51: {
                n3 = 60;
                break;
            }
            case 52: {
                n3 = 3;
                break;
            }
            case 53: {
                n3 = 8;
                break;
            }
            case 54: {
                n3 = 44;
                break;
            }
            case 55: {
                n3 = 28;
                break;
            }
            case 56: {
                n3 = 9;
                break;
            }
            case 57: {
                n3 = 12;
                break;
            }
            case 58: {
                n3 = 36;
                break;
            }
            case 59: {
                n3 = 29;
                break;
            }
            case 60: {
                n3 = 24;
                break;
            }
            case 61: {
                n3 = 23;
                break;
            }
            case 62: {
                n3 = 63;
                break;
            }
            default: {
                n3 = 7;
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
        qb.j[n4] = new String(cArray);
        return n4;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = qb.e(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                qb.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = qb.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
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

    static void i(qb qb2, Object object, Object object2, Object object3, boolean bl, Object object4, Object object5, int n, int n2, Object object6) {
        qb2.G(object, object2, object3, bl, object4, object5, n, n2, object6);
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "Vy\u0014\u000e";
        objectArray[1] = "q[tF|.zTe\t\u00016iSl@";
        objectArray[2] = Boolean.TYPE;
        qb.j[2] = "java/lang/Boolean";
        objectArray[3] = "\u0000\u0017GEIO\u000b\u0018V\n$O\u000b\u0005B";
        objectArray[4] = "J(_C<.?\bTL-aR\bTQ9t";
        objectArray[5] = "\u0007V\u000f~";
        objectArray[6] = "e\u001fa;c\u0013\u0010?j4r\\}?j)fI";
        objectArray[7] = "-po";
        objectArray[8] = Integer.TYPE;
        qb.j[8] = "java/lang/Integer";
        objectArray[9] = "(\\Lu";
        objectArray[10] = "^U\u000bp]~+u\u0000\u007fL1Fu\u0000bX$";
        objectArray[11] = "1\u0015;q2B:\u001a*>SL1\u0011.d";
        objectArray[12] = "JEC\u001b8=[\u0017Ab\u0018\u0002QW\r\\'gFL[bfoJ\u0010\u0006\u0001\"s\u0010P<X`p\u001d\u001d\f\u00039<G,\u0003X$}\u001fI_\u000e?\u007f!\u0017E\b?|AG\u0006^!\u0002";
        objectArray[13] = "A\u000e\u0011N%qP\\\u00137\u000fN\u0010X\u001c\u000bs~K\u0001PQB>QVPO')J\u0000n\u000e/%\u0016]\rJ3\u007fVgT\b0r\u001bW\u000fQ|(*XTL=pO\u0004\u0002W?N\u0011\u001e\u0004W<.A]RIB";
        objectArray[14] = "n\u0014R$z`\u007fFP]F_u\u0006\u001cce:b\u001dJ]$2nA\u0017>`.4\u0001-g\"-9L\u001d<{ac}\u00137yo\u007f\u0017T!x%\u0005";
        objectArray[15] = "\u0006I\\n6R\u0017\u001b^\u0017\fm\u001d[\u0012))\b\n@D\u0017h\u0000\u0006\u001c\u0019t,\u001c\\\\#-n\u001fQ\u0011\u0013v7S\u000b \u001c-*\u0012SE@{1\u0010m\u001bZ}1\u0013\rK\u0019+/m";
        Object[] objectArray2 = objectArray;
        objectArray[16] = "l\b0yho(G'\u007f\u0005t*6u#zq7O:si{QF0/;g4Q+y\u0005";
    }

    static float I(qb qb2, Object object) {
        return qb2.C(object);
    }

    static Object z(qb qb2) {
        return qb2.s();
    }

    public qb() {
        long l;
        block21: {
            int n;
            int n2;
            int[] nArray;
            block17: {
                block18: {
                    block19: {
                        block20: {
                            l = a ^ 0x4B97EDE04155L;
                            int[] nArray2 = DistributedCacheManager135.s();
                            super(ReflectionMetadataResolver.Vp);
                            nArray = nArray2;
                            try {
                                try {
                                    try {
                                        try {
                                            n2 = GeometryCalculator.C();
                                            n = 13;
                                            if (nArray != null) break block17;
                                            if (n2 != n) break block18;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw qb.a(customSystemException);
                                        }
                                        this.v = qb.c("\u00c5", (Object)this, (Object)qb.c("\u00da", (int)qb.b("l", (int)19366, (long)(0x6F7F9D6A28FCDD9AL ^ l)), (long)4809565008899638691L, (long)l), (boolean)false, Void.TYPE, (Object)new Class[0], (long)4807647215493071375L, (long)l);
                                        if (nArray != null) break block19;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw qb.a(customSystemException);
                                    }
                                    if (ObjectLifecycleTracker.U.r()) break block20;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw qb.a(customSystemException);
                                }
                                this.f = qb.c("\u00c5", (Object)this, (Object)qb.c("\u00da", (int)qb.b("l", (int)5082, (long)(0x45EC824DC17505E1L ^ l)), (long)4809565008899638691L, (long)l), (boolean)false, (Object)ReflectionMetadataResolver.Vp, (Object)new Class[0], (long)4807861824851851846L, (long)l);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw qb.a(customSystemException);
                            }
                        }
                        this.J = qb.c("\u00c5", (Object)this, (Object)qb.c("\u00da", (int)qb.b("l", (int)8455, (long)(0x5F781DAE4F853733L ^ l)), (long)4809565008899638691L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.ts, ReflectionMetadataResolver.Em, ReflectionMetadataResolver.Vl, Integer.TYPE, Integer.TYPE}, (long)4807647215493071375L, (long)l);
                        this.b = qb.c("\u00c5", (Object)this, (Object)qb.c("\u00da", (int)qb.b("l", (int)8378, (long)(0x2B9C63512A7F3683L ^ l)), (long)4809565008899638691L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.ts, ReflectionMetadataResolver.Em, ReflectionMetadataResolver.Vl, Integer.TYPE, Integer.TYPE}, (long)4807647215493071375L, (long)l);
                    }
                    try {
                        if (nArray == null) break block21;
                        AbstractComputationKernel.I(new String[2]);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw qb.a(customSystemException);
                    }
                }
                n2 = GeometryCalculator.C();
                n = 50;
            }
            try {
                block22: {
                    try {
                        if (n2 < n) break block22;
                        this.g = qb.c("\u00c5", (Object)this, (Object)ReflectionMetadataResolver.F0, (Object)qb.c("\u00da", (int)qb.b("l", (int)20218, (long)(0x1ADC3D988988D8C7L ^ l)), (long)4809565008899638691L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Vl, Integer.TYPE, Integer.TYPE}, (long)4807709184850683248L, (long)l);
                        this.s = qb.c("\u00c5", (Object)this, (Object)ReflectionMetadataResolver.F0, (Object)qb.c("\u00da", (int)qb.b("l", (int)29072, (long)(0x4F7B3BBF41AB67AAL ^ l)), (long)4809565008899638691L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.ts, ReflectionMetadataResolver.Vl, Integer.TYPE, Integer.TYPE}, (long)4807709184850683248L, (long)l);
                        if (nArray == null) break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw qb.a(customSystemException);
                    }
                }
                this.g = qb.c("\u00c5", (Object)this, (Object)qb.c("\u00da", (int)qb.b("l", (int)22233, (long)(0x38ED7F458F5340E7L ^ l)), (long)4809565008899638691L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Vl, Integer.TYPE, Integer.TYPE}, (long)4807647215493071375L, (long)l);
                this.s = qb.c("\u00c5", (Object)this, (Object)qb.c("\u00da", (int)qb.b("l", (int)8979, (long)(0x5FDAF892D174352BL ^ l)), (long)4809565008899638691L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.ts, ReflectionMetadataResolver.Vl, Integer.TYPE, Integer.TYPE}, (long)4807647215493071375L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw qb.a(customSystemException);
            }
        }
        try {
            if (GameVersionEnumerator.MC_1_20_6.Q()) {
                this.r = qb.c("\u00c5", (Object)this, (Object)qb.c("\u00da", (int)qb.b("l", (int)23993, (long)(0x7B7CCFEB1A344B86L ^ l)), (long)4809565008899638691L, (long)l), (boolean)true, Float.TYPE, (long)4807797480874072269L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw qb.a(customSystemException);
        }
    }

    static void V(qb qb2, Object object, Object object2, Object object3, Object object4, int n, int n2) {
        qb2.h(object, object2, object3, object4, n, n2);
    }

    private float w(Object object) {
        return this.r.x(object);
    }

    private void G(Object object, Object object2, Object object3, boolean bl, Object object4, Object object5, int n, int n2, Object object6) {
        this.h.l(object, object2, object3, bl, object4, object5, n, n2, object6);
    }

    private static Field g(long l, long l2) {
        int n = qb.e(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = qb.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = qb.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = qb.c(clazz3, string2, clazz2)) != null) {
                    qb.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = qb.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        qb.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = qb.f(782512926940105L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                qb.a = MultiContainerRegistry.a(5964535205844862793L, -7643446517010510338L, MethodHandles.lookup().lookupClass()).a(51722031200431L);
                qb.i = new Object[17];
                qb.j = new String[17];
                qb.a();
                qb.e = new HashMap<K, V>(13);
                var0 = qb.a ^ 132092999783122L;
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
                var6_5 = "\u00d5k\u00cd\u00a5O\u00cf\u0014\u00c7A\u00e3\u00f94\u00b7\u00d5L\u00ea\u0016\u00147\b3\u00cb\u00d1w\u0004 \u00af\u0006\u008e&\u00d8\u00da\u0093!\u00c5\u00fa\u0082\u00d0}7E\u00ff\u00c4|?\u00cf\u00a9\u009d\u00a0\u00e7Qf\u00d3\u00df\u001cF";
                var7_6 = "\u00d5k\u00cd\u00a5O\u00cf\u0014\u00c7A\u00e3\u00f94\u00b7\u00d5L\u00ea\u0016\u00147\b3\u00cb\u00d1w\u0004 \u00af\u0006\u008e&\u00d8\u00da\u0093!\u00c5\u00fa\u0082\u00d0}7E\u00ff\u00c4|?\u00cf\u00a9\u009d\u00a0\u00e7Qf\u00d3\u00df\u001cF".length();
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
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00ccjO#\u00d6\u00ea\u00a2\u00de{'o\u009e\u00b6\u00b55\u00b0";
                    var7_6 = "\u00ccjO#\u00d6\u00ea\u00a2\u00de{'o\u009e\u00b6\u00b55\u00b0".length();
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
lbl42:
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
lbl55:
                // 1 sources

                ** continue;
            }
        }
        qb.c = var8_3;
        qb.d = new Integer[9];
    }

    private void B(Object object, float f) {
        this.A.H(object, f);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = qb.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = qb.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static float R(qb qb2, Object object) {
        return qb2.w(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = qb.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(qb.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(qb.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

