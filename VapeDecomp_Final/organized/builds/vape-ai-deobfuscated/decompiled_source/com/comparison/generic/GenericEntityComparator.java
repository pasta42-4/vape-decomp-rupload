/*
 * Decompiled with CFR 0.152.
 */
package com.comparison.generic;

import a.iL;
import java.util.Comparator;
import java.util.Map;

class GenericEntityComparator
implements Comparator {
    final iL p;

    GenericEntityComparator(iL iL2) {
        this.p = iL2;
    }

    public int compare(Object object, Object object2) {
        return ((Integer)((Map.Entry)object).getValue()).compareTo((Integer)((Map.Entry)object2).getValue());
    }
}

