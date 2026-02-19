/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.G5;
import a.JT;
import a.O_;
import a.SE;
import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class zc {
    public static zc L = new zc();
    LinkedHashMap<String, Double> W = new LinkedHashMap();

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public double v(JT jT2) {
        try {
            if (this.W.containsKey(jT2.toString())) {
                return this.W.get(jT2.toString());
            }
        }
        catch (O_ o_2) {
            throw zc.a(o_2);
        }
        double d2 = jT2.v();
        while (true) {
            G5 g5;
            block11: {
                G5 g52;
                block10: {
                    try {
                        try {
                            try {
                                if (!(d2 >= jT2.w()) || !(d2 <= jT2.v())) break;
                            }
                            catch (O_ o_3) {
                                throw zc.a(o_3);
                            }
                            if (!jT2.A()) break block10;
                        }
                        catch (O_ o_4) {
                            throw zc.a(o_4);
                        }
                        g52 = SE.h.W().u(d2, false);
                        break block11;
                    }
                    catch (O_ o_5) {
                        throw zc.a(o_5);
                    }
                }
                g52 = g5 = SE.h.W().k(d2, false);
            }
            if (!(g5.D(jT2.t()) > jT2.x())) break;
            d2 = new BigDecimal(d2).subtract(BigDecimal.valueOf(jT2.c())).setScale(1, 4).doubleValue();
        }
        this.W.put(jT2.toString(), d2);
        return d2;
    }
}

