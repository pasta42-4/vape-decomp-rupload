/*
 * Decompiled with CFR 0.152.
 */
package com.collections.iteration;

import a.XF;
import com.data.collection.CollectionOrchestrator1895;
import java.util.ListIterator;
import java.util.NoSuchElementException;

final class CustomListTraversal
implements ListIterator {
    CollectionOrchestrator1895 o;
    CollectionOrchestrator1895 a;
    final XF P;
    CollectionOrchestrator1895 M;

    public void remove() {
        block6: {
            block4: {
                block5: {
                    try {
                        try {
                            if (this.M == null) break block4;
                            if (this.M != this.a) break block5;
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                            throw CustomListTraversal.a(indexOutOfBoundsException);
                        }
                        this.a = this.a.x;
                        break block6;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw CustomListTraversal.a(indexOutOfBoundsException);
                    }
                }
                this.o = this.o.c;
                break block6;
            }
            throw new IllegalStateException();
        }
        this.P.o(this.M);
        this.M = null;
    }

    public Object next() {
        CollectionOrchestrator1895 collectionOrchestrator1895;
        try {
            if (this.a == null) {
                throw new NoSuchElementException();
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw CustomListTraversal.a(indexOutOfBoundsException);
        }
        this.o = collectionOrchestrator1895 = this.a;
        this.a = collectionOrchestrator1895.x;
        this.M = collectionOrchestrator1895;
        return collectionOrchestrator1895;
    }

    public void set(Object object) {
        block6: {
            block4: {
                block5: {
                    try {
                        try {
                            if (this.M == null) break block4;
                            this.P.P(this.M, (CollectionOrchestrator1895)object);
                            if (this.M != this.o) break block5;
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                            throw CustomListTraversal.a(indexOutOfBoundsException);
                        }
                        this.o = (CollectionOrchestrator1895)object;
                        break block6;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw CustomListTraversal.a(indexOutOfBoundsException);
                    }
                }
                this.a = (CollectionOrchestrator1895)object;
                break block6;
            }
            throw new IllegalStateException();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    CustomListTraversal(XF xF, int n) {
        block6: {
            this.P = xF;
            if (n < 0) throw new IndexOutOfBoundsException();
            try {
                if (n > xF.H()) {
                    throw new IndexOutOfBoundsException();
                }
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw CustomListTraversal.a(indexOutOfBoundsException);
            }
            try {
                if (n != xF.H()) break block6;
                this.a = null;
                this.o = xF.E();
                return;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw CustomListTraversal.a(indexOutOfBoundsException);
            }
        }
        CollectionOrchestrator1895 collectionOrchestrator1895 = xF.x();
        for (int i = 0; i < n; ++i) {
            collectionOrchestrator1895 = collectionOrchestrator1895.x;
        }
        this.a = collectionOrchestrator1895;
        this.o = collectionOrchestrator1895.c;
    }

    public int nextIndex() {
        try {
            if (this.a == null) {
                return this.P.H();
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw CustomListTraversal.a(indexOutOfBoundsException);
        }
        try {
            if (this.P.U == null) {
                this.P.U = this.P.a();
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw CustomListTraversal.a(indexOutOfBoundsException);
        }
        return this.a.p;
    }

    private static IndexOutOfBoundsException a(IndexOutOfBoundsException indexOutOfBoundsException) {
        return indexOutOfBoundsException;
    }

    public boolean hasNext() {
        boolean bl;
        try {
            bl = this.a != null;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw CustomListTraversal.a(indexOutOfBoundsException);
        }
        return bl;
    }

    public int previousIndex() {
        try {
            if (this.o == null) {
                return -1;
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw CustomListTraversal.a(indexOutOfBoundsException);
        }
        try {
            if (this.P.U == null) {
                this.P.U = this.P.a();
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw CustomListTraversal.a(indexOutOfBoundsException);
        }
        return this.o.p;
    }

    public void add(Object object) {
        block5: {
            block6: {
                block4: {
                    try {
                        if (this.a == null) break block4;
                        this.P.V(this.a, (CollectionOrchestrator1895)object);
                        break block5;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw CustomListTraversal.a(indexOutOfBoundsException);
                    }
                }
                try {
                    if (this.o == null) break block6;
                    this.P.W(this.o, (CollectionOrchestrator1895)object);
                    break block5;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw CustomListTraversal.a(indexOutOfBoundsException);
                }
            }
            this.P.R((CollectionOrchestrator1895)object);
        }
        this.o = (CollectionOrchestrator1895)object;
        this.M = null;
    }

    public boolean hasPrevious() {
        boolean bl;
        try {
            bl = this.o != null;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw CustomListTraversal.a(indexOutOfBoundsException);
        }
        return bl;
    }

    public Object previous() {
        CollectionOrchestrator1895 collectionOrchestrator1895;
        try {
            if (this.o == null) {
                throw new NoSuchElementException();
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw CustomListTraversal.a(indexOutOfBoundsException);
        }
        this.a = collectionOrchestrator1895 = this.o;
        this.o = collectionOrchestrator1895.c;
        this.M = collectionOrchestrator1895;
        return collectionOrchestrator1895;
    }
}

