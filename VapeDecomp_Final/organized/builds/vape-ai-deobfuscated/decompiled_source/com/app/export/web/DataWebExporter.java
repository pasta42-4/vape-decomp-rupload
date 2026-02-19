/*
 * Decompiled with CFR 0.152.
 */
package com.app.export.web;

import com.game.actions.ActionSequenceHandler;
import com.security.decrypt.SecureDecryptionHandler;
import com.system.lifecycle.ObjectLifecycleTracker;

public class DataWebExporter
extends ObjectLifecycleTracker {
    public ActionSequenceHandler n() {
        return new ActionSequenceHandler(SecureDecryptionHandler.W(DataWebExporter.U.u().r, this.H));
    }

    public DataWebExporter(Object object) {
        super(object);
    }
}

