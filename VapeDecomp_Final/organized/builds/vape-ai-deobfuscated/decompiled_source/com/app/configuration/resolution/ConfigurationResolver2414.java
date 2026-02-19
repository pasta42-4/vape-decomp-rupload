/*
 * Decompiled with CFR 0.152.
 */
package com.app.configuration.resolution;

import com.data.compression.DataCompressionManager;
import com.security.processing.SecureDataProcessor;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ConfigurationResolver2414
extends ObjectLifecycleTracker {
    public ConfigurationResolver2414(Object object) {
        super(object);
    }

    public static DataCompressionManager e() {
        return new DataCompressionManager(SecureDataProcessor.e(ConfigurationResolver2414.U.u().Gx));
    }
}

