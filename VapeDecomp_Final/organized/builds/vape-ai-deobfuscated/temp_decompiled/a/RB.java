/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.On;
import a.WJ;
import a.a7;
import a.r8;
import a.r9;
import a.rB;
import a.rL;
import a.rq;
import a.rr;
import java.util.List;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class rb
extends r8 {
    private r8 Y;

    @Override
    protected rB I(int n2) {
        return this.Y.I(n2 + 1);
    }

    @Override
    public rq r(int n2) throws WJ {
        return this.Y.r(n2 + 1);
    }

    @Override
    public rr Z() {
        return null;
    }

    public r8 v() {
        return this.Y;
    }

    @Override
    public String n() {
        return rb.N(this.Y.n());
    }

    @Override
    String j(Set<rq> set) {
        return "[" + this.Y.j(set);
    }

    @Override
    public int N(List<rq> list, int n2, On on2) throws WJ {
        return this.Y.N(list, n2, on2);
    }

    public static String N(String string) {
        try {
            if (string.charAt(0) == '[') {
                return "[" + string;
            }
        }
        catch (RuntimeException runtimeException) {
            throw rb.a(runtimeException);
        }
        return "[L" + string.replace('.', '/') + ";";
    }

    @Override
    public void e(String string, On on2) throws a7 {
        this.Y.e(rL.S(string), on2);
    }

    @Override
    public void O(rq rq2) {
        try {
            try {
                if (!rq2.d()) {
                    this.Y.O(rL.B(rq2));
                }
            }
            catch (RuntimeException runtimeException) {
                throw rb.a(runtimeException);
            }
        }
        catch (a7 a72) {
            throw new RuntimeException("fatal: " + a72);
        }
    }

    static rq s(rq rq2) throws a7 {
        block10: {
            try {
                if (rq2 instanceof rL) {
                    return ((rL)rq2).K();
                }
            }
            catch (a7 a72) {
                throw rb.a(a72);
            }
            try {
                if (rq2 instanceof r8) {
                    return new rb((r8)rq2);
                }
            }
            catch (a7 a73) {
                throw rb.a(a73);
            }
            try {
                try {
                    if (!(rq2 instanceof r9) || rq2.d()) break block10;
                }
                catch (a7 a74) {
                    throw rb.a(a74);
                }
                return new r9(rb.N(rq2.n()));
            }
            catch (a7 a75) {
                throw rb.a(a75);
            }
        }
        throw new a7("bad AASTORE: " + rq2);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private rb(r8 r82) {
        this.Y = r82;
    }

    @Override
    public boolean n() {
        return false;
    }
}

