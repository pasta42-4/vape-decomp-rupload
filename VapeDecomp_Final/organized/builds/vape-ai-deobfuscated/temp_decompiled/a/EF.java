/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Bg;
import a.HR;
import a.KB;
import a.OY;
import a.O_;
import a.SE;
import a.Wl;
import a.ZB;
import a._q;
import a.sM;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

class ef
implements sM {
    private Set<_q> w;
    private final Map<String, Wl<String, Bg>> D = new HashMap<String, Wl<String, Bg>>();

    private Wl lambda$getReplacedDisplayName$0(String string, Iterable iterable, String string2, Wl wl2) {
        try {
            if (wl2 == null) {
                return new Wl<String, Bg>(this.i(string, iterable), new Bg());
            }
        }
        catch (O_ o_2) {
            throw ef.b(o_2);
        }
        Bg bg2 = (Bg)wl2.h();
        try {
            if (bg2.m(1000L)) {
                bg2.m();
                return wl2.f(this.i(string, iterable));
            }
        }
        catch (O_ o_3) {
            throw ef.b(o_3);
        }
        return wl2;
    }

    private Set<_q> n() {
        return this.h().v().stream().filter(_q::F).collect(Collectors.toSet());
    }

    Set<_q> q() {
        return this.h().v();
    }

    @OY
    public void h(KB kB2) {
        this.w = this.n();
    }

    boolean H() {
        return this.h().r.s();
    }

    private HR h() {
        return SE.h.j();
    }

    boolean B() {
        boolean bl2;
        try {
            bl2 = !this.q().isEmpty();
        }
        catch (O_ o_2) {
            throw ef.b(o_2);
        }
        return bl2;
    }

    private String i(String string, Iterable<_q> iterable) {
        String string2 = string;
        for (_q _q2 : iterable) {
            String string3 = _q2.n().toLowerCase();
            String string4 = _q2.x();
            try {
                if (string3.equalsIgnoreCase(string4)) {
                    continue;
                }
            }
            catch (O_ o_2) {
                throw ef.b(o_2);
            }
            if (!ZB.U(string2, string3)) continue;
            string2 = ZB.R(string2, string3, string4);
        }
        return string2;
    }

    ef() {
        this.w = new HashSet<_q>();
    }

    @Nullable
    String t(String string, Iterable<_q> iterable) {
        String string2;
        try {
            string2 = string == null ? null : (String)this.D.compute(string, (arg_0, arg_1) -> this.lambda$getReplacedDisplayName$0(string, iterable, arg_0, arg_1)).C();
        }
        catch (O_ o_2) {
            throw ef.b(o_2);
        }
        return string2;
    }

    Set<_q> p() {
        try {
            if (this.w == null) {
                this.w = this.n();
            }
        }
        catch (O_ o_2) {
            throw ef.b(o_2);
        }
        return this.w;
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }

    boolean a() {
        return this.h().Z.s();
    }
}

