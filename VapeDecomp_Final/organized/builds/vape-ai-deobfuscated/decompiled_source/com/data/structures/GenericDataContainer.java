/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.data.structures;

import a.Ne;
import a.oQ;
import a.tl;
import a.z6;
import com.analytics.computation.NumericComputationEngine1000;
import com.app.context.transformation.ContextTransformationEngine;
import com.communication.protocol.DataExchangeProtocol2090;
import com.data.transformation.DataTransformationPipeline;
import com.exception.system.CustomSystemException;
import com.graphics.color.ColorCompositionEngine;
import com.graphics.rendering.GeometricRenderingContext;
import com.graphics.rendering.RenderEventDispatcher;
import com.math.geometry.GeometryCalculator;
import com.messaging.processing.MessageProcessingFilter;
import com.network.protocol.MultiProtocolContextManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.security.access.SecurityAccessController1588;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationManager;
import com.system.execution.ConditionalExecutionManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import com.ui.configuration.DisplayConfigurationManager;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class GenericDataContainer
extends ContextTransformationEngine<DataTransformationPipeline> {
    private final List<GeometricRenderingContext> V;
    private final DataTransformationPipeline e = (DataTransformationPipeline)this.n();

    @DataExchangeProtocol2090
    public void r(DisplayConfigurationManager displayConfigurationManager) {
        block73: {
            block72: {
                try {
                    if (NumericComputationEngine1000.n()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GenericDataContainer.a(customSystemException);
                }
                CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().u(0.9, true);
                Ne.h.z();
                float f = 1.0f;
                float f2 = 2.0f;
                Ne.h.J(f, f, f);
                tl.s();
                float f3 = MessageProcessingFilter.v();
                boolean bl = GL11.glIsEnabled((int)3042);
                GraphicsBufferAllocator.V();
                for (GeometricRenderingContext geometricRenderingContext : this.V) {
                    block63: {
                        double d2;
                        boolean bl2;
                        boolean bl3;
                        double d3;
                        double d4;
                        double d5;
                        double d6;
                        block57: {
                            block58: {
                                boolean bl4;
                                block56: {
                                    block55: {
                                        float f4;
                                        if (GeometryCalculator.C() >= 35) {
                                            f4 = displayConfigurationManager.getRenderManager().k();
                                            float f5 = displayConfigurationManager.getRenderManager().r();
                                        }
                                        f4 = displayConfigurationManager.getDisplayHeight();
                                        d6 = geometricRenderingContext.j / (double)f2 / (double)f / (double)f3;
                                        d5 = geometricRenderingContext.u / (double)f2 / (double)f / (double)f3;
                                        d4 = ((double)f4 - geometricRenderingContext.T / (double)f3) / (double)f2 / (double)f;
                                        d3 = ((double)f4 - geometricRenderingContext.E / (double)f3) / (double)f2 / (double)f;
                                        tl.R();
                                        Ne.h.h(1.0f);
                                        tl.N();
                                        String string = geometricRenderingContext.V.g();
                                        bl3 = geometricRenderingContext.V.Y();
                                        boolean bl5 = geometricRenderingContext.V.E();
                                        try {
                                            try {
                                                if (!bl5 && !bl3) break block55;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GenericDataContainer.a(customSystemException);
                                            }
                                            bl4 = true;
                                            break block56;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GenericDataContainer.a(customSystemException);
                                        }
                                    }
                                    bl4 = false;
                                }
                                bl2 = bl4;
                                try {
                                    try {
                                        if (!this.e.n.s().booleanValue()) break block57;
                                        if (!this.e.l.s().booleanValue()) break block58;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GenericDataContainer.a(customSystemException);
                                    }
                                    if (!bl2) break block57;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GenericDataContainer.a(customSystemException);
                                }
                            }
                            float f6 = (float)geometricRenderingContext.U.getAlpha() / 255.0f;
                            if (ConfigurationManager.U()) {
                                double d7 = d3 - d4;
                                d2 = d5 - d6;
                                double d8 = 1.0;
                                z6.M(d6, d4, d2, d8, new Color(0.0f, 0.0f, 0.0f, 0.4f * f6));
                                z6.M(d6, d4, d8, d7, new Color(0.0f, 0.0f, 0.0f, 0.4f * f6));
                                z6.M(d5, d3, -d8, -d7, new Color(0.0f, 0.0f, 0.0f, 0.4f * f6));
                                z6.M(d5, d3, -d2, -d8, new Color(0.0f, 0.0f, 0.0f, 0.4f * f6));
                                d7 = (d3 -= 1.0) - (d4 += 1.0);
                                d2 = (d5 -= 1.0) - (d6 += 1.0);
                                z6.M(d6, d4, d2, d8, new Color(0.0f, 0.0f, 0.0f, 0.4f * f6));
                                z6.M(d6, d4, d8, d7, new Color(0.0f, 0.0f, 0.0f, 0.4f * f6));
                                z6.M(d5, d3, -d8, -d7, new Color(0.0f, 0.0f, 0.0f, 0.4f * f6));
                                z6.M(d5, d3, -d2, -d8, new Color(0.0f, 0.0f, 0.0f, 0.4f * f6));
                                d7 = (d3 += 0.5) - (d4 -= 0.5);
                                d2 = (d5 += 0.5) - (d6 -= 0.5);
                                z6.M(d6, d4, d2, d8, geometricRenderingContext.U);
                                z6.M(d6, d4, d8, d7, geometricRenderingContext.U);
                                z6.M(d5, d3, -d8, -d7, geometricRenderingContext.U);
                                z6.M(d5, d3, -d2, -d8, geometricRenderingContext.U);
                            } else {
                                Ne.h.R(0.0, 0.0, 0.0, 0.4 * (double)f6);
                                GL11.glBegin((int)2);
                                GL11.glVertex2d((double)d6, (double)d4);
                                GL11.glVertex2d((double)d5, (double)d4);
                                GL11.glVertex2d((double)d5, (double)d3);
                                GL11.glVertex2d((double)d6, (double)d3);
                                GL11.glEnd();
                                GL11.glBegin((int)2);
                                GL11.glVertex2d((double)(d6 + 1.0), (double)(d4 + 1.0));
                                GL11.glVertex2d((double)(d5 - 1.0), (double)(d4 + 1.0));
                                GL11.glVertex2d((double)(d5 - 1.0), (double)(d3 - 1.0));
                                GL11.glVertex2d((double)(d6 + 1.0), (double)(d3 - 1.0));
                                GL11.glEnd();
                                tl.N();
                                GraphicsBufferAllocator.Y(geometricRenderingContext.U);
                                GL11.glBegin((int)2);
                                GL11.glVertex2d((double)(d6 + 0.5), (double)(d4 + 0.5));
                                GL11.glVertex2d((double)(d5 - 0.5), (double)(d4 + 0.5));
                                GL11.glVertex2d((double)(d5 - 0.5), (double)(d3 - 0.5));
                                GL11.glVertex2d((double)(d6 + 0.5), (double)(d3 - 0.5));
                                GL11.glEnd();
                                tl.j();
                            }
                        }
                        if (geometricRenderingContext.s.B(ReflectionMetadataResolver.Ut)) {
                            int n;
                            double d9;
                            double d10;
                            String string;
                            CryptographicParameterGenerator cryptographicParameterGenerator2;
                            String string2;
                            block67: {
                                block71: {
                                    float f7;
                                    float f8;
                                    float f9;
                                    float f10;
                                    Color color;
                                    double d11;
                                    Color color2;
                                    block70: {
                                        Color color3;
                                        double d12;
                                        Color color4;
                                        TransactionOrchestrator1017 transactionOrchestrator1017;
                                        block69: {
                                            block68: {
                                                SecurityAccessController1588 securityAccessController1588;
                                                block66: {
                                                    String string3;
                                                    block65: {
                                                        block59: {
                                                            double d13;
                                                            double d14;
                                                            double d15;
                                                            double d16;
                                                            double d17;
                                                            block62: {
                                                                double d18;
                                                                block61: {
                                                                    block60: {
                                                                        transactionOrchestrator1017 = new TransactionOrchestrator1017(geometricRenderingContext.s.M());
                                                                        float f11 = geometricRenderingContext.V.C();
                                                                        try {
                                                                            try {
                                                                                if (!this.e.j.s().booleanValue() || !(f11 >= 0.0f)) break block59;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw GenericDataContainer.a(customSystemException);
                                                                            }
                                                                            if (!(geometricRenderingContext.V.n() >= 0.0f)) break block59;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw GenericDataContainer.a(customSystemException);
                                                                        }
                                                                        d18 = Math.min(1.0f, f11 / geometricRenderingContext.V.n());
                                                                        try {
                                                                            if (!ConfigurationManager.U()) break block60;
                                                                            z6.n(d6 - 2.0, d3 - 0.5, d6 - 2.0, d4 + 0.5, d6 - 4.0, d4 + 0.5, d6 - 4.0, d3 - 0.5, new Color(0.0f, 0.0f, 0.0f, 0.4f));
                                                                            break block61;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw GenericDataContainer.a(customSystemException);
                                                                        }
                                                                    }
                                                                    tl.N();
                                                                    Ne.h.R(0.0, 0.0, 0.0, 0.4);
                                                                    GL11.glBegin((int)7);
                                                                    GL11.glVertex2d((double)(d6 - 2.0), (double)(d3 - 0.5));
                                                                    GL11.glVertex2d((double)(d6 - 2.0), (double)(d4 + 0.5));
                                                                    GL11.glVertex2d((double)(d6 - 4.0), (double)(d4 + 0.5));
                                                                    GL11.glVertex2d((double)(d6 - 4.0), (double)(d3 - 0.5));
                                                                    GL11.glEnd();
                                                                }
                                                                double d19 = d3 - d4 - 1.0;
                                                                d17 = d4 + d19 * d18;
                                                                d16 = 0.0;
                                                                d15 = 0.0;
                                                                d14 = 0.0;
                                                                d13 = 0.0;
                                                                if (d18 >= 0.9) {
                                                                    d16 = 0.0;
                                                                    d15 = 1.0;
                                                                    d14 = 0.0;
                                                                    d13 = 1.0;
                                                                } else if (d18 >= 0.75) {
                                                                    d16 = 0.9;
                                                                    d15 = 1.0;
                                                                    d14 = 0.0;
                                                                    d13 = 1.0;
                                                                } else if (d18 >= 0.5) {
                                                                    d16 = 1.0;
                                                                    d15 = 1.0;
                                                                    d14 = 0.0;
                                                                    d13 = 1.0;
                                                                } else if (d18 >= 0.25) {
                                                                    d16 = 1.0;
                                                                    d15 = 0.5;
                                                                    d14 = 0.0;
                                                                    d13 = 1.0;
                                                                } else if (d18 >= 0.0) {
                                                                    d16 = 1.0;
                                                                    d15 = 0.0;
                                                                    d14 = 0.0;
                                                                    d13 = 1.0;
                                                                }
                                                                try {
                                                                    if (!ConfigurationManager.U()) break block62;
                                                                    z6.n(d6 - 2.5, d17, d6 - 2.5, d4 + 1.0, d6 - 3.5, d4 + 1.0, d6 - 3.5, d17, new Color((int)(d16 * 255.0), (int)(d15 * 255.0), (int)(d14 * 255.0), (int)(d13 * 255.0)));
                                                                    break block59;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw GenericDataContainer.a(customSystemException);
                                                                }
                                                            }
                                                            GL11.glColor4d((double)d16, (double)d15, (double)d14, (double)d13);
                                                            GL11.glBegin((int)7);
                                                            GL11.glVertex2d((double)(d6 - 2.5), (double)d17);
                                                            GL11.glVertex2d((double)(d6 - 2.5), (double)(d4 + 1.0));
                                                            GL11.glVertex2d((double)(d6 - 3.5), (double)(d4 + 1.0));
                                                            GL11.glVertex2d((double)(d6 - 3.5), (double)d17);
                                                            GL11.glEnd();
                                                        }
                                                        try {
                                                            block64: {
                                                                try {
                                                                    try {
                                                                        if (!this.e.V.s().booleanValue()) break block63;
                                                                        if (!this.e.Y.s().booleanValue()) break block64;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw GenericDataContainer.a(customSystemException);
                                                                    }
                                                                    if (!bl2) break block65;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw GenericDataContainer.a(customSystemException);
                                                                }
                                                            }
                                                            string3 = geometricRenderingContext.V.g();
                                                            break block66;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw GenericDataContainer.a(customSystemException);
                                                        }
                                                    }
                                                    string3 = string2 = geometricRenderingContext.V.B();
                                                }
                                                if (this.e.Y.s().booleanValue()) {
                                                    string2 = string2.replaceAll("[^\u00a7^\\x00-\\x7F]", "");
                                                }
                                                if (bl3 && (securityAccessController1588 = TemporalMetadataResolver.h.j().A(geometricRenderingContext.V.g())) != null) {
                                                    string2 = securityAccessController1588.x();
                                                }
                                                d2 = cryptographicParameterGenerator.D(string2);
                                                try {
                                                    try {
                                                        if (!this.e.e.s().booleanValue()) break block67;
                                                        if (!bl2) break block68;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw GenericDataContainer.a(customSystemException);
                                                    }
                                                    color4 = geometricRenderingContext.U;
                                                    break block69;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GenericDataContainer.a(customSystemException);
                                                }
                                            }
                                            color4 = new Color(0, 0, 0, 95);
                                        }
                                        color2 = color4;
                                        tl.R();
                                        boolean bl6 = transactionOrchestrator1017.H();
                                        try {
                                            d12 = bl6 ? 1.5 : 0.5;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GenericDataContainer.a(customSystemException);
                                        }
                                        d11 = d12;
                                        try {
                                            color3 = bl6 ? new Color(255, 0, 0, 200) : new Color(0, 0, 0, 102);
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GenericDataContainer.a(customSystemException);
                                        }
                                        color = color3;
                                        f10 = (float)(d5 + (d6 - d5) / 2.0 - d2 / 2.0 - 1.5);
                                        f9 = (float)(d4 - 10.0);
                                        f8 = (float)(d5 + (d6 - d5) / 2.0 + d2 / 2.0 + 1.5);
                                        f7 = (float)(d4 - 1.0);
                                        try {
                                            if (!ConfigurationManager.U()) break block70;
                                            z6.h(f10, f9 + 1.0f, f8 - f10, f7 - f9 + 1.0f, d11, color2, color);
                                            break block71;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GenericDataContainer.a(customSystemException);
                                        }
                                    }
                                    GraphicsBufferAllocator.n(f10, f9, f8, f7, d11, color2, color);
                                }
                                tl.B();
                            }
                            try {
                                cryptographicParameterGenerator2 = cryptographicParameterGenerator;
                                string = string2;
                                d10 = d5 + (d6 - d5) / 2.0 - d2 / 2.0;
                                d9 = d4 - 8.0;
                                n = bl2 ? -1 : geometricRenderingContext.U.getRGB();
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GenericDataContainer.a(customSystemException);
                            }
                            cryptographicParameterGenerator2.S(string, d10, d9, n);
                        }
                    }
                    Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
                    Ne.h.z(2848);
                    tl.B();
                }
                try {
                    GraphicsBufferAllocator.E();
                    if (!bl) break block72;
                    tl.N();
                    break block73;
                }
                catch (CustomSystemException customSystemException) {
                    throw GenericDataContainer.a(customSystemException);
                }
            }
            tl.j();
        }
        CryptoContextNegotiator684.J();
        this.V.clear();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090
    public void d(RenderEventDispatcher renderEventDispatcher) {
        block10: {
            try {
                if (renderEventDispatcher.getWorld().Y()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GenericDataContainer.a(customSystemException);
            }
            CryptographicTransformer cryptographicTransformer = renderEventDispatcher.getEntity();
            double d2 = renderEventDispatcher.getX();
            double d3 = renderEventDispatcher.getY();
            double d4 = renderEventDispatcher.getZ();
            ColorCompositionEngine colorCompositionEngine = this.e.K(renderEventDispatcher.getThePlayer(), cryptographicTransformer.M());
            try {
                if (colorCompositionEngine == null) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GenericDataContainer.a(customSystemException);
            }
            TransactionOrchestrator1017 transactionOrchestrator1017 = new TransactionOrchestrator1017(cryptographicTransformer.M());
            CryptoContextNegotiator684.Y();
            float f = cryptographicTransformer.g();
            oQ oQ2 = cryptographicTransformer.L().B(f, f, f);
            oQ oQ3 = oQ.E(oQ2.F() - cryptographicTransformer.F(), oQ2.c() - cryptographicTransformer.V(), oQ2.v() - cryptographicTransformer.B(), oQ2.f() - cryptographicTransformer.F(), oQ2.P() - cryptographicTransformer.V(), oQ2.R() - cryptographicTransformer.B());
            MultiProtocolContextManager multiProtocolContextManager = ConditionalExecutionManager.a(transactionOrchestrator1017, renderEventDispatcher.getThePlayer());
            GeometricRenderingContext geometricRenderingContext = new GeometricRenderingContext(d2, d3, d4, oQ3, cryptographicTransformer, multiProtocolContextManager, colorCompositionEngine);
            try {
                try {
                    if (!geometricRenderingContext.B) break block10;
                    this.V.add(geometricRenderingContext);
                    if (!this.e.V.s().booleanValue()) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw GenericDataContainer.a(customSystemException);
                }
                renderEventDispatcher.setCanceled(true);
            }
            catch (CustomSystemException customSystemException) {
                throw GenericDataContainer.a(customSystemException);
            }
        }
        CryptoContextNegotiator684.J();
    }

    public GenericDataContainer(ContextualExecutionFramework contextualExecutionFramework, String string) {
        super(contextualExecutionFramework, string);
        this.V = new ArrayList<GeometricRenderingContext>();
    }
}

