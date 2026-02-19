/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package a;

import a.O_;
import a.Ok;
import a.V4;
import a.i_;
import a.ie;
import com.google.gson.JsonObject;
import java.util.List;

public class iF
extends i_<iF> {
    public iF(JsonObject jsonObject) {
        super(jsonObject);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public boolean T(V4 v42) {
        try {
            if (v42.Y()) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw iF.a(o_2);
        }
        List<String> list = v42.n();
        for (String string : list) {
            try {
                if (!this.M().T(string, this.u())) continue;
                return true;
            }
            catch (O_ o_3) {
                throw iF.a(o_3);
            }
        }
        return false;
    }

    public iF(List<String> list, ie ie2) {
        super(list, ie2);
    }

    public iF() {
    }

    public iF u() {
        return new iF(this.u(), this.M());
    }

    @Override
    public Ok A() {
        return Ok.LORE;
    }
}

