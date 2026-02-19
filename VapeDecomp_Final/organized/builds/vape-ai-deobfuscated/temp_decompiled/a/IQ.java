/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.H5;
import a.XF;
import java.util.ListIterator;
import java.util.NoSuchElementException;

final class iq
implements ListIterator {
    H5 o;
    H5 a;
    final XF P;
    H5 M;

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
                            throw iq.a(indexOutOfBoundsException);
                        }
                        this.a = this.a.x;
                        break block6;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw iq.a(indexOutOfBoundsException);
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
        H5 h52;
        try {
            if (this.a == null) {
                throw new NoSuchElementException();
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw iq.a(indexOutOfBoundsException);
        }
        this.o = h52 = this.a;
        this.a = h52.x;
        this.M = h52;
        return h52;
    }

    public void set(Object object) {
        block6: {
            block4: {
                block5: {
                    try {
                        try {
                            if (this.M == null) break block4;
                            this.P.P(this.M, (H5)object);
                            if (this.M != this.o) break block5;
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                            throw iq.a(indexOutOfBoundsException);
                        }
                        this.o = (H5)object;
                        break block6;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw iq.a(indexOutOfBoundsException);
                    }
                }
                this.a = (H5)object;
                break block6;
            }
            throw new IllegalStateException();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    iq(XF xF2, int n2) {
        block6: {
            this.P = xF2;
            if (n2 < 0) throw new IndexOutOfBoundsException();
            try {
                if (n2 > xF2.H()) {
                    throw new IndexOutOfBoundsException();
                }
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw iq.a(indexOutOfBoundsException);
            }
            try {
                if (n2 != xF2.H()) break block6;
                this.a = null;
                this.o = xF2.E();
                return;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw iq.a(indexOutOfBoundsException);
            }
        }
        H5 h52 = xF2.x();
        for (int i10 = 0; i10 < n2; ++i10) {
            h52 = h52.x;
        }
        this.a = h52;
        this.o = h52.c;
    }

    public int nextIndex() {
        try {
            if (this.a == null) {
                return this.P.H();
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw iq.a(indexOutOfBoundsException);
        }
        try {
            if (this.P.U == null) {
                this.P.U = this.P.a();
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw iq.a(indexOutOfBoundsException);
        }
        return this.a.p;
    }

    private static IndexOutOfBoundsException a(IndexOutOfBoundsException indexOutOfBoundsException) {
        return indexOutOfBoundsException;
    }

    public boolean hasNext() {
        boolean bl2;
        try {
            bl2 = this.a != null;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw iq.a(indexOutOfBoundsException);
        }
        return bl2;
    }

    public int previousIndex() {
        try {
            if (this.o == null) {
                return -1;
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw iq.a(indexOutOfBoundsException);
        }
        try {
            if (this.P.U == null) {
                this.P.U = this.P.a();
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw iq.a(indexOutOfBoundsException);
        }
        return this.o.p;
    }

    public void add(Object object) {
        block5: {
            block6: {
                block4: {
                    try {
                        if (this.a == null) break block4;
                        this.P.V(this.a, (H5)object);
                        break block5;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw iq.a(indexOutOfBoundsException);
                    }
                }
                try {
                    if (this.o == null) break block6;
                    this.P.W(this.o, (H5)object);
                    break block5;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw iq.a(indexOutOfBoundsException);
                }
            }
            this.P.R((H5)object);
        }
        this.o = (H5)object;
        this.M = null;
    }

    public boolean hasPrevious() {
        boolean bl2;
        try {
            bl2 = this.o != null;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw iq.a(indexOutOfBoundsException);
        }
        return bl2;
    }

    public Object previous() {
        H5 h52;
        try {
            if (this.o == null) {
                throw new NoSuchElementException();
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw iq.a(indexOutOfBoundsException);
        }
        this.a = h52 = this.o;
        this.o = h52.c;
        this.M = h52;
        return h52;
    }
}

