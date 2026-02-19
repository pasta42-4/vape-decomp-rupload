/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 */
package a;

import a.H4;
import a.Kg;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class sh
implements Kg {
    @Expose
    @SerializedName(value="username")
    private final String S;
    @Expose
    @SerializedName(value="agent")
    private final H4 a;
    @Expose
    @SerializedName(value="password")
    private final String w;
    @Expose(serialize=false, deserialize=false)
    @SerializedName(value="clientToken")
    private final String D;

    public sh(String string, String string2, H4 h42) {
        this(string, string2, "", h42);
    }

    public sh(String string, String string2) {
        this(string, string2, "", new H4());
    }

    public sh(String string, String string2, String string3, H4 h42) {
        this.a = h42;
        this.S = string;
        this.w = string2;
        this.D = string3;
    }

    public sh(String string, String string2, String string3) {
        this(string, string2, string3, new H4());
    }
}

