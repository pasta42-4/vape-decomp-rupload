/*
 * Decompiled with CFR 0.152.
 */
package com.security.event;

import com.app.scenarios.ScenarioTemplateManager;
import com.exception.system.CustomSystemException;
import com.runtime.introspection.ReflectionResolver;
import com.security.authentication.AuthenticationStateManager675;
import com.ui.rendering.GraphicalRenderingController;

public class SecureEventOrchestrator
extends ScenarioTemplateManager {
    private static int[] p;

    @Override
    public boolean Y() {
        try {
            if (!GraphicalRenderingController.K.P) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureEventOrchestrator.a(customSystemException);
        }
        return super.Y();
    }

    public static int[] s() {
        return p;
    }

    static {
        if (SecureEventOrchestrator.s() != null) {
            SecureEventOrchestrator.r(new int[1]);
        }
    }

    public AuthenticationStateManager675 k() {
        return new AuthenticationStateManager675(SecureEventOrchestrator.U.u().dQ.R(this.H));
    }

    public SecureEventOrchestrator(Object object) {
        super(object);
    }

    public int i() {
        return ReflectionResolver.R(SecureEventOrchestrator.U.u().dQ, this.H);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void r(int[] nArray) {
        p = nArray;
    }

    public int O() {
        return ReflectionResolver.L(SecureEventOrchestrator.U.u().dQ, this.H);
    }
}

