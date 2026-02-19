/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.N5;
import a.cB;
import a.i3;
import a.iz;
import a.yV;
import java.awt.Point;

class Gh
implements i3 {
    final cB Y;
    final yV l;

    private void lambda$onClick$0(cB cB2) {
        yV.K(this.l, N5.T(cB2));
        yV.j(this.l).remove(cB2.Z());
        this.l.R();
    }

    @Override
    public void B(Point point, iz iz2) {
        Ao.st.execute(() -> this.lambda$onClick$0(this.Y));
    }

    Gh(yV yV2, cB cB2) {
        this.l = yV2;
        this.Y = cB2;
    }
}

