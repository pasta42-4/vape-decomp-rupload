/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fm;
import a.KG;
import a.QF;

public class ps
extends KG {
    static boolean g;
    private static float N;
    private static final Fm D;
    public static QF P;
    private static QF Q;
    private static boolean c;
    private static float T;

    static float access$002(float f10) {
        T = f10;
        return T;
    }

    public static void setRotationYaw(float f10) {
        T = f10;
    }

    public static void setRotationPitch(float f10) {
        N = f10;
    }

    public static void setShouldAlwaysSend(boolean bl2) {
        g = bl2;
    }

    public static float getRotationPitch() {
        return N;
    }

    @Override
    public Fm getListeners() {
        return D;
    }

    static QF access$302(QF qF2) {
        Q = qF2;
        return Q;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public static boolean shouldAlwaysSend() {
        return g;
    }

    public static Fm getEventListeners() {
        return D;
    }

    public static float getRotationYaw() {
        return T;
    }

    public static void setOnGround(boolean bl2) {
        c = bl2;
    }

    static float access$102(float f10) {
        N = f10;
        return N;
    }

    public static boolean isOnGround() {
        return c;
    }

    static {
        D = new Fm();
    }

    static QF access$300() {
        return Q;
    }

    ps(QF qF2) {
        P = qF2;
    }

    static boolean access$202(boolean bl2) {
        c = bl2;
        return c;
    }
}

