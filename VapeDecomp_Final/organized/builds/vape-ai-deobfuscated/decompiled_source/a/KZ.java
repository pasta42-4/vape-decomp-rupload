/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.tl;
import com.app.network.connection.NetworkConnectionHandler;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.math.geometry.GeometryCalculator;

public class KZ
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker H = new ConcurrentRequestTracker();
    private float f;

    public float getDensity() {
        return this.f;
    }

    public KZ(float f) {
        this.f = f;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void setDensity(float f) {
        this.f = f;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return H;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return H;
    }

    @Override
    public boolean fire() {
        boolean bl;
        block7: {
            block8: {
                bl = super.fire();
                try {
                    try {
                        if (!bl) break block7;
                        if (GeometryCalculator.C() > 15) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw KZ.a(customSystemException);
                    }
                    tl.K(this.f);
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw KZ.a(customSystemException);
                }
            }
            try {
                if (GeometryCalculator.C() >= 35) {
                    NetworkConnectionHandler.y(this.f);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw KZ.a(customSystemException);
            }
        }
        return bl;
    }
}

