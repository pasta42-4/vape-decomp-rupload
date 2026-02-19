/*
 * Decompiled with CFR 0.152.
 */
package com.financial.transaction;

import com.app.utils.UniversalIdentityComparator;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.data.tagging.TagIdentificationService;
import com.reflection.metadata.ClassMetadataExtractor654;
import com.system.configuration.AbstractBaseConfiguration;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class TransactionRecorder
extends ClassMetadataExtractor654 {
    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        AbstractBaseConfiguration abstractBaseConfiguration = new AbstractBaseConfiguration(this.b, this.D, bytecodeAnalyzer, map);
        try {
            abstractBaseConfiguration.K();
            return new TransactionRecorder(bytecodeAnalyzer, this.n(), abstractBaseConfiguration.S());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public TransactionRecorder(BytecodeAnalyzer bytecodeAnalyzer, String string, byte[] byArray) {
        super(bytecodeAnalyzer, string, byArray);
    }

    public String toString() {
        UniversalIdentityComparator[] universalIdentityComparatorArray = this.p();
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        while (true) {
            block4: {
                try {
                    while (n < universalIdentityComparatorArray.length) {
                        stringBuilder.append(universalIdentityComparatorArray[n++].toString());
                        if (n == universalIdentityComparatorArray.length) continue;
                        break block4;
                    }
                    break;
                }
                catch (RuntimeException runtimeException) {
                    throw TransactionRecorder.a(runtimeException);
                }
            }
            stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }

    public UniversalIdentityComparator[] p() {
        try {
            return new TagIdentificationService(this.b, this.D).A();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    TransactionRecorder(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }
}

