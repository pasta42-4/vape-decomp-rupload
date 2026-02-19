/*
 * Decompiled with CFR 0.152.
 */
package com.performance.management;

import com.exception.system.CustomSystemException;
import com.security.crypto.CryptoContextManager1052;

final class ComputationalRateController {
    private int Z;
    private CryptoContextManager1052[] b = new CryptoContextManager1052[6];

    CryptoContextManager1052[] b() {
        CryptoContextManager1052[] cryptoContextManager1052Array = new CryptoContextManager1052[this.Z];
        System.arraycopy(this.b, 0, cryptoContextManager1052Array, 0, this.Z);
        return cryptoContextManager1052Array;
    }

    private void Z(CryptoContextManager1052 cryptoContextManager1052) {
        if (this.Z >= this.b.length) {
            CryptoContextManager1052[] cryptoContextManager1052Array = new CryptoContextManager1052[this.b.length + 6];
            System.arraycopy(this.b, 0, cryptoContextManager1052Array, 0, this.Z);
            this.b = cryptoContextManager1052Array;
        }
        this.b[this.Z++] = cryptoContextManager1052;
    }

    void O(CryptoContextManager1052 cryptoContextManager1052) {
        CryptoContextManager1052 cryptoContextManager10522 = cryptoContextManager1052;
        while (true) {
            block5: {
                try {
                    try {
                        if (cryptoContextManager10522 == null) break;
                        if (this.K(cryptoContextManager10522)) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComputationalRateController.a(customSystemException);
                    }
                    this.Z(cryptoContextManager10522);
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalRateController.a(customSystemException);
                }
            }
            cryptoContextManager10522 = cryptoContextManager10522.a;
        }
    }

    private boolean K(CryptoContextManager1052 cryptoContextManager1052) {
        int n = 0;
        while (true) {
            block5: {
                try {
                    try {
                        if (n >= this.Z) break;
                        if (!this.b[n].H.equals(cryptoContextManager1052.H)) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComputationalRateController.a(customSystemException);
                    }
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw ComputationalRateController.a(customSystemException);
                }
            }
            ++n;
        }
        return false;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    ComputationalRateController() {
    }
}

