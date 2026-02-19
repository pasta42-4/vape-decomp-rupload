/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.data.streaming.DataStreamFilter;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.connection.ConnectionLifecycleHandler;
import com.system.resource.ResourceAllocationController;

public class NetworkConnectionManager1726
extends ConnectionLifecycleHandler {
    public double Q() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return ResourceAllocationController.x(NetworkConnectionManager1726.U.u().d9, this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1726.a(customSystemException);
        }
        return ResourceAllocationController.g(NetworkConnectionManager1726.U.u().d9, this.H);
    }

    public double o() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return ResourceAllocationController.Q(NetworkConnectionManager1726.U.u().d9, this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1726.a(customSystemException);
        }
        return ResourceAllocationController.e(NetworkConnectionManager1726.U.u().d9, this.H);
    }

    public String a() {
        try {
            if (GeometryCalculator.C() >= 15) {
                return new DataStreamFilter(ResourceAllocationController.r(NetworkConnectionManager1726.U.u().d9, this.H)).x();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1726.a(customSystemException);
        }
        return ResourceAllocationController.U(NetworkConnectionManager1726.U.u().d9, this.H);
    }

    public double P() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return ResourceAllocationController.d(NetworkConnectionManager1726.U.u().d9, this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1726.a(customSystemException);
        }
        return ResourceAllocationController.Z(NetworkConnectionManager1726.U.u().d9, this.H);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public NetworkConnectionManager1726(Object object) {
        super(object);
    }
}

