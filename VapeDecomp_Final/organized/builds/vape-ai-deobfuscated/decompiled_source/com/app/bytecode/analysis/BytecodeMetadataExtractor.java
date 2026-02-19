/*
 * Decompiled with CFR 0.152.
 */
package com.app.bytecode.analysis;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ClassMetadataExtractor654;
import com.reflection.metadata.ReflectionMetadataResolver933;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class BytecodeMetadataExtractor
extends ClassMetadataExtractor654 {
    public int U(int n) {
        return ConfigurationManager2137.M(this.b, n * 10 + 4);
    }

    public BytecodeMetadataExtractor(BytecodeAnalyzer bytecodeAnalyzer) {
        super(bytecodeAnalyzer, "LocalVariableTable", new byte[2]);
        ConfigurationManager2137.e(0, this.b, 0);
    }

    public int o() {
        return ConfigurationManager2137.M(this.b, 0);
    }

    public int E(int n) {
        return ConfigurationManager2137.M(this.b, n * 10 + 6);
    }

    public String l(int n) {
        return this.K().Z(this.K(n));
    }

    public int R(int n) {
        return ConfigurationManager2137.M(this.b, n * 10 + 2);
    }

    BytecodeMetadataExtractor(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }

    BytecodeMetadataExtractor(BytecodeAnalyzer bytecodeAnalyzer, String string, byte[] byArray) {
        super(bytecodeAnalyzer, string, byArray);
    }

    public void D(int n, int n2, int n3, int n4, int n5) {
        int n6 = this.b.length;
        byte[] byArray = new byte[n6 + 10];
        ConfigurationManager2137.e(this.o() + 1, byArray, 0);
        try {
            for (int i = 2; i < n6; ++i) {
                byArray[i] = this.b[i];
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeMetadataExtractor.a(customSystemException);
        }
        ConfigurationManager2137.e(n, byArray, n6);
        ConfigurationManager2137.e(n2, byArray, n6 + 2);
        ConfigurationManager2137.e(n3, byArray, n6 + 4);
        ConfigurationManager2137.e(n4, byArray, n6 + 6);
        ConfigurationManager2137.e(n5, byArray, n6 + 8);
        this.b = byArray;
    }

    public String T(int n) {
        return this.K().Z(this.E(n));
    }

    void g(int n, int n2, boolean bl) {
        int n3 = this.o();
        for (int i = 0; i < n3; ++i) {
            int n4;
            int n5;
            int n6;
            block16: {
                n6 = i * 10 + 2;
                n5 = ConfigurationManager2137.M(this.b, n6);
                n4 = ConfigurationManager2137.M(this.b, n6 + 2);
                try {
                    block15: {
                        try {
                            try {
                                try {
                                    if (n5 > n) break block15;
                                    if (!bl) break block16;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw BytecodeMetadataExtractor.a(customSystemException);
                                }
                                if (n5 != n) break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw BytecodeMetadataExtractor.a(customSystemException);
                            }
                            if (n5 == 0) break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw BytecodeMetadataExtractor.a(customSystemException);
                        }
                    }
                    ConfigurationManager2137.e(n5 + n2, this.b, n6);
                    continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw BytecodeMetadataExtractor.a(customSystemException);
                }
            }
            try {
                block17: {
                    try {
                        try {
                            if (n5 + n4 > n) break block17;
                            if (!bl) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw BytecodeMetadataExtractor.a(customSystemException);
                        }
                        if (n5 + n4 != n) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw BytecodeMetadataExtractor.a(customSystemException);
                    }
                }
                ConfigurationManager2137.e(n4 + n2, this.b, n6 + 2);
                continue;
            }
            catch (CustomSystemException customSystemException) {
                throw BytecodeMetadataExtractor.a(customSystemException);
            }
        }
    }

    public int K(int n) {
        return ConfigurationManager2137.M(this.b, n * 10 + 8);
    }

    public int z(int n) {
        return ConfigurationManager2137.M(this.b, n * 10 + 10);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        byte[] byArray = this.p();
        byte[] byArray2 = new byte[byArray.length];
        BytecodeAnalyzer bytecodeAnalyzer2 = this.K();
        BytecodeMetadataExtractor bytecodeMetadataExtractor = this.f(bytecodeAnalyzer, byArray2);
        int n = ConfigurationManager2137.M(byArray, 0);
        ConfigurationManager2137.e(n, byArray2, 0);
        int n2 = 2;
        for (int i = 0; i < n; ++i) {
            int n3 = ConfigurationManager2137.M(byArray, n2);
            int n4 = ConfigurationManager2137.M(byArray, n2 + 2);
            int n5 = ConfigurationManager2137.M(byArray, n2 + 4);
            int n6 = ConfigurationManager2137.M(byArray, n2 + 6);
            int n7 = ConfigurationManager2137.M(byArray, n2 + 8);
            ConfigurationManager2137.e(n3, byArray2, n2);
            ConfigurationManager2137.e(n4, byArray2, n2 + 2);
            if (n5 != 0) {
                n5 = bytecodeAnalyzer2.X(n5, bytecodeAnalyzer, null);
            }
            ConfigurationManager2137.e(n5, byArray2, n2 + 4);
            if (n6 != 0) {
                String string = bytecodeAnalyzer2.Z(n6);
                string = ReflectionMetadataResolver933.z(string, map);
                n6 = bytecodeAnalyzer.D(string);
            }
            ConfigurationManager2137.e(n6, byArray2, n2 + 6);
            ConfigurationManager2137.e(n7, byArray2, n2 + 8);
            n2 += 10;
        }
        return bytecodeMetadataExtractor;
    }

    BytecodeMetadataExtractor f(BytecodeAnalyzer bytecodeAnalyzer, byte[] byArray) {
        return new BytecodeMetadataExtractor(bytecodeAnalyzer, "LocalVariableTable", byArray);
    }
}

