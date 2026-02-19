/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.FH;
import java.util.Iterator;
import java.util.ListIterator;

class ro
implements Iterator {
    final FH v;
    final ListIterator K;

    @Override
    public boolean hasNext() {
        return this.K.hasPrevious();
    }

    public Object next() {
        return this.K.previous();
    }

    @Override
    public void remove() {
        this.K.remove();
    }

    ro(FH fH2, ListIterator listIterator) {
        this.v = fH2;
        this.K = listIterator;
    }
}

