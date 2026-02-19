/*
 * Decompiled with CFR 0.152.
 */
package com.transformation.core;

import com.security.token.SecureTokenGenerator;
import com.system.lifecycle.ObjectLifecycleTracker;

public class TransformationEngine1777
extends ObjectLifecycleTracker {
    public void u(float f) {
        SecureTokenGenerator.C(TransformationEngine1777.U.u().gi, this.H, f);
    }

    public TransformationEngine1777(Object object) {
        super(object);
    }

    public float q() {
        return SecureTokenGenerator.V(TransformationEngine1777.U.u().gi, this.H);
    }

    public void N(float f) {
        SecureTokenGenerator.h(TransformationEngine1777.U.u().gi, this.H, f);
    }

    public void n(float f) {
        SecureTokenGenerator.h(TransformationEngine1777.U.u().gi, this.H, f);
    }

    public float b() {
        return SecureTokenGenerator.N(TransformationEngine1777.U.u().gi, this.H);
    }

    public float x() {
        return SecureTokenGenerator.h(TransformationEngine1777.U.u().gi, this.H);
    }
}

