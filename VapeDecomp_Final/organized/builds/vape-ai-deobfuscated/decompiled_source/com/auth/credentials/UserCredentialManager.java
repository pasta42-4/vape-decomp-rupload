/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 */
package com.auth.credentials;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class UserCredentialManager {
    @Expose
    @SerializedName(value="username")
    private String B;
    @Expose
    @SerializedName(value="limit")
    private boolean E;
    @Expose
    @SerializedName(value="token")
    private String c;
    @Expose
    @SerializedName(value="skin")
    private String z;
    @Expose
    @SerializedName(value="info")
    private List<String> T;
    @Expose
    @SerializedName(value="password")
    private String k;

    public List<String> o() {
        return this.T;
    }

    public String C() {
        return this.k;
    }

    public String o() {
        return this.z;
    }

    public boolean p() {
        return this.E;
    }

    public String i() {
        return this.B;
    }

    public String Q() {
        return this.c;
    }
}

