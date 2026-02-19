/*
 * Decompiled with CFR 0.152.
 */
package com.app.config.management;

import com.app.audit.AuditTrailManager;
import com.app.compression.CompressionUtility2656;
import com.app.logging.TransactionLogger2642;
import com.network.connection.ConnectionLifecycleManager;
import com.network.connection.NetworkConnectionManager2105;
import com.network.protocol.ProtocolNegotiationHandler2114;
import com.security.encryption.CryptographicKeyGenerator2061;
import com.security.encryption.DataEncryptionHandler2660;
import com.system.resource.ResourceAllocationManager2016;

public class ConfigurationRegistry {
    public static CompressionUtility2656 h;
    public static CryptographicKeyGenerator2061 i;
    public static ConnectionLifecycleManager O;
    public static AuditTrailManager g;
    public static DataEncryptionHandler2660 R;
    public static TransactionLogger2642 s;
    public static NetworkConnectionManager2105 l;
    public static ResourceAllocationManager2016 t;
    public static ProtocolNegotiationHandler2114 d;

    static {
        d = new ProtocolNegotiationHandler2114();
        l = new NetworkConnectionManager2105();
        O = new ConnectionLifecycleManager();
        t = new ResourceAllocationManager2016();
        i = new CryptographicKeyGenerator2061();
        s = new TransactionLogger2642();
        h = new CompressionUtility2656();
        R = new DataEncryptionHandler2660();
        g = new AuditTrailManager();
    }
}

