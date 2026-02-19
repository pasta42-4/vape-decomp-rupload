/*
 * Decompiled with CFR 0.152.
 */
package com.system.configuration;

import a.GB;
import com.exception.system.CustomSystemException;
import com.geospatial.resolver.GeoLocationResolver;
import com.network.protocol.ProtocolNegotiationInterface;
import com.system.buffer.BufferManager;
import java.nio.ByteBuffer;

public class MultiParameterConfigurationManager
implements ProtocolNegotiationInterface {
    private String X;
    static ProtocolNegotiationInterface W;
    private int K;
    private BufferManager d;
    private boolean L;
    private int J;
    private int T;
    private float I;
    private int V;
    private float c;
    protected static GB n;
    private int N;
    private int y;

    @Override
    public void P() {
        try {
            if (W != this) {
                W = this;
                n.g(3553);
                n.F(this.V, this.K);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiParameterConfigurationManager.a(customSystemException);
        }
    }

    private void L() {
        try {
            if (this.T != 0) {
                this.c = (float)this.J / (float)this.T;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiParameterConfigurationManager.a(customSystemException);
        }
    }

    public static void T() {
        W = null;
        n.h(3553);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void y(int n) {
        this.y = n;
        this.u();
    }

    @Override
    public int I() {
        return this.y;
    }

    public void e(int n) {
        this.T = n;
        this.L();
    }

    @Override
    public int k() {
        return this.J;
    }

    static {
        n = GeoLocationResolver.Y();
    }

    private void u() {
        try {
            if (this.N != 0) {
                this.I = (float)this.y / (float)this.N;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiParameterConfigurationManager.a(customSystemException);
        }
    }

    public void l(boolean bl) {
        this.L = bl;
    }

    public void g(int n) {
        this.J = n;
        this.L();
    }

    @Override
    public float n() {
        return this.c;
    }

    protected MultiParameterConfigurationManager() {
    }

    public MultiParameterConfigurationManager(String string, int n, int n2) {
        this.V = n;
        this.X = string;
        this.K = n2;
        W = this;
    }

    @Override
    public float A() {
        return this.I;
    }

    public void O(int n, int n2, int n3, int n4, ByteBuffer byteBuffer) {
        this.d = new BufferManager(this, null);
        BufferManager.U(this.d, n);
        BufferManager.D(this.d, n2);
        BufferManager.M(this.d, n3);
        BufferManager.u(this.d, n4);
        BufferManager.h(this.d, byteBuffer);
    }

    @Override
    public int G() {
        return this.N;
    }

    public void F(int n) {
        this.N = n;
        this.u();
    }

    @Override
    public int S() {
        return this.T;
    }
}

