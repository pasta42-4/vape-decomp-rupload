/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.math.conversion;

import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.security.encoding.SecurityEncodingDescriptor;
import org.jetbrains.annotations.Nullable;

public class NumericTransformationEngine1112 {
    @Nullable
    private Integer x;
    @Nullable
    private Integer R;
    @Nullable
    private Double l;
    private final SecurityEncodingDescriptor B;
    @Nullable
    private Double e;
    @Nullable
    private Integer b;
    @Nullable
    private Integer v;
    @Nullable
    private Long P;
    @Nullable
    private Double h;
    static final boolean T;

    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        block40: {
            long l;
            NetworkProtocolEncoder1013 networkProtocolEncoder10132;
            block41: {
                block37: {
                    block38: {
                        block34: {
                            block35: {
                                try {
                                    block36: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        networkProtocolEncoder1013.N(this.B);
                                                        if (this.B != SecurityEncodingDescriptor.POSITION) break block34;
                                                        if (T) break block35;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw NumericTransformationEngine1112.a(customSystemException);
                                                    }
                                                    if (this.l == null) break block36;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw NumericTransformationEngine1112.a(customSystemException);
                                                }
                                                if (this.e == null) break block36;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw NumericTransformationEngine1112.a(customSystemException);
                                            }
                                            if (this.h != null) break block35;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw NumericTransformationEngine1112.a(customSystemException);
                                        }
                                    }
                                    throw new AssertionError();
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NumericTransformationEngine1112.a(customSystemException);
                                }
                            }
                            networkProtocolEncoder1013.L(this.l);
                            networkProtocolEncoder1013.L(this.e);
                            networkProtocolEncoder1013.L(this.h);
                            break block40;
                        }
                        try {
                            block39: {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (this.B != SecurityEncodingDescriptor.BLOCK) break block37;
                                                if (T) break block38;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw NumericTransformationEngine1112.a(customSystemException);
                                            }
                                            if (this.v == null) break block39;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw NumericTransformationEngine1112.a(customSystemException);
                                        }
                                        if (this.x == null) break block39;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw NumericTransformationEngine1112.a(customSystemException);
                                    }
                                    if (this.b != null) break block38;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NumericTransformationEngine1112.a(customSystemException);
                                }
                            }
                            throw new AssertionError();
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericTransformationEngine1112.a(customSystemException);
                        }
                    }
                    networkProtocolEncoder1013.I(this.v);
                    networkProtocolEncoder1013.I(this.x);
                    networkProtocolEncoder1013.I(this.b);
                    break block40;
                }
                try {
                    block42: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (this.B != SecurityEncodingDescriptor.ENTITY) break block40;
                                            if (T) break block41;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw NumericTransformationEngine1112.a(customSystemException);
                                        }
                                        if (this.R == null) break block42;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw NumericTransformationEngine1112.a(customSystemException);
                                    }
                                    if (this.l == null) break block42;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NumericTransformationEngine1112.a(customSystemException);
                                }
                                if (this.e == null) break block42;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NumericTransformationEngine1112.a(customSystemException);
                            }
                            if (this.h != null) break block41;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericTransformationEngine1112.a(customSystemException);
                        }
                    }
                    throw new AssertionError();
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationEngine1112.a(customSystemException);
                }
            }
            try {
                networkProtocolEncoder1013.I(this.R);
                networkProtocolEncoder10132 = networkProtocolEncoder1013;
                l = this.P != null ? this.P : -1L;
            }
            catch (CustomSystemException customSystemException) {
                throw NumericTransformationEngine1112.a(customSystemException);
            }
            networkProtocolEncoder10132.Z(l);
            networkProtocolEncoder1013.L(this.l);
            networkProtocolEncoder1013.L(this.e);
            networkProtocolEncoder1013.L(this.h);
        }
    }

    public NumericTransformationEngine1112(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        block9: {
            this.B = networkProtocolEncoder1013.L(SecurityEncodingDescriptor.class);
            if (this.B == SecurityEncodingDescriptor.POSITION) {
                this.l = networkProtocolEncoder1013.U();
                this.e = networkProtocolEncoder1013.U();
                this.h = networkProtocolEncoder1013.U();
            } else {
                block10: {
                    block8: {
                        try {
                            if (this.B != SecurityEncodingDescriptor.BLOCK) break block8;
                            this.v = networkProtocolEncoder1013.e();
                            this.x = networkProtocolEncoder1013.e();
                            this.b = networkProtocolEncoder1013.e();
                            break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericTransformationEngine1112.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (this.B != SecurityEncodingDescriptor.ENTITY) break block9;
                            this.R = networkProtocolEncoder1013.e();
                            this.P = networkProtocolEncoder1013.S();
                            if (this.P != -1L) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericTransformationEngine1112.a(customSystemException);
                        }
                        this.P = null;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericTransformationEngine1112.a(customSystemException);
                    }
                }
                this.l = networkProtocolEncoder1013.U();
                this.e = networkProtocolEncoder1013.U();
                this.h = networkProtocolEncoder1013.U();
            }
        }
    }

    NumericTransformationEngine1112(double d2, double d3, double d4) {
        this.B = SecurityEncodingDescriptor.POSITION;
        this.l = d2;
        this.e = d3;
        this.h = d4;
    }

    @Nullable
    public Double s() {
        return this.l;
    }

    NumericTransformationEngine1112(int n, int n2, int n3) {
        this.B = SecurityEncodingDescriptor.BLOCK;
        this.v = n;
        this.x = n2;
        this.b = n3;
    }

    static {
        boolean bl;
        try {
            bl = !NumericTransformationEngine1112.class.desiredAssertionStatus();
        }
        catch (CustomSystemException customSystemException) {
            throw NumericTransformationEngine1112.a(customSystemException);
        }
        T = bl;
    }

    @Nullable
    public Double i() {
        return this.e;
    }

    public static NumericTransformationEngine1112 n(int n, int n2, int n3) {
        return new NumericTransformationEngine1112(n, n2, n3);
    }

    public static NumericTransformationEngine1112 J(@Nullable Long l, int n, double d2, double d3, double d4) {
        return new NumericTransformationEngine1112(l, n, d2, d3, d4);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static NumericTransformationEngine1112 V(double d2, double d3, double d4) {
        return new NumericTransformationEngine1112(d2, d3, d4);
    }

    @Nullable
    public Integer Z() {
        return this.v;
    }

    @Nullable
    public Integer Q() {
        return this.R;
    }

    @Nullable
    public Integer U() {
        return this.b;
    }

    @Nullable
    public Double M() {
        return this.h;
    }

    public SecurityEncodingDescriptor h() {
        return this.B;
    }

    @Nullable
    public Integer p() {
        return this.x;
    }

    NumericTransformationEngine1112(@Nullable Long l, int n, double d2, double d3, double d4) {
        this.B = SecurityEncodingDescriptor.ENTITY;
        this.P = l;
        this.R = n;
        this.l = d2;
        this.e = d3;
        this.h = d4;
    }

    @Nullable
    public Long W() {
        return this.P;
    }
}

