/*
 * Decompiled with CFR 0.152.
 */
package com.security.auth;

import a.fu;
import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.system.orchestration.SystemOrchestrationManager;

class AuthenticationHandler1607
implements OperationExecutionInterface {
    final SystemOrchestrationManager M;
    final fu e;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    AuthenticationHandler1607(SystemOrchestrationManager systemOrchestrationManager, fu fu2) {
        this.M = systemOrchestrationManager;
        this.e = fu2;
    }

    @Override
    public void O() {
        this.R();
    }

    @Override
    public void R() {
        block5: {
            block4: {
                boolean bl;
                SystemOrchestrationManager systemOrchestrationManager;
                try {
                    systemOrchestrationManager = this.M;
                    bl = !SystemOrchestrationManager.w(this.M);
                }
                catch (CustomSystemException customSystemException) {
                    throw AuthenticationHandler1607.a(customSystemException);
                }
                try {
                    SystemOrchestrationManager.W(systemOrchestrationManager, bl);
                    if (!SystemOrchestrationManager.w(this.M)) break block4;
                    this.e.E(this.M.D());
                    this.M.o();
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuthenticationHandler1607.a(customSystemException);
                }
            }
            this.e.E(null);
            this.M.M();
        }
        this.e.A();
    }
}

