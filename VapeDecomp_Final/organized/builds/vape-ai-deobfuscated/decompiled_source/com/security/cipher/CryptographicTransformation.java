/*
 * Decompiled with CFR 0.152.
 */
package com.security.cipher;

import com.game.configuration.GameVersionEnumerator;
import com.network.connection.ConnectionLifecycleHandler;
import com.security.context.SecurityContextManager2496;

public class CryptographicTransformation
extends ConnectionLifecycleHandler {
    public CryptographicTransformation(Object object) {
        super(object);
    }

    public int[] F() {
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            SecurityContextManager2496 securityContextManager2496 = new SecurityContextManager2496(CryptographicTransformation.U.u().GY.H(this.H));
            return securityContextManager2496.k();
        }
        return CryptographicTransformation.U.u().GY.h(this.H);
    }
}

