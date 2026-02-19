/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Tq;
import com.app.correlation.management.UuidCorrelationManager;
import com.network.protocol.NetworkProtocolEncoder1013;

public class Tm
extends UuidCorrelationManager<Tq> {
    private boolean j;
    private static String I;
    private long D;

    static {
        if (Tm.n() != null) {
            Tm.I("ZIgTM");
        }
    }

    public static void I(String string) {
        I = string;
    }

    public long L() {
        return this.D;
    }

    public Tm(long l, boolean bl) {
        this();
        this.D = l;
        this.j = bl;
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.D = networkProtocolEncoder1013.S();
        this.j = networkProtocolEncoder1013.B();
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.Z(this.D);
        networkProtocolEncoder1013.W(this.j);
    }

    public static String n() {
        return I;
    }

    public boolean y() {
        return this.j;
    }

    public Tm() {
    }
}

