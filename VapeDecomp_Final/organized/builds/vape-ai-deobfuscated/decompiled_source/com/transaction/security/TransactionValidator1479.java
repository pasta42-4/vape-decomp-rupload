/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.security;

import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.reflection.registry.DynamicMethodRegistrar;
import com.temporal.metadata.TemporalMetadataResolver;
import com.util.comparison.GenericIdentityComparator;
import java.util.HashMap;

public class TransactionValidator1479 {
    private static boolean d;
    static HashMap<GenericIdentityComparator, DynamicMethodRegistrar> q;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void n(String string, float f, float f2, int n) {
        try {
            GenericIdentityComparator genericIdentityComparator = new GenericIdentityComparator(string, n);
            TransactionValidator1479.d(string, n);
            int n2 = ApplicationLifecycleManager.X().L(string);
            int n3 = ApplicationLifecycleManager.X().B(string);
            q.get(genericIdentityComparator).B(f, f2, n2, n3);
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    public static void K(boolean bl) {
        d = bl;
    }

    static {
        q = new HashMap();
        TransactionValidator1479.K(true);
    }

    private static void y(GenericIdentityComparator genericIdentityComparator) {
        DynamicMethodRegistrar dynamicMethodRegistrar = new DynamicMethodRegistrar();
        dynamicMethodRegistrar.U(genericIdentityComparator.S, genericIdentityComparator.S());
        q.put(genericIdentityComparator, dynamicMethodRegistrar);
    }

    public static boolean V() {
        boolean bl = TransactionValidator1479.w();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionValidator1479.a(customSystemException);
        }
        return false;
    }

    public static boolean w() {
        return d;
    }

    public static void d(String string, int n) {
        GenericIdentityComparator genericIdentityComparator = new GenericIdentityComparator(string, n);
        try {
            if (!q.containsKey(genericIdentityComparator)) {
                TransactionValidator1479.y(genericIdentityComparator);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionValidator1479.a(customSystemException);
        }
    }
}

