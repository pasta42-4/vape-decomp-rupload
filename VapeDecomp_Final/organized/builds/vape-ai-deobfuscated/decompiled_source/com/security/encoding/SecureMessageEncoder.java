/*
 * Decompiled with CFR 0.152.
 */
package com.security.encoding;

import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.math.transformation.NumericTransformationEngine;
import com.network.protocol.NetworkProtocolDefinition;
import com.network.security.NetworkSecurityTransformer;
import com.security.constants.CipherConfigurationMode;
import com.security.session.CipherSessionManager;
import com.ui.events.UserInteractionEventDispatcher;

public abstract class SecureMessageEncoder
extends AbstractComputationKernel {
    private CipherSessionManager b;
    private static String L;

    public static void E(String string) {
        L = string;
    }

    public SecureMessageEncoder(CipherSessionManager cipherSessionManager) {
        this.b = cipherSessionManager;
    }

    static {
        if (SecureMessageEncoder.K() == null) {
            SecureMessageEncoder.E("x0Uhx");
        }
    }

    public boolean M(int n, int n2) {
        for (AbstractComputationKernel abstractComputationKernel : this.A()) {
            try {
                if (!abstractComputationKernel.C().O(n, n2)) continue;
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw SecureMessageEncoder.b(customSystemException);
            }
        }
        return this.C().O(n, n2);
    }

    @Override
    public void o(AbstractComputationKernel ... abstractComputationKernelArray) {
        super.o(abstractComputationKernelArray);
        for (AbstractComputationKernel abstractComputationKernel : abstractComputationKernelArray) {
            abstractComputationKernel.o(this);
        }
    }

    @Override
    public boolean b() {
        return false;
    }

    public CipherSessionManager h() {
        return this.b;
    }

    @Override
    public void S(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        block6: {
            try {
                try {
                    try {
                        if (!userInteractionEventDispatcher.getAction().equals((Object)CipherConfigurationMode.RIGHT_CLICK) || !(this.b instanceof NetworkProtocolDefinition)) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecureMessageEncoder.b(customSystemException);
                    }
                    if (this.b instanceof NetworkSecurityTransformer) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureMessageEncoder.b(customSystemException);
                }
                ((NetworkProtocolDefinition)((Object)this.b)).V();
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw SecureMessageEncoder.b(customSystemException);
            }
        }
        super.S(userInteractionEventDispatcher);
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public double e() {
        return 110.0;
    }

    public static String K() {
        return L;
    }

    @Override
    public double z() {
        return 18.0;
    }

    public void b(double d2, double d3) {
        for (AbstractComputationKernel abstractComputationKernel : this.A()) {
            try {
                abstractComputationKernel.b(abstractComputationKernel.G() + d2);
                abstractComputationKernel.M(abstractComputationKernel.W() + d3);
                if (!(abstractComputationKernel instanceof NumericTransformationEngine)) continue;
                ((NumericTransformationEngine)abstractComputationKernel).t(d2, d3);
            }
            catch (CustomSystemException customSystemException) {
                throw SecureMessageEncoder.b(customSystemException);
            }
        }
    }
}

