/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.O_;
import a.Sy;
import org.jetbrains.annotations.Nullable;

public interface k9<T> {
    private static String lambda$createStringFormatter$1(String string, String string2) {
        String string3;
        try {
            string3 = string2 != null ? string2 : string;
        }
        catch (O_ o_2) {
            throw k9.a(o_2);
        }
        return string3;
    }

    private static String lambda$createNamedFormatter$0(String string, Sy sy2) {
        String string2;
        try {
            string2 = sy2 != null ? sy2.O() : string;
        }
        catch (O_ o_2) {
            throw k9.a(o_2);
        }
        return string2;
    }

    public static <N extends Sy> k9<N> V() {
        return k9.C("");
    }

    public static <N extends Sy> k9<N> C(@Nullable String string) {
        return arg_0 -> k9.lambda$createNamedFormatter$0(string, arg_0);
    }

    public static k9<String> e() {
        return k9.R("");
    }

    public static k9<String> R(@Nullable String string) {
        return arg_0 -> k9.lambda$createStringFormatter$1(string, arg_0);
    }

    public String W(T var1);

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

