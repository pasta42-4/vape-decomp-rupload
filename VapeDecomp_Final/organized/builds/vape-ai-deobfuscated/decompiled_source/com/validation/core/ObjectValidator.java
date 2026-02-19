/*
 * Decompiled with CFR 0.152.
 */
package com.validation.core;

import com.exception.system.CustomSystemException;
import com.security.context.SecureContextBroker459;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ObjectValidator
extends ObjectLifecycleTracker {
    private static ObjectValidator b;
    private static ObjectValidator N;
    private static ObjectValidator a;

    public static ObjectValidator B() {
        try {
            if (a == null) {
                a = new ObjectValidator(SecureContextBroker459.U(ObjectValidator.U.u().H));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ObjectValidator.a(customSystemException);
        }
        return a;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static ObjectValidator u() {
        try {
            if (b == null) {
                b = new ObjectValidator(ObjectValidator.U.u().H.Y());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ObjectValidator.a(customSystemException);
        }
        return b;
    }

    public static ObjectValidator Y() {
        try {
            if (N == null) {
                N = new ObjectValidator(SecureContextBroker459.Z(ObjectValidator.U.u().H));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ObjectValidator.a(customSystemException);
        }
        return N;
    }

    public ObjectValidator(Object object) {
        super(object);
    }
}

