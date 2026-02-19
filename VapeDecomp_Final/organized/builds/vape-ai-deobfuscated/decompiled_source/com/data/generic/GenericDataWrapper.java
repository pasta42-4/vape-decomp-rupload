/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.data.generic;

import a.Ne;
import a.oQ;
import com.app.context.transformation.ContextTransformationEngine;
import com.communication.protocol.DataExchangeProtocol2090;
import com.data.transformation.DataTransformationPipeline;
import com.event.dispatch.EventDispatchRegistry2111;
import com.exception.system.CustomSystemException;
import com.graphics.color.ColorCompositionEngine;
import com.math.computation.NumericComputationEngine1131;
import com.runtime.context.ContextualExecutionFramework;
import com.security.crypto.CryptographySessionManager;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transform.CryptographicTransformer;
import com.temporal.metadata.TemporalMetadataResolver;
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class GenericDataWrapper
extends ContextTransformationEngine<DataTransformationPipeline> {
    private CryptographySessionManager m;
    private final DataTransformationPipeline B = (DataTransformationPipeline)this.n();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090
    public void R(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        eventDispatchRegistry2111.getEntityRenderer().H(1.0);
        CryptoContextNegotiator684.Y();
        boolean bl = Ne.h.k(3042);
        try {
            if (!bl) {
                Ne.h.y(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericDataWrapper.a(customSystemException);
        }
        GL11.glBlendFunc((int)770, (int)771);
        Ne.h.h(1.5f);
        Ne.h.z(3553);
        Ne.h.y(2848);
        Ne.h.z(2929);
        Ne.h.E(false);
        double d2 = NumericComputationEngine1131.b();
        double d3 = NumericComputationEngine1131.S();
        double d4 = NumericComputationEngine1131.n();
        try {
            if (this.m == null) {
                this.m = TemporalMetadataResolver.h.U().K(CryptographySessionManager.class);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericDataWrapper.a(customSystemException);
        }
        for (Object e : eventDispatchRegistry2111.getWorld().L()) {
            float f;
            float f2;
            CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(e);
            try {
                try {
                    if (TemporalMetadataResolver.h.a().P(cryptographicTransformer) && this.B.r.s().booleanValue()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GenericDataWrapper.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GenericDataWrapper.a(customSystemException);
            }
            ColorCompositionEngine colorCompositionEngine = this.B.K(eventDispatchRegistry2111.getThePlayer(), e);
            try {
                if (colorCompositionEngine == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GenericDataWrapper.a(customSystemException);
            }
            double d5 = cryptographicTransformer.b();
            double d6 = cryptographicTransformer.q();
            double d7 = cryptographicTransformer.I();
            double d8 = d5 + (cryptographicTransformer.F() - d5) * (double)eventDispatchRegistry2111.getTicks();
            double d9 = d6 + (cryptographicTransformer.V() - d6) * (double)eventDispatchRegistry2111.getTicks();
            double d10 = d7 + (cryptographicTransformer.B() - d7) * (double)eventDispatchRegistry2111.getTicks();
            try {
                f2 = cryptographicTransformer.g();
                f = this.B.v.s() != false ? this.m.F() : 0.0f;
            }
            catch (CustomSystemException customSystemException) {
                throw GenericDataWrapper.a(customSystemException);
            }
            float f3 = f2 + f;
            oQ oQ2 = cryptographicTransformer.L();
            oQ oQ3 = oQ2.B(f3, f3, f3);
            try {
                try {
                    CryptoContextNegotiator684.x(d8 - (oQ3.F() - oQ3.f()) / 2.0, d9 + (oQ3.c() - cryptographicTransformer.V()), d10 - (oQ3.v() - oQ3.R()) / 2.0, oQ3.v() - oQ3.R(), oQ3.P() - oQ3.c(), oQ3.F() - oQ3.f(), 0.1, colorCompositionEngine, null, d2, d3, d4);
                    if (!(this.m.F() > 0.0f) || !this.B.v.s().booleanValue()) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw GenericDataWrapper.a(customSystemException);
                }
                if (!this.B.m.s().booleanValue()) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw GenericDataWrapper.a(customSystemException);
            }
            oQ3 = oQ2.B(cryptographicTransformer.g(), cryptographicTransformer.g(), cryptographicTransformer.g());
            Color color = new Color(255 - ((Color)colorCompositionEngine).getRed(), 255 - ((Color)colorCompositionEngine).getGreen(), 255 - ((Color)colorCompositionEngine).getBlue(), 70);
            CryptoContextNegotiator684.x(d8 - (oQ3.F() - oQ3.f()) / 2.0, d9 - (oQ3.c() - cryptographicTransformer.V()), d10 - (oQ3.v() - oQ3.R()) / 2.0, oQ3.v() - oQ3.R(), oQ3.P() - oQ3.c(), oQ3.F() - oQ3.f(), 0.1, color, null, d2, d3, d4);
        }
        try {
            Ne.h.E(true);
            Ne.h.y(2929);
            Ne.h.y(3553);
            Ne.h.z(2848);
            if (!bl) {
                Ne.h.z(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericDataWrapper.a(customSystemException);
        }
        CryptoContextNegotiator684.J();
        eventDispatchRegistry2111.getEntityRenderer().F(1.0);
    }

    public GenericDataWrapper(ContextualExecutionFramework contextualExecutionFramework, String string) {
        super(contextualExecutionFramework, string);
    }
}

