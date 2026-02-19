/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a.Pd;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.transform.CryptographicTransformer;
import com.system.config.AdaptiveConfigurationManager;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.validation.core.ObjectValidator;

public class NetworkPacketInterceptor1107
extends ObjectLifecycleTracker {
    private static int[] x;

    public NetworkPacketInterceptor1107(Object object) {
        super(object);
    }

    public boolean S() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.r() || !this.q().equals(ObjectValidator.B())) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkPacketInterceptor1107.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkPacketInterceptor1107.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public int m() {
        try {
            if (GeometryCalculator.C() == 13) {
                return NetworkPacketInterceptor1107.U.u().dV.N(this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketInterceptor1107.a(customSystemException);
        }
        ReflectionUtilityBroker reflectionUtilityBroker = this.f();
        return reflectionUtilityBroker.j();
    }

    public int p() {
        try {
            if (GeometryCalculator.C() == 13) {
                return NetworkPacketInterceptor1107.U.u().dV.m(this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketInterceptor1107.a(customSystemException);
        }
        ReflectionUtilityBroker reflectionUtilityBroker = this.f();
        return reflectionUtilityBroker.o();
    }

    public CryptographicTransformer l() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.g();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketInterceptor1107.a(customSystemException);
        }
        return new CryptographicTransformer(NetworkPacketInterceptor1107.U.u().dV.Y(this.H));
    }

    public ContextualEventDispatcher i() {
        return new ContextualEventDispatcher(NetworkPacketInterceptor1107.U.u().dV.f(this.H));
    }

    public boolean h() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.r() || !this.q().equals(ObjectValidator.Y())) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkPacketInterceptor1107.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkPacketInterceptor1107.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public int j() {
        int n;
        try {
            if (GeometryCalculator.C() == 13) {
                return NetworkPacketInterceptor1107.U.u().dV.w(this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketInterceptor1107.a(customSystemException);
        }
        AdaptiveConfigurationManager adaptiveConfigurationManager = this.K();
        try {
            n = adaptiveConfigurationManager.r() ? adaptiveConfigurationManager.p() : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketInterceptor1107.a(customSystemException);
        }
        return n;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static NetworkPacketInterceptor1107 k(CryptographicTransformer cryptographicTransformer, ContextualEventDispatcher contextualEventDispatcher) {
        if (GeometryCalculator.C() >= 35) {
            Object object = NetworkPacketInterceptor1107.U.u().dV.U(cryptographicTransformer.M(), contextualEventDispatcher.M());
            return new NetworkPacketInterceptor1107(object);
        }
        return new NetworkPacketInterceptor1107(NetworkPacketInterceptor1107.U.u().dV.T(cryptographicTransformer.M(), contextualEventDispatcher.M()));
    }

    public int b() {
        try {
            if (GeometryCalculator.C() == 13) {
                return NetworkPacketInterceptor1107.U.u().dV.K(this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketInterceptor1107.a(customSystemException);
        }
        ReflectionUtilityBroker reflectionUtilityBroker = this.f();
        return reflectionUtilityBroker.q();
    }

    @Override
    public TransactionCorrelationEngine M() {
        return ApplicationLifecycleManager.c().N(this.p(), this.b(), this.m());
    }

    public AdaptiveConfigurationManager K() {
        try {
            if (GeometryCalculator.C() == 13) {
                return AdaptiveConfigurationManager.d(NetworkPacketInterceptor1107.U.u().dV.w(this.H));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketInterceptor1107.a(customSystemException);
        }
        return new AdaptiveConfigurationManager(NetworkPacketInterceptor1107.U.u().dV.x(this.H));
    }

    static {
        if (NetworkPacketInterceptor1107.y() != null) {
            NetworkPacketInterceptor1107.j(new int[2]);
        }
    }

    private CryptographicTransformer g() {
        try {
            if (ReflectionMetadataResolver.PV.isInstance(this.H)) {
                return new CryptographicTransformer(NetworkPacketInterceptor1107.U.u().dV.Y(this.H));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkPacketInterceptor1107.a(customSystemException);
        }
        return new CryptographicTransformer(null);
    }

    public void s(CryptographicTransformer cryptographicTransformer) {
        NetworkPacketInterceptor1107.U.u().dV.Z(this.H, cryptographicTransformer.M());
    }

    public static NetworkPacketInterceptor1107 Q(ObjectValidator objectValidator, ContextualEventDispatcher contextualEventDispatcher, AdaptiveConfigurationManager adaptiveConfigurationManager, ReflectionUtilityBroker reflectionUtilityBroker) {
        if (GeometryCalculator.C() >= 35) {
            Object object = NetworkPacketInterceptor1107.U.u().dV.d(contextualEventDispatcher.M(), adaptiveConfigurationManager.M(), reflectionUtilityBroker.M(), false);
            return new NetworkPacketInterceptor1107(object);
        }
        return new NetworkPacketInterceptor1107(NetworkPacketInterceptor1107.U.u().dV.S(objectValidator.M(), contextualEventDispatcher.M(), adaptiveConfigurationManager.M(), reflectionUtilityBroker.M()));
    }

    public static void j(int[] nArray) {
        x = nArray;
    }

    public ReflectionUtilityBroker f() {
        block4: {
            block5: {
                try {
                    try {
                        if (GeometryCalculator.C() < 35) break block4;
                        if (!ReflectionMetadataResolver.d.isInstance(this.H)) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkPacketInterceptor1107.a(customSystemException);
                    }
                    return new ReflectionUtilityBroker(NetworkPacketInterceptor1107.U.u().dV.Z(this.H));
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkPacketInterceptor1107.a(customSystemException);
                }
            }
            return null;
        }
        return new ReflectionUtilityBroker(NetworkPacketInterceptor1107.U.u().dV.Z(this.H));
    }

    public ObjectValidator q() {
        return new ObjectValidator(Pd.a(NetworkPacketInterceptor1107.U.u().dV, this.H));
    }

    public static int[] y() {
        return x;
    }
}

