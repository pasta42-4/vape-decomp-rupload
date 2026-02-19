/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.yG;

public abstract class wu
extends yG {
    private boolean a2 = false;
    private static String[] a8;

    public void t(boolean bl2) {
        this.a2 = bl2;
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

    public wu() {
        super(0.0, 0.0);
    }

    public abstract boolean d();

    static {
        if (wu.Z() != null) {
            wu.O(new String[5]);
        }
    }
}

