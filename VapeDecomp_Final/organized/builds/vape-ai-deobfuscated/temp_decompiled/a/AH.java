/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Fg;
import a.aQ;
import org.jetbrains.annotations.Nullable;

class ah<T>
extends aQ<ah<T>> {
    @Nullable
    private T a = null;

    ah<T> w(@Nullable T t10) {
        this.a = t10;
        return this.T();
    }

    ah(Fg fg2, @Nullable String string, @Nullable T t10) {
        super(fg2, string);
        this.w(t10);
    }

    @Nullable
    T L() {
        return this.a;
    }

    ah() {
        this(Fg.PENDING, null, null);
    }

    private ah<T> T() {
        return this;
    }
}

