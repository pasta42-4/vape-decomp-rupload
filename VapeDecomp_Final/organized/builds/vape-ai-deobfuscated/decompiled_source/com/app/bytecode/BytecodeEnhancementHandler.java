/*
 * Decompiled with CFR 0.152.
 */
package com.app.bytecode;

import com.app.core.management.ResourceAllocator2697;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ClassMetadataExtractor654;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class BytecodeEnhancementHandler
extends ClassMetadataExtractor654 {
    public BytecodeEnhancementHandler(BytecodeAnalyzer bytecodeAnalyzer, ResourceAllocator2697[] resourceAllocator2697Array) {
        super(bytecodeAnalyzer, "BootstrapMethods");
        int n = 2;
        for (int i = 0; i < resourceAllocator2697Array.length; ++i) {
            n += 4 + resourceAllocator2697Array[i].z.length * 2;
        }
        byte[] byArray = new byte[n];
        ConfigurationManager2137.e(resourceAllocator2697Array.length, byArray, 0);
        int n2 = 2;
        for (int i = 0; i < resourceAllocator2697Array.length; ++i) {
            ConfigurationManager2137.e(resourceAllocator2697Array[i].o, byArray, n2);
            ConfigurationManager2137.e(resourceAllocator2697Array[i].z.length, byArray, n2 + 2);
            int[] nArray = resourceAllocator2697Array[i].z;
            n2 += 4;
            try {
                for (int j = 0; j < nArray.length; ++j) {
                    ConfigurationManager2137.e(nArray[j], byArray, n2);
                    n2 += 2;
                }
                continue;
            }
            catch (CustomSystemException customSystemException) {
                throw BytecodeEnhancementHandler.a(customSystemException);
            }
        }
        this.p(byArray);
    }

    BytecodeEnhancementHandler(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        ResourceAllocator2697[] resourceAllocator2697Array = this.z();
        BytecodeAnalyzer bytecodeAnalyzer2 = this.K();
        for (int i = 0; i < resourceAllocator2697Array.length; ++i) {
            ResourceAllocator2697 resourceAllocator2697 = resourceAllocator2697Array[i];
            resourceAllocator2697.o = bytecodeAnalyzer2.X(resourceAllocator2697.o, bytecodeAnalyzer, map);
            try {
                for (int j = 0; j < resourceAllocator2697.z.length; ++j) {
                    resourceAllocator2697.z[j] = bytecodeAnalyzer2.X(resourceAllocator2697.z[j], bytecodeAnalyzer, map);
                }
                continue;
            }
            catch (CustomSystemException customSystemException) {
                throw BytecodeEnhancementHandler.a(customSystemException);
            }
        }
        return new BytecodeEnhancementHandler(bytecodeAnalyzer, resourceAllocator2697Array);
    }

    public ResourceAllocator2697[] z() {
        byte[] byArray = this.p();
        int n = ConfigurationManager2137.M(byArray, 0);
        ResourceAllocator2697[] resourceAllocator2697Array = new ResourceAllocator2697[n];
        int n2 = 2;
        for (int i = 0; i < n; ++i) {
            int n3 = ConfigurationManager2137.M(byArray, n2);
            int n4 = ConfigurationManager2137.M(byArray, n2 + 2);
            int[] nArray = new int[n4];
            n2 += 4;
            try {
                for (int j = 0; j < n4; ++j) {
                    nArray[j] = ConfigurationManager2137.M(byArray, n2);
                    n2 += 2;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw BytecodeEnhancementHandler.a(customSystemException);
            }
            resourceAllocator2697Array[i] = new ResourceAllocator2697(n3, nArray);
        }
        return resourceAllocator2697Array;
    }
}

