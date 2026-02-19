/*
 * Decompiled with CFR 0.152.
 */
package com.security.key;

import com.core.computation.AbstractComputationKernel;
import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;
import com.security.crypto.CryptoTransformationRegistry;

public class CryptoKeyExchangeManager1384
implements DataTransformationContract2366 {
    private static AbstractComputationKernel[] e;
    private ReflectionUtilityManager680 S;
    private CryptoTransformationRegistry q;

    public CryptoTransformationRegistry U() {
        return this.q;
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.S = new ReflectionUtilityManager680(networkProtocolEncoder1013);
        this.q = networkProtocolEncoder1013.L(CryptoTransformationRegistry.class);
    }

    public CryptoKeyExchangeManager1384(ReflectionUtilityManager680 reflectionUtilityManager680, CryptoTransformationRegistry cryptoTransformationRegistry) {
        this.S = reflectionUtilityManager680;
        this.q = cryptoTransformationRegistry;
    }

    public static AbstractComputationKernel[] Q() {
        return e;
    }

    public ReflectionUtilityManager680 W() {
        return this.S;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.S.o(networkProtocolEncoder1013);
        networkProtocolEncoder1013.N(this.q);
    }

    public static void k(AbstractComputationKernel[] abstractComputationKernelArray) {
        e = abstractComputationKernelArray;
    }

    public CryptoKeyExchangeManager1384() {
    }

    static {
        if (CryptoKeyExchangeManager1384.Q() == null) {
            CryptoKeyExchangeManager1384.k(new AbstractComputationKernel[1]);
        }
    }
}

