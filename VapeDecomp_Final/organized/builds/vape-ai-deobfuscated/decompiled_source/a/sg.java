/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.network.security.SecureTransmissionProtocol;
import com.security.crypto.CipherContextManager1101;
import java.awt.Point;

class sg
implements DataProcessingProtocol {
    final SecureTransmissionProtocol w;
    final CipherContextManager1101 n;

    @Override
    public boolean o(Point point) {
        block4: {
            try {
                try {
                    if (!this.w.V().C().T(point) || this.n.C().T(point)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw sg.a(customSystemException);
                }
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw sg.a(customSystemException);
            }
        }
        return DataProcessingProtocol.super.o(point);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    sg(SecureTransmissionProtocol secureTransmissionProtocol, CipherContextManager1101 cipherContextManager1101) {
        this.w = secureTransmissionProtocol;
        this.n = cipherContextManager1101;
    }
}

