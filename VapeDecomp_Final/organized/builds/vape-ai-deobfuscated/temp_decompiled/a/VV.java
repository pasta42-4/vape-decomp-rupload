/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.oo;
import a.vT;
import java.util.Objects;

public class vv
extends vT {
    private int j;

    public vv(double d2, double d3, double d4, int n2) {
        super(d2, d3, d4);
        this.j = n2;
    }

    public oo c() {
        oo oo2;
        try {
            oo2 = this.j == -1 ? null : oo.d(this.j);
        }
        catch (O_ o_2) {
            throw vv.a(o_2);
        }
        return oo2;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl2;
        block12: {
            try {
                if (this == object) {
                    return true;
                }
            }
            catch (O_ o_2) {
                throw vv.a(o_2);
            }
            try {
                try {
                    if (object != null && this.getClass() == object.getClass()) break block12;
                }
                catch (O_ o_3) {
                    throw vv.a(o_3);
                }
                return false;
            }
            catch (O_ o_4) {
                throw vv.a(o_4);
            }
        }
        try {
            if (!super.equals(object)) {
                return false;
            }
        }
        catch (O_ o_5) {
            throw vv.a(o_5);
        }
        vv vv2 = (vv)object;
        try {
            bl2 = this.j == vv2.j;
        }
        catch (O_ o_6) {
            throw vv.a(o_6);
        }
        return bl2;
    }

    public vv(int n2, int n3, int n4, int n5) {
        super(n2, n3, n4);
        this.j = n5;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.j);
    }

    public int F() {
        return this.j;
    }

    public vv(vT vT2, int n2) {
        this(vT2.z(), vT2.h(), vT2.A(), n2);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

