/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Hc;
import a.Ib;
import a.Na;
import a.O_;
import a.d8;
import a.eM;
import a.kX;
import a.mj;
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
public class m6
extends v2 {
    private static final Integer[] d;
    private Ib U;
    private static final Object[] f;
    private static final Map e;
    private Ib u;
    private Ib v;
    private Ib b;
    private Ib h;
    private static final String[] g;
    private Ib O;
    private static final long[] c;
    private Ib B;
    private static final long a;

    public int x(Object object) {
        return this.h.R(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/m6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = m6.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = m6.d(classArray2[i10], string, clazz2, n2, classArray);
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
            throw new RuntimeException("a/m6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public int Q(Object object) {
        return this.O.R(object);
    }

    private static Method h(long l10, long l11) {
        int n2 = m6.e(l10, l11);
        Object object = f[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n2];
                int n4 = string2.indexOf(8);
                clazz3 = m6.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = m6.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m6.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        m6.f[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m6.f(552842314047060L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = m6.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        m6.f[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m6.f(552842314047060L, 0L);
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
                m6.a = d8.a(456013652332124962L, 8785589649174548451L, MethodHandles.lookup().lookupClass()).a(207734077688836L);
                m6.f = new Object[10];
                m6.g = new String[10];
                m6.a();
                m6.e = new HashMap<K, V>(13);
                var0 = m6.a ^ 79539922166044L;
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
                var8_3 = new long[23];
                var5_4 = 0;
                var6_5 = "\u009a\u009a\u00c9\u0014\u009d\u00f7\u00c2QSe\u00c0|\u00a7\u00f2\u00c5\u00a0\u00b3\b\u001a\u00ac\u00d9W\u00d1Dz\u00e9Q\u0091H\u001dc\u00a4wG\u0096$\u008dI\u00d4k<\u0082\u00e7\u00cbKS\r\u009f#\u00ees&|B\u00c2\u00b0\u00b4\u008d\u00fc\u00ab\u0005\u0091\u001bSP5P\u00e5\u0095\u00b1\u0097]\u008b\u00d6\u008f\u001b\u00d2g\u00b0K?\u00d4\u00ac\u0016I\n\u0099Op\u001d\u00b8:\u009d\b\u0002H\u00f5x\u008d\r\u0097l\u0012\u00c2a\u0092Kb3\u00cb\u00c5\u00d1\r9Y\u008b\u00e88\u00ed\u00d4\u0098,\u001aMW/\u00d2\u0087\u0085\u00a2&j\u00c5\u00b1^\u0014\u0080t\u00f8\u00ed\u00c0\u000fw\u00860\u0019\u00d0\u00c5\u0005\u0015\u00c4\u000f\u00c9#x\u00fa\u00c9#\u00e9\u0095o\u00d4=:P\u008a\u000f\u0015";
                var7_6 = "\u009a\u009a\u00c9\u0014\u009d\u00f7\u00c2QSe\u00c0|\u00a7\u00f2\u00c5\u00a0\u00b3\b\u001a\u00ac\u00d9W\u00d1Dz\u00e9Q\u0091H\u001dc\u00a4wG\u0096$\u008dI\u00d4k<\u0082\u00e7\u00cbKS\r\u009f#\u00ees&|B\u00c2\u00b0\u00b4\u008d\u00fc\u00ab\u0005\u0091\u001bSP5P\u00e5\u0095\u00b1\u0097]\u008b\u00d6\u008f\u001b\u00d2g\u00b0K?\u00d4\u00ac\u0016I\n\u0099Op\u001d\u00b8:\u009d\b\u0002H\u00f5x\u008d\r\u0097l\u0012\u00c2a\u0092Kb3\u00cb\u00c5\u00d1\r9Y\u008b\u00e88\u00ed\u00d4\u0098,\u001aMW/\u00d2\u0087\u0085\u00a2&j\u00c5\u00b1^\u0014\u0080t\u00f8\u00ed\u00c0\u000fw\u00860\u0019\u00d0\u00c5\u0005\u0015\u00c4\u000f\u00c9#x\u00fa\u00c9#\u00e9\u0095o\u00d4=:P\u008a\u000f\u0015".length();
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
                    var6_5 = "[\u0000\u0083\u00fe\u0007<\u0094\u00a2\u009e\u00a7DN\u001d~uh";
                    var7_6 = "[\u0000\u0083\u00fe\u0007<\u0094\u00a2\u009e\u00a7DN\u001d~uh".length();
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
        m6.c = var8_3;
        m6.d = new Integer[23];
    }

    public int f(Object object) {
        return this.u.R(object);
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x58D;
        if (d[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/m6", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            m6.d[n3] = n4;
        }
        return d[n3];
    }

    public Object f(Object object) {
        return this.v.Z(object);
    }

    /*
     * Unable to fully structure code
     */
    public m6() {
        block28: {
            block34: {
                block32: {
                    block31: {
                        block29: {
                            block26: {
                                var1_1 = m6.a ^ 87836212984443L;
                                v0 = mj.L();
                                super(eM.YS);
                                var3_2 = v0;
                                try {
                                    block27: {
                                        try {
                                            try {
                                                v1 = Na.MC_1_21_4.H();
                                                if (var3_2 != 0) break block26;
                                                if (v1 == 0) break block27;
                                            }
                                            catch (O_ v2) {
                                                throw m6.a(v2);
                                            }
                                            this.v = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)11676, (long)(5099362352608969154L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, (Object)eM.UT, (long)-6208958560916975834L, (long)var1_1);
                                            this.b = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)25771, (long)(3134402921184315621L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                            if (var3_2 == 0) break block28;
                                        }
                                        catch (O_ v3) {
                                            throw m6.a(v3);
                                        }
                                    }
                                    v1 = kX.C();
                                }
                                catch (O_ v4) {
                                    throw m6.a(v4);
                                }
                            }
                            try {
                                block30: {
                                    try {
                                        try {
                                            v5 = 13;
                                            if (var3_2 != 0) break block29;
                                            if (v1 != v5) break block30;
                                        }
                                        catch (O_ v6) {
                                            throw m6.a(v6);
                                        }
                                        this.b = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)21559, (long)(9106124705781971045L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)Hc.z, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                        this.h = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)9402, (long)(9161230226479220960L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)Hc.z, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                        this.O = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)27012, (long)(3883858102276081102L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)Hc.z, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                        this.u = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)27146, (long)(3968339152390637151L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)Hc.z, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                        this.U = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)3090, (long)(9204496503097073737L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)Hc.z, Byte.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                        this.B = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)7312, (long)(6812699364552650956L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)Hc.z, Byte.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                        if (var3_2 == 0) break block28;
                                    }
                                    catch (O_ v7) {
                                        throw m6.a(v7);
                                    }
                                }
                                v1 = kX.C();
                                v5 = 35;
                            }
                            catch (O_ v8) {
                                throw m6.a(v8);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (var3_2 != 0) break block31;
                                    if (v1 >= v5) {
                                    }
                                    ** GOTO lbl95
                                }
                                catch (O_ v9) {
                                    throw m6.a(v9);
                                }
                                this.b = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)23551, (long)(3485936050783647667L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                if (var3_2 != 0) break block32;
                            }
                            catch (O_ v10) {
                                throw m6.a(v10);
                            }
                            v1 = kX.C();
                            v5 = 37;
                        }
                        catch (O_ v11) {
                            throw m6.a(v11);
                        }
                    }
                    try {
                        block33: {
                            try {
                                if (v1 < v5) break block33;
                                this.h = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)26008, (long)(4643565182855629257L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Double.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                this.O = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)28950, (long)(894795098372955485L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Double.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                this.u = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)21009, (long)(2056130863453208152L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Double.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                if (var3_2 == 0) break block34;
                            }
                            catch (O_ v12) {
                                throw m6.a(v12);
                            }
                        }
                        this.h = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)5812, (long)(8081658489085377259L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Double.TYPE, (long)-6208958560916975834L, (long)var1_1);
                        this.O = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)25747, (long)(5645176637104376000L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Double.TYPE, (long)-6208958560916975834L, (long)var1_1);
                    }
                    catch (O_ v13) {
                        throw m6.a(v13);
                    }
                }
                this.u = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)22058, (long)(7913340524076038770L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Double.TYPE, (long)-6208958560916975834L, (long)var1_1);
            }
            try {
                this.U = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)26870, (long)(4395655223494558891L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Byte.TYPE, (long)-6208958560916975834L, (long)var1_1);
                this.B = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)22065, (long)(1451718652858235495L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Byte.TYPE, (long)-6208958560916975834L, (long)var1_1);
                if (var3_2 == 0) break block28;
