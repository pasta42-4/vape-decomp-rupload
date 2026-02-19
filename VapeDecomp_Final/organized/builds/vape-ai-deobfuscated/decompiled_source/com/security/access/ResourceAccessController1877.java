/*
 * Decompiled with CFR 0.152.
 */
package com.security.access;

import a.Ne;
import com.exception.system.CustomSystemException;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ResourceAccessController1877
extends ObjectLifecycleTracker {
    public void m(boolean bl) {
        block4: {
            block5: {
                boolean bl2 = ResourceAccessController1877.U.u().k3.w(this.H);
                try {
                    try {
                        if (bl == bl2) break block4;
                        ResourceAccessController1877.U.u().k3.U(this.H, bl);
                        if (!bl) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAccessController1877.a(customSystemException);
                    }
                    Ne.h.y(ResourceAccessController1877.U.u().k3.h(this.H));
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAccessController1877.a(customSystemException);
                }
            }
            Ne.h.z(ResourceAccessController1877.U.u().k3.h(this.H));
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void Y() {
        this.m(true);
    }

    public ResourceAccessController1877(Object object) {
        super(object);
    }

    public void p() {
        this.m(false);
    }
}

