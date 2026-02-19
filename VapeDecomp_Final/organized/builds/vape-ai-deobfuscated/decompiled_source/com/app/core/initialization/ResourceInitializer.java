/*
 * Decompiled with CFR 0.152.
 */
package com.app.core.initialization;

import com.resource.management.MultiResourceOrchestrator;
import com.system.component.ComponentRegistryManager;
import com.system.resource.ResourceAllocationTracker144;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ResourceInitializer {
    private MultiResourceOrchestrator r;
    private Map<ResourceAllocationTracker144, ComponentRegistryManager> i = new HashMap<ResourceAllocationTracker144, ComponentRegistryManager>();

    public ResourceInitializer(MultiResourceOrchestrator multiResourceOrchestrator) {
        this.r = multiResourceOrchestrator;
        this.Z();
    }

    public Map<ResourceAllocationTracker144, ComponentRegistryManager> H() {
        return this.i;
    }

    public void Z() {
        Iterator<ResourceAllocationTracker144> iterator = this.r.H.iterator();
        while (iterator.hasNext()) {
            ResourceAllocationTracker144 resourceAllocationTracker144;
            ResourceAllocationTracker144 resourceAllocationTracker1442 = resourceAllocationTracker144 = iterator.next();
            ComponentRegistryManager componentRegistryManager = new ComponentRegistryManager(resourceAllocationTracker1442);
            componentRegistryManager.o();
            this.i.put(resourceAllocationTracker1442, componentRegistryManager);
        }
    }
}

