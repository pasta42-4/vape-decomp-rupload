/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.O_;
import a.Tf;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public class sp {
    private boolean s;
    private final boolean p;
    private final boolean V;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public boolean T() {
        return this.s;
    }

    public void k(boolean bl2) {
        this.s = bl2;
    }

    public boolean C() {
        return this.V;
    }

    sp(boolean bl2, boolean bl3, boolean bl4) {
        this.p = bl2;
        this.s = bl3;
        this.V = bl4;
    }

    static sp T(Tf tf2) {
        return sp.s(tf2);
    }

    public boolean e() {
        return this.p;
    }

    @Nullable
    @Contract(value="!null -> !null; null -> null")
    private static sp s(@Nullable Tf tf2) {
        try {
            if (tf2 == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw sp.a(o_2);
        }
        return new sp(tf2.J(), tf2.n(), tf2.s());
    }
}

