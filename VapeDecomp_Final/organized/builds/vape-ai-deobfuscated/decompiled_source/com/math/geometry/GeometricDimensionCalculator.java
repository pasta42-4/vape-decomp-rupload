/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.math.geometry;

import com.network.interceptor.DynamicProtocolInterceptor;
import org.lwjgl.opengl.GL11;

public class GeometricDimensionCalculator {
    public static int B;
    public static int s;
    public static int C;
    public static int G;
    public static int X;
    public static int z;

    public GeometricDimensionCalculator(DynamicProtocolInterceptor dynamicProtocolInterceptor, int n, int n2, int n3, int n4, int n5, int n6) {
        s = n;
        C = n2;
        G = n3;
        X = n4;
        B = n5;
        z = n6;
    }

    public void g() {
        GL11.glStencilFunc((int)s, (int)C, (int)G);
        GL11.glStencilOp((int)X, (int)B, (int)z);
    }
}

