/*
 * Decompiled with CFR 0.152.
 */
package a;

import a._H;
import a.a4;
import a.eF;
import a.eR;
import a.em;

public class eg
extends em {
    private static final long serialVersionUID = 1L;

    @Override
    public void z(a4 a42) throws _H {
        a42.I(this);
    }

    private eg(int n2, eR eR2, eF eF2) {
        super(n2, eR2, eF2);
    }

    public static eg y(int n2, eR eR2, eR eR3) {
        return new eg(n2, eR2, new eF(eR3));
    }
}

