/*
 * Decompiled with CFR 0.152.
 */
package com.network.core;

import com.reflection.utils.ReflectionExceptionResolver;

class CommunicationLifecycleManager {
    static final int[] v = new int[ReflectionExceptionResolver.values().length];

    static {
        try {
            CommunicationLifecycleManager.v[ReflectionExceptionResolver.ACQUIRING_PEARL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CommunicationLifecycleManager.v[ReflectionExceptionResolver.ACQUIRING_AIMLOCK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CommunicationLifecycleManager.v[ReflectionExceptionResolver.PENDING_AIMJOB.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CommunicationLifecycleManager.v[ReflectionExceptionResolver.PENDING_THROW.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CommunicationLifecycleManager.v[ReflectionExceptionResolver.PENDING_RESET.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

