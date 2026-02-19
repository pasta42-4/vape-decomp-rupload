/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Bg;
import a.O_;
import a.jX;
import java.util.Random;

public class jj
extends jX {
    private long H;
    private boolean K;
    private int h;
    private final Random D;
    private final Bg g = new Bg();
    private final Random R;
    private final Random t;
    private int n;
    private final Random S;

    public static jj D(Object object, String string, String string2, String string3, String string4, double d2, double d3, double d4, double d5, double d6) {
        return new jj(object, string, new double[]{d3, d4}, d2, d5, string3, string4);
    }

    public long e() {
        block30: {
            int n2;
            int n3;
            boolean bl2;
            int n4;
            int n5;
            int n6;
            block32: {
                block31: {
                    int n7;
                    int n8;
                    block29: {
                        block26: {
                            block28: {
                                block27: {
                                    int n9;
                                    n6 = this.s();
                                    n5 = this.c();
                                    n4 = n6 - n5;
                                    try {
                                        int n10 = n9 = n4 <= 0 ? n5 : this.D.nextInt(n4) + n5 + 1;
                                    }
                                    catch (O_ o_2) {
                                        throw jj.a(o_2);
                                    }
                                    if (n9 == 0) {
                                        n9 = 1;
                                    }
                                    try {
                                        try {
                                            if (this.K) break block26;
                                            this.H = 1000 / n9;
                                            if (this.S.nextInt(4) != 1) break block27;
                                        }
                                        catch (O_ o_3) {
                                            throw jj.a(o_3);
                                        }
                                        this.K = true;
                                        this.h = 1 + this.S.nextInt(5);
                                        break block26;
                                    }
                                    catch (O_ o_4) {
                                        throw jj.a(o_4);
                                    }
                                }
                                try {
                                    if (this.S.nextInt(10) != 1) break block28;
                                    break block26;
                                }
                                catch (O_ o_5) {
                                    throw jj.a(o_5);
                                }
                            }
                            try {
                                if (this.S.nextInt(10) == 1) {
                                    this.K = true;
                                    this.h = 5 + this.S.nextInt(10);
                                }
                            }
                            catch (O_ o_6) {
                                throw jj.a(o_6);
                            }
                        }
                        try {
                            try {
                                if (!this.K) break block29;
                                ++this.n;
                                if (this.n < this.h) break block29;
                            }
                            catch (O_ o_7) {
                                throw jj.a(o_7);
                            }
                            this.n = 0;
                            this.K = false;
                        }
                        catch (O_ o_8) {
                            throw jj.a(o_8);
                        }
                    }
                    bl2 = true;
                    try {
                        n8 = this.t.nextInt(48);
                        n7 = !bl2 ? 4 : 10;
                    }
                    catch (O_ o_9) {
                        throw jj.a(o_9);
                    }
                    try {
                        try {
                            try {
                                if (n8 % n7 != 0 || this.K) break block30;
                            }
                            catch (O_ o_10) {
                                throw jj.a(o_10);
                            }
                            if (bl2) break block31;
                        }
                        catch (O_ o_11) {
                            throw jj.a(o_11);
                        }
                        n3 = 50;
                        break block32;
                    }
                    catch (O_ o_12) {
                        throw jj.a(o_12);
                    }
                }
                n3 = 25;
            }
            n5 = n3;
            try {
                n2 = !bl2 ? 120 : 70;
            }
            catch (O_ o_13) {
                throw jj.a(o_13);
            }
            n6 = n2;
            n4 = n6 - n5;
            this.H += (long)(this.R.nextInt(n4) + n5);
        }
        return this.H;
    }

    public boolean k(long l10) {
        return this.g.m(l10);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static jj a(Object object, String string, String string2, String string3, double d2, double d3, double d4, double d5) {
        return new jj(object, string, new double[]{d3, d4}, d2, d5, string2, string3);
    }

    public static jj y(Object object, String string, String string2, String string3, double d2, double d3, double d4, double d5, double d6) {
        jj jj2 = new jj(object, string, new double[]{d3, d4}, d2, d5, string2, string3);
        jj2.D(d6);
        return jj2;
    }

    public static jj G(Object object, String string, String string2, String string3, double d2, double d3, double d4, double d5, double d6, String string4) {
        jj jj2 = new jj(object, string, new double[]{d3, d4}, d2, d5, string2, string3);
        jj2.D(d6);
        jj2.R(string4);
        return jj2;
    }

    public jj(Object object, String string, double[] dArray, double d2, double d3, String string2, String string3) {
        super(object, string, dArray, d2, d3, string2, string3);
        this.D = new Random();
        this.t = new Random();
        this.R = new Random();
        this.S = new Random();
    }

    public void Q() {
        this.g.m();
    }

    @Override
    public boolean J() {
        return this.g.m(this.e());
    }
}

