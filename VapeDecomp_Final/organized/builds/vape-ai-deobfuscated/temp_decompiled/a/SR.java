/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.TF;
import a._s;
import a.eq;
import a.s5;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class sr
extends s5 {
    public int U(int n2) {
        return TF.M(this.b, n2 * 10 + 4);
    }

    public sr(eq eq2) {
        super(eq2, "LocalVariableTable", new byte[2]);
        TF.e(0, this.b, 0);
    }

    public int o() {
        return TF.M(this.b, 0);
    }

    public int E(int n2) {
        return TF.M(this.b, n2 * 10 + 6);
    }

    public String l(int n2) {
        return this.K().Z(this.K(n2));
    }

    public int R(int n2) {
        return TF.M(this.b, n2 * 10 + 2);
    }

    sr(eq eq2, int n2, DataInputStream dataInputStream) throws IOException {
        super(eq2, n2, dataInputStream);
    }

    sr(eq eq2, String string, byte[] byArray) {
        super(eq2, string, byArray);
    }

    public void D(int n2, int n3, int n4, int n5, int n6) {
        int n7 = this.b.length;
        byte[] byArray = new byte[n7 + 10];
        TF.e(this.o() + 1, byArray, 0);
        try {
            for (int i10 = 2; i10 < n7; ++i10) {
                byArray[i10] = this.b[i10];
            }
        }
        catch (O_ o_2) {
            throw sr.a(o_2);
        }
        TF.e(n2, byArray, n7);
        TF.e(n3, byArray, n7 + 2);
        TF.e(n4, byArray, n7 + 4);
        TF.e(n5, byArray, n7 + 6);
        TF.e(n6, byArray, n7 + 8);
        this.b = byArray;
    }

    public String T(int n2) {
        return this.K().Z(this.E(n2));
    }

    void g(int n2, int n3, boolean bl2) {
        int n4 = this.o();
        for (int i10 = 0; i10 < n4; ++i10) {
            int n5;
            int n6;
            int n7;
            block16: {
                n7 = i10 * 10 + 2;
                n6 = TF.M(this.b, n7);
                n5 = TF.M(this.b, n7 + 2);
                try {
                    block15: {
                        try {
                            try {
                                try {
                                    if (n6 > n2) break block15;
                                    if (!bl2) break block16;
                                }
                                catch (O_ o_2) {
                                    throw sr.a(o_2);
                                }
                                if (n6 != n2) break block16;
                            }
                            catch (O_ o_3) {
                                throw sr.a(o_3);
                            }
                            if (n6 == 0) break block16;
                        }
                        catch (O_ o_4) {
                            throw sr.a(o_4);
                        }
                    }
                    TF.e(n6 + n3, this.b, n7);
                    continue;
                }
                catch (O_ o_5) {
                    throw sr.a(o_5);
                }
            }
            try {
                block17: {
                    try {
                        try {
                            if (n6 + n5 > n2) break block17;
                            if (!bl2) continue;
                        }
                        catch (O_ o_6) {
                            throw sr.a(o_6);
                        }
                        if (n6 + n5 != n2) continue;
                    }
                    catch (O_ o_7) {
                        throw sr.a(o_7);
                    }
                }
                TF.e(n5 + n3, this.b, n7 + 2);
                continue;
            }
            catch (O_ o_8) {
                throw sr.a(o_8);
            }
        }
    }

    public int K(int n2) {
        return TF.M(this.b, n2 * 10 + 8);
    }

    public int z(int n2) {
        return TF.M(this.b, n2 * 10 + 10);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public s5 O(eq eq2, Map<String, String> map) {
        byte[] byArray = this.p();
        byte[] byArray2 = new byte[byArray.length];
        eq eq3 = this.K();
        sr sr2 = this.f(eq2, byArray2);
        int n2 = TF.M(byArray, 0);
        TF.e(n2, byArray2, 0);
        int n3 = 2;
        for (int i10 = 0; i10 < n2; ++i10) {
            int n4 = TF.M(byArray, n3);
            int n5 = TF.M(byArray, n3 + 2);
            int n6 = TF.M(byArray, n3 + 4);
            int n7 = TF.M(byArray, n3 + 6);
            int n8 = TF.M(byArray, n3 + 8);
            TF.e(n4, byArray2, n3);
            TF.e(n5, byArray2, n3 + 2);
            if (n6 != 0) {
                n6 = eq3.X(n6, eq2, null);
            }
            TF.e(n6, byArray2, n3 + 4);
            if (n7 != 0) {
                String string = eq3.Z(n7);
                string = _s.z(string, map);
                n7 = eq2.D(string);
            }
            TF.e(n7, byArray2, n3 + 6);
            TF.e(n8, byArray2, n3 + 8);
            n3 += 10;
        }
        return sr2;
    }

    sr f(eq eq2, byte[] byArray) {
        return new sr(eq2, "LocalVariableTable", byArray);
    }
}

