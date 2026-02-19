/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.system.configuration;

import com.exception.system.CustomSystemException;
import com.security.config.CryptographicEnumRegistry913;
import org.jetbrains.annotations.Nullable;

class GenericConfigurationResolver<T extends GenericConfigurationResolver<T>> {
    @Nullable
    private String E;
    private CryptographicEnumRegistry913 U;
    private boolean N = false;

    T E(@Nullable String string) {
        return ((GenericConfigurationResolver)this.l(CryptographicEnumRegistry913.SUCCESS)).c(string);
    }

    boolean H() {
        boolean bl;
        block10: {
            block9: {
                try {
                    block8: {
                        try {
                            try {
                                try {
                                    if (this.U == CryptographicEnumRegistry913.PENDING || this.U == CryptographicEnumRegistry913.SUCCESS) break block8;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GenericConfigurationResolver.a(customSystemException);
                                }
                                if (this.U != CryptographicEnumRegistry913.FAIL) break block9;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GenericConfigurationResolver.a(customSystemException);
                            }
                            if (!this.N) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GenericConfigurationResolver.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw GenericConfigurationResolver.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    boolean x() {
        boolean bl;
        try {
            bl = this.U == CryptographicEnumRegistry913.SUCCESS;
        }
        catch (CustomSystemException customSystemException) {
            throw GenericConfigurationResolver.a(customSystemException);
        }
        return bl;
    }

    CryptographicEnumRegistry913 z() {
        return this.U;
    }

    T l(CryptographicEnumRegistry913 cryptographicEnumRegistry913) {
        this.U = cryptographicEnumRegistry913;
        return (T)this;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    boolean M() {
        boolean bl;
        try {
            bl = this.U == CryptographicEnumRegistry913.PENDING;
        }
        catch (CustomSystemException customSystemException) {
            throw GenericConfigurationResolver.a(customSystemException);
        }
        return bl;
    }

    String w() {
        String string;
        try {
            string = this.E == null ? "" : this.E;
        }
        catch (CustomSystemException customSystemException) {
            throw GenericConfigurationResolver.a(customSystemException);
        }
        return string;
    }

    static GenericConfigurationResolver B(@Nullable String string) {
        return new GenericConfigurationResolver(CryptographicEnumRegistry913.PENDING, string);
    }

    T w() {
        this.N = true;
        return (T)this;
    }

    GenericConfigurationResolver(CryptographicEnumRegistry913 cryptographicEnumRegistry913, @Nullable String string) {
        this.U = cryptographicEnumRegistry913;
        this.E = string;
    }

    T D(@Nullable String string) {
        return ((GenericConfigurationResolver)this.l(CryptographicEnumRegistry913.PENDING)).c(string);
    }

    T i(boolean bl) {
        this.N = bl;
        return (T)this;
    }

    T V(@Nullable String string) {
        return ((GenericConfigurationResolver)this.l(CryptographicEnumRegistry913.FAIL)).c(string);
    }

    T c(@Nullable String string) {
        this.E = string;
        return (T)this;
    }

    boolean Y() {
        boolean bl;
        try {
            bl = this.U == CryptographicEnumRegistry913.FAIL;
        }
        catch (CustomSystemException customSystemException) {
            throw GenericConfigurationResolver.a(customSystemException);
        }
        return bl;
    }

    static GenericConfigurationResolver a(@Nullable String string) {
        return new GenericConfigurationResolver(CryptographicEnumRegistry913.SUCCESS, string);
    }

    static GenericConfigurationResolver r(@Nullable String string) {
        return new GenericConfigurationResolver(CryptographicEnumRegistry913.FAIL, string);
    }
}

