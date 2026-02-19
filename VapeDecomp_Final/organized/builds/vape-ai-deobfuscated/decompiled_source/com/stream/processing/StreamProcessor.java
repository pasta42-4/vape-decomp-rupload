/*
 * Decompiled with CFR 0.152.
 */
package com.stream.processing;

import com.app.correlation.management.UuidCorrelationManager;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.network.protocol.NetworkProtocolManager1476;
import com.security.config.CryptoAlgorithmConfiguration;

public class StreamProcessor
extends UuidCorrelationManager<NetworkProtocolManager1476> {
    private static boolean z;
    private CryptoAlgorithmConfiguration Y;

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.Y);
    }

    public static boolean y() {
        return z;
    }

    public StreamProcessor() {
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static {
        if (!StreamProcessor.U()) {
            StreamProcessor.j(true);
        }
    }

    public CryptoAlgorithmConfiguration l() {
        return this.Y;
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.Y = networkProtocolEncoder1013.L(CryptoAlgorithmConfiguration.class);
    }

    public static boolean U() {
        boolean bl = StreamProcessor.y();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessor.a(customSystemException);
        }
        return false;
    }

    public StreamProcessor(NetworkProtocolManager1476 networkProtocolManager1476, CryptoAlgorithmConfiguration cryptoAlgorithmConfiguration) {
        super(networkProtocolManager1476);
        this.Y = cryptoAlgorithmConfiguration;
    }

    public static void j(boolean bl) {
        z = bl;
    }
}

