/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.O_;
import a.rZ;
import java.awt.Color;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class rn
extends rZ<Color> {
    private int V;
    private int K;
    private Color D;
    private int N;
    private int a;
    private int B;
    private Color W;
    private static String[] l;
    private int Q;
    private int L;
    private int w;

    public Color k() {
        double d2 = this.k();
        try {
            if (d2 == 0.0) {
                return this.D;
            }
        }
        catch (O_ o_2) {
            throw rn.a(o_2);
        }
        try {
            if (d2 == 100.0) {
                return this.W;
            }
        }
        catch (O_ o_3) {
            throw rn.a(o_3);
        }
        int n2 = this.V + (int)(this.k() * (double)this.B / 100.0);
        int n3 = this.w + (int)(this.k() * (double)this.K / 100.0);
        int n4 = this.Q + (int)(this.k() * (double)this.L / 100.0);
        int n5 = this.a + (int)(this.k() * (double)this.N / 100.0);
        return new Color(n2, n3, n4, n5);
    }

    public void B(Color color) {
        this.D = color;
        this.V = color.getRed();
        this.w = color.getGreen();
        this.Q = color.getBlue();
        this.a = color.getAlpha();
        this.B = this.W.getRed() - this.V;
        this.K = this.W.getGreen() - this.w;
        this.L = this.W.getBlue() - this.Q;
        this.N = this.W.getAlpha() - this.a;
    }

    public static void B(String[] stringArray) {
        l = stringArray;
    }

    public static String[] K() {
        return l;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public rn(double d2, @Nullable Color color, @Nullable Color color2) {
        super(d2);
        Color color3;
        try {
            this.D = color != null ? color : new Color(0, 0, 0, 0);
            rn rn2 = this;
            color3 = color2 != null ? color2 : new Color(0, 0, 0, 0);
        }
        catch (O_ o_2) {
            throw rn.a(o_2);
        }
        rn2.W = color3;
        this.V = this.D.getRed();
        this.w = this.D.getGreen();
        this.Q = this.D.getBlue();
        this.a = this.D.getAlpha();
        this.B = this.W.getRed() - this.V;
        this.K = this.W.getGreen() - this.w;
        this.L = this.W.getBlue() - this.Q;
        this.N = this.W.getAlpha() - this.a;
    }

    public Color K() {
        return this.D;
    }

    static {
        if (rn.K() != null) {
            rn.B(new String[1]);
        }
    }

    public Color Q() {
        return this.W;
    }

    public void O(Color color) {
        this.W = color;
        this.B = color.getRed() - this.V;
        this.K = color.getGreen() - this.w;
        this.L = color.getBlue() - this.Q;
        this.N = color.getAlpha() - this.a;
    }
}

