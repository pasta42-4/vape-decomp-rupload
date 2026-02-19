/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package a;

import a.EP;
import a.Na;
import a.O_;
import a.QF;
import a.Qg;
import a.Qt;
import a.SE;
import a._Y;
import a.d8;
import a.eM;
import a.jE;
import a.jU;
import a.kX;
import a.rT;
import a.xi;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class j3
extends jE<Boolean[], j3> {
    private final jU S;
    private final List<jU> F;
    private static final long[] d;
    private static final Map h;
    private static final Integer[] g;
    private final jU o;
    private static final String[] m;
    private static final long a;
    private final jU y;
    private final jU D;
    private static final Object[] k;
    private final jU Y;
    private final jU e;
    boolean X;
    private final jU H;

    public j3(Object object, String string) {
        long l10 = a ^ 0x2357F7F1E68AL;
        super(object, string, new Boolean[7]);
        this.e = jU.v(this, (String)((Object)j3.d("\u00fb", (int)j3.b("j", (int)32652, (long)(0x3A413E74B95E0238L ^ l10)), (long)3803037823108135691L, (long)l10)) + this.x(), (String)((Object)j3.d("\u00fb", (int)j3.b("j", (int)14481, (long)(0x2D4D66D45D434527L ^ l10)), (long)3803037823108135691L, (long)l10)), true);
        this.S = jU.v(this, (String)((Object)j3.d("\u00fb", (int)j3.b("j", (int)21684, (long)(0x7A2D339E21972908L ^ l10)), (long)3803037823108135691L, (long)l10)) + this.x(), (String)((Object)j3.d("\u00fb", (int)j3.b("j", (int)17240, (long)(0x65754CC8B3573EE9L ^ l10)), (long)3803037823108135691L, (long)l10)), false);
        this.Y = jU.v(this, (String)((Object)j3.d("\u00fb", (int)j3.b("j", (int)1961, (long)(0x7770E476926F7A10L ^ l10)), (long)3803037823108135691L, (long)l10)) + this.x(), (String)((Object)j3.d("\u00fb", (int)j3.b("j", (int)19731, (long)(0x47F50281C4CD30ABL ^ l10)), (long)3803037823108135691L, (long)l10)), false);
        this.H = jU.v(this, (String)((Object)j3.d("\u00fb", (int)j3.b("j", (int)9962, (long)(0x1FF49A3050265B59L ^ l10)), (long)3803037823108135691L, (long)l10)) + this.x(), (String)((Object)j3.d("\u00fb", (int)j3.b("j", (int)20725, (long)(0x530796716E62D5EL ^ l10)), (long)3803037823108135691L, (long)l10)), false);
        this.y = jU.v(this, (String)((Object)j3.d("\u00fb", (int)j3.b("j", (int)23874, (long)(0x6AD6C8E34EC5A0F5L ^ l10)), (long)3803037823108135691L, (long)l10)) + this.x(), (String)((Object)j3.d("\u00fb", (int)j3.b("j", (int)6548, (long)(0x53AF98ED86F2E42FL ^ l10)), (long)3803037823108135691L, (long)l10)), false);
        this.D = jU.v(this, (String)((Object)j3.d("\u00fb", (int)j3.b("j", (int)13849, (long)(0x33A84ABA33B0CBA6L ^ l10)), (long)3803037823108135691L, (long)l10)) + this.x(), (String)((Object)j3.d("\u00fb", (int)j3.b("j", (int)27291, (long)(0x41D7D54AF3219726L ^ l10)), (long)3803037823108135691L, (long)l10)), false);
        this.o = jU.v(this, (String)((Object)j3.d("\u00fb", (int)j3.b("j", (int)21409, (long)(0x6950643629A22E13L ^ l10)), (long)3803037823108135691L, (long)l10)) + this.x(), (String)((Object)j3.d("\u00fb", (int)j3.b("j", (int)23087, (long)(0x43E125178C37A795L ^ l10)), (long)3803037823108135691L, (long)l10)), false);
        this.F = Arrays.asList(this.e, this.S, this.Y, this.H, this.y, this.D, this.o);
        try {
            for (int i10 = 0; i10 < this.F.size(); ++i10) {
                ((Boolean[])this.u())[i10] = (Boolean)this.F.get(i10).u();
                this.F.get(i10).P(this::lambda$new$0);
            }
        }
        catch (O_ o_2) {
            throw j3.a(o_2);
        }
    }

    private static Field g(long l10, long l11) {
        int n2 = j3.e(l10, l11);
        Object object = k[n2];
        if (object instanceof String) {
            String string = m[n2];
            int n3 = string.indexOf(8);
            Class clazz = j3.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = j3.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = j3.c(clazz3, string2, clazz2)) != null) {
                    j3.k[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = j3.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        j3.k[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = j3.f(226935739979993L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public JsonObject k(boolean bl2) {
        long l10 = a ^ 0xEAB7A82F8DDL;
        JsonObject jsonObject = this.y();
        jsonObject.addProperty((String)((Object)j3.d("\u00fb", (int)j3.b("j", (int)1394, (long)(0x53EA9D15A3CFE690L ^ l10)), (long)3067012080244565340L, (long)l10)), this.toString());
        return jsonObject;
    }

    private void lambda$new$0(jU jU2) {
        try {
            if (this.X) {
                return;
            }
        }
        catch (O_ o_2) {
            throw j3.a(o_2);
        }
        this.X = true;
        this.O(this.I());
        this.X = false;
    }

    public jU q() {
        return this.H;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = j3.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = j3.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = j3.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = j3.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public j3 L() {
        j3 j32 = new j3(null, this.x());
        return j32;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (m[n5] != null) {
            return n5;
        }
        Object object = k[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 55;
                break;
            }
            case 1: {
                n4 = 45;
                break;
            }
            case 2: {
                n4 = 23;
                break;
            }
            case 3: {
                n4 = 62;
                break;
            }
            case 4: {
                n4 = 37;
                break;
            }
            case 5: {
                n4 = 54;
                break;
            }
            case 6: {
                n4 = 38;
                break;
            }
            case 7: {
                n4 = 59;
                break;
            }
            case 8: {
                n4 = 46;
                break;
            }
            case 9: {
                n4 = 25;
                break;
            }
            case 10: {
                n4 = 24;
                break;
            }
            case 11: {
                n4 = 47;
                break;
            }
            case 12: {
                n4 = 7;
                break;
            }
            case 13: {
                n4 = 63;
                break;
            }
            case 14: {
                n4 = 49;
                break;
            }
            case 15: {
                n4 = 57;
                break;
            }
            case 16: {
                n4 = 35;
                break;
            }
            case 17: {
                n4 = 13;
                break;
            }
            case 18: {
                n4 = 61;
                break;
            }
            case 19: {
                n4 = 18;
                break;
            }
            case 20: {
                n4 = 21;
                break;
            }
            case 21: {
                n4 = 5;
                break;
            }
            case 22: {
                n4 = 30;
                break;
            }
            case 23: {
                n4 = 44;
                break;
            }
            case 24: {
                n4 = 22;
                break;
            }
            case 25: {
                n4 = 11;
                break;
            }
            case 26: {
                n4 = 50;
                break;
            }
            case 27: {
                n4 = 4;
                break;
            }
            case 28: {
                n4 = 58;
                break;
            }
            case 29: {
                n4 = 43;
                break;
            }
            case 30: {
                n4 = 41;
                break;
            }
            case 31: {
                n4 = 14;
                break;
            }
            case 32: {
                n4 = 31;
                break;
            }
            case 33: {
                n4 = 16;
                break;
            }
            case 34: {
                n4 = 12;
                break;
            }
            case 35: {
                n4 = 9;
                break;
            }
            case 36: {
                n4 = 60;
                break;
            }
            case 37: {
                n4 = 53;
                break;
            }
            case 38: {
                n4 = 10;
                break;
            }
            case 39: {
                n4 = 6;
                break;
            }
            case 40: {
                n4 = 17;
                break;
            }
            case 41: {
                n4 = 3;
                break;
            }
            case 42: {
                n4 = 29;
                break;
            }
            case 43: {
                n4 = 36;
                break;
            }
            case 44: {
                n4 = 48;
                break;
            }
            case 45: {
                n4 = 28;
                break;
            }
            case 46: {
                n4 = 1;
                break;
            }
            case 47: {
                n4 = 32;
                break;
            }
            case 48: {
                n4 = 56;
                break;
            }
            case 49: {
                n4 = 52;
                break;
            }
            case 50: {
                n4 = 34;
                break;
            }
            case 51: {
                n4 = 39;
                break;
            }
            case 52: {
                n4 = 15;
                break;
            }
            case 53: {
                n4 = 33;
                break;
            }
            case 54: {
                n4 = 42;
                break;
            }
            case 55: {
                n4 = 0;
                break;
            }
            case 56: {
                n4 = 27;
                break;
            }
            case 57: {
                n4 = 51;
                break;
            }
            case 58: {
                n4 = 2;
                break;
            }
            case 59: {
                n4 = 26;
                break;
            }
            case 60: {
                n4 = 19;
                break;
            }
            case 61: {
                n4 = 20;
                break;
            }
            case 62: {
                n4 = 8;
                break;
            }
            default: {
                n4 = 40;
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
        j3.m[n5] = new String(cArray);
        return n5;
    }

    @Override
    public List<jU> S() {
        return this.F;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x497D;
        if (g[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/j3", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            j3.g[n3] = n4;
        }
        return g[n3];
    }

    @Override
    public jU J() {
        return this.S;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = j3.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Method h(long l10, long l11) {
        int n2 = j3.e(l10, l11);
        Object object = k[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n2];
                int n4 = string2.indexOf(8);
                clazz3 = j3.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = j3.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = j3.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        j3.k[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = j3.f(226935739979993L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = j3.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        j3.k[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = j3.f(226935739979993L, 0L);
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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                j3.a = d8.a(-6014781282878724164L, 8557499955548310672L, MethodHandles.lookup().lookupClass()).a(156737390051242L);
                j3.k = new Object[5];
                j3.m = new String[5];
                j3.a();
                j3.h = new HashMap<K, V>(13);
                var0 = j3.a ^ 76605218439434L;
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
                var8_3 = new long[18];
                var5_4 = 0;
                var6_5 = "\u00eaB\u00a7+@G<)\f\u00cbn\u00e6:)g\u00d9\u00fc\u00cb\u00c9\u00ba\u00fb\u00f31\u0018\u00b3)#\u0081\u0002(\u00af,\u00b2L\u00c2\u00af\u00e4)\u00f9\u009d\u00fcd\u0007\u00f7c?\u0091:T\u00a3\u0082\u00de.\u00e4\u00b6H32\u00f5\u0001\u00e5;blI\u0007\u0019\u00ad\u00b7h\u00f2W\u0081D\u00e8\u00fd\\\u0013\u00a0\\\u00b4\u009br\u00a1\u00b9JlV\u001f\u00fbN`H\u008d\u00ae0H\u00dcb\u00be\u0082\u00fd.!k\u000b\u00ce\u0095M\u00a7y\u009ep\u00e6\u00c9R\u001a4\u00a3\u00072\u00f0\u0094\u00c2\u00dc\u00a8\u00f6\u0002";
                var7_6 = "\u00eaB\u00a7+@G<)\f\u00cbn\u00e6:)g\u00d9\u00fc\u00cb\u00c9\u00ba\u00fb\u00f31\u0018\u00b3)#\u0081\u0002(\u00af,\u00b2L\u00c2\u00af\u00e4)\u00f9\u009d\u00fcd\u0007\u00f7c?\u0091:T\u00a3\u0082\u00de.\u00e4\u00b6H32\u00f5\u0001\u00e5;blI\u0007\u0019\u00ad\u00b7h\u00f2W\u0081D\u00e8\u00fd\\\u0013\u00a0\\\u00b4\u009br\u00a1\u00b9JlV\u001f\u00fbN`H\u008d\u00ae0H\u00dcb\u00be\u0082\u00fd.!k\u000b\u00ce\u0095M\u00a7y\u009ep\u00e6\u00c9R\u001a4\u00a3\u00072\u00f0\u0094\u00c2\u00dc\u00a8\u00f6\u0002".length();
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
                    var6_5 = "a\u00bc\u00ae\u0092\u0085\u0006\u008d\u001d`\u0002H\u00ea\u00b6&\u0093U";
                    var7_6 = "a\u00bc\u00ae\u0092\u0085\u0006\u008d\u001d`\u0002H\u00ea\u00b6&\u0093U".length();
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
        j3.d = var8_3;
        j3.g = new Integer[18];
    }

    private static void a() {
        Object[] objectArray = k;
        k[0] = "D\u00182";
        objectArray[1] = Integer.TYPE;
        j3.m[1] = "java/lang/Integer";
        objectArray[2] = "M5G6D\u0014F:Vy9\fU=_0";
        objectArray[3] = "OSld$^D\\}+EPOWyq";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u001a\u000e\u0018F\u001c%\u0011J\u001cw\ro\u007f\u0000\u0018\u001e\u0000)\u000e\u001a\\If-\u0004\u001e\u0019\u0014^iB\u001e\rw";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/j3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean u(QF qF2) {
        block95: {
            boolean bl2;
            boolean bl3;
            block94: {
                block93: {
                    block90: {
                        boolean bl4;
                        Qt qt2;
                        Qg qg2;
                        block92: {
                            block91: {
                                boolean bl5;
                                boolean bl6;
                                block89: {
                                    block88: {
                                        boolean bl7;
                                        block86: {
                                            block85: {
                                                Class clazz;
                                                block83: {
                                                    block82: {
                                                        block81: {
                                                            block80: {
                                                                try {
                                                                    if (qF2.Y()) {
                                                                        return false;
                                                                    }
                                                                }
                                                                catch (O_ o_2) {
                                                                    throw j3.a(o_2);
                                                                }
                                                                try {
                                                                    if (rT.U(qF2)) {
                                                                        return false;
                                                                    }
                                                                }
                                                                catch (O_ o_3) {
                                                                    throw j3.a(o_3);
                                                                }
                                                                try {
                                                                    try {
                                                                        if (this.Y.s().booleanValue() || !qF2.B(eM.YD)) break block80;
                                                                    }
                                                                    catch (O_ o_4) {
                                                                        throw j3.a(o_4);
                                                                    }
                                                                    return false;
                                                                }
                                                                catch (O_ o_5) {
                                                                    throw j3.a(o_5);
                                                                }
                                                            }
                                                            qg2 = EP.U();
                                                            try {
                                                                if (qF2.equals(qg2)) {
                                                                    return false;
                                                                }
                                                            }
                                                            catch (O_ o_6) {
                                                                throw j3.a(o_6);
                                                            }
                                                            try {
                                                                if (!qF2.B(eM.Ut)) {
                                                                    return false;
                                                                }
                                                            }
                                                            catch (O_ o_7) {
                                                                throw j3.a(o_7);
                                                            }
                                                            try {
                                                                try {
                                                                    if (kX.C() <= 13 || !qF2.B(eM.PR)) break block81;
                                                                }
                                                                catch (O_ o_8) {
                                                                    throw j3.a(o_8);
                                                                }
                                                                return false;
                                                            }
                                                            catch (O_ o_9) {
                                                                throw j3.a(o_9);
                                                            }
                                                        }
                                                        qt2 = new Qt(qF2.M());
                                                        try {
                                                            if (qt2.e() <= 0.0f) {
                                                                return false;
                                                            }
                                                        }
                                                        catch (O_ o_10) {
                                                            throw j3.a(o_10);
                                                        }
                                                        try {
                                                            try {
                                                                if (!this.D.s().booleanValue() || !_Y.X(qt2)) break block82;
                                                            }
                                                            catch (O_ o_11) {
                                                                throw j3.a(o_11);
                                                            }
                                                            return false;
                                                        }
                                                        catch (O_ o_12) {
                                                            throw j3.a(o_12);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (!this.o.s().booleanValue() || qg2.X(qF2)) break block83;
                                                        }
                                                        catch (O_ o_13) {
                                                            throw j3.a(o_13);
                                                        }
                                                        return false;
                                                    }
                                                    catch (O_ o_14) {
                                                        throw j3.a(o_14);
                                                    }
                                                }
                                                try {
                                                    if (SE.h.j().h(qt2)) {
                                                        return false;
                                                    }
                                                }
                                                catch (O_ o_15) {
                                                    throw j3.a(o_15);
                                                }
                                                bl6 = qF2.B(eM.Pr);
                                                try {
                                                    clazz = Na.MC_1_21_4.H() ? eM.Ef : eM.tL;
                                                }
                                                catch (O_ o_16) {
                                                    throw j3.a(o_16);
                                                }
                                                Class clazz2 = clazz;
                                                try {
                                                    block84: {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (qF2.B(clazz2) || qF2.B(eM.o)) break block84;
                                                                }
                                                                catch (O_ o_17) {
                                                                    throw j3.a(o_17);
                                                                }
                                                                if (qF2.B(eM.M)) break block84;
                                                            }
                                                            catch (O_ o_18) {
                                                                throw j3.a(o_18);
                                                            }
                                                            if (!qF2.B(eM.Y)) break block85;
                                                        }
                                                        catch (O_ o_19) {
                                                            throw j3.a(o_19);
                                                        }
                                                    }
                                                    bl7 = true;
                                                    break block86;
                                                }
                                                catch (O_ o_20) {
                                                    throw j3.a(o_20);
                                                }
                                            }
                                            bl7 = false;
                                        }
                                        bl3 = bl7;
                                        try {
                                            block87: {
                                                try {
                                                    try {
                                                        if (qF2.B(eM.P9) || qF2.B(eM.P1)) break block87;
                                                    }
                                                    catch (O_ o_21) {
                                                        throw j3.a(o_21);
                                                    }
                                                    if (!qF2.B(eM.Yn)) break block88;
                                                }
                                                catch (O_ o_22) {
                                                    throw j3.a(o_22);
                                                }
                                            }
                                            bl5 = true;
                                            break block89;
                                        }
                                        catch (O_ o_23) {
                                            throw j3.a(o_23);
                                        }
                                    }
                                    bl5 = false;
                                }
                                bl2 = bl5;
                                try {
                                    try {
                                        if (!bl6) break block90;
                                        if (this.e.s().booleanValue()) break block91;
                                    }
                                    catch (O_ o_24) {
                                        throw j3.a(o_24);
                                    }
                                    return false;
                                }
                                catch (O_ o_25) {
                                    throw j3.a(o_25);
                                }
                            }
                            try {
                                if (SE.h.g().Q(qF2.e())) {
                                    return true;
                                }
                            }
                            catch (O_ o_26) {
                                throw j3.a(o_26);
                            }
                            try {
                                try {
                                    if (!this.y.s().booleanValue() || !_Y.F(qt2)) break block92;
                                }
                                catch (O_ o_27) {
                                    throw j3.a(o_27);
                                }
                                return false;
                            }
                            catch (O_ o_28) {
                                throw j3.a(o_28);
                            }
                        }
                        try {
                            if (SE.h.a().H(qg2, qt2)) {
                                return false;
                            }
                        }
                        catch (O_ o_29) {
                            throw j3.a(o_29);
                        }
                        try {
                            bl4 = !SE.h.a().P(qt2);
                        }
                        catch (O_ o_30) {
                            throw j3.a(o_30);
                        }
                        return bl4;
                    }
                    try {
                        try {
                            if (!bl3 || this.S.s().booleanValue()) break block93;
                        }
                        catch (O_ o_31) {
                            throw j3.a(o_31);
                        }
                        return false;
                    }
                    catch (O_ o_32) {
                        throw j3.a(o_32);
                    }
                }
                try {
                    try {
                        if (!bl2 || this.Y.s().booleanValue()) break block94;
                    }
                    catch (O_ o_33) {
                        throw j3.a(o_33);
                    }
                    return false;
                }
                catch (O_ o_34) {
                    throw j3.a(o_34);
                }
            }
            try {
                try {
                    try {
                        if (bl3 || bl2) break block95;
                    }
                    catch (O_ o_35) {
                        throw j3.a(o_35);
                    }
                    if (this.Y.s().booleanValue()) break block95;
                }
                catch (O_ o_36) {
                    throw j3.a(o_36);
                }
                return false;
            }
            catch (O_ o_37) {
                throw j3.a(o_37);
            }
        }
        return true;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e9' || c10 == '\u00f3' || c10 == 'E' || c10 == '\u00cd') {
                field = j3.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e9' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00f3' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'E' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = j3.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00aa' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00fb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public jU z() {
        return this.D;
    }

    public Boolean[] I() {
        Boolean[] booleanArray = new Boolean[this.F.size()];
        try {
            for (int i10 = 0; i10 < this.F.size(); ++i10) {
                booleanArray[i10] = this.F.get(i10).s();
            }
        }
        catch (O_ o_2) {
            throw j3.a(o_2);
        }
        return booleanArray;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static j3 L(xi xi2) {
        long l10 = a ^ 0x406720ED3520L;
        return new j3(xi2, (String)((Object)j3.d("\u00fb", (int)j3.b("j", (int)13817, (long)(0x47096A8984319BE3L ^ l10)), (long)-1770625002918319967L, (long)l10)) + xi2.O());
    }

    public jU t() {
        return this.o;
    }

    @Override
    public boolean C(JsonObject jsonObject) {
        boolean bl2 = super.C(jsonObject);
        this.i(this.toString());
        return bl2;
    }

    public void O(Boolean[] booleanArray) {
        try {
            for (int i10 = 0; i10 < this.F.size(); ++i10) {
                this.F.get(i10).H(booleanArray[i10]);
            }
        }
        catch (O_ o_2) {
            throw j3.a(o_2);
        }
        super.H(booleanArray);
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = j3.e(l10, l11);
            object = k[n2];
            try {
                if (!(object instanceof String)) break block2;
                j3.k[n2] = clazz = Class.forName(m[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public boolean p() {
        return this.F.stream().allMatch(jE::p);
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

    @Override
    public jU G() {
        return this.Y;
    }

    public jU c() {
        return this.e;
    }

    @Override
    public void W() {
        super.W();
        if (this.s()) {
            for (jU jU2 : this.F) {
                jU2.W();
            }
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/j3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public String toString() {
        long l10 = a ^ 0x654E9600E21BL;
        StringBuilder stringBuilder = new StringBuilder();
        for (jU jU2 : this.F) {
            CallSite callSite;
            StringBuilder stringBuilder2;
            try {
                stringBuilder2 = stringBuilder;
                callSite = jU2.s() != false ? j3.d("\u00fb", (int)j3.b("j", (int)18659, (long)(0x7972B58EC637B1D8L ^ l10)), (long)3483073450242555802L, (long)l10) : j3.d("\u00fb", (int)j3.b("j", (int)22857, (long)(0x67A1FFB065232066L ^ l10)), (long)3483073450242555802L, (long)l10);
            }
            catch (O_ o_2) {
                throw j3.a(o_2);
            }
            stringBuilder2.append((String)((Object)callSite));
        }
        return stringBuilder.toString();
    }

    @Override
    public void i(String string) {
        int n2 = 0;
        while (true) {
            boolean bl2;
            jU jU2;
            try {
                try {
                    if (n2 >= string.toCharArray().length || this.F.size() <= n2) {
                        break;
                    }
                }
                catch (O_ o_2) {
                    throw j3.a(o_2);
                }
            }
            catch (O_ o_3) {
                throw j3.a(o_3);
            }
            try {
                jU2 = this.F.get(n2);
                bl2 = string.charAt(n2) == '1';
            }
            catch (O_ o_4) {
                throw j3.a(o_4);
            }
            jU2.H(bl2);
            ++n2;
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = j3.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public jU u() {
        return this.y;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(j3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(j3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

