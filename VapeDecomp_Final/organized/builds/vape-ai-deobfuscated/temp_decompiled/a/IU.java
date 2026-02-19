/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 */
package a;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class iu {
    @Expose
    @SerializedName(value="legacy")
    private boolean g;
    @Expose
    @SerializedName(value="id")
    private String M;
    @Expose
    @SerializedName(value="name")
    private String T;

    public boolean q() {
        return this.g;
    }

    public String b() {
        return this.T;
    }

    public String g() {
        return this.M;
    }
}

