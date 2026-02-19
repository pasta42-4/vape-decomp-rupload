/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a._V;
import a.j9;
import a.xi;
import java.util.function.Predicate;

public class x4<T extends xi>
extends xi {
    private static int[] w;
    private boolean b;
    private final xi F;
    private final j9 X;

    public static int[] J() {
        return w;
    }

    public x4(xi xi2, String string) {
        this(xi2, string, true);
    }

    @Override
    protected Predicate<_V> V() {
        return this::lambda$getEventPredicate$0;
    }

    public boolean O() {
        return super.Z();
    }

    public T n() {
        return (T)this.F;
    }

    public boolean X() {
        return this.b;
    }

    static {
        if (x4.J() == null) {
            x4.N(new int[4]);
        }
    }

    public static void N(int[] nArray) {
        w = nArray;
    }

    private boolean lambda$getEventPredicate$0(_V _V2) {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.Z() || !this.W()) break block4;
                    }
                    catch (O_ o_2) {
                        throw x4.b(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw x4.b(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }

    public x4(xi xi2, String string, boolean bl2) {
        super(string);
        this.F = xi2;
        this.b = bl2;
        this.X = new j9<x4>(this);
    }

    public j9 w() {
        return this.X;
    }

    public boolean W() {
        return this.X.o();
    }
}

