/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.EP;
import a.F8;
import a.G5;
import a.H3;
import a.O_;
import a.Qg;
import a.Rs;
import a.SE;
import a.V3;
import a.Vc;
import a.Vy;
import a.WQ;
import a.d8;
import a.jo;
import a.kT;
import a.kX;
import a.wN;
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
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fi
extends wN {
    private static Map<Integer, Integer> Vu;
    private static final Map xb;
    private jo VC = (jo)this.t();
    private static final Object[] Ib;
    private static final String[] Jb;
    int Vx;
    private static final long fb;
    private static final Integer[] wb;
    private static final long[] vb;

    private boolean y(V3 v32) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    try {
                        try {
                            if (kX.C() < 35) break block4;
                            if (v32.G().a()) break block5;
                        }
                        catch (O_ o_2) {
                            throw fi.a(o_2);
                        }
                        bl2 = true;
                        break block6;
                    }
                    catch (O_ o_3) {
                        throw fi.a(o_3);
                    }
                }
                bl2 = false;
            }
            return bl2;
        }
        return Vc.l(v32.n()).D();
    }

    private static int f(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x294C;
        if (wb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = vb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])xb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    xb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fi", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fi.wb[n3] = n4;
        }
        return wb[n3];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void V() {
        ArrayList<V3> arrayList;
        block38: {
            block39: {
                try {
                    if (EP.U().Y()) {
                        return;
                    }
                }
                catch (O_ o_2) {
                    throw fi.a(o_2);
                }
                arrayList = this.s();
                try {
                    try {
                        if (!arrayList.isEmpty()) break block38;
                        if (Vu.isEmpty()) break block39;
                    }
                    catch (O_ o_3) {
                        throw fi.a(o_3);
                    }
                    Vu.clear();
                }
                catch (O_ o_4) {
                    throw fi.a(o_4);
                }
            }
            return;
        }
        double d2 = this.W();
        double d3 = 30.0;
        this.Vx = 0;
        G5 g5 = SE.h.W().T(0.85, true);
        if (H3.E().d()) {
            g5 = SE.h.W().E(kT.NOTO, 0.85f, false);
        }
        for (V3 v32 : arrayList) {
            void var13_20;
            String string;
            Object object;
            block45: {
                float f10;
                block44: {
                    block43: {
                        LinkedList<Integer> linkedList;
                        boolean bl2;
                        block42: {
                            block41: {
                                block40: {
                                    bl2 = false;
                                    linkedList = new LinkedList<Integer>();
                                    try {
                                        if (this.y(v32) || this.VC.b.s().booleanValue()) break block40;
                                    }
                                    catch (O_ o_5) {
                                        throw fi.a(o_5);
                                    }
                                    linkedList.add(this.G(v32));
                                    bl2 = true;
                                }
                                try {
                                    if (!this.y(v32) || this.VC.G.s().booleanValue()) break block41;
                                }
                                catch (O_ o_6) {
                                    throw fi.a(o_6);
                                }
                                linkedList.add(this.G(v32));
                                bl2 = true;
                            }
                            try {
                                try {
                                    if (Vu.containsKey(v32.n()) && Vu.get(v32.n()) >= v32.V()) break block42;
                                }
                                catch (O_ o_7) {
                                    throw fi.a(o_7);
                                }
                                Vu.put(v32.n(), v32.V());
                            }
                            catch (O_ o_8) {
                                throw fi.a(o_8);
                            }
                        }
                        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
                        for (V3 v33 : arrayList) {
                            object = new V3(v33);
                            arrayList2.add(((V3)object).n());
                        }
                        for (Integer n2 : Vu.keySet()) {
                            try {
                                if (arrayList2.contains(n2)) continue;
                                linkedList.add(n2);
                            }
                            catch (O_ o_9) {
                                throw fi.a(o_9);
                            }
                        }
                        for (Integer n3 : linkedList) {
                            Vu.remove(n3);
                        }
                        try {
                            if (bl2) {
                                continue;
                            }
                        }
                        catch (O_ o_10) {
                            throw fi.a(o_10);
                        }
                        f10 = this.M(v32.V(), Vu.get(v32.n()).intValue());
                        Color color = fi.M.c;
                        try {
                            if (!(f10 > 50.0f) || !(f10 <= 100.0f)) break block43;
                        }
                        catch (O_ o_11) {
                            throw fi.a(o_11);
                        }
                        Color color2 = fi.M.Y;
                        break block45;
                    }
                    try {
                        if (!(f10 > 25.0f) || !(f10 <= 50.0f)) break block44;
                    }
                    catch (O_ o_12) {
                        throw fi.a(o_12);
                    }
                    Color color = fi.M.o;
                    break block45;
                }
                if (f10 <= 25.0f) {
                    Color color = fi.M.O;
                }
            }
            this.F((float)(this.G() + 6.0), (float)(d2 + 6.0), v32);
            object = Rs.y(Color.WHITE, 51);
            try {
                F8.T(this.G() + 30.0, d2 + 10.0, 11.5, 2.0f, (Color)object);
                string = kX.C() >= 35 ? v32.G().j() : H3.f(Vc.l(v32.n()).Y(), new Object[0]);
            }
            catch (O_ o_13) {
                throw fi.a(o_13);
            }
            String string2 = string;
            String string3 = this.a(v32.V());
            int n4 = (int)g5.D(string2);
            try {
                if (n4 > this.Vx) {
                    this.Vx = n4;
                }
            }
            catch (O_ o_14) {
                throw fi.a(o_14);
            }
            int n5 = (int)g5.D(string3);
            try {
                if (n5 > this.Vx) {
                    this.Vx = n5;
                }
            }
            catch (O_ o_15) {
                throw fi.a(o_15);
            }
            g5.R(string2, this.G() + 35.0, d2 + 9.0, this.A());
            g5.K(string3, this.G() + 35.0, d2 + 17.0, this.s((Color)var13_20), this.s(new Color(50, 50, 50, 150)));
            WQ.m(v32, (int)(this.G() + 9.0), (int)(d2 + 10.0), 14, 14, this.L());
            d2 += d3;
        }
    }

    private int G(V3 v32) {
        try {
            if (kX.C() >= 35) {
                return Vy.s(v32.G());
            }
        }
        catch (O_ o_2) {
            throw fi.a(o_2);
        }
        return Vc.l(v32.n()).u();
    }

    @Override
    public String A() {
        long l10 = fb ^ 0x145AC5C944E3L;
        return fi.l("\u00f4", (int)fi.f("r", (int)26060, (long)(0x69AA6DB091FD8F12L ^ l10)), (long)4868402898492329287L, (long)l10);
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'V' || c10 == 'M' || c10 == 'W' || c10 == '\u00cd') {
                field = fi.w(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'V' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'M' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'W' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fi.x(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'h' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = fi.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = fi.l(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int u(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (Jb[n5] != null) {
            return n5;
        }
        Object object = Ib[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 12;
                break;
            }
            case 1: {
                n4 = 13;
                break;
            }
            case 2: {
                n4 = 21;
                break;
            }
            case 3: {
                n4 = 63;
                break;
            }
            case 4: {
                n4 = 29;
                break;
            }
            case 5: {
                n4 = 7;
                break;
            }
            case 6: {
                n4 = 24;
                break;
            }
            case 7: {
                n4 = 60;
                break;
            }
            case 8: {
                n4 = 51;
                break;
            }
            case 9: {
                n4 = 46;
                break;
            }
            case 10: {
                n4 = 14;
                break;
            }
            case 11: {
                n4 = 48;
                break;
            }
            case 12: {
                n4 = 15;
                break;
            }
            case 13: {
                n4 = 53;
                break;
            }
            case 14: {
                n4 = 58;
                break;
            }
            case 15: {
                n4 = 2;
                break;
            }
            case 16: {
                n4 = 49;
                break;
            }
            case 17: {
                n4 = 54;
                break;
            }
            case 18: {
                n4 = 59;
                break;
            }
            case 19: {
                n4 = 16;
                break;
            }
            case 20: {
                n4 = 45;
                break;
            }
            case 21: {
                n4 = 6;
                break;
            }
            case 22: {
                n4 = 4;
                break;
            }
            case 23: {
                n4 = 20;
                break;
            }
            case 24: {
                n4 = 18;
                break;
            }
            case 25: {
                n4 = 32;
                break;
            }
            case 26: {
                n4 = 19;
                break;
            }
            case 27: {
                n4 = 40;
                break;
            }
            case 28: {
                n4 = 44;
                break;
            }
            case 29: {
                n4 = 56;
                break;
            }
            case 30: {
                n4 = 26;
                break;
            }
            case 31: {
                n4 = 27;
                break;
            }
            case 32: {
                n4 = 35;
                break;
            }
            case 33: {
                n4 = 41;
                break;
            }
            case 34: {
                n4 = 39;
                break;
            }
            case 35: {
                n4 = 34;
                break;
            }
            case 36: {
                n4 = 17;
                break;
            }
            case 37: {
                n4 = 28;
                break;
            }
            case 38: {
                n4 = 1;
                break;
            }
            case 39: {
                n4 = 11;
                break;
            }
            case 40: {
                n4 = 42;
                break;
            }
            case 41: {
                n4 = 10;
                break;
            }
            case 42: {
                n4 = 33;
                break;
            }
            case 43: {
                n4 = 37;
                break;
            }
            case 44: {
                n4 = 9;
                break;
            }
            case 45: {
                n4 = 31;
                break;
            }
            case 46: {
                n4 = 43;
                break;
            }
            case 47: {
                n4 = 62;
                break;
            }
            case 48: {
                n4 = 5;
                break;
            }
            case 49: {
                n4 = 61;
                break;
            }
            case 50: {
                n4 = 52;
                break;
            }
            case 51: {
                n4 = 23;
                break;
            }
            case 52: {
                n4 = 3;
                break;
            }
            case 53: {
                n4 = 25;
                break;
            }
            case 54: {
                n4 = 8;
                break;
            }
            case 55: {
                n4 = 57;
                break;
            }
            case 56: {
                n4 = 22;
                break;
            }
            case 57: {
                n4 = 38;
                break;
            }
            case 58: {
                n4 = 55;
                break;
            }
            case 59: {
                n4 = 50;
                break;
            }
            case 60: {
                n4 = 47;
                break;
            }
            case 61: {
                n4 = 0;
                break;
            }
            case 62: {
                n4 = 30;
                break;
            }
            default: {
                n4 = 36;
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
        fi.Jb[n5] = new String(cArray);
        return n5;
    }

    private static Class v(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = fi.u(l10, l11);
            object = Ib[n2];
            try {
                if (!(object instanceof String)) break block2;
                fi.Ib[n2] = clazz = Class.forName(Jb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public double b() {
        int n2;
        block4: {
            double d2;
            block6: {
                block5: {
                    n2 = Vu.size();
                    try {
                        try {
                            if (n2 != 0) break block4;
                            if (!Ao.K.P) break block5;
                        }
                        catch (O_ o_2) {
                            throw fi.a(o_2);
                        }
                        d2 = 0.0;
                        break block6;
                    }
                    catch (O_ o_3) {
                        throw fi.a(o_3);
                    }
                }
                d2 = 20.0;
            }
            return d2;
        }
        return 2 + n2 * 30;
    }

    @Override
    public double w() {
        return 40 + this.Vx;
    }

    private static Field w(long l10, long l11) {
        int n2 = fi.u(l10, l11);
        Object object = Ib[n2];
        if (object instanceof String) {
            String string = Jb[n2];
            int n3 = string.indexOf(8);
            Class clazz = fi.v(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = fi.v(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fi.k(clazz3, string2, clazz2)) != null) {
                    fi.Ib[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = fi.l(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        fi.Ib[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fi.v(245938659526407L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void F(float f10, float f11, V3 v32) {
        block7: {
            float f12;
            Color color;
            block6: {
                float f13;
                block8: {
                    block5: {
                        f13 = this.M(v32.V(), Vu.get(v32.n()).intValue());
                        color = fi.M.Y;
                        try {
                            if (!(f13 > 25.0f) || !(f13 <= 50.0f)) break block5;
                        }
                        catch (O_ o_2) {
                            throw fi.a(o_2);
                        }
                        color = fi.M.o;
                        break block8;
                    }
                    if (f13 <= 25.0f) {
                        color = fi.M.O;
                    }
                }
                f12 = 360.0f * (f13 / 100.0f);
                try {
                    F8.r(f10 - 0.5f, f11 - 0.5f, 21.25f, 1.8f, 1.0f, this.s(new Color(0, 0, 0, 200)));
                    if (f12 != 360.0f) break block6;
                    F8.r(f10 - 1.0f, f11 - 1.0f, 22.0f, 2.5f, 1.0f, this.s(color));
                    break block7;
                }
                catch (O_ o_3) {
                    throw fi.a(o_3);
                }
            }
            F8.V(f10 - 1.0f, f11 - 1.0f, 22.0f, 2.0f, 0.5f, 270.0f, -f12, this.s(color));
        }
    }

    private static Method l(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = fi.k(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = fi.l(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void T() {
        Object[] objectArray = Ib;
        Ib[0] = "z\u0016=";
        objectArray[1] = Integer.TYPE;
        fi.Jb[1] = "java/lang/Integer";
        objectArray[2] = "\u0004'\u000bV\n\u0017\u000f(\u001a\u0019w\u000f\u001c/\u0013P";
        objectArray[3] = "VFLf{\"]I])\u001a,VBYs";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "o5iSc-j1kox'T70S(1-<a\u001e\u0013flt2\u000b)9m){o";
    }

    private ArrayList<V3> s() {
        ArrayList<V3> arrayList;
        block11: {
            Qg qg2 = EP.U();
            Collection collection = qg2.A();
            arrayList = new ArrayList<V3>();
            for (Object e10 : collection) {
                V3 v32 = new V3(e10);
                arrayList.add(v32);
            }
            try {
                block12: {
                    try {
                        try {
                            try {
                                try {
                                    if (!arrayList.isEmpty() || Ao.K.P) break block11;
                                }
                                catch (O_ o_2) {
                                    throw fi.a(o_2);
                                }
                                arrayList.add(V3.H(1, 6500, 0));
                                arrayList.add(V3.H(2, 5000, 0));
                                arrayList.add(V3.H(12, 1000, 0));
                                if (!Vu.containsKey(1)) break block12;
                            }
                            catch (O_ o_3) {
                                throw fi.a(o_3);
                            }
                            if (!Vu.containsKey(2)) break block12;
                        }
                        catch (O_ o_4) {
                            throw fi.a(o_4);
                        }
                        if (Vu.containsKey(12)) break block11;
                    }
                    catch (O_ o_5) {
                        throw fi.a(o_5);
                    }
                }
                Vu.put(1, 10000);
                Vu.put(2, 10000);
                Vu.put(12, 10000);
            }
            catch (O_ o_6) {
                throw fi.a(o_6);
            }
        }
        return arrayList;
    }

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public fi() {
        super(jo.class);
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = fi.f(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method k(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                fi.fb = d8.a(7205418541371910976L, 8032520873521021405L, MethodHandles.lookup().lookupClass()).a(223365671760003L);
                fi.Ib = new Object[5];
                fi.Jb = new String[5];
                fi.T();
                fi.xb = new HashMap<K, V>(13);
                var0 = fi.fb ^ 8814653674318L;
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
                var6_5 = "@\u0011\u0083Gb\u0096\u001e\u00156\u00f2\u00c4V\u00d4\u0097\u00b5F";
                var7_6 = "@\u0011\u0083Gb\u0096\u001e\u00156\u00f2\u00c4V\u00d4\u0097\u00b5F".length();
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
                    var6_5 = "r.Dg\u00ff\u00bb\u00c3\u00aa\u00cd&\u00d9\u00ab\u0094\u00a9\u00feg";
                    var7_6 = "r.Dg\u00ff\u00bb\u00c3\u00aa\u00cd&\u00d9\u00ab\u0094\u00a9\u00feg".length();
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
        fi.vb = var8_3;
        fi.wb = new Integer[4];
        fi.Vu = new HashMap<Integer, Integer>();
    }

    private String a(int n2) {
        long l10 = fb ^ 0x6471481A2DE2L;
        int n3 = n2 / 20;
        int n4 = n3 / 60;
        String string = String.valueOf(n4);
        String string2 = String.valueOf(n3 -= n4 * 60);
        if (n4 < 10) {
            string = (String)((Object)fi.l("\u00f4", (int)fi.f("r", (int)20925, (long)(0x712D1E5FFC98D263L ^ l10)), (long)3067367579603264582L, (long)l10)) + string;
        }
        if (n3 < 10) {
            string2 = (String)((Object)fi.l("\u00f4", (int)fi.f("r", (int)21047, (long)(0x5F555AAFFE13D1EAL ^ l10)), (long)3067367579603264582L, (long)l10)) + string2;
        }
        return string + (String)((Object)fi.l("\u00f4", (int)fi.f("r", (int)8280, (long)(0x3B7A795299EBA384L ^ l10)), (long)3067367579603264582L, (long)l10)) + string2;
    }

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = fi.f(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static CallSite l(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method x(long l10, long l11) {
        int n2 = fi.u(l10, l11);
        Object object = Ib[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = Jb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = fi.v(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = fi.v(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fi.k(clazz, string, clazz2, n3, classArray2)) != null) {
                        fi.Ib[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fi.v(245938659526407L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = fi.l(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        fi.Ib[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fi.v(245938659526407L, 0L);
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

    private float M(float f10, float f11) {
        return f10 / f11 * 100.0f;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fi.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fi.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

