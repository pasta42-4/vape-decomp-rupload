/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.exception.system.CustomSystemException;
import com.network.clustering.ClusterNodeRegistry1151;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;

public class d {
    public static void keyTyped(Object object, char c, int n) {
    }

    public static void handleMouseInput(Object object) {
    }

    public static void h(long l) {
        ClusterNodeRegistry1151.W().W(l);
    }

    public static void initGui(Object object) {
    }

    public static void updateScreen(Object object) {
    }

    public static void drawScreen(Object object, int n, int n2, float f) {
        GraphicalRenderingController graphicalRenderingController = TemporalMetadataResolver.h.U().K(GraphicalRenderingController.class);
        try {
            if (!graphicalRenderingController.P) {
                graphicalRenderingController.k();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw d.a(customSystemException);
        }
    }

    public static void mouseClicked(Object object, int n, int n2, int n3) {
        GraphicalRenderingController graphicalRenderingController = TemporalMetadataResolver.h.U().K(GraphicalRenderingController.class);
        graphicalRenderingController.M(n, n2, n3);
    }

    public static boolean onNotification(int n, long l, long l2) {
        return ClusterNodeRegistry1151.W().l(n, l, l2);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void mouseMovedOrUp(Object object, int n, int n2, int n3) {
    }
}

