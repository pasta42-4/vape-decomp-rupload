/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.E2;
import a.GB;
import a.Ne;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;

public class f
implements GB {
    private float[] K = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
    protected float W = 1.0f;

    @Override
    public void L() {
        GL11.glEndList();
    }

    @Override
    public int I(int n2) {
        return GL11.glGenLists((int)n2);
    }

    @Override
    public void a(float f10, float f11, float f12, float f13) {
        this.K[0] = f10;
        this.K[1] = f11;
        this.K[2] = f12;
        this.K[3] = f13 *= this.W;
        GL11.glColor4f((float)f10, (float)f11, (float)f12, (float)f13);
    }

    @Override
    public void F(int n2, int n3) {
        GL11.glBindTexture((int)n2, (int)n3);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ByteBuffer byteBuffer) {
        GL11.glTexImage2D((int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9, (ByteBuffer)byteBuffer);
    }

    @Override
    public void C(float f10, float f11) {
        GL11.glTexCoord2f((float)f10, (float)f11);
    }

    @Override
    public void h(float f10, float f11, float f12) {
        GL11.glVertex3f((float)f10, (float)f11, (float)f12);
    }

    @Override
    public void l(int n2) {
        GL11.glBegin((int)n2);
    }

    @Override
    public void N(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ByteBuffer byteBuffer) {
        GL11.glTexSubImage2D((int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9, (ByteBuffer)byteBuffer);
    }

    @Override
    public void x(int n2, IntBuffer intBuffer) {
        E2.H(n2, intBuffer);
    }

    @Override
    public void r() {
        GL11.glEnd();
    }

    @Override
    public void M(int n2) {
        GL11.glCallList((int)n2);
    }

    @Override
    public void R(int n2, int n3) {
        GL11.glNewList((int)n2, (int)n3);
    }

    @Override
    public void b(float f10, float f11, float f12) {
        GL11.glTranslatef((float)f10, (float)f11, (float)f12);
    }

    @Override
    public void g(int n2) {
        Ne.h.y(n2);
    }

    @Override
    public void h(int n2) {
        Ne.h.z(n2);
    }

    @Override
    public void w(int n2, int n3, int n4) {
        GL11.glTexParameteri((int)n2, (int)n3, (int)n4);
    }
}

