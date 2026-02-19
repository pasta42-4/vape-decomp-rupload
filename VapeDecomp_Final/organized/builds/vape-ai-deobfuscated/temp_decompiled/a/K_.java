/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Gi;
import a.O_;
import a.XR;
import a._I;
import a.z_;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

public class k_ {
    private final Set<z_> l = new HashSet<z_>();

    @Nullable
    public z_ p(String string) {
        for (z_ z_2 : this.l) {
            try {
                if (!z_2.j().equals(string)) continue;
                return z_2;
            }
            catch (O_ o_2) {
                throw k_.a(o_2);
            }
        }
        return null;
    }

    public Set<z_> q() {
        return this.l;
    }

    @Nullable
    public z_ u(XR xR2) {
        for (z_ z_2 : this.l) {
            try {
                if (z_2.s().r() != xR2.r()) continue;
                return z_2;
            }
            catch (O_ o_2) {
                throw k_.a(o_2);
            }
        }
        return null;
    }

    public void O() {
        this.l.clear();
        Gi.v();
    }

    public void X(z_ z_2) {
        this.l.add(z_2);
        Gi.v();
    }

    public void f(z_ z_2) {
        this.l.remove(z_2);
        Gi.v();
    }

    @Nullable
    public z_ W(_I _I2) {
        return this.u(_I2.d());
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

