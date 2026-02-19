/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.security.registry.CryptoAlgorithmRegistry893;

public class NetworkConnectionManager1416
implements DataTransformationContract2366 {
    private CryptoAlgorithmRegistry893 H;
    private Object f;
    private static int[] L;

    public Object n() {
        return this.f;
    }

    public static void o(int[] nArray) {
        L = nArray;
    }

    public NetworkConnectionManager1416() {
    }

    static {
        if (NetworkConnectionManager1416.G() == null) {
            NetworkConnectionManager1416.o(new int[2]);
        }
    }

    public NetworkConnectionManager1416(CryptoAlgorithmRegistry893 cryptoAlgorithmRegistry893, Object object) {
        this.H = cryptoAlgorithmRegistry893;
        this.f = object;
    }

    public static int[] G() {
        return L;
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.H = networkProtocolEncoder1013.L(CryptoAlgorithmRegistry893.class);
        this.f = this.H.S().apply(networkProtocolEncoder1013);
    }

    public CryptoAlgorithmRegistry893 E() {
        return this.H;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.H);
        this.H.m().accept(networkProtocolEncoder1013, this.f);
    }
}

