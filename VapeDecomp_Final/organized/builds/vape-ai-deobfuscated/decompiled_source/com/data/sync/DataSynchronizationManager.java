/*
 * Decompiled with CFR 0.152.
 */
package com.data.sync;

import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.security.configuration.SecurityEnumRegistry;
import com.security.cryptography.SecurePayloadManager;
import com.system.resource.ResourceAllocationManager1348;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Point;
import java.util.concurrent.atomic.AtomicBoolean;

class DataSynchronizationManager
implements DataProcessingProtocol {
    final SecurePayloadManager T;
    final AtomicBoolean u;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    DataSynchronizationManager(SecurePayloadManager securePayloadManager, AtomicBoolean atomicBoolean) {
        this.T = securePayloadManager;
        this.u = atomicBoolean;
    }

    private void lambda$onClick$1(ResourceAllocationManager1348 resourceAllocationManager1348, AtomicBoolean atomicBoolean) {
        try {
            this.T.T(resourceAllocationManager1348);
        }
        finally {
            atomicBoolean.set(false);
        }
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        block9: {
            block10: {
                try {
                    try {
                        if (!SecurePayloadManager.C(this.T)) break block9;
                        if (!SecurePayloadManager.X(this.T).s()) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataSynchronizationManager.a(customSystemException);
                    }
                    this.u.set(true);
                    GraphicalRenderingController.st.execute(() -> this.lambda$onClick$0(this.u));
                }
                catch (CustomSystemException customSystemException) {
                    throw DataSynchronizationManager.a(customSystemException);
                }
            }
            return;
        }
        for (ResourceAllocationManager1348 resourceAllocationManager1348 : SecurePayloadManager.f(this.T)) {
            block11: {
                try {
                    try {
                        if (!resourceAllocationManager1348.s()) continue;
                        if (!this.u.get()) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataSynchronizationManager.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataSynchronizationManager.a(customSystemException);
                }
            }
            this.u.set(true);
            GraphicalRenderingController.st.execute(() -> this.lambda$onClick$1(resourceAllocationManager1348, this.u));
            return;
        }
    }

    private void lambda$onClick$0(AtomicBoolean atomicBoolean) {
        try {
            this.T.Y();
        }
        finally {
            atomicBoolean.set(false);
        }
    }
}

