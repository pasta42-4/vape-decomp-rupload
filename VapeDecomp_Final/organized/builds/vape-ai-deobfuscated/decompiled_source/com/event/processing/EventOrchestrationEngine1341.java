/*
 * Decompiled with CFR 0.152.
 */
package com.event.processing;

import com.configuration.resolver.ConfigurationProfileResolver;
import com.exception.system.CustomSystemException;
import com.security.tokenization.SecureTokenGenerator1301;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class EventOrchestrationEngine1341 {
    private final Map<SecureTokenGenerator1301, Predicate<Object>> E = new HashMap<SecureTokenGenerator1301, Predicate<Object>>();
    private static String[] W;

    static {
        if (EventOrchestrationEngine1341.u() == null) {
            EventOrchestrationEngine1341.i(new String[1]);
        }
    }

    public EventOrchestrationEngine1341 v(SecureTokenGenerator1301 secureTokenGenerator1301, Object object) {
        this.E.put(secureTokenGenerator1301, arg_0 -> EventOrchestrationEngine1341.lambda$isNotEqual$0(object, arg_0));
        return this;
    }

    public EventOrchestrationEngine1341 l(SecureTokenGenerator1301 secureTokenGenerator1301) {
        this.E.put(secureTokenGenerator1301, Boolean.FALSE::equals);
        return this;
    }

    public boolean x() {
        for (Map.Entry<SecureTokenGenerator1301, Predicate<Object>> entry : this.E.entrySet()) {
            try {
                if (entry.getValue().test(entry.getKey().J())) continue;
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw EventOrchestrationEngine1341.a(customSystemException);
            }
        }
        return true;
    }

    public EventOrchestrationEngine1341 L(SecureTokenGenerator1301 secureTokenGenerator1301, Object object) {
        this.E.put(secureTokenGenerator1301, object::equals);
        return this;
    }

    public EventOrchestrationEngine1341 e(SecureTokenGenerator1301 secureTokenGenerator1301, Predicate<Object> predicate) {
        this.E.put(secureTokenGenerator1301, predicate);
        return this;
    }

    public static String[] u() {
        return W;
    }

    public EventOrchestrationEngine1341 F(SecureTokenGenerator1301 secureTokenGenerator1301) {
        this.E.put(secureTokenGenerator1301, Boolean.TRUE::equals);
        return this;
    }

    public EventOrchestrationEngine1341 U(EventOrchestrationEngine1341 eventOrchestrationEngine1341) {
        EventOrchestrationEngine1341 eventOrchestrationEngine13412 = new EventOrchestrationEngine1341();
        eventOrchestrationEngine13412.E.putAll(this.E);
        eventOrchestrationEngine13412.E.putAll(eventOrchestrationEngine1341.E);
        return eventOrchestrationEngine13412;
    }

    private static boolean lambda$isNotEqual$0(Object object, Object object2) {
        boolean bl;
        try {
            bl = !object.equals(object2);
        }
        catch (CustomSystemException customSystemException) {
            throw EventOrchestrationEngine1341.a(customSystemException);
        }
        return bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void z(ConfigurationProfileResolver<?, ?> ... configurationProfileResolverArray) {
        for (Map.Entry<SecureTokenGenerator1301, Predicate<Object>> entry : this.E.entrySet()) {
            SecureTokenGenerator1301 secureTokenGenerator1301 = entry.getKey();
            secureTokenGenerator1301.l(configurationProfileResolverArray);
            for (ConfigurationProfileResolver<?, ?> configurationProfileResolver : configurationProfileResolverArray) {
                configurationProfileResolver.F(this);
            }
        }
    }

    public Map<SecureTokenGenerator1301, Predicate<Object>> V() {
        return this.E;
    }

    public static void i(String[] stringArray) {
        W = stringArray;
    }
}

