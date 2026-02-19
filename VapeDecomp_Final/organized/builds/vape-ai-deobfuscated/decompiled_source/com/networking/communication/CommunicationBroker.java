/*
 * Decompiled with CFR 0.152.
 */
package com.networking.communication;

import a.wK;
import com.app.core.interfaces.OperationExecutionInterface;
import com.app.crypto.processing.CipherTextProcessor;

class CommunicationBroker
implements OperationExecutionInterface {
    final wK o;

    @Override
    public void R() {
        CipherTextProcessor.h(this.o).O().v();
    }

    CommunicationBroker(wK wK2) {
        this.o = wK2;
    }
}

