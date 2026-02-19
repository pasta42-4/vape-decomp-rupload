/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.NR;
import a.Qh;
import a.V3;
import a._Y;
import com.app.command.CommandExecutor;
import com.app.event.EventTrigger;
import com.app.network.NetworkConnectionHandler1792;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.entity.event.EntityEventMediator;
import com.event.management.EventDispatchCoordinator1011;
import com.event.management.EventDispatchCoordinator1090;
import com.event.management.EventDispatchCoordinator1933;
import com.exception.system.CustomSystemException;
import com.financial.payment.PaymentProcessingHandler;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.security.ProtocolValidator;
import com.network.streaming.DataStreamProcessor1233;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.LightweightExecutionContext;
import com.security.transform.CryptographicTransformer;
import com.system.monitoring.RuntimeResourceTracker;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N
implements NetworkConfigurationResolver2717 {
    private Object U;
    public static N J = new N();
    private List<PaymentProcessingHandler> f;
    private static AbstractComputationKernel[] C;
    private HashMap<Integer, NR> T = new HashMap();

    static float K(LightweightExecutionContext lightweightExecutionContext, Qh qh, boolean bl, boolean bl2) {
        return N.I(lightweightExecutionContext, qh, bl, bl2);
    }

    @DataExchangeProtocol2090
    public void I(EventDispatchCoordinator1011 eventDispatchCoordinator1011) {
        if (eventDispatchCoordinator1011.getEntity().B(ReflectionMetadataResolver.UQ)) {
            block17: {
                NR nR = this.T.getOrDefault(eventDispatchCoordinator1011.getEntity().X(), new NR(new Qh(eventDispatchCoordinator1011.getEntity())));
                try {
                    try {
                        if (nR == null) break block17;
                        NR.t(nR, new Qh(eventDispatchCoordinator1011.getEntity().M()));
                        if (!NR.l(nR).m(10000L)) break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw N.a(customSystemException);
                    }
                    NR.Z(nR, 20.0f);
                    NR.g(nR, 20);
                    NR.e(nR, 0);
                    NR.S(nR, 0.0f);
                    NR.M(nR, 5.0f);
                    NR.k(nR, null);
                    NR.a(nR, false);
                    NR.l(nR).m();
                }
                catch (CustomSystemException customSystemException) {
                    throw N.a(customSystemException);
                }
            }
            return;
        }
        try {
            if (!eventDispatchCoordinator1011.getEntity().B(ReflectionMetadataResolver.F6)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw N.a(customSystemException);
        }
        try {
            if (ApplicationLifecycleManager.U().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw N.a(customSystemException);
        }
        PaymentProcessingHandler paymentProcessingHandler = new PaymentProcessingHandler(eventDispatchCoordinator1011.getEntity());
        try {
            if (paymentProcessingHandler.a().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw N.a(customSystemException);
        }
        boolean bl = RuntimeResourceTracker.d(paymentProcessingHandler.a());
        try {
            if (!bl) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw N.a(customSystemException);
        }
        this.f.add(new PaymentProcessingHandler(eventDispatchCoordinator1011.getEntity().M()));
    }

    static {
        N.J(null);
    }

    public float l(Qh qh) {
        float f;
        try {
            if (!this.x()) {
                return qh.e();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw N.a(customSystemException);
        }
        NR nR = this.T.get(qh.X());
        try {
            f = nR != null ? NR.i(nR) : qh.e();
        }
        catch (CustomSystemException customSystemException) {
            throw N.a(customSystemException);
        }
        return f;
    }

    public static void J(AbstractComputationKernel[] abstractComputationKernelArray) {
        C = abstractComputationKernelArray;
    }

    public boolean x() {
        return TemporalMetadataResolver.h.a().s.s();
    }

    @DataExchangeProtocol2090
    public void t(EventTrigger eventTrigger) {
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        try {
            if (connectionConfigurationResolver.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw N.a(customSystemException);
        }
        try {
            if (this.U == null) {
                this.U = connectionConfigurationResolver.M();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw N.a(customSystemException);
        }
        try {
            if (!connectionConfigurationResolver.M().equals(this.U)) {
                this.f.clear();
                this.T.clear();
                this.U = connectionConfigurationResolver.M();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw N.a(customSystemException);
        }
        for (Object object : connectionConfigurationResolver.L()) {
            try {
                if (!ReflectionMetadataResolver.UQ.isAssignableFrom(object.getClass()) || ReflectionMetadataResolver.rl.isAssignableFrom(object.getClass())) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw N.a(customSystemException);
            }
            Qh cryptographicTransformer = new Qh(object);
            if (this.T.containsKey(cryptographicTransformer.X())) {
                NR nR = this.T.get(cryptographicTransformer.X());
                nR.P();
                continue;
            }
            this.T.put(cryptographicTransformer.X(), new NR(cryptographicTransformer));
        }
        ArrayList arrayList = new ArrayList();
        for (PaymentProcessingHandler paymentProcessingHandler : this.f) {
            if (connectionConfigurationResolver.L().contains(paymentProcessingHandler.M())) continue;
            double d2 = paymentProcessingHandler.F();
            double d3 = paymentProcessingHandler.V();
            double d4 = paymentProcessingHandler.B();
            for (Map.Entry<Integer, NR> entry : this.T.entrySet()) {
                boolean bl;
                CryptographicTransformer cryptographicTransformer;
                block24: {
                    cryptographicTransformer = ((NetworkProtocolNegotiator)connectionConfigurationResolver).I(entry.getKey());
                    try {
                        if (!cryptographicTransformer.r() || !cryptographicTransformer.B(ReflectionMetadataResolver.UQ)) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw N.a(customSystemException);
                    }
                    bl = false;
                    try {
                        try {
                            if (!(paymentProcessingHandler.V() > cryptographicTransformer.V() + 0.5) || !((double)cryptographicTransformer.y(paymentProcessingHandler) < 2.2)) break block24;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw N.a(customSystemException);
                        }
                        if (paymentProcessingHandler.r() < 5) break block24;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw N.a(customSystemException);
                    }
                    bl = true;
                }
                float f = N.V(new Qh(cryptographicTransformer.M()), paymentProcessingHandler.a(), d2, d3, d4, bl);
                NR nR = entry.getValue();
                NR.Z(nR, NR.i(nR) + f);
            }
            arrayList.add(paymentProcessingHandler);
        }
        try {
            if (arrayList.size() > 0) {
                this.f.removeAll(arrayList);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw N.a(customSystemException);
        }
    }

    private static float n(int n, double d2) {
        return (int)(d2 * (double)(4 << n) + 0.5);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static float I(LightweightExecutionContext lightweightExecutionContext, Qh qh, boolean bl, boolean bl2) {
        block14: {
            float f;
            block15: {
                float f2;
                block11: {
                    f2 = 1.0f;
                    if (lightweightExecutionContext.r()) {
                        int n;
                        EventDispatchCoordinator1933 eventDispatchCoordinator1933;
                        block13: {
                            block12: {
                                eventDispatchCoordinator1933 = lightweightExecutionContext.P();
                                try {
                                    try {
                                        if (eventDispatchCoordinator1933.j() <= 0) break block11;
                                        if (GeometryCalculator.C() != 23) break block12;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw N.a(customSystemException);
                                    }
                                    n = 1;
                                    break block13;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw N.a(customSystemException);
                                }
                            }
                            n = 0;
                        }
                        int n2 = n;
                        NetworkConnectionHandler1792 networkConnectionHandler1792 = new NetworkConnectionHandler1792(eventDispatchCoordinator1933.F().toArray()[n2]);
                        f2 += (float)networkConnectionHandler1792.y();
                    }
                }
                f = 0.0f;
                f = EventDispatchCoordinator1090.b(lightweightExecutionContext, ProtocolValidator.f());
                try {
                    try {
                        try {
                            if (!(f2 > 0.0f) && !(f > 0.0f)) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw N.a(customSystemException);
                        }
                        if (!bl2) break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw N.a(customSystemException);
                    }
                    if (!(f2 > 0.0f)) break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw N.a(customSystemException);
                }
                f2 *= 1.5f;
            }
            float f3 = N.q(qh, bl, f2 += f);
            return f3;
        }
        return 0.0f;
    }

    private static double u(CryptographicTransformer cryptographicTransformer, double d2, double d3, double d4) {
        double d5 = cryptographicTransformer.F() - d2;
        double d6 = cryptographicTransformer.V() - d3;
        double d7 = cryptographicTransformer.B() - d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public static AbstractComputationKernel[] J() {
        return C;
    }

    static float x(Qh qh, boolean bl, float f) {
        return N.q(qh, bl, f);
    }

    public boolean e() {
        return TemporalMetadataResolver.h.a().T.s();
    }

    @DataExchangeProtocol2090
    public void W(EntityEventMediator entityEventMediator) {
        block5: {
            try {
                if (!entityEventMediator.getEntity().B(ReflectionMetadataResolver.UQ) || !(ApplicationLifecycleManager.U().y(entityEventMediator.getEntity()) < 6.0f)) break block5;
            }
            catch (CustomSystemException customSystemException) {
                throw N.a(customSystemException);
            }
            NR nR = this.T.getOrDefault(entityEventMediator.getEntity().X(), null);
            try {
                if (nR != null) {
                    NR.P(nR, true);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw N.a(customSystemException);
            }
        }
    }

    private static float q(Qh qh, boolean bl, float f) {
        block2: {
            try {
                if (!bl || !(f > 0.0f)) break block2;
            }
            catch (CustomSystemException customSystemException) {
                throw N.a(customSystemException);
            }
            f = (1.0f + f) * 0.5f;
        }
        f = _Y.Q((TransactionOrchestrator1017)qh, f);
        f = _Y.S(qh, f);
        return f;
    }

    @DataExchangeProtocol2090
    public void k(CommandExecutor commandExecutor) {
        if (commandExecutor.getTarget().B(ReflectionMetadataResolver.UQ)) {
            NR nR = this.T.getOrDefault(commandExecutor.getTarget().X(), null);
            try {
                if (nR != null) {
                    NR.N(nR, new Qh(commandExecutor.getTarget().M()).w());
                    NR.Z(nR, 0);
                    NR.a(nR, true);
                    NR.k(nR, ApplicationLifecycleManager.U().a());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw N.a(customSystemException);
            }
        }
    }

    public boolean g() {
        return TemporalMetadataResolver.h.a().Y.s();
    }

    public N() {
        this.f = new ArrayList<PaymentProcessingHandler>();
    }

    private static float V(Qh qh, LightweightExecutionContext lightweightExecutionContext, double d2, double d3, double d4, boolean bl) {
        int n;
        double d5;
        block6: {
            d5 = N.u(qh, d2, d3, d4);
            n = 0;
            if (lightweightExecutionContext.C().B(ReflectionMetadataResolver.Fl)) {
                DataStreamProcessor1233 dataStreamProcessor1233 = new DataStreamProcessor1233(lightweightExecutionContext.C().M());
                try {
                    if (dataStreamProcessor1233.Q(lightweightExecutionContext) == null || !DataStreamProcessor1233.d(lightweightExecutionContext)) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw N.a(customSystemException);
                }
                for (V3 v3 : dataStreamProcessor1233.g(lightweightExecutionContext)) {
                    if (v3.n() != 6) continue;
                    n = v3.y();
                }
            }
        }
        if (d5 < 16.0) {
            double d6 = 1.0 - Math.sqrt(d5) / 4.0;
            if (bl) {
                d6 = 1.0;
            }
            return N.n(n, d6);
        }
        return 0.0f;
    }
}

