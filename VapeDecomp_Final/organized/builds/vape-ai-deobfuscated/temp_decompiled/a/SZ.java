/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.I4;
import a.R8;

public class sz
implements I4 {
    private int h;

    @Override
    public void y(R8 r82) {
        r82.e(this.h);
    }

    public int o() {
        return this.h;
    }

    public sz() {
    }

    public sz(int n2) {
        this.h = n2;
    }

    @Override
    public void r(R8 r82) {
        this.h = r82.U();
    }
}

