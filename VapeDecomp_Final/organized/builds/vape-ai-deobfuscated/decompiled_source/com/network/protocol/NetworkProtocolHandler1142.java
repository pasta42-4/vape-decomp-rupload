/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.network.protocol;

import com.network.protocol.RemoteProtocolHandler;
import org.lwjgl.opengl.GL11;

public class NetworkProtocolHandler1142
implements RemoteProtocolHandler {
    @Override
    public void i(int n) {
        GL11.glBegin((int)n);
    }

    @Override
    public void R(double d2, double d3, double d4, double d5) {
        GL11.glColor4d((double)d2, (double)d3, (double)d4, (double)d5);
    }

    @Override
    public void b(double d2, double d3, double d4) {
        GL11.glNormal3d((double)d2, (double)d3, (double)d4);
    }

    @Override
    public void h(float f) {
        GL11.glLineWidth((float)f);
    }

    @Override
    public void z(int n) {
        GL11.glDisable((int)n);
    }

    @Override
    public void f(float f, float f2, float f3, float f4) {
        GL11.glRotatef((float)f, (float)f2, (float)f3, (float)f4);
    }

    @Override
    public void m(double d2, float f, float f2) {
        GL11.glColor3d((double)d2, (double)f, (double)f2);
    }

    @Override
    public void x(double d2, double d3, double d4) {
        GL11.glScaled((double)d2, (double)d3, (double)d4);
    }

    @Override
    public boolean k(int n) {
        return GL11.glIsEnabled((int)n);
    }

    @Override
    public void p(int n, float f) {
        GL11.glAlphaFunc((int)n, (float)f);
    }

    @Override
    public void X() {
        GL11.glPopMatrix();
    }

    @Override
    public void a(float f, float f2, float f3) {
        GL11.glColor3f((float)f, (float)f2, (float)f3);
    }

    @Override
    public void E(boolean bl) {
        GL11.glDepthMask((boolean)bl);
    }

    @Override
    public void m(double d2, double d3, double d4) {
        GL11.glTranslated((double)d2, (double)d3, (double)d4);
    }

    @Override
    public void y(int n) {
        GL11.glEnable((int)n);
    }

    @Override
    public void d(float f, float f2, float f3) {
        GL11.glTranslatef((float)f, (float)f2, (float)f3);
    }

    @Override
    public void z() {
        GL11.glPushMatrix();
    }

    @Override
    public void t(double d2, double d3, double d4) {
        GL11.glVertex3d((double)d2, (double)d3, (double)d4);
    }

    @Override
    public void C(int n, int n2, int n3, int n4) {
        GL11.glScissor((int)n, (int)n2, (int)n3, (int)n4);
    }

    @Override
    public float h(int n) {
        return GL11.glGetFloat((int)n);
    }

    @Override
    public void O(float f, double d2, double d3, double d4) {
        GL11.glRotated((double)f, (double)d2, (double)d3, (double)d4);
    }

    @Override
    public int S(int n) {
        return GL11.glGetInteger((int)n);
    }

    @Override
    public void t(float f, float f2, float f3) {
        GL11.glNormal3f((float)f, (float)f2, (float)f3);
    }

    @Override
    public void a() {
        GL11.glEnd();
    }

    @Override
    public void q(float f, float f2, float f3, float f4) {
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
    }

    @Override
    public void w() {
        GL11.glLoadIdentity();
    }

    @Override
    public void J(float f, float f2, float f3) {
        GL11.glScalef((float)f, (float)f2, (float)f3);
    }
}

