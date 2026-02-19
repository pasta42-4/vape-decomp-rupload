/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.I6;
import a.IZ;
import a.Id;
import a.In;
import a.O_;
import java.util.HashMap;

public class xp {
    public static I6<Boolean> W;
    public static I6<Boolean> Q;
    private static String u;
    private HashMap<I6<Object>, Object> J = new HashMap();
    public static I6<Boolean> q;

    static {
        q = new Id();
        xp.j(null);
        Q = new IZ();
        W = new In();
    }

    public static String n() {
        return u;
    }

    private static O_ c(O_ o_2) {
        return o_2;
    }

    public <T> void U(I6<T> i62, T t10) {
        this.J.put(i62, t10);
    }

    public static void j(String string) {
        u = string;
    }

    public <T> T E(I6<T> i62) {
        try {
            if (!this.J.containsKey(i62)) {
                return i62.F();
            }
        }
        catch (O_ o_2) {
            throw xp.c(o_2);
        }
        return (T)this.J.get(i62);
    }
}

