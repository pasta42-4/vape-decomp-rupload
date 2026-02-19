/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Nb;
import a.O_;
import a.W6;
import a._s;
import a.eq;
import java.util.LinkedHashMap;
import java.util.Map;

public class v4 {
    int r;
    Map<String, Nb> k;
    eq K;

    public boolean equals(Object object) {
        Map<String, Nb> map;
        block21: {
            boolean bl2;
            block23: {
                block22: {
                    block20: {
                        try {
                            if (object == this) {
                                return true;
                            }
                        }
                        catch (O_ o_2) {
                            throw v4.a(o_2);
                        }
                        try {
                            try {
                                if (object != null && object instanceof v4) break block20;
                            }
                            catch (O_ o_3) {
                                throw v4.a(o_3);
                            }
                            return false;
                        }
                        catch (O_ o_4) {
                            throw v4.a(o_4);
                        }
                    }
                    v4 v42 = (v4)object;
                    try {
                        if (!this.G().equals(v42.G())) {
                            return false;
                        }
                    }
                    catch (O_ o_5) {
                        throw v4.a(o_5);
                    }
                    map = v42.k;
                    try {
                        if (this.k == map) {
                            return true;
                        }
                    }
                    catch (O_ o_6) {
                        throw v4.a(o_6);
                    }
                    try {
                        try {
                            if (this.k != null) break block21;
                            if (map != null) break block22;
                        }
                        catch (O_ o_7) {
                            throw v4.a(o_7);
                        }
                        bl2 = true;
                        break block23;
                    }
                    catch (O_ o_8) {
                        throw v4.a(o_8);
                    }
                }
                bl2 = false;
            }
            return bl2;
        }
        try {
            if (map == null) {
                return false;
            }
        }
        catch (O_ o_9) {
            throw v4.a(o_9);
        }
        return this.k.equals(map);
    }

    public v4(int n2, eq eq2) {
        this.K = eq2;
        this.r = n2;
        this.k = null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('@');
        stringBuilder.append(this.G());
        if (this.k != null) {
            stringBuilder.append('(');
            for (String string : this.k.keySet()) {
                stringBuilder.append(string).append('=').append(this.L(string)).append(", ");
            }
            stringBuilder.setLength(stringBuilder.length() - 2);
            stringBuilder.append(')');
        }
        return stringBuilder.toString();
    }

    public String G() {
        return _s.B(this.K.Z(this.r));
    }

    public int hashCode() {
        int n2;
        int n3;
        try {
            n3 = this.G().hashCode();
            n2 = this.k == null ? 0 : this.k.hashCode();
        }
        catch (O_ o_2) {
            throw v4.a(o_2);
        }
        return n3 + n2;
    }

    public void A(int n2, W6 w62) {
        Nb nb = new Nb();
        nb.C = n2;
        nb.X = w62;
        this.p(nb);
    }

    private void p(Nb nb) {
        String string = this.K.Z(nb.C);
        try {
            if (this.k == null) {
                this.k = new LinkedHashMap<String, Nb>();
            }
        }
        catch (O_ o_2) {
            throw v4.a(o_2);
        }
        this.k.put(string, nb);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public W6 L(String string) {
        block4: {
            try {
                try {
                    if (this.k != null && this.k.get(string) != null) break block4;
                }
                catch (O_ o_2) {
                    throw v4.a(o_2);
                }
                return null;
            }
            catch (O_ o_3) {
                throw v4.a(o_3);
            }
        }
        return this.k.get((Object)string).X;
    }
}

