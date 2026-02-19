/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.core.computation.AbstractComputationKernel;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.connection.NetworkConnectionManager1945;
import com.request.management.RequestDispatchCoordinator;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.AuthenticationStateManager675;
import com.security.authentication.AuthenticationValidator2490;
import com.stream.transformation.StreamTransformationService;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.resource.ResourceAllocationManager1749;
import com.transaction.management.TransactionOrchestrator1017;
import java.util.List;
import java.util.Map;

public class ProtocolInteractionController
extends ObjectLifecycleTracker {
    private static AbstractComputationKernel[] Q;

    public String n() {
        return StreamTransformationService.c(ProtocolInteractionController.U.u().LU, this.H);
    }

    public String m(LightweightExecutionContext lightweightExecutionContext) {
        return StreamTransformationService.x(ProtocolInteractionController.U.u().LU, this.M(), lightweightExecutionContext.M());
    }

    public static void w(AbstractComputationKernel[] abstractComputationKernelArray) {
        Q = abstractComputationKernelArray;
    }

    public static AuthenticationValidator2490 e() {
        return new AuthenticationValidator2490(StreamTransformationService.Y(ProtocolInteractionController.U.u().LU));
    }

    public static Map p() {
        try {
            if (GeometryCalculator.C() >= 15) {
                return StreamTransformationService.D(ProtocolInteractionController.U.u().LU);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw ProtocolInteractionController.a(numberFormatException);
        }
        return null;
    }

    public ResourceAllocationManager1749 C() {
        return new ResourceAllocationManager1749(StreamTransformationService.Q(ProtocolInteractionController.U.u().LU, this.H));
    }

    public int o(LightweightExecutionContext lightweightExecutionContext, TransactionOrchestrator1017 transactionOrchestrator1017) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return ProtocolInteractionController.U.u().LU.n(this.H, lightweightExecutionContext.M(), transactionOrchestrator1017.M());
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw ProtocolInteractionController.a(numberFormatException);
        }
        return StreamTransformationService.v(ProtocolInteractionController.U.u().LU, this.H, lightweightExecutionContext.M());
    }

    public LightweightExecutionContext A() {
        return new LightweightExecutionContext(StreamTransformationService.N(ProtocolInteractionController.U.u().LU, this.H));
    }

    public String r() {
        return StreamTransformationService.Y(ProtocolInteractionController.U.u().LU, this.M());
    }

    public ProtocolInteractionController(Object object) {
        super(object);
    }

    public static AbstractComputationKernel[] a() {
        return Q;
    }

    public static ProtocolInteractionController d(String string) {
        ProtocolInteractionController protocolInteractionController;
        if (GeometryCalculator.C() >= 35) {
            ProtocolInteractionController protocolInteractionController2;
            NetworkConnectionManager1945 networkConnectionManager1945 = NetworkConnectionManager1945.L(string);
            Object object = ProtocolInteractionController.e().D(networkConnectionManager1945.M());
            try {
                protocolInteractionController2 = object == null ? null : new ProtocolInteractionController(object);
            }
            catch (NumberFormatException numberFormatException) {
                throw ProtocolInteractionController.a(numberFormatException);
            }
            return protocolInteractionController2;
        }
        if (GeometryCalculator.C() == 13) {
            try {
                int n = Integer.parseInt(string);
                return ProtocolInteractionController.Y(n);
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
        }
        Object object = StreamTransformationService.w(ProtocolInteractionController.U.u().LU, string);
        try {
            protocolInteractionController = object == null ? null : new ProtocolInteractionController(object);
        }
        catch (NumberFormatException numberFormatException) {
            throw ProtocolInteractionController.a(numberFormatException);
        }
        return protocolInteractionController;
    }

    public String D() {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return AuthenticationStateManager675.W(this.n()).i();
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw ProtocolInteractionController.a(numberFormatException);
        }
        AuthenticationStateManager675 authenticationStateManager675 = new AuthenticationStateManager675(StreamTransformationService.Y(ProtocolInteractionController.U.u().LU, this.H));
        return authenticationStateManager675.i();
    }

    public void l(ProtocolInteractionController protocolInteractionController, List list) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw ProtocolInteractionController.a(numberFormatException);
        }
        StreamTransformationService.L(ProtocolInteractionController.U.u().LU, this.H, protocolInteractionController.M(), RequestDispatchCoordinator.F().M(), list);
    }

    public static int l(ProtocolInteractionController protocolInteractionController) {
        return StreamTransformationService.Z(ProtocolInteractionController.U.u().LU, protocolInteractionController.M());
    }

    public boolean G() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return false;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw ProtocolInteractionController.a(numberFormatException);
        }
        return StreamTransformationService.J(ProtocolInteractionController.U.u().LU, this.H);
    }

    public static ProtocolInteractionController Y(int n) {
        return new ProtocolInteractionController(StreamTransformationService.x(ProtocolInteractionController.U.u().LU, n));
    }

    public int O() {
        return ProtocolInteractionController.l(this);
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    static {
        if (ProtocolInteractionController.a() != null) {
            ProtocolInteractionController.w(new AbstractComputationKernel[3]);
        }
    }

    public int v() {
        try {
            if (GeometryCalculator.C() >= 50) {
                return this.A().j();
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw ProtocolInteractionController.a(numberFormatException);
        }
        return StreamTransformationService.c(ProtocolInteractionController.U.u().LU, this.H);
    }

    public String y(LightweightExecutionContext lightweightExecutionContext) {
        if (GeometryCalculator.C() >= 35) {
            AuthenticationStateManager675 authenticationStateManager675 = new AuthenticationStateManager675(StreamTransformationService.h(ProtocolInteractionController.U.u().LU, this.M(), lightweightExecutionContext.M()));
            return authenticationStateManager675.i();
        }
        return StreamTransformationService.h(ProtocolInteractionController.U.u().LU, this.M(), lightweightExecutionContext.M()).toString();
    }
}

