/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import com.app.reflection.GenericTypeInspector;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.network.connection.ConnectionPoolOrchestrator;
import com.security.protocol.SecurityProtocolMediator;
import java.util.ArrayList;
import java.util.Arrays;

class GenericConvergenceHandler
extends GenericTypeInspector<ConnectionPoolOrchestrator> {
    ConnectionPoolOrchestrator k;
    final SecurityProtocolMediator T;

    public boolean j(ConnectionPoolOrchestrator connectionPoolOrchestrator) {
        this.k = connectionPoolOrchestrator;
        return true;
    }

    @Override
    public ArrayList<AbstractComputationKernel> h(AbstractComputationKernel abstractComputationKernel) {
        if (this.g().isInstance(abstractComputationKernel)) {
            ArrayList<AbstractComputationKernel> arrayList;
            block7: {
                arrayList = super.h(abstractComputationKernel);
                try {
                    try {
                        try {
                            if (arrayList == null || this.k == null) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GenericConvergenceHandler.a(customSystemException);
                        }
                        if (!this.k.equals(abstractComputationKernel)) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GenericConvergenceHandler.a(customSystemException);
                    }
                    return new ArrayList<AbstractComputationKernel>(Arrays.asList(this.k.A()));
                }
                catch (CustomSystemException customSystemException) {
                    throw GenericConvergenceHandler.a(customSystemException);
                }
            }
            return arrayList;
        }
        return null;
    }

    GenericConvergenceHandler(SecurityProtocolMediator securityProtocolMediator, Class clazz) {
        this.T = securityProtocolMediator;
        super(clazz);
        this.k = null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

