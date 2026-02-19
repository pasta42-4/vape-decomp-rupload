/*
 * Decompiled with CFR 0.152.
 */
package com.validation.temporal;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;

public class TimeBasedValidator
implements DataTransformationContract2366 {
    private int b;
    private long K;

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.Z(this.K);
        networkProtocolEncoder1013.I(this.b);
    }

    public TimeBasedValidator(ReflectionUtilityManager680 reflectionUtilityManager680, int n) {
        this.K = reflectionUtilityManager680.r();
        this.b = n;
    }

    public TimeBasedValidator() {
    }

    public long s() {
        return this.K;
    }

    public int C() {
        return this.b;
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.K = networkProtocolEncoder1013.S();
        this.b = networkProtocolEncoder1013.e();
    }
}

