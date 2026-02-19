/*
 * Decompiled with CFR 0.152.
 */
package com.caching.management;

import com.reflection.core.ReflectiveIntrospectionEngine;
import com.security.crypto.CryptographicSecurityManager396;
import java.awt.Color;

class CacheInvalidationStrategy2452
extends CryptographicSecurityManager396 {
    final ReflectiveIntrospectionEngine R;

    CacheInvalidationStrategy2452(ReflectiveIntrospectionEngine reflectiveIntrospectionEngine, String string, String string2, double d2, double d3, Color color, boolean bl) {
        this.R = reflectiveIntrospectionEngine;
        super(string, string2, d2, d3, color, bl);
    }

    @Override
    public double z() {
        return 8.0;
    }
}

