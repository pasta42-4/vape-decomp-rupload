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

public class sd
extends s5 {
    sd(eq eq2, int n2, DataInputStream dataInputStream) throws IOException {
        super(eq2, n2, dataInputStream);
    }

    @Override
    public s5 O(eq eq2, Map<String, String> map) {
        return new sd(eq2, this.T());
    }

    public sd(eq eq2, String string) {
        super(eq2, "SourceFile");
        int n2 = eq2.D(string);
        byte[] byArray = new byte[]{(byte)(n2 >>> 8), (byte)n2};
        this.p(byArray);
    }

    public String T() {
        return this.K().Z(TF.M(this.p(), 0));
    }
}

