/*
 * Decompiled with CFR 0.152.
 */
package com.security.tokens;

import com.exception.system.CustomSystemException;
import com.network.configuration.NetworkConfigManager;

public class SecurityTokenGenerator1999 {
    long V = 0L;
    boolean R = false;
    NetworkConfigManager L = new NetworkConfigManager();

    public void N(boolean bl) {
        block3: {
            block2: {
                try {
                    if (!bl) break block2;
                    this.R = true;
                    this.L.m();
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecurityTokenGenerator1999.a(customSystemException);
                }
            }
            this.R = false;
        }
    }

    public void S(long l) {
        this.V = l;
    }

    public boolean p() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.R || this.L.m(this.V)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecurityTokenGenerator1999.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecurityTokenGenerator1999.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public long Z() {
        return this.V;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

