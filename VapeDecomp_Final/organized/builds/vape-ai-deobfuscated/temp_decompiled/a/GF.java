/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.I4;
import a.R8;
import java.util.UUID;

public class Gf
implements I4 {
    private String a;
    private UUID n;

    public Gf() {
    }

    public String d() {
        return this.a;
    }

    @Override
    public void y(R8 r82) {
        r82.i(this.n);
        r82.J(this.a);
    }

    public Gf(UUID uUID, String string) {
        this.n = uUID;
        this.a = string;
    }

    @Override
    public void r(R8 r82) {
        this.n = r82.x();
        this.a = r82.b(16);
    }

    public UUID w() {
        return this.n;
    }
}

