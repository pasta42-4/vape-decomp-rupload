/*
 * Decompiled with CFR 0.152.
 */
package com.geo.mapping;

import com.exception.system.CustomSystemException;

public class GeographicCoordinateMapper {
    public int b;
    public int O;
    public int J;
    public int E;

    public boolean equals(Object object) {
        if (object instanceof GeographicCoordinateMapper) {
            boolean bl;
            block10: {
                block9: {
                    GeographicCoordinateMapper geographicCoordinateMapper = (GeographicCoordinateMapper)object;
                    try {
                        try {
                            try {
                                try {
                                    if (this.O != geographicCoordinateMapper.O || this.b != geographicCoordinateMapper.b) break block9;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GeographicCoordinateMapper.a(customSystemException);
                                }
                                if (this.E != geographicCoordinateMapper.E) break block9;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GeographicCoordinateMapper.a(customSystemException);
                            }
                            if (this.J != geographicCoordinateMapper.J) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeographicCoordinateMapper.a(customSystemException);
                        }
                        bl = true;
                        break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeographicCoordinateMapper.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void S(int n, int n2, int n3, int n4) {
        this.O = n;
        this.b = n2;
        this.E = n3;
        this.J = n4;
    }

    public int hashCode() {
        int n = this.b + this.E;
        int n2 = this.J + this.O;
        int n3 = n * (n + 1) / 2 + this.b;
        int n4 = n2 * (n2 + 1) / 2 + this.O;
        int n5 = n3 + n4;
        return n5 * (n5 + 1) / 2 + n4;
    }

    public GeographicCoordinateMapper(int n, int n2, int n3, int n4) {
        this.O = n;
        this.b = n2;
        this.E = n3;
        this.J = n4;
    }
}

