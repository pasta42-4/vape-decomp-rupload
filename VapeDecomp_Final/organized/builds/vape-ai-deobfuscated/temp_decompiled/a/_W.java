/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package a;

import a.ET;
import a.Jt;
import a.Ok;
import a.QB;
import a.Rk;
import a.V4;
import a.d8;
import a.kX;
import com.google.gson.JsonObject;
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

public class _w
implements Rk<_w> {
    private static final Integer[] j;
    private static final Object[] o;
    private static final Map k;
    private static final long d;
    private static final String[] q;
    private Jt b;
    private int w;
    private static final long[] i;

    private static Method l(long l10, long l11) {
        int n2 = _w.i(l10, l11);
        Object object = o[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = q[n2];
                int n4 = string2.indexOf(8);
                clazz3 = _w.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = _w.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _w.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        _w.o[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _w.j(251164031276312L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = _w.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        _w.o[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _w.j(251164031276312L, 0L);
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

    public _w C(Jt jt2) {
        this.b = jt2;
        return this;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'g' || c10 == '\u00f6' || c10 == '\u00f1' || c10 == 's') {
                field = _w.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'g' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00f6' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00f1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _w.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00fe' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public _w a(String string) {
        this.w = Integer.parseInt(string);
        return this;
    }

    @Override
    public JsonObject a() {
        long l10 = d ^ 0x4C7B0DC4946AL;
        JsonObject jsonObject = Rk.super.a();
        jsonObject.addProperty((String)((Object)_w.e("\u00e2", (int)_w.b("k", (int)27437, (long)(0x2B6EC1AA5D05C791L ^ l10)), (long)-7392267304504555508L, (long)l10)), (Number)this.w);
        return jsonObject;
    }

    public _w Y(int n2) {
        this.w = n2;
        return this;
    }

    public _w() {
        this.b = Jt.EQUALS;
    }

    public _w V() {
        return new _w(this.w, this.b);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = d8.a(7685212041583448451L, -1483732259862750437L, MethodHandles.lookup().lookupClass()).a(265063455926795L);
        o = new Object[5];
        q = new String[5];
        _w.c();
        k = new HashMap(13);
        long l10 = d ^ 0x3E464DCCEA2EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n2 = 0;
        String string = "\u00f3J{ \u00e9\u00bc\u00c4\u00a9\u001f\u0002\u008f\u00e5\u00bc1\u00f8p\u0083+\u00c33E\u00a7uz";
        int n3 = "\u00f3J{ \u00e9\u00bc\u00c4\u00a9\u001f\u0002\u008f\u00e5\u00bc1\u00f8p\u0083+\u00c33E\u00a7uz".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        i = lArray;
        j = new Integer[3];
    }

    @Override
    public Jt l() {
        return this.b;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (q[n5] != null) {
            return n5;
        }
        Object object = o[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 39;
                break;
            }
            case 1: {
                n4 = 15;
                break;
            }
            case 2: {
                n4 = 30;
                break;
            }
            case 3: {
                n4 = 34;
                break;
            }
            case 4: {
                n4 = 35;
                break;
            }
            case 5: {
                n4 = 13;
                break;
            }
            case 6: {
                n4 = 6;
                break;
            }
            case 7: {
                n4 = 25;
                break;
            }
            case 8: {
                n4 = 32;
                break;
            }
            case 9: {
                n4 = 41;
                break;
            }
            case 10: {
                n4 = 48;
                break;
            }
            case 11: {
                n4 = 29;
                break;
            }
            case 12: {
                n4 = 16;
                break;
            }
            case 13: {
                n4 = 43;
                break;
            }
            case 14: {
                n4 = 60;
                break;
            }
            case 15: {
                n4 = 61;
                break;
            }
            case 16: {
                n4 = 4;
                break;
            }
            case 17: {
                n4 = 57;
                break;
            }
            case 18: {
                n4 = 22;
                break;
            }
            case 19: {
                n4 = 10;
                break;
            }
            case 20: {
                n4 = 51;
                break;
            }
            case 21: {
                n4 = 58;
                break;
            }
            case 22: {
                n4 = 28;
                break;
            }
            case 23: {
                n4 = 12;
                break;
            }
            case 24: {
                n4 = 0;
                break;
            }
            case 25: {
                n4 = 23;
                break;
            }
            case 26: {
                n4 = 17;
                break;
            }
            case 27: {
                n4 = 53;
                break;
            }
            case 28: {
                n4 = 36;
                break;
            }
            case 29: {
                n4 = 46;
                break;
            }
            case 30: {
                n4 = 3;
                break;
            }
            case 31: {
                n4 = 24;
                break;
            }
            case 32: {
                n4 = 2;
                break;
            }
            case 33: {
                n4 = 62;
                break;
            }
            case 34: {
                n4 = 59;
                break;
            }
            case 35: {
                n4 = 14;
                break;
            }
            case 36: {
                n4 = 8;
                break;
            }
            case 37: {
                n4 = 27;
                break;
            }
            case 38: {
                n4 = 40;
                break;
            }
            case 39: {
                n4 = 38;
                break;
            }
            case 40: {
                n4 = 55;
                break;
            }
            case 41: {
                n4 = 37;
                break;
            }
            case 42: {
                n4 = 21;
                break;
            }
            case 43: {
                n4 = 42;
                break;
            }
            case 44: {
                n4 = 52;
                break;
            }
            case 45: {
                n4 = 33;
                break;
            }
            case 46: {
                n4 = 1;
                break;
            }
            case 47: {
                n4 = 18;
                break;
            }
            case 48: {
                n4 = 47;
                break;
            }
            case 49: {
                n4 = 26;
                break;
            }
            case 50: {
                n4 = 50;
                break;
            }
            case 51: {
                n4 = 54;
                break;
            }
            case 52: {
                n4 = 11;
                break;
            }
            case 53: {
                n4 = 9;
                break;
            }
            case 54: {
                n4 = 19;
                break;
            }
            case 55: {
                n4 = 31;
                break;
            }
            case 56: {
                n4 = 49;
                break;
            }
            case 57: {
                n4 = 44;
                break;
            }
            case 58: {
                n4 = 63;
                break;
            }
            case 59: {
                n4 = 56;
                break;
            }
            case 60: {
                n4 = 20;
                break;
            }
            case 61: {
                n4 = 5;
                break;
            }
            case 62: {
                n4 = 7;
                break;
            }
            default: {
                n4 = 45;
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
        _w.q[n5] = new String(cArray);
        return n5;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void c() {
        Object[] objectArray = o;
        o[0] = "Q5+";
        objectArray[1] = Integer.TYPE;
        _w.q[1] = "java/lang/Integer";
        objectArray[2] = "\u007f\u0014^#\b\u0011t\u001bOlu\tg\u001cF%";
        objectArray[3] = "\u000b_<(P\u0000\u0000P-g1\u000e\u000b[)=";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "F#\u0013\u0015\ft\r*R)\u001c2|pSK\u0011+\u0017s\u000b\u0014\u001dIE&\u0003L\n7@%V[w";
    }

    public _w(int n2, Jt jt2) {
        this.b = Jt.EQUALS;
        this.w = n2;
        this.b = jt2;
    }

    public _w(JsonObject jsonObject) {
        long l10 = d ^ 0x4D92BF4F8B1L;
        this.b = Jt.EQUALS;
        this.w = jsonObject.get((String)((Object)_w.e("\u00e2", (int)_w.b("k", (int)32016, (long)(0x14599AD1D7153D74L ^ l10)), (long)-742481857216125737L, (long)l10))).getAsInt();
        this.b = Jt.B(jsonObject.get((String)((Object)_w.e("\u00e2", (int)_w.b("k", (int)23260, (long)(0x500D2CC98EF19AB9L ^ l10)), (long)-742481857216125737L, (long)l10))).getAsString());
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = _w.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = _w.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method e(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    @Override
    public String G() {
        return String.valueOf(this.w);
    }

    public int y() {
        return this.w;
    }

    @Override
    public boolean T(V4 v42) {
        float f10;
        block7: {
            int n2;
            ET eT2;
            block9: {
                block8: {
                    try {
                        if (v42.Y()) {
                            return false;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw _w.a(numberFormatException);
                    }
                    f10 = 0.0f;
                    eT2 = v42.P();
                    try {
                        try {
                            if (eT2.j() <= 0) break block7;
                            if (kX.C() != 23) break block8;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw _w.a(numberFormatException);
                        }
                        n2 = 1;
                        break block9;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw _w.a(numberFormatException);
                    }
                }
                n2 = 0;
            }
            int n3 = n2;
            QB qB2 = new QB(eT2.F().toArray()[n3]);
            f10 += (float)qB2.y();
        }
        return this.b.B(f10, this.w);
    }

    private static Field k(long l10, long l11) {
        int n2 = _w.i(l10, l11);
        Object object = o[n2];
        if (object instanceof String) {
            String string = q[n2];
            int n3 = string.indexOf(8);
            Class clazz = _w.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = _w.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _w.e(clazz3, string2, clazz2)) != null) {
                    _w.o[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = _w.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        _w.o[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _w.j(251164031276312L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = _w.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    @Override
    public Ok A() {
        return Ok.ATTACK_DAMAGE;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x35D6;
        if (j[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = i[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/_w", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _w.j[n3] = n4;
        }
        return j[n3];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = _w.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/_w" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = _w.i(l10, l11);
            object = o[n2];
            try {
                if (!(object instanceof String)) break block2;
                _w.o[n2] = clazz = Class.forName(q[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = _w.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = _w.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/_w" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_w.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_w.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

