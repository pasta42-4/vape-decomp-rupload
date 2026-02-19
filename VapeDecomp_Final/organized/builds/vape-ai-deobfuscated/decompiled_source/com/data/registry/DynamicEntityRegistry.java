/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.data.registry;

import com.app.network.response.ResponseHandlingStrategy;
import com.exception.system.CustomSystemException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

public class DynamicEntityRegistry {
    private final List<ResponseHandlingStrategy> N = new ArrayList<ResponseHandlingStrategy>();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void C(ResponseHandlingStrategy responseHandlingStrategy) {
        this.N.remove(responseHandlingStrategy);
    }

    public @UnmodifiableView List<ResponseHandlingStrategy> x() {
        return this.N;
    }

    public void v(ResponseHandlingStrategy responseHandlingStrategy) {
        this.N.add(responseHandlingStrategy);
    }

    public void n(@Nullable ResponseHandlingStrategy responseHandlingStrategy, ResponseHandlingStrategy responseHandlingStrategy2) {
        try {
            if (responseHandlingStrategy != null) {
                this.C(responseHandlingStrategy);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicEntityRegistry.a(customSystemException);
        }
        this.v(responseHandlingStrategy2);
    }

    @Nullable
    public ResponseHandlingStrategy C(UUID uUID) {
        for (ResponseHandlingStrategy responseHandlingStrategy : this.N) {
            try {
                if (!responseHandlingStrategy.u().equals(uUID)) continue;
                return responseHandlingStrategy;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicEntityRegistry.a(customSystemException);
            }
        }
        return null;
    }
}

