/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.Q0;
import a.Qt;
import a.eM;
import java.util.Objects;

public class ce {
    private final int O;
    boolean s = false;

    public int t() {
        return this.O;
    }

    public int hashCode() {
        return Objects.hash(this.t());
    }

    public ce(Qt qt2) {
        if (qt2 == null) {
            this.O = 0;
            return;
        }
        if (qt2.B(eM.Pr)) {
            Q0 q02 = new Q0(qt2);
            this.O = q02.B().M().hashCode();
        } else {
            this.O = qt2.M().getClass().hashCode();
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    try {
                        try {
                            if (!(object instanceof ce)) break block4;
                            if (((ce)object).t() != this.t()) break block5;
                        }
                        catch (O_ o_2) {
                            throw ce.a(o_2);
                        }
                        bl2 = true;
                        break block6;
                    }
                    catch (O_ o_3) {
                        throw ce.a(o_3);
                    }
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }
}

