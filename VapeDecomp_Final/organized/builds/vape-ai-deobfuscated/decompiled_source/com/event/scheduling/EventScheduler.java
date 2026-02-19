/*
 * Decompiled with CFR 0.152.
 */
package com.event.scheduling;

import com.structure.tree.RecursiveNodeTreeBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EventScheduler {
    private final List<RecursiveNodeTreeBuilder> A;
    private boolean O = false;

    public void g(boolean bl) {
        this.O = bl;
    }

    public EventScheduler(List<RecursiveNodeTreeBuilder> list) {
        this.O = list.size() > 4;
        this.A = list;
    }

    public EventScheduler(RecursiveNodeTreeBuilder ... recursiveNodeTreeBuilderArray) {
        this.O = recursiveNodeTreeBuilderArray.length > 4;
        this.A = new ArrayList<RecursiveNodeTreeBuilder>(Arrays.asList(recursiveNodeTreeBuilderArray));
    }

    public boolean S() {
        return this.O;
    }
}

