/*
 * Decompiled with CFR 0.152.
 */
package com.app.rendering;

import com.data.transformation.DataTransformationEngine1209;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.security.crypto.CryptographicSessionController;
import com.system.configuration.ConfigurationManager;

public abstract class RenderContextManager1540
extends GameRenderContextBridge {
    private final float J;
    private final DataTransformationEngine1209 l;
    private static int[] u;

    public float getTicks() {
        return this.J;
    }

    public static void K(int[] nArray) {
        u = nArray;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public DataTransformationEngine1209 getMatrixStack() {
        return this.l;
    }

    RenderContextManager1540(DataTransformationEngine1209 dataTransformationEngine1209, float f) {
        this.l = dataTransformationEngine1209;
        this.J = f;
    }

    static {
        if (RenderContextManager1540.g() == null) {
            RenderContextManager1540.K(new int[3]);
        }
    }

    @Override
    public boolean fire() {
        boolean bl = super.fire();
        try {
            if (ConfigurationManager.U()) {
                CryptographicSessionController.x().F(this.J);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RenderContextManager1540.a(customSystemException);
        }
        return bl;
    }

    public static int[] g() {
        return u;
    }
}

