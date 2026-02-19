/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.BB;
import a.BL;
import a.Bb;
import a.G5;
import a.O_;
import a.bE;
import a.d8;
import a.ht;
import a.w2;
import a.wF;
import a.wM;
import a.wR;
import a.yG;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
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
public class we
extends yG {
    private static final String[] mb;
    private static final Object[] lb;
    private static final Map fb;
    private w2 Q9;
    private static final Integer[] eb;
    private final yG Qq;
    private final yG QX;
    private static final long[] bb;
    private static final long ab;
    private HashMap<BL, wM> Qn;

    private static Method l(long l10, long l11) {
        int n2 = we.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = mb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = we.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = we.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = we.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        we.lb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = we.j(223750357285615L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = we.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        we.lb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = we.j(223750357285615L, 0L);
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

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void o(BL bL2) {
        wM wM2 = bL2 instanceof Bb ? new wR((Bb)bL2) : new wF((BB)bL2);
        this.Qn.put(bL2, wM2);
        this.z();
    }

    public HashMap<BL, wM> I() {
        return this.Qn;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = we.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = we.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void W(BL bL2) {
        wM wM2 = this.Qn.remove(bL2);
        try {
            if (wM2 == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw we.a(o_2);
        }
        this.z();
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/we" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String lambda$refreshList$0(wM wM2) {
        return wM2.m().s().j();
    }

    @Override
    public double e() {
        return 100.0;
    }

    @Override
    public double z() {
        return this.QX.b() + (this.Q9.Q() + 2.0);
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = we.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = we.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = we.i(l10, l11);
            object = lb[n2];
            try {
                if (!(object instanceof String)) break block2;
                we.lb[n2] = clazz = Class.forName(mb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00d5' || c10 == 'e' || c10 == '\u00cd' || c10 == 'p') {
                field = we.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00d5' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'e' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00cd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = we.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'l' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'M' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public we() {
        long l10 = ab ^ 0x3FDAF7254B32L;
        super(96.0, 16.0);
        this.QX = new yG(100.0, 8.0);
        this.Qq = new yG(100.0, 90.0);
        this.Qn = new HashMap();
        this.Q9 = new w2();
        this.d().f((String)((Object)we.d("M", (int)we.c("n", (int)19621, (long)(0x2F5230665F1EFD7AL ^ l10)), (long)8417252028970913861L, (long)l10)));
        this.i(false);
        this.QX.i(false);
        this.QX.d().J(true);
        this.Qq.d().f((String)((Object)we.d("M", (int)we.c("n", (int)30825, (long)(0x5E77C77E1187C9B5L ^ l10)), (long)8417252028970913861L, (long)l10)));
        this.Qq.o(new bE(1.0, 2.0), this.Q9);
        this.o(this.QX, this.Qq);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/we" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x450D;
        if (eb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = bb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/we", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            we.eb[n3] = n4;
        }
        return eb[n3];
    }

    private static Field k(long l10, long l11) {
        int n2 = we.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            String string = mb[n2];
            int n3 = string.indexOf(8);
            Class clazz = we.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = we.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = we.e(clazz3, string2, clazz2)) != null) {
                    we.lb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = we.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        we.lb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = we.j(223750357285615L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void E() {
        long l10 = ab ^ 0x539939BC52DBL;
        super.E();
        G5 g5 = this.t(0.7);
        String string = this.Q9.l() + (String)((Object)we.d("M", (int)we.c("n", (int)13094, (long)(0x2239921CC5459B11L ^ l10)), (long)7870456361461893548L, (long)l10));
        CallSite callSite = we.d("M", (int)we.c("n", (int)21017, (long)(0x1F6CA1CDA1177A2DL ^ l10)), (long)7870456361461893548L, (long)l10);
        double d2 = g5.D(string) + 1.0;
        double d3 = (this.QX.b() - g5.B((String)((Object)callSite))) / 2.0;
        g5.R(string, this.QX.G() + 1.0, this.QX.W() + d3, we.M.c);
        g5.R((String)((Object)callSite), this.QX.G() + d2 + 1.0, this.QX.W() + d3, we.M.w);
    }

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (mb[n5] != null) {
            return n5;
        }
        Object object = lb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 42;
                break;
            }
            case 1: {
                n4 = 60;
                break;
            }
            case 2: {
                n4 = 19;
                break;
            }
            case 3: {
                n4 = 25;
                break;
            }
            case 4: {
                n4 = 45;
                break;
            }
            case 5: {
                n4 = 54;
                break;
            }
            case 6: {
                n4 = 30;
                break;
            }
            case 7: {
                n4 = 39;
                break;
            }
            case 8: {
                n4 = 31;
                break;
            }
            case 9: {
                n4 = 53;
                break;
            }
            case 10: {
                n4 = 20;
                break;
            }
            case 11: {
                n4 = 10;
                break;
            }
            case 12: {
                n4 = 17;
                break;
            }
            case 13: {
                n4 = 36;
                break;
            }
            case 14: {
                n4 = 28;
                break;
            }
            case 15: {
                n4 = 56;
                break;
            }
            case 16: {
                n4 = 15;
                break;
            }
            case 17: {
                n4 = 5;
                break;
            }
            case 18: {
                n4 = 37;
                break;
            }
            case 19: {
                n4 = 43;
                break;
            }
            case 20: {
                n4 = 0;
                break;
            }
            case 21: {
                n4 = 35;
                break;
            }
            case 22: {
                n4 = 24;
                break;
            }
            case 23: {
                n4 = 48;
                break;
            }
            case 24: {
                n4 = 1;
                break;
            }
            case 25: {
                n4 = 62;
                break;
            }
            case 26: {
                n4 = 3;
                break;
            }
            case 27: {
                n4 = 55;
                break;
            }
            case 28: {
                n4 = 50;
                break;
            }
            case 29: {
                n4 = 47;
                break;
            }
            case 30: {
                n4 = 11;
                break;
            }
            case 31: {
                n4 = 44;
                break;
            }
            case 32: {
                n4 = 12;
                break;
            }
            case 33: {
                n4 = 22;
                break;
            }
            case 34: {
                n4 = 40;
                break;
            }
            case 35: {
                n4 = 16;
                break;
            }
            case 36: {
                n4 = 29;
                break;
            }
            case 37: {
                n4 = 51;
                break;
            }
            case 38: {
                n4 = 46;
                break;
            }
            case 39: {
                n4 = 18;
                break;
            }
            case 40: {
                n4 = 27;
                break;
            }
            case 41: {
                n4 = 61;
                break;
            }
            case 42: {
                n4 = 38;
                break;
            }
            case 43: {
                n4 = 41;
                break;
            }
            case 44: {
                n4 = 9;
                break;
            }
            case 45: {
                n4 = 34;
                break;
            }
            case 46: {
                n4 = 63;
                break;
            }
            case 47: {
                n4 = 26;
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
                n4 = 57;
                break;
            }
            case 51: {
                n4 = 2;
                break;
            }
            case 52: {
                n4 = 7;
                break;
            }
            case 53: {
                n4 = 49;
                break;
            }
            case 54: {
                n4 = 13;
                break;
            }
            case 55: {
                n4 = 8;
                break;
            }
            case 56: {
                n4 = 4;
                break;
            }
            case 57: {
                n4 = 58;
                break;
            }
            case 58: {
                n4 = 32;
                break;
            }
            case 59: {
                n4 = 59;
                break;
            }
            case 60: {
                n4 = 33;
                break;
            }
            case 61: {
                n4 = 14;
                break;
            }
            case 62: {
                n4 = 6;
                break;
            }
            default: {
                n4 = 52;
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
        we.mb[n5] = new String(cArray);
        return n5;
    }

    public void z() {
        ArrayList<wM> arrayList = new ArrayList<wM>(this.Qn.values());
        arrayList.sort(Comparator.comparing(we::lambda$refreshList$0));
        ArrayList<wM> arrayList2 = new ArrayList<wM>();
        for (wM wM2 : arrayList) {
            try {
                if (!(wM2.m() instanceof Bb)) continue;
                arrayList2.add(wM2);
            }
            catch (O_ o_2) {
                throw we.a(o_2);
            }
        }
        for (wM wM2 : arrayList) {
            try {
                if (!(wM2.m() instanceof BB)) continue;
                arrayList2.add(wM2);
            }
            catch (O_ o_3) {
                throw we.a(o_3);
            }
        }
        this.Q9.k();
        this.Q9.o(arrayList2.toArray(new ht[0]));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                we.ab = d8.a(3884076710145267754L, -1103252392446507293L, MethodHandles.lookup().lookupClass()).a(217635838563207L);
                we.lb = new Object[5];
                we.mb = new String[5];
                we.x();
                we.fb = new HashMap<K, V>(13);
                var0 = we.ab ^ 108288625819352L;
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
                var6_5 = "\u00d4e\u0093\u00c1(\u00d2\u00b4\u001d\u00bb\u00a7/\u0084l\u0097n\u009d";
                var7_6 = "\u00d4e\u0093\u00c1(\u00d2\u00b4\u001d\u00bb\u00a7/\u0084l\u0097n\u009d".length();
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
                    var6_5 = "\u00d9\u0005/ 'Yf#\u0095{\u00c9\u0081\u00f1\u0007M\u009b";
                    var7_6 = "\u00d9\u0005/ 'Yf#\u0095{\u00c9\u0081\u00f1\u0007M\u009b".length();
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
        we.bb = var8_3;
        we.eb = new Integer[4];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = we.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "{x}";
        objectArray[1] = Integer.TYPE;
        we.mb[1] = "java/lang/Integer";
        objectArray[2] = "=o\u0013R/p6`\u0002\u001dRh%g\u000bT";
        objectArray[3] = "\\'=i\u0012ZW(,&sT\\#(|";
        Object[] objectArray2 = objectArray;
        objectArray[4] = " \"=uZ\u0005 |m\u0012H\u0005L%8\"YF}-hc\\~ubi/Y\u0013v{(k#";
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

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = we.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(we.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(we.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

