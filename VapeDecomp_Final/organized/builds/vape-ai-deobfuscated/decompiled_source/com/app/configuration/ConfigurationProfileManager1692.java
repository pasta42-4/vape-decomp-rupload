/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.app.configuration;

import a._8;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonObject;
import com.security.access.SecurityAccessController1588;
import com.user.identity.UserIdentityManager;

public class ConfigurationProfileManager1692
extends SecurityAccessController1588 {
    private final UserIdentityManager g;

    @Override
    public String n() {
        try {
            if (this.g.W()) {
                return this.g.X();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationProfileManager1692.a(customSystemException);
        }
        return "";
    }

    public ConfigurationProfileManager1692(UserIdentityManager userIdentityManager) {
        this.g = userIdentityManager;
    }

    @Override
    public JsonObject l() {
        return null;
    }

    public UserIdentityManager p() {
        return this.g;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public _8 p(JsonObject jsonObject) {
        return null;
    }

    @Override
    public boolean R() {
        return false;
    }
}

