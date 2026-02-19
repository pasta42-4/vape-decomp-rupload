/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ne;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.messaging.NetworkMessageBroker;
import com.system.lifecycle.ObjectLifecycleTracker;

public class tR
extends ObjectLifecycleTracker {
    public static void l() {
        try {
            if (GeometryCalculator.C() >= 37) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw tR.a(customSystemException);
        }
        NetworkMessageBroker.N(tR.U.u().kH);
    }

    public tR(Object object) {
        super(object);
    }

    public static void g() {
        try {
            if (GeometryCalculator.C() >= 37) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw tR.a(customSystemException);
        }
        NetworkMessageBroker.n(tR.U.u().kH);
    }

    public static void c() {
        try {
            if (GeometryCalculator.C() >= 37) {
                NetworkMessageBroker.C(tR.U.u().kH);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw tR.a(customSystemException);
        }
        try {
            if (GeometryCalculator.C() >= 35) {
                Ne.h.z();
                Ne.h.f(-30.0f, 0.0f, 1.0f, 0.0f);
                Ne.h.f(165.0f, 1.0f, 0.0f, 0.0f);
                tR.l();
                Ne.h.X();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw tR.a(customSystemException);
        }
        NetworkMessageBroker.C(tR.U.u().kH);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

