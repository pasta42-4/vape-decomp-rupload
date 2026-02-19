/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.DK;
import a.O_;
import a._Y;
import a.sV;
import a.sy;
import a.vT;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class e_ {
    int t = -1;
    int C = -1;
    private final HashMap<Long, sV> w = new HashMap();
    private final sV x;
    private final sV a;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public int m() {
        this.j();
        return this.t;
    }

    private List<sV> t(sV sV2) {
        ArrayList<sV> arrayList = new ArrayList<sV>();
        double d2 = sV2.Z;
        double d3 = sV2.F;
        double d4 = sV2.p;
        if (sV2.equals(this.x)) {
            d2 = (double)sy.Q(d2) + 0.5;
            d3 = sy.Q(d3);
            d4 = (double)sy.Q(d4) + 0.5;
        }
        int n2 = -1;
        while (true) {
            block7: {
                block6: {
                    try {
                        try {
                            if (n2 > 1) break;
                            if (n2 != 0) break block6;
                            break block7;
                        }
                        catch (O_ o_2) {
                            throw e_.a(o_2);
                        }
                    }
                    catch (O_ o_3) {
                        throw e_.a(o_3);
                    }
                }
                arrayList.add(this.w(d2 + (double)n2, d3, d4));
                arrayList.add(this.w(d2, d3 + (double)n2, d4));
                arrayList.add(this.w(d2, d3, d4 + (double)n2));
            }
            ++n2;
        }
        return arrayList;
    }

    public sV g() {
        return this.a;
    }

    public sV b() {
        return this.x;
    }

    public e_(double d2, double d3, double d4, double d5, double d6, double d7) {
        this.x = this.w(d5, d6, d7);
        this.a = this.w(d2, d3, d4);
    }

    public e_(DK dK, DK dK2) {
        this(dK.o(), dK.q(), dK.j(), dK2.o(), dK2.q(), dK2.j());
    }

    private double R(sV sV2, sV sV3) {
        double d2 = sV2.Z - sV3.Z;
        double d3 = sV2.F - sV3.F;
        double d4 = sV2.p - sV3.p;
        return d2 * d2 + d3 * d3 + d4 * d4;
    }

    public int e() {
        this.j();
        return this.C;
    }

    private sV w(double d2, double d3, double d4) {
        sV sV2 = this.w.get(DK.p(d2, d3, d4));
        if (sV2 == null) {
            sV2 = new sV(d2, d3, d4);
            this.w.put(DK.p(d2, d3, d4), sV2);
        }
        return sV2;
    }

    public e_(vT vT2, vT vT3) {
        this(vT2.z(), vT2.h(), vT2.A(), vT3.z(), vT3.h(), vT3.A());
    }

    public void b() {
        ArrayList<sV> arrayList = new ArrayList<sV>();
        HashSet<sV> hashSet = new HashSet<sV>();
        arrayList.add(this.x);
        float f10 = _Y.C(this.x.Z, this.x.p, this.a.Z + 0.5, this.a.p + 0.5);
        while (arrayList.size() > 0) {
            sV sV2 = (sV)arrayList.get(0);
            int n2 = 1;
            while (true) {
                block24: {
                    block23: {
                        try {
                            try {
                                try {
                                    if (n2 >= arrayList.size()) break;
                                    if (((sV)arrayList.get(n2)).v() < sV2.v()) break block23;
                                }
                                catch (O_ o_2) {
                                    throw e_.a(o_2);
                                }
                                if (((sV)arrayList.get(n2)).v() != sV2.v()) break block24;
                            }
                            catch (O_ o_3) {
                                throw e_.a(o_3);
                            }
                            if (!(((sV)arrayList.get((int)n2)).T < sV2.T)) break block24;
                        }
                        catch (O_ o_4) {
                            throw e_.a(o_4);
                        }
                    }
                    sV2 = (sV)arrayList.get(n2);
                }
                ++n2;
            }
            try {
                arrayList.remove(sV2);
                hashSet.add(sV2);
                if (sV2 == this.a) {
                    return;
                }
            }
            catch (O_ o_5) {
                throw e_.a(o_5);
            }
            double d2 = 0.0;
            double d3 = 0.0;
            for (sV sV3 : this.t(sV2)) {
                int n3;
                double d4;
                try {
                    if (hashSet.contains(sV3)) {
                        continue;
                    }
                }
                catch (O_ o_6) {
                    throw e_.a(o_6);
                }
                double d5 = 0.0;
                try {
                    d4 = d5;
                    n3 = sV3.F - sV2.F == 0.0 ? 0 : 20;
                }
                catch (O_ o_7) {
                    throw e_.a(o_7);
                }
                d5 = d4 + (double)n3;
                d5 += _Y.l(this.x.Z, this.x.p, f10, sV3.Z, sV3.p);
                double d6 = sV2.m + this.R(sV2, sV3) + (d5 += _Y.z(this.x.Z, this.x.p, sV3.Z, sV3.p) * 3.0);
                try {
                    try {
                        try {
                            if (!(d6 < sV3.m) && arrayList.contains(sV3)) continue;
                        }
                        catch (O_ o_8) {
                            throw e_.a(o_8);
                        }
                        sV3.m = d6;
                        sV3.T = this.R(sV3, this.x);
                        sV3.L = sV2;
                        if (arrayList.contains(sV3)) continue;
                    }
                    catch (O_ o_9) {
                        throw e_.a(o_9);
                    }
                    arrayList.add(sV3);
                }
                catch (O_ o_10) {
                    throw e_.a(o_10);
                }
            }
        }
    }

    private void j() {
        List<sV> list;
        if (this.C == -1 && (list = this.H()).size() > 0) {
            int n2 = (int)list.get((int)0).F;
            for (sV sV2 : list) {
                block5: {
                    block4: {
                        try {
                            if (sV2.F != (double)n2) break block4;
                            ++this.C;
                            break block5;
                        }
                        catch (O_ o_2) {
                            throw e_.a(o_2);
                        }
                    }
                    ++this.t;
                }
                n2 = (int)sV2.F;
            }
        }
    }

    public List<sV> H() {
        ArrayList<sV> arrayList = new ArrayList<sV>();
        sV sV2 = this.a;
        try {
            if (this.a.L == null) {
                this.b();
            }
        }
        catch (O_ o_2) {
            throw e_.a(o_2);
        }
        arrayList.add(this.a);
        while (!sV2.equals(this.x)) {
            sV2 = sV2.L;
            arrayList.add(sV2);
        }
        return arrayList;
    }
}

