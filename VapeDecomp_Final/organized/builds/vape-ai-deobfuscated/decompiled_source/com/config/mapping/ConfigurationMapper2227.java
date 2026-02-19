/*
 * Decompiled with CFR 0.152.
 */
package com.config.mapping;

import a.yC;
import com.audit.trail.AuditTrailReconstructor;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

class ConfigurationMapper2227
extends yC {
    final AuditTrailReconstructor GI;

    @Override
    public void E() {
        super.E();
        ConfigurationManager.T(this.G() - 6.0, this.W(), 6.0, 1.0f, ConfigurationMapper2227.M.k);
    }

    ConfigurationMapper2227(AuditTrailReconstructor auditTrailReconstructor, String string, double d2, double d3, double d4, double d5, Color color, Color color2, Color color3) {
        this.GI = auditTrailReconstructor;
        super(string, d2, d3, d4, d5, color, color2, color3);
    }
}

