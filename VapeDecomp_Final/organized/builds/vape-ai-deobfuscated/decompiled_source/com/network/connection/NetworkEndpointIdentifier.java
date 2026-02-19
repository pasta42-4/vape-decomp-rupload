/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;

public class NetworkEndpointIdentifier {
    private final ReflectionUtilityManager680 K;
    private final ReflectionUtilityManager680 F;
    private final long v;

    public NetworkEndpointIdentifier(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.v = networkProtocolEncoder1013.S();
        this.F = new ReflectionUtilityManager680(networkProtocolEncoder1013);
        this.K = new ReflectionUtilityManager680(networkProtocolEncoder1013);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ReflectionUtilityManager680 P() {
        return this.F;
    }

    public void p(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.Z(this.v);
        this.F.o(networkProtocolEncoder1013);
        this.K.o(networkProtocolEncoder1013);
    }

    public int hashCode() {
        return (int)(this.v ^ this.v >>> 32);
    }

    public long v() {
        return this.v;
    }

    public boolean equals(Object object) {
        boolean bl;
        block9: {
            try {
                if (this == object) {
                    return true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkEndpointIdentifier.a(customSystemException);
            }
            try {
                try {
                    if (object != null && this.getClass() == object.getClass()) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkEndpointIdentifier.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkEndpointIdentifier.a(customSystemException);
            }
        }
        NetworkEndpointIdentifier networkEndpointIdentifier = (NetworkEndpointIdentifier)object;
        try {
            bl = this.v == networkEndpointIdentifier.v;
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkEndpointIdentifier.a(customSystemException);
        }
        return bl;
    }

    public ReflectionUtilityManager680 Q() {
        return this.K;
    }

    public NetworkEndpointIdentifier(long l, ReflectionUtilityManager680 reflectionUtilityManager680, ReflectionUtilityManager680 reflectionUtilityManager6802) {
        this.v = l;
        this.F = reflectionUtilityManager680;
        this.K = reflectionUtilityManager6802;
    }
}

