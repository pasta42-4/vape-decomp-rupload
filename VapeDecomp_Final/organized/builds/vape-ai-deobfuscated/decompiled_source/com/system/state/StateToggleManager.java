/*
 * Decompiled with CFR 0.152.
 */
package com.system.state;

import a.hQ;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class StateToggleManager
extends hQ {
    private ColorPaletteRenderer L;
    private boolean b;
    private boolean V;

    public boolean V() {
        return this.b;
    }

    @Override
    public double e() {
        return 110.0;
    }

    public StateToggleManager() {
        this.L = new ColorPaletteRenderer(0.15, StateToggleManager.M.S, StateToggleManager.M.Z);
    }

    public boolean h() {
        return this.V;
    }

    @Override
    public void d() {
        block4: {
            try {
                try {
                    if (!this.b || this.s()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw StateToggleManager.a(customSystemException);
                }
                this.L.c();
                this.b = false;
            }
            catch (CustomSystemException customSystemException) {
                throw StateToggleManager.a(customSystemException);
            }
        }
    }

    public void g(boolean bl) {
        if (bl) {
            for (AbstractComputationKernel abstractComputationKernel : this.F().A()) {
                try {
                    if (!(abstractComputationKernel instanceof StateToggleManager)) continue;
                    ((StateToggleManager)abstractComputationKernel).g(false);
                }
                catch (CustomSystemException customSystemException) {
                    throw StateToggleManager.a(customSystemException);
                }
            }
        }
        this.V = bl;
    }

    @Override
    public void U() {
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ColorPaletteRenderer z() {
        return this.L;
    }

    @Override
    public void g() {
        try {
            if (!this.b) {
                this.L.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StateToggleManager.a(customSystemException);
        }
        this.b = true;
    }

    @Override
    public double z() {
        return 25.0;
    }
}

