/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.R8;
import java.util.LinkedHashMap;
import java.util.Map;

public class c0 {
    private final int u;
    private final Map<Short, Integer> r;
    private final float Y;
    private final float O;
    private final float M;

    public float I() {
        return this.O;
    }

    c0(R8 r82) {
        this.O = r82.o();
        this.Y = r82.o();
        this.M = r82.o();
        this.u = r82.e();
        this.r = new LinkedHashMap<Short, Integer>();
        int n2 = r82.U();
        for (int i10 = 0; i10 < n2; ++i10) {
            short s10 = r82.u();
            int n3 = r82.U();
            this.r.put(s10, n3);
        }
    }

    public c0(float f10, float f11, float f12, int n2, Map<Short, Integer> map) {
        this.O = f10;
        this.Y = f11;
        this.M = f12;
        this.u = n2;
        this.r = map;
    }

    public float a() {
        return this.Y;
    }

    public void H(R8 r82) {
        r82.l(this.O);
        r82.l(this.Y);
        r82.l(this.M);
        r82.I(this.u);
        r82.e(this.r.size());
        for (Map.Entry<Short, Integer> entry : this.r.entrySet()) {
            r82.z(entry.getKey());
            r82.e(entry.getValue());
        }
    }

    public float U() {
        return this.M;
    }

    public int P() {
        return this.u;
    }

    public Map<Short, Integer> A() {
        return this.r;
    }
}

