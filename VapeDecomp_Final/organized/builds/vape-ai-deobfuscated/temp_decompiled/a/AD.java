/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Ir;
import a.O_;
import a.W8;
import java.util.Comparator;
import org.jetbrains.annotations.Nullable;

public class ad<T extends ad<T>> {
    private String a;
    @Nullable
    private Comparator<Ir> D;
    private String N;
    private String E;
    private static int g;
    private W8 r;
    @Nullable
    private String P;

    public T p(String string) {
        this.a = string;
        return (T)this;
    }

    protected ad() {
    }

    public T R(String string) {
        this.P = string;
        return (T)this;
    }

    public static int P() {
        int n2 = ad.Y();
        try {
            if (n2 == 0) {
                return 5;
            }
        }
        catch (O_ o_2) {
            throw ad.a(o_2);
        }
        return 0;
    }

    public T b(@Nullable Comparator<Ir> comparator) {
        this.D = comparator;
        return (T)this;
    }

    protected ad(ad<?> ad2) {
        this.E = ad2.H();
        this.N = ad2.E();
        this.a = ad2.O();
        this.r = ad2.a();
        this.D = ad2.G();
    }

    public static void m(int n2) {
        g = n2;
    }

    public T t(String string) {
        this.N = string;
        return (T)this;
    }

    public String H() {
        return this.E;
    }

    public W8 a() {
        return this.r;
    }

    public T c(String string) {
        this.E = string;
        return (T)this;
    }

    public T n(W8 w82) {
        this.r = w82;
        return (T)this;
    }

    public String E() {
        return this.N;
    }

    @Nullable
    public Comparator<Ir> G() {
        return this.D;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public String U() {
        return this.P;
    }

    public String O() {
        return this.a;
    }

    static {
        if (ad.P() != 0) {
            ad.m(81);
        }
    }

    public static int Y() {
        return g;
    }
}

