/*
 * Decompiled with CFR 0.152.
 */
package com.security.auth;

import a.Qh;
import com.app.concurrency.ThreadPoolConfigManager;
import com.data.transformation.DataTransformationEngine398;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.security.transform.CryptographicTransformer;

public class AuthenticationMediator
extends CryptographicTransformer {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public CryptographicTransformer M() {
        return new CryptographicTransformer(DataTransformationEngine398.s(AuthenticationMediator.U.u().g6, this.H));
    }

    public AuthenticationMediator(Object object) {
        super(object);
    }

    public boolean B() {
        return DataTransformationEngine398.X(AuthenticationMediator.U.u().g6, this.H);
    }

    public CryptographicTransformer Q() {
        try {
            if (GameVersionEnumerator.MC_1_16_5.Q()) {
                return new Qh(DataTransformationEngine398.O(AuthenticationMediator.U.u().g6, this.H));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationMediator.a(customSystemException);
        }
        return new ThreadPoolConfigManager(this.M()).L();
    }
}

