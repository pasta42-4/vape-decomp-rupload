/*
 * Decompiled with CFR 0.152.
 */
package com.app.collection;

import com.network.connection.ConnectionLifecycleHandler;
import java.util.ArrayList;
import java.util.List;

public class CollectionOrchestrator {
    private static List<Object> f;
    private static List<Object> q;

    public static void w(ConnectionLifecycleHandler connectionLifecycleHandler) {
        q.remove(connectionLifecycleHandler.M());
    }

    static {
        q = new ArrayList<Object>();
        f = new ArrayList<Object>();
    }

    public static boolean R(ConnectionLifecycleHandler connectionLifecycleHandler) {
        return q.contains(connectionLifecycleHandler.M());
    }

    public static boolean C(ConnectionLifecycleHandler connectionLifecycleHandler) {
        return f.contains(connectionLifecycleHandler.M());
    }

    public static void O(ConnectionLifecycleHandler connectionLifecycleHandler) {
        f.remove(connectionLifecycleHandler.M());
    }

    public static void X(ConnectionLifecycleHandler connectionLifecycleHandler) {
        q.add(connectionLifecycleHandler.M());
    }

    public static void z(ConnectionLifecycleHandler connectionLifecycleHandler) {
        f.add(connectionLifecycleHandler.M());
    }
}

