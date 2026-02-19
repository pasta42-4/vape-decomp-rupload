/*
 * Decompiled with CFR 0.152.
 */
package com.app.transformation;

import com.security.config.CryptoConfigurationEnum;
import java.awt.Color;

public class DataTransformationEngine1794 {
    int Y;
    Color a;
    String U;
    Color l;

    public DataTransformationEngine1794(String string, Color color, Color color2, int n) {
        this.U = string;
        this.l = color;
        this.a = color2;
        this.Y = n;
    }

    public DataTransformationEngine1794(CryptoConfigurationEnum cryptoConfigurationEnum, String string) {
        this(cryptoConfigurationEnum);
        this.I(string);
    }

    public void d(Color color) {
        this.a = color;
    }

    public void I(String string) {
        this.U = string;
    }

    public Color i() {
        return this.l;
    }

    public void N(int n) {
        this.Y = n;
    }

    public int r() {
        return this.Y;
    }

    public DataTransformationEngine1794(CryptoConfigurationEnum cryptoConfigurationEnum) {
        this(cryptoConfigurationEnum.V(), cryptoConfigurationEnum.v(), cryptoConfigurationEnum.e(), cryptoConfigurationEnum.A());
    }

    public void I(Color color) {
        this.l = color;
    }

    public Color X() {
        return this.a;
    }

    public String R() {
        return this.U;
    }
}

