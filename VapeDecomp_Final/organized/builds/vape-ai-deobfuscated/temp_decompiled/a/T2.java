/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Hc;
import a.Na;
import a.O_;
import a.SE;
import a.kX;
import a.qG;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class t2
extends Hc {
    public int A(int n2) {
        try {
            if (kX.C() >= 35) {
                SE.k();
                return -1;
            }
        }
        catch (O_ o_2) {
            throw t2.a(o_2);
        }
        return qG.E(t2.U.u().G9, this.H, n2);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void E(boolean bl2) {
        qG.K(t2.U.u().G9, this.H, bl2);
    }

    @Override
    public IntBuffer M() {
        try {
            if (Na.MC_1_21_0.H()) {
                SE.k();
                return null;
            }
        }
        catch (O_ o_2) {
            throw t2.a(o_2);
        }
        if (kX.C() >= 35) {
            ByteBuffer byteBuffer = (ByteBuffer)qG.i(t2.U.u().G9, this.H);
            return byteBuffer.asIntBuffer();
        }
        return (IntBuffer)qG.l(t2.U.u().G9, this.H);
    }

    public t2(Object object) {
        super(object);
    }
}

