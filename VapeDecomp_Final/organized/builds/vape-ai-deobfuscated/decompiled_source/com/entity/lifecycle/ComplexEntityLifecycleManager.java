/*
 * Decompiled with CFR 0.152.
 */
package com.entity.lifecycle;

import com.bytecode.analysis.BinaryCodeAnalyzer;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.core.model.DataPrototype;
import com.data.persistence.PersistenceCollectionManager;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.transaction.management.TransactionStrategyResolver;
import com.user.profile.UserProfileManager1412;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ComplexEntityLifecycleManager
extends DataPrototype
implements Cloneable,
TransactionStrategyResolver {
    private int l;
    int A;
    int e;
    public static final MetaclassDefinitionRegistry f = BytecodeAnalyzer.w;
    BytecodeAnalyzer T;
    PersistenceCollectionManager k;

    public void K(MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        this.E(192);
        this.m(this.T.A(metaclassDefinitionRegistry));
    }

    public void r(String string) {
        this.d(this.T.N(string));
    }

    public void H(int n) {
        block5: {
            block6: {
                block4: {
                    try {
                        if (n >= 4) break block4;
                        this.E(30 + n);
                        break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                }
                try {
                    if (n >= 256) break block6;
                    this.E(22);
                    this.w(n);
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
            }
            this.E(196);
            this.E(22);
            this.m(n);
        }
    }

    public void l(int n) {
        this.e = n;
    }

    public void C(long l) {
        this.E(20);
        this.m(this.T.h(l));
    }

    public void k(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, String string2) {
        this.y(metaclassDefinitionRegistry, null, string, string2);
    }

    public ComplexEntityLifecycleManager(BytecodeAnalyzer bytecodeAnalyzer) {
        this(bytecodeAnalyzer, 0, 0);
    }

    public void N(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, String string2, int n) {
        this.d(this.T.A(metaclassDefinitionRegistry), string, string2, n);
    }

    public int L() {
        return this.e;
    }

    public void s(float f) {
        block8: {
            block7: {
                try {
                    block6: {
                        try {
                            try {
                                if (f == 0.0f || f == 1.0f) break block6;
                            }
                            catch (RuntimeException runtimeException) {
                                throw ComplexEntityLifecycleManager.a(runtimeException);
                            }
                            if (f != 2.0f) break block7;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ComplexEntityLifecycleManager.a(runtimeException);
                        }
                    }
                    this.E(11 + (int)f);
                    break block8;
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
            }
            this.d(this.T.G(f));
        }
    }

    public void k(String string) {
        this.E(193);
        this.m(this.T.l(string));
    }

    public void p(double d2) {
        block5: {
            block4: {
                try {
                    try {
                        if (d2 != 0.0 && d2 != 1.0) break block4;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                    this.E(14 + (int)d2);
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
            }
            this.U(d2);
        }
    }

    public void a(int n) {
        block13: {
            block15: {
                block14: {
                    block12: {
                        try {
                            try {
                                if (n >= 6 || -2 >= n) break block12;
                            }
                            catch (RuntimeException runtimeException) {
                                throw ComplexEntityLifecycleManager.a(runtimeException);
                            }
                            this.E(3 + n);
                            break block13;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ComplexEntityLifecycleManager.a(runtimeException);
                        }
                    }
                    try {
                        try {
                            if (n > 127 || -128 > n) break block14;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ComplexEntityLifecycleManager.a(runtimeException);
                        }
                        this.E(16);
                        this.w(n);
                        break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                }
                try {
                    try {
                        if (n > Short.MAX_VALUE || Short.MIN_VALUE > n) break block15;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                    this.E(17);
                    this.w(n >> 8);
                    this.w(n);
                    break block13;
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
            }
            this.d(this.T.Y(n));
        }
    }

    public int P(int n, MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        block23: {
            block20: {
                block24: {
                    block22: {
                        try {
                            block21: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (!metaclassDefinitionRegistry.m()) break block20;
                                                    if (metaclassDefinitionRegistry == MetaclassDefinitionRegistry.T) break block21;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw ComplexEntityLifecycleManager.a(runtimeException);
                                                }
                                                if (metaclassDefinitionRegistry == MetaclassDefinitionRegistry.G) break block21;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw ComplexEntityLifecycleManager.a(runtimeException);
                                            }
                                            if (metaclassDefinitionRegistry == MetaclassDefinitionRegistry.t) break block21;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw ComplexEntityLifecycleManager.a(runtimeException);
                                        }
                                        if (metaclassDefinitionRegistry == MetaclassDefinitionRegistry.s) break block21;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw ComplexEntityLifecycleManager.a(runtimeException);
                                    }
                                    if (metaclassDefinitionRegistry != MetaclassDefinitionRegistry.b) break block22;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ComplexEntityLifecycleManager.a(runtimeException);
                                }
                            }
                            this.o(n);
                            break block23;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ComplexEntityLifecycleManager.a(runtimeException);
                        }
                    }
                    try {
                        if (metaclassDefinitionRegistry == MetaclassDefinitionRegistry.L) {
                            this.x(n);
                            return 2;
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                    try {
                        if (metaclassDefinitionRegistry != MetaclassDefinitionRegistry.R) break block24;
                        this.q(n);
                        break block23;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                }
                try {
                    if (metaclassDefinitionRegistry == MetaclassDefinitionRegistry.Z) {
                        this.N(n);
                        return 2;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
                throw new RuntimeException("void type?");
            }
            this.S(n);
        }
        return 1;
    }

    public void f(int n, int n2, int n3, int n4) {
        this.k.E(n, n2, n3, n4);
    }

    @Override
    public Object clone() {
        try {
            ComplexEntityLifecycleManager complexEntityLifecycleManager = (ComplexEntityLifecycleManager)super.clone();
            complexEntityLifecycleManager.k = (PersistenceCollectionManager)this.k.clone();
            return complexEntityLifecycleManager;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public BytecodeAnalyzer D() {
        return this.T;
    }

    public int H() {
        return this.p();
    }

    public void J(String string, String string2, String string3) {
        this.Y(this.T.l(string), string2, string3);
    }

    public void S(int n) {
        block5: {
            block6: {
                block4: {
                    try {
                        if (n >= 4) break block4;
                        this.E(75 + n);
                        break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                }
                try {
                    if (n >= 256) break block6;
                    this.E(58);
                    this.w(n);
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
            }
            this.E(196);
            this.E(58);
            this.m(n);
        }
    }

    public void q(int n) {
        block5: {
            block6: {
                block4: {
                    try {
                        if (n >= 4) break block4;
                        this.E(67 + n);
                        break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                }
                try {
                    if (n >= 256) break block6;
                    this.E(56);
                    this.w(n);
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
            }
            this.E(196);
            this.E(56);
            this.m(n);
        }
    }

    public void h(MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        block13: {
            block11: {
                block15: {
                    block14: {
                        block12: {
                            try {
                                try {
                                    if (!metaclassDefinitionRegistry.m()) break block11;
                                    if (metaclassDefinitionRegistry != MetaclassDefinitionRegistry.L) break block12;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ComplexEntityLifecycleManager.a(runtimeException);
                                }
                                this.E(9);
                                break block13;
                            }
                            catch (RuntimeException runtimeException) {
                                throw ComplexEntityLifecycleManager.a(runtimeException);
                            }
                        }
                        try {
                            if (metaclassDefinitionRegistry != MetaclassDefinitionRegistry.R) break block14;
                            this.E(11);
                            break block13;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ComplexEntityLifecycleManager.a(runtimeException);
                        }
                    }
                    try {
                        if (metaclassDefinitionRegistry != MetaclassDefinitionRegistry.Z) break block15;
                        this.E(14);
                        break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                }
                try {
                    if (metaclassDefinitionRegistry == MetaclassDefinitionRegistry.M) {
                        throw new RuntimeException("void type?");
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
                this.E(3);
                break block13;
            }
            this.E(1);
        }
    }

    public void T(MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        block5: {
            block4: {
                try {
                    if (metaclassDefinitionRegistry != null) break block4;
                    this.E(177);
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
            }
            if (metaclassDefinitionRegistry.m()) {
                UserProfileManager1412 userProfileManager1412 = (UserProfileManager1412)metaclassDefinitionRegistry;
                this.E(userProfileManager1412.G());
            } else {
                this.E(176);
            }
        }
    }

    public void m(String string) {
        this.E(189);
        this.m(this.T.l(string));
    }

    @Override
    public void u(int n, int n2) {
        super.u(n, n2);
    }

    @Override
    public void I(int n) {
        super.I(n);
    }

    public void I(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, String string2) {
        boolean bl = metaclassDefinitionRegistry == f ? false : metaclassDefinitionRegistry.h();
        this.V(this.T.A(metaclassDefinitionRegistry), string, string2, bl);
    }

    public void e(int n) {
        this.A = n;
    }

    public void e(String string, String string2, String string3) {
        this.U(this.T.l(string), string2, string3);
    }

    private void n(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, String string2, String string3) {
        int n;
        try {
            this.w(179);
            n = string == null ? this.T.A(metaclassDefinitionRegistry) : this.T.l(string);
        }
        catch (RuntimeException runtimeException) {
            throw ComplexEntityLifecycleManager.a(runtimeException);
        }
        int n2 = n;
        this.m(this.T.K(n2, string2, string3));
        this.R(-ReflectionMetadataResolver933.q(string3));
    }

    public void s(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, String string2) {
        boolean bl;
        try {
            bl = metaclassDefinitionRegistry == null ? false : metaclassDefinitionRegistry.h();
        }
        catch (RuntimeException runtimeException) {
            throw ComplexEntityLifecycleManager.a(runtimeException);
        }
        boolean bl2 = bl;
        this.f(bl2, this.T.A(metaclassDefinitionRegistry), string, string2);
    }

    public void B(int n) {
        block5: {
            block6: {
                block4: {
                    try {
                        if (n >= 4) break block4;
                        this.E(42 + n);
                        break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                }
                try {
                    if (n >= 256) break block6;
                    this.E(25);
                    this.w(n);
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
            }
            this.E(196);
            this.E(25);
            this.m(n);
        }
    }

    public void h(int n) {
        this.U(n >> 24, n >> 16, n >> 8, n);
    }

    public void R(int n, int n2, int n3, String string) {
        this.f(n, n2, n3, this.T.l(string));
    }

    public BinaryCodeAnalyzer u() {
        return new BinaryCodeAnalyzer(this.T, this.e, this.A, this.u(), this.k);
    }

    public int S() {
        return this.l;
    }

    public void m(int n) {
        this.R(n >> 8, n);
    }

    public int D() {
        return this.A;
    }

    @Override
    public void w(int n) {
        super.w(n);
    }

    public void M(long l) {
        block5: {
            block4: {
                try {
                    try {
                        if (l != 0L && l != 1L) break block4;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                    this.E(9 + (int)l);
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
            }
            this.C(l);
        }
    }

    public void U(double d2) {
        this.E(20);
        this.m(this.T.v(d2));
    }

    public void o(int n) {
        block5: {
            block6: {
                block4: {
                    try {
                        if (n >= 4) break block4;
                        this.E(59 + n);
                        break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                }
                try {
                    if (n >= 256) break block6;
                    this.E(54);
                    this.w(n);
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
            }
            this.E(196);
            this.E(54);
            this.m(n);
        }
    }

    public ComplexEntityLifecycleManager(BytecodeAnalyzer bytecodeAnalyzer, int n, int n2) {
        this.T = bytecodeAnalyzer;
        this.e = n;
        this.A = n2;
        this.k = new PersistenceCollectionManager(bytecodeAnalyzer);
        this.l = 0;
    }

    private void V(int n, String string, String string2, boolean bl) {
        this.w(184);
        int n2 = bl ? this.T.M(n, string, string2) : this.T.j(n, string, string2);
        this.m(n2);
        this.R(ReflectionMetadataResolver933.q(string2));
    }

    public void R(int n) {
        this.Z(this.l + n);
    }

    public void d(int n, String string, String string2, int n2) {
        this.w(185);
        this.m(this.T.M(n, string, string2));
        this.w(n2);
        this.w(0);
        this.R(ReflectionMetadataResolver933.q(string2) - 1);
    }

    private void y(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, String string2, String string3) {
        int n;
        try {
            this.w(181);
            n = string == null ? this.T.A(metaclassDefinitionRegistry) : this.T.l(string);
        }
        catch (RuntimeException runtimeException) {
            throw ComplexEntityLifecycleManager.a(runtimeException);
        }
        int n2 = n;
        this.m(this.T.K(n2, string2, string3));
        this.R(-1 - ReflectionMetadataResolver933.q(string3));
    }

    public void Y(int n, String string, String string2) {
        this.w(182);
        this.m(this.T.j(n, string, string2));
        this.R(ReflectionMetadataResolver933.q(string2) - 1);
    }

    public void s(int n) {
        block5: {
            block6: {
                block4: {
                    try {
                        if (n >= 4) break block4;
                        this.E(38 + n);
                        break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                }
                try {
                    if (n >= 256) break block6;
                    this.E(24);
                    this.w(n);
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
            }
            this.E(196);
            this.E(24);
            this.m(n);
        }
    }

    public void Y(int n) {
        block5: {
            block6: {
                block4: {
                    try {
                        if (n >= 4) break block4;
                        this.E(34 + n);
                        break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                }
                try {
                    if (n >= 256) break block6;
                    this.E(23);
                    this.w(n);
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
            }
            this.E(196);
            this.E(23);
            this.m(n);
        }
    }

    public PersistenceCollectionManager w() {
        return this.k;
    }

    public void Q(int n, int n2) {
        this.u(n, n2 >> 8);
        this.u(n + 1, n2);
    }

    public void q(String string, String string2, String string3) {
        this.w(178);
        int n = this.T.l(string);
        this.m(this.T.K(n, string2, string3));
        this.R(ReflectionMetadataResolver933.q(string3));
    }

    public void D(int n, int n2, int n3, MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        this.f(n, n2, n3, this.T.A(metaclassDefinitionRegistry));
    }

    public byte[] u() {
        return this.c();
    }

    public void f(boolean bl, int n, String string, String string2) {
        int n2 = bl ? this.T.M(n, string, string2) : this.T.j(n, string, string2);
        this.n(n2, string2);
    }

    public void J(int n) {
        this.A += n;
    }

    public int y(int n, MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        block23: {
            block20: {
                block24: {
                    block22: {
                        try {
                            block21: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (!metaclassDefinitionRegistry.m()) break block20;
                                                    if (metaclassDefinitionRegistry == MetaclassDefinitionRegistry.T) break block21;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw ComplexEntityLifecycleManager.a(runtimeException);
                                                }
                                                if (metaclassDefinitionRegistry == MetaclassDefinitionRegistry.G) break block21;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw ComplexEntityLifecycleManager.a(runtimeException);
                                            }
                                            if (metaclassDefinitionRegistry == MetaclassDefinitionRegistry.t) break block21;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw ComplexEntityLifecycleManager.a(runtimeException);
                                        }
                                        if (metaclassDefinitionRegistry == MetaclassDefinitionRegistry.s) break block21;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw ComplexEntityLifecycleManager.a(runtimeException);
                                    }
                                    if (metaclassDefinitionRegistry != MetaclassDefinitionRegistry.b) break block22;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ComplexEntityLifecycleManager.a(runtimeException);
                                }
                            }
                            this.u(n);
                            break block23;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ComplexEntityLifecycleManager.a(runtimeException);
                        }
                    }
                    try {
                        if (metaclassDefinitionRegistry == MetaclassDefinitionRegistry.L) {
                            this.H(n);
                            return 2;
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                    try {
                        if (metaclassDefinitionRegistry != MetaclassDefinitionRegistry.R) break block24;
                        this.Y(n);
                        break block23;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                }
                try {
                    if (metaclassDefinitionRegistry == MetaclassDefinitionRegistry.Z) {
                        this.s(n);
                        return 2;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
                throw new RuntimeException("void type?");
            }
            this.B(n);
        }
        return 1;
    }

    public void U(String string) {
        this.E(192);
        this.m(this.T.l(string));
    }

    public void J(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, String string2) {
        this.w(178);
        int n = this.T.A(metaclassDefinitionRegistry);
        this.m(this.T.K(n, string, string2));
        this.R(ReflectionMetadataResolver933.q(string2));
    }

    public void W(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, String string2) {
        this.n(metaclassDefinitionRegistry, null, string, string2);
    }

    public void n(int n, String string) {
        this.w(183);
        this.m(n);
        this.R(ReflectionMetadataResolver933.q(string) - 1);
    }

    public void M(int n, int n2) {
        this.Q(n, n2 >> 16);
        this.Q(n + 2, n2);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public void u(int n) {
        block5: {
            block6: {
                block4: {
                    try {
                        if (n >= 4) break block4;
                        this.E(26 + n);
                        break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                }
                try {
                    if (n >= 256) break block6;
                    this.E(21);
                    this.w(n);
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
            }
            this.E(196);
            this.E(21);
            this.m(n);
        }
    }

    public void U(int n, String string, String string2) {
        this.V(n, string, string2, false);
    }

    public int a(String string, int n) {
        this.w(197);
        this.m(this.T.l(string));
        this.w(n);
        this.R(1 - n);
        return n;
    }

    public void N(int n) {
        block5: {
            block6: {
                block4: {
                    try {
                        if (n >= 4) break block4;
                        this.E(71 + n);
                        break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                }
                try {
                    if (n >= 256) break block6;
                    this.E(57);
                    this.w(n);
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
            }
            this.E(196);
            this.E(57);
            this.m(n);
        }
    }

    public void A(String string, String string2, String string3) {
        this.f(false, this.T.l(string), string2, string3);
    }

    public void L(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, String string2) {
        this.Y(this.T.A(metaclassDefinitionRegistry), string, string2);
    }

    public void R(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, String string2) {
        this.w(180);
        int n = this.T.A(metaclassDefinitionRegistry);
        this.m(this.T.K(n, string, string2));
        this.R(ReflectionMetadataResolver933.q(string2) - 1);
    }

    public void p(String string) {
        this.E(187);
        this.m(this.T.l(string));
    }

    public void Z(int n) {
        try {
            this.l = n;
            if (this.l > this.e) {
                this.e = this.l;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ComplexEntityLifecycleManager.a(runtimeException);
        }
    }

    public void d(int n) {
        block3: {
            block2: {
                try {
                    if (n <= 255) break block2;
                    this.E(19);
                    this.m(n);
                    break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
            }
            this.E(18);
            this.w(n);
        }
    }

    public void E(int n) {
        this.w(n);
        this.R(a[n]);
    }

    public void x(int n) {
        block5: {
            block6: {
                block4: {
                    try {
                        if (n >= 4) break block4;
                        this.E(63 + n);
                        break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ComplexEntityLifecycleManager.a(runtimeException);
                    }
                }
                try {
                    if (n >= 256) break block6;
                    this.E(55);
                    this.w(n);
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw ComplexEntityLifecycleManager.a(runtimeException);
                }
            }
            this.E(196);
            this.E(55);
            this.m(n);
        }
    }
}

