/*
 * Decompiled with CFR 0.152.
 */
package com.app.security;

import a.HK;
import com.app.command.CommandExecutor;
import com.app.core.ActionDispatcher;
import com.exception.system.CustomSystemException;
import com.invocation.dynamic.ParameterizedInvocationHandler;
import com.network.protocol.CommunicationProtocolNegotiator1714;
import com.reflection.metadata.ClassMetadataResolver731;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.temporal.metadata.TemporalMetadataResolver;

public class CryptographicTokenResolver
extends ClassMetadataResolver731 {
    private static String R;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static String d() {
        return R;
    }

    @Override
    public void y() {
        try {
            if (!ParameterizedInvocationHandler.Y) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTokenResolver.a(customSystemException);
        }
        HK hK = TemporalMetadataResolver.h.u().k1.J;
        this.P(hK, CommandExecutor.class, new CommunicationProtocolNegotiator1714(2).s(Object.class));
        this.l(hK, ActionDispatcher.class, new CommunicationProtocolNegotiator1714(2).s(Object.class));
    }

    static {
        if (CryptographicTokenResolver.d() == null) {
            CryptographicTokenResolver.l("L5dXH");
        }
    }

    public static void l(String string) {
        R = string;
    }

    public CryptographicTokenResolver() {
        super(ReflectionMetadataResolver.EJ);
    }
}

