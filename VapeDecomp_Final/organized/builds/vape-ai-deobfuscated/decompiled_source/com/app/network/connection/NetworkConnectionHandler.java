/*
 * Decompiled with CFR 0.152.
 */
package com.app.network.connection;

import com.crypto.key.CipherKeyExchangeManager;
import com.data.transformation.DataTransformationEngine1209;
import com.exception.system.CustomSystemException;
import com.game.actions.ActionSequenceHandler;
import com.game.configuration.GameVersionEnumerator;
import com.network.connection.ConnectionPoolManager2119;
import com.network.connection.NetworkConnectionManager1945;
import com.system.lifecycle.ObjectLifecycleTracker;

public class NetworkConnectionHandler
extends ObjectLifecycleTracker {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void J() {
        CipherKeyExchangeManager.X(NetworkConnectionHandler.U.u().kW);
    }

    public static int[] Q() {
        return CipherKeyExchangeManager.J(NetworkConnectionHandler.U.u().kW);
    }

    public static void D(ActionSequenceHandler actionSequenceHandler, ConnectionPoolManager2119 connectionPoolManager2119) {
    }

    public static void x() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionHandler.a(customSystemException);
        }
        CipherKeyExchangeManager.I(NetworkConnectionHandler.U.u().kW);
    }

    public static void D(float f, float f2, float f3, float f4) {
        try {
            if (GameVersionEnumerator.MC_1_21_6.Q()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionHandler.a(customSystemException);
        }
        CipherKeyExchangeManager.h(NetworkConnectionHandler.U.u().kW, f, f2, f3, f4);
    }

    public static void l(float f) {
        try {
            if (GameVersionEnumerator.MC_1_21_11.H()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionHandler.a(customSystemException);
        }
        CipherKeyExchangeManager.V(NetworkConnectionHandler.U.u().kW, f);
    }

    public static DataTransformationEngine1209 u() {
        return new DataTransformationEngine1209(NetworkConnectionHandler.U.u().kW.U());
    }

    public static void D() {
        CipherKeyExchangeManager.j(NetworkConnectionHandler.U.u().kW);
    }

    public static void l(int n, NetworkConnectionManager1945 networkConnectionManager1945) {
        CipherKeyExchangeManager.K(NetworkConnectionHandler.U.u().kW, n, networkConnectionManager1945.M());
    }

    public static void V() {
        CipherKeyExchangeManager.y(NetworkConnectionHandler.U.u().kW);
    }

    public static void B(int n, int n2) {
        try {
            if (GameVersionEnumerator.MC_1_21_6.Q()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionHandler.a(customSystemException);
        }
        CipherKeyExchangeManager.B(NetworkConnectionHandler.U.u().kW, n, n2);
    }

    public NetworkConnectionHandler(Object object) {
        super(object);
    }

    public static void l() {
        try {
            if (GameVersionEnumerator.MC_1_21_6.Q()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionHandler.a(customSystemException);
        }
        CipherKeyExchangeManager.R(NetworkConnectionHandler.U.u().kW);
    }

    public static void y(float f) {
        CipherKeyExchangeManager.i(NetworkConnectionHandler.U.u().kW, f);
    }

    public static void U(int n, int n2) {
        try {
            if (GameVersionEnumerator.MC_1_21_6.Q()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionHandler.a(customSystemException);
        }
        CipherKeyExchangeManager.c(NetworkConnectionHandler.U.u().kW, n, n2);
    }

    public static void O() {
        try {
            if (GameVersionEnumerator.MC_1_21_6.Q()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionHandler.a(customSystemException);
        }
        CipherKeyExchangeManager.v(NetworkConnectionHandler.U.u().kW);
    }
}

