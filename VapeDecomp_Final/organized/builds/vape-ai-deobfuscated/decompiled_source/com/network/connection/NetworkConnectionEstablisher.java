/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.adapter.management.GenericAdapterManager;
import com.concurrency.flags.AsyncFlagCoordinator;
import com.exception.system.CustomSystemException;
import com.notification.dispatch.NotificationDispatchInterface2673;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NetworkConnectionEstablisher
extends AsyncFlagCoordinator
implements NotificationDispatchInterface2673 {
    private static int t;
    private final String Z;
    private GenericAdapterManager g;
    public static HashMap<GenericAdapterManager, List<NetworkConnectionEstablisher>> R;

    public String F() {
        return this.toString();
    }

    public String toString() {
        return this.U();
    }

    public static void m(int n) {
        t = n;
    }

    public static int c() {
        return t;
    }

    @Override
    public String O() {
        return this.Z;
    }

    public static int Y() {
        int n = NetworkConnectionEstablisher.c();
        try {
            if (n == 0) {
                return 86;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionEstablisher.b(customSystemException);
        }
        return 0;
    }

    public void i(GenericAdapterManager genericAdapterManager) {
        try {
            this.g = genericAdapterManager;
            if (!R.containsKey(genericAdapterManager)) {
                R.put(genericAdapterManager, new ArrayList());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionEstablisher.b(customSystemException);
        }
        R.get(genericAdapterManager).add(this);
    }

    public NetworkConnectionEstablisher(String string) {
        this.Z = string;
    }

    static {
        R = new HashMap();
        NetworkConnectionEstablisher.m(0);
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public String U() {
        return this.O().replace("\u00a7", "");
    }

    public GenericAdapterManager r() {
        return this.g;
    }

    public boolean p() {
        return false;
    }

    public static NetworkConnectionEstablisher K(GenericAdapterManager genericAdapterManager, String string) {
        List<NetworkConnectionEstablisher> list = R.get(genericAdapterManager);
        for (NetworkConnectionEstablisher networkConnectionEstablisher : list) {
            try {
                if (!networkConnectionEstablisher.F().equalsIgnoreCase(string)) continue;
                return networkConnectionEstablisher;
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkConnectionEstablisher.b(customSystemException);
            }
        }
        return null;
    }
}

