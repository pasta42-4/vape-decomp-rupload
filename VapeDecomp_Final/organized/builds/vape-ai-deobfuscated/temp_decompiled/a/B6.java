/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.Sz;
import a.ht;
import java.awt.Color;

public class b6
extends ht {
    double E = 110.0;
    private static String[] L;
    private double D;
    private Color V;

    @Override
    public void g() {
    }

    public static String[] R() {
        return L;
    }

    @Override
    public void U() {
        F8.A(this.G(), this.W(), this.w(), this.b(), this.V);
    }

    @Override
    public void Z(Sz sz2) {
    }

    @Override
    public double b() {
        return this.z();
    }

    public b6(Color color) {
        this(color, 0.5);
    }

    public b6(Color color, double d2, double d3) {
        this.V = color;
        this.D = d2;
        this.E = d3;
    }

    public static void Z(String[] stringArray) {
        L = stringArray;
    }

    public b6(Color color, double d2) {
        this.V = color;
        this.D = d2;
    }

    @Override
    public void G() {
        F8.A(this.G(), this.W(), this.w(), this.b(), this.V);
    }

    @Override
    public double z() {
        return this.D;
    }

    @Override
    public void d() {
    }

    static {
        if (b6.R() != null) {
            b6.Z(new String[4]);
        }
    }

    @Override
    public double e() {
        return this.E;
    }
}

