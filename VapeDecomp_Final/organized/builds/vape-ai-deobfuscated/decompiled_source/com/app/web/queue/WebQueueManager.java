/*
 * Decompiled with CFR 0.152.
 */
package com.app.web.queue;

import a.I8;
import com.data.transformation.PayloadTransformer;
import java.util.List;

class WebQueueManager
extends PayloadTransformer {
    final I8 U;
    List<String> N;

    WebQueueManager(I8 i8) {
        this.U = i8;
        super(i8);
    }
}

