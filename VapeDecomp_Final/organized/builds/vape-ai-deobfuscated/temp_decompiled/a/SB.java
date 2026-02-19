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

public class sb
extends s5 {
    private sb(eq eq2, sb sb2, Map<String, String> map) {
        super(eq2, "Exceptions");
        this.k(sb2, map);
    }

    private void k(sb sb2, Map<String, String> map) {
        eq eq2 = sb2.D;
        eq eq3 = this.D;
        byte[] byArray = sb2.b;
        int n2 = byArray.length;
        byte[] byArray2 = new byte[n2];
        byArray2[0] = byArray[0];
        byArray2[1] = byArray[1];
        for (int i10 = 2; i10 < n2; i10 += 2) {
            int n3 = TF.M(byArray, i10);
            TF.e(eq2.X(n3, eq3, map), byArray2, i10);
        }
        this.b = byArray2;
    }

    @Override
    public s5 O(eq eq2, Map<String, String> map) {
        return new sb(eq2, this, map);
    }

    sb(eq eq2, int n2, DataInputStream dataInputStream) throws IOException {
        super(eq2, n2, dataInputStream);
    }
}

