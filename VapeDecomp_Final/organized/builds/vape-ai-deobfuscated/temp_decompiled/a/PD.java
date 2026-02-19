/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fm;
import a.KG;
import a.QF;

public class pd
extends KG {
    private static final Fm i = new Fm();
    private static String g;
    private final QF b;

    pd(Object object) {
        this.b = new QF(object);
    }

    public static Fm getEventListeners() {
        return i;
    }

    public static String G() {
        return g;
    }

    public QF getTarget() {
        return this.b;
    }

    public static void w(String string) {
        g = string;
    }

    @Override
    public Fm getListeners() {
        return i;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    static {
        pd.w(null);
    }
}

