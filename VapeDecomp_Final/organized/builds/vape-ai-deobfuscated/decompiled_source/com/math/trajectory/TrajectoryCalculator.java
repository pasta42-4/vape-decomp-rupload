/*
 * Decompiled with CFR 0.152.
 */
package com.math.trajectory;

import a.kg;
import a.oQ;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.system.configuration.SystemConfigurationOrchestrator;

public class TrajectoryCalculator {
    private static final double X = 1.5;
    private static final double o = 0.03;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static float O(kg kg2, double d2) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        double d3 = 0.05f;
        double d4 = kg2.R() - systemConfigurationOrchestrator.F();
        double d5 = kg2.U() - systemConfigurationOrchestrator.B();
        double d6 = Math.sqrt(d4 * d4 + d5 * d5);
        double d7 = systemConfigurationOrchestrator.V();
        float f = systemConfigurationOrchestrator.E();
        double d8 = ((oQ)systemConfigurationOrchestrator.L()).c();
        double d9 = kg2.L() - systemConfigurationOrchestrator.t();
        double d10 = 2.0 * d9 * (d2 * d2);
        double d11 = d3 * (d6 * d6);
        double d12 = d11 + d10;
        double d13 = d2 * d2 * d2 * d2;
        double d14 = d3 * d12;
        double d15 = d13 - d14;
        double d16 = Math.sqrt(d15);
        double d17 = d2 * d2 + d16;
        double d18 = d2 * d2 - d16;
        double d19 = Math.atan2(d17, d3 * d6);
        double d20 = Math.atan2(d18, d3 * d6);
        float f2 = (float)(-Math.toDegrees(Math.min(d19, d20)));
        return f2;
    }

    public static float x(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8;
        double d9 = d5 - d2;
        double d10 = d7 - d4;
        double d11 = Math.sqrt(d9 * d9 + d10 * d10);
        double d12 = d6 - d3;
        double d13 = 1.5;
        double d14 = 0.03;
        double d15 = d13 * d13;
        double d16 = d15 * d15 - d14 * (d14 * (d11 * d11) + 2.0 * d12 * d15);
        try {
            if (d16 < 0.0) {
                return Float.NaN;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TrajectoryCalculator.a(customSystemException);
        }
        double d17 = Math.sqrt(d16);
        double d18 = Math.atan((d15 + d17) / (d14 * d11));
        double d19 = d8 = Math.atan((d15 - d17) / (d14 * d11));
        float f = ApplicationLifecycleManager.U().S();
        double d20 = Math.toDegrees(-d18);
        double d21 = Math.toDegrees(-d8);
        float f2 = (float)Math.abs(d20 - (double)f);
        float f3 = (float)Math.abs(d21 - (double)f);
        boolean bl = false;
        float f4 = (float)Math.toDegrees(-d19);
        return f4;
    }
}

