/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.BW;
import a.Ir;
import a.QX;
import a.Sy;
import a.V4;
import a.W8;
import a.aZ;
import a.hK;
import java.util.Comparator;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public interface h4
extends Sy,
hK {
    public static aZ Y() {
        return new aZ();
    }

    default public void G(BW bW2) {
    }

    public W8 j();

    default public BW A() {
        return null;
    }

    @Nullable
    public Comparator<Ir> k();

    public boolean L(V4 var1, QX var2);

    @Nullable
    public String Y();

    default public boolean i(V4 v42) {
        return this.L(v42, v42.C());
    }

    public String w();
}

