/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.analysis;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;
import com.network.performance.TransmissionRateManager;
import com.reflection.metadata.ClassMetadataExtractor654;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class BytecodeInspectionUtility
extends ClassMetadataExtractor654 {
    BytecodeInspectionUtility(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        byte[] byArray = this.b;
        int n = byArray.length;
        byte[] byArray2 = new byte[n];
        try {
            for (int i = 0; i < n; ++i) {
                byArray2[i] = byArray[i];
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeInspectionUtility.a(customSystemException);
        }
        BytecodeInspectionUtility bytecodeInspectionUtility = new BytecodeInspectionUtility(bytecodeAnalyzer, byArray2);
        return bytecodeInspectionUtility;
    }

    public int b() {
        return ConfigurationManager2137.M(this.b, 0);
    }

    public int m(int n) {
        int n2 = this.b();
        int n3 = 0;
        while (true) {
            block7: {
                try {
                    try {
                        try {
                            if (n3 >= n2) break;
                            if (n >= this.C(n3)) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw BytecodeInspectionUtility.a(customSystemException);
                        }
                        if (n3 != 0) break;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw BytecodeInspectionUtility.a(customSystemException);
                    }
                    return this.h(0);
                }
                catch (CustomSystemException customSystemException) {
                    throw BytecodeInspectionUtility.a(customSystemException);
                }
            }
            ++n3;
        }
        return this.h(n3 - 1);
    }

    public int C(int n) {
        return ConfigurationManager2137.M(this.b, n * 4 + 2);
    }

    public int h(int n) {
        return ConfigurationManager2137.M(this.b, n * 4 + 4);
    }

    public TransmissionRateManager B(int n) {
        int n2 = this.b();
        int n3 = 0;
        int n4 = 0;
        if (n2 > 0) {
            n4 = this.h(0) - n;
            n3 = this.C(0);
        }
        for (int i = 1; i < n2; ++i) {
            int n5;
            block10: {
                n5 = this.h(i) - n;
                try {
                    try {
                        try {
                            try {
                                if (n5 < 0 && n5 > n4) break block10;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw BytecodeInspectionUtility.a(customSystemException);
                            }
                            if (n5 < 0) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw BytecodeInspectionUtility.a(customSystemException);
                        }
                        if (n5 < n4) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw BytecodeInspectionUtility.a(customSystemException);
                    }
                    if (n4 >= 0) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw BytecodeInspectionUtility.a(customSystemException);
                }
            }
            n4 = n5;
            n3 = this.C(i);
        }
        TransmissionRateManager transmissionRateManager = new TransmissionRateManager();
        transmissionRateManager.n = n3;
        transmissionRateManager.u = n + n4;
        return transmissionRateManager;
    }

    private BytecodeInspectionUtility(BytecodeAnalyzer bytecodeAnalyzer, byte[] byArray) {
        super(bytecodeAnalyzer, "LineNumberTable", byArray);
    }

    void y(int n, int n2, boolean bl) {
        int n3 = this.b();
        for (int i = 0; i < n3; ++i) {
            int n4 = i * 4 + 2;
            int n5 = ConfigurationManager2137.M(this.b, n4);
            try {
                block7: {
                    try {
                        try {
                            if (n5 > n) break block7;
                            if (!bl) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw BytecodeInspectionUtility.a(customSystemException);
                        }
                        if (n5 != n) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw BytecodeInspectionUtility.a(customSystemException);
                    }
                }
                ConfigurationManager2137.e(n5 + n2, this.b, n4);
                continue;
            }
            catch (CustomSystemException customSystemException) {
                throw BytecodeInspectionUtility.a(customSystemException);
            }
        }
    }
}

