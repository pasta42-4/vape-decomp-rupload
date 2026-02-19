/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.On;
import a.W;
import a.WJ;
import a.a7;
import a.eq;
import a.rq;
import a.rr;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class r9
extends rq {
    private String a;

    @Override
    public rr Z() {
        return null;
    }

    @Override
    public String n() {
        return this.a;
    }

    @Override
    public int G() {
        return 7;
    }

    @Override
    public void e(String string, On on2) throws a7 {
    }

    @Override
    public boolean o(rq rq2) {
        try {
            if (rq2.p()) {
                return rq2.o(this);
            }
        }
        catch (O_ o_2) {
            throw r9.a(o_2);
        }
        return this.a.equals(rq2.n());
    }

    @Override
    public rq r(int n2) throws WJ {
        try {
            if (n2 == 0) {
                return this;
            }
        }
        catch (WJ wJ2) {
            throw r9.a(wJ2);
        }
        if (n2 > 0) {
            char[] cArray = new char[n2];
            try {
                for (int i10 = 0; i10 < n2; ++i10) {
                    cArray[i10] = 91;
                }
            }
            catch (WJ wJ3) {
                throw r9.a(wJ3);
            }
            String string = this.n();
            if (string.charAt(0) != '[') {
                string = "L" + string.replace('.', '/') + ";";
            }
            return new r9(new String(cArray) + string);
        }
        int n3 = 0;
        while (true) {
            block28: {
                try {
                    try {
                        if (n3 >= -n2) break;
                        if (this.a.charAt(n3) == '[') break block28;
                    }
                    catch (WJ wJ4) {
                        throw r9.a(wJ4);
                    }
                    throw new WJ("no " + n2 + " dimensional array type: " + this.n());
                }
                catch (WJ wJ5) {
                    throw r9.a(wJ5);
                }
            }
            ++n3;
        }
        n3 = this.a.charAt(-n2);
        try {
            if (n3 == 91) {
                return new r9(this.a.substring(-n2));
            }
        }
        catch (WJ wJ6) {
            throw r9.a(wJ6);
        }
        try {
            if (n3 == 76) {
                return new r9(this.a.substring(-n2 + 1, this.a.length() - 1).replace('/', '.'));
            }
        }
        catch (WJ wJ7) {
            throw r9.a(wJ7);
        }
        try {
            if (n3 == rr.u(W.w)) {
                return W.w;
            }
        }
        catch (WJ wJ8) {
            throw r9.a(wJ8);
        }
        try {
            if (n3 == rr.u(W.q)) {
                return W.q;
            }
        }
        catch (WJ wJ9) {
            throw r9.a(wJ9);
        }
        try {
            if (n3 == rr.u(W.Z)) {
                return W.Z;
            }
        }
        catch (WJ wJ10) {
            throw r9.a(wJ10);
        }
        return W.n;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public boolean n() {
        return false;
    }

    @Override
    public int C(eq eq2) {
        return eq2.l(this.n());
    }

    public r9(String string) {
        this.a = string;
    }

    @Override
    String j(Set<rq> set) {
        return this.a;
    }
}

