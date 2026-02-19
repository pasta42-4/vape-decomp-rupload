/*
 * Decompiled with CFR 0.152.
 */
package com.encryption.codec;

import a.Oa;
import com.system.resource.ResourceAccessManager;

public class CipherTextEncoder
extends Oa<CipherTextEncoder> {
    private static String n;

    public ResourceAccessManager o() {
        return new ResourceAccessManager(this);
    }

    static {
        if (CipherTextEncoder.k() == null) {
            CipherTextEncoder.L("cjjlWc");
        }
    }

    public static String k() {
        return n;
    }

    public static void L(String string) {
        n = string;
    }
}

