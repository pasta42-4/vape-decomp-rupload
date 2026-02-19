/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.UnmodifiableView
 */
package a;

import a.Io;
import a.eA;
import a.ed;
import a.h4;
import java.util.List;
import org.jetbrains.annotations.UnmodifiableView;

public class e4
extends eA {
    private final List<h4> o;
    private final List<Io> X;

    @Override
    public List<Io> E() {
        return this.X;
    }

    public @UnmodifiableView List<h4> B() {
        return this.o;
    }

    public static ed g() {
        return new ed();
    }

    e4(String string, List<Io> list, List<h4> list2) {
        super(string);
        this.X = list;
        this.o = list2;
    }
}

