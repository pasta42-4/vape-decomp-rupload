/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a.wz;
import com.app.sensors.SensorCalibrationHandler;
import com.exception.system.CustomSystemException;
import java.awt.Color;

class ConnectionEstablisher1885
extends SensorCalibrationHandler {
    final wz jv;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    ConnectionEstablisher1885(wz wz2, String string, double d2, double d3, double d4, Color color, double d5) {
        this.jv = wz2;
        super(string, d2, d3, d4, color, d5);
    }

    @Override
    public void l(boolean bl) {
        try {
            if (wz.Z(this.jv)) {
                this.T = false;
                this.S().D();
                this.J().D();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConnectionEstablisher1885.a(customSystemException);
        }
        super.l(bl);
    }
}

