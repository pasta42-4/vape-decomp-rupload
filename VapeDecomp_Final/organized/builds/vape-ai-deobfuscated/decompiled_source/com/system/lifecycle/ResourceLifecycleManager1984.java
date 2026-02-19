/*
 * Decompiled with CFR 0.152.
 */
package com.system.lifecycle;

import com.security.authentication.AuthenticationStateManager675;
import com.system.resource.SystemResourceMediator;

public class ResourceLifecycleManager1984
extends AuthenticationStateManager675 {
    public String h() {
        return SystemResourceMediator.f(ResourceLifecycleManager1984.U.u().dv, this.M());
    }

    public static ResourceLifecycleManager1984 z(String string) {
        return new ResourceLifecycleManager1984(SystemResourceMediator.e(ResourceLifecycleManager1984.U.u().dv, string));
    }

    public void j(String string) {
        SystemResourceMediator.E(ResourceLifecycleManager1984.U.u().dv, this.M(), string);
    }

    public ResourceLifecycleManager1984(Object object) {
        super(object);
    }
}

