/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.core.computation.AbstractComputationKernel;
import com.data.normalization.DataNormalizer;
import com.exception.system.CustomSystemException;
import com.system.configuration.ConfigurationManager;
import com.transaction.management.TransactionOrchestrator1017;
import java.awt.Color;

public class bw
extends AbstractComputationKernel {
    private TransactionOrchestrator1017 v;

    public void D(TransactionOrchestrator1017 transactionOrchestrator1017) {
        this.v = transactionOrchestrator1017;
    }

    public TransactionOrchestrator1017 K() {
        return this.v;
    }

    public bw(double d2, double d3) {
        this.T(d2);
        this.w(d3);
    }

    @Override
    public void G() {
        block4: {
            try {
                try {
                    if (this.K() != null && !this.K().Y()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw bw.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw bw.a(customSystemException);
            }
        }
        ConfigurationManager.s(this.G(), this.W() + 1.0, this.w(), this.b(), 12.0f, 1.0f, new Color(100, 100, 100, 70));
        DataNormalizer.t(this.K(), (float)this.G(), (float)this.W(), (int)this.w(), (int)this.b(), Color.WHITE, 1.0f);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

