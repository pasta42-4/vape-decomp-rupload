/*
 * Decompiled with CFR 0.152.
 */
package com.util.comparison;

import com.app.collection.CollectionOrchestrator;
import com.exception.system.CustomSystemException;
import com.messaging.core.MessageInterceptor;
import com.network.connection.ConnectionLifecycleHandler;
import com.temporal.metadata.TemporalMetadataResolver;

public class ComparisonUtility {
    private boolean F;
    private MessageInterceptor C;
    private ConnectionLifecycleHandler b;

    public boolean S() {
        return this.F;
    }

    public ConnectionLifecycleHandler M() {
        return this.b;
    }

    public ComparisonUtility(ConnectionLifecycleHandler connectionLifecycleHandler, boolean bl, MessageInterceptor messageInterceptor) {
        this.b = connectionLifecycleHandler;
        this.F = bl;
        this.C = messageInterceptor;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Loose catch block
     */
    public void c() {
        block12: {
            block9: {
                block10: {
                    if (!this.S()) break block9;
                    try {
                        block11: {
                            if (!CollectionOrchestrator.C(this.b)) break block10;
                            break block11;
                            catch (Exception exception) {
                                throw ComparisonUtility.a(exception);
                            }
                        }
                        CollectionOrchestrator.O(this.b);
                        return;
                    }
                    catch (Exception exception) {
                        throw ComparisonUtility.a(exception);
                    }
                }
                CollectionOrchestrator.X(this.b);
                this.C.c(this.b);
                break block12;
            }
            try {
                this.b.p(this.C.A());
            }
            catch (Exception exception) {
                try {
                    if (this.S()) {
                        TemporalMetadataResolver.W(exception);
                    }
                }
                catch (Exception exception2) {
                    throw ComparisonUtility.a(exception2);
                }
            }
        }
    }

    public boolean equals(Object object) {
        if (object instanceof ComparisonUtility) {
            boolean bl;
            block9: {
                block8: {
                    ComparisonUtility comparisonUtility = (ComparisonUtility)object;
                    try {
                        try {
                            if (!comparisonUtility.M().equals(this.b) || comparisonUtility.S() != this.F) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ComparisonUtility.a(customSystemException);
                        }
                        bl = true;
                        break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComparisonUtility.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        try {
            if (object instanceof ConnectionLifecycleHandler) {
                return this.b.equals(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComparisonUtility.a(customSystemException);
        }
        return super.equals(object);
    }
}

