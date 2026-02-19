/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import com.communication.messaging.MessageDispatchInterface;
import com.security.context.SecureContextBroker572;
import com.transaction.core.TransactionContextBuilder;
import com.user.identity.UserIdentityManager;
import java.util.function.BiConsumer;

public class CryptographicKeyManager1611
implements MessageDispatchInterface {
    private static String[] f;
    private final UserIdentityManager O;

    public CryptographicKeyManager1611(UserIdentityManager userIdentityManager) {
        this.O = userIdentityManager;
    }

    public static void n(String[] stringArray) {
        f = stringArray;
    }

    private void lambda$sendChatMessage$0(BiConsumer biConsumer, TransactionContextBuilder transactionContextBuilder) {
        biConsumer.accept(this.O, transactionContextBuilder.e());
    }

    static {
        if (CryptographicKeyManager1611.X() != null) {
            CryptographicKeyManager1611.n(new String[5]);
        }
    }

    public static String[] X() {
        return f;
    }

    @Override
    public void j(String string, BiConsumer<UserIdentityManager, String> biConsumer) {
        SecureContextBroker572.h().c().e(this.O.s(), string, arg_0 -> this.lambda$sendChatMessage$0(biConsumer, arg_0));
    }
}

