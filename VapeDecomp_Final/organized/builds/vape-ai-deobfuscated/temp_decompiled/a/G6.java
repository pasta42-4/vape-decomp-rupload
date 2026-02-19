/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.GU;
import a.Gd;
import a.O_;
import a.lN;

public class G6
extends GU {
    public static G6 z = new G6("java.lang.Object", null);
    String V;
    lN[] r;

    @Override
    public String y() {
        StringBuilder stringBuilder = new StringBuilder();
        G6 g6 = this.A();
        try {
            if (g6 != null) {
                stringBuilder.append(g6.y()).append('$');
            }
        }
        catch (O_ o_2) {
            throw G6.a(o_2);
        }
        return this.q(stringBuilder);
    }

    public G6 A() {
        return null;
    }

    G6(String string, int n2, int n3, lN[] lNArray) {
        this.V = string.substring(n2, n3).replace('/', '.');
        this.r = lNArray;
    }

    static G6 z(String string, int n2, int n3, lN[] lNArray, G6 g6) {
        try {
            if (g6 == null) {
                return new G6(string, n2, n3, lNArray);
            }
        }
        catch (O_ o_2) {
            throw G6.a(o_2);
        }
        return new Gd(string, n2, n3, lNArray, g6);
    }

    private String q(StringBuilder stringBuilder) {
        stringBuilder.append(this.V);
        if (this.r != null) {
            stringBuilder.append('<');
            int n2 = this.r.length;
            int n3 = 0;
            while (true) {
                block6: {
                    try {
                        try {
                            if (n3 >= n2) break;
                            if (n3 <= 0) break block6;
                        }
                        catch (O_ o_2) {
                            throw G6.a(o_2);
                        }
                        stringBuilder.append(", ");
                    }
                    catch (O_ o_3) {
                        throw G6.a(o_3);
                    }
                }
                stringBuilder.append(this.r[n3].toString());
                ++n3;
            }
            stringBuilder.append('>');
        }
        return stringBuilder.toString();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        G6 g6 = this.A();
        try {
            if (g6 != null) {
                stringBuilder.append(g6.toString()).append('.');
            }
        }
        catch (O_ o_2) {
            throw G6.a(o_2);
        }
        return this.q(stringBuilder);
    }

    public G6(String string, lN[] lNArray) {
        this.V = string;
        this.r = lNArray;
    }
}

