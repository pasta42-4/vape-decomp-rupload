/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.app.gameengine.GameRoundProcessor;
import com.app.network.CommunicationProtocolManager1453;
import com.caching.strategy.CacheInvalidationStrategy;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.security.policy.PolicyConfigurationManager;
import com.security.protocol.SecurityProtocolHandler1908;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.transaction.validation.TransactionValidator1298;

public class V3
extends ObjectLifecycleTracker {
    public int y() {
        return PolicyConfigurationManager.X(V3.U.u().h, this.H);
    }

    private static V3 M(CommunicationProtocolManager1453 communicationProtocolManager1453, int n, int n2) {
        return new V3(V3.U.u().h.T(communicationProtocolManager1453.M(), n, n2));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int V() {
        return PolicyConfigurationManager.d(V3.U.u().h, this.H);
    }

    public V3(Object object) {
        super(object);
    }

    private static V3 W(CacheInvalidationStrategy cacheInvalidationStrategy, int n, int n2) {
        return new V3(V3.U.u().h.T(cacheInvalidationStrategy.M(), n, n2));
    }

    public boolean p() {
        return PolicyConfigurationManager.m(V3.U.u().h, this.H);
    }

    public int n() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return CommunicationProtocolManager1453.s(this.G());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw V3.a(customSystemException);
        }
        try {
            if (GeometryCalculator.C() >= 23) {
                return new TransactionValidator1298(PolicyConfigurationManager.i(V3.U.u().h, this.H)).u();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw V3.a(customSystemException);
        }
        return PolicyConfigurationManager.m(V3.U.u().h, this.H);
    }

    public static V3 H(int n, int n2, int n3) {
        if (GeometryCalculator.C() >= 50) {
            GameRoundProcessor gameRoundProcessor = SecurityProtocolHandler1908.g();
            CacheInvalidationStrategy cacheInvalidationStrategy = gameRoundProcessor.w(gameRoundProcessor.e(n));
            return V3.W(cacheInvalidationStrategy, n2, n3);
        }
        try {
            if (GeometryCalculator.C() >= 35) {
                return V3.M(CommunicationProtocolManager1453.J(n), n2, n3);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw V3.a(customSystemException);
        }
        try {
            if (GeometryCalculator.C() >= 23) {
                return V3.J(TransactionValidator1298.l(n), n2, n3);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw V3.a(customSystemException);
        }
        return new V3(PolicyConfigurationManager.X(V3.U.u().h, n, n2, n3));
    }

    public CacheInvalidationStrategy U() {
        return new CacheInvalidationStrategy(PolicyConfigurationManager.i(V3.U.u().h, this.H));
    }

    public CommunicationProtocolManager1453 G() {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return new CommunicationProtocolManager1453(new CacheInvalidationStrategy(PolicyConfigurationManager.i(V3.U.u().h, this.H)).b());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw V3.a(customSystemException);
        }
        return new CommunicationProtocolManager1453(PolicyConfigurationManager.i(V3.U.u().h, this.H));
    }

    private static V3 J(TransactionValidator1298 transactionValidator1298, int n, int n2) {
        return new V3(V3.U.u().h.T(transactionValidator1298.M(), n, n2));
    }
}

