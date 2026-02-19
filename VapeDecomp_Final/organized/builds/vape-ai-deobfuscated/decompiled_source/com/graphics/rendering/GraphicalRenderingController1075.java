/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import com.app.communication.protocol.MessageProtocolInterface;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.event.management.EventDispatchProtocol;
import com.graphics.palette.ColorPaletteGenerator1110;
import com.temporal.metadata.TemporalMetadataResolver;
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class GraphicalRenderingController1075
implements EventDispatchProtocol {
    private String L;
    private double e;
    private final Color Z;
    private CryptoConfigurationRegistry383 h;
    private ColorPaletteGenerator1110 Y = new ColorPaletteGenerator1110();
    private double n;
    private double s;
    private final MessageProtocolInterface b;
    private double o;

    @Override
    public CryptoConfigurationRegistry383 q() {
        return this.h;
    }

    public void Z(CryptoConfigurationRegistry383 cryptoConfigurationRegistry383) {
        this.h = cryptoConfigurationRegistry383;
    }

    public String U() {
        return this.L;
    }

    @Override
    public double h() {
        return this.e;
    }

    public void Z(String string) {
        this.L = string;
    }

    @Override
    public void E(double d2) {
        this.e = d2;
    }

    @Override
    public double s() {
        return 25.0 + this.b.d();
    }

    @Override
    public void K(double d2) {
        this.n = d2;
    }

    @Override
    public double w() {
        return this.o;
    }

    public MessageProtocolInterface V() {
        return this.b;
    }

    @Override
    public double W() {
        return this.n;
    }

    @Override
    public void m(double d2) {
        this.o = d2;
    }

    public Color V() {
        return Color.WHITE;
    }

    public GraphicalRenderingController1075(CryptoConfigurationRegistry383 cryptoConfigurationRegistry383, String string, MessageProtocolInterface messageProtocolInterface, double d2, double d3) {
        this.n = this.s = d2;
        this.e = this.o = d3;
        this.L = string;
        this.b = messageProtocolInterface;
        this.h = cryptoConfigurationRegistry383;
        this.Z = new Color(cryptoConfigurationRegistry383.o());
    }

    @Override
    public double S() {
        double d2 = TemporalMetadataResolver.h.W().q().D(this.L) + 2.0;
        return Math.max(d2, this.b.S());
    }

    @Override
    public void R(double d2) {
        this.s = d2;
    }

    @Override
    public double j() {
        return this.s;
    }

    public String t() {
        return this.h.Y();
    }
}

