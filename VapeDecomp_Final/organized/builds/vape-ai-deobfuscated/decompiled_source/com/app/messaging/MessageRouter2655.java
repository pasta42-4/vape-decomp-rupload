/*
 * Decompiled with CFR 0.152.
 */
package com.app.messaging;

import com.network.event.NetworkEventDispatcher;
import com.object.lifecycle.ObjectLifecycleMediator;

class MessageRouter2655 {
    NetworkEventDispatcher J;

    public MessageRouter2655(NetworkEventDispatcher networkEventDispatcher) {
        this.J = networkEventDispatcher;
    }

    public void F(ObjectLifecycleMediator objectLifecycleMediator) {
        objectLifecycleMediator.G(this.J);
    }
}

