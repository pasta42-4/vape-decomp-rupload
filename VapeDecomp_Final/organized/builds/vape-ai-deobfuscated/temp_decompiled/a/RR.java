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
import a.r9;
import a.rq;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class rr
extends rq {
    private String f;
    private char Z;
    private int e;

    @Override
    public rq c() {
        try {
            if (this == W.C) {
                return this;
            }
        }
        catch (O_ o_2) {
            throw rr.a(o_2);
        }
        return super.c();
    }

    @Override
    public rq r(int n2) throws WJ {
        try {
            if (this == W.C) {
                return this;
            }
        }
        catch (WJ wJ2) {
            throw rr.a(wJ2);
        }
        try {
            if (n2 < 0) {
                throw new WJ("no element type: " + this.f);
            }
        }
        catch (WJ wJ3) {
            throw rr.a(wJ3);
        }
        try {
            if (n2 == 0) {
                return this;
            }
        }
        catch (WJ wJ4) {
            throw rr.a(wJ4);
        }
        char[] cArray = new char[n2 + 1];
        try {
            for (int i10 = 0; i10 < n2; ++i10) {
                cArray[i10] = 91;
            }
        }
        catch (WJ wJ5) {
            throw rr.a(wJ5);
        }
        cArray[n2] = this.Z;
        return new r9(new String(cArray));
    }

    @Override
    public int G() {
        return this.e;
    }

    @Override
    public boolean o(rq rq2) {
        boolean bl2;
        try {
            bl2 = this == rq2;
        }
        catch (O_ o_2) {
            throw rr.a(o_2);
        }
        return bl2;
    }

    @Override
    public rr Z() {
        return this;
    }

    @Override
    public void e(String string, On on2) throws a7 {
        throw new a7("conflict: " + this.f + " and " + string);
    }

    @Override
    public boolean n() {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (this.e != 4 && this.e != 3) break block4;
                    }
                    catch (O_ o_2) {
                        throw rr.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw rr.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public int C(eq eq2) {
        return 0;
    }

    public rr(String string, int n2, char c10) {
        this.f = string;
        this.e = n2;
        this.Z = c10;
    }

    @Override
    public String n() {
        return this.f;
    }

    @Override
    String j(Set<rq> set) {
        return this.f;
    }

    static char u(rr rr2) {
        return rr2.Z;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

