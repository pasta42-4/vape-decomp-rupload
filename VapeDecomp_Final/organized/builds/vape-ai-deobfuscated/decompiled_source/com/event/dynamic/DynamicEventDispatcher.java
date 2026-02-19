/*
 * Decompiled with CFR 0.152.
 */
package com.event.dynamic;

import com.core.computation.AbstractComputationKernel;
import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.security.registry.CryptoAlgorithmRegistry893;

public class DynamicEventDispatcher
implements DataTransformationContract2366 {
    private static AbstractComputationKernel[] n;
    private Object r;
    private CryptoAlgorithmRegistry893 x;

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.x = networkProtocolEncoder1013.L(CryptoAlgorithmRegistry893.class);
        this.r = this.x.S().apply(networkProtocolEncoder1013);
    }

    public DynamicEventDispatcher(CryptoAlgorithmRegistry893 cryptoAlgorithmRegistry893, Object object) {
        this.x = cryptoAlgorithmRegistry893;
        this.r = object;
    }

    public static AbstractComputationKernel[] f() {
        return n;
    }

    public static void z(AbstractComputationKernel[] abstractComputationKernelArray) {
        n = abstractComputationKernelArray;
    }

    public Object s() {
        return this.r;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.x);
        this.x.m().accept(networkProtocolEncoder1013, this.r);
    }

    public CryptoAlgorithmRegistry893 p() {
        return this.x;
    }

    public DynamicEventDispatcher() {
    }

    static {
        if (DynamicEventDispatcher.f() == null) {
            DynamicEventDispatcher.z(new AbstractComputationKernel[5]);
        }
    }
}

