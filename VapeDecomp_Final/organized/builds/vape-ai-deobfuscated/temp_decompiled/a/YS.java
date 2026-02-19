/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.BW;
import a.GC;
import a.IG;
import a.IK;
import a.Io;
import a.K7;
import a.O_;
import a.SE;
import a.Sc;
import a.V4;
import a.Yw;
import a.bE;
import a.bQ;
import a.bt;
import a.d8;
import a.e4;
import a.ei;
import a.ep;
import a.f5;
import a.ff;
import a.h4;
import a.hQ;
import a.hr;
import a.ht;
import a.vM;
import a.v_;
import a.ve;
import a.wr;
import a.yA;
import a.yC;
import a.yG;
import a.yT;
import a.y_;
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

public class ys
extends yG {
    private final Sc uR;
    private hr u5;
    private final Yw uX;
    private static final Integer[] eb;
    private static String[] uJ;
    private final yG u0;
    private static final long ab;
    private static final Object[] lb;
    private static final long[] bb;
    private static final Map fb;
    private final boolean uM;
    private static final String[] mb;
    @Nullable
    private yC up;

    private void lambda$render$4(ep ep2) {
        f5.o(this.uX, ep2, ep2.r(), false);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ys" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void lambda$render$6(ep ep2) {
        ei ei2 = ep2.D(this.uX);
        this.uX.e(ei2);
        this.V();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static String[] t() {
        return uJ;
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x4C79;
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
                throw new RuntimeException("a/ys", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ys.eb[n3] = n4;
        }
        return eb[n3];
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
                n4 = 0;
                break;
            }
            case 1: {
                n4 = 59;
                break;
            }
            case 2: {
                n4 = 35;
                break;
            }
            case 3: {
                n4 = 36;
                break;
            }
            case 4: {
                n4 = 29;
                break;
            }
            case 5: {
                n4 = 42;
                break;
            }
            case 6: {
                n4 = 5;
                break;
            }
            case 7: {
                n4 = 55;
                break;
            }
            case 8: {
                n4 = 58;
                break;
            }
            case 9: {
                n4 = 31;
                break;
            }
            case 10: {
                n4 = 33;
                break;
            }
            case 11: {
                n4 = 18;
                break;
            }
            case 12: {
                n4 = 25;
                break;
            }
            case 13: {
                n4 = 1;
                break;
            }
            case 14: {
                n4 = 7;
                break;
            }
            case 15: {
                n4 = 2;
                break;
            }
            case 16: {
                n4 = 22;
                break;
            }
            case 17: {
                n4 = 30;
                break;
            }
            case 18: {
                n4 = 26;
                break;
            }
            case 19: {
                n4 = 24;
                break;
            }
            case 20: {
                n4 = 61;
                break;
            }
            case 21: {
                n4 = 10;
                break;
            }
            case 22: {
                n4 = 34;
                break;
            }
            case 23: {
                n4 = 60;
                break;
            }
            case 24: {
                n4 = 53;
                break;
            }
            case 25: {
                n4 = 41;
                break;
            }
            case 26: {
                n4 = 6;
                break;
            }
            case 27: {
                n4 = 3;
                break;
            }
            case 28: {
                n4 = 48;
                break;
            }
            case 29: {
                n4 = 23;
                break;
            }
            case 30: {
                n4 = 27;
                break;
            }
            case 31: {
                n4 = 45;
                break;
            }
            case 32: {
                n4 = 54;
                break;
            }
            case 33: {
                n4 = 16;
                break;
            }
            case 34: {
                n4 = 57;
                break;
            }
            case 35: {
                n4 = 50;
                break;
            }
            case 36: {
                n4 = 21;
                break;
            }
            case 37: {
                n4 = 28;
                break;
            }
            case 38: {
                n4 = 37;
                break;
            }
            case 39: {
                n4 = 13;
                break;
            }
            case 40: {
                n4 = 46;
                break;
            }
            case 41: {
                n4 = 49;
                break;
            }
            case 42: {
                n4 = 39;
                break;
            }
            case 43: {
                n4 = 47;
                break;
            }
            case 44: {
                n4 = 52;
                break;
            }
            case 45: {
                n4 = 12;
                break;
            }
            case 46: {
                n4 = 44;
                break;
            }
            case 47: {
                n4 = 51;
                break;
            }
            case 48: {
                n4 = 40;
                break;
            }
            case 49: {
                n4 = 11;
                break;
            }
            case 50: {
                n4 = 56;
                break;
            }
            case 51: {
                n4 = 20;
                break;
            }
            case 52: {
                n4 = 63;
                break;
            }
            case 53: {
                n4 = 4;
                break;
            }
            case 54: {
                n4 = 19;
                break;
            }
            case 55: {
                n4 = 15;
                break;
            }
            case 56: {
                n4 = 17;
                break;
            }
            case 57: {
                n4 = 62;
                break;
            }
            case 58: {
                n4 = 32;
                break;
            }
            case 59: {
                n4 = 8;
                break;
            }
            case 60: {
                n4 = 9;
                break;
            }
            case 61: {
                n4 = 14;
                break;
            }
            case 62: {
                n4 = 38;
                break;
            }
            default: {
                n4 = 43;
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
        ys.mb[n5] = new String(cArray);
        return n5;
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

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "Tc'";
        objectArray[1] = Integer.TYPE;
        ys.mb[1] = "java/lang/Integer";
        objectArray[2] = ")4\"Q?k\";3\u001eBs1<:W";
        objectArray[3] = "v,H\f\u0018-}#YCy#v(]\u0019";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "LD\u0017G+]AE\u0014'&_#\u001bM\u0018&\u001cAZ\u001c]r$\u001aC\u001cC1NQ\u0012\u0019LM";
    }

    private static Field k(long l10, long l11) {
        int n2 = ys.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            String string = mb[n2];
            int n3 = string.indexOf(8);
            Class clazz = ys.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = ys.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ys.e(clazz3, string2, clazz2)) != null) {
                    ys.lb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = ys.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        ys.lb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ys.j(265177337274314L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public hr Y() {
        return this.u5;
    }

    private void lambda$render$1() {
        this.uX.e(null);
        this.V();
    }

    public Yw v() {
        return this.uX;
    }

    private void lambda$render$2(ep ep2) {
        f5.o(this.uX, ep2, ep2.r(), false);
    }

    private void lambda$render$3(ep ep2, ep ep3) {
        block7: {
            try {
                try {
                    if (ep2 == null || !ep2.equals(ep3)) break block7;
                }
                catch (O_ o_2) {
                    throw ys.a(o_2);
                }
                f5.o(this.uX, ep3, ep3.r(), false);
                return;
            }
            catch (O_ o_3) {
                throw ys.a(o_3);
            }
        }
        try {
            this.uX.e(ep3);
            if (this.uX.G() != null) {
                this.V();
            }
        }
        catch (O_ o_4) {
            throw ys.a(o_4);
        }
    }

    private static Method l(long l10, long l11) {
        int n2 = ys.i(l10, l11);
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
                clazz3 = ys.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = ys.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ys.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        ys.lb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ys.j(265177337274314L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = ys.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        ys.lb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ys.j(265177337274314L, 0L);
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

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = ys.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = ys.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
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

    private yG R(double d2, String string) {
        Object object;
        yG yG2;
        long l10;
        block13: {
            block9: {
                IG iG2;
                block12: {
                    block10: {
                        block11: {
                            l10 = ab ^ 0x48AD7C8A8FB6L;
                            yG2 = new yG(d2, 28.0);
                            try {
                                try {
                                    try {
                                        yG2.d().f((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)6678, (long)(0x3D8B6592351BF258L ^ l10)), (long)2610967041145522067L, (long)l10)));
                                        yG2.i(false);
                                        yG2.n(new bE(0.0, 10.0), new Object[0]);
                                        if (!this.uM) break block9;
                                        if (this.up == null) break block10;
                                    }
                                    catch (O_ o_2) {
                                        throw ys.a(o_2);
                                    }
                                    if (this.up.a().isEmpty()) break block11;
                                }
                                catch (O_ o_3) {
                                    throw ys.a(o_3);
                                }
                                iG2 = this.up.a().get(0);
                                break block12;
                            }
                            catch (O_ o_4) {
                                throw ys.a(o_4);
                            }
                        }
                        iG2 = null;
                        break block12;
                    }
                    iG2 = null;
                }
                object = iG2;
                try {
                    this.up = new yC((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)221, (long)(0x12F44C073E3AE882L ^ l10)), (long)2610967041145522067L, (long)l10)), 6.0, 6.0, 10.0, 10.0, ys.M.Z, ys.M.q, null);
                    if (object != null) {
                        this.up.N((IG)object);
                    }
                }
                catch (O_ o_5) {
                    throw ys.a(o_5);
                }
                this.up.u(true);
                this.up.w(true);
                yG2.n(new bE(8.0, 0.0), ys.d("\u00e2", (int)ys.c("y", (int)8358, (long)(0x2C8D564CAD5CC8F1L ^ l10)), (long)2610967041145522067L, (long)l10));
                yG2.n(this.up, ys.d("\u00e2", (int)ys.c("y", (int)2066, (long)(0x3EF2B86809EAE042L ^ l10)), (long)2610967041145522067L, (long)l10));
                break block13;
            }
            yG2.n(new bE(18.0, 0.0), ys.d("\u00e2", (int)ys.c("y", (int)28629, (long)(0x2E660A0F1C13079FL ^ l10)), (long)2610967041145522067L, (long)l10));
        }
        object = new bQ(string, 0.9, ys.M.n);
        ((ht)object).T(yG2.w() - 36.0);
        ((bt)object).q(true);
        ((ht)object).F(false);
        yG2.n((ht)object, ys.d("\u00e2", (int)ys.c("y", (int)6293, (long)(0x9EC1D7E1DBEF0C0L ^ l10)), (long)2610967041145522067L, (long)l10));
        return yG2;
    }

    private void lambda$render$8(v_ v_2, GC gC) {
        v_2.W(gC);
        this.V();
    }

    public ys(Sc sc2, Yw yw2, boolean bl2) {
        long l10 = ab ^ 0x7250CDAE7D99L;
        super(108.0, 182.0);
        this.uR = sc2;
        this.uX = yw2;
        this.uM = bl2;
        this.d().f((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)4803, (long)(0x1F23FB6EBFC708BEL ^ l10)), (long)-3021002424356719172L, (long)l10)));
        this.Q(ys.M.J);
        double d2 = this.b();
        this.u0 = new yG(this.w(), d2);
        this.u0.d().f((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)1948, (long)(0x407520AC73539DE5L ^ l10)), (long)-3021002424356719172L, (long)l10)));
        this.u0.i(false);
        this.V();
        this.n(this.u0, new Object[0]);
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = ys.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = ys.i(l10, l11);
            object = lb[n2];
            try {
                if (!(object instanceof String)) break block2;
                ys.lb[n2] = clazz = Class.forName(mb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ys.ab = d8.a(-3986706523737439563L, 3861108729302765568L, MethodHandles.lookup().lookupClass()).a(41180330429770L);
                ys.lb = new Object[5];
                ys.mb = new String[5];
                ys.x();
                ys.fb = new HashMap<K, V>(13);
                var0 = ys.ab ^ 56600555614583L;
                ys.f(new String[3]);
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
                var8_3 = new long[34];
                var5_4 = 0;
                var6_5 = "\u0000;EG\u00d3\u00d1=\u0007koZ\u00d9\u00af+.(\u00e1\u0084\u0095c#\u000f\u00af\u00bak\f\u00een\u00cd\u00ee[a<\u00c0\u00e4p\u007ft\u000bvi\u0002\u00ceE\u008c\u00b1\u0017W\u009a\u000e\u00c3!\u00bdz'\u00b8\u0018\u00b1E\u00d6kSJ|\u00e9\u009b\u00f6\u0090z\u00e6\u00fb\u0095+]\u00ca\u00d2\u00db\u00e32%9\u00a4\u00fe\u00bf\u0000\u000f\u0013X0az'\u00920\u0086\u001b\u0085\u0087i\u008el\u00d4\u0092\u00bc\u009cOj\u00e49\u00ece\u0015\u000eL_\u0089\u0093\u00b9\u008e\b\u0011A\u00fb\u0018U\u00d1>\u0081\u00aa\u0010#\u00f35\u000b\u00908u\u007f\u0003L\u00d7\u00e4\u00ae\u00c6\u00ef\u00e5<\u00b2\u00ee\u0090\u001c\u00a9\u00ef\u008c\u00f1L\u00a4\u00b2j\u0090\u009b\u0097\u0011\u00e5*,\u00c1\u00e8k\u00a9\u00af\u009e\u00e2\u00b8N\u0014\u00f0\u00ae\u0002}\u009b\u0000\u0014b\u0012%\u00b8\u00c7\u008f\\A\u00a4\u0086\f\u00a7g\u00c4fCd\u00c0\u00f2\u0002\rX\u00a1)\u009f7\u000fP\u00ec\u0091a~nK\u00bd\u00da?\u00f5\u000b\u00edk\u00ea\u001cB\u00a1\u0007\u00d9~\u00d0j\u0098o!q\r5\u00f8,\u00b73m\u00fc\u00ce\u00d9\u00ca\u0014\u00b8\u00c9\u00b0\r5!\u00df";
                var7_6 = "\u0000;EG\u00d3\u00d1=\u0007koZ\u00d9\u00af+.(\u00e1\u0084\u0095c#\u000f\u00af\u00bak\f\u00een\u00cd\u00ee[a<\u00c0\u00e4p\u007ft\u000bvi\u0002\u00ceE\u008c\u00b1\u0017W\u009a\u000e\u00c3!\u00bdz'\u00b8\u0018\u00b1E\u00d6kSJ|\u00e9\u009b\u00f6\u0090z\u00e6\u00fb\u0095+]\u00ca\u00d2\u00db\u00e32%9\u00a4\u00fe\u00bf\u0000\u000f\u0013X0az'\u00920\u0086\u001b\u0085\u0087i\u008el\u00d4\u0092\u00bc\u009cOj\u00e49\u00ece\u0015\u000eL_\u0089\u0093\u00b9\u008e\b\u0011A\u00fb\u0018U\u00d1>\u0081\u00aa\u0010#\u00f35\u000b\u00908u\u007f\u0003L\u00d7\u00e4\u00ae\u00c6\u00ef\u00e5<\u00b2\u00ee\u0090\u001c\u00a9\u00ef\u008c\u00f1L\u00a4\u00b2j\u0090\u009b\u0097\u0011\u00e5*,\u00c1\u00e8k\u00a9\u00af\u009e\u00e2\u00b8N\u0014\u00f0\u00ae\u0002}\u009b\u0000\u0014b\u0012%\u00b8\u00c7\u008f\\A\u00a4\u0086\f\u00a7g\u00c4fCd\u00c0\u00f2\u0002\rX\u00a1)\u009f7\u000fP\u00ec\u0091a~nK\u00bd\u00da?\u00f5\u000b\u00edk\u00ea\u001cB\u00a1\u0007\u00d9~\u00d0j\u0098o!q\r5\u00f8,\u00b73m\u00fc\u00ce\u00d9\u00ca\u0014\u00b8\u00c9\u00b0\r5!\u00df".length();
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
                    var6_5 = "]LNyf\u00a4\u00b1\u00b4\u0080\u00df\u008d\u00c8PL\u00e0d";
                    var7_6 = "]LNyf\u00a4\u00b1\u00b4\u0080\u00df\u008d\u00c8PL\u00e0d".length();
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
        ys.bb = var8_3;
        ys.eb = new Integer[34];
    }

    private void lambda$render$5() {
        this.uX.e(null);
        this.V();
    }

    public boolean q() {
        return this.uM;
    }

    private void lambda$render$7(BW bW2) {
        this.uX.T(bW2);
        this.V();
    }

    public Sc N() {
        return this.uR;
    }

    private void V() {
        double d2;
        hr hr2;
        Color color;
        double d3;
        Object object;
        hr hr3;
        hr hr4;
        IG iG2;
        Object object3;
        long l10;
        block39: {
            block37: {
                block38: {
                    CallSite callSite;
                    Object object2;
                    y_ y_2;
                    y_ y_3;
                    ArrayList<ht> arrayList;
                    hQ hQ2;
                    List<ei> list;
                    ArrayList<ei> arrayList2;
                    ArrayList<ei> arrayList3;
                    boolean bl2;
                    ep ep2;
                    block33: {
                        l10 = ab ^ 0x2B950DC77110L;
                        this.u0.f();
                        Object object5 = this.uX instanceof vM ? (String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)28809, (long)(0x156227ECB982E668L ^ l10)), (long)-2694727589742331595L, (long)l10)) + (((vM)this.uX).T() + 1) : ys.d("\u00e2", (int)ys.c("y", (int)14842, (long)(0x2AA41211F3CD2F01L ^ l10)), (long)-2694727589742331595L, (long)l10);
                        this.u0.n(this.R(this.w(), (String)object5), new Object[0]);
                        this.u0.n(new bE(this.w(), 0.0), new Object[0]);
                        this.u0.n(new bE(9.0, 0.0), ys.d("\u00e2", (int)ys.c("y", (int)5524, (long)(0x31729E87537A037AL ^ l10)), (long)-2694727589742331595L, (long)l10));
                        this.u0.n(new bE(0.0, 5.0), new Object[0]);
                        yG yG2 = new yG(32.0, 32.0);
                        yG2.J(ys.M.k);
                        yG2.d(0.5f);
                        yG2.k(4.0f);
                        ht ht2 = new ff(this.uX);
                        ht2.T(32.0);
                        ht2.w(32.0);
                        yG2.n(ht2, new Object[0]);
                        this.u0.n(new bE((this.w() - yG2.w()) / 2.0, 0.0), ys.d("\u00e2", (int)ys.c("y", (int)3961, (long)(0x43819EC490EF99BAL ^ l10)), (long)-2694727589742331595L, (long)l10));
                        this.u0.n(yG2, new Object[0]);
                        this.u0.n(new bE(0.0, 5.0), new Object[0]);
                        ht2 = new bQ(this.A(this.uX), 1.0, Color.WHITE);
                        ((bt)ht2).q(true);
                        ht2.T(this.u0.w());
                        this.u0.n(ht2, new Object[0]);
                        bQ bQ2 = new bQ((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)19920, (long)(0x4F8570B3CBF0DB2DL ^ l10)), (long)-2694727589742331595L, (long)l10)) + this.uX.A().k(), 0.75, ys.M.w);
                        bQ2.q(true);
                        bQ2.T(this.u0.w());
                        bQ2.h(0);
                        this.u0.n(bQ2, new Object[0]);
                        this.u0.n(new bE(0.0, 5.0), new Object[0]);
                        bt bt2 = new bt((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)1392, (long)(0x193ACD4377B2139DL ^ l10)), (long)-2694727589742331595L, (long)l10)), 0.7, ys.M.c);
                        bt2.q(true);
                        bt2.h(5);
                        this.u0.n(new wr(6.0, 0.0, bt2), new Object[0]);
                        ep2 = this.uX.G();
                        bl2 = false;
                        try {
                            if (ep2 != null && !(ep2 instanceof ei)) break block33;
                        }
                        catch (O_ o_2) {
                            throw ys.a(o_2);
                        }
                        bl2 = true;
                    }
                    try {
                        ArrayList<ei> arrayList4;
                        arrayList3 = arrayList4;
                        arrayList2 = arrayList4;
                        list = this.uX instanceof vM ? SE.h.w().m().x() : SE.h.w().u().x();
                    }
                    catch (O_ o_3) {
                        throw ys.a(o_3);
                    }
                    arrayList3(list);
                    ArrayList<ei> arrayList5 = arrayList2;
                    try {
                        if (ep2 != null) {
                            arrayList5.remove(ep2);
                            arrayList5.add(0, (ei)ep2);
                        }
                    }
                    catch (O_ o_4) {
                        throw ys.a(o_4);
                    }
                    ArrayList<ht> arrayList6 = new ArrayList<ht>();
                    if (bl2) {
                        block34: {
                            boolean bl3;
                            e4 e42;
                            yT yT2;
                            yT yT3;
                            block36: {
                                block35: {
                                    hQ2 = new yA((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)18178, (long)(0x5C54B4FAD02CD1E7L ^ l10)), (long)-2694727589742331595L, (long)l10)), false, true, 0.7, ys.M.c, (String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)22343, (long)(0x7E2E54390DC6C1A5L ^ l10)), (long)-2694727589742331595L, (long)l10)), 0.75, ys.M.Y, null);
                                    try {
                                        try {
                                            yT yT4;
                                            ((yA)hQ2).H(false);
                                            hQ2.Z(8.0);
                                            hQ2.C(this::lambda$render$0);
                                            arrayList6.add(hQ2);
                                            if (arrayList5.isEmpty()) break block34;
                                            arrayList6.add(new bt((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)20145, (long)(0x52ED7C70CD755844L ^ l10)), (long)-2694727589742331595L, (long)l10)), 0.7, ys.M.H, true));
                                            yT3 = yT4;
                                            yT2 = yT4;
                                            e42 = IK.D;
                                            if (ep2 != null) break block35;
                                        }
                                        catch (O_ o_5) {
                                            throw ys.a(o_5);
                                        }
                                        bl3 = true;
                                        break block36;
                                    }
                                    catch (O_ o_6) {
                                        throw ys.a(o_6);
                                    }
                                }
                                bl3 = false;
                            }
                            yT3(e42, bl3);
                            object3 = yT2;
                            ((hQ)object3).C(this::lambda$render$1);
                            arrayList6.add((ht)object3);
                        }
                        for (ep object22 : arrayList5) {
                            arrayList = new yT(object22, object22.equals(ep2));
                            ((yT)((Object)arrayList)).s().C(() -> this.lambda$render$2(object22));
                            ((hQ)((Object)arrayList)).C(() -> this.lambda$render$3(ep2, object22));
                            arrayList6.add((ht)((Object)arrayList));
                        }
                    } else {
                        hQ2 = new yA((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)26194, (long)(0x1EBDA0978990F0AEL ^ l10)), (long)-2694727589742331595L, (long)l10)), false, true, 0.7, ys.M.c, (String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)14881, (long)(0x2C0AA2D614F82CD6L ^ l10)), (long)-2694727589742331595L, (long)l10)), 0.7, ys.M.Y, null);
                        ((yA)hQ2).H(false);
                        hQ2.C(() -> this.lambda$render$4(ep2));
                        object3 = new yA((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)3918, (long)(0x3EFD621AC73319A9L ^ l10)), (long)-2694727589742331595L, (long)l10)), false, true, 0.7, ys.M.c, (String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)26888, (long)(0x29BB41D519D27FFAL ^ l10)), (long)-2694727589742331595L, (long)l10)), 0.7, ys.M.Y, null);
                        ((yA)object3).H(false);
                        ((hQ)object3).C(this::lambda$render$5);
                        yA yA2 = new yA((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)14386, (long)(0x3719877F146D2EDDL ^ l10)), (long)-2694727589742331595L, (long)l10)), false, true, 0.7, ys.M.c, (String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)32435, (long)(0x68050B6F4901685AL ^ l10)), (long)-2694727589742331595L, (long)l10)), 0.7, ys.M.Y, null);
                        yA2.H(false);
                        yA2.C(() -> this.lambda$render$6(ep2));
                        arrayList6.add(hQ2);
                        arrayList6.add((ht)object3);
                        arrayList6.add(yA2);
                    }
                    try {
                        y_ y_4;
                        y_3 = y_4;
                        y_2 = y_4;
                        object2 = ep2 != null ? ep2.O() : ys.d("\u00e2", (int)ys.c("y", (int)2604, (long)(0x62EAA2AD98461CC6L ^ l10)), (long)-2694727589742331595L, (long)l10);
                    }
                    catch (O_ o_7) {
                        throw ys.a(o_7);
                    }
                    y_3((String)object2, arrayList6, ys.M.z, ys.M.z, null, 0.0f, 0.0f);
                    hQ2 = y_2;
                    hQ2.T(88.0);
                    hQ2.w(14.0);
                    ((y_)hQ2).V(false);
                    ((y_)hQ2).a(false);
                    ((y_)hQ2).r(false);
                    ((y_)hQ2).B(null);
                    this.u0.n(new bE((this.w() - hQ2.w()) / 2.0, 0.0), ys.d("\u00e2", (int)ys.c("y", (int)30035, (long)(0x6F933D2016F6E3B5L ^ l10)), (long)-2694727589742331595L, (long)l10));
                    this.u0.n(hQ2, ys.d("\u00e2", (int)ys.c("y", (int)25986, (long)(0x38618BA4F7B1F361L ^ l10)), (long)-2694727589742331595L, (long)l10));
                    this.u0.n(new bE(0.0, 18.0), new Object[0]);
                    if (this.uX instanceof vM) {
                        object3 = this.uX.r();
                        List<BW> list2 = K7.z(this.uX.A());
                        arrayList = new ArrayList();
                        for (BW bW2 : list2) {
                            hr hr5 = new hr(bW2.O(), 0.75, ys.M.E, ys.M.N, 0.0, 0.0);
                            hr5.g(bW2.t());
                            hr5.q(false);
                            hr5.A(ys.M.c);
                            hr5.u(0.0f);
                            arrayList.add(hr5);
                            hr5.N(() -> this.lambda$render$7(bW2));
                        }
                        y_ y_5 = new y_(object3.O(), arrayList, ys.M.z, ys.M.z, null, 0.0f, 0.0f);
                        y_5.T(88.0);
                        y_5.w(14.0);
                        y_5.V(false);
                        y_5.a(false);
                        y_5.r(false);
                        y_5.B(null);
                        bt bt2 = new bt((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)24873, (long)(0x5495ECAD141DF7C9L ^ l10)), (long)-2694727589742331595L, (long)l10)), 0.7, ys.M.c);
                        bt2.q(true);
                        bt2.h(5);
                        this.u0.n(new wr(6.0, 0.0, bt2), new Object[0]);
                        this.u0.n(new bE((this.w() - y_5.w()) / 2.0, 0.0), ys.d("\u00e2", (int)ys.c("y", (int)23181, (long)(0x15503F5654374C73L ^ l10)), (long)-2694727589742331595L, (long)l10));
                        this.u0.n(y_5, new Object[0]);
                    } else if (this.uX instanceof v_) {
                        object3 = (v_)this.uX;
                        GC gC = ((v_)object3).z();
                        arrayList = new ArrayList<ht>();
                        for (GC gC2 : GC.VALUES) {
                            hr hr6 = new hr(gC2.O(), 0.75, ys.M.E, ys.M.N, 0.0, 0.0);
                            hr6.g(gC2.e());
                            hr6.q(false);
                            hr6.A(ys.M.c);
                            hr6.u(0.0f);
                            arrayList.add(hr6);
                            hr6.N(() -> this.lambda$render$8((v_)object3, gC2));
                        }
                        y_ y_6 = new y_(gC.O(), arrayList, ys.M.z, ys.M.z, null, 0.0f, 0.0f);
                        y_6.T(88.0);
                        y_6.w(14.0);
                        y_6.V(false);
                        y_6.a(false);
                        y_6.r(false);
                        y_6.B(null);
                        bt bt3 = new bt((String)((Object)ys.d("\u00e2", (int)ys.c("y", (int)14217, (long)(0x3B4E19B6A2D5A176L ^ l10)), (long)-2694727589742331595L, (long)l10)), 0.7, ys.M.c);
                        bt3.q(true);
                        bt3.h(5);
                        this.u0.n(new wr(6.0, 0.0, bt3), new Object[0]);
                        this.u0.n(new bE((this.w() - y_6.w()) / 2.0, 0.0), ys.d("\u00e2", (int)ys.c("y", (int)27037, (long)(0x6B81002C49867F76L ^ l10)), (long)-2694727589742331595L, (long)l10));
                        this.u0.n(y_6, new Object[0]);
                    } else {
                        this.u0.n(new bE(0.0, 25.0), new Object[0]);
                    }
                    try {
                        this.u0.n(new bE(0.0, 8.0), new Object[0]);
                        callSite = this.uM ? ys.d("\u00e2", (int)ys.c("y", (int)22523, (long)(0x79B5E7815B954139L ^ l10)), (long)-2694727589742331595L, (long)l10) : ys.d("\u00e2", (int)ys.c("y", (int)19373, (long)(0x75E4F1507E5CDD49L ^ l10)), (long)-2694727589742331595L, (long)l10);
                    }
                    catch (O_ o_8) {
                        throw ys.a(o_8);
                    }
                    object3 = callSite;
                    try {
                        try {
                            if (this.u5 == null) break block37;
                            if (this.u5.a().isEmpty()) break block38;
                        }
                        catch (O_ o_9) {
                            throw ys.a(o_9);
                        }
                        iG2 = this.u5.a().get(0);
                        break block39;
                    }
                    catch (O_ o_10) {
                        throw ys.a(o_10);
                    }
                }
                iG2 = null;
                break block39;
            }
            iG2 = null;
        }
        IG iG3 = iG2;
        try {
            hr hr7;
            ys ys2 = this;
            hr4 = hr7;
            hr3 = hr7;
            object = object3;
            d3 = 0.7;
            color = this.uM ? ys.M.Y : ys.M.O;
        }
        catch (O_ o_11) {
            throw ys.a(o_11);
        }
        hr4((String)object, d3, color, this.uM ? ys.M.u : ys.M.b);
        ys2.u5 = hr3;
        if (iG3 != null) {
            this.u5.N(iG3);
        }
        try {
            hr2 = this.u5;
            d2 = this.uM ? 56.0 : 68.0;
        }
        catch (O_ o_12) {
            throw ys.a(o_12);
        }
        hr2.T(d2);
        this.u5.w(16.0);
        this.u5.A(Color.WHITE);
        this.u5.q(false);
        this.u0.n(new bE((this.w() - this.u5.w()) / 2.0, 0.0), ys.d("\u00e2", (int)ys.c("y", (int)5433, (long)(0x1B4165CAFA1683C1L ^ l10)), (long)-2694727589742331595L, (long)l10));
        this.u0.n(this.u5, new Object[0]);
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = ys.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = ys.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static void f(String[] stringArray) {
        uJ = stringArray;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ys" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Nullable
    public yC D() {
        return this.up;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = ys.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private void lambda$render$0() {
        boolean bl2;
        ep ep2;
        ep ep3;
        try {
            ep ep4;
            ep3 = ep4;
            ep2 = ep4;
            bl2 = !(this.uX instanceof vM);
        }
        catch (O_ o_2) {
            throw ys.a(o_2);
        }
        ep3(bl2);
        ep ep5 = ep2;
        ep5.B(Io.Y().C(new ve()).X());
        f5.o(this.uX, ep5, ep5, true);
    }

    private String A(Yw yw2) {
        h4 h42;
        long l10;
        block7: {
            l10 = ab ^ 0x4A6B9A1B38B1L;
            V4 v42 = yw2.A().W();
            h42 = yw2.A().i();
            try {
                try {
                    if (v42 == null || v42.Y()) break block7;
                }
                catch (O_ o_2) {
                    throw ys.a(o_2);
                }
                return v42.g();
            }
            catch (O_ o_3) {
                throw ys.a(o_3);
            }
        }
        try {
            if (h42 != null) {
                return h42.O();
            }
        }
        catch (O_ o_4) {
            throw ys.a(o_4);
        }
        return ys.d("\u00e2", (int)ys.c("y", (int)21318, (long)(0x50192151A2F20C1DL ^ l10)), (long)-7837663621136322412L, (long)l10);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'S' || c10 == 'q' || c10 == 'm' || c10 == '\u00e7') {
                field = ys.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'S' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'q' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'm' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ys.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00ba' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ys.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ys.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

