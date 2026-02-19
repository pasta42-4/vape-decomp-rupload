/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.EP;
import a.O_;
import a.Oe;
import a.QZ;
import a.Qf;
import a.Qg;
import a.eM;
import a.rt;
import java.util.function.Predicate;
import org.jetbrains.annotations.Nullable;

public class zh {
    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Nullable
    public static Qf K(Class clazz, rt rt2) {
        return zh.R(arg_0 -> zh.lambda$findSlot$0(clazz, arg_0), rt2);
    }

    public static boolean D() {
        return EP.X().B(eM.FJ);
    }

    private static boolean lambda$findSlot$0(Class clazz, Qf qf2) {
        boolean bl2;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (!qf2.r() || !qf2.y().r()) break block6;
                        }
                        catch (O_ o_2) {
                            throw zh.a(o_2);
                        }
                        if (!qf2.y().C().B(clazz)) break block6;
                    }
                    catch (O_ o_3) {
                        throw zh.a(o_3);
                    }
                    bl2 = true;
                    break block7;
                }
                catch (O_ o_4) {
                    throw zh.a(o_4);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Nullable
    public static Qf w(QZ qZ2, Predicate<Qf> predicate, int n2, int n3) {
        for (Qf qf2 : qZ2.D()) {
            int n4 = qf2.G();
            try {
                try {
                    try {
                        if (n4 < n2 || n4 > n3) continue;
                    }
                    catch (O_ o_2) {
                        throw zh.a(o_2);
                    }
                    if (!predicate.test(qf2)) continue;
                }
                catch (O_ o_3) {
                    throw zh.a(o_3);
                }
                return qf2;
            }
            catch (O_ o_4) {
                throw zh.a(o_4);
            }
        }
        return null;
    }

    @Nullable
    public static Qf R(Predicate<Qf> predicate, rt rt2) {
        Qg qg2 = EP.U();
        try {
            if (qg2.Y()) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw zh.a(o_2);
        }
        QZ qZ2 = qg2.t();
        try {
            if (qZ2.Y()) {
                return null;
            }
        }
        catch (O_ o_3) {
            throw zh.a(o_3);
        }
        return zh.w(qZ2, predicate, rt2.A(), rt2.i());
    }

    public static boolean K() {
        try {
            if (!zh.D()) {
                Oe.r(EP.N().R(), true, true);
                Oe.r(EP.N().R(), false, false);
                return true;
            }
        }
        catch (O_ o_2) {
            throw zh.a(o_2);
        }
        return false;
    }

    public static boolean y() {
        return EP.X().r();
    }

    public static boolean S() {
        block4: {
            block5: {
                try {
                    try {
                        if (!zh.y()) break block4;
                        if (!EP.X().B(eM.Yu)) break block5;
                    }
                    catch (O_ o_2) {
                        throw zh.a(o_2);
                    }
                    return false;
                }
                catch (O_ o_3) {
                    throw zh.a(o_3);
                }
            }
            EP.U().E();
            return true;
        }
        return false;
    }
}

