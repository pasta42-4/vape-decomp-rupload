/*
 * Decompiled with CFR 0.152.
 */
package com.state.management;

import a.Om;
import com.computation.core.ComputationalOrchestrator;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.metrics.tracking.MeasurementTracker;
import com.network.protocol.ProtocolInteractionController;
import com.runtime.context.LightweightExecutionContext;
import com.security.computation.SecureComputationFramework;
import com.security.negotiation.CryptoKeyNegotiationService;
import com.system.configuration.ConfigurationManager;
import com.system.monitoring.RuntimeResourceTracker;
import java.util.HashMap;

public class StateTransitionController {
    private static boolean w;
    static HashMap<MeasurementTracker, Om> a;

    public static Om P(int n, int n2, float f) {
        MeasurementTracker measurementTracker = new MeasurementTracker(n, n2, f);
        if (!a.containsKey(measurementTracker)) {
            ProtocolInteractionController protocolInteractionController = ProtocolInteractionController.Y(n);
            try {
                if (protocolInteractionController.Y()) {
                    return null;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw StateTransitionController.a(customSystemException);
            }
            LightweightExecutionContext lightweightExecutionContext = LightweightExecutionContext.d(protocolInteractionController);
            lightweightExecutionContext.S(n2);
            return StateTransitionController.G(lightweightExecutionContext, measurementTracker);
        }
        return null;
    }

    public static void x(LightweightExecutionContext lightweightExecutionContext, float f, float f2, int n, int n2, float f3) {
        StateTransitionController.W(lightweightExecutionContext, null, f, f2, n, n2, f3, 1.0f, false);
    }

    public static void A(LightweightExecutionContext lightweightExecutionContext, float f, float f2, int n, int n2, float f3, float f4) {
        StateTransitionController.W(lightweightExecutionContext, null, f, f2, n, n2, f3, f4, false);
    }

    public static Om U(MeasurementTracker measurementTracker, LightweightExecutionContext lightweightExecutionContext) {
        try {
            if (!a.containsKey(measurementTracker)) {
                return StateTransitionController.G(lightweightExecutionContext, measurementTracker);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StateTransitionController.a(customSystemException);
        }
        return null;
    }

    public static void x(int n, int n2, float f, float f2, int n3, int n4, float f3) {
        StateTransitionController.h(n, n2, f, f2, n3, n4, f3, 1.0f, false);
    }

    public static void u(int n, int n2, float f, float f2, int n3, int n4, float f3, boolean bl) {
        StateTransitionController.h(n, n2, f, f2, n3, n4, f3, 1.0f, bl);
    }

    public static void I(int n, int n2, float f, float f2, int n3, int n4) {
        StateTransitionController.h(n, n2, f, f2, n3, n4, 1.0f, 1.0f, false);
    }

    public static void B(int n, int n2) {
        StateTransitionController.P(n, n2, 1.0f);
    }

    public static void b(boolean bl) {
        w = bl;
    }

    public static void y(int n, int n2, float f, float f2, int n3, int n4, boolean bl) {
        StateTransitionController.h(n, n2, f, f2, n3, n4, 1.0f, 1.0f, bl);
    }

    private static void L(int n, int n2, LightweightExecutionContext lightweightExecutionContext, float f, float f2, int n3, int n4, float f3, float f4, boolean bl) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                ConfigurationManager.G(lightweightExecutionContext, f4, f, f2);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StateTransitionController.a(customSystemException);
        }
        MeasurementTracker measurementTracker = StateTransitionController.W(n, n2, f4, lightweightExecutionContext);
        Om om = a.get(measurementTracker);
        try {
            if (om != null) {
                om.W(f, f2, n3, n4, f3, bl);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StateTransitionController.a(customSystemException);
        }
        Om om2 = StateTransitionController.U(measurementTracker, lightweightExecutionContext);
        try {
            if (om2 != null) {
                om2.W(f, f2, n3, n4, f3, bl);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StateTransitionController.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void h(int n, int n2, float f, float f2, int n3, int n4, float f3, float f4, boolean bl) {
        LightweightExecutionContext lightweightExecutionContext = LightweightExecutionContext.d(ProtocolInteractionController.Y(n));
        lightweightExecutionContext.S(n2);
        StateTransitionController.L(n, n2, lightweightExecutionContext, f, f2, n3, n4, f3, f4, bl);
    }

    private static int x(LightweightExecutionContext lightweightExecutionContext, ProtocolInteractionController protocolInteractionController) {
        block4: {
            try {
                try {
                    if (!RuntimeResourceTracker.t(protocolInteractionController) && !RuntimeResourceTracker.l(protocolInteractionController)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw StateTransitionController.a(customSystemException);
                }
                return 0;
            }
            catch (CustomSystemException customSystemException) {
                throw StateTransitionController.a(customSystemException);
            }
        }
        return lightweightExecutionContext.b();
    }

    static {
        a = new HashMap();
        StateTransitionController.b(false);
    }

    public static void W(LightweightExecutionContext lightweightExecutionContext, float f, float f2, int n, int n2, float f3, boolean bl) {
        StateTransitionController.W(lightweightExecutionContext, null, f, f2, n, n2, f3, 1.0f, bl);
    }

    public static boolean v() {
        return w;
    }

    private static MeasurementTracker W(int n, int n2, float f, LightweightExecutionContext lightweightExecutionContext) {
        MeasurementTracker measurementTracker;
        block3: {
            measurementTracker = new MeasurementTracker(n, n2, f);
            if (lightweightExecutionContext != null) {
                ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
                try {
                    if (!RuntimeResourceTracker.l(protocolInteractionController) || GeometryCalculator.C() > 15) break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw StateTransitionController.a(customSystemException);
                }
                SecureComputationFramework secureComputationFramework = new SecureComputationFramework(protocolInteractionController.M());
                measurementTracker.W(secureComputationFramework.I(lightweightExecutionContext));
            }
        }
        return measurementTracker;
    }

    private static Om G(LightweightExecutionContext lightweightExecutionContext, MeasurementTracker measurementTracker) {
        Om om = ConfigurationManager.U() ? new ComputationalOrchestrator() : new CryptoKeyNegotiationService();
        om.V(lightweightExecutionContext, measurementTracker.O());
        a.put(measurementTracker, om);
        return om;
    }

    public static void W(LightweightExecutionContext lightweightExecutionContext, ProtocolInteractionController protocolInteractionController, float f, float f2, int n, int n2, float f3, float f4, boolean bl) {
        try {
            if (lightweightExecutionContext == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StateTransitionController.a(customSystemException);
        }
        if (protocolInteractionController == null) {
            protocolInteractionController = lightweightExecutionContext.C();
        }
        int n3 = protocolInteractionController.O();
        int n4 = StateTransitionController.x(lightweightExecutionContext, protocolInteractionController);
        StateTransitionController.L(n3, n4, lightweightExecutionContext, f, f2, n, n2, f3, f4, bl);
    }

    public static void V() {
        for (Om om : a.values()) {
            om.P();
        }
        a.clear();
    }

    public static void x(LightweightExecutionContext lightweightExecutionContext, float f, float f2, int n, int n2) {
        StateTransitionController.W(lightweightExecutionContext, null, f, f2, n, n2, 1.0f, 1.0f, false);
    }

    public static void q(LightweightExecutionContext lightweightExecutionContext) {
        ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
        StateTransitionController.P(protocolInteractionController.O(), StateTransitionController.x(lightweightExecutionContext, protocolInteractionController), 1.0f);
    }

    public static boolean F() {
        boolean bl = StateTransitionController.v();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StateTransitionController.a(customSystemException);
        }
        return false;
    }
}

