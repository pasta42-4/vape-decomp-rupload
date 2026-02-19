/*
 * Decompiled with CFR 0.152.
 */
package com.state.management;

import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ReflectionMetadataResolver;

public class StateTransitionManager2094
extends CryptoProtocolEngine {
    private static boolean D;

    public StateTransitionManager2094() {
        super(ReflectionMetadataResolver.g);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static {
        if (StateTransitionManager2094.l()) {
            StateTransitionManager2094.l(true);
        }
    }

    public static boolean l() {
        boolean bl = StateTransitionManager2094.c();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StateTransitionManager2094.a(customSystemException);
        }
        return false;
    }

    public static boolean c() {
        return D;
    }

    public static void l(boolean bl) {
        D = bl;
    }
}

