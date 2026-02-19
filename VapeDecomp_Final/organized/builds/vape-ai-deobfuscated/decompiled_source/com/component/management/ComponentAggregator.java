/*
 * Decompiled with CFR 0.152.
 */
package com.component.management;

import com.core.computation.AbstractComputationKernel;
import com.data.obfuscation.NumericScrambler;
import com.exception.system.CustomSystemException;
import com.security.token.CryptographicTokenManager1032;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;
import com.user.identity.UserIdentityManager;
import java.awt.Color;
import java.util.List;

public class ComponentAggregator
extends AbstractComputationKernel {
    private final List<UserIdentityManager> V;

    @Override
    public double z() {
        return 8.0;
    }

    @Override
    public void U() {
    }

    @Override
    public void d() {
    }

    @Override
    public void G() {
        double d2 = this.V.size();
        double d3 = 8.0;
        double d4 = d3 + 1.0;
        double d5 = d2 * d4;
        double d6 = this.w() - d5;
        double d7 = d4;
        double d8 = d6 / d2 - d3 / 2.0 / d2;
        if (d6 < 0.0) {
            d7 += d8;
        }
        float f = 0.0f;
        int n = 0;
        while ((double)n < d2) {
            UserIdentityManager userIdentityManager = this.V.get(n);
            NumericScrambler numericScrambler = CryptographicTokenManager1032.r().j(userIdentityManager.X(), 32);
            try {
                if (numericScrambler != null) {
                    ConfigurationManager.T((double)((float)this.G() + f - 1.0f), (double)((float)this.W() - 1.0f), (double)((float)d3 + 2.0f), 1.0, ComponentAggregator.M.g);
                    ConfigurationManager.c((float)this.G() + f, (float)this.W(), (float)d3, 1.0f, Color.WHITE, numericScrambler);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ComponentAggregator.a(customSystemException);
            }
            f = (float)((double)f + d7);
            ++n;
        }
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    public ComponentAggregator(List<UserIdentityManager> list) {
        this.V = list;
    }

    @Override
    public void g() {
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public double e() {
        return 32.0;
    }
}

