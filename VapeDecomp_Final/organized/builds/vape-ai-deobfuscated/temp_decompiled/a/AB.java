/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.xi;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ab {
    protected xi U;
    private final AtomicBoolean j;
    private final boolean Q;
    private final AtomicBoolean D;
    private static String[] V;
    protected xi q;
    private final HashMap<xi, Integer> g = new HashMap();

    protected boolean B(xi xi2) {
        boolean bl2;
        int n2 = this.g.getOrDefault(xi2, 0);
        int n3 = this.g.getOrDefault(this.q, 0);
        try {
            bl2 = n2 > n3;
        }
        catch (O_ o_2) {
            throw ab.a(o_2);
        }
        return bl2;
    }

    public HashMap<xi, Integer> T() {
        return this.g;
    }

    static {
        if (ab.Z() == null) {
            ab.c(new String[1]);
        }
    }

    public void y(xi xi2, int n2) {
        this.g.put(xi2, n2);
    }

    public void X() {
        this.D.set(false);
        this.U = null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public xi O() {
        return this.q;
    }

    public void v(xi xi2) {
        this.D.set(true);
        this.U = xi2;
    }

    protected boolean R(xi xi2) {
        block8: {
            block10: {
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    if (!this.Q) break block8;
                                    if (this.j.get()) break block9;
                                }
                                catch (O_ o_2) {
                                    throw ab.a(o_2);
                                }
                                if (!this.l()) break block10;
                            }
                            catch (O_ o_3) {
                                throw ab.a(o_3);
                            }
                            if (this.c(xi2)) break block10;
                        }
                        catch (O_ o_4) {
                            throw ab.a(o_4);
                        }
                    }
                    return false;
                }
                catch (O_ o_5) {
                    throw ab.a(o_5);
                }
            }
            this.X();
        }
        this.q = xi2;
        this.j.set(true);
        return true;
    }

    public xi r() {
        return this.U;
    }

    public void d() {
        this.j.set(true);
    }

    public boolean l() {
        return this.D.get();
    }

    protected boolean P(xi xi2) {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (this.q == null || !this.q.equals(xi2)) break block4;
                    }
                    catch (O_ o_2) {
                        throw ab.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw ab.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public static void c(String[] stringArray) {
        V = stringArray;
    }

    public void Z() {
        this.j.set(false);
    }

    public static String[] Z() {
        return V;
    }

    public ab(boolean bl2) {
        this.D = new AtomicBoolean();
        this.j = new AtomicBoolean();
        this.Q = bl2;
    }

    protected boolean t(xi xi2) {
        block7: {
            block8: {
                try {
                    try {
                        if (!this.Q) break block7;
                        if (!this.c(xi2)) break block8;
                    }
                    catch (O_ o_2) {
                        throw ab.a(o_2);
                    }
                    this.X();
                    return true;
                }
                catch (O_ o_3) {
                    throw ab.a(o_3);
                }
            }
            try {
                if (!this.P(xi2)) {
                    return false;
                }
            }
            catch (O_ o_4) {
                throw ab.a(o_4);
            }
        }
        this.q = null;
        this.j.set(false);
        return true;
    }

    public boolean A() {
        return this.j.get();
    }

    protected boolean c(xi xi2) {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (this.U == null || !this.U.equals(xi2)) break block4;
                    }
                    catch (O_ o_2) {
                        throw ab.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw ab.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public ab() {
        this(false);
    }

    public void H(boolean bl2) {
        this.j.set(bl2);
    }

    public boolean r(xi xi2) {
        block15: {
            try {
                if (this.R(xi2)) {
                    return true;
                }
            }
            catch (O_ o_2) {
                throw ab.a(o_2);
            }
            if (this.Q) {
                boolean bl2;
                block16: {
                    boolean bl3 = this.l();
                    boolean bl4 = this.c(xi2);
                    bl2 = this.B(xi2);
                    try {
                        try {
                            try {
                                try {
                                    if (!this.A() || this.P(xi2)) break block15;
                                }
                                catch (O_ o_3) {
                                    throw ab.a(o_3);
                                }
                                if (!bl3) break block16;
                            }
                            catch (O_ o_4) {
                                throw ab.a(o_4);
                            }
                            if (bl4) break block16;
                        }
                        catch (O_ o_5) {
                            throw ab.a(o_5);
                        }
                        return false;
                    }
                    catch (O_ o_6) {
                        throw ab.a(o_6);
                    }
                }
                try {
                    if (!bl2) {
                        return false;
                    }
                }
                catch (O_ o_7) {
                    throw ab.a(o_7);
                }
                this.v(xi2);
            }
        }
        return false;
    }
}

