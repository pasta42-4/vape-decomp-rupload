/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a.Yw;
import com.security.session.CryptographicSessionManager;

public class CommunicationProtocolHandler1966 {
    private final CryptographicSessionManager I;
    private final boolean h;
    private final CryptographicSessionManager a;
    private final Yw S;

    public CryptographicSessionManager L() {
        return this.I;
    }

    public boolean T() {
        return this.h;
    }

    public Yw y() {
        return this.S;
    }

    public CryptographicSessionManager M() {
        return this.a;
    }

    public CommunicationProtocolHandler1966(Yw yw, CryptographicSessionManager cryptographicSessionManager, CryptographicSessionManager cryptographicSessionManager2, boolean bl) {
        this.S = yw;
        this.a = cryptographicSessionManager;
        this.I = cryptographicSessionManager2;
        this.h = bl;
    }
}

