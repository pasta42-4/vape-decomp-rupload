/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import com.app.export.web.DataWebExporter;
import com.data.transformation.DataTransformationEngine;
import com.event.core.EventDispatcher;
import com.exception.system.CustomSystemException;
import com.game.actions.ActionSequenceHandler;
import com.network.protocol.DataTransmissionHandler1706;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.system.lifecycle.ObjectLifecycleTracker;

public class DataTransformationEngine1209
extends ObjectLifecycleTracker {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void s(float f, float f2, float f3) {
        try {
            if (this.B(ReflectionMetadataResolver.U2)) {
                new DataTransmissionHandler1706(this.H).x(f, f2, f3);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationEngine1209.a(customSystemException);
        }
        DataTransformationEngine.C(DataTransformationEngine1209.U.u().Lk, this.H, f, f2, f3);
    }

    public void T(EventDispatcher eventDispatcher) {
        DataTransformationEngine.N(DataTransformationEngine1209.U.u().Lk, this.H, eventDispatcher.M());
    }

    public DataTransformationEngine1209(Object object) {
        super(object);
    }

    public void C(ActionSequenceHandler actionSequenceHandler) {
        try {
            if (this.B(ReflectionMetadataResolver.U2)) {
                new DataTransmissionHandler1706(this.H).t(actionSequenceHandler);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationEngine1209.a(customSystemException);
        }
        DataTransformationEngine.F(DataTransformationEngine1209.U.u().Lk, this.H, actionSequenceHandler.M());
    }

    public void g() {
        try {
            if (this.B(ReflectionMetadataResolver.U2)) {
                new DataTransmissionHandler1706(this.H).K();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationEngine1209.a(customSystemException);
        }
        DataTransformationEngine.O(DataTransformationEngine1209.U.u().Lk, this.H);
    }

    public DataWebExporter p() {
        return new DataWebExporter(DataTransformationEngine.w(DataTransformationEngine1209.U.u().Lk, this.H));
    }

    public void T(double d2, double d3, double d4) {
        this.s((float)d2, (float)d3, (float)d4);
    }

    public void v() {
        try {
            if (this.B(ReflectionMetadataResolver.U2)) {
                new DataTransmissionHandler1706(this.H).W();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationEngine1209.a(customSystemException);
        }
        DataTransformationEngine.L(DataTransformationEngine1209.U.u().Lk, this.H);
    }

    public void B() {
        try {
            if (this.B(ReflectionMetadataResolver.U2)) {
                new DataTransmissionHandler1706(this.H).a();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationEngine1209.a(customSystemException);
        }
        DataTransformationEngine.S(DataTransformationEngine1209.U.u().Lk, this.H);
    }

    public static DataTransformationEngine1209 i() {
        return new DataTransformationEngine1209(DataTransformationEngine.R(DataTransformationEngine1209.U.u().Lk));
    }

    public void m(double d2, double d3, double d4) {
        try {
            if (this.B(ReflectionMetadataResolver.U2)) {
                new DataTransmissionHandler1706(this.H).X((float)d2, (float)d3, (float)d4);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationEngine1209.a(customSystemException);
        }
        DataTransformationEngine.y(DataTransformationEngine1209.U.u().Lk, this.H, d2, d3, d4);
    }
}

