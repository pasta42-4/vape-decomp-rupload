/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.event.processing;

import a.z6;
import com.exception.system.CustomSystemException;
import com.network.protocol.RemoteProtocolHandler;
import com.system.resources.ResourceAllocationTracker882;
import org.lwjgl.opengl.GL11;

public class EventStreamProcessor1098
implements RemoteProtocolHandler {
    private int[] r = new int[]{3008, 3553, 2896};

    @Override
    public void z() {
        z6.D.F();
    }

    @Override
    public void b(double d2, double d3, double d4) {
        this.t((float)d2, (float)d3, (float)d4);
    }

    @Override
    public float h(int n) {
        try {
            if (n == 3010) {
                return 0.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventStreamProcessor1098.a(customSystemException);
        }
        return GL11.glGetFloat((int)n);
    }

    @Override
    public void a(float f, float f2, float f3) {
    }

    @Override
    public void x(double d2, double d3, double d4) {
        this.J((float)d2, (float)d3, (float)d4);
    }

    @Override
    public void m(double d2, float f, float f2) {
    }

    @Override
    public void h(float f) {
    }

    @Override
    public void i(int n) {
    }

    @Override
    public void R(double d2, double d3, double d4, double d5) {
    }

    @Override
    public void d(float f, float f2, float f3) {
        z6.D.e(f, f2, f3);
    }

    @Override
    public void z(int n) {
        for (int n2 : this.r) {
            try {
                if (n != n2) continue;
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw EventStreamProcessor1098.a(customSystemException);
            }
        }
        z6.N.j(n);
        GL11.glDisable((int)n);
    }

    @Override
    public void C(int n, int n2, int n3, int n4) {
        z6.i = new ResourceAllocationTracker882(n, n2, n3, n4);
        GL11.glScissor((int)n, (int)n2, (int)n3, (int)n4);
    }

    @Override
    public void q(float f, float f2, float f3, float f4) {
    }

    @Override
    public void E(boolean bl) {
        z6.N.X(bl);
    }

    @Override
    public void X() {
        z6.D.J();
    }

    @Override
    public boolean k(int n) {
        int n2 = 0;
        while (true) {
            block5: {
                try {
                    try {
                        if (n2 >= this.r.length) break;
                        if (n != this.r[n2]) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventStreamProcessor1098.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventStreamProcessor1098.a(customSystemException);
                }
            }
            ++n2;
        }
        return GL11.glIsEnabled((int)n);
    }

    @Override
    public void O(float f, double d2, double d3, double d4) {
        this.f(f, (float)d2, (float)d3, (float)d4);
    }

    @Override
    public void t(double d2, double d3, double d4) {
    }

    @Override
    public int S(int n) {
        try {
            if (n == 3009) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventStreamProcessor1098.a(customSystemException);
        }
        return GL11.glGetInteger((int)n);
    }

    @Override
    public void t(float f, float f2, float f3) {
    }

    @Override
    public void w() {
    }

    @Override
    public void p(int n, float f) {
    }

    @Override
    public void f(float f, float f2, float f3, float f4) {
        z6.D.G(f, f2, f3, f4);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void a() {
    }

    @Override
    public void m(double d2, double d3, double d4) {
        this.d((float)d2, (float)d3, (float)d4);
    }

    @Override
    public void J(float f, float f2, float f3) {
        z6.D.I(f, f2, f3);
    }

    @Override
    public void y(int n) {
        for (int n2 : this.r) {
            try {
                if (n != n2) continue;
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw EventStreamProcessor1098.a(customSystemException);
            }
        }
        z6.N.e(n);
        GL11.glEnable((int)n);
    }
}

