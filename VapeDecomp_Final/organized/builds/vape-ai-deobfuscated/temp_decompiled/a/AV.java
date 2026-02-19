/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.GM;
import a.Ge;
import a.IR;
import a.JR;
import a.O_;
import a.On;
import a.WJ;
import a.X;
import a._7;
import a._H;
import a._s;
import a.aT;
import a.a_;
import a.d8;
import a.e2;
import a.e5;
import a.eF;
import a.eH;
import a.eO;
import a.eP;
import a.eR;
import a.eh;
import a.em;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class av
extends aT {
    private GM U = null;
    private boolean r = false;
    GM s = null;
    private static final long[] E;
    String c = null;
    String j = null;
    private static final Integer[] H;
    GM[] Q = null;
    private String G = null;
    private int f = 0;
    JR A = null;
    private static final long e;
    private String i = null;
    String J = null;
    private static final Map K;
    String q = null;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void J(em em2, int n2, eR eR2, eR eR3, boolean bl2) throws _H {
        block12: {
            block14: {
                block13: {
                    try {
                        try {
                            try {
                                if (!(eR2 instanceof eP) || !((eP)eR2).e().equals(this.q)) break block12;
                            }
                            catch (_H _H2) {
                                throw av.a(_H2);
                            }
                            if (n2 == 61) break block13;
                            throw new _H("bad operator for " + this.q);
                        }
                        catch (_H _H3) {
                            throw av.a(_H3);
                        }
                    }
                    catch (_H _H4) {
                        throw av.a(_H4);
                    }
                }
                try {
                    try {
                        eR3.z(this);
                        if (this.C == 1 && this.P == 307) break block14;
                        throw new _H("invalid type for " + this.q);
                    }
                    catch (_H _H5) {
                        throw av.a(_H5);
                    }
                }
                catch (_H _H6) {
                    throw av.a(_H6);
                }
            }
            try {
                this.N(this.Q, this.t);
                if (bl2) return;
                this.t.E(87);
                return;
            }
            catch (_H _H7) {
                throw av.a(_H7);
            }
        }
        super.J(em2, n2, eR2, eR3, bl2);
    }

    public void w(GM gM) throws _H {
        this.L(gM, 0);
    }

    public void A() {
        long l10 = e ^ 0x3F4F27F389E9L;
        try {
            if (this.P == 344) {
                this.t.E(1);
                this.P = (int)av.c("u", (int)8677, (long)(0x314C58FA8F82DDBL ^ l10));
                this.C = 0;
                this.o = "java/lang/Object";
            }
        }
        catch (O_ o_2) {
            throw av.a(o_2);
        }
    }

    @Override
    public void J(eP eP2) throws _H {
        block13: {
            block17: {
                block18: {
                    String string;
                    block15: {
                        block16: {
                            block14: {
                                long l10;
                                block12: {
                                    l10 = e ^ 0x524C28FA6E19L;
                                    string = eP2.e();
                                    try {
                                        if (!string.equals(this.q)) break block12;
                                        av.Q(this.t, this.Q, this.K());
                                        this.P = (int)av.c("u", (int)6516, (long)(0x383D7218EE7FF2B9L ^ l10));
                                        this.C = 1;
                                        this.o = "java/lang/Object";
                                        break block13;
                                    }
                                    catch (_H _H2) {
                                        throw av.a(_H2);
                                    }
                                }
                                try {
                                    if (!string.equals("$sig")) break block14;
                                    this.t.r(_s.Q(this.s, this.Q));
                                    this.t.e("javassist/runtime/Desc", "getParams", "(Ljava/lang/String;)[Ljava/lang/Class;");
                                    this.P = (int)av.c("u", (int)6516, (long)(0x383D7218EE7FF2B9L ^ l10));
                                    this.C = 1;
                                    this.o = "java/lang/Class";
                                    break block13;
                                }
                                catch (_H _H3) {
                                    throw av.a(_H3);
                                }
                            }
                            try {
                                try {
                                    if (!string.equals("$type")) break block15;
                                    if (this.U != null) break block16;
                                }
                                catch (_H _H4) {
                                    throw av.a(_H4);
                                }
                                throw new _H("$type is not available");
                            }
                            catch (_H _H5) {
                                throw av.a(_H5);
                            }
                        }
                        this.t.r(_s.H(this.U));
                        this.p("getType");
                        break block13;
                    }
                    try {
                        try {
                            if (!string.equals("$class")) break block17;
                            if (this.i != null) break block18;
                        }
                        catch (_H _H6) {
                            throw av.a(_H6);
                        }
                        throw new _H("$class is not available");
                    }
                    catch (_H _H7) {
                        throw av.a(_H7);
                    }
                }
                this.t.r(this.i);
                this.p("getClazz");
                break block13;
            }
            super.J(eP2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void L(GM gM, int n2) throws _H {
        long l10 = e ^ 0x4AF346A260AEL;
        if (gM.m()) {
            Ge ge = (Ge)gM;
            this.P = a.X.y(ge.y());
            this.C = n2;
            this.o = null;
            return;
        }
        try {
            if (gM.p()) {
                try {
                    this.L(gM.r(), n2 + 1);
                    return;
                }
                catch (WJ wJ2) {
                    throw new _H("undefined type: " + gM.H());
                }
            }
        }
        catch (_H _H2) {
            throw av.a(_H2);
        }
        this.P = (int)av.c("u", (int)6516, (long)(0x383D6AA78027FC0EL ^ l10));
        this.C = n2;
        this.o = a.X.i(gM.H());
    }

    @Override
    public void s(e2 e22) throws _H {
        block10: {
            eF eF2 = e22.l();
            try {
                if (eF2 == null || e22.P() != 0) break block10;
            }
            catch (_H _H2) {
                throw av.a(_H2);
            }
            eR eR2 = eF2.l();
            try {
                if (!(eR2 instanceof e5) || eF2.n() != null) break block10;
            }
            catch (_H _H3) {
                throw av.a(_H3);
            }
            String string = ((e5)eR2).e();
            try {
                if (string.equals(this.j)) {
                    this.a(e22);
                    return;
                }
            }
            catch (_H _H4) {
                throw av.a(_H4);
            }
            try {
                if (string.equals("$w")) {
                    this.k(e22);
                    return;
                }
            }
            catch (_H _H5) {
                throw av.a(_H5);
            }
        }
        super.s(e22);
    }

    public void v(GM gM) throws _H {
        block4: {
            block5: {
                try {
                    try {
                        if (this.C != 0 || av.V(this.P)) break block4;
                    }
                    catch (_H _H2) {
                        throw av.a(_H2);
                    }
                    if (!(gM instanceof Ge)) break block5;
                }
                catch (_H _H3) {
                    throw av.a(_H3);
                }
                Ge ge = (Ge)gM;
                this.p(this.P, a.X.y(ge.y()));
                break block4;
            }
            throw new _H("type mismatch");
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = d8.a(1741022377279286411L, -8730193075993000693L, MethodHandles.lookup().lookupClass()).a(103940464875809L);
        K = new HashMap(13);
        long l10 = e ^ 0x5DBC0FEF5D71L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n2 = 0;
        String string = "\u0097]\u000eq\u00f9\u00a3j}S\u0014\u00f0\u008d\u00ad0\u00d2|+\u009cO-\u009b\u0010\u0099\u0013";
        int n3 = "\u0097]\u000eq\u00f9\u00a3j}S\u0014\u00f0\u008d\u00ad0\u00d2|+\u009cO-\u009b\u0010\u0099\u0013".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        E = lArray;
        H = new Integer[3];
    }

    protected void r(GM gM, IR iR2) throws _H {
        try {
            if (gM == GM.M) {
                this.A();
                return;
            }
        }
        catch (_H _H2) {
            throw av.a(_H2);
        }
        try {
            if (this.P == 344) {
                throw new _H("invalid type for " + this.j);
            }
        }
        catch (_H _H3) {
            throw av.a(_H3);
        }
        if (gM instanceof Ge) {
            Ge ge = (Ge)gM;
            String string = ge.C();
            iR2.U(string);
            iR2.J(string, ge.S(), ge.t());
            this.w(gM);
        } else {
            iR2.K(gM);
            this.w(gM);
        }
    }

    protected void k(e2 e22) throws _H {
        long l10;
        block7: {
            l10 = e ^ 0x72EEFFFE2B0DL;
            try {
                try {
                    e22.m().z(this);
                    if (!av.V(this.P) && this.C <= 0) break block7;
                }
                catch (_H _H2) {
                    throw av.a(_H2);
                }
                return;
            }
            catch (_H _H3) {
                throw av.a(_H3);
            }
        }
        GM gM = this.W.b(this.P, this.C, this.o);
        if (gM instanceof Ge) {
            String string;
            Ge ge;
            block9: {
                block8: {
                    ge = (Ge)gM;
                    string = ge.C();
                    try {
                        this.t.p(string);
                        this.t.E(89);
                        if (ge.m() <= 1) break block8;
                        this.t.E(94);
                        break block9;
                    }
                    catch (_H _H4) {
                        throw av.a(_H4);
                    }
                }
                this.t.E(93);
            }
            this.t.E(88);
            this.t.A(string, "<init>", "(" + ge.y() + ")V");
            this.P = (int)av.c("u", (int)6516, (long)(0x383D52BA397BB7ADL ^ l10));
            this.C = 0;
            this.o = "java/lang/Object";
        }
    }

    protected void a(e2 e22) throws _H {
        block10: {
            block9: {
                try {
                    block8: {
                        try {
                            try {
                                e22.m().z(this);
                                if (this.P == 344 || av.V(this.P)) break block8;
                            }
                            catch (_H _H2) {
                                throw av.a(_H2);
                            }
                            if (this.C <= 0) break block9;
                        }
                        catch (_H _H3) {
                            throw av.a(_H3);
                        }
                    }
                    this.r(this.s, this.t);
                    break block10;
                }
                catch (_H _H4) {
                    throw av.a(_H4);
                }
            }
            if (this.s instanceof Ge) {
                Ge ge = (Ge)this.s;
                int n2 = a.X.y(ge.y());
                this.p(this.P, n2);
                this.P = n2;
                this.C = 0;
                this.o = null;
            } else {
                throw new _H("invalid cast");
            }
        }
    }

    @Override
    public void f(eH eH2) throws _H {
        eR eR2 = eH2.R();
        if (eR2 instanceof eP) {
            String string;
            block8: {
                string = ((eP)eR2).e();
                try {
                    try {
                        if (this.A == null || !string.equals(this.c)) break block8;
                    }
                    catch (_H _H2) {
                        throw av.a(_H2);
                    }
                    this.A.o(this, this.t, (eF)eH2.V());
                    return;
                }
                catch (_H _H3) {
                    throw av.a(_H3);
                }
            }
            try {
                if (string.equals("$cflow")) {
                    this.b((eF)eH2.V());
                    return;
                }
            }
            catch (_H _H4) {
                throw av.a(_H4);
            }
        }
        super.f(eH2);
    }

    public void N(String string, String string2, int n2, _7 _72) throws _H {
        String string3;
        int n3;
        int n4;
        block5: {
            block6: {
                char c10;
                n4 = 0;
                while (true) {
                    c10 = string.charAt(n4);
                    try {
                        if (c10 != '[') break;
                        ++n4;
                    }
                    catch (_H _H2) {
                        throw av.a(_H2);
                    }
                }
                n3 = a.X.y(c10);
                string3 = null;
                try {
                    if (n3 != 307) break block5;
                    if (n4 != 0) break block6;
                }
                catch (_H _H3) {
                    throw av.a(_H3);
                }
                string3 = string.substring(1, string.length() - 1);
                break block5;
            }
            string3 = string.substring(n4 + 1, string.length() - 1);
        }
        eh eh2 = new eh(n3, string3, n4, n2, new e5(string2));
        _72.s(string2, eh2);
    }

    public boolean O(eF eF2) {
        block8: {
            boolean bl2;
            block10: {
                block9: {
                    try {
                        try {
                            if (this.Q == null || eF2 == null) break block8;
                        }
                        catch (O_ o_2) {
                            throw av.a(o_2);
                        }
                        if (eF2.n() != null) break block8;
                    }
                    catch (O_ o_3) {
                        throw av.a(o_3);
                    }
                    eR eR2 = eF2.l();
                    try {
                        try {
                            if (!(eR2 instanceof eP) || !((eP)eR2).e().equals(this.J)) break block9;
                        }
                        catch (O_ o_4) {
                            throw av.a(o_4);
                        }
                        bl2 = true;
                        break block10;
                    }
                    catch (O_ o_5) {
                        throw av.a(o_5);
                    }
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x38B1;
        if (H[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = E[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])K.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    K.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/av", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            av.H[n3] = n4;
        }
        return H[n3];
    }

    public int u(GM[] gMArray, boolean bl2, String string, String string2, String string3, _7 _72) throws _H {
        boolean bl3;
        String string4;
        String string5;
        String string6;
        boolean bl4;
        GM[] gMArray2;
        av av2;
        try {
            av2 = this;
            gMArray2 = gMArray;
            bl4 = bl2;
            string6 = string;
            string5 = string2;
            string4 = string3;
            bl3 = !bl2;
        }
        catch (_H _H2) {
            throw av.a(_H2);
        }
        return av2.k(gMArray2, bl4, string6, string5, string4, bl3, 0, this.O(), _72);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    protected void a(eO eO2) throws _H {
        eR eR2;
        block9: {
            block11: {
                block10: {
                    eR2 = eO2.Z();
                    try {
                        try {
                            try {
                                if (eR2 == null || this.s != GM.M) break block9;
                            }
                            catch (_H _H2) {
                                throw av.a(_H2);
                            }
                            this.p(eR2);
                            if (!av.g(this.P, this.C)) break block10;
                        }
                        catch (_H _H3) {
                            throw av.a(_H3);
                        }
                        this.t.E(88);
                        break block11;
                    }
                    catch (_H _H4) {
                        throw av.a(_H4);
                    }
                }
                try {
                    if (this.P != 344) {
                        this.t.E(87);
                    }
                }
                catch (_H _H5) {
                    throw av.a(_H5);
                }
            }
            eR2 = null;
        }
        this.y(eR2);
    }

    public void i(JR jR2, String string) {
        this.c = string;
        this.A = jR2;
    }

    public int k(GM[] gMArray, boolean bl2, String string, String string2, String string3, boolean bl3, int n2, String string4, _7 _72) throws _H {
        try {
            this.Q = gMArray;
            this.q = string2;
            this.J = string3;
            this.f = n2;
            this.r = bl3;
            if (string4 != null) {
                this.i = a.X.M(string4);
            }
        }
        catch (_H _H2) {
            throw av.a(_H2);
        }
        this.N = bl2;
        int n3 = n2;
        if (bl3) {
            String string5 = string + "0";
            eh eh2 = new eh(307, a.X.i(string4), 0, n3++, new e5(string5));
            _72.s(string5, eh2);
        }
        for (int i10 = 0; i10 < gMArray.length; ++i10) {
            n3 += this.v(gMArray[i10], string + (i10 + 1), n3, _72);
        }
        try {
            if (this.H() < n3) {
                this.f(n3);
            }
        }
        catch (_H _H3) {
            throw av.a(_H3);
        }
        return n3;
    }

    private static void O(StringBuilder stringBuilder, eR eR2) throws _H {
        try {
            if (eR2 instanceof e5) {
                stringBuilder.append(((e5)eR2).e());
                return;
            }
        }
        catch (_H _H2) {
            throw av.a(_H2);
        }
        if (eR2 instanceof em) {
            em em2 = (em)eR2;
            try {
                if (em2.I() == 46) {
                    av.O(stringBuilder, em2.R());
                    stringBuilder.append('.');
                    av.O(stringBuilder, em2.V());
                    return;
                }
            }
            catch (_H _H3) {
                throw av.a(_H3);
            }
        }
        throw new _H("bad $cflow");
    }

    private void p(String string) {
        long l10 = e ^ 0x774C9BED3622L;
        this.t.e("javassist/runtime/Desc", string, "(Ljava/lang/String;)Ljava/lang/Class;");
        this.P = (int)av.c("u", (int)6516, (long)(0x383D57185D68AA82L ^ l10));
        this.C = 0;
        this.o = "java/lang/Class";
    }

    public void c(GM gM) {
        this.U = gM;
    }

    private int v(GM gM, String string, int n2, _7 _72) throws _H {
        int n3;
        block5: {
            block4: {
                long l10 = e ^ 0x7C64AE7F6E38L;
                try {
                    if (gM != GM.M) break block4;
                    this.P = (int)av.c("u", (int)6516, (long)(0x383D5C3068FAF298L ^ l10));
                    this.C = 0;
                    this.o = "java/lang/Object";
                    break block5;
                }
                catch (_H _H2) {
                    throw av.a(_H2);
                }
            }
            this.w(gM);
        }
        eh eh2 = new eh(this.P, this.o, this.C, n2, new e5(string));
        try {
            _72.s(string, eh2);
            n3 = av.g(this.P, this.C) ? 2 : 1;
        }
        catch (_H _H3) {
            throw av.a(_H3);
        }
        return n3;
    }

    void f(eR eR2, int n2, String string, eF eF2) throws _H {
        eR2.z(this);
        int n3 = this.Y(eF2);
        this.F(eF2, new int[n3], new int[n3], new String[n3]);
        this.t.n(n2, string);
        this.Q(string, false, false);
        this.A();
    }

    public av(IR iR2, GM gM, On on2) {
        super(iR2, gM, on2);
        this.X(new a_(gM, on2, this));
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = av.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/av" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public int p(GM gM, String string, String string2, _7 _72) throws _H {
        try {
            this.s = gM;
            this.j = string;
            this.G = string2;
            if (string2 == null) {
                return -1;
            }
        }
        catch (_H _H2) {
            throw av.a(_H2);
        }
        int n2 = this.H();
        int n3 = n2 + this.v(gM, string2, n2, _72);
        this.f(n3);
        return n2;
    }

    @Override
    public int Y(eF eF2) {
        String string = this.J;
        int n2 = 0;
        while (eF2 != null) {
            block6: {
                block5: {
                    eR eR2 = eF2.l();
                    try {
                        try {
                            if (!(eR2 instanceof eP) || !((eP)eR2).e().equals(string)) break block5;
                        }
                        catch (O_ o_2) {
                            throw av.a(o_2);
                        }
                        if (this.Q == null) break block6;
                    }
                    catch (O_ o_3) {
                        throw av.a(o_3);
                    }
                    n2 += this.Q.length;
                    break block6;
                }
                ++n2;
            }
            eF2 = eF2.n();
        }
        return n2;
    }

    protected void N(GM[] gMArray, IR iR2) throws _H {
        try {
            if (gMArray == null) {
                return;
            }
        }
        catch (_H _H2) {
            throw av.a(_H2);
        }
        int n2 = this.K();
        int n3 = gMArray.length;
        int n4 = 0;
        while (true) {
            int n5;
            int n6;
            block9: {
                block8: {
                    try {
                        try {
                            if (n4 >= n3) break;
                            iR2.E(89);
                            iR2.a(n4);
                            iR2.E(50);
                            this.r(gMArray[n4], iR2);
                            iR2.P(n2, gMArray[n4]);
                            n6 = n2;
                            if (!av.g(this.P, this.C)) break block8;
                        }
                        catch (_H _H3) {
                            throw av.a(_H3);
                        }
                        n5 = 2;
                        break block9;
                    }
                    catch (_H _H4) {
                        throw av.a(_H4);
                    }
                }
                n5 = 1;
            }
            n2 = n6 + n5;
            ++n4;
        }
    }

    protected void b(eF eF2) throws _H {
        StringBuilder stringBuilder;
        long l10;
        block7: {
            l10 = e ^ 0x5EAD6DB70D08L;
            stringBuilder = new StringBuilder();
            try {
                try {
                    if (eF2 != null && eF2.n() == null) break block7;
                }
                catch (_H _H2) {
                    throw av.a(_H2);
                }
                throw new _H("bad $cflow");
            }
            catch (_H _H3) {
                throw av.a(_H3);
            }
        }
        av.O(stringBuilder, eF2.l());
        String string = stringBuilder.toString();
        Object[] objectArray = this.W.X().s(string);
        try {
            if (objectArray == null) {
                throw new _H("no such $cflow: " + string);
            }
        }
        catch (_H _H4) {
            throw av.a(_H4);
        }
        this.t.q((String)objectArray[0], (String)objectArray[1], "Ljavassist/runtime/Cflow;");
        this.t.J("javassist.runtime.Cflow", "value", "()I");
        this.P = (int)av.c("u", (int)15188, (long)(0x66B93200F483338AL ^ l10));
        this.C = 0;
        this.o = null;
    }

    @Override
    public void F(eF eF2, int[] nArray, int[] nArray2, String[] stringArray) throws _H {
        GM[] gMArray = this.Q;
        String string = this.J;
        int n2 = 0;
        while (eF2 != null) {
            block7: {
                eR eR2;
                block6: {
                    eR2 = eF2.l();
                    try {
                        try {
                            if (!(eR2 instanceof eP) || !((eP)eR2).e().equals(string)) break block6;
                        }
                        catch (_H _H2) {
                            throw av.a(_H2);
                        }
                        if (gMArray == null) break block7;
                    }
                    catch (_H _H3) {
                        throw av.a(_H3);
                    }
                    int n3 = gMArray.length;
                    int n4 = this.K();
                    for (int i10 = 0; i10 < n3; ++i10) {
                        GM gM = gMArray[i10];
                        n4 += this.t.y(n4, gM);
                        this.w(gM);
                        nArray[n2] = this.P;
                        nArray2[n2] = this.C;
                        stringArray[n2] = this.o;
                        ++n2;
                    }
                    break block7;
                }
                eR2.z(this);
                nArray[n2] = this.P;
                nArray2[n2] = this.C;
                stringArray[n2] = this.o;
                ++n2;
            }
            eF2 = eF2.n();
        }
    }

    public static int Q(IR iR2, GM[] gMArray, int n2) {
        try {
            if (gMArray == null) {
                iR2.a(0);
                iR2.m("java.lang.Object");
                return 1;
            }
        }
        catch (O_ o_2) {
            throw av.a(o_2);
        }
        GM[] gMArray2 = new GM[1];
        int n3 = gMArray.length;
        iR2.a(n3);
        iR2.m("java.lang.Object");
        int n4 = 0;
        while (true) {
            block7: {
                block6: {
                    try {
                        if (n4 >= n3) break;
                        iR2.E(89);
                        iR2.a(n4);
                        if (!gMArray[n4].m()) break block6;
                    }
                    catch (O_ o_3) {
                        throw av.a(o_3);
                    }
                    Ge ge = (Ge)gMArray[n4];
                    String string = ge.C();
                    iR2.p(string);
                    iR2.E(89);
                    int n5 = iR2.y(n2, ge);
                    n2 += n5;
                    gMArray2[0] = ge;
                    iR2.A(string, "<init>", _s.Q(GM.M, gMArray2));
                    break block7;
                }
                iR2.B(n2);
                ++n2;
            }
            iR2.E(83);
            ++n4;
        }
        return 8;
    }

    private int K() {
        int n2;
        int n3;
        try {
            n3 = this.f;
            n2 = this.r ? 1 : 0;
        }
        catch (O_ o_2) {
            throw av.a(o_2);
        }
        return n3 + n2;
    }

    public int e(GM gM, String string, _7 _72) throws _H {
        try {
            if (string == null) {
                return -1;
            }
        }
        catch (_H _H2) {
            throw av.a(_H2);
        }
        int n2 = this.H();
        int n3 = n2 + this.v(gM, string, n2, _72);
        this.f(n3);
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(av.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

