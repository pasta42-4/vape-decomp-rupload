/*
 * Decompiled with CFR 0.152.
 */
package com.cache.management;

import com.app.correlation.management.UuidCorrelationManager;
import com.data.stream.StreamProcessor1422;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;

public class CacheDispatcher
extends UuidCorrelationManager<StreamProcessor1422> {
    private ReflectionUtilityManager680 w;
    private static boolean R;

    public CacheDispatcher() {
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.w = new ReflectionUtilityManager680(networkProtocolEncoder1013);
    }

    public CacheDispatcher(ReflectionUtilityManager680 reflectionUtilityManager680) {
        this.w = reflectionUtilityManager680;
    }

    public static boolean I() {
        return R;
    }

    public static void f(boolean bl) {
        R = bl;
    }

    public ReflectionUtilityManager680 U() {
        return this.w;
    }

    public static boolean l() {
        boolean bl = CacheDispatcher.I();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CacheDispatcher.a(customSystemException);
        }
        return false;
    }

    static {
        if (CacheDispatcher.I()) {
            CacheDispatcher.f(true);
        }
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.w.o(networkProtocolEncoder1013);
    }
}

