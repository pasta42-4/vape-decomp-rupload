/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.B9;
import a.O_;
import a.eB;

public abstract class rx
implements Runnable {
    private B9 N;
    private eB i;

    @Override
    public void run() {
        try {
            if (this.i == null) {
                this.i = new eB(this, null);
                this.i.start();
            }
        }
        catch (O_ o_2) {
            throw rx.a(o_2);
        }
    }

    public void H(B9 b92) {
        this.N = b92;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public abstract void d();

    static B9 P(rx rx2) {
        return rx2.N;
    }

    public boolean F() {
        boolean bl2;
        try {
            bl2 = this.i != null;
        }
        catch (O_ o_2) {
            throw rx.a(o_2);
        }
        return bl2;
    }

    public rx(B9 b92) {
        this.N = b92;
    }

    public final void o() {
        this.i = null;
        this.d();
    }
}

