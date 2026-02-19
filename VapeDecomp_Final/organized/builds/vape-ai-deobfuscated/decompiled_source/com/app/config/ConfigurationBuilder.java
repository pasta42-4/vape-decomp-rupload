/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package com.app.config;

import com.data.organization.StringCollectionOrganizer;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class ConfigurationBuilder
extends StringCollectionOrganizer {
    private List<String> F = new ArrayList<String>();

    public void k(@NotNull List<String> list) {
        this.F = list;
        this.R("");
    }

    public ConfigurationBuilder() {
        this.R("");
    }

    @Override
    public List<String> m() {
        return this.F;
    }

    public ConfigurationBuilder(List<String> list) {
        this.F = list;
        this.R("");
    }
}

