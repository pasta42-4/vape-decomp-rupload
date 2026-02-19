/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.O_;
import a.al;
import a.zQ;
import java.util.HashSet;
import java.util.Set;

public class Ng
implements zQ {
    private Set<Integer> z = new HashSet<Integer>();
    private static int[] I;

    public Ng() {
        this.z.add(8);
        this.z.add(3);
        this.z.add(22);
        this.z.add(27);
        this.z.add(13);
        this.z.add(9);
    }

    public static int[] w() {
        return I;
    }

    @Override
    public boolean c(long l10, long l11) {
        char c10;
        char c11;
        block13: {
            block14: {
                c11 = (char)l10;
                c10 = '\u0000';
                try {
                    block12: {
                        try {
                            try {
                                if (c11 == '\u00a7' || c11 < ' ') break block12;
                            }
                            catch (O_ o_2) {
                                throw Ng.a(o_2);
                            }
                            if (c11 != '\u007f') break block13;
                        }
                        catch (O_ o_3) {
                            throw Ng.a(o_3);
                        }
                    }
                    if (!this.z.contains(c11)) break block14;
                }
                catch (O_ o_4) {
                    throw Ng.a(o_4);
                }
                c10 = c11;
            }
            try {
                if (c10 == '\u0000') {
                    return false;
                }
            }
            catch (O_ o_5) {
                throw Ng.a(o_5);
            }
        }
        try {
            al.a(c11, c10);
            if (!Ao.K.P) {
                return true;
            }
        }
        catch (O_ o_6) {
            throw Ng.a(o_6);
        }
        return false;
    }

    public static void J(int[] nArray) {
        I = nArray;
    }

    static {
        if (Ng.w() != null) {
            Ng.J(new int[3]);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

