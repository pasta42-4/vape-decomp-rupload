/*
 * Decompiled with CFR 0.152.
 */
package com.event.dispatch;

import a.Qh;
import com.app.events.EventTriggeringMechanism;
import com.game.inventory.InventoryEventManager;
import com.runtime.context.LightweightExecutionContext;
import com.security.context.SecurityContextManager2112;

public class EventDispatcherProxy
implements EventTriggeringMechanism {
    private final Qh a;
    private final SecurityContextManager2112 k;

    @Override
    public boolean fire() {
        LightweightExecutionContext lightweightExecutionContext = this.a.G(this.k);
        InventoryEventManager inventoryEventManager = new InventoryEventManager(lightweightExecutionContext.M());
        return inventoryEventManager.fire();
    }

    public EventDispatcherProxy(Object object, Object object2) {
        this.a = new Qh(object);
        this.k = new SecurityContextManager2112(object2);
    }
}

