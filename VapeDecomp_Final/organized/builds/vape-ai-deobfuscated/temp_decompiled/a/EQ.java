/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.GM;
import a.Jo;
import a.L2;
import a.L4;
import a.LA;
import a.LC;
import a.LD;
import a.LF;
import a.LK;
import a.LM;
import a.LQ;
import a.LR;
import a.LT;
import a.L_;
import a.Le;
import a.Lh;
import a.Li;
import a.Ll;
import a.Lm;
import a.Lp;
import a.Lt;
import a.Lv;
import a.O_;
import a._s;
import a.d8;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class eq {
    Jo P;
    int q;
    int K;
    public static final GM w;
    Map<LC, LC> u;
    private static final long a;
    private static final long b;
    private static String[] G;

    public int m(int n2) {
        Lt lt2 = (Lt)this.b(n2);
        return lt2.q;
    }

    public int K(int n2, String string, String string2) {
        int n3 = this.U(string, string2);
        return this.v(n2, n3);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public int h(long l10) {
        int n2 = this.W(new Lv(l10, this.K));
        try {
            if (n2 == this.K - 1) {
                this.k();
            }
        }
        catch (O_ o_2) {
            throw eq.a(o_2);
        }
        return n2;
    }

    public int J(int n2) {
        return this.W(new L2(n2, this.K));
    }

    void G(int n2) {
        this.q = n2;
    }

    public int l(String string) {
        int n2 = this.D(_s.q(string));
        return this.W(new Ll(n2, this.K));
    }

    public int U(int n2) {
        LK lK2 = (LK)this.b(n2);
        return lK2.d;
    }

    private int Y(DataInputStream dataInputStream) throws IOException {
        LC lC2;
        int n2 = dataInputStream.readUnsignedByte();
        switch (n2) {
            case 1: {
                lC2 = new Lm(dataInputStream, this.K);
                break;
            }
            case 3: {
                lC2 = new LD(dataInputStream, this.K);
                break;
            }
            case 4: {
                lC2 = new L4(dataInputStream, this.K);
                break;
            }
            case 5: {
                lC2 = new Lv(dataInputStream, this.K);
                break;
            }
            case 6: {
                lC2 = new Lp(dataInputStream, this.K);
                break;
            }
            case 7: {
                lC2 = new Ll(dataInputStream, this.K);
                break;
            }
            case 8: {
                lC2 = new Lh(dataInputStream, this.K);
                break;
            }
            case 9: {
                lC2 = new L_(dataInputStream, this.K);
                break;
            }
            case 10: {
                lC2 = new LR(dataInputStream, this.K);
                break;
            }
            case 11: {
                lC2 = new LM(dataInputStream, this.K);
                break;
            }
            case 12: {
                lC2 = new Lt(dataInputStream, this.K);
                break;
            }
            case 15: {
                lC2 = new LF(dataInputStream, this.K);
                break;
            }
            case 16: {
                lC2 = new Le(dataInputStream, this.K);
                break;
            }
            case 17: {
                lC2 = new Li(dataInputStream, this.K);
                break;
            }
            case 18: {
                lC2 = new LT(dataInputStream, this.K);
                break;
            }
            case 19: {
                lC2 = new L2(dataInputStream, this.K);
                break;
            }
            case 20: {
                lC2 = new LQ(dataInputStream, this.K);
                break;
            }
            default: {
                throw new IOException("invalid constant type: " + n2 + " at " + this.K);
            }
        }
        this.X(lC2);
        return n2;
    }

    public long v(int n2) {
        Lv lv2 = (Lv)this.b(n2);
        return lv2.l;
    }

    public int D(String string) {
        return this.W(new Lm(string, this.K));
    }

    public int Y(int n2) {
        return this.W(new LD(n2, this.K));
    }

    public int A(GM gM) {
        try {
            if (gM == w) {
                return this.q;
            }
        }
        catch (O_ o_2) {
            throw eq.a(o_2);
        }
        try {
            if (!gM.p()) {
                return this.l(gM.H());
            }
        }
        catch (O_ o_3) {
            throw eq.a(o_3);
        }
        return this.l(_s.m(gM));
    }

    public String j(int n2) {
        LK lK2 = (LK)this.b(n2);
        try {
            if (lK2 == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw eq.a(o_2);
        }
        Lt lt2 = (Lt)this.b(lK2.d);
        try {
            if (lt2 == null) {
                return null;
            }
        }
        catch (O_ o_3) {
            throw eq.a(o_3);
        }
        return this.Z(lt2.D);
    }

    public float F(int n2) {
        L4 l42 = (L4)this.b(n2);
        return l42.a;
    }

    private void k(DataInputStream dataInputStream) throws IOException {
        int n2 = dataInputStream.readUnsignedShort();
        this.P = new Jo(n2);
        this.K = 0;
        this.X(null);
        while (--n2 > 0) {
            int n3 = this.Y(dataInputStream);
            try {
                try {
                    if (n3 != 5 && n3 != 6) continue;
                }
                catch (IOException iOException) {
                    throw eq.a(iOException);
                }
                this.k();
                --n2;
            }
            catch (IOException iOException) {
                throw eq.a(iOException);
            }
        }
    }

    public void j(DataOutputStream dataOutputStream) throws IOException {
        block7: {
            long l10 = a ^ 0xB5929D2F7D5L;
            try {
                try {
                    if (this.K >= 0 && (int)b >= this.K) break block7;
                }
                catch (IOException iOException) {
                    throw eq.a(iOException);
                }
                throw new IOException("too many constant pool items " + this.K);
            }
            catch (IOException iOException) {
                throw eq.a(iOException);
            }
        }
        dataOutputStream.writeShort(this.K);
        Jo jo2 = this.P;
        int n2 = this.K;
        try {
            for (int i10 = 1; i10 < n2; ++i10) {
                jo2.P(i10).k(dataOutputStream);
            }
        }
        catch (IOException iOException) {
            throw eq.a(iOException);
        }
    }

    public int O(int n2) {
        Lt lt2 = (Lt)this.b(n2);
        return lt2.D;
    }

    LC b(int n2) {
        return this.P.P(n2);
    }

    public int I() {
        return this.q;
    }

    public int N(String string) {
        int n2 = this.D(string);
        return this.W(new Lh(n2, this.K));
    }

    private static Map<LC, LC> M(Jo jo2) {
        HashMap<LC, LC> hashMap = new HashMap<LC, LC>();
        int n2 = 1;
        while (true) {
            LC lC2 = jo2.P(n2++);
            try {
                if (lC2 == null) {
                    break;
                }
            }
            catch (O_ o_2) {
                throw eq.a(o_2);
            }
            hashMap.put(lC2, lC2);
        }
        return hashMap;
    }

    public int v(int n2, int n3) {
        return this.W(new L_(n2, n3, this.K));
    }

    public int z(String string, String string2, int n2) {
        LK lK2 = (LK)this.b(n2);
        if (this.u(lK2.D).equals(string)) {
            Lt lt2 = (Lt)this.b(lK2.d);
            try {
                if (this.Z(lt2.D).equals(string2)) {
                    return lt2.q;
                }
            }
            catch (O_ o_2) {
                throw eq.a(o_2);
            }
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = d8.a(-7248465767143078875L, 2525160496730398511L, MethodHandles.lookup().lookupClass()).a(92408761507931L);
        long l10 = a ^ 0x246E8C30DD7CL;
        eq.s(null);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -8804204282947987545L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                w = null;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    public static String[] j() {
        return G;
    }

    int k() {
        return this.X(new LA(this.K));
    }

    public eq(DataInputStream dataInputStream) throws IOException {
        this.u = null;
        this.q = 0;
        this.k(dataInputStream);
    }

    public int X(int n2, eq eq2, Map<String, String> map) {
        try {
            if (n2 == 0) {
                return 0;
            }
        }
        catch (O_ o_2) {
            throw eq.a(o_2);
        }
        LC lC2 = this.b(n2);
        return lC2.H(this, eq2, map);
    }

    public String Z(int n2) {
        Lm lm2 = (Lm)this.b(n2);
        return lm2.R;
    }

    public String G(int n2) {
        LT lT2 = (LT)this.b(n2);
        try {
            if (lT2 == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw eq.a(o_2);
        }
        Lt lt2 = (Lt)this.b(lT2.l);
        try {
            if (lt2 == null) {
                return null;
            }
        }
        catch (O_ o_3) {
            throw eq.a(o_3);
        }
        return this.Z(lt2.q);
    }

    public int c(int n2) {
        LK lK2 = (LK)this.b(n2);
        return lK2.d;
    }

    public static void s(String[] stringArray) {
        G = stringArray;
    }

    public int N(int n2) {
        LD lD2 = (LD)this.b(n2);
        return lD2.r;
    }

    public int M(int n2, String string, String string2) {
        int n3 = this.U(string, string2);
        return this.l(n2, n3);
    }

    public String v(int n2) {
        L_ l_2 = (L_)this.b(n2);
        try {
            if (l_2 == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw eq.a(o_2);
        }
        Lt lt2 = (Lt)this.b(l_2.d);
        try {
            if (lt2 == null) {
                return null;
            }
        }
        catch (O_ o_3) {
            throw eq.a(o_3);
        }
        return this.Z(lt2.q);
    }

    public double T(int n2) {
        Lp lp2 = (Lp)this.b(n2);
        return lp2.r;
    }

    public int X(int n2, int n3) {
        return this.W(new LF(n2, n3, this.K));
    }

    public int a(int n2, int n3) {
        return this.W(new LR(n2, n3, this.K));
    }

    public String I(int n2) {
        LK lK2 = (LK)this.b(n2);
        try {
            if (lK2 == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw eq.a(o_2);
        }
        Lt lt2 = (Lt)this.b(lK2.d);
        try {
            if (lt2 == null) {
                return null;
            }
        }
        catch (O_ o_3) {
            throw eq.a(o_3);
        }
        return this.Z(lt2.D);
    }

    public String g(int n2) {
        L_ l_2 = (L_)this.b(n2);
        try {
            if (l_2 == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw eq.a(o_2);
        }
        return this.u(l_2.D);
    }

    public String f(int n2) {
        LK lK2 = (LK)this.b(n2);
        return this.u(lK2.D);
    }

    public int b(int n2) {
        return this.b(n2).Q();
    }

    public int l(int n2, int n3) {
        return this.W(new LM(n2, n3, this.K));
    }

    public eq(String string) {
        this.P = new Jo();
        this.u = null;
        this.K = 0;
        this.X(null);
        this.q = this.l(string);
    }

    private int W(LC lC2) {
        try {
            if (this.u == null) {
                this.u = eq.M(this.P);
            }
        }
        catch (O_ o_2) {
            throw eq.a(o_2);
        }
        LC lC3 = this.u.get(lC2);
        try {
            if (lC3 != null) {
                return lC3.f;
            }
        }
        catch (O_ o_3) {
            throw eq.a(o_3);
        }
        this.P.e(lC2);
        this.u.put(lC2, lC2);
        return this.K++;
    }

    public String b(int n2) {
        LK lK2 = (LK)this.b(n2);
        try {
            if (lK2 == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw eq.a(o_2);
        }
        Lt lt2 = (Lt)this.b(lK2.d);
        try {
            if (lt2 == null) {
                return null;
            }
        }
        catch (O_ o_3) {
            throw eq.a(o_3);
        }
        return this.Z(lt2.q);
    }

    public int N(int n2, int n3) {
        return this.W(new Lt(n2, n3, this.K));
    }

    public int P(int n2, int n3) {
        return this.W(new LT(n2, n3, this.K));
    }

    public String W(int n2) {
        LK lK2 = (LK)this.b(n2);
        try {
            if (lK2 == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw eq.a(o_2);
        }
        Lt lt2 = (Lt)this.b(lK2.d);
        try {
            if (lt2 == null) {
                return null;
            }
        }
        catch (O_ o_3) {
            throw eq.a(o_3);
        }
        return this.Z(lt2.q);
    }

    public String Q(int n2) {
        L_ l_2 = (L_)this.b(n2);
        try {
            if (l_2 == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw eq.a(o_2);
        }
        Lt lt2 = (Lt)this.b(l_2.d);
        try {
            if (lt2 == null) {
                return null;
            }
        }
        catch (O_ o_3) {
            throw eq.a(o_3);
        }
        return this.Z(lt2.D);
    }

    public String u(int n2) {
        Ll ll2 = (Ll)this.b(n2);
        try {
            if (ll2 == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw eq.a(o_2);
        }
        return _s.A(this.Z(ll2.Z));
    }

    public int r(String string, int n2) {
        return this.z(string, "<init>", n2);
    }

    public int B(int n2, int n3) {
        return this.W(new Li(n2, n3, this.K));
    }

    public String M(int n2) {
        LK lK2 = (LK)this.b(n2);
        try {
            if (lK2 == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw eq.a(o_2);
        }
        return this.u(lK2.D);
    }

    public String j() {
        return this.u(this.q);
    }

    public int U(String string, String string2) {
        return this.N(this.D(string), this.D(string2));
    }

    public int j(int n2, String string, String string2) {
        int n3 = this.U(string, string2);
        return this.a(n2, n3);
    }

    public int v(double d2) {
        int n2 = this.W(new Lp(d2, this.K));
        try {
            if (n2 == this.K - 1) {
                this.k();
            }
        }
        catch (O_ o_2) {
            throw eq.a(o_2);
        }
        return n2;
    }

    public String H(int n2) {
        Lh lh2 = (Lh)this.b(n2);
        return this.Z(lh2.K);
    }

    public int s(int n2) {
        return this.W(new Le(n2, this.K));
    }

    private int X(LC lC2) {
        this.P.e(lC2);
        return this.K++;
    }

    public int G(float f10) {
        return this.W(new L4(f10, this.K));
    }

    public String D(int n2) {
        Li li2 = (Li)this.b(n2);
        try {
            if (li2 == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw eq.a(o_2);
        }
        Lt lt2 = (Lt)this.b(li2.Q);
        try {
            if (lt2 == null) {
                return null;
            }
        }
        catch (O_ o_3) {
            throw eq.a(o_3);
        }
        return this.Z(lt2.q);
    }
}

