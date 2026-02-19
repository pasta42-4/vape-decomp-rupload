/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package a;

import a.Ao;
import a.BO;
import a.Cz;
import a.EP;
import a.F8;
import a.G5;
import a.Gn;
import a.Gw;
import a.H3;
import a.Hc;
import a.I_;
import a.KP;
import a.Kx;
import a.NB;
import a.NI;
import a.Na;
import a.O_;
import a.QX;
import a.R6;
import a.SE;
import a.T9;
import a.V4;
import a.Vc;
import a.Vy;
import a.YK;
import a._b;
import a.b6;
import a.b9;
import a.bB;
import a.bE;
import a.ba;
import a.cB;
import a.cO;
import a.d8;
import a.eG;
import a.fB;
import a.fW;
import a.fo;
import a.fu;
import a.hB;
import a.ht;
import a.hx;
import a.iW;
import a.rT;
import a.sv;
import a.w6;
import a.wN;
import a.y2;
import a.y6;
import a.yE;
import a.yJ;
import a.yU;
import a.yZ;
import a.yd;
import a.ye;
import a.yt;
import a.z0;
import a.zy;
import com.google.gson.JsonObject;
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
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fz
extends w6 {
    private b9 zt;
    private static final String[] rb;
    private Ao zp;
    private HashMap<String, ht[]> zK;
    private static final Object[] qb;
    private static final Integer[] fb;
    private static final Map lb;
    private rT zm;
    private Gw zN;
    private static final long[] eb;
    private static final long ab;

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fz.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = fz.h(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void lambda$addDebugTools$14() {
        long l10 = ab ^ 0x2D9AFD4F74D7L;
        for (int i10 = 0; i10 < 45; ++i10) {
            V4 v42 = EP.U().l().F(i10);
            try {
                if (v42.Y()) {
                    continue;
                }
            }
            catch (O_ o_2) {
                throw fz.a(o_2);
            }
            SE.x((String)((Object)fz.e("R", (int)fz.d("x", (int)28176, (long)(0x4AB8765A45FBA44BL ^ l10)), (long)-2374703011732730609L, (long)l10)) + v42.g() + (String)((Object)fz.e("R", (int)fz.d("x", (int)4528, (long)(0x6B6433087007DBE8L ^ l10)), (long)-2374703011732730609L, (long)l10)) + QX.l(v42.C()) + (String)((Object)fz.e("R", (int)fz.d("x", (int)10700, (long)(0x6A180AEE93BB6387L ^ l10)), (long)-2374703011732730609L, (long)l10)) + i10);
        }
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field o(long l10, long l11) {
        int n2 = fz.m(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            String string = rb[n2];
            int n3 = string.indexOf(8);
            Class clazz = fz.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = fz.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fz.g(clazz3, string2, clazz2)) != null) {
                    fz.qb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = fz.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        fz.qb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fz.n(275392049603347L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void a(String string, ht ... htArray) {
        this.zK.put(string, htArray);
        this.n(new hB(string).N(new iW(this, string)), new Object[0]);
    }

    private static int m(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (rb[n5] != null) {
            return n5;
        }
        Object object = qb[n5];
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
                n4 = 16;
                break;
            }
            case 2: {
                n4 = 14;
                break;
            }
            case 3: {
                n4 = 51;
                break;
            }
            case 4: {
                n4 = 59;
                break;
            }
            case 5: {
                n4 = 47;
                break;
            }
            case 6: {
                n4 = 24;
                break;
            }
            case 7: {
                n4 = 32;
                break;
            }
            case 8: {
                n4 = 5;
                break;
            }
            case 9: {
                n4 = 54;
                break;
            }
            case 10: {
                n4 = 41;
                break;
            }
            case 11: {
                n4 = 53;
                break;
            }
            case 12: {
                n4 = 57;
                break;
            }
            case 13: {
                n4 = 31;
                break;
            }
            case 14: {
                n4 = 33;
                break;
            }
            case 15: {
                n4 = 4;
                break;
            }
            case 16: {
                n4 = 27;
                break;
            }
            case 17: {
                n4 = 46;
                break;
            }
            case 18: {
                n4 = 11;
                break;
            }
            case 19: {
                n4 = 12;
                break;
            }
            case 20: {
                n4 = 63;
                break;
            }
            case 21: {
                n4 = 37;
                break;
            }
            case 22: {
                n4 = 38;
                break;
            }
            case 23: {
                n4 = 3;
                break;
            }
            case 24: {
                n4 = 29;
                break;
            }
            case 25: {
                n4 = 61;
                break;
            }
            case 26: {
                n4 = 45;
                break;
            }
            case 27: {
                n4 = 58;
                break;
            }
            case 28: {
                n4 = 55;
                break;
            }
            case 29: {
                n4 = 34;
                break;
            }
            case 30: {
                n4 = 44;
                break;
            }
            case 31: {
                n4 = 17;
                break;
            }
            case 32: {
                n4 = 28;
                break;
            }
            case 33: {
                n4 = 40;
                break;
            }
            case 34: {
                n4 = 8;
                break;
            }
            case 35: {
                n4 = 43;
                break;
            }
            case 36: {
                n4 = 22;
                break;
            }
            case 37: {
                n4 = 6;
                break;
            }
            case 38: {
                n4 = 49;
                break;
            }
            case 39: {
                n4 = 0;
                break;
            }
            case 40: {
                n4 = 13;
                break;
            }
            case 41: {
                n4 = 7;
                break;
            }
            case 42: {
                n4 = 56;
                break;
            }
            case 43: {
                n4 = 35;
                break;
            }
            case 44: {
                n4 = 42;
                break;
            }
            case 45: {
                n4 = 19;
                break;
            }
            case 46: {
                n4 = 36;
                break;
            }
            case 47: {
                n4 = 15;
                break;
            }
            case 48: {
                n4 = 48;
                break;
            }
            case 49: {
                n4 = 39;
                break;
            }
            case 50: {
                n4 = 52;
                break;
            }
            case 51: {
                n4 = 25;
                break;
            }
            case 52: {
                n4 = 26;
                break;
            }
            case 53: {
                n4 = 62;
                break;
            }
            case 54: {
                n4 = 50;
                break;
            }
            case 55: {
                n4 = 18;
                break;
            }
            case 56: {
                n4 = 10;
                break;
            }
            case 57: {
                n4 = 9;
                break;
            }
            case 58: {
                n4 = 20;
                break;
            }
            case 59: {
                n4 = 23;
                break;
            }
            case 60: {
                n4 = 2;
                break;
            }
            case 61: {
                n4 = 60;
                break;
            }
            case 62: {
                n4 = 30;
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
        fz.rb[n5] = new String(cArray);
        return n5;
    }

    private static void lambda$null$6(zy zy2) {
        long l10 = ab ^ 0x58EC8D682286L;
        SE.x((String)((Object)fz.e("R", (int)fz.d("x", (int)6264, (long)(0x7DD112F922548468L ^ l10)), (long)-8549475556704806050L, (long)l10)) + zy2);
    }

    static fo P(fz fz2, String string) {
        return fz2.o(string);
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = fz.d(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    static HashMap j(fz fz2) {
        return fz2.zK;
    }

    private static Method p(long l10, long l11) {
        int n2 = fz.m(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = rb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = fz.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = fz.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fz.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        fz.qb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fz.n(275392049603347L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = fz.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        fz.qb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fz.n(275392049603347L, 0L);
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

    private void lambda$addDebugTools$15() {
        for (w6 w62 : Ao.J()) {
            if (!(w62 instanceof fu)) continue;
            fu fu2 = (fu)w62;
            fu2.N(true);
            for (ht ht2 : fu2.A()) {
                if (!(ht2 instanceof hx)) continue;
                hx hx2 = (hx)ht2;
                hx2.o();
            }
        }
        Ao.i();
        this.J();
    }

    private static void lambda$new$8() {
        long l10 = ab ^ 0x7DC17D4A834BL;
        SE.x((String)((Object)fz.e("R", (int)fz.d("x", (int)10124, (long)(0x2384726D618C9A47L ^ l10)), (long)2924820135805663891L, (long)l10)));
        JsonObject jsonObject = SE.h.u().Y(true);
        ((CompletableFuture)_b.S().c().s(jsonObject).thenAccept(fz::lambda$null$6)).exceptionally(fz::lambda$null$7);
    }

    private static Void lambda$null$7(Throwable throwable) {
        SE.W(throwable);
        return null;
    }

    private static void lambda$null$3(zy zy2) {
        long l10 = ab ^ 0x3414556EC5B8L;
        SE.x((String)((Object)fz.e("R", (int)fz.d("x", (int)29285, (long)(0x249041AE58FF8974L ^ l10)), (long)7954559532288408672L, (long)l10)) + zy2);
    }

    @Override
    public String A() {
        long l10 = ab ^ 0x6FF0543AE84CL;
        return fz.e("R", (int)fz.d("x", (int)5228, (long)(0x3297000EFDDA4285L ^ l10)), (long)4868424577202213268L, (long)l10);
    }

    private static Void lambda$null$4(Throwable throwable) {
        SE.W(throwable);
        return null;
    }

    private static void lambda$new$5() {
        long l10 = ab ^ 0x248C656C54B8L;
        SE.x((String)((Object)fz.e("R", (int)fz.d("x", (int)3058, (long)(0x66C19649C08061D2L ^ l10)), (long)-43816466839114400L, (long)l10)));
        ((CompletableFuture)_b.S().c().E().thenAccept(fz::lambda$null$3)).exceptionally(fz::lambda$null$4);
    }

    private void Z() {
        long l10 = ab ^ 0x7C2B2D344997L;
        this.a((String)((Object)fz.e("R", (int)fz.d("x", (int)8408, (long)(0x26673ED9653557C4L ^ l10)), (long)-2140602351878803377L, (long)l10)), new ye((String)((Object)fz.e("R", (int)fz.d("x", (int)26185, (long)(0x72BF3ACD5F839156L ^ l10)), (long)-2140602351878803377L, (long)l10)), fz::lambda$addDebugTools$14), new ye((String)((Object)fz.e("R", (int)fz.d("x", (int)28674, (long)(0x42CC74F43987870AL ^ l10)), (long)-2140602351878803377L, (long)l10)), this::lambda$addDebugTools$15), new ye((String)((Object)fz.e("R", (int)fz.d("x", (int)4423, (long)(0xA48E7ECBD886640L ^ l10)), (long)-2140602351878803377L, (long)l10)), fz::lambda$addDebugTools$16), new ye((String)((Object)fz.e("R", (int)fz.d("x", (int)31671, (long)(0x7D8A5D0B82C08C8EL ^ l10)), (long)-2140602351878803377L, (long)l10)), fz::lambda$addDebugTools$17), new ye((String)((Object)fz.e("R", (int)fz.d("x", (int)29887, (long)(0x6DBB3C85CA6103A5L ^ l10)), (long)-2140602351878803377L, (long)l10)), R6::R), new ye((String)((Object)fz.e("R", (int)fz.d("x", (int)26463, (long)(0x13BBB445D96905DL ^ l10)), (long)-2140602351878803377L, (long)l10)), KP::G));
    }

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = "\u0002Sk";
        objectArray[1] = Integer.TYPE;
        fz.rb[1] = "java/lang/Integer";
        objectArray[2] = "\u001f/\fQ\u0019\u0006\u0014 \u001d\u001ed\u001e\u0007'\u0014W";
        objectArray[3] = "Z<zj\u0006\u0019Q3k%g\u0017Z8o\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "pqcfC9ng=\u001b\u0018/\u0010'bx\u000fdvd9v\u0014T)`1$\u00134lre\"s";
    }

    static rT L(fz fz2) {
        return fz2.zm;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void d() {
        block18: {
            fW fW2;
            block20: {
                fo fo2;
                block19: {
                    fW2 = Ao.D(fW.class);
                    fo2 = Ao.D(fo.class);
                    try {
                        try {
                            try {
                                try {
                                    if (!fo2.f() && !fW2.f()) break block18;
                                }
                                catch (O_ o_2) {
                                    throw fz.a(o_2);
                                }
                                if (!this.f()) break block19;
                            }
                            catch (O_ o_3) {
                                throw fz.a(o_3);
                            }
                            if (!fo2.f()) break block19;
                        }
                        catch (O_ o_4) {
                            throw fz.a(o_4);
                        }
                        this.r(false, false);
                    }
                    catch (O_ o_5) {
                        throw fz.a(o_5);
                    }
                }
                try {
                    if (!fo2.f()) break block20;
                    this.m(fo2.G(), fo2.W());
                    return;
                }
                catch (O_ o_6) {
                    throw fz.a(o_6);
                }
            }
            try {
                try {
                    try {
                        if (!fW2.f() || this.G() == fW2.G()) return;
                    }
                    catch (O_ o_7) {
                        throw fz.a(o_7);
                    }
                    if (this.W() == fW2.W()) return;
                }
                catch (O_ o_8) {
                    throw fz.a(o_8);
                }
                this.m(fW2.G(), fW2.W());
                return;
            }
            catch (O_ o_9) {
                throw fz.a(o_9);
            }
        }
        try {
            if (this.f()) return;
            this.r(true, false);
            return;
        }
        catch (O_ o_10) {
            throw fz.a(o_10);
        }
    }

    private static int lambda$sortGui$13(w6 w62, w6 w63) {
        try {
            if (w62.b() == w63.b()) {
                return 0;
            }
        }
        catch (O_ o_2) {
            throw fz.a(o_2);
        }
        return Double.compare(w63.b(), w62.b());
    }

    private static boolean lambda$sortGui$12(w6 w62) {
        boolean bl2;
        block12: {
            block11: {
                try {
                    block10: {
                        try {
                            try {
                                try {
                                    try {
                                        if (!w62.f() || w62.N()) break block10;
                                    }
                                    catch (O_ o_2) {
                                        throw fz.a(o_2);
                                    }
                                    if (!w62.m()) break block10;
                                }
                                catch (O_ o_3) {
                                    throw fz.a(o_3);
                                }
                                if (w62 instanceof wN) break block10;
                            }
                            catch (O_ o_4) {
                                throw fz.a(o_4);
                            }
                            if (!(w62 instanceof fB)) break block11;
                        }
                        catch (O_ o_5) {
                            throw fz.a(o_5);
                        }
                    }
                    bl2 = true;
                    break block12;
                }
                catch (O_ o_6) {
                    throw fz.a(o_6);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private fo o(String string) {
        fo fo2 = Ao.D(fo.class).o(string);
        fo2.X();
        this.p(fo2);
        fo2.k();
        return fo2;
    }

    private static void lambda$addDebugTools$17() {
        SE.h.W().P();
    }

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = fz.m(l10, l11);
            object = qb[n2];
            try {
                if (!(object instanceof String)) break block2;
                fz.qb[n2] = clazz = Class.forName(rb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00c8' || c10 == 'G' || c10 == '\u00cc' || c10 == '\u00e5') {
                field = fz.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00c8' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'G' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00cc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fz.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'N' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'R' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
                fz.ab = d8.a(-3715550106654707243L, -8483446321820772072L, MethodHandles.lookup().lookupClass()).a(49332038850455L);
                fz.qb = new Object[5];
                fz.rb = new String[5];
                fz.T();
                fz.lb = new HashMap<K, V>(13);
                var0 = fz.ab ^ 103812758390150L;
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
                var8_3 = new long[49];
                var5_4 = 0;
                var6_5 = "\u00a0\u00c0\u00be\u007f\"\u009f\u00e6_\u00d5\u0081\u00bc\u00043\u008c\u00a3X+\u0082\u00bb\u008b\u00fc\u00c1fn\r\u00a07\u000e\u00ba\u00cb\u00a6\"R\u0095\u00c8\u00a1\u0016\u001d\u00bb\u00e7\u00b4>y\u00c1\n\u00de<b5w\u009c\u0086\u008fYk/\u00e4\u00e7y\u00fb\u00dd\u0096X\u00bc\u000e\u00feh)\u0019\u0099\u00114\u00c1\u00baA8\u00071\u00848\u009cK{\u0080\u00e2\u00f1)\u00c8\u00d6\\\u00ab^\u00cc6|\u00c8k\u00a0\u0005\u00b0\u009d\u009b\u0010\u00db\u00d1\u0000-\u00f8\u008d\u00a8\u00f0\u00c3\u00ae\u00f8\u00cd\u00e4\u00a50\u00fbn\n/\u00fb\u009cn\u0011\u00bf\u0006\u00c5\u00e7\u000b\u0080/\u00a9ef(\u00f5\b\u00f7)Z\u00a1\u00c5\fDV\u00f7*\u009a\u00f3\u009e5h\u0005!\u00dbBJ\u0083\u009a\u00f9\u0010Fu\u009a2\u00d3:\u00d2Vd\u0007\u009b\u00efo\u0094\u0019\t\u00cf\u00f6*\u00ce\u008f\u001bE0\u009b\u001f\u0091&\u00dc\\\u00d5\u00b1\u0003\"\f\u00f4\u0012\u00014\u0015\u00bf\u0011\u00c9\u00ca]\u00ac\u00b1O\u00b5\u00d7\u00f8D'\u00dfd\u0093}\u0095U,a\u00ef9l\u008cf\u000f1\u00a9\u00c2ye!\u0006\u0004\\r\u00b5\u009bu\n\u00ab\u00ca\u00c2\u0099ty;Z\u00e6\u00c4\u00b2u\u00bd\u00b8\u00ef\u0089}\u00a0\u008f\u00da\u00ec\u0006\u0089~\u00ca\u00eb\u00ca\u00e1\u00c3P3\u00a8f\u0088\u00cfm\u00ad\u00b0T\u0019\u008fG\u008d\u00c2p\u00c9\u00df\u00b0\u000ft\u0083R\u00e8\u00cd\u0081\u0017!\u001e\u00e2}\u00ad\n\u00fal\fY\u009f:Y\\\u0004\u00b7\u00d4D\u00cd\n\u00b2ZB\u00a4^x\u00b3\u00cc^\u00ea\u00e7\u00bf\u0090\u00c8\u0007\u00d3\u00fe\u009a0\u009c\f\u00ce\u0011\u0092V\u0093t9p\u0019\u0080\u009432\u000e\u00a9\u00ac@\u001ajK\u00c7\u00a5\u00e3\u001c\u00c2\u00f2\u008c\u00eeRbaV\u00e6\f\u00c1";
                var7_6 = "\u00a0\u00c0\u00be\u007f\"\u009f\u00e6_\u00d5\u0081\u00bc\u00043\u008c\u00a3X+\u0082\u00bb\u008b\u00fc\u00c1fn\r\u00a07\u000e\u00ba\u00cb\u00a6\"R\u0095\u00c8\u00a1\u0016\u001d\u00bb\u00e7\u00b4>y\u00c1\n\u00de<b5w\u009c\u0086\u008fYk/\u00e4\u00e7y\u00fb\u00dd\u0096X\u00bc\u000e\u00feh)\u0019\u0099\u00114\u00c1\u00baA8\u00071\u00848\u009cK{\u0080\u00e2\u00f1)\u00c8\u00d6\\\u00ab^\u00cc6|\u00c8k\u00a0\u0005\u00b0\u009d\u009b\u0010\u00db\u00d1\u0000-\u00f8\u008d\u00a8\u00f0\u00c3\u00ae\u00f8\u00cd\u00e4\u00a50\u00fbn\n/\u00fb\u009cn\u0011\u00bf\u0006\u00c5\u00e7\u000b\u0080/\u00a9ef(\u00f5\b\u00f7)Z\u00a1\u00c5\fDV\u00f7*\u009a\u00f3\u009e5h\u0005!\u00dbBJ\u0083\u009a\u00f9\u0010Fu\u009a2\u00d3:\u00d2Vd\u0007\u009b\u00efo\u0094\u0019\t\u00cf\u00f6*\u00ce\u008f\u001bE0\u009b\u001f\u0091&\u00dc\\\u00d5\u00b1\u0003\"\f\u00f4\u0012\u00014\u0015\u00bf\u0011\u00c9\u00ca]\u00ac\u00b1O\u00b5\u00d7\u00f8D'\u00dfd\u0093}\u0095U,a\u00ef9l\u008cf\u000f1\u00a9\u00c2ye!\u0006\u0004\\r\u00b5\u009bu\n\u00ab\u00ca\u00c2\u0099ty;Z\u00e6\u00c4\u00b2u\u00bd\u00b8\u00ef\u0089}\u00a0\u008f\u00da\u00ec\u0006\u0089~\u00ca\u00eb\u00ca\u00e1\u00c3P3\u00a8f\u0088\u00cfm\u00ad\u00b0T\u0019\u008fG\u008d\u00c2p\u00c9\u00df\u00b0\u000ft\u0083R\u00e8\u00cd\u0081\u0017!\u001e\u00e2}\u00ad\n\u00fal\fY\u009f:Y\\\u0004\u00b7\u00d4D\u00cd\n\u00b2ZB\u00a4^x\u00b3\u00cc^\u00ea\u00e7\u00bf\u0090\u00c8\u0007\u00d3\u00fe\u009a0\u009c\f\u00ce\u0011\u0092V\u0093t9p\u0019\u0080\u009432\u000e\u00a9\u00ac@\u001ajK\u00c7\u00a5\u00e3\u001c\u00c2\u00f2\u008c\u00eeRbaV\u00e6\f\u00c1".length();
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
                    var6_5 = " \u0091\u00bb\u00da-\u00c0}\u00deH\u00a5S\u00f8M\u00f4\\\u00d8";
                    var7_6 = " \u0091\u00bb\u00da-\u00c0}\u00deH\u00a5S\u00f8M\u00f4\\\u00d8".length();
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
        fz.eb = var8_3;
        fz.fb = new Integer[49];
    }

    private static void lambda$new$1() {
        String string;
        StringBuilder stringBuilder;
        CallSite callSite;
        NB nB;
        long l10 = ab ^ 0x63AC47330D78L;
        cB cB2 = SE.h.x().V(EP.U().a());
        try {
            nB = SE.h.c();
            callSite = fz.e("R", (int)fz.d("x", (int)23356, (long)(0x2C1AF05843B468D6L ^ l10)), (long)-6439001741917506400L, (long)l10);
            stringBuilder = new StringBuilder().append((String)((Object)fz.e("R", (int)fz.d("x", (int)9227, (long)(0x5CC6ED4C14BA17E2L ^ l10)), (long)-6439001741917506400L, (long)l10)));
            string = cB2 != null ? cB2.Z() : null;
        }
        catch (O_ o_2) {
            throw fz.a(o_2);
        }
        nB.L((String)((Object)callSite), stringBuilder.append(string).toString(), 3000L);
    }

    private static void lambda$new$2() {
        long l10 = ab ^ 0x58D0C848904AL;
        SE.x((String)((Object)fz.e("R", (int)fz.d("x", (int)15081, (long)(0x41CABE8E5AFC943EL ^ l10)), (long)4293664905142806930L, (long)l10)));
        SE.h.u().F();
    }

    private static void lambda$addDebugTools$16() {
        long l10 = ab ^ 0x17DC3518EAA6L;
        int n2 = 0;
        SE.x((String)((Object)fz.e("R", (int)fz.d("x", (int)11487, (long)(0x45D308F48FAEF8F8L ^ l10)), (long)4718196223105389438L, (long)l10)) + Na.u());
        SE.x((String)((Object)fz.e("R", (int)fz.d("x", (int)10547, (long)(0x8A75F0DCEBE7D37L ^ l10)), (long)4718196223105389438L, (long)l10)));
        while (true) {
            Hc hc2;
            if (Na.MC_1_16_5.H()) {
                block11: {
                    hc2 = Vy.J(n2);
                    try {
                        try {
                            if (!hc2.Y()) break block11;
                            if (n2 != 0) break;
                        }
                        catch (O_ o_2) {
                            throw fz.a(o_2);
                        }
                        ++n2;
                        continue;
                    }
                    catch (O_ o_3) {
                        throw fz.a(o_3);
                    }
                }
                SE.x(n2 + (String)((Object)fz.e("R", (int)fz.d("x", (int)16246, (long)(0x362766C1A5D1EB76L ^ l10)), (long)4718196223105389438L, (long)l10)) + ((Vy)hc2).j());
            } else {
                block12: {
                    hc2 = Vc.l(n2);
                    try {
                        try {
                            if (!hc2.Y()) break block12;
                            if (n2 != 0) break;
                        }
                        catch (O_ o_4) {
                            throw fz.a(o_4);
                        }
                        ++n2;
                        continue;
                    }
                    catch (O_ o_5) {
                        throw fz.a(o_5);
                    }
                }
                SE.x(n2 + (String)((Object)fz.e("R", (int)fz.d("x", (int)25605, (long)(0x7E7EBCCEB38AB037L ^ l10)), (long)4718196223105389438L, (long)l10)) + ((Vc)hc2).Y() + (String)((Object)fz.e("R", (int)fz.d("x", (int)30082, (long)(0x3529D3FC830AA18FL ^ l10)), (long)4718196223105389438L, (long)l10)) + H3.f(((Vc)hc2).Y(), new Object[0]));
            }
            ++n2;
        }
        SE.x((String)((Object)fz.e("R", (int)fz.d("x", (int)31743, (long)(0x43512CB6D6FAFD7L ^ l10)), (long)4718196223105389438L, (long)l10)));
    }

    private static int d(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x155F;
        if (fb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = eb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fz", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fz.fb[n3] = n4;
        }
        return fb[n3];
    }

    static void d(fz fz2) {
        fz2.J();
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void e(fz fz2) {
        fz2.Y();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static void lambda$new$11() {
        long l10 = ab ^ 0x3FD6A8A93F21L;
        try {
            if (YK.C.U() != Gn.ONLINE) {
                SE.h.c().L((String)((Object)fz.e("R", (int)fz.d("x", (int)22634, (long)(0xFEE3352DB4DD9C9L ^ l10)), (long)-7710920687682550023L, (long)l10)), (String)((Object)fz.e("R", (int)fz.d("x", (int)7662, (long)(0x2104DD4EAEC11C63L ^ l10)), (long)-7710920687682550023L, (long)l10)), 3000L);
                return;
            }
        }
        catch (O_ o_2) {
            throw fz.a(o_2);
        }
        I_.h().c().W(fz::lambda$null$9, fz::lambda$null$10);
    }

    @Override
    public void i() {
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = fz.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = fz.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void lambda$new$0() {
        long l10 = ab ^ 0x367658841418L;
        NI.V();
        SE.h.c().L((String)((Object)fz.e("R", (int)fz.d("x", (int)30786, (long)(0x186ADDA9933D2D0L ^ l10)), (long)-4628495498501313088L, (long)l10)), (String)((Object)fz.e("R", (int)fz.d("x", (int)19512, (long)(0x5F04623C40E966A4L ^ l10)), (long)-4628495498501313088L, (long)l10)), 3000L);
    }

    @Override
    public void u() {
    }

    private void J() {
        ArrayList<w6> arrayList = new ArrayList<w6>(Ao.K.S().Y());
        arrayList.removeIf(fz::lambda$sortGui$12);
        try {
            arrayList.sort(fz::lambda$sortGui$13);
            w6 w62 = null;
            for (w6 w63 : arrayList) {
                if (!(w63 instanceof fo)) continue;
                w62 = w63;
                break;
            }
            try {
                if (w62 != null) {
                    arrayList.remove(w62);
                    arrayList.add(0, w62);
                }
            }
            catch (Exception exception) {
                throw fz.a(exception);
            }
        }
        catch (Exception exception) {
            SE.W(exception);
        }
        double d2 = 32.0;
        double d3 = 32.0;
        double d4 = 0.0;
        for (w6 w64 : arrayList) {
            double d5;
            if (d2 + w64.w() > (double)EP.P().s()) {
                d2 = 30.0;
                d3 += d4 + 4.0;
                d4 = 0.0;
            }
            try {
                double d6 = d5 = w64.b() > w64.Q() ? w64.Q() : w64.b();
            }
            catch (Exception exception) {
                throw fz.a(exception);
            }
            if (d5 > d4) {
                d4 = d5;
            }
            w64.m(d2, d3);
            d2 += w64.w() + 2.0;
        }
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = fz.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void y() {
        long l10 = ab ^ 0x747DF9A70546L;
        this.a((String)((Object)fz.e("R", (int)fz.d("x", (int)12502, (long)(0x66040D9C4CB30B07L ^ l10)), (long)-5865369146699105122L, (long)l10)), new yE(this.zp.sW), new yE(SE.h.F().X), new yE(YK.C.c().N()), new yt(this, SE.h.F().P), new ye((String)((Object)fz.e("R", (int)fz.d("x", (int)7550, (long)(0x7F0BD5ABC9532698L ^ l10)), (long)-5865369146699105122L, (long)l10)), new eG(this)).g((String)((Object)fz.e("R", (int)fz.d("x", (int)2069, (long)(0x2200E016028933F9L ^ l10)), (long)-5865369146699105122L, (long)l10))));
        this.a((String)((Object)fz.e("R", (int)fz.d("x", (int)10646, (long)(0x519B469E45AA9249L ^ l10)), (long)-5865369146699105122L, (long)l10)), new b6(fz.M.S), new yE(this.zm.A), new yE(this.zm.x), new yE(this.zm.w), new yE(this.zm.s), new yd(this, this.zm.Y), new yZ(this, this.zm.T));
        this.a((String)((Object)fz.e("R", (int)fz.d("x", (int)31501, (long)(0x36307AE7B2FC40CCL ^ l10)), (long)-5865369146699105122L, (long)l10)), new y2(this.zm.n), new yE(this.zm.F), new yE(this.zm.R), new yE(this.zm.O), new yE(this.zm.X));
        this.a((String)((Object)fz.e("R", (int)fz.d("x", (int)25642, (long)(0x65C225659D93DFC3L ^ l10)), (long)-5865369146699105122L, (long)l10)), new yE(this.zp.sy), new yE(this.zp.L), new yE(this.zp.sJ), new yE(this.zp.sq), new bB(this.zp.T), new y2(SE.h.a().l), new y2(Ao.K.Z), new ye((String)((Object)fz.e("R", (int)fz.d("x", (int)13430, (long)(0x3FF8D23375C98FB5L ^ l10)), (long)-5865369146699105122L, (long)l10)), new sv(this)).g((String)((Object)fz.e("R", (int)fz.d("x", (int)32559, (long)(0x414DD69194EC4DBL ^ l10)), (long)-5865369146699105122L, (long)l10))), new ye((String)((Object)fz.e("R", (int)fz.d("x", (int)1086, (long)(0x6485645284903FDCL ^ l10)), (long)-5865369146699105122L, (long)l10)), new z0(this)).g((String)((Object)fz.e("R", (int)fz.d("x", (int)5003, (long)(0x1929D5CF6D8DA86AL ^ l10)), (long)-5865369146699105122L, (long)l10))));
        this.a((String)((Object)fz.e("R", (int)fz.d("x", (int)8746, (long)(0x27616EDCAD7D99C1L ^ l10)), (long)-5865369146699105122L, (long)l10)), new bB(this.zN.M), new yE(this.zN.G));
        Gw gw = SE.h.F();
        this.a((String)((Object)fz.e("R", (int)fz.d("x", (int)4150, (long)(0x7C2B972866452BE3L ^ l10)), (long)-5865369146699105122L, (long)l10)), new yE(gw.C), new yU(this, gw.K, gw), new yJ(this, gw.F, gw), new y6(this, gw.r, gw));
    }

    private static void lambda$null$9(T9 t92) {
        block3: {
            long l10;
            block2: {
                l10 = ab ^ 0x72A36EEAE357L;
                try {
                    if (t92.c() != Kx.SUCCESS) break block2;
                    SE.h.c().L((String)((Object)fz.e("R", (int)fz.d("x", (int)4564, (long)(0x8D2560D3FB04C20L ^ l10)), (long)5227275129032759951L, (long)l10)), (String)((Object)fz.e("R", (int)fz.d("x", (int)24466, (long)(0x2176FFD14255825EL ^ l10)), (long)5227275129032759951L, (long)l10)), 3000L);
                    break block3;
                }
                catch (O_ o_2) {
                    throw fz.a(o_2);
                }
            }
            SE.h.c().L((String)((Object)fz.e("R", (int)fz.d("x", (int)19134, (long)(0x5321162B4FF2176AL ^ l10)), (long)5227275129032759951L, (long)l10)), (String)((Object)fz.e("R", (int)fz.d("x", (int)30889, (long)(0x1E6DAAB9F928A577L ^ l10)), (long)5227275129032759951L, (long)l10)) + (Object)((Object)t92.c()), 3000L);
        }
    }

    public fz() {
        long l10 = ab ^ 0x305B394EE651L;
        this.zp = Ao.K;
        this.zm = SE.h.a();
        this.zN = SE.h.F();
        this.zK = new HashMap();
        this.Q(fz.M.a);
        this.d().m(false);
        this.d().f((String)((Object)fz.e("R", (int)fz.d("x", (int)11704, (long)(0x2EBCC5B58F50F56FL ^ l10)), (long)5588195214077419401L, (long)l10)));
        fW fW2 = Ao.D(fW.class);
        this.w(fW2.b());
        this.T(fW2.w());
        Cz cz2 = new Cz(this, (String)((Object)fz.e("R", (int)fz.d("x", (int)12662, (long)(0x142DBDEA469DE9B9L ^ l10)), (long)5588195214077419401L, (long)l10)));
        cz2.E(new cO(this));
        cz2.o(new BO(this));
        this.a(cz2);
        this.n(new bE(1.0, 2.0), new Object[0]);
        this.n(new b6(fz.M.S), new Object[0]);
        this.y();
        this.zt = new b9(this.zm.q);
        this.n(this.zt, new Object[0]);
        this.n(new ba((String)((Object)fz.e("R", (int)fz.d("x", (int)27211, (long)(0x5DDC4C5CB963280L ^ l10)), (long)5588195214077419401L, (long)l10)), this.zp.C()).g((String)((Object)fz.e("R", (int)fz.d("x", (int)259, (long)(0x771F48CCF636D9F3L ^ l10)), (long)5588195214077419401L, (long)l10))), new Object[0]);
        this.n(new b6(fz.M.W), new Object[0]);
        this.N(false);
        this.B(false, false);
    }

    private static void lambda$null$10() {
    }

    private void p(w6 w62) {
        boolean bl2;
        w6 w63;
        try {
            if (w62 == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw fz.a(o_2);
        }
        try {
            w63 = w62;
            bl2 = !w62.f();
        }
        catch (O_ o_3) {
            throw fz.a(o_3);
        }
        try {
            w63.r(bl2, false);
            if (w62.f()) {
                w62.R();
            }
        }
        catch (O_ o_4) {
            throw fz.a(o_4);
        }
        w62.b(this.G());
        w62.M(this.W());
        w62.A();
    }

    private static Method g(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    @Override
    public void S() {
        super.S();
    }

    public void O() {
        this.zt.q();
    }

    private void Y() {
        int n2 = 10;
        for (w6 w62 : Ao.J()) {
            try {
                if (w62 instanceof fW) {
                    w62.m(10.0, 20.0);
                    continue;
                }
            }
            catch (O_ o_2) {
                throw fz.a(o_2);
            }
            try {
                try {
                    if (!w62.m() || w62.N()) continue;
                }
                catch (O_ o_3) {
                    throw fz.a(o_3);
                }
                w62.m(Ao.D(fW.class).w() + 10.0, n2 += 22);
            }
            catch (O_ o_4) {
                throw fz.a(o_4);
            }
        }
        for (w6 w62 : Ao.J()) {
            if (w62.N()) continue;
            try {
                if (!w62.m()) {
                    continue;
                }
            }
            catch (O_ o_5) {
                throw fz.a(o_5);
            }
            w62.N(w62 instanceof fW);
        }
        Ao.i();
    }

    @Override
    public void o(boolean bl2) {
        long l10 = ab ^ 0x27E61916D23FL;
        super.o(bl2);
        this.w(238.0);
        F8.A(this.G(), this.W() + this.Q().b() + 2.0, this.w(), this.b() - (this.Q().b() + 8.0), fz.M.W);
        G5 g5 = SE.h.W().k(0.7, false);
        CallSite callSite = fz.e("R", (int)fz.d("x", (int)3580, (long)(0x4646F1030508616BL ^ l10)), (long)8782958589947374567L, (long)l10);
        double d2 = g5.D((String)((Object)callSite));
        g5.R((String)((Object)callSite), this.G() + this.w() - d2 - 4.0, this.W() + this.b() - 4.5, fz.M.w);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fz.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fz.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

