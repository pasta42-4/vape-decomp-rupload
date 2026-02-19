/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.P6;
import com.data.processing.DataStreamEncoder;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.network.protocol.Protocolnegotiator;
import com.system.lifecycle.ObjectLifecycleTracker;

public class oZ
extends ObjectLifecycleTracker {
    public oZ(Object object) {
        super(object);
    }

    public float m() {
        if (GameVersionEnumerator.MC_1_21_6.H()) {
            DataStreamEncoder dataStreamEncoder = new DataStreamEncoder(P6.k(oZ.U.u().k7, this.H));
            return dataStreamEncoder.w();
        }
        return P6.P(oZ.U.u().k7, this.H);
    }

    public void I(float f) {
        if (GameVersionEnumerator.MC_1_21_6.H()) {
            DataStreamEncoder dataStreamEncoder = new DataStreamEncoder(P6.k(oZ.U.u().k7, this.H));
            dataStreamEncoder.k(f);
            return;
        }
        P6.j(oZ.U.u().k7, this.H, f);
    }

    public float t() {
        if (GameVersionEnumerator.MC_1_21_6.H()) {
            DataStreamEncoder dataStreamEncoder = new DataStreamEncoder(P6.k(oZ.U.u().k7, this.H));
            return dataStreamEncoder.A();
        }
        return P6.x(oZ.U.u().k7, this.H);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void N(float f) {
        if (GameVersionEnumerator.MC_1_21_6.H()) {
            DataStreamEncoder dataStreamEncoder = new DataStreamEncoder(P6.k(oZ.U.u().k7, this.H));
            dataStreamEncoder.i(f);
            return;
        }
        P6.N(oZ.U.u().k7, this.H, f);
    }

    public boolean f() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return this.d().g();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw oZ.a(customSystemException);
        }
        return P6.j(oZ.U.u().k7, this.H);
    }

    public void C(boolean bl) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                this.d().W(bl);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw oZ.a(customSystemException);
        }
        P6.c(oZ.U.u().k7, this.H, bl);
    }

    public boolean Q() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return this.d().u();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw oZ.a(customSystemException);
        }
        return P6.Y(oZ.U.u().k7, this.H);
    }

    public void C(Protocolnegotiator protocolnegotiator) {
        P6.K(oZ.U.u().k7, this.H, protocolnegotiator.M());
    }

    public void O(boolean bl) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                this.d().Y(bl);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw oZ.a(customSystemException);
        }
        P6.T(oZ.U.u().k7, this.H, bl);
    }

    public Protocolnegotiator d() {
        return new Protocolnegotiator(P6.g(oZ.U.u().k7, this.H));
    }
}

