/*
 * Decompiled with CFR 0.152.
 */
package com.validation.temporal;

import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class TimestampValidator<T> {
    private long E = 0L;
    private long r = Long.MAX_VALUE;
    private long c = 0L;
    private long I;
    private boolean G;
    private static AbstractComputationKernel[] t;

    public void C(boolean bl) {
        block12: {
            double d2;
            block10: {
                block11: {
                    d2 = this.k();
                    try {
                        try {
                            if (!bl) break block10;
                            if (d2 != 0.0) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TimestampValidator.b(customSystemException);
                        }
                        this.o();
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TimestampValidator.b(customSystemException);
                    }
                }
                try {
                    if (d2 == 100.0) {
                        return;
                    }
                    break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw TimestampValidator.b(customSystemException);
                }
            }
            try {
                if (d2 == 100.0) {
                    this.q();
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw TimestampValidator.b(customSystemException);
            }
        }
    }

    public void L() {
        this.r = 0L;
        this.G = false;
    }

    public void q() {
        this.r = System.currentTimeMillis();
        this.G = true;
    }

    public boolean L() {
        return this.G;
    }

    public double h() {
        return -(Math.cos(Math.PI * (double)this.H()) - 1.0) / 2.0;
    }

    public TimestampValidator(double d2, double d3) {
        this.E = this.c = (long)(d3 * 1000.0);
        this.I = (long)(d2 * 1000.0);
    }

    public TimestampValidator(double d2, double d3, double d4) {
        this.I = (long)(d2 * 1000.0);
        this.c = (long)(d3 * 1000.0);
        this.E = (long)(d4 * 1000.0);
    }

    public void K(double d2) {
        this.c = (long)(1000.0 * d2);
    }

    public void D() {
        this.r = 0L;
        this.G = true;
    }

    public void c() {
        double d2 = this.k();
        try {
            if (d2 == 0.0) {
                this.o();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TimestampValidator.b(customSystemException);
        }
        try {
            if (d2 == 100.0) {
                this.q();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TimestampValidator.b(customSystemException);
        }
        long l = System.currentTimeMillis() - this.r;
        long l2 = this.I - l;
        try {
            this.r = System.currentTimeMillis() - l2;
            if (this.G) {
                this.G = false;
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TimestampValidator.b(customSystemException);
        }
        this.G = true;
    }

    public long A() {
        return this.I;
    }

    public abstract T D();

    public void o() {
        this.r = System.currentTimeMillis();
        this.G = false;
    }

    public void Q(double d2) {
        this.I = (long)(d2 * 1000.0);
    }

    public boolean d() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.G || this.k() == 0.0) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TimestampValidator.b(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw TimestampValidator.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean F() {
        boolean bl;
        block5: {
            block4: {
                double d2 = this.k();
                try {
                    try {
                        if (d2 == 0.0 || d2 == 100.0) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TimestampValidator.b(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw TimestampValidator.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void u(AbstractComputationKernel[] abstractComputationKernelArray) {
        t = abstractComputationKernelArray;
    }

    public static AbstractComputationKernel[] N() {
        return t;
    }

    public boolean C() {
        boolean bl;
        try {
            bl = this.k() == 100.0;
        }
        catch (CustomSystemException customSystemException) {
            throw TimestampValidator.b(customSystemException);
        }
        return bl;
    }

    public void y(double d2) {
        this.E = (long)(1000.0 * d2);
    }

    public long U() {
        return this.E;
    }

    public float H() {
        return (float)(this.k() / 100.0);
    }

    public double e() {
        return this.c / 1000L;
    }

    public double k() {
        double d2;
        block13: {
            block14: {
                boolean bl;
                long l;
                block12: {
                    block11: {
                        long l2;
                        try {
                            l2 = this.G ? this.E : this.c;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TimestampValidator.b(customSystemException);
                        }
                        long l3 = l2;
                        l = System.currentTimeMillis() - this.r - l3;
                        try {
                            try {
                                if (l3 <= 0L || l + l3 < 0L) break block11;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw TimestampValidator.b(customSystemException);
                            }
                            bl = true;
                            break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TimestampValidator.b(customSystemException);
                        }
                    }
                    bl = false;
                }
                boolean bl2 = bl;
                d2 = Math.min((double)l / (double)this.I * 100.0, 100.0);
                try {
                    if (!(d2 < 0.0)) break block13;
                    if (!bl2) break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw TimestampValidator.b(customSystemException);
                }
                d2 = 0.1;
                break block13;
            }
            d2 = 0.0;
        }
        try {
            if (this.G) {
                return 100.0 - d2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TimestampValidator.b(customSystemException);
        }
        return d2;
    }

    public TimestampValidator(double d2) {
        this.I = (long)(d2 * 1000.0);
    }

    static {
        if (TimestampValidator.N() != null) {
            TimestampValidator.u(new AbstractComputationKernel[1]);
        }
    }
}

