/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.Ib;
import a.Na;
import a.O_;
import a.d8;
import a.eM;
import a.kX;
import a.qt;
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
public class qe
extends v2 {
    private static final Object[] e;
    public HK P;
    public Ib V;
    public Ib v;
    public Ib U;
    private static final String[] f;
    private static final Map d;
    private static final Integer[] c;
    public Ib A;
    public Ib Y;
    private static final long a;
    private static final long[] b;
    public Ib B;

    private float G(Object object) {
        return this.A.x(object);
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x6BB5;
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
                throw new RuntimeException("a/qe", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            qe.c[n3] = n4;
        }
        return c[n3];
    }

    private static Method h(long l10, long l11) {
        int n2 = qe.e(l10, l11);
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
                clazz3 = qe.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = qe.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = qe.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        qe.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = qe.f(689350334738453L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = qe.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        qe.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = qe.f(689350334738453L, 0L);
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

    private float v(Object object) {
        return this.B.x(object);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qe" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00cd' || c10 == '\u00cc' || c10 == '\u00fb' || c10 == 'U') {
                field = qe.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00cd' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00cc' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00fb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = qe.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'A' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private Object S(Object object) {
        return this.v.Z(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = qe.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private Object w(Object object) {
        return this.Y.Z(object);
    }

    public qe() {
        block37: {
            int n2;
            int n3;
            long l10;
            block38: {
                String string;
                block35: {
                    block31: {
                        block32: {
                            CallSite callSite;
                            block33: {
                                block29: {
                                    block30: {
                                        l10 = a ^ 0x1C0487D969C5L;
                                        String string2 = qt.w();
                                        super(eM.bf);
                                        string = string2;
                                        try {
                                            try {
                                                n3 = Na.MC_1_21_6.H();
                                                if (string != null) break block29;
                                                if (n3 == 0) break block30;
                                            }
                                            catch (O_ o_2) {
                                                throw qe.a(o_2);
                                            }
                                            this.v = qe.c("A", (Object)this, (Object)qe.c("\u00e6", (int)qe.b("n", (int)10986, (long)(0x50350026D68F570AL ^ l10)), (long)-7611331729468212428L, (long)l10), (boolean)true, (Object)eM.r0, (long)-7611490510416590856L, (long)l10);
                                        }
                                        catch (O_ o_3) {
                                            throw qe.a(o_3);
                                        }
                                    }
                                    n3 = kX.C();
                                }
                                try {
                                    qe qe2;
                                    block34: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        n2 = 35;
                                                        if (string != null) break block31;
                                                        if (n3 < n2) break block32;
                                                    }
                                                    catch (O_ o_4) {
                                                        throw qe.a(o_4);
                                                    }
                                                    this.A = qe.c("A", (Object)this, (Object)qe.c("\u00e6", (int)qe.b("n", (int)951, (long)(0x79959FCB6E9BFE58L ^ l10)), (long)-7611331729468212428L, (long)l10), (boolean)true, Float.TYPE, (long)-7611490510416590856L, (long)l10);
                                                    this.B = qe.c("A", (Object)this, (Object)qe.c("\u00e6", (int)qe.b("n", (int)15431, (long)(0x7BFD2DD7556D41AEL ^ l10)), (long)-7611331729468212428L, (long)l10), (boolean)true, Float.TYPE, (long)-7611490510416590856L, (long)l10);
                                                    this.U = qe.c("A", (Object)this, (Object)qe.c("\u00e6", (int)qe.b("n", (int)14029, (long)(0x59D7FCCC440FCB23L ^ l10)), (long)-7611331729468212428L, (long)l10), (boolean)true, (Object)eM.YN, (long)-7611490510416590856L, (long)l10);
                                                    qe2 = this;
                                                    callSite = qe.c("A", (Object)this, (Object)qe.c("\u00e6", (int)qe.b("n", (int)24075, (long)(0x14BF9E2FFA9E23E6L ^ l10)), (long)-7611331729468212428L, (long)l10), (boolean)true, (Object)eM.PE, (long)-7611490510416590856L, (long)l10);
                                                    if (string != null) break block33;
                                                }
                                                catch (O_ o_5) {
                                                    throw qe.a(o_5);
                                                }
                                                qe2.V = callSite;
                                                if (!Na.MC_1_21_11.H()) break block34;
                                            }
                                            catch (O_ o_6) {
                                                throw qe.a(o_6);
                                            }
                                            this.Y = qe.c("A", (Object)this, (Object)qe.c("\u00e6", (int)qe.b("n", (int)16877, (long)(0x63F52E7DF239BC01L ^ l10)), (long)-7611331729468212428L, (long)l10), (boolean)true, (Object)eM.EV, (long)-7611490510416590856L, (long)l10);
                                            if (string == null) break block32;
                                        }
                                        catch (O_ o_7) {
                                            throw qe.a(o_7);
                                        }
                                    }
                                    qe2 = this;
                                    callSite = qe.c("A", (Object)this, (Object)qe.c("\u00e6", (int)qe.b("n", (int)8502, (long)(0x13BBEC8B25AF5CD7L ^ l10)), (long)-7611331729468212428L, (long)l10), (boolean)true, (Object)eM.rF, (long)-7611490510416590856L, (long)l10);
                                }
                                catch (O_ o_8) {
                                    throw qe.a(o_8);
                                }
                            }
                            qe2.Y = callSite;
                        }
                        n3 = kX.C();
                        n2 = 13;
                    }
                    try {
                        block36: {
                            try {
                                try {
                                    if (string != null) break block35;
                                    if (n3 != n2) break block36;
                                }
                                catch (O_ o_9) {
                                    throw qe.a(o_9);
                                }
                                this.P = qe.c("A", (Object)this, (Object)qe.c("\u00e6", (int)qe.b("n", (int)18076, (long)(0x3787E5A0DC363B76L ^ l10)), (long)-7611331729468212428L, (long)l10), (boolean)true, (Object)eM.l, (Object)new Class[]{eM.EV, eM.Ut, Float.TYPE}, (long)-7611378802393291896L, (long)l10);
                                if (string == null) break block37;
                            }
                            catch (O_ o_10) {
                                throw qe.a(o_10);
                            }
                        }
                        n3 = kX.C();
                        n2 = 15;
                    }
                    catch (O_ o_11) {
                        throw qe.a(o_11);
                    }
                }
                try {
                    block39: {
                        try {
                            try {
                                if (string != null) break block38;
                                if (n3 != n2) break block39;
                            }
                            catch (O_ o_12) {
                                throw qe.a(o_12);
                            }
                            this.P = qe.c("A", (Object)this, (Object)qe.c("\u00e6", (int)qe.b("n", (int)4895, (long)(0x41DC45B872CDEEF7L ^ l10)), (long)-7611331729468212428L, (long)l10), (boolean)true, (Object)eM.l, (Object)new Class[]{eM.EV, eM.PE, Float.TYPE}, (long)-7611378802393291896L, (long)l10);
                            if (string == null) break block37;
                        }
                        catch (O_ o_13) {
                            throw qe.a(o_13);
                        }
                    }
                    n3 = kX.C();
                    n2 = 23;
                }
                catch (O_ o_14) {
                    throw qe.a(o_14);
                }
            }
            try {
                if (n3 == n2) {
                    this.P = qe.c("A", (Object)this, (Object)qe.c("\u00e6", (int)qe.b("n", (int)24318, (long)(0x2D64DB3555FDA315L ^ l10)), (long)-7611331729468212428L, (long)l10), (boolean)true, (Object)eM.VJ, (Object)new Class[]{eM.EV, eM.PE, Float.TYPE}, (long)-7611378802393291896L, (long)l10);
                }
            }
            catch (O_ o_15) {
                throw qe.a(o_15);
            }
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qe" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private Object n(Object object) {
        return this.V.Z(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                qe.a = d8.a(1186700489842806615L, 5760070054079322978L, MethodHandles.lookup().lookupClass()).a(241107508946992L);
                qe.e = new Object[13];
                qe.f = new String[13];
                qe.a();
                qe.d = new HashMap<K, V>(13);
                var0 = qe.a ^ 20709102813563L;
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
                var8_3 = new long[10];
                var5_4 = 0;
                var6_5 = "k%\u009ck\u00eb\u00d2\u00e7\u0000\u00d4\u00fc\u0007E&`$\u00d0*-\u00c2\u000f(\u0000i\"\u00dd\u00a4^\u0099\u0096}~\u00f2\u0011T\u00d5\u00b0#\u00de\u00bc\u0001]\u00c0,\u0096\u00d3\u0016\u00f4\u009dW\u0017m\u00aab\u00ef\u009b\n\u00c7\u007f9T\u0004T\u009ca";
                var7_6 = "k%\u009ck\u00eb\u00d2\u00e7\u0000\u00d4\u00fc\u0007E&`$\u00d0*-\u00c2\u000f(\u0000i\"\u00dd\u00a4^\u0099\u0096}~\u00f2\u0011T\u00d5\u00b0#\u00de\u00bc\u0001]\u00c0,\u0096\u00d3\u0016\u00f4\u009dW\u0017m\u00aab\u00ef\u009b\n\u00c7\u007f9T\u0004T\u009ca".length();
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
                    var6_5 = "._e\u0080\u00ae.\u001c;wM\u00ab.\u0006\u0093\u00a7,";
                    var7_6 = "._e\u0080\u00ae.\u001c;wM\u00ab.\u0006\u0093\u00a7,".length();
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
        qe.b = var8_3;
        qe.c = new Integer[10];
    }

    private static int e(long l10, long l11) {
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
                n4 = 33;
                break;
            }
            case 1: {
                n4 = 8;
                break;
            }
            case 2: {
                n4 = 28;
                break;
            }
            case 3: {
                n4 = 36;
                break;
            }
            case 4: {
                n4 = 61;
                break;
            }
            case 5: {
                n4 = 23;
                break;
            }
            case 6: {
                n4 = 10;
                break;
            }
            case 7: {
                n4 = 52;
                break;
            }
            case 8: {
                n4 = 49;
                break;
            }
            case 9: {
                n4 = 48;
                break;
            }
            case 10: {
                n4 = 15;
                break;
            }
            case 11: {
                n4 = 25;
                break;
            }
            case 12: {
                n4 = 29;
                break;
            }
            case 13: {
                n4 = 11;
                break;
            }
            case 14: {
                n4 = 30;
                break;
            }
            case 15: {
                n4 = 1;
                break;
            }
            case 16: {
                n4 = 56;
                break;
            }
            case 17: {
                n4 = 26;
                break;
            }
            case 18: {
                n4 = 9;
                break;
            }
            case 19: {
                n4 = 24;
                break;
            }
            case 20: {
                n4 = 21;
                break;
            }
            case 21: {
                n4 = 40;
                break;
            }
            case 22: {
                n4 = 54;
                break;
            }
            case 23: {
                n4 = 34;
                break;
            }
            case 24: {
                n4 = 58;
                break;
            }
            case 25: {
                n4 = 32;
                break;
            }
            case 26: {
                n4 = 20;
                break;
            }
            case 27: {
                n4 = 51;
                break;
            }
            case 28: {
                n4 = 16;
                break;
            }
            case 29: {
                n4 = 2;
                break;
            }
            case 30: {
                n4 = 53;
                break;
            }
            case 31: {
                n4 = 12;
                break;
            }
            case 32: {
                n4 = 4;
                break;
            }
            case 33: {
                n4 = 46;
                break;
            }
            case 34: {
                n4 = 37;
                break;
            }
            case 35: {
                n4 = 7;
                break;
            }
            case 36: {
                n4 = 31;
                break;
            }
            case 37: {
                n4 = 57;
                break;
            }
            case 38: {
                n4 = 18;
                break;
            }
            case 39: {
                n4 = 62;
                break;
            }
            case 40: {
                n4 = 17;
                break;
            }
            case 41: {
                n4 = 55;
                break;
            }
            case 42: {
                n4 = 3;
                break;
            }
            case 43: {
                n4 = 63;
                break;
            }
            case 44: {
                n4 = 41;
                break;
            }
            case 45: {
                n4 = 43;
                break;
            }
            case 46: {
                n4 = 5;
                break;
            }
            case 47: {
                n4 = 47;
                break;
            }
            case 48: {
                n4 = 19;
                break;
            }
            case 49: {
                n4 = 60;
                break;
            }
            case 50: {
                n4 = 44;
                break;
            }
            case 51: {
                n4 = 39;
                break;
            }
            case 52: {
                n4 = 14;
                break;
            }
            case 53: {
                n4 = 13;
                break;
            }
            case 54: {
                n4 = 6;
                break;
            }
            case 55: {
                n4 = 38;
                break;
            }
            case 56: {
                n4 = 59;
                break;
            }
            case 57: {
                n4 = 50;
                break;
            }
            case 58: {
                n4 = 42;
                break;
            }
            case 59: {
                n4 = 45;
                break;
            }
            case 60: {
                n4 = 0;
                break;
            }
            case 61: {
                n4 = 35;
                break;
            }
            case 62: {
                n4 = 27;
                break;
            }
            default: {
                n4 = 22;
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
        qe.f[n5] = new String(cArray);
        return n5;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "P\r$";
        objectArray[1] = Integer.TYPE;
        qe.f[1] = "java/lang/Integer";
        objectArray[2] = "}2j@T\nv={\u000f)\u0012e:rF";
        objectArray[3] = "m\\`]";
        objectArray[4] = Boolean.TYPE;
        qe.f[4] = "java/lang/Boolean";
        objectArray[5] = "\u0019kHenw\u0012dY*\u0003w\u0012yM";
        objectArray[6] = "zf[\u001c";
        objectArray[7] = "dWyJ\u0010y\u0011wrE\u00016|wrX\u0015#";
        objectArray[8] = "3)S\u001a";
        objectArray[9] = "$/\b^~i/ \u0019\u0011\u001fg$+\u001dK";
        objectArray[10] = "\u0018aO{b3SaP;\fV\"3McfjBa\u001bnc\r\u00191N:pa\\zE0\f1\u00193I6mkH;Y\n0iGe\\vi6Lf\"";
        objectArray[11] = "[\u0000F=X\u0011\u0010\u0000Y}6raRD%\\H\u0001\u0000\u0012(Y/ZPG|JC\u001f\u001bLv6\u0013ZR@pWI\u000bZPL\u000b\u001f\u0002\bH,X\u0011\u0018\u0001+qKM\u000e\u0012Lq[\u0014\bk";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "u\u0015 \u0004Z7j]'5Z4\u0013\u001f$\u0004\u0000%*\n9\u00051v|\u000e5RQ$*\u000305";
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = qe.e(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                qe.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field g(long l10, long l11) {
        int n2 = qe.e(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = qe.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = qe.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = qe.c(clazz3, string2, clazz2)) != null) {
                    qe.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = qe.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        qe.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = qe.f(689350334738453L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static Object b(qe qe2, Object object) {
        return qe2.w(object);
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

    static float g(qe qe2, Object object) {
        return qe2.v(object);
    }

    static Object C(qe qe2, Object object) {
        return qe2.S(object);
    }

    static float B(qe qe2, Object object) {
        return qe2.G(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = qe.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = qe.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = qe.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = qe.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static Object B(qe qe2, Object object) {
        return qe2.R(object);
    }

    private Object R(Object object) {
        return this.U.Z(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = qe.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    static Object Z(qe qe2, Object object) {
        return qe2.n(object);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(qe.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(qe.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

