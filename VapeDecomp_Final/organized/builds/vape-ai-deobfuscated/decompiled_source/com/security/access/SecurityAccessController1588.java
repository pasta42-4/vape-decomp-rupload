/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.security.access;

import a._8;
import com.core.computation.AbstractComputationKernel;
import com.google.gson.JsonObject;
import com.security.crypto.CryptographicKeyManager2078;
import com.security.crypto.EncryptionSchemeDefinition;
import com.temporal.metadata.TemporalMetadataResolver;

public abstract class SecurityAccessController1588
extends CryptographicKeyManager2078 {
    private static AbstractComputationKernel[] j;
    private boolean o = true;

    public static void F(AbstractComputationKernel[] abstractComputationKernelArray) {
        j = abstractComputationKernelArray;
    }

    public abstract JsonObject l();

    public void U(boolean bl) {
        this.o = bl;
        TemporalMetadataResolver.h.j().r();
    }

    public static AbstractComputationKernel[] u() {
        return j;
    }

    public String x() {
        return this.n();
    }

    public abstract String n();

    public String H() {
        return this.x();
    }

    static {
        if (SecurityAccessController1588.u() == null) {
            SecurityAccessController1588.F(new AbstractComputationKernel[3]);
        }
    }

    public abstract _8 p(JsonObject var1);

    public boolean R() {
        return true;
    }

    public SecurityAccessController1588() {
        super(EncryptionSchemeDefinition.FRIEND);
    }

    public boolean F() {
        return this.o;
    }
}

