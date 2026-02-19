/*
 * Decompiled with CFR 0.152.
 */
package com.system.configuration;

import a.Qm;
import a.oZ;
import com.app.transaction.core.TransactionOrchestrator1183;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.protocol.NetworkProtocolEncoder;
import com.security.auth.AuthorizationManager;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class SystemConfigurationOrchestrator
extends Qm {
    private static String[] r;

    public void o(String string) {
        try {
            if (GeometryCalculator.C() <= 13) {
                new TransactionOrchestrator1183(this.M()).o(string);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        NetworkProtocolEncoder.A(SystemConfigurationOrchestrator.U.u().gw, this.H, string);
    }

    public float p() {
        return NetworkProtocolEncoder.s(SystemConfigurationOrchestrator.U.u().gw, this.H);
    }

    public void a(int n) {
        try {
            if (GeometryCalculator.C() <= 13) {
                new TransactionOrchestrator1183(this.M()).e(n);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        NetworkProtocolEncoder.o(SystemConfigurationOrchestrator.U.u().gw, this.H, n);
    }

    public float Z() {
        try {
            if (GeometryCalculator.C() <= 13) {
                return new TransactionOrchestrator1183(this.M()).h();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        return NetworkProtocolEncoder.h(SystemConfigurationOrchestrator.U.u().gw, this.H);
    }

    public oZ W() {
        return new oZ(SystemConfigurationOrchestrator.U.u().gw.e(this.H));
    }

    public static String[] A() {
        return r;
    }

    public void a(double d2) {
        try {
            if (GeometryCalculator.C() <= 13) {
                new TransactionOrchestrator1183(this.M()).c(d2);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        NetworkProtocolEncoder.h(SystemConfigurationOrchestrator.U.u().gw, this.H, d2);
    }

    static {
        if (SystemConfigurationOrchestrator.A() != null) {
            SystemConfigurationOrchestrator.c(new String[1]);
        }
    }

    public void K(double d2) {
        try {
            if (GeometryCalculator.C() <= 13) {
                new TransactionOrchestrator1183(this.M()).P(d2);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        NetworkProtocolEncoder.v(SystemConfigurationOrchestrator.U.u().gw, this.H, d2);
    }

    public double Y() {
        try {
            if (GeometryCalculator.C() <= 13) {
                return new TransactionOrchestrator1183(this.M()).v();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        return NetworkProtocolEncoder.u(SystemConfigurationOrchestrator.U.u().gw, this.H);
    }

    public void i(double d2) {
        try {
            if (GeometryCalculator.C() <= 13) {
                new TransactionOrchestrator1183(this.M()).C(d2);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        NetworkProtocolEncoder.r(SystemConfigurationOrchestrator.U.u().gw, this.H, d2);
    }

    @Override
    public void X(float f) {
        try {
            if (GeometryCalculator.C() >= 23) {
                SystemConfigurationOrchestrator.U.u().gw.K(this.H, f);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        super.X(f);
    }

    public float B() {
        return NetworkProtocolEncoder.V(SystemConfigurationOrchestrator.U.u().gw, this.H);
    }

    public AuthorizationManager U() {
        try {
            if (GeometryCalculator.C() <= 13) {
                return new TransactionOrchestrator1183(this.H).U();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        return new AuthorizationManager(NetworkProtocolEncoder.A(SystemConfigurationOrchestrator.U.u().gw, this.H));
    }

    public float N() {
        return NetworkProtocolEncoder.n(SystemConfigurationOrchestrator.U.u().gw, this.H);
    }

    public float M() {
        return NetworkProtocolEncoder.E(SystemConfigurationOrchestrator.U.u().gw, this.H);
    }

    public void m(float f) {
        NetworkProtocolEncoder.b(SystemConfigurationOrchestrator.U.u().gw, this.H, f);
    }

    public float r() {
        return NetworkProtocolEncoder.y(SystemConfigurationOrchestrator.U.u().gw, this.H);
    }

    public double Z() {
        try {
            if (GeometryCalculator.C() <= 13) {
                return new TransactionOrchestrator1183(this.M()).C();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        return NetworkProtocolEncoder.K(SystemConfigurationOrchestrator.U.u().gw, this.H);
    }

    public void b(float f) {
        try {
            if (GeometryCalculator.C() <= 13) {
                new TransactionOrchestrator1183(this.M()).B(f);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        NetworkProtocolEncoder.Q(SystemConfigurationOrchestrator.U.u().gw, this.H, f);
    }

    public int N() {
        return SystemConfigurationOrchestrator.U.u().gw.p(this.H);
    }

    public double H() {
        try {
            if (GeometryCalculator.C() <= 13) {
                return new TransactionOrchestrator1183(this.M()).w();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        return NetworkProtocolEncoder.l(SystemConfigurationOrchestrator.U.u().gw, this.H);
    }

    public float R() {
        return NetworkProtocolEncoder.b(SystemConfigurationOrchestrator.U.u().gw, this.H);
    }

    public void R(float f) {
        try {
            if (GeometryCalculator.C() <= 13) {
                new TransactionOrchestrator1183(this.M()).K(f);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        NetworkProtocolEncoder.e(SystemConfigurationOrchestrator.U.u().gw, this.H, f);
    }

    public SystemConfigurationOrchestrator(Object object) {
        super(object);
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int o() {
        try {
            if (GeometryCalculator.C() >= 50) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        return SystemConfigurationOrchestrator.U.u().gw.m(this.H);
    }

    public int m() {
        try {
            if (GeometryCalculator.C() <= 13) {
                return new TransactionOrchestrator1183(this.M()).Z();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        return NetworkProtocolEncoder.k(SystemConfigurationOrchestrator.U.u().gw, this.H);
    }

    public static void c(String[] stringArray) {
        r = stringArray;
    }

    @Override
    public float u() {
        try {
            if (GeometryCalculator.C() >= 23) {
                return SystemConfigurationOrchestrator.U.u().gw.D(this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        return super.u();
    }

    public float c() {
        try {
            if (GeometryCalculator.C() <= 13) {
                return new TransactionOrchestrator1183(this.M()).P();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemConfigurationOrchestrator.b(customSystemException);
        }
        return NetworkProtocolEncoder.X(SystemConfigurationOrchestrator.U.u().gw, this.H);
    }
}

