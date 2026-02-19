/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package com.rendering.buffer;

import a.Ne;
import a.a;
import a.tl;
import a.z6;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.compression.CompressionAlgorithmManager1716;
import com.data.flow.DataFlowAnalyzer;
import com.math.strategy.MathematicalOperationStrategy;
import com.spatial.mapping.CoordinateMapper;
import com.system.configuration.ConfigurationManager;
import com.system.diagnostics.SystemDiagnosticAnalyzer;
import com.system.resources.ResourceAllocationTracker882;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.flow.TransactionFlowController;
import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Stack;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public final class GraphicsBufferAllocator {
    private static final float[] O;
    private static final Color[] l;
    private static final Color[] T;
    private static FloatBuffer w;
    private static FloatBuffer P;
    static float q;
    static Stack<ResourceAllocationTracker882> K;
    static float p;
    private static CoordinateMapper Z;
    static IntBuffer o;
    static float r;
    static float z;
    private static IntBuffer f;
    static Stack<ResourceAllocationTracker882> V;

    public static Color A(float[] fArray, Color[] colorArray, float f) {
        Color color;
        block4: {
            color = Color.RED;
            try {
                try {
                    if (fArray == null || colorArray == null) break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw GraphicsBufferAllocator.a(illegalArgumentException);
                }
                if (fArray.length != colorArray.length) break block4;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw GraphicsBufferAllocator.a(illegalArgumentException);
            }
            int[] nArray = GraphicsBufferAllocator.v(fArray, f);
            float[] fArray2 = new float[]{fArray[nArray[0]], fArray[nArray[1]]};
            Color[] colorArray2 = new Color[]{colorArray[nArray[0]], colorArray[nArray[1]]};
            float f2 = fArray2[1] - fArray2[0];
            float f3 = f - fArray2[0];
            float f4 = f3 / f2;
            color = GraphicsBufferAllocator.o(colorArray2[0], colorArray2[1], 1.0f - f4);
        }
        return color;
    }

    public static Color B(float f, boolean bl) {
        Color[] colorArray;
        float[] fArray;
        try {
            fArray = O;
            colorArray = bl ? l : T;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw GraphicsBufferAllocator.a(illegalArgumentException);
        }
        return GraphicsBufferAllocator.A(fArray, colorArray, f);
    }

    public static void R() {
        if (!V.empty()) {
            ResourceAllocationTracker882 resourceAllocationTracker882 = V.pop();
            GL11.glViewport((int)resourceAllocationTracker882.e, (int)resourceAllocationTracker882.j, (int)resourceAllocationTracker882.u, (int)resourceAllocationTracker882.D);
        }
    }

    private static Color o(Color color, Color color2, double d2) {
        Color color3;
        float f = (float)d2;
        float f2 = 1.0f - f;
        float[] fArray = new float[3];
        float[] fArray2 = new float[3];
        color.getColorComponents(fArray);
        color2.getColorComponents(fArray2);
        float f3 = fArray[0] * f + fArray2[0] * f2;
        float f4 = fArray[1] * f + fArray2[1] * f2;
        float f5 = fArray[2] * f + fArray2[2] * f2;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 255.0f) {
            f3 = 255.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        } else if (f4 > 255.0f) {
            f4 = 255.0f;
        }
        if (f5 < 0.0f) {
            f5 = 0.0f;
        } else if (f5 > 255.0f) {
            f5 = 255.0f;
        }
        try {
            color3 = new Color(f3, f4, f5);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return Color.RED;
        }
        return color3;
    }

    static {
        K = new Stack();
        V = new Stack();
        o = BufferUtils.createIntBuffer((int)16);
        O = new float[]{0.0f, 0.5f, 1.0f};
        T = new Color[]{Color.RED, Color.YELLOW, Color.GREEN};
        l = new Color[]{Color.RED, Color.YELLOW, MathematicalOperationStrategy.M.Y};
    }

    public static void r(double d2, double d3, double d4, double d5, double d6) {
        GL11.glTexCoord2d((double)d5, (double)d6);
        GL11.glVertex3d((double)d2, (double)d3, (double)5.0);
    }

    public static int E() {
        try {
            if (ConfigurationManager.U()) {
                return 0;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw GraphicsBufferAllocator.a(illegalArgumentException);
        }
        return a.sts();
    }

    private static int[] v(float[] fArray, float f) {
        int[] nArray = new int[2];
        int n = 0;
        try {
            while (true) {
                try {
                    if (n >= fArray.length || !(fArray[n] <= f)) break;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw GraphicsBufferAllocator.a(illegalArgumentException);
                }
                ++n;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw GraphicsBufferAllocator.a(illegalArgumentException);
        }
        if (n >= fArray.length) {
            n = fArray.length - 1;
        }
        nArray[0] = n - 1;
        nArray[1] = n;
        return nArray;
    }

    public static void K(int n, int n2, int n3, int n4, int n5, int n6) {
        float f = 0.00390625f;
        float f2 = 0.00390625f;
        GL11.glBegin((int)7);
        GraphicsBufferAllocator.r(n, n2 + n6, 0.0, (float)n3 * f, (float)(n4 + n6) * f2);
        GraphicsBufferAllocator.r(n + n5, n2 + n6, 0.0, (float)(n3 + n5) * f, (float)(n4 + n6) * f2);
        GraphicsBufferAllocator.r(n + n5, n2, 0.0, (float)(n3 + n5) * f, (float)(n4 + 0) * f2);
        GraphicsBufferAllocator.r(n, n2, 0.0, (float)n3 * f, (float)(n4 + 0) * f2);
        GL11.glEnd();
    }

    public static void n(double d2, double d3, double d4, double d5, double d6, Color color, Color color2) {
        block3: {
            block2: {
                try {
                    if (!ConfigurationManager.U()) break block2;
                    DataFlowAnalyzer.N(d2, d3, d4 - d2, d5 - d3, (float)d6, color, color2);
                    break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw GraphicsBufferAllocator.a(illegalArgumentException);
                }
            }
            ConfigurationManager.q(d2, d3, d4 - d2, d5 - d3, d6, color, color2);
        }
    }

    public static int V() {
        try {
            if (ConfigurationManager.U()) {
                return 0;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw GraphicsBufferAllocator.a(illegalArgumentException);
        }
        return a.gts();
    }

    private GraphicsBufferAllocator() {
    }

    public static void F(double d2, double d3, double d4, double d5) {
    }

    public static Color o(float f) {
        return GraphicsBufferAllocator.B(f, false);
    }

    public static void Q(double d2, double d3, double d4, double d5) {
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)16);
        CompressionAlgorithmManager1716.H(2978, intBuffer);
        V.push(new ResourceAllocationTracker882(intBuffer.get(0), intBuffer.get(1), intBuffer.get(2), intBuffer.get(3)));
        int n = ApplicationLifecycleManager.b();
        double d6 = 2.0 * TemporalMetadataResolver.h.a().b();
        int n2 = (int)(d4 * d6);
        int n3 = (int)(d5 * d6);
        double d7 = d2 * d6;
        int n4 = (int)d7;
        double d8 = d3 * d6;
        int n5 = (int)((double)n - d8 - (double)n3);
        GL11.glViewport((int)n4, (int)n5, (int)n2, (int)n3);
    }

    public static void O(double d2, double d3, double d4, double d5) {
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)0.0f, (float)0.0f);
        GL11.glVertex3d((double)d2, (double)d5, (double)0.0);
        GL11.glTexCoord2f((float)1.0f, (float)0.0f);
        GL11.glVertex3d((double)d4, (double)d5, (double)0.0);
        GL11.glTexCoord2f((float)1.0f, (float)1.0f);
        GL11.glVertex3d((double)d4, (double)d3, (double)0.0);
        GL11.glTexCoord2f((float)0.0f, (float)1.0f);
        GL11.glVertex3d((double)d2, (double)d3, (double)0.0);
        GL11.glEnd();
    }

    public static void r(double d2, double d3, double d4, double d5) {
        TransactionFlowController transactionFlowController = TransactionFlowController.g();
        transactionFlowController.p(7);
        transactionFlowController.m(d2, d5, 0.0, 1.0, 0.0);
        transactionFlowController.m(d4, d5, 0.0, 0.0, 0.0);
        transactionFlowController.m(d4, d3, 0.0, 0.0, 1.0);
        transactionFlowController.m(d2, d3, 0.0, 1.0, 1.0);
        transactionFlowController.G();
    }

    public static float[] S(int n) {
        float f = (float)(n >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n & 0xFF) / 255.0f;
        return new float[]{f2, f3, f4, f};
    }

    public static void j() {
        double d2 = 2.0 * TemporalMetadataResolver.h.a().b();
        int n = ApplicationLifecycleManager.b() - SystemDiagnosticAnalyzer.k();
        Z = new CoordinateMapper((int)((double)SystemDiagnosticAnalyzer.M() / d2), (int)((double)n / d2));
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public static void F() {
        if (!K.empty()) {
            ResourceAllocationTracker882 resourceAllocationTracker882 = K.pop();
            Ne.h.C(resourceAllocationTracker882.e, resourceAllocationTracker882.j, resourceAllocationTracker882.u, resourceAllocationTracker882.D);
        } else {
            z6.i = null;
            Ne.h.z(3089);
        }
    }

    public static void N(double d2, double d3, double d4, double d5) {
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)1.0f, (float)0.0f);
        GL11.glVertex3d((double)d2, (double)d5, (double)0.0);
        GL11.glTexCoord2f((float)0.0f, (float)0.0f);
        GL11.glVertex3d((double)d4, (double)d5, (double)0.0);
        GL11.glTexCoord2f((float)0.0f, (float)1.0f);
        GL11.glVertex3d((double)d4, (double)d3, (double)0.0);
        GL11.glTexCoord2f((float)1.0f, (float)1.0f);
        GL11.glVertex3d((double)d2, (double)d3, (double)0.0);
        GL11.glEnd();
    }

    public static CoordinateMapper b() {
        try {
            if (Z == null) {
                GraphicsBufferAllocator.j();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw GraphicsBufferAllocator.a(illegalArgumentException);
        }
        return Z;
    }

    public static void Y(Color color, Color color2, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        try {
            if (ConfigurationManager.U()) {
                z6.I(d2, d3, d4, d5, 1.0f, color2);
                z6.I(d2, d3, d8, d9, 1.0f, color2);
                z6.I(d6, d7, d8, d9, 1.0f, color);
                z6.I(d6, d7, d4, d5, 1.0f, color);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw GraphicsBufferAllocator.a(illegalArgumentException);
        }
        Ne.h.z(3553);
        Ne.h.y(3042);
        Ne.h.z(3008);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glShadeModel((int)7425);
        GraphicsBufferAllocator.Y(color2);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glVertex2d((double)d4, (double)d5);
        GraphicsBufferAllocator.Y(color);
        GL11.glVertex2d((double)d6, (double)d7);
        GL11.glVertex2d((double)d8, (double)d9);
        GL11.glEnd();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        GL11.glShadeModel((int)7424);
        Ne.h.z(3042);
        Ne.h.y(3008);
        Ne.h.y(3553);
    }

    public static void e(double d2, double d3, double d4, double d5) {
        int n;
        int n2;
        int n3;
        int n4;
        block7: {
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            block8: {
                boolean bl = false;
                n12 = 0;
                n11 = 0;
                n10 = 0;
                n9 = 0;
                if (GL11.glIsEnabled((int)3089)) {
                    bl = true;
                    o.clear();
                    CompressionAlgorithmManager1716.H(3088, o);
                    n12 = o.get(0);
                    n11 = o.get(1);
                    n10 = o.get(2);
                    n9 = o.get(3);
                    K.push(new ResourceAllocationTracker882(n12, n11, n10, n9));
                } else {
                    Ne.h.y(3089);
                }
                int n13 = ApplicationLifecycleManager.b();
                int n14 = ApplicationLifecycleManager.e();
                double d6 = 2.0 * TemporalMetadataResolver.h.a().b();
                n4 = (int)(d4 * d6);
                n3 = (int)(d5 * d6);
                double d7 = d2 * d6;
                n2 = (int)Math.ceil(d7);
                double d8 = d3 * d6;
                n = (int)Math.ceil((double)n13 - d8 - (double)n3);
                try {
                    if (!bl) break block7;
                    if (n2 >= n12) break block8;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw GraphicsBufferAllocator.a(illegalArgumentException);
                }
                n2 = n12;
            }
            if ((n8 = n2 + n4) > (n7 = n12 + n10)) {
                n6 = n8 - n7;
                n4 -= n6;
                n4 = Math.max(0, n4);
            }
            if (n < n11) {
                n = n11;
            }
            if ((n6 = n + n3) > (n5 = n11 + n9)) {
                int n15 = n6 - n5;
                n3 -= n15;
                n3 = Math.max(0, n3);
            }
        }
        Ne.h.C(n2, n, n4, n3);
    }

    public static boolean Y(Color color) {
        boolean bl;
        float f;
        float f2;
        float f3;
        float f4;
        block9: {
            block8: {
                f4 = (float)color.getRed() / 255.0f;
                f3 = (float)color.getGreen() / 255.0f;
                f2 = (float)color.getBlue() / 255.0f;
                f = (float)color.getAlpha() / 255.0f;
                try {
                    try {
                        try {
                            try {
                                if (f4 != q || f3 != r) break block8;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw GraphicsBufferAllocator.a(illegalArgumentException);
                            }
                            if (f2 != z) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw GraphicsBufferAllocator.a(illegalArgumentException);
                        }
                        if (p != f) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw GraphicsBufferAllocator.a(illegalArgumentException);
                    }
                    bl = true;
                    break block9;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw GraphicsBufferAllocator.a(illegalArgumentException);
                }
            }
            bl = false;
        }
        boolean bl2 = bl;
        Ne.h.q(f4, f3, f2, f);
        tl.a(f4, f3, f2, f);
        q = f4;
        r = f3;
        z = f2;
        p = f;
        return bl2;
    }
}

