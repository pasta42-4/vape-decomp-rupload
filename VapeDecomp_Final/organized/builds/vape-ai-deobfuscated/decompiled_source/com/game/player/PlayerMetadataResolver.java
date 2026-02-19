/*
 * Decompiled with CFR 0.152.
 */
package com.game.player;

import a.oB;
import a.oD;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.data.streaming.DataStreamProcessor1600;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.game.rendering.GameRenderContextBridge;
import com.graphics.rendering.RenderingPipelineController;
import com.network.connection.ConnectionEstablisher;
import com.network.protocol.NetworkProtocolEncoder458;
import com.security.authentication.AuthenticationStateManager675;

public class PlayerMetadataResolver
extends GameRenderContextBridge {
    private final Object I;
    private NetworkProtocolEncoder458 m = null;
    private final Object D;
    private AuthenticationStateManager675 y = null;
    private AuthenticationStateManager675 e = null;
    private static final ConcurrentRequestTracker T = new ConcurrentRequestTracker();
    private ConnectionEstablisher u = null;

    public AuthenticationStateManager675 getDisplayName() {
        try {
            if (this.e != null) {
                return this.e;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PlayerMetadataResolver.a(customSystemException);
        }
        return this.getVanillaDisplayName();
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return T;
    }

    public NetworkProtocolEncoder458 getGuiPlayerTabOverlay() {
        try {
            if (this.m == null) {
                this.m = new NetworkProtocolEncoder458(this.D);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PlayerMetadataResolver.a(customSystemException);
        }
        return this.m;
    }

    private AuthenticationStateManager675 getVanillaDisplayName() {
        block10: {
            try {
                if (this.y != null) {
                    return this.y;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw PlayerMetadataResolver.a(customSystemException);
            }
            ConnectionEstablisher connectionEstablisher = this.getNetworkPlayerInfo();
            AuthenticationStateManager675 authenticationStateManager675 = connectionEstablisher.w();
            NetworkProtocolEncoder458 networkProtocolEncoder458 = this.getGuiPlayerTabOverlay();
            if (authenticationStateManager675.r()) {
                RenderingPipelineController renderingPipelineController;
                block9: {
                    renderingPipelineController = authenticationStateManager675.Q();
                    try {
                        if (!GameVersionEnumerator.MC_1_20_6.H()) break block9;
                        this.y = networkProtocolEncoder458.A(connectionEstablisher, new oB(renderingPipelineController.M()));
                        break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PlayerMetadataResolver.a(customSystemException);
                    }
                }
                this.y = networkProtocolEncoder458.y(connectionEstablisher, renderingPipelineController);
            } else {
                oD oD2 = connectionEstablisher.a();
                String string = connectionEstablisher.B().U();
                if (GameVersionEnumerator.MC_1_20_6.H()) {
                    oB oB2 = AuthenticationStateManager675.j(string);
                    oB oB3 = oD.P(oD2, oB2);
                    this.y = networkProtocolEncoder458.A(connectionEstablisher, oB3);
                } else {
                    DataStreamProcessor1600 dataStreamProcessor1600 = DataStreamProcessor1600.Y(string);
                    RenderingPipelineController renderingPipelineController = oD.b(oD2, dataStreamProcessor1600);
                    this.y = networkProtocolEncoder458.y(connectionEstablisher, renderingPipelineController);
                }
            }
        }
        return this.y;
    }

    public PlayerMetadataResolver(Object object, Object object2) {
        this.D = object;
        this.I = object2;
    }

    public ConnectionEstablisher getNetworkPlayerInfo() {
        try {
            if (this.u == null) {
                this.u = new ConnectionEstablisher(this.I);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PlayerMetadataResolver.a(customSystemException);
        }
        return this.u;
    }

    public void setDisplayName(AuthenticationStateManager675 authenticationStateManager675) {
        this.e = authenticationStateManager675;
        this.setCanceled(true);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return T;
    }

    public Object getDisplayNameInstance() {
        return this.getDisplayName().M();
    }

    @Override
    public boolean fire() {
        return super.fire();
    }
}

