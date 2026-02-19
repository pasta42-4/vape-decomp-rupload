/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import com.game.configuration.GameVersionEnumerator;
import com.system.resource.ResourceAllocationManager1058;
import java.util.LinkedHashMap;
import java.util.Map;

public class MultiformatDataTransformer {
    private GameVersionEnumerator t;
    private String z;
    private final Map<GameVersionEnumerator, Integer> y = new LinkedHashMap<GameVersionEnumerator, Integer>();
    private Short q;

    public MultiformatDataTransformer b(GameVersionEnumerator gameVersionEnumerator) {
        this.t = gameVersionEnumerator;
        return this;
    }

    static String E(MultiformatDataTransformer multiformatDataTransformer) {
        return multiformatDataTransformer.z;
    }

    public MultiformatDataTransformer L(short s2) {
        this.q = s2;
        return this;
    }

    static Map z(MultiformatDataTransformer multiformatDataTransformer) {
        return multiformatDataTransformer.y;
    }

    public MultiformatDataTransformer I(String string) {
        this.z = string;
        return this;
    }

    public MultiformatDataTransformer D(GameVersionEnumerator gameVersionEnumerator, int n) {
        this.y.put(gameVersionEnumerator, n);
        return this;
    }

    static GameVersionEnumerator o(MultiformatDataTransformer multiformatDataTransformer) {
        return multiformatDataTransformer.t;
    }

    static Short B(MultiformatDataTransformer multiformatDataTransformer) {
        return multiformatDataTransformer.q;
    }

    MultiformatDataTransformer() {
    }

    public ResourceAllocationManager1058 l() {
        return new ResourceAllocationManager1058(this);
    }
}

