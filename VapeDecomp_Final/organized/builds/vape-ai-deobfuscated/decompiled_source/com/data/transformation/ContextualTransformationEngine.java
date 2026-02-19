/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.config.resolution.ConfigurationContextResolver;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.core.NetworkProtocolManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.reflection.util.ContextualReflectionUtility;
import com.runtime.reflection.ReflectionUtilityService;
import com.state.management.StatefulEventToggle;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.AbstractList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ContextualTransformationEngine
extends CryptoProtocolEngine {
    private static final long[] b;
    private ReflectionUtilityService o;
    private static final Integer[] c;
    private static final long a;
    private final HK e;
    private static final Map d;
    private final ReflectionUtilityService X;
    private static final String[] g;
    private final ReflectionUtilityService Y;
    private static final Object[] f;
    private HK z;

    private Object[] L(Object object) {
        return this.o.t(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ContextualTransformationEngine.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
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
                n3 = 0;
                break;
            }
            case 1: {
                n3 = 23;
                break;
            }
            case 2: {
                n3 = 57;
                break;
            }
            case 3: {
                n3 = 55;
                break;
            }
            case 4: {
                n3 = 36;
                break;
            }
            case 5: {
                n3 = 40;
                break;
            }
            case 6: {
                n3 = 29;
                break;
            }
            case 7: {
                n3 = 56;
                break;
            }
            case 8: {
                n3 = 2;
                break;
            }
            case 9: {
                n3 = 52;
                break;
            }
            case 10: {
                n3 = 43;
                break;
            }
            case 11: {
                n3 = 10;
                break;
            }
            case 12: {
                n3 = 7;
                break;
            }
            case 13: {
                n3 = 26;
                break;
            }
            case 14: {
                n3 = 44;
                break;
            }
            case 15: {
                n3 = 8;
                break;
            }
            case 16: {
                n3 = 50;
                break;
            }
            case 17: {
                n3 = 41;
                break;
            }
            case 18: {
                n3 = 63;
                break;
            }
            case 19: {
                n3 = 61;
                break;
            }
            case 20: {
                n3 = 34;
                break;
            }
            case 21: {
                n3 = 51;
                break;
            }
            case 22: {
                n3 = 46;
                break;
            }
            case 23: {
                n3 = 32;
                break;
            }
            case 24: {
                n3 = 24;
                break;
            }
            case 25: {
                n3 = 33;
                break;
            }
            case 26: {
                n3 = 3;
                break;
            }
            case 27: {
                n3 = 39;
                break;
            }
            case 28: {
                n3 = 53;
                break;
            }
            case 29: {
                n3 = 49;
                break;
            }
            case 30: {
                n3 = 31;
                break;
            }
            case 31: {
                n3 = 15;
                break;
            }
            case 32: {
                n3 = 14;
                break;
            }
            case 33: {
                n3 = 30;
                break;
            }
            case 34: {
                n3 = 1;
                break;
            }
            case 35: {
                n3 = 38;
                break;
            }
            case 36: {
                n3 = 13;
                break;
            }
            case 37: {
                n3 = 35;
                break;
            }
            case 38: {
                n3 = 47;
                break;
            }
            case 39: {
                n3 = 16;
                break;
            }
            case 40: {
                n3 = 37;
                break;
            }
            case 41: {
                n3 = 4;
                break;
            }
            case 42: {
                n3 = 11;
                break;
            }
            case 43: {
                n3 = 60;
                break;
            }
            case 44: {
                n3 = 28;
                break;
            }
            case 45: {
                n3 = 18;
                break;
            }
            case 46: {
                n3 = 42;
                break;
            }
            case 47: {
                n3 = 62;
                break;
            }
            case 48: {
                n3 = 58;
                break;
            }
            case 49: {
                n3 = 48;
                break;
            }
            case 50: {
                n3 = 54;
                break;
            }
            case 51: {
                n3 = 27;
                break;
            }
            case 52: {
                n3 = 21;
                break;
            }
            case 53: {
                n3 = 22;
                break;
            }
            case 54: {
                n3 = 45;
                break;
            }
            case 55: {
                n3 = 12;
                break;
            }
            case 56: {
                n3 = 6;
                break;
            }
            case 57: {
                n3 = 17;
                break;
            }
            case 58: {
                n3 = 5;
                break;
            }
            case 59: {
                n3 = 19;
                break;
            }
            case 60: {
                n3 = 59;
                break;
            }
            case 61: {
                n3 = 20;
                break;
            }
            case 62: {
                n3 = 9;
                break;
            }
            default: {
                n3 = 25;
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
        ContextualTransformationEngine.g[n4] = new String(cArray);
        return n4;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ContextualTransformationEngine.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ContextualTransformationEngine.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7B33;
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
                throw new RuntimeException("a/Ur", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ContextualTransformationEngine.c[n2] = n3;
        }
        return c[n2];
    }

    public void M(Object object, int n) {
        this.X.t(object, n);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'g' || c == 'l' || c == '\u00d3' || c == 'S') {
                field = ContextualTransformationEngine.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'g' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'l' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ContextualTransformationEngine.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'J' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    public int V(Object object) {
        return this.X.R(object);
    }

    private static Field g(long l, long l2) {
        int n = ContextualTransformationEngine.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = ContextualTransformationEngine.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ContextualTransformationEngine.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ContextualTransformationEngine.c(clazz3, string2, clazz2)) != null) {
                    ContextualTransformationEngine.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ContextualTransformationEngine.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ContextualTransformationEngine.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ContextualTransformationEngine.f(817923048453015L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public Object E(Object object, int n) {
        return this.e.T(object, n);
    }

    static Object[] y(ContextualTransformationEngine contextualTransformationEngine, Object object) {
        return contextualTransformationEngine.L(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ContextualTransformationEngine.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public AbstractList H(Object object) {
        return (AbstractList)this.Y.Z(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ContextualTransformationEngine.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ContextualTransformationEngine.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = ContextualTransformationEngine.e(l, l2);
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
                clazz3 = ContextualTransformationEngine.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ContextualTransformationEngine.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ContextualTransformationEngine.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ContextualTransformationEngine.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ContextualTransformationEngine.f(817923048453015L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ContextualTransformationEngine.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ContextualTransformationEngine.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ContextualTransformationEngine.f(817923048453015L, 0L);
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

    public ContextualTransformationEngine() {
        block19: {
            Object object;
            block18: {
                ContextualTransformationEngine contextualTransformationEngine;
                boolean bl;
                long l;
                block16: {
                    int[] nArray;
                    block17: {
                        block14: {
                            l = a ^ 0xB5E9A3BB486L;
                            int[] nArray2 = ConfigurationContextResolver.n();
                            super(ReflectionMetadataResolver.Fo);
                            this.X = ContextualTransformationEngine.c("\u00e4", (Object)this, (Object)ContextualTransformationEngine.c("J", (int)ContextualTransformationEngine.b("b", (int)30870, (long)(0x697BE7DC0A414189L ^ l)), (long)4769268389111556627L, (long)l), (boolean)true, Integer.TYPE, (long)4769082478783210276L, (long)l);
                            nArray = nArray2;
                            try {
                                block15: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (nArray != null) break block14;
                                                    if (GeometryCalculator.C() < 23) break block15;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ContextualTransformationEngine.a(customSystemException);
                                                }
                                                this.Y = ContextualTransformationEngine.c("\u00e4", (Object)this, (Object)ContextualTransformationEngine.c("J", (int)ContextualTransformationEngine.b("b", (int)12000, (long)(0x565E80A41FCB17FEL ^ l)), (long)4769268389111556627L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.VB, (long)4769082478783210276L, (long)l);
                                                bl = GameVersionEnumerator.MC_1_21_6.Q();
                                                if (nArray != null) break block16;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ContextualTransformationEngine.a(customSystemException);
                                            }
                                            if (!bl) break block17;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ContextualTransformationEngine.a(customSystemException);
                                        }
                                        this.o = ContextualTransformationEngine.c("\u00e4", (Object)this, (Object)ContextualTransformationEngine.c("J", (int)ContextualTransformationEngine.b("b", (int)6474, (long)(0x14EE94762979A053L ^ l)), (long)4769268389111556627L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.VB, (long)4769082478783210276L, (long)l);
                                        if (nArray == null) break block17;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ContextualTransformationEngine.a(customSystemException);
                                    }
                                }
                                this.Y = ContextualTransformationEngine.c("\u00e4", (Object)this, (Object)ContextualTransformationEngine.c("J", (int)ContextualTransformationEngine.b("b", (int)3997, (long)(0x3E121656EAB5B685L ^ l)), (long)4769268389111556627L, (long)l), (boolean)true, ContextualReflectionUtility.S(ReflectionMetadataResolver.Vl), (long)4769082478783210276L, (long)l);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ContextualTransformationEngine.a(customSystemException);
                            }
                        }
                        this.o = ContextualTransformationEngine.c("\u00e4", (Object)this, (Object)ContextualTransformationEngine.c("J", (int)ContextualTransformationEngine.b("b", (int)1276, (long)(0x188E813AF41BDE1L ^ l)), (long)4769268389111556627L, (long)l), (boolean)true, ContextualReflectionUtility.S(ReflectionMetadataResolver.Vl), (long)4769082478783210276L, (long)l);
                    }
                    try {
                        contextualTransformationEngine = this;
                        object = ((StatefulEventToggle)((StatefulEventToggle)((NetworkProtocolManager)((Object)ContextualTransformationEngine.c("\u00e4", (Object)this, (Object)ContextualTransformationEngine.c("J", (int)ContextualTransformationEngine.b("b", (int)30588, (long)(0x95E61698AD0CE66L ^ l)), (long)4769268389111556627L, (long)l), (Object)ReflectionMetadataResolver.Vl, (Object)new Class[]{Integer.TYPE}, (long)4769223606527098097L, (long)l))).e(GameVersionEnumerator.MC_1_16_5.R(), (String)((Object)ContextualTransformationEngine.c("J", (int)ContextualTransformationEngine.b("b", (int)16367, (long)(0x64816F58484D06F4L ^ l)), (long)4769268389111556627L, (long)l)))).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.Uw)).M();
                        if (nArray != null) break block18;
                        contextualTransformationEngine.e = object;
                        bl = GameVersionEnumerator.MC_1_20_6.Q();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextualTransformationEngine.a(customSystemException);
                    }
                }
                try {
                    if (!bl) break block19;
                    contextualTransformationEngine = this;
                    object = ContextualTransformationEngine.c("\u00e4", (Object)this, (Object)ContextualTransformationEngine.c("J", (int)ContextualTransformationEngine.b("b", (int)21793, (long)(0x270075A9C656EC3DL ^ l)), (long)4769268389111556627L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Vl, (Object)new Class[0], (long)4769164737660489871L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualTransformationEngine.a(customSystemException);
                }
            }
            contextualTransformationEngine.z = object;
        }
    }

    static AbstractList Q(ContextualTransformationEngine contextualTransformationEngine, Object object) {
        return contextualTransformationEngine.E(object);
    }

    public Object[] v(Object object) {
        return this.Y.t(object);
    }

    static Object b(ContextualTransformationEngine contextualTransformationEngine, Object object) {
        return contextualTransformationEngine.J(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ContextualTransformationEngine.a = MultiContainerRegistry.a(8052342733096289339L, 4219204378846694268L, MethodHandles.lookup().lookupClass()).a(58098801669671L);
                ContextualTransformationEngine.f = new Object[16];
                ContextualTransformationEngine.g = new String[16];
                ContextualTransformationEngine.a();
                ContextualTransformationEngine.d = new HashMap<K, V>(13);
                var0 = ContextualTransformationEngine.a ^ 47126465606606L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "\u00b8\u001e)\u00d3\u00a9%\u00efC`\u00a4\"!>=T&\u00be\u00da(.zj4N\u0094\u0085\u00da\u00b5\u00acM\u0005\u00db\u009a\u0089\u0015\u00f3\u00c4\u00e7:\u00ea\u00913\u0012vG\u00f9\u0093\u00ff";
                var7_6 = "\u00b8\u001e)\u00d3\u00a9%\u00efC`\u00a4\"!>=T&\u00be\u00da(.zj4N\u0094\u0085\u00da\u00b5\u00acM\u0005\u00db\u009a\u0089\u0015\u00f3\u00c4\u00e7:\u00ea\u00913\u0012vG\u00f9\u0093\u00ff".length();
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
                    var6_5 = "w#\u0014\u00be\u00c0\u00fe\nx\u0097\u00b9Zj;g\u0019\u001f";
                    var7_6 = "w#\u0014\u00be\u00c0\u00fe\nx\u0097\u00b9Zj;g\u0019\u001f".length();
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
        ContextualTransformationEngine.b = var8_3;
        ContextualTransformationEngine.c = new Integer[8];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ur" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "\u001d\u0016\u0017q";
        objectArray[1] = "8|(j\rR3s9%pJ t0l";
        objectArray[2] = Boolean.TYPE;
        ContextualTransformationEngine.g[2] = "java/lang/Boolean";
        objectArray[3] = "%\rSb\u0002\u001f.\u0002B-o\u001f.\u001fV";
        objectArray[4] = "Lg,:f'9G'5whTG'(c}";
        objectArray[5] = ":\bI'";
        objectArray[6] = "\u0012&Z";
        objectArray[7] = Integer.TYPE;
        ContextualTransformationEngine.g[7] = "java/lang/Integer";
        objectArray[8] = "\u0003:\u00008";
        objectArray[9] = "g\u0003M>lT\u0012#F1}\u001b\u007f#F,i\u000e";
        objectArray[10] = ":uob";
        objectArray[11] = "\u0001&#\u0014xj\n)2[\u0019d\u0001\"6\u0001";
        objectArray[12] = "=Kn6FH!\u001e1Oj+d\u0010l \u001d\u00108\t(r-\u0012$\u001a85N\u0016=CoO\u0017B4Ja0\u0013Q2\u001cQqTV\"\u001c02\u0016W:{ms\u0014Aa\u0019=p\u0011R]";
        objectArray[13] = "(~$\tl>4+{p\\]q%&\u001f7f-<bM\u0007d1/r\nd`(v%p=4!\u007f+\u000f9'')\u001bMu48tw\u0001m!uN";
        objectArray[14] = "ML<\u007f\\*\u001fK>.#y\n*l(MmKF#!Isq\u0013:zL\"JO#>\u001e\u0012";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "9-o7\u0004,%x0N\rO`vm!_t<o)sou0ta~\u0010q#r7NQ6$b7/\u0012t%zPqW/0c(?_w'\u001d";
    }

    private AbstractList E(Object object) {
        return (AbstractList)this.o.Z(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ur" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ContextualTransformationEngine.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                ContextualTransformationEngine.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private Object J(Object object) {
        return this.z.T(object, new Object[0]);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ContextualTransformationEngine.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ContextualTransformationEngine.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

