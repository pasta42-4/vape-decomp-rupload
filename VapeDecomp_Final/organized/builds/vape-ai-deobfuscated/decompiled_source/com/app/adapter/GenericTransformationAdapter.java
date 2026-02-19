/*
 * Decompiled with CFR 0.152.
 */
package com.app.adapter;

import com.app.correlation.management.UuidCorrelationManager;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;
import com.user.identity.UserProfileIdentifier;

public class GenericTransformationAdapter
extends UuidCorrelationManager<UserProfileIdentifier> {
    private ReflectionUtilityManager680 D;

    public GenericTransformationAdapter(UserProfileIdentifier userProfileIdentifier) {
        super(userProfileIdentifier);
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.e(1);
        this.D.o(networkProtocolEncoder1013);
    }

    public GenericTransformationAdapter(UserProfileIdentifier userProfileIdentifier, ReflectionUtilityManager680 reflectionUtilityManager680) {
        this(userProfileIdentifier);
        this.D = reflectionUtilityManager680;
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        int n = networkProtocolEncoder1013.U();
        this.D = new ReflectionUtilityManager680(networkProtocolEncoder1013);
    }

    public GenericTransformationAdapter() {
    }

    public ReflectionUtilityManager680 V() {
        return this.D;
    }
}

