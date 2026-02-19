/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.graphics.rendering;

import a.GB;
import a.Ne;
import com.data.compression.CompressionAlgorithmManager1716;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;

public class RenderingCalibrationEngine
implements GB {
    private float[] K = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
    protected float W = 1.0f;

    @Override
    public void L() {
        GL11.glEndList();
    }

    @Override
    public int I(int n) {
        return GL11.glGenLists((int)n);
    }

    @Override
    public void a(float f, float f2, float f3, float f4) {
        this.K[0] = f;
        this.K[1] = f2;
        this.K[2] = f3;
        this.K[3] = f4 *= this.W;
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
    }

    @Override
    public void F(int n, int n2) {
        GL11.glBindTexture((int)n, (int)n2);
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        GL11.glTexImage2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (ByteBuffer)byteBuffer);
    }

    @Override
    public void C(float f, float f2) {
        GL11.glTexCoord2f((float)f, (float)f2);
    }

    @Override
    public void h(float f, float f2, float f3) {
        GL11.glVertex3f((float)f, (float)f2, (float)f3);
    }

    @Override
    public void l(int n) {
        GL11.glBegin((int)n);
    }

    @Override
    public void N(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        GL11.glTexSubImage2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (ByteBuffer)byteBuffer);
    }

    @Override
    public void x(int n, IntBuffer intBuffer) {
        CompressionAlgorithmManager1716.H(n, intBuffer);
    }

    @Override
    public void r() {
        GL11.glEnd();
    }

    @Override
    public void M(int n) {
        GL11.glCallList((int)n);
    }

    @Override
    public void R(int n, int n2) {
        GL11.glNewList((int)n, (int)n2);
    }

    @Override
    public void b(float f, float f2, float f3) {
        GL11.glTranslatef((float)f, (float)f2, (float)f3);
    }

    @Override
    public void g(int n) {
        Ne.h.y(n);
    }

    @Override
    public void h(int n) {
        Ne.h.z(n);
    }

    @Override
    public void w(int n, int n2, int n3) {
        GL11.glTexParameteri((int)n, (int)n2, (int)n3);
    }
}

