/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.app.core.events.EventDispatcher2702;
import com.network.protocol.MultiProtocolContextManager;
import java.awt.Color;

class RJ {
    private final MultiProtocolContextManager C;
    private Color F;
    private double B = 1.0;
    private boolean V;

    RJ(MultiProtocolContextManager multiProtocolContextManager, Color color, EventDispatcher2702 eventDispatcher2702) {
        this(multiProtocolContextManager, color);
    }

    public void R(double d2) {
        this.B = d2;
    }

    public void l(Color color) {
        this.F = color;
    }

    private RJ(MultiProtocolContextManager multiProtocolContextManager, Color color) {
        this.C = multiProtocolContextManager;
        this.F = color;
    }

    public void K(boolean bl) {
        this.V = bl;
    }

    public double P() {
        return this.B;
    }

    public Color M() {
        return this.F;
    }

    public boolean V() {
        return this.V;
    }

    public MultiProtocolContextManager i() {
        return this.C;
    }
}

