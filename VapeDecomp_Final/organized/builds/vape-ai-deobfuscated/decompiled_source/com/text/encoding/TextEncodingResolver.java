/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.text.encoding;

import com.data.contract.DataTransformationContract2366;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder1013;
import org.jetbrains.annotations.Nullable;

public class TextEncodingResolver
implements DataTransformationContract2366 {
    private String k;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        boolean bl;
        NetworkProtocolEncoder1013 networkProtocolEncoder10132;
        try {
            networkProtocolEncoder10132 = networkProtocolEncoder1013;
            bl = this.k != null;
        }
        catch (CustomSystemException customSystemException) {
            throw TextEncodingResolver.a(customSystemException);
        }
        try {
            networkProtocolEncoder10132.W(bl);
            if (this.k != null) {
                networkProtocolEncoder1013.J(this.k);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TextEncodingResolver.a(customSystemException);
        }
    }

    public TextEncodingResolver() {
    }

    @Nullable
    public String y() {
        return this.k;
    }

    public TextEncodingResolver(String string) {
        this.k = string;
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        try {
            if (networkProtocolEncoder1013.B()) {
                this.k = networkProtocolEncoder1013.b(255);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TextEncodingResolver.a(customSystemException);
        }
    }
}

