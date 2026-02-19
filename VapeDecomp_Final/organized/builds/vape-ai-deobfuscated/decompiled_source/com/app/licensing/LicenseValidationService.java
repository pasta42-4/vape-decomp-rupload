/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 */
package com.app.licensing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LicenseValidationService {
    @Expose
    @SerializedName(value="hasLicense")
    private boolean g;
    @Expose
    @SerializedName(value="username")
    private String j;
    @Expose
    @SerializedName(value="licenseType")
    private String Y;
    @Expose
    @SerializedName(value="expires")
    private String W;

    public final String y() {
        return this.j;
    }

    public final String t() {
        return this.W;
    }

    public final String m() {
        return this.Y;
    }

    public final boolean X() {
        return this.g;
    }
}

