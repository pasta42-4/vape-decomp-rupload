/*
 * Decompiled with CFR 0.152.
 */
package com.system.component;

import a.JC;
import a.XF;
import com.data.collection.CollectionOrchestrator1895;
import com.device.configuration.DeviceConfigurationProfile;
import com.exception.system.CustomSystemException;
import com.messaging.routing.MessageRoutingService2392;
import com.security.obfuscation.DataObfuscator;
import com.system.integration.SystemIntegrationProfile;
import com.system.resource.ResourceAllocationTracker144;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ComponentRegistryManager {
    private List<DataObfuscator> z = new ArrayList<DataObfuscator>();
    private static int[] T;
    private ResourceAllocationTracker144 b;

    public static int[] M() {
        return T;
    }

    public void o() {
        XF xF = this.b.V;
        ListIterator<CollectionOrchestrator1895> listIterator = xF.E();
        while (listIterator.hasNext()) {
            CollectionOrchestrator1895 collectionOrchestrator1895 = (CollectionOrchestrator1895)listIterator.next();
            this.k(collectionOrchestrator1895);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void F(int[] nArray) {
        T = nArray;
    }

    public ComponentRegistryManager(ResourceAllocationTracker144 resourceAllocationTracker144) {
        this.b = resourceAllocationTracker144;
    }

    public List<DataObfuscator> T() {
        return this.z;
    }

    static {
        if (ComponentRegistryManager.M() != null) {
            ComponentRegistryManager.F(new int[4]);
        }
    }

    private void k(CollectionOrchestrator1895 collectionOrchestrator1895) {
        try {
            if (collectionOrchestrator1895 instanceof DeviceConfigurationProfile) {
                this.z.add(MessageRoutingService2392.h((DeviceConfigurationProfile)collectionOrchestrator1895));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComponentRegistryManager.a(customSystemException);
        }
        try {
            if (collectionOrchestrator1895 instanceof SystemIntegrationProfile) {
                this.z.add(JC.Q((SystemIntegrationProfile)collectionOrchestrator1895));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComponentRegistryManager.a(customSystemException);
        }
    }
}

