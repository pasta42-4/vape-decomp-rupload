/*
 * Decompiled with CFR 0.152.
 */
package com.app.transaction;

import com.network.connection.ConnectionLifecycleHandler;
import com.network.streaming.NetworkStreamHandler2066;
import java.util.ArrayList;
import java.util.List;

public class TransactionOrchestrator1793
extends ConnectionLifecycleHandler {
    public int[] V() {
        return TransactionOrchestrator1793.U.u().dk.F(this.H);
    }

    public List<NetworkStreamHandler2066> Y() {
        Object[] objectArray = TransactionOrchestrator1793.U.u().dk.j(this.H);
        ArrayList<NetworkStreamHandler2066> arrayList = new ArrayList<NetworkStreamHandler2066>();
        for (Object object : objectArray) {
            arrayList.add(new NetworkStreamHandler2066(object));
        }
        return arrayList;
    }

    public int[] H() {
        return TransactionOrchestrator1793.U.u().dk.V(this.H);
    }

    public TransactionOrchestrator1793(Object object) {
        super(object);
    }
}

