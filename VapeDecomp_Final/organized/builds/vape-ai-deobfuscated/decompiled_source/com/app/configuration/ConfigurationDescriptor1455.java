/*
 * Decompiled with CFR 0.152.
 */
package com.app.configuration;

import com.exception.system.CustomSystemException;

public final class ConfigurationDescriptor1455 {
    private final boolean Z;
    private final String r;
    private final String U;
    private final int K;
    private final String Y;

    public ConfigurationDescriptor1455(int n, String string, String string2, String string3, boolean bl) {
        this.K = n;
        this.r = string;
        this.Y = string2;
        this.U = string3;
        this.Z = bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public String toString() {
        String string;
        StringBuilder stringBuilder;
        try {
            stringBuilder = new StringBuilder().append(this.r).append('.').append(this.Y).append(this.U).append(" (").append(this.K);
            string = this.Z ? " itf" : "";
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationDescriptor1455.a(customSystemException);
        }
        return stringBuilder.append(string).append(')').toString();
    }

    public String Q() {
        return this.Y;
    }

    public String i() {
        return this.U;
    }

    public boolean equals(Object object) {
        boolean bl;
        block17: {
            block16: {
                try {
                    if (object == this) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationDescriptor1455.a(customSystemException);
                }
                try {
                    if (!(object instanceof ConfigurationDescriptor1455)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationDescriptor1455.a(customSystemException);
                }
                ConfigurationDescriptor1455 configurationDescriptor1455 = (ConfigurationDescriptor1455)object;
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (this.K != configurationDescriptor1455.K || this.Z != configurationDescriptor1455.Z) break block16;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ConfigurationDescriptor1455.a(customSystemException);
                                }
                                if (!this.r.equals(configurationDescriptor1455.r)) break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConfigurationDescriptor1455.a(customSystemException);
                            }
                            if (!this.Y.equals(configurationDescriptor1455.Y)) break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationDescriptor1455.a(customSystemException);
                        }
                        if (!this.U.equals(configurationDescriptor1455.U)) break block16;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationDescriptor1455.a(customSystemException);
                    }
                    bl = true;
                    break block17;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationDescriptor1455.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public int K() {
        return this.K;
    }

    public int hashCode() {
        int n;
        int n2;
        try {
            n2 = this.K;
            n = this.Z ? 64 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationDescriptor1455.a(customSystemException);
        }
        return n2 + n + this.r.hashCode() * this.Y.hashCode() * this.U.hashCode();
    }

    public boolean g() {
        return this.Z;
    }

    public String D() {
        return this.r;
    }
}

