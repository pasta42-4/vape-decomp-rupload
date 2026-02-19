/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Hp;
import a.Qh;
import a.V4;
import a.oP;
import a.pe;

public class io
implements Hp {
    private final Qh a;
    private final oP k;

    @Override
    public boolean fire() {
        V4 v42 = this.a.G(this.k);
        pe pe2 = new pe(v42.M());
        return pe2.fire();
    }

    public io(Object object, Object object2) {
        this.a = new Qh(object);
        this.k = new oP(object2);
    }
}

