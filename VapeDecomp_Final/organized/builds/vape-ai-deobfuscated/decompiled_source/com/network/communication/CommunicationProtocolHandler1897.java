/*
 * Decompiled with CFR 0.152.
 */
package com.network.communication;

import com.distributed.cluster.ClusterNodeCoordinator1923;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.ArrayList;
import java.util.List;

public class CommunicationProtocolHandler1897
extends ObjectLifecycleTracker {
    public CommunicationProtocolHandler1897(Object object) {
        super(object);
    }

    public List<Object> H() {
        return CommunicationProtocolHandler1897.U.u().Lo.Z(this.H);
    }

    public List<ClusterNodeCoordinator1923> a() {
        ArrayList<ClusterNodeCoordinator1923> arrayList = new ArrayList<ClusterNodeCoordinator1923>();
        for (Object object : this.H()) {
            arrayList.add(new ClusterNodeCoordinator1923(object));
        }
        return arrayList;
    }
}

