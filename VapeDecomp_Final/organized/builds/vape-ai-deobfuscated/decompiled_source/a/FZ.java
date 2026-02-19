/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;

public class FZ
implements DataTransformationContract2366 {
    private long K;
    private String v;
    private ReflectionUtilityManager680 U;

    public long e() {
        return this.K;
    }

    public String d() {
        return this.v;
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.U = new ReflectionUtilityManager680(networkProtocolEncoder1013);
        this.v = networkProtocolEncoder1013.b(255);
        this.K = networkProtocolEncoder1013.S();
    }

    public ReflectionUtilityManager680 m() {
        return this.U;
    }

    public FZ(ReflectionUtilityManager680 reflectionUtilityManager680, String string) {
        this.U = reflectionUtilityManager680;
        this.v = string;
        this.K = System.currentTimeMillis();
    }

    public FZ() {
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.U.o(networkProtocolEncoder1013);
        networkProtocolEncoder1013.J(this.v);
        networkProtocolEncoder1013.Z(this.K);
    }
}

