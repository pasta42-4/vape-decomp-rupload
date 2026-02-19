/*
 * Decompiled with CFR 0.152.
 */
package com.app.input;

import com.bytecode.analysis.BinaryCodeAnalyzer;
import com.bytecode.analysis.BytecodeAnalysisEngine305;
import com.bytecode.exception.BytecodeProcessingException;
import com.data.persistence.PersistenceCollectionManager;

class InputProcessor2508 {
    int F;
    InputProcessor2508 q;
    int y;

    InputProcessor2508() {
    }

    static byte[] I(byte[] byArray, InputProcessor2508 inputProcessor2508, PersistenceCollectionManager persistenceCollectionManager, BinaryCodeAnalyzer binaryCodeAnalyzer) throws BytecodeProcessingException {
        if (inputProcessor2508 != null) {
            byArray = BytecodeAnalysisEngine305.C(byArray, persistenceCollectionManager, binaryCodeAnalyzer, inputProcessor2508);
        }
        return byArray;
    }
}

