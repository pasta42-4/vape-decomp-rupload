/*
 * Decompiled with CFR 0.152.
 */
package com.app.security;

import com.execution.context.ExecutionContextOrchestrator;
import com.integration.multimodal.MultimodalIntegrationFramework;
import com.security.session.CipherSessionManager;

class AuthenticationTokenGenerator2316
extends ExecutionContextOrchestrator {
    final MultimodalIntegrationFramework hT;

    AuthenticationTokenGenerator2316(MultimodalIntegrationFramework multimodalIntegrationFramework, CipherSessionManager cipherSessionManager, String string, String string2) {
        this.hT = multimodalIntegrationFramework;
        super(cipherSessionManager, string, string2);
    }

    @Override
    public void z() {
        MultimodalIntegrationFramework.l(this.hT).N(this.K());
        MultimodalIntegrationFramework.M(this.hT).N(this.K());
        MultimodalIntegrationFramework.w(this.hT).N(this.K());
        MultimodalIntegrationFramework.H(this.hT).N(this.K());
        MultimodalIntegrationFramework.l(this.hT).N(this.K());
        MultimodalIntegrationFramework.s(this.hT).N(this.K());
        this.h().A();
    }
}

