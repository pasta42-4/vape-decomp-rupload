/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.O_;
import a.RX;
import a.SE;
import a.sy;

public class Nr
implements Runnable {
    private long A = 3000L;
    private long u;

    public double a() {
        double d2 = this.u + this.A;
        double d3 = System.currentTimeMillis();
        return sy.Z((d3 - (double)this.u) / (d2 - (double)this.u), 0.0, 1.0);
    }

    @Override
    public void run() {
        try {
            while (!SE.h.V()) {
                this.e();
            }
        }
        catch (O_ o_2) {
            throw Nr.a(o_2);
        }
    }

    public void I() {
        this.u = System.currentTimeMillis();
    }

    /*
     * Loose catch block
     */
    void e() {
        block8: {
            try {
                RX.q(1000L);
                if (!SE.h.F().X.s().booleanValue()) {
                    return;
                }
                if (!Ao.K.O() && !Ao.K.P) {
                    return;
                }
                long l10 = this.u;
                if (!SE.h.u().h()) break block8;
                try {
                    block9: {
                        RX.q(this.A);
                        if (this.u != l10) break block8;
                        break block9;
                        catch (Exception exception) {
                            throw Nr.a(exception);
                        }
                    }
                    SE.h.u().M();
                }
                catch (Exception exception) {
                    throw Nr.a(exception);
                }
            }
            catch (Exception exception) {
                SE.W(exception);
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public long w() {
        return this.u;
    }
}

