/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.exception.system.CustomSystemException;
import com.network.protocol.ProtocolEncoder;
import com.system.lifecycle.ObjectLifecycleTracker;

public class Dv
extends ObjectLifecycleTracker {
    private static boolean a;

    public int j() {
        return Dv.U.u().G7.i(this.H);
    }

    public static boolean J() {
        boolean bl = Dv.k();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Dv.b(customSystemException);
        }
        return false;
    }

    static {
        if (Dv.J()) {
            Dv.s(true);
        }
    }

    public Dv(Object object) {
        super(object);
    }

    public int q() {
        return Dv.U.u().G7.n(this.H);
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void s(boolean bl) {
        a = bl;
    }

    public int o() {
        return Dv.U.u().G7.N(this.H);
    }

    public static boolean k() {
        return a;
    }

    public static Dv q(int n, int n2, int n3) {
        return new Dv(ProtocolEncoder.H(Dv.U.u().G7).A(n, n2, n3));
    }
}

