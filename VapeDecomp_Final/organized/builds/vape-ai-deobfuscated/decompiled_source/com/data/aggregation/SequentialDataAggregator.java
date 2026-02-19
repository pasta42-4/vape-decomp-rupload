/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.data.aggregation;

import a.IL;
import a.JF;
import a.Qh;
import com.computation.metrics.MetricComputationEngine;
import com.data.comparison.ComparativeIdentifier;
import com.event.processing.EventStreamProcessor;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolNegotiator;
import com.security.context.SecureContextBroker572;
import com.security.crypto.CryptoSecurityProvider;
import com.system.state.SystemStateManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.user.identity.UserIdentityManager;
import com.workflow.coordination.WorkflowOrchestrator1642;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.Nullable;

public class SequentialDataAggregator {
    private final ArrayList<Integer> A;
    private final Set<Long> X;
    private int y;
    private final Map<Long, UserIdentityManager> o;
    private final Map<Long, Long> U;
    private final Map<Long, Long> m = new ConcurrentHashMap<Long, Long>();
    private int T;
    private final Map<Long, MetricComputationEngine> P = new ConcurrentHashMap<Long, MetricComputationEngine>();

    public SequentialDataAggregator() {
        this.o = new ConcurrentHashMap<Long, UserIdentityManager>();
        this.U = new ConcurrentHashMap<Long, Long>();
        this.X = new LinkedHashSet<Long>();
        this.A = new ArrayList();
    }

    @Nullable
    public MetricComputationEngine o(UserIdentityManager userIdentityManager) {
        return this.x(userIdentityManager.s().r());
    }

