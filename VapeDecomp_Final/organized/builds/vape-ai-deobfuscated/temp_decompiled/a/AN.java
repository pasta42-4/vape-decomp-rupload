/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Yo;
import a.Z1;
import a.ad;
import a.rO;
import java.util.ArrayList;
import java.util.List;

public class an
extends ad<an> {
    private final List<Class<?>> f = new ArrayList();
    private Z1 Q;

    an(ad ad2, rO rO2) {
        this(ad2);
    }

    public an C(Class<?> clazz) {
        this.f.add(clazz);
        return this;
    }

    public List<Class<?>> r() {
        return this.f;
    }

    public Z1 r() {
        return this.Q;
    }

    public Yo V() {
        return new Yo(this);
    }

    private an(ad<?> ad2) {
        super(ad2);
    }

    public an W(Z1 z12) {
        this.Q = z12;
        return this;
    }
}

