/*
 * Decompiled with CFR 0.152.
 */
package com.app.algorithms;

import com.debugging.errors.DecompilationErrorEnum;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmOrchestrator {
    public final DecompilationErrorEnum g;
    public final GameVersionEnumerator D;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public AlgorithmOrchestrator(GameVersionEnumerator gameVersionEnumerator, DecompilationErrorEnum decompilationErrorEnum) {
        this.D = gameVersionEnumerator;
        this.g = decompilationErrorEnum;
    }

    public DecompilationErrorEnum Z() {
        return this.g;
    }

    public static List<AlgorithmOrchestrator> h(List<AlgorithmOrchestrator> list) {
        ArrayList<AlgorithmOrchestrator> arrayList = new ArrayList<AlgorithmOrchestrator>();
        for (AlgorithmOrchestrator algorithmOrchestrator : list) {
            try {
                if (algorithmOrchestrator.m()) continue;
                arrayList.add(algorithmOrchestrator);
            }
            catch (CustomSystemException customSystemException) {
                throw AlgorithmOrchestrator.a(customSystemException);
            }
        }
        return arrayList;
    }

    public boolean m() {
        return this.g.H(GameVersionEnumerator.u(), this.D.B());
    }

    public static List<AlgorithmOrchestrator> j(AlgorithmOrchestrator ... algorithmOrchestratorArray) {
        return AlgorithmOrchestrator.h(Arrays.asList(algorithmOrchestratorArray));
    }

    public GameVersionEnumerator n() {
        return this.D;
    }
}

