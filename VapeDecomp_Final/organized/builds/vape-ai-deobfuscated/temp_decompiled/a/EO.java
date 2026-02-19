/*
 * Decompiled with CFR 0.152.
 */
package a;

import a._H;
import a.a4;
import a.eR;

public class eo
extends eR {
    protected String d;
    private static final long serialVersionUID = 1L;

    @Override
    public void z(a4 a42) throws _H {
        a42.z(this);
    }

    public eo(String string) {
        this.d = string;
    }

    public String t() {
        return this.d;
    }

    @Override
    public String toString() {
        return "\"" + this.d + "\"";
    }
}

