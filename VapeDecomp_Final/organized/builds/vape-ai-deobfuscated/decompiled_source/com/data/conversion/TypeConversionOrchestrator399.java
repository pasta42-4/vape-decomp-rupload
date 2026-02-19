/*
 * Decompiled with CFR 0.152.
 */
package com.data.conversion;

import a.HK;
import a.N9;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
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
import java.util.Optional;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class TypeConversionOrchestrator399
extends CryptoProtocolEngine {
    private static final Integer[] c;
    private static final Map d;
    private final ReflectionUtilityService T;
    private final ReflectionUtilityService R;
    private final HK Z;
    private static final Object[] e;
    private static final long[] b;
    private static final String[] f;
    private static final long a;

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = TypeConversionOrchestrator399.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = TypeConversionOrchestrator399.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static Object K(TypeConversionOrchestrator399 typeConversionOrchestrator399, String string, UUID uUID, String string2, Optional optional, Optional optional2, Object object) {
        return typeConversionOrchestrator399.n(string, uUID, string2, optional, optional2, object);
    }

    private Object n(String string, UUID uUID, String string2, Optional<String> optional, Optional<String> optional2, Object object) {
        return this.Z.A(string, uUID, string2, optional, optional2, object);
    }

    public TypeConversionOrchestrator399() {
        block12: {
            int n;
            String[] stringArray;
            long l;
            block10: {
                l = a ^ 0x2E37ACB0469CL;
                super(ReflectionMetadataResolver.Pq);
                this.T = TypeConversionOrchestrator399.c("\u00e7", (Object)this, (Object)TypeConversionOrchestrator399.c("\u00ff", (int)TypeConversionOrchestrator399.b("x", (int)11532, (long)(0x7CAB5E43F4535AB4L ^ l)), (long)-8002486833523162843L, (long)l), (boolean)true, String.class, (long)-8002585598398822383L, (long)l);
                stringArray = N9.I();
                try {
                    block11: {
                        try {
                            try {
                                this.R = TypeConversionOrchestrator399.c("\u00e7", (Object)this, (Object)TypeConversionOrchestrator399.c("\u00ff", (int)TypeConversionOrchestrator399.b("x", (int)6580, (long)(0x1441B8EE81C8EE0EL ^ l)), (long)-8002486833523162843L, (long)l), (boolean)true, String.class, (long)-8002585598398822383L, (long)l);
                                n = GameVersionEnumerator.MC_1_21_10.H();
                                if (stringArray == null) break block10;
                                if (n == 0) break block11;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw TypeConversionOrchestrator399.a(customSystemException);
                            }
                            this.Z = TypeConversionOrchestrator399.c("\u00e7", (Object)this, (Object)new Class[]{String.class, UUID.class, String.class, Optional.class, Optional.class}, (long)-8002464718722515823L, (long)l);
                            if (stringArray != null) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TypeConversionOrchestrator399.a(customSystemException);
                        }
                    }
                    n = GeometryCalculator.C();
                }
                catch (CustomSystemException customSystemException) {
                    throw TypeConversionOrchestrator399.a(customSystemException);
                }
            }
            try {
                block13: {
                    try {
                        if (n < 50) break block13;
                        this.Z = TypeConversionOrchestrator399.c("\u00e7", (Object)this, (Object)TypeConversionOrchestrator399.c("\u00ff", (int)TypeConversionOrchestrator399.b("x", (int)32001, (long)(0x52688B6368FB0AB8L ^ l)), (long)-8002486833523162843L, (long)l), (boolean)false, Void.TYPE, (Object)new Class[]{String.class, UUID.class, String.class, Optional.class, Optional.class, ReflectionMetadataResolver.FR}, (long)-8002674954544050583L, (long)l);
                        if (stringArray != null) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TypeConversionOrchestrator399.a(customSystemException);
                    }
                }
                this.Z = TypeConversionOrchestrator399.c("\u00e7", (Object)this, (Object)TypeConversionOrchestrator399.c("\u00ff", (int)TypeConversionOrchestrator399.b("x", (int)31296, (long)(0xD26877E44E18DFBL ^ l)), (long)-8002486833523162843L, (long)l), (boolean)false, Void.TYPE, (Object)new Class[]{String.class, String.class, String.class, String.class}, (long)-8002674954544050583L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw TypeConversionOrchestrator399.a(customSystemException);
            }
        }
    }

    private Object M(String string, String string2, String string3, String string4) {
        return this.Z.A(string, string2, string3, string4);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = ")\n`q";
        objectArray[1] = "\u0003\u000f\b=\u0011W\b\u0000\u0019rlO\u001b\u0007\u0010;";
        objectArray[2] = Boolean.TYPE;
        TypeConversionOrchestrator399.f[2] = "java/lang/Boolean";
        objectArray[3] = "T$\u001c$Li_+\rk!i_6\u0019";
        objectArray[4] = "wfLUDP\u0002FGZU\u001foFGGA\n";
        objectArray[5] = "\u001f2\u0005?";
        objectArray[6] = "n4I";
        objectArray[7] = Integer.TYPE;
        TypeConversionOrchestrator399.f[7] = "java/lang/Integer";
        objectArray[8] = "\u0001P(\u0014";
        objectArray[9] = ",z\b\b2JYZ\u0003\u0007#\u00054Z\u0003\u001a7\u0010";
        objectArray[10] = "\"\u0000\u001a:jB)\u000f\u000bu\u000bL\"\u0004\u000f/";
        objectArray[11] = "\u0016q{8Fy\u0000~ I}\u0018Kv\"(VgJ!!r:!\u0016wptV'\u0002g5I\u0000`\u0002# .Ce\u0014|KwSsBz)7@i\u0010\u001dp+G~\u0018`wvTar";
        objectArray[12] = "(\tS\u000f}R>\u0006\b~Z3u\u000e\n\u001fmLtY\tE\u0001\n(\u000fXCm\f<\u001f\u001d~;K<[\b\u0019xN*\u0004c@<\f!\u0019\u0006NeM,e";
        objectArray[13] = "+UOt*\"yAM.\u00143l.K#db&\u0016\u0012(~=\u0017\u0017\u001d$u4h\u0016J'/X";
        Object[] objectArray2 = objectArray;
        objectArray[14] = "dgP#J rh\u000bRqA>b\u000bbQ#~q\u001106zbv\u00068K}?e\u0019R";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = TypeConversionOrchestrator399.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6748;
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
                throw new RuntimeException("a/Py", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            TypeConversionOrchestrator399.c[n2] = n3;
        }
        return c[n2];
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = TypeConversionOrchestrator399.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                TypeConversionOrchestrator399.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static Object F(TypeConversionOrchestrator399 typeConversionOrchestrator399, String string, String string2, String string3, String string4) {
        return typeConversionOrchestrator399.M(string, string2, string3, string4);
    }

    private static int e(long l, long l2) {
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
                n3 = 47;
                break;
            }
            case 1: {
                n3 = 46;
                break;
            }
            case 2: {
                n3 = 4;
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
                n3 = 58;
                break;
            }
            case 6: {
                n3 = 21;
                break;
            }
            case 7: {
                n3 = 1;
                break;
            }
            case 8: {
                n3 = 14;
                break;
            }
            case 9: {
                n3 = 33;
                break;
            }
            case 10: {
                n3 = 27;
                break;
            }
            case 11: {
                n3 = 40;
                break;
            }
            case 12: {
                n3 = 55;
                break;
            }
            case 13: {
                n3 = 18;
                break;
            }
            case 14: {
                n3 = 61;
                break;
            }
            case 15: {
                n3 = 23;
                break;
            }
            case 16: {
                n3 = 7;
                break;
            }
            case 17: {
                n3 = 32;
                break;
            }
            case 18: {
                n3 = 3;
                break;
            }
            case 19: {
                n3 = 6;
                break;
            }
            case 20: {
                n3 = 17;
                break;
            }
            case 21: {
                n3 = 42;
                break;
            }
            case 22: {
                n3 = 10;
                break;
            }
            case 23: {
                n3 = 35;
                break;
            }
            case 24: {
                n3 = 57;
                break;
            }
            case 25: {
                n3 = 8;
                break;
            }
            case 26: {
                n3 = 43;
                break;
            }
            case 27: {
                n3 = 54;
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
                n3 = 20;
                break;
            }
            case 31: {
                n3 = 28;
                break;
            }
            case 32: {
                n3 = 24;
                break;
            }
            case 33: {
                n3 = 62;
                break;
            }
            case 34: {
                n3 = 51;
                break;
            }
            case 35: {
                n3 = 50;
                break;
            }
            case 36: {
                n3 = 31;
                break;
            }
            case 37: {
                n3 = 38;
                break;
            }
            case 38: {
                n3 = 36;
                break;
            }
            case 39: {
                n3 = 56;
                break;
            }
            case 40: {
                n3 = 9;
                break;
            }
            case 41: {
                n3 = 48;
                break;
            }
            case 42: {
                n3 = 30;
                break;
            }
            case 43: {
                n3 = 13;
                break;
            }
            case 44: {
                n3 = 34;
                break;
            }
            case 45: {
                n3 = 12;
                break;
            }
            case 46: {
                n3 = 29;
                break;
            }
            case 47: {
                n3 = 26;
                break;
            }
            case 48: {
                n3 = 5;
                break;
            }
            case 49: {
                n3 = 45;
                break;
            }
            case 50: {
                n3 = 37;
                break;
            }
            case 51: {
                n3 = 0;
                break;
            }
            case 52: {
                n3 = 44;
                break;
            }
            case 53: {
                n3 = 52;
                break;
            }
            case 54: {
                n3 = 25;
                break;
            }
            case 55: {
                n3 = 15;
                break;
            }
            case 56: {
                n3 = 59;
                break;
            }
            case 57: {
                n3 = 22;
                break;
            }
            case 58: {
                n3 = 60;
                break;
            }
            case 59: {
                n3 = 16;
                break;
            }
            case 60: {
                n3 = 2;
                break;
            }
            case 61: {
                n3 = 19;
                break;
            }
            case 62: {
                n3 = 41;
                break;
            }
            default: {
                n3 = 11;
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
        TypeConversionOrchestrator399.f[n4] = new String(cArray);
        return n4;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
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

    public Object c(Object object) {
        return this.T.Z(object);
    }

    private static Method h(long l, long l2) {
        int n = TypeConversionOrchestrator399.e(l, l2);
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
                clazz3 = TypeConversionOrchestrator399.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = TypeConversionOrchestrator399.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = TypeConversionOrchestrator399.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        TypeConversionOrchestrator399.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = TypeConversionOrchestrator399.f(755016314529979L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = TypeConversionOrchestrator399.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        TypeConversionOrchestrator399.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = TypeConversionOrchestrator399.f(755016314529979L, 0L);
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c3' || c == 'W' || c == 'Y' || c == 'o') {
                field = TypeConversionOrchestrator399.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = TypeConversionOrchestrator399.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e7' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ff' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                TypeConversionOrchestrator399.a = MultiContainerRegistry.a(-1251029778543318276L, 523965384465205956L, MethodHandles.lookup().lookupClass()).a(19527012009793L);
                TypeConversionOrchestrator399.e = new Object[15];
                TypeConversionOrchestrator399.f = new String[15];
                TypeConversionOrchestrator399.a();
                TypeConversionOrchestrator399.d = new HashMap<K, V>(13);
                var0 = TypeConversionOrchestrator399.a ^ 34086408099997L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "A7\u0088\u0089\u00d6\u00c5\u0014]\b\u00bbd\u00b98\u00e0\u000e\u0084";
                var7_6 = "A7\u0088\u0089\u00d6\u00c5\u0014]\b\u00bbd\u00b98\u00e0\u000e\u0084".length();
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
                    var6_5 = "\u00a1#\u00dc\u009c?\u00d0\u008b2\u00e7\u000f\u0005\u008b\u00f2P\u00d9\u00c3";
                    var7_6 = "\u00a1#\u00dc\u009c?\u00d0\u008b2\u00e7\u000f\u0005\u008b\u00f2P\u00d9\u00c3".length();
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
        TypeConversionOrchestrator399.b = var8_3;
        TypeConversionOrchestrator399.c = new Integer[4];
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = TypeConversionOrchestrator399.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = TypeConversionOrchestrator399.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field g(long l, long l2) {
        int n = TypeConversionOrchestrator399.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = TypeConversionOrchestrator399.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = TypeConversionOrchestrator399.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = TypeConversionOrchestrator399.c(clazz3, string2, clazz2)) != null) {
                    TypeConversionOrchestrator399.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = TypeConversionOrchestrator399.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        TypeConversionOrchestrator399.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = TypeConversionOrchestrator399.f(755016314529979L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = TypeConversionOrchestrator399.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Py" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Py" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public String E(Object object) {
        return (String)this.R.Z(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(TypeConversionOrchestrator399.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(TypeConversionOrchestrator399.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

