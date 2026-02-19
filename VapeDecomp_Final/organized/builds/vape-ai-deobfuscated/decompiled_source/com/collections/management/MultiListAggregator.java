/*
 * Decompiled with CFR 0.152.
 */
package com.collections.management;

import com.app.correlation.management.UuidCorrelationManager;
import com.data.streaming.DataStreamProcessor1482;
import com.exception.system.CustomSystemException;
import com.identity.management.UniversalIdentityManager;
import com.network.connection.NetworkEndpointIdentifier;
import com.network.protocol.NetworkProtocolEncoder1013;
import java.util.ArrayList;
import java.util.List;

public class MultiListAggregator
extends UuidCorrelationManager<DataStreamProcessor1482> {
    private final List<UniversalIdentityManager> y = new ArrayList<UniversalIdentityManager>();
    private final List<NetworkEndpointIdentifier> l = new ArrayList<NetworkEndpointIdentifier>();
    private final List<NetworkEndpointIdentifier> Z = new ArrayList<NetworkEndpointIdentifier>();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public List<NetworkEndpointIdentifier> e() {
        return this.Z;
    }

    public MultiListAggregator(DataStreamProcessor1482 dataStreamProcessor1482, List<UniversalIdentityManager> list, List<NetworkEndpointIdentifier> list2, List<NetworkEndpointIdentifier> list3) {
        super(dataStreamProcessor1482);
        this.y.addAll(list);
        this.l.addAll(list2);
        this.Z.addAll(list3);
    }

    public List<UniversalIdentityManager> D() {
        return this.y;
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.I(this.y.size());
        for (UniversalIdentityManager object : this.y) {
            object.N(networkProtocolEncoder1013);
        }
        networkProtocolEncoder1013.I(this.l.size());
        for (NetworkEndpointIdentifier networkEndpointIdentifier : this.l) {
            networkEndpointIdentifier.p(networkProtocolEncoder1013);
        }
        networkProtocolEncoder1013.I(this.Z.size());
        for (NetworkEndpointIdentifier networkEndpointIdentifier : this.Z) {
            networkEndpointIdentifier.p(networkProtocolEncoder1013);
        }
    }

    public List<NetworkEndpointIdentifier> h() {
        return this.l;
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        int n;
        int n2;
        int n3 = networkProtocolEncoder1013.e();
        for (n2 = 0; n2 < n3; ++n2) {
            UniversalIdentityManager universalIdentityManager = new UniversalIdentityManager(networkProtocolEncoder1013);
            this.y.add(universalIdentityManager);
        }
        n2 = networkProtocolEncoder1013.e();
        try {
            for (n = 0; n < n2; ++n) {
                this.l.add(new NetworkEndpointIdentifier(networkProtocolEncoder1013));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiListAggregator.a(customSystemException);
        }
        n = networkProtocolEncoder1013.e();
        try {
            for (int i = 0; i < n; ++i) {
                this.Z.add(new NetworkEndpointIdentifier(networkProtocolEncoder1013));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiListAggregator.a(customSystemException);
        }
    }

    public MultiListAggregator() {
    }
}

