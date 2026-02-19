/*
 * Decompiled with CFR 0.152.
 */
package com.collection.management;

import com.exception.system.CustomSystemException;
import com.spatial.mapping.CoordinateMapper;
import com.validation.temporal.TimestampValidator;

public class GenericCollectionManager
extends TimestampValidator<CoordinateMapper> {
    private int R;
    private CoordinateMapper l;
    private CoordinateMapper U;
    private int D;

    public GenericCollectionManager(double d2, CoordinateMapper coordinateMapper, CoordinateMapper coordinateMapper2) {
        super(d2);
        this.U = coordinateMapper;
        this.l = coordinateMapper2;
        this.R = coordinateMapper2.X - coordinateMapper.X;
        this.D = coordinateMapper2.I - coordinateMapper.I;
    }

    public CoordinateMapper N() {
        return this.U;
    }

    public void j(CoordinateMapper coordinateMapper) {
        this.U = coordinateMapper;
        this.R = this.l.X - coordinateMapper.X;
        this.D = this.l.I - coordinateMapper.I;
    }

    public CoordinateMapper m() {
        return this.l;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void X(CoordinateMapper coordinateMapper) {
        this.l = coordinateMapper;
        this.R = coordinateMapper.X - this.U.X;
        this.D = coordinateMapper.I - this.U.I;
    }

    public CoordinateMapper X() {
        double d2 = this.k();
        try {
            if (d2 == 0.0) {
                return this.U;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericCollectionManager.a(customSystemException);
        }
        try {
            if (d2 == 100.0) {
                return this.l;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericCollectionManager.a(customSystemException);
        }
        int n = this.U.X + (int)(this.k() * (double)this.R / 100.0);
        int n2 = this.U.I + (int)(this.k() * (double)this.D / 100.0);
        return new CoordinateMapper(n, n2);
    }
}

