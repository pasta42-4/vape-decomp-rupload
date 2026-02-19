/*
 * Decompiled with CFR 0.152.
 */
package com.security.cryptography;

import com.adapter.management.GenericAdapterManager;
import com.network.connection.NetworkConnectionEstablisher;

public class CryptographicKeyManager2476
extends GenericAdapterManager {
    public CryptographicKeyManager2476(Object object, String string, String string2, NetworkConnectionEstablisher networkConnectionEstablisher, NetworkConnectionEstablisher[] networkConnectionEstablisherArray) {
        super(object, string, string2, networkConnectionEstablisher, networkConnectionEstablisherArray);
    }

    public static CryptographicKeyManager2476 Q(Object object, String string, String string2, NetworkConnectionEstablisher networkConnectionEstablisher, int n, NetworkConnectionEstablisher ... networkConnectionEstablisherArray) {
        CryptographicKeyManager2476 cryptographicKeyManager2476 = new CryptographicKeyManager2476(object, string, string, networkConnectionEstablisher, networkConnectionEstablisherArray);
        cryptographicKeyManager2476.R(string2);
        for (NetworkConnectionEstablisher networkConnectionEstablisher2 : networkConnectionEstablisherArray) {
            networkConnectionEstablisher2.i(cryptographicKeyManager2476);
        }
        return cryptographicKeyManager2476;
    }
}

