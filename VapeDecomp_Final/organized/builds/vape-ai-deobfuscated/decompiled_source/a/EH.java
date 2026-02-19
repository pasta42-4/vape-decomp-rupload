/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.financial.processing.TransactionCorrelationEngine;

public class EH
extends TransactionCorrelationEngine {
    public EH(Object object) {
        super(object);
    }

    public static float Y(int n) {
        if (n >= 8) {
            n = 0;
        }
        return (float)(n + 1) / 9.0f;
    }
}

