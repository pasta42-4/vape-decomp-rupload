/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.eq;
import a.s5;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class s8
extends s5 {
    s8(eq eq2, int n2, DataInputStream dataInputStream) throws IOException {
        super(eq2, n2, dataInputStream);
    }

    @Override
    public s5 O(eq eq2, Map<String, String> map) {
        return new s8(eq2);
    }

    public s8(eq eq2) {
        super(eq2, "Deprecated", new byte[0]);
    }
}

