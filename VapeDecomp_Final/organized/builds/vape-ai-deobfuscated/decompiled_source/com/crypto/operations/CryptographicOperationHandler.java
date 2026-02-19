/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.crypto.operations;

import com.data.compression.DataCompressionManager;
import com.exception.system.CustomSystemException;
import com.network.session.CommunicationSessionController;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public class CryptographicOperationHandler
extends ObjectLifecycleTracker {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public CommunicationSessionController L() {
        return new CommunicationSessionController(CryptographicOperationHandler.U.u().LA.y(this.H));
    }

    public CryptographicOperationHandler(Object object) {
        super(object);
    }

    @Nullable
    public DataCompressionManager b() {
        Optional optional = this.s();
        try {
            if (optional.isPresent()) {
                return new DataCompressionManager(optional.get());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicOperationHandler.a(customSystemException);
        }
        return null;
    }

    public Optional s() {
        return CryptographicOperationHandler.U.u().LA.H(this.H);
    }
}

