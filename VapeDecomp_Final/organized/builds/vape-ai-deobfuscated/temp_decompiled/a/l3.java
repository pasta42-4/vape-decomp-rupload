/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;

public final class l3 {
    private final boolean Z;
    private final String r;
    private final String U;
    private final int K;
    private final String Y;

    public l3(int n2, String string, String string2, String string3, boolean bl2) {
        this.K = n2;
        this.r = string;
        this.Y = string2;
        this.U = string3;
        this.Z = bl2;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public String toString() {
        String string;
        StringBuilder stringBuilder;
        try {
            stringBuilder = new StringBuilder().append(this.r).append('.').append(this.Y).append(this.U).append(" (").append(this.K);
            string = this.Z ? " itf" : "";
        }
        catch (O_ o_2) {
            throw l3.a(o_2);
        }
        return stringBuilder.append(string).append(')').toString();
    }

    public String Q() {
        return this.Y;
    }

    public String i() {
        return this.U;
    }

    public boolean equals(Object object) {
        boolean bl2;
        block17: {
            block16: {
                try {
                    if (object == this) {
                        return true;
                    }
                }
                catch (O_ o_2) {
                    throw l3.a(o_2);
                }
                try {
                    if (!(object instanceof l3)) {
                        return false;
                    }
                }
                catch (O_ o_3) {
                    throw l3.a(o_3);
                }
                l3 l32 = (l3)object;
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (this.K != l32.K || this.Z != l32.Z) break block16;
                                }
                                catch (O_ o_4) {
                                    throw l3.a(o_4);
                                }
                                if (!this.r.equals(l32.r)) break block16;
                            }
                            catch (O_ o_5) {
                                throw l3.a(o_5);
                            }
                            if (!this.Y.equals(l32.Y)) break block16;
                        }
                        catch (O_ o_6) {
                            throw l3.a(o_6);
                        }
                        if (!this.U.equals(l32.U)) break block16;
                    }
                    catch (O_ o_7) {
                        throw l3.a(o_7);
                    }
                    bl2 = true;
                    break block17;
                }
                catch (O_ o_8) {
                    throw l3.a(o_8);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public int K() {
        return this.K;
    }

    public int hashCode() {
        int n2;
        int n3;
        try {
            n3 = this.K;
            n2 = this.Z ? 64 : 0;
        }
        catch (O_ o_2) {
            throw l3.a(o_2);
        }
        return n3 + n2 + this.r.hashCode() * this.Y.hashCode() * this.U.hashCode();
    }

    public boolean g() {
        return this.Z;
    }

    public String D() {
        return this.r;
    }
}

