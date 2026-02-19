/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import a.i5;
import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.data.collection.CollectionOrchestrator1895;
import com.exception.system.CustomSystemException;
import com.resource.management.ResourceLifecycleManager1859;
import com.security.exchange.CryptoKeyExchangeMapping;
import java.util.List;

public class ResourceAllocationTracker1674
extends CollectionOrchestrator1895 {
    public List<Integer> Y;
    public ResourceLifecycleManager1859 K;
    public List<ResourceLifecycleManager1859> v;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void T(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        int[] nArray = new int[this.Y.size()];
        int n = nArray.length;
        try {
            for (int i = 0; i < n; ++i) {
                nArray[i] = this.Y.get(i);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker1674.a(customSystemException);
        }
        CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray = new CryptoKeyExchangeMapping[this.v.size()];
        int n2 = cryptoKeyExchangeMappingArray.length;
        try {
            for (n = 0; n < n2; ++n) {
                cryptoKeyExchangeMappingArray[n] = this.v.get(n).i();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationTracker1674.a(customSystemException);
        }
        bytecodeInstrumentationEngine.v(this.K.i(), nArray, cryptoKeyExchangeMappingArray);
        this.m(bytecodeInstrumentationEngine);
    }

    public ResourceAllocationTracker1674(ResourceLifecycleManager1859 resourceLifecycleManager1859, int[] nArray, ResourceLifecycleManager1859[] resourceLifecycleManager1859Array) {
        super(171);
        this.K = resourceLifecycleManager1859;
        this.Y = i5.N(nArray);
        this.v = i5.Y(resourceLifecycleManager1859Array);
    }
}

