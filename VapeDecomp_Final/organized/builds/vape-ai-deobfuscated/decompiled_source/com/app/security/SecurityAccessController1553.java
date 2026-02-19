/*
 * Decompiled with CFR 0.152.
 */
package com.app.security;

import com.app.transformation.TransformationPipelineFilter;
import com.exception.system.CustomSystemException;
import com.network.clustering.ClusterNodeRegistry1151;

public class SecurityAccessController1553
implements TransformationPipelineFilter {
    private static boolean k;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public boolean c(long l, long l2) {
        ClusterNodeRegistry1151.W().S().y();
        return false;
    }

    static {
        if (!SecurityAccessController1553.G()) {
            SecurityAccessController1553.H(true);
        }
    }

    public static void H(boolean bl) {
        k = bl;
    }

    public static boolean G() {
        return k;
    }

    public static boolean U() {
        boolean bl = SecurityAccessController1553.G();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecurityAccessController1553.a(customSystemException);
        }
        return false;
    }
}

