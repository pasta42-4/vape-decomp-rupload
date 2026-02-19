/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.app.concurrency.core.ConcurrentResourceManager;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.runtime.context.ContextualExecutionFramework;
import com.security.crypto.CryptographicSecurityProvider;
import com.system.configuration.ConfigurationCalibrator;

public class ConnectionLifecycleManager
extends ConcurrentResourceManager {
    private static AbstractComputationKernel[] t;

    public static void b(AbstractComputationKernel[] abstractComputationKernelArray) {
        t = abstractComputationKernelArray;
    }

    public ConnectionLifecycleManager() {
        super(true);
    }

    public boolean z(ContextualExecutionFramework contextualExecutionFramework) {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (!this.A() || !this.P(contextualExecutionFramework)) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConnectionLifecycleManager.b(customSystemException);
                        }
                        if (this.l()) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConnectionLifecycleManager.b(customSystemException);
                    }
                    bl = true;
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConnectionLifecycleManager.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean b(ContextualExecutionFramework contextualExecutionFramework) {
        return this.t(contextualExecutionFramework);
    }

    public boolean F(ContextualExecutionFramework contextualExecutionFramework) {
        boolean bl;
        block9: {
            block8: {
                bl = false;
                try {
                    try {
                        if (!this.A() || this.P(contextualExecutionFramework)) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConnectionLifecycleManager.b(customSystemException);
                    }
                    if (this.B(contextualExecutionFramework)) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConnectionLifecycleManager.b(customSystemException);
                }
                bl = true;
            }
            try {
                try {
                    if (!this.l() || this.c(contextualExecutionFramework)) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConnectionLifecycleManager.b(customSystemException);
                }
                if (!this.B(this.U)) break block9;
            }
            catch (CustomSystemException customSystemException) {
                throw ConnectionLifecycleManager.b(customSystemException);
            }
            bl = true;
        }
        return bl;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean O(ContextualExecutionFramework contextualExecutionFramework, boolean bl) {
        block10: {
            try {
                try {
                    try {
                        if (!bl || !this.A()) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConnectionLifecycleManager.b(customSystemException);
                    }
                    if (this.P(contextualExecutionFramework)) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConnectionLifecycleManager.b(customSystemException);
                }
                if (!ConfigurationCalibrator.b.P()) break block10;
            }
            catch (CustomSystemException customSystemException) {
                throw ConnectionLifecycleManager.b(customSystemException);
            }
            CryptographicSecurityProvider cryptographicSecurityProvider = (CryptographicSecurityProvider)ConfigurationCalibrator.b.N();
            try {
                try {
                    if (!this.B(contextualExecutionFramework) && !cryptographicSecurityProvider.G()) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConnectionLifecycleManager.b(customSystemException);
                }
                this.X();
                this.b(this.q);
            }
            catch (CustomSystemException customSystemException) {
                throw ConnectionLifecycleManager.b(customSystemException);
            }
        }
        return this.r(contextualExecutionFramework);
    }

    public boolean i() {
        return this.A();
    }

    public static AbstractComputationKernel[] f() {
        return t;
    }

    static {
        if (ConnectionLifecycleManager.f() != null) {
            ConnectionLifecycleManager.b(new AbstractComputationKernel[2]);
        }
    }

    public boolean d(ContextualExecutionFramework contextualExecutionFramework) {
        return this.O(contextualExecutionFramework, false);
    }
}

