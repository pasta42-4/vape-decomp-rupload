/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Ao;
import a.F8;
import a.G5;
import a.O_;
import a.Sz;
import a.WM;
import a.X_;
import a.bE;
import a.d8;
import a.fB;
import a.hQ;
import a.ht;
import a.rn;
import a.wr;
import a.yG;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class y_
extends hQ {
    private final String V;
    private static final long[] bb;
    private float L;
    private final Color em;
    private boolean ee;
    private boolean ei;
    private static final long ab;
    private boolean ea;
    @Nullable
    private Color ef;
    private final rn eo;
    private final Color ez;
    private boolean e2;
    private static final Map eb;
    private final yG ed;
    private rn Y;
    private static final Object[] fb;
    private static final Integer[] db;
    private final List<ht> eg;
    private float ey;
    private boolean b;
    private Color e6;
    private boolean e_;
    private final float eR = 2.0f;
    private final rn el;
    @Nullable
    private Color D;
    private static final String[] jb;
    @Nullable
    private fB ev;
    private static final float e4 = 12.5f;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = y_.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void Z(Sz sz2) {
        block19: {
            fB fB2;
            block18: {
                block17: {
                    try {
                        try {
                            try {
                                if (this.ef == null || !((double)sz2.getX() < this.G() + this.w() - 12.5)) break block17;
                            }
                            catch (O_ o_2) {
                                throw y_.a(o_2);
                            }
                            if (!((double)sz2.getY() > this.W())) break block17;
                        }
                        catch (O_ o_3) {
                            throw y_.a(o_3);
                        }
                        super.Z(sz2);
                        Ao.d = null;
                        return;
                    }
                    catch (O_ o_4) {
                        throw y_.a(o_4);
                    }
                }
                try {
                    if (this.ee) {
                        return;
                    }
                }
                catch (O_ o_5) {
                    throw y_.a(o_5);
                }
                fB2 = this.ev;
                try {
                    try {
                        if (fB2 == null || !fB2.G()) break block18;
                    }
                    catch (O_ o_6) {
                        throw y_.a(o_6);
                    }
                    fB2.S(sz2);
                    this.b();
                    return;
                }
                catch (O_ o_7) {
                    throw y_.a(o_7);
                }
            }
            try {
                try {
                    if (fB2 != null && fB2.G()) break block19;
                }
                catch (O_ o_8) {
                    throw y_.a(o_8);
                }
                this.b();
            }
            catch (O_ o_9) {
                throw y_.a(o_9);
            }
        }
    }

    public void Q(Color color) {
        this.e6 = color;
        this.getClass();
        this.Y = new rn(0.15, new Color(0, 0, 0, 0), this.Y.Q());
    }

    @Nullable
    public Color A() {
        return this.D;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                y_.ab = d8.a(-6458996984380748545L, 5879811499615310674L, MethodHandles.lookup().lookupClass()).a(205325404331722L);
                y_.fb = new Object[5];
                y_.jb = new String[5];
                y_.n();
                y_.eb = new HashMap<K, V>(13);
                var0 = y_.ab ^ 91886583542573L;
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
                var6_5 = "\u00eaJV\f8\u0098<\u000b\u0090]{\u00bc\u0085\u00b4\u00e5\u00da";
                var7_6 = "\u00eaJV\f8\u0098<\u000b\u0090]{\u00bc\u0085\u00b4\u00e5\u00da".length();
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
                    var6_5 = "~\u00d7\u00f5\u0081I\u00fa\u00f9o\u0086\u00e3!\u00a3\u00e3|\u00b0^";
                    var7_6 = "~\u00d7\u00f5\u0081I\u00fa\u00f9o\u0086\u00e3!\u00a3\u00e3|\u00b0^".length();
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
        y_.bb = var8_3;
        y_.db = new Integer[4];
    }

    public boolean Y() {
        return this.b;
    }

    public void r(boolean bl2) {
        this.ei = bl2;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public boolean d() {
        return this.ee;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void a(boolean bl2) {
        this.e_ = bl2;
    }

    public void B(@Nullable Color color) {
        this.ef = color;
    }

    @Override
    public double e() {
        return 0.0;
    }

    @Override
    public void U() {
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public void E() {
        super.E();
        fB fB2 = this.ev;
        try {
            if (fB2 != null) {
                this.F();
                this.ed.Q(this.Y.k());
                this.ed.h(true);
                this.ed.E();
            }
        }
        catch (O_ o_2) {
            throw y_.a(o_2);
        }
    }

    public boolean Q() {
        return this.ei;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'T' || c10 == '$' || c10 == '\u00c2' || c10 == 'V') {
                field = y_.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'T' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '$' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00c2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = y_.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00c5' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'P' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x744A;
        if (db[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = bb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/y_", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            y_.db[n3] = n4;
        }
        return db[n3];
    }

    private static Method h(long l10, long l11) {
        int n2 = y_.e(l10, l11);
        Object object = fb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = y_.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = y_.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = y_.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        y_.fb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = y_.f(235524917251912L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = y_.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        y_.fb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = y_.f(235524917251912L, 0L);
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

    public boolean i() {
        return this.e_;
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

    public String a() {
        return this.V;
    }

    static fB q(y_ y_2) {
        return y_2.ev;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (jb[n5] != null) {
            return n5;
        }
        Object object = fb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 10;
                break;
            }
            case 1: {
                n4 = 26;
                break;
            }
            case 2: {
                n4 = 27;
                break;
            }
            case 3: {
                n4 = 22;
                break;
            }
            case 4: {
                n4 = 63;
                break;
            }
            case 5: {
                n4 = 20;
                break;
            }
            case 6: {
                n4 = 41;
                break;
            }
            case 7: {
                n4 = 47;
                break;
            }
            case 8: {
                n4 = 23;
                break;
            }
            case 9: {
                n4 = 29;
                break;
            }
            case 10: {
                n4 = 46;
                break;
            }
            case 11: {
                n4 = 0;
                break;
            }
            case 12: {
                n4 = 59;
                break;
            }
            case 13: {
                n4 = 19;
                break;
            }
            case 14: {
                n4 = 30;
                break;
            }
            case 15: {
                n4 = 45;
                break;
            }
            case 16: {
                n4 = 14;
                break;
            }
            case 17: {
                n4 = 6;
                break;
            }
            case 18: {
                n4 = 13;
                break;
            }
            case 19: {
                n4 = 42;
                break;
            }
            case 20: {
                n4 = 5;
                break;
            }
            case 21: {
                n4 = 55;
                break;
            }
            case 22: {
                n4 = 53;
                break;
            }
            case 23: {
                n4 = 40;
                break;
            }
            case 24: {
                n4 = 28;
                break;
            }
            case 25: {
                n4 = 35;
                break;
            }
            case 26: {
                n4 = 58;
                break;
            }
            case 27: {
                n4 = 37;
                break;
            }
            case 28: {
                n4 = 32;
                break;
            }
            case 29: {
                n4 = 12;
                break;
            }
            case 30: {
                n4 = 61;
                break;
            }
            case 31: {
                n4 = 2;
                break;
            }
            case 32: {
                n4 = 34;
                break;
            }
            case 33: {
                n4 = 39;
                break;
            }
            case 34: {
                n4 = 62;
                break;
            }
            case 35: {
                n4 = 24;
                break;
            }
            case 36: {
                n4 = 44;
                break;
            }
            case 37: {
                n4 = 11;
                break;
            }
            case 38: {
                n4 = 56;
                break;
            }
            case 39: {
                n4 = 17;
                break;
            }
            case 40: {
                n4 = 7;
                break;
            }
            case 41: {
                n4 = 51;
                break;
            }
            case 42: {
                n4 = 36;
                break;
            }
            case 43: {
                n4 = 49;
                break;
            }
            case 44: {
                n4 = 4;
                break;
            }
            case 45: {
                n4 = 3;
                break;
            }
            case 46: {
                n4 = 15;
                break;
            }
            case 47: {
                n4 = 18;
                break;
            }
            case 48: {
                n4 = 1;
                break;
            }
            case 49: {
                n4 = 43;
                break;
            }
            case 50: {
                n4 = 33;
                break;
            }
            case 51: {
                n4 = 54;
                break;
            }
            case 52: {
                n4 = 31;
                break;
            }
            case 53: {
                n4 = 52;
                break;
            }
            case 54: {
                n4 = 50;
                break;
            }
            case 55: {
                n4 = 48;
                break;
            }
            case 56: {
                n4 = 8;
                break;
            }
            case 57: {
                n4 = 9;
                break;
            }
            case 58: {
                n4 = 60;
                break;
            }
            case 59: {
                n4 = 38;
                break;
            }
            case 60: {
                n4 = 16;
                break;
            }
            case 61: {
                n4 = 57;
                break;
            }
            case 62: {
                n4 = 21;
                break;
            }
            default: {
                n4 = 25;
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
        y_.jb[n5] = new String(cArray);
        return n5;
    }

    public y_(String string, List<ht> list, Color color, Color color2, Color color3, float f10, float f11) {
        block8: {
            long l10 = ab ^ 0x6558C67C4B88L;
            this.getClass();
            this.eo = new rn(0.15, y_.M.S, y_.M.k);
            this.eR = 2.0f;
            this.em = y_.M.n;
            this.ez = y_.M.n;
            this.e6 = null;
            this.ey = 2.0f;
            this.L = 1.0f;
            this.ef = new Color(255, 255, 255, 30);
            this.D = new Color(255, 255, 255, 30);
            this.e_ = true;
            this.e2 = true;
            this.ei = true;
            this.V = string;
            this.eg = new ArrayList<ht>(list);
            for (ht ht2 : list) {
                ht2.S(true);
                ht2.J(true);
            }
            try {
                if (color != null) {
                    this.Q(color);
                }
            }
            catch (O_ o_2) {
                throw y_.a(o_2);
            }
            try {
                try {
                    this.ed = new yG(110.0, 20.0);
                    this.ed.d().f((String)((Object)y_.c("P", (int)y_.b("v", (int)23453, (long)(0x6FF576EAD9C04453L ^ l10)), (long)-1475759275577575273L, (long)l10)));
                    this.ed.i(120.0);
                    this.ed.i(false);
                    this.ed.C(true);
                    this.getClass();
                    this.Y = new rn(0.15, this.l(), color2);
                    this.getClass();
                    this.el = new rn(0.15, this.em, this.ez);
                    if (color3 == null || color == null) break block8;
                }
                catch (O_ o_3) {
                    throw y_.a(o_3);
                }
                this.m(color3, color);
            }
            catch (O_ o_4) {
                throw y_.a(o_4);
            }
        }
        this.ey = f10;
        this.L = f11;
    }

    private static Field g(long l10, long l11) {
        int n2 = y_.e(l10, l11);
        Object object = fb[n2];
        if (object instanceof String) {
            String string = jb[n2];
            int n3 = string.indexOf(8);
            Class clazz = y_.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = y_.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = y_.c(clazz3, string2, clazz2)) != null) {
                    y_.fb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = y_.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        y_.fb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = y_.f(235524917251912L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void A(boolean bl2) {
        this.b = bl2;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = y_.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    static void R(y_ y_2) {
        y_2.b();
    }

    public boolean M() {
        boolean bl2;
        try {
            bl2 = this.ev != null;
        }
        catch (O_ o_2) {
            throw y_.a(o_2);
        }
        return bl2;
    }

    public void m(Color color, Color color2) {
        this.e6 = color;
        this.getClass();
        this.Y = new rn(0.15, color2, this.Y.Q());
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = y_.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = y_.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public double z() {
        return 0.0;
    }

    private static void n() {
        Object[] objectArray = fb;
        fb[0] = "\u001bYv";
        objectArray[1] = Integer.TYPE;
        y_.jb[1] = "java/lang/Integer";
        objectArray[2] = "\u0001Mk1y\u0005\nBz~\u0004\u001d\u0019Es7";
        objectArray[3] = "xCR\bDxsLCG%vxGG\u001d";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u001d-\u0018Im\u0003ImDvk\u0006#'\u0012\u0013l\u0016Sl\u0000\u0007\u0000DM:O\fx\u001dB-\u0014v";
    }

    public void g(boolean bl2) {
        this.ee = bl2;
    }

    @Override
    public void g() {
        try {
            if (!this.ea) {
                this.eo.c();
            }
        }
        catch (O_ o_2) {
            throw y_.a(o_2);
        }
        this.ea = true;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = y_.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = y_.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean P() {
        return this.e2;
    }

    @Nullable
    public Color e() {
        return this.ef;
    }

    private void b() {
        block6: {
            long l10;
            block8: {
                block7: {
                    block5: {
                        l10 = ab ^ 0x4EA92E28340L;
                        fB fB2 = this.ev;
                        try {
                            if (fB2 == null) break block5;
                            this.ev = null;
                            Ao.d = null;
                            Ao.z(fB2);
                            break block6;
                        }
                        catch (O_ o_2) {
                            throw y_.a(o_2);
                        }
                    }
                    try {
                        this.ed.k();
                        if (!this.e_) break block7;
                        this.ed.Y(this.w() - this.J());
                        break block8;
                    }
                    catch (O_ o_3) {
                        throw y_.a(o_3);
                    }
                }
                this.ed.Y(this.w());
            }
            this.ed.k(3.0f);
            this.ed.n(new bE(0.0, 2.0), new Object[0]);
            for (ht ht2 : this.eg) {
                ht2.Y(this.ed.w() - 3.0);
                ht2.P(12.0);
                this.ed.n(new wr(0.0, 0.5, 0.0, 0.0, ht2), y_.c("P", (int)y_.b("v", (int)16752, (long)(0x37D9CB3BDBB09675L ^ l10)), (long)2543809708069433439L, (long)l10));
            }
            this.ed.P(Math.min(this.ed.Q(), this.ed.d().R()));
            this.ed.h(true);
            this.ev = Ao.v(this, this.ed, fB.class);
            this.ev.P(new WM(this));
            Ao.d = this;
            this.F();
        }
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = y_.e(l10, l11);
            object = fb[n2];
            try {
                if (!(object instanceof String)) break block2;
                y_.fb[n2] = clazz = Class.forName(jb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void V(boolean bl2) {
        this.e2 = bl2;
    }

    @Override
    public void G() {
        CallSite callSite;
        float f10;
        float f11;
        Color color;
        double d2;
        double d3;
        long l10;
        block30: {
            block26: {
                boolean bl2;
                rn rn2;
                block28: {
                    block27: {
                        block29: {
                            block24: {
                                fB fB2;
                                block25: {
                                    l10 = ab ^ 0x538C10CDC06L;
                                    fB2 = this.ev;
                                    try {
                                        if (fB2 == null) break block24;
                                        if (!this.b) break block25;
                                    }
                                    catch (O_ o_2) {
                                        throw y_.a(o_2);
                                    }
                                    d3 = this.W() - fB2.b();
                                    d2 = this.b() + fB2.b();
                                    break block29;
                                }
                                d3 = this.W();
                                d2 = this.b() + fB2.b();
                                break block29;
                            }
                            d3 = this.W();
                            d2 = this.b();
                        }
                        try {
                            try {
                                try {
                                    if (!this.M()) break block26;
                                    rn2 = this.Y;
                                    if (!this.s()) break block27;
                                }
                                catch (O_ o_3) {
                                    throw y_.a(o_3);
                                }
                                if (this.M()) break block27;
                            }
                            catch (O_ o_4) {
                                throw y_.a(o_4);
                            }
                            bl2 = true;
                            break block28;
                        }
                        catch (O_ o_5) {
                            throw y_.a(o_5);
                        }
                    }
                    bl2 = false;
                }
                rn2.C(bl2);
                F8.S(this.G(), d3, this.w(), d2, this.Y.k());
                break block30;
            }
            try {
                if (this.H()) {
                    F8.S(this.G(), d3, this.w(), d2, this.Y.k());
                }
            }
            catch (O_ o_6) {
                throw y_.a(o_6);
            }
            try {
                if (this.s()) {
                    F8.S(this.G(), d3, this.w(), d2, new Color(100, 100, 100, 10));
                }
            }
            catch (O_ o_7) {
                throw y_.a(o_7);
            }
        }
        try {
            if (this.e6 != null) {
                F8.U(this.G(), d3, this.w(), d2, this.e6, this.ey, this.L, 1.0f);
            }
        }
        catch (O_ o_8) {
            throw y_.a(o_8);
        }
        G5 g5 = this.t(0.7);
        double d4 = g5.B(this.V);
        double d5 = this.G();
        double d6 = this.W() + this.b() / 2.0 - d4 / 2.0;
        double d7 = this.W() + this.b() / 2.0;
        this.getClass();
        double d9 = d7 - 2.0 / 2.0;
        if (this.e2) {
            g5.Q(this.V, d5 += (this.w() - 12.5) / 2.0, d6, y_.M.c);
        } else {
            this.getClass();
            g5.R(this.V, d5 += 5.0, d6, y_.M.c);
        }
        try {
            if (this.ef != null) {
                F8.A(this.G() + this.w() - 12.5, this.W() + 2.0, 1.0, this.b() - 4.5, this.ef);
            }
        }
        catch (O_ o_9) {
            throw y_.a(o_9);
        }
        try {
            color = Color.WHITE;
            f11 = (float)(this.G() + this.w()) - 8.0f;
            f10 = (float)d9;
            callSite = this.M() ? y_.c("P", (int)y_.b("v", (int)23881, (long)(0x5A3AF2FD20DD5508L ^ l10)), (long)8938357328391270169L, (long)l10) : y_.c("P", (int)y_.b("v", (int)23703, (long)(0x794A34072C5154D5L ^ l10)), (long)8938357328391270169L, (long)l10);
        }
        catch (O_ o_10) {
            throw y_.a(o_10);
        }
        X_.B(color, f11, f10, (String)((Object)callSite), this.eR, this.eR, false);
    }

    public void q(@Nullable Color color) {
        this.D = color;
    }

    @Override
    public void d() {
        block6: {
            try {
                try {
                    try {
                        if (!this.ea || this.s()) break block6;
                    }
                    catch (O_ o_2) {
                        throw y_.a(o_2);
                    }
                    if (this.M()) break block6;
                }
                catch (O_ o_3) {
                    throw y_.a(o_3);
                }
                this.eo.c();
                this.ea = false;
            }
            catch (O_ o_4) {
                throw y_.a(o_4);
            }
        }
    }

    private void F() {
        block6: {
            fB fB2;
            block9: {
                block8: {
                    block7: {
                        fB2 = this.ev;
                        try {
                            try {
                                if (fB2 == null) break block6;
                                if (!this.e_) break block7;
                            }
                            catch (O_ o_2) {
                                throw y_.a(o_2);
                            }
                            fB2.b(this.G() + this.J());
                            break block8;
                        }
                        catch (O_ o_3) {
                            throw y_.a(o_3);
                        }
                    }
                    fB2.b(this.G());
                }
                try {
                    if (!this.b) break block9;
                    fB2.M(this.W() - fB2.b());
                    break block6;
                }
                catch (O_ o_4) {
                    throw y_.a(o_4);
                }
            }
            fB2.M(this.W() + this.b());
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(y_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(y_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

