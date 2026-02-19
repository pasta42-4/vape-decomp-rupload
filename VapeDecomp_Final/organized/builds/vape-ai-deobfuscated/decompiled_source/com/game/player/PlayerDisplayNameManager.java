/*
 * Decompiled with CFR 0.152.
 */
package com.game.player;

import a.oD;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.network.connection.ConnectionEstablisher;
import com.network.protocol.NetworkProtocolEncoder458;
import com.security.authentication.AuthenticationStateManager675;

public class PlayerDisplayNameManager
extends GameRenderContextBridge {
    private String k = null;
    private final Object J;
    private static final ConcurrentRequestTracker L = new ConcurrentRequestTracker();
    private String e = null;
    private ConnectionEstablisher m = null;
    private NetworkProtocolEncoder458 p = null;
    private final Object g;

    public static ConcurrentRequestTracker getEventListeners() {
        return L;
    }

    private String getVanillaDisplayName() {
        String string;
        try {
            if (this.e != null) {
                return this.e;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PlayerDisplayNameManager.a(customSystemException);
        }
        ConnectionEstablisher connectionEstablisher = this.getNetworkPlayerInfo();
        AuthenticationStateManager675 authenticationStateManager675 = connectionEstablisher.w();
        try {
            PlayerDisplayNameManager playerDisplayNameManager = this;
            string = authenticationStateManager675.r() ? authenticationStateManager675.i() : oD.C(connectionEstablisher.a(), connectionEstablisher.B().U());
        }
        catch (CustomSystemException customSystemException) {
            throw PlayerDisplayNameManager.a(customSystemException);
        }
        playerDisplayNameManager.e = string;
        return this.e;
    }

    public String getDisplayName() {
        try {
            if (this.k != null) {
                return this.k;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PlayerDisplayNameManager.a(customSystemException);
        }
        return this.getVanillaDisplayName();
    }

    public NetworkProtocolEncoder458 getGuiPlayerTabOverlay() {
        try {
            if (this.p == null) {
                this.p = new NetworkProtocolEncoder458(this.J);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PlayerDisplayNameManager.a(customSystemException);
        }
        return this.p;
    }

    public PlayerDisplayNameManager(Object object, Object object2) {
        this.J = object;
        this.g = object2;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ConnectionEstablisher getNetworkPlayerInfo() {
        try {
            if (this.m == null) {
                this.m = new ConnectionEstablisher(this.g);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PlayerDisplayNameManager.a(customSystemException);
        }
        return this.m;
    }

    public void setDisplayName(String string) {
        this.k = string;
        this.setCanceled(true);
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return L;
    }
}

