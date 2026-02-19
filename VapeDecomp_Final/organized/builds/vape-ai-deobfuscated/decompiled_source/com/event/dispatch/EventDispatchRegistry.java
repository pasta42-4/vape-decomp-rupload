/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 */
package com.event.dispatch;

import com.advanced.resolution.MultiLayeredCompositeResolver;
import com.concurrency.filtering.ConcurrentFilteringCoordinator;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.HashSet;
import java.util.Set;

public class EventDispatchRegistry {
    private final Set<ConcurrentFilteringCoordinator> f = new HashSet<ConcurrentFilteringCoordinator>();

    public void q(JsonArray jsonArray) {
        this.M();
        for (int i = 0; i < jsonArray.size(); ++i) {
            JsonElement jsonElement = jsonArray.get(i);
            try {
                try {
                    if (!jsonElement.isJsonObject() || jsonElement.isJsonNull()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchRegistry.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchRegistry.a(customSystemException);
            }
            ConcurrentFilteringCoordinator concurrentFilteringCoordinator = new ConcurrentFilteringCoordinator(jsonElement.getAsJsonObject());
            this.k(concurrentFilteringCoordinator);
        }
    }

    public JsonArray u() {
        JsonArray jsonArray = new JsonArray();
        for (ConcurrentFilteringCoordinator concurrentFilteringCoordinator : this.f) {
            jsonArray.add((JsonElement)concurrentFilteringCoordinator.z());
        }
        return jsonArray;
    }

    public void M() {
        for (ConcurrentFilteringCoordinator concurrentFilteringCoordinator : new HashSet<ConcurrentFilteringCoordinator>(this.f)) {
            this.Y(concurrentFilteringCoordinator);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public Set<ConcurrentFilteringCoordinator> c() {
        return this.f;
    }

    public void Y(ConcurrentFilteringCoordinator concurrentFilteringCoordinator) {
        if (concurrentFilteringCoordinator != null) {
            MultiLayeredCompositeResolver multiLayeredCompositeResolver = TemporalMetadataResolver.h.U().K(MultiLayeredCompositeResolver.class);
            this.f.remove(concurrentFilteringCoordinator);
            multiLayeredCompositeResolver.o(concurrentFilteringCoordinator);
        }
    }

    public void k(ConcurrentFilteringCoordinator concurrentFilteringCoordinator) {
        this.f.add(concurrentFilteringCoordinator);
        MultiLayeredCompositeResolver multiLayeredCompositeResolver = TemporalMetadataResolver.h.U().K(MultiLayeredCompositeResolver.class);
        multiLayeredCompositeResolver.k(concurrentFilteringCoordinator);
    }
}

