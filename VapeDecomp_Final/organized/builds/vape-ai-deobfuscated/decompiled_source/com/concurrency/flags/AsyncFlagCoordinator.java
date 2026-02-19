/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.flags;

import com.app.compression.DataCompressionUtility2690;
import com.app.state.management.BooleanStateContainer2274;
import com.exception.system.CustomSystemException;
import com.flag.management.BooleanFlagManager;
import com.state.management.BooleanStateContainer;
import java.util.HashMap;

public class AsyncFlagCoordinator {
    public static DataCompressionUtility2690<Boolean> W;
    public static DataCompressionUtility2690<Boolean> Q;
    private static String u;
    private HashMap<DataCompressionUtility2690<Object>, Object> J = new HashMap();
    public static DataCompressionUtility2690<Boolean> q;

    static {
        q = new BooleanStateContainer2274();
        AsyncFlagCoordinator.j(null);
        Q = new BooleanStateContainer();
        W = new BooleanFlagManager();
    }

    public static String n() {
        return u;
    }

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public <T> void U(DataCompressionUtility2690<T> dataCompressionUtility2690, T t) {
        this.J.put(dataCompressionUtility2690, t);
    }

    public static void j(String string) {
        u = string;
    }

    public <T> T E(DataCompressionUtility2690<T> dataCompressionUtility2690) {
        try {
            if (!this.J.containsKey(dataCompressionUtility2690)) {
                return dataCompressionUtility2690.F();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsyncFlagCoordinator.c(customSystemException);
        }
        return (T)this.J.get(dataCompressionUtility2690);
    }
}

