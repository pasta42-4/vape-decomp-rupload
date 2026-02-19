/*
 * Decompiled with CFR 0.152.
 */
package com.app.security.access;

import a.bm;
import com.app.communication.protocol.MessageProtocolInterface;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.exception.system.CustomSystemException;
import com.graphics.palette.ColorPaletteGenerator1110;

public class SecurityAccessController
implements MessageProtocolInterface {
    private CryptoConfigurationRegistry383 Q;
    private static int d;
    private ColorPaletteGenerator1110 R = new ColorPaletteGenerator1110();
    private boolean Z;
    private bm k;

    public CryptoConfigurationRegistry383 I() {
        return this.Q;
    }

    @Override
    public double S() {
        return this.k.w() + 4.0;
    }

    public static int z() {
        int n = SecurityAccessController.q();
        try {
            if (n == 0) {
                return 77;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecurityAccessController.a(customSystemException);
        }
        return 0;
    }

    public SecurityAccessController(String string, boolean bl) {
        this(string, CryptoConfigurationRegistry383.INFO, bl);
    }

    public SecurityAccessController(String string) {
        this(string, CryptoConfigurationRegistry383.INFO, false);
    }

    public SecurityAccessController(String string, CryptoConfigurationRegistry383 cryptoConfigurationRegistry383, boolean bl) {
        this.k = new bm(string, 0.9, this.R.n, false);
        this.k.n(100.0);
        this.k.A(true);
        this.Q = cryptoConfigurationRegistry383;
        this.Z = bl;
    }

    public ColorPaletteGenerator1110 a() {
        return this.R;
    }

    public static int q() {
        return d;
    }

    @Override
    public double d() {
        try {
            if (this.k.y().equals("")) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecurityAccessController.a(customSystemException);
        }
        return this.k.z() + 4.0;
    }

    @Override
    public void u(double d2, double d3) {
        this.k.b(d2);
        this.k.M(d3);
        this.k.E();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void y(String string) {
        this.k.H(string);
    }

    static {
        if (SecurityAccessController.q() == 0) {
            SecurityAccessController.A(11);
        }
    }

    public void R(CryptoConfigurationRegistry383 cryptoConfigurationRegistry383) {
        this.Q = cryptoConfigurationRegistry383;
    }

    public SecurityAccessController(String string, CryptoConfigurationRegistry383 cryptoConfigurationRegistry383) {
        this(string, cryptoConfigurationRegistry383, false);
    }

    public String B() {
        return this.k.y();
    }

    public boolean Q() {
        return this.Z;
    }

    public static void A(int n) {
        d = n;
    }
}

