/*
 * Decompiled with CFR 0.152.
 */
package com.network.communication;

import com.app.resource.management.ResourceAllocator2027;
import com.network.connection.ConnectionLifecycleHandler;
import com.security.transform.CryptographicTransformer;

public class CommunicationChannelManager1878
extends ConnectionLifecycleHandler {
    public static CommunicationChannelManager1878 Y(CryptographicTransformer cryptographicTransformer, ResourceAllocator2027 resourceAllocator2027) {
        return new CommunicationChannelManager1878(CommunicationChannelManager1878.U.u().s.B(cryptographicTransformer.M(), resourceAllocator2027.M()));
    }

    public static CommunicationChannelManager1878 O(CryptographicTransformer cryptographicTransformer, int n) {
        return new CommunicationChannelManager1878(CommunicationChannelManager1878.U.u().s.X(cryptographicTransformer.M(), n));
    }

    public CommunicationChannelManager1878(Object object) {
        super(object);
    }
}

