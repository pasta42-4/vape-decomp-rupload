/*
 * Decompiled with CFR 0.152.
 */
package com.data.streaming;

import com.exception.system.CustomSystemException;
import com.graphics.theme.GraphicalThemeRenderer;
import com.network.connection.ConnectionPoolOrchestrator;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

class DataStreamProcessor1881
extends GraphicalThemeRenderer {
    final ConnectionPoolOrchestrator Ap;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void G() {
        try {
            if (this.s()) {
                ConfigurationManager.T(this.G() + 1.5, this.W() + 4.0, 11.0, 1.0, new Color(255, 255, 255, 15));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamProcessor1881.a(customSystemException);
        }
        super.G();
    }

    DataStreamProcessor1881(ConnectionPoolOrchestrator connectionPoolOrchestrator, String string, double d2) {
        this.Ap = connectionPoolOrchestrator;
        super(string, d2);
    }
}

