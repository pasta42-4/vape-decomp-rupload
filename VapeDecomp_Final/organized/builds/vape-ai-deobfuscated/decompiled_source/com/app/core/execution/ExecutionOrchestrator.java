/*
 * Decompiled with CFR 0.152.
 */
package com.app.core.execution;

import a.N9;
import a.Qh;
import a.oQ;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.management.EventDispatchCoordinator1090;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.core.NetworkConnectionOrchestrator;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.transmission.DataTransmissionManager2384;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.system.resources.ResourceAllocationManager;

public class ExecutionOrchestrator {
    private static boolean W(ReflectionUtilityBroker reflectionUtilityBroker) {
        boolean bl;
        block7: {
            block6: {
                NetworkProtocolNegotiator networkProtocolNegotiator = ApplicationLifecycleManager.U().N();
                NetworkConnectionOrchestrator networkConnectionOrchestrator = null;
                if (GeometryCalculator.C() >= 23) {
                    networkConnectionOrchestrator = networkProtocolNegotiator.T(reflectionUtilityBroker);
                }
                NetworkConnectionOrchestrator networkConnectionOrchestrator2 = null;
                if (GeometryCalculator.C() >= 23) {
                    networkConnectionOrchestrator2 = networkProtocolNegotiator.T(reflectionUtilityBroker.i());
                }
                try {
                    try {
                        if (networkProtocolNegotiator.T(reflectionUtilityBroker).I().y(networkConnectionOrchestrator) || networkProtocolNegotiator.T(reflectionUtilityBroker.i()).I().y(networkConnectionOrchestrator2)) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ExecutionOrchestrator.a(customSystemException);
                    }
                    bl = true;
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw ExecutionOrchestrator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static void G(Qh qh, double d2, double d3, double d4) {
        try {
            if (GeometryCalculator.C() == 13) {
                ExecutionOrchestrator.m(qh, d2, d3, d4);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionOrchestrator.a(customSystemException);
        }
        ReflectionUtilityBroker reflectionUtilityBroker = ReflectionUtilityBroker.L(d2, d3, d4);
        double d5 = d2 - (double)reflectionUtilityBroker.o();
        double d6 = d4 - (double)reflectionUtilityBroker.j();
        if (!ExecutionOrchestrator.W(reflectionUtilityBroker)) {
            int n;
            block27: {
                double d7;
                block26: {
                    block25: {
                        block24: {
                            n = -1;
                            d7 = 9999.0;
                            try {
                                if (!ExecutionOrchestrator.W(reflectionUtilityBroker.J()) || !(d5 < d7)) break block24;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ExecutionOrchestrator.a(customSystemException);
                            }
                            d7 = d5;
                            n = 0;
                        }
                        try {
                            if (!ExecutionOrchestrator.W(reflectionUtilityBroker.n()) || !(1.0 - d5 < d7)) break block25;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ExecutionOrchestrator.a(customSystemException);
                        }
                        d7 = 1.0 - d5;
                        n = 1;
                    }
                    try {
                        if (!ExecutionOrchestrator.W(reflectionUtilityBroker.Z()) || !(d6 < d7)) break block26;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ExecutionOrchestrator.a(customSystemException);
                    }
                    d7 = d6;
                    n = 4;
                }
                try {
                    if (!ExecutionOrchestrator.W(reflectionUtilityBroker.E()) || !(1.0 - d6 < d7)) break block27;
                }
                catch (CustomSystemException customSystemException) {
                    throw ExecutionOrchestrator.a(customSystemException);
                }
                d7 = 1.0 - d6;
                n = 5;
            }
            float f = 0.1f;
            try {
                if (n == 0) {
                    qh.t(-f);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionOrchestrator.a(customSystemException);
            }
            try {
                if (n == 1) {
                    qh.t(f);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionOrchestrator.a(customSystemException);
            }
            try {
                if (n == 4) {
                    qh.s((double)(-f));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionOrchestrator.a(customSystemException);
            }
            try {
                if (n == 5) {
                    qh.s((double)f);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionOrchestrator.a(customSystemException);
            }
        }
    }

    private static boolean J(int n, int n2, int n3, int n4) {
        int n5 = 0;
        while (true) {
            block5: {
                try {
                    try {
                        if (n5 >= n4) break;
                        if (!ExecutionOrchestrator.s(n, n2 + n5, n3 + 1)) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ExecutionOrchestrator.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw ExecutionOrchestrator.a(customSystemException);
                }
            }
            ++n5;
        }
        return true;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static DataTransmissionManager2384 E(Qh qh) {
        DataTransmissionManager2384 dataTransmissionManager2384 = DataTransmissionManager2384.h(ApplicationLifecycleManager.c(), qh.B());
        dataTransmissionManager2384.R(qh, true);
        ExecutionOrchestrator.o(dataTransmissionManager2384, qh);
        return dataTransmissionManager2384;
    }

    public static DataTransmissionManager2384 F() {
        return ExecutionOrchestrator.E(ApplicationLifecycleManager.U());
    }

    public static void Y(Qh qh, boolean bl) {
        try {
            if (Math.abs(qh.G()) < 0.005) {
                qh.t(0.0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionOrchestrator.a(customSystemException);
        }
        try {
            if (Math.abs(qh.x()) < 0.005) {
                qh.z(0.0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionOrchestrator.a(customSystemException);
        }
        try {
            if (Math.abs(qh.o()) < 0.005) {
                qh.s(0.0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionOrchestrator.a(customSystemException);
        }
        try {
            if (bl) {
                qh.c(qh.w() * 0.98f);
                qh.X(qh.u() * 0.98f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionOrchestrator.a(customSystemException);
        }
        ExecutionOrchestrator.G(qh, qh.F() - (double)qh.d() * 0.35, qh.S().c() + 0.5, qh.B() + (double)qh.d() * 0.35);
        ExecutionOrchestrator.G(qh, qh.F() - (double)qh.d() * 0.35, qh.S().c() + 0.5, qh.B() - (double)qh.d() * 0.35);
        ExecutionOrchestrator.G(qh, qh.F() + (double)qh.d() * 0.35, qh.S().c() + 0.5, qh.B() - (double)qh.d() * 0.35);
        ExecutionOrchestrator.G(qh, qh.F() + (double)qh.d() * 0.35, qh.S().c() + 0.5, qh.B() + (double)qh.d() * 0.35);
        ExecutionOrchestrator.E(qh, qh.w(), qh.u());
    }

    public static void c(Qh qh) {
        ExecutionOrchestrator.Y(qh, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void E(Qh qh, float f, float f2) {
        float f3;
        block60: {
            block62: {
                float f4;
                block77: {
                    block75: {
                        block76: {
                            boolean bl;
                            NetworkProtocolNegotiator networkProtocolNegotiator;
                            block78: {
                                boolean bl2;
                                block74: {
                                    block73: {
                                        block69: {
                                            boolean bl3;
                                            block72: {
                                                block71: {
                                                    block68: {
                                                        block67: {
                                                            block65: {
                                                                block66: {
                                                                    block63: {
                                                                        block64: {
                                                                            block61: {
                                                                                networkProtocolNegotiator = ApplicationLifecycleManager.U().N();
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            qh.G(false);
                                                                                            if (qh.F() && !qh.M().K()) break block60;
                                                                                        }
                                                                                        catch (CustomSystemException customSystemException) {
                                                                                            throw ExecutionOrchestrator.a(customSystemException);
                                                                                        }
                                                                                        if (!qh.x()) break block61;
                                                                                    }
                                                                                    catch (CustomSystemException customSystemException) {
                                                                                        throw ExecutionOrchestrator.a(customSystemException);
                                                                                    }
                                                                                    if (!qh.M().K()) break block62;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw ExecutionOrchestrator.a(customSystemException);
                                                                                }
                                                                            }
                                                                            f4 = 0.91f;
                                                                            try {
                                                                                if (!qh.j()) break block63;
                                                                                if (GeometryCalculator.C() <= 13) break block64;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw ExecutionOrchestrator.a(customSystemException);
                                                                            }
                                                                            f4 = networkProtocolNegotiator.T(ReflectionUtilityBroker.t(AdaptiveComputationEngine.Q(qh.F()), AdaptiveComputationEngine.Q(qh.S().c()) - 1, AdaptiveComputationEngine.Q(qh.B()))).I().r() * 0.91f;
                                                                            break block63;
                                                                        }
                                                                        N9 n9 = new N9(AdaptiveComputationEngine.Q(qh.F()), AdaptiveComputationEngine.Q(((oQ)qh.L()).c()) - 1, AdaptiveComputationEngine.Q(qh.B()));
                                                                        f4 = networkProtocolNegotiator.N(n9.x(), n9.J(), n9.b()).r() * 0.91f;
                                                                    }
                                                                    float f5 = 0.16277136f / (f4 * f4 * f4);
                                                                    float f6 = qh.j() ? qh.a() * f5 : qh.f();
                                                                    try {
                                                                        if (GeometryCalculator.C() < 23) {
                                                                            qh.u(f, f2, f6);
                                                                        }
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw ExecutionOrchestrator.a(customSystemException);
                                                                    }
                                                                    f4 = 0.91f;
                                                                    try {
                                                                        if (!qh.j()) break block65;
                                                                        if (GeometryCalculator.C() <= 13) break block66;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw ExecutionOrchestrator.a(customSystemException);
                                                                    }
                                                                    f4 = networkProtocolNegotiator.T(ReflectionUtilityBroker.t(AdaptiveComputationEngine.Q(qh.F()), AdaptiveComputationEngine.Q(qh.S().c()) - 1, AdaptiveComputationEngine.Q(qh.B()))).I().r() * 0.91f;
                                                                    break block65;
                                                                }
                                                                N9 n9 = new N9(AdaptiveComputationEngine.Q(qh.F()), AdaptiveComputationEngine.Q(((oQ)qh.L()).c()) - 1, AdaptiveComputationEngine.Q(qh.B()));
                                                                f4 = networkProtocolNegotiator.N(n9.x(), n9.J(), n9.b()).r() * 0.91f;
                                                            }
                                                            if (qh.T()) {
                                                                float f7 = 0.15f;
                                                                try {
                                                                    qh.t(AdaptiveComputationEngine.Z(qh.G(), -f7, f7));
                                                                    qh.s(AdaptiveComputationEngine.Z(qh.o(), -f7, f7));
                                                                    qh.V(0.0f);
                                                                    if (qh.x() < -0.15) {
                                                                        qh.z(-0.15);
                                                                    }
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw ExecutionOrchestrator.a(customSystemException);
                                                                }
                                                                boolean bl4 = qh.H();
                                                                try {
                                                                    try {
                                                                        if (!bl4 || !(qh.x() < 0.0)) break block67;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw ExecutionOrchestrator.a(customSystemException);
                                                                    }
                                                                    qh.z(0.0);
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw ExecutionOrchestrator.a(customSystemException);
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                qh.D(qh.G(), qh.x(), qh.o());
                                                                if (!qh.P() || !qh.T()) break block68;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw ExecutionOrchestrator.a(customSystemException);
                                                            }
                                                            qh.z(0.2);
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ExecutionOrchestrator.a(customSystemException);
                                                        }
                                                    }
                                                    try {
                                                        block70: {
                                                            try {
                                                                try {
                                                                    if (GeometryCalculator.C() <= 13) break block69;
                                                                    if (!networkProtocolNegotiator.P(ReflectionUtilityBroker.t((int)qh.F(), 0, (int)qh.B()))) break block70;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw ExecutionOrchestrator.a(customSystemException);
                                                                }
                                                                if (networkProtocolNegotiator.d(ReflectionUtilityBroker.t((int)qh.F(), 0, (int)qh.B())).x()) break block71;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw ExecutionOrchestrator.a(customSystemException);
                                                            }
                                                        }
                                                        bl3 = true;
                                                        break block72;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw ExecutionOrchestrator.a(customSystemException);
                                                    }
                                                }
                                                bl3 = false;
                                            }
                                            bl = bl3;
                                            break block78;
                                        }
                                        try {
                                            try {
                                                if (networkProtocolNegotiator.p((int)qh.F(), 0, (int)qh.B()) && networkProtocolNegotiator.n((int)qh.F(), (int)qh.B()).x()) break block73;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ExecutionOrchestrator.a(customSystemException);
                                            }
                                            bl2 = true;
                                            break block74;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ExecutionOrchestrator.a(customSystemException);
                                        }
                                    }
                                    bl2 = false;
                                }
                                bl = bl2;
                            }
                            try {
                                try {
                                    try {
                                        if (!networkProtocolNegotiator.s() || !bl) break block75;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ExecutionOrchestrator.a(customSystemException);
                                    }
                                    if (!(qh.V() > 0.0)) break block76;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ExecutionOrchestrator.a(customSystemException);
                                }
                                qh.z(-0.1);
                                break block77;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ExecutionOrchestrator.a(customSystemException);
                            }
                        }
                        qh.z(0.0);
                        break block77;
                    }
                    qh.z(qh.x() - 0.08);
                }
                qh.z(qh.x() * (double)0.98f);
                qh.t(qh.G() * (double)f4);
                qh.s(qh.o() * (double)f4);
                return;
            }
            double d2 = qh.V();
            try {
                if (GeometryCalculator.C() < 23) {
                    qh.u(f, f2, 0.02f);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionOrchestrator.a(customSystemException);
            }
            try {
                try {
                    qh.D(qh.G(), qh.x(), qh.o());
                    qh.t(qh.G() * 0.5);
                    qh.z(qh.x() * 0.5);
                    qh.s(qh.o() * 0.5);
                    qh.z(qh.x() - 0.02);
                    if (!qh.P() || !qh.u(qh.G(), qh.x() + (double)0.6f - qh.V() + d2, qh.o())) return;
                }
                catch (CustomSystemException customSystemException) {
                    throw ExecutionOrchestrator.a(customSystemException);
                }
                qh.z((double)0.3f);
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionOrchestrator.a(customSystemException);
            }
        }
        double d3 = qh.V();
        float f8 = 0.8f;
        float f9 = 0.02f;
        try {
            float f10 = f3 = (float)GeometryCalculator.C() > 13.0f ? (float)EventDispatchCoordinator1090.u(qh) : 0.0f;
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionOrchestrator.a(customSystemException);
        }
        if (f3 > 3.0f) {
            f3 = 3.0f;
        }
        if (!qh.j()) {
            f3 *= 0.5f;
        }
        if (f3 > 0.0f) {
            f8 += (0.54600006f - f8) * f3 / 3.0f;
            f9 += (qh.a() * 1.0f - f9) * f3 / 3.0f;
        }
        try {
            if (GeometryCalculator.C() < 23) {
                qh.u(f, f2, f9);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionOrchestrator.a(customSystemException);
        }
        try {
            try {
                qh.D(qh.G(), qh.x(), qh.o());
                qh.t(qh.G() * (double)f8);
                qh.z(qh.x() * (double)0.8f);
                qh.s(qh.o() * (double)f8);
                qh.z(qh.x() - 0.02);
                if (!qh.P() || !qh.u(qh.G(), qh.x() + (double)0.6f - qh.V() + d3, qh.o())) return;
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionOrchestrator.a(customSystemException);
            }
            qh.z((double)0.3f);
            return;
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionOrchestrator.a(customSystemException);
        }
    }

    private static boolean s(int n, int n2, int n3) {
        return ApplicationLifecycleManager.c().N(n, n2, n3).y(null);
    }

    public static void o(Qh qh, Qh qh2) {
        block14: {
            block13: {
                try {
                    try {
                        qh.B(qh2.F());
                        qh.Q(qh2.V());
                        qh.A(qh2.B());
                        qh.W(qh2.f());
                        qh.X(qh2.l());
                        qh.p(qh2.n());
                        qh.Z(qh2.b());
                        qh.G(qh2.q());
                        qh.M(qh2.I());
                        qh.s(((oQ)qh2.L()).B(0.0, 0.0, 0.0));
                        qh.t(qh2.G());
                        qh.z(qh2.x());
                        qh.s(qh2.o());
                        if (!ResourceAllocationManager.b() || !qh2.B(ReflectionMetadataResolver.rl)) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ExecutionOrchestrator.a(customSystemException);
                    }
                    qh.a(ResourceAllocationManager.c());
                    qh.f(ResourceAllocationManager.b());
                    break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw ExecutionOrchestrator.a(customSystemException);
                }
            }
            qh.a(qh2.q());
            qh.z(qh2.A());
            qh.f(qh2.S());
            qh.G(qh2.Q());
        }
        try {
            qh.X(qh2.u());
            qh.c(qh2.w());
            qh.h(qh2.o());
            qh.A(qh2.a());
            if (GeometryCalculator.C() < 37) {
                qh.q(qh2.f());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionOrchestrator.a(customSystemException);
        }
        try {
            qh.M(qh2.S());
            if (GeometryCalculator.C() == 13) {
                qh.W(qh2.X());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionOrchestrator.a(customSystemException);
        }
        try {
            if (GeometryCalculator.C() < 50) {
                qh.Z(qh2.m());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionOrchestrator.a(customSystemException);
        }
    }

    public static void m(Qh qh, double d2, double d3, double d4) {
        int n = AdaptiveComputationEngine.Q(d2);
        int n2 = AdaptiveComputationEngine.Q(d3);
        int n3 = AdaptiveComputationEngine.Q(d4);
        int n4 = Math.max(Math.round(qh.L()), 1);
        double d5 = d2 - (double)n;
        double d6 = d4 - (double)n3;
        boolean bl = true;
        int n5 = 0;
        while (true) {
            block24: {
                try {
                    if (n5 >= n4) break;
                    if (ExecutionOrchestrator.s(n, n2 + n5, n3)) break block24;
                }
                catch (CustomSystemException customSystemException) {
                    throw ExecutionOrchestrator.a(customSystemException);
                }
                bl = false;
            }
            ++n5;
        }
        if (bl) {
            block28: {
                double d7;
                block27: {
                    block26: {
                        block25: {
                            n5 = -1;
                            d7 = 9999.0;
                            try {
                                if (!ExecutionOrchestrator.J(n - 1, n2, n3, n4) || !(d5 < d7)) break block25;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ExecutionOrchestrator.a(customSystemException);
                            }
                            d7 = d5;
                            n5 = 0;
                        }
                        try {
                            if (!ExecutionOrchestrator.J(n + 1, n2, n3, n4) || !(1.0 - d5 < d7)) break block26;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ExecutionOrchestrator.a(customSystemException);
                        }
                        d7 = 1.0 - d5;
                        n5 = 1;
                    }
                    try {
                        if (!ExecutionOrchestrator.J(n, n2, n3 - 1, n4) || !(d6 < d7)) break block27;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ExecutionOrchestrator.a(customSystemException);
                    }
                    d7 = d6;
                    n5 = 4;
                }
                try {
                    if (!ExecutionOrchestrator.J(n, n2, n3 + 1, n4) || !(1.0 - d6 < d7)) break block28;
                }
                catch (CustomSystemException customSystemException) {
                    throw ExecutionOrchestrator.a(customSystemException);
                }
                d7 = 1.0 - d6;
                n5 = 5;
            }
            float f = 0.1f;
            try {
                if (n5 == 0) {
                    qh.t(-f);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionOrchestrator.a(customSystemException);
            }
            try {
                if (n5 == 1) {
                    qh.t(f);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionOrchestrator.a(customSystemException);
            }
            try {
                if (n5 == 4) {
                    qh.s((double)(-f));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionOrchestrator.a(customSystemException);
            }
            try {
                if (n5 == 5) {
                    qh.s((double)f);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionOrchestrator.a(customSystemException);
            }
        }
    }
}

