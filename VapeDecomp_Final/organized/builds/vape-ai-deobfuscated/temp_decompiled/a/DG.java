/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.D0;
import a.EV;
import a.Ef;
import a.QF;
import java.util.List;

public class Dg
extends D0 {
    private static String g;

    public static void n(String string) {
        g = string;
    }

    public Ef N() {
        return new Ef(Dg.U.u().di.n(this.H));
    }

    public Dg(Object object) {
        super(object);
    }

    @Override
    public QF I(int n2) {
        return new QF(Dg.U.u().di.U(this.H, n2));
    }

    public List f() {
        return super.L();
    }

    public EV G() {
        return new EV(Dg.U.u().di.V(this.H));
    }

    public static String d() {
        return g;
    }

    public void c(int n2, QF qF2) {
        Dg.U.u().di.t(this.H, n2, qF2);
    }

    static {
        if (Dg.d() == null) {
            Dg.n("ClBqN");
        }
    }
}

