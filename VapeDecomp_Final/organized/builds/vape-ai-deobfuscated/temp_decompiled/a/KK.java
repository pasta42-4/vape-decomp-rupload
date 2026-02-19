/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.UnmodifiableView
 */
package a;

import a.O_;
import a.Oq;
import a.SE;
import a.kw;
import a.xi;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.UnmodifiableView;

public class kk
extends kw {
    private static int Q;
    private List<String> M;

    public static void p(int n2) {
        Q = n2;
    }

    public static int Q() {
        return Q;
    }

    static {
        if (kk.Q() == 0) {
            kk.p(10);
        }
    }

    public static int X() {
        int n2 = kk.Q();
        try {
            if (n2 == 0) {
                return 112;
            }
        }
        catch (O_ o_2) {
            throw kk.a(o_2);
        }
        return 0;
    }

    @Override
    public @UnmodifiableView List<String> m() {
        if (this.M == null) {
            this.M = new ArrayList<String>();
            for (xi xi2 : SE.h.U().q()) {
                try {
                    if (xi2.t() == Oq.p) {
                        continue;
                    }
                }
                catch (O_ o_2) {
                    throw kk.a(o_2);
                }
                this.M.add(xi2.O());
            }
        }
        return this.M;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

