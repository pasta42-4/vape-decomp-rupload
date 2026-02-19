/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.FM;
import a.NO;
import a.O_;
import a.a;
import a.d8;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Na
extends Enum<Na> {
    public static final /* enum */ Na MC_1_21_0;
    public static final /* enum */ Na MC_1_21_10;
    public static final /* enum */ Na MC_1_16_5;
    public static final /* enum */ Na MC_1_20_6;
    public static final /* enum */ Na MC_1_16_5_ACTUAL;
    private final int Q;
    private static final String[] b;
    public static final /* enum */ Na MC_1_21_6;
    public static final /* enum */ Na MC_1_21_5;
    public static final /* enum */ Na MC_1_21_4;
    public static final /* enum */ Na MC_1_8_9;
    public static final /* enum */ Na MC_1_12_2;
    private static final Na[] h;
    public static int gameVersion;
    private static int[] R;
    private static final Object[] a;
    public static final /* enum */ Na MC_1_7_10;
    public static final /* enum */ Na MC_1_21_11;

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Na" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = a;
        a[0] = "\n\fS";
        objectArray[1] = Integer.TYPE;
        Na.b[1] = "java/lang/Integer";
        objectArray[2] = "d1]~5Qo>L1HI|9Ex";
        objectArray[3] = "\u000bYb*RE\u0000Vse3K\u000b]w?";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "t\u001eLNaB#X\u0014?w\u0006I\u001b\u001d\u0007!BySIX`}s\u001b\b\u0007{\u001c)\u0019J^\u001c";
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

    public boolean H() {
        return this.R().m();
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (b[n5] != null) {
            return n5;
        }
        Object object = a[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 44;
                break;
            }
            case 1: {
                n4 = 47;
                break;
            }
            case 2: {
                n4 = 35;
                break;
            }
            case 3: {
                n4 = 56;
                break;
            }
            case 4: {
                n4 = 36;
                break;
            }
            case 5: {
                n4 = 63;
                break;
            }
            case 6: {
                n4 = 50;
                break;
            }
            case 7: {
                n4 = 25;
                break;
            }
            case 8: {
                n4 = 17;
                break;
            }
            case 9: {
                n4 = 53;
                break;
            }
            case 10: {
                n4 = 23;
                break;
            }
            case 11: {
                n4 = 61;
                break;
            }
            case 12: {
                n4 = 11;
                break;
            }
            case 13: {
                n4 = 49;
                break;
            }
            case 14: {
                n4 = 59;
                break;
            }
            case 15: {
                n4 = 31;
                break;
            }
            case 16: {
                n4 = 9;
                break;
            }
            case 17: {
                n4 = 40;
                break;
            }
            case 18: {
                n4 = 39;
                break;
            }
            case 19: {
                n4 = 52;
                break;
            }
            case 20: {
                n4 = 37;
                break;
            }
            case 21: {
                n4 = 62;
                break;
            }
            case 22: {
                n4 = 14;
                break;
            }
            case 23: {
                n4 = 55;
                break;
            }
            case 24: {
                n4 = 26;
                break;
            }
            case 25: {
                n4 = 58;
                break;
            }
            case 26: {
                n4 = 60;
                break;
            }
            case 27: {
                n4 = 48;
                break;
            }
            case 28: {
                n4 = 2;
                break;
            }
            case 29: {
                n4 = 0;
                break;
            }
            case 30: {
                n4 = 54;
                break;
            }
            case 31: {
                n4 = 32;
                break;
            }
            case 32: {
                n4 = 22;
                break;
            }
            case 33: {
                n4 = 34;
                break;
            }
            case 34: {
                n4 = 38;
                break;
            }
            case 35: {
                n4 = 5;
                break;
            }
            case 36: {
                n4 = 19;
                break;
            }
            case 37: {
                n4 = 15;
                break;
            }
            case 38: {
                n4 = 28;
                break;
            }
            case 39: {
                n4 = 13;
                break;
            }
            case 40: {
                n4 = 57;
                break;
            }
            case 41: {
                n4 = 10;
                break;
            }
            case 42: {
                n4 = 4;
                break;
            }
            case 43: {
                n4 = 30;
                break;
            }
            case 44: {
                n4 = 43;
                break;
            }
            case 45: {
                n4 = 21;
                break;
            }
            case 46: {
                n4 = 1;
                break;
            }
            case 47: {
                n4 = 29;
                break;
            }
            case 48: {
                n4 = 16;
                break;
            }
            case 49: {
                n4 = 27;
                break;
            }
            case 50: {
                n4 = 8;
                break;
            }
            case 51: {
                n4 = 12;
                break;
            }
            case 52: {
                n4 = 18;
                break;
            }
            case 53: {
                n4 = 51;
                break;
            }
            case 54: {
                n4 = 7;
                break;
            }
            case 55: {
                n4 = 6;
                break;
            }
            case 56: {
                n4 = 41;
                break;
            }
            case 57: {
                n4 = 33;
                break;
            }
            case 58: {
                n4 = 20;
                break;
            }
            case 59: {
                n4 = 42;
                break;
            }
            case 60: {
                n4 = 45;
                break;
            }
            case 61: {
                n4 = 46;
                break;
            }
            case 62: {
                n4 = 24;
                break;
            }
            default: {
                n4 = 3;
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
        Na.b[n5] = new String(cArray);
        return n5;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = Na.a(l10, l11);
            object = a[n2];
            try {
                if (!(object instanceof String)) break block2;
                Na.a[n2] = clazz = Class.forName(b[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static int[] q() {
        return R;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00a4' || c10 == '\u00aa' || c10 == '\u00d1' || c10 == '\u00ea') {
                field = Na.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00a4' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00aa' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00d1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Na.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'k' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static int u() {
        try {
            if (gameVersion != 0) {
                return gameVersion;
            }
        }
        catch (O_ o_2) {
            throw Na.a(o_2);
        }
        gameVersion = a.a.gmv();
        return gameVersion;
    }

    public static void N(int[] nArray) {
        R = nArray;
    }

    public static Na valueOf(String string) {
        return Enum.valueOf(Na.class, string);
    }

    private Na(int n3) {
        this.Q = n3;
    }

    public boolean Q() {
        return this.g().m();
    }

    public FM R() {
        return new FM(this, NO.GREATHER_THAN_OR_EQUAL);
    }

    private static Field c(long l10, long l11) {
        int n2 = Na.a(l10, l11);
        Object object = a[n2];
        if (object instanceof String) {
            String string = b[n2];
            int n3 = string.indexOf(8);
            Class clazz = Na.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = Na.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Na.a(clazz3, string2, clazz2)) != null) {
                    Na.a[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = Na.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        Na.a[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Na.b(250781374287562L, 0L);
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
        block10: {
            block9: {
                var11 = d8.a(5475863229343023847L, -5481270839922093319L, MethodHandles.lookup().lookupClass()).a(99394584594709L) ^ 108070093103156L;
                Na.a = new Object[5];
                Na.b = new String[5];
                Na.a();
                if (Na.q() != null) {
                    Na.N(new int[1]);
                }
                var1_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var11 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[12];
                var4_4 = 0;
                var5_5 = "\u00b2.\u00f0\u00f7\u00fa\u00dd\u00de\u00a6\u00e6-\u00ae\u008b\u001b\u00c4\u0087\u00f8\u00a7\u008ca\u00c8:q\u00e4\u00f4\b>I\u00f1\u00faj )\u0005=\u00b4\u0001\u00bc\u00c4\u0080zs\u008eJ\u0094N\u00dd<\u008bB\u00b4]\u00a6\u00d8\u00f6Wd\u00cf|\u00d0\u0084t\u00db\u00d0CE\u00b2\u00cb]\u0000\u00ab\u00d0\u001cJ\u00a7\u00e4vT#(d";
                var6_6 = "\u00b2.\u00f0\u00f7\u00fa\u00dd\u00de\u00a6\u00e6-\u00ae\u008b\u001b\u00c4\u0087\u00f8\u00a7\u008ca\u00c8:q\u00e4\u00f4\b>I\u00f1\u00faj )\u0005=\u00b4\u0001\u00bc\u00c4\u0080zs\u008eJ\u0094N\u00dd<\u008bB\u00b4]\u00a6\u00d8\u00f6Wd\u00cf|\u00d0\u0084t\u00db\u00d0CE\u00b2\u00cb]\u0000\u00ab\u00d0\u001cJ\u00a7\u00e4vT#(d".length();
                var3_7 = 0;
                while (true) {
                    var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var4_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block9;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    var5_5 = "\u00f0\u00c6u\u00ca\u00d5\u009a\u0010X\n\u00e78W\u0019E\u0089\u0082";
                    var6_6 = "\u00f0\u00c6u\u00ca\u00d5\u009a\u0010X\n\u00e78W\u0019E\u0089\u0082".length();
                    var3_7 = 0;
                    while (true) {
                        var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var4_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block9;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    break block10;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var1_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
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
        Na.MC_1_7_10 = new Na(13);
        Na.MC_1_8_9 = new Na(15);
        Na.MC_1_12_2 = new Na(23);
        Na.MC_1_16_5 = new Na(35);
        Na.MC_1_16_5_ACTUAL = new Na(36);
        Na.MC_1_20_6 = new Na(50);
        Na.MC_1_21_0 = new Na(51);
        Na.MC_1_21_4 = new Na(54);
        Na.MC_1_21_5 = new Na(55);
        Na.MC_1_21_6 = new Na(56);
        Na.MC_1_21_10 = new Na(60);
        Na.MC_1_21_11 = new Na(61);
        Na.h = new Na[]{Na.MC_1_7_10, Na.MC_1_8_9, Na.MC_1_12_2, Na.MC_1_16_5, Na.MC_1_16_5_ACTUAL, Na.MC_1_20_6, Na.MC_1_21_0, Na.MC_1_21_4, Na.MC_1_21_5, Na.MC_1_21_6, Na.MC_1_21_10, Na.MC_1_21_11};
        Na.gameVersion = 0;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = Na.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = Na.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = Na.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public FM g() {
        return new FM(this, NO.LESS_THAN);
    }

    public boolean b() {
        return this.V().m();
    }

    public FM W() {
        return new FM(this, NO.NOT_EQUAL);
    }

    public FM Q() {
        return new FM(this, NO.EQUALS);
    }

    public int B() {
        return this.Q;
    }

    public boolean J() {
        return this.Q().m();
    }

    public FM V() {
        return new FM(this, NO.LESS_THAN_OR_EQUAL);
    }

    public FM q() {
        return new FM(this, NO.GREATER_THAN);
    }

    public static Na[] values() {
        return (Na[])h.clone();
    }

    public boolean C() {
        return this.q().m();
    }

    public boolean I() {
        return this.W().m();
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = Na.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = Na.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l10, long l11) {
        int n2 = Na.a(l10, l11);
        Object object = a[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = b[n2];
                int n4 = string2.indexOf(8);
                clazz3 = Na.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = Na.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Na.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        Na.a[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Na.b(250781374287562L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = Na.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        Na.a[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Na.b(250781374287562L, 0L);
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
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Na.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

