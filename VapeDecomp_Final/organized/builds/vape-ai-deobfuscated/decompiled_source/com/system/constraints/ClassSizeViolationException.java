/*
 * Decompiled with CFR 0.152.
 */
package com.system.constraints;

public final class ClassSizeViolationException
extends IndexOutOfBoundsException {
    private final String s;
    private final int F;
    private static final long serialVersionUID = 160715609518896765L;

    public ClassSizeViolationException(String string, int n) {
        super("Class too large: " + string);
        this.s = string;
        this.F = n;
    }
}

