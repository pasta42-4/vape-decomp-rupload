/*
 * Decompiled with CFR 0.152.
 */
package com.simulation.configuration;

import com.app.math.NumericStreamProcessor;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.security.crypto.CipherManager;
import java.awt.Color;

public abstract class SimulationConfigurer
extends CipherManager {
    private NumericStreamProcessor Yd = new NumericStreamProcessor(0.15, 0.0, 100.0);
    protected boolean Y6;
    protected boolean YH;
    private double Yw = 0.0;

    public abstract void u();

    @Override
    public double e() {
        return this.I();
    }

    @Override
    public void g() {
        try {
            if (!this.YH) {
                this.YH = true;
                this.Yd.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SimulationConfigurer.a(customSystemException);
        }
    }

    @Override
    public void d() {
        block14: {
            block13: {
                block12: {
                    try {
                        try {
                            if (this.s() || !this.YH) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SimulationConfigurer.a(customSystemException);
                        }
                        this.YH = false;
                        this.Yd.c();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SimulationConfigurer.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (this.d() || !this.Y6) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SimulationConfigurer.a(customSystemException);
                    }
                    this.Y6 = false;
                    this.O();
                }
                catch (CustomSystemException customSystemException) {
                    throw SimulationConfigurer.a(customSystemException);
                }
            }
            try {
                try {
                    if (!this.d() || this.Y6) break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw SimulationConfigurer.a(customSystemException);
                }
                this.Y6 = true;
                this.u();
            }
            catch (CustomSystemException customSystemException) {
                throw SimulationConfigurer.a(customSystemException);
            }
        }
    }

    public SimulationConfigurer() {
        super("");
    }

    public Color Z() {
        try {
            if (this.d()) {
                return EventDispatchCoordinator1159.y(SimulationConfigurer.M.S, (int)this.Yd.p());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SimulationConfigurer.a(customSystemException);
        }
        return EventDispatchCoordinator1159.y(SimulationConfigurer.M.S, this.Yd.t().intValue());
    }

    @Override
    public double z() {
        return 6.0;
    }

    public boolean N() {
        return this.Y6;
    }

    @Override
    public double I() {
        return 15.0;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

