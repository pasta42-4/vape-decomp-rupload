/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Jh;
import a.W_;
import a.c0;
import a.ig;
import org.jetbrains.annotations.Nullable;

public class Gk {
    @Nullable
    private ig T;
    @Nullable
    private Jh S;
    @Nullable
    private c0 j;

    public Gk A(@Nullable c0 c02) {
        this.j = c02;
        return this;
    }

    public Gk l(@Nullable ig ig2) {
        this.T = ig2;
        return this;
    }

    public Gk o(@Nullable Jh jh2) {
        this.S = jh2;
        return this;
    }

    public W_ l() {
        return new W_(this.S, this.j, this.T);
    }
}

