/*
 * Decompiled with CFR 0.152.
 */
package com.runtime.monitoring;

import a.bm;
import com.analytics.computation.MetricsCalculationEngine;
import com.app.math.NumericStreamProcessor;
import com.app.transformation.DataTransformationEngine1794;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.graphics.color.ColorCompositionEngine;
import com.math.transformation.NumericTransformationEngine;
import com.network.configuration.NetworkConfigManager;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ExecutionStateTracker1057
extends AbstractComputationKernel {
    private long Y;
    private boolean n;
    bm E;
    private final NumericStreamProcessor F;
    DataTransformationEngine1794 V;
    NumericTransformationEngine b;
    NetworkConfigManager B;
    Queue<DataTransformationEngine1794> v = new ConcurrentLinkedQueue<DataTransformationEngine1794>();

    @Override
    public double z() {
        return 0.0;
    }

    @Override
    public void d() {
        block26: {
            block24: {
                block25: {
                    block22: {
                        block23: {
                            block21: {
                                try {
                                    if (!this.B.m(0L)) {
                                        return;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ExecutionStateTracker1057.a(customSystemException);
                                }
                                try {
                                    try {
                                        if (!this.n || this.F.F()) break block21;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ExecutionStateTracker1057.a(customSystemException);
                                    }
                                    this.B.m();
                                    this.V = null;
                                    this.J(Long.MAX_VALUE);
                                    this.n = false;
                                    return;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ExecutionStateTracker1057.a(customSystemException);
                                }
                            }
                            try {
                                try {
                                    if (this.V != null) break block22;
                                    if (this.v.isEmpty()) break block23;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ExecutionStateTracker1057.a(customSystemException);
                                }
                                this.T(this.v.remove());
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ExecutionStateTracker1057.a(customSystemException);
                            }
                        }
                        return;
                    }
                    try {
                        try {
                            if (this.M() != Long.MAX_VALUE) break block24;
                            if (!this.V().C()) break block25;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ExecutionStateTracker1057.a(customSystemException);
                        }
                        this.f();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ExecutionStateTracker1057.a(customSystemException);
                    }
                }
                return;
            }
            try {
                block27: {
                    try {
                        try {
                            if (this.n) break block26;
                            if (this.y()) break block27;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ExecutionStateTracker1057.a(customSystemException);
                        }
                        if (!this.w()) break block26;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ExecutionStateTracker1057.a(customSystemException);
                    }
                }
                this.a();
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionStateTracker1057.a(customSystemException);
            }
        }
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    private void Z() {
        int n;
        int n2;
        block8: {
            block7: {
                try {
                    if (this.V == null) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ExecutionStateTracker1057.a(customSystemException);
                }
                this.F.m(Math.max(14.5, this.E.z() + 8.0));
                n2 = (int)(255.0 * this.F.h());
                try {
                    if (!this.F.F()) break block7;
                    n = n2;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw ExecutionStateTracker1057.a(customSystemException);
                }
            }
            try {
                n = !this.F.L() ? n2 : (int)(255.0 * this.F.h() / 4.0);
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionStateTracker1057.a(customSystemException);
            }
        }
        int n3 = n;
        MetricsCalculationEngine metricsCalculationEngine = this.C();
        ColorCompositionEngine colorCompositionEngine = new ColorCompositionEngine(this.V.i().getRed(), this.V.i().getGreen(), this.V.i().getBlue(), n2);
        ColorCompositionEngine colorCompositionEngine2 = new ColorCompositionEngine(this.V.X().getRed(), this.V.X().getGreen(), this.V.X().getBlue(), n2);
        double d2 = 6.0;
        ConfigurationManager.S(metricsCalculationEngine.K(), metricsCalculationEngine.q(), metricsCalculationEngine.t(), metricsCalculationEngine.V(), colorCompositionEngine);
        ConfigurationManager.U(metricsCalculationEngine.K() - 0.5, metricsCalculationEngine.q() - 0.5, metricsCalculationEngine.t() + 1.0, metricsCalculationEngine.V() + 1.0, colorCompositionEngine2, 2.0f, 1.0f, 1.0f);
        this.E.b(metricsCalculationEngine.K() + d2);
        this.E.M(Math.min(metricsCalculationEngine.q() + 4.0, this.b.W() + this.b.b() - 6.0));
        ColorCompositionEngine colorCompositionEngine3 = new ColorCompositionEngine(this.V.X().darker().getRGB(), n3);
        this.E.B(colorCompositionEngine3);
        GraphicsBufferAllocator.e(metricsCalculationEngine.K(), metricsCalculationEngine.q(), metricsCalculationEngine.t(), metricsCalculationEngine.V());
        this.E.E();
        GraphicsBufferAllocator.F();
    }

    private boolean w() {
        try {
            if (this.V().F()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionStateTracker1057.a(customSystemException);
        }
        try {
            if (this.v.isEmpty()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionStateTracker1057.a(customSystemException);
        }
        return true;
    }

    @Override
    public void E() {
        this.w(0.0);
        super.E();
    }

    public ExecutionStateTracker1057(NumericTransformationEngine numericTransformationEngine) {
        this.Y = Long.MAX_VALUE;
        this.B = new NetworkConfigManager();
        this.F = new NumericStreamProcessor(0.3, 0.0, 14.5);
        this.b = numericTransformationEngine;
        this.w(0.0);
    }

    public int w(DataTransformationEngine1794 dataTransformationEngine1794) {
        this.v.add(dataTransformationEngine1794);
        return this.v.size() - 1;
    }

    @Override
    public void g() {
    }

    @Override
    public void U() {
    }

    private boolean y() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.Y != Long.MAX_VALUE && this.Y + (long)this.V.r() >= System.currentTimeMillis()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ExecutionStateTracker1057.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ExecutionStateTracker1057.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void L() {
        this.V = null;
        this.J(Long.MAX_VALUE);
        this.n = false;
    }

    public NumericStreamProcessor V() {
        return this.F;
    }

    @Override
    public double e() {
        return 0.0;
    }

    private void f() {
        this.Y = System.currentTimeMillis();
    }

    @Override
    public void G() {
        this.Z();
    }

    private void T(DataTransformationEngine1794 dataTransformationEngine1794) {
        this.V = dataTransformationEngine1794;
        this.E = new bm(this.V.R(), 0.8f);
        this.E.n(this.b.w() - 14.0);
        this.F.o();
    }

    public long M() {
        return this.Y;
    }

    private void a() {
        this.F.q();
        this.n = true;
    }

    @Override
    public MetricsCalculationEngine C() {
        return new MetricsCalculationEngine(this.b.G() + 2.5, this.b.W() + this.b.b() - this.F.t(), this.b.w() - 5.0, Math.max(Math.max(this.F.t() - 0.5, 4.0), 0.0));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void N(DataTransformationEngine1794 dataTransformationEngine1794) {
        this.L();
        this.T(dataTransformationEngine1794);
    }

    public Queue<DataTransformationEngine1794> w() {
        return this.v;
    }

    private void J(long l) {
        this.Y = l;
    }
}

