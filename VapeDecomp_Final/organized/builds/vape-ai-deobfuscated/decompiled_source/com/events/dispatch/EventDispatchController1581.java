/*
 * Decompiled with CFR 0.152.
 */
package com.events.dispatch;

import com.data.protocol.DataProcessingProtocol;
import com.distributed.resources.DistributedResourceCoordinator;
import com.exception.system.CustomSystemException;
import com.security.configuration.SecurityEnumRegistry;
import com.security.constants.CipherConfigurationMode;
import com.ui.events.UserInteractionEventDispatcher;
import java.awt.Point;

class EventDispatchController1581
implements DataProcessingProtocol {
    final DistributedResourceCoordinator m;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    EventDispatchController1581(DistributedResourceCoordinator distributedResourceCoordinator) {
        this.m = distributedResourceCoordinator;
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        CipherConfigurationMode cipherConfigurationMode;
        int n;
        int n2;
        UserInteractionEventDispatcher userInteractionEventDispatcher;
        UserInteractionEventDispatcher userInteractionEventDispatcher2;
        DistributedResourceCoordinator distributedResourceCoordinator;
        try {
            UserInteractionEventDispatcher userInteractionEventDispatcher3;
            distributedResourceCoordinator = this.m;
            userInteractionEventDispatcher2 = userInteractionEventDispatcher3;
            userInteractionEventDispatcher = userInteractionEventDispatcher3;
            n2 = point.x;
            n = point.y;
            cipherConfigurationMode = securityEnumRegistry == SecurityEnumRegistry.LEFT_CLICK ? CipherConfigurationMode.LEFT_CLICK : (securityEnumRegistry == SecurityEnumRegistry.RIGHT_CLICK ? CipherConfigurationMode.RIGHT_CLICK : (securityEnumRegistry == SecurityEnumRegistry.MIDDLE_CLICK ? CipherConfigurationMode.MIDDLE_CLICK : CipherConfigurationMode.UNKNOWN));
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchController1581.a(customSystemException);
        }
        userInteractionEventDispatcher2(n2, n, cipherConfigurationMode);
        distributedResourceCoordinator.Z(userInteractionEventDispatcher);
    }
}

