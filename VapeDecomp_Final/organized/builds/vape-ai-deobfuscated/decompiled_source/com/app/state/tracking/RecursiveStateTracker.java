/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.app.state.tracking;

import a.Ok;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonObject;
import com.runtime.context.LightweightExecutionContext;
import com.serialization.generic.GenericSerializationAdapter;
import com.system.config.ConfigurationEnumerator;
import java.util.List;

public class RecursiveStateTracker
extends GenericSerializationAdapter<RecursiveStateTracker> {
    public RecursiveStateTracker() {
    }

    public RecursiveStateTracker f() {
        return new RecursiveStateTracker(this.u(), this.M());
    }

    @Override
    public boolean T(LightweightExecutionContext lightweightExecutionContext) {
        try {
            if (lightweightExecutionContext.Y()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RecursiveStateTracker.a(customSystemException);
        }
        String string = lightweightExecutionContext.g();
        return this.M().T(string, this.u());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public Ok A() {
        return Ok.DISPLAY_NAME;
    }

    public RecursiveStateTracker(List<String> list, ConfigurationEnumerator configurationEnumerator) {
        super(list, configurationEnumerator);
    }

    public RecursiveStateTracker(JsonObject jsonObject) {
        super(jsonObject);
    }
}

