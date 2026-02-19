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

public class s1
extends s5 {
    private s1(eq eq2, int n2) {
        super(eq2, "NestHost", new byte[2]);
        TF.e(n2, this.p(), 0);
    }

    s1(eq eq2, int n2, DataInputStream dataInputStream) throws IOException {
        super(eq2, n2, dataInputStream);
    }

    @Override
    public s5 O(eq eq2, Map<String, String> map) {
        int n2 = TF.M(this.p(), 0);
        int n3 = this.K().X(n2, eq2, map);
        return new s1(eq2, n3);
    }
}

