/*
 * Decompiled with CFR 0.152.
 */
package com.app.messaging;

import com.app.data.storage.TimestampedDataContainer;
import com.communication.messaging.MessageDispatchInterface;
import com.security.context.SecureContextBroker572;
import com.user.identity.UserIdentityManager;
import java.util.function.BiConsumer;

public class MessageBrokerClient
implements MessageDispatchInterface {
    private static void lambda$sendChatMessage$0(TimestampedDataContainer timestampedDataContainer) {
    }

    @Override
    public void j(String string, BiConsumer<UserIdentityManager, String> biConsumer) {
        SecureContextBroker572.h().c().O(string, MessageBrokerClient::lambda$sendChatMessage$0);
    }
}

