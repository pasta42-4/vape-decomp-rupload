/*
 * Decompiled with CFR 0.152.
 */
package com.performance.monitoring;

import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.game.input.GameInputController;
import com.runtime.context.DynamicContextBroker;
import com.ui.rendering.GraphicalRenderingController;
import java.util.HashMap;

public class TimedExecutionTracker {
    private boolean x;
    private HashMap<Integer, Boolean> T = new HashMap();
    private boolean F;
    private int a;
    private long M = System.nanoTime();

    public int a() {
        return this.a;
    }

    public long O() {
        return this.M;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean I() {
        return this.x;
    }

    public void h(int n) {
        this.T.put(n, false);
    }

    public boolean I(int n) {
        return this.T.getOrDefault(n, false);
    }

    public boolean g() {
        return this.F;
    }

    public void V(int n, boolean bl) {
        boolean bl2 = this.T.getOrDefault(n, false);
        try {
            if (bl2 != bl) {
                this.S(n, bl);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TimedExecutionTracker.a(customSystemException);
        }
        this.T.put(n, bl);
    }

    private void S(int n, boolean bl) {
        this.M = System.nanoTime();
        this.F = bl;
        this.a = n;
        GameInputController gameInputController = new GameInputController(n, bl);
        gameInputController.fire();
        this.x = gameInputController.isCanceled();
        if (!GraphicalRenderingController.K.P) {
            int n2 = DynamicContextBroker.E(ApplicationLifecycleManager.N().e());
            try {
                if (n == n2) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw TimedExecutionTracker.a(customSystemException);
            }
            this.x = true;
        }
    }
}

