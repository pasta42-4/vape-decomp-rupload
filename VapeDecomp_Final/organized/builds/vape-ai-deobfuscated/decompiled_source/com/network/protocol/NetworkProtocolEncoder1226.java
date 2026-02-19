/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.app.correlation.management.UuidCorrelationManager;
import com.encoding.strategy.EncodingScheme;
import com.exception.system.CustomSystemException;
import com.financial.transaction.TransactionInitiator;
import com.network.protocol.NetworkProtocolEncoder1013;

public class NetworkProtocolEncoder1226
extends UuidCorrelationManager<TransactionInitiator> {
    private static boolean D;
    private EncodingScheme R;

    public NetworkProtocolEncoder1226() {
    }

    public static void v(boolean bl) {
        D = bl;
    }

    public NetworkProtocolEncoder1226(TransactionInitiator transactionInitiator, EncodingScheme encodingScheme) {
        super(transactionInitiator);
        this.R = encodingScheme;
    }

    public EncodingScheme c() {
        return this.R;
    }

    public static boolean W() {
        return D;
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.R);
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.R = networkProtocolEncoder1013.L(EncodingScheme.class);
    }

    public static boolean g() {
        boolean bl = NetworkProtocolEncoder1226.W();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolEncoder1226.a(customSystemException);
        }
        return false;
    }

    static {
        if (!NetworkProtocolEncoder1226.W()) {
            NetworkProtocolEncoder1226.v(true);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

