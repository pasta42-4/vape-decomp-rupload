/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.core;

import a._8;
import com.app.configuration.ConfigurationProfileManager1692;
import com.app.core.interfaces.OperationExecutionInterface;
import com.app.crypto.processing.CipherTextProcessor;
import com.data.transformation.DataTransformationCoordinator527;
import com.exception.system.CustomSystemException;
import com.security.access.SecurityAccessController1588;
import com.temporal.metadata.TemporalMetadataResolver;

class MessageRouter
implements OperationExecutionInterface {
    final SecurityAccessController1588 Z;
    final DataTransformationCoordinator527 A;

    MessageRouter(DataTransformationCoordinator527 dataTransformationCoordinator527, SecurityAccessController1588 securityAccessController1588) {
        this.A = dataTransformationCoordinator527;
        this.Z = securityAccessController1588;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void R() {
        block4: {
            block3: {
                try {
                    if (!(this.Z instanceof _8)) break block3;
                    TemporalMetadataResolver.h.j().y((_8)this.Z);
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw MessageRouter.a(customSystemException);
                }
            }
            if (this.Z instanceof ConfigurationProfileManager1692) {
                ConfigurationProfileManager1692 configurationProfileManager1692 = (ConfigurationProfileManager1692)this.Z;
                configurationProfileManager1692.p().f(false);
            }
        }
        CipherTextProcessor.v();
    }
}

