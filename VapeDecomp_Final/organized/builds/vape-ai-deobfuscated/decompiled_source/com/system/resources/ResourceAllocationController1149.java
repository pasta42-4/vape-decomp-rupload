/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.system.resources;

import a.Ne;
import a.oQ;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.analytics.computation.AnalyticsComputationEngine;
import com.app.graphics.GraphicsRenderingUtility1454;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.flow.DataFlowAnalyzer;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.math.conversion.NumericTransformationEngine1112;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.user.identity.UserIdentityManager;
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class ResourceAllocationController1149
extends AnalyticsComputationEngine {
    private static int[] V;

    public static int[] S() {
        return V;
    }

    static {
        if (ResourceAllocationController1149.S() == null) {
            ResourceAllocationController1149.X(new int[5]);
        }
    }

    public void P(oQ oQ2, Color color, float f) {
        try {
            if (ConfigurationManager.U()) {
                DataFlowAnalyzer.N(oQ2.F(), oQ2.c(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.v(), f, color);
                DataFlowAnalyzer.N(oQ2.f(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.P(), oQ2.v(), f, color);
                DataFlowAnalyzer.N(oQ2.F(), oQ2.c(), oQ2.R(), oQ2.F(), oQ2.P(), oQ2.R(), f, color);
                DataFlowAnalyzer.N(oQ2.f(), oQ2.c(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.R(), f, color);
                DataFlowAnalyzer.N(oQ2.f(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.R(), f, color);
                DataFlowAnalyzer.N(oQ2.f(), oQ2.P(), oQ2.v(), oQ2.f(), oQ2.P(), oQ2.R(), f, color);
                DataFlowAnalyzer.N(oQ2.F(), oQ2.c(), oQ2.v(), oQ2.F(), oQ2.c(), oQ2.R(), f, color);
                DataFlowAnalyzer.N(oQ2.F(), oQ2.P(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.R(), f, color);
                DataFlowAnalyzer.N(oQ2.F(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.v(), f, color);
                DataFlowAnalyzer.N(oQ2.F(), oQ2.P(), oQ2.v(), oQ2.f(), oQ2.P(), oQ2.v(), f, color);
                DataFlowAnalyzer.N(oQ2.F(), oQ2.c(), oQ2.R(), oQ2.f(), oQ2.c(), oQ2.R(), f, color);
                DataFlowAnalyzer.N(oQ2.F(), oQ2.P(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.R(), f, color);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationController1149.a(customSystemException);
        }
        Ne.h.q((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
        GL11.glBegin((int)1);
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glEnd();
    }

    @Override
    public NumericTransformationEngine1112 n() {
        return NumericTransformationEngine1112.n((int)this.P(), (int)this.K(), (int)this.N());
    }

    @Override
    public void G() {
        double d2;
        double d3;
        double d4;
        block10: {
            d4 = AdaptiveComputationEngine.Q(this.P());
            d3 = AdaptiveComputationEngine.Q(this.K());
            d2 = AdaptiveComputationEngine.Q(this.N());
            TransactionCorrelationEngine transactionCorrelationEngine = ApplicationLifecycleManager.c().R(d4, d3, d2);
            try {
                try {
                    if (transactionCorrelationEngine != null && !transactionCorrelationEngine.Y()) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationController1149.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationController1149.a(customSystemException);
            }
        }
        Ne.h.z();
        boolean bl = Ne.h.k(3042);
        try {
            if (!bl) {
                Ne.h.y(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationController1149.a(customSystemException);
        }
        GL11.glBlendFunc((int)770, (int)771);
        Ne.h.y(2848);
        Ne.h.h(2.0f);
        Ne.h.z(3553);
        Ne.h.E(false);
        double d5 = ApplicationLifecycleManager.r().L();
        double d6 = ApplicationLifecycleManager.r().D();
        double d7 = ApplicationLifecycleManager.r().s();
        Ne.h.m(-d5, -d6, -d7);
        Ne.h.m(d4, d3, d2);
        GraphicsBufferAllocator.V();
        Color color = Color.red;
        Color color2 = Color.red;
        try {
            this.x(oQ.E(-0.001, -0.001, -0.001, 1.001, 1.001, 1.001), color);
            this.P(oQ.E(0.0, 0.0, 0.0, 1.0, 1.0, 1.0).B(0.002f, 0.002f, 0.002f), color2, 2.0f);
            Ne.h.E(true);
            GraphicsBufferAllocator.E();
            Ne.h.y(3553);
            if (!bl) {
                Ne.h.z(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationController1149.a(customSystemException);
        }
        Ne.h.z(2848);
        Ne.h.X();
    }

    public void x(oQ oQ2, Color color) {
        try {
            if (ConfigurationManager.U()) {
                DataFlowAnalyzer.F(oQ2.F(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.P(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.v(), color);
                DataFlowAnalyzer.F(oQ2.f(), oQ2.c(), oQ2.R(), oQ2.F(), oQ2.c(), oQ2.R(), oQ2.F(), oQ2.P(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.R(), color);
                DataFlowAnalyzer.F(oQ2.F(), oQ2.P(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.v(), color);
                DataFlowAnalyzer.F(oQ2.F(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.R(), oQ2.F(), oQ2.c(), oQ2.R(), color);
                DataFlowAnalyzer.F(oQ2.F(), oQ2.c(), oQ2.R(), oQ2.F(), oQ2.c(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.v(), oQ2.F(), oQ2.P(), oQ2.R(), color);
                DataFlowAnalyzer.F(oQ2.f(), oQ2.c(), oQ2.v(), oQ2.f(), oQ2.c(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.R(), oQ2.f(), oQ2.P(), oQ2.v(), color);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationController1149.a(customSystemException);
        }
        Ne.h.q((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, 0.6f);
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glEnd();
    }

    public ResourceAllocationController1149(UserIdentityManager userIdentityManager, double[] dArray) {
        super(userIdentityManager, dArray);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void D(boolean bl) {
        Color color = GraphicsRenderingUtility1454.U(this.d());
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 12.0;
        double d5 = d4 / 2.0;
        ConfigurationManager.r((float)(0.0 - d5), (float)(0.0 - d5 - 8.0), (float)d4, 6.0f, 1.0f, color);
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().u(1.0, false);
        cryptographicParameterGenerator.P(this.z(), 0.0, 0.0 + d5 - 6.0, color);
    }

    public static void X(int[] nArray) {
        V = nArray;
    }
}

