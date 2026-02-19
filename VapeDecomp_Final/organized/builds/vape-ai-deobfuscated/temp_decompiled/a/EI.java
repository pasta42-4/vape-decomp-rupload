/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Io;
import a.ep;
import com.google.gson.JsonObject;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

public class ei
extends ep {
    public ei(JsonObject jsonObject) {
        super(jsonObject);
    }

    public ei R() {
        ei ei2 = new ei(this.u(), this.O());
        for (Io io2 : this.E()) {
            ei2.B(io2.L());
        }
        return ei2;
    }

    public ei(@Nullable UUID uUID, String string) {
        super(uUID, string);
    }

    public ei(ep ep2) {
        super(ep2.t());
        this.q = UUID.randomUUID();
    }
}

