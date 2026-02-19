/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import a.hg;
import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;

class DataTransformationHandler1837
implements OperationExecutionInterface {
    final hg S;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void R() {
        boolean bl;
        hg hg2;
        try {
            hg2 = this.S;
            bl = !this.S.h();
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationHandler1837.a(customSystemException);
        }
        try {
            hg2.g(bl);
            if (this.S.h()) {
                hg.q(this.S).Z();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationHandler1837.a(customSystemException);
        }
    }

    DataTransformationHandler1837(hg hg2) {
        this.S = hg2;
    }
}

