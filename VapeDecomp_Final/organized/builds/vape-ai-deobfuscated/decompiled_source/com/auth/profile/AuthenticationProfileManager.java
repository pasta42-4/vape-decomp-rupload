/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 */
package com.auth.profile;

import com.app.core.lifecycle.LifecycleController;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.security.authentication.LegacyCredentialValidator;
import java.util.List;

public class AuthenticationProfileManager
implements LifecycleController {
    @Expose
    @SerializedName(value="errorMessage")
    private String Z;
    @Expose
    @SerializedName(value="availableProfiles")
    private List<LegacyCredentialValidator> u;
    @Expose
    @SerializedName(value="selectedProfile")
    private LegacyCredentialValidator L;
    @Expose
    @SerializedName(value="clientToken")
    private String T;
    @Expose
    @SerializedName(value="accessToken")
    private String D;
    private static String S;

    static {
        if (AuthenticationProfileManager.J() == null) {
            AuthenticationProfileManager.t("AVfkbb");
        }
    }

    public String O() {
        return this.T;
    }

    public String l() {
        return this.Z;
    }

    public String B() {
        return this.D;
    }

    public static void t(String string) {
        S = string;
    }

    public void u() {
        this.Z = null;
    }

    public static String J() {
        return S;
    }

    public LegacyCredentialValidator e() {
        return this.L;
    }

    public List<LegacyCredentialValidator> W() {
        return this.u;
    }
}

