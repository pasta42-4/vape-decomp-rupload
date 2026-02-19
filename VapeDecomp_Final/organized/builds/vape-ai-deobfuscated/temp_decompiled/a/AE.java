/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.DT;
import a.O_;
import a.QF;
import a.oQ;
import a.on;
import a.sy;

public class ae {
    private static int[] f;
    private final long A = System.currentTimeMillis();
    private double T;
    private float k;
    private float s;
    private double U;
    private double M;

    public long u() {
        return this.A;
    }

    public static int[] t() {
        return f;
    }

    public double h() {
        return this.T;
    }

    public void W(double d2, double d3, double d4) {
        this.T = d2;
        this.U = d3;
        this.M = d4;
    }

    public void Z(double d2) {
        this.M = d2;
    }

    public double z(QF qF2) {
        return sy.O(new double[]{qF2.F() - this.T, qF2.V() - this.U, qF2.B() - this.M});
    }

    public static void Y(int[] nArray) {
        f = nArray;
    }

    public static double d(ae ae2, ae ae3) {
        block4: {
            DT dT = ae.G(ae2);
            float[] fArray = ae.J(ae2.h(), ae2.i(), ae2.I(), ae3.h(), ae3.i(), ae3.I());
            DT dT2 = ae.g(fArray[0], fArray[1]);
            DT dT3 = dT.A(dT2.X() * Double.MAX_VALUE, dT2.F() * Double.MAX_VALUE, dT2.f() * Double.MAX_VALUE);
            oQ oQ2 = ae.a(ae3.h(), ae3.i(), ae3.I()).B(0.1, 0.1, 0.1);
            on on2 = oQ2.x(dT, dT3);
            try {
                try {
                    if (on2 == null || !on2.r()) break block4;
                }
                catch (O_ o_2) {
                    throw ae.a(o_2);
                }
                return dT.x(on2.i());
            }
            catch (O_ o_3) {
                throw ae.a(o_3);
            }
        }
        return 0.0;
    }

    public void W(double d2) {
        this.T = d2;
    }

    public static DT G(ae ae2) {
        return DT.N(ae2.h(), ae2.i() + 1.62, ae2.I());
    }

    public double i() {
        return this.U;
    }

    public float k() {
        return this.s;
    }

    public double K(ae ae2) {
        return sy.O(ae2.T - this.T, ae2.M - this.M);
    }

    public float Z() {
        return this.k;
    }

    public double X(QF qF2) {
        return sy.O(qF2.F() - this.T, qF2.B() - this.M);
    }

    public static oQ a(double d2, double d3, double d4) {
        return oQ.E(d2 - 0.3, d3, d4 - 0.3, d2 + 0.3, d3 + 1.8, d4 + 0.3);
    }

    private static DT g(float f10, float f11) {
        float f12 = sy.S(-f10 * ((float)Math.PI / 180) - (float)Math.PI);
        float f13 = sy.D(-f10 * ((float)Math.PI / 180) - (float)Math.PI);
        float f14 = -sy.S(-f11 * ((float)Math.PI / 180));
        float f15 = sy.D(-f11 * ((float)Math.PI / 180));
        return DT.N(f13 * f14, f15, f12 * f14);
    }

    public void y(float f10) {
        this.k = f10;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void T(double d2) {
        this.U = d2;
    }

    public ae(double d2, double d3, double d4, float f10, float f11) {
        this.T = d2;
        this.U = d3;
        this.M = d4;
        this.k = f10;
        this.s = f11;
    }

    public ae(double d2, double d3, double d4) {
        this.T = d2;
        this.U = d3;
        this.M = d4;
    }

    public double X(ae ae2) {
        return sy.O(new double[]{ae2.T - this.T, ae2.U - this.U, ae2.M - this.M});
    }

    public void H(float f10) {
        this.s = f10;
    }

    public static float[] J(double d2, double d3, double d4, double d5, double d6, double d7) {
        float f10;
        float f11;
        block5: {
            double d9;
            double d10;
            block4: {
                d10 = d5 - d2;
                double d11 = d6 - d3;
                d9 = d7 - d4;
                double d12 = sy.C(d10 * d10 + d9 * d9);
                f11 = (float)Math.toDegrees(-Math.atan(d10 / d9));
                f10 = (float)(-Math.toDegrees(Math.atan(d11 / d12)));
                try {
                    if (!(d9 < 0.0) || !(d10 < 0.0)) break block4;
                }
                catch (O_ o_2) {
                    throw ae.a(o_2);
                }
                f11 = (float)(90.0 + Math.toDegrees(Math.atan(d9 / d10)));
                break block5;
            }
            try {
                if (!(d9 < 0.0) || !(d10 > 0.0)) break block5;
            }
            catch (O_ o_3) {
                throw ae.a(o_3);
            }
            f11 = (float)(-90.0 + Math.toDegrees(Math.atan(d9 / d10)));
        }
        return new float[]{f11, f10};
    }

    public double I() {
        return this.M;
    }

    static {
        if (ae.t() == null) {
            ae.Y(new int[3]);
        }
    }
}

