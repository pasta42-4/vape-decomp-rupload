/*
 * Decompiled with CFR 0.152.
 */
package com.vape.ui;

import com.app.core.interfaces.OperationExecutionInterface;
import com.security.cryptography.EncryptionKeyGenerator;
import com.ui.rendering.GraphicalRenderingController;

class VapeInterfaceController
implements OperationExecutionInterface {
    final EncryptionKeyGenerator z;

    @Override
    public void R() {
        EncryptionKeyGenerator.e(this.z);
        GraphicalRenderingController.K.L();
    }

    VapeInterfaceController(EncryptionKeyGenerator encryptionKeyGenerator) {
        this.z = encryptionKeyGenerator;
    }
}

