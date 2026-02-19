/*
 * Decompiled with CFR 0.152.
 */
package com.metrics.tracking;

import com.exception.system.CustomSystemException;
import java.util.Objects;

public class MeasurementTracker {
    private float y = 1.0f;
    private int Y;
    private int k;
    private int F;

    public int hashCode() {
        return Objects.hash(this.h(), this.K(), this.t());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int t() {
        return this.Y;
    }

    public void W(int n) {
        this.Y = n;
    }

    public MeasurementTracker(int n, int n2, float f) {
        this.k = n;
        this.F = n2;
        this.y = f;
    }

    public boolean equals(Object object) {
        block10: {
            boolean bl;
            block12: {
                block11: {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (!(object instanceof MeasurementTracker)) break block10;
                                        if (((MeasurementTracker)object).h() != this.h()) break block11;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw MeasurementTracker.a(customSystemException);
                                    }
                                    if (((MeasurementTracker)object).K() != this.K()) break block11;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw MeasurementTracker.a(customSystemException);
                                }
                                if (((MeasurementTracker)object).O() != this.O()) break block11;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw MeasurementTracker.a(customSystemException);
                            }
                            if (((MeasurementTracker)object).t() != this.t()) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MeasurementTracker.a(customSystemException);
                        }
                        bl = true;
                        break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MeasurementTracker.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public int K() {
        return this.F;
    }

    public float O() {
        return this.y;
    }

    public int h() {
        return this.k;
    }
}

