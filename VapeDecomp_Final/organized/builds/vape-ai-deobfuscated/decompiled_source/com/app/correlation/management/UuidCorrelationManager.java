/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.app.correlation.management;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

public abstract class UuidCorrelationManager<R extends UuidCorrelationManager>
implements DataTransformationContract2366 {
    private static int[] e;
    private UUID X;

    public UuidCorrelationManager(@Nullable R r) {
        this.X = r != null ? ((UuidCorrelationManager)r).R() : UUID.randomUUID();
    }

    @Override
    public final void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.i(this.X);
        this.X(networkProtocolEncoder1013);
    }

    public static void V(int[] nArray) {
        e = nArray;
    }

    @Override
    public final void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.X = networkProtocolEncoder1013.x();
        this.U(networkProtocolEncoder1013);
    }

    static {
        if (UuidCorrelationManager.Q() != null) {
            UuidCorrelationManager.V(new int[1]);
        }
    }

    public abstract void X(NetworkProtocolEncoder1013 var1);

    public UuidCorrelationManager() {
        this.X = UUID.randomUUID();
    }

    public static int[] Q() {
        return e;
    }

    public UUID R() {
        return this.X;
    }

    public abstract void U(NetworkProtocolEncoder1013 var1);
}

