/*
 * Decompiled with CFR 0.152.
 */
package com.data.normalization;

import com.crypto.protocol.CryptoPrimitiveExchangeProtocol;
import com.exception.system.CustomSystemException;
import com.model.identity.HashableIdentityDescriptor;
import com.network.transmission.NetworkTransmissionController;
import com.networking.stream.EventStreamInterface;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import java.awt.Color;
import java.util.HashMap;

public class DataNormalizer {
    static HashMap<HashableIdentityDescriptor, EventStreamInterface> k = new HashMap();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void n(TransactionOrchestrator1017 transactionOrchestrator1017) {
        HashableIdentityDescriptor hashableIdentityDescriptor = new HashableIdentityDescriptor(transactionOrchestrator1017);
        try {
            if (!k.containsKey(hashableIdentityDescriptor)) {
                DataNormalizer.y(transactionOrchestrator1017, hashableIdentityDescriptor);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataNormalizer.a(customSystemException);
        }
    }

    public static void t(TransactionOrchestrator1017 transactionOrchestrator1017, float f, float f2, int n, int n2, Color color, float f3) {
        try {
            HashableIdentityDescriptor hashableIdentityDescriptor = new HashableIdentityDescriptor(transactionOrchestrator1017);
            DataNormalizer.n(transactionOrchestrator1017);
            k.get(hashableIdentityDescriptor).H(f, f2, n, n2, color, f3);
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    private static void y(TransactionOrchestrator1017 transactionOrchestrator1017, HashableIdentityDescriptor hashableIdentityDescriptor) {
        EventStreamInterface eventStreamInterface = ConfigurationManager.U() ? new NetworkTransmissionController() : new CryptoPrimitiveExchangeProtocol();
        eventStreamInterface.Q(transactionOrchestrator1017);
        k.put(hashableIdentityDescriptor, eventStreamInterface);
    }
}

