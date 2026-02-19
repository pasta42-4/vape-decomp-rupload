/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ai;
import a.EP;

class zv
extends Thread {
    final Ai c;

    @Override
    public void run() {
        try {
            Thread.sleep(100L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        EP.K().z(1.0f);
    }

    zv(Ai ai2) {
        this.c = ai2;
    }
}

