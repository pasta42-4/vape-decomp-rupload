/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.game.actions.ActionSequenceHandler;
import com.security.crypto.CryptoKeyExchanger;

public class DataTransmissionHandler1706
extends ActionSequenceHandler {
    public DataTransmissionHandler1706 K() {
        return new DataTransmissionHandler1706(CryptoKeyExchanger.T(DataTransmissionHandler1706.U.u().dj, this.H));
    }

    public void x(float f, float f2, float f3) {
        CryptoKeyExchanger.G(DataTransmissionHandler1706.U.u().dj, this.H, f, f2, f3);
    }

    public void r(double d2, double d3, double d4) {
        this.x((float)d2, (float)d3, (float)d4);
    }

    public void a() {
        CryptoKeyExchanger.F(DataTransmissionHandler1706.U.u().dj, this.H);
    }

    public DataTransmissionHandler1706 W() {
        return new DataTransmissionHandler1706(CryptoKeyExchanger.a(DataTransmissionHandler1706.U.u().dj, this.H));
    }

    public void X(float f, float f2, float f3) {
        CryptoKeyExchanger.w(DataTransmissionHandler1706.U.u().dj, this.H, f, f2, f3);
    }

    public DataTransmissionHandler1706(Object object) {
        super(object);
    }
}

