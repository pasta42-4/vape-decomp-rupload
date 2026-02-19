/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.app.graphics.rendering.ColorPaletteRenderer;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

public class NetworkConnectionManager1525
extends AbstractComputationKernel {
    private static int E;
    private final ColorPaletteRenderer F;

    public static int H() {
        int n = NetworkConnectionManager1525.t();
        try {
            if (n == 0) {
                return 45;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1525.a(customSystemException);
        }
        return 0;
    }

    static {
        if (NetworkConnectionManager1525.t() == 0) {
            NetworkConnectionManager1525.d(4);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void d(int n) {
        E = n;
    }

    public static int t() {
        return E;
    }

    public NetworkConnectionManager1525(double d2, double d3) {
        this.getClass();
        this.F = new ColorPaletteRenderer(0.15 * 4.0, new Color(32, 32, 32, 32), new Color(128, 128, 128, 64));
        this.T(d2);
        this.w(d3);
    }

    @Override
    public void G() {
        block4: {
            block5: {
                try {
                    try {
                        if (this.F.F()) break block4;
                        if (!this.F.C()) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkConnectionManager1525.a(customSystemException);
                    }
                    this.F.q();
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkConnectionManager1525.a(customSystemException);
                }
            }
            this.F.o();
        }
        ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), this.F.k());
    }
}

