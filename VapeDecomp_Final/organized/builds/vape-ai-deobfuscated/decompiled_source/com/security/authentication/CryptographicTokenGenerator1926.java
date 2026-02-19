/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import a.vh;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.UUID;

public class CryptographicTokenGenerator1926
extends ObjectLifecycleTracker {
    public static CryptographicTokenGenerator1926 o(UUID uUID, String string) {
        return new CryptographicTokenGenerator1926(vh.L(CryptographicTokenGenerator1926.U.u().gg, uUID, string));
    }

    public UUID o() {
        return vh.p(CryptographicTokenGenerator1926.U.u().gg, this.H);
    }

    public String U() {
        return vh.d(CryptographicTokenGenerator1926.U.u().gg, this.H);
    }

    public void f(String string) {
        vh.r(CryptographicTokenGenerator1926.U.u().gg).L(this.H, string);
    }

    public CryptographicTokenGenerator1926(Object object) {
        super(object);
    }
}

