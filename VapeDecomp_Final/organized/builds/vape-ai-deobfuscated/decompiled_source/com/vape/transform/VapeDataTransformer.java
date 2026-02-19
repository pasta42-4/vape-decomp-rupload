/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package com.vape.transform;

import com.data.reconstruction.DataReconstructionEngine;
import com.google.common.base.Predicate;
import com.security.transform.CryptographicTransformer;
import com.system.lifecycle.ObjectLifecycleTracker;

public class VapeDataTransformer
extends ObjectLifecycleTracker {
    public static java.util.function.Predicate I(CryptographicTransformer cryptographicTransformer) {
        return (java.util.function.Predicate)DataReconstructionEngine.R(VapeDataTransformer.U.u().kk, cryptographicTransformer.M());
    }

    public VapeDataTransformer(Object object) {
        super(object);
    }

    public static Predicate Q(CryptographicTransformer cryptographicTransformer) {
        return (Predicate)DataReconstructionEngine.R(VapeDataTransformer.U.u().kk, cryptographicTransformer.M());
    }
}

