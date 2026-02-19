/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.UnmodifiableView
 */
package a;

import a.O_;
import a.hF;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

public abstract class kw
implements hF {
    @Nullable
    private Comparator<String> h = kw::lambda$new$0;
    private static int[] x;
    private boolean v = false;
    private List<String> d;

    @Override
    public @UnmodifiableView List<String> U() {
        return this.d;
    }

    public static void O(int[] nArray) {
        x = nArray;
    }

    private List<String> D(String string) {
        ArrayList<String> arrayList;
        block15: {
            arrayList = new ArrayList<String>();
            try {
                try {
                    if (this.e() || !string.isEmpty()) break block15;
                }
                catch (O_ o_2) {
                    throw kw.b(o_2);
                }
                return arrayList;
            }
            catch (O_ o_3) {
                throw kw.b(o_3);
            }
        }
        List<String> list = this.m();
        String string2 = string.toLowerCase();
        if (list != null) {
            for (String string3 : list) {
                try {
                    block16: {
                        try {
                            try {
                                if (this.e() && string2.isEmpty()) break block16;
                            }
                            catch (O_ o_4) {
                                throw kw.b(o_4);
                            }
                            if (!string3.toLowerCase().startsWith(string2)) continue;
                        }
                        catch (O_ o_5) {
                            throw kw.b(o_5);
                        }
                    }
                    arrayList.add(string3);
                }
                catch (O_ o_6) {
                    throw kw.b(o_6);
                }
            }
        }
        Comparator<String> comparator = this.h;
        try {
            if (comparator != null) {
                arrayList.sort(comparator);
            }
        }
        catch (O_ o_7) {
            throw kw.b(o_7);
        }
        return arrayList;
    }

    @Override
    public void R(String string) {
        this.d = this.D(string);
    }

    public kw() {
        this.R("");
    }

    @Override
    public void b(@Nullable Comparator<String> comparator) {
        this.h = comparator;
    }

    @Override
    public boolean e() {
        return this.v;
    }

    @Override
    @Nullable
    public Comparator<String> C() {
        return this.h;
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }

    static {
        if (kw.D() != null) {
            kw.O(new int[3]);
        }
    }

    public static int[] D() {
        return x;
    }

    @Override
    public void I(boolean bl2) {
        this.v = bl2;
    }

    private static int lambda$new$0(String string, String string2) {
        return string.compareToIgnoreCase(string2);
    }
}

