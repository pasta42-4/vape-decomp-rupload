/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fu;
import a.On;
import a.TF;
import a.WJ;
import a._0;
import a.a7;
import a.az;
import a.c4;
import a.eS;
import a.eq;
import a.r8;
import a.r9;
import a.rF;
import a.rq;
import a.rr;
import a.sS;
import a.sZ;
import a.sn;
import a.zn;
import java.util.ArrayList;

public class _g
extends _0 {
    public static sn v(On on2, c4 c42) throws a7 {
        rF[] rFArray;
        sS sS2 = c42.Z();
        try {
            if (sS2 == null) {
                return null;
            }
        }
        catch (az az2) {
            throw _g.b(az2);
        }
        try {
            rFArray = rF.k(c42, sS2, true);
        }
        catch (az az3) {
            return null;
        }
        try {
            if (rFArray == null) {
                return null;
            }
        }
        catch (az az4) {
            throw _g.b(az4);
        }
        _g _g2 = new _g(on2, c42, sS2);
        try {
            _g2.L(rFArray, sS2.X());
        }
        catch (a7 a72) {
            throw new a7(c42, (Throwable)a72);
        }
        return _g2.G(rFArray);
    }

    private void l(rF rF2, int n2, rq[] rqArray) throws a7 {
        int n3 = this.F.length;
        rq[] rqArray2 = rq.i(n3);
        int n4 = _g.a(n3, this.F, rqArray2);
        rF2.j(n2, rqArray, n4, rqArray2);
    }

    private rq e(rq rq2, rq rq3) throws a7 {
        block10: {
            try {
                if (rq2 == rq3) {
                    return rq3;
                }
            }
            catch (a7 a72) {
                throw _g.b(a72);
            }
            try {
                try {
                    if (!(rq3 instanceof r9) && !(rq3 instanceof rr)) break block10;
                }
                catch (a7 a73) {
                    throw _g.b(a73);
                }
                return rq3;
            }
            catch (a7 a74) {
                throw _g.b(a74);
            }
        }
        try {
            if (rq3 instanceof r8) {
                ((r8)rq3).O(rq2);
                return rq3;
            }
        }
        catch (a7 a75) {
            throw _g.b(a75);
        }
        throw new RuntimeException("fatal: this should never happen");
    }

    public sn G(rF[] rFArray) {
        eS eS2 = new eS(32);
        int n2 = rFArray.length;
        rF rF2 = rFArray[0];
        int n3 = rF2.F;
        try {
            if (rF2.C > 0) {
                eS2.a(0);
                --n3;
            }
        }
        catch (RuntimeException runtimeException) {
            throw _g.b(runtimeException);
        }
        for (int i10 = 1; i10 < n2; ++i10) {
            rF rF3 = rFArray[i10];
            if (this.q(rF3, rFArray[i10 - 1])) {
                rF3.V();
                int n4 = _g.J(rF2.w, rF2.I, rF3.w, rF3.I);
                this.H(eS2, rF3, n4, n3, rF2);
                n3 = rF3.F - 1;
                rF2 = rF3;
                continue;
            }
            if (rF3.C == 0) {
                eS2.a(n3);
                n3 = rF3.F - 1;
                continue;
            }
            n3 += rF3.F;
        }
        return eS2.x(this.N);
    }

    private void S(byte[] byArray, rF rF2) throws a7 {
        int n2;
        int n3;
        block7: {
            block8: {
                n3 = rF2.q;
                n2 = rF2.F - 3;
                try {
                    try {
                        if (n2 >= 0) break block7;
                        if (n2 != -1) break block8;
                    }
                    catch (a7 a72) {
                        throw _g.b(a72);
                    }
                    byArray[n3] = 0;
                }
                catch (a7 a73) {
                    throw _g.b(a73);
                }
            }
            byArray[n3 + rF2.F - 1] = -65;
            rF2.C = 1;
            this.U(rF2, 0);
            return;
        }
        rF2.C = 0;
        try {
            for (int i10 = 0; i10 < n2; ++i10) {
                byArray[n3 + i10] = 0;
            }
        }
        catch (a7 a74) {
            throw _g.b(a74);
        }
        byArray[n3 + n2] = -89;
        TF.e(-n2, byArray, n3 + n2 + 1);
    }

    private static int W(rq[] rqArray, int n2, int n3) {
        int n4 = 0;
        while (n2 < n3) {
            rq rq2 = rqArray[n2++];
            try {
                ++n4;
                if (!rq2.n()) continue;
                ++n2;
            }
            catch (RuntimeException runtimeException) {
                throw _g.b(runtimeException);
            }
        }
        return n4;
    }

    private void c(byte[] byArray, zn zn2) throws a7 {
        while (zn2 != null) {
            block7: {
                rF rF2;
                block5: {
                    block6: {
                        rF2 = (rF)zn2.G;
                        try {
                            try {
                                if (!rF2.V()) break block5;
                                this.v(rF2, false);
                                if (rF2.v >= 1) break block6;
                            }
                            catch (a7 a72) {
                                throw _g.b(a72);
                            }
                            throw new a7("bad catch clause: " + zn2.e);
                        }
                        catch (a7 a73) {
                            throw _g.b(a73);
                        }
                    }
                    rF2.Y[0] = this.e(this.E(zn2.e), rF2.Y[0]);
                    break block7;
                }
                this.U(rF2, zn2.e);
                _g _g2 = new _g(this);
                _g2.c(byArray, rF2);
            }
            zn2 = zn2.B;
        }
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    public sZ L(eq eq2, rF[] rFArray) {
        int n2;
        int n3;
        boolean bl2;
        Fu fu2 = new Fu();
        int n4 = rFArray.length;
        boolean[] blArray = new boolean[n4];
        rF rF2 = rFArray[0];
        try {
            boolean[] blArray2 = blArray;
            int n5 = 0;
            bl2 = rF2.C > 0;
        }
        catch (RuntimeException runtimeException) {
            throw _g.b(runtimeException);
        }
        try {
            blArray2[n5] = bl2;
            n3 = blArray[0] ? 1 : 0;
        }
        catch (RuntimeException runtimeException) {
            throw _g.b(runtimeException);
        }
        int n6 = n3;
        for (n2 = 1; n2 < n4; ++n2) {
            rF rF3 = rFArray[n2];
            blArray[n2] = this.q(rF3, rFArray[n2 - 1]);
            if (!blArray[n2]) continue;
            rF3.V();
            rF2 = rF3;
            ++n6;
        }
        try {
            if (n6 == 0) {
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw _g.b(runtimeException);
        }
        fu2.v(n6);
        n2 = 0;
        while (true) {
            block13: {
                try {
                    try {
                        if (n2 >= n4) break;
                        if (!blArray[n2]) break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw _g.b(runtimeException);
                    }
                    this.H(fu2, eq2, rFArray[n2].q, rFArray[n2]);
                }
                catch (RuntimeException runtimeException) {
                    throw _g.b(runtimeException);
                }
            }
            ++n2;
        }
        return fu2.G(eq2);
    }

    private void o(byte[] byArray, rF[] rFArray) throws WJ, a7 {
        ArrayList<rq> arrayList = new ArrayList<rq>();
        int n2 = rFArray.length;
        int n3 = 0;
        for (int i10 = 0; i10 < n2; ++i10) {
            int n4;
            rF rF2 = rFArray[i10];
            if (!rF2.V()) continue;
            int n5 = rF2.I.length;
            for (n4 = 0; n4 < n5; ++n4) {
                n3 = rF2.I[n4].N(arrayList, n3, this.A);
            }
            n5 = rF2.v;
            for (n4 = 0; n4 < n5; ++n4) {
                n3 = rF2.Y[n4].N(arrayList, n3, this.A);
            }
        }
    }

    protected static void T(int n2, rq[] rqArray, rq[] rqArray2) {
        System.arraycopy(rqArray, 0, rqArray2, 0, n2);
    }

    public static sZ I(On on2, c4 c42) throws a7 {
        rF[] rFArray;
        sS sS2 = c42.Z();
        try {
            if (sS2 == null) {
                return null;
            }
        }
        catch (az az2) {
            throw _g.b(az2);
        }
        try {
            rFArray = rF.k(c42, sS2, true);
        }
        catch (az az3) {
            return null;
        }
        try {
            if (rFArray == null) {
                return null;
            }
        }
        catch (az az4) {
            throw _g.b(az4);
        }
        _g _g2 = new _g(on2, c42, sS2);
        try {
            _g2.L(rFArray, sS2.X());
        }
        catch (a7 a72) {
            throw new a7(c42, (Throwable)a72);
        }
        return _g2.L(c42.v(), rFArray);
    }

    private void a(Fu fu2, eq eq2, rq[] rqArray, int n2) {
        rq rq2;
        int n3;
        int n4 = 0;
        for (n3 = 0; n3 < n2; ++n3) {
            rq2 = rqArray[n3];
            try {
                try {
                    if (rq2 == null || !rq2.n()) continue;
                }
                catch (RuntimeException runtimeException) {
                    throw _g.b(runtimeException);
                }
                ++n4;
                ++n3;
                continue;
            }
            catch (RuntimeException runtimeException) {
                throw _g.b(runtimeException);
            }
        }
        fu2.v(n2 - n4);
        for (n3 = 0; n3 < n2; ++n3) {
            rq2 = rqArray[n3];
            try {
                fu2.R(rq2.G(), rq2.C(eq2));
                if (!rq2.n()) continue;
                ++n3;
                continue;
            }
            catch (RuntimeException runtimeException) {
                throw _g.b(runtimeException);
            }
        }
    }

    protected _g(_g _g2) {
        super(_g2);
    }

    private void D(byte[] byArray, rF[] rFArray) throws a7 {
        for (rF rF2 : rFArray) {
            if (rF2.V()) continue;
            this.S(byArray, rF2);
            zn zn2 = rF2.B;
            if (zn2 == null) continue;
            rF rF3 = (rF)zn2.G;
            try {
                if (rF3.V()) continue;
                this.U(rF3, zn2.e);
                this.S(byArray, rF3);
                rF3.C = 1;
            }
            catch (a7 a72) {
                throw _g.b(a72);
            }
        }
    }

    void L(rF[] rFArray, byte[] byArray) throws a7 {
        this.c(byArray, rFArray[0]);
        this.D(byArray, rFArray);
        try {
            this.o(byArray, rFArray);
        }
        catch (WJ wJ2) {
            throw new a7("failed to resolve types", (Throwable)wJ2);
        }
    }

    private boolean q(rF rF2, rF rF3) {
        int n2 = rF2.C;
        try {
            if (n2 > 1) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw _g.b(runtimeException);
        }
        try {
            if (n2 < 1) {
                return false;
            }
        }
        catch (RuntimeException runtimeException) {
            throw _g.b(runtimeException);
        }
        return rF3.m;
    }

    private void H(Fu fu2, eq eq2, int n2, rF rF2) {
        fu2.v(n2);
        this.a(fu2, eq2, rF2.I, rF2.w);
        this.a(fu2, eq2, rF2.Y, rF2.v);
    }

    private int[] b(int n2, int n3, int[] nArray, rq[] rqArray) {
        int n4 = _g.W(rqArray, n3, n3 + n2);
        eq eq2 = this.N;
        int[] nArray2 = new int[n4];
        int n5 = 0;
        for (int i10 = 0; i10 < n2; ++i10) {
            rq rq2 = rqArray[n3 + i10];
            try {
                nArray2[n5] = rq2.G();
                nArray[n5] = rq2.C(eq2);
                if (rq2.n()) {
                    ++i10;
                }
            }
            catch (RuntimeException runtimeException) {
                throw _g.b(runtimeException);
            }
            ++n5;
        }
        return nArray2;
    }

    protected static int a(int n2, rq[] rqArray, rq[] rqArray2) {
        int n3 = -1;
        for (int i10 = 0; i10 < n2; ++i10) {
            rq rq2 = _g.w(rqArray, n2, i10);
            rqArray2[i10] = rq2.c();
            if (rq2 == C) continue;
            n3 = i10 + 1;
        }
        return n3 + 1;
    }

    private void v(rF rF2, boolean bl2) throws a7 {
        int n2;
        int n3 = this.F.length;
        try {
            for (n2 = 0; n2 < n3; ++n2) {
                rF2.I[n2] = this.e(_g.w(this.F, n3, n2), rF2.I[n2]);
            }
        }
        catch (a7 a72) {
            throw _g.b(a72);
        }
        if (bl2) {
            n3 = this.v;
            try {
                for (n2 = 0; n2 < n3; ++n2) {
                    rF2.Y[n2] = this.e(this.o[n2], rF2.Y[n2]);
                }
            }
            catch (a7 a73) {
                throw _g.b(a73);
            }
        }
    }

    private static boolean H(rq[] rqArray, rq[] rqArray2, int n2) {
        int n3 = 0;
        while (true) {
            block5: {
                try {
                    try {
                        if (n3 >= n2) break;
                        if (rqArray[n3].o(rqArray2[n3])) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw _g.b(runtimeException);
                    }
                    return false;
                }
                catch (RuntimeException runtimeException) {
                    throw _g.b(runtimeException);
                }
            }
            ++n3;
        }
        return true;
    }

    private r9 E(int n2) {
        String string = n2 == 0 ? "java.lang.Throwable" : this.N.u(n2);
        return new r9(string);
    }

    public _g(On on2, c4 c42, sS sS2) {
        super(on2, c42.v(), sS2.Q(), sS2.i(), rF.Z(c42.b()));
    }

    private static rq w(rq[] rqArray, int n2, int n3) {
        rq rq2;
        block6: {
            rq2 = rqArray[n3];
            try {
                try {
                    try {
                        if (!rq2.n() || n3 + 1 >= n2) break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw _g.b(runtimeException);
                    }
                    if (rqArray[n3 + 1] == C) break block6;
                }
                catch (RuntimeException runtimeException) {
                    throw _g.b(runtimeException);
                }
                return C;
            }
            catch (RuntimeException runtimeException) {
                throw _g.b(runtimeException);
            }
        }
        return rq2;
    }

    private void V(rF rF2) throws a7 {
        rq[] rqArray = rq.i(this.o.length);
        int n2 = this.v;
        _g.a(n2, this.o, rqArray);
        this.l(rF2, n2, rqArray);
    }

    private void H(eS eS2, rF rF2, int n2, int n3, rF rF3) {
        Object object;
        int n4;
        block20: {
            block21: {
                block17: {
                    block19: {
                        block18: {
                            n4 = rF2.v;
                            try {
                                try {
                                    if (n4 != 0) break block17;
                                    if (n2 != 0) break block18;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw _g.b(runtimeException);
                                }
                                eS2.a(n3);
                                return;
                            }
                            catch (RuntimeException runtimeException) {
                                throw _g.b(runtimeException);
                            }
                        }
                        try {
                            try {
                                if (0 <= n2 || n2 < -3) break block19;
                            }
                            catch (RuntimeException runtimeException) {
                                throw _g.b(runtimeException);
                            }
                            eS2.G(n3, -n2);
                            return;
                        }
                        catch (RuntimeException runtimeException) {
                            throw _g.b(runtimeException);
                        }
                    }
                    try {
                        if (0 >= n2 || n2 > 3) break block20;
                    }
                    catch (RuntimeException runtimeException) {
                        throw _g.b(runtimeException);
                    }
                    int[] nArray = new int[n2];
                    int[] nArray2 = this.b(rF2.w - rF3.w, rF3.w, nArray, rF2.I);
                    eS2.M(n3, nArray2, nArray);
                    return;
                }
                try {
                    if (n4 != 1 || n2 != 0) break block21;
                }
                catch (RuntimeException runtimeException) {
                    throw _g.b(runtimeException);
                }
                rq rq2 = rF2.Y[0];
                eS2.a(n3, rq2.G(), rq2.C(this.N));
                return;
            }
            try {
                if (n4 != 2 || n2 != 0) break block20;
            }
            catch (RuntimeException runtimeException) {
                throw _g.b(runtimeException);
            }
            object = rF2.Y[0];
            try {
                if (((rq)object).n()) {
                    eS2.a(n3, ((rq)object).G(), ((rq)object).C(this.N));
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw _g.b(runtimeException);
            }
        }
        object = new int[n4];
        int[] nArray = this.b(n4, 0, (int[])object, rF2.Y);
        int[] nArray3 = new int[rF2.w];
        int[] nArray4 = this.b(rF2.w, 0, nArray3, rF2.I);
        eS2.c(n3, nArray4, nArray3, nArray, (int[])object);
    }

    private void U(rF rF2, int n2) throws a7 {
        rq[] rqArray = rq.i(this.o.length);
        rqArray[0] = this.E(n2).c();
        this.l(rF2, 1, rqArray);
    }

    private void c(byte[] byArray, rF rF2) throws a7 {
        int n2;
        _g.T(rF2.v, rF2.Y, this.o);
        this.v = rF2.v;
        _g.T(rF2.I.length, rF2.I, this.F);
        this.c(byArray, rF2.B);
        int n3 = n2 + rF2.F;
        for (n2 = rF2.q; n2 < n3; n2 += this.k(n2, byArray)) {
            this.c(byArray, rF2.B);
        }
        if (rF2.s != null) {
            for (int i10 = 0; i10 < rF2.s.length; ++i10) {
                rF rF3 = (rF)rF2.s[i10];
                try {
                    if (rF3.V()) {
                        this.v(rF3, true);
                        continue;
                    }
                }
                catch (a7 a72) {
                    throw _g.b(a72);
                }
                this.V(rF3);
                _g _g2 = new _g(this);
                _g2.c(byArray, rF3);
            }
        }
    }

    private static int J(int n2, rq[] rqArray, int n3, rq[] rqArray2) {
        block4: {
            int n4;
            block5: {
                int n5 = n3 - n2;
                n4 = n5 > 0 ? n2 : n3;
                try {
                    try {
                        if (!_g.H(rqArray, rqArray2, n4)) break block4;
                        if (n5 <= 0) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw _g.b(runtimeException);
                    }
                    return _g.W(rqArray2, n4, n3);
                }
                catch (RuntimeException runtimeException) {
                    throw _g.b(runtimeException);
                }
            }
            return -_g.W(rqArray, n4, n2);
        }
        return -100;
    }
}

