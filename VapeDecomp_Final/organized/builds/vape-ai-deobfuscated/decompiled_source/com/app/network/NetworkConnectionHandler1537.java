/*
 * Decompiled with CFR 0.152.
 */
package com.app.network;

import a.S3;
import a.fu;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.network.config.NetworkConfigurationResolver2717;
import com.security.encryption.CipherContextManager;
import com.security.session.CipherSessionManager;
import com.system.orchestration.SystemOrchestrationManager;
import com.transaction.logging.TransactionLogOrchestrator;
import com.ui.rendering.GraphicalRenderingController;

public class NetworkConnectionHandler1537
implements NetworkConfigurationResolver2717 {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090
    public void x(S3 s3) {
        for (CipherSessionManager cipherSessionManager : GraphicalRenderingController.F.Y()) {
            try {
                if (!(cipherSessionManager instanceof fu)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkConnectionHandler1537.a(customSystemException);
            }
            fu fu2 = (fu)cipherSessionManager;
            for (AbstractComputationKernel abstractComputationKernel : fu2.A()) {
                try {
                    if (!(abstractComputationKernel instanceof SystemOrchestrationManager)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkConnectionHandler1537.a(customSystemException);
                }
                SystemOrchestrationManager systemOrchestrationManager = (SystemOrchestrationManager)abstractComputationKernel;
                for (AbstractComputationKernel abstractComputationKernel2 : systemOrchestrationManager.X()) {
                    if (!(abstractComputationKernel2 instanceof CipherContextManager)) continue;
                    CipherContextManager cipherContextManager = (CipherContextManager)abstractComputationKernel2;
                    cipherContextManager.D();
                }
            }
        }
        GraphicalRenderingController.D(TransactionLogOrchestrator.class).Y();
    }
}

