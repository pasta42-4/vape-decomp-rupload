/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a.Sc;
import com.data.protocol.DataProcessingProtocol;
import com.network.security.NetworkSecurityOrchestrator;
import com.network.security.SecureTransmissionProtocol;
import com.security.configuration.SecurityEnumRegistry;
import com.security.streaming.StreamCipherOrchestrator183;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Point;

class DataExchangeProtocol
implements DataProcessingProtocol {
    final Sc A;
    final StreamCipherOrchestrator183 j;
    final Runnable Z;
    final NetworkSecurityOrchestrator E;

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        if (this.A.equals(this.j.J())) {
            SecureTransmissionProtocol secureTransmissionProtocol = GraphicalRenderingController.D(SecureTransmissionProtocol.class);
            secureTransmissionProtocol.K(this.j, this.A, () -> DataExchangeProtocol.lambda$onClick$0(this.Z));
            secureTransmissionProtocol.J();
            GraphicalRenderingController.K.T(GraphicalRenderingController.z);
        } else {
            this.j.H(this.A);
        }
    }

    private static void lambda$onClick$0(Runnable runnable) {
        GraphicalRenderingController.st.execute(runnable);
    }

    DataExchangeProtocol(NetworkSecurityOrchestrator networkSecurityOrchestrator, Sc sc, StreamCipherOrchestrator183 streamCipherOrchestrator183, Runnable runnable) {
        this.E = networkSecurityOrchestrator;
        this.A = sc;
        this.j = streamCipherOrchestrator183;
        this.Z = runnable;
    }
}

