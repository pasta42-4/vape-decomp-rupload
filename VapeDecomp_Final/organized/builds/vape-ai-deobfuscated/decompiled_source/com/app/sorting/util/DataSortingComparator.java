/*
 * Decompiled with CFR 0.152.
 */
package com.app.sorting.util;

import a.FO;
import java.util.Comparator;

final class DataSortingComparator
implements Comparator {
    DataSortingComparator() {
    }

    public int compare(Object object, Object object2) {
        return ((FO)object).q() - ((FO)object2).q();
    }
}

