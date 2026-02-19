/*
 * Decompiled with CFR 0.152.
 */
package com.core.comparison;

import com.exception.system.CustomSystemException;
import com.system.configuration.SystemConfigurationManager2161;
import java.util.Comparator;

public class EntityComparationStrategy
implements Comparator<SystemConfigurationManager2161> {
    int B;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public EntityComparationStrategy(int n) {
        this.B = n;
    }

    public int f(SystemConfigurationManager2161 systemConfigurationManager2161, SystemConfigurationManager2161 systemConfigurationManager21612) {
        int n;
        int n2 = this.B;
        int n3 = systemConfigurationManager2161.y();
        int n4 = systemConfigurationManager21612.y();
        int n5 = n3 > n2 ? n3 - n2 : n2 - n3;
        int n6 = n4 > n2 ? n4 - n2 : n2 - n4;
        try {
            n = n5 < n6 ? -1 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw EntityComparationStrategy.a(customSystemException);
        }
        return n;
    }
}

