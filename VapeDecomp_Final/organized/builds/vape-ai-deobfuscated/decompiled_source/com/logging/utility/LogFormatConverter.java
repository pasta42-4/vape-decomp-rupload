/*
 * Decompiled with CFR 0.152.
 */
package com.logging.utility;

import com.app.utils.UniversalIdentityComparator;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.data.tagging.TagIdentificationService;
import com.reflection.metadata.ClassMetadataExtractor654;
import com.system.configuration.AbstractBaseConfiguration;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class LogFormatConverter
extends ClassMetadataExtractor654 {
    public String toString() {
        UniversalIdentityComparator[][] universalIdentityComparatorArray = this.H();
        StringBuilder stringBuilder = new StringBuilder();
        UniversalIdentityComparator[][] universalIdentityComparatorArray2 = universalIdentityComparatorArray;
        int n = universalIdentityComparatorArray2.length;
        for (int i = 0; i < n; ++i) {
            UniversalIdentityComparator[] universalIdentityComparatorArray3;
            for (UniversalIdentityComparator universalIdentityComparator : universalIdentityComparatorArray3 = universalIdentityComparatorArray2[i]) {
                stringBuilder.append(universalIdentityComparator.toString()).append(' ');
            }
            stringBuilder.append(", ");
        }
        return stringBuilder.toString().replaceAll(" (?=,)|, $", "");
    }

    public UniversalIdentityComparator[][] H() {
        try {
            return new TagIdentificationService(this.b, this.D).C();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.toString());
        }
    }

    public LogFormatConverter(BytecodeAnalyzer bytecodeAnalyzer, String string, byte[] byArray) {
        super(bytecodeAnalyzer, string, byArray);
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        AbstractBaseConfiguration abstractBaseConfiguration = new AbstractBaseConfiguration(this.b, this.D, bytecodeAnalyzer, map);
        try {
            abstractBaseConfiguration.X();
            return new LogFormatConverter(bytecodeAnalyzer, this.n(), abstractBaseConfiguration.S());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.toString());
        }
    }

    LogFormatConverter(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }
}

