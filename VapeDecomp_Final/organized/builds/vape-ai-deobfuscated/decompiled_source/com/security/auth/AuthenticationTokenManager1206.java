/*
 * Decompiled with CFR 0.152.
 */
package com.security.auth;

import com.app.events.EventNotificationBroker2314;
import com.app.streaming.StreamProcessingHandler2686;
import com.exception.system.CustomSystemException;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.protocol.DataTransformationContract;
import com.runtime.reflection.ReflectionProxyInvoker;
import java.lang.reflect.Method;

public class AuthenticationTokenManager1206
implements DataTransformationContract {
    private final StreamProcessingHandler2686 u;
    static final /* synthetic */ boolean M;
    private final Class<? extends EventNotificationBroker2314> d;
    private final NetworkConfigurationResolver2717 g;

    private static Exception a(Exception exception) {
        return exception;
    }

    static {
        boolean bl;
        try {
            bl = !AuthenticationTokenManager1206.class.desiredAssertionStatus();
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationTokenManager1206.a(customSystemException);
        }
        M = bl;
    }

    @Override
    public <T extends EventNotificationBroker2314> void f(T t) {
        this.u.t(this.g, t);
    }

    public AuthenticationTokenManager1206(NetworkConfigurationResolver2717 networkConfigurationResolver2717, Class<? extends EventNotificationBroker2314> clazz, Method method) throws InstantiationException, IllegalAccessException {
        Class<? extends StreamProcessingHandler2686> clazz2;
        block4: {
            this.g = networkConfigurationResolver2717;
            this.d = clazz;
            clazz2 = ReflectionProxyInvoker.L(method.getDeclaringClass(), method);
            try {
                try {
                    if (M || clazz2 != null) break block4;
                }
                catch (InstantiationException instantiationException) {
                    throw AuthenticationTokenManager1206.a(instantiationException);
                }
                throw new AssertionError();
            }
            catch (InstantiationException instantiationException) {
                throw AuthenticationTokenManager1206.a(instantiationException);
            }
        }
        this.u = clazz2.newInstance();
    }
}

