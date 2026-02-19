/*
 * Decompiled with CFR 0.152.
 */
package com.app.data.validation;

import com.auth.token.TokenAuthenticationHandler;
import com.system.lifecycle.ObjectLifecycleTracker;

public class DataIntegrityValidator
extends ObjectLifecycleTracker {
    public DataIntegrityValidator(Object object) {
        super(object);
    }

    public void p(String string) {
        TokenAuthenticationHandler.n(DataIntegrityValidator.U.u().d6, this.H, string);
    }

    public String a() {
        return TokenAuthenticationHandler.e(DataIntegrityValidator.U.u().d6, this.H);
    }
}

