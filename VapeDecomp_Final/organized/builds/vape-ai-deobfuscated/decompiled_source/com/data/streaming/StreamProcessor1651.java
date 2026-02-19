/*
 * Decompiled with CFR 0.152.
 */
package com.data.streaming;

import a.qI;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.system.lifecycle.ObjectLifecycleTracker;

public class StreamProcessor1651
extends ObjectLifecycleTracker {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void c() {
        try {
            if (GameVersionEnumerator.MC_1_21_11.H()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessor1651.a(customSystemException);
        }
        qI.u(StreamProcessor1651.U.u().G8, this.H);
    }

    public void R() {
        try {
            if (GameVersionEnumerator.MC_1_21_11.H()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessor1651.a(customSystemException);
        }
        qI.Q(StreamProcessor1651.U.u().G8, this.H);
    }

    public void N(float f) {
        qI.J(StreamProcessor1651.U.u().G8, this.H, f);
    }

    public StreamProcessor1651(Object object) {
        super(object);
    }
}

