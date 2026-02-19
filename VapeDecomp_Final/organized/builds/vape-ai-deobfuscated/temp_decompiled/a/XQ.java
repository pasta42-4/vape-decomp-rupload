/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Bg;
import a.E9;
import a.EP;
import a.OY;
import a.O_;
import a.Oe;
import a.Oq;
import a.QX;
import a.Qf;
import a.V4;
import a.Xu;
import a.a;
import a.cp;
import a.d8;
import a.eD;
import a.eM;
import a.iI;
import a.jG;
import a.jU;
import a.jX;
import a.jd;
import a.jr;
import a.kX;
import a.p_;
import a.tU;
import a.xG;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xq
extends xG
implements iI {
    private final jU r;
    private final jr K;
    private final Random e;
    private final cp X;
    private final jr B;
    private static final Integer[] o;
    private static final String[] N;
    private static final long b;
    private final jU l;
    private final Queue<eD> R;
    private static final Object[] F;
    private static final Map v;
    private boolean L;
    private final jX t;
    private final jr w;
    private boolean x;
    private final Bg G;
    private static final long[] n;
    private final jd Y;
    private final jU P;

    private boolean r() {
        boolean bl2 = false;
        for (int i10 = 9; i10 < 36; ++i10) {
            boolean bl3;
            V4 v42;
            block12: {
                block11: {
                    V4 v43 = EP.U().l().F(i10);
                    try {
                        if (v43.Y()) {
                            continue;
                        }
                    }
                    catch (O_ o_2) {
                        throw xq.b(o_2);
                    }
                    QX qX2 = v43.C();
                    try {
                        if (qX2.Y()) {
                            continue;
                        }
                    }
                    catch (O_ o_3) {
                        throw xq.b(o_3);
                    }
                    try {
                        try {
                            v42 = v43;
                            if (!((jG)this.Y.J()).equals(this.B) && !((jG)this.Y.J()).equals(this.w)) break block11;
                        }
                        catch (O_ o_4) {
                            throw xq.b(o_4);
                        }
                        bl3 = true;
                        break block12;
                    }
                    catch (O_ o_5) {
                        throw xq.b(o_5);
                    }
                }
                bl3 = false;
            }
            if (!Xu.y(v42, bl3)) continue;
            bl2 = true;
        }
        return bl2;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = xq.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = xq.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public xq() {
        long l10 = b ^ 0xC852E7A5829L;
        super(a.cs((int)xq.c("l", (int)11201, (long)(0x62595019D07E62E1L ^ l10))), Oq.W, a.cs((int)xq.c("l", (int)6105, (long)(0x15626672B5825EF3L ^ l10))));
        this.w = new jr((String)((Object)xq.f("\u00d3", (int)xq.c("l", (int)23825, (long)(0xB25C0E00AD59433L ^ l10)), (long)3733612965589230190L, (long)l10)));
        this.K = new jr((String)((Object)xq.f("\u00d3", (int)xq.c("l", (int)6017, (long)(0x133FFF2D966FDEAAL ^ l10)), (long)3733612965589230190L, (long)l10)));
        this.B = new jr((String)((Object)xq.f("\u00d3", (int)xq.c("l", (int)11487, (long)(0x775DC4296728E5F6L ^ l10)), (long)3733612965589230190L, (long)l10)));
        this.Y = jd.D(this, (String)((Object)xq.f("\u00d3", (int)xq.c("l", (int)14001, (long)(0x33336270408A7F99L ^ l10)), (long)3733612965589230190L, (long)l10)), this.w, this.w, this.K, this.B);
        this.X = cp.o(this, (String)((Object)xq.f("\u00d3", (int)xq.c("l", (int)17202, (long)(0x4DCCBE88665F0A1DL ^ l10)), (long)3733612965589230190L, (long)l10)), (String)((Object)xq.f("\u00d3", (int)xq.c("l", (int)8706, (long)(0x5552D8FCA4B7EB25L ^ l10)), (long)3733612965589230190L, (long)l10)), cp.U, Collections.emptyList());
        this.P = jU.w(this, (String)((Object)xq.f("\u00d3", (int)xq.c("l", (int)19722, (long)(0x3613A54B885C8426L ^ l10)), (long)3733612965589230190L, (long)l10)), false);
        this.l = jU.w(this, (String)((Object)xq.f("\u00d3", (int)xq.c("l", (int)14318, (long)(0x28F106D8D714FECAL ^ l10)), (long)3733612965589230190L, (long)l10)), false);
        this.r = jU.R(this, (String)((Object)xq.f("\u00d3", (int)xq.c("l", (int)5832, (long)(0x637F39FAFD51DFE6L ^ l10)), (long)3733612965589230190L, (long)l10)), false, (String)((Object)xq.f("\u00d3", (int)xq.c("l", (int)577, (long)(0x556D450053D8CB62L ^ l10)), (long)3733612965589230190L, (long)l10)));
        this.t = jX.y(this, (String)((Object)xq.f("\u00d3", (int)xq.c("l", (int)5040, (long)(0x7DAC0EB7DF93DA95L ^ l10)), (long)3733612965589230190L, (long)l10)), (String)((Object)xq.f("\u00d3", (int)xq.c("l", (int)3827, (long)(0x1EF23095387EC7D2L ^ l10)), (long)3733612965589230190L, (long)l10)), (String)((Object)xq.f("\u00d3", (int)xq.c("l", (int)16227, (long)(0x94617C21A04764EL ^ l10)), (long)3733612965589230190L, (long)l10)), 50.0, 75.0, 125.0, 200.0, 5.0);
        this.R = new ConcurrentLinkedQueue<eD>();
        this.e = new Random();
        this.G = new Bg();
        this.r.l(this.X);
        this.N(this.P, this.l, this.r, this.X, this.t, this.Y);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method l(long l10, long l11) {
        int n2 = xq.i(l10, l11);
        Object object = F[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = N[n2];
                int n4 = string2.indexOf(8);
                clazz3 = xq.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = xq.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xq.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        xq.F[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xq.j(222059877232575L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = xq.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        xq.F[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xq.j(222059877232575L, 0L);
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

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (N[n5] != null) {
            return n5;
        }
        Object object = F[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 1;
                break;
            }
            case 1: {
                n4 = 49;
                break;
            }
            case 2: {
                n4 = 16;
                break;
            }
            case 3: {
                n4 = 33;
                break;
            }
            case 4: {
                n4 = 42;
                break;
            }
            case 5: {
                n4 = 18;
                break;
            }
            case 6: {
                n4 = 38;
                break;
            }
            case 7: {
                n4 = 4;
                break;
            }
            case 8: {
                n4 = 7;
                break;
            }
            case 9: {
                n4 = 43;
                break;
            }
            case 10: {
                n4 = 52;
                break;
            }
            case 11: {
                n4 = 22;
                break;
            }
            case 12: {
                n4 = 63;
                break;
            }
            case 13: {
                n4 = 60;
                break;
            }
            case 14: {
                n4 = 14;
                break;
            }
            case 15: {
                n4 = 45;
                break;
            }
            case 16: {
                n4 = 0;
                break;
            }
            case 17: {
                n4 = 13;
                break;
            }
            case 18: {
                n4 = 11;
                break;
            }
            case 19: {
                n4 = 44;
                break;
            }
            case 20: {
                n4 = 32;
                break;
            }
            case 21: {
                n4 = 20;
                break;
            }
            case 22: {
                n4 = 23;
                break;
            }
            case 23: {
                n4 = 17;
                break;
            }
            case 24: {
                n4 = 8;
                break;
            }
            case 25: {
                n4 = 30;
                break;
            }
            case 26: {
                n4 = 10;
                break;
            }
            case 27: {
                n4 = 15;
                break;
            }
            case 28: {
                n4 = 37;
                break;
            }
            case 29: {
                n4 = 59;
                break;
            }
            case 30: {
                n4 = 34;
                break;
            }
            case 31: {
                n4 = 40;
                break;
            }
            case 32: {
                n4 = 53;
                break;
            }
            case 33: {
                n4 = 51;
                break;
            }
            case 34: {
                n4 = 61;
                break;
            }
            case 35: {
                n4 = 6;
                break;
            }
            case 36: {
                n4 = 27;
                break;
            }
            case 37: {
                n4 = 55;
                break;
            }
            case 38: {
                n4 = 62;
                break;
            }
            case 39: {
                n4 = 28;
                break;
            }
            case 40: {
                n4 = 26;
                break;
            }
            case 41: {
                n4 = 46;
                break;
            }
            case 42: {
                n4 = 12;
                break;
            }
            case 43: {
                n4 = 29;
                break;
            }
            case 44: {
                n4 = 9;
                break;
            }
            case 45: {
                n4 = 3;
                break;
            }
            case 46: {
                n4 = 35;
                break;
            }
            case 47: {
                n4 = 48;
                break;
            }
            case 48: {
                n4 = 56;
                break;
            }
            case 49: {
                n4 = 21;
                break;
            }
            case 50: {
                n4 = 31;
                break;
            }
            case 51: {
                n4 = 2;
                break;
            }
            case 52: {
                n4 = 24;
                break;
            }
            case 53: {
                n4 = 47;
                break;
            }
            case 54: {
                n4 = 50;
                break;
            }
            case 55: {
                n4 = 39;
                break;
            }
            case 56: {
                n4 = 57;
                break;
            }
            case 57: {
                n4 = 25;
                break;
            }
            case 58: {
                n4 = 5;
                break;
            }
            case 59: {
                n4 = 19;
                break;
            }
            case 60: {
                n4 = 58;
                break;
            }
            case 61: {
                n4 = 54;
                break;
            }
            case 62: {
                n4 = 36;
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
        xq.N[n5] = new String(cArray);
        return n5;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = xq.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private boolean I(V4 v42, List<V4> list) {
        for (V4 v43 : list) {
            try {
                if (v42.equals(v43)) {
                    continue;
                }
            }
            catch (O_ o_2) {
                throw xq.b(o_2);
            }
            try {
                if (!v42.M().equals(v43.M())) continue;
                return true;
            }
            catch (O_ o_3) {
                throw xq.b(o_3);
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void e() {
        block5: {
            block4: {
                try {
                    if (this.t.q() != 0.0) break block4;
                    break block5;
                }
                catch (O_ o_2) {
                    throw xq.b(o_2);
                }
            }
            if (this.G.m((long)this.t.l())) {
                eD eD2 = this.R.poll();
                eD2.H();
                this.G.m();
            }
            return;
        }
        while (!this.R.isEmpty()) {
            eD eD3 = this.R.poll();
            eD3.H();
        }
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = xq.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = xq.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void v() {
        this.L = false;
    }

    private boolean d(double d2) {
        boolean bl2;
        double d3 = Math.max(Math.min(d2, 1.0), 0.0);
        try {
            bl2 = Math.random() <= d3;
        }
        catch (O_ o_2) {
            throw xq.b(o_2);
        }
        return bl2;
    }

    private void D() {
        E9 e92 = new E9(EP.X().M());
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList arrayList2 = new ArrayList();
        int n2 = 0;
        List<Integer> list = this.O();
        int n3 = 9;
        while (n3 < 36) {
            block36: {
                block32: {
                    Qf qf2 = e92.R().D().get(n3);
                    Object object = qf2.y();
                    if (!((V4)object).Y()) {
                        boolean bl2;
                        V4 v42;
                        block35: {
                            block34: {
                                QX qX2 = ((V4)object).C();
                                try {
                                    block33: {
                                        try {
                                            try {
                                                if (qX2.Y()) break block32;
                                                v42 = object;
                                                if (((jG)this.Y.J()).equals(this.B)) break block33;
                                            }
                                            catch (O_ o_2) {
                                                throw xq.b(o_2);
                                            }
                                            if (!((jG)this.Y.J()).equals(this.w)) break block34;
                                        }
                                        catch (O_ o_3) {
                                            throw xq.b(o_3);
                                        }
                                    }
                                    bl2 = true;
                                    break block35;
                                }
                                catch (O_ o_4) {
                                    throw xq.b(o_4);
                                }
                            }
                            bl2 = false;
                        }
                        try {
                            if (Xu.y(v42, bl2)) {
                                arrayList.add(n3);
                            }
                        }
                        catch (O_ o_5) {
                            throw xq.b(o_5);
                        }
                    }
                }
                try {
                    if (!this.P.s().booleanValue()) break block36;
                    n3 += 9;
                    if (++n2 != 3) continue;
                }
                catch (O_ o_6) {
                    throw xq.b(o_6);
                }
                ++n3;
                n3 -= 27;
                n2 = 0;
                continue;
            }
            ++n3;
        }
        try {
            if (arrayList.isEmpty()) {
                this.x = true;
                return;
            }
        }
        catch (O_ o_7) {
            throw xq.b(o_7);
        }
        try {
            if (this.l.s().booleanValue()) {
                Collections.shuffle(arrayList);
            }
        }
        catch (O_ o_8) {
            throw xq.b(o_8);
        }
        n3 = 0;
        try {
            while (true) {
                try {
                    if (n3 >= list.size() || n3 >= arrayList.size()) break;
                }
                catch (O_ o_9) {
                    throw xq.b(o_9);
                }
                arrayList2.add(arrayList.get(n3));
                ++n3;
            }
        }
        catch (O_ o_10) {
            throw xq.b(o_10);
        }
        n3 = 0;
        for (Object object : arrayList2) {
            block39: {
                block38: {
                    boolean bl3 = false;
                    int n4 = 0;
                    if (this.r.s().booleanValue()) {
                        QX qX3;
                        n4 = list.get(n3);
                        V4 v43 = EP.U().l().F(n4);
                        if (v43.r() && (qX3 = v43.C()).r()) {
                            bl3 = true;
                        }
                    }
                    try {
                        if (!bl3) break block38;
                        this.B(e92.R().D(), (Integer)object, 0, 0);
                        this.B(e92.R().D(), 36 + n4, 0, 0);
                        this.B(e92.R().D(), (Integer)object, 0, 0);
                        break block39;
                    }
                    catch (O_ o_11) {
                        throw xq.b(o_11);
                    }
                }
                try {
                    this.B(e92.R().D(), (Integer)object, 0, 1);
                    if (this.S()) {
                        this.B(e92.R().D(), (Integer)object, 0, 1);
                    }
                }
                catch (O_ o_12) {
                    throw xq.b(o_12);
                }
            }
            ++n3;
        }
    }

    @Override
    public void h() {
        try {
            if (EP.U().Y()) {
                this.T(false);
                return;
            }
        }
        catch (O_ o_2) {
            throw xq.b(o_2);
        }
        try {
            if (this.O().size() == 0) {
                this.T(false);
                return;
            }
        }
        catch (O_ o_3) {
            throw xq.b(o_3);
        }
        try {
            if (!this.r()) {
                this.T(false);
            }
        }
        catch (O_ o_4) {
            throw xq.b(o_4);
        }
    }

    private void B(int n2, int n3, int n4, int n5) {
        this.R.add(new eD(n2, n3, n4, n5));
    }

    @OY
    public void o(p_ p_2) {
        block21: {
            block22: {
                block17: {
                    block20: {
                        block18: {
                            tU tU2;
                            block19: {
                                try {
                                    if (this.L) break block17;
                                    if (EP.X().B(eM.bN)) break block18;
                                }
                                catch (O_ o_2) {
                                    throw xq.b(o_2);
                                }
                                tU2 = EP.N().R();
                                try {
                                    if (kX.C() < 35) break block19;
                                    Oe.p(tU2);
                                    break block20;
                                }
                                catch (O_ o_3) {
                                    throw xq.b(o_3);
                                }
                            }
                            Oe.f(tU2, true);
                            Oe.r(tU2, false, false);
                            break block20;
                        }
                        this.L = true;
                    }
                    return;
                }
                try {
                    try {
                        if (!this.x) break block21;
                        if (EP.X().Y()) break block22;
                    }
                    catch (O_ o_4) {
                        throw xq.b(o_4);
                    }
                    EP.U().E();
                }
                catch (O_ o_5) {
                    throw xq.b(o_5);
                }
            }
            this.x = false;
            this.R.clear();
            this.T(false);
            return;
        }
        try {
            if (!EP.X().B(eM.bN)) {
                this.x = true;
                return;
            }
        }
        catch (O_ o_6) {
            throw xq.b(o_6);
        }
        try {
            if (!this.R.isEmpty()) {
                this.e();
                return;
            }
        }
        catch (O_ o_7) {
            throw xq.b(o_7);
        }
        try {
            this.D();
            if (this.R.isEmpty()) {
                this.x = true;
            }
        }
        catch (O_ o_8) {
            throw xq.b(o_8);
        }
    }

    private static void d() {
        Object[] objectArray = F;
        F[0] = "0 y";
        objectArray[1] = Integer.TYPE;
        xq.N[1] = "java/lang/Integer";
        objectArray[2] = "\u00163|d\u000b$\u001d<m+v<\u000e;db";
        objectArray[3] = "u'W)nL~(Ff\u000fBu#B<";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0018\u0014=v\u001ay\u001c\u0002y\u0019\u001bgq\u0013adJz\u001e\u0014wip%\u0014\u0001w(\fx\f\u0007x\u0019";
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'A' || c10 == 'W' || c10 == 'M' || c10 == '\u00f3') {
                field = xq.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'A' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'M' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xq.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'Y' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field k(long l10, long l11) {
        int n2 = xq.i(l10, l11);
        Object object = F[n2];
        if (object instanceof String) {
            String string = N[n2];
            int n3 = string.indexOf(8);
            Class clazz = xq.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = xq.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xq.e(clazz3, string2, clazz2)) != null) {
                    xq.F[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = xq.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        xq.F[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xq.j(222059877232575L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private List<Integer> O() {
        long l10 = b ^ 0x727DE00FBDAEL;
        ArrayList<V4> arrayList = new ArrayList<V4>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        Object[] objectArray = EP.U().l().C();
        for (int i10 = 0; i10 < 9; ++i10) {
            V4 v42;
            block10: {
                v42 = new V4(objectArray[i10]);
                try {
                    if (v42.Y()) {
                        arrayList2.add(i10);
                        continue;
                    }
                }
                catch (O_ o_2) {
                    throw xq.b(o_2);
                }
                try {
                    try {
                        if (!this.r.s().booleanValue()) break block10;
                        if (!this.O(v42.C(), v42, arrayList)) continue;
                    }
                    catch (O_ o_3) {
                        throw xq.b(o_3);
                    }
                    arrayList2.add(i10);
                    continue;
                }
                catch (O_ o_4) {
                    throw xq.b(o_4);
                }
            }
            try {
                if (!v42.toString().contains((CharSequence)((Object)xq.f("\u00d3", (int)xq.c("l", (int)28594, (long)(0x3C63F931BEAB4313L ^ l10)), (long)-3001917650972915735L, (long)l10)))) continue;
                arrayList2.add(i10);
                continue;
            }
            catch (O_ o_5) {
                throw xq.b(o_5);
            }
        }
        return arrayList2;
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = xq.i(l10, l11);
            object = F[n2];
            try {
                if (!(object instanceof String)) break block2;
                xq.F[n2] = clazz = Class.forName(N[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = xq.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }

    private boolean S() {
        return this.d(0.2);
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7AFC;
        if (o[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = n[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])v.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    v.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xq", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xq.o[n3] = n4;
        }
        return o[n3];
    }

    private boolean O(QX qX2, V4 v42, List<V4> list) {
        block13: {
            block14: {
                boolean bl2;
                V4 v43;
                block12: {
                    block11: {
                        try {
                            try {
                                v43 = v42;
                                if (!((jG)this.Y.J()).equals(this.B) && !((jG)this.Y.J()).equals(this.w)) break block11;
                            }
                            catch (O_ o_2) {
                                throw xq.b(o_2);
                            }
                            bl2 = true;
                            break block12;
                        }
                        catch (O_ o_3) {
                            throw xq.b(o_3);
                        }
                    }
                    bl2 = false;
                }
                try {
                    if (Xu.y(v43, bl2)) {
                        return false;
                    }
                }
                catch (O_ o_4) {
                    throw xq.b(o_4);
                }
                try {
                    try {
                        if (!this.X.b(v42, true)) break block13;
                        if (this.I(v42, list)) break block14;
                    }
                    catch (O_ o_5) {
                        throw xq.b(o_5);
                    }
                    list.add(v42);
                    return false;
                }
                catch (O_ o_6) {
                    throw xq.b(o_6);
                }
            }
            return true;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                xq.b = d8.a(7888264836021508558L, 8608328339647518810L, MethodHandles.lookup().lookupClass()).a(49944479071155L);
                xq.F = new Object[5];
                xq.N = new String[5];
                xq.d();
                xq.v = new HashMap<K, V>(13);
                var0 = xq.b ^ 39174152654884L;
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
                var8_3 = new long[16];
                var5_4 = 0;
                var6_5 = "0-\u00a5\u00e0m\u0089\u0094\u0094\u00ba\u008f\u00ad\u007f*\u001aVX\fw\u0012\u00c9x7L\u00bd\u00fb0W\u00b6\u00bc1\u00dbw\u00d7\u00e0\u001a.;\u00aeF\u0088Q4\u00a2\u0005\u00cf\r\u00fd\u0004N\u001b$\u00f8\u00cb\u008a{\u00e5j\u00aeu\u00c0[N\u008f\u0095\u00e5\u00a1\u0087F\u00c0\u000b{\u0006\n\u0089\u0001(\u0097S-\u00e0g^\u00b0\u00d4\u00bc\u008d\u00f1l\u00c4\u0016\u00fd'K\u00be\u00fa\u009a<\u0097\u0096\u0007\u0005\u0084\u008d/C\u00ce9\u00e7\u00fa\u0086\u00cc\u00de";
                var7_6 = "0-\u00a5\u00e0m\u0089\u0094\u0094\u00ba\u008f\u00ad\u007f*\u001aVX\fw\u0012\u00c9x7L\u00bd\u00fb0W\u00b6\u00bc1\u00dbw\u00d7\u00e0\u001a.;\u00aeF\u0088Q4\u00a2\u0005\u00cf\r\u00fd\u0004N\u001b$\u00f8\u00cb\u008a{\u00e5j\u00aeu\u00c0[N\u008f\u0095\u00e5\u00a1\u0087F\u00c0\u000b{\u0006\n\u0089\u0001(\u0097S-\u00e0g^\u00b0\u00d4\u00bc\u008d\u00f1l\u00c4\u0016\u00fd'K\u00be\u00fa\u009a<\u0097\u0096\u0007\u0005\u0084\u008d/C\u00ce9\u00e7\u00fa\u0086\u00cc\u00de".length();
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
                    var6_5 = "\u00a1\u00ce]Fa\u00f8y`k\u0090+\u0094\u00a1\u007f\u00eb\u0002";
                    var7_6 = "\u00a1\u00ce]Fa\u00f8y`k\u0090+\u0094\u00a1\u007f\u00eb\u0002".length();
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
        xq.n = var8_3;
        xq.o = new Integer[16];
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xq.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(xq.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

