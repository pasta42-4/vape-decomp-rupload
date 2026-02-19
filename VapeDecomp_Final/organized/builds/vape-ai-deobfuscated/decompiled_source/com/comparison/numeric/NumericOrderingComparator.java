/*
 * Decompiled with CFR 0.152.
 */
package com.comparison.numeric;

import a._Y;
import java.util.Comparator;

class NumericOrderingComparator
implements Comparator {
    private final int V;

    public int compare(Object object, Object object2) {
        int n = (Integer)object;
        int n2 = (Integer)object2;
        int n3 = this.V % 9;
        int n4 = (this.V - n3) / 9;
        int n5 = n % 9;
        int n6 = (n - n5) / 9;
        double d2 = _Y.y(n5, n6, n3, n4);
        int n7 = n2 % 9;
        int n8 = (n2 - n7) / 9;
        double d3 = _Y.y(n7, n8, n3, n4) + 1.0;
        return Double.compare(d2, d3);
    }

    public NumericOrderingComparator(int n) {
        this.V = n;
    }
}

