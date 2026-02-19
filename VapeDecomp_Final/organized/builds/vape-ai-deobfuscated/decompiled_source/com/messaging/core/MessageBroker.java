/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.core;

import com.app.licensing.LicenseValidationService;
import com.exception.system.CustomSystemException;
import com.network.serialization.JsonTransmissionCodec;
import com.security.session.CryptoSessionManager967;
import com.serialization.json.JsonSerializationOrchestrator;

public class MessageBroker {
    private static int[] t;
    private LicenseValidationService L;
    private String g;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void s(int[] nArray) {
        t = nArray;
    }

    static {
        if (MessageBroker.q() != null) {
            MessageBroker.s(new int[4]);
        }
    }

    public LicenseValidationService c(String string) {
        try {
            this.L = new JsonTransmissionCodec().a(string);
            if (this.L != null) {
                this.g = string;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MessageBroker.a(customSystemException);
        }
        return this.L;
    }

    public LicenseValidationService J() {
        return this.L;
    }

    public CryptoSessionManager967 V() {
        try {
            if (this.g == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MessageBroker.a(customSystemException);
        }
        return new JsonSerializationOrchestrator().m(this.g);
    }

    public static int[] q() {
        return t;
    }
}

