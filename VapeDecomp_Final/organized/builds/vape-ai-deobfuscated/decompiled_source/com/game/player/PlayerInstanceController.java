/*
 * Decompiled with CFR 0.152.
 */
package com.game.player;

import com.configuration.management.ConfigurationResolver2152;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ReflectionMetadataResolver;

public class PlayerInstanceController
extends ConfigurationResolver2152 {
    private static int Z;

    private static boolean isPlayerInstance(Object object) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!ReflectionMetadataResolver.UQ.isInstance(object) && !ReflectionMetadataResolver.rl.isInstance(object)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PlayerInstanceController.b(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw PlayerInstanceController.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static void T(int n) {
        Z = n;
    }

    public static int Z() {
        return Z;
    }

    static {
        if (PlayerInstanceController.Z() == 0) {
            PlayerInstanceController.T(40);
        }
    }

    static boolean access$000(Object object) {
        return PlayerInstanceController.isPlayerInstance(object);
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static int N() {
        int n = PlayerInstanceController.Z();
        try {
            if (n == 0) {
                return 62;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PlayerInstanceController.b(customSystemException);
        }
        return 0;
    }
}

