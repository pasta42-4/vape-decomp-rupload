/*
 * Decompiled with CFR 0.152.
 */
package com.security.validation;

import com.data.contract.DataTransformationContract2366;
import com.math.conversion.NumericTransformationEngine1112;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.security.protocol.EncryptionProtocolVariant;

public class TokenValidationService
implements DataTransformationContract2366 {
    private long p;
    private NumericTransformationEngine1112 T;
    private static String f;
    private EncryptionProtocolVariant z;

    public EncryptionProtocolVariant s() {
        return this.z;
    }

    static {
        if (TokenValidationService.D() != null) {
            TokenValidationService.e("VASlOc");
        }
    }

    public NumericTransformationEngine1112 G() {
        return this.T;
    }

    public long a() {
        return this.p;
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.z = networkProtocolEncoder1013.L(EncryptionProtocolVariant.class);
        this.p = networkProtocolEncoder1013.S();
        this.T = new NumericTransformationEngine1112(networkProtocolEncoder1013);
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.z);
        networkProtocolEncoder1013.Z(this.p);
        this.T.X(networkProtocolEncoder1013);
    }

    public TokenValidationService() {
    }

    public TokenValidationService(EncryptionProtocolVariant encryptionProtocolVariant, long l, NumericTransformationEngine1112 numericTransformationEngine1112) {
        this.z = encryptionProtocolVariant;
        this.p = l;
        this.T = numericTransformationEngine1112;
    }

    public static String D() {
        return f;
    }

    public static void e(String string) {
        f = string;
    }
}

