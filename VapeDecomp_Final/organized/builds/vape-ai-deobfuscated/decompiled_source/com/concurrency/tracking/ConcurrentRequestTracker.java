/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.tracking;

import com.exception.system.CustomSystemException;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentRequestTracker {
    private static String[] N;
    private final AtomicInteger l = new AtomicInteger(0);

    public void F() {
        this.l.decrementAndGet();
    }

    public void z() {
        this.l.incrementAndGet();
    }

    public static String[] x() {
        return N;
    }

    static {
        if (ConcurrentRequestTracker.x() != null) {
            ConcurrentRequestTracker.p(new String[2]);
        }
    }

    public static void p(String[] stringArray) {
        N = stringArray;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean G() {
        boolean bl;
        try {
            bl = this.l.get() > 0;
        }
        catch (CustomSystemException customSystemException) {
            throw ConcurrentRequestTracker.a(customSystemException);
        }
        return bl;
    }
}

