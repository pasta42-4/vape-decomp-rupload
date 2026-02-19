/*
 * Decompiled with CFR 0.152.
 */
package com.session.management;

import a.N9;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.system.config.AdaptiveConfigurationManager;

public class MultiProtocolSessionManager {
    public int d;
    public final N9 o;
    public final AdaptiveConfigurationManager N;
    public final boolean L;
    public ContextualEventDispatcher Q;
    private N9 w;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public MultiProtocolSessionManager(N9 n9, AdaptiveConfigurationManager adaptiveConfigurationManager, boolean bl) {
        this.o = n9;
        this.N = adaptiveConfigurationManager;
        this.L = bl;
    }

    public N9 h() {
        block6: {
            N9 n9;
            block8: {
                block7: {
                    try {
                        try {
                            try {
                                if (this.w != null) break block6;
                                MultiProtocolSessionManager multiProtocolSessionManager = this;
                                if (!this.L) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw MultiProtocolSessionManager.a(customSystemException);
                            }
                            if (this.N == null) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MultiProtocolSessionManager.a(customSystemException);
                        }
                        n9 = this.o.m(this.N);
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MultiProtocolSessionManager.a(customSystemException);
                    }
                }
                n9 = this.o;
            }
            multiProtocolSessionManager.w = n9;
        }
        return this.w;
    }

    public MultiProtocolSessionManager(N9 n9, AdaptiveConfigurationManager adaptiveConfigurationManager) {
        this(n9, adaptiveConfigurationManager, true);
    }
}

