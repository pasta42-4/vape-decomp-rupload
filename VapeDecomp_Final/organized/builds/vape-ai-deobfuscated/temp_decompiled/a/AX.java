/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Jk;
import a.Jw;
import a.O_;
import a.kX;

public class ax {
    private static Jw A;

    public static Jw E() {
        try {
            if (A == null) {
                A = ax.Z();
            }
        }
        catch (O_ o_2) {
            throw ax.a(o_2);
        }
        return A;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Jw Z() {
        Jk jk2 = null;
        switch (kX.C()) {
            case 35: {
                jk2 = new Jk(35);
            }
        }
        return jk2;
    }
}

