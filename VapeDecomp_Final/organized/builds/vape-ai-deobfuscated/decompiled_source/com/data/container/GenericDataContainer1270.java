/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.data.container;

import a.Ok;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonObject;
import com.runtime.context.LightweightExecutionContext;
import com.serialization.generic.GenericSerializationAdapter;
import com.system.config.ConfigurationEnumerator;
import java.util.List;

public class GenericDataContainer1270
extends GenericSerializationAdapter<GenericDataContainer1270> {
    public GenericDataContainer1270 B() {
        return new GenericDataContainer1270(this.u(), this.M());
    }

    public GenericDataContainer1270(List<String> list, ConfigurationEnumerator configurationEnumerator) {
        super(list, configurationEnumerator);
    }

    @Override
    public Ok A() {
        return Ok.ITEM_NAME;
    }

    public GenericDataContainer1270() {
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public GenericDataContainer1270(JsonObject jsonObject) {
        super(jsonObject);
    }

    @Override
    public boolean T(LightweightExecutionContext lightweightExecutionContext) {
        block4: {
            try {
                try {
                    if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw GenericDataContainer1270.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw GenericDataContainer1270.a(customSystemException);
            }
        }
        return this.M().T(lightweightExecutionContext.C().m(lightweightExecutionContext), this.u());
    }
}

