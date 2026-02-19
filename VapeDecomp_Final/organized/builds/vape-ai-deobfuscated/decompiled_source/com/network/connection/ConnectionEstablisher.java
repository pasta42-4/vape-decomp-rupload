/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import a.oD;
import com.security.authentication.AuthenticationStateManager675;
import com.security.authentication.CryptographicTokenGenerator1926;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.utils.reflection.ReflectionUtilityManager;

public class ConnectionEstablisher
extends ObjectLifecycleTracker {
    public ConnectionEstablisher(Object object) {
        super(object);
    }

    public oD a() {
        return new oD(ReflectionUtilityManager.c(ConnectionEstablisher.U.u().gx, this.M()));
    }

    public int v() {
        return ReflectionUtilityManager.t(ConnectionEstablisher.U.u().gx, this.H);
    }

    public CryptographicTokenGenerator1926 B() {
        return new CryptographicTokenGenerator1926(ReflectionUtilityManager.b(ConnectionEstablisher.U.u().gx, this.H));
    }

    public AuthenticationStateManager675 w() {
        return new AuthenticationStateManager675(ReflectionUtilityManager.M(ConnectionEstablisher.U.u().gx, this.M()));
    }
}

