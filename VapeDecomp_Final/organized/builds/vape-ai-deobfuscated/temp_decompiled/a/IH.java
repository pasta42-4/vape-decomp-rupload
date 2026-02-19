/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.UnmodifiableView
 */
package a;

import a.BW;
import a.O_;
import a.Oa;
import a.V4;
import a.h4;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

public abstract class ih
implements BW {
    private final String Q;
    private static boolean H;
    private final String l;
    private final String D;
    @Nullable
    private final Comparator<V4> v;
    private final List<h4> a;

    @Override
    public @UnmodifiableView List<h4> V() {
        return this.a;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public String O() {
        return this.l;
    }

    public static void x(boolean bl2) {
        H = bl2;
    }

    @Override
    public String s() {
        return this.D;
    }

    static {
        if (!ih.i()) {
            ih.x(true);
        }
    }

    public static boolean i() {
        return H;
    }

    protected ih(Oa<?> oa2) {
        this.D = oa2.F();
        this.l = oa2.P();
        this.Q = oa2.g();
        this.v = oa2.K();
        this.a = oa2.G();
    }

    public static boolean j() {
        boolean bl2 = ih.i();
        try {
            if (!bl2) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw ih.a(o_2);
        }
        return false;
    }

    @Override
    public String t() {
        return this.Q;
    }

    @Override
    public Comparator<V4> V() {
        return this.v;
    }
}

