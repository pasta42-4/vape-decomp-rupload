/*
 * Decompiled with CFR 0.152.
 */
package com.app.ui.theming;

import com.deobfuscation.strategy.ExecutionStrategy;
import com.exception.system.CustomSystemException;
import com.network.core.NetworkConnectionManager2538;
import java.awt.Color;
import java.util.Set;

public class StylesheetThemeManager
implements ExecutionStrategy {
    private static int D;
    private final Color y;
    private final Set<Class> H;

    public static int e() {
        int n = StylesheetThemeManager.O();
        try {
            if (n == 0) {
                return 111;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StylesheetThemeManager.a(customSystemException);
        }
        return 0;
    }

    public StylesheetThemeManager(Set<Class> set, Color color) {
        this.H = set;
        this.y = color;
    }

    public static int O() {
        return D;
    }

    public static void m(int n) {
        D = n;
    }

    @Override
    public boolean D(NetworkConnectionManager2538 networkConnectionManager2538) {
        for (Class clazz : this.H) {
            try {
                if (!networkConnectionManager2538.B(clazz)) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw StylesheetThemeManager.a(customSystemException);
            }
        }
        return false;
    }

    @Override
    public Color E(Object object) {
        return this.y;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public StylesheetThemeManager(Set<Class> set) {
        this(set, new Color(255, 255, 255));
    }

    static {
        if (StylesheetThemeManager.e() == 0) {
            StylesheetThemeManager.m(71);
        }
    }
}

