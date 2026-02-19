/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 */
package a;

import a.d8;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class zo {
    private static final long[] b;
    private static final Map d;
    private static final Integer[] c;
    private static final long a;
    private static final String[] f;
    private static final Object[] e;

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = zo.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = zo.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i10 = 0; i10 < n2; ++i10) {
                if (classArray2[i10] != classArray[i10]) continue block0;
            }
            return method;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                zo.a = d8.a(-1604852802038623244L, 7873524345328721728L, MethodHandles.lookup().lookupClass()).a(22852330974627L);
                zo.e = new Object[5];
                zo.f = new String[5];
                zo.a();
                zo.d = new HashMap<K, V>(13);
                var0 = zo.a ^ 18126587910190L;
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
                var6_5 = "\u00d8\u00eah\u0011\"\u0015\u00e5m\u0018\u0019\u0015\u00abS\u00017J$\u0014\u00c7\u00e5k\u00a6eD\u00e9M\u00c9\u0088\u00eeq\u0011\u00a9\u00c4\u00bfq)\u00a0\u0099W\u00dd\u00d9\u00f1j\u008e\u00c3\u00cfk\u00bb'o\u00b0\u00c0\u00d9\u00a9v2\u008d<\u00ff\u00c2\u0099\u00f7\u00ce\u00c0\u00b4L\u0004DR7\u00d8\u00bd";
                var7_6 = "\u00d8\u00eah\u0011\"\u0015\u00e5m\u0018\u0019\u0015\u00abS\u00017J$\u0014\u00c7\u00e5k\u00a6eD\u00e9M\u00c9\u0088\u00eeq\u0011\u00a9\u00c4\u00bfq)\u00a0\u0099W\u00dd\u00d9\u00f1j\u008e\u00c3\u00cfk\u00bb'o\u00b0\u00c0\u00d9\u00a9v2\u008d<\u00ff\u00c2\u0099\u00f7\u00ce\u00c0\u00b4L\u0004DR7\u00d8\u00bd".length();
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
                    var6_5 = "XW\u00c4e\u00e3\u0019w\u001fq\u0012\u00bb\u00ea\u00e1\u009a0 ";
                    var7_6 = "XW\u00c4e\u00e3\u0019w\u001fq\u0012\u00bb\u00ea\u00e1\u009a0 ".length();
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
        zo.b = var8_3;
        zo.c = new Integer[11];
    }

    public static UUID b(ByteBuf byteBuf) {
        return new UUID(byteBuf.readLong(), byteBuf.readLong());
    }

    public static void t(ByteBuf byteBuf, String string) {
        long l10 = a ^ 0x2ED22AFA80AEL;
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        try {
            if (byArray.length > Short.MAX_VALUE) {
                throw new EncoderException((String)((Object)zo.b("\u00e5", (int)zo.a("z", (int)12171, (long)(0x27983EE6CF79C63CL ^ l10)), (long)2463751785626192861L, (long)l10)) + string.length() + (String)((Object)zo.b("\u00e5", (int)zo.a("z", (int)11096, (long)(0x7C4CF9DEFE51C2E4L ^ l10)), (long)2463751785626192861L, (long)l10)) + Short.MAX_VALUE + (String)((Object)zo.b("\u00e5", (int)zo.a("z", (int)7636, (long)(0xC799AED45F7F464L ^ l10)), (long)2463751785626192861L, (long)l10)));
            }
        }
        catch (RuntimeException runtimeException) {
            throw zo.a(runtimeException);
        }
        zo.M(byteBuf, byArray.length);
        byteBuf.writeBytes(byArray);
    }

    public static <E extends Enum<E>> E W(ByteBuf byteBuf, Class<E> clazz) {
        return (E)((Enum[])clazz.getEnumConstants())[zo.F(byteBuf)];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/zo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static String T(ByteBuf byteBuf, int n2) {
        long l10 = a ^ 0x4C99A4A21AFAL;
        int n3 = zo.F(byteBuf);
        try {
            if (n3 > n2 * 4) {
                throw new DecoderException((String)((Object)zo.b("\u00e5", (int)zo.a("z", (int)30807, (long)(0x6CBF1E7370028BBDL ^ l10)), (long)-5159608424549101175L, (long)l10)) + n3 + (String)((Object)zo.b("\u00e5", (int)zo.a("z", (int)8413, (long)(0x3B8EF0DF61ADD338L ^ l10)), (long)-5159608424549101175L, (long)l10)) + n2 * 4 + (String)((Object)zo.b("\u00e5", (int)zo.a("z", (int)906, (long)(0x4F9403706749706BL ^ l10)), (long)-5159608424549101175L, (long)l10)));
            }
        }
        catch (RuntimeException runtimeException) {
            throw zo.a(runtimeException);
        }
        try {
            if (n3 < 0) {
                throw new DecoderException((String)((Object)zo.b("\u00e5", (int)zo.a("z", (int)3423, (long)(0x2ADAEE364C5FEB6L ^ l10)), (long)-5159608424549101175L, (long)l10)));
            }
        }
        catch (RuntimeException runtimeException) {
            throw zo.a(runtimeException);
        }
        byte[] byArray = new byte[n3];
        byteBuf.readBytes(byArray);
        String string = new String(byArray, StandardCharsets.UTF_8);
        try {
            if (string.length() > n2) {
                throw new DecoderException((String)((Object)zo.b("\u00e5", (int)zo.a("z", (int)27256, (long)(0x3D61725BAFE1199FL ^ l10)), (long)-5159608424549101175L, (long)l10)) + n3 + (String)((Object)zo.b("\u00e5", (int)zo.a("z", (int)14422, (long)(0x6A697CF2CD834BB0L ^ l10)), (long)-5159608424549101175L, (long)l10)) + n2 + (String)((Object)zo.b("\u00e5", (int)zo.a("z", (int)27099, (long)(0x70751B039F111A39L ^ l10)), (long)-5159608424549101175L, (long)l10)));
            }
        }
        catch (RuntimeException runtimeException) {
            throw zo.a(runtimeException);
        }
        return string;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = zo.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = zo.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/zo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x4B84;
        if (c[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/zo", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            zo.c[n3] = n4;
        }
        return c[n3];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = zo.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Method d(long l10, long l11) {
        int n2 = zo.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n2];
                int n4 = string2.indexOf(8);
                clazz3 = zo.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i10 = 0; i10 < n6; ++i10) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = zo.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = zo.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        zo.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = zo.b(233624444441010L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = zo.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        zo.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = zo.b(233624444441010L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "5u>";
        objectArray[1] = Integer.TYPE;
        zo.f[1] = "java/lang/Integer";
        objectArray[2] = "6q\u0010JKz=~\u0001\u00056b.y\bL";
        objectArray[3] = "\fd1\fTe\u0007k C5k\f`$\u0019";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "GW$r\\l\u0007\u001az\u0002Y'}\u0012snI \u0016\u0010)l\u000e\\DV0zRc\u001cKr<2";
    }

    private static Field c(long l10, long l11) {
        int n2 = zo.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = zo.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = zo.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = zo.a(clazz3, string2, clazz2)) != null) {
                    zo.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = zo.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        zo.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = zo.b(233624444441010L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void M(ByteBuf byteBuf, int n2) {
        while ((n2 & 0xFFFFFF80) != 0) {
            byteBuf.writeByte(n2 & 0x7F | 0x80);
            n2 >>>= 7;
        }
        byteBuf.writeByte(n2);
    }

    public static void J(ByteBuf byteBuf, UUID uUID) {
        byteBuf.writeLong(uUID.getMostSignificantBits());
        byteBuf.writeLong(uUID.getLeastSignificantBits());
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00c4' || c10 == 'Z' || c10 == 'T' || c10 == '\u00df') {
                field = zo.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00c4' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'Z' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'T' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = zo.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'K' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static int F(ByteBuf byteBuf) {
        byte by2;
        long l10 = a ^ 0x3D5FA5C9D015L;
        int n2 = 0;
        int n3 = 0;
        do {
            by2 = byteBuf.readByte();
            n2 |= (by2 & 0x7F) << n3++ * 7;
            if (n3 <= 5) continue;
            throw new RuntimeException((String)((Object)zo.b("\u00e5", (int)zo.a("z", (int)14539, (long)(0x619CE9F2C27701C4L ^ l10)), (long)8253429880868871014L, (long)l10)));
        } while ((by2 & 0x80) == 128);
        return n2;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (f[n5] != null) {
            return n5;
        }
        Object object = e[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 54;
                break;
            }
            case 1: {
                n4 = 19;
                break;
            }
            case 2: {
                n4 = 36;
                break;
            }
            case 3: {
                n4 = 58;
                break;
            }
            case 4: {
                n4 = 7;
                break;
            }
            case 5: {
                n4 = 25;
                break;
            }
            case 6: {
                n4 = 49;
                break;
            }
            case 7: {
                n4 = 62;
                break;
            }
            case 8: {
                n4 = 15;
                break;
            }
            case 9: {
                n4 = 13;
                break;
            }
            case 10: {
                n4 = 50;
                break;
            }
            case 11: {
                n4 = 20;
                break;
            }
            case 12: {
                n4 = 60;
                break;
            }
            case 13: {
                n4 = 33;
                break;
            }
            case 14: {
                n4 = 42;
                break;
            }
            case 15: {
                n4 = 17;
                break;
            }
            case 16: {
                n4 = 4;
                break;
            }
            case 17: {
                n4 = 34;
                break;
            }
            case 18: {
                n4 = 24;
                break;
            }
            case 19: {
                n4 = 2;
                break;
            }
            case 20: {
                n4 = 5;
                break;
            }
            case 21: {
                n4 = 44;
                break;
            }
            case 22: {
                n4 = 55;
                break;
            }
            case 23: {
                n4 = 37;
                break;
            }
            case 24: {
                n4 = 63;
                break;
            }
            case 25: {
                n4 = 9;
                break;
            }
            case 26: {
                n4 = 52;
                break;
            }
            case 27: {
                n4 = 11;
                break;
            }
            case 28: {
                n4 = 46;
                break;
            }
            case 29: {
                n4 = 48;
                break;
            }
            case 30: {
                n4 = 38;
                break;
            }
            case 31: {
                n4 = 29;
                break;
            }
            case 32: {
                n4 = 45;
                break;
            }
            case 33: {
                n4 = 57;
                break;
            }
            case 34: {
                n4 = 40;
                break;
            }
            case 35: {
                n4 = 61;
                break;
            }
            case 36: {
                n4 = 8;
                break;
            }
            case 37: {
                n4 = 0;
                break;
            }
            case 38: {
                n4 = 53;
                break;
            }
            case 39: {
                n4 = 43;
                break;
            }
            case 40: {
                n4 = 56;
                break;
            }
            case 41: {
                n4 = 47;
                break;
            }
            case 42: {
                n4 = 32;
                break;
            }
            case 43: {
                n4 = 12;
                break;
            }
            case 44: {
                n4 = 22;
                break;
            }
            case 45: {
                n4 = 3;
                break;
            }
            case 46: {
                n4 = 26;
                break;
            }
            case 47: {
                n4 = 6;
                break;
            }
            case 48: {
                n4 = 21;
                break;
            }
            case 49: {
                n4 = 23;
                break;
            }
            case 50: {
                n4 = 1;
                break;
            }
            case 51: {
                n4 = 28;
                break;
            }
            case 52: {
                n4 = 51;
                break;
            }
            case 53: {
                n4 = 41;
                break;
            }
            case 54: {
                n4 = 30;
                break;
            }
            case 55: {
                n4 = 14;
                break;
            }
            case 56: {
                n4 = 27;
                break;
            }
            case 57: {
                n4 = 31;
                break;
            }
            case 58: {
                n4 = 10;
                break;
            }
            case 59: {
                n4 = 35;
                break;
            }
            case 60: {
                n4 = 18;
                break;
            }
            case 61: {
                n4 = 59;
                break;
            }
            case 62: {
                n4 = 39;
                break;
            }
            default: {
                n4 = 16;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l10 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        zo.f[n5] = new String(cArray);
        return n5;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = zo.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static void t(ByteBuf byteBuf, Enum<?> enum_) {
        zo.M(byteBuf, enum_.ordinal());
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = zo.a(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                zo.e[n2] = clazz = Class.forName(f[n2]);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(zo.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(zo.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

