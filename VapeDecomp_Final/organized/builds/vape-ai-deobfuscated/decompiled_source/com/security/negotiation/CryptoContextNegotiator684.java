/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.security.negotiation;

import a.E8;
import a.Ne;
import a.a;
import a.tl;
import a.z6;
import com.collections.management.MultiContainerRegistry;
import com.compression.core.DataCompressionHandler;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.flow.DataFlowAnalyzer;
import com.data.streaming.DataStreamProcessor1600;
import com.data.transformation.DataTransformationEngine1209;
import com.data.transformation.TransformationEngine1757;
import com.event.core.EventDispatcher;
import com.exception.system.CustomSystemException;
import com.financial.transactions.TransactionValidator1679;
import com.game.actions.ActionSequenceHandler;
import com.graphics.buffer.GraphicsBufferManager;
import com.math.computation.GeometricComputationEngine920;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.network.transmission.PacketTransmissionController;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.exchange.SecureDataExchanger793;
import com.security.transform.CryptographicTransformer;
import com.simulation.physics.PhysicalSimulationController;
import com.system.configuration.ConfigurationManager;
import com.system.resources.ResourceAllocationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.flow.TransactionFlowController;
import com.ui.rendering.UIRenderingController1597;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class CryptoContextNegotiator684 {
    private static final GraphicsBufferManager b;
    private static final GraphicsBufferManager w;
    private static final GraphicsBufferManager k;
    private static final GraphicsBufferManager X;
    private static final long a;
    private static final long[] c;
    private static final Map e;
    private static final Integer[] d;

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/NY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoContextNegotiator684.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static double[] E(double d2, double d3, double d4) {
        if (ConfigurationManager.U()) {
            double[] dArray = new double[3];
            GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(d2, d3, d4, 1.0);
            GeometricComputationEngine920 geometricComputationEngine9202 = new GeometricComputationEngine920(0.0f, 0.0f, 0.0f, 0.0f);
            SecureDataExchanger793 secureDataExchanger793 = z6.D.i();
            SecureDataExchanger793 secureDataExchanger7932 = z6.J;
            SecureDataExchanger793 secureDataExchanger7933 = z6.O;
            try {
                secureDataExchanger793.f(geometricComputationEngine920, geometricComputationEngine9202);
                secureDataExchanger7932.f(geometricComputationEngine9202, geometricComputationEngine920);
                secureDataExchanger7933.f(geometricComputationEngine920, geometricComputationEngine9202);
                if ((double)geometricComputationEngine9202.n == 0.0) {
                    return dArray;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextNegotiator684.a(customSystemException);
            }
            geometricComputationEngine9202.n = 1.0f / geometricComputationEngine9202.n * 0.5f;
            geometricComputationEngine9202.F = geometricComputationEngine9202.F * geometricComputationEngine9202.n + 0.5f;
            geometricComputationEngine9202.s = geometricComputationEngine9202.s * geometricComputationEngine9202.n + 0.5f;
            geometricComputationEngine9202.X = geometricComputationEngine9202.X * geometricComputationEngine9202.n + 0.5f;
            dArray[0] = geometricComputationEngine9202.F * (float)ApplicationLifecycleManager.e();
            dArray[1] = geometricComputationEngine9202.s * (float)ApplicationLifecycleManager.b();
            dArray[2] = geometricComputationEngine9202.X;
            return dArray;
        }
        return a.a.trn(d2, d3, d4);
    }

    public static void G(CryptographicTransformer cryptographicTransformer, double d2, Color color, Color color2, float f) {
        double d3 = NumericComputationEngine1131.b();
        double d4 = NumericComputationEngine1131.S();
        double d5 = NumericComputationEngine1131.n();
        double d6 = cryptographicTransformer.b() + (cryptographicTransformer.F() - cryptographicTransformer.b()) * (double)f;
        double d7 = cryptographicTransformer.q() + (cryptographicTransformer.V() - cryptographicTransformer.q()) * (double)f;
        double d8 = cryptographicTransformer.I() + (cryptographicTransformer.B() - cryptographicTransformer.I()) * (double)f;
        CryptoContextNegotiator684.Y();
        ApplicationLifecycleManager.U().H(1.0);
        Ne.h.y(3042);
        GL11.glBlendFunc((int)770, (int)771);
        Ne.h.h(1.5f);
        Ne.h.z(3553);
        Ne.h.y(2848);
        Ne.h.z(2929);
        Ne.h.E(false);
        double d9 = 0.15;
        CryptoContextNegotiator684.x(d6 - (double)(cryptographicTransformer.d() / 2.0f) - d9, d7, d8 - (double)(cryptographicTransformer.d() / 2.0f) - d9, (double)cryptographicTransformer.d() + d9 * 2.0, cryptographicTransformer.L(), (double)cryptographicTransformer.d() + d9 * 2.0, d2, color, color2, d3, d4, d5);
        Ne.h.E(true);
        Ne.h.y(2929);
        Ne.h.y(3553);
        Ne.h.z(2848);
        Ne.h.z(3042);
        ApplicationLifecycleManager.U().F(1.0);
        CryptoContextNegotiator684.J();
    }

    public static void W(UIRenderingController1597 uIRenderingController1597, double d2, double d3, double d4) {
        CryptoContextNegotiator684.x(uIRenderingController1597.N, uIRenderingController1597.n, uIRenderingController1597.D, 1.0, 1.0, 1.0, 0.1, uIRenderingController1597.Z, null, d2, d3, d4);
    }

    public static void T(double d2, double d3, double d4, double d5, double d6, double d7, Color color, Color color2, float f) {
        if (ConfigurationManager.U()) {
            double d8 = d5 + 1.0 - d2;
            double d9 = d5 - d2;
            double d10 = d6 + 1.0 - d3;
            double d11 = d6 - d3;
            double d12 = d7 + 1.0 - d4;
            double d13 = d7 - d4;
            try {
                DataFlowAnalyzer.F(d9, d11, d13, d9, d10, d13, d8, d11, d13, d8, d10, d13, color2);
                DataFlowAnalyzer.F(d8, d11, d12, d8, d10, d12, d9, d11, d12, d9, d10, d12, color2);
                DataFlowAnalyzer.F(d8, d10, d13, d8, d11, d13, d9, d10, d13, d9, d11, d13, color2);
                DataFlowAnalyzer.F(d9, d10, d12, d9, d11, d12, d8, d10, d12, d8, d11, d12, color2);
                DataFlowAnalyzer.F(d9, d10, d13, d8, d10, d13, d8, d10, d12, d9, d10, d12, color2);
                DataFlowAnalyzer.F(d9, d10, d13, d9, d10, d12, d8, d10, d12, d8, d10, d13, color2);
                DataFlowAnalyzer.F(d9, d11, d13, d8, d11, d13, d8, d11, d12, d9, d11, d12, color2);
                DataFlowAnalyzer.F(d9, d11, d13, d9, d11, d12, d8, d11, d12, d8, d11, d13, color2);
                DataFlowAnalyzer.F(d9, d11, d13, d9, d10, d13, d9, d11, d12, d9, d10, d12, color2);
                DataFlowAnalyzer.F(d8, d11, d12, d8, d10, d12, d8, d11, d13, d8, d10, d13, color2);
                DataFlowAnalyzer.F(d9, d10, d12, d9, d11, d12, d9, d10, d13, d9, d11, d13, color2);
                DataFlowAnalyzer.F(d8, d10, d13, d8, d11, d13, d8, d10, d12, d8, d11, d12, color2);
                if ((double)f > 0.1) {
                    DataFlowAnalyzer.N(d9, d11, d13, d9, d10, d13, 3.0f, color);
                    DataFlowAnalyzer.N(d8, d11, d13, d8, d10, d13, 3.0f, color);
                    DataFlowAnalyzer.N(d9, d11, d12, d9, d10, d12, 3.0f, color);
                    DataFlowAnalyzer.N(d8, d11, d12, d8, d10, d12, 3.0f, color);
                    DataFlowAnalyzer.N(d8, d11, d13, d8, d11, d12, 3.0f, color);
                    DataFlowAnalyzer.N(d8, d10, d13, d8, d10, d12, 3.0f, color);
                    DataFlowAnalyzer.N(d9, d11, d13, d9, d11, d12, 3.0f, color);
                    DataFlowAnalyzer.N(d9, d10, d13, d9, d10, d12, 3.0f, color);
                    DataFlowAnalyzer.N(d9, d11, d13, d8, d11, d13, 3.0f, color);
                    DataFlowAnalyzer.N(d9, d10, d13, d8, d10, d13, 3.0f, color);
                    DataFlowAnalyzer.N(d9, d11, d12, d8, d11, d12, 3.0f, color);
                    DataFlowAnalyzer.N(d9, d10, d12, d8, d10, d12, 3.0f, color);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextNegotiator684.a(customSystemException);
            }
            return;
        }
        GL11.glColor4d((double)((float)color2.getRed() / 255.0f), (double)((float)color2.getGreen() / 255.0f), (double)((float)color2.getBlue() / 255.0f), (double)((float)color2.getAlpha() / 255.0f));
        b.f();
        double d14 = d5 + 1.0 - d2;
        double d15 = d5 - d2;
        double d16 = d6 + 1.0 - d3;
        double d17 = d6 - d3;
        double d18 = d7 + 1.0 - d4;
        double d19 = d7 - d4;
        try {
            b.u(d15, d17, d19);
            b.u(d15, d16, d19);
            b.u(d14, d17, d19);
            b.u(d14, d16, d19);
            b.u(d14, d17, d18);
            b.u(d14, d16, d18);
            b.u(d15, d17, d18);
            b.u(d15, d16, d18);
            b.u(d14, d16, d19);
            b.u(d14, d17, d19);
            b.u(d15, d16, d19);
            b.u(d15, d17, d19);
            b.u(d15, d16, d18);
            b.u(d15, d17, d18);
            b.u(d14, d16, d18);
            b.u(d14, d17, d18);
            b.u(d15, d16, d19);
            b.u(d14, d16, d19);
            b.u(d14, d16, d18);
            b.u(d15, d16, d18);
            b.u(d15, d16, d19);
            b.u(d15, d16, d18);
            b.u(d14, d16, d18);
            b.u(d14, d16, d19);
            b.u(d15, d17, d19);
            b.u(d14, d17, d19);
            b.u(d14, d17, d18);
            b.u(d15, d17, d18);
            b.u(d15, d17, d19);
            b.u(d15, d17, d18);
            b.u(d14, d17, d18);
            b.u(d14, d17, d19);
            b.u(d15, d17, d19);
            b.u(d15, d16, d19);
            b.u(d15, d17, d18);
            b.u(d15, d16, d18);
            b.u(d14, d17, d18);
            b.u(d14, d16, d18);
            b.u(d14, d17, d19);
            b.u(d14, d16, d19);
            b.u(d15, d16, d18);
            b.u(d15, d17, d18);
            b.u(d15, d16, d19);
            b.u(d15, d17, d19);
            b.u(d14, d16, d19);
            b.u(d14, d17, d19);
            b.u(d14, d16, d18);
            b.u(d14, d17, d18);
            b.P();
            if (f > 0.0f) {
                GL11.glColor4d((double)((double)color.getRed() / 255.0), (double)((double)color.getGreen() / 255.0), (double)((double)color.getBlue() / 255.0), (double)0.7);
                GL11.glLineWidth((float)3.0f);
                k.f();
                k.u(d15, d17, d19);
                k.u(d15, d16, d19);
                k.u(d14, d17, d19);
                k.u(d14, d16, d19);
                k.u(d15, d17, d18);
                k.u(d15, d16, d18);
                k.u(d14, d17, d18);
                k.u(d14, d16, d18);
                k.u(d14, d17, d19);
                k.u(d14, d17, d18);
                k.u(d14, d16, d19);
                k.u(d14, d16, d18);
                k.u(d15, d17, d19);
                k.u(d15, d17, d18);
                k.u(d15, d16, d19);
                k.u(d15, d16, d18);
                k.u(d15, d17, d19);
                k.u(d14, d17, d19);
                k.u(d15, d16, d19);
                k.u(d14, d16, d19);
                k.u(d15, d17, d18);
                k.u(d14, d17, d18);
                k.u(d15, d16, d18);
                k.u(d14, d16, d18);
                k.P();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator684.a(customSystemException);
        }
    }

    public static void H(TransformationEngine1757 transformationEngine1757, double d2, double d3, double d4) {
        CryptoContextNegotiator684.x(transformationEngine1757.N, transformationEngine1757.n, transformationEngine1757.D, 1.0, 1.0, 1.0, 0.1, transformationEngine1757.c(), null, d2, d3, d4);
    }

    public static void J() {
        Ne.h.X();
    }

    public static Color e(Color color) {
        long l = a ^ 0x19E5437CFE14L;
        Object object = color.getRGB();
        object = CryptoContextNegotiator684.a("v", (int)7995, (long)(0x64C67392213A1D21L ^ l)) - object;
        return new Color((int)object);
    }

    public static void z(double d2, double d3, double d4, double d5, double d6, double d7, Color color, double d8, double d9, double d10) {
        double d11 = d2 + d5 - d8;
        double d12 = d2 - d8;
        double d13 = d3 + d6 - d9;
        double d14 = d3 - d9;
        double d15 = d4 + d7 - d10;
        double d16 = d4 - d10;
        try {
            X.u(d12, d14, d16);
            X.u(d11, d14, d16);
            X.u(d12, d13, d16);
            X.u(d11, d14, d16);
            X.u(d11, d13, d16);
            X.u(d12, d13, d16);
            X.u(d12, d14, d15);
            X.u(d12, d13, d15);
            X.u(d11, d14, d15);
            X.u(d11, d14, d15);
            X.u(d12, d13, d15);
            X.u(d11, d13, d15);
            X.u(d12, d14, d16);
            X.u(d12, d13, d15);
            X.u(d12, d14, d15);
            X.u(d12, d14, d16);
            X.u(d12, d13, d16);
            X.u(d12, d13, d15);
            X.u(d11, d14, d16);
            X.u(d11, d14, d15);
            X.u(d11, d13, d15);
            X.u(d11, d14, d16);
            X.u(d11, d13, d15);
            X.u(d11, d13, d16);
            X.u(d12, d13, d16);
            X.u(d11, d13, d15);
            X.u(d12, d13, d15);
            X.u(d12, d13, d16);
            X.u(d11, d13, d16);
            X.u(d11, d13, d15);
            X.u(d12, d14, d16);
            X.u(d12, d14, d15);
            X.u(d11, d14, d15);
            X.u(d12, d14, d16);
            X.u(d11, d14, d15);
            X.u(d11, d14, d16);
            if (color != null) {
                GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
                X.P();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator684.a(customSystemException);
        }
    }

    public static void D(NumericComputationEngine1131 numericComputationEngine1131) {
        block6: {
            float f;
            try {
                try {
                    if (GeometryCalculator.C() < 35) break block6;
                    Ne.h.f(numericComputationEngine1131.r(), 1.0f, 0.0f, 0.0f);
                    Ne.h.f(numericComputationEngine1131.k() + 180.0f, 0.0f, 1.0f, 0.0f);
                    if (!ConfigurationManager.U()) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextNegotiator684.a(customSystemException);
                }
                if (ApplicationLifecycleManager.N().V() == 0) break block6;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextNegotiator684.a(customSystemException);
            }
            DataCompressionHandler dataCompressionHandler = ApplicationLifecycleManager.U().v();
            double d2 = NumericComputationEngine1131.b() - dataCompressionHandler.w().X();
            double d3 = NumericComputationEngine1131.S() - dataCompressionHandler.w().F();
            double d4 = NumericComputationEngine1131.n() - dataCompressionHandler.w().f();
            try {
                f = ResourceAllocationManager.b() ? ResourceAllocationManager.m() - ApplicationLifecycleManager.U().q() : 0.0f;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextNegotiator684.a(customSystemException);
            }
            float f2 = f;
            Ne.h.m(d2, d3, d4);
            Ne.h.f(-f2, 0.0f, 1.0f, 0.0f);
        }
    }

    public static void M(TransformationEngine1757 transformationEngine1757, double d2, double d3, double d4) {
        CryptoContextNegotiator684.z(transformationEngine1757.N, transformationEngine1757.n, transformationEngine1757.D, 1.0, 1.0, 1.0, transformationEngine1757.c(), d2, d3, d4);
    }

    public static void n(String string, double d2, double d3, double d4, double d5, double d6, int n, Color color, double d7, DataTransformationEngine1209 dataTransformationEngine1209) {
        boolean bl;
        block40: {
            int n2;
            int n3;
            int n4;
            E8 e8;
            long l;
            block37: {
                block38: {
                    float f;
                    block35: {
                        float f2;
                        float f3;
                        block36: {
                            block33: {
                                double d8;
                                double d9;
                                double d10;
                                block34: {
                                    float f4;
                                    float f5;
                                    float f6;
                                    float f7;
                                    l = a ^ 0x180C45D1C715L;
                                    ConfigurationManager.f = true;
                                    e8 = ApplicationLifecycleManager.X();
                                    n4 = n;
                                    try {
                                        f7 = d6 / 5.0 <= 2.0 ? 2.0f : (float)(d6 / 5.0);
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoContextNegotiator684.a(customSystemException);
                                    }
                                    float f8 = f7;
                                    f = f6 = (float)(0.01666666753590107 * ((double)f8 * d5));
                                    try {
                                        CryptoContextNegotiator684.Y();
                                        f5 = ResourceAllocationManager.b() ? ResourceAllocationManager.m() : ApplicationLifecycleManager.r().k();
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoContextNegotiator684.a(customSystemException);
                                    }
                                    f3 = f5;
                                    try {
                                        f4 = ResourceAllocationManager.b() ? ResourceAllocationManager.H() : ApplicationLifecycleManager.r().r();
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoContextNegotiator684.a(customSystemException);
                                    }
                                    f2 = f4;
                                    try {
                                        try {
                                            if (GeometryCalculator.C() < 35) break block33;
                                            if (ApplicationLifecycleManager.N().V() != 0) break block34;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptoContextNegotiator684.a(customSystemException);
                                        }
                                        Ne.h.m(d2 + 0.0, d3 + 0.25 + 0.5, d4);
                                        Ne.h.t(0.0f, 1.0f, 0.0f);
                                        Ne.h.f(-f3, 0.0f, 1.0f, 0.0f);
                                        Ne.h.f(-f2, -1.0f, 0.0f, 0.0f);
                                        break block35;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoContextNegotiator684.a(customSystemException);
                                    }
                                }
                                DataCompressionHandler dataCompressionHandler = ApplicationLifecycleManager.U().v();
                                try {
                                    d10 = ConfigurationManager.U() ? 0.0 : NumericComputationEngine1131.b() - dataCompressionHandler.w().X();
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoContextNegotiator684.a(customSystemException);
                                }
                                double d11 = d10;
                                try {
                                    d9 = ConfigurationManager.U() ? 0.0 : NumericComputationEngine1131.S() - dataCompressionHandler.w().F();
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoContextNegotiator684.a(customSystemException);
                                }
                                double d12 = d9;
                                try {
                                    d8 = ConfigurationManager.U() ? 0.0 : NumericComputationEngine1131.n() - dataCompressionHandler.w().f();
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoContextNegotiator684.a(customSystemException);
                                }
                                double d13 = d8;
                                Ne.h.m(d2 + d11, d3 + d12 + 0.25 + 0.5, d4 + d13);
                                Ne.h.t(0.0f, 1.0f, 0.0f);
                                Ne.h.f(-f3, 0.0f, 1.0f, 0.0f);
                                Ne.h.f(f2, 1.0f, 0.0f, 0.0f);
                                break block35;
                            }
                            try {
                                Ne.h.m(d2 + 0.0, d3 + 0.25 + 0.5, d4);
                                Ne.h.t(0.0f, 1.0f, 0.0f);
                                if (ApplicationLifecycleManager.N().V() != 2) break block36;
                                Ne.h.f(-f3, 0.0f, 1.0f, 0.0f);
                                Ne.h.f(f2, -1.0f, 0.0f, 0.0f);
                                break block35;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextNegotiator684.a(customSystemException);
                            }
                        }
                        Ne.h.f(-f3, 0.0f, 1.0f, 0.0f);
                        Ne.h.f(f2, 1.0f, 0.0f, 0.0f);
                    }
                    Ne.h.J(-f, -f, f);
                    n3 = e8.L(string) / 2;
                    int n5 = -(e8.B(string) - 1);
                    n2 = e8.I();
                    int n6 = n3;
                    int n7 = -(n2 - 1);
                    try {
                        try {
                            try {
                                tl.P();
                                tl.R(false);
                                tl.w();
                                tl.N();
                                tl.l(770, 771, 1, 0);
                                tl.M();
                                tl.R();
                                GraphicsBufferAllocator.n((double)(-n6) - 2.0, n7, (double)n6 + 2.0, 2.0, 0.0, color, color);
                                tl.B();
                                tl.w();
                                Ne.h.a(1.0f, 1.0f, 1.0f);
                                if (GeometryCalculator.C() < 35) break block37;
                                if (dataTransformationEngine1209 == null) break block38;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextNegotiator684.a(customSystemException);
                            }
                            if (dataTransformationEngine1209.Y()) break block38;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextNegotiator684.a(customSystemException);
                        }
                        if (dataTransformationEngine1209.B(ReflectionMetadataResolver.YH)) break block37;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextNegotiator684.a(customSystemException);
                    }
                }
                dataTransformationEngine1209 = DataTransformationEngine1209.i();
            }
            bl = false;
            if (ConfigurationManager.U()) {
                SecureDataExchanger793 secureDataExchanger793;
                block39: {
                    secureDataExchanger793 = new SecureDataExchanger793().Z();
                    try {
                        secureDataExchanger793.E(z6.J);
                        secureDataExchanger793.E(z6.D.i());
                        if (GeometryCalculator.C() < 50) break block39;
                        e8.Y(string, -n3, -n2 + 3, n4, false, secureDataExchanger793, PacketTransmissionController.F());
                        break block40;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextNegotiator684.a(customSystemException);
                    }
                }
                CallSite callSite = CryptoContextNegotiator684.a("v", (int)3072, (long)(0x48BCA06C4F77B719L ^ l));
                TransactionValidator1679 transactionValidator1679 = ApplicationLifecycleManager.n().e();
                DataStreamProcessor1600 dataStreamProcessor1600 = DataStreamProcessor1600.Y(string);
                e8.V(dataStreamProcessor1600, (float)(-n3), (float)(-n2 + 3), n4, false, secureDataExchanger793.B(), transactionValidator1679, true, 0, (int)callSite);
                transactionValidator1679.d();
            } else if (GeometryCalculator.C() >= 35) {
                dataTransformationEngine1209.g();
                bl = true;
                EventDispatcher eventDispatcher = ApplicationLifecycleManager.r().O();
                dataTransformationEngine1209.T(eventDispatcher);
                dataTransformationEngine1209.T(EventDispatcher.o(180.0f, 0.0f, 180.0f, true));
                DataStreamProcessor1600 dataStreamProcessor1600 = DataStreamProcessor1600.Y(string);
                TransactionValidator1679 transactionValidator1679 = TransactionValidator1679.B(TransactionFlowController.g().D());
                CallSite callSite = CryptoContextNegotiator684.a("v", (int)20103, (long)(0x3D32D65FE42DF59FL ^ l));
                ActionSequenceHandler actionSequenceHandler = dataTransformationEngine1209.p().n();
                e8.V(dataStreamProcessor1600, (float)(-n3), (float)(-n2 + 3), n4, false, actionSequenceHandler, transactionValidator1679, true, 0, (int)callSite);
                transactionValidator1679.d();
            } else {
                e8.u(string, -n3, -n2 + 3, n4);
            }
        }
        try {
            if (bl) {
                dataTransformationEngine1209.v();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator684.a(customSystemException);
        }
        tl.k();
        tl.R(true);
        tl.j();
        tl.a(1.0f, 1.0f, 1.0f, 1.0f);
        CryptoContextNegotiator684.J();
        ConfigurationManager.f = false;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x249D;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/NY", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoContextNegotiator684.d[n2] = n3;
        }
        return d[n2];
    }

    public static void x(double d2, double d3, double d4, double d5, double d6, double d7, double d8, Color color, Color color2, double d9, double d10, double d11) {
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        if (ConfigurationManager.U()) {
            double d18 = d2 + d5 - d9;
            double d19 = d2 - d9;
            double d20 = d3 + d6 - d10;
            double d21 = d3 - d10;
            double d22 = d4 + d7 - d11;
            double d23 = d4 - d11;
            try {
                if (color2 != null) {
                    DataFlowAnalyzer.d(d19, d21, d23, d18, d20, d22, color2);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextNegotiator684.a(customSystemException);
            }
            try {
                if (color != null) {
                    DataFlowAnalyzer.X(d19, d21, d23, d18, d20, d22, color);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextNegotiator684.a(customSystemException);
            }
            return;
        }
        if (color2 != null) {
            GL11.glColor4d((double)((float)color2.getRed() / 255.0f), (double)((float)color2.getGreen() / 255.0f), (double)((float)color2.getBlue() / 255.0f), (double)((float)color2.getAlpha() / 255.0f));
            b.f();
            d17 = d2 + d5 - d9;
            d16 = d2 - d9;
            d15 = d3 + d6 - d10;
            d14 = d3 - d10;
            d13 = d4 + d7 - d11;
            d12 = d4 - d11;
            b.u(d16, d14, d12);
            b.u(d16, d15, d12);
            b.u(d17, d14, d12);
            b.u(d17, d15, d12);
            b.u(d17, d14, d13);
            b.u(d17, d15, d13);
            b.u(d16, d14, d13);
            b.u(d16, d15, d13);
            b.u(d17, d15, d12);
            b.u(d17, d14, d12);
            b.u(d16, d15, d12);
            b.u(d16, d14, d12);
            b.u(d16, d15, d13);
            b.u(d16, d14, d13);
            b.u(d17, d15, d13);
            b.u(d17, d14, d13);
            b.u(d16, d15, d12);
            b.u(d17, d15, d12);
            b.u(d17, d15, d13);
            b.u(d16, d15, d13);
            b.u(d16, d15, d12);
            b.u(d16, d15, d13);
            b.u(d17, d15, d13);
            b.u(d17, d15, d12);
            b.u(d16, d14, d12);
            b.u(d17, d14, d12);
            b.u(d17, d14, d13);
            b.u(d16, d14, d13);
            b.u(d16, d14, d12);
            b.u(d16, d14, d13);
            b.u(d17, d14, d13);
            b.u(d17, d14, d12);
            b.u(d16, d14, d12);
            b.u(d16, d15, d12);
            b.u(d16, d14, d13);
            b.u(d16, d15, d13);
            b.u(d17, d14, d13);
            b.u(d17, d15, d13);
            b.u(d17, d14, d12);
            b.u(d17, d15, d12);
            b.u(d16, d15, d13);
            b.u(d16, d14, d13);
            b.u(d16, d15, d12);
            b.u(d16, d14, d12);
            b.u(d17, d15, d12);
            b.u(d17, d14, d12);
            b.u(d17, d15, d13);
            b.u(d17, d14, d13);
            b.P();
        }
        if (color != null) {
            GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
            w.f();
            d17 = d2 + d5 - d9;
            d16 = d2 - d9;
            d15 = d3 + d6 - d10;
            d14 = d3 - d10;
            d13 = d4 + d7 - d11;
            d12 = d4 - d11;
            w.u(d16, d14, d12);
            w.u(d17, d14, d12);
            w.u(d17, d14, d12);
            w.u(d17, d14, d13);
            w.u(d17, d14, d13);
            w.u(d16, d14, d13);
            w.u(d16, d14, d13);
            w.u(d16, d14, d12);
            w.u(d16, d15, d12);
            w.u(d17, d15, d12);
            w.u(d17, d15, d12);
            w.u(d17, d15, d13);
            w.u(d17, d15, d13);
            w.u(d16, d15, d13);
            w.u(d16, d15, d13);
            w.u(d16, d15, d12);
            w.u(d16, d14, d12);
            w.u(d16, d15, d12);
            w.u(d17, d14, d12);
            w.u(d17, d15, d12);
            w.u(d17, d14, d13);
            w.u(d17, d15, d13);
            w.u(d16, d14, d13);
            w.u(d16, d15, d13);
            w.P();
        }
    }

    public static void s(double d2, double d3, double d4, UIRenderingController1597 uIRenderingController1597) {
        float f = 0.0f;
        if (uIRenderingController1597 instanceof PhysicalSimulationController) {
            PhysicalSimulationController physicalSimulationController = (PhysicalSimulationController)uIRenderingController1597;
            f = physicalSimulationController.A();
        }
        CryptoContextNegotiator684.T(d2, d3, d4, uIRenderingController1597.N, uIRenderingController1597.n, uIRenderingController1597.D, new Color(255 - uIRenderingController1597.Z.getRed(), 255 - uIRenderingController1597.Z.getGreen(), 255 - uIRenderingController1597.Z.getBlue(), uIRenderingController1597.Z.getAlpha()), uIRenderingController1597.Z, f);
    }

    public static void o() {
        CryptoContextNegotiator684.D(ApplicationLifecycleManager.r());
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(3751498096770111341L, 2055363715383001695L, MethodHandles.lookup().lookupClass()).a(163190413389806L);
        e = new HashMap(13);
        long l = a ^ 0x3DC80A482BC5L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u0018\u00f1\u0085\u00d4\u00d1a\u00ca>\u00e6\u00a5\u00e7\u00f59\u00b4\u00e0e\b\u00cd\u00170\b\u00c44\u009d";
        int n2 = "\u0018\u00f1\u0085\u00d4\u00d1a\u00ca>\u00e6\u00a5\u00e7\u00f59\u00b4\u00e0e\b\u00cd\u00170\b\u00c44\u009d".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        d = new Integer[3];
        k = TemporalMetadataResolver.h.l();
        b = new GraphicsBufferManager();
        b.o(48, 7);
        w = new GraphicsBufferManager();
        w.o(24, 1);
        X = new GraphicsBufferManager();
        X.o(36, 4);
    }

    public static void Y() {
        try {
            Ne.h.z();
            if (GeometryCalculator.C() >= 35) {
                CryptoContextNegotiator684.o();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator684.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoContextNegotiator684.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

