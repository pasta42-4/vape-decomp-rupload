/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.encoding.protocol.EncodingProtocolEnum;
import com.entity.event.EntityEventMediator;
import com.exception.system.CustomSystemException;
import com.network.config.ConnectionConfigurationResolver;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.token.SecurityTokenGenerator2074;
import com.security.transform.CryptographicTransformer;

public class NetworkProtocolHandler1347
implements NetworkConfigurationResolver2717 {
    private static int[] g;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static {
        if (NetworkProtocolHandler1347.d() == null) {
            NetworkProtocolHandler1347.O(new int[2]);
        }
    }

    public static void O(int[] nArray) {
        g = nArray;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOW)
    public void z(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        try {
            if (!networkPacketOrchestrator1222.getPacket().B(ReflectionMetadataResolver.ET)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolHandler1347.a(customSystemException);
        }
        SecurityTokenGenerator2074 securityTokenGenerator2074 = new SecurityTokenGenerator2074(networkPacketOrchestrator1222.getPacket().M());
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        try {
            if (connectionConfigurationResolver.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolHandler1347.a(customSystemException);
        }
        CryptographicTransformer cryptographicTransformer = connectionConfigurationResolver.I(securityTokenGenerator2074.s());
        try {
            if (cryptographicTransformer.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolHandler1347.a(customSystemException);
        }
        new EntityEventMediator(cryptographicTransformer).fire();
    }

    public static int[] d() {
        return g;
    }
}

