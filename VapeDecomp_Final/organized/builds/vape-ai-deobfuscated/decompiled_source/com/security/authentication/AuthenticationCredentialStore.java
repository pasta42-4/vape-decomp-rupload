/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 */
package com.security.authentication;

import com.app.core.streaming.StreamProcessingProtocol;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.version.management.VersionMetadataExtractor;

public class AuthenticationCredentialStore
implements StreamProcessingProtocol {
    @Expose
    @SerializedName(value="username")
    private final String S;
    @Expose
    @SerializedName(value="agent")
    private final VersionMetadataExtractor a;
    @Expose
    @SerializedName(value="password")
    private final String w;
    @Expose(serialize=false, deserialize=false)
    @SerializedName(value="clientToken")
    private final String D;

    public AuthenticationCredentialStore(String string, String string2, VersionMetadataExtractor versionMetadataExtractor) {
        this(string, string2, "", versionMetadataExtractor);
    }

    public AuthenticationCredentialStore(String string, String string2) {
        this(string, string2, "", new VersionMetadataExtractor());
    }

    public AuthenticationCredentialStore(String string, String string2, String string3, VersionMetadataExtractor versionMetadataExtractor) {
        this.a = versionMetadataExtractor;
        this.S = string;
        this.w = string2;
        this.D = string3;
    }

    public AuthenticationCredentialStore(String string, String string2, String string3) {
        this(string, string2, string3, new VersionMetadataExtractor());
    }
}

