/*
 * Decompiled with CFR 0.152.
 */
package com.service.lifecycle;

import a.P_;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.security.transform.CryptographicTransformer;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ServiceLifecycleManager
extends ObjectLifecycleTracker {
    public ServiceLifecycleManager(Object object) {
        super(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public String a() {
        block7: {
            Object object;
            Object object2;
            P_ p_;
            CryptographicTransformer cryptographicTransformer;
            CryptographicTransformer cryptographicTransformer2;
            block9: {
                block8: {
                    try {
                        try {
                            CryptographicTransformer cryptographicTransformer3;
                            if (GeometryCalculator.C() < 23) break block7;
                            cryptographicTransformer2 = cryptographicTransformer3;
                            cryptographicTransformer = cryptographicTransformer3;
                            p_ = ServiceLifecycleManager.U.u().ke;
                            object2 = this.H;
                            if (GeometryCalculator.C() < 37) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ServiceLifecycleManager.a(customSystemException);
                        }
                        object = ApplicationLifecycleManager.c().M();
                        break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ServiceLifecycleManager.a(customSystemException);
                    }
                }
                object = null;
            }
            cryptographicTransformer2(P_.l(p_, object2, object));
            CryptographicTransformer cryptographicTransformer4 = cryptographicTransformer;
            try {
                if (cryptographicTransformer4.r()) {
                    return cryptographicTransformer4.e();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ServiceLifecycleManager.a(customSystemException);
            }
            return "";
        }
        return P_.N(ServiceLifecycleManager.U.u().ke, this.H);
    }
}

