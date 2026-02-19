/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;

public class e9
implements DataTransformationContract2366 {
    private ReflectionUtilityManager680 O;

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.O.o(networkProtocolEncoder1013);
    }

    public e9() {
    }

    public e9(ReflectionUtilityManager680 reflectionUtilityManager680) {
        this.O = reflectionUtilityManager680;
    }

    public ReflectionUtilityManager680 v() {
        return this.O;
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.O = new ReflectionUtilityManager680(networkProtocolEncoder1013);
    }
}

