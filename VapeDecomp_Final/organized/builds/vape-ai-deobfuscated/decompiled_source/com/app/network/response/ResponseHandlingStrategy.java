/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Nullable
 */
package com.app.network.response;

import com.google.gson.JsonObject;
import com.security.context.ReplicableSecurityContext;
import com.security.session.CryptographicSessionManager;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

public class ResponseHandlingStrategy
extends CryptographicSessionManager {
    public ResponseHandlingStrategy(JsonObject jsonObject) {
        super(jsonObject);
    }

    public ResponseHandlingStrategy R() {
        ResponseHandlingStrategy responseHandlingStrategy = new ResponseHandlingStrategy(this.u(), this.O());
        for (ReplicableSecurityContext replicableSecurityContext : this.E()) {
            responseHandlingStrategy.B(replicableSecurityContext.L());
        }
        return responseHandlingStrategy;
    }

    public ResponseHandlingStrategy(@Nullable UUID uUID, String string) {
        super(uUID, string);
    }

    public ResponseHandlingStrategy(CryptographicSessionManager cryptographicSessionManager) {
        super(cryptographicSessionManager.t());
        this.q = UUID.randomUUID();
    }
}

