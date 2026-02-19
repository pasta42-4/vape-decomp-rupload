/*
 * Decompiled with CFR 0.152.
 */
package com.security.auth;

import com.app.transformation.TransformationPipelineFilter;
import com.configuration.management.ConfigurationParameterResolver;
import com.exception.system.CustomSystemException;
import com.network.clustering.ClusterNodeRegistry1151;

public class AuthenticationValidator
implements TransformationPipelineFilter {
    private static boolean P;

    public static boolean I() {
        boolean bl = AuthenticationValidator.c();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationValidator.a(customSystemException);
        }
        return false;
    }

    public static void k(boolean bl) {
        P = bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public boolean c(long l, long l2) {
        return ClusterNodeRegistry1151.W().Y().g(ConfigurationParameterResolver.R(l), false);
    }

    static {
        if (AuthenticationValidator.c()) {
            AuthenticationValidator.k(true);
        }
    }

    public static boolean c() {
        return P;
    }
}

