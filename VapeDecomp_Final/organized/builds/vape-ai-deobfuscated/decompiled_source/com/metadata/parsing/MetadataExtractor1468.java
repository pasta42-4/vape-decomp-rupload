/*
 * Decompiled with CFR 0.152.
 */
package com.metadata.parsing;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.data.tagging.TagIdentificationService;
import com.reflection.metadata.ClassMetadataExtractor654;
import com.resource.core.BaseResourceManager;
import com.system.configuration.AbstractBaseConfiguration;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class MetadataExtractor1468
extends ClassMetadataExtractor654 {
    public MetadataExtractor1468(BytecodeAnalyzer bytecodeAnalyzer, byte[] byArray) {
        super(bytecodeAnalyzer, "AnnotationDefault", byArray);
    }

    MetadataExtractor1468(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }

    public String toString() {
        return this.T().toString();
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        AbstractBaseConfiguration abstractBaseConfiguration = new AbstractBaseConfiguration(this.b, this.D, bytecodeAnalyzer, map);
        try {
            abstractBaseConfiguration.L(0);
            return new MetadataExtractor1468(bytecodeAnalyzer, abstractBaseConfiguration.S());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.toString());
        }
    }

    public BaseResourceManager T() {
        try {
            return new TagIdentificationService(this.b, this.D).y();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.toString());
        }
    }
}

