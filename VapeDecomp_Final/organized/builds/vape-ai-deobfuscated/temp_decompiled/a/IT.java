/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.EP;
import a.Na;
import a.O_;
import a._2;
import a.sM;

public class it
implements sM {
    private static float z;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static boolean H(float f10, boolean bl2) {
        boolean bl3;
        block9: {
            try {
                if (Na.MC_1_12_2.Q()) {
                    return true;
                }
            }
            catch (O_ o_2) {
                throw it.a(o_2);
            }
            try {
                try {
                    if (bl2 || !_2.g.A()) break block9;
                }
                catch (O_ o_3) {
                    throw it.a(o_3);
                }
                return false;
            }
            catch (O_ o_4) {
                throw it.a(o_4);
            }
        }
        float f11 = EP.U().X(f10);
        try {
            bl3 = f11 == 1.0f;
        }
        catch (O_ o_5) {
            throw it.a(o_5);
        }
        return bl3;
    }

    public static boolean y(float f10) {
        return it.H(f10, false);
    }
}

