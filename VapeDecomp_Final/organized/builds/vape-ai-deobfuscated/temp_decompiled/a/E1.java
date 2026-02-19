/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.ht;
import java.awt.Color;
import java.util.concurrent.atomic.AtomicBoolean;

public class e1 {
    public AtomicBoolean h;
    public int n;
    public Color Z;
    private static ht[] f;
    public int N;
    public int D;
    public int x;

    public boolean D() {
        try {
            if (this.h == null) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw e1.a(o_2);
        }
        return this.h.get();
    }

    static {
        if (e1.R() != null) {
            e1.U(new ht[2]);
        }
    }

    public static void U(ht[] htArray) {
        f = htArray;
    }

    public int g() {
        return this.N;
    }

    public e1(int n2, int n3, int n4, int n5, Color color) {
        this(n2, n3, n4, n5, color, null);
    }

    public int c() {
        return this.D;
    }

    public e1(int n2, int n3, int n4, int n5, Color color, AtomicBoolean atomicBoolean) {
        this.N = n2;
        this.n = n3;
        this.D = n4;
        this.x = n5;
        this.Z = color;
        this.h = atomicBoolean;
    }

    public static ht[] R() {
        return f;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public int Z() {
        return this.n;
    }
}

