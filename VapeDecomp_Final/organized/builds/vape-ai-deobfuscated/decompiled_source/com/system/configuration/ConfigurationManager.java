/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.system.configuration;

import a.Ne;
import a.a;
import a.kS;
import a.tR;
import a.tl;
import a.z6;
import com.algorithm.calibration.AlgorithmParameterCalibrator;
import com.app.data.transformation.DataTransformationEngine1165;
import com.app.workflow.StateTrackingCoordinator;
import com.bytecode.reflection.MethodDescriptorTransformer;
import com.compliance.management.ComplianceOrchestrator;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.flow.DataFlowAnalyzer;
import com.data.obfuscation.NumericScrambler;
import com.data.transformation.DataTransformationEngine1209;
import com.dynamic.instrumentation.RuntimeInstrumentationEngine;
import com.encoding.strategy.EncodingStrategyEnum;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.graphics.buffer.GraphicsBufferManager;
import com.graphics.color.ColorCompositionEngine;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.network.protocol.NetworkProtocolEncoder1023;
import com.network.protocol.NetworkProtocolEncoder1043;
import com.network.protocol.ProtocolInteractionController;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.LightweightExecutionContext;
import com.security.crypto.CryptoParameterEncoder;
import com.security.crypto.CryptographicSessionController;
import com.security.crypto.CryptographicTransformationManager1061;
import com.security.encryption.SecureDataEncryptor1062;
import com.security.keymanagement.CipherKeyExchanger1067;
import com.security.keymanagement.CryptoKeyRotationHandler;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transform.SecureDataTransformer881;
import com.security.transformation.SecureDataTransformer1049;
import com.system.resource.ResourceAllocationManager707;
import com.system.resources.ResourceAllocationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import java.awt.Color;
import java.util.function.Supplier;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ConfigurationManager {
    private static CryptoParameterEncoder O;
    private static CryptoKeyRotationHandler Q;
    private static AlgorithmParameterCalibrator b;
    private static MethodDescriptorTransformer M;
    private static boolean K;
    private static CipherKeyExchanger1067 F;
    public static ResourceAllocationManager707 W;
    private static GraphicsBufferManager j;
    private static boolean y;
    private static kS r;
    private static boolean L;
    private static boolean d;
    private static int I;
    private static NetworkProtocolEncoder1023 J;
    private static NetworkProtocolEncoder1043 G;
    private static GraphicsBufferManager u;
    private static SecureDataEncryptor1062 E;
    public static SecureDataTransformer1049 z;
    public static boolean f;
    private static boolean p;
    private static CryptographicTransformationManager1061 c;

    public static void y(double d2, double d3, double d4, double d5, float f, float f2) {
        block9: {
            try {
                try {
                    if (d4 != 0.0 && d5 != 0.0) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationManager.a(customSystemException);
            }
        }
        try {
            if (ConfigurationManager.U()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        float f3 = 0.5f;
        if (f == 0.0f) {
            f3 = 0.0f;
        }
        float f4 = f2;
        float f5 = Math.max(0.0f, (f += f3 * 2.0f) - f4);
        if (f != 0.0f) {
            d2 -= (double)f4 - 0.5;
            d3 -= (double)f4;
            d5 += (double)f4 * 1.5;
            d4 += (double)(f4 * 1.0f);
        }
        F.s();
        F.O(f5);
        F.Q((float)d2 + f, (float)d3 + f, (float)(d2 + d4) - f, (float)(d3 + d5) - f);
        F.C(f4);
        ConfigurationManager.p();
        tl.B();
        float f6 = 0.0f;
        float f7 = 1.0f;
        float f8 = 1.0f;
        float f9 = 0.0f;
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)f8, (float)f7);
        GL11.glVertex2d((double)(d2 + d4), (double)d3);
        GL11.glTexCoord2f((float)f6, (float)f7);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glTexCoord2f((float)f6, (float)f9);
        GL11.glVertex2d((double)d2, (double)(d3 + d5));
        GL11.glTexCoord2f((float)f8, (float)f9);
        GL11.glVertex2d((double)(d2 + d4), (double)(d3 + d5));
        GL11.glEnd();
        ConfigurationManager.E();
        F.m();
    }

    public static void U(double d2, double d3, double d4, double d5, Color color, float f, float f2, float f3) {
        try {
            if (ConfigurationManager.U()) {
                z6.o((float)d2, (float)d3, (float)d4, (float)d5, color, f, f2, f3);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        float f4 = 0.5f;
        float f5 = f3;
        c.s();
        c.p((float)d2 + f + f2, (float)(d3 -= (double)f5) + f + f2, (float)((d2 -= (double)f5 - 0.5) + (d4 += (double)(f5 * 1.0f))) - (f + f2), (float)(d3 + (d5 += (double)f5 * 1.5)) - (f + f2));
        c.v(f, f3, f2);
        ConfigurationManager.p();
        ConfigurationManager.q(color);
        j.f();
        j.N((float)d2 + f4, (float)d3 + f4);
        j.N((float)(d2 + d4 - (double)f4), (float)d3 + f4);
        j.N((float)(d2 + d4 - (double)f4), (float)(d3 + d5 - (double)f4));
        j.N((float)d2 + f4, (float)(d3 + d5 - (double)f4));
        j.P();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        ConfigurationManager.E();
        c.m();
    }

    public static void g(double d2, double d3, double d4, double d5, float f, Color color) {
        try {
            if (ConfigurationManager.U()) {
                z6.S((float)d2, (float)d3, (float)d4, (float)d5, f, color);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        boolean bl = GL11.glIsEnabled((int)3042);
        boolean bl2 = GL11.glIsEnabled((int)3553);
        try {
            if (!bl) {
                tl.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        try {
            if (bl2) {
                tl.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        try {
            GL11.glColor4d((double)((double)color.getRed() / 255.0), (double)((double)color.getGreen() / 255.0), (double)((double)color.getBlue() / 255.0), (double)((double)color.getAlpha() / 255.0));
            GL11.glLineWidth((float)f);
            Ne.h.y(2848);
            GL11.glBegin((int)3);
            GL11.glVertex2d((double)d2, (double)d3);
            GL11.glVertex2d((double)d4, (double)d5);
            GL11.glEnd();
            if (bl2) {
                tl.B();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        try {
            if (!bl) {
                tl.j();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
    }

    public static void s(double d2, double d3, double d4, double d5, float f, float f2, Color color) {
        block10: {
            try {
                if (ConfigurationManager.U()) {
                    z6.t((float)d2, (float)d3, (float)d4, (float)d5, f, f2, color);
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationManager.a(customSystemException);
            }
            try {
                try {
                    if (d4 != 0.0 && d5 != 0.0) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationManager.a(customSystemException);
            }
        }
        try {
            if (!G.s()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        G.R((float)d2, (float)(d3 -= 1.0), (float)d4, (float)(d5 += 1.0));
        G.t(f);
        G.M(color);
        G.D(f2);
        ConfigurationManager.p();
        j.f();
        j.N((float)d2 - f, (float)d3 - f);
        j.N((float)(d2 + d4 + (double)f), (float)d3 - f);
        j.N((float)(d2 + d4 + (double)f), (float)(d3 + d5 + (double)f));
        j.N((float)d2 - f, (float)(d3 + d5 + (double)f));
        j.P();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        ConfigurationManager.E();
        G.m();
    }

    public static void c(float f, float f2, float f3, float f4, Color color, NumericScrambler numericScrambler) {
        try {
            if (ConfigurationManager.U()) {
                z6.A(f, f2, f3, f4, color, numericScrambler);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        numericScrambler.p();
        f -= f4 / 2.0f;
        f2 -= f4 / 2.0f;
        float f5 = f3 += f4;
        float f6 = f3;
        try {
            if (color != null) {
                ConfigurationManager.q(color);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        Q.s();
        ConfigurationManager.p();
        Q.I(f3 / 2.0f);
        Q.B(f4);
        Q.B(f + f5 / 2.0f, f2 + f6 / 2.0f);
        tl.B();
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 1.0f;
        float f10 = 1.0f;
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)f9, (float)f8);
        GL11.glVertex2f((float)(f + f5), (float)f2);
        GL11.glTexCoord2f((float)f7, (float)f8);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glTexCoord2f((float)f7, (float)f10);
        GL11.glVertex2f((float)f, (float)(f2 + f6));
        GL11.glTexCoord2f((float)f9, (float)f10);
        GL11.glVertex2f((float)(f + f5), (float)(f2 + f6));
        GL11.glEnd();
        ConfigurationManager.E();
        Q.m();
    }

    public static void g(double d2, double d3, double d4, double d5, float f, float f2, float f3, int n) {
        block7: {
            try {
                try {
                    if (d4 != 0.0 && d5 != 0.0) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationManager.a(customSystemException);
            }
        }
        try {
            if (!z.z()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        z.s();
        z.p(f);
        z.R((float)d4, (float)d5);
        z.x(n);
        ConfigurationManager.p();
        tl.s();
        tl.B();
        float f4 = 0.0f;
        float f5 = 1.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)f6, (float)f5);
        GL11.glVertex2d((double)(d2 + d4), (double)d3);
        GL11.glTexCoord2f((float)f4, (float)f5);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glTexCoord2f((float)f4, (float)f7);
        GL11.glVertex2d((double)d2, (double)(d3 + d5));
        GL11.glTexCoord2f((float)f6, (float)f7);
        GL11.glVertex2d((double)(d2 + d4), (double)(d3 + d5));
        GL11.glEnd();
        ConfigurationManager.E();
        z.m();
    }

    public static void B(double d2, double d3, double d4, Color color) {
        for (double d5 = 0.0; d5 < d4; d5 += 2.0) {
            ConfigurationManager.r(d2 + d5, d3, 1.0, 1.0f, color);
        }
    }

    public static void N(int n, double d2, double d3, double d4) {
        try {
            if (n < 1) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        ConfigurationManager.G(LightweightExecutionContext.d(ProtocolInteractionController.Y(n)), d2, d3, d4);
    }

    public static void x(String string, double d2, double d3, double d4, double d5, Color color) {
        ConfigurationManager.O(string, (float)d2, (float)d3, (float)d4, (float)d5, color);
    }

    public static void h(float f, float f2, float f3, float f4, Color color, double d2, Color color2) {
        try {
            if (ConfigurationManager.U()) {
                z6.J(f, f2, f3, f4, color, (float)d2, color2);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        f -= f4 / 2.0f;
        f2 -= f4 / 2.0f;
        float f5 = f3 += f4;
        float f6 = f3;
        if (color2 != null) {
            ConfigurationManager.q(color2);
            double d3 = (double)(f + f5 / 2.0f) - d2 / 2.0;
            ConfigurationManager.S(d3, f2, d2, f3, color2);
        }
        E.s();
        ConfigurationManager.p();
        E.I(f3 / 2.0f);
        E.B(f4);
        E.B(f + f5 / 2.0f, f2 + f6 / 2.0f);
        ConfigurationManager.q(color);
        j.f();
        j.N(f, f2);
        j.N(f + f5, f2);
        j.N(f + f5, f2 + f6);
        j.N(f, f2 + f6);
        j.P();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        ConfigurationManager.E();
        E.m();
    }

    public static void q(Color color) {
        Ne.h.q((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
    }

    public static int R() {
        return I;
    }

    public static void V(float f, float f2, float f3, float f4, float f5, float f6, float f7, Color color) {
        try {
            if (ConfigurationManager.U()) {
                z6.r(f, f2, f3, f4, f5, f6, f7, color);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        float f8 = (f3 += f5 * 4.0f) / 2.0f;
        M.s();
        M.Q(f8 - f4 / 2.0f, f4 / 2.0f);
        M.t((f -= f5 * 2.0f) + f8, (f2 -= f5 * 2.0f) + f8);
        M.T(f5);
        M.M(f6, f7);
        ConfigurationManager.p();
        ConfigurationManager.q(color);
        j.f();
        j.N(f, f2);
        j.N(f + f3, f2);
        j.N(f + f3, f2 + f3);
        j.N(f, f2 + f3);
        j.P();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        ConfigurationManager.E();
        M.m();
    }

    public static void r(double d2, double d3, double d4, float f, Color color) {
        ConfigurationManager.g(d2, d3, d2 + d4, d3, f, color);
    }

    public static void r(float f, float f2, float f3, float f4, float f5, Color color) {
        try {
            if (ConfigurationManager.U()) {
                z6.m(f, f2, f3, f4, f5, color);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        f -= f5 / 2.0f;
        f2 -= f5 / 2.0f;
        float f6 = f3 += f5;
        float f7 = f3;
        r.s();
        r.h(f3 / 2.0f, f4);
        r.w(f5);
        r.x(f + f6 / 2.0f, f2 + f7 / 2.0f);
        ConfigurationManager.p();
        ConfigurationManager.q(color);
        j.f();
        j.N(f, f2);
        j.N(f + f6, f2);
        j.N(f + f6, f2 + f7);
        j.N(f, f2 + f7);
        j.P();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        ConfigurationManager.E();
        r.m();
    }

    public static void A(double d2, double d3, double d4, double d5) {
        block4: {
            try {
                try {
                    if (d4 != 0.0 && d5 != 0.0) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationManager.a(customSystemException);
            }
        }
        float f = 12.0f;
        W.w((float)d2, (float)(d3 -= 1.0), (float)d4, (float)(d5 += 1.0));
        ConfigurationManager.p();
        j.f();
        j.N((float)d2 - f, (float)d3 - f);
        j.N((float)(d2 + d4 + (double)f), (float)d3 - f);
        j.N((float)(d2 + d4 + (double)f), (float)(d3 + d5 + (double)f));
        j.N((float)d2 - f, (float)(d3 + d5 + (double)f));
        j.P();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        ConfigurationManager.E();
    }

    private static void E() {
        try {
            if (ConfigurationManager.U()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        try {
            if (f) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        try {
            GL11.glPopMatrix();
            if (p) {
                tl.B();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        try {
            if (!y) {
                tl.j();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        try {
            if (K) {
                tl.V();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
    }

    private static Void lambda$drawItemSprite$0(double d2, LightweightExecutionContext lightweightExecutionContext, double d3, double d4) {
        block5: {
            DataTransformationEngine1209 dataTransformationEngine1209;
            float f;
            SecureDataTransformer881 secureDataTransformer881;
            block4: {
                DataTransformationEngine1165 dataTransformationEngine1165;
                secureDataTransformer881 = ApplicationLifecycleManager.g();
                double d5 = TemporalMetadataResolver.h.a().b();
                double d6 = d2 * d5;
                float f2 = (float)ApplicationLifecycleManager.l().k(ApplicationLifecycleManager.N().p(), false) / 2.0f;
                f = 1.0f / f2;
                dataTransformationEngine1209 = DataTransformationEngine1209.i();
                dataTransformationEngine1209.g();
                dataTransformationEngine1209.s(f, f, f);
                dataTransformationEngine1209.T(d6, d6, d6);
                dataTransformationEngine1209.m(0.5, -0.5, 0.0);
                if (GameVersionEnumerator.MC_1_21_6.H()) {
                    ComplianceOrchestrator complianceOrchestrator = ComplianceOrchestrator.G(16);
                    complianceOrchestrator.C();
                    complianceOrchestrator.z(f, f);
                    complianceOrchestrator.G(d6, d6);
                    complianceOrchestrator.S(0.5, -0.5);
                    dataTransformationEngine1165 = DataTransformationEngine1165.m(complianceOrchestrator);
                } else {
                    dataTransformationEngine1165 = DataTransformationEngine1165.F(dataTransformationEngine1209);
                }
                try {
                    if (GeometryCalculator.C() < 50) break block4;
                    secureDataTransformer881.p(dataTransformationEngine1165, lightweightExecutionContext, (int)(d3 / d6 * d5), (int)(d4 / d6 * d5));
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager.a(customSystemException);
                }
            }
            secureDataTransformer881.b(lightweightExecutionContext, (int)(d3 * (double)f), (int)(d4 * (double)f), dataTransformationEngine1209);
        }
        return null;
    }

    public static void h(LightweightExecutionContext lightweightExecutionContext, double d2, double d3, double d4, boolean bl) {
        boolean bl2;
        block17: {
            block18: {
                boolean bl3;
                block15: {
                    block16: {
                        if (ConfigurationManager.U()) {
                            Supplier<Void> supplier = () -> ConfigurationManager.lambda$drawItemSprite$0(d2, lightweightExecutionContext, d3, d4);
                            RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine(EncodingStrategyEnum.MINECRAFT, false).W(supplier);
                            CryptographicSessionController.x().p(runtimeInstrumentationEngine);
                            return;
                        }
                        GL11.glPushMatrix();
                        bl3 = GL11.glIsEnabled((int)2929);
                        bl2 = GL11.glIsEnabled((int)3042);
                        try {
                            try {
                                if (bl3 == bl) break block15;
                                if (!bl) break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConfigurationManager.a(customSystemException);
                            }
                            tl.k();
                            break block15;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationManager.a(customSystemException);
                        }
                    }
                    tl.w();
                }
                try {
                    if (!bl2) {
                        tl.N();
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager.a(customSystemException);
                }
                SecureDataTransformer881 secureDataTransformer881 = ApplicationLifecycleManager.g();
                float f = secureDataTransformer881.M();
                secureDataTransformer881.Y(110.0f);
                tR.g();
                tR.c();
                double d5 = 1.0 / d2;
                try {
                    try {
                        GL11.glScaled((double)d2, (double)d2, (double)d2);
                        secureDataTransformer881.L(ApplicationLifecycleManager.X(), ApplicationLifecycleManager.s(), lightweightExecutionContext, (int)(d3 * d5), (int)(d4 * d5));
                        GL11.glScaled((double)d5, (double)d5, (double)d5);
                        tR.g();
                        secureDataTransformer881.Y(f);
                        if (bl3 == bl) break block17;
                        if (!bl3) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationManager.a(customSystemException);
                    }
                    tl.k();
                    break block17;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager.a(customSystemException);
                }
            }
            tl.w();
        }
        try {
            if (!bl2) {
                tl.j();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        GL11.glPopMatrix();
    }

    public static void z(double d2, double d3, double d4, double d5, int n, boolean bl) {
        block7: {
            try {
                try {
                    tl.O(n);
                    if (d4 != 0.0 && d5 != 0.0) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationManager.a(customSystemException);
            }
        }
        double d6 = 0.0;
        double d7 = 0.0;
        double d8 = 1.0;
        double d9 = 1.0;
        if (ConfigurationManager.U()) {
            block9: {
                RuntimeInstrumentationEngine runtimeInstrumentationEngine;
                block8: {
                    runtimeInstrumentationEngine = new RuntimeInstrumentationEngine(EncodingStrategyEnum.DEFAULT, bl).D(new NumericScrambler(n)).E((float)d2, (float)d3, (float)d4, (float)d5, (float)d4, (float)d5, (float)d6, (float)d7, (float)d8, (float)d9, Color.WHITE);
                    try {
                        if (!bl) break block8;
                        CryptographicSessionController.x().O(runtimeInstrumentationEngine);
                        break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationManager.a(customSystemException);
                    }
                }
                CryptographicSessionController.x().p(runtimeInstrumentationEngine);
            }
            return;
        }
        ConfigurationManager.p();
        tl.B();
        GL11.glBegin((int)7);
        GL11.glTexCoord2d((double)d8, (double)d7);
        GL11.glVertex2d((double)(d2 + d4), (double)d3);
        GL11.glTexCoord2d((double)d6, (double)d7);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glTexCoord2d((double)d6, (double)d9);
        GL11.glVertex2d((double)d2, (double)(d3 + d5));
        GL11.glTexCoord2d((double)d8, (double)d9);
        GL11.glVertex2d((double)(d2 + d4), (double)(d3 + d5));
        GL11.glEnd();
        ConfigurationManager.E();
    }

    public static void T(double d2, double d3, double d4, float f, Color color) {
        ConfigurationManager.g(d2, d3, d2, d3 + d4, f, color);
    }

    static {
        j = new GraphicsBufferManager();
        u = new GraphicsBufferManager();
        ConfigurationManager.n(0);
        f = false;
    }

    public static void C(double d2, double d3, double d4, double d5, Color color, float f) {
        ConfigurationManager.o(d2, d3, d4, d5, color, false, f, 1.0f);
    }

    public static void T(double d2, double d3, double d4, double d5, Color color) {
        ConfigurationManager.h((float)d2, (float)d3, (float)d4, (float)d5, color, 0.0, null);
    }

    public static boolean U() {
        boolean bl;
        try {
            bl = GeometryCalculator.C() >= 37;
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        return bl;
    }

    public static void G(LightweightExecutionContext lightweightExecutionContext, double d2, double d3, double d4) {
        ConfigurationManager.h(lightweightExecutionContext, d2, d3, d4, false);
    }

    public static void F() {
        try {
            if (!ConfigurationManager.U()) {
                j.v(8, 7, 2);
                u.v(40, 7, 2);
                b = new AlgorithmParameterCalibrator();
                G = new NetworkProtocolEncoder1043();
                E = new SecureDataEncryptor1062();
                r = new kS();
                M = new MethodDescriptorTransformer();
                c = new CryptographicTransformationManager1061();
                z = new SecureDataTransformer1049();
                F = new CipherKeyExchanger1067();
                J = new NetworkProtocolEncoder1023();
                Q = new CryptoKeyRotationHandler();
                O = new CryptoParameterEncoder();
                W = new ResourceAllocationManager707();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
    }

    public static void c(double d2, double d3, double d4, double d5, Color color, boolean bl, float f, float f2, float f3, Color color2) {
        ConfigurationManager.g(d2, d3, d4, d5, color, bl, f, f2, f3, color2, 15);
    }

    public static void n(int n) {
        I = n;
    }

    public static void f(int n, int n2) {
        try {
            if (ConfigurationManager.U()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        a.rs(1, n, n2);
    }

    public static void F(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, Color color) {
        try {
            if (ConfigurationManager.U()) {
                z6.n(d2, d3, d4, d5, d6, d7, d8, d9, color);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        boolean bl = GL11.glIsEnabled((int)3042);
        boolean bl2 = GL11.glIsEnabled((int)3553);
        try {
            if (!bl) {
                tl.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        try {
            if (bl2) {
                tl.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        try {
            GL11.glBlendFunc((int)770, (int)771);
            Ne.h.y(2881);
            GL11.glPushMatrix();
            GL11.glColor4d((double)((double)color.getRed() / 255.0), (double)((double)color.getGreen() / 255.0), (double)((double)color.getBlue() / 255.0), (double)((double)color.getAlpha() / 255.0));
            GL11.glBegin((int)7);
            GL11.glVertex2d((double)d4, (double)d5);
            GL11.glVertex2d((double)d2, (double)d3);
            GL11.glVertex2d((double)d8, (double)d9);
            GL11.glVertex2d((double)d6, (double)d7);
            GL11.glEnd();
            GL11.glPopMatrix();
            Ne.h.z(2881);
            if (bl2) {
                tl.B();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        try {
            if (!bl) {
                tl.j();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void J(double d2, double d3, double d4, double d5, int n, boolean bl) {
        block7: {
            try {
                try {
                    tl.O(n);
                    if (d4 != 0.0 && d5 != 0.0) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationManager.a(customSystemException);
            }
        }
        double d6 = 0.0;
        double d7 = 1.0;
        double d8 = 1.0;
        double d9 = 0.0;
        if (ConfigurationManager.U()) {
            block9: {
                RuntimeInstrumentationEngine runtimeInstrumentationEngine;
                block8: {
                    runtimeInstrumentationEngine = new RuntimeInstrumentationEngine(EncodingStrategyEnum.DEFAULT, bl).D(new NumericScrambler(n)).v((float)d2, (float)d3, (float)d4, (float)d5, (float)d4, (float)d5, (float)d6, (float)d7, (float)d8, (float)d9, Color.WHITE);
                    try {
                        if (!bl) break block8;
                        CryptographicSessionController.x().O(runtimeInstrumentationEngine);
                        break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationManager.a(customSystemException);
                    }
                }
                CryptographicSessionController.x().p(runtimeInstrumentationEngine);
            }
            return;
        }
        ConfigurationManager.p();
        tl.B();
        GL11.glBegin((int)7);
        GL11.glTexCoord2d((double)d8, (double)d7);
        GL11.glVertex2d((double)(d2 + d4), (double)d3);
        GL11.glTexCoord2d((double)d6, (double)d7);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glTexCoord2d((double)d6, (double)d9);
        GL11.glVertex2d((double)d2, (double)(d3 + d5));
        GL11.glTexCoord2d((double)d8, (double)d9);
        GL11.glVertex2d((double)(d2 + d4), (double)(d3 + d5));
        GL11.glEnd();
        ConfigurationManager.E();
    }

    public static void o(double d2, double d3, double d4, double d5, Color color, boolean bl, float f, float f2) {
        ConfigurationManager.c(d2, d3, d4, d5, color, bl, f, f2, 8.0f, new Color(0, 0, 0, 152));
    }

    public static void R(int n, int n2) {
        try {
            if (!ConfigurationManager.U()) {
                a.rs(0, n, n2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        Ne.h.J(2.0f, 2.0f, 2.0f);
    }

    public static void O(String string, float f, float f2, float f3, float f4, Color color) {
        StateTrackingCoordinator.B(color, f - f3 / 2.0f, f2 - f4 / 2.0f, string, f3, f4, false);
    }

    public static boolean p() {
        block6: {
            boolean bl;
            block8: {
                block7: {
                    try {
                        try {
                            try {
                                if (L) break block6;
                                if (ReflectionMetadataResolver.P_ == null) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConfigurationManager.a(customSystemException);
                            }
                            if (ReflectionMetadataResolver.PQ != null) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationManager.a(customSystemException);
                        }
                        bl = true;
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationManager.a(customSystemException);
                    }
                }
                bl = false;
            }
            d = bl;
            L = true;
        }
        return d;
    }

    public static void S(double d2, double d3, double d4, double d5, Color color) {
        ConfigurationManager.o(d2, d3, d4, d5, color, false, 1.5f, 1.0f);
    }

    public static void h(String string) {
        try {
            if (ConfigurationManager.U()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        int n = GL11.glGetError();
    }

    public static int n() {
        int n = ConfigurationManager.R();
        try {
            if (n == 0) {
                return 117;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        return 0;
    }

    public static void Y() {
        ConfigurationManager.f(ApplicationLifecycleManager.e(), ApplicationLifecycleManager.b());
    }

    public static void q(double d2, double d3, double d4, double d5, double d6, Color color, Color color2) {
        try {
            if (ConfigurationManager.U()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        if (color.equals(color2)) {
            d6 = 0.0;
            ConfigurationManager.A(d2, d3, d4 - d6, d5 - d6, color);
            return;
        }
        ConfigurationManager.A(d2 -= d6, d3, (d4 += d6) - d6, (d5 += d6) - d6, color);
        ConfigurationManager.p();
        u.f();
        ConfigurationManager.q(color2);
        u.N((float)(d2 - d6), (float)(d3 - d6));
        u.N((float)(d2 + d4), (float)(d3 - d6));
        u.N((float)(d2 + d4), (float)d3);
        u.N((float)(d2 - d6), (float)d3);
        u.N((float)(d2 - d6), (float)(d3 + d5 - d6));
        u.N((float)(d2 + d4), (float)(d3 + d5 - d6));
        u.N((float)(d2 + d4), (float)(d3 + d5));
        u.N((float)(d2 - d6), (float)(d3 + d5));
        u.N((float)(d2 - d6), (float)d3);
        u.N((float)d2, (float)d3);
        u.N((float)d2, (float)(d3 + d5 - d6));
        u.N((float)(d2 - d6), (float)(d3 + d5 - d6));
        u.N((float)(d2 + d4 - d6), (float)d3);
        u.N((float)(d2 + d4), (float)d3);
        u.N((float)(d2 + d4), (float)(d3 + d5 - d6));
        u.N((float)(d2 + d4 - d6), (float)(d3 + d5 - d6));
        u.P();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        ConfigurationManager.E();
    }

    public static void C(double d2, double d3, double d4, double d5, Color color) {
        double d6 = 0.0;
        double d7 = 0.0;
        int n = (int)((d4 + d5) * 2.0 / 2.0);
        int n2 = 0;
        int n3 = 0;
        while (true) {
            block16: {
                double d8;
                block15: {
                    try {
                        if (n3 >= n) break;
                        ConfigurationManager.r(d2 + d6, d3 + d7, 1.0, 1.0f, color);
                        if (n2 != 0) break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationManager.a(customSystemException);
                    }
                    d6 += 2.0;
                    if (d6 >= d4) {
                        d8 = 0.0;
                        if (d6 > d4) {
                            d8 = d6 - d4;
                        }
                        d6 = d4;
                        d7 += d8;
                        n2 = 1;
                    }
                    break block16;
                }
                if (n2 == 1) {
                    if ((d7 += 2.0) >= d5) {
                        d8 = 0.0;
                        if (d7 > d5) {
                            d8 = d7 - d5;
                        }
                        d7 = d5;
                        d6 -= d8;
                        n2 = 2;
                    }
                } else if (n2 == 2) {
                    if ((d6 -= 2.0) <= 0.0) {
                        d8 = 0.0;
                        if (d6 < d4) {
                            d8 = 0.0 - d6;
                        }
                        d6 = 0.0;
                        d7 -= d8;
                        n2 = 3;
                    }
                } else if (n2 == 3 && (d7 -= 2.0) <= 0.0) {
                    d8 = 0.0;
                    if (d7 < d5) {
                        d8 = 0.0 - d7;
                    }
                    d7 = 0.0;
                    d6 += d8;
                    n2 = 0;
                }
            }
            ++n3;
        }
    }

    public static void g(double d2, double d3, double d4, double d5, Color color, boolean bl, float f, float f2, float f3, Color color2, int n) {
        block17: {
            block16: {
                try {
                    try {
                        if (d4 != 0.0 && d5 != 0.0) break block16;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationManager.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager.a(customSystemException);
                }
            }
            try {
                if (ConfigurationManager.U()) {
                    z6.X((float)d2, (float)d3, (float)d4, (float)d5, color, bl, f, f2, f3, color2, n);
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationManager.a(customSystemException);
            }
            try {
                try {
                    if (b.z() && f != 0.0f) break block17;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager.a(customSystemException);
                }
                ConfigurationManager.A(d2, d3, d4, d5, color);
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationManager.a(customSystemException);
            }
        }
        try {
            if (bl) {
                ConfigurationManager.s(d2, d3 + 0.5, d4, d5 - 1.5, f3, f, color2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        float f4 = 0.5f;
        if (f <= 0.0f) {
            f4 = 0.0f;
        }
        float f5 = f2;
        float f6 = Math.max(0.0f, (f += f4 * 2.0f) - f5);
        if (f > 0.0f) {
            d2 -= (double)f5 - 0.5;
            d3 -= (double)f5;
            d5 += (double)(f5 * 1.0f);
            d4 += (double)(f5 * 1.0f);
        }
        b.s();
        b.O(f6);
        b.Q((float)d2 + f, (float)d3 + f, (float)(d2 + d4) - f, (float)(d3 + d5) - f);
        b.C(f5);
        b.z(n);
        ConfigurationManager.p();
        ConfigurationManager.q(color);
        j.f();
        j.N((float)d2 + f4, (float)d3 + f4);
        j.N((float)(d2 + d4 - (double)f4), (float)d3 + f4);
        j.N((float)(d2 + d4 - (double)f4), (float)(d3 + d5 - (double)f4));
        j.N((float)d2 + f4, (float)(d3 + d5 - (double)f4));
        j.P();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        ConfigurationManager.E();
        b.m();
    }

    public static void A(double d2, double d3, double d4, double d5, Color color) {
        ConfigurationManager.H((float)d2, (float)d3, (float)d4, (float)d5, color);
    }

    public static void Q(double d2, double d3, double d4) {
        try {
            if (ConfigurationManager.U()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        J.s();
        J.o((float)d2);
        J.D((float)d3);
        J.N((float)d4);
        J.m((float)ApplicationLifecycleManager.e() / 2.0f, (float)ApplicationLifecycleManager.b() / 2.0f);
        ConfigurationManager.p();
        ConfigurationManager.E();
        J.m();
    }

    public static void m(double d2, double d3, double d4, double d5, double d6, double d7, Color color) {
        try {
            if (ConfigurationManager.U()) {
                z6.W(d2, d3, d4, d5, d6, d7, color);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        ConfigurationManager.p();
        GL11.glBlendFunc((int)770, (int)771);
        Ne.h.y(2881);
        GL11.glPushMatrix();
        GL11.glColor4d((double)((double)color.getRed() / 255.0), (double)((double)color.getGreen() / 255.0), (double)((double)color.getBlue() / 255.0), (double)((double)color.getAlpha() / 255.0));
        GL11.glBegin((int)6);
        GL11.glVertex2d((double)d4, (double)d5);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glVertex2d((double)d6, (double)d7);
        GL11.glEnd();
        GL11.glPopMatrix();
        Ne.h.z(2881);
        ConfigurationManager.E();
    }

    public static void a() {
        ConfigurationManager.R(ApplicationLifecycleManager.e(), ApplicationLifecycleManager.b());
    }

    public static void a(double d2, double d3, double d4, float f, float f2, float f3, Color color) {
        block9: {
            float f4;
            block8: {
                float f5;
                try {
                    if (ConfigurationManager.U()) {
                        DataFlowAnalyzer.s(d2, d3, d4, f, f2, f3, color);
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager.a(customSystemException);
                }
                double d5 = NumericComputationEngine1131.b();
                double d6 = NumericComputationEngine1131.S();
                double d7 = NumericComputationEngine1131.n();
                d2 -= d5;
                d3 -= d6;
                d4 -= d7;
                try {
                    f5 = ResourceAllocationManager.b() ? ResourceAllocationManager.m() - ApplicationLifecycleManager.U().q() : 0.0f;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager.a(customSystemException);
                }
                f4 = f5;
                try {
                    if (GeometryCalculator.C() < 35) break block8;
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager.a(customSystemException);
                }
            }
            Ne.h.m(d2, d3, d4);
            Ne.h.f(-f4, 0.0f, 1.0f, 0.0f);
        }
        CryptoContextNegotiator684.Y();
        ApplicationLifecycleManager.U().H(1.0);
        GraphicsBufferAllocator.V();
        Ne.h.y(3042);
        GL11.glBlendFunc((int)770, (int)771);
        tl.R();
        GL11.glDepthMask((boolean)false);
        tl.M();
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)8);
        int n = 0;
        while ((float)n <= f) {
            float f6 = (float)(Math.PI * 2 * (double)n / (double)f);
            float f7 = (float)((double)f2 * Math.cos(f6));
            float f8 = (float)((double)f2 * Math.sin(f6));
            GraphicsBufferAllocator.Y(new ColorCompositionEngine(color).I(0));
            GL11.glVertex3f((float)f7, (float)f3, (float)f8);
            GraphicsBufferAllocator.Y(color);
            GL11.glVertex3f((float)f7, (float)0.0f, (float)f8);
            ++n;
        }
        GL11.glEnd();
        GL11.glShadeModel((int)7424);
        GL11.glDepthMask((boolean)true);
        tl.B();
        Ne.h.z(3042);
        GraphicsBufferAllocator.E();
        ApplicationLifecycleManager.U().F(1.0);
        CryptoContextNegotiator684.J();
        GraphicsBufferAllocator.Y(Color.WHITE);
    }

    public static void H(float f, float f2, float f3, float f4, Color color) {
        try {
            if (ConfigurationManager.U()) {
                z6.O(f, f2, f3, f4, color);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        ConfigurationManager.p();
        ConfigurationManager.q(color);
        j.f();
        j.N(f, f2);
        j.N(f + f3, f2);
        j.N(f + f3, f2 + f4);
        j.N(f, f2 + f4);
        j.P();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        ConfigurationManager.E();
    }

    public static void i(double d2, double d3, double d4, double d5, Color color, float f, float f2, int n) {
        block12: {
            try {
                try {
                    if (d4 != 0.0 && d5 != 0.0) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationManager.a(customSystemException);
            }
        }
        try {
            if (ConfigurationManager.U()) {
                z6.t(d2, d3, d4, d5, f, f2, n, color);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        try {
            if (!O.z()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        float f3 = 0.5f;
        if (f <= 0.0f) {
            f3 = 0.0f;
        }
        float f4 = f2;
        float f5 = Math.max(0.0f, (f += f3 * 2.0f) - f4);
        if (f > 0.0f) {
            d2 -= (double)f4 - 0.5;
            d3 -= (double)f4;
            d5 += (double)f4 * 1.5;
            d4 += (double)(f4 * 1.0f);
        }
        O.s();
        O.p(f5);
        O.a((float)d2 + f, (float)d3 + f, (float)(d2 + d4) - f, (float)(d3 + d5) - f);
        O.z(f4);
        O.L(n);
        ConfigurationManager.p();
        ConfigurationManager.q(color);
        j.f();
        j.N((float)d2 + f3, (float)d3 + f3);
        j.N((float)(d2 + d4 - (double)f3), (float)d3 + f3);
        j.N((float)(d2 + d4 - (double)f3), (float)(d3 + d5 - (double)f3));
        j.N((float)d2 + f3, (float)(d3 + d5 - (double)f3));
        j.P();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        ConfigurationManager.E();
        O.m();
    }

    private static void p() {
        try {
            if (ConfigurationManager.U()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        try {
            if (f) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        try {
            K = GL11.glIsEnabled((int)2884);
            y = GL11.glIsEnabled((int)3042);
            p = GL11.glIsEnabled((int)3553);
            if (K) {
                tl.M();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        try {
            if (!y) {
                tl.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        try {
            if (p) {
                tl.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager.a(customSystemException);
        }
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glPushMatrix();
    }
}

