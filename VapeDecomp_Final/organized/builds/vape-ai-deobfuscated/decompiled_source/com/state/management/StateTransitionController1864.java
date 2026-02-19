/*
 * Decompiled with CFR 0.152.
 */
package com.state.management;

import com.network.connection.ConnectionLifecycleHandler;
import java.util.ArrayList;
import java.util.List;

public class StateTransitionController1864
extends ConnectionLifecycleHandler {
    public Iterable J() {
        return StateTransitionController1864.U.u().LK.I(this.H);
    }

    public List<ConnectionLifecycleHandler> I() {
        ArrayList<ConnectionLifecycleHandler> arrayList = new ArrayList<ConnectionLifecycleHandler>();
        for (Object t : this.J()) {
            arrayList.add(new ConnectionLifecycleHandler(t));
        }
        return arrayList;
    }

    public StateTransitionController1864(Object object) {
        super(object);
    }
}

