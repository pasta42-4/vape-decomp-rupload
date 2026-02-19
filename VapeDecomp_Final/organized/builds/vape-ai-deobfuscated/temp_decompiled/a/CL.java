/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.OO;
import a.hF;
import a.jE;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public abstract class cl<C, T extends cl<C, T>>
extends jE<List<C>, T> {
    private final String o;
    @Nullable
    private hF T;

    public List<C> G() {
        return new ArrayList((Collection)this.J());
    }

    @Override
    public String O() {
        return this.o;
    }

    public cl(Object object, String string, String string2, List<C> list) {
        super(object, string, ImmutableList.copyOf(list));
        this.d(new OO(this, list));
        this.o = string2;
    }

    @Nullable
    public hF M() {
        return this.T;
    }

    public abstract C J(String var1, int var2);

    public T U(hF hF2) {
        this.T = hF2;
        return (T)this;
    }

    public cl(Object object, String string, String string2) {
        this(object, string, string2, new ArrayList());
    }
}

