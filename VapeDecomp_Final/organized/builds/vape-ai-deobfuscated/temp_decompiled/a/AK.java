/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.GX;
import a.Gj;
import a.O_;

public final class ak {
    private static GX L;
    private static boolean E;
    private static boolean F;
    private static boolean K;

    public static void j(Throwable throwable) {
        L.s(throwable);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    static {
        F = true;
        ak.k(false);
        K = false;
        L = new Gj();
    }

    public static boolean J() {
        boolean bl2 = ak.U();
        try {
            if (!bl2) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw ak.a(o_2);
        }
        return false;
    }

    public static boolean U() {
        return E;
    }

    public static void k(boolean bl2) {
        E = bl2;
    }
}

