/*
 * Decompiled with CFR 0.152.
 */
package com.core.service;

import a.KB;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.encoding.protocol.EncodingProtocolEnum;
import com.exception.system.CustomSystemException;
import com.network.config.NetworkConfigurationResolver2717;
import com.security.auth.AuthenticationProvider2618;
import com.security.streaming.CryptoStreamProcessor;
import com.system.validation.SystemStateValidator;
import com.temporal.metadata.TemporalMetadataResolver;

public class ServiceLifecycleController
implements NetworkConfigurationResolver2717 {
    private boolean P;
    private static int[] g;
    private SystemStateValidator s;
    public static ServiceLifecycleController c;

    private ServiceLifecycleController() {
        c = this;
    }

    public static int[] p() {
        return g;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @DataExchangeProtocol2090
    public void g(KB var1_1) {
        try {
            if (this.s == null) return;
            ** GOTO lbl8
        }
        catch (NullPointerException v0) {
            try {
                throw ServiceLifecycleController.a(v0);
lbl8:
                // 2 sources

                if (ApplicationLifecycleManager.U().r() == false) return;
            }
            catch (CustomSystemException v1) {
                throw ServiceLifecycleController.a(v1);
            }
            {
                try {}
                catch (NullPointerException var2_2) {
                    TemporalMetadataResolver.W(var2_2);
                    return;
                }
            }
        }
        this.s.V(var1_1);
    }

    public boolean H() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.s == null || this.s.S()) break block4;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ServiceLifecycleController.a(nullPointerException);
                    }
                    bl = true;
                    break block5;
                }
                catch (NullPointerException nullPointerException) {
                    throw ServiceLifecycleController.a(nullPointerException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void N(SystemStateValidator systemStateValidator) {
        this.s = systemStateValidator;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGH)
    public void F(AuthenticationProvider2618 authenticationProvider2618) {
        block9: {
            block11: {
                block10: {
                    block8: {
                        try {
                            try {
                                if (this.s != null || !ApplicationLifecycleManager.U().r()) break block8;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw ServiceLifecycleController.a(nullPointerException);
                            }
                            return;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw ServiceLifecycleController.a(nullPointerException);
                        }
                    }
                    try {
                        try {
                            this.s.Y();
                            if (!this.s.S()) break block9;
                            if (!this.s.M()) break block10;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw ServiceLifecycleController.a(nullPointerException);
                        }
                        CryptoStreamProcessor.A();
                        break block11;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ServiceLifecycleController.a(nullPointerException);
                    }
                }
                CryptoStreamProcessor.N();
            }
            this.s = null;
        }
    }

    public void I(SystemStateValidator systemStateValidator) {
        block4: {
            try {
                try {
                    if (this.s == null || !this.s.equals(systemStateValidator)) break block4;
                }
                catch (NullPointerException nullPointerException) {
                    throw ServiceLifecycleController.a(nullPointerException);
                }
                this.s.g(true);
            }
            catch (NullPointerException nullPointerException) {
                throw ServiceLifecycleController.a(nullPointerException);
            }
        }
    }

    static {
        c = new ServiceLifecycleController();
        ServiceLifecycleController.m(null);
    }

    public SystemStateValidator k() {
        return this.s;
    }

    public static void m(int[] nArray) {
        g = nArray;
    }
}

