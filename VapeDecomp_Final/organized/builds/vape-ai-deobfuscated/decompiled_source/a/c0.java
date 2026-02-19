/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.network.protocol.NetworkProtocolEncoder1013;
import java.util.LinkedHashMap;
import java.util.Map;

public class c0 {
    private final int u;
    private final Map<Short, Integer> r;
    private final float Y;
    private final float O;
    private final float M;

    public float I() {
        return this.O;
    }

    c0(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.O = networkProtocolEncoder1013.o();
        this.Y = networkProtocolEncoder1013.o();
        this.M = networkProtocolEncoder1013.o();
        this.u = networkProtocolEncoder1013.e();
        this.r = new LinkedHashMap<Short, Integer>();
        int n = networkProtocolEncoder1013.U();
        for (int i = 0; i < n; ++i) {
            short s2 = networkProtocolEncoder1013.u();
            int n2 = networkProtocolEncoder1013.U();
            this.r.put(s2, n2);
        }
    }

    public c0(float f, float f2, float f3, int n, Map<Short, Integer> map) {
        this.O = f;
        this.Y = f2;
        this.M = f3;
        this.u = n;
        this.r = map;
    }

    public float a() {
        return this.Y;
    }

    public void H(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.l(this.O);
        networkProtocolEncoder1013.l(this.Y);
        networkProtocolEncoder1013.l(this.M);
        networkProtocolEncoder1013.I(this.u);
        networkProtocolEncoder1013.e(this.r.size());
        for (Map.Entry<Short, Integer> entry : this.r.entrySet()) {
            networkProtocolEncoder1013.z(entry.getKey());
            networkProtocolEncoder1013.e(entry.getValue());
        }
    }

    public float U() {
        return this.M;
    }

    public int P() {
        return this.u;
    }

    public Map<Short, Integer> A() {
        return this.r;
    }
}

