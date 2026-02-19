/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.network.state.NetworkStateManager;

class cS
implements OperationExecutionInterface {
    final NetworkStateManager Q;

    cS(NetworkStateManager networkStateManager) {
        this.Q = networkStateManager;
    }

    @Override
    public void R() {
        boolean bl;
        NetworkStateManager networkStateManager;
        try {
            networkStateManager = this.Q;
            bl = !NetworkStateManager.s(this.Q);
        }
        catch (CustomSystemException customSystemException) {
            throw cS.a(customSystemException);
        }
        NetworkStateManager.x(networkStateManager, bl);
        this.Q.F().A();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

