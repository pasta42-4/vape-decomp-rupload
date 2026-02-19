/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.jr;
import a.x4;
import a.xi;

public class j9<T extends x4>
extends jr {
    private final T P;

    public j9(T t10) {
        this(((xi)t10).O(), t10);
    }

    public T c() {
        return this.P;
    }

    public j9(String string, T t10) {
        super(string);
        this.P = t10;
    }
}

