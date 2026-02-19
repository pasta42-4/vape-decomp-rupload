/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Ao;
import a.fE;
import a.hQ;
import a.yQ;
import org.jetbrains.annotations.Nullable;

public class yp
extends hQ {
    @Nullable
    protected fE D;
    private static int[] Y;
    protected final yQ L;

    @Nullable
    public fE J() {
        return this.D;
    }

    public static void b(int[] nArray) {
        Y = nArray;
    }

    public yp(yQ yQ2) {
        this.L = yQ2;
        this.C(this::M);
    }

    public static int[] y() {
        return Y;
    }

    private void M() {
        this.D = Ao.v(this, this.L, fE.class);
        this.D.d(true);
    }

    public yQ t() {
        return this.L;
    }

    static {
        if (yp.y() != null) {
            yp.b(new int[5]);
        }
    }
}

