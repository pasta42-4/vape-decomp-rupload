/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Zl;
import a.eq;
import a.k3;
import a.s5;
import a.v4;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class sx
extends s5 {
    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    @Override
    public s5 O(eq eq2, Map<String, String> map) {
        k3 k32 = new k3(this.b, this.D, eq2, map);
        try {
            k32.K();
            return new sx(eq2, this.n(), k32.S());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public sx(eq eq2, String string, byte[] byArray) {
        super(eq2, string, byArray);
    }

    public String toString() {
        v4[] v4Array = this.p();
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (true) {
            block4: {
                try {
                    while (n2 < v4Array.length) {
                        stringBuilder.append(v4Array[n2++].toString());
                        if (n2 == v4Array.length) continue;
                        break block4;
                    }
                    break;
                }
                catch (RuntimeException runtimeException) {
                    throw sx.a(runtimeException);
                }
            }
            stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }

    public v4[] p() {
        try {
            return new Zl(this.b, this.D).A();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    sx(eq eq2, int n2, DataInputStream dataInputStream) throws IOException {
        super(eq2, n2, dataInputStream);
    }
}

