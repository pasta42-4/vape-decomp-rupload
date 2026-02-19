/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.c4;

public class a7
extends Exception {
    private static final long serialVersionUID = 1L;

    public a7(c4 c42, Throwable throwable) {
        super(c42.toString() + " in " + c42.v().j() + ": " + throwable.getMessage(), throwable);
    }

    public a7(String string) {
        super(string);
    }

    public a7(String string, Throwable throwable) {
        super(string, throwable);
    }

    public a7(int n2) {
        super("bytecode " + n2);
    }
}

