/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.K8;
import a.OY;
import a.O_;
import a.eM;
import a.ef;
import a.o9;
import a.ob;
import a.or;
import a.pY;
import a.pl;
import java.util.HashSet;
import java.util.Set;

public final class es
extends ef {
    private static O_ a(O_ o_2) {
        return o_2;
    }

    @OY
    public void q(pl pl2) {
        ob ob2;
        block16: {
            block15: {
                try {
                    block14: {
                        try {
                            try {
                                if (!this.a() || !this.H()) break block14;
                            }
                            catch (O_ o_2) {
                                throw es.a(o_2);
                            }
                            if (this.B()) break block15;
                        }
                        catch (O_ o_3) {
                            throw es.a(o_3);
                        }
                    }
                    return;
                }
                catch (O_ o_4) {
                    throw es.a(o_4);
                }
            }
            ob2 = pl2.getDisplayName();
            try {
                try {
                    if (!ob2.Y() && ob2.B(eM.Fk)) break block16;
                }
                catch (O_ o_5) {
                    throw es.a(o_5);
                }
                return;
            }
            catch (O_ o_6) {
                throw es.a(o_6);
            }
        }
        o9 o92 = new o9(ob2.M());
        this.O(o92);
        for (ob ob3 : o92.F()) {
            if (ob3.Y()) continue;
            try {
                if (!ob3.B(eM.Fk)) {
                    continue;
                }
            }
            catch (O_ o_7) {
                throw es.a(o_7);
            }
            o9 o93 = new o9(ob3.M());
            this.O(o93);
        }
    }

    private void O(ob ob2) {
        Set<o9> set = this.P(ob2, new HashSet<o9>());
        for (o9 o92 : set) {
            String string = o92.h();
            String string2 = this.t(string, this.p());
            try {
                try {
                    if (string2 == null || string.equalsIgnoreCase(string2)) continue;
                }
                catch (O_ o_2) {
                    throw es.a(o_2);
                }
                o92.j(string2);
            }
            catch (O_ o_3) {
                throw es.a(o_3);
            }
        }
    }

    private Set<o9> P(ob ob2, Set<o9> set) {
        if (ob2.B(eM.EY)) {
            or or2 = new or(ob2.M());
            for (Object object : or2.P()) {
                ob ob3 = new ob(object);
                if (ob3.Y()) continue;
                try {
                    if (!ob3.B(eM.V_)) {
                        continue;
                    }
                }
                catch (O_ o_2) {
                    throw es.a(o_2);
                }
                this.P(ob3, set);
            }
        }
        for (ob ob4 : ob2.F()) {
            Object object;
            if (ob4.Y()) continue;
            try {
                if (!ob4.B(eM.Fk)) {
                    continue;
                }
            }
            catch (O_ o_3) {
                throw es.a(o_3);
            }
            object = new o9(ob4.M());
            this.P((ob)object, set);
        }
        try {
            if (ob2.B(eM.Fk)) {
                set.add(new o9(ob2.M()));
            }
        }
        catch (O_ o_4) {
            throw es.a(o_4);
        }
        return set;
    }

    @OY
    public void b(pY pY2) {
        block12: {
            block11: {
                try {
                    block10: {
                        try {
                            try {
                                if (!this.a() || !this.H()) break block10;
                            }
                            catch (O_ o_2) {
                                throw es.a(o_2);
                            }
                            if (this.B()) break block11;
                        }
                        catch (O_ o_3) {
                            throw es.a(o_3);
                        }
                    }
                    return;
                }
                catch (O_ o_4) {
                    throw es.a(o_4);
                }
            }
            String string = pY2.getDisplayName();
            String string2 = this.t(string, this.p());
            try {
                try {
                    if (string2 == null || string.equalsIgnoreCase(string2)) break block12;
                }
                catch (O_ o_5) {
                    throw es.a(o_5);
                }
                pY2.setDisplayName(string2);
            }
            catch (O_ o_6) {
                throw es.a(o_6);
            }
        }
    }

    @OY
    public void X(K8 k82) {
        block4: {
            try {
                try {
                    if (this.H() && this.B()) break block4;
                }
                catch (O_ o_2) {
                    throw es.a(o_2);
                }
                return;
            }
            catch (O_ o_3) {
                throw es.a(o_3);
            }
        }
        this.O(k82.getMessage());
    }
}

