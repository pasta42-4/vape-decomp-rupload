/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.security.authentication;

import com.data.contract.DataTransformationContract2366;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;
import org.jetbrains.annotations.Nullable;

public class AuthenticationTokenGenerator1331
implements DataTransformationContract2366 {
    private long G;
    private String W;

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        try {
            this.G = networkProtocolEncoder1013.S();
            if (networkProtocolEncoder1013.B()) {
                this.W = networkProtocolEncoder1013.b(128);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationTokenGenerator1331.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public long V() {
        return this.G;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        boolean bl;
        NetworkProtocolEncoder1013 networkProtocolEncoder10132;
        try {
            networkProtocolEncoder1013.Z(this.G);
            networkProtocolEncoder10132 = networkProtocolEncoder1013;
            bl = this.W != null;
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationTokenGenerator1331.a(customSystemException);
        }
        try {
            networkProtocolEncoder10132.W(bl);
            if (this.W != null) {
                networkProtocolEncoder1013.J(this.W);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationTokenGenerator1331.a(customSystemException);
        }
    }

    public AuthenticationTokenGenerator1331(ReflectionUtilityManager680 reflectionUtilityManager680, String string) {
        this.G = reflectionUtilityManager680.r();
        this.W = string;
    }

    @Nullable
    public String h() {
        return this.W;
    }

    public AuthenticationTokenGenerator1331() {
    }
}

