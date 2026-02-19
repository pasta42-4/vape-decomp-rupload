/*
 * Decompiled with CFR 0.152.
 */
package com.data.streaming;

import com.data.processing.DataTransformationEngine408;
import com.deobfuscation.transformation.BinaryTransformer;
import com.game.configuration.GameVersionEnumerator;
import com.system.lifecycle.ObjectLifecycleTracker;

public class StreamProcessor1861
extends ObjectLifecycleTracker {
    public int Q() {
        if (GameVersionEnumerator.MC_1_21_6.H()) {
            BinaryTransformer binaryTransformer = new BinaryTransformer(DataTransformationEngine408.O(StreamProcessor1861.U.u().gd, this.H));
            return binaryTransformer.i();
        }
        return DataTransformationEngine408.M(StreamProcessor1861.U.u().gd, this.H);
    }

    public void r(boolean bl, boolean bl2) {
        DataTransformationEngine408.d(StreamProcessor1861.U.u().gd, this.H, bl, bl2);
    }

    public StreamProcessor1861(Object object) {
        super(object);
    }
}

