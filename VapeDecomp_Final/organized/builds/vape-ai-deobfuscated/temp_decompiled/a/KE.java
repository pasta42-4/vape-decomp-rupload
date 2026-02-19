/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.iL;
import java.util.Comparator;
import java.util.Map;

class ke
implements Comparator {
    final iL p;

    ke(iL iL2) {
        this.p = iL2;
    }

    public int compare(Object object, Object object2) {
        return ((Integer)((Map.Entry)object).getValue()).compareTo((Integer)((Map.Entry)object2).getValue());
    }
}

