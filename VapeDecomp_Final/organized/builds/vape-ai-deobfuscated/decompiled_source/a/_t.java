/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.app.core.interfaces.OperationExecutionInterface;
import com.configuration.advanced.AdvancedConfigurationResolver;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolInterceptor;
import com.reflection.metadata.ReflectionMetadataExtractor1376;
import com.security.cryptography.CryptographicResourceManager;
import com.security.cryptography.SecurityCipherManager;
import com.ui.rendering.GraphicalRenderingController;

class _t
implements OperationExecutionInterface {
    final SecurityCipherManager S;
    final AdvancedConfigurationResolver M;

    _t(AdvancedConfigurationResolver advancedConfigurationResolver, SecurityCipherManager securityCipherManager) {
        this.M = advancedConfigurationResolver;
        this.S = securityCipherManager;
    }

    @Override
    public void R() {
        boolean bl;
        ReflectionMetadataExtractor1376 reflectionMetadataExtractor1376;
        ReflectionMetadataExtractor1376 reflectionMetadataExtractor13762 = this.S.k();
        try {
            reflectionMetadataExtractor1376 = reflectionMetadataExtractor13762;
            bl = !reflectionMetadataExtractor13762.g();
        }
        catch (CustomSystemException customSystemException) {
            throw _t.a(customSystemException);
        }
        try {
            reflectionMetadataExtractor1376.p(bl);
            if (GraphicalRenderingController.D(NetworkProtocolInterceptor.class).j() == CryptographicResourceManager.R) {
                GraphicalRenderingController.D(NetworkProtocolInterceptor.class).R().O();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _t.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

