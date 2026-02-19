/*
 * Decompiled with CFR 0.152.
 */
package com.app.streaming;

import com.exception.system.CustomSystemException;
import com.security.session.CipherSessionManager;
import com.system.configuration.ConfigurationManager;

public abstract class StreamProcessingEngine
extends CipherSessionManager {
    private static String[] Fj;

    public static void w(String[] stringArray) {
        Fj = stringArray;
    }

    @Override
    public void o(boolean bl) {
        double d2;
        double d3;
        double d4;
        double d5;
        try {
            d5 = this.G() - 0.5;
            d4 = this.W() - 0.5;
            d3 = this.w() + 1.0;
            d2 = bl ? this.G5 + 2.0 : this.m() + 2.0;
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessingEngine.c(customSystemException);
        }
        ConfigurationManager.U(d5, d4, d3, d2, StreamProcessingEngine.M.S, 2.1f, 1.0f, 1.0f);
        super.o(bl);
    }

    public static String[] X() {
        return Fj;
    }

    @Override
    public void G() {
        super.G();
    }

    static {
        if (StreamProcessingEngine.X() == null) {
            StreamProcessingEngine.w(new String[1]);
        }
    }

    @Override
    public void E() {
        super.E();
    }

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

