/*
 * Decompiled with CFR 0.152.
 */
package com.system.configuration;

import com.bytecode.exception.BytecodeProcessingException;
import com.exception.system.CustomSystemException;

abstract class ConfigurationManager2254 {
    int R;
    int p;

    abstract int g(int var1, byte[] var2, int var3, byte[] var4) throws BytecodeProcessingException;

    ConfigurationManager2254(int n) {
        this.p = this.R = n;
    }

    void w(int n, int n2, boolean bl) {
        block7: {
            try {
                block6: {
                    try {
                        try {
                            if (n < this.p) break block6;
                            if (n != this.p) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationManager2254.b(customSystemException);
                        }
                        if (!bl) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationManager2254.b(customSystemException);
                    }
                }
                this.p += n2;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationManager2254.b(customSystemException);
            }
        }
    }

    int S() {
        return 0;
    }

    static int g(int n, int n2, int n3, int n4, boolean bl) {
        block18: {
            block21: {
                int n5;
                block19: {
                    block20: {
                        block16: {
                            block17: {
                                n5 = n + n2;
                                try {
                                    try {
                                        try {
                                            if (n >= n3) break block16;
                                            if (n3 < n5) break block17;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ConfigurationManager2254.b(customSystemException);
                                        }
                                        if (!bl) break block18;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ConfigurationManager2254.b(customSystemException);
                                    }
                                    if (n3 != n5) break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ConfigurationManager2254.b(customSystemException);
                                }
                            }
                            n2 += n4;
                            break block18;
                        }
                        try {
                            try {
                                if (n != n3) break block19;
                                if (n5 >= n3) break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConfigurationManager2254.b(customSystemException);
                            }
                            if (!bl) break block20;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationManager2254.b(customSystemException);
                        }
                        n2 -= n4;
                        break block18;
                    }
                    try {
                        if (n3 >= n5 || bl) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationManager2254.b(customSystemException);
                    }
                    n2 += n4;
                    break block18;
                }
                try {
                    try {
                        if (n5 < n3) break block21;
                        if (bl) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationManager2254.b(customSystemException);
                    }
                    if (n3 != n5) break block18;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager2254.b(customSystemException);
                }
            }
            n2 -= n4;
        }
        return n2;
    }

    boolean t() {
        return false;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    int W() {
        return 0;
    }
}

