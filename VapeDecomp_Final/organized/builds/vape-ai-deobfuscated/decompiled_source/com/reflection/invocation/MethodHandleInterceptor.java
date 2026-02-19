/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.invocation;

import com.app.events.EventNotificationBroker2314;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.protocol.DataTransformationContract;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

public class MethodHandleInterceptor
implements DataTransformationContract {
    private final MethodHandle x;
    private final Class<? extends EventNotificationBroker2314> e;
    private final NetworkConfigurationResolver2717 A;

    public MethodHandleInterceptor(NetworkConfigurationResolver2717 networkConfigurationResolver2717, Class<? extends EventNotificationBroker2314> clazz, Method method) {
        this.A = networkConfigurationResolver2717;
        this.e = clazz;
        try {
            this.x = MethodHandles.lookup().unreflect(method);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(illegalAccessException);
        }
    }

    @Override
    public <T extends EventNotificationBroker2314> void f(T t) {
        try {
            this.x.invoke(this.A, t);
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}

