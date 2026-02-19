/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package a;

import a.kw;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class ks
extends kw {
    private List<String> F = new ArrayList<String>();

    public void k(@NotNull List<String> list) {
        this.F = list;
        this.R("");
    }

    public ks() {
        this.R("");
    }

    @Override
    public List<String> m() {
        return this.F;
    }

    public ks(List<String> list) {
        this.F = list;
        this.R("");
    }
}

