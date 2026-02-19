/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.JG;
import a.O_;
import a.Z3;
import a._V;
import a.d8;
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
public class Nz {
    private final HK y;
    private static final Object[] j;
    private static final long[] c;
    private static final String[] l;
    private static final Map f;
    private boolean v = true;
    private boolean g = true;
    private String N = "";
    private String L;
    private static final Integer[] e;
    private String i = null;
    static int d;
    private static final long a;
    private static boolean V;
    private Class k;
    private String u;
    private final Class t;

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (l[n5] != null) {
            return n5;
        }
        Object object = j[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 20;
                break;
            }
            case 1: {
                n4 = 50;
                break;
            }
            case 2: {
                n4 = 2;
                break;
            }
            case 3: {
                n4 = 19;
                break;
            }
            case 4: {
                n4 = 26;
                break;
            }
            case 5: {
                n4 = 41;
                break;
            }
            case 6: {
                n4 = 8;
                break;
            }
            case 7: {
                n4 = 28;
                break;
            }
            case 8: {
                n4 = 17;
                break;
            }
            case 9: {
                n4 = 5;
                break;
            }
            case 10: {
                n4 = 58;
                break;
            }
            case 11: {
                n4 = 51;
                break;
            }
            case 12: {
                n4 = 22;
                break;
            }
            case 13: {
                n4 = 14;
                break;
            }
            case 14: {
                n4 = 25;
                break;
            }
            case 15: {
                n4 = 21;
                break;
            }
            case 16: {
                n4 = 18;
                break;
            }
            case 17: {
                n4 = 38;
                break;
            }
            case 18: {
                n4 = 12;
                break;
            }
            case 19: {
                n4 = 57;
                break;
            }
            case 20: {
                n4 = 53;
                break;
            }
            case 21: {
                n4 = 36;
                break;
            }
            case 22: {
                n4 = 11;
                break;
            }
            case 23: {
                n4 = 46;
                break;
            }
            case 24: {
                n4 = 49;
                break;
            }
            case 25: {
                n4 = 1;
                break;
            }
            case 26: {
                n4 = 7;
                break;
            }
            case 27: {
                n4 = 33;
                break;
            }
            case 28: {
                n4 = 29;
                break;
            }
            case 29: {
                n4 = 40;
                break;
            }
            case 30: {
                n4 = 45;
                break;
            }
            case 31: {
                n4 = 24;
                break;
            }
            case 32: {
                n4 = 4;
                break;
            }
            case 33: {
                n4 = 30;
                break;
            }
            case 34: {
                n4 = 10;
                break;
            }
            case 35: {
                n4 = 27;
                break;
            }
            case 36: {
                n4 = 63;
                break;
            }
            case 37: {
                n4 = 23;
                break;
            }
            case 38: {
                n4 = 39;
                break;
            }
            case 39: {
                n4 = 37;
                break;
            }
            case 40: {
                n4 = 34;
                break;
            }
            case 41: {
                n4 = 3;
                break;
            }
            case 42: {
                n4 = 6;
                break;
            }
            case 43: {
                n4 = 47;
                break;
            }
            case 44: {
                n4 = 61;
                break;
            }
            case 45: {
                n4 = 60;
                break;
            }
            case 46: {
                n4 = 31;
                break;
            }
            case 47: {
                n4 = 42;
                break;
            }
            case 48: {
                n4 = 44;
                break;
            }
            case 49: {
                n4 = 15;
                break;
            }
            case 50: {
                n4 = 52;
                break;
            }
            case 51: {
                n4 = 48;
                break;
            }
            case 52: {
                n4 = 9;
                break;
            }
            case 53: {
                n4 = 16;
                break;
            }
            case 54: {
                n4 = 54;
                break;
            }
            case 55: {
                n4 = 13;
                break;
            }
            case 56: {
                n4 = 32;
                break;
            }
            case 57: {
                n4 = 43;
                break;
            }
            case 58: {
                n4 = 62;
                break;
            }
            case 59: {
                n4 = 35;
                break;
            }
            case 60: {
                n4 = 56;
                break;
            }
            case 61: {
                n4 = 55;
                break;
            }
            case 62: {
                n4 = 59;
                break;
            }
            default: {
                n4 = 0;
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
        Nz.l[n5] = new String(cArray);
        return n5;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = Nz.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = Nz.a(l10, l11);
            object = j[n2];
            try {
                if (!(object instanceof String)) break block2;
                Nz.j[n2] = clazz = Class.forName(l[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public HK G() {
        return this.y;
    }

    public static boolean W() {
        return V;
    }

    public void C(String string) {
        this.i = string;
    }

    public void G(boolean bl2) {
        this.g = bl2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                Nz.a = d8.a(-8146450678578361776L, -3099705791203768861L, MethodHandles.lookup().lookupClass()).a(42537219456148L);
                Nz.j = new Object[5];
                Nz.l = new String[5];
                Nz.a();
                Nz.f = new HashMap<K, V>(13);
                Nz.C(true);
                var0 = Nz.a ^ 50837903572970L;
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
                var8_3 = new long[32];
                var5_4 = 0;
                var6_5 = "\u0013\u001a;\u00f4\u00c9\u00edp#\u00c4\u0099\u00bf\u00d7Dj\u00e3\t\u00acG\u00be\u0080\u00f1\u00f3\u00e2?O\u00ed\u00cbo\u00d7\u0005\t,\u00dfR\u0085\u00bc\u00f3\u00c0\u00a1\u00f1\u00d2\u00d4g\u0086\u008f\u00d0D\bx\"\u00bc\u00fe\u00f6\u00d7\u009cT\u00f5\u00a9\u0098u\b5\u00c7\u009aK8\u007f\u008c\u00c6\u0002\u00b2^\u00a8\u00ce\u0081\u00ed\u0000\u00c5fN\u008bo\u0098\u00c8\u00d3\u00d7\"@\u00ed{l2\u00c1\u00e468\u0091\u00e9{\u008c\u0012L\u0014\u0010&&\u001e\u008f\u00eb\u00af\u001f\u00c6'F\u00d5\u00c5\u0006Q\u0080\u008c\u00a7\u0092\u0091\u00bf\u00d7\u008c\u00e7\u00bf\u0003\u000b\u00c5\u0088\u008dRK\u00ff\u0006\u00a9\u008d\u00983T8\u00b2C\u009b\u0012\u0088$4P=\u00a1$_\u00e9I\u001f\u00c4\u00c4\u0012\u00a7\u00e4?M\u0083\u00c9\u00fc\u0001$\u00be\u0084\u00b5!\u00e3\u00ed\u00c4\u00d7\u00b4A\u00bc\u00ef'\u00af\u00e2K\u0097Tn2\u00b8\u008cH9\u0017\u00f9\u00d6NB\u0010i8\u0011`\u0093\u00bfU\u00b9\u00e0R\u00a27r\u00a46\u0085\u0018\u00b4\u00ba\u00ad\u0001\u00e2\u0087A\"\u0001v.\u009e8\u0014\u00ce\u00e2\u00afcu@\u0005\u0083\u0000";
                var7_6 = "\u0013\u001a;\u00f4\u00c9\u00edp#\u00c4\u0099\u00bf\u00d7Dj\u00e3\t\u00acG\u00be\u0080\u00f1\u00f3\u00e2?O\u00ed\u00cbo\u00d7\u0005\t,\u00dfR\u0085\u00bc\u00f3\u00c0\u00a1\u00f1\u00d2\u00d4g\u0086\u008f\u00d0D\bx\"\u00bc\u00fe\u00f6\u00d7\u009cT\u00f5\u00a9\u0098u\b5\u00c7\u009aK8\u007f\u008c\u00c6\u0002\u00b2^\u00a8\u00ce\u0081\u00ed\u0000\u00c5fN\u008bo\u0098\u00c8\u00d3\u00d7\"@\u00ed{l2\u00c1\u00e468\u0091\u00e9{\u008c\u0012L\u0014\u0010&&\u001e\u008f\u00eb\u00af\u001f\u00c6'F\u00d5\u00c5\u0006Q\u0080\u008c\u00a7\u0092\u0091\u00bf\u00d7\u008c\u00e7\u00bf\u0003\u000b\u00c5\u0088\u008dRK\u00ff\u0006\u00a9\u008d\u00983T8\u00b2C\u009b\u0012\u0088$4P=\u00a1$_\u00e9I\u001f\u00c4\u00c4\u0012\u00a7\u00e4?M\u0083\u00c9\u00fc\u0001$\u00be\u0084\u00b5!\u00e3\u00ed\u00c4\u00d7\u00b4A\u00bc\u00ef'\u00af\u00e2K\u0097Tn2\u00b8\u008cH9\u0017\u00f9\u00d6NB\u0010i8\u0011`\u0093\u00bfU\u00b9\u00e0R\u00a27r\u00a46\u0085\u0018\u00b4\u00ba\u00ad\u0001\u00e2\u0087A\"\u0001v.\u009e8\u0014\u00ce\u00e2\u00afcu@\u0005\u0083\u0000".length();
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
                    var6_5 = "T\u00c22\u00b6\u009a\u0019$N}0G\u00fc\u00e4\u00cb\u00df\u00b4";
                    var7_6 = "T\u00c22\u00b6\u009a\u0019$N}0G\u00fc\u00e4\u00cb\u00df\u00b4".length();
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
        Nz.c = var8_3;
        Nz.e = new Integer[32];
        Nz.d = 0;
    }

    public void n(String string) {
        this.u = string;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public boolean t() {
        return this.v;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = Nz.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static void C(boolean bl2) {
        V = bl2;
    }

    public Nz(HK hK2, Class clazz) {
        this.y = hK2;
        this.t = clazz;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'o' || c10 == '\u00e5' || c10 == 'w' || c10 == '\u00d5') {
                field = Nz.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00e5' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'w' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Nz.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'z' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'j' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x4703;
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
                throw new RuntimeException("a/Nz", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Nz.e[n3] = n4;
        }
        return e[n3];
    }

    public void M(Class clazz) {
        this.k = clazz;
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

    public Class F() {
        return this.t;
    }

    public String g() {
        boolean bl2;
        Object object;
        String string;
        long l10;
        block15: {
            boolean bl3;
            block14: {
                l10 = a ^ 0x250B1D4B502BL;
                Object object2 = "";
                string = "";
                String string2 = "";
                if (this.g) {
                    String string3;
                    StringBuilder stringBuilder;
                    string2 = (String)((Object)Nz.b("j", (int)Nz.a("m", (int)16248, (long)(0x5C8648BF04363AC1L ^ l10)), (long)-4413717195868852911L, (long)l10)) + ++d;
                    String string4 = (String)((Object)Nz.b("j", (int)Nz.a("m", (int)19420, (long)(0x12FB5899150C4E77L ^ l10)), (long)-4413717195868852911L, (long)l10)) + string2;
                    try {
                        stringBuilder = new StringBuilder().append(this.t.getName()).append((String)((Object)Nz.b("j", (int)Nz.a("m", (int)2759, (long)(0x458489C0D4A98F7DL ^ l10)), (long)-4413717195868852911L, (long)l10))).append(string2).append((String)((Object)Nz.b("j", (int)Nz.a("m", (int)30856, (long)(0x4F36639B2FABFD21L ^ l10)), (long)-4413717195868852911L, (long)l10))).append(this.t.getName()).append((String)((Object)Nz.b("j", (int)Nz.a("m", (int)13377, (long)(0x487D9113257AB1FDL ^ l10)), (long)-4413717195868852911L, (long)l10)));
                        string3 = this.i == null ? "" : this.i;
                    }
                    catch (O_ o_2) {
                        throw Nz.a(o_2);
                    }
                    string = stringBuilder.append(string3).append((String)((Object)Nz.b("j", (int)Nz.a("m", (int)29019, (long)(0x5A7C2427367074ECL ^ l10)), (long)-4413717195868852911L, (long)l10))).toString();
                    object2 = object = (String)((Object)Nz.b("j", (int)Nz.a("m", (int)9707, (long)(0x2BE8740C5DD8A045L ^ l10)), (long)-4413717195868852911L, (long)l10)) + string4 + (String)((Object)Nz.b("j", (int)Nz.a("m", (int)21127, (long)(0x6E148F52B4BDD725L ^ l10)), (long)-4413717195868852911L, (long)l10)) + string2 + (String)((Object)Nz.b("j", (int)Nz.a("m", (int)19558, (long)(0xBED58032452C9DEL ^ l10)), (long)-4413717195868852911L, (long)l10)) + Z3.P(this.t).getName() + (String)((Object)Nz.b("j", (int)Nz.a("m", (int)12875, (long)(0x5D295778A74A37FAL ^ l10)), (long)-4413717195868852911L, (long)l10));
                    object2 = (String)object2 + (String)((Object)Nz.b("j", (int)Nz.a("m", (int)1448, (long)(0x63C5D8CDF3428007L ^ l10)), (long)-4413717195868852911L, (long)l10)) + string4 + (String)((Object)Nz.b("j", (int)Nz.a("m", (int)13461, (long)(0x72895C4CD082B123L ^ l10)), (long)-4413717195868852911L, (long)l10)) + this.N.replace((CharSequence)((Object)Nz.b("j", (int)Nz.a("m", (int)27536, (long)(0x2A7C92FA8DE1EE36L ^ l10)), (long)-4413717195868852911L, (long)l10)), string2) + (String)((Object)Nz.b("j", (int)Nz.a("m", (int)25333, (long)(0x2650A99DB8926754L ^ l10)), (long)-4413717195868852911L, (long)l10));
                } else {
                    String string5;
                    StringBuilder stringBuilder;
                    try {
                        stringBuilder = new StringBuilder().append((String)((Object)Nz.b("j", (int)Nz.a("m", (int)23071, (long)(0x483B673FC175DFB3L ^ l10)), (long)-4413717195868852911L, (long)l10))).append(this.t.getName()).append((String)((Object)Nz.b("j", (int)Nz.a("m", (int)4105, (long)(0x7C50C89FFA1795BAL ^ l10)), (long)-4413717195868852911L, (long)l10)));
                        string5 = this.i == null ? "" : this.i;
                    }
                    catch (O_ o_3) {
                        throw Nz.a(o_3);
                    }
                    object2 = stringBuilder.append(string5).append((String)((Object)Nz.b("j", (int)Nz.a("m", (int)26053, (long)(0x6DF383F13294E078L ^ l10)), (long)-4413717195868852911L, (long)l10))).append(Z3.P(this.t).getName()).append((String)((Object)Nz.b("j", (int)Nz.a("m", (int)23375, (long)(0xB0ADAA40B7FDEFAL ^ l10)), (long)-4413717195868852911L, (long)l10))).toString();
                }
                if (this.u != null) {
                    object2 = (String)((Object)Nz.b("j", (int)Nz.a("m", (int)6746, (long)(0x6DDF960041331FFDL ^ l10)), (long)-4413717195868852911L, (long)l10)) + this.u + (String)((Object)Nz.b("j", (int)Nz.a("m", (int)2283, (long)(0x7D8152BE26538D43L ^ l10)), (long)-4413717195868852911L, (long)l10)) + (String)object2 + (String)((Object)Nz.b("j", (int)Nz.a("m", (int)28264, (long)(0x69C210D7BD76EBDCL ^ l10)), (long)-4413717195868852911L, (long)l10));
                }
                string = string + (String)object2;
                if (this.L != null) {
                    string = string + this.L.replace((CharSequence)((Object)Nz.b("j", (int)Nz.a("m", (int)8775, (long)(0x73AEEB6FC17A27F7L ^ l10)), (long)-4413717195868852911L, (long)l10)), string2);
                }
                if (this.k != null) {
                    string = (String)((Object)Nz.b("j", (int)Nz.a("m", (int)22003, (long)(0x2E1D3330A7CB5057L ^ l10)), (long)-4413717195868852911L, (long)l10)) + this.k.getName() + (String)((Object)Nz.b("j", (int)Nz.a("m", (int)4325, (long)(0x1DD304AEA59A9545L ^ l10)), (long)-4413717195868852911L, (long)l10)) + string + (String)((Object)Nz.b("j", (int)Nz.a("m", (int)25841, (long)(0x3B267D0A4C0DE15BL ^ l10)), (long)-4413717195868852911L, (long)l10));
                }
                try {
                    try {
                        if (!_V.class.isAssignableFrom(this.t) || !JG.class.isAssignableFrom(this.t)) break block14;
                    }
                    catch (O_ o_4) {
                        throw Nz.a(o_4);
                    }
                    bl3 = true;
                    break block15;
                }
                catch (O_ o_5) {
                    throw Nz.a(o_5);
                }
            }
            bl3 = bl2 = false;
        }
        if (bl2) {
            object = Z3.X(this.t);
            string = (String)((Object)Nz.b("j", (int)Nz.a("m", (int)4200, (long)(0x5157AE8DE90715D3L ^ l10)), (long)-4413717195868852911L, (long)l10)) + this.t.getName() + (String)((Object)Nz.b("j", (int)Nz.a("m", (int)29629, (long)(0x1825FC342BBE7603L ^ l10)), (long)-4413717195868852911L, (long)l10)) + ((Method)object).getName() + (String)((Object)Nz.b("j", (int)Nz.a("m", (int)20834, (long)(0x588B7ECABC5254C7L ^ l10)), (long)-4413717195868852911L, (long)l10)) + Z3.x().getName() + (String)((Object)Nz.b("j", (int)Nz.a("m", (int)4806, (long)(0x738FE63959A4976BL ^ l10)), (long)-4413717195868852911L, (long)l10)) + string + (String)((Object)Nz.b("j", (int)Nz.a("m", (int)13572, (long)(0x9B2B19EBBA630B6L ^ l10)), (long)-4413717195868852911L, (long)l10));
        }
        string = (String)((Object)Nz.b("j", (int)Nz.a("m", (int)14490, (long)(0x8A4011675EC3D25L ^ l10)), (long)-4413717195868852911L, (long)l10)) + string + (String)((Object)Nz.b("j", (int)Nz.a("m", (int)32101, (long)(0x2B98335EB07EF8C6L ^ l10)), (long)-4413717195868852911L, (long)l10));
        return string;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Nz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void g(String string) {
        this.L = string;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = Nz.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = Nz.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void c(boolean bl2) {
        this.v = bl2;
    }

    private static Field c(long l10, long l11) {
        int n2 = Nz.a(l10, l11);
        Object object = j[n2];
        if (object instanceof String) {
            String string = l[n2];
            int n3 = string.indexOf(8);
            Class clazz = Nz.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = Nz.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Nz.a(clazz3, string2, clazz2)) != null) {
                    Nz.j[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = Nz.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        Nz.j[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Nz.b(263977054458279L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static boolean F() {
        boolean bl2 = Nz.W();
        try {
            if (!bl2) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw Nz.a(o_2);
        }
        return false;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Nz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l10, long l11) {
        int n2 = Nz.a(l10, l11);
        Object object = j[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = l[n2];
                int n4 = string2.indexOf(8);
                clazz3 = Nz.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = Nz.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Nz.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        Nz.j[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Nz.b(263977054458279L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = Nz.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        Nz.j[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Nz.b(263977054458279L, 0L);
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
        Object[] objectArray = j;
        j[0] = "m\u0007F";
        objectArray[1] = Integer.TYPE;
        Nz.l[1] = "java/lang/Integer";
        objectArray[2] = "B|\n^\u000f#Is\u001b\u0011r;Zt\u0012X";
        objectArray[3] = " F*dE\u0003+I;+$\r B?q";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "U\tDW;*GB#F:Q\u0001\u0007[\u0016=#JGGBAhJU[\u00143<@PA-";
    }

    public void L(String string) {
        this.N = string;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = Nz.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = Nz.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Nz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(Nz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

