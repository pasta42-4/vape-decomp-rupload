/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.data.comparison;

import a.Qv;
import com.app.analytics.MetricsCalculator;
import com.exception.system.CustomSystemException;
import com.network.protocol.ProtocolInteractionController;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.context.RuntimeContextResolver;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ComparativeIdentifier {
    private final int J;
    private final int z;
    private final Map<Short, Short> U;
    private final int j;

    public boolean equals(Object object) {
        boolean bl;
        block22: {
            block21: {
                block20: {
                    try {
                        if (this == object) {
                            return true;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComparativeIdentifier.a(customSystemException);
                    }
                    try {
                        try {
                            if (object != null && this.getClass() == object.getClass()) break block20;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ComparativeIdentifier.a(customSystemException);
                        }
                        return false;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComparativeIdentifier.a(customSystemException);
                    }
                }
                ComparativeIdentifier comparativeIdentifier = (ComparativeIdentifier)object;
                try {
                    if (this.J != comparativeIdentifier.J) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ComparativeIdentifier.a(customSystemException);
                }
                try {
                    if (this.j != comparativeIdentifier.j) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ComparativeIdentifier.a(customSystemException);
                }
                try {
                    if (this.z != comparativeIdentifier.z) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ComparativeIdentifier.a(customSystemException);
                }
                try {
                    try {
                        if (this.U.size() != comparativeIdentifier.U.size() || !this.U.equals(comparativeIdentifier.U)) break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComparativeIdentifier.a(customSystemException);
                    }
                    bl = true;
                    break block22;
                }
                catch (CustomSystemException customSystemException) {
                    throw ComparativeIdentifier.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean C() {
        boolean bl;
        try {
            bl = !this.U.isEmpty();
        }
        catch (CustomSystemException customSystemException) {
            throw ComparativeIdentifier.a(customSystemException);
        }
        return bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public Map<Short, Short> P() {
        return this.U;
    }

    public int Z() {
        return this.z;
    }

    public int x() {
        return this.J;
    }

    public MetricsCalculator Z() {
        return new MetricsCalculator(this.J, this.j, this.z, this.U);
    }

    @Nullable
    public LightweightExecutionContext F() {
        try {
            if (this.J == 0) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComparativeIdentifier.a(customSystemException);
        }
        ProtocolInteractionController protocolInteractionController = ProtocolInteractionController.Y(this.J);
        if (protocolInteractionController.r()) {
            LightweightExecutionContext lightweightExecutionContext = LightweightExecutionContext.d(protocolInteractionController);
            lightweightExecutionContext.S(this.z);
            lightweightExecutionContext.T(this.j);
            if (!this.U.isEmpty()) {
                for (Map.Entry<Short, Short> entry : this.U.entrySet()) {
                    Qv qv2 = RuntimeContextResolver.n(entry.getKey());
                    try {
                        if (qv2 == null) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComparativeIdentifier.a(customSystemException);
                    }
                    lightweightExecutionContext.M(qv2, entry.getValue().shortValue());
                }
            }
            return lightweightExecutionContext;
        }
        return null;
    }

    @Nullable
    public static ComparativeIdentifier f(@Nullable MetricsCalculator metricsCalculator) {
        block4: {
            try {
                try {
                    if (metricsCalculator != null && metricsCalculator.n() != 0) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ComparativeIdentifier.a(customSystemException);
                }
                return null;
            }
            catch (CustomSystemException customSystemException) {
                throw ComparativeIdentifier.a(customSystemException);
            }
        }
        return new ComparativeIdentifier(metricsCalculator.n(), metricsCalculator.j(), metricsCalculator.m(), metricsCalculator.N());
    }

    public ComparativeIdentifier(int n, int n2, int n3, Map<Short, Short> map) {
        this.J = n;
        this.j = n2;
        this.z = n3;
        this.U = map;
    }

    public int hashCode() {
        int n = this.J;
        n = 31 * n + this.j;
        n = 31 * n + this.z;
        n = 31 * n + this.U.hashCode();
        return n;
    }

    public int c() {
        return this.j;
    }
}

