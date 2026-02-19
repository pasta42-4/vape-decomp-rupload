/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import com.app.security.validation.SecurityValidationService;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.connection.ConnectionLifecycleHandler;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.key.CipherKeyExchanger;
import com.system.config.AdaptiveConfigurationManager;

public class CryptographicKeyExchanger1497
extends ConnectionLifecycleHandler {
    public SecurityValidationService a() {
        return new SecurityValidationService(CipherKeyExchanger.G(CryptographicKeyExchanger1497.U.u().GH, this.H));
    }

    public CryptographicKeyExchanger1497(Object object) {
        super(object);
    }

    public AdaptiveConfigurationManager m() {
        return new AdaptiveConfigurationManager(CipherKeyExchanger.X(CryptographicKeyExchanger1497.U.u().GH, this.H));
    }

    public ReflectionUtilityBroker Z() {
        return new ReflectionUtilityBroker(CipherKeyExchanger.d(CryptographicKeyExchanger1497.U.u().GH, this.H));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int r() {
        return CipherKeyExchanger.f(CryptographicKeyExchanger1497.U.u().GH, this.H);
    }

    public boolean J() {
        boolean bl;
        if (GeometryCalculator.C() >= 15) {
            bl = this.a().equals(SecurityValidationService.W());
        } else {
            boolean bl2;
            try {
                bl2 = this.r() == 5;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicKeyExchanger1497.a(customSystemException);
            }
            bl = bl2;
        }
        return bl;
    }
}

