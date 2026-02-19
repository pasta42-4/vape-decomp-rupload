/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.geometry;

import com.crypto.cipher.SymmetricCipherManager;
import com.exception.system.CustomSystemException;

public abstract class GeometryTransformer
extends SymmetricCipherManager {
    private static int xG;

    public static int G() {
        return xG;
    }

    static {
        if (GeometryTransformer.G() != 0) {
            GeometryTransformer.V(15);
        }
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public GeometryTransformer() {
        super(104.0);
        this.T(104.0);
        this.Q(GeometryTransformer.M.E);
    }

    public static int E() {
        int n = GeometryTransformer.G();
        try {
            if (n == 0) {
                return 41;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometryTransformer.b(customSystemException);
        }
        return 0;
    }

    public static void V(int n) {
        xG = n;
    }

    public abstract void O();
}

