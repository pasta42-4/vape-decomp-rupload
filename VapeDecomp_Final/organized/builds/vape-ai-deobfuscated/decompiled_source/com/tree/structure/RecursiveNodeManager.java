/*
 * Decompiled with CFR 0.152.
 */
package com.tree.structure;

import com.exception.system.CustomSystemException;
import com.invocation.resolution.InvocationParameterResolver;
import com.system.lifecycle.ObjectLifecycleTracker;

public class RecursiveNodeManager
extends ObjectLifecycleTracker {
    private static RecursiveNodeManager h;
    private static RecursiveNodeManager D;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static RecursiveNodeManager J() {
        try {
            if (h == null) {
                h = new RecursiveNodeManager(InvocationParameterResolver.f(RecursiveNodeManager.U.u().dh));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RecursiveNodeManager.a(customSystemException);
        }
        return h;
    }

    public RecursiveNodeManager(Object object) {
        super(object);
    }

    public static RecursiveNodeManager Z() {
        try {
            if (D == null) {
                D = new RecursiveNodeManager(InvocationParameterResolver.M(RecursiveNodeManager.U.u().dh));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RecursiveNodeManager.a(customSystemException);
        }
        return D;
    }
}

