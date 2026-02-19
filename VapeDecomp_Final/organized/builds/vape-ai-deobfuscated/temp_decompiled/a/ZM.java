/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.UnmodifiableView
 */
package a;

import a.Fm;
import a._V;
import java.util.Collection;
import org.jetbrains.annotations.UnmodifiableView;

public class zm
implements _V {
    private static final Fm x = new Fm();
    private final Collection<String> I;

    @Override
    public Fm getListeners() {
        return x;
    }

    public @UnmodifiableView Collection<String> getTags() {
        return this.I;
    }

    public zm(Collection<String> collection) {
        this.I = collection;
    }

    public static Fm getEventListeners() {
        return x;
    }
}

