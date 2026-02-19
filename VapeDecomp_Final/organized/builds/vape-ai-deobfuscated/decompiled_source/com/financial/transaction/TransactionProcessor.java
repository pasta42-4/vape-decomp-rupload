/*
 * Decompiled with CFR 0.152.
 */
package com.financial.transaction;

import a.oQ;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.database.connection.DatabaseConnectionPool;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.connection.ConnectionNegotiationHandler;
import com.network.protocol.NetworkProtocolAdapter990;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.transform.CryptographicTransformer;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class TransactionProcessor
extends ObjectLifecycleTracker {
    public NetworkProtocolAdapter990 r(int n, int n2, DatabaseConnectionPool databaseConnectionPool) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return ApplicationLifecycleManager.c().X(ReflectionUtilityBroker.t(n, 0, n2));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionProcessor.a(customSystemException);
        }
        try {
            if (GeometryCalculator.C() > 13) {
                return this.e(ReflectionUtilityBroker.t(n, 0, n2), databaseConnectionPool);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionProcessor.a(customSystemException);
        }
        return new NetworkProtocolAdapter990(TransactionProcessor.U.u().Gr.n(this.H, n & 0xF, n2 & 0xF, databaseConnectionPool.M()));
    }

    public List<ConnectionNegotiationHandler> O() {
        Object[] objectArray = TransactionProcessor.U.u().Gr.p(this.H);
        ArrayList<ConnectionNegotiationHandler> arrayList = new ArrayList<ConnectionNegotiationHandler>();
        for (Object object : objectArray) {
            arrayList.add(new ConnectionNegotiationHandler(object));
        }
        return arrayList;
    }

    public Map R() {
        return (Map)TransactionProcessor.U.u().Gr.G(this.H);
    }

    public int E(int n) {
        try {
            if (GameVersionEnumerator.MC_1_20_6.H()) {
                return TransactionProcessor.U.u().Gr.n(this.H, n);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionProcessor.a(customSystemException);
        }
        return n >> 4;
    }

    private static boolean lambda$getEntitiesWithinAABBForEntity$0(Object object) {
        return true;
    }

    public Object[] B() {
        return TransactionProcessor.U.u().Gr.p(this.H);
    }

    private NetworkProtocolAdapter990 e(ReflectionUtilityBroker reflectionUtilityBroker, DatabaseConnectionPool databaseConnectionPool) {
        return new NetworkProtocolAdapter990(TransactionProcessor.U.u().Gr.g(this.H, reflectionUtilityBroker.M(), databaseConnectionPool.M()));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int c() {
        return TransactionProcessor.U.u().Gr.h(this.H);
    }

    public TransactionProcessor(Object object) {
        super(object);
    }

    public boolean x() {
        return TransactionProcessor.U.u().Gr.B(this.H);
    }

    private static void lambda$getEntitiesWithinAABBForEntity$1(oQ oQ2, Predicate predicate, List list, Object object) {
        block4: {
            try {
                try {
                    if (object == oQ2 || !predicate.test(object)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionProcessor.a(customSystemException);
                }
                list.add(new CryptographicTransformer(object));
            }
            catch (CustomSystemException customSystemException) {
                throw TransactionProcessor.a(customSystemException);
            }
        }
    }

    public int Q() {
        return TransactionProcessor.U.u().Gr.R(this.H);
    }

    public void X(CryptographicTransformer cryptographicTransformer, oQ oQ2, List list, Object object) {
        block2: {
            Predicate predicate;
            block4: {
                block3: {
                    try {
                        if (GeometryCalculator.C() < 37) break block2;
                        if (object != null) break block3;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionProcessor.a(customSystemException);
                    }
                    predicate = TransactionProcessor::lambda$getEntitiesWithinAABBForEntity$0;
                    break block4;
                }
                predicate = (Predicate)object;
            }
            ApplicationLifecycleManager.c().G().H(oQ2, arg_0 -> TransactionProcessor.lambda$getEntitiesWithinAABBForEntity$1(oQ2, predicate, list, arg_0));
            return;
        }
        TransactionProcessor.U.u().Gr.v(this.H, cryptographicTransformer.M(), oQ2.M(), list, object);
    }
}

