/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.ZC;
import a.eq;
import a.s5;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class sk
extends s5 {
    @Override
    public s5 O(eq eq2, Map<String, String> map) {
        ZC zC2 = new ZC(this.b, this.D, eq2, map);
        try {
            zC2.K();
            return new sk(eq2, this.n(), zC2.S());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public sk(eq eq2, String string, byte[] byArray) {
        super(eq2, string, byArray);
    }

    sk(eq eq2, int n2, DataInputStream dataInputStream) throws IOException {
        super(eq2, n2, dataInputStream);
    }
}

