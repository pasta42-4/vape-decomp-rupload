/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.Oc;
import a.QX;
import a.V4;
import a.h4;
import a.ih;
import a.rp;

public class i0
extends ih {
    i0(Oc oc2) {
        super(oc2);
    }

    @Override
    public boolean z(rp rp2) {
        boolean bl2;
        block14: {
            block12: {
                block15: {
                    QX qX2;
                    V4 v42;
                    block13: {
                        QX qX3;
                        h4 h42 = rp2.i();
                        v42 = rp2.W();
                        try {
                            qX3 = v42 != null ? v42.C() : null;
                        }
                        catch (O_ o_2) {
                            throw i0.b(o_2);
                        }
                        qX2 = qX3;
                        bl2 = false;
                        try {
                            try {
                                try {
                                    if (this.V().isEmpty()) break block12;
                                    if (h42 == null) break block13;
                                }
                                catch (O_ o_3) {
                                    throw i0.b(o_3);
                                }
                                if (this.V().contains(h42)) break block13;
                                break block14;
                            }
                            catch (O_ o_4) {
                                throw i0.b(o_4);
                            }
                        }
                        catch (O_ o_5) {
                            throw i0.b(o_5);
                        }
                    }
                    try {
                        try {
                            if (v42 == null || !this.V().stream().noneMatch(arg_0 -> i0.lambda$isAvailableToItem$0(v42, qX2, arg_0))) break block15;
                            break block14;
                        }
                        catch (O_ o_6) {
                            throw i0.b(o_6);
                        }
                    }
                    catch (O_ o_7) {
                        throw i0.b(o_7);
                    }
                }
                bl2 = true;
                break block14;
            }
            bl2 = true;
        }
        return bl2;
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }

    private static boolean lambda$isAvailableToItem$0(V4 v42, QX qX2, h4 h42) {
        return h42.L(v42, qX2);
    }
}

