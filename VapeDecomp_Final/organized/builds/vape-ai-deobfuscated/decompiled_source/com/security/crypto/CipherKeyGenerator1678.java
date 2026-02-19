/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.hr;
import com.concurrency.execution.HybridExecutionCoordinator;
import com.exception.system.CustomSystemException;
import com.network.protocol.CommunicationProtocolManager;
import com.security.cipher.CipherModeRegistry;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Color;

class CipherKeyGenerator1678
extends hr {
    final HybridExecutionCoordinator t5;
    final CipherModeRegistry tY;

    CipherKeyGenerator1678(HybridExecutionCoordinator hybridExecutionCoordinator, String string, double d2, Color color, Color color2, CipherModeRegistry cipherModeRegistry) {
        this.t5 = hybridExecutionCoordinator;
        this.tY = cipherModeRegistry;
        super(string, d2, color, color2);
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void G() {
        block3: {
            block2: {
                super.G();
                CommunicationProtocolManager communicationProtocolManager = GraphicalRenderingController.D(CommunicationProtocolManager.class);
                try {
                    if (communicationProtocolManager.v() != this.tY) break block2;
                    this.A(Color.WHITE);
                    this.Q(CipherKeyGenerator1678.M.Y, CipherKeyGenerator1678.M.u);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherKeyGenerator1678.b(customSystemException);
                }
            }
            this.A(CipherKeyGenerator1678.M.w);
            this.Q(CipherKeyGenerator1678.M.W, CipherKeyGenerator1678.M.k);
        }
    }
}

