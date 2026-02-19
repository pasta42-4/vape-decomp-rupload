/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.UnmodifiableView
 */
package a;

import a.YP;
import a.ad;
import a.cL;
import a.zp;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.UnmodifiableView;

public class aw
extends ad<aw> {
    private final Map<String, zp> O = new LinkedHashMap<String, zp>();

    public aw P(zp zp2, String ... stringArray) {
        for (String string : stringArray) {
            this.O.put(string, zp2);
        }
        return this;
    }

    private aw(ad<?> ad2) {
        super(ad2);
    }

    public aw o(String string, zp zp2) {
        this.O.put(string, zp2);
        return this;
    }

    public @UnmodifiableView Map<String, zp> k() {
        return this.O;
    }

    aw(ad ad2, cL cL2) {
        this(ad2);
    }

    public YP U() {
        return new YP(this);
    }
}

