/*
 * Decompiled with CFR 0.152.
 */
package com.metadata.registry;

import com.exception.system.CustomSystemException;
import java.util.HashMap;

public final class DynamicMetadataRegistry
extends HashMap<String, Integer> {
    private static final long serialVersionUID = 1L;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int K(String string) {
        int n;
        try {
            n = this.containsKey(string) ? (Integer)this.get(string) : -1;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicMetadataRegistry.a(customSystemException);
        }
        return n;
    }

    public void U(String string, int n) {
        this.put(string, n);
    }
}

