/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Fk;
import a.Fv;
import a.Gi;
import a.HQ;
import a.IA;
import a.O_;
import a.SE;
import a.Wx;
import a.XR;
import a._I;
import a._L;
import a.cI;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class z_ {
    protected String e;
    private boolean z;
    private Fv G = Fv.OFFLINE;
    private static String B;
    protected XR t;
    private UUID X;
    private String p = "";
    private int u = -1;
    private boolean m = true;
    private boolean k;
    private _L w;
    private boolean i;
    @Nullable
    private String D;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public String j() {
        return this.e;
    }

    public void J(UUID uUID, String string) {
        this.X = uUID;
        this.p = string;
    }

    public void A(String string) {
        this.e = string;
    }

    public void y(Fv fv2) {
        block14: {
            block15: {
                this.G = fv2;
                if (fv2.equals((Object)Fv.ONLINE)) {
                    Fk fk2 = new Fk(HQ.FRIENDS_ONLINE, "\u00a7f" + this.j() + " \u00a77is online", new IA("", HQ.FRIENDS_ONLINE), 0.0, 0.0, 4000L);
                    boolean bl2 = true;
                    for (Wx wx2 : SE.h.c().q()) {
                        try {
                            if (!(wx2 instanceof Fk) || !((Fk)wx2).U().equals(fk2.U())) continue;
                        }
                        catch (O_ o_2) {
                            throw z_.a(o_2);
                        }
                        bl2 = false;
                        break;
                    }
                    try {
                        if (bl2) {
                            SE.h.c().h(fk2);
                        }
                    }
                    catch (O_ o_3) {
                        throw z_.a(o_3);
                    }
                }
                try {
                    try {
                        if (!this.i) break block14;
                        if (fv2 != Fv.ONLINE) break block15;
                    }
                    catch (O_ o_4) {
                        throw z_.a(o_4);
                    }
                    SE.h.j().p(this.w);
                    Gi.I();
                    break block14;
                }
                catch (O_ o_5) {
                    throw z_.a(o_5);
                }
            }
            try {
                if (fv2 == Fv.OFFLINE) {
                    SE.h.j().y(this.w);
                    Gi.I();
                }
            }
            catch (O_ o_6) {
                throw z_.a(o_6);
            }
        }
    }

    public z_(String string) {
        this(null, string);
    }

    public int hashCode() {
        return this.t.hashCode();
    }

    public void w(boolean bl2) {
        this.k = bl2;
    }

    public z_(cI cI2) {
        this(cI2.G());
        this.G = Fv.ONLINE;
        this.X = cI2.y();
        this.p = cI2.w();
        this.u = cI2.e();
    }

    public void B(@Nullable String string) {
        this.D = string;
    }

    public void f(boolean bl2) {
        block5: {
            block4: {
                try {
                    try {
                        this.i = bl2;
                        if (!bl2) break block4;
                        if (this.G == Fv.OFFLINE) break block5;
                    }
                    catch (O_ o_2) {
                        throw z_.a(o_2);
                    }
                    SE.h.j().p(this.w);
                    Gi.I();
                    break block5;
                }
                catch (O_ o_3) {
                    throw z_.a(o_3);
                }
            }
            SE.h.j().y(this.w);
            Gi.I();
        }
    }

    public z_(XR xR2, String string) {
        this.t = xR2;
        this.A(string);
        this.w = new _L(this);
    }

    public void c(int n2) {
        this.u = n2;
    }

    public static String w() {
        return B;
    }

    public void n(_I _I2) {
        this.G = Fv.t(_I2.m());
        this.p = _I2.v();
        this.X = _I2.q();
        this.D = _I2.u();
    }

    public String X() {
        return this.p;
    }

    public int M() {
        return this.u;
    }

    public boolean h() {
        return this.i;
    }

    public void G(boolean bl2) {
        this.z = bl2;
    }

    public z_(XR xR2) {
        this(xR2, xR2.C());
    }

    public z_(_I _I2) {
        this(_I2.d());
        this.G = Fv.t(_I2.m());
        this.X = _I2.q();
        this.p = _I2.v();
        this.m = _I2.d();
        this.D = _I2.u();
    }

    public boolean W() {
        return this.m;
    }

    public boolean Z() {
        return this.k;
    }

    static {
        if (z_.w() != null) {
            z_.N("Xd9ng");
        }
    }

    public XR s() {
        return this.t;
    }

    public Fv h() {
        return this.G;
    }

    public static void N(String string) {
        B = string;
    }

    public _L u() {
        return this.w;
    }

    public boolean B() {
        return this.z;
    }

    @Nullable
    public UUID J() {
        return this.X;
    }

    public boolean equals(Object object) {
        boolean bl2;
        try {
            if (this == object) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw z_.a(o_2);
        }
        try {
            if (!(object instanceof z_)) {
                return false;
            }
        }
        catch (O_ o_3) {
            throw z_.a(o_3);
        }
        z_ z_2 = (z_)object;
        try {
            bl2 = this.t.r() == z_2.t.r();
        }
        catch (O_ o_4) {
            throw z_.a(o_4);
        }
        return bl2;
    }

    public void x(boolean bl2) {
        this.m = bl2;
    }

    @Nullable
    public String V() {
        return this.D;
    }

    public void b(String string) {
        this.p = string;
    }
}

