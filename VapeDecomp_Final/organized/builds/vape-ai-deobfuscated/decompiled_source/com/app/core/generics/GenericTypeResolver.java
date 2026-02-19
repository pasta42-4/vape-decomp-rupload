/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.app.core.generics;

import com.configuration.resolver.ConfigurationProfileResolver;
import com.data.serialization.JsonPayloadOrchestrator;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonObject;
import java.util.Arrays;
import java.util.Objects;

public class GenericTypeResolver<T extends ConfigurationProfileResolver<R, ?>, R> {
    private final JsonPayloadOrchestrator u;
    private R m;
    private final T f;

    public JsonPayloadOrchestrator G() {
        return this.u;
    }

    public T n() {
        return this.f;
    }

    public JsonObject L() {
        Object k = ((ConfigurationProfileResolver)this.f).S();
        ((ConfigurationProfileResolver)this.f).H(this.T());
        JsonObject jsonObject = ((ConfigurationProfileResolver)this.f).k(false);
        ((ConfigurationProfileResolver)this.f).H(k);
        return jsonObject;
    }

    public R T() {
        return this.m;
    }

    public boolean H() {
        return this.p();
    }

    public boolean p() {
        Object k = ((ConfigurationProfileResolver)this.f).u();
        try {
            if (k instanceof Object[]) {
                return Arrays.equals((Object[])k, (Object[])this.m);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericTypeResolver.a(customSystemException);
        }
        try {
            if (k instanceof double[]) {
                return Arrays.equals((double[])k, (double[])this.m);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericTypeResolver.a(customSystemException);
        }
        return Objects.equals(k, this.m);
    }

    public GenericTypeResolver(JsonPayloadOrchestrator jsonPayloadOrchestrator, T t) {
        this.u = jsonPayloadOrchestrator;
        this.f = t;
        this.m = ((ConfigurationProfileResolver)t).u();
    }

    public void u(JsonObject jsonObject) {
        ((ConfigurationProfileResolver)this.f).F(true);
        Object k = ((ConfigurationProfileResolver)this.f).S();
        try {
            ((ConfigurationProfileResolver)this.f).W();
            if (((ConfigurationProfileResolver)this.f).C(jsonObject)) {
                this.m = ((ConfigurationProfileResolver)this.f).S();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericTypeResolver.a(customSystemException);
        }
        ((ConfigurationProfileResolver)this.f).H(k);
        ((ConfigurationProfileResolver)this.f).F(false);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void v(Object object) {
        try {
            if (object instanceof Object[]) {
                this.m = Arrays.copyOf((Object[])object, ((Object[])object).length);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericTypeResolver.a(customSystemException);
        }
        this.m = object;
    }
}

