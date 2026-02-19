/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.Ib;
import a.O_;
import a.d8;
import a.eM;
import a.ht;
import a.kX;
import a.v2;
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
public class U9
extends v2 {
    private final HK d;
    private static final Object[] g;
    private static final long[] c;
    private final Ib E;
    private static final Map f;
    private final Ib J;
    private final Ib p;
    private final Ib O;
    private final Ib u;
    private final HK i;
    private final HK b;
    private final HK h;
    private final HK r;
    private static int[] W;
    private static final Integer[] e;
    private static final String[] j;
    private static final long a;

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = U9.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = U9.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static void n(U9 u9, Object object, boolean bl2) {
        u9.B(object, bl2);
    }

    public U9() {
        block11: {
            CallSite callSite;
            block9: {
                long l10 = a ^ 0x11E6C9DA0FFL;
                super(eM.Pn);
                this.h = U9.c("\u00e4", (Object)this, (Object)U9.c("\u00fd", (int)U9.b("l", (int)22042, (long)(0x43B0B45E2AE3B15L ^ l10)), (long)-3426379110660863353L, (long)l10), (boolean)false, Void.TYPE, (Object)new Class[0], (long)-3426474950326219411L, (long)l10);
                this.E = U9.c("\u00e4", (Object)this, (Object)U9.c("\u00fd", (int)U9.b("l", (int)13571, (long)(0x4DB83956C90580DL ^ l10)), (long)-3426379110660863353L, (long)l10), (boolean)true, Boolean.TYPE, (long)-3426431248981610371L, (long)l10);
                this.O = U9.c("\u00e4", (Object)this, (Object)U9.c("\u00fd", (int)U9.b("l", (int)30566, (long)(0x16CE1C04C7AE1A6BL ^ l10)), (long)-3426379110660863353L, (long)l10), (boolean)true, Boolean.TYPE, (long)-3426431248981610371L, (long)l10);
                this.J = U9.c("\u00e4", (Object)this, (Object)U9.c("\u00fd", (int)U9.b("l", (int)28464, (long)(0x226CED1EBD038236L ^ l10)), (long)-3426379110660863353L, (long)l10), (boolean)true, Boolean.TYPE, (long)-3426431248981610371L, (long)l10);
                this.u = U9.c("\u00e4", (Object)this, (Object)U9.c("\u00fd", (int)U9.b("l", (int)18197, (long)(0x26D1603942052A10L ^ l10)), (long)-3426379110660863353L, (long)l10), (boolean)true, Boolean.TYPE, (long)-3426431248981610371L, (long)l10);
                this.p = U9.c("\u00e4", (Object)this, (Object)U9.c("\u00fd", (int)U9.b("l", (int)28944, (long)(0x17F03BA624049C19L ^ l10)), (long)-3426379110660863353L, (long)l10), (boolean)true, Boolean.TYPE, (long)-3426431248981610371L, (long)l10);
                int[] nArray = U9.n();
                try {
                    U9 u9;
                    block10: {
                        try {
                            try {
                                this.i = U9.c("\u00e4", (Object)this, (Object)U9.c("\u00fd", (int)U9.b("l", (int)13301, (long)(0x3CF2B88FE1EDDEFEL ^ l10)), (long)-3426379110660863353L, (long)l10), (boolean)true, Float.TYPE, (Object)new Class[0], (long)-3426474950326219411L, (long)l10);
                                this.r = U9.c("\u00e4", (Object)this, (Object)U9.c("\u00fd", (int)U9.b("l", (int)11737, (long)(0x3B3CC419A989C0D1L ^ l10)), (long)-3426379110660863353L, (long)l10), (boolean)true, Float.TYPE, (Object)new Class[0], (long)-3426474950326219411L, (long)l10);
                                u9 = this;
                                callSite = U9.c("\u00e4", (Object)this, (Object)U9.c("\u00fd", (int)U9.b("l", (int)15131, (long)(0x6D501674207FD611L ^ l10)), (long)-3426379110660863353L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)-3426474950326219411L, (long)l10);
                                if (nArray != null) break block9;
                                u9.b = callSite;
                                if (kX.C() < 35) break block10;
                            }
                            catch (O_ o_2) {
                                throw U9.a(o_2);
                            }
                            this.d = U9.c("\u00e4", (Object)this, (Object)U9.c("\u00fd", (int)U9.b("l", (int)24028, (long)(0x586B4B6E60F0B0D8L ^ l10)), (long)-3426379110660863353L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)-3426474950326219411L, (long)l10);
                            if (nArray == null) break block11;
                        }
                        catch (O_ o_3) {
                            throw U9.a(o_3);
                        }
                    }
                    u9 = this;
                    callSite = U9.c("\u00e4", (Object)this, (Object)U9.c("\u00fd", (int)U9.b("l", (int)19515, (long)(0xFC6F6B1DA80A137L ^ l10)), (long)-3426379110660863353L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)-3426474950326219411L, (long)l10);
                }
                catch (O_ o_4) {
                    throw U9.a(o_4);
                }
            }
            u9.d = callSite;
        }
        try {
            if (ht.J() != null) {
                U9.W(new int[1]);
            }
        }
        catch (O_ o_5) {
            throw U9.a(o_5);
        }
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x3D7C;
        if (e[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/U9", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            U9.e[n3] = n4;
        }
        return e[n3];
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "I'7.";
        objectArray[1] = ".3x\u001f?\u0013%<iPB\u000b6;`\u0019";
        objectArray[2] = Boolean.TYPE;
        U9.j[2] = "java/lang/Boolean";
        objectArray[3] = "\u0007\u001f\u001f#M9\f\u0010\u000el 9\f\r\u001a";
        objectArray[4] = "I#NQ^\u0017<\u0003E^OXQ\u0003EC[M";
        objectArray[5] = ":CL\f";
        objectArray[6] = "L\u001ap";
        objectArray[7] = Integer.TYPE;
        U9.j[7] = "java/lang/Integer";
        objectArray[8] = "<1\u0005\u0000";
        objectArray[9] = "*s;<y$!|*s\u0018**w.)";
        objectArray[10] = "\u0013s>R2\r\u0003x16J`\u0001aiRw\u000b\n\"#67X\u000ej!\r2\u000b@zX\fl\u000eN}5\u0006<\fM\u0013cXb_\byhH\u007f\u001eq(?W6\t\bh>Uc`";
        objectArray[11] = "bZ@-\u0005\u001arQOIawpH\u0017-@\u001c{\u000b]I\u0000O\u007fC_r\u0005\u001c1S&s[\u0019?TKy\u000b\u001b<:\u001b,SLg\u0000@5Y\u001c\u0000";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "B\fpxO\u000e\u0011\b!l#\u000e\u0005ww)@\\\u0011\u00101\"\\_~\u00078\"G\u001f\u0015\f{h#";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/U9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static boolean s(U9 u9, Object object) {
        return u9.o(object);
    }

    private boolean g(Object object) {
        return this.u.R(object);
    }

    private void B(Object object, boolean bl2) {
        this.p.B(object, bl2);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private Object n() {
        return this.h.A(new Object[0]);
    }

    static void E(U9 u9, Object object, float f10) {
        u9.d(object, f10);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = U9.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = U9.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = U9.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void u(Object object, float f10) {
        this.b.l(object, Float.valueOf(f10));
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    static boolean D(U9 u9, Object object) {
        return u9.g(object);
    }

    static boolean G(U9 u9, Object object) {
        return u9.A(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                U9.a = d8.a(-5516462241715674752L, -3777424537792377115L, MethodHandles.lookup().lookupClass()).a(179626676741861L);
                U9.g = new Object[13];
                U9.j = new String[13];
                U9.a();
                U9.f = new HashMap<K, V>(13);
                var0 = U9.a ^ 36021269232852L;
                U9.W(null);
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
                var6_5 = "y\rYpB\u001e\u0093\u0019^Pe\u0010\u00bd\u00e0Y\t\u00cf\u009f\u00e4Q\u00c1\u0082\u00e5\u00ebW8\u009bP\u00e2U\u00c7\u0017\u009bJ\u0096\u00e7\u0095g#f\u0084F\u00a0t\u00b5,\u00fa\u009b4\u001a\u00b5\u00853\u001e\u00e3B\u00f5\u0096^\u00bd\u00ec\u00af\u00b1Q\u0002n\u00fe\u0013\u00006\u0088t";
                var7_6 = "y\rYpB\u001e\u0093\u0019^Pe\u0010\u00bd\u00e0Y\t\u00cf\u009f\u00e4Q\u00c1\u0082\u00e5\u00ebW8\u009bP\u00e2U\u00c7\u0017\u009bJ\u0096\u00e7\u0095g#f\u0084F\u00a0t\u00b5,\u00fa\u009b4\u001a\u00b5\u00853\u001e\u00e3B\u00f5\u0096^\u00bd\u00ec\u00af\u00b1Q\u0002n\u00fe\u0013\u00006\u0088t".length();
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
                    var6_5 = "\u001d4\u008b\u00cd\u0018U7\u000eQ\u0015\u0014\u00c2\u0003\u0095eC";
                    var7_6 = "\u001d4\u008b\u00cd\u0018U7\u000eQ\u0015\u0014\u00c2\u0003\u0095eC".length();
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
        U9.c = var8_3;
        U9.e = new Integer[11];
    }

    private float b(Object object) {
        return this.r.p(object, new Object[0]);
    }

    private void d(Object object, float f10) {
        this.d.l(object, Float.valueOf(f10));
    }

    static float n(U9 u9, Object object) {
        return u9.b(object);
    }

    private static Method c(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private boolean Q(Object object) {
        return this.p.R(object);
    }

    private static Field g(long l10, long l11) {
        int n2 = U9.e(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            String string = j[n2];
            int n3 = string.indexOf(8);
            Class clazz = U9.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = U9.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = U9.c(clazz3, string2, clazz2)) != null) {
                    U9.g[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = U9.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        U9.g[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = U9.f(675105134308296L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private float V(Object object) {
        return this.i.p(object, new Object[0]);
    }

    public static int[] n() {
        return W;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/U9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void t(Object object, boolean bl2) {
        this.J.B(object, bl2);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00c1' || c10 == '\u00f5' || c10 == '\u00cc' || c10 == '\u00f0') {
                field = U9.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00c1' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00f5' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00cc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = U9.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00fd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private boolean o(Object object) {
        return this.O.R(object);
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = U9.e(l10, l11);
            object = g[n2];
            try {
                if (!(object instanceof String)) break block2;
                U9.g[n2] = clazz = Class.forName(j[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static Object z(U9 u9) {
        return u9.n();
    }

    static void U(U9 u9, Object object, float f10) {
        u9.u(object, f10);
    }

    static float k(U9 u9, Object object) {
        return u9.V(object);
    }

    static void c(U9 u9, Object object, boolean bl2) {
        u9.t(object, bl2);
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (j[n5] != null) {
            return n5;
        }
        Object object = g[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 11;
                break;
            }
            case 1: {
                n4 = 3;
                break;
            }
            case 2: {
                n4 = 63;
                break;
            }
            case 3: {
                n4 = 6;
                break;
            }
            case 4: {
                n4 = 10;
                break;
            }
            case 5: {
                n4 = 45;
                break;
            }
            case 6: {
                n4 = 42;
                break;
            }
            case 7: {
                n4 = 50;
                break;
            }
            case 8: {
                n4 = 12;
                break;
            }
            case 9: {
                n4 = 27;
                break;
            }
            case 10: {
                n4 = 44;
                break;
            }
            case 11: {
                n4 = 61;
                break;
            }
            case 12: {
                n4 = 24;
                break;
            }
            case 13: {
                n4 = 62;
                break;
            }
            case 14: {
                n4 = 37;
                break;
            }
            case 15: {
                n4 = 5;
                break;
            }
            case 16: {
                n4 = 23;
                break;
            }
            case 17: {
                n4 = 28;
                break;
            }
            case 18: {
                n4 = 46;
                break;
            }
            case 19: {
                n4 = 43;
                break;
            }
            case 20: {
                n4 = 36;
                break;
            }
            case 21: {
                n4 = 33;
                break;
            }
            case 22: {
                n4 = 7;
                break;
            }
            case 23: {
                n4 = 20;
                break;
            }
            case 24: {
                n4 = 55;
                break;
            }
            case 25: {
                n4 = 0;
                break;
            }
            case 26: {
                n4 = 18;
                break;
            }
            case 27: {
                n4 = 21;
                break;
            }
            case 28: {
                n4 = 47;
                break;
            }
            case 29: {
                n4 = 41;
                break;
            }
            case 30: {
                n4 = 57;
                break;
            }
            case 31: {
                n4 = 26;
                break;
            }
            case 32: {
                n4 = 40;
                break;
            }
            case 33: {
                n4 = 4;
                break;
            }
            case 34: {
                n4 = 56;
                break;
            }
            case 35: {
                n4 = 13;
                break;
            }
            case 36: {
                n4 = 59;
                break;
            }
            case 37: {
                n4 = 22;
                break;
            }
            case 38: {
                n4 = 32;
                break;
            }
            case 39: {
                n4 = 25;
                break;
            }
            case 40: {
                n4 = 51;
                break;
            }
            case 41: {
                n4 = 16;
                break;
            }
            case 42: {
                n4 = 53;
                break;
            }
            case 43: {
                n4 = 17;
                break;
            }
            case 44: {
                n4 = 15;
                break;
            }
            case 45: {
                n4 = 52;
                break;
            }
            case 46: {
                n4 = 2;
                break;
            }
            case 47: {
                n4 = 30;
                break;
            }
            case 48: {
                n4 = 14;
                break;
            }
            case 49: {
                n4 = 9;
                break;
            }
            case 50: {
                n4 = 8;
                break;
            }
            case 51: {
                n4 = 60;
                break;
            }
            case 52: {
                n4 = 48;
                break;
            }
            case 53: {
                n4 = 58;
                break;
            }
            case 54: {
                n4 = 39;
                break;
            }
            case 55: {
                n4 = 49;
                break;
            }
            case 56: {
                n4 = 29;
                break;
            }
            case 57: {
                n4 = 34;
                break;
            }
            case 58: {
                n4 = 19;
                break;
            }
            case 59: {
                n4 = 35;
                break;
            }
            case 60: {
                n4 = 54;
                break;
            }
            case 61: {
                n4 = 31;
                break;
            }
            case 62: {
                n4 = 38;
                break;
            }
            default: {
                n4 = 1;
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
        U9.j[n5] = new String(cArray);
        return n5;
    }

    private boolean A(Object object) {
        return this.E.R(object);
    }

    static boolean c(U9 u9, Object object) {
        return u9.S(object);
    }

    static boolean U(U9 u9, Object object) {
        return u9.Q(object);
    }

    private boolean S(Object object) {
        return this.J.R(object);
    }

    private static Method h(long l10, long l11) {
        int n2 = U9.e(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n2];
                int n4 = string2.indexOf(8);
                clazz3 = U9.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = U9.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = U9.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        U9.g[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = U9.f(675105134308296L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = U9.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        U9.g[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = U9.f(675105134308296L, 0L);
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

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = U9.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public static void W(int[] nArray) {
        W = nArray;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(U9.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(U9.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

