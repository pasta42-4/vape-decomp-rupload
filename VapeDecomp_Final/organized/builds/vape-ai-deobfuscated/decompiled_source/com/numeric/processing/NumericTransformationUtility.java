/*
 * Decompiled with CFR 0.152.
 */
package com.numeric.processing;

import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.data.versioning.VersionedDataContainer;
import com.exception.system.CustomSystemException;
import com.system.compilation.CompilationDiagnosticException;

public class NumericTransformationUtility
extends PersistenceRecord {
    protected int J;
    protected double R;
    private static final long serialVersionUID = 1L;

    public double L() {
        return this.R;
    }

    public PersistenceRecord s(int n, PersistenceRecord persistenceRecord) {
        try {
            if (persistenceRecord instanceof VersionedDataContainer) {
                return this.v(n, (VersionedDataContainer)persistenceRecord);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericTransformationUtility.a(customSystemException);
        }
        try {
            if (persistenceRecord instanceof NumericTransformationUtility) {
                return this.A(n, (NumericTransformationUtility)persistenceRecord);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericTransformationUtility.a(customSystemException);
        }
        return null;
    }

    public NumericTransformationUtility(double d2, int n) {
        this.R = d2;
        this.J = n;
    }

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.Q(this);
    }

    public int w() {
        return this.J;
    }

    private NumericTransformationUtility A(int n, NumericTransformationUtility numericTransformationUtility) {
        int n2;
        block3: {
            block2: {
                try {
                    if (this.J != 405 && numericTransformationUtility.J != 405) break block2;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationUtility.a(customSystemException);
                }
                n2 = 405;
                break block3;
            }
            n2 = 404;
        }
        return NumericTransformationUtility.W(n, this.R, numericTransformationUtility.R, n2);
    }

    private static NumericTransformationUtility W(int n, double d2, double d3, int n2) {
        double d4;
        switch (n) {
            case 43: {
                d4 = d2 + d3;
                break;
            }
            case 45: {
                d4 = d2 - d3;
                break;
            }
            case 42: {
                d4 = d2 * d3;
                break;
            }
            case 47: {
                d4 = d2 / d3;
                break;
            }
            case 37: {
                d4 = d2 % d3;
                break;
            }
            default: {
                return null;
            }
        }
        return new NumericTransformationUtility(d4, n2);
    }

    private NumericTransformationUtility v(int n, VersionedDataContainer versionedDataContainer) {
        return NumericTransformationUtility.W(n, this.R, versionedDataContainer.Z, this.J);
    }

    public void f(double d2) {
        this.R = d2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public String toString() {
        return Double.toString(this.R);
    }
}

