/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.H5;
import a.H9;
import a.HP;
import a.JC;
import a.Jl;
import a.Nj;
import a.O_;
import a.W3;
import a.XF;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Nx {
    private List<W3> z = new ArrayList<W3>();
    private static int[] T;
    private Nj b;

    public static int[] M() {
        return T;
    }

    public void o() {
        XF xF2 = this.b.V;
        ListIterator<H5> listIterator = xF2.E();
        while (listIterator.hasNext()) {
            H5 h52 = (H5)listIterator.next();
            this.k(h52);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static void F(int[] nArray) {
        T = nArray;
    }

    public Nx(Nj nj) {
        this.b = nj;
    }

    public List<W3> T() {
        return this.z;
    }

    static {
        if (Nx.M() != null) {
            Nx.F(new int[4]);
        }
    }

    private void k(H5 h52) {
        try {
            if (h52 instanceof H9) {
                this.z.add(Jl.h((H9)h52));
            }
        }
        catch (O_ o_2) {
            throw Nx.a(o_2);
        }
        try {
            if (h52 instanceof HP) {
                this.z.add(JC.Q((HP)h52));
            }
        }
        catch (O_ o_3) {
            throw Nx.a(o_3);
        }
    }
}

