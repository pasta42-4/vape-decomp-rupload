/*
 * Decompiled with CFR 0.152.
 */
package com.game.assets;

import a.i5;
import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.data.collection.CollectionOrchestrator1895;
import com.exception.system.CustomSystemException;
import com.resource.management.ResourceLifecycleManager1859;
import com.security.exchange.CryptoKeyExchangeMapping;
import java.util.List;

public class AssetLoadingCoordinator
extends CollectionOrchestrator1895 {
    public List<ResourceLifecycleManager1859> d;
    public int y;
    public ResourceLifecycleManager1859 L;
    public int N;

    public AssetLoadingCoordinator(int n, int n2, ResourceLifecycleManager1859 resourceLifecycleManager1859, ResourceLifecycleManager1859 ... resourceLifecycleManager1859Array) {
        super(170);
        this.N = n;
        this.y = n2;
        this.L = resourceLifecycleManager1859;
        this.d = i5.Y(resourceLifecycleManager1859Array);
    }

    public void T(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray = new CryptoKeyExchangeMapping[this.d.size()];
        int n = cryptoKeyExchangeMappingArray.length;
        try {
            for (int i = 0; i < n; ++i) {
                cryptoKeyExchangeMappingArray[i] = this.d.get(i).i();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AssetLoadingCoordinator.a(customSystemException);
        }
        bytecodeInstrumentationEngine.K(this.N, this.y, this.L.i(), cryptoKeyExchangeMappingArray);
        this.m(bytecodeInstrumentationEngine);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

