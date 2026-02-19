/*
 * Decompiled with CFR 0.152.
 */
package com.vape.security;

public class VapeSessionValidator {
    public final String z;
    public final Class<?> s;
    private final Boolean Z;
    public final Class<?>[] I;

    public Boolean L() {
        return this.Z;
    }

    public VapeSessionValidator(String string, Boolean bl, Class<?> clazz, Class<?> ... classArray) {
        this.z = string;
        this.s = clazz;
        this.I = classArray;
        this.Z = bl;
    }
}

