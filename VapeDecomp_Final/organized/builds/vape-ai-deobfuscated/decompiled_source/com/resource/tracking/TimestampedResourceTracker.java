/*
 * Decompiled with CFR 0.152.
 */
package com.resource.tracking;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;

public class TimestampedResourceTracker
implements DataTransformationContract2366 {
    private long q;
    private String s;

    public TimestampedResourceTracker(ReflectionUtilityManager680 reflectionUtilityManager680, String string) {
        this.q = reflectionUtilityManager680.r();
        this.s = string;
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.q = networkProtocolEncoder1013.S();
        this.s = networkProtocolEncoder1013.b(16);
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.Z(this.q);
        networkProtocolEncoder1013.J(this.s);
    }

    public String G() {
        return this.s;
    }

    public long N() {
        return this.q;
    }

    public TimestampedResourceTracker() {
    }
}

