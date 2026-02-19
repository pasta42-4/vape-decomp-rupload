/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.app.analytics.time;

import com.app.correlation.management.UuidCorrelationManager;
import com.config.management.ConfigurationTemplateManager;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.security.modes.CryptographicModeEnum866;
import org.jetbrains.annotations.Nullable;

public class TimeSeriesAnalyzer
extends UuidCorrelationManager<ConfigurationTemplateManager> {
    private String O;
    private static String[] c;
    private long W;
    private CryptographicModeEnum866 o;

    public static void o(String[] stringArray) {
        c = stringArray;
    }

    static {
        if (TimeSeriesAnalyzer.n() != null) {
            TimeSeriesAnalyzer.o(new String[2]);
        }
    }

    public CryptographicModeEnum866 a() {
        return this.o;
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        block6: {
            block5: {
                try {
                    this.o = networkProtocolEncoder1013.L(CryptographicModeEnum866.class);
                    if (this.o != CryptographicModeEnum866.SUCCESSFUL) break block5;
                    this.O = networkProtocolEncoder1013.b(16);
                    this.W = networkProtocolEncoder1013.S();
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw TimeSeriesAnalyzer.a(customSystemException);
                }
            }
            try {
                if (this.o == CryptographicModeEnum866.COOLDOWN) {
                    this.W = networkProtocolEncoder1013.S();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw TimeSeriesAnalyzer.a(customSystemException);
            }
        }
    }

    public String F() {
        return this.O;
    }

    public TimeSeriesAnalyzer(@Nullable ConfigurationTemplateManager configurationTemplateManager, CryptographicModeEnum866 cryptographicModeEnum866) {
        super(configurationTemplateManager);
        this.o = cryptographicModeEnum866;
    }

    public TimeSeriesAnalyzer(@Nullable ConfigurationTemplateManager configurationTemplateManager, long l) {
        this(configurationTemplateManager, CryptographicModeEnum866.COOLDOWN);
        this.W = l;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public long l() {
        return this.W;
    }

    public TimeSeriesAnalyzer() {
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        block6: {
            block5: {
                try {
                    networkProtocolEncoder1013.N(this.o);
                    if (this.o != CryptographicModeEnum866.SUCCESSFUL) break block5;
                    networkProtocolEncoder1013.J(this.O);
                    networkProtocolEncoder1013.Z(this.W);
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw TimeSeriesAnalyzer.a(customSystemException);
                }
            }
            try {
                if (this.o == CryptographicModeEnum866.COOLDOWN) {
                    networkProtocolEncoder1013.Z(this.W);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw TimeSeriesAnalyzer.a(customSystemException);
            }
        }
    }

    public static String[] n() {
        return c;
    }

    public TimeSeriesAnalyzer(@Nullable ConfigurationTemplateManager configurationTemplateManager, String string, long l) {
        this(configurationTemplateManager, CryptographicModeEnum866.SUCCESSFUL);
        this.O = string;
        this.W = l;
    }
}

