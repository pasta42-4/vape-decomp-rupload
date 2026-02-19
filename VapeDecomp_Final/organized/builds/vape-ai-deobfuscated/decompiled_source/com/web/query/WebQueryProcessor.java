/*
 * Decompiled with CFR 0.152.
 */
package com.web.query;

import a.yC;
import com.distributed.resources.DistributedResourceCoordinator;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.security.crypto.CipherManager;
import com.security.crypto.CryptographicSecurityManager396;
import com.system.configuration.ConfigurationManager;

class WebQueryProcessor
extends GraphicalRenderEngine1082 {
    final yC ZR;
    final DistributedResourceCoordinator Zg;
    final yC Z_;
    final CipherManager ZO;
    final CryptographicSecurityManager396 Zb;

    WebQueryProcessor(DistributedResourceCoordinator distributedResourceCoordinator, double d2, double d3, CryptographicSecurityManager396 cryptographicSecurityManager396, yC yC2, CipherManager cipherManager, yC yC3) {
        this.Zg = distributedResourceCoordinator;
        this.Zb = cryptographicSecurityManager396;
        this.ZR = yC2;
        this.ZO = cipherManager;
        this.Z_ = yC3;
        super(d2, d3);
    }

    @Override
    public void E() {
        block15: {
            boolean bl;
            yC yC2;
            block17: {
                block16: {
                    boolean bl2;
                    yC yC3;
                    block14: {
                        block13: {
                            boolean bl3;
                            CryptographicSecurityManager396 cryptographicSecurityManager396;
                            try {
                                this.Zb.b(this.G() + this.w() / 2.0 - this.Zb.u() / 2.0);
                                this.Zb.M(this.W() + 18.0);
                                this.ZR.b(this.Zb.G() - 8.0);
                                this.ZR.M(this.Zb.W() + 1.0);
                                this.ZO.b(this.G() + this.w() / 2.0 - this.ZO.w() / 2.0);
                                this.ZO.M(this.Zb.W() - 8.0);
                                cryptographicSecurityManager396 = this.Zb;
                                bl3 = !this.ZO.f();
                            }
                            catch (CustomSystemException customSystemException) {
                                throw WebQueryProcessor.a(customSystemException);
                            }
                            try {
                                try {
                                    cryptographicSecurityManager396.N(bl3);
                                    yC3 = this.ZR;
                                    if (this.ZO.f() || !this.s()) break block13;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw WebQueryProcessor.a(customSystemException);
                                }
                                bl2 = true;
                                break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw WebQueryProcessor.a(customSystemException);
                            }
                        }
                        bl2 = false;
                    }
                    try {
                        try {
                            yC3.N(bl2);
                            if (this.Z_ == null) break block15;
                            this.Z_.b(this.Zb.G() + this.Zb.w() + 3.0);
                            this.Z_.M(this.Zb.W() + 1.0);
                            yC2 = this.Z_;
                            if (this.ZO.f()) break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw WebQueryProcessor.a(customSystemException);
                        }
                        bl = true;
                        break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw WebQueryProcessor.a(customSystemException);
                    }
                }
                bl = false;
            }
            yC2.N(bl);
        }
        try {
            super.E();
            if (this.ZO.f()) {
                ConfigurationManager.r(this.ZO.G() + 10.0, this.ZO.W() + 17.0, this.ZO.w() - 31.0, 1.0f, WebQueryProcessor.M.k);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw WebQueryProcessor.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

