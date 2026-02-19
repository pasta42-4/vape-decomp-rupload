/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.exception.system.CustomSystemException;
import com.output.processing.OutputEncoder;
import com.runtime.context.DynamicContextBroker;

public class CryptographicUtility {
    private static String r;

    static {
        if (CryptographicUtility.T() != null) {
            CryptographicUtility.R("hsDKyb");
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static boolean M(ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192) {
        return DynamicContextBroker.s(connectionPoolOrchestrator1192);
    }

    public static void R(String string) {
        r = string;
    }

    public static void r(ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192) {
        block6: {
            block5: {
                try {
                    if (!CryptographicUtility.M(connectionPoolOrchestrator1192)) break block5;
                    CryptographicUtility.e(connectionPoolOrchestrator1192, true);
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicUtility.a(customSystemException);
                }
            }
            try {
                if (connectionPoolOrchestrator1192.b()) {
                    CryptographicUtility.e(connectionPoolOrchestrator1192, false);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicUtility.a(customSystemException);
            }
        }
    }

    public static void e(ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192, boolean bl) {
        OutputEncoder.f(connectionPoolOrchestrator1192, bl);
    }

    public static String T() {
        return r;
    }
}

