/*
 * Decompiled with CFR 0.152.
 */
package com.system.tasks;

import a.wz;
import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.security.crypto.CipherContextManager1101;
import java.awt.Point;

class BackgroundTaskProcessor
implements DataProcessingProtocol {
    final wz R;
    final CipherContextManager1101 F;

    BackgroundTaskProcessor(wz wz2, CipherContextManager1101 cipherContextManager1101) {
        this.R = wz2;
        this.F = cipherContextManager1101;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public boolean o(Point point) {
        block4: {
            try {
                try {
                    if (!this.R.V().C().T(point) || this.F.C().T(point)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw BackgroundTaskProcessor.a(customSystemException);
                }
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw BackgroundTaskProcessor.a(customSystemException);
            }
        }
        return DataProcessingProtocol.super.o(point);
    }
}

