/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a._H;
import a.a4;
import a.eR;

public class ez
extends eR {
    protected eR w;
    protected eR Z;
    private static final long serialVersionUID = 1L;

    public ez(eR eR2, eR eR3) {
        this.Z = eR2;
        this.w = eR3;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public eR Z() {
        return this.Z;
    }

    @Override
    public eR u() {
        return this.w;
    }

    @Override
    public void z(a4 a42) throws _H {
        a42.g(this);
    }

    @Override
    public String toString() {
        String string;
        StringBuilder stringBuilder;
        String string2;
        StringBuilder stringBuilder2;
        StringBuilder stringBuilder3 = new StringBuilder();
        try {
            stringBuilder3.append("(<Pair> ");
            stringBuilder2 = stringBuilder3;
            string2 = this.Z == null ? "<null>" : this.Z.toString();
        }
        catch (O_ o_2) {
            throw ez.a(o_2);
        }
        try {
            stringBuilder2.append(string2);
            stringBuilder3.append(" . ");
            stringBuilder = stringBuilder3;
            string = this.w == null ? "<null>" : this.w.toString();
        }
        catch (O_ o_3) {
            throw ez.a(o_3);
        }
        stringBuilder.append(string);
        stringBuilder3.append(')');
        return stringBuilder3.toString();
    }

    @Override
    public void M(eR eR2) {
        this.Z = eR2;
    }
}

