/*
 * Decompiled with CFR 0.152.
 */
package com.network.state;

import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkPacketInterceptor;
import com.reflection.utils.ReflectionUtilityManager680;
import com.security.context.CryptographicContextManager1765;
import com.security.crypto.CryptoTransformationRegistry;

public class NetworkStateController
extends CryptographicContextManager1765 {
    private static boolean B;
    private final CryptoTransformationRegistry o;

    public static boolean k() {
        boolean bl = NetworkStateController.p();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkStateController.b(customSystemException);
        }
        return false;
    }

    public static void u(boolean bl) {
        B = bl;
    }

    public NetworkStateController(NetworkPacketInterceptor networkPacketInterceptor, ReflectionUtilityManager680 reflectionUtilityManager680, CryptoTransformationRegistry cryptoTransformationRegistry) {
        super(networkPacketInterceptor, reflectionUtilityManager680);
        this.o = cryptoTransformationRegistry;
    }

    public CryptoTransformationRegistry z() {
        return this.o;
    }

    public static boolean p() {
        return B;
    }

    static {
        if (!NetworkStateController.k()) {
            NetworkStateController.u(true);
        }
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

