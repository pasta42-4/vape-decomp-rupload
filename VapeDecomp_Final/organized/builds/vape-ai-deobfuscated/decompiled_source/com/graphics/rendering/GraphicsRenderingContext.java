/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import com.transaction.audit.TransactionAuditor;
import java.awt.Color;

class GraphicsRenderingContext {
    public double t;
    public double f;
    public double Y;
    public float T;
    public double Q;
    public Color N;
    public double V;
    public double a;

    private GraphicsRenderingContext(double d2, double d3, double d4, double d5, double d6, double d7, float f) {
        this.t = d2;
        this.Y = d3;
        this.V = d4;
        this.a = d5;
        this.f = d6;
        this.Q = d7;
        this.T = f;
    }

    private GraphicsRenderingContext(double d2, double d3, double d4, double d5, double d6, double d7, float f, Color color) {
        this.t = d2;
        this.Y = d3;
        this.V = d4;
        this.a = d5;
        this.f = d6;
        this.Q = d7;
        this.T = f;
        this.N = color;
    }

    GraphicsRenderingContext(double d2, double d3, double d4, double d5, double d6, double d7, float f, TransactionAuditor transactionAuditor) {
        this(d2, d3, d4, d5, d6, d7, f);
    }

    GraphicsRenderingContext(double d2, double d3, double d4, TransactionAuditor transactionAuditor) {
        this(d2, d3, d4);
    }

    private GraphicsRenderingContext(double d2, double d3, double d4) {
        this.t = d2;
        this.Y = d3;
        this.V = d4;
    }

    GraphicsRenderingContext(double d2, double d3, double d4, double d5, double d6, double d7, float f, Color color, TransactionAuditor transactionAuditor) {
        this(d2, d3, d4, d5, d6, d7, f, color);
    }
}

