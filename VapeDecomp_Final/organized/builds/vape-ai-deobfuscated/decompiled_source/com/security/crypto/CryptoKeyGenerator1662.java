/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import com.network.connection.NetworkEndpointIdentifier;
import com.reflection.utils.ReflectionUtilityManager680;
import com.temporal.metadata.TemporalMetadataResolver;
import com.user.identity.UserIdentityManager;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CryptoKeyGenerator1662 {
    private final UserIdentityManager A;
    private static String M;
    private final long J;

    public static void z(String string) {
        M = string;
    }

    public UserIdentityManager s() {
        return this.A;
    }

    private static UserIdentityManager lambda$new$0(ReflectionUtilityManager680 reflectionUtilityManager680) {
        return new UserIdentityManager(reflectionUtilityManager680);
    }

    public static String H() {
        return M;
    }

    public long s() {
        return this.J;
    }

    CryptoKeyGenerator1662(NetworkEndpointIdentifier networkEndpointIdentifier, boolean bl) {
        this.J = networkEndpointIdentifier.v();
        ReflectionUtilityManager680 reflectionUtilityManager680 = bl ? networkEndpointIdentifier.P() : networkEndpointIdentifier.Q();
        this.A = TemporalMetadataResolver.h.O().t().O(reflectionUtilityManager680.r(), () -> CryptoKeyGenerator1662.lambda$new$0(reflectionUtilityManager680));
    }

    static {
        if (CryptoKeyGenerator1662.H() == null) {
            CryptoKeyGenerator1662.z("T7DWnb");
        }
    }
}

