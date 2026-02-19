/*
 * Decompiled with CFR 0.152.
 */
package com.security.validation;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;

public class TimestampValidator1519
implements DataTransformationContract2366 {
    private long t;
    private boolean p;

    public TimestampValidator1519(ReflectionUtilityManager680 reflectionUtilityManager680, boolean bl) {
        this.t = reflectionUtilityManager680.r();
        this.p = bl;
    }

    public long I() {
        return this.t;
    }

    public TimestampValidator1519() {
    }

    public boolean T() {
        return this.p;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.Z(this.t);
        networkProtocolEncoder1013.W(this.p);
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.t = networkProtocolEncoder1013.S();
        this.p = networkProtocolEncoder1013.B();
    }
}

