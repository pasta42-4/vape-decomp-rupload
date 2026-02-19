/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.app.state.processing;

import a.Ok;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonObject;
import com.runtime.context.LightweightExecutionContext;
import com.serialization.generic.GenericSerializationAdapter;
import com.system.config.ConfigurationEnumerator;
import java.util.List;

public class CascadingStateProcessor
extends GenericSerializationAdapter<CascadingStateProcessor> {
    public CascadingStateProcessor(JsonObject jsonObject) {
        super(jsonObject);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public boolean T(LightweightExecutionContext lightweightExecutionContext) {
        try {
            if (lightweightExecutionContext.Y()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CascadingStateProcessor.a(customSystemException);
        }
        List<String> list = lightweightExecutionContext.n();
        for (String string : list) {
            try {
                if (!this.M().T(string, this.u())) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw CascadingStateProcessor.a(customSystemException);
            }
        }
        return false;
    }

    public CascadingStateProcessor(List<String> list, ConfigurationEnumerator configurationEnumerator) {
        super(list, configurationEnumerator);
    }

    public CascadingStateProcessor() {
    }

    public CascadingStateProcessor u() {
        return new CascadingStateProcessor(this.u(), this.M());
    }

    @Override
    public Ok A() {
        return Ok.LORE;
    }
}

