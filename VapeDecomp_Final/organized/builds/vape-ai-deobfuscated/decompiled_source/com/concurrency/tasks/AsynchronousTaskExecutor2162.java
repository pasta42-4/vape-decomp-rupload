/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.tasks;

import com.exception.system.CustomSystemException;
import com.game.player.PlayerInstanceController;
import com.rendering.context.RenderContextManager;

public class AsynchronousTaskExecutor2162
extends PlayerInstanceController {
    public static void call(Object object, Object object2, Object object3) {
        try {
            if (!PlayerInstanceController.access$000(object)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskExecutor2162.a(customSystemException);
        }
        new RenderContextManager(object, object2, object3).fire();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

