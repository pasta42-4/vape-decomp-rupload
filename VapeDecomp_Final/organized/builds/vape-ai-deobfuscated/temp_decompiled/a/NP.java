/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.AV;
import a.DT;
import a.NA;

class Np
extends NA {
    final AV s;
    final Float y;

    @Override
    public void v(float f10, float f11) {
        super.v(f10, this.y.floatValue());
    }

    Np(AV aV2, DT dT, Float f10) {
        this.s = aV2;
        this.y = f10;
        super(dT);
    }
}

