/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Io;
import a.WR;
import a.e4;
import a.h4;
import java.util.ArrayList;
import java.util.List;

public class ed {
    private String T;
    private final List<Io> g = new ArrayList<Io>();
    private final List<h4> e = new ArrayList<h4>();

    public ed h(WR wR2) {
        this.g.add(wR2.X());
        return this;
    }

    public ed b(h4 h42) {
        this.e.add(h42);
        return this;
    }

    public e4 G() {
        return new e4(this.T, this.g, this.e);
    }

    public ed c(Io io2) {
        this.g.add(io2);
        return this;
    }

    public ed A(String string) {
        this.T = string;
        return this;
    }
}

