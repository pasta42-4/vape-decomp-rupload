/*
 * Decompiled with CFR 0.152.
 */
package com.data.streaming;

import a.yy;
import com.reflection.utils.ReflectionProxyHandler;

class StreamProtocolMapper
extends yy {
    final ReflectionProxyHandler zx;

    @Override
    public void S(Boolean bl) {
        super.S(bl);
        this.zx.Z(bl);
    }

    StreamProtocolMapper(ReflectionProxyHandler reflectionProxyHandler, String string, String string2, boolean bl) {
        this.zx = reflectionProxyHandler;
        super(string, string2, bl);
    }
}

