/*
 * Decompiled with CFR 0.152.
 */
package com.data.processing;

import com.exception.system.CustomSystemException;
import com.minecraft.event.RenderEventInterface;
import com.network.connection.NetworkConnectionEstablisher;

public class GenericDataPipeline<T extends NetworkConnectionEstablisher>
implements RenderEventInterface<T> {
    public static final RenderEventInterface<NetworkConnectionEstablisher> D = new GenericDataPipeline<NetworkConnectionEstablisher>();

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public String E(T t) {
        String string;
        try {
            string = t != null ? ((NetworkConnectionEstablisher)t).toString() : "";
        }
        catch (CustomSystemException customSystemException) {
            throw GenericDataPipeline.b(customSystemException);
        }
        return string;
    }
}

