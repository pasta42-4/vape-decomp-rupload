/*
 * Decompiled with CFR 0.152.
 */
package com.financial.analysis;

import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.security.mediation.SecureDataMediator;
import com.security.transform.CryptographicTransformer;

public class TransactionAnalyzer
extends CryptographicTransformer {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public double u() {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return this.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionAnalyzer.a(customSystemException);
        }
        return SecureDataMediator.z(TransactionAnalyzer.U.u().LI, this.H);
    }

    public double R() {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return this.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionAnalyzer.a(customSystemException);
        }
        return SecureDataMediator.L(TransactionAnalyzer.U.u().LI, this.H);
    }

    public double L() {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return this.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionAnalyzer.a(customSystemException);
        }
        return SecureDataMediator.v(TransactionAnalyzer.U.u().LI, this.H);
    }

    public double N() {
        return SecureDataMediator.q(TransactionAnalyzer.U.u().LI, this.H);
    }

    public TransactionAnalyzer(Object object) {
        super(object);
    }
}

