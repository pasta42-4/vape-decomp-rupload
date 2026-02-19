/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Fm;
import a.KG;
import a.O_;
import a.VF;
import a.Ve;
import a.Vt;
import a.eM;
import org.jetbrains.annotations.Nullable;

public class pa
extends KG {
    @Nullable
    private Ve B;
    private final Object D;
    private static final Fm N = new Fm();
    @Nullable
    private Vt K;
    private final Object c;

    public VF getNetHandler() {
        return new VF(this.getNetworkManager().A());
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public pa(Object object, Object object2) {
        this.c = object;
        this.D = object2;
    }

    public Ve getNetworkManager() {
        try {
            if (this.B == null) {
                this.B = new Ve(this.c);
            }
        }
        catch (O_ o_2) {
            throw pa.a(o_2);
        }
        return this.B;
    }

    public void setPacket(Vt vt2) {
        this.K = vt2;
    }

    @Override
    public Fm getListeners() {
        return N;
    }

    public static Fm getEventListeners() {
        return N;
    }

    public Vt getPacket() {
        try {
            if (this.K == null) {
                this.K = new Vt(this.D);
            }
        }
        catch (O_ o_2) {
            throw pa.a(o_2);
        }
        return this.K;
    }

    @Override
    public boolean fire() {
        try {
            if (!this.getNetworkManager().A().B(eM.US)) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw pa.a(o_2);
        }
        return super.fire();
    }

    public Object getPacketInstance() {
        return this.D;
    }
}

