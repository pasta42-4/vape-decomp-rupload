/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Ao;
import a.BY;
import a.BZ;
import a.Cm;
import a.FS;
import a.G4;
import a.Gn;
import a.HM;
import a.JU;
import a.M;
import a.O5;
import a.OT;
import a.OY;
import a.O_;
import a.RH;
import a.Rh;
import a.Ry;
import a.SE;
import a.YK;
import a.Z3;
import a._5;
import a._b;
import a.bE;
import a.bJ;
import a.bU;
import a.bt;
import a.cz;
import a.d8;
import a.f9;
import a.fB;
import a.hQ;
import a.hr;
import a.ht;
import a.hy;
import a.is;
import a.sM;
import a.w6;
import a.wS;
import a.wY;
import a.wb;
import a.wk;
import a.wr;
import a.yB;
import a.yC;
import a.yG;
import a.yL;
import a.yQ;
import a.yR;
import a.yb;
import a.yk;
import a.yq;
import a.zy;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
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
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class f1
extends w6
implements sM {
    private static final long ab;
    private yk _J;
    private yG _v;
    private static final Map lb;
    private boolean _D;
    static final boolean _j;
    private wb _k;
    private cz _Y;
    private boolean _d;
    @Nullable
    private fB _m;
    private static final Integer[] fb;
    private boolean _C;
    private yG _q;
    private static final Object[] qb;
    private static final long[] eb;
    private static final String[] rb;
    private boolean _I;
    private wr _R;
    private String _K;

    private void lambda$addCenteredOverlay$10(AtomicReference atomicReference) {
        f9 f92 = (f9)atomicReference.get();
        try {
            if (f92 != null) {
                this.Z(f92);
            }
        }
        catch (O_ o_2) {
            throw f1.a(o_2);
        }
    }

    private static void lambda$openWithPublicListing$16(f1 f12) {
        f12.q((Ry)null);
    }

    private static Field o(long l10, long l11) {
        int n2 = f1.m(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            String string = rb[n2];
            int n3 = string.indexOf(8);
            Class clazz = f1.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = f1.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = f1.g(clazz3, string2, clazz2)) != null) {
                    f1.qb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = f1.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        f1.qb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = f1.n(213056277254577L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = f1.d(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static void lambda$openWithEditor$20(f1 f12) {
    }

    public void u(fB fB2) {
        long l10 = ab ^ 0x787CCEB9C4D5L;
        SE.x((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)25866, (long)(0x61404E73ABF8C312L ^ l10)), (long)-8967407300414315366L, (long)l10)) + fB2 + (String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)1072, (long)(0x5E93384AACF2223CL ^ l10)), (long)-8967407300414315366L, (long)l10)));
        fB fB3 = this._m;
    }

    @OY
    public void C(JU jU2) {
        Ao.st.execute(() -> this.lambda$onPublicProfileDelete$14(jU2));
    }

    public f9 d(@Nullable w6 w62, ht ht2) {
        w6 w63;
        AtomicReference<f9> atomicReference = new AtomicReference<f9>();
        try {
            w63 = w62 != null ? w62 : this;
        }
        catch (O_ o_2) {
            throw f1.a(o_2);
        }
        w6 w64 = w63;
        f9 f92 = Ao.v(w64, this.M(ht2, () -> this.lambda$addCenteredOverlay$10(atomicReference)), f9.class);
        atomicReference.set(f92);
        f92.b((int)((w64.w() - ht2.w()) / 2.0));
        f92.H((int)((w64.b() - ht2.b()) / 2.0));
        this.u(f92);
        return f92;
    }

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = f1.m(l10, l11);
            object = qb[n2];
            try {
                if (!(object instanceof String)) break block2;
                f1.qb[n2] = clazz = Class.forName(rb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static void w(@Nullable Consumer<f1> consumer) {
        f1 f12 = Ao.D(f1.class);
        try {
            f12.r(true, false);
            Ao.K.T(Ao.w);
            if (consumer != null) {
                consumer.accept(f12);
            }
        }
        catch (O_ o_2) {
            throw f1.a(o_2);
        }
    }

    private static void lambda$createCenteredOverlayNode$11(Runnable runnable) {
        runnable.run();
    }

    static void A(f1 f12, fB fB2) {
        f12.Z(fB2);
    }

    private void lambda$null$3() {
        this._J.I();
    }

    private static void lambda$openWithEditor$22(yL yL2, f1 f12, zy zy2, Throwable throwable) {
        block13: {
            long l10 = ab ^ 0x6A0F721B1CE3L;
            try {
                if (yL2.K().isCancelled()) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw f1.a(o_2);
            }
            try {
                yL2.X(null);
                if (throwable != null) {
                    SE.W(throwable);
                    f12.Z(yL2.z());
                    return;
                }
            }
            catch (O_ o_3) {
                throw f1.a(o_3);
            }
            try {
                if (!zy2.b()) {
                    SE.x((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)22590, (long)(0x50F628004186261BL ^ l10)), (long)6609961411276553388L, (long)l10)) + zy2.A());
                    O5.q((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)9974, (long)(0x74411EF74CA458C7L ^ l10)), (long)6609961411276553388L, (long)l10)) + zy2.A());
                    f12.Z(yL2.z());
                    return;
                }
            }
            catch (O_ o_4) {
                throw f1.a(o_4);
            }
            try {
                try {
                    if (_j || zy2.h() != null) break block13;
                }
                catch (O_ o_5) {
                    throw f1.a(o_5);
                }
                throw new AssertionError();
            }
            catch (O_ o_6) {
                throw f1.a(o_6);
            }
        }
        f12.Y((Ry)zy2.h());
    }

    @Nullable
    public static CompletableFuture<?> R(boolean bl2, long l10) {
        block4: {
            block5: {
                try {
                    try {
                        if (!bl2) break block4;
                        if (YK.C.U().equals((Object)Gn.ONLINE)) break block5;
                    }
                    catch (O_ o_2) {
                        throw f1.a(o_2);
                    }
                    f1.w(f1::lambda$openWithEditor$20);
                    return null;
                }
                catch (O_ o_3) {
                    throw f1.a(o_3);
                }
            }
            f1.w(f1::lambda$openWithEditor$21);
        }
        f1 f12 = Ao.D(f1.class);
        yL yL2 = f12.Y(null);
        yL2.X((CompletableFuture<?>)((CompletableFuture)_b.S().M().d(l10).whenCompleteAsync((arg_0, arg_1) -> f1.lambda$openWithEditor$22(yL2, f12, arg_0, arg_1), (Executor)Ao.st)).exceptionally(f1::lambda$openWithEditor$23));
        return yL2.K();
    }

    private void lambda$createLeftContainer$2(hr hr2) {
        this.J(hr2);
    }

    public static void T() {
        f1.w(null);
    }

    public void J(hr hr2) {
        f9 f92 = this.W(null, new wY(this));
        f92.b((int)(hr2.G() - this.G()) + 45);
        f92.H((int)(hr2.W() - this.W()) + 5);
    }

    @Override
    public void F() {
        fB fB2 = this._m;
        try {
            if (fB2 != null) {
                this.R(fB2);
                this._m = null;
            }
        }
        catch (O_ o_2) {
            throw f1.a(o_2);
        }
    }

    public yk D() {
        return this._J;
    }

    private void lambda$onPublicProfileDelete$14(JU jU2) {
        ArrayList<ht> arrayList = new ArrayList<ht>();
        for (ht ht2 : this._q.A()) {
            try {
                if (!(ht2 instanceof wr)) {
                    continue;
                }
            }
            catch (O_ o_2) {
                throw f1.a(o_2);
            }
            wr wr2 = (wr)ht2;
            yR yR2 = wr2.w(yR.class);
            try {
                if (yR2 == null) {
                    continue;
                }
            }
            catch (O_ o_3) {
                throw f1.a(o_3);
            }
            try {
                if (yR2.U().H() != jU2.getProfile().H()) continue;
                arrayList.add(ht2);
            }
            catch (O_ o_4) {
                throw f1.a(o_4);
            }
        }
        try {
            if (arrayList.isEmpty()) {
                return;
            }
        }
        catch (O_ o_5) {
            throw f1.a(o_5);
        }
        for (ht ht2 : arrayList) {
            this._q.J(ht2);
        }
        SE.h.o().E();
    }

    @Override
    public void d() {
        block14: {
            block13: {
                block12: {
                    try {
                        try {
                            if (YK.C.U().equals((Object)Gn.ONLINE) || this._d) break block12;
                        }
                        catch (O_ o_2) {
                            throw f1.a(o_2);
                        }
                        this.I();
                        break block13;
                    }
                    catch (O_ o_3) {
                        throw f1.a(o_3);
                    }
                }
                try {
                    try {
                        if (!YK.C.U().equals((Object)Gn.ONLINE) || !this._d) break block13;
                    }
                    catch (O_ o_4) {
                        throw f1.a(o_4);
                    }
                    this._I = false;
                }
                catch (O_ o_5) {
                    throw f1.a(o_5);
                }
            }
            fB fB2 = this._m;
            try {
                try {
                    if (fB2 == null || !fB2.f()) break block14;
                }
                catch (O_ o_6) {
                    throw f1.a(o_6);
                }
                fB2.c();
            }
            catch (O_ o_7) {
                throw f1.a(o_7);
            }
        }
    }

    public yb q(@Nullable Ry ry2) {
        Object object;
        Gson gson;
        BZ bZ2;
        OT oT2;
        OT oT3;
        Object v02;
        long l10 = ab ^ 0xC73F5ECC410L;
        if (ry2 == null) {
            yb yb2 = new yb(this, null, null);
            yb2.x(this.g(null, yb2));
            return yb2;
        }
        try {
            v02 = ry2.z() != null ? ry2.z().getOrDefault(f1.e("\u00d1", (int)f1.d("s", (int)13686, (long)(0x455820D6066513A1L ^ l10)), (long)-8986886200776563617L, (long)l10), null) : null;
        }
        catch (O_ o_2) {
            throw f1.a(o_2);
        }
        Object var5_5 = v02;
        try {
            OT oT4;
            oT3 = oT4;
            oT2 = oT4;
            bZ2 = null;
            gson = BY.q;
            object = var5_5 != null ? BY.q.toJson(var5_5) : f1.e("\u00d1", (int)f1.d("s", (int)29620, (long)(0x22E477C267BDD56CL ^ l10)), (long)-8986886200776563617L, (long)l10);
        }
        catch (O_ o_3) {
            throw f1.a(o_3);
        }
        oT3(bZ2, (JsonArray)gson.fromJson((String)object, JsonArray.class));
        OT oT5 = oT2;
        yb yb3 = new yb(this, ry2, oT5);
        yb3.x(this.g(null, yb3));
        return yb3;
    }

    public f1() {
        long l10 = ab ^ 0x5683C73E75B6L;
        this._C = true;
        this._Y = cz.RATED;
        this._K = "";
        this.b(200.0);
        this.M(200.0);
        this.d().m(false);
        this.d().o(false);
        this.d().i(false);
        this.d().y(false);
        this.d().f((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)18369, (long)(0x677C7BEC0CFD50B4L ^ l10)), (long)3669994361401693689L, (long)l10)));
        this.a(new Cm(this, this, (String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)24623, (long)(0x3B80EC1B9362F756L ^ l10)), (long)3669994361401693689L, (long)l10)), (String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)7235, (long)(0x54D78F5D8E148B2AL ^ l10)), (long)3669994361401693689L, (long)l10)), 0.5).Y(f1::lambda$new$0));
        this.v();
        this.g(false);
        this.N(true);
        this.B(false, true);
        this.L(true);
        Z3.s().A(this, new Predicate[0]);
    }

    private void lambda$onPublicProfileCreate$13(HM hM2) {
        this.G(hM2.getProfile());
        SE.h.o().E();
    }

    @Override
    public String A() {
        long l10 = ab ^ 0xB6A5F3404C8L;
        return f1.e("\u00d1", (int)f1.d("s", (int)6832, (long)(0x4ACDCC44B64AFCB2L ^ l10)), (long)4868441245485278343L, (long)l10);
    }

    @Nullable
    public static CompletableFuture<?> L(long l10) {
        try {
            if (!YK.C.U().equals((Object)Gn.ONLINE)) {
                f1.w(f1::lambda$openWithPublicListing$15);
                return null;
            }
        }
        catch (O_ o_2) {
            throw f1.a(o_2);
        }
        f1.w(f1::lambda$openWithPublicListing$16);
        return ((CompletableFuture)_b.S().M().d(l10).whenCompleteAsync(f1::lambda$openWithPublicListing$18, (Executor)Ao.st)).exceptionally(f1::lambda$openWithPublicListing$19);
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
                n4 = 12;
                break;
            }
            case 1: {
                n4 = 43;
                break;
            }
            case 2: {
                n4 = 13;
                break;
            }
            case 3: {
                n4 = 2;
                break;
            }
            case 4: {
                n4 = 47;
                break;
            }
            case 5: {
                n4 = 24;
                break;
            }
            case 6: {
                n4 = 1;
                break;
            }
            case 7: {
                n4 = 54;
                break;
            }
            case 8: {
                n4 = 32;
                break;
            }
            case 9: {
                n4 = 46;
                break;
            }
            case 10: {
                n4 = 38;
                break;
            }
            case 11: {
                n4 = 10;
                break;
            }
            case 12: {
                n4 = 6;
                break;
            }
            case 13: {
                n4 = 36;
                break;
            }
            case 14: {
                n4 = 57;
                break;
            }
            case 15: {
                n4 = 23;
                break;
            }
            case 16: {
                n4 = 14;
                break;
            }
            case 17: {
                n4 = 63;
                break;
            }
            case 18: {
                n4 = 20;
                break;
            }
            case 19: {
                n4 = 53;
                break;
            }
            case 20: {
                n4 = 35;
                break;
            }
            case 21: {
                n4 = 9;
                break;
            }
            case 22: {
                n4 = 62;
                break;
            }
            case 23: {
                n4 = 17;
                break;
            }
            case 24: {
                n4 = 7;
                break;
            }
            case 25: {
                n4 = 28;
                break;
            }
            case 26: {
                n4 = 4;
                break;
            }
            case 27: {
                n4 = 22;
                break;
            }
            case 28: {
                n4 = 5;
                break;
            }
            case 29: {
                n4 = 40;
                break;
            }
            case 30: {
                n4 = 41;
                break;
            }
            case 31: {
                n4 = 21;
                break;
            }
            case 32: {
                n4 = 31;
                break;
            }
            case 33: {
                n4 = 19;
                break;
            }
            case 34: {
                n4 = 55;
                break;
            }
            case 35: {
                n4 = 18;
                break;
            }
            case 36: {
                n4 = 26;
                break;
            }
            case 37: {
                n4 = 49;
                break;
            }
            case 38: {
                n4 = 34;
                break;
            }
            case 39: {
                n4 = 33;
                break;
            }
            case 40: {
                n4 = 30;
                break;
            }
            case 41: {
                n4 = 11;
                break;
            }
            case 42: {
                n4 = 16;
                break;
            }
            case 43: {
                n4 = 56;
                break;
            }
            case 44: {
                n4 = 58;
                break;
            }
            case 45: {
                n4 = 45;
                break;
            }
            case 46: {
                n4 = 60;
                break;
            }
            case 47: {
                n4 = 44;
                break;
            }
            case 48: {
                n4 = 59;
                break;
            }
            case 49: {
                n4 = 48;
                break;
            }
            case 50: {
                n4 = 37;
                break;
            }
            case 51: {
                n4 = 0;
                break;
            }
            case 52: {
                n4 = 27;
                break;
            }
            case 53: {
                n4 = 8;
                break;
            }
            case 54: {
                n4 = 61;
                break;
            }
            case 55: {
                n4 = 25;
                break;
            }
            case 56: {
                n4 = 42;
                break;
            }
            case 57: {
                n4 = 52;
                break;
            }
            case 58: {
                n4 = 15;
                break;
            }
            case 59: {
                n4 = 3;
                break;
            }
            case 60: {
                n4 = 50;
                break;
            }
            case 61: {
                n4 = 39;
                break;
            }
            case 62: {
                n4 = 51;
                break;
            }
            default: {
                n4 = 29;
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
        f1.rb[n5] = new String(cArray);
        return n5;
    }

    private static int d(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x2590;
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
                throw new RuntimeException("a/f1", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            f1.fb[n3] = n4;
        }
        return fb[n3];
    }

    public void j(@Nullable fB fB2) {
        fB fB3 = this._m;
        try {
            if (fB3 != null) {
                this.Z(fB3);
                this.F();
                this.A();
            }
        }
        catch (O_ o_2) {
            throw f1.a(o_2);
        }
        this._m = fB2;
    }

    private static void X() {
        Object[] objectArray = qb;
        qb[0] = "\u0013*X";
        objectArray[1] = Integer.TYPE;
        f1.rb[1] = "java/lang/Integer";
        objectArray[2] = "3\u0013\u0005\"n$8\u001c\u0014m\u0013<+\u001b\u001d$";
        objectArray[3] = "\u0017DtHF\u001a\u001cKe\u0007'\u0014\u0017@a]";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "R&?b\"\"\u0001=7\u0012.f1}l,ur\u0001.cv\u007f\u001d\b /(,![x(#E";
    }

    private void Z(fB fB2) {
        yG yG2 = fB2.o(yG.class);
        if (yG2 != null) {
            for (ht ht2 : yG2.A()) {
                yQ yQ2;
                if (ht2 instanceof yG) {
                    yQ2 = (yG)ht2;
                    for (ht ht3 : yQ2.A()) {
                        yQ yQ3;
                        if (ht3 instanceof yq) {
                            yQ3 = (yq)ht3;
                            ((yq)yQ3).T();
                        }
                        if (!(ht3 instanceof wk)) continue;
                        yQ3 = (wk)ht3;
                        ((wk)yQ3).y();
                    }
                }
                if (ht2 instanceof yq) {
                    yQ2 = (yq)ht2;
                    ((yq)yQ2).T();
                }
                if (!(ht2 instanceof wk)) continue;
                yQ2 = (wk)ht2;
                ((wk)yQ2).y();
            }
        }
        try {
            Ao.z(fB2);
            if (this._m == fB2) {
                this._m = null;
            }
        }
        catch (O_ o_2) {
            throw f1.a(o_2);
        }
    }

    @Nullable
    public fB Z() {
        return this._m;
    }

    private List lambda$null$7(Function function, zy zy2) {
        block8: {
            try {
                if (!zy2.b()) {
                    return null;
                }
            }
            catch (O_ o_2) {
                throw f1.a(o_2);
            }
            try {
                try {
                    if (_j || zy2.h() != null) break block8;
                }
                catch (O_ o_3) {
                    throw f1.a(o_3);
                }
                throw new AssertionError();
            }
            catch (O_ o_4) {
                throw f1.a(o_4);
            }
        }
        this._J.Z((FS)zy2.h());
        List list = ((FS)zy2.h()).v();
        ArrayList<wr> arrayList = new ArrayList<wr>();
        for (_5 _52 : list) {
            wr wr2 = (wr)function.apply(_52);
            arrayList.add(wr2);
            SE.h.u().M(_52);
            Rh rh2 = wr2.w(Rh.class);
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            rh2.l(new is(this, atomicBoolean, _52));
        }
        return arrayList;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = f1.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = f1.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
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

    public String r() {
        return this._K;
    }

    @OY
    public void j(HM hM2) {
        Ao.st.execute(() -> this.lambda$onPublicProfileCreate$13(hM2));
    }

    private void lambda$createRightContainer$4() {
        Ao.st.execute(this::lambda$null$3);
    }

    private void R(yG yG2) {
        CallSite callSite;
        yC yC2;
        yC yC3;
        ht ht2;
        double d2;
        yG yG3;
        yG yG4;
        long l10 = ab ^ 0x48BB6189A1D7L;
        try {
            yG yG5;
            yG4 = yG5;
            yG3 = yG5;
            d2 = this._C ? 92.0 : 8.0;
        }
        catch (O_ o_2) {
            throw f1.a(o_2);
        }
        yG4(d2, yG2.b());
        yG yG6 = yG3;
        this._R = new wr(4.0, 4.0, 6.0, 6.0, yG6);
        yG2.n(this._R, new Object[0]);
        yG6.d().f((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)3913, (long)(0x2B6F1369BB1A4C4DL ^ l10)), (long)-1833125207775182440L, (long)l10)));
        yG yG7 = new yG(yG6.w(), 12.0);
        if (this._C) {
            ht2 = new bt((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)17291, (long)(0x38A9A84AEDEA8097L ^ l10)), (long)-1833125207775182440L, (long)l10)));
            ((bt)ht2).q(true);
            ((bt)ht2).B(f1.M.w);
            ((bt)ht2).p(0.7);
            ((bt)ht2).S(0.0f);
            ((bt)ht2).j(-2.0f);
            yG7.Y(false);
            yG7.n(ht2, new Object[0]);
        }
        try {
            yC yC4;
            yC3 = yC4;
            yC2 = yC4;
            callSite = this._C ? f1.e("\u00d1", (int)f1.d("s", (int)7275, (long)(0x55BD62A0229D5F75L ^ l10)), (long)-1833125207775182440L, (long)l10) : f1.e("\u00d1", (int)f1.d("s", (int)14063, (long)(0x58AC13219230F5E5L ^ l10)), (long)-1833125207775182440L, (long)l10);
        }
        catch (O_ o_3) {
            throw f1.a(o_3);
        }
        yC3((String)((Object)callSite), 5.0, 4.0, 5.0, 4.0, null, null, null);
        ht2 = yC2;
        yG7.n(ht2, f1.e("\u00d1", (int)f1.d("s", (int)6697, (long)(0xDF9C134C739D92EL ^ l10)), (long)-1833125207775182440L, (long)l10));
        ((hQ)ht2).N(this::lambda$createLeftContainer$1);
        yG6.n(yG7, new Object[0]);
        if (this._C) {
            yG yG8 = new yG(yG6.w(), yG6.b() - yG7.b());
            yG8.d().f((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)29803, (long)(0x4F6F8432AA433778L ^ l10)), (long)-1833125207775182440L, (long)l10)));
            yG6.n(yG8, f1.e("\u00d1", (int)f1.d("s", (int)31553, (long)(0x4938505E3282384EL ^ l10)), (long)-1833125207775182440L, (long)l10));
            hr hr2 = new hr((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)24577, (long)(0xE5969D797FA317L ^ l10)), (long)-1833125207775182440L, (long)l10)), 0.8, f1.M.Y, f1.M.u);
            hr2.T(yG8.w());
            hr2.w(14.0);
            hr2.N(() -> this.lambda$createLeftContainer$2(hr2));
            hr2.f(true);
            hr2.q(false);
            hr2.A(Color.WHITE);
            yG8.n(hr2, new Object[0]);
            bE bE2 = new bE(0.0, 2.0);
            yG8.n(bE2, new Object[0]);
            this._q = new yG(yG8.w(), yG6.b() - yG7.b() - hr2.b() - bE2.b() + 2.0);
            this._q.q(true);
            this._q.i(this._q.b());
            this._q.i(false);
            this._q.O(G4.OUTSIDE);
            this._q.G(true);
            this._q.d().f((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)26731, (long)(0x36B64AF44F2C2B60L ^ l10)), (long)-1833125207775182440L, (long)l10)));
            yG8.n(this._q, new Object[0]);
            for (Ry ry2 : SE.h.u().j().values()) {
                this.G(ry2);
            }
        }
    }

    private static void lambda$openWithEditor$21(f1 f12) {
        f12.q((Ry)null);
    }

    private static void lambda$openWithPublicListing$15(f1 f12) {
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public yL Y(@Nullable Ry ry2) {
        if (ry2 == null) {
            yL yL2 = new yL(this, null, null);
            yL2.x(this.g(null, yL2));
            return yL2;
        }
        OT oT2 = OT.q(ry2);
        yL yL3 = new yL(this, ry2, oT2);
        yL3.x(this.g(null, yL3));
        return yL3;
    }

    private void lambda$setCenteredOverlay$9(AtomicReference atomicReference) {
        f9 f92 = (f9)atomicReference.get();
        try {
            if (f92 != null) {
                this.Z(f92);
            }
        }
        catch (O_ o_2) {
            throw f1.a(o_2);
        }
    }

    private static CompletableFuture lambda$addPublicProfileButton$12(Ry ry2) {
        return f1.R(false, ry2.H());
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = f1.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                f1.ab = d8.a(-9071475178551875050L, -8265342021022167076L, MethodHandles.lookup().lookupClass()).a(269158867969307L);
                f1.qb = new Object[5];
                f1.rb = new String[5];
                f1.X();
                f1.lb = new HashMap<K, V>(13);
                var0 = f1.ab ^ 30493747933829L;
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
                var8_3 = new long[29];
                var5_4 = 0;
                var6_5 = "8.:\u00d9\u0000\u00f2Y\u0092,H%\u00ba\u0017\u00da\u0092\u001bnUz=\u0098#\u00fd\u00adC\u00c8Ok\u001b)\u00a4<`\u0004\u00fb\u00c6>\u0010\u00fa\u00e9?\u00ac7\u009d{Q\u00ea\u00c6L\u0095\u00dfo 2\u0089\u0006\u00ceg\u00e1+;\u00ef?\u0086\u00e8\u0013\u0086\u00e5\u00eaa\u001el\u00cf\u00fb\u000b\u00aa\u00bd\u00cfXv\u00ef(3\u0006\u00c0\u00db\u00df=|\u0088xL\u008b\r\\\u009db\u008c-\u00fcf\u00ef\u0098m\u007f\u00d4\u007f\u00c1\u008e\u00ee\u001e:x\u00dfk\u0001\u0099]\u00b4\u00fd\u00c8!{\u00f7\u0011+\u0006*I\u0013\u00af\u00de\u00d8\u00e55\u00adL\u00d0\u0096\u00cf\u00b5\u00c14\u009f5f\r(\u00fa\n\u0087W\u00be\u00b5\u00da\u00c2\u0095\u00ac`FRo\u001d\u00a5C1p\u00e6<\u0007r]G\u0001\u0095<\fS\u00f4n\u0084rP7\u00a9@;~^9\u0015\u009b\u009d\u0083.8\u00a4\u00a7N\u00d4\u00eb`e4\u0097C\u0084\u00ad\u0097LX\u000b\"\u0011\u00c5\u00f7";
                var7_6 = "8.:\u00d9\u0000\u00f2Y\u0092,H%\u00ba\u0017\u00da\u0092\u001bnUz=\u0098#\u00fd\u00adC\u00c8Ok\u001b)\u00a4<`\u0004\u00fb\u00c6>\u0010\u00fa\u00e9?\u00ac7\u009d{Q\u00ea\u00c6L\u0095\u00dfo 2\u0089\u0006\u00ceg\u00e1+;\u00ef?\u0086\u00e8\u0013\u0086\u00e5\u00eaa\u001el\u00cf\u00fb\u000b\u00aa\u00bd\u00cfXv\u00ef(3\u0006\u00c0\u00db\u00df=|\u0088xL\u008b\r\\\u009db\u008c-\u00fcf\u00ef\u0098m\u007f\u00d4\u007f\u00c1\u008e\u00ee\u001e:x\u00dfk\u0001\u0099]\u00b4\u00fd\u00c8!{\u00f7\u0011+\u0006*I\u0013\u00af\u00de\u00d8\u00e55\u00adL\u00d0\u0096\u00cf\u00b5\u00c14\u009f5f\r(\u00fa\n\u0087W\u00be\u00b5\u00da\u00c2\u0095\u00ac`FRo\u001d\u00a5C1p\u00e6<\u0007r]G\u0001\u0095<\fS\u00f4n\u0084rP7\u00a9@;~^9\u0015\u009b\u009d\u0083.8\u00a4\u00a7N\u00d4\u00eb`e4\u0097C\u0084\u00ad\u0097LX\u000b\"\u0011\u00c5\u00f7".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block10;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u008f6\u0096\u00db\u0007\u008c\u0091\u00f6\u00dd\u00cb$\u00bb\u00b1\u00876\u00aa";
                    var7_6 = "\u008f6\u0096\u00db\u0007\u008c\u0091\u00f6\u00dd\u00cb$\u00bb\u00b1\u00876\u00aa".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block11;
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
        f1.eb = var8_3;
        f1.fb = new Integer[29];
        try {
            v8 = f1.class.desiredAssertionStatus() == false;
        }
        catch (O_ v9) {
            throw f1.a(v9);
        }
        f1._j = v8;
    }

    private static void lambda$new$0() {
        Ao.K.T(Ao.F);
    }

    private yG M(@NotNull ht ht2, Runnable runnable) {
        long l10 = ab ^ 0x5F35A034D183L;
        yG yG2 = new yG(ht2.w(), ht2.b() + 11.0);
        yG2.Q(f1.M.g);
        yG2.d().f((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)10428, (long)(0x581F86D91AAA1BEEL ^ l10)), (long)-7576327965676244532L, (long)l10)));
        yG2.J(f1.M.S);
        yG2.d(1.0f);
        yG yG3 = new yG(ht2.w(), 10.0);
        yG3.i(false);
        yG3.d().f((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)2548, (long)(0x33BD9B8CF8BCBAACL ^ l10)), (long)-7576327965676244532L, (long)l10)));
        yG2.n(yG3, new Object[0]);
        hy hy2 = new hy((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)24913, (long)(0x2ADDF3BBCE5F520CL ^ l10)), (long)-7576327965676244532L, (long)l10)), 1.2, new Color(0, 0, 0, 0), f1.M.w, 8.0, 8.0);
        hy2.N(() -> f1.lambda$createCenteredOverlayNode$11(runnable));
        yG3.n(new wr(2.0, 2.0, 2.0, 2.0, hy2), new Object[0]);
        yG2.n(ht2, new Object[0]);
        return yG2;
    }

    public f9 W(@Nullable w6 w62, ht ht2) {
        w6 w63;
        try {
            w63 = w62 != null ? w62 : this;
        }
        catch (O_ o_2) {
            throw f1.a(o_2);
        }
        f9 f92 = Ao.v(w63, ht2, f9.class);
        this.j(f92);
        return f92;
    }

    private static void lambda$openWithPublicListing$18(zy zy2, Throwable throwable) {
        block10: {
            long l10 = ab ^ 0x271C56AB98AFL;
            try {
                if (throwable != null) {
                    SE.W(throwable);
                    return;
                }
            }
            catch (O_ o_2) {
                throw f1.a(o_2);
            }
            try {
                if (!zy2.b()) {
                    SE.x((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)30796, (long)(0x6771AF06ED1F0223L ^ l10)), (long)-2308374141643966240L, (long)l10)) + zy2.A());
                    O5.q((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)4224, (long)(0x2B133E5059EFEAEDL ^ l10)), (long)-2308374141643966240L, (long)l10)) + zy2.A());
                    return;
                }
            }
            catch (O_ o_3) {
                throw f1.a(o_3);
            }
            try {
                try {
                    if (_j || zy2.h() != null) break block10;
                }
                catch (O_ o_4) {
                    throw f1.a(o_4);
                }
                throw new AssertionError();
            }
            catch (O_ o_5) {
                throw f1.a(o_5);
            }
        }
        f1.w(arg_0 -> f1.lambda$null$17(zy2, arg_0));
    }

    @Override
    public double b() {
        return 214.0;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/f1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method p(long l10, long l11) {
        int n2 = f1.m(l10, l11);
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
                clazz3 = f1.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = f1.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = f1.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        f1.qb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = f1.n(213056277254577L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = f1.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        f1.qb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = f1.n(213056277254577L, 0L);
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

    private static ht lambda$createRightContainer$6(Function function) {
        return (wr)function.apply(null);
    }

    public f9 g(@Nullable w6 w62, ht ht2) {
        w6 w63;
        try {
            w63 = w62 != null ? w62 : this;
        }
        catch (O_ o_2) {
            throw f1.a(o_2);
        }
        w6 w64 = w63;
        AtomicReference<f9> atomicReference = new AtomicReference<f9>();
        f9 f92 = Ao.v(w64, this.M(ht2, () -> this.lambda$setCenteredOverlay$9(atomicReference)), f9.class);
        atomicReference.set(f92);
        f92.b((int)((w64.w() - ht2.w()) / 2.0));
        f92.H((int)((w64.b() - ht2.b()) / 2.0));
        this.j(f92);
        return f92;
    }

    private void m(fB fB2, boolean bl2) {
        block7: {
            try {
                if (fB2 == null) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw f1.a(o_2);
            }
            try {
                try {
                    Ao.X(fB2);
                    Ao.z(fB2);
                    if (!(fB2.N() instanceof fB) || bl2) break block7;
                }
                catch (O_ o_3) {
                    throw f1.a(o_3);
                }
                this.m((fB)fB2.N(), true);
            }
            catch (O_ o_4) {
                throw f1.a(o_4);
            }
        }
    }

    private static zy lambda$openWithPublicListing$19(Throwable throwable) {
        return null;
    }

    private void lambda$createLeftContainer$1() {
        boolean bl2;
        try {
            f1 f12 = this;
            bl2 = !this._C;
        }
        catch (O_ o_2) {
            throw f1.a(o_2);
        }
        f12._C = bl2;
        this.v();
    }

    @Override
    public void u() {
    }

    private void v(yG yG2) {
        block17: {
            int n2;
            yk yk2;
            block14: {
                int n3;
                yk yk3;
                block16: {
                    block15: {
                        double d2;
                        wb wb2;
                        wb wb3;
                        int n4;
                        double d3;
                        yG yG3;
                        yG yG4;
                        long l10 = ab ^ 0x757DE1D6F354L;
                        try {
                            yG yG5;
                            f1 f12 = this;
                            yG4 = yG5;
                            yG3 = yG5;
                            d3 = yG2.w() - this._R.w();
                            n4 = this._C ? 5 : 6;
                        }
                        catch (O_ o_2) {
                            throw f1.a(o_2);
                        }
                        yG4(d3 - (double)n4, yG2.b() + 10.0);
                        f12._v = yG3;
                        this._v.i(this._v.b());
                        this._v.d().f((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)7097, (long)(0xBC22DDD2AFB8A38L ^ l10)), (long)-5472907554291952869L, (long)l10)));
                        yG2.n(this._v, new Object[0]);
                        this._v.n(new bE(0.0, 2.0), new Object[0]);
                        bt bt2 = new bt((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)21685, (long)(0x449E22731C87452FL ^ l10)), (long)-5472907554291952869L, (long)l10)));
                        bt2.q(true);
                        bt2.B(f1.M.w);
                        bt2.p(0.7);
                        bt2.S(0.0f);
                        this._v.n(bt2, new Object[0]);
                        this._v.n(new bE(0.0, 5.0), new Object[0]);
                        wb wb4 = this._k;
                        try {
                            wb wb5;
                            f1 f13 = this;
                            wb3 = wb5;
                            wb2 = wb5;
                            d2 = this._C ? 240.0 : 324.0;
                        }
                        catch (O_ o_3) {
                            throw f1.a(o_3);
                        }
                        wb3(d2, this::lambda$createRightContainer$4);
                        f13._k = wb2;
                        if (wb4 != null) {
                            this._k.X().y(wb4.X().a());
                            for (RH rH2 : wb4.h().p()) {
                                this._k.h().u(rH2);
                            }
                        }
                        try {
                            try {
                                try {
                                    this._v.n(this._k, new Object[0]);
                                    this._v.n(new bE(0.0, 5.0), new Object[0]);
                                    if (this._J != null && !this._D) break block14;
                                }
                                catch (O_ o_4) {
                                    throw f1.a(o_4);
                                }
                                this._J = new yk(this._v.w() - 6.0, 50.0);
                                this._J.q(new M(this._J));
                                this._J.d().f((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)20680, (long)(0x7241F6D81DEB4150L ^ l10)), (long)-5472907554291952869L, (long)l10)));
                                this._J.Y(false);
                                yk3 = this._J;
                                if (!this._C) break block15;
                            }
                            catch (O_ o_5) {
                                throw f1.a(o_5);
                            }
                            n3 = 3;
                            break block16;
                        }
                        catch (O_ o_6) {
                            throw f1.a(o_6);
                        }
                    }
                    n3 = 4;
                }
                yk3.G(n3);
                this._J.O(G4.OUTSIDE);
                Function<_5, wr> function = f1::lambda$createRightContainer$5;
                this._J.D(() -> f1.lambda$createRightContainer$6(function));
                this._J.a(() -> this.lambda$createRightContainer$8(function));
                this._J.I();
                break block17;
            }
            try {
                this._J.Y(this._v.w() - 6.0);
                yk2 = this._J;
                n2 = this._C ? 3 : 4;
            }
            catch (O_ o_7) {
                throw f1.a(o_7);
            }
            yk2.G(n2);
            this._J.y();
        }
        this._J.Q(this._v);
        this._J.i(false);
        this._v.n(this._J, new Object[0]);
    }

    private CompletableFuture lambda$createRightContainer$8(Function function) {
        String string;
        this._K = string = this._k.X().a().trim();
        return _b.S().M().T(this._Y, this._J.f(), string, this._k.h().p().stream().map(RH::p).collect(Collectors.toList())).thenApplyAsync(arg_0 -> this.lambda$null$7(function, arg_0), (Executor)Ao.st);
    }

    private void I() {
        this._d = true;
        this.k();
        wS wS2 = new wS();
        this.n(new wr(this.w() / 2.0 - wS2.w() / 2.0, this.b() / 2.0 - wS2.b() / 2.0 - 20.0, wS2), new Object[0]);
        this.h(true);
    }

    private static zy lambda$openWithEditor$23(Throwable throwable) {
        return null;
    }

    private static void lambda$null$17(zy zy2, f1 f12) {
        f12.q((Ry)zy2.h());
    }

    public void i(BZ bZ2) {
        this.g(null, new yB(this, bZ2));
    }

    public void R(fB fB2) {
        this.m(fB2, false);
    }

    public cz v() {
        return this._Y;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = f1.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = f1.h(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void r(boolean bl2, boolean bl3) {
        super.r(bl2, bl3);
        this._I = false;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/f1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00f9' || c10 == '\u00c5' || c10 == 'X' || c10 == '\u00e0') {
                field = f1.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00f9' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00c5' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'X' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = f1.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'Z' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void E() {
        try {
            if (!this._I) {
                this._I = true;
                this._D = true;
                this.v();
                this._D = false;
            }
        }
        catch (O_ o_2) {
            throw f1.a(o_2);
        }
        try {
            if (this._J != null) {
                this._J.h(true);
            }
        }
        catch (O_ o_3) {
            throw f1.a(o_3);
        }
        try {
            if (this._v != null) {
                this._v.h(true);
            }
        }
        catch (O_ o_4) {
            throw f1.a(o_4);
        }
        super.E();
    }

    @Override
    public void i() {
    }

    private void G(Ry ry2) {
        yR yR2 = new yR(ry2);
        yR2.T(92.0);
        yR2.f(() -> f1.lambda$addPublicProfileButton$12(ry2));
        this._q.n(new wr(0.0, 1.0, yR2), new Object[0]);
    }

    @Override
    public double e() {
        return 356.0;
    }

    public void z(cz cz2) {
        this._Y = cz2;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static wr lambda$createRightContainer$5(_5 _52) {
        Rh rh2 = new Rh(_52);
        return new wr(1.0, 2.0, 0.0, 3.0, rh2);
    }

    private void v() {
        long l10 = ab ^ 0x40AA59287BC8L;
        try {
            if (!YK.C.U().equals((Object)Gn.ONLINE)) {
                this.I();
                return;
            }
        }
        catch (O_ o_2) {
            throw f1.a(o_2);
        }
        this._d = false;
        this.k();
        this.n(new bJ(this.w(), 2.0, 0.5, 0.0, f1.M.S), new Object[0]);
        yG yG2 = new yG(this.e(), 185.0);
        this.n(yG2, new Object[0]);
        yG2.d().f((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)15668, (long)(0x6C2147183A86A426L ^ l10)), (long)4364100484405844871L, (long)l10)));
        this.R(yG2);
        bU bU2 = new bU(1.0, yG2.b() + 2.0, f1.M.g);
        try {
            if (!this._C) {
                yG2.n(bU2, new Object[0]);
            }
        }
        catch (O_ o_3) {
            throw f1.a(o_3);
        }
        yG2.n(new bJ(4.0, 0.0, 0.5, 0.0, new Color(0, 0, 0, 0)), new Object[0]);
        this.v(yG2);
        this._J.d().f((String)((Object)f1.e("\u00d1", (int)f1.d("s", (int)11578, (long)(0x27ED0408E4263437L ^ l10)), (long)4364100484405844871L, (long)l10)));
        this.h(true);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f1.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(f1.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

