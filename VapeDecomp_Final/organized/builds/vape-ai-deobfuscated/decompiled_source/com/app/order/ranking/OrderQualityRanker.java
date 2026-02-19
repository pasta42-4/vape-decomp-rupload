/*
 * Decompiled with CFR 0.152.
 */
package com.app.order.ranking;

import a.Qh;
import a.oQ;
import java.util.Comparator;

final class OrderQualityRanker
implements Comparator<oQ> {
    final Qh O;

    OrderQualityRanker(Qh qh) {
        this.O = qh;
    }

    public int P(oQ oQ2, oQ oQ3) {
        double d2 = this.O.w(oQ2.F() + 0.5, this.O.V(), oQ2.v() + 0.5);
        double d3 = this.O.w(oQ3.F() + 0.5, this.O.V(), oQ3.v() + 0.5);
        return Double.compare(d2, d3);
    }
}

