/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.system.initialization;

import com.app.transformation.DataTransformationStrategy;
import com.exception.system.CustomSystemException;
import com.google.gson.annotations.SerializedName;

public class InitializationManager
implements DataTransformationStrategy {
    private static String[] Z;
    @SerializedName(value="cache")
    private Boolean g;
    @SerializedName(value="firstRun")
    private Boolean S;

    public static String[] f() {
        return Z;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public Boolean h() {
        return this.g;
    }

    public Boolean B() {
        return this.S;
    }

    @Override
    public void S() {
        try {
            if (this.S == null) {
                this.S = true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw InitializationManager.a(customSystemException);
        }
        try {
            if (this.g == null) {
                this.g = false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw InitializationManager.a(customSystemException);
        }
    }

    public void Q(Boolean bl) {
        this.S = bl;
    }

    public static void k(String[] stringArray) {
        Z = stringArray;
    }

    public void O(Boolean bl) {
        this.g = bl;
    }

    static {
        if (InitializationManager.f() != null) {
            InitializationManager.k(new String[5]);
        }
    }
}

