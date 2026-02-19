/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ba;
import a.IV;
import a.Ik;
import a.J8;
import a.N7;
import a.NV;
import a.N_;
import a.O0;
import a.W7;
import a.WO;
import a.We;
import a.aN;
import a.aX;
import a.aa;
import a.d8;
import a.l3;
import a.lc;
import a.rP;
import a.rh;
import a.zY;
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
final class Nf
extends NV {
    private O0 P;
    private W7 M;
    private static final long bb;
    private final int p;
    private W7 E;
    private int y;
    private final O0 N;
    private final int o;
    private int X;
    private final int g;
    private int u;
    private int d;
    private aN m;
    private We k;
    private O0 l;
    private static final Map hb;
    private aN f;
    private aN Y;
    private final aX Ui;
    private int e;
    private lc K;
    private int C;
    private O0 n;
    private lc J;
    private static final Integer[] gb;
    private static final int[] j;
    private final String O;
    private int b;
    private aN[] W;
    private int I;
    private int D;
    private O0 v;
    private aN UC;
    private aN[] Q;
    private boolean i;
    private int L;
    private int s;
    private final String UI;
    private O0 V;
    private final int r;
    private final int[] S;
    private int h;
    private int[] c;
    private static final long[] fb;
    private int R;
    private boolean A;
    private We G;
    private aN x;
    private final int U;
    private int a;
    private O0 B;
    private final int z;
    private int H;
    private int[] F;
    private int Uf;
    private lc w;
    private aN Z;

    public void n(int n2, String string) {
        block10: {
            block12: {
                this.b = this.N.I;
                N_ n_ = this.Ui.c(string);
                try {
                    block11: {
                        try {
                            try {
                                this.N.I(n2, n_.Z);
                                if (this.w == null) break block10;
                                if (this.r == 4) break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw Nf.a(illegalArgumentException);
                            }
                            if (this.r != 3) break block12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                    }
                    this.w.b.o(n2, this.b, n_, this.Ui);
                    break block10;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            if (n2 == 187) {
                int n3 = this.D + 1;
                try {
                    if (n3 > this.e) {
                        this.e = n3;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
                this.D = n3;
            }
        }
    }

    public void z(lc lc2) {
        block35: {
            block36: {
                block37: {
                    block33: {
                        block34: {
                            block28: {
                                block31: {
                                    block32: {
                                        block29: {
                                            block30: {
                                                try {
                                                    this.A |= lc2.F(this.N.U, this.N.I);
                                                    if ((lc2.C & 1) != 0) {
                                                        return;
                                                    }
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw Nf.a(illegalArgumentException);
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (this.r != 4) break block28;
                                                            if (this.w == null) break block29;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw Nf.a(illegalArgumentException);
                                                        }
                                                        if (lc2.n != this.w.n) break block30;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw Nf.a(illegalArgumentException);
                                                    }
                                                    this.w.C = (short)(this.w.C | lc2.C & 2);
                                                    lc2.b = this.w.b;
                                                    return;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw Nf.a(illegalArgumentException);
                                                }
                                            }
                                            this.O(0, lc2);
                                        }
                                        try {
                                            try {
                                                if (this.K == null) break block31;
                                                if (lc2.n != this.K.n) break block32;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw Nf.a(illegalArgumentException);
                                            }
                                            this.K.C = (short)(this.K.C | lc2.C & 2);
                                            lc2.b = this.K.b;
                                            this.w = this.K;
                                            return;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw Nf.a(illegalArgumentException);
                                        }
                                    }
                                    this.K.h = lc2;
                                }
                                this.K = lc2;
                                this.w = lc2;
                                lc2.b = new Ik(lc2);
                                break block35;
                            }
                            try {
                                try {
                                    if (this.r != 3) break block33;
                                    if (this.w != null) break block34;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                this.w = lc2;
                                break block35;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw Nf.a(illegalArgumentException);
                            }
                        }
                        this.w.b.M = lc2;
                        break block35;
                    }
                    try {
                        try {
                            if (this.r != 1) break block36;
                            if (this.w == null) break block37;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                        this.w.u = (short)this.e;
                        this.O(this.D, lc2);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                }
                try {
                    this.w = lc2;
                    this.D = 0;
                    this.e = 0;
                    if (this.K != null) {
                        this.K.h = lc2;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
                this.K = lc2;
                break block35;
            }
            try {
                try {
                    if (this.r != 2 || this.w != null) break block35;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
                this.w = lc2;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
        }
    }

    Nf(aX aX2, int n2, String string, String string2, String string3, String[] stringArray, int n3) {
        int n4;
        block11: {
            int n5;
            long l10 = bb ^ 0x6CE72E38D4DBL;
            super(Nf.b(18283, 0x5FEFF74798139643L ^ l10));
            this.N = new O0();
            this.Ui = aX2;
            try {
                this.p = "<init>".equals(string) ? n2 | Nf.b(15401, 0x6FBE25FB9D61ED05L ^ l10) : n2;
                this.U = aX2.j(string);
                this.O = string;
                this.o = aX2.j(string2);
                this.UI = string2;
                Nf nf = this;
                n5 = string3 == null ? 0 : aX2.j(string3);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
            try {
                nf.g = n5;
                if (stringArray == null || stringArray.length <= 0) break block11;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
            this.z = stringArray.length;
            this.S = new int[this.z];
            try {
                for (n4 = 0; n4 < this.z; ++n4) {
                    this.S[n4] = aX2.c((String)stringArray[n4]).Z;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
        }
        this.z = 0;
        this.S = null;
        this.r = n3;
        if (n3 != 0) {
            n4 = zY.m(string2) >> 2;
            try {
                if ((n2 & 8) != 0) {
                    --n4;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
            this.R = n4;
            this.s = n4;
            this.J = new lc();
            this.z(this.J);
        }
    }

    public void D() {
    }

    /*
     * Unable to fully structure code
     */
    public void Z(Object var1_1) {
        block29: {
            block31: {
                block27: {
                    block28: {
                        block26: {
                            block25: {
                                block24: {
                                    this.b = this.N.I;
                                    var2_2 = this.Ui.P(var1_1);
                                    var3_3 = var2_2.Z;
                                    try {
                                        try {
                                            if (var2_2.c != 5 && var2_2.c != 6) {
                                            }
                                            ** GOTO lbl22
                                        }
                                        catch (IllegalArgumentException v0) {
                                            throw Nf.a(v0);
                                        }
                                        if (var2_2.c != 17) break block24;
                                    }
                                    catch (IllegalArgumentException v1) {
                                        throw Nf.a(v1);
                                    }
                                    var4_4 = var2_2.i.charAt(0);
                                    try {
                                        try {
                                            if (var4_4 != 'J' && var4_4 != 'D') break block24;
                                        }
                                        catch (IllegalArgumentException v2) {
                                            throw Nf.a(v2);
                                        }
lbl22:
                                        // 2 sources

                                        v3 = true;
                                        break block25;
                                    }
                                    catch (IllegalArgumentException v4) {
                                        throw Nf.a(v4);
                                    }
                                }
                                v3 = false;
                            }
                            var5_5 = v3;
                            try {
                                if (!var5_5) break block26;
                                this.N.I(20, var3_3);
                                break block27;
                            }
                            catch (IllegalArgumentException v5) {
                                throw Nf.a(v5);
                            }
                        }
                        try {
                            if (var3_3 < 256) break block28;
                            this.N.I(19, var3_3);
                            break block27;
                        }
                        catch (IllegalArgumentException v6) {
                            throw Nf.a(v6);
                        }
                    }
                    this.N.T(18, var3_3);
                }
                try {
                    block30: {
                        try {
                            try {
                                if (this.w == null) break block29;
                                if (this.r == 4) break block30;
                            }
                            catch (IllegalArgumentException v7) {
                                throw Nf.a(v7);
                            }
                            if (this.r != 3) break block31;
                        }
                        catch (IllegalArgumentException v8) {
                            throw Nf.a(v8);
                        }
                    }
                    this.w.b.o(18, 0, var2_2, this.Ui);
                    break block29;
                }
                catch (IllegalArgumentException v9) {
                    throw Nf.a(v9);
                }
            }
            try {
                v10 = this.D;
                v11 = var5_5 != false ? 2 : 1;
            }
            catch (IllegalArgumentException v12) {
                throw Nf.a(v12);
            }
            var6_6 = v10 + v11;
            try {
                if (var6_6 > this.e) {
                    this.e = var6_6;
                }
            }
            catch (IllegalArgumentException v13) {
                throw Nf.a(v13);
            }
            this.D = var6_6;
        }
    }

    public aa J() {
        this.V = new O0();
        return new aN(this.Ui, false, this.V, null);
    }

    public aa Q(int n2, rh rh2, String string, boolean bl2) {
        long l10 = bb ^ 0x3FFBCC1D4121L;
        try {
            if (bl2) {
                this.Y = aN.h(this.Ui, n2 & Nf.b(27491, 0x26058CBCC0692FB3L ^ l10) | this.b << 8, rh2, string, this.Y);
                return this.Y;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
        this.x = aN.h(this.Ui, n2 & Nf.b(22939, 0x76BE2F3AC8ED9D4AL ^ l10) | this.b << 8, rh2, string, this.x);
        return this.x;
    }

    public void K(int n2, int n3, lc lc2, lc ... lcArray) {
        this.b = this.N.I;
        this.N.Z(170).T(null, 0, (4 - this.N.I % 4) % 4);
        lc2.D(this.N, this.b, true);
        this.N.y(n2).y(n3);
        for (lc lc3 : lcArray) {
            lc3.D(this.N, this.b, true);
        }
        this.e(lc2, lcArray);
    }

    public void s(String string, int n2) {
        block6: {
            block8: {
                this.b = this.N.I;
                N_ n_ = this.Ui.c(string);
                try {
                    block7: {
                        try {
                            try {
                                this.N.I(197, n_.Z).Z(n2);
                                if (this.w == null) break block6;
                                if (this.r == 4) break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw Nf.a(illegalArgumentException);
                            }
                            if (this.r != 3) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                    }
                    this.w.b.o(197, n2, n_, this.Ui);
                    break block6;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            this.D += 1 - n2;
        }
    }

    private void i(int n2, int n3) {
        try {
            for (int i10 = n2; i10 < n3; ++i10) {
                Ik.O(this.Ui, this.c[i10], this.l);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
    }

    boolean e() {
        return this.A;
    }

    public aa h(int n2, rh rh2, lc[] lcArray, lc[] lcArray2, int[] nArray, String string, boolean bl2) {
        O0 o02 = new O0();
        o02.Z(n2 >>> 24).f(lcArray.length);
        try {
            for (int i10 = 0; i10 < lcArray.length; ++i10) {
                o02.f(lcArray[i10].n).f(lcArray2[i10].n - lcArray[i10].n).f(nArray[i10]);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
        try {
            rh.X(rh2, o02);
            o02.f(this.Ui.j(string)).f(0);
            if (bl2) {
                this.Y = new aN(this.Ui, true, o02, this.Y);
                return this.Y;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
        this.x = new aN(this.Ui, true, o02, this.x);
        return this.x;
    }

    void T() {
        block4: {
            block5: {
                try {
                    try {
                        if (this.F == null) break block4;
                        if (this.l != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                    this.l = new O0();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            this.Y();
            ++this.Uf;
        }
        this.F = this.c;
        this.c = null;
    }

    public void O(lc lc2, lc lc3, lc lc4, String string) {
        We we2;
        block5: {
            block4: {
                int n2;
                lc lc5;
                lc lc6;
                lc lc7;
                We we3;
                We we4;
                try {
                    We we5;
                    we4 = we5;
                    we3 = we5;
                    lc7 = lc2;
                    lc6 = lc3;
                    lc5 = lc4;
                    n2 = string != null ? this.Ui.c((String)string).Z : 0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
                we4(lc7, lc6, lc5, n2, string);
                we2 = we3;
                try {
                    if (this.k != null) break block4;
                    this.k = we2;
                    break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            this.G.i = we2;
        }
        this.G = we2;
    }

    private void Q(Object object) {
        block5: {
            block6: {
                block4: {
                    try {
                        if (!(object instanceof Integer)) break block4;
                        this.l.Z((Integer)object);
                        break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                }
                try {
                    if (!(object instanceof String)) break block6;
                    this.l.Z(7).f(this.Ui.c((String)((String)object)).Z);
                    break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            this.l.Z(8).f(((lc)object).n);
        }
    }

    int m(int n2, int n3, int n4) {
        block4: {
            int n5 = 3 + n3 + n4;
            try {
                try {
                    if (this.c != null && this.c.length >= n5) break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
                this.c = new int[n5];
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
        }
        this.c[0] = n2;
        this.c[1] = n3;
        this.c[2] = n4;
        return 3;
    }

    void W(int n2, int n3) {
        this.a = n2 + 6;
        this.H = n3 - 6;
    }

    /*
     * Unable to fully structure code
     */
    public void K(int var1_1, int var2_2, Object[] var3_3, int var4_4, Object[] var5_5) {
        block61: {
            block64: {
                block62: {
                    block63: {
                        block59: {
                            block60: {
                                try {
                                    if (this.r == 4) {
                                        return;
                                    }
                                }
                                catch (IllegalArgumentException v0) {
                                    throw Nf.a(v0);
                                }
                                try {
                                    try {
                                        if (this.r != 3) break block59;
                                        if (this.w.b != null) break block60;
                                    }
                                    catch (IllegalArgumentException v1) {
                                        throw Nf.a(v1);
                                    }
                                    this.w.b = new IV(this.w);
                                    this.w.b.E(this.Ui, this.p, this.UI, var2_2);
                                    this.w.b.U(this);
                                    break block61;
                                }
                                catch (IllegalArgumentException v2) {
                                    throw Nf.a(v2);
                                }
                            }
                            try {
                                if (var1_1 == -1) {
                                    this.w.b.Z(this.Ui, var2_2, var3_3, var4_4, var5_5);
                                }
                            }
                            catch (IllegalArgumentException v3) {
                                throw Nf.a(v3);
                            }
                            this.w.b.U(this);
                            break block61;
                        }
                        try {
                            if (var1_1 != -1) break block62;
                            if (this.F != null) break block63;
                        }
                        catch (IllegalArgumentException v4) {
                            throw Nf.a(v4);
                        }
                        var6_6 = zY.m(this.UI) >> 2;
                        var7_7 = new Ik(new lc());
                        var7_7.E(this.Ui, this.p, this.UI, var6_6);
                        var7_7.U(this);
                    }
                    this.s = var2_2;
                    var6_6 = this.m(this.N.I, var2_2, var4_4);
                    try {
                        for (var7_8 = 0; var7_8 < var2_2; ++var7_8) {
                            this.c[var6_6++] = Ik.Q(this.Ui, var3_3[var7_8]);
                        }
                    }
                    catch (IllegalArgumentException v5) {
                        throw Nf.a(v5);
                    }
                    try {
                        for (var7_8 = 0; var7_8 < var4_4; ++var7_8) {
                            this.c[var6_6++] = Ik.Q(this.Ui, var5_5[var7_8]);
                        }
                    }
                    catch (IllegalArgumentException v6) {
                        throw Nf.a(v6);
                    }
                    this.T();
                    break block61;
                }
                try {
                    if (this.Ui.q() < 50) {
                        throw new IllegalArgumentException("Class versions V1_5 or less must use F_NEW frames.");
                    }
                }
                catch (IllegalArgumentException v7) {
                    throw Nf.a(v7);
                }
                if (this.l == null) {
                    this.l = new O0();
                    var6_6 = this.N.I;
                } else {
                    block65: {
                        var6_6 = this.N.I - this.y - 1;
                        try {
                            try {
                                if (var6_6 >= 0) break block64;
                                if (var1_1 != 3) break block65;
                            }
                            catch (IllegalArgumentException v8) {
                                throw Nf.a(v8);
                            }
                            return;
                        }
                        catch (IllegalArgumentException v9) {
                            throw Nf.a(v9);
                        }
                    }
                    throw new IllegalStateException();
                }
            }
            switch (var1_1) {
                case 0: {
                    this.s = var2_2;
                    this.l.Z(255).f(var6_6).f(var2_2);
                    try {
                        for (var7_8 = 0; var7_8 < var2_2; ++var7_8) {
                            this.Q(var3_3[var7_8]);
                        }
                    }
                    catch (IllegalArgumentException v10) {
                        throw Nf.a(v10);
                    }
                    this.l.f(var4_4);
                    try {
                        for (var7_8 = 0; var7_8 < var4_4; ++var7_8) {
                            this.Q(var5_5[var7_8]);
                        }
                        break;
                    }
                    catch (IllegalArgumentException v11) {
                        throw Nf.a(v11);
                    }
                }
                case 1: {
                    this.s += var2_2;
                    this.l.Z(251 + var2_2).f(var6_6);
                    try {
                        for (var7_8 = 0; var7_8 < var2_2; ++var7_8) {
                            this.Q(var3_3[var7_8]);
                        }
                        break;
                    }
                    catch (IllegalArgumentException v12) {
                        throw Nf.a(v12);
                    }
                }
                case 2: {
                    this.s -= var2_2;
                    this.l.Z(251 - var2_2).f(var6_6);
                    break;
                }
                case 3: {
                    try {
                        if (var6_6 < 64) {
                            this.l.Z(var6_6);
                            break;
                        }
                    }
                    catch (IllegalArgumentException v13) {
                        throw Nf.a(v13);
                    }
                    this.l.Z(251).f(var6_6);
                    break;
                }
                case 4: {
                    try {
                        if (var6_6 >= 64) ** GOTO lbl141
                        this.l.Z(64 + var6_6);
                        ** GOTO lbl143
                    }
                    catch (IllegalArgumentException v14) {
                        throw Nf.a(v14);
                    }
lbl141:
                    // 1 sources

                    this.l.Z(247).f(var6_6);
lbl143:
                    // 2 sources

                    this.Q(var5_5[0]);
                    break;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
            this.y = this.N.I;
            ++this.Uf;
        }
        if (this.r == 2) {
            this.D = var4_4;
            var6_6 = 0;
            while (true) {
                block67: {
                    try {
                        block66: {
                            try {
                                try {
                                    if (var6_6 >= var4_4) break;
                                    if (var5_5[var6_6] == Ba.A) break block66;
                                }
                                catch (IllegalArgumentException v15) {
                                    throw Nf.a(v15);
                                }
                                if (var5_5[var6_6] != Ba.o) break block67;
                            }
                            catch (IllegalArgumentException v16) {
                                throw Nf.a(v16);
                            }
                        }
                        ++this.D;
                    }
                    catch (IllegalArgumentException v17) {
                        throw Nf.a(v17);
                    }
                }
                ++var6_6;
            }
            try {
                if (this.D > this.e) {
                    this.e = this.D;
                }
            }
            catch (IllegalArgumentException v18) {
                throw Nf.a(v18);
            }
        }
        this.C = Math.max(this.C, var4_4);
        this.R = Math.max(this.R, this.s);
    }

    private void O(int n2, lc lc2) {
        this.w.e = new N7(n2, lc2, this.w.e);
    }

    public void u(W7 w72) {
        block3: {
            block2: {
                try {
                    if (!w72.k()) break block2;
                    w72.a = this.E;
                    this.E = w72;
                    break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            w72.a = this.M;
            this.M = w72;
        }
    }

    /*
     * Exception decompiling
     */
    public void A(int var1_1, String var2_2, String var3_3, String var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 13[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public void n(int n2, int n3) {
        block45: {
            block42: {
                int n4;
                block47: {
                    block44: {
                        block43: {
                            block38: {
                                block41: {
                                    block40: {
                                        block37: {
                                            block36: {
                                                block34: {
                                                    block46: {
                                                        block35: {
                                                            try {
                                                                try {
                                                                    this.b = this.N.I;
                                                                    if (n3 >= 4 || n2 == 169) break block34;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw Nf.a(illegalArgumentException);
                                                                }
                                                                if (n2 >= 54) break block35;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw Nf.a(illegalArgumentException);
                                                            }
                                                            n4 = 26 + (n2 - 21 << 2) + n3;
                                                            break block46;
                                                        }
                                                        n4 = 59 + (n2 - 54 << 2) + n3;
                                                    }
                                                    this.N.Z(n4);
                                                    break block37;
                                                }
                                                try {
                                                    if (n3 < 256) break block36;
                                                    this.N.Z(196).I(n2, n3);
                                                    break block37;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw Nf.a(illegalArgumentException);
                                                }
                                            }
                                            this.N.T(n2, n3);
                                        }
                                        try {
                                            block39: {
                                                try {
                                                    try {
                                                        if (this.w == null) break block38;
                                                        if (this.r == 4) break block39;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw Nf.a(illegalArgumentException);
                                                    }
                                                    if (this.r != 3) break block40;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw Nf.a(illegalArgumentException);
                                                }
                                            }
                                            this.w.b.o(n2, n3, null, null);
                                            break block38;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw Nf.a(illegalArgumentException);
                                        }
                                    }
                                    try {
                                        if (n2 != 169) break block41;
                                        this.w.C = (short)(this.w.C | 0x40);
                                        this.w.g = (short)this.D;
                                        this.R();
                                        break block38;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                }
                                n4 = this.D + j[n2];
                                try {
                                    if (n4 > this.e) {
                                        this.e = n4;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                this.D = n4;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (this.r == 0) break block42;
                                            if (n2 == 22) break block43;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw Nf.a(illegalArgumentException);
                                        }
                                        if (n2 == 24) break block43;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                    if (n2 == 55) break block43;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                if (n2 != 57) break block44;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw Nf.a(illegalArgumentException);
                            }
                        }
                        n4 = n3 + 2;
                        break block47;
                    }
                    n4 = n3 + 1;
                }
                try {
                    if (n4 > this.R) {
                        this.R = n4;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            try {
                try {
                    try {
                        if (n2 < 54 || this.r != 4) break block45;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                    if (this.k == null) break block45;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
                this.z(new lc());
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
        }
    }

    private void a() {
        lc lc2;
        lc lc3;
        long l10 = bb ^ 0x5810FF4FF5E8L;
        We we2 = this.k;
        while (we2 != null) {
            lc lc4 = we2.l;
            lc3 = we2.F;
            lc2 = we2.t;
            while (true) {
                block26: {
                    block25: {
                        try {
                            try {
                                if (lc3 == lc2) break;
                                if ((lc3.C & 0x10) != 0) break block25;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw Nf.a(illegalArgumentException);
                            }
                            lc3.e = new N7(Nf.b(11886, 0x317AD962B0D6DE70L ^ l10), lc4, lc3.e);
                            break block26;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                    }
                    lc3.e.P.P = new N7(Nf.b(30060, 0x3449777C5BBC0576L ^ l10), lc4, lc3.e.P.P);
                }
                lc3 = lc3.h;
            }
            we2 = we2.i;
        }
        if (this.i) {
            short s10 = 1;
            this.J.q(s10);
            block16: for (short s11 = 1; s11 <= s10; s11 = (short)(s11 + 1)) {
                lc2 = this.J;
                while (true) {
                    block27: {
                        try {
                            try {
                                if (lc2 == null) continue block16;
                                if ((lc2.C & 0x10) == 0) break block27;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw Nf.a(illegalArgumentException);
                            }
                            if (lc2.a != s11) break block27;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                        lc lc5 = lc2.e.P.n;
                        if (lc5.a == 0) {
                            s10 = (short)(s10 + 1);
                            lc5.q(s10);
                        }
                    }
                    lc2 = lc2.h;
                }
            }
            lc3 = this.J;
            while (true) {
                block28: {
                    try {
                        if (lc3 == null) break;
                        if ((lc3.C & 0x10) == 0) break block28;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                    lc2 = lc3.e.P.n;
                    lc2.L(lc3);
                }
                lc3 = lc3.h;
            }
        }
        lc lc6 = this.J;
        lc6.E = lc.z;
        int n2 = this.C;
        while (lc6 != lc.z) {
            lc2 = lc6;
            lc6 = lc6.E;
            short s12 = lc2.t;
            int n3 = s12 + lc2.u;
            if (n3 > n2) {
                n2 = n3;
            }
            N7 n7 = lc2.e;
            if ((lc2.C & 0x10) != 0) {
                n7 = n7.P;
            }
            while (n7 != null) {
                block29: {
                    int n4;
                    lc lc7;
                    block31: {
                        block30: {
                            lc7 = n7.n;
                            try {
                                try {
                                    if (lc7.E != null) break block29;
                                    lc lc8 = lc7;
                                    if (n7.i != Nf.b(30060, 0x3449777C5BBC0576L ^ l10)) break block30;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                n4 = 1;
                                break block31;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw Nf.a(illegalArgumentException);
                            }
                        }
                        n4 = s12 + n7.i;
                    }
                    lc8.t = (short)n4;
                    lc7.E = lc6;
                    lc6 = lc7;
                }
                n7 = n7.P;
            }
        }
        this.C = n2;
    }

    public void D(int n2, boolean bl2) {
        block3: {
            block2: {
                try {
                    if (!bl2) break block2;
                    this.d = n2;
                    break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            this.L = n2;
        }
    }

    private void R() {
        if (this.r == 4) {
            lc lc2 = new lc();
            lc2.b = new Ik(lc2);
            lc2.F(this.N.U, this.N.I);
            this.K.h = lc2;
            this.K = lc2;
            this.w = null;
        } else {
            try {
                if (this.r == 1) {
                    this.w.u = (short)this.e;
                    this.w = null;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
        }
    }

    public void I(String string, String string2, String string3, lc lc2, lc lc3, int n2) {
        block15: {
            block16: {
                try {
                    try {
                        if (string3 == null) break block15;
                        if (this.v != null) break block16;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                    this.v = new O0();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            ++this.I;
            this.v.f(lc2.n).f(lc3.n - lc2.n).f(this.Ui.j(string)).f(this.Ui.j(string3)).f(n2);
        }
        try {
            if (this.B == null) {
                this.B = new O0();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
        ++this.u;
        this.B.f(lc2.n).f(lc3.n - lc2.n).f(this.Ui.j(string)).f(this.Ui.j(string2)).f(n2);
        if (this.r != 0) {
            int n3;
            int n4;
            block18: {
                block17: {
                    char c10 = string2.charAt(0);
                    try {
                        try {
                            n4 = n2;
                            if (c10 != 'J' && c10 != 'D') break block17;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                        n3 = 2;
                        break block18;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                }
                n3 = 1;
            }
            int n5 = n4 + n3;
            try {
                if (n5 > this.R) {
                    this.R = n5;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
        }
    }

    public void r(int n2, lc lc2) {
        block45: {
            int n3;
            block43: {
                lc lc3;
                block44: {
                    boolean bl2;
                    block38: {
                        block41: {
                            block42: {
                                block40: {
                                    block39: {
                                        block37: {
                                            block36: {
                                                block35: {
                                                    block31: {
                                                        block33: {
                                                            int n4;
                                                            O0 o02;
                                                            block34: {
                                                                block32: {
                                                                    int n5;
                                                                    try {
                                                                        this.b = this.N.I;
                                                                        n5 = n2 >= 200 ? n2 - 33 : n2;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw Nf.a(illegalArgumentException);
                                                                    }
                                                                    n3 = n5;
                                                                    bl2 = false;
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if ((lc2.C & 4) == 0 || lc2.n - this.N.I >= Short.MIN_VALUE) break block31;
                                                                            }
                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                throw Nf.a(illegalArgumentException);
                                                                            }
                                                                            if (n3 != 167) break block32;
                                                                        }
                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                            throw Nf.a(illegalArgumentException);
                                                                        }
                                                                        this.N.Z(200);
                                                                        break block33;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw Nf.a(illegalArgumentException);
                                                                    }
                                                                }
                                                                try {
                                                                    if (n3 != 168) break block34;
                                                                    this.N.Z(201);
                                                                    break block33;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw Nf.a(illegalArgumentException);
                                                                }
                                                            }
                                                            try {
                                                                o02 = this.N;
                                                                n4 = n3 >= 198 ? n3 ^ 1 : (n3 + 1 ^ 1) - 1;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw Nf.a(illegalArgumentException);
                                                            }
                                                            o02.Z(n4);
                                                            this.N.f(8);
                                                            this.N.Z(220);
                                                            this.A = true;
                                                            bl2 = true;
                                                        }
                                                        lc2.D(this.N, this.N.I - 1, true);
                                                        break block36;
                                                    }
                                                    try {
                                                        if (n3 == n2) break block35;
                                                        this.N.Z(n2);
                                                        lc2.D(this.N, this.N.I - 1, true);
                                                        break block36;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw Nf.a(illegalArgumentException);
                                                    }
                                                }
                                                this.N.Z(n3);
                                                lc2.D(this.N, this.N.I - 1, false);
                                            }
                                            if (this.w == null) break block45;
                                            lc3 = null;
                                            try {
                                                if (this.r != 4) break block37;
                                                this.w.b.o(n3, 0, null, null);
                                                lc2.a().C = (short)(lc2.a().C | 2);
                                                this.O(0, lc2);
                                                if (n3 == 167) break block38;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw Nf.a(illegalArgumentException);
                                            }
                                            lc3 = new lc();
                                            break block38;
                                        }
                                        try {
                                            if (this.r != 3) break block39;
                                            this.w.b.o(n3, 0, null, null);
                                            break block38;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw Nf.a(illegalArgumentException);
                                        }
                                    }
                                    try {
                                        if (this.r != 2) break block40;
                                        this.D += j[n3];
                                        break block38;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    try {
                                        if (n3 != 168) break block41;
                                        if ((lc2.C & 0x20) != 0) break block42;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                    lc2.C = (short)(lc2.C | 0x20);
                                    this.i = true;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                            }
                            this.w.C = (short)(this.w.C | 0x10);
                            this.O(this.D + 1, lc2);
                            lc3 = new lc();
                            break block38;
                        }
                        this.D += j[n3];
                        this.O(this.D, lc2);
                    }
                    try {
                        try {
                            if (lc3 == null) break block43;
                            if (!bl2) break block44;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                        lc3.C = (short)(lc3.C | 2);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                }
                this.z(lc3);
            }
            try {
                if (n3 == 167) {
                    this.R();
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
        }
    }

    /*
     * Exception decompiling
     */
    private void Y() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[TRYBLOCK]], but top level block is 15[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    final void j(rP rP2) {
        rP2.O(this.M);
        rP2.O(this.E);
    }

    int Y() {
        int n2;
        block39: {
            int n3;
            aN[] aNArray;
            String string;
            int n4;
            block41: {
                block40: {
                    block36: {
                        int n5;
                        aN[] aNArray2;
                        String string2;
                        int n6;
                        block38: {
                            block37: {
                                block31: {
                                    block33: {
                                        String string3;
                                        aX aX2;
                                        boolean bl2;
                                        block35: {
                                            block34: {
                                                block32: {
                                                    long l10 = bb ^ 0x1F4FD6B583L;
                                                    try {
                                                        if (this.a != 0) {
                                                            return 6 + this.H;
                                                        }
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw Nf.a(illegalArgumentException);
                                                    }
                                                    n2 = 8;
                                                    try {
                                                        try {
                                                            if (this.N.I <= 0) break block31;
                                                            if (this.N.I <= Nf.b(11276, 0x208F37D796E91C7BL ^ l10)) break block32;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw Nf.a(illegalArgumentException);
                                                        }
                                                        throw new J8(this.Ui.B(), this.O, this.UI, this.N.I);
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw Nf.a(illegalArgumentException);
                                                    }
                                                }
                                                this.Ui.j("Code");
                                                n2 += 16 + this.N.I + We.S(this.k);
                                                try {
                                                    try {
                                                        if (this.l == null) break block33;
                                                        if (this.Ui.q() < 50) break block34;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw Nf.a(illegalArgumentException);
                                                    }
                                                    bl2 = true;
                                                    break block35;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw Nf.a(illegalArgumentException);
                                                }
                                            }
                                            bl2 = false;
                                        }
                                        boolean bl3 = bl2;
                                        try {
                                            aX2 = this.Ui;
                                            string3 = bl3 ? "StackMapTable" : "StackMap";
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw Nf.a(illegalArgumentException);
                                        }
                                        aX2.j(string3);
                                        n2 += 8 + this.l.I;
                                    }
                                    if (this.P != null) {
                                        this.Ui.j("LineNumberTable");
                                        n2 += 8 + this.P.I;
                                    }
                                    if (this.B != null) {
                                        this.Ui.j("LocalVariableTable");
                                        n2 += 8 + this.B.I;
                                    }
                                    if (this.v != null) {
                                        this.Ui.j("LocalVariableTypeTable");
                                        n2 += 8 + this.v.I;
                                    }
                                    if (this.Y != null) {
                                        n2 += this.Y.M("RuntimeVisibleTypeAnnotations");
                                    }
                                    if (this.x != null) {
                                        n2 += this.x.M("RuntimeInvisibleTypeAnnotations");
                                    }
                                    if (this.E != null) {
                                        n2 += this.E.B(this.Ui, this.N.U, this.N.I, this.C, this.R);
                                    }
                                }
                                if (this.z > 0) {
                                    this.Ui.j("Exceptions");
                                    n2 += 8 + 2 * this.z;
                                }
                                n2 += W7.z(this.Ui, this.p, this.g);
                                n2 += aN.m(this.UC, this.m, this.f, this.Z);
                                try {
                                    try {
                                        if (this.W == null) break block36;
                                        n6 = n2;
                                        string2 = "RuntimeVisibleParameterAnnotations";
                                        aNArray2 = this.W;
                                        if (this.d != 0) break block37;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                    n5 = this.W.length;
                                    break block38;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                            }
                            n5 = this.d;
                        }
                        n2 = n6 + aN.P(string2, aNArray2, n5);
                    }
                    try {
                        try {
                            if (this.Q == null) break block39;
                            n4 = n2;
                            string = "RuntimeInvisibleParameterAnnotations";
                            aNArray = this.Q;
                            if (this.L != 0) break block40;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                        n3 = this.Q.length;
                        break block41;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                }
                n3 = this.L;
            }
            n2 = n4 + aN.P(string, aNArray, n3);
        }
        if (this.V != null) {
            this.Ui.j("AnnotationDefault");
            n2 += 6 + this.V.I;
        }
        if (this.n != null) {
            this.Ui.j("MethodParameters");
            n2 += 7 + this.n.I;
        }
        if (this.M != null) {
            n2 += this.M.X(this.Ui);
        }
        return n2;
    }

    void T(O0 o02) {
        block106: {
            int n2;
            aN[] aNArray;
            int n3;
            block108: {
                block107: {
                    block103: {
                        int n4;
                        aN[] aNArray2;
                        int n5;
                        block105: {
                            block104: {
                                int n6;
                                long l10;
                                block99: {
                                    int n7;
                                    boolean bl2;
                                    l10 = bb ^ 0xA07A71E1FA9L;
                                    try {
                                        bl2 = this.Ui.q() < 49;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                    boolean bl3 = bl2;
                                    try {
                                        n7 = bl3 ? 4096 : 0;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                    int n8 = n7;
                                    try {
                                        o02.f(this.p & ~n8).f(this.U).f(this.o);
                                        if (this.a != 0) {
                                            o02.T(this.Ui.n().I, this.a, this.H);
                                            return;
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                    n6 = 0;
                                    try {
                                        if (this.N.I > 0) {
                                            ++n6;
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                    try {
                                        if (this.z > 0) {
                                            ++n6;
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                    try {
                                        try {
                                            if ((this.p & 0x1000) == 0 || !bl3) break block99;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw Nf.a(illegalArgumentException);
                                        }
                                        ++n6;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    if (this.g != 0) {
                                        ++n6;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                try {
                                    if ((this.p & Nf.b(14943, 0x7C78B3BD4FDDA003L ^ l10)) != 0) {
                                        ++n6;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                try {
                                    if (this.UC != null) {
                                        ++n6;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                try {
                                    if (this.m != null) {
                                        ++n6;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                try {
                                    if (this.W != null) {
                                        ++n6;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                try {
                                    if (this.Q != null) {
                                        ++n6;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                try {
                                    if (this.f != null) {
                                        ++n6;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                try {
                                    if (this.Z != null) {
                                        ++n6;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                try {
                                    if (this.V != null) {
                                        ++n6;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                try {
                                    if (this.n != null) {
                                        ++n6;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                if (this.M != null) {
                                    n6 += this.M.f();
                                }
                                o02.f(n6);
                                if (this.N.I > 0) {
                                    block100: {
                                        String string;
                                        aX aX2;
                                        O0 o03;
                                        int n9;
                                        block102: {
                                            block101: {
                                                int n10 = 10 + this.N.I + We.S(this.k);
                                                int n11 = 0;
                                                if (this.l != null) {
                                                    n10 += 8 + this.l.I;
                                                    ++n11;
                                                }
                                                if (this.P != null) {
                                                    n10 += 8 + this.P.I;
                                                    ++n11;
                                                }
                                                if (this.B != null) {
                                                    n10 += 8 + this.B.I;
                                                    ++n11;
                                                }
                                                if (this.v != null) {
                                                    n10 += 8 + this.v.I;
                                                    ++n11;
                                                }
                                                if (this.Y != null) {
                                                    n10 += this.Y.M("RuntimeVisibleTypeAnnotations");
                                                    ++n11;
                                                }
                                                if (this.x != null) {
                                                    n10 += this.x.M("RuntimeInvisibleTypeAnnotations");
                                                    ++n11;
                                                }
                                                if (this.E != null) {
                                                    n10 += this.E.B(this.Ui, this.N.U, this.N.I, this.C, this.R);
                                                    n11 += this.E.f();
                                                }
                                                try {
                                                    try {
                                                        o02.f(this.Ui.j("Code")).y(n10).f(this.C).f(this.R).y(this.N.I).T(this.N.U, 0, this.N.I);
                                                        We.P(this.k, o02);
                                                        o02.f(n11);
                                                        if (this.l == null) break block100;
                                                        if (this.Ui.q() < 50) break block101;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw Nf.a(illegalArgumentException);
                                                    }
                                                    n9 = 1;
                                                    break block102;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw Nf.a(illegalArgumentException);
                                                }
                                            }
                                            n9 = 0;
                                        }
                                        int n12 = n9;
                                        try {
                                            o03 = o02;
                                            aX2 = this.Ui;
                                            string = n12 != 0 ? "StackMapTable" : "StackMap";
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw Nf.a(illegalArgumentException);
                                        }
                                        o03.f(aX2.j(string)).y(2 + this.l.I).f(this.Uf).T(this.l.U, 0, this.l.I);
                                    }
                                    try {
                                        if (this.P != null) {
                                            o02.f(this.Ui.j("LineNumberTable")).y(2 + this.P.I).f(this.X).T(this.P.U, 0, this.P.I);
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                    try {
                                        if (this.B != null) {
                                            o02.f(this.Ui.j("LocalVariableTable")).y(2 + this.B.I).f(this.u).T(this.B.U, 0, this.B.I);
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                    try {
                                        if (this.v != null) {
                                            o02.f(this.Ui.j("LocalVariableTypeTable")).y(2 + this.v.I).f(this.I).T(this.v.U, 0, this.v.I);
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                    try {
                                        if (this.Y != null) {
                                            this.Y.r(this.Ui.j("RuntimeVisibleTypeAnnotations"), o02);
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                    try {
                                        if (this.x != null) {
                                            this.x.r(this.Ui.j("RuntimeInvisibleTypeAnnotations"), o02);
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                    try {
                                        if (this.E != null) {
                                            this.E.G(this.Ui, this.N.U, this.N.I, this.C, this.R, o02);
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                }
                                if (this.z > 0) {
                                    o02.f(this.Ui.j("Exceptions")).y(2 + 2 * this.z).f(this.z);
                                    for (int n13 : this.S) {
                                        o02.f(n13);
                                    }
                                }
                                try {
                                    try {
                                        W7.F(this.Ui, this.p, this.g, o02);
                                        aN.r(this.Ui, this.UC, this.m, this.f, this.Z, o02);
                                        if (this.W == null) break block103;
                                        n5 = this.Ui.j("RuntimeVisibleParameterAnnotations");
                                        aNArray2 = this.W;
                                        if (this.d != 0) break block104;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                    n4 = this.W.length;
                                    break block105;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                            }
                            n4 = this.d;
                        }
                        aN.i(n5, aNArray2, n4, o02);
                    }
                    try {
                        try {
                            if (this.Q == null) break block106;
                            n3 = this.Ui.j("RuntimeInvisibleParameterAnnotations");
                            aNArray = this.Q;
                            if (this.L != 0) break block107;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                        n2 = this.Q.length;
                        break block108;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                }
                n2 = this.L;
            }
            aN.i(n3, aNArray, n2, o02);
        }
        try {
            if (this.V != null) {
                o02.f(this.Ui.j("AnnotationDefault")).y(this.V.I).T(this.V.U, 0, this.V.I);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
        try {
            if (this.n != null) {
                o02.f(this.Ui.j("MethodParameters")).y(1 + this.n.I).Z(this.h).T(this.n.U, 0, this.n.I);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
        try {
            if (this.M != null) {
                this.M.y(this.Ui, o02);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x789A;
        if (gb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = fb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])hb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    hb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Nf", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Nf.gb[n3] = n4;
        }
        return gb[n3];
    }

    boolean p() {
        boolean bl2;
        try {
            bl2 = this.Uf > 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
        return bl2;
    }

    public void T(int n2) {
        block15: {
            block18: {
                block17: {
                    try {
                        block16: {
                            try {
                                try {
                                    this.b = this.N.I;
                                    this.N.Z(n2);
                                    if (this.w == null) break block15;
                                    if (this.r == 4) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                if (this.r != 3) break block17;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw Nf.a(illegalArgumentException);
                            }
                        }
                        this.w.b.o(n2, 0, null, null);
                        break block18;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                }
                int n3 = this.D + j[n2];
                try {
                    if (n3 > this.e) {
                        this.e = n3;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
                this.D = n3;
            }
            try {
                block19: {
                    try {
                        try {
                            if (n2 >= 172 && n2 <= 177) break block19;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                        if (n2 != 191) break block15;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                }
                this.R();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean h(WO wO2, boolean bl2, boolean bl3, int n2, int n3, int n4) {
        block31: {
            boolean bl4;
            block30: {
                block29: {
                    boolean bl5;
                    boolean bl6;
                    block28: {
                        block27: {
                            long l10 = bb ^ 0x3425DA5265D9L;
                            try {
                                try {
                                    try {
                                        try {
                                            if (wO2 != this.Ui.n() || n2 != this.o) return false;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw Nf.a(illegalArgumentException);
                                        }
                                        if (n3 != this.g) return false;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Nf.a(illegalArgumentException);
                                    }
                                    bl6 = bl3;
                                    if ((this.p & Nf.b(29111, 0x523E4105CE4A9191L ^ l10)) == 0) break block27;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                bl5 = true;
                                break block28;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw Nf.a(illegalArgumentException);
                            }
                        }
                        bl5 = false;
                    }
                    try {
                        if (bl6 != bl5) {
                            return false;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                    try {
                        try {
                            if (this.Ui.q() >= 49 || (this.p & 0x1000) == 0) break block29;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                        bl4 = true;
                        break block30;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                }
                bl4 = false;
            }
            boolean bl7 = bl4;
            try {
                if (bl2 != bl7) {
                    return false;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
            try {
                try {
                    if (n4 != 0) break block31;
                    if (this.z == 0) return true;
                    return false;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
        }
        if (wO2.d(n4) != this.z) return true;
        int n5 = n4 + 2;
        int n6 = 0;
        while (true) {
            block32: {
                try {
                    try {
                        if (n6 >= this.z) return true;
                        if (wO2.d(n5) == this.S[n6]) break block32;
                        return false;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            n5 += 2;
            ++n6;
        }
    }

    public aa B(int n2, rh rh2, String string, boolean bl2) {
        try {
            if (bl2) {
                this.f = aN.h(this.Ui, n2, rh2, string, this.f);
                return this.f;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
        this.Z = aN.h(this.Ui, n2, rh2, string, this.Z);
        return this.Z;
    }

    public void c(int n2, int n3) {
        block7: {
            block9: {
                block8: {
                    block6: {
                        try {
                            if (this.r != 4) break block6;
                            this.p();
                            break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                    }
                    try {
                        if (this.r != 1) break block8;
                        this.a();
                        break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                }
                try {
                    if (this.r != 2) break block9;
                    this.C = this.e;
                    break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            this.C = n2;
            this.R = n3;
        }
    }

    public void v() {
    }

    public void p(String string, int n2) {
        int n3;
        O0 o02;
        try {
            if (this.n == null) {
                this.n = new O0();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
        try {
            ++this.h;
            o02 = this.n;
            n3 = string == null ? 0 : this.Ui.j(string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
        o02.f(n3).f(n2);
    }

    public void f(String string, String string2, l3 l32, Object ... objectArray) {
        block9: {
            N_ n_;
            block11: {
                this.b = this.N.I;
                n_ = this.Ui.e(string, string2, l32, objectArray);
                try {
                    block10: {
                        try {
                            try {
                                this.N.I(186, n_.Z);
                                this.N.f(0);
                                if (this.w == null) break block9;
                                if (this.r == 4) break block10;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw Nf.a(illegalArgumentException);
                            }
                            if (this.r != 3) break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                    }
                    this.w.b.o(186, 0, n_, this.Ui);
                    break block9;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            int n2 = n_.d();
            int n3 = (n2 & 3) - (n2 >> 2) + 1;
            int n4 = this.D + n3;
            try {
                if (n4 > this.e) {
                    this.e = n4;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
            this.D = n4;
        }
    }

    public void M(int n2, String string, String string2, String string3, boolean bl2) {
        block13: {
            N_ n_;
            block15: {
                block12: {
                    block11: {
                        this.b = this.N.I;
                        n_ = this.Ui.V(string, string2, string3, bl2);
                        try {
                            if (n2 != 185) break block11;
                            this.N.I(185, n_.Z).T(n_.d() >> 2, 0);
                            break block12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                    }
                    this.N.I(n2, n_.Z);
                }
                try {
                    block14: {
                        try {
                            try {
                                if (this.w == null) break block13;
                                if (this.r == 4) break block14;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw Nf.a(illegalArgumentException);
                            }
                            if (this.r != 3) break block15;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                    }
                    this.w.b.o(n2, 0, n_, this.Ui);
                    break block13;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            int n3 = n_.d();
            int n4 = (n3 & 3) - (n3 >> 2);
            int n5 = n2 == 184 ? this.D + n4 + 1 : this.D + n4;
            try {
                if (n5 > this.e) {
                    this.e = n5;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
            this.D = n5;
        }
    }

    public void E(int n2, lc lc2) {
        try {
            if (this.P == null) {
                this.P = new O0();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
        ++this.X;
        this.P.f(lc2.n);
        this.P.f(n2);
    }

    private void p() {
        int n2;
        lc lc2;
        Object object;
        We we2 = this.k;
        while (true) {
            String string;
            block24: {
                block23: {
                    try {
                        try {
                            if (we2 == null) break;
                            if (we2.u != null) break block23;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                        string = "java/lang/Throwable";
                        break block24;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                }
                string = we2.u;
            }
            object = string;
            int n3 = Ik.M(this.Ui, (String)object);
            lc lc3 = we2.l.a();
            lc3.C = (short)(lc3.C | 2);
            lc2 = we2.F.a();
            lc lc4 = we2.t.a();
            while (lc2 != lc4) {
                lc2.e = new N7(n3, lc3, lc2.e);
                lc2 = lc2.h;
            }
            we2 = we2.i;
        }
        object = this.J.b;
        ((Ik)object).E(this.Ui, this.p, this.UI, this.R);
        ((Ik)object).U(this);
        lc lc5 = this.J;
        lc5.E = lc.z;
        int n4 = 0;
        while (lc5 != lc.z) {
            lc2 = lc5;
            lc5 = lc5.E;
            lc2.E = null;
            lc2.C = (short)(lc2.C | 8);
            int n5 = lc2.b.E() + lc2.u;
            if (n5 > n4) {
                n4 = n5;
            }
            N7 n7 = lc2.e;
            while (n7 != null) {
                block25: {
                    lc lc6 = n7.n.a();
                    n2 = lc2.b.Z(this.Ui, lc6.b, n7.i) ? 1 : 0;
                    try {
                        if (n2 == 0 || lc6.E != null) break block25;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                    lc6.E = lc5;
                    lc5 = lc6;
                }
                n7 = n7.P;
            }
        }
        lc2 = this.J;
        while (true) {
            block26: {
                try {
                    try {
                        if (lc2 == null) break;
                        if ((lc2.C & 0xA) != 10) break block26;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                    lc2.b.U(this);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            if ((lc2.C & 8) == 0) {
                int n6;
                lc lc7 = lc2.h;
                int n7 = lc2.n;
                try {
                    n6 = lc7 == null ? this.N.I : lc7.n;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
                int n8 = n6 - 1;
                if (n8 >= n7) {
                    try {
                        for (n2 = n7; n2 < n8; ++n2) {
                            this.N.U[n2] = 0;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                    this.N.U[n8] = -65;
                    n2 = this.m(n7, 0, 1);
                    this.c[n2] = Ik.M(this.Ui, "java/lang/Throwable");
                    this.T();
                    this.k = We.N(this.k, lc2, lc7);
                    n4 = Math.max(n4, 1);
                }
            }
            lc2 = lc2.h;
        }
        this.C = n4;
    }

    public aa I(int n2, String string, boolean bl2) {
        block7: {
            block8: {
                try {
                    try {
                        if (!bl2) break block7;
                        if (this.W != null) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                    this.W = new aN[zY.a(this.UI).length];
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            this.W[n2] = aN.H(this.Ui, string, this.W[n2]);
            return this.W[n2];
        }
        try {
            if (this.Q == null) {
                this.Q = new aN[zY.a(this.UI).length];
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
        this.Q[n2] = aN.H(this.Ui, string, this.Q[n2]);
        return this.Q[n2];
    }

    private void e(lc lc2, lc[] lcArray) {
        block5: {
            block7: {
                block6: {
                    try {
                        if (this.w == null) break block5;
                        if (this.r != 4) break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                    this.w.b.o(171, 0, null, null);
                    this.O(0, lc2);
                    lc2.a().C = (short)(lc2.a().C | 2);
                    for (lc lc3 : lcArray) {
                        this.O(0, lc3);
                        lc3.a().C = (short)(lc3.a().C | 2);
                    }
                    break block7;
                }
                if (this.r == 1) {
                    --this.D;
                    this.O(this.D, lc2);
                    for (lc lc4 : lcArray) {
                        this.O(this.D, lc4);
                    }
                }
            }
            this.R();
        }
    }

    public aa p(String string, boolean bl2) {
        try {
            if (bl2) {
                this.UC = aN.H(this.Ui, string, this.UC);
                return this.UC;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
        this.m = aN.H(this.Ui, string, this.m);
        return this.m;
    }

    public void v(lc lc2, int[] nArray, lc[] lcArray) {
        this.b = this.N.I;
        this.N.Z(171).T(null, 0, (4 - this.N.I % 4) % 4);
        lc2.D(this.N, this.b, true);
        this.N.y(lcArray.length);
        try {
            for (int i10 = 0; i10 < lcArray.length; ++i10) {
                this.N.y(nArray[i10]);
                lcArray[i10].D(this.N, this.b, true);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
        this.e(lc2, lcArray);
    }

    public aa E(int n2, rh rh2, String string, boolean bl2) {
        try {
            if (bl2) {
                this.Y = aN.h(this.Ui, n2, rh2, string, this.Y);
                return this.Y;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Nf.a(illegalArgumentException);
        }
        this.x = aN.h(this.Ui, n2, rh2, string, this.x);
        return this.x;
    }

    public void F(int n2, int n3) {
        block14: {
            block16: {
                block13: {
                    block12: {
                        try {
                            this.b = this.N.I;
                            if (n2 != 17) break block12;
                            this.N.I(n2, n3);
                            break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                    }
                    this.N.T(n2, n3);
                }
                try {
                    block15: {
                        try {
                            try {
                                if (this.w == null) break block14;
                                if (this.r == 4) break block15;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw Nf.a(illegalArgumentException);
                            }
                            if (this.r != 3) break block16;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                    }
                    this.w.b.o(n2, n3, null, null);
                    break block14;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
            }
            if (n2 != 188) {
                int n4 = this.D + 1;
                try {
                    if (n4 > this.e) {
                        this.e = n4;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Nf.a(illegalArgumentException);
                }
                this.D = n4;
            }
        }
    }

    void G(int n2, int n3) {
        this.c[n2] = n3;
    }

    public void e(int n2, int n3) {
        block19: {
            block18: {
                block17: {
                    try {
                        block16: {
                            try {
                                try {
                                    this.b = this.N.I;
                                    if (n2 > 255 || n3 > 127) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Nf.a(illegalArgumentException);
                                }
                                if (n3 >= -128) break block17;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw Nf.a(illegalArgumentException);
                            }
                        }
                        this.N.Z(196).I(132, n2).f(n3);
                        break block18;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                }
                this.N.Z(132).T(n2, n3);
            }
            try {
                block20: {
                    try {
                        try {
                            if (this.w == null) break block19;
                            if (this.r == 4) break block20;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Nf.a(illegalArgumentException);
                        }
                        if (this.r != 3) break block19;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Nf.a(illegalArgumentException);
                    }
                }
                this.w.b.o(132, n2, null, null);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
        }
        if (this.r != 0) {
            int n4 = n2 + 1;
            try {
                if (n4 > this.R) {
                    this.R = n4;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw Nf.a(illegalArgumentException);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                Nf.bb = d8.a(-1344519093594345944L, 1465160515499655888L, null).a(184734554395975L);
                Nf.hb = new HashMap<K, V>(13);
                var0 = Nf.bb ^ 121683791727702L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u00f8T\u00b5\u0080:\u007f{\u0084\u00dc}\u00db\u00bcm\u00f7\u00cc\u00b6\u00cc\u00a7/CTA\u0018~v=\u0092e\u00e6\u00f7\u00dc\u00a7\u00ec\u00aaJ\u00a2\u00f6@\u0096\u0083\u00d5\u00e8s\u000f\u00fd\u00c2i\u0097\u0001\u0018\u00ed\u0000\u0017\u00e4\u00d0\u00ca";
                var7_6 = "\u00f8T\u00b5\u0080:\u007f{\u0084\u00dc}\u00db\u00bcm\u00f7\u00cc\u00b6\u00cc\u00a7/CTA\u0018~v=\u0092e\u00e6\u00f7\u00dc\u00a7\u00ec\u00aaJ\u00a2\u00f6@\u0096\u0083\u00d5\u00e8s\u000f\u00fd\u00c2i\u0097\u0001\u0018\u00ed\u0000\u0017\u00e4\u00d0\u00ca".length();
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
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00c0\u00bb\u00b4\u000e\u00efz\r&\u00aa\u00f7MA\u0093\u0091\u009b\u000f";
                    var7_6 = "\u00c0\u00bb\u00b4\u000e\u00efz\r&\u00aa\u00f7MA\u0093\u0091\u009b\u000f".length();
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
lbl39:
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
lbl52:
                // 1 sources

                ** continue;
            }
        }
        Nf.fb = var8_3;
        Nf.gb = new Integer[9];
        Nf.j = new int[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};
    }
}

