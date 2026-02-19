/*
 * Decompiled with CFR 0.152.
 */
package com.app.security.tokens;

import com.app.core.compression.CompressionUtility2706;
import com.data.transformation.TransformationBroker;
import com.system.lifecycle.ObjectLifecycleTracker;

public class SecurityTokenGenerator2037
extends ObjectLifecycleTracker {
    public static SecurityTokenGenerator2037 M() {
        return new SecurityTokenGenerator2037(TransformationBroker.t(SecurityTokenGenerator2037.U.u().gK));
    }

    public static SecurityTokenGenerator2037 W() {
        return new SecurityTokenGenerator2037(TransformationBroker.v(SecurityTokenGenerator2037.U.u().gK));
    }

    SecurityTokenGenerator2037(Object object, CompressionUtility2706 compressionUtility2706) {
        this(object);
    }

    private SecurityTokenGenerator2037(Object object) {
        super(object);
    }
}

