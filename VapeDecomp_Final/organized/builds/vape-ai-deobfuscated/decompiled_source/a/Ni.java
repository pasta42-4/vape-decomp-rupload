/*
 * Decompiled with CFR 0.152.
 */
package a;

import a._Y;
import com.data.mapping.DataMappingOrchestrator;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.security.auth.AuthenticationGateway;
import com.security.event.SecureEventOrchestrator;
import com.system.config.AdaptiveConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;

class Ni
extends AuthenticationGateway {
    final DataMappingOrchestrator t;
    final AdaptiveConfigurationManager I;

    Ni(DataMappingOrchestrator dataMappingOrchestrator, ContextualEventDispatcher contextualEventDispatcher, AdaptiveConfigurationManager adaptiveConfigurationManager) {
        this.t = dataMappingOrchestrator;
        this.I = adaptiveConfigurationManager;
        super(contextualEventDispatcher);
    }

    @Override
    public void H(SystemConfigurationOrchestrator systemConfigurationOrchestrator, SecureEventOrchestrator secureEventOrchestrator) {
        block10: {
            try {
                if (secureEventOrchestrator.r()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw Ni.d(customSystemException);
            }
            try {
                if (DataMappingOrchestrator.A(this.t) == null) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw Ni.d(customSystemException);
            }
            boolean bl = DataMappingOrchestrator.j(this.t, DataMappingOrchestrator.A(this.t)).u().s();
            try {
                try {
                    this.l();
                    this.x();
                    if (!_Y.u(this.I, DataMappingOrchestrator.w(this.t)) || bl) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw Ni.d(customSystemException);
                }
                this.q();
            }
            catch (CustomSystemException customSystemException) {
                throw Ni.d(customSystemException);
            }
        }
    }

    private static CustomSystemException d(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

