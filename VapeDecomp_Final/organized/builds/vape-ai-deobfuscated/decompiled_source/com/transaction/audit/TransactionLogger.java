/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.transaction.audit;

import com.exception.system.CustomSystemException;
import com.financial.validation.TransactionValidator;
import com.math.conversion.NumericTransformationEngine1112;
import com.network.protocol.NetworkProtocolNegotiator;
import com.security.transform.CryptographicTransformer;
import com.user.identity.UserIdentityManager;
import org.jetbrains.annotations.Nullable;

public class TransactionLogger
extends TransactionValidator {
    private final int Z;
    @Nullable
    private Long B;
    @Nullable
    private CryptographicTransformer y;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public TransactionLogger(UserIdentityManager userIdentityManager, @Nullable Long l, CryptographicTransformer cryptographicTransformer) {
        super(userIdentityManager, TransactionLogger.J(cryptographicTransformer));
        this.B = l;
        this.Z = cryptographicTransformer.X();
        this.y = cryptographicTransformer;
        this.Z(18.0);
        this.w(18.0);
    }

    public static double[] J(CryptographicTransformer cryptographicTransformer) {
        return new double[]{cryptographicTransformer.r(), cryptographicTransformer.y() + ((double)cryptographicTransformer.L() + 0.15), cryptographicTransformer.D()};
    }

    public TransactionLogger(UserIdentityManager userIdentityManager, @Nullable Long l, int n, double[] dArray) {
        super(userIdentityManager, dArray);
        this.B = l;
        this.Z = n;
        this.Z(18.0);
        this.w(18.0);
    }

    @Override
    public NumericTransformationEngine1112 n() {
        return NumericTransformationEngine1112.J(this.B, this.Z, this.P(), this.K(), this.N());
    }

    @Override
    public void i(NetworkProtocolNegotiator networkProtocolNegotiator) {
        block20: {
            block19: {
                block17: {
                    try {
                        block18: {
                            try {
                                try {
                                    if (this.y == null) break block17;
                                    if (this.y.Y()) break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw TransactionLogger.a(customSystemException);
                                }
                                if (!this.y.O()) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw TransactionLogger.a(customSystemException);
                            }
                        }
                        this.y = null;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionLogger.a(customSystemException);
                    }
                }
                if (this.y == null) {
                    CryptographicTransformer cryptographicTransformer = networkProtocolNegotiator.I(this.Z);
                    try {
                        try {
                            try {
                                if (cryptographicTransformer == null || !cryptographicTransformer.r()) break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw TransactionLogger.a(customSystemException);
                            }
                            if (cryptographicTransformer.O()) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TransactionLogger.a(customSystemException);
                        }
                        this.y = cryptographicTransformer;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionLogger.a(customSystemException);
                    }
                }
            }
            try {
                try {
                    if (this.y == null || !this.y.r()) break block20;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionLogger.a(customSystemException);
                }
                this.m(TransactionLogger.J(this.y));
            }
            catch (CustomSystemException customSystemException) {
                throw TransactionLogger.a(customSystemException);
            }
        }
    }
}

