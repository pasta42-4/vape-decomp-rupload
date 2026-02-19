/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.validation;

import a.V3;
import com.config.dynamic.DynamicConfigurationResolver;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TransactionValidator1298
extends ObjectLifecycleTracker {
    public boolean F() {
        return DynamicConfigurationResolver.O(TransactionValidator1298.U.u().Gk, this.H);
    }

    public int u() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionValidator1298.a(customSystemException);
        }
        try {
            if (GeometryCalculator.C() >= 23) {
                return DynamicConfigurationResolver.H(TransactionValidator1298.U.u().Gk, this.M());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionValidator1298.a(customSystemException);
        }
        return DynamicConfigurationResolver.N(TransactionValidator1298.U.u().Gk, this.H);
    }

    public boolean D() {
        if (GeometryCalculator.C() >= 35) {
            for (Object e : TransactionValidator1298.U.u().Gk.R(this.H)) {
                V3 v3 = new V3(e);
                try {
                    if (v3.G().a()) continue;
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionValidator1298.a(customSystemException);
                }
            }
            return false;
        }
        return TransactionValidator1298.U.u().Gk.a(this.H);
    }

    public static TransactionValidator1298 l(int n) {
        try {
            if (GeometryCalculator.C() >= 23) {
                return new TransactionValidator1298(DynamicConfigurationResolver.a(TransactionValidator1298.U.u().Gk, n));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionValidator1298.a(customSystemException);
        }
        return TransactionValidator1298.F()[n];
    }

    public int p() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionValidator1298.a(customSystemException);
        }
        return DynamicConfigurationResolver.p(TransactionValidator1298.U.u().Gk, this.H);
    }

    public String Y() {
        return DynamicConfigurationResolver.r(TransactionValidator1298.U.u().Gk, this.H);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static TransactionValidator1298[] F() {
        if (GeometryCalculator.C() >= 23) {
            Iterable iterable = (Iterable)DynamicConfigurationResolver.c(TransactionValidator1298.U.u().Gk);
            ArrayList<TransactionValidator1298> arrayList = new ArrayList<TransactionValidator1298>();
            arrayList.add(null);
            for (Object t : iterable) {
                TransactionValidator1298 transactionValidator1298 = new TransactionValidator1298(t);
                arrayList.add(transactionValidator1298);
            }
            return arrayList.toArray(new TransactionValidator1298[arrayList.size()]);
        }
        Object[] objectArray = DynamicConfigurationResolver.c(TransactionValidator1298.U.u().Gk);
        TransactionValidator1298[] transactionValidator1298Array = new TransactionValidator1298[objectArray.length];
        try {
            for (int i = 0; i < objectArray.length; ++i) {
                transactionValidator1298Array[i] = new TransactionValidator1298(objectArray[i]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionValidator1298.a(customSystemException);
        }
        return transactionValidator1298Array;
    }

    public TransactionValidator1298(Object object) {
        super(object);
    }
}

