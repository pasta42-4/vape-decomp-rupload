/*
 * Decompiled with CFR 0.152.
 */
package com.data.validation;

import com.app.gameengine.GameRoundProcessor;
import com.data.compression.DataCompressionManager;
import com.system.lifecycle.ObjectLifecycleTracker;

public class DataIntegrityValidator2381
extends ObjectLifecycleTracker {
    public GameRoundProcessor c(DataCompressionManager dataCompressionManager) {
        return new GameRoundProcessor(DataIntegrityValidator2381.U.u().i.n(this.H, dataCompressionManager.M()));
    }

    public DataIntegrityValidator2381(Object object) {
        super(object);
    }
}

