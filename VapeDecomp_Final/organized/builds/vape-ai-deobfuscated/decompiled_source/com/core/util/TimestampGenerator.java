/*
 * Decompiled with CFR 0.152.
 */
package com.core.util;

import com.exception.system.CustomSystemException;
import java.util.HashMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TimestampGenerator<T> {
    private final long L;
    private final HashMap<T, Long> u = new HashMap();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean w(T t) {
        this.B();
        return this.u.containsKey(t);
    }

    public int s() {
        this.B();
        return this.u.size();
    }

    public TimestampGenerator(long l) {
        this.L = l;
    }

    private void B() {
        long l = System.currentTimeMillis();
        this.u.entrySet().removeIf(arg_0 -> this.lambda$cleanUp$0(l, arg_0));
    }

    public void A() {
        this.u.clear();
    }

    public void w(T t) {
        this.B();
        this.u.put(t, System.currentTimeMillis());
    }

    private boolean lambda$cleanUp$0(long l, Map.Entry entry) {
        boolean bl;
        try {
            bl = l - (Long)entry.getValue() > this.L;
        }
        catch (CustomSystemException customSystemException) {
            throw TimestampGenerator.a(customSystemException);
        }
        return bl;
    }

    public void G(T t) {
        this.B();
        this.u.remove(t);
    }
}

