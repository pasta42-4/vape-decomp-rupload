/*
 * Decompiled with CFR 0.152.
 */
package com.vape.config;

import com.exception.system.CustomSystemException;

public class VapeConfigurationManager {
    private String v = null;
    private String A = null;

    public VapeConfigurationManager(String string) {
        this.A = string;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean Y(String string, String string2) {
        boolean bl;
        block8: {
            block6: {
                try {
                    block7: {
                        try {
                            try {
                                if (!this.A.equals(string)) break block6;
                                if (this.v == null) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw VapeConfigurationManager.a(customSystemException);
                            }
                            if (!this.v.equals(string2)) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw VapeConfigurationManager.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw VapeConfigurationManager.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public VapeConfigurationManager(String string, String string2) {
        this.A = string;
        this.v = string2;
    }
}

