/*
 * Decompiled with CFR 0.152.
 */
package com.system.scheduling;

import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import java.util.HashMap;
import java.util.Map;

public abstract class TimelineSequencer {
    private int f;
    private static AbstractComputationKernel[] q;
    private Map<Class, Class> I = new HashMap<Class, Class>();

    public static AbstractComputationKernel[] o() {
        return q;
    }

    static {
        if (TimelineSequencer.o() == null) {
            TimelineSequencer.p(new AbstractComputationKernel[2]);
        }
    }

    public static void p(AbstractComputationKernel[] abstractComputationKernelArray) {
        q = abstractComputationKernelArray;
    }

    protected abstract void Y();

    public <T extends CryptoProtocolEngine, O extends T> void i(Class<T> clazz, Class<O> clazz2) {
        this.I.put(clazz, clazz2);
    }

    public TimelineSequencer(int n) {
        this.f = n;
    }

    public Class A(Class clazz) {
        return this.I.get(clazz);
    }
}

