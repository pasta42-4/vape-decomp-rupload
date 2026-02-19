/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import a.zI;
import com.deobfuscation.bytecode.BytecodeTransformer;
import com.exception.system.CustomSystemException;
import com.identifier.management.UniqueIdentifierManager1303;
import com.network.protocol.NetworkPacketInterceptor;
import com.system.configuration.SystemConfigurationProfile;

public class ResourceAllocationTracker1589
extends BytecodeTransformer {
    private final UniqueIdentifierManager1303 J;
    private final zI E;
    private static boolean f;

    public UniqueIdentifierManager1303 p() {
        return this.J;
    }

    public zI m() {
        return this.E;
    }

    public ResourceAllocationTracker1589(NetworkPacketInterceptor networkPacketInterceptor, UniqueIdentifierManager1303 uniqueIdentifierManager1303, SystemConfigurationProfile systemConfigurationProfile) {
        super(networkPacketInterceptor);
        this.J = uniqueIdentifierManager1303;
        this.E = zI.G(systemConfigurationProfile);
    }

    public static boolean Q() {
        return f;
    }

    static {
        if (ResourceAllocationTracker1589.q()) {
            ResourceAllocationTracker1589.n(true);
        }
    }

    public static void n(boolean bl) {
        f = bl;
    }

    public static boolean q() {
        boolean bl = ResourceAllocationTracker1589.Q();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker1589.a(customSystemException);
        }
        return false;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

