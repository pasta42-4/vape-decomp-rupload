/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.L0;
import a.YQ;
import a.Yg;
import a.Yh;
import a.Ym;
import a.a7;
import a.eq;
import a.s5;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Map;

public class sn
extends s5 {
    void X(int n2, int n3, boolean bl2) throws a7 {
        new YQ(this, n2, n3).c();
        new Yh(this, n2, n3, bl2).s();
    }

    @Override
    void f(DataOutputStream dataOutputStream) throws IOException {
        super.f(dataOutputStream);
    }

    sn(eq eq2, int n2, DataInputStream dataInputStream) throws IOException {
        super(eq2, n2, dataInputStream);
    }

    @Override
    public s5 O(eq eq2, Map<String, String> map) throws L0 {
        try {
            return new sn(eq2, new Yg(this.D, this.b, eq2, map).b());
        }
        catch (a7 a72) {
            throw new L0("bad bytecode. fatal?");
        }
    }

    void n(int n2, int n3) throws a7 {
        new Ym(this, n2, n3).s();
    }

    sn(eq eq2, byte[] byArray) {
        super(eq2, "StackMapTable", byArray);
    }
}

