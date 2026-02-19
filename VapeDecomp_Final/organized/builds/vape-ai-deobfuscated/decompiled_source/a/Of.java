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
public class Of {
    public List<String> B;
    public String t;
    public int y;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void F(Rr rr) {
        String[] stringArray;
        int n;
        String string;
        Rr rr2;
        try {
            rr2 = rr;
            string = this.t;
            n = this.y;
            stringArray = this.B == null ? null : this.B.toArray(new String[0]);
        }
        catch (CustomSystemException customSystemException) {
            throw Of.a(customSystemException);
        }
        rr2.f(string, n, stringArray);
    }

    public Of(String string, int n, List<String> list) {
        this.t = string;
        this.y = n;
        this.B = list;
    }
}

