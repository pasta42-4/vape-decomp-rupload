/*
 * Decompiled with CFR 0.152.
 */
package com.asset.management;

import com.app.ui.theming.StylesheetThemeManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import java.awt.Color;
import java.util.Collections;
import java.util.HashSet;

public class AssetLifecycleManager
extends StylesheetThemeManager {
    public AssetLifecycleManager() {
        super(new HashSet<Class>(Collections.singletonList(ReflectionMetadataResolver.UL)), new Color(255, 0, 0));
    }

    @Override
    public float r() {
        return 0.25f;
    }

    @Override
    public float Y() {
        return 0.5f;
    }
}

