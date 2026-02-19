/*
 * Decompiled with CFR 0.152.
 */
package com.regulatory.compliance;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;

public class ComplianceValidator
implements DataTransformationContract2366 {
    private ReflectionUtilityManager680 j;

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.j = new ReflectionUtilityManager680(networkProtocolEncoder1013);
    }

    public ComplianceValidator(ReflectionUtilityManager680 reflectionUtilityManager680) {
        this.j = reflectionUtilityManager680;
    }

    public ComplianceValidator() {
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.j.o(networkProtocolEncoder1013);
    }

    public ReflectionUtilityManager680 M() {
        return this.j;
    }
}

