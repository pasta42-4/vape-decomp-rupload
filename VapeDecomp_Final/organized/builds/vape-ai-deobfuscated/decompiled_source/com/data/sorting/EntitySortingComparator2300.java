/*
 * Decompiled with CFR 0.152.
 */
package com.data.sorting;

import com.system.orchestration.SystemOrchestrationManager;
import java.util.Comparator;

class EntitySortingComparator2300
implements Comparator<SystemOrchestrationManager> {
    final SystemOrchestrationManager C;

    EntitySortingComparator2300(SystemOrchestrationManager systemOrchestrationManager) {
        this.C = systemOrchestrationManager;
    }

    public int U(SystemOrchestrationManager systemOrchestrationManager, SystemOrchestrationManager systemOrchestrationManager2) {
        return (int)systemOrchestrationManager.W() - (int)systemOrchestrationManager2.W();
    }
}

