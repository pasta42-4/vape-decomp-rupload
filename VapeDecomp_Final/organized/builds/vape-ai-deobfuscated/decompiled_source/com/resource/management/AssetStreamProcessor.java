/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import a.fe;
import a.yK;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicKeyExchanger1707;
import com.ui.events.UserInteractionEventDispatcher;
import java.util.ArrayList;
import java.util.List;

public class AssetStreamProcessor
extends AbstractComputationKernel {
    private fe D;
    private List<yK> V = new ArrayList<yK>();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void d() {
    }

    @Override
    public double e() {
        return 250.0;
    }

    @Override
    public void b(double d2) {
        super.b(d2);
    }

    @Override
    public void g() {
    }

    @Override
    public void E() {
        double d2 = this.W() + 10.0;
        double d3 = this.G() + 5.0;
        for (int i = 0; i < this.V.size(); ++i) {
            boolean bl;
            yK yK2;
            yK yK3 = this.V.get(i);
            yK3.b(d3);
            yK3.M(d2);
            yK3.z(this.D.m().J().get(i).J());
            d3 += yK3.w();
            try {
                yK2 = yK3;
                bl = this.D.n() == i;
            }
            catch (CustomSystemException customSystemException) {
                throw AssetStreamProcessor.a(customSystemException);
            }
            yK2.p(bl);
        }
        super.E();
    }

    @Override
    public double z() {
        return 50.0;
    }

    @Override
    public void G() {
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    @Override
    public void U() {
    }

    public AssetStreamProcessor(fe fe2) {
        this.D = fe2;
        int n = 0;
        while (n < 9) {
            yK yK2 = new yK(AssetStreamProcessor.M.a, AssetStreamProcessor.M.g, 0);
            int n2 = n++;
            yK2.N(new CryptographicKeyExchanger1707(this, fe2, n2));
            this.V.add(yK2);
            this.o(yK2);
        }
    }
}

