/*
 * Decompiled with CFR 0.152.
 */
package com.app.models;

import com.app.configuration.ConfigurationDescriptor1455;
import com.exception.system.CustomSystemException;
import java.util.Arrays;

public final class EntityDescriptor {
    private final Object[] L;
    private final ConfigurationDescriptor1455 K;
    private final String M;
    private final String b;

    public ConfigurationDescriptor1455 u() {
        return this.K;
    }

    public EntityDescriptor(String string, String string2, ConfigurationDescriptor1455 configurationDescriptor1455, Object ... objectArray) {
        this.M = string;
        this.b = string2;
        this.K = configurationDescriptor1455;
        this.L = objectArray;
    }

    Object[] a() {
        return this.L;
    }

    public String x() {
        return this.b;
    }

    public boolean equals(Object object) {
        boolean bl;
        block15: {
            block14: {
                try {
                    if (object == this) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EntityDescriptor.a(customSystemException);
                }
                try {
                    if (!(object instanceof EntityDescriptor)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EntityDescriptor.a(customSystemException);
                }
                EntityDescriptor entityDescriptor = (EntityDescriptor)object;
                try {
                    try {
                        try {
                            try {
                                if (!this.M.equals(entityDescriptor.M) || !this.b.equals(entityDescriptor.b)) break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EntityDescriptor.a(customSystemException);
                            }
                            if (!this.K.equals(entityDescriptor.K)) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EntityDescriptor.a(customSystemException);
                        }
                        if (!Arrays.equals(this.L, entityDescriptor.L)) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EntityDescriptor.a(customSystemException);
                    }
                    bl = true;
                    break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw EntityDescriptor.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public String toString() {
        return this.M + " : " + this.b + ' ' + this.K + ' ' + Arrays.toString(this.L);
    }

    public int hashCode() {
        return this.M.hashCode() ^ Integer.rotateLeft(this.b.hashCode(), 8) ^ Integer.rotateLeft(this.K.hashCode(), 16) ^ Integer.rotateLeft(Arrays.hashCode(this.L), 24);
    }

    public String G() {
        return this.M;
    }
}

