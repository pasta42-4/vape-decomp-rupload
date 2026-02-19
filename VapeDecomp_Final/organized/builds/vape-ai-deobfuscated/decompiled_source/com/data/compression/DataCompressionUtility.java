/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.data.compression;

import com.configuration.resolver.ConfigurationProfileResolver;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonObject;
import com.runtime.context.ContextualExecutionFramework;

public class DataCompressionUtility
extends ContextualExecutionFramework {
    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public DataCompressionUtility(String string) {
        super(string);
    }

    public void l(JsonObject jsonObject) {
        for (ConfigurationProfileResolver<?, ?> configurationProfileResolver : this.F()) {
            try {
                if (!configurationProfileResolver.g(jsonObject)) continue;
                configurationProfileResolver.C(jsonObject);
            }
            catch (CustomSystemException customSystemException) {
                throw DataCompressionUtility.b(customSystemException);
            }
        }
    }
}

