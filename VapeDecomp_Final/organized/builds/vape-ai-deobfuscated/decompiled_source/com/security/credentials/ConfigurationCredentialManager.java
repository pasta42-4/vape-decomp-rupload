/*
 * Decompiled with CFR 0.152.
 */
package com.security.credentials;

import com.app.notification.core.NotificationDispatchInterface;

public class ConfigurationCredentialManager
implements NotificationDispatchInterface {
    private String r;
    private String Q;
    private String A;
    private String a;

    public void y(String string) {
        this.A = string;
    }

    @Override
    public String o() {
        return this.a;
    }

    public String B() {
        return this.A;
    }

    public ConfigurationCredentialManager(String string, String string2) {
        this.a = string;
        this.r = string2;
    }

    @Override
    public String N() {
        return this.r;
    }

    public void g(String string) {
        this.Q = string;
    }

    public String A() {
        return this.Q;
    }
}

