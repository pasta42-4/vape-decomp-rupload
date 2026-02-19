/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.concurrency.execution.TaskDispatcherService;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.network.io.NetworkStreamHandler;

public class S7
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker z;
    public static final TaskDispatcherService G;
    private static boolean Q;
    private final float B;

    public S7(Object object) {
        NetworkStreamHandler networkStreamHandler = new NetworkStreamHandler(object);
        this.B = networkStreamHandler.z();
    }

    public static void j(boolean bl) {
        Q = bl;
    }

    static {
        G = new TaskDispatcherService();
        z = new ConcurrentRequestTracker();
        S7.j(true);
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return z;
    }

    @Override
    public boolean fire() {
        try {
            G.z();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return false;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return z;
    }

    public static boolean s() {
        boolean bl = S7.N();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw S7.a(customSystemException);
        }
        return false;
    }

    public static boolean N() {
        return Q;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public S7(float f) {
        this.B = f;
    }
}

