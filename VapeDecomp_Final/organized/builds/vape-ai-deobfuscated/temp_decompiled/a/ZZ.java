/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.GH;
import a.SE;
import a.d8;
import a.ec;
import a.k2;
import com.google.gson.JsonObject;
import java.awt.Color;
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
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class zz {
    private static final Object[] e;
    private static final Map d;
    @Nullable
    private Predicate<Character> S;
    private int N;
    private final AtomicBoolean G;
    private static final long[] b;
    private static final long a;
    private static final String[] f;
    private static final Integer[] c;
    private k2 h;
    private int X;
    private final AtomicBoolean s;
    private String Y;
    private static String[] F;

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = zz.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = zz.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public zz(String string, int n2) {
        this.N = -1;
        this.s = new AtomicBoolean(true);
        this.G = new AtomicBoolean(false);
        this.h = new k2(n2);
        this.Y = string;
        this.f();
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = zz.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public boolean f() {
        return this.G.get();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                zz.a = d8.a(6800982758331881754L, -2438311529200940183L, MethodHandles.lookup().lookupClass()).a(18101850438777L);
                zz.e = new Object[5];
                zz.f = new String[5];
                zz.a();
                zz.d = new HashMap<K, V>(13);
                var0 = zz.a ^ 13794969728121L;
                zz.n(new String[1]);
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
                var6_5 = ";`#\u00d8\u00c6u)\u00f0\u00139\u001d\u00b0l\u009f\u0015\u0007\b\\\u00e8\u00ce\u00f7{\u00e0\u001f^H\u00da\u0002,Cj\u00e6\u00c6\u0011\u0080\u00ea>N\u00fd\u0098\t\u0005Xp\u00fc\u00f3\u00b0\u00e6v\u00ec\u0086\u00e9\u008a\u00f7\u00c0\u000bCr\u0001\u00a1\u001bh\u00da\u00da\u00ac\u001f3(\u00f0A\u009c%\u00c7$e\u0099\u0088\u0005\u00d3CN\u000eJ\u00aa1\u00a2\u00a5-\u007f-\u0010\u00c1@\u0016\u0098\u00d3\u008f\u008f\u00ca*\u007f\u00b0a\u00cf\u0004\u00ea\u00d6\u00f6\u00ff\u00ea.\b\u00cfDq\u00d2P\u0088[\u00b2\u00dc\u008a\u0086*\u00a9\u00a8\u00ec\u00f3\u0081\u00a5#\u008dP\u00c8\u00b0\u0090\u00eaI\u008f\u00cd3G\u00f6m\"\u00f0\u008b\u00f3pk\u009f\u009f5@\u0019\u0092\u001b\u0017\u00bbBb,A\u00d87l\u00dcH\u00cd\u00e3+\u00edi\u0010\u00ccP";
                var7_6 = ";`#\u00d8\u00c6u)\u00f0\u00139\u001d\u00b0l\u009f\u0015\u0007\b\\\u00e8\u00ce\u00f7{\u00e0\u001f^H\u00da\u0002,Cj\u00e6\u00c6\u0011\u0080\u00ea>N\u00fd\u0098\t\u0005Xp\u00fc\u00f3\u00b0\u00e6v\u00ec\u0086\u00e9\u008a\u00f7\u00c0\u000bCr\u0001\u00a1\u001bh\u00da\u00da\u00ac\u001f3(\u00f0A\u009c%\u00c7$e\u0099\u0088\u0005\u00d3CN\u000eJ\u00aa1\u00a2\u00a5-\u007f-\u0010\u00c1@\u0016\u0098\u00d3\u008f\u008f\u00ca*\u007f\u00b0a\u00cf\u0004\u00ea\u00d6\u00f6\u00ff\u00ea.\b\u00cfDq\u00d2P\u0088[\u00b2\u00dc\u008a\u0086*\u00a9\u00a8\u00ec\u00f3\u0081\u00a5#\u008dP\u00c8\u00b0\u0090\u00eaI\u008f\u00cd3G\u00f6m\"\u00f0\u008b\u00f3pk\u009f\u009f5@\u0019\u0092\u001b\u0017\u00bbBb,A\u00d87l\u00dcH\u00cd\u00e3+\u00edi\u0010\u00ccP".length();
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
                    var6_5 = ";H6\u0094_G\u00d7P\u00cc\"\u0094R\tr\u001c0";
                    var7_6 = ";H6\u0094_G\u00d7P\u00cc\"\u0094R\tr\u001c0".length();
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
        zz.b = var8_3;
        zz.c = new Integer[24];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = zz.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void f() {
        long l10 = a ^ 0x51EB29B79682L;
        String string = this.Y;
        Predicate<Character> predicate = SE.h.J().f(string);
        try {
            if (predicate != null) {
                this.S = predicate;
                return;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw zz.a(numberFormatException);
        }
        if (string.contains((CharSequence)((Object)zz.b("\u00fa", (int)zz.a("b", (int)4955, (long)(0x26443ED049E412F3L ^ l10)), (long)4748303940377262856L, (long)l10)))) {
            String[] stringArray = string.split((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)28316, (long)(0x217A283B8F8E6F25L ^ l10)), (long)4748303940377262856L, (long)l10)));
            try {
                if (stringArray.length != 2) return;
                this.o(stringArray[0]);
                this.B(stringArray[1]);
                return;
            }
            catch (NumberFormatException numberFormatException) {
                throw zz.a(numberFormatException);
            }
        } else {
            this.o(string);
        }
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
                n4 = 15;
                break;
            }
            case 1: {
                n4 = 0;
                break;
            }
            case 2: {
                n4 = 33;
                break;
            }
            case 3: {
                n4 = 16;
                break;
            }
            case 4: {
                n4 = 5;
                break;
            }
            case 5: {
                n4 = 35;
                break;
            }
            case 6: {
                n4 = 17;
                break;
            }
            case 7: {
                n4 = 37;
                break;
            }
            case 8: {
                n4 = 61;
                break;
            }
            case 9: {
                n4 = 13;
                break;
            }
            case 10: {
                n4 = 36;
                break;
            }
            case 11: {
                n4 = 51;
                break;
            }
            case 12: {
                n4 = 18;
                break;
            }
            case 13: {
                n4 = 28;
                break;
            }
            case 14: {
                n4 = 4;
                break;
            }
            case 15: {
                n4 = 44;
                break;
            }
            case 16: {
                n4 = 19;
                break;
            }
            case 17: {
                n4 = 31;
                break;
            }
            case 18: {
                n4 = 50;
                break;
            }
            case 19: {
                n4 = 34;
                break;
            }
            case 20: {
                n4 = 1;
                break;
            }
            case 21: {
                n4 = 8;
                break;
            }
            case 22: {
                n4 = 6;
                break;
            }
            case 23: {
                n4 = 25;
                break;
            }
            case 24: {
                n4 = 56;
                break;
            }
            case 25: {
                n4 = 40;
                break;
            }
            case 26: {
                n4 = 12;
                break;
            }
            case 27: {
                n4 = 39;
                break;
            }
            case 28: {
                n4 = 20;
                break;
            }
            case 29: {
                n4 = 27;
                break;
            }
            case 30: {
                n4 = 45;
                break;
            }
            case 31: {
                n4 = 10;
                break;
            }
            case 32: {
                n4 = 30;
                break;
            }
            case 33: {
                n4 = 54;
                break;
            }
            case 34: {
                n4 = 43;
                break;
            }
            case 35: {
                n4 = 52;
                break;
            }
            case 36: {
                n4 = 41;
                break;
            }
            case 37: {
                n4 = 57;
                break;
            }
            case 38: {
                n4 = 9;
                break;
            }
            case 39: {
                n4 = 3;
                break;
            }
            case 40: {
                n4 = 23;
                break;
            }
            case 41: {
                n4 = 32;
                break;
            }
            case 42: {
                n4 = 11;
                break;
            }
            case 43: {
                n4 = 60;
                break;
            }
            case 44: {
                n4 = 47;
                break;
            }
            case 45: {
                n4 = 62;
                break;
            }
            case 46: {
                n4 = 29;
                break;
            }
            case 47: {
                n4 = 59;
                break;
            }
            case 48: {
                n4 = 24;
                break;
            }
            case 49: {
                n4 = 46;
                break;
            }
            case 50: {
                n4 = 7;
                break;
            }
            case 51: {
                n4 = 58;
                break;
            }
            case 52: {
                n4 = 22;
                break;
            }
            case 53: {
                n4 = 14;
                break;
            }
            case 54: {
                n4 = 49;
                break;
            }
            case 55: {
                n4 = 26;
                break;
            }
            case 56: {
                n4 = 48;
                break;
            }
            case 57: {
                n4 = 53;
                break;
            }
            case 58: {
                n4 = 55;
                break;
            }
            case 59: {
                n4 = 63;
                break;
            }
            case 60: {
                n4 = 2;
                break;
            }
            case 61: {
                n4 = 38;
                break;
            }
            case 62: {
                n4 = 42;
                break;
            }
            default: {
                n4 = 21;
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
        zz.f[n5] = new String(cArray);
        return n5;
    }

    public void e(int n2) {
        this.h = new k2(n2);
    }

    private static Method d(long l10, long l11) {
        int n2 = zz.a(l10, l11);
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
                clazz3 = zz.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = zz.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = zz.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        zz.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = zz.b(259705190634731L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = zz.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        zz.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = zz.b(259705190634731L, 0L);
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

    public AtomicBoolean K() {
        return this.s;
    }

    public JsonObject z() {
        long l10 = a ^ 0x282980596053L;
        JsonObject jsonObject = new JsonObject();
        String string = (String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)160, (long)(0xA4F6923534877D0L ^ l10)), (long)-5245527516186620455L, (long)l10)) + ec.A(this.Y);
        jsonObject.addProperty((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)7225, (long)(0x989931EEDDDEB45L ^ l10)), (long)-5245527516186620455L, (long)l10)), string);
        jsonObject.addProperty((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)5199, (long)(0x3182E5096B6EE326L ^ l10)), (long)-5245527516186620455L, (long)l10)), (Number)this.h.Y());
        jsonObject.addProperty((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)1682, (long)(0x97EBC06E0C671FFL ^ l10)), (long)-5245527516186620455L, (long)l10)), Boolean.valueOf(this.s.get()));
        jsonObject.addProperty((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)10232, (long)(0xFB8D5A5387D5086L ^ l10)), (long)-5245527516186620455L, (long)l10)), Boolean.valueOf(this.G.get()));
        return jsonObject;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = zz.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = zz.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public int z() {
        return this.N;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "67r";
        objectArray[1] = Integer.TYPE;
        zz.f[1] = "java/lang/Integer";
        objectArray[2] = "0\u00148QA{;\u001b)\u001e<c(\u001c W";
        objectArray[3] = "-\u0017(+D@&\u00189d%N-\u0013=>";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\n%;\\( \u0013%$,34hne\u0014=#\u0007=!\u0016&OQ9;\u001cg\"\u00145;\\X";
    }

    public void a(boolean bl2) {
        this.G.set(bl2);
    }

    @Nullable
    public Predicate<Character> o() {
        return this.S;
    }

    public static void n(String[] stringArray) {
        F = stringArray;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    public zz(JsonObject jsonObject) {
        block24: {
            long l10;
            block23: {
                block22: {
                    block21: {
                        block19: {
                            l10 = a ^ 0x307D702A5E46L;
                            this.N = -1;
                            this.s = new AtomicBoolean(true);
                            this.G = new AtomicBoolean(false);
                            if (jsonObject.get((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)30537, (long)(0x3FF771E8A06B3E28L ^ l10)), (long)-8565498148299213876L, (long)l10))) != null) {
                                block20: {
                                    try {
                                        try {
                                            if (jsonObject.get((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)32316, (long)(0x6C8F9B5288903742L ^ l10)), (long)-8565498148299213876L, (long)l10))).isJsonNull()) break block19;
                                            this.Y = jsonObject.get((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)10572, (long)(0x51ADED8EB63A6036L ^ l10)), (long)-8565498148299213876L, (long)l10))).getAsString();
                                            if (!this.Y.startsWith((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)26490, (long)(0x5A25F13FCA89AE1DL ^ l10)), (long)-8565498148299213876L, (long)l10)))) break block20;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw zz.a(numberFormatException);
                                        }
                                        this.Y = ec.c(this.Y.split((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)18878, (long)(0x42FA3377AF9780DEL ^ l10)), (long)-8565498148299213876L, (long)l10)))[1]);
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw zz.a(numberFormatException);
                                    }
                                }
                                this.f();
                            }
                        }
                        try {
                            try {
                                if (jsonObject.get((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)13438, (long)(0x2298C994F2AE7D10L ^ l10)), (long)-8565498148299213876L, (long)l10))) == null || jsonObject.get((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)17214, (long)(0x56E9108D31F00A47L ^ l10)), (long)-8565498148299213876L, (long)l10))).isJsonNull()) break block21;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw zz.a(numberFormatException);
                            }
                            this.h = new k2(jsonObject.get((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)6058, (long)(0x53D30E112922DEC2L ^ l10)), (long)-8565498148299213876L, (long)l10))).getAsInt());
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw zz.a(numberFormatException);
                        }
                    }
                    try {
                        if (jsonObject.get((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)7502, (long)(0x22A29EF6C844D421L ^ l10)), (long)-8565498148299213876L, (long)l10))) == null || jsonObject.get((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)17518, (long)(0x50259D53AE570D11L ^ l10)), (long)-8565498148299213876L, (long)l10))).isJsonNull()) break block22;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw zz.a(numberFormatException);
                    }
                    Color color = new Color(jsonObject.get((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)20593, (long)(0x657C146D97AA1912L ^ l10)), (long)-8565498148299213876L, (long)l10))).getAsInt());
                    this.h = new k2(color);
                }
                try {
                    try {
                        if (jsonObject.get((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)15372, (long)(0x7694ACAD03A37566L ^ l10)), (long)-8565498148299213876L, (long)l10))) == null || jsonObject.get((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)29473, (long)(0xB17AEEF9085BA4CL ^ l10)), (long)-8565498148299213876L, (long)l10))).isJsonNull()) break block23;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw zz.a(numberFormatException);
                    }
                    this.s.set(jsonObject.get((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)15387, (long)(0x71BF294D5368F57FL ^ l10)), (long)-8565498148299213876L, (long)l10))).getAsBoolean());
                }
                catch (NumberFormatException numberFormatException) {
                    throw zz.a(numberFormatException);
                }
            }
            try {
                try {
                    if (jsonObject.get((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)22054, (long)(0x6139C2FFA3109F40L ^ l10)), (long)-8565498148299213876L, (long)l10))) == null || jsonObject.get((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)9337, (long)(0x486D5713E0E56D1BL ^ l10)), (long)-8565498148299213876L, (long)l10))).isJsonNull()) break block24;
                }
                catch (NumberFormatException numberFormatException) {
                    throw zz.a(numberFormatException);
                }
                this.G.set(jsonObject.get((String)((Object)zz.b("\u00fa", (int)zz.a("b", (int)5790, (long)(0x38D4956303195FE5L ^ l10)), (long)-8565498148299213876L, (long)l10))).getAsBoolean());
            }
            catch (NumberFormatException numberFormatException) {
                throw zz.a(numberFormatException);
            }
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/zz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x404E;
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
                throw new RuntimeException("a/zz", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            zz.c[n3] = n4;
        }
        return c[n3];
    }

    public boolean r(int n2, int n3) {
        boolean bl2;
        block19: {
            block17: {
                try {
                    if (!this.s.get()) {
                        return false;
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    throw zz.a(numberFormatException);
                }
                try {
                    if (this.X == -1) {
                        return false;
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    throw zz.a(numberFormatException);
                }
                try {
                    if (this.S != null) {
                        return this.S.test(Character.valueOf(GH.s(n2, n3)));
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    throw zz.a(numberFormatException);
                }
                try {
                    block18: {
                        try {
                            try {
                                try {
                                    if (this.X != n2) break block17;
                                    if (this.N == -1) break block18;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw zz.a(numberFormatException);
                                }
                                if (this.N == n3) break block18;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw zz.a(numberFormatException);
                            }
                            if (n3 != -1) break block17;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw zz.a(numberFormatException);
                        }
                    }
                    bl2 = true;
                    break block19;
                }
                catch (NumberFormatException numberFormatException) {
                    throw zz.a(numberFormatException);
                }
            }
            bl2 = false;
        }
        return bl2;
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

    private void o(String string) {
        int n2 = 0;
        int n3 = -1;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            int[] nArray = GH.e(string);
            n2 = nArray[0];
            n3 = nArray[1];
        }
        this.X = n2;
        this.N = n3;
    }

    public Color e() {
        return this.h;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = zz.a(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                zz.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/zz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static String[] X() {
        return F;
    }

    public String U() {
        return this.Y;
    }

    private void B(String string) {
        try {
            this.N = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
    }

    private static Field c(long l10, long l11) {
        int n2 = zz.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = zz.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = zz.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = zz.a(clazz3, string2, clazz2)) != null) {
                    zz.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = zz.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        zz.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = zz.b(259705190634731L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public AtomicBoolean f() {
        return this.G;
    }

    public boolean o() {
        return this.s.get();
    }

    public int Q() {
        return this.X;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'Y' || c10 == '\u00c8' || c10 == '\u00e6' || c10 == 'i') {
                field = zz.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'Y' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00c8' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = zz.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'I' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00fa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void d(boolean bl2) {
        this.s.set(bl2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(zz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(zz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

