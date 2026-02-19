/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.On;
import a._g;
import a.a7;
import a.eq;
import a.s5;
import a.sP;
import a.sS;
import a.sY;
import a.sZ;
import a.sb;
import a.sn;
import a.z;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c4 {
    int r;
    eq c;
    String D;
    int G;
    List<s5> b;
    int z;
    public static boolean N = false;

    public void l(s5 s52) {
        try {
            if (this.b == null) {
                this.b = new ArrayList<s5>();
            }
        }
        catch (O_ o_2) {
            throw c4.a(o_2);
        }
        s5.e(this.b, s52.n());
        this.b.add(s52);
    }

    public s5 j(String string) {
        return s5.J(this.b, string);
    }

    public void q(On on2) throws a7 {
        sS sS2 = this.Z();
        if (sS2 != null) {
            sn sn2 = _g.v(on2, this);
            sS2.l(sn2);
        }
    }

    public sS Z() {
        s5 s52 = s5.J(this.b, "Code");
        return (sS)s52;
    }

    public boolean O() {
        return this.C().equals("<init>");
    }

    public void u(sS sS2) {
        try {
            this.c();
            if (this.b == null) {
                this.b = new ArrayList<s5>();
            }
        }
        catch (O_ o_2) {
            throw c4.a(o_2);
        }
        this.b.add(sS2);
    }

    public void D(int n2) {
        this.r = n2;
    }

    public String C() {
        try {
            if (this.D == null) {
                this.D = this.c.Z(this.z);
            }
        }
        catch (O_ o_2) {
            throw c4.a(o_2);
        }
        return this.D;
    }

    public void M(On on2) throws a7 {
        sS sS2 = this.Z();
        if (sS2 != null) {
            sZ sZ2 = _g.I(on2, this);
            sS2.N(sZ2);
        }
    }

    public void c() {
        s5.e(this.b, "Code");
    }

    void E(eq eq2) {
        this.z = eq2.D(this.C());
        this.G = eq2.D(this.b());
        this.b = s5.X(this.b, eq2);
        this.c = eq2;
    }

    public int i(int n2) {
        sS sS2 = this.Z();
        try {
            if (sS2 == null) {
                return -1;
            }
        }
        catch (O_ o_2) {
            throw c4.a(o_2);
        }
        sY sY2 = (sY)sS2.G("LineNumberTable");
        try {
            if (sY2 == null) {
                return -1;
            }
        }
        catch (O_ o_3) {
            throw c4.a(o_3);
        }
        return sY2.m(n2);
    }

    public void w(On on2, z z10) throws a7 {
        try {
            if (z10.k() >= 50) {
                this.q(on2);
            }
        }
        catch (a7 a72) {
            throw c4.a(a72);
        }
        try {
            if (N) {
                this.M(on2);
            }
        }
        catch (a7 a73) {
            throw c4.a(a73);
        }
    }

    private void F(DataInputStream dataInputStream) throws IOException {
        this.r = dataInputStream.readUnsignedShort();
        this.z = dataInputStream.readUnsignedShort();
        this.G = dataInputStream.readUnsignedShort();
        int n2 = dataInputStream.readUnsignedShort();
        this.b = new ArrayList<s5>();
        try {
            for (int i10 = 0; i10 < n2; ++i10) {
                this.b.add(s5.R(this.c, dataInputStream));
            }
        }
        catch (IOException iOException) {
            throw c4.a(iOException);
        }
    }

    void t(DataOutputStream dataOutputStream) throws IOException {
        block3: {
            block2: {
                try {
                    dataOutputStream.writeShort(this.r);
                    dataOutputStream.writeShort(this.z);
                    dataOutputStream.writeShort(this.G);
                    if (this.b != null) break block2;
                    dataOutputStream.writeShort(0);
                    break block3;
                }
                catch (IOException iOException) {
                    throw c4.a(iOException);
                }
            }
            dataOutputStream.writeShort(this.b.size());
            s5.E(this.b, dataOutputStream);
        }
    }

    public c4(eq eq2, String string, String string2) {
        this(eq2);
        this.r = 0;
        this.z = eq2.D(string);
        this.D = string;
        this.G = this.c.D(string2);
    }

    public boolean R() {
        return this.C().equals("<clinit>");
    }

    c4(eq eq2, DataInputStream dataInputStream) throws IOException {
        this(eq2);
        this.F(dataInputStream);
    }

    public sb I() {
        s5 s52 = s5.J(this.b, "Exceptions");
        return (sb)s52;
    }

    public String b() {
        return this.c.Z(this.G);
    }

    void Q(eq eq2) {
        s5 s52;
        s5 s53;
        s5 s54;
        ArrayList<s5> arrayList = new ArrayList<s5>();
        s5 s55 = this.j("RuntimeInvisibleAnnotations");
        if (s55 != null) {
            s55 = s55.O(eq2, null);
            arrayList.add(s55);
        }
        if ((s54 = this.j("RuntimeVisibleAnnotations")) != null) {
            s54 = s54.O(eq2, null);
            arrayList.add(s54);
        }
        if ((s53 = this.j("RuntimeInvisibleParameterAnnotations")) != null) {
            s53 = s53.O(eq2, null);
            arrayList.add(s53);
        }
        if ((s52 = this.j("RuntimeVisibleParameterAnnotations")) != null) {
            s52 = s52.O(eq2, null);
            arrayList.add(s52);
        }
        sP sP2 = (sP)this.j("AnnotationDefault");
        try {
            if (sP2 != null) {
                arrayList.add(sP2);
            }
        }
        catch (O_ o_2) {
            throw c4.a(o_2);
        }
        sb sb2 = this.I();
        try {
            if (sb2 != null) {
                arrayList.add(sb2);
            }
        }
        catch (O_ o_3) {
            throw c4.a(o_3);
        }
        s5 s56 = this.j("Signature");
        if (s56 != null) {
            s56 = s56.O(eq2, null);
            arrayList.add(s56);
        }
        this.b = arrayList;
        this.z = eq2.D(this.C());
        this.G = eq2.D(this.b());
        this.c = eq2;
    }

    public int Z() {
        return this.r;
    }

    private c4(eq eq2) {
        this.c = eq2;
        this.b = null;
    }

    public eq v() {
        return this.c;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public boolean F() {
        boolean bl2;
        block5: {
            block4: {
                String string = this.C();
                try {
                    try {
                        if (string.equals("<init>") || string.equals("<clinit>")) break block4;
                    }
                    catch (O_ o_2) {
                        throw c4.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw c4.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public String toString() {
        return this.C() + " " + this.b();
    }
}

