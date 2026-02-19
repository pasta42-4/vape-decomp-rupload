/*
 * Decompiled with CFR 0.152.
 */
package com.system.config;

import a.kg;
import a.oQ;
import com.analytics.computation.MetricsCalculationEngine;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GeometricRenderingContext;
import com.math.geometry.GeometricCoordinateCalculator;
import com.messaging.processing.MessageProcessingFilter;
import com.network.configuration.NetworkConfigManager;
import com.security.negotiation.CryptoContextNegotiator684;
import com.system.configuration.ConfigurationManager;
import com.transaction.management.TransactionOrchestrator1017;
import java.awt.Color;

class ConfigurationOrchestrator {
    private final GeometricCoordinateCalculator R;
    private final NetworkConfigManager W = new NetworkConfigManager();
    private boolean E;
    private GeometricRenderingContext Z;
    private float B = 0.0f;
    private kg N;

    public float X() {
        return this.B;
    }

    public void r(kg kg2) {
        this.N = kg2;
    }

    public GeometricCoordinateCalculator v() {
        return this.R;
    }

    private void N() {
        block4: {
            block6: {
                block5: {
                    try {
                        try {
                            if (!this.W.m(10L)) break block4;
                            if (!this.E) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationOrchestrator.a(customSystemException);
                        }
                        this.B = (float)((double)this.B + 0.05);
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationOrchestrator.a(customSystemException);
                    }
                }
                this.B = (float)((double)this.B - 0.05);
            }
            this.B = Math.min(1.0f, Math.max(0.0f, this.B));
            this.W.m();
        }
    }

    private void w(boolean bl) {
        this.E = bl;
    }

    public void h(MetricsCalculationEngine metricsCalculationEngine, boolean bl, float f) {
        block19: {
            int n;
            int n2;
            float f2;
            float f3;
            boolean bl2;
            boolean bl3;
            float f4;
            double d2;
            double d3;
            double d4;
            double d5;
            block17: {
                block20: {
                    block18: {
                        ContextualEventDispatcher contextualEventDispatcher = ((TransactionOrchestrator1017)ApplicationLifecycleManager.g()).I(1.0f);
                        double d6 = contextualEventDispatcher.x(new kg((double)this.R.W() + 0.5, (double)this.R.n() + 0.5, (double)this.R.H() + 0.5).l());
                        float f5 = 1.0f;
                        float f6 = 1.0f;
                        float f7 = MessageProcessingFilter.v();
                        float f8 = ApplicationLifecycleManager.b();
                        GeometricRenderingContext geometricRenderingContext = this.Z;
                        d5 = geometricRenderingContext.j / (double)f6 / (double)f5 / (double)f7;
                        double d7 = geometricRenderingContext.u / (double)f6 / (double)f5 / (double)f7;
                        d4 = ((double)f8 - geometricRenderingContext.T / (double)f7) / (double)f6 / (double)f5;
                        double d8 = ((double)f8 - geometricRenderingContext.E / (double)f7) / (double)f6 / (double)f5;
                        d3 = d7 - d5;
                        d2 = d8 - d4;
                        f4 = (float)Math.min(d3, d2);
                        bl3 = metricsCalculationEngine.O(d5 + d3 / 2.0, d4 + d2 / 2.0, f4 / 2.0f);
                        bl2 = false;
                        if (this.N != null) {
                            double d9 = contextualEventDispatcher.x(this.N.l());
                            if (d9 < 4.5) {
                                bl2 = true;
                            }
                            if (!bl2) {
                                bl3 = false;
                            }
                        }
                        f3 = 1.0f;
                        try {
                            if (!(d6 < 20.0)) break block17;
                            if (!(d6 > 10.0)) break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationOrchestrator.a(customSystemException);
                        }
                        f2 = (float)((20.0 - d6) / 10.0);
                        break block20;
                    }
                    f2 = 1.0f;
                }
                f3 = f2;
            }
            this.w(bl3);
            f2 = this.X();
            f4 += 20.0f * f2;
            try {
                n2 = bl2 ? 160 : 150;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationOrchestrator.a(customSystemException);
            }
            int n3 = (int)((float)n2 * f3);
            try {
                n = bl2 ? 250 : 170;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationOrchestrator.a(customSystemException);
            }
            int n4 = (int)((float)n * f3);
            float f9 = (float)(d5 + d3 / 2.0 - (double)(f4 / 2.0f));
            float f10 = (float)(d4 + d2 / 2.0 - (double)(f4 / 2.0f));
            ConfigurationManager.T((double)f9, (double)f10, (double)f4, 1.0, new Color(10, 10, 10, n3));
            int n5 = (int)(75.0f * f2);
            try {
                if (bl2) {
                    ConfigurationManager.r(f9, f10, f4, f4 * 0.12f, 1.0f, new Color(10, 100 + n5, 10, 255));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationOrchestrator.a(customSystemException);
            }
            ConfigurationManager.r(f9, f10, f4, f4 * 0.1f, 1.0f, new Color(10, 10, 10, n4));
            if (bl) {
                float f11 = 100.0f * f;
                float f12 = 360.0f * (f11 / 100.0f);
                try {
                    try {
                        if (!(f11 < 100.0f) || !(f11 > 0.0f)) break block19;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationOrchestrator.a(customSystemException);
                    }
                    ConfigurationManager.V(f9, f10, f4, f4 * 0.12f, 1.0f, 270.0f, -f12, new Color(10, 100 + n5, 10, 255));
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationOrchestrator.a(customSystemException);
                }
            }
        }
    }

    public ConfigurationOrchestrator(GeometricCoordinateCalculator geometricCoordinateCalculator) {
        this.R = geometricCoordinateCalculator;
    }

    static boolean j(ConfigurationOrchestrator configurationOrchestrator) {
        return configurationOrchestrator.E;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void y() {
        oQ oQ2 = oQ.E(0.2, 0.0, 0.2, 0.8, 0.8, 0.8);
        CryptoContextNegotiator684.Y();
        this.Z = new GeometricRenderingContext(this.R.e(), this.R.R() + 0.4, this.R.C(), oQ2, null, null, null);
        CryptoContextNegotiator684.J();
    }

    static void M(ConfigurationOrchestrator configurationOrchestrator) {
        configurationOrchestrator.N();
    }
}

