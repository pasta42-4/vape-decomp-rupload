/*
 * Decompiled with CFR 0.152.
 */
package com.app.concurrency;

import com.exception.system.CustomSystemException;
import com.game.player.PlayerInstanceController;
import com.minecraft.render.MinecraftRenderContextManager;

public class AsynchronousTaskExecutor2174
extends PlayerInstanceController {
    public static void call(Object object, Object object2, Object object3) {
        try {
            if (!PlayerInstanceController.access$000(object)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskExecutor2174.a(customSystemException);
        }
        new MinecraftRenderContextManager(object, object2, object3).fire();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

