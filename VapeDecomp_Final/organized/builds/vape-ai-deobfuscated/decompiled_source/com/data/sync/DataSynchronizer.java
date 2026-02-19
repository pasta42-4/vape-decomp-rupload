/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.data.sync;

import a.Ok;
import com.google.gson.JsonObject;
import com.messaging.async.AsyncMessageBroker;
import com.runtime.context.LightweightExecutionContext;

public class DataSynchronizer
implements AsyncMessageBroker<DataSynchronizer> {
    @Override
    public Ok A() {
        return null;
    }

    @Override
    public JsonObject a() {
        return null;
    }

    public DataSynchronizer y() {
        return new DataSynchronizer();
    }

    @Override
    public boolean T(LightweightExecutionContext lightweightExecutionContext) {
        return false;
    }
}

