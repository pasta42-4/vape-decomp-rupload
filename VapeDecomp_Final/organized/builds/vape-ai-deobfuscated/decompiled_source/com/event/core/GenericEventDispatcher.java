/*
 * Decompiled with CFR 0.152.
 */
package com.event.core;

import com.app.reflection.GenericTypeInspector;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.security.context.SecureContextNegotiator;
import com.security.protocol.SecurityProtocolMediator;
import java.util.ArrayList;
import java.util.Arrays;

class GenericEventDispatcher
extends GenericTypeInspector<SecureContextNegotiator> {
    final SecurityProtocolMediator G;
    SecureContextNegotiator y;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    GenericEventDispatcher(SecurityProtocolMediator securityProtocolMediator, Class clazz) {
        this.G = securityProtocolMediator;
        super(clazz);
        this.y = null;
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
                            if (arrayList == null || this.y == null) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GenericEventDispatcher.a(customSystemException);
                        }
                        if (!this.y.equals(abstractComputationKernel)) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GenericEventDispatcher.a(customSystemException);
                    }
                    return new ArrayList<AbstractComputationKernel>(Arrays.asList(this.y.E()));
                }
                catch (CustomSystemException customSystemException) {
                    throw GenericEventDispatcher.a(customSystemException);
                }
            }
            return arrayList;
        }
        return null;
    }

    public boolean E(SecureContextNegotiator secureContextNegotiator) {
        this.y = secureContextNegotiator;
        return true;
    }
}

