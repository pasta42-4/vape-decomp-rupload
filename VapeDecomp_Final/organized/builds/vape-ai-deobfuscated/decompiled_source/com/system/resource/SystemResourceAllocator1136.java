/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.core.computation.AbstractComputationKernel;
import com.data.encoding.NumericEncodingSpecification;
import com.exception.system.CustomSystemException;
import com.security.protocols.CryptoProtocolEnum;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class SystemResourceAllocator1136 {
    private int Y;
    private int H;
    private NumericEncodingSpecification g;
    private int t;
    private CryptoProtocolEnum h = CryptoProtocolEnum.NONE;
    private int O;
    private boolean E;
    private boolean k = true;
    private boolean u;
    private static AbstractComputationKernel[] A;
    private boolean M;

    public void r(int n) {
        this.Y = n;
        this.g = NumericEncodingSpecification.OFFSET;
    }

    public void m(CryptoProtocolEnum cryptoProtocolEnum) {
        this.h = cryptoProtocolEnum;
    }

    public void e(boolean bl) {
        this.k = bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public SystemResourceAllocator1136() {
        this.g = NumericEncodingSpecification.NONE;
    }

    public int a() {
        return this.O;
    }

    public boolean V() {
        return this.k;
    }

    public static void h(AbstractComputationKernel[] abstractComputationKernelArray) {
        A = abstractComputationKernelArray;
    }

    public NumericEncodingSpecification y() {
        return this.g;
    }

    public int h() {
        return this.Y;
    }

    public boolean X() {
        return this.u;
    }

    public void w(int n) {
        this.O = n;
    }

    public void e(int n) {
        this.H = n;
    }

    public static AbstractComputationKernel[] C() {
        return A;
    }

    public void y(int n) {
        this.t = n;
        this.g = NumericEncodingSpecification.OFFSET;
    }

    public void s(boolean bl) {
        this.E = bl;
    }

    public int K() {
        return this.t;
    }

    public int t() {
        return this.H;
    }

    public boolean u() {
        return this.E;
    }

    public CryptoProtocolEnum b() {
        return this.h;
    }

    static {
        if (SystemResourceAllocator1136.C() == null) {
            SystemResourceAllocator1136.h(new AbstractComputationKernel[1]);
        }
    }

    public boolean P() {
        boolean bl;
        try {
            bl = this.g != NumericEncodingSpecification.NONE;
        }
        catch (CustomSystemException customSystemException) {
            throw SystemResourceAllocator1136.a(customSystemException);
        }
        return bl;
    }

    public void u(boolean bl) {
        this.M = bl;
    }

    public boolean t() {
        return this.M;
    }

    public void C(boolean bl) {
        this.u = bl;
    }

    public void S(NumericEncodingSpecification numericEncodingSpecification) {
        this.g = numericEncodingSpecification;
    }
}

