/*
 * Decompiled with CFR 0.152.
 */
package com.version.management;

import com.data.compression.CompressionUtility1855;
import com.network.session.ConnectionSessionManager;
import com.security.crypto.CryptoContextResolver;
import java.util.Map;
import java.util.Set;

public class VersionController
extends ConnectionSessionManager {
    public boolean V(String string, int n) {
        return CryptoContextResolver.q(VersionController.U.u().g, this.H, string, n);
    }

    public Map<String, Object> P() {
        return CryptoContextResolver.A(VersionController.U.u().g, this.H);
    }

    public short Q(String string) {
        return CryptoContextResolver.o(VersionController.U.u().g, this.H, string);
    }

    public ConnectionSessionManager w(String string) {
        return new VersionController(CryptoContextResolver.V(VersionController.U.u().g, this.H, string));
    }

    public VersionController(Object object) {
        super(object);
    }

    public Set<String> V() {
        return CryptoContextResolver.A(VersionController.U.u().g, this.H).keySet();
    }

    public CompressionUtility1855 H(String string, int n) {
        return new CompressionUtility1855(CryptoContextResolver.c(VersionController.U.u().g, this.H, string, n));
    }
}

