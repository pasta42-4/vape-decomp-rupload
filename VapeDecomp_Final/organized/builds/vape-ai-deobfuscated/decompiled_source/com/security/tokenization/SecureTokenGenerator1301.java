/*
 * Decompiled with CFR 0.152.
 */
package com.security.tokenization;

import com.configuration.resolver.ConfigurationProfileResolver;
import com.event.processing.EventOrchestrationEngine1341;
import com.exception.system.CustomSystemException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class SecureTokenGenerator1301<K, T extends SecureTokenGenerator1301<K, T>>
extends ConfigurationProfileResolver<K, T> {
    private final List<ConfigurationProfileResolver> X = new ArrayList<ConfigurationProfileResolver>();
    private static String S;

    public SecureTokenGenerator1301(Object object, String string, K k) {
        super(object, string, k);
    }

    public abstract boolean y();

    public ConfigurationProfileResolver Z() {
        for (ConfigurationProfileResolver configurationProfileResolver : this.w()) {
            block8: {
                block9: {
                    try {
                        if (!configurationProfileResolver.equals(this.w().get(this.w().size() - 1))) continue;
                        if (!(configurationProfileResolver instanceof SecureTokenGenerator1301)) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecureTokenGenerator1301.a(customSystemException);
                    }
                    SecureTokenGenerator1301 secureTokenGenerator1301 = (SecureTokenGenerator1301)configurationProfileResolver;
                    try {
                        if (secureTokenGenerator1301.w().isEmpty() || !secureTokenGenerator1301.y()) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecureTokenGenerator1301.a(customSystemException);
                    }
                    ConfigurationProfileResolver configurationProfileResolver2 = secureTokenGenerator1301.w().get(secureTokenGenerator1301.w().size() - 1);
                    try {
                        if (!secureTokenGenerator1301.w().isEmpty()) {
                            return secureTokenGenerator1301.Z();
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecureTokenGenerator1301.a(customSystemException);
                    }
                    return configurationProfileResolver2;
                }
                return configurationProfileResolver;
            }
            return configurationProfileResolver;
        }
        return null;
    }

    private static boolean lambda$condNotEquals$0(Object object, Object object2) {
        boolean bl;
        try {
            bl = !object2.equals(object);
        }
        catch (CustomSystemException customSystemException) {
            throw SecureTokenGenerator1301.a(customSystemException);
        }
        return bl;
    }

    public T l(ConfigurationProfileResolver<?, ?> ... configurationProfileResolverArray) {
        for (ConfigurationProfileResolver<?, ?> configurationProfileResolver : configurationProfileResolverArray) {
            configurationProfileResolver.k(this);
            configurationProfileResolver.e(this);
        }
        this.X.addAll(Arrays.asList(configurationProfileResolverArray));
        return (T)this;
    }

    public EventOrchestrationEngine1341 c(K k) {
        return new EventOrchestrationEngine1341().e(this, arg_0 -> SecureTokenGenerator1301.lambda$condNotEquals$0(k, arg_0));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public List<ConfigurationProfileResolver> w() {
        return this.X;
    }

    static {
        if (SecureTokenGenerator1301.Z() != null) {
            SecureTokenGenerator1301.v("GbD7fb");
        }
    }

    public static void v(String string) {
        S = string;
    }

    public EventOrchestrationEngine1341 i(K k) {
        return new EventOrchestrationEngine1341().L(this, k);
    }

    public static String Z() {
        return S;
    }

    public abstract boolean j(ConfigurationProfileResolver var1);
}

