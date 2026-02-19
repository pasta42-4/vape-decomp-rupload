/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Av;
import a.SE;

class ri
extends Thread {
    final Av G;

    @Override
    public void run() {
        while (!SE.h.V()) {
            try {
                Thread.sleep(1L);
                if (!this.G.Z()) continue;
                Av.B(this.G);
            }
            catch (Exception exception) {}
        }
    }

    ri(Av av2) {
        this.G = av2;
    }
}

