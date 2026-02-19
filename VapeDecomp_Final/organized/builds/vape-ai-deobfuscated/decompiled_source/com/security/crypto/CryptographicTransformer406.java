/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.HK;
import a.Z3;
import com.app.core.persistence.PersistenceStrategy;
import com.app.events.EventNotificationBroker2314;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
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
public class CryptographicTransformer406 {
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (CryptographicTransformer406.l[n4] != null) {
            return n4;
        }
        Object object = j[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 20;
                break;
            }
            case 1: {
                n3 = 50;
                break;
            }
            case 2: {
                n3 = 2;
                break;
            }
            case 3: {
                n3 = 19;
                break;
            }
            case 4: {
                n3 = 26;
                break;
            }
            case 5: {
                n3 = 41;
                break;
            }
            case 6: {
                n3 = 8;
                break;
            }
            case 7: {
                n3 = 28;
                break;
            }
            case 8: {
                n3 = 17;
                break;
            }
            case 9: {
                n3 = 5;
                break;
            }
            case 10: {
                n3 = 58;
                break;
            }
            case 11: {
                n3 = 51;
                break;
            }
            case 12: {
                n3 = 22;
                break;
            }
            case 13: {
                n3 = 14;
                break;
            }
            case 14: {
                n3 = 25;
                break;
            }
            case 15: {
                n3 = 21;
                break;
            }
            case 16: {
                n3 = 18;
                break;
            }
            case 17: {
                n3 = 38;
                break;
            }
            case 18: {
                n3 = 12;
                break;
            }
            case 19: {
                n3 = 57;
                break;
            }
            case 20: {
                n3 = 53;
                break;
            }
            case 21: {
                n3 = 36;
                break;
            }
            case 22: {
                n3 = 11;
                break;
            }
            case 23: {
                n3 = 46;
                break;
            }
            case 24: {
                n3 = 49;
                break;
            }
            case 25: {
                n3 = 1;
                break;
            }
            case 26: {
                n3 = 7;
                break;
            }
            case 27: {
                n3 = 33;
                break;
            }
            case 28: {
                n3 = 29;
                break;
            }
            case 29: {
                n3 = 40;
                break;
            }
            case 30: {
                n3 = 45;
                break;
            }
            case 31: {
                n3 = 24;
                break;
            }
            case 32: {
                n3 = 4;
                break;
            }
            case 33: {
                n3 = 30;
                break;
            }
            case 34: {
                n3 = 10;
                break;
            }
            case 35: {
                n3 = 27;
                break;
            }
            case 36: {
                n3 = 63;
                break;
            }
            case 37: {
                n3 = 23;
                break;
            }
            case 38: {
                n3 = 39;
                break;
            }
            case 39: {
                n3 = 37;
                break;
            }
            case 40: {
                n3 = 34;
                break;
            }
            case 41: {
                n3 = 3;
                break;
            }
            case 42: {
                n3 = 6;
                break;
            }
            case 43: {
                n3 = 47;
                break;
            }
            case 44: {
                n3 = 61;
                break;
            }
            case 45: {
                n3 = 60;
                break;
            }
            case 46: {
                n3 = 31;
                break;
            }
            case 47: {
                n3 = 42;
                break;
            }
            case 48: {
                n3 = 44;
                break;
            }
            case 49: {
                n3 = 15;
                break;
            }
            case 50: {
                n3 = 52;
                break;
            }
            case 51: {
                n3 = 48;
                break;
            }
            case 52: {
                n3 = 9;
                break;
            }
            case 53: {
                n3 = 16;
                break;
            }
            case 54: {
                n3 = 54;
                break;
            }
            case 55: {
                n3 = 13;
                break;
            }
            case 56: {
                n3 = 32;
                break;
            }
            case 57: {
                n3 = 43;
                break;
            }
            case 58: {
                n3 = 62;
                break;
            }
            case 59: {
                n3 = 35;
                break;
            }
            case 60: {
                n3 = 56;
                break;
            }
            case 61: {
                n3 = 55;
                break;
            }
            case 62: {
                n3 = 59;
                break;
            }
            default: {
                n3 = 0;
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
        CryptographicTransformer406.l[n4] = new String(cArray);
        return n4;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicTransformer406.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicTransformer406.a(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicTransformer406.j[n] = clazz = Class.forName(CryptographicTransformer406.l[n]);
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

    public void G(boolean bl) {
        this.g = bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicTransformer406.a = MultiContainerRegistry.a(-8146450678578361776L, -3099705791203768861L, MethodHandles.lookup().lookupClass()).a(42537219456148L);
                CryptographicTransformer406.j = new Object[5];
                CryptographicTransformer406.l = new String[5];
                CryptographicTransformer406.a();
                CryptographicTransformer406.f = new HashMap<K, V>(13);
                CryptographicTransformer406.C(true);
                var0 = CryptographicTransformer406.a ^ 50837903572970L;
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
        CryptographicTransformer406.c = var8_3;
        CryptographicTransformer406.e = new Integer[32];
        CryptographicTransformer406.d = 0;
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
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicTransformer406.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static void C(boolean bl) {
        V = bl;
    }

    public CryptographicTransformer406(HK hK, Class clazz) {
        this.y = hK;
        this.t = clazz;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'o' || c == '\u00e5' || c == 'w' || c == '\u00d5') {
                field = CryptographicTransformer406.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'w' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicTransformer406.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'j' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4703;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
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
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicTransformer406.e[n2] = n3;
        }
        return e[n2];
    }

    public void M(Class clazz) {
        this.k = clazz;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public Class F() {
        return this.t;
    }

    public String g() {
        boolean bl;
        Object object;
        String string;
        long l;
        block15: {
            boolean bl2;
            block14: {
                l = a ^ 0x250B1D4B502BL;
                Object object2 = "";
                string = "";
                String string2 = "";
                if (this.g) {
                    String string3;
                    StringBuilder stringBuilder;
                    string2 = (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)16248, (long)(0x5C8648BF04363AC1L ^ l)), (long)-4413717195868852911L, (long)l)) + ++d;
                    String string4 = (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)19420, (long)(0x12FB5899150C4E77L ^ l)), (long)-4413717195868852911L, (long)l)) + string2;
                    try {
                        stringBuilder = new StringBuilder().append(this.t.getName()).append((String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)2759, (long)(0x458489C0D4A98F7DL ^ l)), (long)-4413717195868852911L, (long)l))).append(string2).append((String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)30856, (long)(0x4F36639B2FABFD21L ^ l)), (long)-4413717195868852911L, (long)l))).append(this.t.getName()).append((String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)13377, (long)(0x487D9113257AB1FDL ^ l)), (long)-4413717195868852911L, (long)l)));
                        string3 = this.i == null ? "" : this.i;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTransformer406.a(customSystemException);
                    }
                    string = stringBuilder.append(string3).append((String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)29019, (long)(0x5A7C2427367074ECL ^ l)), (long)-4413717195868852911L, (long)l))).toString();
                    object2 = object = (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)9707, (long)(0x2BE8740C5DD8A045L ^ l)), (long)-4413717195868852911L, (long)l)) + string4 + (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)21127, (long)(0x6E148F52B4BDD725L ^ l)), (long)-4413717195868852911L, (long)l)) + string2 + (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)19558, (long)(0xBED58032452C9DEL ^ l)), (long)-4413717195868852911L, (long)l)) + Z3.P(this.t).getName() + (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)12875, (long)(0x5D295778A74A37FAL ^ l)), (long)-4413717195868852911L, (long)l));
                    object2 = (String)object2 + (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)1448, (long)(0x63C5D8CDF3428007L ^ l)), (long)-4413717195868852911L, (long)l)) + string4 + (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)13461, (long)(0x72895C4CD082B123L ^ l)), (long)-4413717195868852911L, (long)l)) + this.N.replace((CharSequence)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)27536, (long)(0x2A7C92FA8DE1EE36L ^ l)), (long)-4413717195868852911L, (long)l)), string2) + (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)25333, (long)(0x2650A99DB8926754L ^ l)), (long)-4413717195868852911L, (long)l));
                } else {
                    String string5;
                    StringBuilder stringBuilder;
                    try {
                        stringBuilder = new StringBuilder().append((String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)23071, (long)(0x483B673FC175DFB3L ^ l)), (long)-4413717195868852911L, (long)l))).append(this.t.getName()).append((String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)4105, (long)(0x7C50C89FFA1795BAL ^ l)), (long)-4413717195868852911L, (long)l)));
                        string5 = this.i == null ? "" : this.i;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTransformer406.a(customSystemException);
                    }
                    object2 = stringBuilder.append(string5).append((String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)26053, (long)(0x6DF383F13294E078L ^ l)), (long)-4413717195868852911L, (long)l))).append(Z3.P(this.t).getName()).append((String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)23375, (long)(0xB0ADAA40B7FDEFAL ^ l)), (long)-4413717195868852911L, (long)l))).toString();
                }
                if (this.u != null) {
                    object2 = (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)6746, (long)(0x6DDF960041331FFDL ^ l)), (long)-4413717195868852911L, (long)l)) + this.u + (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)2283, (long)(0x7D8152BE26538D43L ^ l)), (long)-4413717195868852911L, (long)l)) + (String)object2 + (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)28264, (long)(0x69C210D7BD76EBDCL ^ l)), (long)-4413717195868852911L, (long)l));
                }
                string = string + (String)object2;
                if (this.L != null) {
                    string = string + this.L.replace((CharSequence)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)8775, (long)(0x73AEEB6FC17A27F7L ^ l)), (long)-4413717195868852911L, (long)l)), string2);
                }
                if (this.k != null) {
                    string = (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)22003, (long)(0x2E1D3330A7CB5057L ^ l)), (long)-4413717195868852911L, (long)l)) + this.k.getName() + (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)4325, (long)(0x1DD304AEA59A9545L ^ l)), (long)-4413717195868852911L, (long)l)) + string + (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)25841, (long)(0x3B267D0A4C0DE15BL ^ l)), (long)-4413717195868852911L, (long)l));
                }
                try {
                    try {
                        if (!EventNotificationBroker2314.class.isAssignableFrom(this.t) || !PersistenceStrategy.class.isAssignableFrom(this.t)) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTransformer406.a(customSystemException);
                    }
                    bl2 = true;
                    break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformer406.a(customSystemException);
                }
            }
            bl2 = bl = false;
        }
        if (bl) {
            object = Z3.X(this.t);
            string = (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)4200, (long)(0x5157AE8DE90715D3L ^ l)), (long)-4413717195868852911L, (long)l)) + this.t.getName() + (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)29629, (long)(0x1825FC342BBE7603L ^ l)), (long)-4413717195868852911L, (long)l)) + ((Method)object).getName() + (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)20834, (long)(0x588B7ECABC5254C7L ^ l)), (long)-4413717195868852911L, (long)l)) + Z3.x().getName() + (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)4806, (long)(0x738FE63959A4976BL ^ l)), (long)-4413717195868852911L, (long)l)) + string + (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)13572, (long)(0x9B2B19EBBA630B6L ^ l)), (long)-4413717195868852911L, (long)l));
        }
        string = (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)14490, (long)(0x8A4011675EC3D25L ^ l)), (long)-4413717195868852911L, (long)l)) + string + (String)((Object)CryptographicTransformer406.b("j", (int)CryptographicTransformer406.a("m", (int)32101, (long)(0x2B98335EB07EF8C6L ^ l)), (long)-4413717195868852911L, (long)l));
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

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicTransformer406.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicTransformer406.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void c(boolean bl) {
        this.v = bl;
    }

    private static Field c(long l, long l2) {
        int n = CryptographicTransformer406.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = CryptographicTransformer406.l[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicTransformer406.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicTransformer406.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicTransformer406.a(clazz3, string2, clazz2)) != null) {
                    CryptographicTransformer406.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicTransformer406.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicTransformer406.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicTransformer406.b(263977054458279L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static boolean F() {
        boolean bl = CryptographicTransformer406.W();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformer406.a(customSystemException);
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

    private static Method d(long l, long l2) {
        int n = CryptographicTransformer406.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = CryptographicTransformer406.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptographicTransformer406.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicTransformer406.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicTransformer406.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicTransformer406.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicTransformer406.b(263977054458279L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicTransformer406.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicTransformer406.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicTransformer406.b(263977054458279L, 0L);
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

    private static void a() {
        Object[] objectArray = j;
        j[0] = "m\u0007F";
        objectArray[1] = Integer.TYPE;
        CryptographicTransformer406.l[1] = "java/lang/Integer";
        objectArray[2] = "B|\n^\u000f#Is\u001b\u0011r;Zt\u0012X";
        objectArray[3] = " F*dE\u0003+I;+$\r B?q";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "U\tDW;*GB#F:Q\u0001\u0007[\u0016=#JGGBAhJU[\u00143<@PA-";
    }

    public void L(String string) {
        this.N = string;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptographicTransformer406.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicTransformer406.b(classArray[i], string, clazz2);
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
            return MethodHandles.lookup().findStatic(CryptographicTransformer406.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptographicTransformer406.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

