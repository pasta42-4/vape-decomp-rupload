/*
 * Decompiled with CFR 0.152.
 */
package com.system.randomization;

import com.exception.system.CustomSystemException;
import com.network.configuration.NetworkConfigManager;
import com.util.numeric.NumericFormattingUtility;
import java.util.Random;

public class RandomGenerationEngine1239
extends NumericFormattingUtility {
    private long H;
    private boolean K;
    private int h;
    private final Random D;
    private final NetworkConfigManager g = new NetworkConfigManager();
    private final Random R;
    private final Random t;
    private int n;
    private final Random S;

    public static RandomGenerationEngine1239 D(Object object, String string, String string2, String string3, String string4, double d2, double d3, double d4, double d5, double d6) {
        return new RandomGenerationEngine1239(object, string, new double[]{d3, d4}, d2, d5, string3, string4);
    }

    public long e() {
        block30: {
            int n;
            int n2;
            boolean bl;
            int n3;
            int n4;
            int n5;
            block32: {
                block31: {
                    int n6;
                    int n7;
                    block29: {
                        block26: {
                            block28: {
                                block27: {
                                    int n8;
                                    n5 = this.s();
                                    n4 = this.c();
                                    n3 = n5 - n4;
                                    try {
                                        int n9 = n8 = n3 <= 0 ? n4 : this.D.nextInt(n3) + n4 + 1;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw RandomGenerationEngine1239.a(customSystemException);
                                    }
                                    if (n8 == 0) {
                                        n8 = 1;
                                    }
                                    try {
                                        try {
                                            if (this.K) break block26;
                                            this.H = 1000 / n8;
                                            if (this.S.nextInt(4) != 1) break block27;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw RandomGenerationEngine1239.a(customSystemException);
                                        }
                                        this.K = true;
                                        this.h = 1 + this.S.nextInt(5);
                                        break block26;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw RandomGenerationEngine1239.a(customSystemException);
                                    }
                                }
                                try {
                                    if (this.S.nextInt(10) != 1) break block28;
                                    break block26;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw RandomGenerationEngine1239.a(customSystemException);
                                }
                            }
                            try {
                                if (this.S.nextInt(10) == 1) {
                                    this.K = true;
                                    this.h = 5 + this.S.nextInt(10);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw RandomGenerationEngine1239.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                if (!this.K) break block29;
                                ++this.n;
                                if (this.n < this.h) break block29;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw RandomGenerationEngine1239.a(customSystemException);
                            }
                            this.n = 0;
                            this.K = false;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RandomGenerationEngine1239.a(customSystemException);
                        }
                    }
                    bl = true;
                    try {
                        n7 = this.t.nextInt(48);
                        n6 = !bl ? 4 : 10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RandomGenerationEngine1239.a(customSystemException);
                    }
                    try {
                        try {
                            try {
                                if (n7 % n6 != 0 || this.K) break block30;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw RandomGenerationEngine1239.a(customSystemException);
                            }
                            if (bl) break block31;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RandomGenerationEngine1239.a(customSystemException);
                        }
                        n2 = 50;
                        break block32;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RandomGenerationEngine1239.a(customSystemException);
                    }
                }
                n2 = 25;
            }
            n4 = n2;
            try {
                n = !bl ? 120 : 70;
            }
            catch (CustomSystemException customSystemException) {
                throw RandomGenerationEngine1239.a(customSystemException);
            }
            n5 = n;
            n3 = n5 - n4;
            this.H += (long)(this.R.nextInt(n3) + n4);
        }
        return this.H;
    }

    public boolean k(long l) {
        return this.g.m(l);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static RandomGenerationEngine1239 a(Object object, String string, String string2, String string3, double d2, double d3, double d4, double d5) {
        return new RandomGenerationEngine1239(object, string, new double[]{d3, d4}, d2, d5, string2, string3);
    }

    public static RandomGenerationEngine1239 y(Object object, String string, String string2, String string3, double d2, double d3, double d4, double d5, double d6) {
        RandomGenerationEngine1239 randomGenerationEngine1239 = new RandomGenerationEngine1239(object, string, new double[]{d3, d4}, d2, d5, string2, string3);
        randomGenerationEngine1239.D(d6);
        return randomGenerationEngine1239;
    }

    public static RandomGenerationEngine1239 G(Object object, String string, String string2, String string3, double d2, double d3, double d4, double d5, double d6, String string4) {
        RandomGenerationEngine1239 randomGenerationEngine1239 = new RandomGenerationEngine1239(object, string, new double[]{d3, d4}, d2, d5, string2, string3);
        randomGenerationEngine1239.D(d6);
        randomGenerationEngine1239.R(string4);
        return randomGenerationEngine1239;
    }

    public RandomGenerationEngine1239(Object object, String string, double[] dArray, double d2, double d3, String string2, String string3) {
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

