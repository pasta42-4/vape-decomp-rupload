/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.FM;
import a.HK;
import a.O_;
import a.iN;
import java.util.HashMap;
import java.util.Map;

public class ic
extends iN<ic, HK> {
    private boolean x;
    private Class<?>[] K;
    private final Map<FM, Class[]> I = new HashMap<FM, Class[]>();

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public HK M() {
        try {
            if (this.Y()) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw ic.a(o_2);
        }
        return HK.I(this);
    }

    public ic H(FM fM2, Class ... classArray) {
        this.I.put(fM2, classArray);
        return this;
    }

    public ic l(boolean bl2) {
        this.x = bl2;
        return this;
    }

    public Class<?>[] I() {
        if (!this.I.isEmpty()) {
            for (Map.Entry<FM, Class[]> entry : this.I.entrySet()) {
                try {
                    if (!entry.getKey().m()) continue;
                    return entry.getValue();
                }
                catch (O_ o_2) {
                    throw ic.a(o_2);
                }
            }
        }
        return this.K;
    }

    public ic q(Class<?>[] classArray) {
        this.K = classArray;
        return this;
    }

    public boolean t() {
        return this.x;
    }
}

