/*
 * Decompiled with CFR 0.152.
 */
package com.app.messaging.context;

import a.Rr;

public class MessageContextBuilder {
    public String c;
    public String F;
    public int X;

    public MessageContextBuilder(String string, int n, String string2) {
        this.c = string;
        this.X = n;
        this.F = string2;
    }

    public void E(Rr rr) {
        rr.w(this.c, this.X, this.F);
    }
}

