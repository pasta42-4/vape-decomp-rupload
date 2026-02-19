/*
 * Decompiled with CFR 0.152.
 */
package com.security.trust;

import com.exception.system.CustomSystemException;
import com.identifier.management.UniqueIdentifierManager1303;
import com.network.protocol.NetworkProtocolEncoder1013;
import java.util.ArrayList;
import java.util.List;

public class CertificateTrustManager {
    private UniqueIdentifierManager1303 K;
    private List<UniqueIdentifierManager1303> r;
    private List<UniqueIdentifierManager1303> y = new ArrayList<UniqueIdentifierManager1303>();

    public CertificateTrustManager(UniqueIdentifierManager1303 uniqueIdentifierManager1303, List<UniqueIdentifierManager1303> list, List<UniqueIdentifierManager1303> list2) {
        this.r = new ArrayList<UniqueIdentifierManager1303>();
        this.K = uniqueIdentifierManager1303;
        this.y = list;
        this.r = list2;
    }

    public UniqueIdentifierManager1303 g() {
        return this.K;
    }

    public List<UniqueIdentifierManager1303> K() {
        return this.r;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public List<UniqueIdentifierManager1303> P() {
        return this.y;
    }

    public void k(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.K.P(networkProtocolEncoder1013);
        networkProtocolEncoder1013.e(this.y.size());
        for (UniqueIdentifierManager1303 uniqueIdentifierManager1303 : this.y) {
            uniqueIdentifierManager1303.P(networkProtocolEncoder1013);
        }
        networkProtocolEncoder1013.e(this.r.size());
        for (UniqueIdentifierManager1303 uniqueIdentifierManager1303 : this.r) {
            uniqueIdentifierManager1303.P(networkProtocolEncoder1013);
        }
    }

    public CertificateTrustManager(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        int n;
        this.r = new ArrayList<UniqueIdentifierManager1303>();
        this.K = new UniqueIdentifierManager1303(networkProtocolEncoder1013);
        int n2 = networkProtocolEncoder1013.U();
        try {
            for (n = 0; n < n2; ++n) {
                this.y.add(new UniqueIdentifierManager1303(networkProtocolEncoder1013));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CertificateTrustManager.a(customSystemException);
        }
        n = networkProtocolEncoder1013.U();
        try {
            for (int i = 0; i < n; ++i) {
                this.r.add(new UniqueIdentifierManager1303(networkProtocolEncoder1013));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CertificateTrustManager.a(customSystemException);
        }
    }
}

