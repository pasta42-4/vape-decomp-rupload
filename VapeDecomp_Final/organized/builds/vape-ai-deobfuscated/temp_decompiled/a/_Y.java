/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.GM;
import a.Ix;

public abstract class _y {
    protected GM k;
    _y n;

    public abstract int A();

    protected abstract void r(StringBuilder var1);

    public abstract String I();

    protected _y(GM gM) {
        this.k = gM;
        this.n = null;
    }

    public GM E() {
        return this.k;
    }

    final _y Y() {
        return this.n;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.getClass().getName());
        stringBuilder.append('@');
        stringBuilder.append(Integer.toHexString(this.hashCode()));
        stringBuilder.append('[');
        stringBuilder.append(Ix.c(this.A()));
        this.r(stringBuilder);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public abstract String l();
}

