/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.FE;
import a.O_;
import a.QX;
import a.Qv;
import a.V4;
import a.zT;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class s7 {
    private final int J;
    private final int z;
    private final Map<Short, Short> U;
    private final int j;

    public boolean equals(Object object) {
        boolean bl2;
        block22: {
            block21: {
                block20: {
                    try {
                        if (this == object) {
                            return true;
                        }
                    }
                    catch (O_ o_2) {
                        throw s7.a(o_2);
                    }
                    try {
                        try {
                            if (object != null && this.getClass() == object.getClass()) break block20;
                        }
                        catch (O_ o_3) {
                            throw s7.a(o_3);
                        }
                        return false;
                    }
                    catch (O_ o_4) {
                        throw s7.a(o_4);
                    }
                }
                s7 s72 = (s7)object;
                try {
                    if (this.J != s72.J) {
                        return false;
                    }
                }
                catch (O_ o_5) {
                    throw s7.a(o_5);
                }
                try {
                    if (this.j != s72.j) {
                        return false;
                    }
                }
                catch (O_ o_6) {
                    throw s7.a(o_6);
                }
                try {
                    if (this.z != s72.z) {
                        return false;
                    }
                }
                catch (O_ o_7) {
                    throw s7.a(o_7);
                }
                try {
                    try {
                        if (this.U.size() != s72.U.size() || !this.U.equals(s72.U)) break block21;
                    }
                    catch (O_ o_8) {
                        throw s7.a(o_8);
                    }
                    bl2 = true;
                    break block22;
                }
                catch (O_ o_9) {
                    throw s7.a(o_9);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public boolean C() {
        boolean bl2;
        try {
            bl2 = !this.U.isEmpty();
        }
        catch (O_ o_2) {
            throw s7.a(o_2);
        }
        return bl2;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public Map<Short, Short> P() {
        return this.U;
    }

    public int Z() {
        return this.z;
    }

    public int x() {
        return this.J;
    }

    public FE Z() {
        return new FE(this.J, this.j, this.z, this.U);
    }

    @Nullable
    public V4 F() {
        try {
            if (this.J == 0) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw s7.a(o_2);
        }
        QX qX2 = QX.Y(this.J);
        if (qX2.r()) {
            V4 v42 = V4.d(qX2);
            v42.S(this.z);
            v42.T(this.j);
            if (!this.U.isEmpty()) {
                for (Map.Entry<Short, Short> entry : this.U.entrySet()) {
                    Qv qv2 = zT.n(entry.getKey());
                    try {
                        if (qv2 == null) {
                            continue;
                        }
                    }
                    catch (O_ o_3) {
                        throw s7.a(o_3);
                    }
                    v42.M(qv2, entry.getValue().shortValue());
                }
            }
            return v42;
        }
        return null;
    }

    @Nullable
    public static s7 f(@Nullable FE fE2) {
        block4: {
            try {
                try {
                    if (fE2 != null && fE2.n() != 0) break block4;
                }
                catch (O_ o_2) {
                    throw s7.a(o_2);
                }
                return null;
            }
            catch (O_ o_3) {
                throw s7.a(o_3);
            }
        }
        return new s7(fE2.n(), fE2.j(), fE2.m(), fE2.N());
    }

    public s7(int n2, int n3, int n4, Map<Short, Short> map) {
        this.J = n2;
        this.j = n3;
        this.z = n4;
        this.U = map;
    }

    public int hashCode() {
        int n2 = this.J;
        n2 = 31 * n2 + this.j;
        n2 = 31 * n2 + this.z;
        n2 = 31 * n2 + this.U.hashCode();
        return n2;
    }

    public int c() {
        return this.j;
    }
}