lbl95:
                // 2 sources

                this.b = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)26112, (long)(8720877673817197143L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                this.h = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)32462, (long)(2901055513395253889L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                this.O = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)31953, (long)(6042990561125126297L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                this.u = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)6833, (long)(7955284725646767841L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                this.U = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)20132, (long)(4048641488986071805L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Byte.TYPE, (long)-6208958560916975834L, (long)var1_1);
                this.B = m6.c("F", (Object)this, (Object)m6.c("\u00cd", (int)m6.b("p", (int)13215, (long)(7056994943159377867L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Byte.TYPE, (long)-6208958560916975834L, (long)var1_1);
            }
            catch (O_ v14) {
                throw m6.a(v14);
            }
        }
    }

    private static Field g(long l10, long l11) {
        int n2 = m6.e(l10, l11);
        Object object = f[n2];
        if (object instanceof String) {
            String string = g[n2];
            int n3 = string.indexOf(8);
            Class clazz = m6.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = m6.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m6.c(clazz3, string2, clazz2)) != null) {
                    m6.f[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = m6.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        m6.f[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m6.f(552842314047060L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public byte N(Object object) {
        return (byte)this.U.R(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'B' || c10 == 'V' || c10 == '\u00ed' || c10 == '\u00f1') {
                field = m6.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'B' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'V' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00ed' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m6.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'F' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00cd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = m6.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "{\u0014A";
        objectArray[1] = Integer.TYPE;
        m6.g[1] = "java/lang/Integer";
        objectArray[2] = "\u0000\u0002U;\\\u001b\u000b\rDt!\u0003\u0018\nM=";
        objectArray[3] = "{jGH";
        objectArray[4] = Boolean.TYPE;
        m6.g[4] = "java/lang/Boolean";
        objectArray[5] = "=c\u0018H\u0007r6l\t\u0007jr6q\u001d";
        objectArray[6] = "\u0007*\u000e\u0017";
        objectArray[7] = "MY-($NFV<gE@M]8=";
        objectArray[8] = "<\u000e%d\f;~P)\u007f0\u000f\u0006\n))W:9](+YT<L*)\r;o\r&m0oa\fulP+f\f9\u0016\f;g\u000erdM8hII";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "N\u0005,4d\u000f\u0017P\u007fR1\f)\u0002!6?\u000eFV|n'w\u0010[#54HGZ!;Z";
    }

    public int l(Object object) {
        return this.b.R(object);
    }

    public byte R(Object object) {
        return (byte)this.B.R(object);
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (g[n5] != null) {
            return n5;
        }
        Object object = f[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 35;
                break;
            }
            case 1: {
                n4 = 58;
                break;
            }
            case 2: {
                n4 = 0;
                break;
            }
            case 3: {
                n4 = 56;
                break;
            }
            case 4: {
                n4 = 44;
                break;
            }
            case 5: {
                n4 = 8;
                break;
            }
            case 6: {
                n4 = 51;
                break;
            }
            case 7: {
                n4 = 24;
                break;
            }
            case 8: {
                n4 = 62;
                break;
            }
            case 9: {
                n4 = 49;
                break;
            }
            case 10: {
                n4 = 13;
                break;
            }
            case 11: {
                n4 = 5;
                break;
            }
            case 12: {
                n4 = 21;
                break;
            }
            case 13: {
                n4 = 23;
                break;
            }
            case 14: {
                n4 = 31;
                break;
            }
            case 15: {
                n4 = 38;
                break;
            }
            case 16: {
                n4 = 52;
                break;
            }
            case 17: {
                n4 = 47;
                break;
            }
            case 18: {
                n4 = 42;
                break;
            }
            case 19: {
                n4 = 36;
                break;
            }
            case 20: {
                n4 = 15;
                break;
            }
            case 21: {
                n4 = 7;
                break;
            }
            case 22: {
                n4 = 26;
                break;
            }
            case 23: {
                n4 = 6;
                break;
            }
            case 24: {
                n4 = 33;
                break;
            }
            case 25: {
                n4 = 12;
                break;
            }
            case 26: {
                n4 = 34;
                break;
            }
            case 27: {
                n4 = 54;
                break;
            }
            case 28: {
                n4 = 16;
                break;
            }
            case 29: {
                n4 = 17;
                break;
            }
            case 30: {
                n4 = 29;
                break;
            }
            case 31: {
                n4 = 59;
                break;
            }
            case 32: {
                n4 = 30;
                break;
            }
            case 33: {
                n4 = 22;
                break;
            }
            case 34: {
                n4 = 39;
                break;
            }
            case 35: {
                n4 = 57;
                break;
            }
            case 36: {
                n4 = 25;
                break;
            }
            case 37: {
                n4 = 40;
                break;
            }
            case 38: {
                n4 = 20;
                break;
            }
            case 39: {
                n4 = 27;
                break;
            }
            case 40: {
                n4 = 45;
                break;
            }
            case 41: {
                n4 = 48;
                break;
            }
            case 42: {
                n4 = 63;
                break;
            }
            case 43: {
                n4 = 61;
                break;
            }
            case 44: {
                n4 = 32;
                break;
            }
            case 45: {
                n4 = 11;
                break;
            }
            case 46: {
                n4 = 60;
                break;
            }
            case 47: {
                n4 = 43;
                break;
            }
            case 48: {
                n4 = 18;
                break;
            }
            case 49: {
                n4 = 55;
                break;
            }
            case 50: {
                n4 = 4;
                break;
            }
            case 51: {
                n4 = 3;
                break;
            }
            case 52: {
                n4 = 19;
                break;
            }
            case 53: {
                n4 = 1;
                break;
            }
            case 54: {
                n4 = 9;
                break;
            }
            case 55: {
                n4 = 37;
                break;
            }
            case 56: {
                n4 = 10;
                break;
            }
            case 57: {
                n4 = 14;
                break;
            }
            case 58: {
                n4 = 46;
                break;
            }
            case 59: {
                n4 = 28;
                break;
            }
            case 60: {
                n4 = 53;
                break;
            }
            case 61: {
                n4 = 50;
                break;
            }
            case 62: {
                n4 = 2;
                break;
            }
            default: {
                n4 = 41;
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
        m6.g[n5] = new String(cArray);
        return n5;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = m6.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = m6.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = m6.e(l10, l11);
            object = f[n2];
            try {
                if (!(object instanceof String)) break block2;
                m6.f[n2] = clazz = Class.forName(g[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = m6.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m6.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(m6.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

