/*
 * Decompiled with CFR 0.152.
 */
package com.action.management;

import com.core.lifecycle.ObjectLifecycleManager;
import com.exception.system.CustomSystemException;
import com.text.processing.StringTokenContainer;

class ActionExecutionMediator
extends StringTokenContainer {
    boolean T;
    final ObjectLifecycleManager U;

    @Override
    public void O() {
        try {
            if (this.T) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ActionExecutionMediator.a(customSystemException);
        }
        this.T = true;
    }

    ActionExecutionMediator(ObjectLifecycleManager objectLifecycleManager, Object object, String string, String string2) {
        this.U = objectLifecycleManager;
        super(object, string, string2);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

