/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.app.security.registry;

import a.KB;
import a.ZB;
import com.communication.protocol.DataExchangeProtocol2090;
import com.exception.system.CustomSystemException;
import com.geospatial.util.GeographicCoordinateMapper2283;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.configuration.NetworkConfigManager;
import com.resource.management.DistributedResourceAllocator;
import com.security.access.SecurityAccessController1588;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

class SecureResourceRegistry
implements NetworkConfigurationResolver2717 {
    private Set<SecurityAccessController1588> w;
    private final Map<String, GeographicCoordinateMapper2283<String, NetworkConfigManager>> D = new HashMap<String, GeographicCoordinateMapper2283<String, NetworkConfigManager>>();

    private GeographicCoordinateMapper2283 lambda$getReplacedDisplayName$0(String string, Iterable iterable, String string2, GeographicCoordinateMapper2283 geographicCoordinateMapper2283) {
        try {
            if (geographicCoordinateMapper2283 == null) {
                return new GeographicCoordinateMapper2283<String, NetworkConfigManager>(this.i(string, iterable), new NetworkConfigManager());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureResourceRegistry.b(customSystemException);
        }
        NetworkConfigManager networkConfigManager = (NetworkConfigManager)geographicCoordinateMapper2283.h();
        try {
            if (networkConfigManager.m(1000L)) {
                networkConfigManager.m();
                return geographicCoordinateMapper2283.f(this.i(string, iterable));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureResourceRegistry.b(customSystemException);
        }
        return geographicCoordinateMapper2283;
    }

    private Set<SecurityAccessController1588> n() {
        return this.h().v().stream().filter(SecurityAccessController1588::F).collect(Collectors.toSet());
    }

    Set<SecurityAccessController1588> q() {
        return this.h().v();
    }

    @DataExchangeProtocol2090
    public void h(KB kB) {
        this.w = this.n();
    }

    boolean H() {
        return this.h().r.s();
    }

    private DistributedResourceAllocator h() {
        return TemporalMetadataResolver.h.j();
    }

    boolean B() {
        boolean bl;
        try {
            bl = !this.q().isEmpty();
        }
        catch (CustomSystemException customSystemException) {
            throw SecureResourceRegistry.b(customSystemException);
        }
        return bl;
    }

    private String i(String string, Iterable<SecurityAccessController1588> iterable) {
        String string2 = string;
        for (SecurityAccessController1588 securityAccessController1588 : iterable) {
            String string3 = securityAccessController1588.n().toLowerCase();
            String string4 = securityAccessController1588.x();
            try {
                if (string3.equalsIgnoreCase(string4)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SecureResourceRegistry.b(customSystemException);
            }
            if (!ZB.U(string2, string3)) continue;
            string2 = ZB.R(string2, string3, string4);
        }
        return string2;
    }

    SecureResourceRegistry() {
        this.w = new HashSet<SecurityAccessController1588>();
    }

    @Nullable
    String t(String string, Iterable<SecurityAccessController1588> iterable) {
        String string2;
        try {
            string2 = string == null ? null : (String)this.D.compute(string, (arg_0, arg_1) -> this.lambda$getReplacedDisplayName$0(string, iterable, arg_0, arg_1)).C();
        }
        catch (CustomSystemException customSystemException) {
            throw SecureResourceRegistry.b(customSystemException);
        }
        return string2;
    }

    Set<SecurityAccessController1588> p() {
        try {
            if (this.w == null) {
                this.w = this.n();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureResourceRegistry.b(customSystemException);
        }
        return this.w;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    boolean a() {
        return this.h().Z.s();
    }
}

