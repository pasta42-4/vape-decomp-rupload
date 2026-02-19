/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.GK;
import a.O_;
import a.SE;

public class d {
    public static void keyTyped(Object object, char c10, int n2) {
    }

    public static void handleMouseInput(Object object) {
    }

    public static void h(long l10) {
        GK.W().W(l10);
    }

    public static void initGui(Object object) {
    }

    public static void updateScreen(Object object) {
    }

    public static void drawScreen(Object object, int n2, int n3, float f10) {
        Ao ao2 = SE.h.U().K(Ao.class);
        try {
            if (!ao2.P) {
                ao2.k();
            }
        }
        catch (O_ o_2) {
            throw d.a(o_2);
        }
    }

    public static void mouseClicked(Object object, int n2, int n3, int n4) {
        Ao ao2 = SE.h.U().K(Ao.class);
        ao2.M(n2, n3, n4);
    }

    public static boolean onNotification(int n2, long l10, long l11) {
        return GK.W().l(n2, l10, l11);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static void mouseMovedOrUp(Object object, int n2, int n3, int n4) {
    }
}

