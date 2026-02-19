/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 */
package com.game.actions;

import a.PU;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.security.exchange.SecureDataExchanger793;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;

public class ActionSequenceHandler
extends ObjectLifecycleTracker {
    public ActionSequenceHandler u(float f, float f2, float f3) {
        return new ActionSequenceHandler(PU.H(ActionSequenceHandler.U.u().LL, this.H, f, f2, f3));
    }

    public static ActionSequenceHandler b() {
        return new ActionSequenceHandler(PU.l(ActionSequenceHandler.U.u().LL));
    }

    public ActionSequenceHandler q(FloatBuffer floatBuffer) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return new ActionSequenceHandler(PU.H(ActionSequenceHandler.U.u().LL, floatBuffer));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ActionSequenceHandler.a(customSystemException);
        }
        PU.E(ActionSequenceHandler.U.u().LL, this.H, floatBuffer);
        return null;
    }

    public void t(ActionSequenceHandler actionSequenceHandler) {
        PU.P(ActionSequenceHandler.U.u().LL, this.H, actionSequenceHandler);
    }

    public SecureDataExchanger793 X() {
        FloatBuffer floatBuffer = BufferUtils.createFloatBuffer((int)16);
        this.f(floatBuffer);
        float[] fArray = new float[16];
        floatBuffer.get(fArray);
        return new SecureDataExchanger793(fArray);
    }

    public ActionSequenceHandler(Object object) {
        super(object);
    }

    public void f(FloatBuffer floatBuffer) {
        PU.B(ActionSequenceHandler.U.u().LL, this.H, floatBuffer);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

