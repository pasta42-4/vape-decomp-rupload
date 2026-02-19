/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package com.matrix.transformation;

import com.app.algorithms.AlgorithmOrchestrator;
import com.data.streaming.DataStreamOrchestrator;
import com.runtime.context.ContextualExecutionFramework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class MatrixTransformer<T extends ContextualExecutionFramework> {
    private T j;
    @NotNull
    private final List<List<AlgorithmOrchestrator>> f = new ArrayList<List<AlgorithmOrchestrator>>();

    public MatrixTransformer<T> y(@NotNull AlgorithmOrchestrator algorithmOrchestrator) {
        this.f.add(Collections.singletonList(algorithmOrchestrator));
        return this;
    }

    public MatrixTransformer<T> r(AlgorithmOrchestrator ... algorithmOrchestratorArray) {
        this.f.add(Arrays.asList(algorithmOrchestratorArray));
        return this;
    }

    public static <T extends ContextualExecutionFramework> MatrixTransformer<T> X() {
        return new MatrixTransformer<T>();
    }

    MatrixTransformer() {
    }

    public MatrixTransformer<T> e(@NotNull T t) {
        this.j = t;
        return this;
    }

    public MatrixTransformer<T> d(@NotNull List<AlgorithmOrchestrator> list) {
        this.f.add(list);
        return this;
    }

    public void x(DataStreamOrchestrator dataStreamOrchestrator) {
        dataStreamOrchestrator.k((ContextualExecutionFramework)this.j, this.f, false);
    }
}

