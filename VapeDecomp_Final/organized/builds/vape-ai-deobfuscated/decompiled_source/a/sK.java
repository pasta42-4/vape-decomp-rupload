/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.fG;
import com.app.core.interfaces.OperationExecutionInterface;
import com.data.mapping.PrecisionDataMapper;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolInterceptor;
import com.ui.rendering.GraphicalRenderingController;

class sK
implements OperationExecutionInterface {
    final PrecisionDataMapper V;

    sK(PrecisionDataMapper precisionDataMapper) {
        this.V = precisionDataMapper;
    }

    @Override
    public void R() {
        NetworkProtocolInterceptor networkProtocolInterceptor;
        fG fG2;
        block4: {
            fG2 = GraphicalRenderingController.D(fG.class);
            networkProtocolInterceptor = GraphicalRenderingController.D(NetworkProtocolInterceptor.class);
            try {
                try {
                    if (fG2 != null && networkProtocolInterceptor != null) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw sK.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw sK.a(customSystemException);
            }
        }
        fG2.N(true);
        networkProtocolInterceptor.N(false);
        fG2.A();
        NetworkProtocolInterceptor.Jl = true;
        GraphicalRenderingController.D(fG.class).P().p();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

