/*
 * Decompiled with CFR 0.152.
 */
package com.game.rendering;

import a.E8;
import a.Ec;
import a.Z3;
import com.app.event.core.EventCancellationProtocol;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.math.computation.NumericComputationEngine1131;
import com.network.config.ConnectionConfigurationResolver;
import com.security.event.SecureEventOrchestrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.ExecutionStateTracker;

public abstract class GameRenderContextBridge
implements EventCancellationProtocol {
    private ConnectionConfigurationResolver d;
    private static boolean O;
    private boolean X;
    private E8 n;
    private ExecutionStateTracker U;
    private SecureEventOrchestrator q;
    private NumericComputationEngine1131 R;
    private Ec x;
    private SystemConfigurationOrchestrator A;

    public final NumericComputationEngine1131 getRenderManager() {
        try {
            if (this.R == null) {
                this.R = ApplicationLifecycleManager.r();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameRenderContextBridge.c(customSystemException);
        }
        return this.R;
    }

    public final ExecutionStateTracker getGameSettings() {
        try {
            if (this.U == null) {
                this.U = ApplicationLifecycleManager.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameRenderContextBridge.c(customSystemException);
        }
        return this.U;
    }

    public final SecureEventOrchestrator getCurrentScreen() {
        try {
            if (this.q == null) {
                this.q = ApplicationLifecycleManager.X();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameRenderContextBridge.c(customSystemException);
        }
        return this.q;
    }

    @Override
    public boolean fire() {
        Z3.s().k(this);
        return this.isCanceled();
    }

    public final SystemConfigurationOrchestrator getThePlayer() {
        try {
            if (this.A == null) {
                this.A = ApplicationLifecycleManager.U();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameRenderContextBridge.c(customSystemException);
        }
        return this.A;
    }

    public final E8 getFontRenderer() {
        try {
            if (this.n == null) {
                this.n = ApplicationLifecycleManager.X();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameRenderContextBridge.c(customSystemException);
        }
        return this.n;
    }

    public final ConnectionConfigurationResolver getWorld() {
        try {
            if (this.d == null) {
                this.d = ApplicationLifecycleManager.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameRenderContextBridge.c(customSystemException);
        }
        return this.d;
    }

    public static boolean T() {
        boolean bl = GameRenderContextBridge.R();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameRenderContextBridge.c(customSystemException);
        }
        return false;
    }

    static {
        if (!GameRenderContextBridge.T()) {
            GameRenderContextBridge.A(true);
        }
    }

    public final Ec getEntityRenderer() {
        try {
            if (this.x == null) {
                this.x = ApplicationLifecycleManager.U();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameRenderContextBridge.c(customSystemException);
        }
        return this.x;
    }

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public boolean isCanceled() {
        return this.X;
    }

    public static boolean R() {
        return O;
    }

    public static void A(boolean bl) {
        O = bl;
    }

    @Override
    public void setCanceled(boolean bl) {
        this.X = bl;
    }
}

