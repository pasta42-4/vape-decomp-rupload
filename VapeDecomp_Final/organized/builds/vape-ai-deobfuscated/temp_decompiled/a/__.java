/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.KL;
import a.Kf;
import a.O_;
import a._K;

public class __
extends _K {
    public static void call() {
        try {
            if (Thread.currentThread().equals(KL.W.R())) {
                new Kf().fire();
            }
        }
        catch (O_ o_2) {
            throw __.a(o_2);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

