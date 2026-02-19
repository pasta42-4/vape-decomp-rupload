/*
 * Decompiled with CFR 0.152.
 */
package com.logging.interceptor;

import com.data.sync.DataSynchronizationContract;
import com.exception.system.CustomSystemException;
import com.runtime.context.LightweightExecutionContext;
import com.security.context.ReplicableSecurityContext;
import java.util.List;

public abstract class LoggingInterceptor
implements DataSynchronizationContract {
    protected String g;
    private static int A;

    @Override
    public boolean h(LightweightExecutionContext lightweightExecutionContext) {
        List<ReplicableSecurityContext> list = this.E();
        try {
            if (list.isEmpty()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw LoggingInterceptor.a(customSystemException);
        }
        for (ReplicableSecurityContext replicableSecurityContext : list) {
            try {
                if (!replicableSecurityContext.k(lightweightExecutionContext)) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw LoggingInterceptor.a(customSystemException);
            }
        }
        return false;
    }

    public LoggingInterceptor(String string) {
        this.g = string;
    }

    public static void w(int n) {
        A = n;
    }

    static {
        if (LoggingInterceptor.D() != 0) {
            LoggingInterceptor.w(94);
        }
    }

    public static int D() {
        int n = LoggingInterceptor.F();
        try {
            if (n == 0) {
                return 48;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw LoggingInterceptor.a(customSystemException);
        }
        return 0;
    }

    @Override
    public String O() {
        return this.g;
    }

    public static int F() {
        return A;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

