/*
 * Decompiled with CFR 0.152.
 */
package com.game.core;

import a.wz;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.security.crypto.CryptographicKeyManager1611;
import com.system.configuration.ConfigurationProfileManager;
import com.system.resources.SystemResourceAllocator902;
import com.ui.theme.ApplicationColorSchemeManager;
import com.user.identity.UserIdentityManager;

public class GameStateManager
extends GraphicalRenderEngine1082 {
    private boolean Xn = false;
    private final UserIdentityManager XX;
    private final ConfigurationProfileManager X2;
    private final wz Xb;
    private SystemResourceAllocator902 XY;

    public wz S() {
        return this.Xb;
    }

    public void Z() {
        this.Xn = false;
        this.J(this.XY);
        this.o(this.Xb);
        this.h(true);
    }

    public SystemResourceAllocator902 C() {
        return this.XY;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void O() {
        this.Xn = true;
        this.J(this.Xb);
        this.o(this.XY);
        this.h(true);
    }

    @Override
    public double z() {
        double d2;
        try {
            d2 = this.Xn ? this.XY.b() : this.Xb.b();
        }
        catch (CustomSystemException customSystemException) {
            throw GameStateManager.a(customSystemException);
        }
        return d2;
    }

    public GameStateManager(ConfigurationProfileManager configurationProfileManager, UserIdentityManager userIdentityManager) {
        super(99.0, configurationProfileManager.b());
        this.XX = userIdentityManager;
        this.Xb = new wz(userIdentityManager);
        this.X2 = configurationProfileManager;
        this.XY = new SystemResourceAllocator902(new CryptographicKeyManager1611(userIdentityManager));
        this.i(false);
        this.o(this.Xb);
    }

    @Override
    public void E() {
        block3: {
            block2: {
                try {
                    super.E();
                    if (this.XX.h() != ApplicationColorSchemeManager.ONLINE) break block2;
                    this.XY.h().q(true);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw GameStateManager.a(customSystemException);
                }
            }
            this.XY.h().q(false);
        }
    }
}

