/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.financial.validation;

import com.configuration.management.ConfigurationParameterController;
import com.security.cipher.CipherConfigurationEnum;
import org.jetbrains.annotations.Nullable;

public class TransactionValidator2345
extends ConfigurationParameterController {
    private CipherConfigurationEnum f;

    public CipherConfigurationEnum P() {
        return this.f;
    }

    public TransactionValidator2345(String string, String string2, @Nullable String string3, CipherConfigurationEnum cipherConfigurationEnum) {
        super(string, string2, string3);
        this.f = cipherConfigurationEnum;
    }

    public TransactionValidator2345(ConfigurationParameterController configurationParameterController, CipherConfigurationEnum cipherConfigurationEnum) {
        this(configurationParameterController.Z(), configurationParameterController.o(), configurationParameterController.r(), cipherConfigurationEnum);
    }
}

