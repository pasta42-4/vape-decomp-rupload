/*
 * Decompiled with CFR 0.152.
 */
package com.app.network;

import a.qG;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class NetworkProtocolHandler1444
extends ObjectLifecycleTracker {
    public int A(int n) {
        try {
            if (GeometryCalculator.C() >= 35) {
                TemporalMetadataResolver.k();
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolHandler1444.a(customSystemException);
        }
        return qG.E(NetworkProtocolHandler1444.U.u().G9, this.H, n);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void E(boolean bl) {
        qG.K(NetworkProtocolHandler1444.U.u().G9, this.H, bl);
    }

    @Override
    public IntBuffer M() {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                TemporalMetadataResolver.k();
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolHandler1444.a(customSystemException);
        }
        if (GeometryCalculator.C() >= 35) {
            ByteBuffer byteBuffer = (ByteBuffer)qG.i(NetworkProtocolHandler1444.U.u().G9, this.H);
            return byteBuffer.asIntBuffer();
        }
        return (IntBuffer)qG.l(NetworkProtocolHandler1444.U.u().G9, this.H);
    }

    public NetworkProtocolHandler1444(Object object) {
        super(object);
    }
}

