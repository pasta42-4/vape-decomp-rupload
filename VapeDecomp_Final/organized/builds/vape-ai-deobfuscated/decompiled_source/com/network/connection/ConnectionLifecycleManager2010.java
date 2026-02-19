/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.exception.system.CustomSystemException;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ConnectionLifecycleManager2010
extends ObjectLifecycleTracker {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ConnectionLifecycleManager2010(Object object) {
        super(object);
    }

    public static ConnectionLifecycleManager2010[] S() {
        Object[] objectArray = ConnectionLifecycleManager2010.U.u().X.R();
        ConnectionLifecycleManager2010[] connectionLifecycleManager2010Array = new ConnectionLifecycleManager2010[objectArray.length];
        try {
            for (int i = 0; i < objectArray.length; ++i) {
                connectionLifecycleManager2010Array[i] = new ConnectionLifecycleManager2010(objectArray[i]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConnectionLifecycleManager2010.a(customSystemException);
        }
        return connectionLifecycleManager2010Array;
    }
}

