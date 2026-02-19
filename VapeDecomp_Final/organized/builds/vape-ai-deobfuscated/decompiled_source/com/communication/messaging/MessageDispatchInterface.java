/*
 * Decompiled with CFR 0.152.
 */
package com.communication.messaging;

import com.user.identity.UserIdentityManager;
import java.util.function.BiConsumer;

public interface MessageDispatchInterface {
    public void j(String var1, BiConsumer<UserIdentityManager, String> var2);
}

