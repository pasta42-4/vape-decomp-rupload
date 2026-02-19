/*
 * Decompiled with CFR 0.152.
 */
package com.concurrent.execution;

import com.exception.system.CustomSystemException;
import com.temporal.metadata.TemporalMetadataResolver;

public class AsyncTaskExecutor {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void call(Object object) {
        try {
            if (TemporalMetadataResolver.h == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsyncTaskExecutor.a(customSystemException);
        }
    }

    public static native void reg(Class var0, int var1);
}

