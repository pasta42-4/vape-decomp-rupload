/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.S5;
import java.util.HashMap;

public class cj {
    private static boolean Z;
    public static boolean i;
    private HashMap<String, String> z = new HashMap();

    static {
        i = false;
        cj.J(true);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static void J(boolean bl2) {
        Z = bl2;
    }

    public String Z(String string) {
        return this.z.getOrDefault(string, null);
    }

    public void I(String string, String string2) {
        String string3 = this.z.get(string);
        this.z.put(string, string2);
        if (i) {
            String string4;
            String string5 = S5.Y(string);
            try {
                string4 = string5 != null ? string5 : string;
            }
            catch (O_ o_2) {
                throw cj.a(o_2);
            }
            S5.U(string4, string2);
        }
    }

    public static boolean X() {
        return Z;
    }

    public static boolean x() {
        boolean bl2 = cj.X();
        try {
            if (!bl2) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw cj.a(o_2);
        }
        return false;
    }
}

