/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.core.event;

import com.app.crypto.processing.CipherTextProcessor;
import com.exception.system.CustomSystemException;
import com.identity.management.UniversalIdentityManager;
import com.reflection.utils.ReflectionUtilityManager680;
import com.user.identity.UserIdentityManager;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

public class EventRegistryManager {
    private final Set<UserIdentityManager> l = new HashSet<UserIdentityManager>();

    @Nullable
    public UserIdentityManager p(String string) {
        for (UserIdentityManager userIdentityManager : this.l) {
            try {
                if (!userIdentityManager.j().equals(string)) continue;
                return userIdentityManager;
            }
            catch (CustomSystemException customSystemException) {
                throw EventRegistryManager.a(customSystemException);
            }
        }
        return null;
    }

    public Set<UserIdentityManager> q() {
        return this.l;
    }

    @Nullable
    public UserIdentityManager u(ReflectionUtilityManager680 reflectionUtilityManager680) {
        for (UserIdentityManager userIdentityManager : this.l) {
            try {
                if (userIdentityManager.s().r() != reflectionUtilityManager680.r()) continue;
                return userIdentityManager;
            }
            catch (CustomSystemException customSystemException) {
                throw EventRegistryManager.a(customSystemException);
            }
        }
        return null;
    }

    public void O() {
        this.l.clear();
        CipherTextProcessor.v();
    }

    public void X(UserIdentityManager userIdentityManager) {
        this.l.add(userIdentityManager);
        CipherTextProcessor.v();
    }

    public void f(UserIdentityManager userIdentityManager) {
        this.l.remove(userIdentityManager);
        CipherTextProcessor.v();
    }

    @Nullable
    public UserIdentityManager W(UniversalIdentityManager universalIdentityManager) {
        return this.u(universalIdentityManager.d());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

