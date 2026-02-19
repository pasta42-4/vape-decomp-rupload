/*
 * Decompiled with CFR 0.152.
 */
package com.ui.theme;

import com.app.workflow.StateTrackingCoordinator;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.ui.events.UserInteractionEventDispatcher;
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UserInterfaceThemeManager
extends AbstractComputationKernel {
    private Color Y;
    private final float V;
    private boolean R;
    private static boolean E;
    private final float L;
    private String B;

    public boolean L() {
        return this.R;
    }

    public void b(boolean bl) {
        this.R = bl;
    }

    public Color F() {
        return this.Y;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    @Override
    public double e() {
        return this.V;
    }

    @Override
    public void U() {
    }

    public UserInterfaceThemeManager(String string, float f, float f2, Color color) {
        this.B = string;
        this.V = f;
        this.L = f2;
        this.Y = color;
    }

    public void t(Color color) {
        this.Y = color;
    }

    public void B(String string) {
        this.B = string;
    }

    @Override
    public void g() {
    }

    @Override
    public void G() {
        float f;
        float f2;
        Color color;
        try {
            color = this.Y;
            f2 = this.R ? (float)((int)this.G()) : (float)this.G();
        }
        catch (CustomSystemException customSystemException) {
            throw UserInterfaceThemeManager.a(customSystemException);
        }
        try {
            f = this.R ? (float)((int)this.W()) : (float)this.W();
        }
        catch (CustomSystemException customSystemException) {
            throw UserInterfaceThemeManager.a(customSystemException);
        }
        StateTrackingCoordinator.B(color, f2, f, this.B, this.V, this.L, false);
    }

    public static boolean k() {
        return E;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static {
        if (!UserInterfaceThemeManager.U()) {
            UserInterfaceThemeManager.o(true);
        }
    }

    public static boolean U() {
        boolean bl = UserInterfaceThemeManager.k();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserInterfaceThemeManager.a(customSystemException);
        }
        return false;
    }

    @Override
    public void d() {
    }

    @Override
    public double z() {
        return this.L;
    }

    public static void o(boolean bl) {
        E = bl;
    }

    public UserInterfaceThemeManager(String string, float f, float f2) {
        this.B = string;
        this.V = f;
        this.L = f2;
        this.Y = Color.white;
    }
}

