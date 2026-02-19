/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.identifier.management;

import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

public class UniqueIdentifierManager1303 {
    private final ReflectionUtilityManager680 P;
    private final UUID m;
    private final int s;
    private final String I;
    @Nullable
    private final String R;

    public int e() {
        return this.s;
    }

    public String w() {
        return this.I;
    }

    public UUID y() {
        return this.m;
    }

    public void P(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        boolean bl;
        NetworkProtocolEncoder1013 networkProtocolEncoder10132;
        try {
            this.P.o(networkProtocolEncoder1013);
            networkProtocolEncoder1013.i(this.m);
            networkProtocolEncoder1013.J(this.I);
            networkProtocolEncoder10132 = networkProtocolEncoder1013;
            bl = this.R != null;
        }
        catch (CustomSystemException customSystemException) {
            throw UniqueIdentifierManager1303.a(customSystemException);
        }
        try {
            networkProtocolEncoder10132.W(bl);
            if (this.R != null) {
                networkProtocolEncoder1013.J(this.R);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UniqueIdentifierManager1303.a(customSystemException);
        }
        networkProtocolEncoder1013.I(this.s);
    }

    public long I() {
        return this.P.r();
    }

    public UniqueIdentifierManager1303(ReflectionUtilityManager680 reflectionUtilityManager680, UUID uUID, String string, @Nullable String string2, int n) {
        this.P = reflectionUtilityManager680;
        this.m = uUID;
        this.I = string;
        this.R = string2;
        this.s = n;
    }

    public ReflectionUtilityManager680 G() {
        return this.P;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public String M() {
        return this.P.C();
    }

    public UniqueIdentifierManager1303(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.P = new ReflectionUtilityManager680(networkProtocolEncoder1013);
        this.m = networkProtocolEncoder1013.x();
        this.I = networkProtocolEncoder1013.b(16);
        this.R = networkProtocolEncoder1013.B() ? networkProtocolEncoder1013.b(128) : null;
        this.s = networkProtocolEncoder1013.e();
    }

    @Nullable
    public String X() {
        return this.R;
    }
}

