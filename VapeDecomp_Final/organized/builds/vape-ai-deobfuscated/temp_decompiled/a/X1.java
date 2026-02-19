/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package a;

import a.O_;
import a.jE;
import a.xi;
import com.google.gson.JsonObject;

public class x1
extends xi {
    private static O_ b(O_ o_2) {
        return o_2;
    }

    public x1(String string) {
        super(string);
    }

    public void l(JsonObject jsonObject) {
        for (jE<?, ?> jE2 : this.F()) {
            try {
                if (!jE2.g(jsonObject)) continue;
                jE2.C(jsonObject);
            }
            catch (O_ o_2) {
                throw x1.b(o_2);
            }
        }
    }
}

