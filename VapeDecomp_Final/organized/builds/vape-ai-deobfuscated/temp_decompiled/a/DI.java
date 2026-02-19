/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Hc;
import a.P3;
import a.kX;

public class Di
extends Hc {
    public Di(Object object) {
        super(object);
    }

    public float h() {
        return P3.j(Di.U.u().Ll, this.H);
    }

    public void z(float f10) {
        if (kX.C() >= 23) {
            float f11 = 50.0f;
            P3.u(Di.U.u().Ll, this.H, f11 / f10);
            return;
        }
        P3.m(Di.U.u().Ll, this.H, f10);
    }

    public float R() {
        if (kX.C() >= 23) {
            float f10 = 50.0f;
            return f10 / Di.U.u().Ll.s(this.H);
        }
        return P3.U(Di.U.u().Ll, this.H);
    }

    public float v() {
        return P3.a(Di.U.u().Ll, this.H);
    }
}

