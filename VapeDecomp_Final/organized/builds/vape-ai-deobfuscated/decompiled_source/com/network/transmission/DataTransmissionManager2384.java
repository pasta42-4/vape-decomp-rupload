/*
 * Decompiled with CFR 0.152.
 */
package com.network.transmission;

import a.Qm;
import com.network.protocol.NetworkProtocolNegotiator;
import com.security.authentication.CryptographicTokenGenerator1926;

public class DataTransmissionManager2384
extends Qm {
    public DataTransmissionManager2384(Object object) {
        super(object);
    }

    public static DataTransmissionManager2384 h(NetworkProtocolNegotiator networkProtocolNegotiator, CryptographicTokenGenerator1926 cryptographicTokenGenerator1926) {
        return new DataTransmissionManager2384(DataTransmissionManager2384.U.u().gF.y(networkProtocolNegotiator.M(), cryptographicTokenGenerator1926.M()));
    }
}

