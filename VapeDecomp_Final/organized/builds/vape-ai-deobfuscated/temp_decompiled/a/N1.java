/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 */
package a;

import a.AE;
import a.O_;
import a.SE;
import a.zz;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.HashSet;
import java.util.Set;

public class N1 {
    private final Set<zz> f = new HashSet<zz>();

    public void q(JsonArray jsonArray) {
        this.M();
        for (int i10 = 0; i10 < jsonArray.size(); ++i10) {
            JsonElement jsonElement = jsonArray.get(i10);
            try {
                try {
                    if (!jsonElement.isJsonObject() || jsonElement.isJsonNull()) {
                        continue;
                    }
                }
                catch (O_ o_2) {
                    throw N1.a(o_2);
                }
            }
            catch (O_ o_3) {
                throw N1.a(o_3);
            }
            zz zz2 = new zz(jsonElement.getAsJsonObject());
            this.k(zz2);
        }
    }

    public JsonArray u() {
        JsonArray jsonArray = new JsonArray();
        for (zz zz2 : this.f) {
            jsonArray.add((JsonElement)zz2.z());
        }
        return jsonArray;
    }

    public void M() {
        for (zz zz2 : new HashSet<zz>(this.f)) {
            this.Y(zz2);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public Set<zz> c() {
        return this.f;
    }

    public void Y(zz zz2) {
        if (zz2 != null) {
            AE aE2 = SE.h.U().K(AE.class);
            this.f.remove(zz2);
            aE2.o(zz2);
        }
    }

    public void k(zz zz2) {
        this.f.add(zz2);
        AE aE2 = SE.h.U().K(AE.class);
        aE2.k(zz2);
    }
}

