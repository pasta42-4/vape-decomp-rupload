/*
 * Decompiled with CFR 0.152.
 */
package com.app.concurrency.core;

import com.exception.system.CustomSystemException;
import com.runtime.context.ContextualExecutionFramework;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ConcurrentResourceManager {
    protected ContextualExecutionFramework U;
    private final AtomicBoolean j;
    private final boolean Q;
    private final AtomicBoolean D;
    private static String[] V;
    protected ContextualExecutionFramework q;
    private final HashMap<ContextualExecutionFramework, Integer> g = new HashMap();

    protected boolean B(ContextualExecutionFramework contextualExecutionFramework) {
        boolean bl;
        int n = this.g.getOrDefault(contextualExecutionFramework, 0);
        int n2 = this.g.getOrDefault(this.q, 0);
        try {
            bl = n > n2;
        }
        catch (CustomSystemException customSystemException) {
            throw ConcurrentResourceManager.a(customSystemException);
        }
        return bl;
    }

    public HashMap<ContextualExecutionFramework, Integer> T() {
        return this.g;
    }

    static {
        if (ConcurrentResourceManager.Z() == null) {
            ConcurrentResourceManager.c(new String[1]);
        }
    }

    public void y(ContextualExecutionFramework contextualExecutionFramework, int n) {
        this.g.put(contextualExecutionFramework, n);
    }

    public void X() {
        this.D.set(false);
        this.U = null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ContextualExecutionFramework O() {
        return this.q;
    }

    public void v(ContextualExecutionFramework contextualExecutionFramework) {
        this.D.set(true);
        this.U = contextualExecutionFramework;
    }

    protected boolean R(ContextualExecutionFramework contextualExecutionFramework) {
        block8: {
            block10: {
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    if (!this.Q) break block8;
                                    if (this.j.get()) break block9;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ConcurrentResourceManager.a(customSystemException);
                                }
                                if (!this.l()) break block10;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConcurrentResourceManager.a(customSystemException);
                            }
                            if (this.c(contextualExecutionFramework)) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConcurrentResourceManager.a(customSystemException);
                        }
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConcurrentResourceManager.a(customSystemException);
                }
            }
            this.X();
        }
        this.q = contextualExecutionFramework;
        this.j.set(true);
        return true;
    }

    public ContextualExecutionFramework r() {
        return this.U;
    }

    public void d() {
        this.j.set(true);
    }

    public boolean l() {
        return this.D.get();
    }

    protected boolean P(ContextualExecutionFramework contextualExecutionFramework) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.q == null || !this.q.equals(contextualExecutionFramework)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConcurrentResourceManager.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConcurrentResourceManager.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static void c(String[] stringArray) {
        V = stringArray;
    }

    public void Z() {
        this.j.set(false);
    }

    public static String[] Z() {
        return V;
    }

    public ConcurrentResourceManager(boolean bl) {
        this.D = new AtomicBoolean();
        this.j = new AtomicBoolean();
        this.Q = bl;
    }

    protected boolean t(ContextualExecutionFramework contextualExecutionFramework) {
        block7: {
            block8: {
                try {
                    try {
                        if (!this.Q) break block7;
                        if (!this.c(contextualExecutionFramework)) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConcurrentResourceManager.a(customSystemException);
                    }
                    this.X();
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConcurrentResourceManager.a(customSystemException);
                }
            }
            try {
                if (!this.P(contextualExecutionFramework)) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ConcurrentResourceManager.a(customSystemException);
            }
        }
        this.q = null;
        this.j.set(false);
        return true;
    }

    public boolean A() {
        return this.j.get();
    }

    protected boolean c(ContextualExecutionFramework contextualExecutionFramework) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.U == null || !this.U.equals(contextualExecutionFramework)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConcurrentResourceManager.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConcurrentResourceManager.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public ConcurrentResourceManager() {
        this(false);
    }

    public void H(boolean bl) {
        this.j.set(bl);
    }

    public boolean r(ContextualExecutionFramework contextualExecutionFramework) {
        block15: {
            try {
                if (this.R(contextualExecutionFramework)) {
                    return true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ConcurrentResourceManager.a(customSystemException);
            }
            if (this.Q) {
                boolean bl;
                block16: {
                    boolean bl2 = this.l();
                    boolean bl3 = this.c(contextualExecutionFramework);
                    bl = this.B(contextualExecutionFramework);
                    try {
                        try {
                            try {
                                try {
                                    if (!this.A() || this.P(contextualExecutionFramework)) break block15;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ConcurrentResourceManager.a(customSystemException);
                                }
                                if (!bl2) break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConcurrentResourceManager.a(customSystemException);
                            }
                            if (bl3) break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConcurrentResourceManager.a(customSystemException);
                        }
                        return false;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConcurrentResourceManager.a(customSystemException);
                    }
                }
                try {
                    if (!bl) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ConcurrentResourceManager.a(customSystemException);
                }
                this.v(contextualExecutionFramework);
            }
        }
        return false;
    }
}

