/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import com.concurrency.filtering.ConcurrentFilteringCoordinator;
import com.data.transformation.TransformationEngine1757;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

public class EventDispatchQueue2150 {
    public static final Stack<TransformationEngine1757> W = new Stack();

    public static void N(TransformationEngine1757 transformationEngine1757) {
        W.push(transformationEngine1757);
    }

    public static TransformationEngine1757 J(int n, int n2, int n3, int n4, ConcurrentFilteringCoordinator concurrentFilteringCoordinator, AtomicBoolean atomicBoolean, int n5) {
        if (!W.isEmpty()) {
            TransformationEngine1757 transformationEngine1757 = W.pop();
            transformationEngine1757.R(n, n2, n3, n4, concurrentFilteringCoordinator, atomicBoolean, n5);
            return transformationEngine1757;
        }
        return new TransformationEngine1757(n, n2, n3, n4, concurrentFilteringCoordinator, atomicBoolean, n5);
    }
}

