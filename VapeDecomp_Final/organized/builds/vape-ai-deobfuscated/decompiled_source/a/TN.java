/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.app.security.CryptoUtilityService;
import com.data.aggregation.SequentialDataAggregator;
import com.exception.system.CustomSystemException;
import com.network.core.NetworkConnectionManager;
import com.runtime.errorhandling.RuntimeExceptionMediator;
import com.security.crypto.CryptoSecurityProvider;
import com.security.crypto.CryptographicModeEnum;
import com.system.lifecycle.SystemLifecycleController;
import com.system.state.SystemStateManager;
import com.temporal.metadata.TemporalMetadataResolver;

public class TN {
    private final CryptoUtilityService B;
    private final SequentialDataAggregator f;
    private final SystemStateManager K;
    private final CryptoSecurityProvider V = new CryptoSecurityProvider();
    private static int[] o;
    private final NetworkConnectionManager p;
    private final RuntimeExceptionMediator m;

    public boolean h() {
        boolean bl;
        try {
            bl = SystemLifecycleController.C.U() == CryptographicModeEnum.OFFLINE;
        }
        catch (CustomSystemException customSystemException) {
            throw TN.a(customSystemException);
        }
        return bl;
    }

    public CryptoUtilityService t() {
        return this.B;
    }

    public static int[] w() {
        return o;
    }

    static {
        if (TN.w() == null) {
            TN.V(new int[2]);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void I() {
        try {
            if (!SystemLifecycleController.C.y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TN.a(customSystemException);
        }
        this.B.Q();
        this.m.P();
        this.p.y();
        this.V.b("");
        this.V.B(null);
        TemporalMetadataResolver.h.M().O();
        this.f.r();
        this.K.U();
    }

    public RuntimeExceptionMediator u() {
        return this.m;
    }

    public SequentialDataAggregator m() {
        return this.f;
    }

    public TN() {
        this.B = new CryptoUtilityService();
        this.m = new RuntimeExceptionMediator();
        this.p = new NetworkConnectionManager();
        this.f = new SequentialDataAggregator();
        this.K = new SystemStateManager();
    }

    public NetworkConnectionManager p() {
        return this.p;
    }

    public CryptoSecurityProvider n() {
        return this.V;
    }

    public SystemStateManager N() {
        return this.K;
    }

    public static void V(int[] nArray) {
        o = nArray;
    }
}

