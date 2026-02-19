/*
 * Decompiled with CFR 0.152.
 */
package com.app.resource;

import com.data.transformation.DataEncodingTransformer;
import com.distributed.resources.DistributedResourceCoordinator;
import com.exception.system.CustomSystemException;
import com.security.crypto.CipherManager;
import com.security.crypto.CryptographicSecurityManager396;

class ResourceLifecycleManager1789
extends CipherManager {
    final CryptographicSecurityManager396 v8;
    final DistributedResourceCoordinator vI;

    @Override
    public void O() {
        this.N(false);
        String string = this.a().trim();
        try {
            if (string.isEmpty()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceLifecycleManager1789.a(customSystemException);
        }
        DistributedResourceCoordinator.e(this.vI).R(string);
        this.v8.d(DistributedResourceCoordinator.e(this.vI).T());
        DataEncodingTransformer.l();
    }

    @Override
    public double e() {
        return 100.0;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    ResourceLifecycleManager1789(DistributedResourceCoordinator distributedResourceCoordinator, String string, CryptographicSecurityManager396 cryptographicSecurityManager396) {
        this.vI = distributedResourceCoordinator;
        this.v8 = cryptographicSecurityManager396;
        super(string);
    }

    @Override
    public double z() {
        double d2;
        block3: {
            block2: {
                try {
                    if (!this.f()) break block2;
                    this.getClass();
                    d2 = 17.5 + 5.0;
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceLifecycleManager1789.a(customSystemException);
                }
            }
            d2 = 0.0;
        }
        return d2;
    }
}

