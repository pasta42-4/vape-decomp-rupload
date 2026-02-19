/*
 * Decompiled with CFR 0.152.
 */
package com.geometry.transformation;

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

public class GeometricTransformCalculator
extends CryptographicCipherProvider {
    public double h = 99.0;
    public CryptographicTransformer o;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void a(TransactionOrchestrator1017 transactionOrchestrator1017) {
        double d2;
        NetworkProtocolNegotiator networkProtocolNegotiator;
        block52: {
            boolean bl;
            boolean bl2;
            block51: {
                block50: {
                    boolean bl3;
                    NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                    block49: {
                        block48: {
                            block43: {
                                block47: {
                                    block45: {
                                        block46: {
                                            block44: {
                                                block42: {
                                                    block41: {
                                                        block40: {
                                                            networkProtocolNegotiator = transactionOrchestrator1017.N();
                                                            try {
                                                                block39: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (networkProtocolNegotiator.Y()) break block39;
                                                                                if (this.a == null) break block40;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw GeometricTransformCalculator.a(customSystemException);
                                                                            }
                                                                            if (!this.a.r()) break block40;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw GeometricTransformCalculator.a(customSystemException);
                                                                        }
                                                                        if (networkProtocolNegotiator.equals(this.a)) break block40;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw GeometricTransformCalculator.a(customSystemException);
                                                                    }
                                                                }
                                                                this.W();
                                                                return;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw GeometricTransformCalculator.a(customSystemException);
                                                            }
                                                        }
                                                        for (Object e : ApplicationLifecycleManager.c().M()) {
                                                            if (!ReflectionMetadataResolver.Pr.isInstance(e)) continue;
                                                            DataTransmissionManager2384 dataTransmissionManager2384 = new DataTransmissionManager2384(e);
                                                            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                                            double d3 = _Y.V(systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.V(), systemConfigurationOrchestrator.B(), dataTransmissionManager2384.F(), dataTransmissionManager2384.V(), dataTransmissionManager2384.B());
                                                            try {
                                                                try {
                                                                    if (!(d3 <= 2.0) || !(d3 < this.h)) continue;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw GeometricTransformCalculator.a(customSystemException);
                                                                }
                                                                this.h = d3;
                                                                this.o = dataTransmissionManager2384;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw GeometricTransformCalculator.a(customSystemException);
                                                            }
                                                        }
                                                        try {
                                                            if (this.h == 99.0) break block41;
                                                            this.s();
                                                            break block42;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw GeometricTransformCalculator.a(customSystemException);
                                                        }
                                                    }
                                                    this.W();
                                                }
                                                try {
                                                    try {
                                                        if (!this.E) break block43;
                                                        if (_Y.k(transactionOrchestrator1017, 10) != 0) break block44;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw GeometricTransformCalculator.a(customSystemException);
                                                    }
                                                    this.W();
                                                    break block45;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GeometricTransformCalculator.a(customSystemException);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (!_Y.p(transactionOrchestrator1017)) break block45;
                                                    ++this.c;
                                                    if (this.c < 40) break block46;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GeometricTransformCalculator.a(customSystemException);
                                                }
                                                this.W();
                                                break block45;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GeometricTransformCalculator.a(customSystemException);
                                            }
                                        }
                                        this.c = 0;
                                    }
                                    try {
                                        if (this.K <= 0) break block47;
                                        --this.K;
                                        break block43;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GeometricTransformCalculator.a(customSystemException);
                                    }
                                }
                                this.W();
                            }
                            networkPacketInterceptor1107 = ApplicationLifecycleManager.u();
                            d2 = transactionOrchestrator1017.e();
                            try {
                                try {
                                    if (!(d2 < this.q) && transactionOrchestrator1017.y() != 20) break block48;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GeometricTransformCalculator.a(customSystemException);
                                }
                                bl3 = true;
                                break block49;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GeometricTransformCalculator.a(customSystemException);
                            }
                        }
                        bl3 = false;
                    }
                    bl2 = bl3;
                    try {
                        try {
                            try {
                                if (!networkPacketInterceptor1107.r() || !networkPacketInterceptor1107.l().r()) break block50;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GeometricTransformCalculator.a(customSystemException);
                            }
                            if (!transactionOrchestrator1017.K()) break block50;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeometricTransformCalculator.a(customSystemException);
                        }
                        bl = true;
                        break block51;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricTransformCalculator.a(customSystemException);
                    }
                }
                bl = false;
            }
            boolean bl4 = bl;
            try {
                try {
                    if (!bl4 && !bl2) break block52;
                }
                catch (CustomSystemException customSystemException) {
                    throw GeometricTransformCalculator.a(customSystemException);
                }
                this.s();
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricTransformCalculator.a(customSystemException);
            }
        }
        this.q = d2;
        this.a = networkProtocolNegotiator;
    }

    @Override
    public void W() {
        this.E = false;
        this.q = -999.0;
        this.a = ApplicationLifecycleManager.c();
        this.c = 0;
        this.K = 0;
        this.h = 99.0;
        this.o = null;
    }

    public GeometricTransformCalculator(int n) {
        super(n);
    }
}

