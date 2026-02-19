/*
 * Decompiled with CFR 0.152.
 */
package com.data.validation;

import com.rendering.context.ContextualRenderingMediator;
import com.security.crypto.CryptographicSecurityProvider;

class DataStreamValidator
extends CryptographicSecurityProvider {
    final ContextualRenderingMediator Jk;
    final Float JM;

    @Override
    public void v(float f, float f2) {
        super.v(f, this.JM.floatValue());
    }

    DataStreamValidator(ContextualRenderingMediator contextualRenderingMediator, Float f) {
        this.Jk = contextualRenderingMediator;
        this.JM = f;
    }
}

