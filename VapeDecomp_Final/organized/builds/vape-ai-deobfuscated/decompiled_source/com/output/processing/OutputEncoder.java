/*
 * Decompiled with CFR 0.152.
 */
package com.output.processing;

import a.N9;
import a.oQ;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.app.order.ranking.OrderQualityRanker;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.system.configuration.SystemConfigurationOrchestrator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OutputEncoder {
    public static N9 p() {
        double d2;
        Object object;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            if (systemConfigurationOrchestrator.Y()) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw OutputEncoder.a(customSystemException);
        }
        if (GeometryCalculator.C() >= 15) {
            object = systemConfigurationOrchestrator.L();
        } else {
            Object object2 = systemConfigurationOrchestrator.L();
            object = ((oQ)object2).h();
        }
        try {
            d2 = GeometryCalculator.C() >= 50 ? 1.0 : -1.0;
        }
        catch (CustomSystemException customSystemException) {
            throw OutputEncoder.a(customSystemException);
        }
        double d3 = d2;
        oQ oQ2 = ((oQ)object).s(0.0, d3, 0.0);
        List list = ApplicationLifecycleManager.c().v(systemConfigurationOrchestrator, oQ2);
        ArrayList<oQ> arrayList = new ArrayList<oQ>();
        for (Object e : list) {
            arrayList.add(new oQ(e));
        }
        try {
            if (arrayList.size() == 0) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw OutputEncoder.a(customSystemException);
        }
        if (arrayList.size() == 1) {
            oQ oQ3 = (oQ)arrayList.get(0);
            return N9.k(oQ3);
        }
        Collections.sort(arrayList, new OrderQualityRanker(systemConfigurationOrchestrator));
        return N9.k((oQ)arrayList.get(0));
    }

    public static void p(ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192) {
        connectionPoolOrchestrator1192.X(1);
    }

    public static void f(ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192, boolean bl) {
        OutputEncoder.r(connectionPoolOrchestrator1192, bl, true);
    }

    public static void r(ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192, boolean bl, boolean bl2) {
        try {
            ConnectionPoolOrchestrator1192.d(connectionPoolOrchestrator1192, bl);
            if (bl2) {
                ConnectionPoolOrchestrator1192.m(connectionPoolOrchestrator1192);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw OutputEncoder.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

