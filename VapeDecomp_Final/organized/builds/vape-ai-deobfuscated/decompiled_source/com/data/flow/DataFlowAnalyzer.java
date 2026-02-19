/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.data.flow;

import a.Ne;
import a.z6;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.obfuscation.NumericScrambler;
import com.dynamic.instrumentation.RuntimeInstrumentationEngine;
import com.encoding.strategy.EncodingStrategyEnum;
import com.graphics.color.ColorCompositionEngine;
import com.math.computation.NumericComputationEngine1131;
import com.security.crypto.CryptographicSessionController;
import com.security.negotiation.CryptoContextNegotiator684;
import com.simulation.physics.PhysicsSimulator1815;
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class DataFlowAnalyzer {
    public static void z(float f, float f2, float f3, float f4, float f5, Color color) {
        DataFlowAnalyzer.D(f, f2, 0.0f, f3, f4, 0.0f, f5, color);
    }

    public static void Z(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, Color color) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine(4, EncodingStrategyEnum.DEFAULT, true).b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, color);
        CryptographicSessionController.x().O(runtimeInstrumentationEngine);
    }

    public static void N(double d2, double d3, double d4, double d5, double d6, double d7, float f, Color color) {
        DataFlowAnalyzer.D((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, f, color);
    }

    public static void D(float f, float f2, float f3, float f4, float f5, float f6, float f7, Color color) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine(2, EncodingStrategyEnum.DEFAULT, true).f(f, f2, f3, f4, f5, f6, f7, color);
        CryptographicSessionController.x().O(runtimeInstrumentationEngine);
    }

    public static void f(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, Color color, Color color2) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine(4, EncodingStrategyEnum.DEFAULT, true).z(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, color, color2);
        CryptographicSessionController.x().O(runtimeInstrumentationEngine);
    }

    public static void g(double d2, double d3, double d4, double d5, Color color) {
        DataFlowAnalyzer.c((float)d2, (float)d3, (float)d4, (float)d5, color);
    }

    public static void l(float f, float f2, float f3, float f4, float f5, float f6, Color color) {
        DataFlowAnalyzer.Z(f, f2, f3, f, f5, f3, f4, f5, f3, f4, f2, f3, color);
        DataFlowAnalyzer.Z(f4, f2, f6, f4, f5, f6, f, f5, f6, f, f2, f6, color);
        DataFlowAnalyzer.Z(f4, f2, f3, f4, f5, f3, f4, f5, f6, f4, f2, f6, color);
        DataFlowAnalyzer.Z(f, f2, f6, f, f5, f6, f, f5, f3, f, f2, f3, color);
        DataFlowAnalyzer.Z(f, f5, f3, f, f5, f6, f4, f5, f6, f4, f5, f3, color);
        DataFlowAnalyzer.Z(f, f2, f3, f4, f2, f3, f4, f2, f6, f, f2, f6, color);
    }

    public static void N(double d2, double d3, double d4, double d5, float f, Color color, Color color2) {
        DataFlowAnalyzer.a((float)d2, (float)d3, (float)d4, (float)d5, f, color, color2);
    }

    public static void O(float f, float f2, float f3, float f4, float f5, float f6, Color color) {
        DataFlowAnalyzer.D(f, f2, f3, f4, f2, f3, 1.0f, color);
        DataFlowAnalyzer.D(f4, f2, f3, f4, f2, f6, 1.0f, color);
        DataFlowAnalyzer.D(f4, f2, f3, f4, f2, f6, 1.0f, color);
        DataFlowAnalyzer.D(f, f2, f3, f, f2, f6, 1.0f, color);
        DataFlowAnalyzer.D(f, f2, f6, f4, f2, f6, 1.0f, color);
        DataFlowAnalyzer.D(f, f2, f3, f, f5, f3, 1.0f, color);
        DataFlowAnalyzer.D(f4, f2, f6, f4, f5, f6, 1.0f, color);
        DataFlowAnalyzer.D(f, f2, f6, f, f5, f6, 1.0f, color);
        DataFlowAnalyzer.D(f4, f2, f3, f4, f5, f3, 1.0f, color);
        DataFlowAnalyzer.D(f, f5, f3, f4, f5, f3, 1.0f, color);
        DataFlowAnalyzer.D(f4, f5, f3, f4, f5, f6, 1.0f, color);
        DataFlowAnalyzer.D(f, f5, f3, f, f5, f6, 1.0f, color);
        DataFlowAnalyzer.D(f, f5, f6, f4, f5, f6, 1.0f, color);
    }

    public static void d(double d2, double d3, double d4, double d5, double d6, double d7, Color color) {
        DataFlowAnalyzer.l((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, color);
    }

    public static void X(double d2, double d3, double d4, double d5, double d6, double d7, Color color) {
        DataFlowAnalyzer.O((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, color);
    }

    public static void t(double d2, double d3, double d4, double d5, float f, Color color) {
        DataFlowAnalyzer.d((float)d2, (float)d3, (float)d4, (float)d5, f, color);
    }

    public static void r(float f, float f2, PhysicsSimulator1815 physicsSimulator1815, NumericScrambler numericScrambler, Color color, float f3) {
        z6.p = numericScrambler;
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().S(f, f2, physicsSimulator1815, color, f3);
        CryptographicSessionController.x().O(runtimeInstrumentationEngine);
    }

    public static void F(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, Color color) {
        DataFlowAnalyzer.Z((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, (float)d8, (float)d9, (float)d10, (float)d11, (float)d12, (float)d13, color);
    }

    public static void s(double d2, double d3, double d4, float f, float f2, float f3, Color color) {
        double d5 = NumericComputationEngine1131.b();
        double d6 = NumericComputationEngine1131.S();
        double d7 = NumericComputationEngine1131.n();
        float f4 = (float)(d2 - d5);
        float f5 = (float)(d3 - d6);
        float f6 = (float)(d4 - d7);
        CryptoContextNegotiator684.Y();
        ApplicationLifecycleManager.U().H(1.0);
        Ne.h.y(3042);
        GL11.glBlendFunc((int)770, (int)771);
        Ne.h.E(false);
        Ne.h.z(2884);
        float f7 = f5;
        float f8 = f5 + f3;
        ColorCompositionEngine colorCompositionEngine = new ColorCompositionEngine(color).I(0);
        Color color2 = color;
        float f9 = 0.0f;
        float f10 = 0.0f;
        boolean bl = false;
        int n = 0;
        while ((float)n <= f) {
            float f11 = (float)(Math.PI * 2 * (double)n / (double)f);
            float f12 = (float)((double)f2 * Math.cos(f11) + (double)f4);
            float f13 = (float)((double)f2 * Math.sin(f11) + (double)f6);
            if (!bl) {
                bl = true;
                f9 = f12;
                f10 = f13;
            } else {
                DataFlowAnalyzer.f(f12, f8, f13, f9, f8, f10, f9, f7, f10, f12, f7, f13, colorCompositionEngine, color2);
                f9 = f12;
                f10 = f13;
            }
            ++n;
        }
        Ne.h.E(true);
        Ne.h.z(3042);
        ApplicationLifecycleManager.U().F(1.0);
        CryptoContextNegotiator684.J();
    }

    public static void d(float f, float f2, float f3, float f4, float f5, Color color) {
        DataFlowAnalyzer.D(f, f2, 0.0f, f3, f2, 0.0f, f5, color);
        DataFlowAnalyzer.D(f3, f2, 0.0f, f3, f4, 0.0f, f5, color);
        DataFlowAnalyzer.D(f3, f4, 0.0f, f, f4, 0.0f, f5, color);
        DataFlowAnalyzer.D(f, f4, 0.0f, f, f2, 0.0f, f5, color);
    }

    public static void c(float f, float f2, float f3, float f4, Color color) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine(4, EncodingStrategyEnum.DEFAULT, true).j(f, f2, f3, f4, color);
        CryptographicSessionController.x().O(runtimeInstrumentationEngine);
    }

    public static void a(float f, float f2, float f3, float f4, float f5, Color color, Color color2) {
        if (color.equals(color2)) {
            f5 = 0.0f;
            RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine(4, EncodingStrategyEnum.DEFAULT, true).j(f, f2, f3 - f5, f4 - f5, color);
            CryptographicSessionController.x().O(runtimeInstrumentationEngine);
            return;
        }
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine(4, EncodingStrategyEnum.DEFAULT, true).j(f -= f5, f2, (f3 += f5) - f5, (f4 += f5) - f5, color);
        CryptographicSessionController.x().O(runtimeInstrumentationEngine);
        float f6 = f + f3;
        float f7 = f2 + f4;
    }

    public static void c(double d2, double d3, double d4, double d5, float f, Color color) {
        DataFlowAnalyzer.z((float)d2, (float)d3, (float)d4, (float)d5, f, color);
    }
}

