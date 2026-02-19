/*
 * Decompiled with CFR 0.152.
 */
package com.data.streaming;

import com.app.scenarios.ScenarioTemplateManager;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.security.authentication.AuthenticationStateManager675;

public class StreamProcessingOrchestrator1917
extends ScenarioTemplateManager {
    public String A() {
        try {
            if (GeometryCalculator.C() == 13) {
                return "";
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessingOrchestrator1917.a(customSystemException);
        }
        if (GeometryCalculator.C() >= 35) {
            AuthenticationStateManager675 authenticationStateManager675 = new AuthenticationStateManager675(StreamProcessingOrchestrator1917.U.u().kd.k(this.H));
            return authenticationStateManager675.i();
        }
        return (String)StreamProcessingOrchestrator1917.U.u().kd.k(this.H);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public StreamProcessingOrchestrator1917(Object object) {
        super(object);
    }
}

