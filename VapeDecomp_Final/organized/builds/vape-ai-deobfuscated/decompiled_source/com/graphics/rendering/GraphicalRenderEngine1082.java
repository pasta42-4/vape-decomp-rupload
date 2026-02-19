/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.graphics.rendering;

import com.event.management.EventDistributionHub;
import com.exception.system.CustomSystemException;
import com.math.transformation.NumericTransformationEngine;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;
import java.awt.Color;
import org.jetbrains.annotations.Nullable;

public class GraphicalRenderEngine1082
extends NumericTransformationEngine {
    private static String EZ;
    private float EN = 1.5f;
    private float ED = 1.0f;
    private boolean Ek = true;
    @Nullable
    private Color EP = null;

    @Override
    public void o(boolean bl) {
        block19: {
            double d2;
            double d3;
            double d4;
            double d5;
            block22: {
                double d6;
                double d7;
                double d8;
                double d9;
                block24: {
                    block23: {
                        block16: {
                            double d10;
                            double d11;
                            double d12;
                            double d13;
                            block21: {
                                block20: {
                                    boolean bl2;
                                    Color color;
                                    double d14;
                                    double d15;
                                    double d16;
                                    double d17;
                                    block18: {
                                        block17: {
                                            try {
                                                try {
                                                    if (!this.Ek) break block16;
                                                    d17 = this.G();
                                                    d16 = this.W();
                                                    d15 = this.w();
                                                    if (!bl) break block17;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalRenderEngine1082.c(customSystemException);
                                                }
                                                d14 = this.G5;
                                                break block18;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GraphicalRenderEngine1082.c(customSystemException);
                                            }
                                        }
                                        d14 = this.b();
                                    }
                                    try {
                                        color = this.l();
                                        bl2 = this.Q() != null;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GraphicalRenderEngine1082.c(customSystemException);
                                    }
                                    try {
                                        try {
                                            ConfigurationManager.g(d17, d16, d15, d14, color, bl2, this.EN, 1.0f, 8.0f, new Color(0, 0, 0, 152), this.j());
                                            if (this.h() == null) break block19;
                                            d13 = this.G();
                                            d12 = this.W();
                                            d11 = this.w();
                                            if (!bl) break block20;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GraphicalRenderEngine1082.c(customSystemException);
                                        }
                                        d10 = this.G5;
                                        break block21;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GraphicalRenderEngine1082.c(customSystemException);
                                    }
                                }
                                d10 = this.b();
                            }
                            ConfigurationManager.U(d13, d12, d11, d10, this.h(), this.EN, 0.75f, 1.0f);
                            break block19;
                        }
                        try {
                            try {
                                if (this.h() == null) break block22;
                                d9 = this.G();
                                d8 = this.W();
                                d7 = this.w();
                                if (!bl) break block23;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderEngine1082.c(customSystemException);
                            }
                            d6 = this.G5;
                            break block24;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderEngine1082.c(customSystemException);
                        }
                    }
                    d6 = this.b();
                }
                ConfigurationManager.q(d9, d8, d7, d6, this.b(), this.l(), this.h());
                break block19;
            }
            try {
                d5 = this.G();
                d4 = this.W();
                d3 = this.w();
                d2 = bl ? this.G5 : this.b();
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderEngine1082.c(customSystemException);
            }
            ConfigurationManager.A(d5, d4, d3, d2, this.l());
        }
    }

    public float b() {
        return this.ED;
    }

    public void J(@Nullable Color color) {
        this.EP = color;
    }

    public float o() {
        return this.EN;
    }

    static {
        if (GraphicalRenderEngine1082.s() != null) {
            GraphicalRenderEngine1082.I("xci47b");
        }
    }

    public GraphicalRenderEngine1082(double d2, double d3) {
        this.T(d2);
        this.w(d3);
        EventDistributionHub eventDistributionHub = this.d();
        eventDistributionHub.o(false);
        eventDistributionHub.m(false);
        eventDistributionHub.y(false);
        eventDistributionHub.i(false);
        eventDistributionHub.v(false);
    }

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void C() {
    }

    public void d(float f) {
        this.ED = f;
    }

    public void b(boolean bl) {
        this.Ek = bl;
    }

    public void k(float f) {
        this.EN = f;
    }

    @Nullable
    public Color h() {
        return this.EP;
    }

    @Override
    public double z() {
        return 0.0;
    }

    @Override
    public double e() {
        return 0.0;
    }

    public static String s() {
        return EZ;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    public static void I(String string) {
        EZ = string;
    }

    @Override
    public void i() {
    }

    @Override
    public void u() {
    }

    public boolean F() {
        return this.Ek;
    }
}

