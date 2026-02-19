/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.fB;
import a.w6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class iw {
    private HashMap<w6, Boolean> I;
    private List<w6> g = new ArrayList<w6>();
    private static boolean P;

    static {
        if (iw.e()) {
            iw.G(true);
        }
    }

    public void x(w6 w62) {
        try {
            if (this.Y().contains(w62)) {
                this.d(w62);
                this.B(w62);
            }
        }
        catch (O_ o_2) {
            throw iw.a(o_2);
        }
    }

    public static boolean f() {
        boolean bl2 = iw.e();
        try {
            if (!bl2) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw iw.a(o_2);
        }
        return false;
    }

    public void B(w6 w62) {
        try {
            if (this.g.contains(w62)) {
                return;
            }
        }
        catch (O_ o_2) {
            throw iw.a(o_2);
        }
        this.g.add(w62);
    }

    public static void G(boolean bl2) {
        P = bl2;
    }

    public void d(w6 w62) {
        this.g.remove(w62);
    }

    public static boolean e() {
        return P;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void G(w6 w62, w6 w63) {
        block10: {
            try {
                try {
                    if (this.g.contains(w62) && this.g.contains(w63)) break block10;
                }
                catch (O_ o_2) {
                    throw iw.a(o_2);
                }
                return;
            }
            catch (O_ o_3) {
                throw iw.a(o_3);
            }
        }
        if (w63 instanceof fB) {
            int n2 = this.g.indexOf(w62);
            fB fB2 = (fB)w63;
            ArrayList<fB> arrayList = fB2.T().V();
            for (int i10 = 0; i10 < arrayList.size(); ++i10) {
                fB fB3 = arrayList.get(i10);
                try {
                    this.g.remove(fB3);
                    if (n2 + i10 + 1 > this.g.size()) {
                        this.g.add(fB3);
                        continue;
                    }
                }
                catch (O_ o_4) {
                    throw iw.a(o_4);
                }
                this.g.add(n2 + i10 + 1, fB3);
            }
        } else {
            this.g.remove(w63);
            int n3 = this.g.indexOf(w62);
            this.g.add(n3 + 1, w63);
        }
    }

    public List<w6> Y() {
        return this.g;
    }

    public iw() {
        this.I = new HashMap();
    }
}

