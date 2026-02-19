/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package com.network.connections;

import a.oD;
import com.google.common.collect.Lists;
import com.messaging.routing.MessageRoutingService1592;
import com.network.interface.NetworkInterfaceManager;
import com.security.encryption.SecureDataEncryptionManager;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.ArrayList;
import java.util.Collection;

public class NetworkConnectionManager1584
extends ObjectLifecycleTracker {
    public Collection<NetworkInterfaceManager> F(MessageRoutingService1592 messageRoutingService1592) {
        Collection collection = SecureDataEncryptionManager.c(NetworkConnectionManager1584.U.u().Lc, this.H, messageRoutingService1592.M());
        ArrayList arrayList = Lists.newArrayList();
        for (Object e : collection) {
            arrayList.add(new NetworkInterfaceManager(e));
        }
        return arrayList;
    }

    public NetworkConnectionManager1584(Object object) {
        super(object);
    }

    public oD W(String string) {
        return new oD(SecureDataEncryptionManager.S(NetworkConnectionManager1584.U.u().Lc, this.H, string));
    }
}

