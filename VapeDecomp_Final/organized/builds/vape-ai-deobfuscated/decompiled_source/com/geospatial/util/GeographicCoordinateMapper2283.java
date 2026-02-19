/*
 * Decompiled with CFR 0.152.
 */
package com.geospatial.util;

class GeographicCoordinateMapper2283<First, Second> {
    private First n;
    private Second Q;

    GeographicCoordinateMapper2283<First, Second> f(First First2) {
        this.n = First2;
        return this;
    }

    First C() {
        return this.n;
    }

    GeographicCoordinateMapper2283(First First2, Second Second) {
        this.n = First2;
        this.Q = Second;
    }

    public GeographicCoordinateMapper2283<First, Second> w(Second Second) {
        this.Q = Second;
        return this;
    }

    Second h() {
        return this.Q;
    }
}

