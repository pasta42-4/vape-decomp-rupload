/*
 * Decompiled with CFR 0.152.
 */
package com.collections.sequence;

import com.app.resources.ResourceLifecycleManager1543;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.sorting.comparators.IntegerSortingComparator;
import com.system.configuration.SystemConfigurationOrchestrator;
import java.util.ArrayList;
import java.util.List;

class IntegerSequenceManager {
    private final List<Integer> c = new ArrayList<Integer>();
    private final int J;
    private final int G;

    public List<Integer> S() {
        return this.c;
    }

    public IntegerSequenceManager(int n, int n2) {
        this.G = n;
        this.J = n2;
    }

    public void l() {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        List<ResourceLifecycleManager1543> list = systemConfigurationOrchestrator.t().D();
        IntegerSortingComparator integerSortingComparator = new IntegerSortingComparator(this, list);
        this.c.sort(integerSortingComparator);
    }

    static int Q(IntegerSequenceManager integerSequenceManager) {
        return integerSequenceManager.J;
    }

    public void K(int n) {
        this.c.add(n);
    }

    public int G() {
        return this.J;
    }
}

