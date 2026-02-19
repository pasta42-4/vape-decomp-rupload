/*
 * Decompiled with CFR 0.152.
 */
package com.app.database.query;

import com.communication.output.OutputChannelManager;
import com.logging.transactions.TransactionLogger2620;

public class QueryComposer
extends TransactionLogger2620 {
    public OutputChannelManager X() {
        return new OutputChannelManager(QueryComposer.U.u().gs.S(this.H));
    }

    public QueryComposer(Object object) {
        super(object);
    }
}

