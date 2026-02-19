/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.eq;
import a.sr;
import java.io.DataInputStream;
import java.io.IOException;

public class s9
extends sr {
    private s9(eq eq2, byte[] byArray) {
        super(eq2, "LocalVariableTypeTable", byArray);
    }

    s9(eq eq2, int n2, DataInputStream dataInputStream) throws IOException {
        super(eq2, n2, dataInputStream);
    }

    @Override
    sr f(eq eq2, byte[] byArray) {
        return new s9(eq2, byArray);
    }
}

