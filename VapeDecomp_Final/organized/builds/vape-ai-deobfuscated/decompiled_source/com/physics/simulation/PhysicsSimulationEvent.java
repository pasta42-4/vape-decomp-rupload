/*
 * Decompiled with CFR 0.152.
 */
package com.physics.simulation;

import com.app.events.EventTriggeringMechanism;
import com.app.gamelogic.GameStateController1693;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.graphics.rendering.RenderEventDispatcher;
import com.math.computation.NumericComputationEngine1131;
import com.security.authentication.AuthenticationStateManager675;
import com.security.transform.CryptographicTransformer;
import com.system.resource.ResourceAllocator1518;

public class PhysicsSimulationEvent
implements EventTriggeringMechanism {
    private final double E;
    private final Object r;
    private final double k;
    private final double G;
    private final Object B;

    public static void call(Object object) {
        new PhysicsSimulationEvent(object, null).fire();
    }

    public static void call(Object object, Object object2, float f, Object object3, Object object4, int n) {
        Object object5 = new ResourceAllocator1518(object3).j(new CryptographicTransformer(object), f).M();
        PhysicsSimulationEvent.call(object, object5, object2, object4, n);
    }

    @Override
    public boolean fire() {
        if (RenderEventDispatcher.getEventListeners().G()) {
            RenderEventDispatcher renderEventDispatcher = new RenderEventDispatcher(this.B, this.k, this.E, this.G, this.r);
            return renderEventDispatcher.fire();
        }
        return false;
    }

    public PhysicsSimulationEvent(Object object, double d2, double d3, double d4) {
        this.B = object;
        this.r = null;
        this.k = d2;
        this.E = d3;
        this.G = d4;
    }

    public static void call(Object object, Object object2, Object object3, Object object4, int n) {
        boolean bl = new PhysicsSimulationEvent(object, object3).fire();
        if (bl) {
            GameStateController1693 gameStateController1693 = new GameStateController1693(object2);
            gameStateController1693.u(new AuthenticationStateManager675(null));
        }
    }

    public PhysicsSimulationEvent(Object object, Object object2) {
        this.r = object2;
        this.B = object;
        CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(object);
        this.k = cryptographicTransformer.b() + (cryptographicTransformer.F() - cryptographicTransformer.b()) * (double)ApplicationLifecycleManager.K().h() - NumericComputationEngine1131.b();
        this.E = cryptographicTransformer.q() + (cryptographicTransformer.V() - cryptographicTransformer.q()) * (double)ApplicationLifecycleManager.K().h() - NumericComputationEngine1131.S();
        this.G = cryptographicTransformer.I() + (cryptographicTransformer.B() - cryptographicTransformer.I()) * (double)ApplicationLifecycleManager.K().h() - NumericComputationEngine1131.n();
    }
}

