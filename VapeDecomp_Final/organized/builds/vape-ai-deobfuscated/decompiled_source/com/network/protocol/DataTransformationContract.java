/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.app.events.EventNotificationBroker2314;
import com.integration.platform.CrossPlatformAdapter;
import com.network.config.NetworkConfigurationResolver2717;
import com.security.auth.AuthenticationTokenManager1206;
import java.lang.reflect.Method;

public interface DataTransformationContract {
    public static DataTransformationContract F(NetworkConfigurationResolver2717 networkConfigurationResolver2717, Class<? extends EventNotificationBroker2314> clazz, Method method) {
        try {
            return new AuthenticationTokenManager1206(networkConfigurationResolver2717, clazz, method);
        }
        catch (Throwable throwable) {
            return new CrossPlatformAdapter(networkConfigurationResolver2717, clazz, method);
        }
    }

    public <T extends EventNotificationBroker2314> void f(T var1);
}

