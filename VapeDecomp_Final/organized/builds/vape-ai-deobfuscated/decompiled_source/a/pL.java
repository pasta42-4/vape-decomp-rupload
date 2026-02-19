/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.game.physics.PhysicsEntityController;

public class pL
extends PhysicsEntityController {
    private final float h;

    @Override
    public double getRealHeight() {
        return this.h;
    }

    public pL(Object object, double d2) {
        super(object);
        this.h = (float)(1.0 + d2);
    }
}