    public void h(Qh qh) {
        block31: {
            SystemStateManager systemStateManager;
            block36: {
                block38: {
                    Map<Integer, ComparativeIdentifier> map;
                    block37: {
                        int n;
                        boolean bl;
                        boolean bl2;
                        Object object;
                        block35: {
                            block34: {
                                boolean bl3;
                                boolean bl4;
                                block33: {
                                    block32: {
                                        block30: {
                                            try {
                                                if (this.y++ % 20 != 19 || this.o.isEmpty()) break block30;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw SequentialDataAggregator.a(customSystemException);
                                            }
                                            object = new long[this.o.size()];
                                            int n2 = 0;
                                            for (Long l : this.o.keySet()) {
                                                object[n2++] = l;
                                            }
                                            this.o.clear();
                                            SecureContextBroker572.h().c().d((long[])object);
                                            this.y = 0;
                                        }
                                        object = TemporalMetadataResolver.h.O().n().i();
                                        JF jF = TemporalMetadataResolver.h.O().p().Q();
                                        systemStateManager = TemporalMetadataResolver.h.O().N();
                                        try {
                                            try {
                                                try {
                                                    if (jF == null || this.p()) break block31;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SequentialDataAggregator.a(customSystemException);
                                                }
                                                if (systemStateManager.V()) break block32;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw SequentialDataAggregator.a(customSystemException);
                                            }
                                            bl4 = true;
                                            break block33;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw SequentialDataAggregator.a(customSystemException);
                                        }
                                    }
                                    bl4 = false;
                                }
                                bl2 = bl4;
                                try {
                                    bl3 = systemStateManager.Z() % 20 == 19;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SequentialDataAggregator.a(customSystemException);
                                }
                                boolean bl5 = bl3;
                                try {
                                    try {
                                        if (!bl2 && !bl5) break block34;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SequentialDataAggregator.a(customSystemException);
                                    }
                                    bl = true;
                                    break block35;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SequentialDataAggregator.a(customSystemException);
                                }
                            }
                            bl = false;
                        }
                        boolean bl6 = bl;
                        int n3 = systemStateManager.p();
                        map = systemStateManager.b(qh, bl6);
                        int n4 = systemStateManager.p();
                        try {
                            for (n = 0; n < systemStateManager.g().length; ++n) {
                                ((MetricComputationEngine)object).W()[n] = systemStateManager.g()[n];
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SequentialDataAggregator.a(customSystemException);
                        }
                        try {
                            for (n = 0; n < systemStateManager.I().length; ++n) {
                                ((MetricComputationEngine)object).n()[n] = systemStateManager.I()[n];
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SequentialDataAggregator.a(customSystemException);
                        }
                        try {
                            if (n3 != n4) {
                                SecureContextBroker572.h().c().a(n4);
                                ((MetricComputationEngine)object).d(n4);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SequentialDataAggregator.a(customSystemException);
                        }
                        try {
                            try {
                                try {
                                    if (map.isEmpty() && !bl2) break block36;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SequentialDataAggregator.a(customSystemException);
                                }
                                if (!bl2) break block37;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SequentialDataAggregator.a(customSystemException);
                            }
                            systemStateManager.r();
                            break block38;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SequentialDataAggregator.a(customSystemException);
                        }
                    }
                    systemStateManager.j(map);
                }
                systemStateManager.a(0);
                break block31;
            }
            systemStateManager.a(systemStateManager.Z() + 1);
        }
    }

    @Nullable
    public MetricComputationEngine x(long l) {
        return this.P.get(l);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void P(long l) {
        this.m.put(l, System.currentTimeMillis() + 2000L);
        this.P.remove(l);
        this.o.remove(l);
        this.U.remove(l);
        Set<Long> set = this.X;
        synchronized (set) {
            this.X.remove(l);
        }
    }

    private void o() {
        for (Long l : this.P.keySet()) {
            MetricComputationEngine metricComputationEngine = this.P.get(l);
            try {
                if (metricComputationEngine.r() <= 0) continue;
                metricComputationEngine.G(metricComputationEngine.r() - 1);
            }
            catch (CustomSystemException customSystemException) {
                throw SequentialDataAggregator.a(customSystemException);
            }
        }
    }

    public void r() {
        this.G(true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void G(boolean bl) {
        this.m.clear();
        this.P.clear();
        this.o.clear();
        this.U.clear();
        Set<Long> set = this.X;
        synchronized (set) {
            this.X.clear();
        }
        try {
            this.y = 0;
            EventStreamProcessor.B.t();
            if (bl) {
                SecureContextBroker572.h().c().U();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SequentialDataAggregator.a(customSystemException);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void M(Qh qh, NetworkProtocolNegotiator networkProtocolNegotiator) {
        try {
            if (networkProtocolNegotiator.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SequentialDataAggregator.a(customSystemException);
        }
        CryptoSecurityProvider cryptoSecurityProvider = TemporalMetadataResolver.h.O().n();
        LinkedHashSet<UserIdentityManager> linkedHashSet = new LinkedHashSet<UserIdentityManager>(TemporalMetadataResolver.h.M().q());
        JF jF = TemporalMetadataResolver.h.O().p().Q();
        try {
            if (jF != null) {
                linkedHashSet.addAll(jF.u());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SequentialDataAggregator.a(customSystemException);
        }
        LinkedHashMap<String, UserIdentityManager> linkedHashMap = new LinkedHashMap<String, UserIdentityManager>();
        for (UserIdentityManager userIdentityManager : linkedHashSet) {
            try {
                if (userIdentityManager.s().r() == cryptoSecurityProvider.s().r()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SequentialDataAggregator.a(customSystemException);
            }
            try {
                if (userIdentityManager.X().isEmpty()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SequentialDataAggregator.a(customSystemException);
            }
            linkedHashMap.put(userIdentityManager.X(), userIdentityManager);
        }
        for (UserIdentityManager userIdentityManager : networkProtocolNegotiator.M()) {
            Long l;
            Qh qh2 = new Qh(userIdentityManager);
            UserIdentityManager userIdentityManager2 = (UserIdentityManager)linkedHashMap.get(qh2.e());
            try {
                if (userIdentityManager2 == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SequentialDataAggregator.a(customSystemException);
            }
            try {
                if (qh2.r() < 20) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SequentialDataAggregator.a(customSystemException);
            }
            Long l2 = this.m.get(userIdentityManager2.s().r());
            if (l2 != null) {
                long l3 = System.currentTimeMillis() - l2;
                if (l3 <= 2000L) continue;
                this.m.remove(userIdentityManager2.s().r());
            }
            if ((l = this.U.get(userIdentityManager2.s().r())) != null) {
                long l4 = System.currentTimeMillis() - l;
                if (l4 <= 2000L) continue;
                Set<Long> set = this.X;
                synchronized (set) {
                    if (this.X.contains(userIdentityManager2.s().r())) {
                        continue;
                    }
                    this.X.add(userIdentityManager2.s().r());
                    SecureContextBroker572.h().c().B(userIdentityManager2.s().r(), (int)qh2.F(), (int)qh2.V(), (int)qh2.B());
                    continue;
                }
            }
            if (this.c(userIdentityManager2) || this.o.containsKey(userIdentityManager2.s().r())) continue;
            try {
                if (this.U.containsKey(userIdentityManager2.s().r())) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SequentialDataAggregator.a(customSystemException);
            }
            this.U.put(userIdentityManager2.s().r(), System.currentTimeMillis());
            this.o.put(userIdentityManager2.s().r(), userIdentityManager2);
        }
        this.h(qh);
    }

    public boolean c(UserIdentityManager userIdentityManager) {
        return this.u(userIdentityManager.s().r());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void P(UserIdentityManager userIdentityManager) {
        try {
            if (userIdentityManager.s().r() == TemporalMetadataResolver.h.O().n().s().r()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SequentialDataAggregator.a(customSystemException);
        }
        this.U.remove(userIdentityManager.s().r());
        Set<Long> set = this.X;
        synchronized (set) {
            this.X.remove(userIdentityManager.s().r());
        }
        try {
            if (!this.P.containsKey(userIdentityManager.s().r())) {
                this.P.put(userIdentityManager.s().r(), new MetricComputationEngine(userIdentityManager));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SequentialDataAggregator.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean p() {
        return this.P.isEmpty();
    }

    private void I() {
        for (Long l : this.P.keySet()) {
            MetricComputationEngine metricComputationEngine = this.P.get(l);
            try {
                if (metricComputationEngine.P() <= 0) continue;
                metricComputationEngine.O(metricComputationEngine.P() - 1);
            }
            catch (CustomSystemException customSystemException) {
                throw SequentialDataAggregator.a(customSystemException);
            }
        }
    }

    public void M(WorkflowOrchestrator1642 workflowOrchestrator1642) {
        block6: {
            block7: {
                JF jF = TemporalMetadataResolver.h.O().p().Q();
                try {
                    try {
                        try {
                            if (this.T++ % 20 != 19 && workflowOrchestrator1642.P().P() != 10) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SequentialDataAggregator.a(customSystemException);
                        }
                        if (jF == null) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SequentialDataAggregator.a(customSystemException);
                    }
                    SecureContextBroker572.h().c().K(new IL(workflowOrchestrator1642));
                }
                catch (CustomSystemException customSystemException) {
                    throw SequentialDataAggregator.a(customSystemException);
                }
            }
            this.T = 0;
        }
        this.I();
        this.o();
    }

    @Nullable
    public MetricComputationEngine u(String string) {
        for (MetricComputationEngine metricComputationEngine : this.b()) {
            try {
                if (!string.equals(metricComputationEngine.z().X())) continue;
                return metricComputationEngine;
            }
            catch (CustomSystemException customSystemException) {
                throw SequentialDataAggregator.a(customSystemException);
            }
        }
        return null;
    }

    public Collection<MetricComputationEngine> b() {
        return this.P.values();
    }

    public boolean u(long l) {
        return this.P.containsKey(l);
    }
}

