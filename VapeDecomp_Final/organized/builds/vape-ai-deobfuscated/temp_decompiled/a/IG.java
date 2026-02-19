/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.R8;
import java.util.UUID;

public class ig {
    private final String X;
    private final UUID z;

    public void u(R8 r82) {
        r82.i(this.z);
        r82.J(this.X);
    }

    public ig(R8 r82) {
        this.z = r82.x();
        this.X = r82.b(16);
    }

    public String l() {
        return this.X;
    }

    public ig(UUID uUID, String string) {
        this.z = uUID;
        this.X = string;
    }

    public UUID j() {
        return this.z;
    }
}

