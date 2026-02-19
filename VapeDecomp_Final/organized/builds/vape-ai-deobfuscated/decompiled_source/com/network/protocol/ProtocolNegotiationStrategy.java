/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a.N9;
import java.util.Vector;

public interface ProtocolNegotiationStrategy<T> {
    default public boolean O(N9 n9) {
        return true;
    }

    default public int d(Vector<T> vector) {
        return vector.size();
    }

    default public int e(Vector<T> vector, int n) {
        return this.d(vector);
    }

    public boolean X(N9 var1);

    public int B();
}

