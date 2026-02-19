/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.palette;

import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Color;

public class ColorPaletteGenerator1110 {
    public final Color u;
    public final Color d;
    public final Color Z;
    public final Color y;
    public final Color b;
    public final Color G;
    private Color C;
    public final Color E;
    public final Color a;
    public final Color L;
    public final Color A;
    public final Color n;
    public final Color o;
    public final Color Y = new Color(5, 134, 105);
    public final Color S;
    public final Color f;
    private static String U;
    public final Color m;
    public final Color T;
    public final Color w;
    private Color p;
    public final Color N;
    public final Color X;
    public final Color F;
    public final Color I;
    public final Color c;
    public final Color g;
    public final Color J;
    public final Color H;
    public final Color z;
    public final Color K;
    public final Color W;
    public final Color k;
    public final Color i;
    public final Color q;
    public final Color O;

    public ColorPaletteGenerator1110() {
        this.u = new Color(6, 161, 126);
        this.O = new Color(250, 50, 56);
        this.b = new Color(255, 89, 94);
        this.f = new Color(47, 122, 229);
        this.G = new Color(80, 141, 229);
        this.o = new Color(236, 129, 44);
        this.i = new Color(236, 129, 44, 51);
        this.I = new Color(255, 160, 84);
        this.Z = new Color(122, 122, 122);
        this.q = new Color(209, 209, 209);
        this.K = new Color(54, 53, 54);
        this.d = new Color(5, 134, 105);
        this.a = new Color(20, 20, 20);
        this.W = new Color(26, 25, 26);
        this.J = new Color(37, 36, 38);
        this.g = new Color(31, 30, 31);
        this.S = new Color(54, 53, 54, 128);
        this.L = new Color(35, 34, 35);
        this.T = new Color(40, 39, 40);
        this.X = new Color(49, 48, 49);
        this.k = new Color(54, 53, 54);
        this.c = new Color(209, 209, 209);
        this.n = new Color(163, 163, 163);
        this.w = new Color(89, 88, 89);
        this.z = new Color(45, 46, 47);
        this.H = new Color(115, 113, 115);
        this.F = new Color(44, 43, 44, 255);
        this.E = new Color(0, 0, 0, 0);
        this.y = new Color(255, 255, 255, 5);
        this.m = new Color(255, 255, 255, 10);
        this.N = new Color(255, 255, 255, 15);
        this.A = new Color(236, 170, 118);
        this.p = Color.WHITE;
        this.C = Color.BLACK;
    }

    public static String N() {
        return U;
    }

    static {
        if (ColorPaletteGenerator1110.N() == null) {
            ColorPaletteGenerator1110.C("y2Vh4");
        }
    }

    public static void C(String string) {
        U = string;
    }

    public Color X() {
        try {
            if (TemporalMetadataResolver.h.a().q.j()) {
                return new Color(45, 45, 45);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ColorPaletteGenerator1110.a(customSystemException);
        }
        try {
            if (this.j().equals(this.p)) {
                return this.C;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ColorPaletteGenerator1110.a(customSystemException);
        }
        this.p = this.j();
        this.C = EventDispatchCoordinator1159.Q(this.p, 45, 240);
        return this.C;
    }

    public Color j() {
        return GraphicalRenderingController.K.Q();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

