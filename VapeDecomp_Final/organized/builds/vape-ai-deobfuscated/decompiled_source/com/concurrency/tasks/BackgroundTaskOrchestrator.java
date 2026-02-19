/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.tasks;

import com.graphics.rendering.GraphicalRenderEngine1082;

public abstract class BackgroundTaskOrchestrator
extends GraphicalRenderEngine1082 {
    private boolean a2 = false;
    private static String[] a8;

    public void t(boolean bl) {
        this.a2 = bl;
    }

    public static void O(String[] stringArray) {
        a8 = stringArray;
    }

    public static String[] Z() {
        return a8;
    }

    public boolean Y() {
        return this.a2;
    }

    public BackgroundTaskOrchestrator() {
        super(0.0, 0.0);
    }

    public abstract boolean d();

    static {
        if (BackgroundTaskOrchestrator.Z() != null) {
            BackgroundTaskOrchestrator.O(new String[5]);
        }
    }
}

