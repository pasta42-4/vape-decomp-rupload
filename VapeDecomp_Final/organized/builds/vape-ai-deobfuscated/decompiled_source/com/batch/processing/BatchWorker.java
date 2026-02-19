/*
 * Decompiled with CFR 0.152.
 */
package com.batch.processing;

import com.data.processing.CollectionFilterProcessor;
import com.module.configuration.ModuleConfigurationRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BatchWorker
extends CollectionFilterProcessor {
    private final List<Integer> E;

    @Override
    public boolean v() {
        return false;
    }

    public BatchWorker() {
        this.E(new ArrayList<Integer>());
        ModuleConfigurationRegistry.c(this);
        this.E = new ArrayList<Integer>(this.Z());
    }

    public BatchWorker(int n) {
        this.E(Arrays.asList(n));
        ModuleConfigurationRegistry.c(this);
        this.E = new ArrayList<Integer>(this.Z());
    }

    public BatchWorker(List<Integer> list, boolean bl) {
        this.E(list);
        if (bl) {
            ModuleConfigurationRegistry.c(this);
        }
        this.E = new ArrayList<Integer>(this.Z());
    }

    @Override
    public String D() {
        return this.t();
    }

    @Override
    public void G() {
    }

    public List<Integer> f() {
        return this.E;
    }
}

