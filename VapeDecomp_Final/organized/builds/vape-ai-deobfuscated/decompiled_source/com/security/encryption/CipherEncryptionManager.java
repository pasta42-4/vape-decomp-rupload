/*
 * Decompiled with CFR 0.152.
 */
package com.security.encryption;

import com.audit.trail.AuditTrailReconstructor;
import com.security.crypto.CipherManager;

class CipherEncryptionManager
extends CipherManager {
    final AuditTrailReconstructor Ig;
    final double Iw;

    @Override
    public double e() {
        return this.Iw;
    }

    CipherEncryptionManager(AuditTrailReconstructor auditTrailReconstructor, String string, double d2) {
        this.Ig = auditTrailReconstructor;
        this.Iw = d2;
        super(string);
    }

    @Override
    public double z() {
        return 16.0;
    }

    @Override
    public void O() {
    }
}

