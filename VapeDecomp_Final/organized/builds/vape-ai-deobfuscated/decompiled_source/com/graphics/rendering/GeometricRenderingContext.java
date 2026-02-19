/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import a.oQ;
import com.exception.system.CustomSystemException;
import com.network.protocol.MultiProtocolContextManager;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transform.CryptographicTransformer;
import java.awt.Color;

public class GeometricRenderingContext {
    public final CryptographicTransformer s;
    public double K;
    public final MultiProtocolContextManager V;
    public double O;
    public double j;
    public double E;
    public final boolean B;
    public final Color U;
    public double T;
    public double u;

    public GeometricRenderingContext(double d2, double d3, double d4, oQ oQ2, CryptographicTransformer cryptographicTransformer, MultiProtocolContextManager multiProtocolContextManager, Color color) {
        boolean bl;
        double[] dArray;
        double[] dArray2;
        double[] dArray3;
        double[] dArray4;
        double[] dArray5;
        double[] dArray6;
        double[] dArray7;
        double[] dArray8;
        block42: {
            block41: {
                this.j = -100.0;
                this.E = -100.0;
                this.u = -100.0;
                this.T = -100.0;
                this.O = -100.0;
                this.K = -100.0;
                this.s = cryptographicTransformer;
                this.V = multiProtocolContextManager;
                this.U = color;
                dArray8 = CryptoContextNegotiator684.E(d2 + oQ2.F(), d3 + oQ2.c(), d4 + oQ2.v());
                dArray7 = CryptoContextNegotiator684.E(d2 + oQ2.f(), d3 + oQ2.c(), d4 + oQ2.v());
                dArray6 = CryptoContextNegotiator684.E(d2 + oQ2.f(), d3 + oQ2.c(), d4 + oQ2.R());
                dArray5 = CryptoContextNegotiator684.E(d2 + oQ2.F(), d3 + oQ2.c(), d4 + oQ2.R());
                dArray4 = CryptoContextNegotiator684.E(d2 + oQ2.F(), d3 + oQ2.P(), d4 + oQ2.v());
                dArray3 = CryptoContextNegotiator684.E(d2 + oQ2.f(), d3 + oQ2.P(), d4 + oQ2.v());
                dArray2 = CryptoContextNegotiator684.E(d2 + oQ2.f(), d3 + oQ2.P(), d4 + oQ2.R());
                dArray = CryptoContextNegotiator684.E(d2 + oQ2.F(), d3 + oQ2.P(), d4 + oQ2.R());
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    GeometricRenderingContext geometricRenderingContext = this;
                                                                                    if (dArray8 == null || !(dArray8[2] >= 0.0)) break block41;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw GeometricRenderingContext.a(customSystemException);
                                                                                }
                                                                                if (!(dArray8[2] < 1.0)) break block41;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw GeometricRenderingContext.a(customSystemException);
                                                                            }
                                                                            if (!(dArray7[2] >= 0.0)) break block41;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw GeometricRenderingContext.a(customSystemException);
                                                                        }
                                                                        if (!(dArray7[2] < 1.0)) break block41;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw GeometricRenderingContext.a(customSystemException);
                                                                    }
                                                                    if (!(dArray6[2] >= 0.0)) break block41;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw GeometricRenderingContext.a(customSystemException);
                                                                }
                                                                if (!(dArray6[2] < 1.0)) break block41;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw GeometricRenderingContext.a(customSystemException);
                                                            }
                                                            if (!(dArray5[2] >= 0.0)) break block41;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw GeometricRenderingContext.a(customSystemException);
                                                        }
                                                        if (!(dArray5[2] < 1.0)) break block41;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw GeometricRenderingContext.a(customSystemException);
                                                    }
                                                    if (!(dArray4[2] >= 0.0)) break block41;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GeometricRenderingContext.a(customSystemException);
                                                }
                                                if (!(dArray4[2] < 1.0)) break block41;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GeometricRenderingContext.a(customSystemException);
                                            }
                                            if (!(dArray3[2] >= 0.0)) break block41;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GeometricRenderingContext.a(customSystemException);
                                        }
                                        if (!(dArray3[2] < 1.0)) break block41;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GeometricRenderingContext.a(customSystemException);
                                    }
                                    if (!(dArray2[2] >= 0.0)) break block41;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GeometricRenderingContext.a(customSystemException);
                                }
                                if (!(dArray2[2] < 1.0)) break block41;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GeometricRenderingContext.a(customSystemException);
                            }
                            if (!(dArray[2] >= 0.0)) break block41;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeometricRenderingContext.a(customSystemException);
                        }
                        if (!(dArray[2] < 1.0)) break block41;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricRenderingContext.a(customSystemException);
                    }
                    bl = true;
                    break block42;
                }
                catch (CustomSystemException customSystemException) {
                    throw GeometricRenderingContext.a(customSystemException);
                }
            }
            bl = false;
        }
        try {
            geometricRenderingContext.B = bl;
            if (!this.B) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricRenderingContext.a(customSystemException);
        }
        double d5 = dArray8[0];
        double d6 = dArray8[1];
        double d7 = dArray[0];
        double d8 = dArray[1];
        double[] dArray9 = new double[]{dArray8[0], dArray7[0], dArray6[0], dArray5[0], dArray4[0], dArray3[0], dArray2[0], dArray[0]};
        double[] dArray10 = new double[]{dArray8[1], dArray7[1], dArray6[1], dArray5[1], dArray4[1], dArray3[1], dArray2[1], dArray[1]};
        for (double d9 : dArray9) {
            if (!(d9 < d5)) continue;
            d5 = d9;
        }
        for (double d9 : dArray9) {
            if (!(d9 > d7)) continue;
            d7 = d9;
        }
        for (double d9 : dArray10) {
            if (!(d9 < d6)) continue;
            d6 = d9;
        }
        for (double d9 : dArray10) {
            if (!(d9 > d8)) continue;
            d8 = d9;
        }
        this.j = d5;
        this.E = d6;
        this.u = d7;
        this.T = d8;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

