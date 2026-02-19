/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.analysis;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ClassMetadataExtractor654;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class ClassInitializationTracker
extends ClassMetadataExtractor654 {
    public ClassInitializationTracker(BytecodeAnalyzer bytecodeAnalyzer, String string, String string2, String string3) {
        super(bytecodeAnalyzer, "EnclosingMethod");
        int n = bytecodeAnalyzer.l(string);
        int n2 = bytecodeAnalyzer.U(string2, string3);
        byte[] byArray = new byte[]{(byte)(n >>> 8), (byte)n, (byte)(n2 >>> 8), (byte)n2};
        this.p(byArray);
    }

    public String w() {
        BytecodeAnalyzer bytecodeAnalyzer = this.K();
        int n = this.o();
        try {
            if (n == 0) {
                return "<clinit>";
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassInitializationTracker.a(customSystemException);
        }
        int n2 = bytecodeAnalyzer.O(n);
        return bytecodeAnalyzer.Z(n2);
    }

    public String s() {
        return this.K().u(this.b());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    ClassInitializationTracker(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }

    public String j() {
        BytecodeAnalyzer bytecodeAnalyzer = this.K();
        int n = this.o();
        int n2 = bytecodeAnalyzer.m(n);
        return bytecodeAnalyzer.Z(n2);
    }

    public int b() {
        return ConfigurationManager2137.M(this.p(), 0);
    }

    public int o() {
        return ConfigurationManager2137.M(this.p(), 2);
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        try {
            if (this.o() == 0) {
                return new ClassInitializationTracker(bytecodeAnalyzer, this.s());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassInitializationTracker.a(customSystemException);
        }
        return new ClassInitializationTracker(bytecodeAnalyzer, this.s(), this.w(), this.j());
    }

    public ClassInitializationTracker(BytecodeAnalyzer bytecodeAnalyzer, String string) {
        super(bytecodeAnalyzer, "EnclosingMethod");
        int n = bytecodeAnalyzer.l(string);
        int n2 = 0;
        byte[] byArray = new byte[]{(byte)(n >>> 8), (byte)n, (byte)(n2 >>> 8), (byte)n2};
        this.p(byArray);
    }
}

