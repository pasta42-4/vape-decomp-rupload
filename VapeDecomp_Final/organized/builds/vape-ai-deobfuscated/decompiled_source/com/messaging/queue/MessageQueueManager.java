/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.queue;

import a.Z3;
import com.messaging.encoding.MessageEncoder;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.protocol.NetworkProtocolHandler1347;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MessageQueueManager {
    private final List<NetworkConfigurationResolver2717> e = Arrays.asList(new MessageEncoder(), new NetworkProtocolHandler1347());

    public void R() {
        for (NetworkConfigurationResolver2717 networkConfigurationResolver2717 : this.e) {
            Z3.s().A(networkConfigurationResolver2717, new Predicate[0]);
        }
    }

    public void b() {
        for (NetworkConfigurationResolver2717 networkConfigurationResolver2717 : this.e) {
            Z3.s().l(networkConfigurationResolver2717);
        }
    }
}

