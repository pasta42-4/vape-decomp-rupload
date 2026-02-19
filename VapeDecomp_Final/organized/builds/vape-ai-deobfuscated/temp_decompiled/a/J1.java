/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HH;
import a.O_;
import a.jE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class j1<K, T extends j1<K, T>>
extends jE<K, T> {
    private final List<jE> X = new ArrayList<jE>();
    private static String S;

    public j1(Object object, String string, K k10) {
        super(object, string, k10);
    }

    public abstract boolean y();

    public jE Z() {
        for (jE jE2 : this.w()) {
            block8: {
                block9: {
                    try {
                        if (!jE2.equals(this.w().get(this.w().size() - 1))) continue;
                        if (!(jE2 instanceof j1)) break block8;
                    }
                    catch (O_ o_2) {
                        throw j1.a(o_2);
                    }
                    j1 j12 = (j1)jE2;
                    try {
                        if (j12.w().isEmpty() || !j12.y()) break block9;
                    }
                    catch (O_ o_3) {
                        throw j1.a(o_3);
                    }
                    jE jE3 = j12.w().get(j12.w().size() - 1);
                    try {
                        if (!j12.w().isEmpty()) {
                            return j12.Z();
                        }
                    }
                    catch (O_ o_4) {
                        throw j1.a(o_4);
                    }
                    return jE3;
                }
                return jE2;
            }
            return jE2;
        }
        return null;
    }

    private static boolean lambda$condNotEquals$0(Object object, Object object2) {
        boolean bl2;
        try {
            bl2 = !object2.equals(object);
        }
        catch (O_ o_2) {
            throw j1.a(o_2);
        }
        return bl2;
    }

    public T l(jE<?, ?> ... jEArray) {
        for (jE<?, ?> jE2 : jEArray) {
            jE2.k(this);
            jE2.e(this);
        }
        this.X.addAll(Arrays.asList(jEArray));
        return (T)this;
    }

    public HH c(K k10) {
        return new HH().e(this, arg_0 -> j1.lambda$condNotEquals$0(k10, arg_0));
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public List<jE> w() {
        return this.X;
    }

    static {
        if (j1.Z() != null) {
            j1.v("GbD7fb");
        }
    }

    public static void v(String string) {
        S = string;
    }

    public HH i(K k10) {
        return new HH().L(this, k10);
    }

    public static String Z() {
        return S;
    }

    public abstract boolean j(jE var1);
}

