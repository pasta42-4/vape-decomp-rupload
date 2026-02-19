/*
 * Decompiled with CFR 0.152.
 */
package com.app.geospatial.transformation;

import a._Y;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.transmission.DataTransmissionManager2384;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.crypto.CryptographicCipherProvider;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.transaction.management.TransactionOrchestrator1017;

public class GeographicCoordinateTransformer
extends CryptographicCipherProvider {
    public CryptographicTransformer l;
    public double C = 99.0;

    public GeographicCoordinateTransformer(int n) {
        super(n);
    }

    @Override
    public void a(TransactionOrchestrator1017 transactionOrchestrator1017) {
        boolean bl;
        NetworkProtocolNegotiator networkProtocolNegotiator;
        block46: {
            block45: {
                block40: {
                    block44: {
                        block42: {
                            block43: {
                                block41: {
                                    block39: {
                                        block38: {
                                            block37: {
                                                networkProtocolNegotiator = transactionOrchestrator1017.N();
                                                try {
                                                    block36: {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (networkProtocolNegotiator.Y()) break block36;
                                                                    if (this.a == null) break block37;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw GeographicCoordinateTransformer.a(customSystemException);
                                                                }
                                                                if (!this.a.r()) break block37;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw GeographicCoordinateTransformer.a(customSystemException);
                                                            }
                                                            if (networkProtocolNegotiator.equals(this.a)) break block37;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw GeographicCoordinateTransformer.a(customSystemException);
                                                        }
                                                    }
                                                    this.W();
                                                    return;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GeographicCoordinateTransformer.a(customSystemException);
                                                }
                                            }
                                            boolean bl2 = _Y.I(transactionOrchestrator1017, 10.0, 60.0, true);
                                            for (Object e : ApplicationLifecycleManager.c().M()) {
                                                if (!ReflectionMetadataResolver.Pr.isInstance(e)) continue;
                                                DataTransmissionManager2384 dataTransmissionManager2384 = new DataTransmissionManager2384(e);
                                                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                                double d2 = _Y.V(systemConfigurationOrchestrator.F(), 0.0, systemConfigurationOrchestrator.B(), dataTransmissionManager2384.F(), 0.0, dataTransmissionManager2384.B());
                                                try {
                                                    try {
                                                        if (!(d2 <= 7.0) || !(d2 < this.C)) continue;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw GeographicCoordinateTransformer.a(customSystemException);
                                                    }
                                                    this.C = d2;
                                                    this.l = dataTransmissionManager2384;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GeographicCoordinateTransformer.a(customSystemException);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (this.C == 99.0 && !bl2) break block38;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GeographicCoordinateTransformer.a(customSystemException);
                                                }
                                                this.s();
                                                break block39;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GeographicCoordinateTransformer.a(customSystemException);
                                            }
                                        }
                                        this.W();
                                    }
                                    try {
                                        try {
                                            if (!this.E) break block40;
                                            if (_Y.k(transactionOrchestrator1017, 10) != 0) break block41;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GeographicCoordinateTransformer.a(customSystemException);
                                        }
                                        this.W();
                                        break block42;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GeographicCoordinateTransformer.a(customSystemException);
                                    }
                                }
                                try {
                                    try {
                                        if (!_Y.p(transactionOrchestrator1017)) break block42;
                                        ++this.c;
                                        if (this.c < 40) break block43;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GeographicCoordinateTransformer.a(customSystemException);
                                    }
                                    this.W();
                                    break block42;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GeographicCoordinateTransformer.a(customSystemException);
                                }
                            }
                            this.c = 0;
                        }
                        try {
                            if (this.K <= 0) break block44;
                            --this.K;
                            break block40;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeographicCoordinateTransformer.a(customSystemException);
                        }
                    }
                    this.W();
                }
                NetworkPacketInterceptor1107 networkPacketInterceptor1107 = ApplicationLifecycleManager.u();
                try {
                    try {
                        try {
                            if (!networkPacketInterceptor1107.r() || !networkPacketInterceptor1107.l().r()) break block45;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeographicCoordinateTransformer.a(customSystemException);
                        }
                        if (!transactionOrchestrator1017.K()) break block45;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeographicCoordinateTransformer.a(customSystemException);
                    }
                    bl = true;
                    break block46;
                }
                catch (CustomSystemException customSystemException) {
                    throw GeographicCoordinateTransformer.a(customSystemException);
                }
            }
            bl = false;
        }
        boolean bl3 = bl;
        try {
            if (bl3) {
                this.s();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeographicCoordinateTransformer.a(customSystemException);
        }
        this.a = networkProtocolNegotiator;
    }

    @Override
    public void W() {
        this.E = false;
        this.a = ApplicationLifecycleManager.c();
        this.c = 0;
        this.K = 0;
        this.C = 99.0;
        this.l = null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

