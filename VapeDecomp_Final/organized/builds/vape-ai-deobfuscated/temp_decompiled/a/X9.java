/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.AM;
import a.AQ;
import a.Ao;
import a.Bg;
import a.EP;
import a.FI;
import a.GK;
import a.Hz;
import a.KB;
import a.Na;
import a.OV;
import a.OY;
import a.O_;
import a.Qg;
import a.SE;
import a.XO;
import a._2;
import a.a;
import a.cp;
import a.d8;
import a.eM;
import a.ht;
import a.jU;
import a.jX;
import a.jd;
import a.jr;
import a.oV;
import a.on;
import a.rT;
import a.xY;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class x9
extends xY {
    private final jU V;
    private final jr N;
    private static final long b;
    private final cp L;
    private final jU Y;
    private final jX m;
    private final Bg B;
    private boolean O;
    private final jU z;
    private final jr P;
    private final jr l;
    private boolean w;
    private final cp K;
    private final jU r;
    private final jU R;
    private static final String[] X;
    private static final Object[] F;
    private static final Integer[] n;
    private final jd h;
    private static final long[] e;
    private final jX t;
    private static final Map v;
    private final jU G;

    public x9() {
        long l10 = b ^ 0x5B4B40FFAA11L;
        super(a.cs((int)x9.a("o", (int)20818, (long)(0x1CF8149FBE222D72L ^ l10))));
        this.z = jU.w(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)2846, (long)(0x7C1EF61865817730L ^ l10)), (long)8920610552205537094L, (long)l10)), true);
        this.l = new jr((String)((Object)x9.d("G", (int)x9.a("o", (int)18277, (long)(0x3CBB7D67885BB50L ^ l10)), (long)8920610552205537094L, (long)l10)));
        this.P = new jr((String)((Object)x9.d("G", (int)x9.a("o", (int)18521, (long)(0x5F89E62940113469L ^ l10)), (long)8920610552205537094L, (long)l10)));
        this.N = new jr((String)((Object)x9.d("G", (int)x9.a("o", (int)24584, (long)(0x6A48AD1106E81C24L ^ l10)), (long)8920610552205537094L, (long)l10)));
        this.h = jd.D(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)31966, (long)(0x1C65AB767E5C80F1L ^ l10)), (long)8920610552205537094L, (long)l10)), this.P, this.l, this.P, this.N);
        this.r = jU.w(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)31296, (long)(0x1B84BC2942798674L ^ l10)), (long)8920610552205537094L, (long)l10)), false);
        this.t = jX.P(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)28741, (long)(0x15CAA2FBAE1F8C6DL ^ l10)), (long)8920610552205537094L, (long)l10)), (String)((Object)x9.d("G", (int)x9.a("o", (int)29693, (long)(0x2A1A2DD00B260FCFL ^ l10)), (long)8920610552205537094L, (long)l10)), "", 1.0, 6.0, 13.0, 20.0);
        this.V = jU.w(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)5599, (long)(0xE086F30A04369F2L ^ l10)), (long)8920610552205537094L, (long)l10)), false);
        this.L = cp.r(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)1285, (long)(0x3313B483691B7933L ^ l10)), (long)8920610552205537094L, (long)l10)), (String)((Object)x9.d("G", (int)x9.a("o", (int)15257, (long)(0x2C79BA93DEFC7BCL ^ l10)), (long)8920610552205537094L, (long)l10)), cp.U, new FI((String)((Object)x9.d("G", (int)x9.a("o", (int)14820, (long)(0x143F922A476EC5C2L ^ l10)), (long)8920610552205537094L, (long)l10))));
        this.R = jU.R(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)22685, (long)(0x1EA8E9D2B9F624BAL ^ l10)), (long)8920610552205537094L, (long)l10)), false, (String)((Object)x9.d("G", (int)x9.a("o", (int)22730, (long)(0x5246F3D2292A4F9L ^ l10)), (long)8920610552205537094L, (long)l10)));
        this.Y = jU.w(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)9412, (long)(0xC5120E75285D8EDL ^ l10)), (long)8920610552205537094L, (long)l10)), false);
        this.m = jX.P(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)21047, (long)(0x6B6875172F312E1DL ^ l10)), (long)8920610552205537094L, (long)l10)), (String)((Object)x9.d("G", (int)x9.a("o", (int)25836, (long)(0x560299B1AEF398CEL ^ l10)), (long)8920610552205537094L, (long)l10)), "", 0.0, 0.0, 10.0, 2000.0);
        this.G = jU.w(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)15744, (long)(0x5DBBD2E4472841ABL ^ l10)), (long)8920610552205537094L, (long)l10)), false);
        this.K = cp.o(this, (String)((Object)x9.d("G", (int)x9.a("o", (int)858, (long)(0x22716B0A45C17F7BL ^ l10)), (long)8920610552205537094L, (long)l10)), (String)((Object)x9.d("G", (int)x9.a("o", (int)6783, (long)(0x5C74E691217CE64EL ^ l10)), (long)8920610552205537094L, (long)l10)), cp.U, Arrays.asList(new FI((String)((Object)x9.d("G", (int)x9.a("o", (int)30880, (long)(0x4DD87A83D0EE8497L ^ l10)), (long)8920610552205537094L, (long)l10))), new FI((String)((Object)x9.d("G", (int)x9.a("o", (int)31493, (long)(0x3FF961AA597E8721L ^ l10)), (long)8920610552205537094L, (long)l10)))));
        this.B = new Bg();
        this.w = false;
        this.O = false;
        this.V.l(this.L);
        this.V.E(this.L);
        this.Y.l(this.m, this.G);
        this.G.E(this.K);
        this.G.l(this.K);
        this.N(this.z, this.R, this.Y, this.m, this.G, this.K, this.t, this.h, this.r, this.V, this.L);
        OV oV2 = new OV(Hz.LEFT, this.t, this.V, this.L, this.z, this.h, this.r);
        this.u(oV2);
        this.t.Z(0);
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

    private static Field k(long l10, long l11) {
        int n2 = x9.i(l10, l11);
        Object object = F[n2];
        if (object instanceof String) {
            String string = X[n2];
            int n3 = string.indexOf(8);
            Class clazz = x9.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = x9.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = x9.e(clazz3, string2, clazz2)) != null) {
                    x9.F[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = x9.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        x9.F[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = x9.j(211221075485058L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void e() {
        Object[] objectArray = F;
        F[0] = "UCh";
        objectArray[1] = Integer.TYPE;
        x9.X[1] = "java/lang/Integer";
        objectArray[2] = "[J\u000eW8fPE\u001f\u0018E~CB\u0016Q";
        objectArray[3] = "$\u0017B\u001d !/\u0018SRA/$\u0013W\b";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0015\n$jC0L\u000b2\u0000\u0018.|O;n\u0001n\u0015\ft?soF\u000b5{\u0001<\u0005Q%\u0000";
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7ED;
        if (n[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])v.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    v.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/x9", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            x9.n[n3] = n4;
        }
        return n[n3];
    }

    private static Method l(long l10, long l11) {
        int n2 = x9.i(l10, l11);
        Object object = F[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = X[n2];
                int n4 = string2.indexOf(8);
                clazz3 = x9.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = x9.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = x9.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        x9.F[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = x9.j(211221075485058L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = x9.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        x9.F[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = x9.j(211221075485058L, 0L);
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

    @Override
    public boolean d() {
        boolean bl2;
        block8: {
            block7: {
                AM aM2 = SE.h.U().K(AM.class);
                try {
                    if (aM2 == null) {
                        return false;
                    }
                }
                catch (O_ o_2) {
                    throw x9.a(o_2);
                }
                try {
                    try {
                        if (!aM2.Z() || !aM2.e()) break block7;
                    }
                    catch (O_ o_3) {
                        throw x9.a(o_3);
                    }
                    bl2 = true;
                    break block8;
                }
                catch (O_ o_4) {
                    throw x9.a(o_4);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public String t() {
        long l10 = b ^ 0x2EF47CF43D1EL;
        return this.t.p() + (String)((Object)x9.d("G", (int)x9.a("o", (int)208, (long)(0x7C1C37E9BA41EBFCL ^ l10)), (long)-1386240381963438007L, (long)l10));
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00f4' || c10 == '\u00d8' || c10 == '\u00e0' || c10 == 'M') {
                field = x9.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00f4' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00d8' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = x9.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00df' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'G' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (X[n5] != null) {
            return n5;
        }
        Object object = F[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 62;
                break;
            }
            case 1: {
                n4 = 3;
                break;
            }
            case 2: {
                n4 = 29;
                break;
            }
            case 3: {
                n4 = 52;
                break;
            }
            case 4: {
                n4 = 61;
                break;
            }
            case 5: {
                n4 = 19;
                break;
            }
            case 6: {
                n4 = 17;
                break;
            }
            case 7: {
                n4 = 8;
                break;
            }
            case 8: {
                n4 = 18;
                break;
            }
            case 9: {
                n4 = 13;
                break;
            }
            case 10: {
                n4 = 56;
                break;
            }
            case 11: {
                n4 = 46;
                break;
            }
            case 12: {
                n4 = 2;
                break;
            }
            case 13: {
                n4 = 15;
                break;
            }
            case 14: {
                n4 = 16;
                break;
            }
            case 15: {
                n4 = 59;
                break;
            }
            case 16: {
                n4 = 24;
                break;
            }
            case 17: {
                n4 = 12;
                break;
            }
            case 18: {
                n4 = 6;
                break;
            }
            case 19: {
                n4 = 58;
                break;
            }
            case 20: {
                n4 = 4;
                break;
            }
            case 21: {
                n4 = 55;
                break;
            }
            case 22: {
                n4 = 54;
                break;
            }
            case 23: {
                n4 = 45;
                break;
            }
            case 24: {
                n4 = 25;
                break;
            }
            case 25: {
                n4 = 44;
                break;
            }
            case 26: {
                n4 = 7;
                break;
            }
            case 27: {
                n4 = 42;
                break;
            }
            case 28: {
                n4 = 39;
                break;
            }
            case 29: {
                n4 = 40;
                break;
            }
            case 30: {
                n4 = 0;
                break;
            }
            case 31: {
                n4 = 1;
                break;
            }
            case 32: {
                n4 = 27;
                break;
            }
            case 33: {
                n4 = 9;
                break;
            }
            case 34: {
                n4 = 33;
                break;
            }
            case 35: {
                n4 = 38;
                break;
            }
            case 36: {
                n4 = 34;
                break;
            }
            case 37: {
                n4 = 32;
                break;
            }
            case 38: {
                n4 = 22;
                break;
            }
            case 39: {
                n4 = 49;
                break;
            }
            case 40: {
                n4 = 20;
                break;
            }
            case 41: {
                n4 = 30;
                break;
            }
            case 42: {
                n4 = 10;
                break;
            }
            case 43: {
                n4 = 41;
                break;
            }
            case 44: {
                n4 = 47;
                break;
            }
            case 45: {
                n4 = 63;
                break;
            }
            case 46: {
                n4 = 48;
                break;
            }
            case 47: {
                n4 = 26;
                break;
            }
            case 48: {
                n4 = 53;
                break;
            }
            case 49: {
                n4 = 57;
                break;
            }
            case 50: {
                n4 = 51;
                break;
            }
            case 51: {
                n4 = 23;
                break;
            }
            case 52: {
                n4 = 37;
                break;
            }
            case 53: {
                n4 = 35;
                break;
            }
            case 54: {
                n4 = 28;
                break;
            }
            case 55: {
                n4 = 14;
                break;
            }
            case 56: {
                n4 = 60;
                break;
            }
            case 57: {
                n4 = 50;
                break;
            }
            case 58: {
                n4 = 5;
                break;
            }
            case 59: {
                n4 = 43;
                break;
            }
            case 60: {
                n4 = 11;
                break;
            }
            case 61: {
                n4 = 36;
                break;
            }
            case 62: {
                n4 = 21;
                break;
            }
            default: {
                n4 = 31;
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
        x9.X[n5] = new String(cArray);
        return n5;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = x9.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = x9.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public boolean L() {
        return this.w;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = x9.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public boolean V(Qg qg2) {
        block17: {
            block20: {
                block19: {
                    block18: {
                        try {
                            if (!rT.e()) {
                                this.B.m();
                            }
                        }
                        catch (O_ o_2) {
                            throw x9.a(o_2);
                        }
                        try {
                            try {
                                try {
                                    if (!this.Y.s().booleanValue() || !this.B.m((long)this.m.l())) break block17;
                                }
                                catch (O_ o_3) {
                                    throw x9.a(o_3);
                                }
                                if (!EP.X().B(eM.bN)) break block18;
                            }
                            catch (O_ o_4) {
                                throw x9.a(o_4);
                            }
                            return true;
                        }
                        catch (O_ o_5) {
                            throw x9.a(o_5);
                        }
                    }
                    try {
                        try {
                            if (!this.G.s().booleanValue() || this.K.H(qg2.K())) break block19;
                        }
                        catch (O_ o_6) {
                            throw x9.a(o_6);
                        }
                        return true;
                    }
                    catch (O_ o_7) {
                        throw x9.a(o_7);
                    }
                }
                on on2 = XO.b.m();
                try {
                    try {
                        if (!on2.r() || !on2.q().equals(oV.Y())) break block20;
                    }
                    catch (O_ o_8) {
                        throw x9.a(o_8);
                    }
                    return false;
                }
                catch (O_ o_9) {
                    throw x9.a(o_9);
                }
            }
            this.B.m();
        }
        return true;
    }

    @OY
    public void B(KB kB2) {
        block15: {
            block14: {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            this.w = this.c();
                                            if (!this.w || !GK.W().S().D()) break block14;
                                        }
                                        catch (O_ o_2) {
                                            throw x9.a(o_2);
                                        }
                                        if (!Ao.K.P) break block14;
                                    }
                                    catch (O_ o_3) {
                                        throw x9.a(o_3);
                                    }
                                    if (!EP.X().Y()) break block14;
                                }
                                catch (O_ o_4) {
                                    throw x9.a(o_4);
                                }
                                if (!this.A.M()) break block14;
                            }
                            catch (O_ o_5) {
                                throw x9.a(o_5);
                            }
                            if (EP.N().G().X()) break block14;
                        }
                        catch (O_ o_6) {
                            throw x9.a(o_6);
                        }
                        if (this.O) break block14;
                    }
                    catch (O_ o_7) {
                        throw x9.a(o_7);
                    }
                    this.O = true;
                    this.A.W();
                    break block15;
                }
                catch (O_ o_8) {
                    throw x9.a(o_8);
                }
            }
            this.O = false;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                x9.b = d8.a(2747044624503849192L, 4174956877164582915L, MethodHandles.lookup().lookupClass()).a(108888153938982L);
                x9.F = new Object[5];
                x9.X = new String[5];
                x9.e();
                x9.v = new HashMap<K, V>(13);
                var0 = x9.b ^ 31916268256386L;
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
                var8_3 = new long[24];
                var5_4 = 0;
                var6_5 = "\u00d1\u00f8F-\u00cfD\u009f\u00b8\u00df\u00ce\u00f9\u00b1I\u0083\r\u00a1\u00ea\u00ac\f\u00b9Q\u00d4\u00883gi\u00c0jG\u0018\u00c336Z\u00d4-)]M\u00b1\u0014[\u007f\u00b4\u00e7\u0007\u001b\u00f5\u00da\u000bw\u00d4\u00eb\u0013l[\u00cc)a\u00b9\u00ee\u00cf2\u00b7\u00a1r=\u00d8\u0003\u00fe\u00ad\u0016\u00a1\u000e\u00a0\u00b7\u000e\u0015\u00ee`\\\u00ee\u0095\u0001?\u00d1\u00f2r#\u00d1\u00b0~\u008e\u00c4\u00da\u00ff\u0096\u00cdW\u00fb\f\u00f6;S\u00fb\u00b7C\u00d1\u00bb\u00f0\u00d9Pp\u0017W\u0085q\u009d\u00e8~\u00c7S:\u0083\u00d9\u0089k\u00b8\u00d4\u00fe\u00abc\u00a1\u008b\u00afp\u00adfa\u00b1\u00e33T.Bl\u00be\u00ae\u00c9\u00cd\u00c1\u0003u\u001c\u0088<\u00b4\u00d9BB\u0088F8t\u0012\u00a4\u00a0N\u00f52\u00e9h\u00ca\u00aaJ8";
                var7_6 = "\u00d1\u00f8F-\u00cfD\u009f\u00b8\u00df\u00ce\u00f9\u00b1I\u0083\r\u00a1\u00ea\u00ac\f\u00b9Q\u00d4\u00883gi\u00c0jG\u0018\u00c336Z\u00d4-)]M\u00b1\u0014[\u007f\u00b4\u00e7\u0007\u001b\u00f5\u00da\u000bw\u00d4\u00eb\u0013l[\u00cc)a\u00b9\u00ee\u00cf2\u00b7\u00a1r=\u00d8\u0003\u00fe\u00ad\u0016\u00a1\u000e\u00a0\u00b7\u000e\u0015\u00ee`\\\u00ee\u0095\u0001?\u00d1\u00f2r#\u00d1\u00b0~\u008e\u00c4\u00da\u00ff\u0096\u00cdW\u00fb\f\u00f6;S\u00fb\u00b7C\u00d1\u00bb\u00f0\u00d9Pp\u0017W\u0085q\u009d\u00e8~\u00c7S:\u0083\u00d9\u0089k\u00b8\u00d4\u00fe\u00abc\u00a1\u008b\u00afp\u00adfa\u00b1\u00e33T.Bl\u00be\u00ae\u00c9\u00cd\u00c1\u0003u\u001c\u0088<\u00b4\u00d9BB\u0088F8t\u0012\u00a4\u00a0N\u00f52\u00e9h\u00ca\u00aaJ8".length();
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
                    var6_5 = "\u001eO\u00c8|\u000e\u00b8\b\u00b1q}\u00a5\u001a\u00c11\u0001\u00c2";
                    var7_6 = "\u001eO\u00c8|\u000e\u00b8\b\u00b1q}\u00a5\u001a\u00c11\u0001\u00c2".length();
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
        x9.e = var8_3;
        x9.n = new Integer[24];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = x9.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = x9.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = x9.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean c() {
        block17: {
            block18: {
                try {
                    if (!Ao.K.k()) {
                        return true;
                    }
                }
                catch (O_ o_2) {
                    throw x9.a(o_2);
                }
                try {
                    if (!GK.W().S().D()) {
                        return true;
                    }
                }
                catch (O_ o_3) {
                    throw x9.a(o_3);
                }
                try {
                    if (_2.d.p()) {
                        return true;
                    }
                }
                catch (O_ o_4) {
                    throw x9.a(o_4);
                }
                Qg qg2 = EP.U();
                try {
                    if (qg2.Y()) {
                        return true;
                    }
                }
                catch (O_ o_5) {
                    throw x9.a(o_5);
                }
                try {
                    try {
                        if (this.V(qg2)) break block17;
                        if (!rT.e()) break block18;
                    }
                    catch (O_ o_6) {
                        throw x9.a(o_6);
                    }
                    if (!EP.N().G().X()) {
                        // empty if block
                    }
                }
                catch (O_ o_7) {
                    throw x9.a(o_7);
                }
                this.T = true;
            }
            return true;
        }
        return false;
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = x9.i(l10, l11);
            object = F[n2];
            try {
                if (!(object instanceof String)) break block2;
                x9.F[n2] = clazz = Class.forName(X[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public boolean n(OV oV2, Qg qg2) {
        boolean bl2;
        int[] nArray;
        block9: {
            block8: {
                AQ aQ2;
                block7: {
                    long l10 = b ^ 0x5372C6F3D212L;
                    AQ aQ3 = SE.h.U().K(AQ.class);
                    nArray = Na.q();
                    try {
                        aQ2 = aQ3;
                        if (nArray != null) break block7;
                        if (aQ2 == null) break block8;
                    }
                    catch (O_ o_2) {
                        throw x9.a(o_2);
                    }
                    aQ2 = aQ3;
                }
                try {
                    bl2 = aQ2.L();
                    if (nArray != null) break block9;
                    if (!bl2) break block8;
                }
                catch (O_ o_3) {
                    throw x9.a(o_3);
                }
                bl2 = true;
                break block9;
            }
            bl2 = false;
        }
        try {
            if (nArray != null) {
                ht.I(new String[3]);
            }
        }
        catch (O_ o_4) {
            throw x9.a(o_4);
        }
        return bl2;
    }

    @Override
    public boolean f() {
        return this.R.s();
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(x9.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(x9.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

