/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.analysis;

import com.app.bytecode.analysis.BytecodeMetadataExtractor;
import com.bytecode.analysis.BinaryCodeAnalyzer;
import com.bytecode.analysis.BytecodeInspectionUtility;
import com.bytecode.exception.BytecodeProcessingException;
import com.bytecode.processing.BytecodeExceptionHandler;
import com.data.persistence.PersistenceCollectionManager;
import com.deobfuscation.bytecode.StackMapDescriptor;

class BytecodeMetadataExtractor1871 {
    int m;
    BytecodeMetadataExtractor w;
    int i;
    BytecodeInspectionUtility M;
    StackMapDescriptor E;
    PersistenceCollectionManager n;
    BytecodeExceptionHandler l;
    int J;
    BytecodeMetadataExtractor y;
    int s;

    BytecodeMetadataExtractor1871(int n, int n2, int n3, int n4, PersistenceCollectionManager persistenceCollectionManager, BinaryCodeAnalyzer binaryCodeAnalyzer) {
        this.J = n;
        this.s = n2;
        this.m = n3;
        this.i = n4;
        this.n = persistenceCollectionManager;
        this.M = (BytecodeInspectionUtility)binaryCodeAnalyzer.G("LineNumberTable");
        this.w = (BytecodeMetadataExtractor)binaryCodeAnalyzer.G("LocalVariableTable");
        this.y = (BytecodeMetadataExtractor)binaryCodeAnalyzer.G("LocalVariableTypeTable");
        this.l = (BytecodeExceptionHandler)binaryCodeAnalyzer.G("StackMapTable");
        this.E = (StackMapDescriptor)binaryCodeAnalyzer.G("StackMap");
    }

    void u(int n, int n2, boolean bl) throws BytecodeProcessingException {
        block46: {
            block44: {
                block42: {
                    block40: {
                        try {
                            block39: {
                                try {
                                    try {
                                        if (n < this.J) break block39;
                                        if (n != this.J) break block40;
                                    }
                                    catch (BytecodeProcessingException bytecodeProcessingException) {
                                        throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
                                    }
                                    if (!bl) break block40;
                                }
                                catch (BytecodeProcessingException bytecodeProcessingException) {
                                    throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
                                }
                            }
                            this.J += n2;
                        }
                        catch (BytecodeProcessingException bytecodeProcessingException) {
                            throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
                        }
                    }
                    try {
                        block41: {
                            try {
                                try {
                                    if (n < this.s) break block41;
                                    if (n != this.s) break block42;
                                }
                                catch (BytecodeProcessingException bytecodeProcessingException) {
                                    throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
                                }
                                if (!bl) break block42;
                            }
                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
                            }
                        }
                        this.s += n2;
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
                    }
                }
                try {
                    block43: {
                        try {
                            try {
                                if (n < this.m) break block43;
                                if (n != this.m) break block44;
                            }
                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
                            }
                            if (!bl) break block44;
                        }
                        catch (BytecodeProcessingException bytecodeProcessingException) {
                            throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
                        }
                    }
                    this.m += n2;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
                }
            }
            try {
                block45: {
                    try {
                        try {
                            if (n < this.i) break block45;
                            if (n != this.i) break block46;
                        }
                        catch (BytecodeProcessingException bytecodeProcessingException) {
                            throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
                        }
                        if (!bl) break block46;
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
                    }
                }
                this.i += n2;
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
            }
        }
        try {
            this.n.t(n, n2, bl);
            if (this.M != null) {
                this.M.y(n, n2, bl);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
        }
        try {
            if (this.w != null) {
                this.w.g(n, n2, bl);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
        }
        try {
            if (this.y != null) {
                this.y.g(n, n2, bl);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
        }
        try {
            if (this.l != null) {
                this.l.X(n, n2, bl);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
        }
        try {
            if (this.E != null) {
                this.E.k(n, n2, bl);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
        }
    }

    void d(int n, int n2) throws BytecodeProcessingException {
        try {
            if (this.l != null) {
                this.l.n(n, n2);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
        }
        try {
            if (this.E != null) {
                this.E.H(n, n2);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw BytecodeMetadataExtractor1871.a(bytecodeProcessingException);
        }
    }

    private static BytecodeProcessingException a(BytecodeProcessingException bytecodeProcessingException) {
        return bytecodeProcessingException;
    }
}

