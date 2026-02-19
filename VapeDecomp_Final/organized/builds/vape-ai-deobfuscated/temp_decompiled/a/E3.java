/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.EP;
import a.KX;
import a.O_;
import a.rT;
import java.util.HashMap;

public class e3 {
    private boolean x;
    private HashMap<Integer, Boolean> T = new HashMap();
    private boolean F;
    private int a;
    private long M = System.nanoTime();

    public int a() {
        return this.a;
    }

    public long O() {
        return this.M;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public boolean I() {
        return this.x;
    }

    public void h(int n2) {
        this.T.put(n2, false);
    }

    public boolean I(int n2) {
        return this.T.getOrDefault(n2, false);
    }

    public boolean g() {
        return this.F;
    }

    public void V(int n2, boolean bl2) {
        boolean bl3 = this.T.getOrDefault(n2, false);
        try {
            if (bl3 != bl2) {
                this.S(n2, bl2);
            }
        }
        catch (O_ o_2) {
            throw e3.a(o_2);
        }
        this.T.put(n2, bl2);
    }

    private void S(int n2, boolean bl2) {
        this.M = System.nanoTime();
        this.F = bl2;
        this.a = n2;
        KX kX2 = new KX(n2, bl2);
        kX2.fire();
        this.x = kX2.isCanceled();
        if (!Ao.K.P) {
            int n3 = rT.E(EP.N().e());
            try {
                if (n2 == n3) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw e3.a(o_2);
            }
            this.x = true;
        }
    }
}

