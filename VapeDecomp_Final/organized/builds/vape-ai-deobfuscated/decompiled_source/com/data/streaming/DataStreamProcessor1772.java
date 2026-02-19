/*
 * Decompiled with CFR 0.152.
 */
package com.data.streaming;

import com.audit.trail.AuditTrailReconstructor;
import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.configuration.SecurityEnumRegistry;
import java.awt.Point;

class DataStreamProcessor1772
implements DataProcessingProtocol {
    final AuditTrailReconstructor I;
    final AdaptiveCipherEngine x;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    DataStreamProcessor1772(AuditTrailReconstructor auditTrailReconstructor, AdaptiveCipherEngine adaptiveCipherEngine) {
        this.I = auditTrailReconstructor;
        this.x = adaptiveCipherEngine;
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        boolean bl;
        AdaptiveCipherEngine adaptiveCipherEngine;
        try {
            adaptiveCipherEngine = this.x;
            bl = !this.x.f();
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamProcessor1772.a(customSystemException);
        }
        adaptiveCipherEngine.N(bl);
    }
}

