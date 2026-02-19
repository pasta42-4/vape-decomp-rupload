/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.transaction.core;

import com.app.context.resolver.DataContextResolver;
import com.app.correlation.management.UuidCorrelationManager;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.security.policy.SecurityPolicyDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TransactionContextBuilder
extends UuidCorrelationManager<DataContextResolver> {
    private SecurityPolicyDescriptor f;
    @Nullable
    private String C;
    private static int[] W;
    private long h;

    static {
        if (TransactionContextBuilder.f() == null) {
            TransactionContextBuilder.Y(new int[3]);
        }
    }

    public TransactionContextBuilder() {
    }

    @Nullable
    public String e() {
        return this.C;
    }

    public SecurityPolicyDescriptor E() {
        return this.f;
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.f = networkProtocolEncoder1013.L(SecurityPolicyDescriptor.class);
        this.C = networkProtocolEncoder1013.b(255);
        this.h = networkProtocolEncoder1013.S();
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.f);
        networkProtocolEncoder1013.J(this.C);
        networkProtocolEncoder1013.Z(this.h);
    }

    public TransactionContextBuilder(@Nullable DataContextResolver dataContextResolver, SecurityPolicyDescriptor securityPolicyDescriptor) {
        super(dataContextResolver);
        this.f = securityPolicyDescriptor;
    }

    public static int[] f() {
        return W;
    }

    public static void Y(int[] nArray) {
        W = nArray;
    }

    public TransactionContextBuilder(@Nullable DataContextResolver dataContextResolver, @NotNull String string) {
        this(dataContextResolver, SecurityPolicyDescriptor.SUCCESS);
        this.C = string;
        this.h = System.currentTimeMillis();
    }

    public long q() {
        return this.h;
    }
}

