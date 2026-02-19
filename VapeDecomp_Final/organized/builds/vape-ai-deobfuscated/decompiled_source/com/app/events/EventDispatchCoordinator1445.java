/*
 * Decompiled with CFR 0.152.
 */
package com.app.events;

import com.exception.system.CustomSystemException;
import com.security.crypto.CipherManager;

public class EventDispatchCoordinator1445
extends CipherManager {
    private static int IR;

    @Override
    public void E() {
        super.E();
    }

    @Override
    public double e() {
        return 0.0;
    }

    static {
        if (EventDispatchCoordinator1445.U() != 0) {
            EventDispatchCoordinator1445.V(69);
        }
    }

    public static int f() {
        int n = EventDispatchCoordinator1445.U();
        try {
            if (n == 0) {
                return 122;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1445.a(customSystemException);
        }
        return 0;
    }

    public static void V(int n) {
        IR = n;
    }

    @Override
    public float C() {
        return 0.0f;
    }

    @Override
    public double z() {
        return 0.0;
    }

    public EventDispatchCoordinator1445(String string) {
        super(string);
        this.T(100.0);
        this.w(22.5);
    }

    public static int U() {
        return IR;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void O() {
    }
}

