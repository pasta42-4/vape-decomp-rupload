/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import com.data.compression.DataCompressionManager;
import com.multimedia.codec.MultimediaCodecOrchestrator;
import com.system.lifecycle.ObjectLifecycleTracker;

public class AuthenticationTokenResolver2380
extends ObjectLifecycleTracker {
    public AuthenticationTokenResolver2380(Object object) {
        super(object);
    }

    public static DataCompressionManager h() {
        return new DataCompressionManager(MultimediaCodecOrchestrator.D(AuthenticationTokenResolver2380.U.u().GJ));
    }
}

