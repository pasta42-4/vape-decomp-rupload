/*
 * Decompiled with CFR 0.152.
 */
package com.app.graphics;

import com.cache.distribution.DistributedCacheManager;
import com.exception.system.CustomSystemException;
import com.network.connection.NetworkConnectionEstablisher;
import com.system.lifecycle.SystemLifecycleController;
import com.temporal.metadata.TemporalMetadataResolver;
import com.user.identity.UserIdentityManager;
import java.awt.Color;
import java.util.LinkedHashMap;
import java.util.Map;

public class GraphicsRenderingUtility1454 {
    private static final Color U = new Color(255, 255, 255);
    private static final Map<Integer, Color> Y = new LinkedHashMap<Integer, Color>();

    public static Color U(UserIdentityManager userIdentityManager) {
        return GraphicsRenderingUtility1454.P(userIdentityManager.M());
    }

    private static void w() {
        Y.put(0, new Color(5, 134, 105));
        Y.put(1, new Color(47, 122, 229));
        Y.put(2, new Color(250, 50, 56));
        Y.put(3, new Color(126, 84, 217));
        Y.put(4, new Color(242, 99, 33));
        Y.put(5, new Color(252, 179, 22));
        Y.put(6, new Color(232, 96, 152));
        Y.put(7, new Color(145, 145, 145));
        Y.put(8, new Color(126, 65, 19));
    }

    public static Color L() {
        return TemporalMetadataResolver.h.j().u.L();
    }

    public static Color P(int n) {
        block4: {
            try {
                try {
                    if (n != -1 && n <= 8) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicsRenderingUtility1454.a(customSystemException);
                }
                return U;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicsRenderingUtility1454.a(customSystemException);
            }
        }
        return Y.getOrDefault(n, U);
    }

    static {
        GraphicsRenderingUtility1454.w();
    }

    public static Color V(UserIdentityManager userIdentityManager) {
        DistributedCacheManager distributedCacheManager = SystemLifecycleController.C.q();
        try {
            if (((NetworkConnectionEstablisher)distributedCacheManager.q().J()).equals(distributedCacheManager.P())) {
                return GraphicsRenderingUtility1454.U(userIdentityManager);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicsRenderingUtility1454.a(customSystemException);
        }
        try {
            if (((NetworkConnectionEstablisher)distributedCacheManager.q().J()).equals(distributedCacheManager.z())) {
                return GraphicsRenderingUtility1454.L();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicsRenderingUtility1454.a(customSystemException);
        }
        return Color.WHITE;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

