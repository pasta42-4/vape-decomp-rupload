/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.tasks;

import com.exception.system.CustomSystemException;
import com.graphics.theme.GraphicalThemeRenderer;
import com.network.connection.ConnectionPoolOrchestrator;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

class BackgroundTaskManager
extends GraphicalThemeRenderer {
    final ConnectionPoolOrchestrator Ab;

    @Override
    public void G() {
        try {
            if (this.s()) {
                ConfigurationManager.T(this.G() + 1.5, this.W() + 4.0, 11.0, 1.0, new Color(255, 255, 255, 15));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BackgroundTaskManager.a(customSystemException);
        }
        super.G();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    BackgroundTaskManager(ConnectionPoolOrchestrator connectionPoolOrchestrator, String string, double d2) {
        this.Ab = connectionPoolOrchestrator;
        super(string, d2);
    }
}

