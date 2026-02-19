/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.TF;
import a.eq;
import a.s5;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class sq
extends s5 {
    sq(eq eq2, int n2, DataInputStream dataInputStream) throws IOException {
        super(eq2, n2, dataInputStream);
    }

    @Override
    public s5 O(eq eq2, Map<String, String> map) {
        int n2 = this.K().X(this.X(), eq2, map);
        return new sq(eq2, n2);
    }

    public sq(eq eq2, int n2) {
        super(eq2, "ConstantValue");
        byte[] byArray = new byte[]{(byte)(n2 >>> 8), (byte)n2};
        this.p(byArray);
    }

    public int X() {
        return TF.M(this.p(), 0);
    }
}

