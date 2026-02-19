/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.metadata;

import a.co;
import com.app.core.initialization.ResourceInitializer;
import com.exception.system.CustomSystemException;
import com.resource.management.MultiResourceOrchestrator;
import com.system.component.ComponentRegistryManager;
import com.system.resource.ResourceAllocationTracker144;
import java.util.Iterator;

public abstract class ReflectionMetadataResolver1493 {
    private static int[] W;
    private final MultiResourceOrchestrator g;
    private final ResourceInitializer I;
    private final Class B;

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static {
        if (ReflectionMetadataResolver1493.A() != null) {
            ReflectionMetadataResolver1493.f(new int[4]);
        }
    }

    public abstract boolean A(ResourceAllocationTracker144 var1);

    public static int[] A() {
        return W;
    }

    public ReflectionMetadataResolver1493(Class clazz) {
        this.B = clazz;
        this.g = co.g(clazz);
        this.I = co.z(clazz);
    }

    public static void f(int[] nArray) {
        W = nArray;
    }

    public String p(String string) {
        Iterator<ResourceAllocationTracker144> iterator = this.g.H.iterator();
        while (iterator.hasNext()) {
            ResourceAllocationTracker144 resourceAllocationTracker144;
            ResourceAllocationTracker144 resourceAllocationTracker1442 = resourceAllocationTracker144 = iterator.next();
            try {
                if (!string.equals(resourceAllocationTracker1442.P)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectionMetadataResolver1493.b(customSystemException);
            }
            try {
                if (!this.A(resourceAllocationTracker1442)) continue;
                return resourceAllocationTracker1442.R;
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectionMetadataResolver1493.b(customSystemException);
            }
        }
        return null;
    }

    public ComponentRegistryManager E(ResourceAllocationTracker144 resourceAllocationTracker144) {
        return this.I.H().get(resourceAllocationTracker144);
    }
}

