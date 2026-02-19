/*
 * Decompiled with CFR 0.152.
 */
package com.data.versioning;

import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.exception.system.CustomSystemException;
import com.numeric.processing.NumericTransformationUtility;
import com.system.compilation.CompilationDiagnosticException;

public class VersionedDataContainer
extends PersistenceRecord {
    private static final long serialVersionUID = 1L;
    protected int b;
    protected long Z;

    public long B() {
        return this.Z;
    }

    public int o() {
        return this.b;
    }

    private VersionedDataContainer I(int n, VersionedDataContainer versionedDataContainer) {
        long l;
        int n2;
        int n3;
        block19: {
            block18: {
                int n4;
                block17: {
                    n3 = this.b;
                    n4 = versionedDataContainer.b;
                    try {
                        if (n3 != 403 && n4 != 403) break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw VersionedDataContainer.a(customSystemException);
                    }
                    n2 = 403;
                    break block19;
                }
                try {
                    if (n3 != 401 || n4 != 401) break block18;
                }
                catch (CustomSystemException customSystemException) {
                    throw VersionedDataContainer.a(customSystemException);
                }
                n2 = 401;
                break block19;
            }
            n2 = 402;
        }
        long l2 = this.Z;
        long l3 = versionedDataContainer.Z;
        switch (n) {
            case 43: {
                l = l2 + l3;
                break;
            }
            case 45: {
                l = l2 - l3;
                break;
            }
            case 42: {
                l = l2 * l3;
                break;
            }
            case 47: {
                l = l2 / l3;
                break;
            }
            case 37: {
                l = l2 % l3;
                break;
            }
            case 124: {
                l = l2 | l3;
                break;
            }
            case 94: {
                l = l2 ^ l3;
                break;
            }
            case 38: {
                l = l2 & l3;
                break;
            }
            case 364: {
                l = this.Z << (int)l3;
                n2 = n3;
                break;
            }
            case 366: {
                l = this.Z >> (int)l3;
                n2 = n3;
                break;
            }
            case 370: {
                l = this.Z >>> (int)l3;
                n2 = n3;
                break;
            }
            default: {
                return null;
            }
        }
        return new VersionedDataContainer(l, n2);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.f(this);
    }

    public VersionedDataContainer(long l, int n) {
        this.Z = l;
        this.b = n;
    }

    private NumericTransformationUtility I(int n, NumericTransformationUtility numericTransformationUtility) {
        double d2;
        double d3 = this.Z;
        double d4 = numericTransformationUtility.R;
        switch (n) {
            case 43: {
                d2 = d3 + d4;
                break;
            }
            case 45: {
                d2 = d3 - d4;
                break;
            }
            case 42: {
                d2 = d3 * d4;
                break;
            }
            case 47: {
                d2 = d3 / d4;
                break;
            }
            case 37: {
                d2 = d3 % d4;
                break;
            }
            default: {
                return null;
            }
        }
        return new NumericTransformationUtility(d2, numericTransformationUtility.J);
    }

    @Override
    public String toString() {
        return Long.toString(this.Z);
    }

    public void N(long l) {
        this.Z = l;
    }

    public PersistenceRecord A(int n, PersistenceRecord persistenceRecord) {
        try {
            if (persistenceRecord instanceof VersionedDataContainer) {
                return this.I(n, (VersionedDataContainer)persistenceRecord);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw VersionedDataContainer.a(customSystemException);
        }
        try {
            if (persistenceRecord instanceof NumericTransformationUtility) {
                return this.I(n, (NumericTransformationUtility)persistenceRecord);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw VersionedDataContainer.a(customSystemException);
        }
        return null;
    }
}

