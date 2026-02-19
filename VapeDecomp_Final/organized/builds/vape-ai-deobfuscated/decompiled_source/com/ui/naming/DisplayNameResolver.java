/*
 * Decompiled with CFR 0.152.
 */
package com.ui.naming;

import a.Qh;
import com.app.events.EventTriggeringMechanism;
import com.exception.system.CustomSystemException;
import com.game.player.events.PlayerEventManager;
import com.security.authentication.AuthenticationStateManager675;
import com.system.execution.ConditionalExecutionManager;

public class DisplayNameResolver
implements EventTriggeringMechanism {
    private final Object X;
    private AuthenticationStateManager675 Y;
    public static boolean f = false;

    private AuthenticationStateManager675 grabDisplayName(Qh qh) {
        f = true;
        AuthenticationStateManager675 authenticationStateManager675 = ConditionalExecutionManager.m(qh);
        f = false;
        return authenticationStateManager675;
    }

    public Object getRawDisplayName() {
        return this.Y.M();
    }

    @Override
    public boolean fire() {
        block6: {
            Qh qh;
            block5: {
                try {
                    if (f) {
                        f = false;
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DisplayNameResolver.a(customSystemException);
                }
                qh = new Qh(this.X);
                AuthenticationStateManager675 authenticationStateManager675 = ConditionalExecutionManager.i(qh);
                try {
                    if (authenticationStateManager675 == null) break block5;
                    this.Y = authenticationStateManager675;
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw DisplayNameResolver.a(customSystemException);
                }
            }
            AuthenticationStateManager675 authenticationStateManager675 = this.grabDisplayName(qh);
            this.Y = new AuthenticationStateManager675(authenticationStateManager675);
            PlayerEventManager playerEventManager = new PlayerEventManager(qh, this.Y);
            playerEventManager.fire();
            this.Y = playerEventManager.getDisplayName();
            ConditionalExecutionManager.U(qh, this.Y);
        }
        return true;
    }

    public DisplayNameResolver(Object object) {
        this.X = object;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public AuthenticationStateManager675 getDisplayName() {
        return this.Y;
    }
}

