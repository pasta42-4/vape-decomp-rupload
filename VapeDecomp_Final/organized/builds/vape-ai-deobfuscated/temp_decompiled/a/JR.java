/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.jG;

public class jr
extends jG {
    private boolean B;

    public jr(String string, double d2) {
        super(string);
    }

    public void F(boolean bl2, jr jr2) {
        this.B = bl2;
        this.r().U(jr2);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public jr(String string) {
        this(string, 1.0);
    }

    public boolean o() {
        try {
            if (this.r() == null) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw jr.a(o_2);
        }
        return ((jG)this.r().J()).equals(this);
    }

    @Override
    public boolean p() {
        return this.B;
    }
}

