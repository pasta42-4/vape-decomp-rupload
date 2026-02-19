/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.G5;
import a.IG;
import a.X_;
import a.fc;
import java.awt.Color;

class f3
extends fc {
    private final String b;
    private final String E;

    @Override
    public void G() {
        super.G();
        X_.B(Color.WHITE, (float)(this.G() + 10.0), (float)(this.W() + this.b() / 2.0 - 3.0), this.b, 6.0f, 6.0f, false);
        G5 g5 = this.L(0.8);
        g5.R(this.E, this.G() + 10.0 + 6.0 + 5.0, this.W() + this.b() / 2.0 - g5.B(this.E) / 2.0, f3.M.c);
    }

    public f3(String string, String string2, IG iG2) {
        super(iG2);
        this.E = string;
        this.b = string2;
    }
}

