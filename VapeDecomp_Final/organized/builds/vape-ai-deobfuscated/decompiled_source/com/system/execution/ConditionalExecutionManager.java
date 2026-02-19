/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.system.execution;

import a.Qh;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.network.protocol.MultiProtocolContextManager;
import com.security.authentication.AuthenticationStateManager675;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.transaction.management.TransactionOrchestrator1017;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public class ConditionalExecutionManager {
    private static final HashMap<Integer, AuthenticationStateManager675> A;
    private static final boolean R = false;
    private static final Object x;
    private static final Map<Integer, MultiProtocolContextManager> l;
    private static final HashMap<Integer, AuthenticationStateManager675> k;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void C(MultiProtocolContextManager multiProtocolContextManager) {
        Object object = x;
        synchronized (object) {
            l.put(multiProtocolContextManager.w(), multiProtocolContextManager);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Collection<MultiProtocolContextManager> y() {
        Object object = x;
        synchronized (object) {
            return l.values();
        }
    }

    public static void t() {
        k.clear();
        A.clear();
    }

    public static AuthenticationStateManager675 m(Qh qh) {
        try {
            if (k.containsKey(qh.X())) {
                return k.get(qh.X());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConditionalExecutionManager.a(customSystemException);
        }
        AuthenticationStateManager675 authenticationStateManager675 = qh.G();
        k.put(qh.X(), authenticationStateManager675);
        return authenticationStateManager675;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void c() {
        try {
            if (l.isEmpty()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConditionalExecutionManager.a(customSystemException);
        }
        Object object = x;
        synchronized (object) {
            l.clear();
        }
    }

    @Nullable
    public static MultiProtocolContextManager k(TransactionOrchestrator1017 transactionOrchestrator1017) {
        return ConditionalExecutionManager.l(transactionOrchestrator1017.X());
    }

    public static String o(CryptographicTransformer cryptographicTransformer) {
        return cryptographicTransformer.G().i();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    public static MultiProtocolContextManager l(int n) {
        Object object = x;
        synchronized (object) {
            return l.get(n);
        }
    }

    public static MultiProtocolContextManager Q(TransactionOrchestrator1017 transactionOrchestrator1017) {
        return ConditionalExecutionManager.a(transactionOrchestrator1017, ApplicationLifecycleManager.U());
    }

    public static AuthenticationStateManager675 i(Qh qh) {
        try {
            if (A.containsKey(qh.X())) {
                return A.get(qh.X());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConditionalExecutionManager.a(customSystemException);
        }
        return null;
    }

    static {
        x = new Object();
        l = new LinkedHashMap<Integer, MultiProtocolContextManager>();
        k = new HashMap();
        A = new HashMap();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void U(Qh qh, AuthenticationStateManager675 authenticationStateManager675) {
        A.put(qh.X(), authenticationStateManager675);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static MultiProtocolContextManager a(TransactionOrchestrator1017 transactionOrchestrator1017, SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        Object object = x;
        synchronized (object) {
            return l.computeIfAbsent(transactionOrchestrator1017.X(), arg_0 -> ConditionalExecutionManager.lambda$getEntityDataOrCreate$0(transactionOrchestrator1017, systemConfigurationOrchestrator, arg_0));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void n(int ... nArray) {
        Object object = x;
        synchronized (object) {
            for (int n : nArray) {
                l.remove(n);
            }
        }
    }

    private static MultiProtocolContextManager lambda$getEntityDataOrCreate$0(TransactionOrchestrator1017 transactionOrchestrator1017, SystemConfigurationOrchestrator systemConfigurationOrchestrator, Integer n) {
        MultiProtocolContextManager multiProtocolContextManager = new MultiProtocolContextManager(n, transactionOrchestrator1017, systemConfigurationOrchestrator);
        multiProtocolContextManager.v(transactionOrchestrator1017, systemConfigurationOrchestrator);
        return multiProtocolContextManager;
    }
}

