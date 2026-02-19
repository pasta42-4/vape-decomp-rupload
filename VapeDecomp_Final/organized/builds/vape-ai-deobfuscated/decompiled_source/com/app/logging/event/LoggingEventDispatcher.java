/*
 * Decompiled with CFR 0.152.
 */
package com.app.logging.event;

import com.financial.transaction.TransactionProcessor;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.ArrayList;
import java.util.List;

public class LoggingEventDispatcher
extends ObjectLifecycleTracker {
    public List<TransactionProcessor> l() {
        List list = LoggingEventDispatcher.U.u().Lt.M(this.H);
        ArrayList<TransactionProcessor> arrayList = new ArrayList<TransactionProcessor>();
        for (Object e : list) {
            arrayList.add(new TransactionProcessor(e));
        }
        return arrayList;
    }

    public LoggingEventDispatcher(Object object) {
        super(object);
    }
}

