/*
 * Decompiled with CFR 0.152.
 */
package com.security.validation;

import com.app.core.interfaces.OperationExecutionInterface;
import com.configuration.advanced.AdvancedConfigurationResolver;
import com.exception.system.CustomSystemException;
import com.security.cryptography.SecurityCipherManager;

class SignatureValidator
implements OperationExecutionInterface {
    final AdvancedConfigurationResolver G;
    final SecurityCipherManager r;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void R() {
        block7: {
            try {
                try {
                    if (this.r.q() != 3 && this.r.q() != 4) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw SignatureValidator.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw SignatureValidator.a(customSystemException);
            }
        }
        try {
            if (this.r.f()) {
                this.r.O(3);
                this.r.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SignatureValidator.a(customSystemException);
        }
    }

    SignatureValidator(AdvancedConfigurationResolver advancedConfigurationResolver, SecurityCipherManager securityCipherManager) {
        this.G = advancedConfigurationResolver;
        this.r = securityCipherManager;
    }
}

