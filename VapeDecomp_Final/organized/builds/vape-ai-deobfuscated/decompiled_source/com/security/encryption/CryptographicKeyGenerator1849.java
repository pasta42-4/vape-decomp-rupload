/*
 * Decompiled with CFR 0.152.
 */
package com.security.encryption;

import com.core.computation.AbstractComputationKernel;
import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;

public class CryptographicKeyGenerator1849
implements DataTransformationContract2366 {
    private static AbstractComputationKernel[] d;

    static {
        if (CryptographicKeyGenerator1849.y() == null) {
            CryptographicKeyGenerator1849.S(new AbstractComputationKernel[3]);
        }
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
    }

    public static void S(AbstractComputationKernel[] abstractComputationKernelArray) {
        d = abstractComputationKernelArray;
    }

    public static AbstractComputationKernel[] y() {
        return d;
    }
}

