/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.data.encoding.CrossPlatformEncoder;
import com.exception.system.CustomSystemException;
import com.security.constants.CipherConfigurationMode;
import com.security.crypto.CipherManager;
import com.system.resource.ComputationalResourceAllocator;
import com.transaction.logging.TransactionLogOrchestrator;
import com.ui.events.UserInteractionEventDispatcher;
import com.ui.rendering.GraphicalRenderingController;

public class Cc
extends CipherManager {
    private int cZ = 0;
    private CrossPlatformEncoder cf;
    private ComputationalResourceAllocator ct;

    @Override
    public void O() {
    }

    @Override
    public void G() {
    }

    @Override
    public float q() {
        return 0.0f;
    }

    @Override
    public void E() {
        block6: {
            try {
                block7: {
                    try {
                        try {
                            if (this.ct == null) break block6;
                            if (GraphicalRenderingController.d == null) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw Cc.a(customSystemException);
                        }
                        if (GraphicalRenderingController.d.equals(this)) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Cc.a(customSystemException);
                    }
                }
                GraphicalRenderingController.d = this;
            }
            catch (CustomSystemException customSystemException) {
                throw Cc.a(customSystemException);
            }
        }
        this.R();
    }

    @Override
    public float C() {
        return 0.0f;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public double e() {
        return 0.0;
    }

    public Cc(ComputationalResourceAllocator computationalResourceAllocator) {
        super("");
        this.ct = computationalResourceAllocator;
        this.L.N(false);
    }

    @Override
    public void d() {
        block5: {
            try {
                if (!this.f() || this.cf == null) break block5;
            }
            catch (CustomSystemException customSystemException) {
                throw Cc.a(customSystemException);
            }
            int n = this.a().length();
            try {
                if (n != this.cZ) {
                    this.cf.m();
                    this.cf.y();
                    this.cZ = n;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw Cc.a(customSystemException);
            }
        }
    }

    @Override
    public void g() {
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        block12: {
            boolean bl;
            block11: {
                try {
                    if (this.cf != null) {
                        super.Z(userInteractionEventDispatcher);
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw Cc.a(customSystemException);
                }
                bl = this.C().O(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY());
                try {
                    try {
                        if (!bl || !userInteractionEventDispatcher.getAction().equals((Object)CipherConfigurationMode.RIGHT_CLICK)) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Cc.a(customSystemException);
                    }
                    this.y("");
                    ((TransactionLogOrchestrator)this.ct.h()).y();
                }
                catch (CustomSystemException customSystemException) {
                    throw Cc.a(customSystemException);
                }
            }
            try {
                try {
                    if (GraphicalRenderingController.d == null || bl) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw Cc.a(customSystemException);
                }
                GraphicalRenderingController.d = null;
                this.ct.f(false);
                this.N(false);
            }
            catch (CustomSystemException customSystemException) {
                throw Cc.a(customSystemException);
            }
        }
    }

    @Override
    public double z() {
        return 20.0;
    }

    public Cc(CrossPlatformEncoder crossPlatformEncoder) {
        super("");
        this.cf = crossPlatformEncoder;
        this.L.N(false);
    }
}

