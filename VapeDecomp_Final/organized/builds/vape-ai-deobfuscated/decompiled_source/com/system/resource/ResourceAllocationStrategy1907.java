/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.auth.tracking.AuthenticationStateTracker;
import com.exception.system.CustomSystemException;
import com.multimedia.streaming.MultimediaStreamHandler;
import com.security.cipher.AdaptiveCipherEngine;

class ResourceAllocationStrategy1907
extends AdaptiveCipherEngine {
    final MultimediaStreamHandler XP;
    final AuthenticationStateTracker[] XA;

    @Override
    public void d() {
        block12: {
            int n;
            block11: {
                super.d();
                n = 0;
                for (AuthenticationStateTracker authenticationStateTracker : this.XA) {
                    try {
                        if (!authenticationStateTracker.s().booleanValue()) continue;
                        ++n;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationStrategy1907.b(customSystemException);
                    }
                }
                try {
                    try {
                        if (n <= 0 || !this.j()) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationStrategy1907.b(customSystemException);
                    }
                    this.c(false);
                    break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationStrategy1907.b(customSystemException);
                }
            }
            try {
                try {
                    if (n != 0 || this.j()) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationStrategy1907.b(customSystemException);
                }
                this.c(true);
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationStrategy1907.b(customSystemException);
            }
        }
    }

    @Override
    public void Z() {
        boolean bl;
        boolean bl2 = this.j();
        try {
            bl = !bl2;
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationStrategy1907.b(customSystemException);
        }
        boolean bl3 = bl;
        super.Z();
        for (AuthenticationStateTracker authenticationStateTracker : this.XA) {
            boolean bl4;
            AuthenticationStateTracker authenticationStateTracker2;
            try {
                authenticationStateTracker2 = authenticationStateTracker;
                bl4 = !bl3;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationStrategy1907.b(customSystemException);
            }
            authenticationStateTracker2.H(bl4);
        }
    }

    ResourceAllocationStrategy1907(MultimediaStreamHandler multimediaStreamHandler, String string, double d2, AuthenticationStateTracker authenticationStateTracker, AuthenticationStateTracker[] authenticationStateTrackerArray) {
        this.XP = multimediaStreamHandler;
        this.XA = authenticationStateTrackerArray;
        super(string, d2, authenticationStateTracker);
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

