/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.EZ;
import a.Qt;
import a.qr;
import a.t0;
import java.nio.FloatBuffer;
import java.util.List;

public class tg<T extends Qt>
extends t0<T> {
    public tg(Object object) {
        super(object);
    }

    public void m(List list) {
        qr.R(tg.U.u().w, this.H, list);
    }

    public EZ Q() {
        return new EZ(qr.l(tg.U.u().w, this.H));
    }

    public FloatBuffer j() {
        return qr.C(tg.U.u().w, this.H);
    }

    public List<Object> W() {
        return (List)qr.b(tg.U.u().w, this.H);
    }
}

