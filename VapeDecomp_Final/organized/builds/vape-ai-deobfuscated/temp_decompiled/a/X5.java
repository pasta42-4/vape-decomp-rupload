/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ay;
import a.Bg;
import a.EP;
import a.Kb;
import a.Kd;
import a.OY;
import a.O_;
import a.Oe;
import a.Qg;
import a._2;
import a.d8;
import a.jX;
import a.kX;
import a.oQ;
import a.pt;
import a.rT;
import a.t1;
import a.tU;
import a.x4;
import a.xi;
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

public class x5
extends x4<Ay> {
    private final Ay B;
    private static final Map m;
    private long L;
    private static final Integer[] j;
    private final jX l;
    private static final Object[] n;
    private boolean o;
    private static final String[] r;
    private static final long d;
    private final Bg e;
    private static final long[] h;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'o' || c10 == '\u00d8' || c10 == '\u00e0' || c10 == 'J') {
                field = x5.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00d8' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = x5.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00c2' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                x5.d = d8.a(-3150213846741050208L, 703143241871871699L, MethodHandles.lookup().lookupClass()).a(62932396623063L);
                x5.n = new Object[5];
                x5.r = new String[5];
                x5.a();
                x5.m = new HashMap<K, V>(13);
                var0 = x5.d ^ 80098231561106L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u00b9\u0014+a\u0091\u00ea\u0019\u00a2(\u00b4\u00e2\u001d\u001f\u00ac\u00fa\u00deJ\u00cc!\u0017\u00e4\n7\\";
                var7_6 = "\u00b9\u0014+a\u0091\u00ea\u0019\u00a2(\u00b4\u00e2\u001d\u001f\u00ac\u00fa\u00deJ\u00cc!\u0017\u00e4\n7\\".length();
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
                    var6_5 = "\u0005-\u00e8\u00aff\u00bcp\u00a0M\u00d7\u0010\u00cd\u0080i\u009d\u00be";
                    var7_6 = "\u0005-\u00e8\u00aff\u00bcp\u00a0M\u00d7\u0010\u00cd\u0080i\u009d\u00be".length();
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
        x5.h = var8_3;
        x5.j = new Integer[5];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method d(long l10, long l11) {
        int n2 = x5.a(l10, l11);
        Object object = n[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = r[n2];
                int n4 = string2.indexOf(8);
                clazz3 = x5.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = x5.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = x5.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        x5.n[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = x5.b(230297562875169L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = x5.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        x5.n[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = x5.b(230297562875169L, 0L);
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

    @OY
    public void S(Kb kb2) {
        block13: {
            try {
                if (EP.X().r()) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw x5.a(o_2);
            }
            try {
                if (!((Ay)this.n()).b()) {
                    return;
                }
            }
            catch (O_ o_3) {
                throw x5.a(o_3);
            }
            Qg qg2 = EP.U();
            try {
                if (qg2.T()) {
                    return;
                }
            }
            catch (O_ o_4) {
                throw x5.a(o_4);
            }
            try {
                try {
                    if (!this.B.f() || !((double)qg2.S() < this.B.Z())) break block13;
                }
                catch (O_ o_5) {
                    throw x5.a(o_5);
                }
                return;
            }
            catch (O_ o_6) {
                throw x5.a(o_6);
            }
        }
        t1 t12 = EP.N();
        tU tU2 = t12.f();
        Oe.f(tU2, this.o);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = x5.a(l10, l11);
            object = n[n2];
            try {
                if (!(object instanceof String)) break block2;
                x5.n[n2] = clazz = Class.forName(r[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @OY
    public void X(Kd kd2) {
        tU tU2;
        block59: {
            boolean bl2;
            block60: {
                boolean bl3;
                Qg qg2;
                block58: {
                    block56: {
                        float f10;
                        block54: {
                            double d2;
                            Object object;
                            block61: {
                                block55: {
                                    boolean bl4;
                                    t1 t12;
                                    block53: {
                                        long l10 = d ^ 0x46D04BB29D4AL;
                                        try {
                                            if (EP.X().r()) {
                                                return;
                                            }
                                        }
                                        catch (O_ o_2) {
                                            throw x5.a(o_2);
                                        }
                                        try {
                                            if (!((Ay)this.n()).b()) {
                                                return;
                                            }
                                        }
                                        catch (O_ o_3) {
                                            throw x5.a(o_3);
                                        }
                                        try {
                                            if (!kd2.getEntity().equals(EP.U())) {
                                                return;
                                            }
                                        }
                                        catch (O_ o_4) {
                                            throw x5.a(o_4);
                                        }
                                        CallSite callSite = x5.c("\u00e4", (int)x5.a("q", (int)27343, (long)(0x38650579C75E3EA0L ^ l10)), (long)-3193225509588768910L, (long)l10);
                                        if (kX.C() >= 35) {
                                            callSite = x5.c("\u00e4", (int)x5.a("q", (int)3003, (long)(0x4E3224DCFB4EDFD5L ^ l10)), (long)-3193225509588768910L, (long)l10);
                                        }
                                        try {
                                            if (!Thread.currentThread().getName().equals(callSite)) {
                                                return;
                                            }
                                        }
                                        catch (O_ o_5) {
                                            throw x5.a(o_5);
                                        }
                                        qg2 = EP.U();
                                        t12 = EP.N();
                                        tU2 = t12.f();
                                        try {
                                            if (qg2.T()) {
                                                _2.O.b(this.B);
                                                return;
                                            }
                                        }
                                        catch (O_ o_6) {
                                            throw x5.a(o_6);
                                        }
                                        try {
                                            try {
                                                if (!this.B.f() || !((double)qg2.S() < this.B.Z())) break block53;
                                            }
                                            catch (O_ o_7) {
                                                throw x5.a(o_7);
                                            }
                                            _2.O.b(this.B);
                                            return;
                                        }
                                        catch (O_ o_8) {
                                            throw x5.a(o_8);
                                        }
                                    }
                                    this.o = tU2.X();
                                    bl3 = false;
                                    f10 = 0.0f;
                                    tU tU3 = t12.w();
                                    tU tU4 = t12.s();
                                    if (rT.s(tU3)) {
                                        f10 += -1.0f;
                                    }
                                    if (rT.s(tU4)) {
                                        f10 += 1.0f;
                                    }
                                    try {
                                        bl4 = f10 <= 0.0f;
                                    }
                                    catch (O_ o_9) {
                                        throw x5.a(o_9);
                                    }
                                    boolean bl5 = bl4;
                                    try {
                                        try {
                                            if (!bl5 || !qg2.j()) break block54;
                                        }
                                        catch (O_ o_10) {
                                            throw x5.a(o_10);
                                        }
                                        if (kX.C() < 15) break block55;
                                    }
                                    catch (O_ o_11) {
                                        throw x5.a(o_11);
                                    }
                                    object = qg2.L();
                                    break block61;
                                }
                                Object object2 = qg2.L();
                                object = ((oQ)object2).h();
                            }
                            double d3 = qg2.G();
                            try {
                                d2 = kX.C() >= 50 ? 1.0 : -1.0;
                            }
                            catch (O_ o_12) {
                                throw x5.a(o_12);
                            }
                            double d4 = d2;
                            double d5 = qg2.o();
                            oQ oQ2 = ((oQ)object).B(-0.2, 0.0, -0.2).s(d3, d4, d5);
                            int n2 = EP.c().v(qg2, oQ2).size();
                            if (n2 == 0) {
                                bl3 = true;
                                _2.O.d(this.B);
                            }
                        }
                        bl2 = false;
                        try {
                            block57: {
                                try {
                                    try {
                                        try {
                                            if (!_2.O.z(this.B)) break block56;
                                            if (f10 > 0.0f) break block57;
                                        }
                                        catch (O_ o_13) {
                                            throw x5.a(o_13);
                                        }
                                        if (bl3) break block56;
                                    }
                                    catch (O_ o_14) {
                                        throw x5.a(o_14);
                                    }
                                    if (!this.e.m(500L)) break block56;
                                }
                                catch (O_ o_15) {
                                    throw x5.a(o_15);
                                }
                            }
                            _2.O.b(this.B);
                        }
                        catch (O_ o_16) {
                            throw x5.a(o_16);
                        }
                    }
                    try {
                        try {
                            if (bl3 || this.e.m(this.L)) break block58;
                        }
                        catch (O_ o_17) {
                            throw x5.a(o_17);
                        }
                        if (this.L <= 30L) break block58;
                    }
                    catch (O_ o_18) {
                        throw x5.a(o_18);
                    }
                    bl3 = true;
                    bl2 = true;
                }
                try {
                    try {
                        try {
                            if (!bl3 || !qg2.j()) break block59;
                        }
                        catch (O_ o_19) {
                            throw x5.a(o_19);
                        }
                        if (qg2.H()) break block60;
                    }
                    catch (O_ o_20) {
                        throw x5.a(o_20);
                    }
                    this.L = (long)this.l.l();
                }
                catch (O_ o_21) {
                    throw x5.a(o_21);
                }
            }
            try {
                Oe.f(tU2, true);
                if (bl2) return;
                this.e.m();
                return;
            }
            catch (O_ o_22) {
                throw x5.a(o_22);
            }
        }
        try {
            if (this.o) return;
            Oe.f(tU2, false);
            return;
        }
        catch (O_ o_23) {
            throw x5.a(o_23);
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = x5.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7C2;
        if (j[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = h[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/x5", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            x5.j[n3] = n4;
        }
        return j[n3];
    }

    private static void a() {
        Object[] objectArray = n;
        n[0] = "4\u001dn";
        objectArray[1] = Integer.TYPE;
        x5.r[1] = "java/lang/Integer";
        objectArray[2] = "wb5H\u001e\f|m$\u0007c\u0014oj-N";
        objectArray[3] = "B^kQ*wIQz\u001eKyBZ~D";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Q\u0018s\u0018m-\u0019\u0004+w?<h\u0001 \u0014)%\u000e\u0010.\u000bT}P\u0005)\b5\u007fV\u000etw";
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = x5.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    @OY
    public void f(pt pt2) {
        this.B.Z();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = x5.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = x5.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public x5(xi xi2, String string) {
        long l10 = d ^ 0x1A327EC067E6L;
        super(xi2, string);
        this.l = jX.K(this, (String)((Object)x5.c("\u00e4", (int)x5.a("q", (int)28245, (long)(0x5F57A8CC8419C091L ^ l10)), (long)2955274720889282014L, (long)l10)), (String)((Object)x5.c("\u00e4", (int)x5.a("q", (int)9048, (long)(0x7090A73FEF898D99L ^ l10)), (long)2955274720889282014L, (long)l10)), "", 0.0, 100.0, 200.0, 500.0, 1.0, (String)((Object)x5.c("\u00e4", (int)x5.a("q", (int)13009, (long)(0x2E7BC816F9029C11L ^ l10)), (long)2955274720889282014L, (long)l10)));
        this.B = (Ay)this.n();
        this.e = new Bg();
        this.N(this.l);
    }

    private static Field c(long l10, long l11) {
        int n2 = x5.a(l10, l11);
        Object object = n[n2];
        if (object instanceof String) {
            String string = r[n2];
            int n3 = string.indexOf(8);
            Class clazz = x5.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = x5.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = x5.a(clazz3, string2, clazz2)) != null) {
                    x5.n[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = x5.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        x5.n[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = x5.b(230297562875169L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void h() {
        this.e.m();
        this.L = (long)this.l.l();
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (r[n5] != null) {
            return n5;
        }
        Object object = n[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 57;
                break;
            }
            case 1: {
                n4 = 50;
                break;
            }
            case 2: {
                n4 = 63;
                break;
            }
            case 3: {
                n4 = 28;
                break;
            }
            case 4: {
                n4 = 18;
                break;
            }
            case 5: {
                n4 = 62;
                break;
            }
            case 6: {
                n4 = 13;
                break;
            }
            case 7: {
                n4 = 33;
                break;
            }
            case 8: {
                n4 = 31;
                break;
            }
            case 9: {
                n4 = 11;
                break;
            }
            case 10: {
                n4 = 59;
                break;
            }
            case 11: {
                n4 = 25;
                break;
            }
            case 12: {
                n4 = 1;
                break;
            }
            case 13: {
                n4 = 56;
                break;
            }
            case 14: {
                n4 = 16;
                break;
            }
            case 15: {
                n4 = 52;
                break;
            }
            case 16: {
                n4 = 23;
                break;
            }
            case 17: {
                n4 = 37;
                break;
            }
            case 18: {
                n4 = 41;
                break;
            }
            case 19: {
                n4 = 4;
                break;
            }
            case 20: {
                n4 = 40;
                break;
            }
            case 21: {
                n4 = 51;
                break;
            }
            case 22: {
                n4 = 2;
                break;
            }
            case 23: {
                n4 = 44;
                break;
            }
            case 24: {
                n4 = 36;
                break;
            }
            case 25: {
                n4 = 15;
                break;
            }
            case 26: {
                n4 = 17;
                break;
            }
            case 27: {
                n4 = 46;
                break;
            }
            case 28: {
                n4 = 7;
                break;
            }
            case 29: {
                n4 = 29;
                break;
            }
            case 30: {
                n4 = 55;
                break;
            }
            case 31: {
                n4 = 43;
                break;
            }
            case 32: {
                n4 = 14;
                break;
            }
            case 33: {
                n4 = 24;
                break;
            }
            case 34: {
                n4 = 39;
                break;
            }
            case 35: {
                n4 = 27;
                break;
            }
            case 36: {
                n4 = 22;
                break;
            }
            case 37: {
                n4 = 34;
                break;
            }
            case 38: {
                n4 = 0;
                break;
            }
            case 39: {
                n4 = 12;
                break;
            }
            case 40: {
                n4 = 42;
                break;
            }
            case 41: {
                n4 = 20;
                break;
            }
            case 42: {
                n4 = 5;
                break;
            }
            case 43: {
                n4 = 3;
                break;
            }
            case 44: {
                n4 = 30;
                break;
            }
            case 45: {
                n4 = 8;
                break;
            }
            case 46: {
                n4 = 58;
                break;
            }
            case 47: {
                n4 = 53;
                break;
            }
            case 48: {
                n4 = 54;
                break;
            }
            case 49: {
                n4 = 61;
                break;
            }
            case 50: {
                n4 = 9;
                break;
            }
            case 51: {
                n4 = 26;
                break;
            }
            case 52: {
                n4 = 6;
                break;
            }
            case 53: {
                n4 = 48;
                break;
            }
            case 54: {
                n4 = 47;
                break;
            }
            case 55: {
                n4 = 32;
                break;
            }
            case 56: {
                n4 = 19;
                break;
            }
            case 57: {
                n4 = 38;
                break;
            }
            case 58: {
                n4 = 21;
                break;
            }
            case 59: {
                n4 = 35;
                break;
            }
            case 60: {
                n4 = 45;
                break;
            }
            case 61: {
                n4 = 10;
                break;
            }
            case 62: {
                n4 = 60;
                break;
            }
            default: {
                n4 = 49;
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
        x5.r[n5] = new String(cArray);
        return n5;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = x5.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = x5.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(x5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(x5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

