/*
 * Decompiled with CFR 0.152.
 */
package com.app.context.resolver;

import com.app.correlation.management.UuidCorrelationManager;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;
import com.transaction.core.TransactionContextBuilder;

public class DataContextResolver
extends UuidCorrelationManager<TransactionContextBuilder> {
    private String E;
    private long u;
    private static int J;

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.u = networkProtocolEncoder1013.S();
        this.E = networkProtocolEncoder1013.b(255);
    }

    static {
        if (DataContextResolver.N() == 0) {
            DataContextResolver.t(58);
        }
    }

    public static int N() {
        return J;
    }

    public static int O() {
        int n = DataContextResolver.N();
        try {
            if (n == 0) {
                return 65;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataContextResolver.a(customSystemException);
        }
        return 0;
    }

    public DataContextResolver(ReflectionUtilityManager680 reflectionUtilityManager680, String string) {
        this.u = reflectionUtilityManager680.r();
        this.E = string;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public long i() {
        return this.u;
    }

    public DataContextResolver() {
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.Z(this.u);
        networkProtocolEncoder1013.J(this.E);
    }

    public static void t(int n) {
        J = n;
    }

    public String f() {
        return this.E;
    }
}

