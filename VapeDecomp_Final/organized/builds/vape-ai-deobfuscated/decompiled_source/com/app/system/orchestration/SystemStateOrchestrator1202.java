/*
 * Decompiled with CFR 0.152.
 */
package com.app.system.orchestration;

import a.ms;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.network.connection.ConnectionLifecycleHandler;
import java.util.Optional;

public class SystemStateOrchestrator1202
extends ConnectionLifecycleHandler {
    public Optional<Object> O() {
        return SystemStateOrchestrator1202.U.u().dZ.g(this.H);
    }

    public float x() {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return this.G();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemStateOrchestrator1202.a(customSystemException);
        }
        return ms.F(SystemStateOrchestrator1202.U.u().dZ, this.H);
    }

    private void X(float f) {
        Optional<Object> optional = this.O();
        if (optional.isPresent()) {
            ContextualEventDispatcher contextualEventDispatcher = new ContextualEventDispatcher(optional.get());
            contextualEventDispatcher.N(f);
        }
    }

    public void a(float f) {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                this.X(f);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemStateOrchestrator1202.a(customSystemException);
        }
        ms.S(SystemStateOrchestrator1202.U.u().dZ, this.H, f);
    }

    private float J() {
        Optional<Object> optional = this.O();
        if (optional.isPresent()) {
            ContextualEventDispatcher contextualEventDispatcher = new ContextualEventDispatcher(optional.get());
            return (float)contextualEventDispatcher.F();
        }
        return 0.0f;
    }

    public float r() {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return this.p();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemStateOrchestrator1202.a(customSystemException);
        }
        return ms.D(SystemStateOrchestrator1202.U.u().dZ, this.H);
    }

    private float G() {
        Optional<Object> optional = this.O();
        if (optional.isPresent()) {
            ContextualEventDispatcher contextualEventDispatcher = new ContextualEventDispatcher(optional.get());
            return (float)contextualEventDispatcher.f();
        }
        return 0.0f;
    }

    public void h(float f) {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                this.C(f);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemStateOrchestrator1202.a(customSystemException);
        }
        ms.p(SystemStateOrchestrator1202.U.u().dZ, this.H, f);
    }

    public SystemStateOrchestrator1202(Object object) {
        super(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private float p() {
        Optional<Object> optional = this.O();
        if (optional.isPresent()) {
            ContextualEventDispatcher contextualEventDispatcher = new ContextualEventDispatcher(optional.get());
            return (float)contextualEventDispatcher.X();
        }
        return 0.0f;
    }

    private void C(float f) {
        Optional<Object> optional = this.O();
        if (optional.isPresent()) {
            ContextualEventDispatcher contextualEventDispatcher = new ContextualEventDispatcher(optional.get());
            contextualEventDispatcher.F(f);
        }
    }

    public void v(float f) {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                this.T(f);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemStateOrchestrator1202.a(customSystemException);
        }
        ms.g(SystemStateOrchestrator1202.U.u().dZ, this.H, f);
    }

    public float v() {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return this.J();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemStateOrchestrator1202.a(customSystemException);
        }
        return ms.M(SystemStateOrchestrator1202.U.u().dZ, this.H);
    }

    private void T(float f) {
        Optional<Object> optional = this.O();
        if (optional.isPresent()) {
            ContextualEventDispatcher contextualEventDispatcher = new ContextualEventDispatcher(optional.get());
            contextualEventDispatcher.Q(f);
        }
    }
}

