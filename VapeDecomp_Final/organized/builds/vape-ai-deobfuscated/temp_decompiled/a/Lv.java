/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.eM;
import a.v2;

public class lv
extends v2 {
    private static int[] k;

    public static int[] m() {
        return k;
    }

    public static void w(int[] nArray) {
        k = nArray;
    }

    static {
        if (lv.m() == null) {
            lv.w(new int[4]);
        }
    }

    public lv() {
        super(eM.FH);
    }
}

