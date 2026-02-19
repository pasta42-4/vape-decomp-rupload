/*
 * Decompiled with CFR 0.152.
 */
package com.system.core;

import a.xI;
import com.network.event.NetworkEventDispatcher;

public class SystemStateOrchestrator1930 {
    final xI I;
    private boolean u;
    private static String[] O;
    private final NetworkEventDispatcher c;

    public NetworkEventDispatcher E() {
        return this.c;
    }

    static NetworkEventDispatcher H(SystemStateOrchestrator1930 systemStateOrchestrator1930) {
        return systemStateOrchestrator1930.c;
    }

    public static void y(String[] stringArray) {
        O = stringArray;
    }

    public void I(boolean bl) {
        this.u = bl;
    }

    static {
        if (SystemStateOrchestrator1930.P() == null) {
            SystemStateOrchestrator1930.y(new String[3]);
        }
    }

    public boolean w() {
        return this.u;
    }

    public SystemStateOrchestrator1930(xI xI2, NetworkEventDispatcher networkEventDispatcher) {
        this.I = xI2;
        this.c = networkEventDispatcher;
    }

    public static String[] P() {
        return O;
    }
}

