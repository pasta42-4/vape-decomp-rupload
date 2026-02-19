/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.SE;
import a.XM;
import java.util.concurrent.atomic.AtomicReference;

public class Nm {
    private static String[] S;
    private final AtomicReference<XM> N = new AtomicReference();

    public static void W(String[] stringArray) {
        S = stringArray;
    }

    public Nm() {
        this.O();
    }

    static {
        if (Nm.N() != null) {
            Nm.W(new String[5]);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void P() {
        if (this.N.get() != null) {
            XM xM2 = this.N.get();
            try {
                this.N.set(null);
                if (!this.T()) {
                    xM2.z(this.L());
                }
            }
            catch (O_ o_2) {
                throw Nm.a(o_2);
            }
        }
    }

    private void lambda$startSoundThread$0() {
        while (!SE.h.Q) {
            try {
                Thread.sleep(100L);
                this.P();
            }
            catch (Exception exception) {
                SE.W(exception);
            }
        }
    }

    public float L() {
        return ((Double)SE.h.F().M.J()).floatValue();
    }

    public boolean T() {
        return SE.h.F().G.s();
    }

    public static String[] N() {
        return S;
    }

    public void m(XM xM2) {
        this.N.set(xM2);
    }

    public void O() {
        new Thread(this::lambda$startSoundThread$0).start();
    }
}

