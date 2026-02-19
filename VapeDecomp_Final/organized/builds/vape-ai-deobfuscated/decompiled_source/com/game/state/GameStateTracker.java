/*
 * Decompiled with CFR 0.152.
 */
package com.game.state;

import a.Bj;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.network.protocol.ProtocolInteractionController;
import com.runtime.context.LightweightExecutionContext;
import com.security.auth.AuthenticationTokenGenerator268;
import com.security.authorization.AuthorizationStateManager;

public class GameStateTracker
extends AuthenticationTokenGenerator268 {
    private static int o;

    public static void d(int n) {
        o = n;
    }

    public GameStateTracker(String string) {
        super(string);
    }

    static int S(GameStateTracker gameStateTracker) {
        return gameStateTracker.I();
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    static {
        if (GameStateTracker.S() != 0) {
            GameStateTracker.d(16);
        }
    }

    public static int E() {
        int n = GameStateTracker.S();
        try {
            if (n == 0) {
                return 121;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameStateTracker.b(customSystemException);
        }
        return 0;
    }

    public static int S() {
        return o;
    }

    private int I() {
        try {
            for (int i = 0; i < 9; ++i) {
                LightweightExecutionContext lightweightExecutionContext = ApplicationLifecycleManager.U().l().F(i);
                try {
                    if (lightweightExecutionContext.M() == null) {
                        continue;
                    }
                }
                catch (Exception exception) {
                    throw GameStateTracker.b(exception);
                }
                try {
                    if (lightweightExecutionContext.C().M() == null) {
                        continue;
                    }
                }
                catch (Exception exception) {
                    throw GameStateTracker.b(exception);
                }
                if (String.valueOf(ProtocolInteractionController.l(lightweightExecutionContext.C())).equals(this.w())) {
                    return i;
                }
                try {
                    if (!lightweightExecutionContext.g().equalsIgnoreCase(this.w()) && !lightweightExecutionContext.C().m(lightweightExecutionContext).equalsIgnoreCase(this.w())) continue;
                }
                catch (Exception exception) {
                    throw GameStateTracker.b(exception);
                }
                return i;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return -1;
    }

    @Override
    public Bj K() {
        int n = this.I();
        try {
            if (n == -1) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameStateTracker.b(customSystemException);
        }
        return new AuthorizationStateManager(this);
    }
}

