/*
 * Decompiled with CFR 0.152.
 */
package com.file.metadata;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.reflection.metadata.ClassMetadataExtractor654;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class SourceMetadataExtractor
extends ClassMetadataExtractor654 {
    SourceMetadataExtractor(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        return new SourceMetadataExtractor(bytecodeAnalyzer, this.T());
    }

    public SourceMetadataExtractor(BytecodeAnalyzer bytecodeAnalyzer, String string) {
        super(bytecodeAnalyzer, "SourceFile");
        int n = bytecodeAnalyzer.D(string);
        byte[] byArray = new byte[]{(byte)(n >>> 8), (byte)n};
        this.p(byArray);
    }

    public String T() {
        return this.K().Z(ConfigurationManager2137.M(this.p(), 0));
    }
}

