/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.data.contract.DataTransformationContract2366;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.security.registry.CryptoParameterRegistry;

public class Wp
implements DataTransformationContract2366 {
    private long[] d;
    private CryptoParameterRegistry v;
    private static String c;

    public CryptoParameterRegistry K() {
        return this.v;
    }

    static {
        if (Wp.h() != null) {
            Wp.x("x3xmGb");
        }
    }

    private Wp(CryptoParameterRegistry cryptoParameterRegistry, long[] lArray) {
        this.v = cryptoParameterRegistry;
        this.d = lArray;
    }

    public long[] J() {
        return this.d;
    }

    public static Wp l(long[] lArray) {
        return new Wp(CryptoParameterRegistry.ADD, lArray);
    }

    public Wp() {
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.v = networkProtocolEncoder1013.L(CryptoParameterRegistry.class);
        int n = networkProtocolEncoder1013.U();
        this.d = new long[n];
        try {
            for (int i = 0; i < n; ++i) {
                this.d[i] = networkProtocolEncoder1013.S();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Wp.a(customSystemException);
        }
    }

    public static void x(String string) {
        c = string;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.v);
        networkProtocolEncoder1013.e(this.d.length);
        for (long l : this.d) {
            networkProtocolEncoder1013.Z(l);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static Wp A(long[] lArray) {
        return new Wp(CryptoParameterRegistry.CHANGED_WORLD, lArray);
    }

    public static String h() {
        return c;
    }
}

