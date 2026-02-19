/*
 * Decompiled with CFR 0.152.
 */
package com.network.communication;

import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.security.encryption.EncryptionContextBuilder;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommunicationChannelManager
extends ObjectLifecycleTracker {
    public Map B() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return new HashMap();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationChannelManager.a(customSystemException);
        }
        return CommunicationChannelManager.U.u().dO.q(this.H);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public Set i() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return new HashSet();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationChannelManager.a(customSystemException);
        }
        return EncryptionContextBuilder.a(CommunicationChannelManager.U.u().dO, this.H);
    }

    public CommunicationChannelManager(Object object) {
        super(object);
    }

    public static CommunicationChannelManager J() {
        return new CommunicationChannelManager(CommunicationChannelManager.U.u().dO.n());
    }
}

