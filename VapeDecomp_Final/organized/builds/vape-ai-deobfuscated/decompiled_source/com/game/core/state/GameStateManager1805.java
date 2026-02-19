/*
 * Decompiled with CFR 0.152.
 */
package com.game.core.state;

import a.Cv;
import com.graphics.color.ColorCompositionEngine;
import com.system.configuration.ConfigurationManager;

public class GameStateManager1805
extends Cv {
    private int E = 0;

    public int j() {
        return this.E;
    }

    public void v(int n) {
        this.E = n;
    }

    @Override
    public void S() {
        super.S();
        ConfigurationManager.o(this.G(), this.W(), this.w(), this.b(), new ColorCompositionEngine(GameStateManager1805.M.n).I(this.E), false, 1.0f, 1.0f);
    }
}

