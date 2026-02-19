/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Bg;
import a.O_;
import a.SE;
import java.util.concurrent.atomic.AtomicBoolean;

public class su
implements Runnable {
    private final Bg h = new Bg();
    private final AtomicBoolean Q = new AtomicBoolean();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        while (true) {
            try {
                if (SE.h.V()) break;
                try {
                    Thread.sleep(100L);
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
            catch (O_ o_2) {
                throw su.a(o_2);
            }
            if (!this.Q.get()) continue;
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            SE.h.u().G();
            this.Q.set(false);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void z() {
        this.Q.set(true);
    }
}

