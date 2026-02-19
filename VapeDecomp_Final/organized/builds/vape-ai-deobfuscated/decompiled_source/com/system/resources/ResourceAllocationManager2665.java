/*
 * Decompiled with CFR 0.152.
 */
package com.system.resources;

import com.crypto.descriptors.CryptoAlgorithmDescriptor;

class ResourceAllocationManager2665 {
    static final int[] p = new int[CryptoAlgorithmDescriptor.values().length];

    static {
        try {
            ResourceAllocationManager2665.p[CryptoAlgorithmDescriptor.PERCENTAGE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ResourceAllocationManager2665.p[CryptoAlgorithmDescriptor.VALUE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

