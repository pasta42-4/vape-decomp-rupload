/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package a;

import a.SE;
import a._8;
import a._G;
import a.hM;
import a.ht;
import com.google.gson.JsonObject;

public abstract class _q
extends _G {
    private static ht[] j;
    private boolean o = true;

    public static void F(ht[] htArray) {
        j = htArray;
    }

    public abstract JsonObject l();

    public void U(boolean bl2) {
        this.o = bl2;
        SE.h.j().r();
    }

    public static ht[] u() {
        return j;
    }

    public String x() {
        return this.n();
    }

    public abstract String n();

    public String H() {
        return this.x();
    }

    static {
        if (_q.u() == null) {
            _q.F(new ht[3]);
        }
    }

    public abstract _8 p(JsonObject var1);

    public boolean R() {
        return true;
    }

    public _q() {
        super(hM.FRIEND);
    }

    public boolean F() {
        return this.o;
    }
}

