/*
 * Decompiled with CFR 0.152.
 */
package com.math.generation;

import com.algorithm.optimization.AdaptiveComputationEngine;
import com.exception.system.CustomSystemException;
import com.network.configuration.NetworkConfigManager;
import java.util.Random;

public class RandomGeometryGenerator {
    private double X;
    private double r;
    private double g;
    private NetworkConfigManager L;
    private double P;
    private Random b = new Random();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public RandomGeometryGenerator(double d2, double d3) {
        this.L = new NetworkConfigManager();
        this.X = d2;
        this.g = d3;
    }

    public void L() {
        block12: {
            block11: {
                try {
                    if (this.L.m(AdaptiveComputationEngine.B(this.b, 100, 1000))) {
                        this.L.m();
                        this.P = AdaptiveComputationEngine.F(this.b, this.X, this.g);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw RandomGeometryGenerator.a(customSystemException);
                }
                try {
                    try {
                        if (!(this.P > this.r)) break block11;
                        this.r += 0.01 + AdaptiveComputationEngine.F(this.b, 0.0, 0.05);
                        if (!(this.r > this.P)) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RandomGeometryGenerator.a(customSystemException);
                    }
                    this.r = this.P;
                    break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw RandomGeometryGenerator.a(customSystemException);
                }
            }
            try {
                try {
                    if (!(this.P < this.r)) break block12;
                    this.r -= 0.01 + AdaptiveComputationEngine.F(this.b, 0.0, 0.05);
                    if (!(this.r < this.P)) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw RandomGeometryGenerator.a(customSystemException);
                }
                this.r = this.P;
            }
            catch (CustomSystemException customSystemException) {
                throw RandomGeometryGenerator.a(customSystemException);
            }
        }
    }

    public double x() {
        return this.r;
    }
}

