/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;

public class ResourceAllocator1778
implements DataTransformationContract2366 {
    private ReflectionUtilityManager680 q;

    public ResourceAllocator1778(ReflectionUtilityManager680 reflectionUtilityManager680) {
        this.q = reflectionUtilityManager680;
    }

    public ReflectionUtilityManager680 P() {
        return this.q;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.q.o(networkProtocolEncoder1013);
    }

    public ResourceAllocator1778() {
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.q = new ReflectionUtilityManager680(networkProtocolEncoder1013);
    }
}

