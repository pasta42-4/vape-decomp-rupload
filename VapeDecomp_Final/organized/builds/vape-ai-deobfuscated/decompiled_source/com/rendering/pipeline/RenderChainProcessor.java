/*
 * Decompiled with CFR 0.152.
 */
package com.rendering.pipeline;

import com.app.reflection.GenericTypeInspector;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.security.context.SecureContextNegotiator;
import com.security.protocol.SecurityProtocolMediator;
import java.util.ArrayList;
import java.util.Arrays;

class RenderChainProcessor
extends GenericTypeInspector<SecureContextNegotiator> {
    final SecurityProtocolMediator W;
    SecureContextNegotiator z;

    @Override
    public ArrayList<AbstractComputationKernel> h(AbstractComputationKernel abstractComputationKernel) {
        if (this.g().isInstance(abstractComputationKernel)) {
            ArrayList<AbstractComputationKernel> arrayList;
            block7: {
                arrayList = super.h(abstractComputationKernel);
                try {
                    try {
                        try {
                            if (arrayList == null || this.z == null) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RenderChainProcessor.a(customSystemException);
                        }
                        if (!this.z.equals(abstractComputationKernel)) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RenderChainProcessor.a(customSystemException);
                    }
                    return new ArrayList<AbstractComputationKernel>(Arrays.asList(this.z.E()));
                }
                catch (CustomSystemException customSystemException) {
                    throw RenderChainProcessor.a(customSystemException);
                }
            }
            return arrayList;
        }
        return null;
    }

    RenderChainProcessor(SecurityProtocolMediator securityProtocolMediator, Class clazz) {
        this.W = securityProtocolMediator;
        super(clazz);
        this.z = null;
    }

    public boolean O(SecureContextNegotiator secureContextNegotiator) {
        this.z = secureContextNegotiator;
        return true;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

