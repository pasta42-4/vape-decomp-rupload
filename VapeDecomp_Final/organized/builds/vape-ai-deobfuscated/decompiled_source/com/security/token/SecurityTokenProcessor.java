/*
 * Decompiled with CFR 0.152.
 */
package com.security.token;

import a.HK;
import a._c;
import com.app.entity.movement.EntityMovementController;
import com.collections.management.MultiContainerRegistry;
import com.core.exception.CustomRuntimeException;
import com.error.handling.ContextualExceptionHandler;
import com.event.propagation.EventPropagationDispatcher;
import com.event.propagation.EventPropagationHandler;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.security.crypto.CryptographicKeyExchanger;
import com.security.crypto.EncryptionTransformer;
import com.temporal.metadata.TemporalMetadataResolver;
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

public class SecurityTokenProcessor
extends EncryptionTransformer {
    private String s;
    private String L;
    private static final Object[] k;
    private static final String[] o;
    private String l;
    private String N;
    private HK A = null;
    private static final Integer[] i;
    private static final long[] g;
    private String r;
    private MetaclassDefinitionRegistry e;
    private static final long a;
    private static final Map j;

    private static void c() {
        Object[] objectArray = k;
        k[0] = "\u00183v";
        objectArray[1] = Integer.TYPE;
        SecurityTokenProcessor.o[1] = "java/lang/Integer";
        objectArray[2] = "y{(dd\u001brt9+\u0019\u0003as0b";
        objectArray[3] = "Omc%0wDbrj]wD\u007ff";
        objectArray[4] = "Sc\tN\u0002OXl\u0018\u0001cASg\u001c[";
        objectArray[5] = "O7B\n-^H;\u0017fsN*2R\u0019|^\u001anD\u0018%%\u0010fF\rwEDgR\u0000\u001c";
        Object[] objectArray2 = objectArray;
        objectArray[6] = "+H'3Y\u0006,Dr_\u0003\u0006NM!6\u0013M7\u0012po\u0004}w\u000b7?\u0013M+\u001d6fh";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/XI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public SecurityTokenProcessor(Class clazz) {
        super(clazz);
    }

    private void P() throws ContextualExceptionHandler, CustomRuntimeException {
        boolean bl;
        _c _c2;
        String string;
        String string2;
        block9: {
            block8: {
                String string3;
                long l = a ^ 0x4C56439BA3EAL;
                try {
                    this.A = TemporalMetadataResolver.h.u().kx.j;
                    this.s = TemporalMetadataResolver.h.u().GV.B.X();
                    this.r = TemporalMetadataResolver.h.u().GV.B.K();
                    string3 = GeometryCalculator.C() >= 35 ? TemporalMetadataResolver.h.u().ku.NL.B() : null;
                }
                catch (ContextualExceptionHandler contextualExceptionHandler) {
                    throw SecurityTokenProcessor.a(contextualExceptionHandler);
                }
                string2 = string3;
                this.L = TemporalMetadataResolver.h.u().ku.R.X();
                this.l = TemporalMetadataResolver.h.u().ku.t.X();
                this.N = TemporalMetadataResolver.h.u().ku.T.X();
                this.e = this.Q(ReflectionMetadataResolver.bU);
                string = EntityMovementController.class.getName();
                _c2 = this.w(this.A);
                this.O(this.A, EventPropagationDispatcher.class, (String)((Object)SecurityTokenProcessor.d("\u00eb", (int)SecurityTokenProcessor.b("e", (int)20408, (long)(0x407557B70EF58B2BL ^ l)), (long)-4145315733574618627L, (long)l)));
                this.w(this.A, EventPropagationHandler.class, (String)((Object)SecurityTokenProcessor.d("\u00eb", (int)SecurityTokenProcessor.b("e", (int)16097, (long)(0x39A4AD5D39697A73L ^ l)), (long)-4145315733574618627L, (long)l)));
                bl = TemporalMetadataResolver.h.r();
                try {
                    try {
                        try {
                            if (bl && SecurityTokenProcessor.d("\u00eb", (Object)SecurityTokenProcessor.d("\u00eb", (int)SecurityTokenProcessor.b("e", (int)777, (long)(0x4AAA56E78778C799L ^ l)), (long)-4145315733574618627L, (long)l), (long)-4145516395853541943L, (long)l) == null) break block8;
                        }
                        catch (ContextualExceptionHandler contextualExceptionHandler) {
                            throw SecurityTokenProcessor.a(contextualExceptionHandler);
                        }
                        if (GeometryCalculator.C() != 13) break block9;
                    }
                    catch (ContextualExceptionHandler contextualExceptionHandler) {
                        throw SecurityTokenProcessor.a(contextualExceptionHandler);
                    }
                    if (!TemporalMetadataResolver.h.d()) break block9;
                }
                catch (ContextualExceptionHandler contextualExceptionHandler) {
                    throw SecurityTokenProcessor.a(contextualExceptionHandler);
                }
            }
            bl = false;
        }
        boolean bl2 = bl;
        MetaclassDefinitionRegistry metaclassDefinitionRegistry = this.Q(ReflectionMetadataResolver.PE);
        _c2.x(new CryptographicKeyExchanger(this, string2, string, bl2, metaclassDefinitionRegistry));
    }

    static String b(SecurityTokenProcessor securityTokenProcessor) {
        return securityTokenProcessor.N;
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

    private static Method h(long l, long l2) {
        int n = SecurityTokenProcessor.e(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = o[n];
                int n3 = string2.indexOf(8);
                clazz3 = SecurityTokenProcessor.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SecurityTokenProcessor.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SecurityTokenProcessor.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        SecurityTokenProcessor.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SecurityTokenProcessor.f(294065515606232L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SecurityTokenProcessor.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SecurityTokenProcessor.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SecurityTokenProcessor.f(294065515606232L, 0L);
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

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SecurityTokenProcessor.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SecurityTokenProcessor.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SecurityTokenProcessor.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'r' || c == '\u00f5' || c == 'U' || c == '\u00fb') {
                field = SecurityTokenProcessor.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'r' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'U' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SecurityTokenProcessor.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00eb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static ContextualExceptionHandler a(ContextualExceptionHandler contextualExceptionHandler) {
        return contextualExceptionHandler;
    }

    private Object lambda$create$0() throws ContextualExceptionHandler, CustomRuntimeException {
        this.P();
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(494634659346006143L, -8493463307636761179L, MethodHandles.lookup().lookupClass()).a(72040927049073L);
        k = new Object[7];
        o = new String[7];
        SecurityTokenProcessor.c();
        j = new HashMap(13);
        long l = a ^ 0x29BE9AA62AAAL;
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
        String string = "\u00f2\u0093\u001f\\Z\u00fa]\u0017\u00fd\u00c1\u0089V\u00f0\u0014\u00009\u008aa\u00cc\u00e2H;\u0007\u00b8";
        int n2 = "\u00f2\u0093\u001f\\Z\u00fa]\u0017\u00fd\u00c1\u0089V\u00f0\u0014\u00009\u008aa\u00cc\u00e2H;\u0007\u00b8".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        g = lArray;
        i = new Integer[3];
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SecurityTokenProcessor.e(l, l2);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                SecurityTokenProcessor.k[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void y() {
        this.t(this::lambda$create$0);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = SecurityTokenProcessor.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SecurityTokenProcessor.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static String I(SecurityTokenProcessor securityTokenProcessor) {
        return securityTokenProcessor.l;
    }

    static String j(SecurityTokenProcessor securityTokenProcessor) {
        return securityTokenProcessor.L;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (o[n4] != null) {
            return n4;
        }
        Object object = k[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 27;
                break;
            }
            case 1: {
                n3 = 11;
                break;
            }
            case 2: {
                n3 = 53;
                break;
            }
            case 3: {
                n3 = 26;
                break;
            }
            case 4: {
                n3 = 52;
                break;
            }
            case 5: {
                n3 = 10;
                break;
            }
            case 6: {
                n3 = 54;
                break;
            }
            case 7: {
                n3 = 63;
                break;
            }
            case 8: {
                n3 = 62;
                break;
            }
            case 9: {
                n3 = 33;
                break;
            }
            case 10: {
                n3 = 1;
                break;
            }
            case 11: {
                n3 = 49;
                break;
            }
            case 12: {
                n3 = 9;
                break;
            }
            case 13: {
                n3 = 4;
                break;
            }
            case 14: {
                n3 = 31;
                break;
            }
            case 15: {
                n3 = 39;
                break;
            }
            case 16: {
                n3 = 16;
                break;
            }
            case 17: {
                n3 = 13;
                break;
            }
            case 18: {
                n3 = 42;
                break;
            }
            case 19: {
                n3 = 2;
                break;
            }
            case 20: {
                n3 = 8;
                break;
            }
            case 21: {
                n3 = 38;
                break;
            }
            case 22: {
                n3 = 45;
                break;
            }
            case 23: {
                n3 = 30;
                break;
            }
            case 24: {
                n3 = 48;
                break;
            }
            case 25: {
                n3 = 47;
                break;
            }
            case 26: {
                n3 = 3;
                break;
            }
            case 27: {
                n3 = 36;
                break;
            }
            case 28: {
                n3 = 41;
                break;
            }
            case 29: {
                n3 = 14;
                break;
            }
            case 30: {
                n3 = 18;
                break;
            }
            case 31: {
                n3 = 51;
                break;
            }
            case 32: {
                n3 = 56;
                break;
            }
            case 33: {
                n3 = 23;
                break;
            }
            case 34: {
                n3 = 17;
                break;
            }
            case 35: {
                n3 = 55;
                break;
            }
            case 36: {
                n3 = 7;
                break;
            }
            case 37: {
                n3 = 57;
                break;
            }
            case 38: {
                n3 = 50;
                break;
            }
            case 39: {
                n3 = 40;
                break;
            }
            case 40: {
                n3 = 15;
                break;
            }
            case 41: {
                n3 = 5;
                break;
            }
            case 42: {
                n3 = 46;
                break;
            }
            case 43: {
                n3 = 34;
                break;
            }
            case 44: {
                n3 = 6;
                break;
            }
            case 45: {
                n3 = 37;
                break;
            }
            case 46: {
                n3 = 59;
                break;
            }
            case 47: {
                n3 = 35;
                break;
            }
            case 48: {
                n3 = 25;
                break;
            }
            case 49: {
                n3 = 0;
                break;
            }
            case 50: {
                n3 = 22;
                break;
            }
            case 51: {
                n3 = 28;
                break;
            }
            case 52: {
                n3 = 21;
                break;
            }
            case 53: {
                n3 = 29;
                break;
            }
            case 54: {
                n3 = 61;
                break;
            }
            case 55: {
                n3 = 12;
                break;
            }
            case 56: {
                n3 = 44;
                break;
            }
            case 57: {
                n3 = 60;
                break;
            }
            case 58: {
                n3 = 24;
                break;
            }
            case 59: {
                n3 = 19;
                break;
            }
            case 60: {
                n3 = 58;
                break;
            }
            case 61: {
                n3 = 20;
                break;
            }
            case 62: {
                n3 = 43;
                break;
            }
            default: {
                n3 = 32;
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
        SecurityTokenProcessor.o[n4] = new String(cArray);
        return n4;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SecurityTokenProcessor.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2EB;
        if (i[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/XI", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SecurityTokenProcessor.i[n2] = n3;
        }
        return i[n2];
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/XI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l, long l2) {
        int n = SecurityTokenProcessor.e(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = SecurityTokenProcessor.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SecurityTokenProcessor.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SecurityTokenProcessor.c(clazz3, string2, clazz2)) != null) {
                    SecurityTokenProcessor.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SecurityTokenProcessor.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SecurityTokenProcessor.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SecurityTokenProcessor.f(294065515606232L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecurityTokenProcessor.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(SecurityTokenProcessor.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

