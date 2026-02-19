/*
 * Decompiled with CFR 0.152.
 */
package com.threading.executor;

import com.algorithm.optimization.AdaptiveComputationEngine;
import com.database.query.QueryExecutionHandler;
import com.exception.system.CustomSystemException;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;

public class BackgroundTaskExecutor1258
implements Runnable {
    private long A = 3000L;
    private long u;

    public double a() {
        double d2 = this.u + this.A;
        double d3 = System.currentTimeMillis();
        return AdaptiveComputationEngine.Z((d3 - (double)this.u) / (d2 - (double)this.u), 0.0, 1.0);
    }

    @Override
    public void run() {
        try {
            while (!TemporalMetadataResolver.h.V()) {
                this.e();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BackgroundTaskExecutor1258.a(customSystemException);
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
                QueryExecutionHandler.q(1000L);
                if (!TemporalMetadataResolver.h.F().X.s().booleanValue()) {
                    return;
                }
                if (!GraphicalRenderingController.K.O() && !GraphicalRenderingController.K.P) {
                    return;
                }
                long l = this.u;
                if (!TemporalMetadataResolver.h.u().h()) break block8;
                try {
                    block9: {
                        QueryExecutionHandler.q(this.A);
                        if (this.u != l) break block8;
                        break block9;
                        catch (Exception exception) {
                            throw BackgroundTaskExecutor1258.a(exception);
                        }
                    }
                    TemporalMetadataResolver.h.u().M();
                }
                catch (Exception exception) {
                    throw BackgroundTaskExecutor1258.a(exception);
                }
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
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

