/*
 * Decompiled with CFR 0.152.
 */
package com.data.streaming;

import com.core.lifecycle.ApplicationLifecycleManager;
import com.security.session.CipherSessionManager;
import com.system.configuration.ConfigurationManager;
import com.system.resource.ResourceAllocationTracker1227;
import java.awt.Color;

public class StreamProcessingHandler
extends CipherSessionManager {
    private final ResourceAllocationTracker1227 lm = new ResourceAllocationTracker1227(0, 0);

    @Override
    public double b() {
        return ApplicationLifecycleManager.b() / 2;
    }

    @Override
    public void E() {
        int n = ApplicationLifecycleManager.e();
        int n2 = ApplicationLifecycleManager.b();
        ConfigurationManager.H(0.0f, 0.0f, n, n2, new Color(0, 0, 0, 100));
        this.lm.Z(n, n2);
        int n3 = 20;
        this.lm.q(0, 0, n3, 0.0f);
    }

    @Override
    public String A() {
        return null;
    }

    @Override
    public double w() {
        return ApplicationLifecycleManager.e() / 2;
    }
}

