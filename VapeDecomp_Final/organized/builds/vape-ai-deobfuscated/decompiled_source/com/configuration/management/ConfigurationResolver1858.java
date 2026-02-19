/*
 * Decompiled with CFR 0.152.
 */
package com.configuration.management;

import com.app.temporal.sequencing.TemporalDataSequencer;
import com.exception.system.CustomSystemException;
import com.network.configuration.NetworkConfigManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConfigurationResolver1858 {
    private final ConcurrentHashMap<TemporalDataSequencer, Long> z = new ConcurrentHashMap();
    private NetworkConfigManager U = new NetworkConfigManager();

    public void u(TemporalDataSequencer temporalDataSequencer) {
        try {
            this.z.put(temporalDataSequencer, temporalDataSequencer.d());
            if (this.U.m(1000L)) {
                this.U.m();
                this.Q();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationResolver1858.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ConcurrentHashMap<TemporalDataSequencer, Long> Z() {
        return this.z;
    }

    private static boolean lambda$cleanupOldEvents$0(long l, Map.Entry entry) {
        boolean bl;
        try {
            bl = l - ((TemporalDataSequencer)entry.getKey()).C() > 10000000000L;
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationResolver1858.a(customSystemException);
        }
        return bl;
    }

    private void Q() {
        long l = System.nanoTime();
        this.z.entrySet().removeIf(arg_0 -> ConfigurationResolver1858.lambda$cleanupOldEvents$0(l, arg_0));
    }
}

