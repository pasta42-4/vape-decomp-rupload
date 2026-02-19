/*
 * Decompiled with CFR 0.152.
 */
package com.app.network;

import com.app.core.interfaces.OperationExecutionInterface;
import com.graphics.palette.ColorPaletteManager;
import com.security.cipher.SecureStreamCipher;
import com.structure.tree.RecursiveNodeTreeBuilder;

class NetworkConnectionManager2165
implements OperationExecutionInterface {
    final SecureStreamCipher a;
    final RecursiveNodeTreeBuilder h;

    NetworkConnectionManager2165(SecureStreamCipher secureStreamCipher, RecursiveNodeTreeBuilder recursiveNodeTreeBuilder) {
        this.a = secureStreamCipher;
        this.h = recursiveNodeTreeBuilder;
    }

    @Override
    public void R() {
        ((ColorPaletteManager)SecureStreamCipher.V(this.a)).A(this.h);
        SecureStreamCipher.V(this.a).M();
        this.a.X();
    }
}

