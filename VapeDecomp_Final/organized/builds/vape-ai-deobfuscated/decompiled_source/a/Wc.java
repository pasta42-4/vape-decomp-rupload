/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.compute.hybrid.HybridComputationOrchestrator;
import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.security.crypto.CipherContextManager1101;
import java.awt.Point;

class Wc
implements DataProcessingProtocol {
    final CipherContextManager1101 a;
    final HybridComputationOrchestrator p;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public boolean o(Point point) {
        block4: {
            try {
                try {
                    if (!this.p.V().C().T(point) || this.a.C().T(point)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw Wc.a(customSystemException);
                }
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw Wc.a(customSystemException);
            }
        }
        return DataProcessingProtocol.super.o(point);
    }

    Wc(HybridComputationOrchestrator hybridComputationOrchestrator, CipherContextManager1101 cipherContextManager1101) {
        this.p = hybridComputationOrchestrator;
        this.a = cipherContextManager1101;
    }
}

