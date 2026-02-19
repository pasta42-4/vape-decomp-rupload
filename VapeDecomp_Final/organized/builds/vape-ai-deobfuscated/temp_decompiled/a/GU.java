/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.I4;
import a.R8;
import a.ht;
import a.iG;

public class Gu
implements I4 {
    private static ht[] n;
    private Object r;
    private iG x;

    @Override
    public void r(R8 r82) {
        this.x = r82.L(iG.class);
        this.r = this.x.S().apply(r82);
    }

    public Gu(iG iG2, Object object) {
        this.x = iG2;
        this.r = object;
    }

    public static ht[] f() {
        return n;
    }

    public static void z(ht[] htArray) {
        n = htArray;
    }

    public Object s() {
        return this.r;
    }

    @Override
    public void y(R8 r82) {
        r82.N(this.x);
        this.x.m().accept(r82, this.r);
    }

    public iG p() {
        return this.x;
    }

    public Gu() {
    }

    static {
        if (Gu.f() == null) {
            Gu.z(new ht[5]);
        }
    }
}

