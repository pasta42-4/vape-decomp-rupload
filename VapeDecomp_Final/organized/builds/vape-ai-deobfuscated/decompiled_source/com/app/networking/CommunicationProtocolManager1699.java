/*
 * Decompiled with CFR 0.152.
 */
package com.app.networking;

import com.app.core.interfaces.OperationExecutionInterface;
import com.data.persistence.DataPersistenceOrchestrator;
import com.exception.system.CustomSystemException;
import com.security.authentication.AuthenticationContextManager;

class CommunicationProtocolManager1699
implements OperationExecutionInterface {
    final DataPersistenceOrchestrator G;
    final AuthenticationContextManager O;

    @Override
    public void R() {
        block4: {
            try {
                try {
                    if (!this.G.equals(AuthenticationContextManager.l(this.O)) || AuthenticationContextManager.i(this.O).size() <= 0) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw CommunicationProtocolManager1699.a(customSystemException);
                }
                this.O.C((DataPersistenceOrchestrator)AuthenticationContextManager.i(this.O).get(0));
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager1699.a(customSystemException);
            }
        }
        this.O.G(this.G);
        this.O.D();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    CommunicationProtocolManager1699(AuthenticationContextManager authenticationContextManager, DataPersistenceOrchestrator dataPersistenceOrchestrator) {
        this.O = authenticationContextManager;
        this.G = dataPersistenceOrchestrator;
    }
}

