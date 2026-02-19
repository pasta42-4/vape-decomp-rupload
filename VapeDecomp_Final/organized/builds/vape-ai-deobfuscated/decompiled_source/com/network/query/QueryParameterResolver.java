/*
 * Decompiled with CFR 0.152.
 */
package com.network.query;

import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;
import com.system.configuration.ConfigurationManager2254;

class QueryParameterResolver
extends ConfigurationManager2254 {
    boolean U;
    int X;

    QueryParameterResolver(int n, int n2) {
        super(n);
        this.X = n2;
        this.U = true;
    }

    int g(int n, byte[] byArray, int n2, byte[] byArray2) {
        byArray2[n2] = 19;
        ConfigurationManager2137.e(this.X, byArray2, n2 + 1);
        return 2;
    }

    boolean t() {
        try {
            if (this.U) {
                this.U = false;
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw QueryParameterResolver.a(customSystemException);
        }
        return false;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    int W() {
        return 1;
    }
}

