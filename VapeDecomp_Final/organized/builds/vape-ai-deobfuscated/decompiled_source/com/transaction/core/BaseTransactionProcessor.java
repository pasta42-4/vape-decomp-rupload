/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.core;

import com.app.ui.theming.StylesheetThemeManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import java.awt.Color;
import java.util.Collections;
import java.util.HashSet;

public class BaseTransactionProcessor
extends StylesheetThemeManager {
    public BaseTransactionProcessor() {
        super(new HashSet<Class>(Collections.singleton(ReflectionMetadataResolver.F6)), new Color(255, 66, 249));
    }
}

