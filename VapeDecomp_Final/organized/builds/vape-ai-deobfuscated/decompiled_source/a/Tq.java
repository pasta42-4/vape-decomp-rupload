/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Tm;
import com.app.correlation.management.UuidCorrelationManager;
import com.exception.system.CustomSystemException;
import com.identity.management.UniversalIdentityManager;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.security.crypto.CryptographicAlgorithmDescriptor;

public class Tq
extends UuidCorrelationManager<Tm> {
    private CryptographicAlgorithmDescriptor r;
    private static String[] v;
    private long Q;
    private UniversalIdentityManager g;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void w(String[] stringArray) {
        v = stringArray;
    }

    static {
        if (Tq.r() == null) {
            Tq.w(new String[1]);
        }
    }

    public Tq(Tm tm, long l, CryptographicAlgorithmDescriptor cryptographicAlgorithmDescriptor) {
        super(tm);
        this.Q = l;
        this.r = cryptographicAlgorithmDescriptor;
    }

    public UniversalIdentityManager x() {
        return this.g;
    }

    public long o() {
        return this.Q;
    }

    public Tq(Tm tm, long l, UniversalIdentityManager universalIdentityManager) {
        this(tm, l, CryptographicAlgorithmDescriptor.ACCEPTED);
        this.g = universalIdentityManager;
    }

    public CryptographicAlgorithmDescriptor N() {
        return this.r;
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        try {
            this.Q = networkProtocolEncoder1013.S();
            this.r = networkProtocolEncoder1013.L(CryptographicAlgorithmDescriptor.class);
            if (this.r == CryptographicAlgorithmDescriptor.ACCEPTED) {
                this.g = new UniversalIdentityManager(networkProtocolEncoder1013);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Tq.a(customSystemException);
        }
    }

    public Tq() {
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        try {
            networkProtocolEncoder1013.Z(this.Q);
            networkProtocolEncoder1013.N(this.r);
            if (this.r == CryptographicAlgorithmDescriptor.ACCEPTED) {
                this.g.N(networkProtocolEncoder1013);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Tq.a(customSystemException);
        }
    }

    public static String[] r() {
        return v;
    }
}

