/*
 * Decompiled with CFR 0.152.
 */
package com.event.routing;

import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.reflection.utils.ReflectionProxyHandler;
import java.awt.Point;

class EventRouter
implements DataProcessingProtocol {
    final ReflectionProxyHandler W;

    EventRouter(ReflectionProxyHandler reflectionProxyHandler) {
        this.W = reflectionProxyHandler;
    }

    @Override
    public boolean o(Point point) {
        block4: {
            try {
                try {
                    if (this.W.W() || !ReflectionProxyHandler.G(this.W).s()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventRouter.a(customSystemException);
                }
                ReflectionProxyHandler.G(this.W).L();
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw EventRouter.a(customSystemException);
            }
        }
        return false;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

