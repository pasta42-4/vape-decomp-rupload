/*
 * Decompiled with CFR 0.152.
 */
package com.data.streaming;

import com.deobfuscation.events.EventDispatcher2141;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.security.encryption.CipherKeyGenerator518;
import com.temporal.metadata.TemporalMetadataResolver;

public class DataStreamProcessor1600
extends EventDispatcher2141 {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static DataStreamProcessor1600 n(String string) {
        try {
            if (GameVersionEnumerator.MC_1_20_6.Q()) {
                TemporalMetadataResolver.k();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamProcessor1600.a(customSystemException);
        }
        return new DataStreamProcessor1600(CipherKeyGenerator518.g(DataStreamProcessor1600.U.u().Lv, string));
    }

    @Override
    public String M() {
        try {
            if (GameVersionEnumerator.MC_1_16_5_ACTUAL.Q()) {
                TemporalMetadataResolver.k();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamProcessor1600.a(customSystemException);
        }
        return DataStreamProcessor1600.U.u().Lv.U(this.M());
    }

    public DataStreamProcessor1600(Object object) {
        super(object);
    }

    public static DataStreamProcessor1600 Y(String string) {
        return new DataStreamProcessor1600(DataStreamProcessor1600.U.u().Lv.a(string));
    }
}

