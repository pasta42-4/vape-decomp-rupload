/*
 * Decompiled with CFR 0.152.
 */
package com.security.auth;

import com.app.transactions.TransactionRollbackManager2317;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.messaging.core.MessageInterceptor;
import com.network.connection.ConnectionLifecycleHandler;
import com.transaction.management.TransactionCoordinator;
import java.util.Collection;

public class AuthorizationManager
extends TransactionRollbackManager2317 {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public AuthorizationManager(Object object) {
        super(object);
    }

    public void O(ConnectionLifecycleHandler connectionLifecycleHandler) {
        TransactionCoordinator.s(AuthorizationManager.U.u().L4, this.H, connectionLifecycleHandler.M());
    }

    public Collection l() {
        return TransactionCoordinator.m(AuthorizationManager.U.u().L4, this.H);
    }

    public MessageInterceptor f() {
        return new MessageInterceptor(TransactionCoordinator.M(AuthorizationManager.U.u().L4, this.H));
    }

    public boolean v() {
        return TransactionCoordinator.A(AuthorizationManager.U.u().L4, this.H);
    }

    public boolean R() {
        try {
            if (GeometryCalculator.C() >= 50) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthorizationManager.a(customSystemException);
        }
        return TransactionCoordinator.Z(AuthorizationManager.U.u().L4, this.H);
    }
}

