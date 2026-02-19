/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import a.UI;
import com.app.error.management.ErrorRecoveryHandler;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.runtime.context.LightweightExecutionContext;
import com.transaction.management.TransactionOrchestrator1017;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class DataTransformationService1284
extends TransactionOrchestrator1017 {
    public void k(boolean bl) {
        UI.i(DataTransformationService1284.U.u().LF, this.H, bl);
    }

    public Iterable H() {
        return (Iterable)UI.d(DataTransformationService1284.U.u().LF, this.H);
    }

    public Map D() {
        return UI.A(DataTransformationService1284.U.u().LF, this.H);
    }

    public boolean U() {
        return UI.L(DataTransformationService1284.U.u().LF, this.H);
    }

    public LightweightExecutionContext o(int n) {
        if (GeometryCalculator.C() >= 35) {
            ErrorRecoveryHandler errorRecoveryHandler = ErrorRecoveryHandler.C(n);
            try {
                if (errorRecoveryHandler == null) {
                    return null;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataTransformationService1284.b(customSystemException);
            }
            return new LightweightExecutionContext(UI.k(DataTransformationService1284.U.u().LF, this.H, errorRecoveryHandler.M()));
        }
        return new LightweightExecutionContext(UI.c(DataTransformationService1284.U.u().LF, this.H, n));
    }

    public ArrayList<LightweightExecutionContext> K() {
        ArrayList<LightweightExecutionContext> arrayList;
        block8: {
            arrayList = new ArrayList<LightweightExecutionContext>();
            try {
                if (GeometryCalculator.C() <= 15 || GeometryCalculator.C() >= 56) break block8;
            }
            catch (CustomSystemException customSystemException) {
                throw DataTransformationService1284.b(customSystemException);
            }
            Iterator iterator = this.H().iterator();
            try {
                while (iterator.hasNext()) {
                    arrayList.add(new LightweightExecutionContext(iterator.next()));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataTransformationService1284.b(customSystemException);
            }
        }
        try {
            for (int i = 1; i <= 4; ++i) {
                arrayList.add(this.o(i));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationService1284.b(customSystemException);
        }
        return arrayList;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public DataTransformationService1284(Object object) {
        super(object);
    }
}

