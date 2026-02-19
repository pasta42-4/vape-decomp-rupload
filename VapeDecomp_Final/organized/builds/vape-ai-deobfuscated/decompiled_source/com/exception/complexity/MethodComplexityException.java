/*
 * Decompiled with CFR 0.152.
 */
package com.exception.complexity;

public final class MethodComplexityException
extends IndexOutOfBoundsException {
    private final String o;
    private static final long serialVersionUID = 6807380416709738314L;
    private final int k;
    private final String N;
    private final String C;

    public MethodComplexityException(String string, String string2, String string3, int n) {
        super("Method too large: " + string + "." + string2 + " " + string3);
        this.N = string;
        this.C = string2;
        this.o = string3;
        this.k = n;
    }
}

