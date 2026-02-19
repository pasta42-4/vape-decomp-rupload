/*
 * Decompiled with CFR 0.152.
 */
package com.stream.synchronization;

import com.app.security.registry.SecureResourceRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.exception.system.CustomSystemException;
import com.game.player.PlayerDisplayNameManager;
import com.game.player.events.PlayerEventManager;
import com.messaging.core.MessageRoutingEngine1898;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.authentication.AuthenticationStateManager675;
import com.security.crypto.CryptographicContextManager895;
import com.system.lifecycle.ResourceLifecycleManager1984;
import java.util.HashSet;
import java.util.Set;

public final class StreamSynchronizer
extends SecureResourceRegistry {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090
    public void q(PlayerEventManager playerEventManager) {
        AuthenticationStateManager675 authenticationStateManager675;
        block16: {
            block15: {
                try {
                    block14: {
                        try {
                            try {
                                if (!this.a() || !this.H()) break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StreamSynchronizer.a(customSystemException);
                            }
                            if (this.B()) break block15;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StreamSynchronizer.a(customSystemException);
                        }
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamSynchronizer.a(customSystemException);
                }
            }
            authenticationStateManager675 = playerEventManager.getDisplayName();
            try {
                try {
                    if (!authenticationStateManager675.Y() && authenticationStateManager675.B(ReflectionMetadataResolver.Fk)) break block16;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamSynchronizer.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw StreamSynchronizer.a(customSystemException);
            }
        }
        ResourceLifecycleManager1984 resourceLifecycleManager1984 = new ResourceLifecycleManager1984(authenticationStateManager675.M());
        this.O(resourceLifecycleManager1984);
        for (AuthenticationStateManager675 authenticationStateManager6752 : resourceLifecycleManager1984.F()) {
            if (authenticationStateManager6752.Y()) continue;
            try {
                if (!authenticationStateManager6752.B(ReflectionMetadataResolver.Fk)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw StreamSynchronizer.a(customSystemException);
            }
            ResourceLifecycleManager1984 resourceLifecycleManager19842 = new ResourceLifecycleManager1984(authenticationStateManager6752.M());
            this.O(resourceLifecycleManager19842);
        }
    }

    private void O(AuthenticationStateManager675 authenticationStateManager675) {
        Set<ResourceLifecycleManager1984> set = this.P(authenticationStateManager675, new HashSet<ResourceLifecycleManager1984>());
        for (ResourceLifecycleManager1984 resourceLifecycleManager1984 : set) {
            String string = resourceLifecycleManager1984.h();
            String string2 = this.t(string, this.p());
            try {
                try {
                    if (string2 == null || string.equalsIgnoreCase(string2)) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamSynchronizer.a(customSystemException);
                }
                resourceLifecycleManager1984.j(string2);
            }
            catch (CustomSystemException customSystemException) {
                throw StreamSynchronizer.a(customSystemException);
            }
        }
    }

    private Set<ResourceLifecycleManager1984> P(AuthenticationStateManager675 authenticationStateManager675, Set<ResourceLifecycleManager1984> set) {
        if (authenticationStateManager675.B(ReflectionMetadataResolver.EY)) {
            CryptographicContextManager895 cryptographicContextManager895 = new CryptographicContextManager895(authenticationStateManager675.M());
            for (Object object : cryptographicContextManager895.P()) {
                AuthenticationStateManager675 authenticationStateManager6752 = new AuthenticationStateManager675(object);
                if (authenticationStateManager6752.Y()) continue;
                try {
                    if (!authenticationStateManager6752.B(ReflectionMetadataResolver.V_)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamSynchronizer.a(customSystemException);
                }
                this.P(authenticationStateManager6752, set);
            }
        }
        for (AuthenticationStateManager675 authenticationStateManager6753 : authenticationStateManager675.F()) {
            Object object;
            if (authenticationStateManager6753.Y()) continue;
            try {
                if (!authenticationStateManager6753.B(ReflectionMetadataResolver.Fk)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw StreamSynchronizer.a(customSystemException);
            }
            object = new ResourceLifecycleManager1984(authenticationStateManager6753.M());
            this.P((AuthenticationStateManager675)object, set);
        }
        try {
            if (authenticationStateManager675.B(ReflectionMetadataResolver.Fk)) {
                set.add(new ResourceLifecycleManager1984(authenticationStateManager675.M()));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamSynchronizer.a(customSystemException);
        }
        return set;
    }

    @DataExchangeProtocol2090
    public void b(PlayerDisplayNameManager playerDisplayNameManager) {
        block12: {
            block11: {
                try {
                    block10: {
                        try {
                            try {
                                if (!this.a() || !this.H()) break block10;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StreamSynchronizer.a(customSystemException);
                            }
                            if (this.B()) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StreamSynchronizer.a(customSystemException);
                        }
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamSynchronizer.a(customSystemException);
                }
            }
            String string = playerDisplayNameManager.getDisplayName();
            String string2 = this.t(string, this.p());
            try {
                try {
                    if (string2 == null || string.equalsIgnoreCase(string2)) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamSynchronizer.a(customSystemException);
                }
                playerDisplayNameManager.setDisplayName(string2);
            }
            catch (CustomSystemException customSystemException) {
                throw StreamSynchronizer.a(customSystemException);
            }
        }
    }

    @DataExchangeProtocol2090
    public void X(MessageRoutingEngine1898 messageRoutingEngine1898) {
        block4: {
            try {
                try {
                    if (this.H() && this.B()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamSynchronizer.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw StreamSynchronizer.a(customSystemException);
            }
        }
        this.O(messageRoutingEngine1898.getMessage());
    }
}

