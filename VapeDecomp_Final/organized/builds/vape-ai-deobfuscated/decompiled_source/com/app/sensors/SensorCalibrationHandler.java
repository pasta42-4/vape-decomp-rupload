/*
 * Decompiled with CFR 0.152.
 */
package com.app.sensors;

import com.app.graphics.rendering.ColorPaletteRenderer;
import com.app.workflow.StateTrackingCoordinator;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.VisualRenderingController;
import java.awt.Color;

public class SensorCalibrationHandler
extends VisualRenderingController {
    protected ColorPaletteRenderer V;
    protected float L;
    protected String vU;

    @Override
    public void G() {
        super.G();
        StateTrackingCoordinator.y(this.V.k(), (float)(this.G() + this.w() / 2.0 - (double)(32.0f * this.L / 2.0f)), (float)(this.W() + this.b() / 2.0 - (double)(32.0f * this.L / 2.0f)), this.vU, this.L);
    }

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public SensorCalibrationHandler(String string, double d2, double d3, double d4, Color color, double d5) {
        super(d3, d4, color, d5);
        this.V = new ColorPaletteRenderer(0.15, SensorCalibrationHandler.M.Z, SensorCalibrationHandler.M.q);
        this.vU = string;
        this.L = (float)d2;
    }

    @Override
    public void l(boolean bl) {
        try {
            if (this.T != bl) {
                this.V.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SensorCalibrationHandler.c(customSystemException);
        }
        super.l(bl);
    }

    public void R(ColorPaletteRenderer colorPaletteRenderer) {
        this.V = colorPaletteRenderer;
    }

    public SensorCalibrationHandler(String string, double d2, double d3, double d4, Color color) {
        super(d3, d4, color);
        this.V = new ColorPaletteRenderer(0.15, SensorCalibrationHandler.M.Z, SensorCalibrationHandler.M.q);
        this.vU = string;
        this.L = (float)d2;
    }

    public ColorPaletteRenderer S() {
        return this.V;
    }
}

