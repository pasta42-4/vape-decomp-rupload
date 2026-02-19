/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.H1;
import a.H5;
import a.H8;
import a.H9;
import a.HB;
import a.HE;
import a.HG;
import a.HJ;
import a.HL;
import a.HP;
import a.HS;
import a.HU;
import a.HY;
import a.Hb;
import a.Hq;
import a.Hr;
import a.Hx;
import a.Jd;
import a.NV;
import a.Op;
import a.W7;
import a.XF;
import a.YL;
import a.a3;
import a.aa;
import a.ac;
import a.ay;
import a.c5;
import a.d8;
import a.i5;
import a.ia;
import a.l3;
import a.lc;
import a.rh;
import a.zY;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class Nj
extends NV {
    public List<a3> E;
    public int X;
    public List<Op> C;
    private static final Map i;
    private boolean f;
    private static final long b;
    public List<ay> Z;
    public List<ay> Y;
    public int K;
    public List<String> I;
    public int v;
    public List<a3> a;
    public List<ay>[] H;
    public List<ac> M;
    public XF V;
    public String g;
    public List<W7> x;
    public List<ac> c;
    private static final Integer[] h;
    public String P;
    public List<ia> z;
    private static final long[] e;
    public int A;
    public Object k;
    public int s;
    public String R;
    public List<ay>[] d;
    public List<c5> B;

    public void D() {
    }

    public void v(lc lc2, int[] nArray, lc[] lcArray) {
        this.V.R(new Hr(this.T(lc2), nArray, this.z(lcArray)));
    }

    public void e(int n2, int n3) {
        this.V.R(new HG(n2, n3));
    }

    public void K(int n2, int n3, Object[] objectArray, int n4, Object[] objectArray2) {
        Object[] objectArray3;
        int n5;
        int n6;
        Hx hx2;
        Hx hx3;
        XF xF2;
        try {
            Hx hx4;
            xF2 = this.V;
            hx3 = hx4;
            hx2 = hx4;
            n6 = n2;
            n5 = n3;
            objectArray3 = objectArray == null ? null : this.P(objectArray);
        }
        catch (IllegalStateException illegalStateException) {
            throw Nj.a(illegalStateException);
        }
        hx3(n6, n5, objectArray3, n4, objectArray2 == null ? null : this.P(objectArray2));
        xF2.R(hx2);
    }

    private Object[] P(Object[] objectArray) {
        Object[] objectArray2 = new Object[objectArray.length];
        for (Object object : objectArray) {
            if (object instanceof lc) {
                object = this.T((lc)object);
            }
            objectArray2[var3_3] = object;
        }
        return objectArray2;
    }

    public void z(lc lc2) {
        this.V.R(this.T(lc2));
    }

    public void O(lc lc2, lc lc3, lc lc4, String string) {
        Op op2 = new Op(this.T(lc2), this.T(lc3), this.T(lc4), string);
        this.C = i5.i(this.C, op2);
    }

    public void C(YL yL2) {
        String[] stringArray;
        try {
            stringArray = this.I == null ? null : this.I.toArray(new String[0]);
        }
        catch (IllegalStateException illegalStateException) {
            throw Nj.a(illegalStateException);
        }
        String[] stringArray2 = stringArray;
        NV nV = yL2.q(this.A, this.R, this.P, this.g, stringArray2);
        try {
            if (nV != null) {
                this.d(nV);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw Nj.a(illegalStateException);
        }
    }

    public void n(int n2, int n3) {
        this.V.R(new HJ(n2, n3));
    }

    public void T(int n2) {
        this.V.R(new HS(n2));
    }

    public void D(int n2, boolean bl2) {
        block3: {
            block2: {
                try {
                    if (!bl2) break block2;
                    this.v = n2;
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw Nj.a(illegalStateException);
                }
            }
            this.s = n2;
        }
    }

    public void u(W7 w72) {
        this.x = i5.i(this.x, w72);
    }

    public void Z(Object object) {
        this.V.R(new HB(object));
    }

    public void d(NV nV) {
        block58: {
            int n2;
            int n3;
            block59: {
                ay ay2;
                int n4;
                int n5;
                List<ay> list;
                if (this.z != null) {
                    n3 = this.z.size();
                    try {
                        for (n2 = 0; n2 < n3; ++n2) {
                            this.z.get(n2).S(nV);
                        }
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw Nj.a(illegalStateException);
                    }
                }
                if (this.k != null) {
                    aa aa2 = nV.J();
                    try {
                        ay.r(aa2, null, this.k);
                        if (aa2 != null) {
                            aa2.P();
                        }
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw Nj.a(illegalStateException);
                    }
                }
                if (this.Z != null) {
                    n3 = this.Z.size();
                    for (n2 = 0; n2 < n3; ++n2) {
                        list = this.Z.get(n2);
                        ((ay)((Object)list)).n(nV.p(((ay)((Object)list)).Z, true));
                    }
                }
                if (this.Y != null) {
                    n3 = this.Y.size();
                    for (n2 = 0; n2 < n3; ++n2) {
                        list = this.Y.get(n2);
                        ((ay)((Object)list)).n(nV.p(((ay)((Object)list)).Z, false));
                    }
                }
                if (this.c != null) {
                    n3 = this.c.size();
                    for (n2 = 0; n2 < n3; ++n2) {
                        list = this.c.get(n2);
                        ((ay)((Object)list)).n(nV.B(((ac)((Object)list)).v, ((ac)((Object)list)).X, ((ac)((Object)list)).Z, true));
                    }
                }
                if (this.M != null) {
                    n3 = this.M.size();
                    for (n2 = 0; n2 < n3; ++n2) {
                        list = this.M.get(n2);
                        ((ay)((Object)list)).n(nV.B(((ac)((Object)list)).v, ((ac)((Object)list)).X, ((ac)((Object)list)).Z, false));
                    }
                }
                try {
                    if (this.v > 0) {
                        nV.D(this.v, true);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw Nj.a(illegalStateException);
                }
                if (this.H != null) {
                    n3 = this.H.length;
                    for (n2 = 0; n2 < n3; ++n2) {
                        list = this.H[n2];
                        try {
                            if (list == null) {
                                continue;
                            }
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw Nj.a(illegalStateException);
                        }
                        n5 = list.size();
                        for (n4 = 0; n4 < n5; ++n4) {
                            ay2 = list.get(n4);
                            ay2.n(nV.I(n2, ay2.Z, true));
                        }
                    }
                }
                try {
                    if (this.s > 0) {
                        nV.D(this.s, false);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw Nj.a(illegalStateException);
                }
                if (this.d != null) {
                    n3 = this.d.length;
                    for (n2 = 0; n2 < n3; ++n2) {
                        list = this.d[n2];
                        try {
                            if (list == null) {
                                continue;
                            }
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw Nj.a(illegalStateException);
                        }
                        n5 = list.size();
                        for (n4 = 0; n4 < n5; ++n4) {
                            ay2 = list.get(n4);
                            ay2.n(nV.I(n2, ay2.Z, false));
                        }
                    }
                }
                try {
                    if (this.f) {
                        this.V.V();
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw Nj.a(illegalStateException);
                }
                if (this.x != null) {
                    n3 = this.x.size();
                    try {
                        for (n2 = 0; n2 < n3; ++n2) {
                            nV.u(this.x.get(n2));
                        }
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw Nj.a(illegalStateException);
                    }
                }
                try {
                    if (this.V.H() <= 0) break block58;
                    nV.v();
                    if (this.C == null) break block59;
                }
                catch (IllegalStateException illegalStateException) {
                    throw Nj.a(illegalStateException);
                }
                n3 = this.C.size();
                try {
                    for (n2 = 0; n2 < n3; ++n2) {
                        this.C.get(n2).X(n2);
                        this.C.get(n2).D(nV);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw Nj.a(illegalStateException);
                }
            }
            this.V.E(nV);
            if (this.B != null) {
                n3 = this.B.size();
                try {
                    for (n2 = 0; n2 < n3; ++n2) {
                        this.B.get(n2).Y(nV);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw Nj.a(illegalStateException);
                }
            }
            if (this.E != null) {
                n3 = this.E.size();
                try {
                    for (n2 = 0; n2 < n3; ++n2) {
                        this.E.get(n2).k(nV, true);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw Nj.a(illegalStateException);
                }
            }
            if (this.a != null) {
                n3 = this.a.size();
                try {
                    for (n2 = 0; n2 < n3; ++n2) {
                        this.a.get(n2).k(nV, false);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw Nj.a(illegalStateException);
                }
            }
            nV.c(this.K, this.X);
            this.f = true;
        }
        nV.D();
    }

    private Hb[] z(lc[] lcArray) {
        Hb[] hbArray = new Hb[lcArray.length];
        int n2 = lcArray.length;
        try {
            for (int i10 = 0; i10 < n2; ++i10) {
                hbArray[i10] = this.T(lcArray[i10]);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw Nj.a(illegalStateException);
        }
        return hbArray;
    }

    public aa I(int n2, String string, boolean bl2) {
        ay ay2;
        block5: {
            block3: {
                block4: {
                    ay2 = new ay(string);
                    try {
                        if (!bl2) break block3;
                        if (this.H != null) break block4;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw Nj.a(illegalStateException);
                    }
                    int n3 = zY.a(this.P).length;
                    this.H = new List[n3];
                }
                this.H[n2] = i5.i(this.H[n2], ay2);
                break block5;
            }
            if (this.d == null) {
                int n4 = zY.a(this.P).length;
                this.d = new List[n4];
            }
            this.d[n2] = i5.i(this.d[n2], ay2);
        }
        return ay2;
    }

    public void p(String string, int n2) {
        try {
            if (this.z == null) {
                this.z = new ArrayList<ia>(5);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw Nj.a(illegalStateException);
        }
        this.z.add(new ia(string, n2));
    }

    public aa h(int n2, rh rh2, lc[] lcArray, lc[] lcArray2, int[] nArray, String string, boolean bl2) {
        a3 a32;
        block3: {
            block2: {
                a32 = new a3(n2, rh2, this.z(lcArray), this.z(lcArray2), nArray, string);
                try {
                    if (!bl2) break block2;
                    this.E = i5.i(this.E, a32);
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw Nj.a(illegalStateException);
                }
            }
            this.a = i5.i(this.a, a32);
        }
        return a32;
    }

    public void f(String string, String string2, l3 l32, Object ... objectArray) {
        this.V.R(new H8(string, string2, l32, objectArray));
    }

    public Nj(int n2, String string, String string2, String string3, String[] stringArray) {
        long l10 = b ^ 0x755A39466FC6L;
        this(Nj.b(26443, 0x7B64C82166131DFEL ^ l10), n2, string, string2, string3, stringArray);
        if (this.getClass() != Nj.class) {
            throw new IllegalStateException();
        }
    }

    public aa E(int n2, rh rh2, String string, boolean bl2) {
        ac ac2;
        block3: {
            Op op2;
            block2: {
                long l10 = b ^ 0x1820FD4A5A77L;
                op2 = this.C.get((n2 & Nj.b(18181, 0x279EA9405C88803L ^ l10)) >> 8);
                ac2 = new ac(n2, rh2, string);
                try {
                    if (!bl2) break block2;
                    op2.k = i5.i(op2.k, ac2);
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw Nj.a(illegalStateException);
                }
            }
            op2.W = i5.i(op2.W, ac2);
        }
        return ac2;
    }

    public aa J() {
        return new ay(new Jd(this, 0));
    }

    public void M(int n2, String string, String string2, String string3, boolean bl2) {
        block4: {
            long l10 = b ^ 0x78514251657AL;
            try {
                try {
                    if (this.T >= Nj.b(30165, 0x262B4C9D30FA85DFL ^ l10) || (n2 & 0x100) != 0) break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw Nj.a(illegalStateException);
                }
                super.M(n2, string, string2, string3, bl2);
                return;
            }
            catch (IllegalStateException illegalStateException) {
                throw Nj.a(illegalStateException);
            }
        }
        int n3 = n2 & 0xFFFFFEFF;
        this.V.R(new H9(n3, string, string2, string3, bl2));
    }

    public Nj() {
        long l10 = b ^ 0x2EBC5303CB4DL;
        this(Nj.b(10092, 0x2CE69219C2BDF953L ^ l10));
        if (this.getClass() != Nj.class) {
            throw new IllegalStateException();
        }
    }

    public void r(int n2, lc lc2) {
        this.V.R(new HL(n2, this.T(lc2)));
    }

    public aa Q(int n2, rh rh2, String string, boolean bl2) {
        ac ac2;
        block4: {
            H5 h52;
            block3: {
                h52 = this.V.E();
                while (h52.K() == -1) {
                    h52 = h52.m();
                }
                ac2 = new ac(n2, rh2, string);
                try {
                    if (!bl2) break block3;
                    h52.o = i5.i(h52.o, ac2);
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw Nj.a(illegalStateException);
                }
            }
            h52.C = i5.i(h52.C, ac2);
        }
        return ac2;
    }

    public void v() {
    }

    public Nj(int n2) {
        super(n2);
        this.V = new XF();
    }

    public void I(String string, String string2, String string3, lc lc2, lc lc3, int n2) {
        c5 c52 = new c5(string, string2, string3, this.T(lc2), this.T(lc3), n2);
        this.B = i5.i(this.B, c52);
    }

    public void s(String string, int n2) {
        this.V.R(new HE(string, n2));
    }

    public void n(int n2, String string) {
        this.V.R(new HU(n2, string));
    }

    protected Hb T(lc lc2) {
        try {
            if (!(lc2.O instanceof Hb)) {
                lc2.O = new Hb();
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw Nj.a(illegalStateException);
        }
        return (Hb)lc2.O;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                Nj.b = d8.a(-6862193577900834648L, 4377587481804870789L, null).a(166139243099418L);
                Nj.i = new HashMap<K, V>(13);
                var0 = Nj.b ^ 101558004570263L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "\u0093\u0013\u0080\u00ed\u00989\u008b\u00a9\u00a2\u00f2_\u00a5\u00d9\u00cb\u00d7E";
                var7_6 = "\u0093\u0013\u0080\u00ed\u00989\u008b\u00a9\u00a2\u00f2_\u00a5\u00d9\u00cb\u00d7E".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00db\u00a0\u00f6\u0011\u0092\u00c5\u00a7\u00e6s\u00cd\u00a8\u00b8\u00b7\u00cd\u0019\u00eb";
                    var7_6 = "\u00db\u00a0\u00f6\u0011\u0092\u00c5\u00a7\u00e6s\u00cd\u00a8\u00b8\u00b7\u00cd\u0019\u00eb".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        Nj.e = var8_3;
        Nj.h = new Integer[4];
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    public Nj(int n2, int n3, String string, String string2, String string3, String[] stringArray) {
        super(n2);
        this.A = n3;
        this.R = string;
        this.P = string2;
        this.g = string3;
        this.I = i5.Y(stringArray);
        if ((n3 & 0x400) == 0) {
            this.B = new ArrayList<c5>(5);
        }
        this.C = new ArrayList<Op>();
        this.V = new XF();
    }

    public void A(int n2, String string, String string2, String string3) {
        this.V.R(new HP(n2, string, string2, string3));
    }

    public aa B(int n2, rh rh2, String string, boolean bl2) {
        ac ac2;
        block3: {
            block2: {
                ac2 = new ac(n2, rh2, string);
                try {
                    if (!bl2) break block2;
                    this.c = i5.i(this.c, ac2);
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw Nj.a(illegalStateException);
                }
            }
            this.M = i5.i(this.M, ac2);
        }
        return ac2;
    }

    public void c(int n2, int n3) {
        this.K = n2;
        this.X = n3;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x39B2;
        if (h[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Nj", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Nj.h[n3] = n4;
        }
        return h[n3];
    }

    public void F(int n2, int n3) {
        this.V.R(new Hq(n2, n3));
    }

    public void K(int n2, int n3, lc lc2, lc ... lcArray) {
        this.V.R(new H1(n2, n3, this.T(lc2), this.z(lcArray)));
    }

    public aa p(String string, boolean bl2) {
        ay ay2;
        block3: {
            block2: {
                ay2 = new ay(string);
                try {
                    if (!bl2) break block2;
                    this.Z = i5.i(this.Z, ay2);
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw Nj.a(illegalStateException);
                }
            }
            this.Y = i5.i(this.Y, ay2);
        }
        return ay2;
    }

    public void E(int n2, lc lc2) {
        this.V.R(new HY(n2, this.T(lc2)));
    }
}

