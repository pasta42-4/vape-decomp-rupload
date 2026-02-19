/*
 * Decompiled with CFR 0.152.
 */
package com.config.validation;

import a.V3;
import com.app.transaction.management.TransactionLifecycleContract;
import com.deobfuscation.core.ComparableIdentifier;
import com.exception.system.CustomSystemException;
import com.security.stream.CryptoStreamProcessor964;
import com.security.transmission.CipherTransmissionOrchestrator;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.HashMap;

public class ConfigurationValidator {
    private static boolean k;
    static HashMap<ComparableIdentifier, TransactionLifecycleContract> C;

    public static void m(V3 v3, float f, float f2, int n, int n2, float f3) {
        ConfigurationValidator.y(v3, f, f2, n, n2, f3, false);
    }

    static {
        C = new HashMap();
        ConfigurationValidator.k(true);
    }

    public static void m(int n) {
        ComparableIdentifier comparableIdentifier = new ComparableIdentifier(n);
        try {
            if (!C.containsKey(comparableIdentifier)) {
                ConfigurationValidator.Z(V3.H(n, 100, 0), comparableIdentifier);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationValidator.a(customSystemException);
        }
    }

    public static boolean J() {
        return k;
    }

    public static boolean E() {
        boolean bl = ConfigurationValidator.J();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationValidator.a(customSystemException);
        }
        return false;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void y(V3 v3, float f, float f2, int n, int n2, float f3, boolean bl) {
        try {
            ComparableIdentifier comparableIdentifier = new ComparableIdentifier(v3.n());
            ConfigurationValidator.m(v3.n());
            C.get(comparableIdentifier).M(f, f2, n, n2, f3, bl);
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    public static void k(boolean bl) {
        k = bl;
    }

    private static void Z(V3 v3, ComparableIdentifier comparableIdentifier) {
        TransactionLifecycleContract transactionLifecycleContract = ConfigurationManager.U() ? new CipherTransmissionOrchestrator() : new CryptoStreamProcessor964();
        transactionLifecycleContract.t(v3);
        C.put(comparableIdentifier, transactionLifecycleContract);
    }
}

