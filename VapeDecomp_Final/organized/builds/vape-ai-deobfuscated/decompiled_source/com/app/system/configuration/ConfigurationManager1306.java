/*
 * Decompiled with CFR 0.152.
 */
package com.app.system.configuration;

import com.exception.system.CustomSystemException;
import com.metrics.analysis.DimensionalMetricsTracker;
import com.network.protocol.TransmissionProtocolConfig;
import java.util.Queue;

public class ConfigurationManager1306 {
    private static String[] x;
    private final int s;
    private final int Q;
    private final TransmissionProtocolConfig F;

    static {
        if (ConfigurationManager1306.j() != null) {
            ConfigurationManager1306.G(new String[2]);
        }
    }

    public ConfigurationManager1306(TransmissionProtocolConfig transmissionProtocolConfig, int n, int n2) {
        this.F = transmissionProtocolConfig;
        this.s = n;
        this.Q = n2;
    }

    public static void k(int n, int n2, int n3, Queue<DimensionalMetricsTracker> queue) {
        new ConfigurationManager1306(TransmissionProtocolConfig.CLICK, n, n2).T(n3, queue);
    }

    public static void W(int n, int n2, int n3, Queue<DimensionalMetricsTracker> queue) {
        new ConfigurationManager1306(TransmissionProtocolConfig.SWAP, n, n2).T(n3, queue);
    }

    public static void U(int n, int n2, int n3, Queue<DimensionalMetricsTracker> queue) {
        new ConfigurationManager1306(TransmissionProtocolConfig.MOVE, n, n2).T(n3, queue);
    }

    public static String[] j() {
        return x;
    }

    public static void e(int n, Queue<DimensionalMetricsTracker> queue) {
        new ConfigurationManager1306(TransmissionProtocolConfig.DROP_MOUSE_STACK, 0, 0).T(n, queue);
    }

    public void T(int n, Queue<DimensionalMetricsTracker> queue) {
        block14: {
            block18: {
                block17: {
                    block16: {
                        block15: {
                            block13: {
                                try {
                                    if (this.F != TransmissionProtocolConfig.MOVE) break block13;
                                    queue.add(new DimensionalMetricsTracker(n, this.s, 0, 0));
                                    queue.add(new DimensionalMetricsTracker(n, this.Q, 0, 0));
                                    break block14;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ConfigurationManager1306.a(customSystemException);
                                }
                            }
                            try {
                                if (this.F != TransmissionProtocolConfig.SHIFTCLICK) break block15;
                                queue.add(new DimensionalMetricsTracker(n, this.s, 0, 1));
                                break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConfigurationManager1306.a(customSystemException);
                            }
                        }
                        try {
                            if (this.F != TransmissionProtocolConfig.SWAP) break block16;
                            queue.add(new DimensionalMetricsTracker(n, this.s, 0, 0));
                            queue.add(new DimensionalMetricsTracker(n, this.Q, 0, 0));
                            queue.add(new DimensionalMetricsTracker(n, this.s, 0, 0));
                            break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationManager1306.a(customSystemException);
                        }
                    }
                    try {
                        if (this.F != TransmissionProtocolConfig.CLICK) break block17;
                        queue.add(new DimensionalMetricsTracker(n, this.s, 0, 0));
                        break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationManager1306.a(customSystemException);
                    }
                }
                try {
                    if (this.F != TransmissionProtocolConfig.DROP_SLOT) break block18;
                    queue.add(new DimensionalMetricsTracker(n, this.s, 1, 4));
                    break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationManager1306.a(customSystemException);
                }
            }
            try {
                if (this.F == TransmissionProtocolConfig.DROP_MOUSE_STACK) {
                    queue.add(new DimensionalMetricsTracker(n, -999, 0, 0));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationManager1306.a(customSystemException);
            }
        }
    }

    public static void G(String[] stringArray) {
        x = stringArray;
    }

    public static void M(int n, int n2, Queue<DimensionalMetricsTracker> queue) {
        new ConfigurationManager1306(TransmissionProtocolConfig.SHIFTCLICK, n, 0).T(n2, queue);
    }

    public static void X(int n, int n2, Queue<DimensionalMetricsTracker> queue) {
        new ConfigurationManager1306(TransmissionProtocolConfig.DROP_SLOT, n, 0).T(n2, queue);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

