/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Rr;
import com.exception.system.CustomSystemException;
import java.util.List;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public class SX {
    public int P;
    public String U;
    public List<String> I;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void E(Rr rr) {
        String[] stringArray;
        int n;
        String string;
        Rr rr2;
        try {
            rr2 = rr;
            string = this.U;
            n = this.P;
            stringArray = this.I == null ? null : this.I.toArray(new String[0]);
        }
        catch (CustomSystemException customSystemException) {
            throw SX.a(customSystemException);
        }
        rr2.m(string, n, stringArray);
    }

    public SX(String string, int n, List<String> list) {
        this.U = string;
        this.P = n;
        this.I = list;
    }
}

