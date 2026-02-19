/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Ao;
import a.C_;
import a.Cb;
import a.I3;
import a.Io;
import a.N5;
import a.O_;
import a.SB;
import a.Sc;
import a.Yw;
import a.bE;
import a.bT;
import a.bU;
import a.bt;
import a.cB;
import a.d8;
import a.ep;
import a.fB;
import a.fE;
import a.fN;
import a.fP;
import a.fX;
import a.fr;
import a.hQ;
import a.hY;
import a.ht;
import a.jf;
import a.rp;
import a.sg;
import a.vM;
import a.v_;
import a.vp;
import a.w1;
import a.w6;
import a.wE;
import a.wr;
import a.y2;
import a.yC;
import a.yG;
import a.yQ;
import a.yV;
import a.ys;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class f5
extends w6 {
    private static final String[] rb;
    private static String[] mO;
    private static final Map lb;
    private static final long ab;
    private vp mZ;
    private final wE mu;
    private static final Integer[] fb;
    private w1 mc;
    private static final Object[] qb;
    private static final long[] eb;

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
                n4 = 43;
                break;
            }
            case 1: {
                n4 = 34;
                break;
            }
            case 2: {
                n4 = 53;
                break;
            }
            case 3: {
                n4 = 26;
                break;
            }
            case 4: {
                n4 = 2;
                break;
            }
            case 5: {
                n4 = 41;
                break;
            }
            case 6: {
                n4 = 21;
                break;
            }
            case 7: {
                n4 = 16;
                break;
            }
            case 8: {
                n4 = 38;
                break;
            }
            case 9: {
                n4 = 58;
                break;
            }
            case 10: {
                n4 = 29;
                break;
            }
            case 11: {
                n4 = 31;
                break;
            }
            case 12: {
                n4 = 56;
                break;
            }
            case 13: {
                n4 = 14;
                break;
            }
            case 14: {
                n4 = 49;
                break;
            }
            case 15: {
                n4 = 24;
                break;
            }
            case 16: {
                n4 = 25;
                break;
            }
            case 17: {
                n4 = 3;
                break;
            }
            case 18: {
                n4 = 20;
                break;
            }
            case 19: {
                n4 = 60;
                break;
            }
            case 20: {
                n4 = 50;
                break;
            }
            case 21: {
                n4 = 15;
                break;
            }
            case 22: {
                n4 = 4;
                break;
            }
            case 23: {
                n4 = 44;
                break;
            }
            case 24: {
                n4 = 46;
                break;
            }
            case 25: {
                n4 = 55;
                break;
            }
            case 26: {
                n4 = 8;
                break;
            }
            case 27: {
                n4 = 45;
                break;
            }
            case 28: {
                n4 = 19;
                break;
            }
            case 29: {
                n4 = 32;
                break;
            }
            case 30: {
                n4 = 0;
                break;
            }
            case 31: {
                n4 = 6;
                break;
            }
            case 32: {
                n4 = 13;
                break;
            }
            case 33: {
                n4 = 52;
                break;
            }
            case 34: {
                n4 = 57;
                break;
            }
            case 35: {
                n4 = 35;
                break;
            }
            case 36: {
                n4 = 28;
                break;
            }
            case 37: {
                n4 = 30;
                break;
            }
            case 38: {
                n4 = 11;
                break;
            }
            case 39: {
                n4 = 62;
                break;
            }
            case 40: {
                n4 = 37;
                break;
            }
            case 41: {
                n4 = 7;
                break;
            }
            case 42: {
                n4 = 36;
                break;
            }
            case 43: {
                n4 = 39;
                break;
            }
            case 44: {
                n4 = 22;
                break;
            }
            case 45: {
                n4 = 33;
                break;
            }
            case 46: {
                n4 = 17;
                break;
            }
            case 47: {
                n4 = 40;
                break;
            }
            case 48: {
                n4 = 54;
                break;
            }
            case 49: {
                n4 = 59;
                break;
            }
            case 50: {
                n4 = 48;
                break;
            }
            case 51: {
                n4 = 63;
                break;
            }
            case 52: {
                n4 = 42;
                break;
            }
            case 53: {
                n4 = 9;
                break;
            }
            case 54: {
                n4 = 51;
                break;
            }
            case 55: {
                n4 = 27;
                break;
            }
            case 56: {
                n4 = 1;
                break;
            }
            case 57: {
                n4 = 5;
                break;
            }
            case 58: {
                n4 = 12;
                break;
            }
            case 59: {
                n4 = 23;
                break;
            }
            case 60: {
                n4 = 18;
                break;
            }
            case 61: {
                n4 = 61;
                break;
            }
            case 62: {
                n4 = 47;
                break;
            }
            default: {
                n4 = 10;
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
        f5.rb[n5] = new String(cArray);
        return n5;
    }

    protected void i(ht ht2, Sc sc2, Yw yw2, @Nullable Runnable runnable) {
        this.e(ht2, yw2, arg_0 -> this.lambda$createItemFilterItemSelectorPopup$9(yw2, sc2, runnable, ht2, arg_0));
    }

    private void A(vp vp2) {
        this.K(vp2.n, vp2.H, vp2.A);
    }

    private static Field o(long l10, long l11) {
        int n2 = f5.m(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            String string = rb[n2];
            int n3 = string.indexOf(8);
            Class clazz = f5.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = f5.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = f5.g(clazz3, string2, clazz2)) != null) {
                    f5.qb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = f5.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        f5.qb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = f5.n(274253160813068L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void lambda$createSlotEditPopup$12(ys ys2, Yw yw2, AtomicReference atomicReference, ht ht2, Sc sc2) {
        try {
            if (ys2.q()) {
                yw2.A().r(null);
            }
        }
        catch (O_ o_2) {
            throw f5.a(o_2);
        }
        try {
            Ao.z((fB)atomicReference.get());
            this.i(ht2, sc2, yw2, null);
            if (ht2 instanceof fX) {
                ((fX)ht2).I();
            }
        }
        catch (O_ o_3) {
            throw f5.a(o_3);
        }
    }

    public f5() {
        long l10 = ab ^ 0xAB357FB049L;
        this.mu = new wE(358.0, 171.0);
        this.L(true);
        this.i(false);
        this.u(false);
        this.q(true);
        this.A(true);
        this.M();
        this.mu.M();
        this.mu.i(true);
        this.mu.Q(f5.M.W);
        yG yG2 = new yG(12.0, 12.0);
        yC yC2 = new yC((String)((Object)f5.e("\u00da", (int)f5.d("l", (int)9523, (long)(0x68595A31D5EBB101L ^ l10)), (long)-5181319501433607732L, (long)l10)), 8.0, 8.0, 10.0, 10.0, f5.M.w, f5.M.c, null);
        yG2.n(new wr(1.0, yC2), new Object[0]);
        yG2.i(false);
        this.mu.n(new bE(0.0, 0.0), new Object[0]);
        this.mu.n(yG2, f5.e("\u00da", (int)f5.d("l", (int)23795, (long)(0x6BBDD3278C5DC8C9L ^ l10)), (long)-5181319501433607732L, (long)l10));
        for (ht ht2 : this.mu.A()) {
            ht2.k(false);
        }
        wr wr2 = new wr(1.0, 3.0, 1.0, 1.0, this.mu);
        wr2.i(true);
        wr2.u(false);
        wr2.Q(f5.M.k);
        this.n(wr2, new Object[0]);
        yC2.a(new Color(0, 0, 0, 0), new Color(255, 255, 255, 25));
        yC2.Y(5.0f);
        yC2.u(true);
        yC2.w(true);
        yC2.N(this::X);
    }

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = f5.m(l10, l11);
            object = qb[n2];
            try {
                if (!(object instanceof String)) break block2;
                f5.qb[n2] = clazz = Class.forName(rb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public String A() {
        long l10 = ab ^ 0x7384DCAC4BC1L;
        return f5.e("\u00da", (int)f5.d("l", (int)27191, (long)(0x6351D6FB20210588L ^ l10)), (long)4868446664155533892L, (long)l10);
    }

    public static String[] c() {
        return mO;
    }

    private static int d(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x2C2E;
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
                throw new RuntimeException("a/f5", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            f5.fb[n3] = n4;
        }
        return fb[n3];
    }

    private void X() {
        Sc sc2 = this.mZ.H;
        try {
            if (sc2.B().trim().isEmpty()) {
                sc2.R();
            }
        }
        catch (O_ o_2) {
            throw f5.a(o_2);
        }
        Ao.K.T(Ao.F);
    }

    private void lambda$null$10(boolean bl2, Yw yw2, Sc sc2, AtomicReference atomicReference) {
        block4: {
            try {
                try {
                    if (bl2) break block4;
                    yw2.O();
                    if (!(yw2 instanceof v_)) break block4;
                }
                catch (O_ o_2) {
                    throw f5.a(o_2);
                }
                sc2.M((v_)yw2);
                this.A(this.mZ);
            }
            catch (O_ o_3) {
                throw f5.a(o_3);
            }
        }
        Ao.z((fB)atomicReference.get());
    }

    public static void J() {
        f5 f52 = Ao.D(f5.class);
        fP fP2 = Ao.D(fP.class);
        fP2.N(false);
        f52.N(true);
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = f5.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = f5.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = f5.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = f5.h(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/f5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = f5.d(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private void e(ht ht2, Yw yw2, Consumer<@Nullable N5<String, cB>> consumer) {
        AtomicReference<fE> atomicReference = new AtomicReference<fE>();
        yV yV2 = new yV(yw2, false, null, Collections.emptyList(), arg_0 -> this.lambda$createItemSelecterPopup$5(atomicReference, consumer, ht2, yw2, arg_0));
        fE fE2 = Ao.v(ht2, yV2, fE.class);
        atomicReference.set(fE2);
        fE2.Z(() -> f5.lambda$createItemSelecterPopup$6(consumer));
        fE2.P(false);
        fE2.u(false);
        fE2.r(this, fE2);
    }

    private void lambda$null$2(jf jf2, Sc sc2, Runnable runnable, fB fB2) {
        jf2.H(null);
        jf2.G(sc2);
        runnable.run();
        Ao.z(fB2);
        this.X();
    }

    private static void lambda$null$3(fB fB2) {
        Ao.z(fB2);
    }

    private void lambda$setManagedInventory$4(jf jf2, Sc sc2, Runnable runnable) {
        long l10 = ab ^ 0x82E99F61321L;
        C_ c_2 = new C_((String)((Object)f5.e("\u00da", (int)f5.d("l", (int)17116, (long)(0x4F7FD4203614F581L ^ l10)), (long)1977161429244398244L, (long)l10)), (String)((Object)f5.e("\u00da", (int)f5.d("l", (int)6629, (long)(0x5EB8A327E6E5AEB5L ^ l10)), (long)1977161429244398244L, (long)l10)), (String)((Object)f5.e("\u00da", (int)f5.d("l", (int)30064, (long)(0x3C8C542877C9423EL ^ l10)), (long)1977161429244398244L, (long)l10)));
        fr fr2 = Ao.v(this.V(), c_2, fr.class);
        fr2.u(false);
        fr2.l(new sg(this, fr2));
        c_2.Z().N(() -> this.lambda$null$2(jf2, sc2, runnable, fr2));
        c_2.u().N(() -> f5.lambda$null$3(fr2));
    }

    private static Method p(long l10, long l11) {
        int n2 = f5.m(l10, l11);
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
                clazz3 = f5.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = f5.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = f5.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        f5.qb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = f5.n(274253160813068L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = f5.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        f5.qb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = f5.n(274253160813068L, 0L);
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

    private static void lambda$createItemSelecterPopup$6(Consumer consumer) {
        consumer.accept(null);
    }

    public void t(ht ht2, Sc sc2, Yw yw2, boolean bl2) {
        AtomicReference<fE> atomicReference = new AtomicReference<fE>();
        ys ys2 = new ys(sc2, yw2, bl2);
        try {
            ys2.Y().C(() -> this.lambda$createSlotEditPopup$11(bl2, yw2, sc2, atomicReference));
            if (ys2.D() != null) {
                ys2.D().N(() -> this.lambda$createSlotEditPopup$12(ys2, yw2, atomicReference, ht2, sc2));
            }
        }
        catch (O_ o_2) {
            throw f5.a(o_2);
        }
        fE fE2 = Ao.v(ht2, ys2, fE.class);
        atomicReference.set(fE2);
        fE2.P(false);
        fE2.u(false);
        fE2.r(this, fE2);
    }

    private void lambda$createItemFilterItemSelectorPopup$9(Yw yw2, Sc sc2, Runnable runnable, ht ht2, N5 n5) {
        block14: {
            block13: {
                block12: {
                    try {
                        if (!(yw2 instanceof v_) || n5 != null) break block12;
                    }
                    catch (O_ o_2) {
                        throw f5.a(o_2);
                    }
                    v_ v_2 = (v_)yw2;
                    sc2.M(v_2);
                    this.mc.j(v_2);
                    break block14;
                }
                try {
                    yw2.A().r(n5);
                    yw2.T(yw2.Z());
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                catch (O_ o_3) {
                    throw f5.a(o_3);
                }
                try {
                    try {
                        if (n5 == null) break block13;
                        if (I3.v.w().equals(n5.t())) break block14;
                    }
                    catch (O_ o_4) {
                        throw f5.a(o_4);
                    }
                    this.t(ht2, sc2, yw2, true);
                    break block14;
                }
                catch (O_ o_5) {
                    throw f5.a(o_5);
                }
            }
            yw2.O();
        }
        try {
            if (ht2 instanceof fX) {
                ((fX)ht2).I();
            }
        }
        catch (O_ o_6) {
            throw f5.a(o_6);
        }
    }

    public static void o(Yw yw2, ep ep2, ep ep3, boolean bl2) {
        f5 f52 = Ao.D(f5.class);
        fP fP2 = Ao.D(fP.class);
        fP2.A(yw2, ep2, ep3, bl2, fP2.f());
        f52.N(false);
        fP2.N(true);
    }

    private static void lambda$createAnyItemItemPickerPopup$8(SB sB2, N5 n5) {
        String string;
        SB sB3;
        try {
            sB3 = sB2;
            string = n5.t() != null ? (String)n5.t() : ((cB)n5.a()).Z();
        }
        catch (O_ o_2) {
            throw f5.a(o_2);
        }
        rp rp2 = sB3.p(string);
        try {
            if (rp2 == null) {
                return;
            }
        }
        catch (O_ o_3) {
            throw f5.a(o_3);
        }
        sB2.m(rp2);
    }

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = "^_\u0001";
        objectArray[1] = Integer.TYPE;
        f5.rb[1] = "java/lang/Integer";
        objectArray[2] = "dR\\ro\u001ao]M=\u0012\u0002|ZDt";
        objectArray[3] = "\u0014XTZ[1\u001fWE\u0015:?\u0014\\AO";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u001b7`yqZ\u00134y\u000bb@*t{h1\u0003Qtt6\t\u0002S\u007fmaxG\u00111s\u000b";
    }

    private void lambda$setManagedInventory$1(vM vM2, fN fN2, Sc sc2) {
        block3: {
            block2: {
                try {
                    if (!vM2.A().T()) break block2;
                    this.i(fN2, sc2, vM2, null);
                    break block3;
                }
                catch (O_ o_2) {
                    throw f5.a(o_2);
                }
            }
            this.t(fN2, sc2, vM2, false);
        }
    }

    private void V(ht ht2, Yw yw2) {
        SB sB2 = new SB();
        ep ep2 = new ep(yw2 instanceof v_);
        ep2.B(Io.Y().C(sB2).X());
        yV yV2 = new yV(yw2, true, null, Collections.emptyList(), arg_0 -> f5.lambda$createAnyItemItemPickerPopup$7(sB2, yw2, ep2, arg_0));
        yV2.G(arg_0 -> f5.lambda$createAnyItemItemPickerPopup$8(sB2, arg_0));
        fE fE2 = Ao.v(ht2, yV2, fE.class);
        fE2.P(false);
        fE2.u(false);
        fE2.r(this, fE2);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'x' || c10 == '\u00dc' || c10 == 'O' || c10 == '\u00eb') {
                field = f5.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'x' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00dc' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'O' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = f5.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00d4' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00da' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void K(jf jf2, Sc sc2, Runnable runnable) {
        Object object;
        long l10 = ab ^ 0x7F06139BF264L;
        this.mZ = new vp(jf2, sc2, runnable);
        this.mu.k();
        yG yG2 = new yG(this.mu.w() - 10.0, 80.0);
        yG2.d().f((String)((Object)f5.e("\u00da", (int)f5.d("l", (int)17137, (long)(0x6FC7B208E0F294F8L ^ l10)), (long)-417358187132703775L, (long)l10)));
        yG2.i(false);
        yG2.b(false);
        this.mu.n(new bE(5.0, 2.0), new Object[0]);
        this.mu.n(yG2, f5.e("\u00da", (int)f5.d("l", (int)18178, (long)(0x61053B7EDE96111FL ^ l10)), (long)-417358187132703775L, (long)l10));
        ht ht2 = new bT((String)((Object)f5.e("\u00da", (int)f5.d("l", (int)6485, (long)(0x28D759138DD8CF41L ^ l10)), (long)-417358187132703775L, (long)l10)));
        ((Cb)ht2).n(1.0f);
        ((Cb)ht2).a(true);
        ((Cb)ht2).g(f5.M.w);
        ((Cb)ht2).y(sc2.B());
        ht2.h((arg_0, arg_1) -> f5.lambda$setManagedInventory$0(sc2, (bT)ht2, arg_0, arg_1));
        yG2.n(ht2, new Object[0]);
        yG2.n(new bE(0.0, 3.0), new Object[0]);
        yG2.n(new bE(5.0, 0.0), f5.e("\u00da", (int)f5.d("l", (int)29400, (long)(0x7E5B2FE14FFEA4C6L ^ l10)), (long)-417358187132703775L, (long)l10));
        ht ht3 = new bt((String)((Object)f5.e("\u00da", (int)f5.d("l", (int)3392, (long)(0x381E3B3613EEDB4AL ^ l10)), (long)-417358187132703775L, (long)l10)), 0.7);
        ((bt)ht3).q(true);
        yG2.n(ht3, new Object[0]);
        yG2.n(new bE(0.0, 5.0), new Object[0]);
        yG yG3 = new yG(this.mu.w() - 5.0, 34.0);
        yG3.d().f((String)((Object)f5.e("\u00da", (int)f5.d("l", (int)3810, (long)(0x6590FD26A7B2D8FEL ^ l10)), (long)-417358187132703775L, (long)l10)));
        yG3.i(false);
        yG3.Q(Color.MAGENTA);
        yG2.n(new bE(5.0, 0.0), f5.e("\u00da", (int)f5.d("l", (int)29764, (long)(0x15F8A4756547A257L ^ l10)), (long)-417358187132703775L, (long)l10));
        yG2.n(yG3, new Object[0]);
        for (int i10 = 0; i10 < 9; ++i10) {
            object = sc2.e(i10);
            fN fN2 = new fN(sc2, (vM)object);
            fN2.G(() -> this.lambda$setManagedInventory$1((vM)object, fN2, sc2));
            yG3.n(new wr(1.0, 1.0, 2.0, 0.0, fN2), new Object[0]);
        }
        this.mu.n(new bE(1.0, 0.0), new Object[0]);
        this.mu.n(new bU(this.w() - 4.0, 1.0, new Color(255, 255, 255, 13)), f5.e("\u00da", (int)f5.d("l", (int)28790, (long)(0x2CE2811028DEA66DL ^ l10)), (long)-417358187132703775L, (long)l10));
        ht2 = new wE(this.mu.w(), 55.0);
        ht2.i(true);
        ((yQ)ht2).Q(f5.M.a);
        this.mu.n(ht2, f5.e("\u00da", (int)f5.d("l", (int)26713, (long)(0x20DA60D32A43E4BL ^ l10)), (long)-417358187132703775L, (long)l10));
        ht3 = new wE(this.mu.w() - 10.0, 45.0);
        ((yQ)ht3).d().f((String)((Object)f5.e("\u00da", (int)f5.d("l", (int)13291, (long)(0x4AC6B6D218A065FBL ^ l10)), (long)-417358187132703775L, (long)l10)));
        ht3.i(false);
        ((yQ)ht2).n(new bE(5.0, 2.0), new Object[0]);
        ((yQ)ht2).n(ht3, f5.e("\u00da", (int)f5.d("l", (int)21854, (long)(0x41E0D8DFE2680348L ^ l10)), (long)-417358187132703775L, (long)l10));
        ((yQ)ht3).n(new bE(0.0, 5.0), new Object[0]);
        ((yQ)ht3).n(new bE(5.0, 0.0), f5.e("\u00da", (int)f5.d("l", (int)16377, (long)(0x482ED9B5DBE7E9E8L ^ l10)), (long)-417358187132703775L, (long)l10));
        this.mc = new w1(this, (yQ)ht3, sc2);
        ((yQ)ht3).n(this.mc, new Object[0]);
        yG3 = new yG(this.mu.w() - 10.0, 16.0);
        yG3.i(false);
        this.mu.n(new wr(3.0, 3.0, 10.0, 5.0, yG3), f5.e("\u00da", (int)f5.d("l", (int)3380, (long)(0x1B4D888AD7E25B2DL ^ l10)), (long)-417358187132703775L, (long)l10));
        y2 y22 = new y2(sc2.G);
        y22.Z(true);
        y22.Z(0.0);
        yG3.n(y22, new Object[0]);
        object = new hY((String)((Object)f5.e("\u00da", (int)f5.d("l", (int)23928, (long)(0x3ED819BB6F768B70L ^ l10)), (long)-417358187132703775L, (long)l10)), 0.8);
        ((hY)object).f(true);
        ((hY)object).c(f5.M.O);
        ((ht)object).w(12.0);
        ((ht)object).T(65.0);
        ((hQ)object).N(() -> this.lambda$setManagedInventory$4(jf2, sc2, runnable));
        yG3.n(new wr(6.0, 0.0, 170.0, 0.0, (ht)object), new Object[0]);
        this.h(true);
    }

    private static void lambda$setManagedInventory$0(Sc sc2, bT bT2, char c10, int n2) {
        sc2.F(bT2.a().trim());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                f5.ab = d8.a(6150100818964553229L, 2775240394152366320L, MethodHandles.lookup().lookupClass()).a(212698970432043L);
                f5.qb = new Object[5];
                f5.rb = new String[5];
                f5.T();
                f5.lb = new HashMap<K, V>(13);
                f5.N(new String[3]);
                var0 = f5.ab ^ 59020788894875L;
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
                var8_3 = new long[20];
                var5_4 = 0;
                var6_5 = "\u00f5\u00db\u001d\u009a\u001d\u00a4\u0094-\u00cc\u00eb{9+\u001aKg\u0002\u00ce\u00d1\u0082\u00a5}(\u0096\u00b7\u0088\u0080L\u009a\u00fa nw\u00de&\u00e5\u00ea\u009c_vh\b)\u00fc\u00b23^\u00e4\u00c8\u00ecG\u00cd\u0015\u0007\u00e2\u00f1\u0087G\u00c6,\u00a8B\u00fc\u00b1\u00c3\u00dc9*\u00a0\u00c0\u008d7i\u0019\u00beI\u00a0F\u00ce\u00a1\u00cf\u0001{\u00c5\u0011u\u00d1hQ(\u00e4q\u00a3\u0019~\u00dcs\u00ae\u00d8\t,R4\u00ef\u0016z\u0097\u00d0W\u00f17\u0084)SqIpJ7j\u0014\u00bf\u0093\u0086\u00d2\u00a9d\u0084\u0002\u0081\u00b3\b=\u00fd\u00e1OT\u00fe84\u0013g[\u0005";
                var7_6 = "\u00f5\u00db\u001d\u009a\u001d\u00a4\u0094-\u00cc\u00eb{9+\u001aKg\u0002\u00ce\u00d1\u0082\u00a5}(\u0096\u00b7\u0088\u0080L\u009a\u00fa nw\u00de&\u00e5\u00ea\u009c_vh\b)\u00fc\u00b23^\u00e4\u00c8\u00ecG\u00cd\u0015\u0007\u00e2\u00f1\u0087G\u00c6,\u00a8B\u00fc\u00b1\u00c3\u00dc9*\u00a0\u00c0\u008d7i\u0019\u00beI\u00a0F\u00ce\u00a1\u00cf\u0001{\u00c5\u0011u\u00d1hQ(\u00e4q\u00a3\u0019~\u00dcs\u00ae\u00d8\t,R4\u00ef\u0016z\u0097\u00d0W\u00f17\u0084)SqIpJ7j\u0014\u00bf\u0093\u0086\u00d2\u00a9d\u0084\u0002\u0081\u00b3\b=\u00fd\u00e1OT\u00fe84\u0013g[\u0005".length();
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
                    var6_5 = "\u001d\u0089\u008b\u00d6\u00ac[\u00e4\u000e\u0004\u00c0/\u00c4\u00a9\u0001v\u00ac";
                    var7_6 = "\u001d\u0089\u008b\u00d6\u00ac[\u00e4\u000e\u0004\u00c0/\u00c4\u00a9\u0001v\u00ac".length();
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
        f5.eb = var8_3;
        f5.fb = new Integer[20];
    }

    private void lambda$createSlotEditPopup$11(boolean bl2, Yw yw2, Sc sc2, AtomicReference atomicReference) {
        Ao.st.execute(() -> this.lambda$null$10(bl2, yw2, sc2, atomicReference));
    }

    public static void N(String[] stringArray) {
        mO = stringArray;
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

    private void lambda$createItemSelecterPopup$5(AtomicReference atomicReference, Consumer consumer, ht ht2, Yw yw2, N5 n5) {
        block4: {
            try {
                try {
                    Ao.z((fB)atomicReference.get());
                    consumer.accept(n5);
                    if (n5 == null || !I3.v.w().equals(n5.t())) break block4;
                }
                catch (O_ o_2) {
                    throw f5.a(o_2);
                }
                this.V(ht2, yw2);
            }
            catch (O_ o_3) {
                throw f5.a(o_3);
            }
        }
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/f5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void lambda$createAnyItemItemPickerPopup$7(SB sB2, Yw yw2, ep ep2, N5 n5) {
        try {
            if (sB2.c().isEmpty()) {
                yw2.e(ep2);
            }
        }
        catch (O_ o_2) {
            throw f5.a(o_2);
        }
        sB2.x(n5);
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = f5.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f5.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(f5.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

