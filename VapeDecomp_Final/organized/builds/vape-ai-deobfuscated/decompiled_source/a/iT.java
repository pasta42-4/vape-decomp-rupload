/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.app.config.management.ConfigurationRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.network.config.NetworkConfigurationResolver2717;

public class it
implements NetworkConfigurationResolver2717 {
    private static float z;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static boolean H(float f, boolean bl) {
        boolean bl2;
        block9: {
            try {
                if (GameVersionEnumerator.MC_1_12_2.Q()) {
                    return true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw it.a(customSystemException);
            }
            try {
                try {
                    if (bl || !ConfigurationRegistry.g.A()) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw it.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw it.a(customSystemException);
            }
        }
        float f2 = ApplicationLifecycleManager.U().X(f);
        try {
            bl2 = f2 == 1.0f;
        }
        catch (CustomSystemException customSystemException) {
            throw it.a(customSystemException);
        }
        return bl2;
    }

    public static boolean y(float f) {
        return it.H(f, false);
    }
}

