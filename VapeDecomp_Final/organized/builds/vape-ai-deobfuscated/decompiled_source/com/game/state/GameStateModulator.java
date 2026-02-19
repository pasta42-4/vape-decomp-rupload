/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.game.state;

import a._Y;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.network.configuration.NetworkConfigManager;
import com.system.configuration.ConfigurationManager;
import com.transaction.management.TransactionOrchestrator1017;
import java.awt.Color;
import org.jetbrains.annotations.Nullable;

public class GameStateModulator
extends AbstractComputationKernel {
    private boolean Y = false;
    @Nullable
    private TransactionOrchestrator1017 E;
    private float v = 0.0f;
    private final NetworkConfigManager R = new NetworkConfigManager();
    private float n = 0.0f;

    public void J(@Nullable TransactionOrchestrator1017 transactionOrchestrator1017) {
        block6: {
            try {
                try {
                    try {
                        if (transactionOrchestrator1017 == null || !transactionOrchestrator1017.r()) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GameStateModulator.a(customSystemException);
                    }
                    if (!transactionOrchestrator1017.equals(this.E)) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw GameStateModulator.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw GameStateModulator.a(customSystemException);
            }
        }
        this.E = transactionOrchestrator1017;
        this.Y = true;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void d() {
        block5: {
            block4: {
                try {
                    try {
                        if (this.E == null) break block4;
                        this.v = _Y.Q(this.E);
                        if (!this.Y) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GameStateModulator.a(customSystemException);
                    }
                    this.Y = false;
                    this.R.m();
                    this.n = this.v;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw GameStateModulator.a(customSystemException);
                }
            }
            this.v = 0.0f;
        }
    }

    public GameStateModulator(int n, int n2) {
        this.T(n);
        this.w(n2);
    }

    @Override
    public void G() {
        double d2 = this.k();
        try {
            if (d2 == -1.0) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameStateModulator.a(customSystemException);
        }
        double d3 = Math.min(this.w() * this.k(), this.w());
        float f = (float)this.b() / 2.0f - 0.5f;
        ConfigurationManager.c(this.G(), this.W(), this.w(), this.b(), new Color(0, 0, 0, 100), false, f, 1.0f, 8.0f, new Color(0, 0, 0, 100));
        ConfigurationManager.c(this.G(), this.W(), d3, this.b(), GameStateModulator.M.Y, true, f, 1.0f, 8.0f, new Color(0, 0, 0, 100));
    }

    double k() {
        try {
            if (this.E == null) {
                return -1.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameStateModulator.a(customSystemException);
        }
        float f = this.i();
        return f / this.E.K();
    }

    public TransactionOrchestrator1017 C() {
        return this.E;
    }

    private float i() {
        float f;
        block15: {
            block16: {
                double d2;
                float f2;
                float f3;
                block17: {
                    float f4;
                    long l;
                    block14: {
                        try {
                            if (this.Y) {
                                return this.v;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GameStateModulator.a(customSystemException);
                        }
                        f = this.v;
                        l = this.R.d();
                        f4 = 10.0f;
                        if (!((float)l >= f4)) break block16;
                        f3 = Math.abs(this.n - f);
                        try {
                            if (!(f3 < 0.5f) || !(this.n < 0.5f)) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GameStateModulator.a(customSystemException);
                        }
                        f2 = 0.05f * ((float)l / f4);
                        break block17;
                    }
                    f2 = 0.08f * ((float)l / f4);
                }
                if (this.n < f) {
                    d2 = Math.max(1.0, Math.pow(f3, 0.5));
                    this.n = (float)((double)this.n + (double)f2 * d2);
                }
                if (this.n > f) {
                    d2 = Math.max(1.0, Math.pow(f3, 0.5));
                    this.n = (float)((double)this.n - (double)f2 * d2);
                }
                try {
                    this.n = Math.max(0.0f, Math.min(this.n, 20.0f));
                    if ((double)Math.abs(this.n - f) < 0.001) {
                        this.n = f;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GameStateModulator.a(customSystemException);
                }
                this.R.m();
            }
            try {
                try {
                    if (!Float.isNaN(this.n) && Float.isFinite(this.n)) break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw GameStateModulator.a(customSystemException);
                }
                this.n = f;
                this.R.m();
            }
            catch (CustomSystemException customSystemException) {
                throw GameStateModulator.a(customSystemException);
            }
        }
        f = this.n;
        f = Math.max(f, 0.0f);
        return f;
    }
}

